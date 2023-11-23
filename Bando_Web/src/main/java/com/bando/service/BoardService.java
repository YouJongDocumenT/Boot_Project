package com.bando.service;

import com.bando.dto.BoardDTO;

public interface BoardService {

	// 게시글 작성
	public void write(BoardDTO boardDTO) throws Exception;
	
}
