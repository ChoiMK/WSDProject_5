package kr.or.wsd.reference.controller;

import kr.or.wsd.reference.service.ReferenceService;
import kr.or.wsd.reference.service.ReferenceServiceImpl;
import kr.or.wsd.vo.ReferenceVO;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class ADUpdateReferenceInfoAction implements Action, ModelDriven<ReferenceVO> {
	private ReferenceVO referenceInfo;

	@Override
	public String execute() throws Exception {
		
		ReferenceService service = ReferenceServiceImpl.getInstance();
		service.updateReferenceInfo(referenceInfo);
		return SUCCESS;
	}

	@Override
	public ReferenceVO getModel() {
		referenceInfo = new ReferenceVO();
		return referenceInfo;
	}

}
