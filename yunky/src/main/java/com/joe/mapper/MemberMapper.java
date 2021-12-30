package com.joe.mapper;

import com.joe.domain.MemberVO;

public interface MemberMapper {
	
	public MemberVO read(String userid);
	public MemberVO register(MemberVO vo);

}
