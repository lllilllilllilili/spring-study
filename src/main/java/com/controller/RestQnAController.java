package com.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.QnaService;
import com.vo.Qna;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@CrossOrigin(origins = { "*" }, maxAge = 6000)
@Controller
@ResponseBody
@Api("Qna Rest API")

public class RestQnAController  {
	private static final long serialVersionUID = 1L;
   
	@Autowired
	private QnaService qnaServece;
	
	@RequestMapping("/test") 
	public String welcome() { 
		return "test"; 
	}

	@RequestMapping(value="qna", method=RequestMethod.POST)
	@ApiOperation("질문 등록")
	public Map RegQna(@RequestBody Qna qna) throws Exception {
		System.out.println(qna);
		qnaServece.insert(qna);
		Map<String, String> map = new HashMap<String, String>();
		map.put("result", "등록성공");
		return map;
	}
	
	@RequestMapping(value="qna/{num}", method=RequestMethod.DELETE)
	@ApiOperation("질문 삭제")
	public Map DelQna(@PathVariable String num ) throws Exception {
		qnaServece.delete(num);
		Map<String, String> map = new HashMap<String, String>();
		map.put("result", "삭제성공");
		return map;
		
	}
	
	@RequestMapping(value="qna", method=RequestMethod.GET)
	@ApiOperation("질문 리스트")
	public List<Qna> ListQna() throws Exception {
		System.out.println("adsfasdf");
		return qnaServece.selectAll();
	}
	
	@RequestMapping(value="qnacomment/{num}/{ans}", method=RequestMethod.PUT)
	@ApiOperation("질문 comment")
	public Map<String, String> updateComment(@PathVariable String num, @PathVariable String ans) {
		System.out.println(ans+" "+num);
		qnaServece.updateComment(num,ans);
		HashMap<String, String> map = new HashMap<String, String>();
		System.out.println("hi-comment");
		map.put("result", "수정성공");
		return map;
	}
	
	
	@RequestMapping(value="qna/{num}", method=RequestMethod.GET)
	@ApiOperation("질문 하나 선택")
	public Qna selectQna(@PathVariable String num) throws Exception{
		return qnaServece.selectOne(num);
	}
	
	
	@RequestMapping(value="qna/{ans}/{num}", method=RequestMethod.PUT)
	@ApiOperation("질문 하나 선택")
	public Map UpdateQna(@PathVariable String num, @PathVariable String ans) throws Exception{
		//System.out.println(c.getans());
		System.out.println(num+" "+ans);
		qnaServece.update(num,ans);
		Map<String, String> map = new HashMap<String, String>();
		map.put("result", "답변 등록 성공");
		return map;
	}
	
}
