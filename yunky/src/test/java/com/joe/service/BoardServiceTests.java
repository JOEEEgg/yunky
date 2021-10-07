package com.joe.service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.joe.domain.BoardVO;
import com.joe.mapper.BoardMapperTests;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {

	@Autowired
	private BoardService boardService;
	
	@Test
	public void testExist() {
		
		log.info(boardService);
		assertNotNull(boardService);
	}
	
	@Test
	public void testRegister() {
		
		BoardVO board = new BoardVO();
		board.setTitle("hi service");
		board.setContent("hi service content");
		board.setWriter("service작성자");
		
		boardService.register(board);
		
		log.info("생성된 게시물의 번호: " + board.getBno());
	}
	
	@Test
	public void testgetList(){
		
		boardService.getList().forEach(board -> log.info(board));
	}
	
	@Test
	public void testGet() {
		
		log.info(boardService.get(5L));
	}
	
	@Test
	public void testDelete() {
		
		log.info("REMOVE Result : " + boardService.remove(3L));
		
	}
	
	@Test
	public void testUpdate() {
		
		BoardVO board= boardService.get(5L);
		
		if(board == null) {
			return;
		}
		
		board.setTitle("제목 수정합니다");
		log.info("MODIFY RESULT : " + boardService.modify(board));
	}
}
