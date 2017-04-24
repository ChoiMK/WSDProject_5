package kr.or.wsd.reference.service;

import java.util.List;
import java.util.Map;

import org.apache.commons.fileupload.FileItem;

import kr.or.wsd.vo.FileRoomVO;
import kr.or.wsd.vo.ReferenceVO;

public interface ReferenceService {
   public List<ReferenceVO> getReferenceList(Map<String, String> params);
   public void insertReferenceInfo(ReferenceVO referenceInfo);
   public ReferenceVO getReferenceInfo(Map<String, String> params);
   public int updateReferenceInfo(ReferenceVO referenceInfo);
   public int deleteReferenceInfo(Map<String, String> params);
   public int updateHit(ReferenceVO referenceCnt);
   public FileRoomVO getFileItemInfo(Map<String, String> params);
   public int getTotalCount(Map<String, String> params);
}