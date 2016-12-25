package org.ebook.cobook.board.domain;

import java.util.Date;

public class ReviewVO {

	    private Integer review_no;
	    private Integer ebook_no;
	    private Integer member_no;
	    private String title;
	    private String contents;
	    private Integer hit;
	    private Date reg_Date;
	    private Float evaluate;
		public Integer getReview_no() {
			return review_no;
		}
		public void setReview_no(Integer review_no) {
			this.review_no = review_no;
		}
		public Integer getEbook_no() {
			return ebook_no;
		}
		public void setEbook_no(Integer ebook_no) {
			this.ebook_no = ebook_no;
		}
		public Integer getMember_no() {
			return member_no;
		}
		public void setMember_no(Integer member_no) {
			this.member_no = member_no;
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
		public Date getReg_Date() {
			return reg_Date;
		}
		public void setReg_Date(Date reg_Date) {
			this.reg_Date = reg_Date;
		}
		public Float getEvaluate() {
			return evaluate;
		}
		public void setEvaluate(Float evaluate) {
			this.evaluate = evaluate;
		}
		@Override
		public String toString() {
			return "ReviewVO [review_no=" + review_no + ", ebook_no=" + ebook_no + ", member_no=" + member_no
					+ ", title=" + title + ", contents=" + contents + ", hit=" + hit + ", reg_Date=" + reg_Date
					+ ", evaluate=" + evaluate + "]";
		}

}
