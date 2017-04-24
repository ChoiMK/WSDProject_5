<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원리스트</title>
</head>
<script type="text/javascript" src = "http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="https://www.google.com/jsapi"></script>
<script type="text/javascript">

	var freeHit = [${freeHit}];
	var qaHit = [${qaHit}];
	var refHit = [${refHit}];
	
	
	
	
	google.load("visualization", "1", {
		packages : [ "corechart" ]
	});
	
	google.setOnLoadCallback(freeboardChart);
	
	function freeboardChart() {

        var data = google.visualization.arrayToDataTable(freeHit);

        var options = {
          title: '자유게시판 별 조회수가 높은 게시물'
        };

        var chart = new google.visualization.PieChart(document.getElementById('freeHit'));

        chart.draw(data, options);
	}
	
	
	
	
	
	google.load("visualization", "1", {
		packages : [ "corechart" ]
	});
	
	google.setOnLoadCallback(qaboardChart);
	
	function qaboardChart() {

        var data = google.visualization.arrayToDataTable(qaHit);

        var options = {
          title: 'Q&A 별 조회수가 높은 게시물'
        };

        var chart = new google.visualization.PieChart(document.getElementById('qaHit'));

        chart.draw(data, options);
	}
	
	
	
	
	google.load("visualization", "1", {
		packages : [ "corechart" ]
	});
	
	google.setOnLoadCallback(refboardChart);
	
	function refboardChart() {

        var data = google.visualization.arrayToDataTable(refHit);

        var options = {
          title: '자료실 별 조회수가 높은 게시물'
        };

        var chart = new google.visualization.PieChart(document.getElementById('refHit'));

        chart.draw(data, options);
	}
	
	
	

</script>
<body>
<div class="wrap">	
	<table width="1000" border="0" cellpadding="0" cellspacing="0">
		<tr valign="top">
			<td width="790">
				<div id="">
					
					<div style="height: 15px;"></div>
					
					<div align="center">
					<table> 
					<tr>
						<td><div id="freeHit" style="width:400px; height:500px"></div></td>
						<td><div id="qaHit" style="width:400px; height:500px"></div></td>
					</tr>

					<tr>
						<td colspan="2"><div id="refHit" style="width:400px; height:500px"></div></td>
					</tr>
					</table> 
					</div>
				</div>
			</td>
		</tr>
	</table>
</div>
</body>
</html>