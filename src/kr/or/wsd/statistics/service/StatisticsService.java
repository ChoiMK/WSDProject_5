package kr.or.wsd.statistics.service;
import java.util.List;

import kr.or.wsd.vo.StatisticsVO;



public interface StatisticsService {          
	public List<StatisticsVO> selectLike();
	public List<StatisticsVO> selectJob();
	public List<StatisticsVO> selectAddr();
	public List<StatisticsVO> selectFreeHit();
	public List<StatisticsVO> selectQAHit();
	public List<StatisticsVO> selectRefHit();
}
