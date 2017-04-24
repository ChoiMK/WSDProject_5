package kr.or.wsd.member.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.wsd.ibatis.build.SqlMapClientFactory;
import kr.or.wsd.vo.MemberVO;

import com.ibatis.sqlmap.client.SqlMapClient;


public class MemberDaoImpl implements MemberDao {
	private static MemberDao dao = new MemberDaoImpl();
	private SqlMapClient client;
	
	private MemberDaoImpl(){
		client = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static MemberDao getInstance(){
		return (dao == null) ? new MemberDaoImpl() : dao;
	}
	
	@Override
	public MemberVO getMemberInfo(Map<String, String> params) throws SQLException {
		return (MemberVO)client.queryForObject("member.memberInfo",params);
	}

	@Override
	public List<MemberVO> getMemberList(Map<String, String> params) throws SQLException {
		
		return client.queryForList("member.memberList", params);
	}

	@Override
	public void insertMemberInfo(MemberVO memberInfo) throws SQLException {
		client.insert("member.insertMember", memberInfo);

	}

	@Override
	public int deleteMemberInfo(Map<String, String> params) throws SQLException {
		return client.update("member.deleteMember",params);
	}

	@Override
	public int updateMemberInfo(MemberVO memberInfo) throws SQLException {
		return client.update("member.updateMember", memberInfo);
	}
	
	@Override
	public int getTotalCount(Map<String, String> params) throws SQLException {
		return (int) client.queryForObject("member.totalCount", params);
	}

	@Override
	public int updateAdminInfo(MemberVO memberInfo) throws SQLException {
		return client.update("member.updateAdmin", memberInfo);
	}

}
