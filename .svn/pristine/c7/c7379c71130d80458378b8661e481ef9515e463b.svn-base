package kr.or.wsd.notice.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.wsd.ibatis.build.SqlMapClientFactory;
import kr.or.wsd.notice.dao.NoticeDao;
import kr.or.wsd.notice.dao.NoticeDaoImpl;
import kr.or.wsd.vo.NoticeVO;

public class NoticeDaoImpl implements NoticeDao{

	private static NoticeDao dao = new NoticeDaoImpl();
	private SqlMapClient client;
	
	private NoticeDaoImpl(){
		client = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static NoticeDao getInstance() {
		return (dao == null) ? new NoticeDaoImpl() : dao;
	}
	@Override
	public List<NoticeVO> getNoticeList(Map<String, String> params)
			throws SQLException {
		return client.queryForList("notice.noticeList", params);
	}

	@Override
	public NoticeVO getNoticeInfo(Map<String, String> params)
			throws SQLException {
		return (NoticeVO) client.queryForObject("notice.noticeInfo", params);
	}
	
	@Override
	public void insertNoticeInfo(NoticeVO noticeInfo) throws SQLException {
		client.insert("notice.insertNotice", noticeInfo);
	}


	@Override
	public int updateNoticeInfo(NoticeVO noticeInfo) throws SQLException {
		return client.update("notice.updateNotice", noticeInfo);
	}

	@Override
	public int deleteNoticeInfo(Map<String, String> params) throws SQLException {
		return client.delete("notice.deleteNotice", params);
	}

	@Override
	public int updateHit(NoticeVO noticeCnt) throws SQLException {
		return client.update("notice.updateHit", noticeCnt);
	}

	@Override
	public int getTotalCount(Map<String, String> params) throws SQLException {
		return (int) client.queryForObject("notice.totalCount", params);
	}

}
