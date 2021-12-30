package com.joe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joe.domain.MemberVO;
import com.joe.mapper.MemberMapper;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberMapper memberMapper;
	
	@Override
	public void register(MemberVO memberVO) {
		log.info(memberVO);
		memberMapper.register(memberVO);
		
	}
	
	

}
