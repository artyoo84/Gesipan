<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
 <c:set var="context" value="<%=request.getContextPath() %>"></c:set>   
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Only Content Frame</title>
	<style>
	 @IMPORT url("${context}/css/common.css");
	</style>
</head>
<body>
 <div id="wrap" class="clear">
  <jsp:include page="header.jsp"></jsp:include>
  	<section class="content">
  		<div>
  		 <br />
  		 	<table class="tab" align="center">
  		 		<tr class="tab" style="height: 50px">
  		 			<td class="tab"><a href="#"></a>방명록</td>
  		 			<td class="tab"><a href="#">답글게시판</td>
  		 			<td class="tab"><a href="#">자료실</td>
  		 		</tr>
  		 		<tr class="tab">
  		 			<td colspan="3"></td>
  		 		</tr>
  		 	</table>
  		 
  		  <br /><br /><br /><br />
  		 
  		</div>
  		</section>
 </div>	
</body>
</html>