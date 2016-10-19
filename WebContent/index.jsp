<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="common/jspf/CommonJSToInclude.jspf" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to American Aircraft Company</title>
</head>

<body data-ng-app="AAC">
	
	<div class="container">
		<jsp:include page="common/widgets/header/header.jspf" />
	
		<div data-ng-view ></div>
		
		
	</div>
	<jsp:include page="common/widgets/footer/footer.jspf" />
</body>

<script src="menuRoute.js"></script>
<script src="workorder/workOrderList.js"></script>
<script src="workorder/workOrderDetail.js"></script>
<script src="rfq/rfqDetail.js"></script>

</html>

