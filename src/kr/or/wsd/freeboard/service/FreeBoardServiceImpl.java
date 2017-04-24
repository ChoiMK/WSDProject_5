package kr.or.wsd.freeboard.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.wsd.freeboard.dao.FreeBoardDao;
import kr.or.wsd.freeboard.dao.FreeBoardDaoImpl;
import kr.or.wsd.vo.BoardVO;
import kr.or.wsd.vo.FileItemVO;



public class FreeBoardServiceImpl implements FreeBoardService{
	
	private static FreeBoardServiceImpl service = new FreeBoardServiceImpl();
	private FreeBoardDao dao;
	
	private FreeBoardServiceImpl(){
		dao = FreeBoardDaoImpl.getInstance();
	}
	
	public static FreeBoardService getInstance(){
		if(service == null){
			service = new FreeBoardServiceImpl();
		}
		return service;
		
	}

	@Override
	public List<BoardVO> getBoardList(Map<String, String> params) {
		List<BoardVO> boardList = null;
		try {
			boardList = dao.getBoardList(params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return boardList;
	}

	@Override
	public void insertBoardInfo(BoardVO boardInfo) {
		try {
			dao.insertBoardInfo(boardInfo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public BoardVO getBoardInfo(Map<String, String> params) {
		BoardVO boardInfo = null;
		try {
			boardInfo = dao.getBoardInfo(params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return boardInfo;
	}

	@Override
	public int updateBoardInfo(BoardVO boardInfo) {
		int updateCnt = 0;
		try {
			updateCnt = dao.updateBoardInfo(boardInfo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return updateCnt;
	}

	@Override
	public int deleteBoardInfo(Map<String , String> params) {
		int deleteCnt = 0;
		try {
			deleteCnt = dao.deleteBoardInfo(params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return deleteCnt;
	}


	@Override
	public FileItemVO getFileItemInfo(Map<String, String> params) {
		FileItemVO fileItemInfo = null;
		try {
			fileItemInfo = dao.getFileItemInfo(params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fileItemInfo;
	}

	@Override
	public void insertBoardReplyInfo(BoardVO boardInfo) {
		try {
			dao.insertBoardReplyInfo(boardInfo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int getTotalCount(Map<String, String> params) {
		int totalCount = 0;
		try {
			totalCount = dao.getTotalCount(params);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return totalCount;
	}


}
