package com.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vo.Qna;

@Component("qdao")
public class QnaDAOImpl implements QnaDAO{

	@Autowired
	SqlSession session; //sqlSession 만들?��진거 ?��?�� ?��?��줘라. 
	
	public List<Qna> selectAll() {
		// TODO Auto-generated method stub
		return session.selectList("qna.selectAll");
	}
	


	public Qna selectOne(String num) {
		// TODO Auto-generated method stub
		return session.selectOne("qna.selectOne", num);
	}

	public void insert(Qna c) {
		// TODO Auto-generated method stub
		session.insert("qna.insert", c);
	}

	public void delete(String num) {
		// TODO Auto-generated method stub
		session.delete("qna.delete", num);
	}
	
	public List<Qna> findByTitle(String title) {
		// TODO Auto-generated method stub
		return session.selectList("qna.findByTitle",title);
	}

	public List<Qna> findByName(String name) {
		// TODO Auto-generated method stub
		return session.selectList("qna.findByName",name);
	}

	public void update(String num,String ans) {
		// TODO Auto-generated method stub
		HashMap<String , String> map = new HashMap();
		map.put("num", num);
		map.put("ans",ans);
		session.update("qna.update", map);
		
	}


	
	
}
