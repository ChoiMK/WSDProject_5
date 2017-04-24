package kr.or.wsd.qa.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import kr.or.wsd.qa.service.QAService;
import kr.or.wsd.qa.service.QAServiceImpl;
import kr.or.wsd.vo.QABoardVO;

import com.opensymphony.xwork2.Action;

public class QABoardViewAction implements Action {
	private String qa_no;
	@Override
	public String execute() throws Exception {
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("qa_no", qa_no);
		
		QAService service = QAServiceImpl.getInstance();
		QABoardVO qaboardInfo = service.getQAInfo(params);
		service.updateHit(qaboardInfo);
		
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("qaboardInfo", qaboardInfo);
		
		return SUCCESS;
	}
	public void setQa_no(String qa_no) {
		this.qa_no = qa_no;
	}

}
