package com.bando.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
		
}
