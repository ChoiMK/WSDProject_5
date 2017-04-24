package kr.or.wsd.notice.controller;

import java.util.HashMap;
import java.util.Map;

import kr.or.wsd.notice.service.NoticeService;
import kr.or.wsd.notice.service.NoticeServiceImpl;

import com.opensymphony.xwork2.Action;

public class DeleteNoticeAction implements Action {

	private String nt_no;
	@Override
	public String execute() throws Exception {
		Map<String, String> params = new HashMap<String, String>();
		params.put("nt_no", nt_no);
		
		NoticeService service = NoticeServiceImpl.getInstance();
		service.deleteNoticeInfo(params);
		
		return SUCCESS;
	}

	public void setNt_no(String nt_no) {
		this.nt_no = nt_no;
	}
}
