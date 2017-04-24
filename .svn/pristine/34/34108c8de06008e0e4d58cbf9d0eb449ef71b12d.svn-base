package kr.or.wsd.join.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.wsd.member.service.MemberService;
import kr.or.wsd.member.service.MemberServiceImpl;
import kr.or.wsd.vo.MemberVO;

import org.apache.struts2.ServletActionContext;


public class LoginCheckAction {
	
	private String mem_id;
	private String mem_pass;
	private String message;
	// http://localhost/StrutsToddler/join/loginCheck.do
	//		method(post) : mem_id값&mem_pass=값
	// interceptor params의 파라메터 처리 : 
	//    클라이언트가 전송하는 파라메터의 키와 일치하는 전역변수, setter 선언시
	//    해당 setter를 통해서 파라메터 값 주입(injection)
	public String execute(){
		Map<String, String> params = new HashMap<String, String>();
		params.put("mem_id", mem_id);
		params.put("mem_pass", mem_pass);
		
		MemberService service = MemberServiceImpl.getInstance();
		MemberVO memberInfo = service.getMemberInfo(params);
		
		// 기본객체 취득
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		HttpServletResponse response = ServletActionContext.getResponse();
		
		if(memberInfo == null){
			message = "회원이 아닙니다.";
			return "loginFalse";
		}else{
			session.setAttribute("LOGIN_MEMBERINFO", memberInfo);
			return "loginSuccess";
		}
		
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public void setMem_pass(String mem_pass) {
		this.mem_pass = mem_pass;
	}
	public String getMessage() {
		return message;
	}
}
