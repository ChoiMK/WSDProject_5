package kr.or.wsd.qa.service;

import java.util.List;
import java.util.Map;

import kr.or.wsd.vo.QABoardVO;


public interface QAService {
	public List<QABoardVO> getQAList(Map<String, String> params);
	public void insertQAInfo(QABoardVO qaboardInfo);
	public QABoardVO getQAInfo(Map<String, String> params);
	public void insertQAReplyInfo(QABoardVO qaboardInfo);
	public int updateQAInfo(QABoardVO qaboardInfo);
	public int deleteQAInfo(Map<String, String> params);
	public int updateHit(QABoardVO qaboardCnt);
	public int getTotalCount(Map<String, String> params);
}
