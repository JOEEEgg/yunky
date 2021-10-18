package com.joe.service;

import java.util.List;

import com.joe.domain.BoardVO;
import com.joe.domain.Criteria;
import com.joe.domain.ReplyPageDTO;

public interface BoardService {

	public void register(BoardVO board);
	
	public BoardVO get(Long bno);
	
	public boolean modify(BoardVO board);
	
	public boolean remove(Long bno);
	
	//public List<BoardVO> getList();

	public List<BoardVO> getList(Criteria cri);
	
	public int getTotal(Criteria cri);
	
	
}
