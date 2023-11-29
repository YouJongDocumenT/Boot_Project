package com.bando.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bando.dao.manageDAO;
import com.bando.dto.ClientDTO;
import com.bando.dto.PurchaseCompDTO;
import com.bando.dto.SalesDTO;
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
	@Override
	public List<manageDTO> productlist()throws Exception{
		return managedao.productlist();
	}
	
	// 재고 수정
	@Override
	public void productupdate(manageDTO managedto) throws Exception{
		managedao.productupdate(managedto);
	}
	
	// 재고 삭제
	@Override
	public void productdelete(int pdtnum) throws Exception{
		managedao.productdelete(pdtnum);
	}
	
	// 총 단가/매출 출력
	@Override
	public List<SalesDTO> saleslist() throws Exception{
		return managedao.saleslist();
	}
	
	// 구매처 회사 정보 조회
	@Override
	public List<PurchaseCompDTO> purchasecomplist()throws Exception{
		return managedao.purchasecomplist();
	}
	
	// 구매처 회사 정보 조회
	@Override
	public List<ClientDTO> clientlist() throws Exception {
		return managedao.clientlist();
	}
	
	
	
	
}





