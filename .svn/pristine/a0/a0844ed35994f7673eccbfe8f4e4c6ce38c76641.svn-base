package kr.or.wsd.ziptb.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.wsd.ibatis.build.SqlMapClientFactory;
import kr.or.wsd.vo.ZiptbVO;

import com.ibatis.sqlmap.client.SqlMapClient;

public class IZipCodeDaoImpl implements IZipCodeDao {
	
	private static IZipCodeDao dao = new IZipCodeDaoImpl();
	private SqlMapClient client;
	
	private IZipCodeDaoImpl(){
		client = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static IZipCodeDao getInstance() {
		return (dao == null) ? new IZipCodeDaoImpl() : dao;
	}

	@Override
	public List<ZiptbVO> getZiptbList(Map<String, String> params)
			throws SQLException {
		return client.queryForList("ziptb.ziptbList",params);
	}
	
	
	
				
}
