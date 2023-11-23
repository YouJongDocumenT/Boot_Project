package com.bando.dao;

import com.bando.dto.BoardDTO;

public interface BoardDAO {
	// 게시글 작성
		public void write(BoardDTO boardDTO) throws Exception;
	}
