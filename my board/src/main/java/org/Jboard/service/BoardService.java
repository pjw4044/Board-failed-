package org.Jboard.service;

import java.util.List;

import org.Jboard.domain.BoardVO;

public interface BoardService {

	//게시판 CRUD 완성//
	
		public  void create(BoardVO vo) throws Exception;
		
		public List<BoardVO> listAll() throws Exception;
		
		public BoardVO read(Integer b_no) throws Exception;
		
		public BoardVO delete(Integer b_no) throws Exception;
		
		public BoardVO update (BoardVO b_no) throws Exception;
	
}
