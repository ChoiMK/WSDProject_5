package kr.or.wsd.reference.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import kr.or.wsd.reference.service.ReferenceService;
import kr.or.wsd.reference.service.ReferenceServiceImpl;
import kr.or.wsd.utils.RolePagingUtil;
import kr.or.wsd.vo.ReferenceVO;

import org.apache.struts2.ServletActionContext;

public class ADReferenceListAction {
	
	public String execute(){
		HttpServletRequest request = ServletActionContext.getRequest();
		
		String currentPage = request.getParameter("currentPage");
		if(currentPage == null){
			currentPage = "1";
		}
		int totalCount;
		int blockCount = 8;
		int blockPage = 5;
		
		String pageHtml;
		
		String search_keycode = request.getParameter("search_keycode");
		String search_keyword = request.getParameter("search_keyword");
		
		ReferenceService service = ReferenceServiceImpl.getInstance();
		Map<String, String> params = new HashMap<String, String>();
		
		params.put("search_keycode", search_keycode);
		params.put("search_keyword", search_keyword);
		totalCount = service.getTotalCount(params);
		
		RolePagingUtil pagingUtil = new RolePagingUtil(currentPage, totalCount, blockCount, blockPage, request);
		params.put("startCount", String.valueOf(pagingUtil.getStartCount()));
		params.put("endCount", String.valueOf(pagingUtil.getEndCount()));
		
		List<ReferenceVO> referenceList = service.getReferenceList(params);
		
		request.setAttribute("referenceList", referenceList);
		request.setAttribute("pageHtml", pagingUtil.getPageHtml().toString());
		
		return "success";
	}

}
