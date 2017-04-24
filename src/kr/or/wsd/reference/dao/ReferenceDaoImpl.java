package kr.or.wsd.reference.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.wsd.ibatis.build.SqlMapClientFactory;
import kr.or.wsd.vo.FileRoomVO;
import kr.or.wsd.vo.ReferenceVO;

import org.apache.commons.fileupload.FileItem;

import com.ibatis.sqlmap.client.SqlMapClient;

public class ReferenceDaoImpl implements ReferenceDao{
   
   private static ReferenceDao dao = new ReferenceDaoImpl();
   private SqlMapClient client;
   
   private ReferenceDaoImpl(){
      client = SqlMapClientFactory.getSqlMapClient();
   }
   
   public static ReferenceDao getInstance(){
      return (dao == null) ? new ReferenceDaoImpl() : dao;
   }

   @Override
   public List<ReferenceVO> getReferenceList(Map<String, String> params) throws SQLException {
      return client.queryForList("reference.referenceList", params);
   }

   @Override
   public void insertReferenceInfo(ReferenceVO referenceInfo) throws SQLException {
      try{
         client.startTransaction();
         
         List<FileRoomVO> fileItemList = referenceInfo.getAttachFileRoomList();
         String ref_no = (String) client.insert("reference.insertReference", referenceInfo);
         
         for(FileRoomVO fileItemInfo : fileItemList){
            fileItemInfo.setFile_ref_no(ref_no);
            client.insert("reference.insertFileRoom", fileItemInfo);
         }
         client.commitTransaction();
      }finally{
         client.endTransaction();
      }
   }


   @Override
   public ReferenceVO getReferenceInfo(Map<String, String> params) throws SQLException {
      return (ReferenceVO) client.queryForObject("reference.referenceInfo", params);
   }

   @Override
   public int updateReferenceInfo(ReferenceVO referenceInfo) throws SQLException {
      return client.update("reference.updateReference", referenceInfo);
   }

   @Override
   public int deleteReferenceInfo(Map<String, String> params) throws SQLException {
      return client.update("reference.deleteReference", params);
   }

   @Override
   public FileRoomVO getFileItemInfo(Map<String, String> params) throws SQLException {
      client.update("reference.updateDownloadHit", params);
      return (FileRoomVO) client.queryForObject("reference.fileRoomInfo", params);
   }

   @Override
   public int getTotalCount(Map<String, String> params) throws SQLException {
      return (int) client.queryForObject("reference.totalCount", params);
   }

@Override
public int updateHit(ReferenceVO referenceCnt) throws SQLException {
	return client.update("reference.updateHitCnt", referenceCnt);
}


}