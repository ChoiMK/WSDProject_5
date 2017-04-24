package kr.or.wsd.freeboard.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import kr.or.wsd.freeboard.service.FreeBoardService;
import kr.or.wsd.freeboard.service.FreeBoardServiceImpl;
import kr.or.wsd.vo.BoardVO;

public class FreeboardViewAction{
	
	private String bo_no;
	
	public String execute() {
	 Map<String, String> params = new HashMap<String, String>();
	 params.put("bo_no", bo_no);
	 FreeBoardService service = FreeBoardServiceImpl.getInstance();
	 BoardVO boardInfo = service.getBoardInfo(params);
	 
	 HttpServletRequest request = ServletActionContext.getRequest();
	 request.setAttribute("boardInfo", boardInfo);
	 return "success";
	}
	
	public void setBo_no(String bo_no) {
		this.bo_no = bo_no;
	}
}
