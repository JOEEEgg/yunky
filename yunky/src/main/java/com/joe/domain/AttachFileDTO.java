package com.joe.domain;

import lombok.Data;

@Data
public class AttachFileDTO {

	private String fileName; //파일명
	private String uploadPath; //파일경로
	private String uuid; //uuid값
	private boolean image; // image 여부
}
