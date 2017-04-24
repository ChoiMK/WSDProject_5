package kr.or.wsd.freeboard.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import kr.or.wsd.freeboard.service.FreeBoardService;
import kr.or.wsd.freeboard.service.FreeBoardServiceImpl;
import kr.or.wsd.utils.GlobalConstant;
import kr.or.wsd.vo.FileItemVO;

public class FileDownloadAction {
   private String fileSeq;
   private InputStream inputStream;
   private String contentDisposition;
   private int contentLength;
   
   
   public String execute(){
      FreeBoardService service = FreeBoardServiceImpl.getInstance();
      Map<String, String> params = new HashMap<String, String>();
      params.put("file_seq", fileSeq);
      
      FileItemVO fileVO= service.getFileItemInfo(params);
      String fileName = fileVO.getFile_name();
      
	   
      File downloadFile = new File(GlobalConstant.SAVE_PATH, fileVO.getFile_save_name());
      
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
   
   
	public void setFileSeq(String fileSeq) {
		this.fileSeq = fileSeq;
	}
}