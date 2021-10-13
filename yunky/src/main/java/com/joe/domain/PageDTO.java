package com.joe.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PageDTO {

	private int startPage; //시작페이지
	private int endPage; //끝페이지
	private boolean prev, next; //이전, 다음
	
	private int total; //전체 글의 양
	private Criteria cri; //1페이지당 글의 개수
	
	public PageDTO(Criteria cri, int total) {//기본생성자
		
		this.cri = cri;
		this.total = total;
		
		this.endPage = (int) (Math.ceil(cri.getPageNum() / 10.0)) * 10;
		this.startPage = this.endPage - 9;
		
		int realEnd = (int) (Math.ceil((total * 1.0) / cri.getAmount()));
		
		if (realEnd < this.endPage) {
			this.endPage = realEnd;
		}
		
		this.prev = this.startPage > 1;
		
		this.next = this.endPage < realEnd;
	}
	
	
}
