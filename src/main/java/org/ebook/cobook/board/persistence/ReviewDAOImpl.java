package org.ebook.cobook.board.persistence;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.ebook.cobook.board.domain.ReviewVO;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewDAOImpl implements ReviewDAO {

	@Inject
	private SqlSession sqlSession;
	
	private final String namespace = "org.ebook.cobook.mapper.BorrowedBookMapper";
	
	@Override
	public List<Map<String, Object>> getBorrowedBook(Integer member_no)throws Exception{
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".bollowBookList", member_no);
	}

	@Override
	public void create(ReviewVO vo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace+".write", vo);
	}

	

}
