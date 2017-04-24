package kr.or.wsd.statistics.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import kr.or.wsd.statistics.service.StatisticsService;
import kr.or.wsd.statistics.service.StatisticsServiceImpl;
import kr.or.wsd.utils.ChartDataUtil;
import kr.or.wsd.vo.StatisticsVO;

import com.opensymphony.xwork2.Action;

public class BoardstatisticsAction implements Action {

	@Override
	public String execute() throws Exception {
		
		StatisticsService service = StatisticsServiceImpl.getInstance();
		List<StatisticsVO> freeboardHitList = service.selectFreeHit();
		List<StatisticsVO> qaHitList = service.selectQAHit();
		List<StatisticsVO> refHitList = service.selectRefHit();
		
		ChartDataUtil chart;
		chart = new  ChartDataUtil(freeboardHitList, "글제목", "조회수");
		String freeHit = chart.setData();
		chart = new  ChartDataUtil(qaHitList, "글제목", "조회수");
		String qaHit = chart.setData();
		chart = new  ChartDataUtil(refHitList, "글제목", "조회수");
		String refHit = chart.setData();
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		request.setAttribute("freeHit", freeHit);
		request.setAttribute("qaHit", qaHit);
		request.setAttribute("refHit", refHit);
		
		return SUCCESS;
	}

}
