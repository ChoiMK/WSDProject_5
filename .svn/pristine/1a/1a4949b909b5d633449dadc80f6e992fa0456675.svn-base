package kr.or.wsd.qa.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.wsd.ibatis.build.SqlMapClientFactory;
import kr.or.wsd.vo.QABoardVO;

import com.ibatis.sqlmap.client.SqlMapClient;

public class QADaoImpl implements QADao{
	
	private static QADao dao = new QADaoImpl();
	private SqlMapClient client;
	
	private QADaoImpl(){
		client = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static QADao getInstance(){
		return (dao==null) ? new QADaoImpl() : dao;
	}

	@Override
	public List<QABoardVO> getQAList(Map<String, String> params)
			throws SQLException {
		return client.queryForList("qaboard.qaList", params);
	}

	@Override
	public void insertQAInfo(QABoardVO qaboardInfo) throws SQLException {
		client.insert("qaboard.insertQA",qaboardInfo);
	}

	@Override
	public QABoardVO getQAInfo(Map<String, String> params) throws SQLException {
		return (QABoardVO) client.queryForObject("qaboard.qaInfo", params);
	}

	@Override
	public int updateQAInfo(QABoardVO qaboardInfo) throws SQLException {
		// TODO Auto-generated method stub
		return client.update("qaboard.updateQA", qaboardInfo);
	}

	@Override
	public int deleteQAInfo(Map<String, String> params) throws SQLException {
		// TODO Auto-generated method stub
		return client.update("qaboard.deleteQA",params);
	}

	@Override
	public int updateHit(QABoardVO qaboardCnt) throws SQLException {
		return client.update("qaboard.updateHitCnt", qaboardCnt);
	}

	@Override
	public void insertQAReplyInfo(QABoardVO qaboardInfo) throws SQLException {
		String qa_seq="";
		if("0".intern() == qaboardInfo.getQa_seq().intern()){
			qa_seq = (String) client.queryForObject("qaboard.incrementQASeq",qaboardInfo);
		}else{
			client.update("qaboard.updateQASeq", qaboardInfo);
			qa_seq = String.valueOf(Integer.parseInt(qaboardInfo.getQa_seq())+1);
		}
		qaboardInfo.setQa_seq(qa_seq);
		qaboardInfo.setQa_depth(String.valueOf(Integer.parseInt(qaboardInfo.getQa_depth())+1));
		
		client.insert("qaboard.insertReplyQAInfo", qaboardInfo);
	}

	@Override
	public int getTotalCount(Map<String, String> params) throws SQLException {
		return (int) client.queryForObject("qaboard.totalCount", params);
	}

	

}
