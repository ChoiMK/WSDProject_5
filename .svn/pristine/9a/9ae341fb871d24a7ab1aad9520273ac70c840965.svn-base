package kr.or.wsd.member.controller;




import kr.or.wsd.member.service.MemberService;
import kr.or.wsd.member.service.MemberServiceImpl;
import kr.or.wsd.vo.MemberVO;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class InsertMemberInfo implements Action,ModelDriven<MemberVO> {
	private MemberVO memberInfo;
	
	
	@Override
	public String execute() throws Exception {
		MemberService service = MemberServiceImpl.getInstance();
		service.insertMemberInfo(memberInfo);
		
		return SUCCESS;
	}

	@Override
	public MemberVO getModel() {
		memberInfo = new MemberVO();
		return memberInfo;
	}
	
	


}
