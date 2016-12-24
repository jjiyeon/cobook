package org.ebook.cobook.board.service;

import java.util.List;
import java.util.Map;

public interface ReviewService {

	public List<Map<String, Object>> borrowBookList(Integer member_no)throws Exception;
	
	
}
