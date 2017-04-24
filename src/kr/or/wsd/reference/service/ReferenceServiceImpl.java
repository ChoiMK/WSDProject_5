package kr.or.wsd.reference.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.wsd.reference.dao.ReferenceDao;
import kr.or.wsd.reference.dao.ReferenceDaoImpl;
import kr.or.wsd.vo.FileRoomVO;
import kr.or.wsd.vo.ReferenceVO;

import org.apache.commons.fileupload.FileItem;

public class ReferenceServiceImpl implements ReferenceService{
   
   private static ReferenceServiceImpl service = new ReferenceServiceImpl();
   private ReferenceDao dao;
   
   private ReferenceServiceImpl(){
      dao = ReferenceDaoImpl.getInstance();
   }
   
   public static ReferenceService getInstance(){
      if(service == null){
         service = new ReferenceServiceImpl();
      }
      return service;
   }

   @Override
   public List<ReferenceVO> getReferenceList(Map<String, String> params) {
      List<ReferenceVO> referenceList = null;
      try {
         referenceList = dao.getReferenceList(params);
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return referenceList;
   }

   @Override
   public void insertReferenceInfo(ReferenceVO referenceInfo) {
      try {
         dao.insertReferenceInfo(referenceInfo);
      } catch (SQLException e) {
         e.printStackTrace();
      }
      
   }


   @Override
   public ReferenceVO getReferenceInfo(Map<String, String> params) {
      ReferenceVO referenceInfo = null;
      try {
         referenceInfo = dao.getReferenceInfo(params);
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return referenceInfo;
   }

   @Override
   public int updateReferenceInfo(ReferenceVO referenceInfo) {
      int updateCnt = 0;
      try {
         updateCnt = dao.updateReferenceInfo(referenceInfo);
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return updateCnt;
   }

   @Override
   public int deleteReferenceInfo(Map<String, String> params) {
      int deleteCnt = 0;
      try {
         deleteCnt = dao.deleteReferenceInfo(params);
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return deleteCnt;
   }


   @Override
   public FileRoomVO getFileItemInfo(Map<String, String> params) {
      FileRoomVO fileItemInfo = null;
      try {
         fileItemInfo = dao.getFileItemInfo(params);
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return fileItemInfo;
   }

   @Override
   public int getTotalCount(Map<String, String> params) {
      int totalCnt = 0;
      try {
         totalCnt = dao.getTotalCount(params);
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return totalCnt;
   }

@Override
public int updateHit(ReferenceVO referenceCnt) {
	int hitCnt = 0;
    try {
       hitCnt = dao.updateHit(referenceCnt);
    } catch (SQLException e) {
       e.printStackTrace();
    }
    return hitCnt;
 }

}