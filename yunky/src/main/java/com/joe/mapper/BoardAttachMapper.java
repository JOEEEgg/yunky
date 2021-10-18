package com.joe.mapper;

import java.util.List;

import com.joe.domain.BoardAttachVO;

public interface BoardAttachMapper {

	
	public void insert(BoardAttachVO vo);
	
	public void delete(String uuid);
	
	public List<BoardAttachVO> findByBno(Long bno);
}
