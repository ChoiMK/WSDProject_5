package kr.or.wsd.ziptb.service;

import java.util.List;
import java.util.Map;

import kr.or.wsd.vo.ZiptbVO;

public interface IZipCodeService {
	public List<ZiptbVO> getZiptbList(Map<String, String> params);
}
