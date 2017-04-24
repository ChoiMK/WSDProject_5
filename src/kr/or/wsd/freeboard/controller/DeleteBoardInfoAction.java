package kr.or.wsd.freeboard.controller;

import java.util.HashMap;
import java.util.Map;

import kr.or.wsd.freeboard.service.FreeBoardService;
import kr.or.wsd.freeboard.service.FreeBoardServiceImpl;

import com.opensymphony.xwork2.Action;

public class DeleteBoardInfoAction implements Action {
	private String bo_no;

	@Override
	public String execute() throws Exception {
		Map<String, String> params = new HashMap<String, String>();
		params.put("bo_no", bo_no);
		FreeBoardService service = FreeBoardServiceImpl.getInstance();
		service.deleteBoardInfo(params);
		return SUCCESS;
	}

	public void setBo_no(String bo_no) {
		this.bo_no = bo_no;
	}

}
