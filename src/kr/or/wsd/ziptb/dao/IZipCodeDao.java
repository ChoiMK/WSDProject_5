package kr.or.wsd.ziptb.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.wsd.vo.ZiptbVO;



public interface IZipCodeDao {
	public List<ZiptbVO> getZiptbList(Map<String, String> params) throws SQLException;
}
