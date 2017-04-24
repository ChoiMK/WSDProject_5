package kr.or.wsd.freeboard.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.wsd.vo.BoardVO;
import kr.or.wsd.vo.FileItemVO;



public interface FreeBoardDao {
	public List<BoardVO> getBoardList(Map<String, String> params) throws SQLException;
	public void insertBoardInfo(BoardVO boardInfo) throws SQLException;
	public void insertBoardReplyInfo(BoardVO boardInfo) throws SQLException;
	public BoardVO getBoardInfo(Map<String, String> params) throws SQLException;
	public int updateBoardInfo(BoardVO boardInfo) throws SQLException;
	public int deleteBoardInfo(Map<String, String> params) throws SQLException;
	public FileItemVO getFileItemInfo(Map<String, String> params) throws SQLException;
	public int getTotalCount(Map<String, String> params) throws SQLException;
}
