package com.bando.dto;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class PageMaker {

    private int totalCount; // 전체 데이터 개수를 저장하는 변수
    private int startPage; // 페이징 처리 시 시작 페이지 번호를 저장하는 변수
    private int endPage; // 페이징 처리 시 끝 페이지 번호를 저장하는 변수
    private boolean prev; // 이전 페이지 유무를 나타내는 변수
    private boolean next; // 다음 페이지 유무를 나타내는 변수
    private int displayPageNum = 10; // 화면에 보여질 페이지 번호의 개수를 저장하는 변수
    private Criteria cri; // Criteria 클래스의 객체를 저장하는 변수

    public void setCri(Criteria cri) {
        this.cri = cri; // Criteria 객체를 설정하는 메서드
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        calcData(); // 페이징 관련 데이터를 계산하는 메서드 호출
    }

    public int getTotalCount() {
        return totalCount; // 전체 데이터 개수를 반환하는 메서드
    }

    public int getStartPage() {
        return startPage; // 시작 페이지 번호를 반환하는 메서드
    }

    public int getEndPage() {
        return endPage; // 끝 페이지 번호를 반환하는 메서드
    }

    public boolean isPrev() {
        return prev; // 이전 페이지가 있는지 여부를 반환하는 메서드
    }

    public boolean isNext() {
        return next; // 다음 페이지가 있는지 여부를 반환하는 메서드
    }

    public int getDisplayPageNum() {
        return displayPageNum; // 화면에 보여질 페이지 번호의 개수를 반환하는 메서드
    }

    public Criteria getCri() {
        return cri; // Criteria 객체를 반환하는 메서드
    }

    // 페이징 처리를 위한 데이터를 계산하는 메서드
    private void calcData() {
        endPage = (int) (Math.ceil(cri.getPage() / (double) displayPageNum) * displayPageNum);
        startPage = (endPage - displayPageNum) + 1;

        int tempEndPage = (int) (Math.ceil(totalCount / (double) cri.getPerPageNum()));
        if (endPage > tempEndPage) {
            endPage = tempEndPage;
        }
        prev = startPage == 1 ? false : true;
        next = endPage * cri.getPerPageNum() >= totalCount ? false : true;
    }

    // 페이지 번호에 따른 쿼리 문자열을 생성하는 메서드
    public String makeQuery(int page) {
        UriComponents uriComponents =
                UriComponentsBuilder.newInstance()
                        .queryParam("page", page)
                        .queryParam("perPageNum", cri.getPerPageNum())
                        .build();

        return uriComponents.toUriString(); // 쿼리 문자열을 반환
    }
    
    public String makeSearch(int page)
	{
	  
	 UriComponents uriComponents =
	            UriComponentsBuilder.newInstance()
	            .queryParam("page", page)
	            .queryParam("perPageNum", cri.getPerPageNum())
	            .queryParam("searchType", ((SearchCriteria)cri).getSearchType())
	            .queryParam("keyword", encoding(((SearchCriteria)cri).getKeyword()))
	            .build(); 
	    return uriComponents.toUriString();  
	}

	private String encoding(String keyword) {
		if(keyword == null || keyword.trim().length() == 0) { 
			return "";
		}
		 
		try {
			return URLEncoder.encode(keyword, "UTF-8");
		} catch(UnsupportedEncodingException e) { 
			return ""; 
		}
	}
	
}

	