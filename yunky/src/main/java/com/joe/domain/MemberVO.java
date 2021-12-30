package com.joe.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class MemberVO {

	private String userid; // 유저id
	private String userpw; // 비밀번호
	private String userName; // 유저명
	private boolean enabled; // 접근가능불가능
	
	private Date regDate; //등록날짜
	private Date updateDate; //수정날짜
	private List<AuthVO> authList; //권한리스트
	
	
}
