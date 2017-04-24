package kr.or.wsd.qa.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.wsd.vo.QABoardVO;


public interface QADao {
	public List<QABoardVO> getQAList(Map<String, String> params) throws SQLException;
	public void insertQAInfo(QABoardVO qaboardInfo) throws SQLException;
	public QABoardVO getQAInfo(Map<String, String> params) throws SQLException;
	public void insertQAReplyInfo(QABoardVO qaboardInfo) throws SQLException;
	public int updateQAInfo(QABoardVO qaboardInfo) throws SQLException;
	public int deleteQAInfo(Map<String, String> params) throws SQLException;
	public int updateHit(QABoardVO qaboardCnt) throws SQLException;
	public int getTotalCount(Map<String, String> params) throws SQLException;
}
