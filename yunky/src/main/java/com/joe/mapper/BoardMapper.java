package com.joe.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.joe.domain.BoardVO;
import com.joe.domain.Criteria;

public interface BoardMapper {

	//@Select("select * from tbl_board where bno > 0")
	public List<BoardVO> getList(); //글 리스트 불러오기
	
	public List<BoardVO> getListWithPaging(Criteria cri); //페이지처리
	
	public void insert(BoardVO board); // 글 작성
	
	public void insertSelectKey(BoardVO board); //auto_increment 적용되지 않을 때 사용
	
	public BoardVO read(Long bno); //글 조회
	
	public int delete(Long bno); //글 삭제
	
	public int update(BoardVO board); //글 수정
	
	public int getTotalCount(Criteria cri); //전체 데이터 개수 처리
	
}
