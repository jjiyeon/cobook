package org.ebook.cobook.board.persistence;

import java.util.List;
import java.util.Map;

public interface ReviewDAO {

	public List<Map<String, Object>> getBorrowedBook(Integer member_no)throws Exception;
	
	
}
