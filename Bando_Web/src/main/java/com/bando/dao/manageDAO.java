package com.bando.dao;

import java.util.List;

import com.bando.dto.ClientDTO;
import com.bando.dto.PurchaseCompDTO;
import com.bando.dto.SalesDTO;
import com.bando.dto.manageDTO;

public interface manageDAO {
	
	// 재고 작성 dto매핑
	public void productwrite(manageDTO managedto) throws Exception;
	
	// 재고 조회 dto매핑
	public List<manageDTO> productlist() throws Exception;

	// 재고 수정 dto매핑
	public void productupdate(manageDTO managedto) throws Exception;
	
	// 재고 삭제 dto매핑
	public void productdelete(int pdtnum) throws Exception;
	
	// 총 단가,매출
	public List<SalesDTO> saleslist() throws Exception;
	
	// 구매처 회사정보 조회 dto매핑
	public List<PurchaseCompDTO> purchasecomplist() throws Exception;
	
	// 고객사 회사정보 조회 dto매핑
	public List<ClientDTO> clientlist() throws Exception;
}
