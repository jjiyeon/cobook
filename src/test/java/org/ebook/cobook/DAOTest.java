package org.ebook.cobook;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.chainsaw.Main;
import org.ebook.cobook.board.domain.Criteria;
import org.ebook.cobook.board.domain.PageMaker;
import org.ebook.cobook.board.domain.ReviewVO;
import org.ebook.cobook.board.persistence.ReviewDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class DAOTest {

	@Inject
	private ReviewDAO dao;
	
	private static final Logger logger = 
			LoggerFactory.getLogger(DAOTest.class);

	
	@Test
	public void listTest() throws Exception{
		
		Criteria cri = new Criteria();
		cri.setPage(1);
		cri.setPerPageNum(10);
		cri.setKeyword("TITLE 074");
		cri.setSearchType("t");
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(dao.getCount(cri));
		
		List<ReviewVO> list = dao.bookReviewList(cri);
		logger.info(list.toString());
		logger.info(pageMaker.toString());
		logger.info(pageMaker.makeSearch(1));
		
	}
	
	
}
