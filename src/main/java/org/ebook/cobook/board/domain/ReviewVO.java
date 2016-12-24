package org.ebook.cobook.board.domain;

import java.util.Date;

public class ReviewVO {

	    private Integer reviewNo;
	    private Integer ebookNo;
	    private Integer memberNo;
	    private String title;
	    private String contents;
	    private Integer hit;
	    private Date regDate;
	    private Float evaluate;

	    public Integer getReviewNo() {

	        return reviewNo;

	    }



	    public void setReviewNo(Integer reviewNo) {

	        this.reviewNo = reviewNo;

	    }



	    public Integer getEbookNo() {

	        return ebookNo;

	    }



	    public void setEbookNo(Integer ebookNo) {

	        this.ebookNo = ebookNo;

	    }



	    public Integer getMemberNo() {

	        return memberNo;

	    }



	    public void setMemberNo(Integer memberNo) {

	        this.memberNo = memberNo;

	    }



	    public String getTitle() {

	        return title;

	    }



	    public void setTitle(String title) {

	        this.title = title;

	    }



	    public String getContents() {

	        return contents;

	    }



	    public void setContents(String contents) {

	        this.contents = contents;

	    }



	    public Integer getHit() {

	        return hit;

	    }



	    public void setHit(Integer hit) {

	        this.hit = hit;

	    }



	    public Date getRegDate() {

	        return regDate;

	    }



	    public void setRegDate(Date regDate) {

	        this.regDate = regDate;

	    }



	    public Float getEvaluate() {

	        return evaluate;

	    }



	    public void setEvaluate(Float evaluate) {

	        this.evaluate = evaluate;

	    }



	   

	
}
