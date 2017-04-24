package kr.or.wsd.notice.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.wsd.vo.NoticeVO;

public interface NoticeDao {

	public List<NoticeVO> getNoticeList(Map<String, String> params) throws SQLException;
	public void insertNoticeInfo(NoticeVO noticeInfo) throws SQLException;
	public NoticeVO getNoticeInfo(Map<String, String> params) throws SQLException;
	public int updateNoticeInfo(NoticeVO noticeInfo) throws SQLException;
	public int deleteNoticeInfo(Map<String, String> params) throws SQLException;
	public int updateHit(NoticeVO noticeCnt) throws SQLException;
	public int getTotalCount(Map<String, String> params)throws SQLException;

}
