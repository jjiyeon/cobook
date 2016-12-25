package org.ebook.cobook.board.service;

import java.util.List;
import java.util.Map;

import org.ebook.cobook.board.domain.Criteria;
import org.ebook.cobook.board.domain.ReviewVO;

public interface ReviewService {

	public List<Map<String, Object>> borrowBookList(Integer member_no)throws Exception;
	
	public void writeReview(ReviewVO vo)throws Exception;
	
	public List<ReviewVO> getBookReviewList(Criteria cri) throws Exception;

	public int getBookReviewCount(Criteria cri) throws Exception;

}
