package com.bando.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bando.dao.BoardDAO;
import com.bando.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService{

	@Inject
	private BoardDAO boardDAO;
	
	// 게시글 작성
	@Override
	public void write(BoardDTO boardDTO) throws Exception {
		boardDAO.write(boardDTO);
	}
	
}
