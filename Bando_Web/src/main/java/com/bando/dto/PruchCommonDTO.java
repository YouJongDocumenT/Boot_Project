package com.bando.dto;

public class PruchCommonDTO {

	// 2개의 dto를 합쳐서 호출
	private PurchaseCompDTO pccdto;
    private PurChasePdtDTO pcpdto;

	public PurchaseCompDTO getPccdto() {
		return pccdto;
	}

	public void setPccdto(PurchaseCompDTO pccdto) {
		this.pccdto = pccdto;
	}

	public PurChasePdtDTO getPcpdto() {
		return pcpdto;
	}

	public void setPcpdto(PurChasePdtDTO pcpdto) {
		this.pcpdto = pcpdto;
	}
    
    
    
}
