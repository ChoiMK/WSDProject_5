package kr.or.wsd.member.controller;

import kr.or.wsd.member.service.MemberService;
import kr.or.wsd.member.service.MemberServiceImpl;
import kr.or.wsd.vo.MemberVO;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class UpdateMemberInfo implements Action,ModelDriven<MemberVO> {
	private MemberVO memberInfo;
	private String message;
	
	
	@Override
	public MemberVO getModel() {
		memberInfo = new MemberVO();
		message = "회원정보가 수정 되었습니다.";
		return memberInfo;
	}

	@Override
	public String execute() throws Exception {
		MemberService service = MemberServiceImpl.getInstance();
		service.updateMemberInfo(memberInfo);
		return SUCCESS;
	}
	
	public String getMessage() {
		return message;
	}


}
