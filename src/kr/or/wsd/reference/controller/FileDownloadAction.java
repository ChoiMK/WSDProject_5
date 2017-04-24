package kr.or.wsd.reference.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import kr.or.wsd.reference.service.ReferenceService;
import kr.or.wsd.reference.service.ReferenceServiceImpl;
import kr.or.wsd.utils.GlobalConstant;
import kr.or.wsd.vo.FileRoomVO;

public class FileDownloadAction {
	 private String contentDisposition;
	 private int contentLength;
	 private InputStream inputStream;
	 private String file_seq;
	 
	
	public String execute(){
		ReferenceService service = ReferenceServiceImpl.getInstance();
		Map<String, String> params = new HashMap<String, String>();
		params.put("file_seq", file_seq);
		
		FileRoomVO referenceInfo = service.getFileItemInfo(params);
		String fileName = referenceInfo.getFile_name();
		
		File downloadFile = new File(GlobalConstant.SAVE_PATH, referenceInfo.getFile_save_name());
		
		try {
	         contentDisposition = "attachment;filename=" + 
	                           URLEncoder.encode(fileName, "UTF-8");
	         contentLength = (int) downloadFile.length();
	         inputStream = new FileInputStream(downloadFile);
	         
	         } catch (FileNotFoundException e) {
	            e.printStackTrace();
	         } catch (UnsupportedEncodingException e) {
	         e.printStackTrace();
	         }
	      
	      return "success";
	   }

	public String getContentDisposition() {
		return contentDisposition;
	}
	public int getContentLength() {
		return contentLength;
	}
	public InputStream getInputStream() {
		return inputStream;
	}
	public void setFile_seq(String file_seq) {
		this.file_seq = file_seq;
	}
}
