package com.joe.service;

import java.util.List;

import com.joe.domain.Criteria;
import com.joe.domain.ReplyVO;

public interface ReplyService {
	
	public int register(ReplyVO vo); //댓글등록
	 
	public ReplyVO get(Long rno); //댓글 조회
	
	public int modify(ReplyVO vo); //댓글 수정
	
	public int remove(Long rno); //댓글 삭제
	
	public List<ReplyVO> getList(Criteria cri, Long bno); //댓글 전체 불러오기

}
