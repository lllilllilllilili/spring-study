package com.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.vo.Qna;


//client(BoardApp.java)�? ?��?�� ?��?��?��?��?��
public interface QnaService {
	public List<Qna> selectAll();
	public Qna selectOne(String num);
	public void insert(Qna c);
	@Transactional
	public void insert2(Qna c) throws Exception;
	public void delete(String num);
	public void update(String num,String ans);
	public void updateComment(String num, String ans);
	public List<Qna> findByTitle(String title);
	public List<Qna> findByName(String name);
	
}
