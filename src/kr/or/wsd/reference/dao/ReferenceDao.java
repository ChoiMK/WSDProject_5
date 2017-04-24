package kr.or.wsd.reference.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.fileupload.FileItem;

import kr.or.wsd.vo.FileRoomVO;
import kr.or.wsd.vo.ReferenceVO;

public interface ReferenceDao {
	public List<ReferenceVO> getReferenceList(Map<String, String> params) throws SQLException;
	public void insertReferenceInfo(ReferenceVO referenceInfo) throws SQLException;
	public ReferenceVO getReferenceInfo(Map<String, String> params) throws SQLException;
	public int updateReferenceInfo(ReferenceVO referenceInfo) throws SQLException;
	public int deleteReferenceInfo(Map<String, String> params) throws SQLException;
	public int updateHit(ReferenceVO referenceCnt) throws SQLException;
	public FileRoomVO getFileItemInfo(Map<String, String> params) throws SQLException;
	public int getTotalCount(Map<String, String> params) throws SQLException;
}
