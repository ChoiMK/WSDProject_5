package kr.or.wsd.notice.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import kr.or.wsd.notice.service.NoticeService;
import kr.or.wsd.notice.service.NoticeServiceImpl;
import kr.or.wsd.vo.NoticeVO;

public class AdNoticeViewAction {

	private String nt_no;

	public String ADNoticeView(){
		Map<String, String> params = new HashMap<String, String>();
		params.put("nt_no", nt_no);
		
		NoticeService service = NoticeServiceImpl.getInstance();
		NoticeVO noticeInfo = service.getNoticeInfo(params);
		
		service.updateHit(noticeInfo);
		
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("noticeInfo", noticeInfo);
		
		return "success";
	}
	
	
	public void setNt_no(String nt_no) {
		this.nt_no = nt_no;
	}
}
