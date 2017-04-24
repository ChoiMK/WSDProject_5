package kr.or.wsd.qa.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.wsd.qa.dao.QADao;
import kr.or.wsd.qa.dao.QADaoImpl;
import kr.or.wsd.vo.QABoardVO;


public class QAServiceImpl implements QAService{

	private static QAServiceImpl service = new QAServiceImpl();
	private QADao dao;
	
	private QAServiceImpl(){
		dao = QADaoImpl.getInstance();
	}
	
	public static QAServiceImpl getInstance(){
		if(service==null){
			service = new QAServiceImpl();
		}
		return service;
	}
	
	@Override
	public List<QABoardVO> getQAList(Map<String, String> params) {
		List<QABoardVO> qaList = null;
		try {
			qaList = dao.getQAList(params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return qaList;
	}

	@Override
	public void insertQAInfo(QABoardVO qaboardInfo) {
		try {
			dao.insertQAInfo(qaboardInfo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public QABoardVO getQAInfo(Map<String, String> params) {
		QABoardVO qaInfo = null;
		try {
			qaInfo = dao.getQAInfo(params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return qaInfo;
	}

	@Override
	public void insertQAReplyInfo(QABoardVO qaboardInfo) {
		try {
			dao.insertQAReplyInfo(qaboardInfo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int updateQAInfo(QABoardVO qaboardInfo) {
		int updateCnt = 0;
		try {
			updateCnt = dao.updateQAInfo(qaboardInfo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return updateCnt;
	}

	@Override
	public int deleteQAInfo(Map<String, String> params) {
		int deleteCnt = 0;
		try {
			deleteCnt = dao.deleteQAInfo(params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return deleteCnt;
	}

	@Override
	public int updateHit(QABoardVO qaboardCnt) {
		int qaHit = 0;
		try {
			qaHit = dao.updateHit(qaboardCnt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return qaHit;
	}

	@Override
	public int getTotalCount(Map<String, String> params) {
		int totalCnt = 0;
		try {
			totalCnt = dao.getTotalCount(params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return totalCnt;
	}

	

	
}
