package com.joe.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Criteria {

	private int pageNum;
	private int amount;
	
	private String type;
	private String keyword;
	
	//1페이지당 10개의 글
	public Criteria() {
		this(1, 10);
	}

	public Criteria(int pageNum, int amount) {
		super();
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
	public String[] getTypeArr() {
		return type == null ? new String [] {} : type.split("");
	}
	
	

}
