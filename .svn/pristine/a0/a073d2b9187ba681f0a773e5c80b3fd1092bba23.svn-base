package kr.or.wsd.statistics.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.wsd.statistics.dao.StatisticsDao;
import kr.or.wsd.statistics.dao.StatisticsDaoImpl;
import kr.or.wsd.vo.StatisticsVO;


public class StatisticsServiceImpl implements StatisticsService {
	
	private static StatisticsServiceImpl service = new StatisticsServiceImpl();
	private StatisticsDao dao;
	private StatisticsServiceImpl(){
		dao = StatisticsDaoImpl.getInstance();
	}
	
	public static StatisticsServiceImpl getInstance() {
		if(service == null){
			service = new StatisticsServiceImpl();
		}
		return service;
	}

	@Override
	public List<StatisticsVO> selectLike() {
		List<StatisticsVO> statisticsList = null;
		try {
			statisticsList = dao.selectLike();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return statisticsList;
	}

	@Override
	public List<StatisticsVO> selectJob() {
		List<StatisticsVO> statisticsList = null;
		try {
			statisticsList = dao.selectJob();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return statisticsList;
	}

	@Override
	public List<StatisticsVO> selectAddr() {
		List<StatisticsVO> statisticsList = null;
		try {
			statisticsList = dao.selectAddr();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return statisticsList;
	}

	@Override
	public List<StatisticsVO> selectFreeHit() {
		List<StatisticsVO> statisticsList = null;
		try {
			statisticsList = dao.selectFreeHit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return statisticsList;
	}

	@Override
	public List<StatisticsVO> selectQAHit() {
		List<StatisticsVO> statisticsList = null;
		try {
			statisticsList = dao.selectQAHit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return statisticsList;
	}

	@Override
	public List<StatisticsVO> selectRefHit() {
		List<StatisticsVO> statisticsList = null;
		try {
			statisticsList = dao.selectRefHit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return statisticsList;
	}

	
	

	

}
