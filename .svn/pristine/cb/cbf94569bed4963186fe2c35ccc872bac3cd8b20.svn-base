package kr.or.wsd.statistics.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import kr.or.wsd.statistics.service.StatisticsService;
import kr.or.wsd.statistics.service.StatisticsServiceImpl;
import kr.or.wsd.utils.ChartDataUtil;
import kr.or.wsd.vo.StatisticsVO;

import com.opensymphony.xwork2.Action;

public class MemberstatisticsAction implements Action {

	@Override
	public String execute() throws Exception {
		
		StatisticsService service = StatisticsServiceImpl.getInstance();
		List<StatisticsVO> addrList = service.selectAddr();
		List<StatisticsVO> likeList = service.selectLike();
		List<StatisticsVO> jobList = service.selectJob();
		
		ChartDataUtil chart = new ChartDataUtil(addrList,"도시","인원수");
		String addr = chart.setData();
		chart = new ChartDataUtil(likeList, "취미", "이름");
		String like = chart.setData();
		chart = new ChartDataUtil(jobList, "직업", "종류");
		String job = chart.setData();
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		request.setAttribute("addr", addr);
		request.setAttribute("like", like);
		request.setAttribute("job", job);
		
		return SUCCESS;
	}

}
