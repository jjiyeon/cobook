package org.ebook.cobook.board.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.ebook.cobook.board.persistence.ReviewDAO;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Inject
	private ReviewDAO reviewDAO;

	@Override
	public List<Map<String, Object>> borrowBookList(Integer member_no) throws Exception {
		// TODO Auto-generated method stub
		return reviewDAO.getBorrowedBook(member_no);
	}
	
	

}
