package kr.or.wsd.reference.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import kr.or.wsd.reference.service.ReferenceService;
import kr.or.wsd.reference.service.ReferenceServiceImpl;
import kr.or.wsd.utils.GlobalConstant;
import kr.or.wsd.vo.FileRoomVO;
import kr.or.wsd.vo.ReferenceVO;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class InsertReferenceInfoAction implements Action, ModelDriven<ReferenceVO> {
	private ReferenceVO referenceInfo;

	@Override
	public String execute() throws Exception {
		String fileName = "";
		List<File> files = referenceInfo.getFiles();
		List<String> fileNames = referenceInfo.getFilesFileName();
		List<String> contentType = referenceInfo.getFilesContentType();
		List<FileRoomVO> attachFileRoomList = new ArrayList<FileRoomVO>();
		for(int i=0; i<files.size(); i++){
			String baseName = FilenameUtils.getBaseName(fileNames.get(i));
			String uuid = UUID.randomUUID().toString().replace("-", "");
			String extension = FilenameUtils.getExtension(fileNames.get(i));
			String saveFileName = baseName + "_" + uuid + "." + extension;
			
		File saveFile = new File(GlobalConstant.SAVE_PATH, saveFileName);
		int fileSize = (int) files.get(i).length();
		fileName = fileNames.get(i);
		FileUtils.copyFile(files.get(i), saveFile);
		FileRoomVO fileInfo = new FileRoomVO();
		fileInfo.setFile_content_type(contentType.get(i));
		fileInfo.setFile_name(fileName);
		fileInfo.setFile_save_name(saveFileName);
		fileInfo.setFile_size(String.valueOf(fileSize));
		attachFileRoomList.add(fileInfo);
		}
		referenceInfo.setAttachFileRoomList(attachFileRoomList);
		ReferenceService service = ReferenceServiceImpl.getInstance();
		service.insertReferenceInfo(referenceInfo);
		
		return SUCCESS;
	}

	@Override
	public ReferenceVO getModel() {
		referenceInfo = new ReferenceVO();
		return referenceInfo;
	}

}
