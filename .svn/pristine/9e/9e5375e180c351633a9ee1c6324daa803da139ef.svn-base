package kr.or.wsd.notice.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.wsd.notice.dao.NoticeDao;
import kr.or.wsd.notice.dao.NoticeDaoImpl;
import kr.or.wsd.notice.service.NoticeService;
import kr.or.wsd.notice.service.NoticeServiceImpl;
import kr.or.wsd.vo.NoticeVO;

public class NoticeServiceImpl implements NoticeService {

	private static NoticeService service = new NoticeServiceImpl();
	private NoticeDao dao;
	
	private NoticeServiceImpl(){
		dao = NoticeDaoImpl.getInstance();
	}
	
	public static NoticeService getInstance(){
		if(service == null){
			service = new NoticeServiceImpl();
		}
		return service;
	}
	
	
	@Override
	public List<NoticeVO> getNoticeList(Map<String, String> params) {
		List<NoticeVO> noticeList = null;
		try {
			noticeList = dao.getNoticeList(params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return noticeList;
	}

	@Override
	public NoticeVO getNoticeInfo(Map<String, String> params) {
		NoticeVO noticeInfo = null;
		try {
			noticeInfo = dao.getNoticeInfo(params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return noticeInfo;
	}
	
	@Override
	public void insertNoticeInfo(NoticeVO noticeInfo) {
		try {
			dao.insertNoticeInfo(noticeInfo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	@Override
	public int updateNoticeInfo(NoticeVO noticeInfo) {
		int updateCnt = 0;
		
		try {
			updateCnt = dao.updateNoticeInfo(noticeInfo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return updateCnt;
	}

	@Override
	public int deleteNoticeInfo(Map<String, String> params) {
		int deleteCnt = 0;
		
		try {
			deleteCnt = dao.deleteNoticeInfo(params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return deleteCnt;
	}

	@Override
	public int updateHit(NoticeVO noticeCnt) {
		int updateHit = 0;
		
		try {
			updateHit = dao.updateHit(noticeCnt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return updateHit;
	}

	@Override
	public int getTotalCount(Map<String, String> params) {
		int totalCount = 0;
		
		try {
			totalCount = dao.getTotalCount(params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return totalCount;
	}

}
