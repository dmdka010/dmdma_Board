package dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao.CommunityDAO;
import mybatis.SqlSessionBean;
import vo.CommunityVO;

public class CommunityDAO {
	private static final CommunityDAO dao = new CommunityDAO();
	private CommunityDAO() {};
	public static CommunityDAO getInstance()	{
		return dao;
	}
	
	public int insert(CommunityVO vo) {
		SqlSession mapper = SqlSessionBean.getSession();
		
		int result = mapper.insert("insert", vo);
		mapper.commit();
		mapper.close();
		
		return result;
	}
	
	public int update(CommunityVO vo) {
		SqlSession mapper = SqlSessionBean.getSession();
		
		int result = mapper.update("update", vo);
		mapper.commit();
		mapper.close();
		
		return result;
	}
	
	public int delete(int idx) {
		SqlSession mapper = SqlSessionBean.getSession();
		
		int result = mapper.delete("delete", idx);
		mapper.commit();
		mapper.close();
		
		return result;
	}
	
	public List<CommunityVO> select(){
		SqlSession mapper = SqlSessionBean.getSession();
		List<CommunityVO> user = new ArrayList<>();
		
		user = mapper.selectList("select");
		mapper.commit();
		mapper.close();
	
		return user;
	}
}
