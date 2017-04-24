package kr.or.wsd.notice.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import kr.or.wsd.notice.service.NoticeService;
import kr.or.wsd.notice.service.NoticeServiceImpl;
import kr.or.wsd.utils.RolePagingUtil;
import kr.or.wsd.vo.NoticeVO;

import org.apache.struts2.ServletActionContext;

public class ADNoticeListAction {

	public String execute(){
		HttpServletRequest request = ServletActionContext.getRequest();
		
		String currentPage = request.getParameter("currentPage");
		if(currentPage == null){
			currentPage = "1";
		}
		//총 게시글 수
		int totalCount;
		//페이지별 출력될 게시글 수
		int blockCount = 10;
		//페이지 네이게이션 갯수
		int blockPage = 5;
		
		//페이징 html코드
		String pageHtml;
		
		String search_keycode = request.getParameter("search_keycode");
		String search_keyword = request.getParameter("search_keyword");
		
		NoticeService service = NoticeServiceImpl.getInstance();
		Map<String, String> params = new HashMap<String, String>();
		
		
		params.put("search_keycode", search_keycode);
		params.put("search_keyword", search_keyword);
		totalCount = service.getTotalCount(params);
		
		RolePagingUtil pagingUtil = new RolePagingUtil(currentPage, totalCount, blockCount, blockPage, request);
		params.put("startCount", String.valueOf(pagingUtil.getStartCount()));
		params.put("endCount", String.valueOf(pagingUtil.getEndCount()));
		
		List<NoticeVO> noticeList = service.getNoticeList(params);
		
		request.setAttribute("noticeList", noticeList);
		request.setAttribute("pageHtml", pagingUtil.getPageHtml().toString());

		
		return "success";
	}
}
