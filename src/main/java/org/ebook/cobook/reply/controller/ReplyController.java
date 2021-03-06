package org.ebook.cobook.reply.controller;

import java.util.List;

import javax.inject.Inject;

import org.ebook.cobook.reply.domain.ReplyVO;
import org.ebook.cobook.reply.service.ReplyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/replies/*")
public class ReplyController {

	@Inject
	private ReplyService replyService;
	
	private static final Logger logger =
			LoggerFactory.getLogger(ReplyController.class);
	
	@RequestMapping(value="/", method = RequestMethod.POST)
	public ResponseEntity<String> registerPOST(@RequestBody ReplyVO vo) throws Exception{
		
		logger.info("댓글저장: " + vo.toString());
		ResponseEntity<String> entity = null;
		try{

			replyService.register(vo);
			entity = new ResponseEntity("SUCCESS", HttpStatus.CREATED);
			
		}catch(Exception e){
			e.printStackTrace();
			entity = new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
		}

		return entity;
	}
	
	@RequestMapping(value="/{bno}", method = RequestMethod.GET)
	public ResponseEntity<List<ReplyVO>> listAll(@PathVariable("bno") Integer bno)throws Exception{
		
		logger.info("리스트 호출");
		ResponseEntity<List<ReplyVO>> entity = null;
		try{
			List<ReplyVO> list = replyService.listAll(bno);
			logger.info("리스트값: "+list.toString());
			entity = new ResponseEntity<List<ReplyVO>>(list, HttpStatus.OK);
			
		}catch(Exception e){
			e.printStackTrace();
			entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		return entity;
	}

	@RequestMapping(value = "/{rno}", method = {RequestMethod.PUT, RequestMethod.PATCH})
	public ResponseEntity<String> reply_modify(@PathVariable("rno") Integer rno,
			@RequestBody ReplyVO vo)throws Exception{
		
		ResponseEntity entity = null;
		try{
			replyService.modify(vo);
			entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);
		}catch(Exception e){
			e.printStackTrace();
			entity = new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
		return entity;
	}
	
	@RequestMapping(value = "/{rno}", method = RequestMethod.DELETE)
	public ResponseEntity<String> reply_delete(@PathVariable("rno")Integer rno)throws Exception{
		
		ResponseEntity entity = null;
		try{
			replyService.remove(rno);
			entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);
		}catch(Exception e){
			e.printStackTrace();
			entity = new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
		return entity;
	}
	
	@RequestMapping(value="/comment", method = RequestMethod.POST)
	public ResponseEntity<String> reply_comment(@RequestBody ReplyVO vo)throws Exception{
		
		logger.info("댓글의 답글기능 호출");
		logger.info("답글: " + vo.toString());
		
		ResponseEntity<String> entity = null;
		try{
			replyService.comment(vo);
			entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);
			
		}catch(Exception e){
			e.printStackTrace();
			entity = new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
		return entity;
	}
	
	
	
}
