package com.bando.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bando.dto.PriceDTO;
import com.bando.dto.PurChasePdtDTO;
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
	
	
}



