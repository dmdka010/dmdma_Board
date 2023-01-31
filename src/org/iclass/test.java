package org.iclass;

import dao.CommunityCommentsDAO;
import dao.CommunityDAO;
import vo.CommunityCommentsVO;
import vo.CommunityVO;

public class test {
public static void main(String[] args) {
	
	CommunityDAO dao = CommunityDAO.getInstance();
	CommunityVO vo = new CommunityVO();
	CommunityCommentsDAO dao2 = CommunityCommentsDAO.getInstance();
	CommunityCommentsVO vo2 = new CommunityCommentsVO();
	
	
	
	
	
	
	
	
	
	
	
	/*if(dao2.delete(6) == 1) {
		System.out.println("삭제 성공");
	}else {
		System.out.println("삭제 실패");
	}*/
	
	/*vo2.setMref(20);
	vo2.setWriter("dmdka");
	vo2.setContent("우왕");
	
	if(dao2.insert(vo2) == 1) {
		System.out.println("댓글 작성 성공");
	}else {
		System.out.println("댓글 작성 실패");
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	/*if(dao.delete(21) == 1) {
		System.out.println("삭제 성공");
	}else {
		System.out.println("삭제 실패");
	}*/
	
	/*vo.setIdx(21);
	vo.setContent("안녕하세요");
	if(dao.update(vo) == 1) {
		System.out.println("업데이트 성공");
	}else {
		System.out.println("업데이트 실패");
	}*/
	
	/*vo.setWriter("dmdka");
	vo.setTitle("가입인사");
	vo.setContent("안녕하십니까");
	vo.setReadCount(0);
	vo.setIp("111.1.1.1");
	vo.setCommentCount(0);
	
	if(dao.insert(vo) == 1) {
		System.out.println("가입 성공");
	} else {
		System.out.println("가입 실패");
	}*/
	
	/*for (CommunityVO string : dao.select()) {
		System.out.println(string);
	}*/
	
}
}
