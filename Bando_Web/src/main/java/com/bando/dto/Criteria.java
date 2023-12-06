package com.bando.dto;

public class Criteria {
	
	// Criteria 클래스는 페이지네이션 처리를 위한 기준을 설정하는 클래스입니다.
	private int page; // 현재 페이지 번호를 저장하는 변수
	private int perPageNum; // 한 페이지당 보여줄 항목의 수를 저장하는 변수
	private int rowStart; // 조회할 데이터의 시작 행 번호를 저장하는 변수
	private int rowEnd; // 조회할 데이터의 끝 행 번호를 저장하는 변수

	// Criteria 클래스의 생성자(Constructor)입니다.
	// 기본적으로 페이지는 1페이지, 페이지당 항목 수는 10개로 초기화됩니다.
	public Criteria() {
	    this.page = 1;
	    this.perPageNum = 10;
	}

	// 현재 페이지 번호를 설정하는 메서드입니다.
	// 0 이하의 값이 들어오면 기본적으로 1페이지로 설정됩니다.
	public void setPage(int page) {
	    if (page <= 0) {
	        this.page = 1;
	        return;
	    }
	    this.page = page;
	}

	// 페이지당 항목 수를 설정하는 메서드입니다.
	// 0 이하 또는 100 이상의 값이 들어오면 기본적으로 10으로 설정됩니다.
	public void setPerPageNum(int perPageNum) {
	    if (perPageNum <= 0 || perPageNum > 100) {
	        this.perPageNum = 10;
	        return;
	    }
	    this.perPageNum = perPageNum;
	}

	// 현재 페이지 번호를 반환하는 메서드입니다.
	public int getPage() {
	    return page;
	}

	// 조회할 데이터의 시작 인덱스를 계산하여 반환하는 메서드입니다.
	public int getPageStart() {
	    return (this.page - 1) * perPageNum;
	}

	// 페이지당 항목 수를 반환하는 메서드입니다.
	public int getPerPageNum() {
	    return this.perPageNum;
	}

	// 조회할 데이터의 시작 행 번호를 계산하여 반환하는 메서드입니다.
	public int getRowStart() {
	    rowStart = ((page - 1) * perPageNum) + 1;
	    return rowStart;
	}

	// 조회할 데이터의 끝 행 번호를 계산하여 반환하는 메서드입니다.
	public int getRowEnd() {
	    rowEnd = rowStart + perPageNum - 1;
	    return rowEnd;
	}

	// 객체의 현재 상태를 문자열로 반환하는 메서드입니다.
	@Override
	public String toString() {
	    return "Criteria [page=" + page + ", perPageNum=" + perPageNum + ", rowStart=" + rowStart + ", rowEnd=" + rowEnd + "]";
	}

	
	
}
