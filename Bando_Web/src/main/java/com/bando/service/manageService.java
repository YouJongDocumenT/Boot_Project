package com.bando.service;

import java.util.List;

import com.bando.dto.ClientDTO;
import com.bando.dto.PurchaseCompDTO;
import com.bando.dto.SalesDTO;
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
	
	// 총 단가/매출 출력
	public List<SalesDTO> saleslist() throws Exception;
	
	// 구매처 회사 정보 조회
	public List<PurchaseCompDTO> purchasecomplist() throws Exception;
	
	// 구매처 회사 정보 조회
	public List<ClientDTO> clientlist() throws Exception;
}
