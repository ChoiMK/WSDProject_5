package kr.or.wsd.member.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.codehaus.jackson.map.ObjectMapper;

import kr.or.wsd.vo.ZiptbVO;
import kr.or.wsd.ziptb.service.IZipCodeService;
import kr.or.wsd.ziptb.service.IZipCodeServiceImpl;


public class ZipSearchAction{
	private String dong;
	
	public void search(){
		Map<String, String> params = new HashMap<String, String>();
		params.put("dong", dong);
		
		IZipCodeService service = IZipCodeServiceImpl.getInstance();
		List<ZiptbVO> zipList = service.getZiptbList(params);
		
		
		
		HttpServletResponse response = ServletActionContext.getResponse();
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			String jsonData = mapper.writeValueAsString(zipList);
			response.setContentType("application/json; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println(jsonData);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
	public void setDong(String dong) {
		this.dong = dong;
	}
}
