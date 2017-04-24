package kr.or.wsd.freeboard.service;

import java.util.List;
import java.util.Map;

import kr.or.wsd.vo.BoardVO;
import kr.or.wsd.vo.FileItemVO;



public interface FreeBoardService {
	public List<BoardVO> getBoardList(Map<String, String> params);
	public void insertBoardInfo(BoardVO boardInfo);
	public void insertBoardReplyInfo(BoardVO boardInfo);
	public BoardVO getBoardInfo(Map<String, String> params);
	public int updateBoardInfo(BoardVO boardInfo); 
	public int deleteBoardInfo(Map<String, String> params); 
	public FileItemVO getFileItemInfo(Map<String,String> params);
	public int getTotalCount(Map<String,String> params);
}
