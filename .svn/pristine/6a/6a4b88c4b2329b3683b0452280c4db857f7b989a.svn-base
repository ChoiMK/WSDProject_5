package kr.or.wsd.notice.controller;

import kr.or.wsd.notice.service.NoticeService;
import kr.or.wsd.notice.service.NoticeServiceImpl;
import kr.or.wsd.vo.NoticeVO;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class UpdateNoticeAction implements Action,ModelDriven<NoticeVO> {
	private NoticeVO noticeInfo;
	
	@Override
	public String execute() throws Exception {
		
		NoticeService service = NoticeServiceImpl.getInstance();
		service.updateNoticeInfo(noticeInfo);
		return SUCCESS;
	}

	@Override
	public NoticeVO getModel() {
		noticeInfo = new NoticeVO();
		return noticeInfo;
	}

}
