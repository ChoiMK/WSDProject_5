package kr.or.wsd.qa.controller;

import java.util.HashMap;
import java.util.Map;

import kr.or.wsd.qa.service.QAService;
import kr.or.wsd.qa.service.QAServiceImpl;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class DeleteQABoardAction implements Action{
	private String qa_no;
	@Override
	public String execute() throws Exception {
		Map<String, String> params = new HashMap<String, String>();
		params.put("qa_no", qa_no);
		
		QAService service = QAServiceImpl.getInstance();
		service.deleteQAInfo(params);
		
		return SUCCESS;
	}
	public void setQa_no(String qa_no) {
		this.qa_no = qa_no;
	}

}
