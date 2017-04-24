package kr.or.wsd.member.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import kr.or.wsd.member.service.MemberService;
import kr.or.wsd.member.service.MemberServiceImpl;
import kr.or.wsd.vo.MemberVO;

import org.apache.struts2.ServletActionContext;
import org.codehaus.jackson.map.ObjectMapper;

public class IdCheckAction {

private String mem_id;


public void idCheck(){
	Map<String , String> params = new HashMap<String, String>();
	params.put("mem_id", mem_id);
	
	MemberService service = MemberServiceImpl.getInstance();
	MemberVO memberInfo = service.getMemberInfo(params);
	
	Map<String, String> jsonMap = new HashMap<String, String>();
	if(memberInfo == null){
		jsonMap.put("flag", "사용 가능합니다");
	}else{
		jsonMap.put("flag", "사용 불가능합니다");
	}
	HttpServletResponse response = ServletActionContext.getResponse();
	ObjectMapper mapper = new ObjectMapper();
	try {
		String jsonData = mapper.writeValueAsString(jsonMap);
		response.setHeader("Content-Type", "application/json;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println(jsonData);
	} catch (IOException e) {
		e.printStackTrace();
	}
}

public void setMem_id(String mem_id) {
	this.mem_id = mem_id;
}


}
