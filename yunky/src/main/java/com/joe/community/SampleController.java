package com.joe.community;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class SampleController {
	
	@GetMapping("/sample")
	public void sample() {
		
		log.info("sample Test");
	}

}
