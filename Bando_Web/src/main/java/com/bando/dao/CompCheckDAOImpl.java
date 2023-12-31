package com.bando.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bando.dto.AllPurchaseDataDTO;
import com.bando.dto.AllSellDataDTO;
import com.bando.dto.ClientDTO;
import com.bando.dto.Criteria;
import com.bando.dto.MachineDTO;
import com.bando.dto.PurChasePdtDTO;
import com.bando.dto.PurchaseCompDTO;
import com.bando.dto.SearchCriteria;
import com.bando.dto.SellAllDataDTO;
import com.bando.dto.SellpdtDTO;

@Repository
public class CompCheckDAOImpl implements CompCheckDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	// 구매처 작성 sql매핑
	@Override
	public void purchasecompadd(PurchaseCompDTO purchcompdto) throws Exception{
		sqlSession.insert("manageMapper.purchasecompinsert", purchcompdto);
	}

	// 구매정보 작성 sql매핑
	@Override
	public void purchpdtadd(PurChasePdtDTO purchpdtdto) throws Exception{
		sqlSession.insert("manageMapper.purchcomptradelist", purchpdtdto);
	}
	
	// 구매처 정보 조회 sql매핑
	@Override
	public List<PurchaseCompDTO> purchcompbyid(Long purchase_id) throws Exception {
		return sqlSession.selectList("manageMapper.purchcompbyid", purchase_id);

	}
	
	// 구매 정보 조회 sql매핑
	@Override
	public List<PurChasePdtDTO> purchlistbyid(Long purchase_id, SearchCriteria scri) throws Exception {
		Map<String, Object> parameters = new HashMap<String, Object>();
	    parameters.put("purchase_id", purchase_id);
	    parameters.put("rowStart", scri.getRowStart()); // rowStart 매개변수 추가
	    parameters.put("rowEnd", scri.getRowEnd()); // rowEnd 매개변수 추가
	    parameters.put("keyword", scri.getKeyword()); // keyword 매개변수 추가
	    parameters.put("searchType", scri.getSearchType()); // searchType 매개변수 추가
	    
	    System.out.println("검색 키워드 : " + scri.getKeyword());
	    System.out.println("검색 타입 : " + scri.getSearchType());
	    System.out.println("asd"+sqlSession.selectList("manageMapper.purchlistbyid", parameters));
	    
	    return sqlSession.selectList("manageMapper.purchlistbyid", parameters);
	}

	
	
	
	
	
	
	// 고객사 작성 sql매핑
	@Override
	public void clientadd(ClientDTO clientdto) throws Exception {
		sqlSession.insert("manageMapper.clientinsert", clientdto);
	}
	
	// 판매정보 작성 sql매핑
	@Override
	public void selladd(SellpdtDTO sellpdtdto) throws Exception {
		sqlSession.insert("manageMapper.selladd", sellpdtdto);
	}
		
	// 기계정보 작성
	@Override
	public void machineadd(MachineDTO machinedto) throws Exception {
		sqlSession.insert("manageMapper.machineadd", machinedto);
	}
	
	
	// 고객사 정보 조회 sql매핑
	@Override
	public List<ClientDTO> clientbyid(Long client_id) throws Exception {
		return sqlSession.selectList("manageMapper.clientbyid", client_id);

	}
		
	// 기계 정보 조회 sql매핑
	@Override
	public List<MachineDTO> machinebyid(Long client_id) throws Exception {
		return sqlSession.selectList("manageMapper.machinebyid", client_id);

	}	
	
	// 판매 정보 조회 sql매핑
	@Override
	public List<SellpdtDTO> sellListbyid(Long client_id, SearchCriteria scri) throws Exception {
		Map<String, Object> parameters = new HashMap<String, Object>();
	    parameters.put("client_id", client_id);
	    parameters.put("rowStart", scri.getRowStart()); // rowStart 매개변수 추가
	    parameters.put("rowEnd", scri.getRowEnd()); // rowEnd 매개변수 추가
	    parameters.put("keyword", scri.getKeyword()); // keyword 매개변수 추가
	    parameters.put("searchType", scri.getSearchType()); // searchType 매개변수 추가
	    
	    System.out.println("검색 키워드 : " + scri.getKeyword());
	    System.out.println("검색 타입 : " + scri.getSearchType());
	    
		return sqlSession.selectList("manageMapper.sellListbyid", parameters);

	}
	
	// 총 판매 정보 조회 sql매핑
	@Override
	public List<SellAllDataDTO> sellAlldata(Long client_id,SearchCriteria scri) throws Exception {
	    Map<String, Object> parameters = new HashMap<String, Object>();
	    parameters.put("client_id", client_id);
	    parameters.put("rowStart", scri.getRowStart()); // rowStart 매개변수 추가
	    parameters.put("rowEnd", scri.getRowEnd()); // rowEnd 매개변수 추가
	    parameters.put("keyword", scri.getKeyword()); // keyword 매개변수 추가
	    parameters.put("searchType", scri.getSearchType()); // searchType 매개변수 추가
	    System.out.println(scri.getRowStart());
	    System.out.println(scri.getRowEnd());
	    
	    System.out.println("검색 키워드 : " + scri.getKeyword());
	    System.out.println("검색 타입 : " + scri.getSearchType());
	    
	    return sqlSession.selectList("manageMapper.sellAlldata", parameters);
	}
	
	// 매칭된 구매처 데이터 정보 조회 sql매핑
	@Override
	public List<AllPurchaseDataDTO> PurChaseMachingDataList(Criteria cri) throws Exception {
		return sqlSession.selectList("manageMapper.PurChaseMachingDataList", cri);
	}
	
	// 총 고객사 정보 조회 sql매핑
	@Override
	public List<AllSellDataDTO> SellMachingDataList(Criteria cri) throws Exception {
		return sqlSession.selectList("manageMapper.SellMachingDataList", cri);
	}
	
	// 회사 정보 조회
	@Override
	public List<PurchaseCompDTO> PurchCompInfo(Long purchase_id) throws Exception {
		return sqlSession.selectList("manageMapper.PurchCompInfo", purchase_id);
	}
	
	// 구매처 구매정보 수정 sql매핑
	@Override
	public void SellDetailUpdate(PurChasePdtDTO puchpdtdto) throws Exception {
	    sqlSession.update("manageMapper.SellDetailUpdate", puchpdtdto);
	}
	
	// 고객사 판매정보 수정 sql매핑
	@Override
	public void SellAllDataUpdate(SellAllDataDTO sellalldatadto) throws Exception {
		sqlSession.update("manageMapper.SellAllDataUpdate", sellalldatadto);
	}
	
	// 구매정보 삭제 sql매핑
	@Override
	public void PurchaseDataDelete(int purchase_pdtnum) throws Exception {
		sqlSession.delete("manageMapper.PurchaseDataDelete", purchase_pdtnum);
	}
	
	// 판매정보 삭제 sql매핑
	@Override
	public void ClientDataDelete(int resp_id) throws Exception {
		sqlSession.delete("manageMapper.ClientDataDelete", resp_id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 구매처 게시물 총 갯수
	@Override
	public int listCount(SearchCriteria scri) throws Exception {
		return sqlSession.selectOne("manageMapper.listCount", scri);
	}

	// 판매처 게시물 총 갯수
	@Override
	public int SelllistCount(SearchCriteria scri) throws Exception {
		return sqlSession.selectOne("manageMapper.SelllistCount", scri);
	}
	
	// 판매처 게시물 총 갯수
	@Override
	public int sellByIdListCount(SearchCriteria scri) throws Exception {
		return sqlSession.selectOne("manageMapper.sellByIdListCount", scri);
	}
	
	
}














