package kr.or.wsd.utils;

import java.util.List;

import kr.or.wsd.vo.StatisticsVO;


public class ChartDataUtil {
	private List<StatisticsVO> data;
	private String mainSubjet;
	private String subSubjet;
	
	public ChartDataUtil(List<StatisticsVO> data, String mainSubjet, String subSubjet ){
		this.data = data;
		this.mainSubjet = mainSubjet;
		this.subSubjet = subSubjet;
	}
	
	public String setData(){
		
		String datas = "['"+mainSubjet+"','"+subSubjet+"'],";
		for(int i = 0; i<data.size(); i++){
			if(i==(data.size()-1)){
				datas += "['"+ data.get(i).getName()+"' , "+ data.get(i).getCount() +"]";
			}else{
				datas += "['"+ data.get(i).getName()+"' , "+ data.get(i).getCount() +"],";
				
			}
		}
		return datas;
			
	}
			
			
	

}
