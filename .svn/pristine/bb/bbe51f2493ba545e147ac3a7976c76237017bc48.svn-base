package kr.or.wsd.member.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import kr.or.wsd.member.service.MemberService;
import kr.or.wsd.member.service.MemberServiceImpl;

import com.opensymphony.xwork2.Action;

public class DeleteMemberInfo implements Action {
	private String mem_id;
	private String message;
	


	
	@Override
	public String execute() throws Exception {
		Map<String, String> params = new HashMap<String, String>();
		params.put("mem_id", mem_id);
		MemberService service = MemberServiceImpl.getInstance();
		service.deleteMemberInfo(params);
		ServletActionContext.getRequest().getSession().invalidate();
		message = "탈퇴처리가 완료되었습니다";
		return SUCCESS;
	}
	
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	
	public String getMessage() {
		return message;
	}


}
