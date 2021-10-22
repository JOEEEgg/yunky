package com.joe.mapper;

import java.util.List;

import com.joe.domain.BoardAttachVO;

public interface BoardAttachMapper {

	
	public void insert(BoardAttachVO vo); //첨부파일 등록
	
	public void delete(String uuid); //첨부파일 삭제
	
	public List<BoardAttachVO> findByBno(Long bno); //특정 게시물번호로 첨부파일 찾기
	
	public void deleteAll(Long bno); //첨부파일 전체삭제

	public List<BoardAttachVO> getOldFiles(); //잘못된 파일 삭제
	

}
