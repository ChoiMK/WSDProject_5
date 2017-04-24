package kr.or.wsd.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Service;

import org.apache.struts2.ServletActionContext;

import kr.or.wsd.member.service.MemberService;
import kr.or.wsd.member.service.MemberServiceImpl;
import kr.or.wsd.utils.RolePagingUtil;
import kr.or.wsd.vo.MemberVO;

import com.opensymphony.xwork2.Action;

public class MemberMgrAction implements Action {
	
	private String search_base;
	private String search_base_keyword;
	private String currentPage;
	private String blockCount;
	private String mem_add1;
	private String mem_hp;
	private String mem_year;
	private String mem_month;
	private String mem_day;
	private String mem_date_type;
	
	@Override
	public String execute() throws Exception {
		if(currentPage == null){
			currentPage = "1";
		}
		int totalCount;
		if(blockCount == null){
			blockCount = "10";
		}
		int blockPage = 5;
		String pageHtml = null;
		
		MemberService service = MemberServiceImpl.getInstance();
		Map<String, String> params = new HashMap<String, String>();
		params.put("search_base", search_base);
		params.put("search_base_keyword", search_base_keyword);
		params.put("currentPage", currentPage);
		params.put("blockCount", blockCount);
		params.put("mem_add1", mem_add1);
		params.put("mem_hp", mem_hp);
		params.put("mem_year", mem_year);
		params.put("mem_month", mem_month);
		params.put("mem_day", mem_day);
		params.put("mem_date_type", mem_date_type);
		
		totalCount = service.getTotalCount(params);
		HttpServletRequest request = ServletActionContext.getRequest();
		
		RolePagingUtil pagingUtil = new RolePagingUtil(currentPage, totalCount, Integer.parseInt(blockCount), blockPage, request);
		params.put("startCount", String.valueOf(pagingUtil.getStartCount()));
		params.put("endCount", String.valueOf(pagingUtil.getEndCount()));

		
		List<MemberVO> memberList = service.getMemberList(params);
		request.setAttribute("memberList", memberList);
		request.setAttribute("blockCount", blockCount);
		request.setAttribute("pageHtml", pagingUtil.getPageHtml().toString());
		
		return SUCCESS;
	}
	
	public void setSearch_base(String search_base) {
		this.search_base = search_base;
	}

	public void setSearch_base_keyword(String search_base_keyword) {
		this.search_base_keyword = search_base_keyword;
	}

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}

	public void setBlockCount(String blockCount) {
		this.blockCount = blockCount;
	}

	public void setMem_add1(String mem_add1) {
		this.mem_add1 = mem_add1;
	}

	public void setMem_hp(String mem_hp) {
		this.mem_hp = mem_hp;
	}


	public void setMem_year(String mem_year) {
		this.mem_year = mem_year;
	}

	public void setMem_month(String mem_month) {
		this.mem_month = mem_month;
	}

	public void setMem_day(String mem_day) {
		this.mem_day = mem_day;
	}

}
