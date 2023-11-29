package com.bando.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bando.dto.ClientDTO;
import com.bando.dto.MachineDTO;
import com.bando.dto.PurChasePdtDTO;
import com.bando.dto.PurchaseCompDTO;
import com.bando.dto.SellAllDataDTO;
import com.bando.dto.SellpdtDTO;
import com.bando.dto.manageDTO;

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
	public List<PurChasePdtDTO> purchlistbyid(Long purchase_id) throws Exception {
		return sqlSession.selectList("manageMapper.purchlistbyid", purchase_id);

	}
	
	// 고객사 작성 sql매핑
	@Override
	public void clientadd(ClientDTO clientdto) throws Exception {
		sqlSession.insert("manageMapper.clientinsert", clientdto);
	}
	
	// 판매정보 작성 sql매핑 -------------------------------- 판매정보 sql매칭만하면됨
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
	public List<SellpdtDTO> sellListbyid(Long client_id) throws Exception {
		return sqlSession.selectList("manageMapper.sellListbyid", client_id);

	}
	
	// 총 판매 정보 조회 sql매핑
	@Override
	public List<SellAllDataDTO> sellAlldata(Long client_id, int machineList_id) throws Exception {
	    Map<String, Object> parameters = new HashMap<String, Object>();
	    parameters.put("client_id", client_id);
	    parameters.put("machine_id", machineList_id);

	    return sqlSession.selectList("manageMapper.sellAlldata", parameters);
		
		
	}
}






