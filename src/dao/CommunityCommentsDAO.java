package dao;

import org.apache.ibatis.session.SqlSession;

import dao.CommunityCommentsDAO;
import mybatis.SqlSessionBean;
import vo.CommunityCommentsVO;
import vo.CommunityVO;

public class CommunityCommentsDAO {
	private static final CommunityCommentsDAO dao = new CommunityCommentsDAO();
	private CommunityCommentsDAO() {};
	public static CommunityCommentsDAO getInstance()	{
		return dao;
	}
	
	public int insert(CommunityCommentsVO vo) {
		SqlSession mapper = SqlSessionBean.getSession();
		
		int result = mapper.insert("insert1", vo);
		mapper.commit();
		mapper.close();
		
		return result;
	}
	
	public int delete(int idx) {
		SqlSession mapper = SqlSessionBean.getSession();
		
		int result = mapper.delete("delete1", idx);
		mapper.commit();
		mapper.close();
		
		return result;
	}
}
