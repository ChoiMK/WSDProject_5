package kr.or.wsd.reference.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import kr.or.wsd.reference.service.ReferenceService;
import kr.or.wsd.reference.service.ReferenceServiceImpl;
import kr.or.wsd.vo.ReferenceVO;

import org.apache.struts2.ServletActionContext;

public class ADReferenceViewAction {
private String ref_no;
	
	public String execute(){
		Map<String, String> params = new HashMap<String, String>();
		params.put("ref_no", ref_no);
		
		ReferenceService service = ReferenceServiceImpl.getInstance();
		ReferenceVO referenceInfo = service.getReferenceInfo(params);
		
		service.updateHit(referenceInfo);
		
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("referenceInfo", referenceInfo);
		
		return "success";
	}

	public void setRef_no(String ref_no) {
		this.ref_no = ref_no;
	}

}
