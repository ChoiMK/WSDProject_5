<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원리스트</title>
<style type="text/css">
#wrapper {
  display: table;
}
#cell {
  display: table-cell; 
  vertical-align: middle;
}
.njkLove{
	height:400px; 
	width:700px;
}
</style>
</head>
<script type="text/javascript" src = "http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="https://www.google.com/jsapi"></script>
<script type="text/javascript">

	var addr = [${addr}];
	var like = [${like}];
	var job = [${job}];
	
	
	google.load("visualization", "1", {
		packages : [ "corechart" ]
	});
	
	google.setOnLoadCallback(addrChart);
	
	function addrChart() {

        var data = google.visualization.arrayToDataTable(addr);

        var options = {
          title: '회원별 도시분포'
        };

        var chart = new google.visualization.ColumnChart(document.getElementById('addr'));

        chart.draw(data, options);
	}
	
	
	
	google.load("visualization", "1", {
		packages : [ "corechart" ]
	});
	google.setOnLoadCallback(likeChart);
	
	function likeChart() {

        var data = google.visualization.arrayToDataTable(like);

        var options = {
          title: '회원별 취미분포'
        };

        var chart = new google.visualization.PieChart(document.getElementById('like'));

        chart.draw(data, options);
	}
	
	
	google.load("visualization", "1", {
		packages : [ "corechart" ]
	});
	google.setOnLoadCallback(jobChart);
	
	function jobChart() {

        var data = google.visualization.arrayToDataTable(job);

        var options = {
          title: '회원별 직업분포',
          pieHole: 0.4,
        };

        var chart = new google.visualization.PieChart(document.getElementById('job'));

        chart.draw(data, options);
	}
	
</script>
<div id="wrapper">
  <div id="cell">
    <div>
  		<div class="njkLove" id="addr"></div>
		<div class="njkLove" id="like"></div>
		<div class="njkLove" id="job"></div>
    </div>
  </div>
</div>
</body>
</html>