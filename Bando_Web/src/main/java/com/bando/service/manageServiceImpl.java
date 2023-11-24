package com.bando.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bando.dao.manageDAO;
import com.bando.dto.manageDTO;

@Service
public class manageServiceImpl implements manageService{

	@Autowired
	private manageDAO managedao;
	
	// 재고 작성
	@Override
	public void productwrite(manageDTO managedto) throws Exception{
		managedao.productwrite(managedto);
	}
	
	// 재고 조회
	public List<manageDTO> productlist()throws Exception{
		return managedao.productlist();
	}
	
	// 재고 수정
	public void productupdate(manageDTO managedto) throws Exception{
		managedao.productupdate(managedto);
	}
	
	// 재고 삭제
	public void productdelete(int pdtnum) throws Exception{
		managedao.productdelete(pdtnum);
	}
}
