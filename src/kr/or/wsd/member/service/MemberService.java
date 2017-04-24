package kr.or.wsd.member.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.wsd.vo.MemberVO;


public interface MemberService {
	public MemberVO getMemberInfo(Map<String, String> params);
	public List<MemberVO> getMemberList(Map<String, String> params);
	public void insertMemberInfo(MemberVO memberInfo);
	public int deleteMemberInfo(Map<String, String> params);
	public int updateMemberInfo(MemberVO memberInfo);
	public int getTotalCount(Map<String, String> params);
	public int updateAdminInfo(MemberVO memberInfo);
}
