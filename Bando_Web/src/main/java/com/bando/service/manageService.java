package com.bando.service;

import java.util.List;

import com.bando.dto.manageDTO;

public interface manageService {

	// 재고 작성
	public void productwrite(manageDTO managedto) throws Exception;
	
	// 재고 조회
	public List<manageDTO> productlist() throws Exception;
	
	// 재고 수정
	public void productupdate(manageDTO managedto) throws Exception;
	
	// 재고 삭제
	public void productdelete(int pdtnum) throws Exception;
}
