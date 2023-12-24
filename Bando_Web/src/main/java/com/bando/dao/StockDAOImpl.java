package com.bando.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bando.dto.PriceDTO;
import com.bando.dto.PurChasePdtDTO;
import com.bando.dto.SearchCriteria;
import com.bando.dto.SellAllDataDTO;
import com.bando.dto.SellpdtDTO;
import com.bando.dto.StockListDTO;

@Repository
public class StockDAOImpl implements StockDAO{

	@Autowired
	private SqlSession sqlSession;
	
	// 재고 조회 sql매핑
	@Override
	public List<StockListDTO> StockList() throws Exception {
		
		List<StockListDTO> stockList = sqlSession.selectList("manageMapper.StockList");
        System.out.println("실행된 SQL 쿼리 결과 크기: " + stockList.size());
        System.out.println("실행된 SQL 쿼리 결과: " + stockList);
		
		return sqlSession.selectList("manageMapper.StockList");

	}
	
	// 재고 추가 sql매핑
	@Override
	public void AddStock(String PurchaseCompany) throws Exception {
		sqlSession.insert("manageMapper.AddStock", PurchaseCompany);
	}
	
	// 구매금액 총액테이블에 추가
	@Override
	public void allpurchcnt() throws Exception {
		sqlSession.insert("manageMapper.allpurchcnt");
	}
	
	// 구매-> 재고금액 총액테이블에 추가
	@Override
	public void stock_price() throws Exception {
		sqlSession.insert("manageMapper.stock_price");
	}
	
	// 순수익 총액테이블에 추가
	@Override
	public void revenue() throws Exception {
		sqlSession.insert("manageMapper.revenue");
	}
	
	// 재고수량 카운트 감소
	@Override
	public void St_Quantity_Cnt() throws Exception {
		sqlSession.insert("manageMapper.St_Quantity_Cnt");
	}

	// 재고수량이 0일시 재고 열 삭제
	@Override
	public void ChangeStockValue() throws Exception {
		sqlSession.insert("manageMapper.ChangeStockValue");
	}

	// 재고금액 변경
	@Override
	public void DeleteStock() throws Exception {
		sqlSession.insert("manageMapper.DeleteStock");
	}

	// 판매금액 총액테이블에 추가
	@Override
	public void allsellcnt() throws Exception {
		sqlSession.insert("manageMapper.allsellcnt");
	}

	// 총액테이블 호출
	@Override
	public List<PriceDTO> PriceList() throws Exception {
		return sqlSession.selectList("manageMapper.PriceList");
	}
	
	// 세금 총액테이블에 추가
	@Override
	public List<PriceDTO> tax() throws Exception {
		return sqlSession.selectList("manageMapper.tax");
	}
	
	// purchase_id에 매칭된 총액 출력
	@Override
	public List<PurChasePdtDTO> PurChasePdtById(Long purchase_id) throws Exception {
		return sqlSession.selectList("manageMapper.PurChasePdtById", purchase_id);
	}
	
	// client_id에 매칭된 총액 출력
	@Override
	public List<SellpdtDTO> SellPdtById(Long client_id) throws Exception {
		return sqlSession.selectList("manageMapper.SellPdtById", client_id);
	}
	
	
	
	
	
	
	
	
	
	// 재고 정보 조회 sql매핑 페이징
	@Override
	public List<StockListDTO> StockList_P(SearchCriteria scri) throws Exception {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("rowStart", scri.getRowStart()); // rowStart 매개변수 추가
		parameters.put("rowEnd", scri.getRowEnd()); // rowEnd 매개변수 추가
		parameters.put("keyword", scri.getKeyword()); // keyword 매개변수 추가
		parameters.put("searchType", scri.getSearchType()); // searchType 매개변수 추가

		System.out.println("검색 키워드 : " + scri.getKeyword());
		System.out.println("검색 타입 : " + scri.getSearchType());

		return sqlSession.selectList("manageMapper.StockList_P", parameters);
	}
	// 재고 총 갯수
	@Override
	public int StockListCount(SearchCriteria scri) throws Exception {
		return sqlSession.selectOne("manageMapper.StockListCount", scri);
	}
	
}






