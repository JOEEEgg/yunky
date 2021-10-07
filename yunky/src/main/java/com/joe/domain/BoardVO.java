package com.joe.domain;



import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {

	
	private Long bno;
	private String title;
	private String content;
	private String writer;
	private Date regDate; //현재시간
	private Date updateDate; //수정시간
}
