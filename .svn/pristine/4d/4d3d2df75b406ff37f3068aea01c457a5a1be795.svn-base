package kr.or.wsd.reference.controller;

import java.util.HashMap;
import java.util.Map;

import kr.or.wsd.reference.service.ReferenceService;
import kr.or.wsd.reference.service.ReferenceServiceImpl;

import com.opensymphony.xwork2.Action;

public class DeleteReferenceInfoAction implements Action {
	
	private String ref_no;
	
	@Override
	public String execute() throws Exception {
		Map<String, String> params = new HashMap<String, String>();
		params.put("ref_no", ref_no);
		
		ReferenceService service = ReferenceServiceImpl.getInstance();
		service.deleteReferenceInfo(params);
		
		return SUCCESS;
	}

	public void setRef_no(String ref_no) {
		this.ref_no = ref_no;
	}

}
