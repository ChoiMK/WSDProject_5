package kr.or.wsd.join.controller;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;

public class LogoutAction implements Action {

	@Override
	public String execute() throws Exception {
		ServletActionContext.getRequest().getSession().invalidate();
		return SUCCESS;
	}

}
