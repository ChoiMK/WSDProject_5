package kr.or.wsd.statistics.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.wsd.ibatis.build.SqlMapClientFactory;
import kr.or.wsd.vo.StatisticsVO;

import com.ibatis.sqlmap.client.SqlMapClient;

public class StatisticsDaoImpl implements StatisticsDao {
	
	
	private static StatisticsDaoImpl dao = new StatisticsDaoImpl();
	private SqlMapClient client;
	private StatisticsDaoImpl(){
		client = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static StatisticsDaoImpl getInstance(){
		return (dao == null) ? new StatisticsDaoImpl() : dao;
	}

	@Override
	public List<StatisticsVO> selectLike() throws SQLException {
		return client.queryForList("statistics.selectLike");
	}

	@Override
	public List<StatisticsVO> selectJob() throws SQLException {
		return client.queryForList("statistics.selectJob");
	}

	@Override
	public List<StatisticsVO> selectAddr() throws SQLException {
		return client.queryForList("statistics.selectAddr");
	}

	@Override
	public List<StatisticsVO> selectFreeHit() throws SQLException {
		return client.queryForList("statistics.selectFreeHit");
	}

	@Override
	public List<StatisticsVO> selectQAHit() throws SQLException {
		return client.queryForList("statistics.selectQAHit");
	}

	@Override
	public List<StatisticsVO> selectRefHit() throws SQLException {
		return client.queryForList("statistics.selectRefHit");
	}

	
	
	
	
}
