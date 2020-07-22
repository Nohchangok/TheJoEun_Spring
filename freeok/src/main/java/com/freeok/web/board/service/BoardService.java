package com.freeok.web.board.service;

import java.util.List;

import com.freeok.web.board.model.BoardVO;

public interface BoardService {
	
	public List<BoardVO> getBoardList() throws Exception;
	

}
