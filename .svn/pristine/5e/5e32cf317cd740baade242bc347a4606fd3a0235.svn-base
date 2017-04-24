package kr.or.wsd.admin.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import kr.or.wsd.member.service.MemberService;
import kr.or.wsd.member.service.MemberServiceImpl;
import kr.or.wsd.vo.MemberVO;

import com.opensymphony.xwork2.Action;

public class MemberDetailAction implements Action {
	private String mem_id;
	
	@Override
	public String execute() throws Exception {
		Map<String, String> params = new HashMap<String, String>();
		params.put("mem_id", mem_id);
		
		MemberService service = MemberServiceImpl.getInstance();
		MemberVO memberInfo = service.getMemberInfo(params);
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		request.setAttribute("memberInfo", memberInfo);
		
		return SUCCESS;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

}
