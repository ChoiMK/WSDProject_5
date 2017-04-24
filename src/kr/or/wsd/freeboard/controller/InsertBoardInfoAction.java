package kr.or.wsd.freeboard.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.multipart.MultiPartRequestWrapper;

import kr.or.wsd.freeboard.service.FreeBoardService;
import kr.or.wsd.freeboard.service.FreeBoardServiceImpl;
import kr.or.wsd.utils.GlobalConstant;
import kr.or.wsd.vo.BoardVO;
import kr.or.wsd.vo.FileItemVO;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class InsertBoardInfoAction implements Action,ModelDriven<BoardVO> {
	private BoardVO boardInfo;
	
	 @Override
	   public String execute() throws Exception {
	      
	      MultiPartRequestWrapper wrapper = (MultiPartRequestWrapper)ServletActionContext.getRequest();
	      
	      File[] files = wrapper.getFiles("files");
	      String[] fileNames = wrapper.getFileNames("files");
	      String[] contentTypes = wrapper.getContentTypes("files");
	      
	      List<FileItemVO> fileItemList = new ArrayList<FileItemVO>();
	      
	     
	      
	     if(files != null){ 
	      for(int i=0; i<files.length; i++){
				if(files[i].exists()){
					FileItemVO fileItemInfo = new FileItemVO();
					fileItemInfo.setFile_name(FilenameUtils.getName(fileNames[i]));
					String saveFileName = makeSaveFileName(fileNames[i]);
					fileItemInfo.setFile_save_name(saveFileName);
					fileItemInfo.setFile_content_type(contentTypes[i]);
					fileItemInfo.setFile_size(String.valueOf(files[i].length()));
					
					File saveFile = new File(GlobalConstant.SAVE_PATH, saveFileName);
					FileUtils.copyFile(files[i], saveFile);
					
					fileItemList.add(fileItemInfo);
					fileItemInfo = null;
				}
			}
	       boardInfo.setAttachFileItemList(fileItemList);
	     } 
	      
	      FreeBoardService service = FreeBoardServiceImpl.getInstance();
	      service.insertBoardInfo(boardInfo);
	      return SUCCESS;
	   }

	   @Override
	   public BoardVO getModel() {
		   boardInfo = new BoardVO();
	      return boardInfo;
	   }
	   
	   private String makeSaveFileName(String fileNames){
		   String baseName = FilenameUtils.getBaseName(fileNames);
           String uuid = UUID.randomUUID().toString().replace("-", "");
           String extension = FilenameUtils.getExtension(fileNames);
           String saveFileName = baseName + "_" + uuid + "." + extension;
		
           return saveFileName;
	  }
	   
	
	 
   
	   
}