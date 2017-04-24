package kr.or.wsd.admin.controller;

import java.util.HashMap;
import java.util.Map;

import kr.or.wsd.member.service.MemberService;
import kr.or.wsd.member.service.MemberServiceImpl;
import kr.or.wsd.vo.MemberVO;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class UpdateMemberAction implements Action, ModelDriven<MemberVO> {
	private MemberVO memberInfo;
	
	@Override
	public String execute() throws Exception {
		MemberService service = MemberServiceImpl.getInstance();
		service.updateAdminInfo(memberInfo);
		return SUCCESS;
	}

	@Override
	public MemberVO getModel() {
		memberInfo = new MemberVO();
		return memberInfo;
	}

}
