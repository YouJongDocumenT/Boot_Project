package com.bando.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bando.dto.SalesDTO;
import com.bando.dto.manageDTO;

@Repository
public class manageDAOImpl implements manageDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	// 재고 작성 sql매핑
	@Override
	public void productwrite(manageDTO managedto) throws Exception{
		sqlSession.insert("manageMapper.productinsert", managedto);
	}
	
	// 재고 조회 sql매핑
	@Override
	public List<manageDTO> productlist() throws Exception{
		return sqlSession.selectList("manageMapper.productlist");

	}
	
	// 재고 수정  sql매핑
	@Override
	public void productupdate(manageDTO managedto) throws Exception{
		sqlSession.update("manageMapper.productupdate", managedto);
	}
	
	// 재고 삭제 sql매핑
	@Override
	public void productdelete(int pdtnum) throws Exception{
		sqlSession.delete("manageMapper.productdelete", pdtnum);
	}
	
	// 총 단가,매출, 총 내역 수
	@Override
	public List<SalesDTO> saleslist() throws Exception{
		return sqlSession.selectList("manageMapper.saleslist");
	}	
}
