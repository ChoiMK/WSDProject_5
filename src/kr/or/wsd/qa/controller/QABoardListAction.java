package kr.or.wsd.qa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import kr.or.wsd.qa.service.QAService;
import kr.or.wsd.qa.service.QAServiceImpl;
import kr.or.wsd.utils.RolePagingUtil;
import kr.or.wsd.vo.QABoardVO;

import com.opensymphony.xwork2.Action;

public class QABoardListAction implements Action {
	private String search_keyword;
	private String search_keycode;
	private String currentPage;
	
	@Override
	public String execute() throws Exception {
		
		QAService service = QAServiceImpl.getInstance();

		Map<String, String> params = new HashMap<String, String>();
		params.put("search_keyword", search_keyword);
		params.put("search_keycode", search_keycode);
		params.put("currentPage", currentPage);
		
		int totalCount;
		int blockCount = 10;
		int blockPage = 5;
		if(currentPage == null){
			currentPage = "1";
		}
		String pageHtml = null;
		
		totalCount = service.getTotalCount(params);
		HttpServletRequest request = ServletActionContext.getRequest();
		
		RolePagingUtil pagingUtil = new RolePagingUtil(currentPage, totalCount, blockCount, blockPage, request);
		params.put("startCount", String.valueOf(pagingUtil.getStartCount()));
		params.put("endCount", String.valueOf(pagingUtil.getEndCount()));
		
		List<QABoardVO> qaboardList = service.getQAList(params);
		request.setAttribute("qaboardList", qaboardList);
		request.setAttribute("pageHtml", pagingUtil.getPageHtml().toString());
		
		return SUCCESS;
	}

	public void setSearch_keyword(String search_keyword) {
		this.search_keyword = search_keyword;
	}

	public void setSearch_keycode(String search_keycode) {
		this.search_keycode = search_keycode;
	}

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}

}
