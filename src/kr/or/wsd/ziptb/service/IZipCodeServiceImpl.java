package kr.or.wsd.ziptb.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.wsd.vo.ZiptbVO;
import kr.or.wsd.ziptb.dao.IZipCodeDao;
import kr.or.wsd.ziptb.dao.IZipCodeDaoImpl;

public class IZipCodeServiceImpl implements IZipCodeService {

	private static IZipCodeServiceImpl service = new IZipCodeServiceImpl();
	private IZipCodeDao dao;
	
	private IZipCodeServiceImpl(){
		dao = IZipCodeDaoImpl.getInstance();
	}
	
	public static IZipCodeService getInstance(){
		if(service == null){
			service = new IZipCodeServiceImpl();
		}
		return service;
		
	}
	
	@Override
	public List<ZiptbVO> getZiptbList(Map<String, String> params) {
		List<ZiptbVO> zibtbList = null;
			try {
				zibtbList = dao.getZiptbList(params);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		return zibtbList;
	}

}
