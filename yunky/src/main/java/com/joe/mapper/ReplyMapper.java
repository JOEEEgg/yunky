package com.joe.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.joe.domain.Criteria;
import com.joe.domain.ReplyVO;

public interface ReplyMapper {

	public int insert(ReplyVO replyVO);
	
	public ReplyVO read(Long bno);
	
	public int delete(Long targetRno);
	
	public int update(ReplyVO replyVO);
	
	public List<ReplyVO> getListWithPaging(
			@Param("cri") Criteria cri,
			@Param("bno") Long bno);
	
	public int getCountByBno(Long bno);
}
