package vo;

import java.sql.Date;

public class CommunityCommentsVO {
	/*IDX NUMBER(10) NOT NULL,	-- 기본키
	MREF NUMBER(10) NOT NULL,	-- COMMUNITY 테이블의 IDX
	WRITER VARCHAR2(50) NOT NULL,	-- 작성자
	CONTENT VARCHAR2(1000) NOT NULL,	-- 댓글 내용
	CREATEDAT DATE DEFAULT SYSDATE,	-- 작성날짜와 시간 기본값
	IP VARCHAR2(15) DEFAULT '127.0.0.1',	-- 작성자 ip
	HEART NUMBER(3) DEFAULT '0',	-- 좋아요 갯수
	PRIMARY KEY(IDX)*/
	
	private int idx;
	private int mref;
	private String writer;
	private String content;
	private Date createdat;
	private String ip;
	private int heart;
	
	public CommunityCommentsVO() {;}

	public CommunityCommentsVO(int idx, int mref, String writer, String content, Date createdat, String ip, int heart) {
		super();
		this.idx = idx;
		this.mref = mref;
		this.writer = writer;
		this.content = content;
		this.createdat = createdat;
		this.ip = ip;
		this.heart = heart;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public int getMref() {
		return mref;
	}

	public void setMref(int mref) {
		this.mref = mref;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatedat() {
		return createdat;
	}

	public void setCreatedat(Date createdat) {
		this.createdat = createdat;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getHeart() {
		return heart;
	}

	public void setHeart(int heart) {
		this.heart = heart;
	}

	@Override
	public String toString() {
		return "CommunityCommentsVO [idx=" + idx + ", mref=" + mref + ", writer=" + writer + ", content=" + content
				+ ", createdat=" + createdat + ", ip=" + ip + ", heart=" + heart + "]";
	}
	
	
	
}
