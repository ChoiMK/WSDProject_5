package kr.or.wsd.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;


public class ExcelDownloadAction{
	private String excel;
	
	public String execute(){
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		
		response.setHeader("Content-Disposition", "attachment; filename=member.xls");
	 	response.setHeader("Content-Description", "JSP generate excel file");
	 	response.setContentType("application/vnd.ms-excel");
	 	
		String page = "<table>";
		page += "<tr><th>아이디</th>"
				+ "<th>이름</th>"
				+ "<th>생일</th>"
				+ "<th>메일</th></tr>";
		page += excel;
		page += "</table>";
		request.setAttribute("page", page);
		
		return "success";
	}
	public void setExcel(String excel) {
		this.excel = excel;
	}

}
