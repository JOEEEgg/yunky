package com.joe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.joe.domain.MemberVO;
import com.joe.service.MemberService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/member/*")
@Log4j
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@GetMapping("/register")
	public void getRegister() {
		log.info("get register");
	}
	
	@PostMapping("/register")
	public String postRegister(MemberVO memberVO) {
		
		log.info("post register");
		
		memberService.register(memberVO);
		
		return "redirect:/board/list";
	}
}
