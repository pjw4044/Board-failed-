package org.Jboard.controller;

import javax.inject.Inject;

import org.Jboard.domain.BoardVO;
import org.Jboard.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board/")
public class BoardController {

	@Inject
	private BoardService service;
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public void createGET(BoardVO board, Model model) throws Exception{
		System.out.println(" /board/create 입니다. GET 방식");
		
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String createPOST(BoardVO board, Model model) throws Exception{
		System.out.println(" /board/create 입니다. POST 방식");	
		System.out.println(board.toString());
		
		service.create(board);
		model.addAttribute("result", "성공");
		
		return "/board/succes";
		
	}
	
}
