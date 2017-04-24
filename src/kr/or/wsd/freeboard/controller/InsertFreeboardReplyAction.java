package kr.or.wsd.freeboard.controller;

import kr.or.wsd.freeboard.service.FreeBoardService;
import kr.or.wsd.freeboard.service.FreeBoardServiceImpl;
import kr.or.wsd.vo.BoardVO;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class InsertFreeboardReplyAction implements Action,ModelDriven<BoardVO> {
	BoardVO boardInfo;
	
	@Override
	public String execute() throws Exception {
		FreeBoardService service = FreeBoardServiceImpl.getInstance();
		service.insertBoardReplyInfo(boardInfo);
		
		return SUCCESS;
	}

	@Override
	public BoardVO getModel() {
		boardInfo = new BoardVO();
		return boardInfo;
	}

}
