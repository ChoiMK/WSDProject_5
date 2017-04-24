package kr.or.wsd.qa.controller;

import kr.or.wsd.qa.service.QAService;
import kr.or.wsd.qa.service.QAServiceImpl;
import kr.or.wsd.vo.QABoardVO;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class InsertQAReplyAction implements Action, ModelDriven<QABoardVO> {

	private QABoardVO qaboardInfo;
	@Override
	public String execute() throws Exception {
		QAService service = QAServiceImpl.getInstance();
		service.insertQAReplyInfo(qaboardInfo);
		
		return SUCCESS;
	}

	@Override
	public QABoardVO getModel() {
		qaboardInfo = new QABoardVO();
		return qaboardInfo;
	}

}
