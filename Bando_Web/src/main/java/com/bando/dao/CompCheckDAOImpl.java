package com.bando.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bando.dto.PurChasePdtDTO;
import com.bando.dto.PurchaseCompDTO;
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
	
	
	
}
