package com.dao;

import java.util.List;

import com.vo.Qna;



//client(CustomerService.java)�? ?��?�� ?��?��?��?��?��
public interface QnaDAO {
	public List<Qna> selectAll();
	public Qna selectOne(String num);
	public void insert(Qna c);

	public void update(String num,String ans);
	public void delete(String num);
	public List<Qna> findByTitle(String title);
	public List<Qna> findByName(String name);
}

