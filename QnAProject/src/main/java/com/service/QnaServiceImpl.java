package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dao.QnaDAO;
import com.vo.Qna;

@Component("qus")
public class QnaServiceImpl implements QnaService {
	
	@Autowired
	QnaDAO qao; // type 기�??���? 주입, CustomeDaoImpl?�� ?��?���? 주입?��?��. interface ???��?��?��.
	
	
	public List<Qna> selectAll() {
		return qao.selectAll();
	}

	public Qna selectOne(String num) {
		return qao.selectOne(num);
	}
	
	
	public void insert(Qna c) {
		qao.insert(c);
	}
	
	
	public void insert2(Qna c) throws Exception{
			qao.insert(c);
			qao.insert(c);
		
	}
	public void delete(String num) {
		
		qao.delete(num);
	}

	public List<Qna> findByTitle(String title) {
		// TODO Auto-generated method stub
		return qao.findByTitle(title);
	}

	public List<Qna> findByName(String name) {
		// TODO Auto-generated method stub
		return qao.findByName(name);
	}

	public void update(String num,String ans) {
		// TODO Auto-generated method stub
		qao.update(num,ans);
	}

	

}
