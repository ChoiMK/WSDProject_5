package kr.or.wsd.freeboard.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import kr.or.wsd.freeboard.service.FreeBoardService;
import kr.or.wsd.freeboard.service.FreeBoardServiceImpl;
import kr.or.wsd.utils.RolePagingUtil;
import kr.or.wsd.vo.BoardVO;

public class AdFreeboardListAction {
//	private String search_keycode;
//	private String search_keyword;
//	private String currentPage;

	public String execute(){
		HttpServletRequest request =  ServletActionContext.getRequest();
		
		String currentPage = request.getParameter("currentPage");
		if(currentPage == null){
			currentPage = "1";
		}
		int totalCount;
		
		int blockCount = 10;
		
		int blockPage = 5;
		String search_keycode = request.getParameter("search_keycode");
		String search_keyword = request.getParameter("search_keyword");
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("search_keycode",search_keycode);
		params.put("search_keyword",search_keyword);
		FreeBoardService service = FreeBoardServiceImpl.getInstance();
		
		totalCount = service.getTotalCount(params);
		RolePagingUtil pagingUtill = new RolePagingUtil(currentPage, totalCount, blockCount, blockPage, request);
		
		
		params.put("startCount", String.valueOf(pagingUtill.getStartCount()));
		params.put("endCount", String.valueOf(pagingUtill.getEndCount()));
		List<BoardVO> boardList = service.getBoardList(params);
		
		
		request.setAttribute("boardList", boardList);
		request.setAttribute("pageHtml", pagingUtill.getPageHtml().toString());
		
		return "success";
	}
	
//	
//	public void setSearch_keycode(String search_keycode) {
//		this.search_keycode = search_keycode;
//	}
//	
//	public void setSearch_keyword(String search_keyword) {
//		this.search_keyword = search_keyword;
//	}
//	
//	public void setCurrentPage(String currentPage) {
//		this.currentPage = currentPage;
//	}
}
