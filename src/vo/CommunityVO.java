package vo;

import java.sql.Date;

public class CommunityVO {
	/*<!-- IDX NUMBER(10) NOT NULL,
	WRITER VARCHAR2(50) NOT NULL,	--작성자(로그인계정 정보 등)
	TITLE VARCHAR2(100) NOT NULL,	--글 제목
	CONTENT VARCHAR2(3000) NOT NULL,	--글 내용
	READCOUNT NUMBER(10) DEFAULT '0',	--조회수
	CREATEDAT DATE DEFAULT SYSDATE,	--작성날짜와 시간 기본값
	IP VARCHAR2(15) DEFAULT '127.0.0.1',	--작성자 ip
	COMMENTCOUNT NUMBER(10) DEFAULT '0',		-- 댓글 갯수 -->*/
	
	private int idx;
	private String writer;
	private String title;
	private String content;
	private int readCount;
	private Date createdat;
	private String ip;
	private int commentCount;
	
	public CommunityVO() {;}
	
	public CommunityVO(int idx, String writer, String title, String content, int readCount, Date createdat, String ip,
			int commentCount) {
		super();
		this.idx = idx;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.readCount = readCount;
		this.createdat = createdat;
		this.ip = ip;
		this.commentCount = commentCount;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
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
	public int getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}
	@Override
	public String toString() {
		return "CommunityVO [idx=" + idx + ", writer=" + writer + ", title=" + title + ", content=" + content
				+ ", readCount=" + readCount + ", createdat=" + createdat + ", ip=" + ip + ", commentCount="
				+ commentCount + "]";
	}
	
	
}
