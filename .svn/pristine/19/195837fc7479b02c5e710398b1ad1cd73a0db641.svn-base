package kr.or.wsd.member.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.wsd.member.dao.MemberDao;
import kr.or.wsd.member.dao.MemberDaoImpl;
import kr.or.wsd.vo.MemberVO;


public class MemberServiceImpl implements MemberService {
	// 싱글톤 패턴 : 서블릿
	//            사용자 정의 클래스
	private static MemberServiceImpl service = new MemberServiceImpl();
	private MemberDao dao;
	
	private MemberServiceImpl() {
		dao = MemberDaoImpl.getInstance();
	}
	
	public static MemberService getInstance() {
		if(service == null){
			service = new MemberServiceImpl();
		}
		return service;
	}
	
	@Override
	public MemberVO getMemberInfo(Map<String, String> params) {
		MemberVO memberInfo = null;
		try {
			 memberInfo = dao.getMemberInfo(params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memberInfo;
	}

	@Override
	public List<MemberVO> getMemberList(Map<String, String> params) {
		List<MemberVO> memberList = null;
		try{
			memberList = dao.getMemberList(params);
		}catch(SQLException e1){
			e1.printStackTrace();
		}
		return memberList;
	}

	@Override
	public void insertMemberInfo(MemberVO memberInfo) {
		try {
			dao.insertMemberInfo(memberInfo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int deleteMemberInfo(Map<String, String> params) {
		int deleteCnt = 0;
		try {
			deleteCnt = dao.deleteMemberInfo(params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return deleteCnt;
	}

	@Override
	public int updateMemberInfo(MemberVO memberInfo) {
		int updateCnt = 0;
		try {
			updateCnt = dao.updateMemberInfo(memberInfo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return updateCnt;
	}
	
	@Override
	public int getTotalCount(Map<String, String> params) {
		int totalCnt = 0;
		try {
			totalCnt = dao.getTotalCount(params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return totalCnt;
	}

	@Override
	public int updateAdminInfo(MemberVO memberInfo) {
		int updateCnt = 0;
		try {
			updateCnt = dao.updateAdminInfo(memberInfo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return updateCnt;
	}


}
