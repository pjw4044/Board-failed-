package org.Jboard.service;

import java.util.List;

import javax.inject.Inject;

import org.Jboard.dao.BoardDAO;
import org.Jboard.domain.BoardVO;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl {

	@Inject
	private BoardDAO dao;
	
	
	//게시글 생성
	public void create(BoardVO vo) throws Exception{
		dao.create(vo);
	}
	
	//게시글 리스트보기
	public List<BoardVO> listAll() throws Exception{
		return dao.listAll();
	}
	
	//게시글 읽기
	
	public BoardVO read(Integer b_no) throws Exception{
		
		return dao.read(b_no);
	}
	//게시글 삭제
	
	public void delete(Integer b_no) throws Exception{
		
		dao.delete(b_no);
	}
	//게시글 수정
	
		public void update(BoardVO b_no) throws Exception{
			dao.update(b_no);
		}
}
