package com.joe.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.joe.domain.MemberVO;
import com.joe.mapper.MemberMapper;
import com.joe.security.domain.CustomUser;

import lombok.extern.log4j.Log4j;

@Log4j
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		log.warn("Load User By UserName : " + username);
		
		MemberVO vo = memberMapper.read(username);
		
		log.warn("queryfied by member mapper: " + vo);
		
		return vo == null ? null : new CustomUser(vo);
		
	}

}
