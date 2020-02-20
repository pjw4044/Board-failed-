package org.Jboard.dao;

import java.util.List;

import javax.inject.Inject;

import org.Jboard.domain.BoardVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl {
	
	@Inject
	private SqlSession sqlSession;
	
	private static String namespace ="org.Jboard.mapper.BoardMapper";
	
	 //게시판추가
	public void create(BoardVO vo) throws Exception {
        
        sqlSession.insert(namespace+".insertBoard", vo);
 
    }
	
	//게시판 보기
	public List<BoardVO> listAll() throws Exception{
		
		sqlSession.selectList(namespace+".listBoard");
		return sqlSession.selectList(namespace+".listBoard");

	}
	
	//게시판 상세보기
	public BoardVO read(Integer b_no) throws Exception{
		sqlSession.selectOne(namespace+".detailBoard", b_no);
		return null;
	}
	//게시판 삭제하기
		public BoardVO delete(Integer b_no) throws Exception{
			sqlSession.delete(namespace+".deleteBoard", b_no);
			return null;
		}
	
	//게시판 수정
		public void update(BoardVO vo) throws Exception {
	        sqlSession.update(namespace+".updateBoard", vo);
	        
	    }
		
}
