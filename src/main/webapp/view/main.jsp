<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sj:head jqueryui="true" jquerytheme="cupertino"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><tiles:insertAttribute name="title" ignore="true"/></title>
</head>
<body>
	<tiles:insertAttribute name="banner" />
	<br />
	<hr />
	<tiles:insertAttribute name="menu" />
	<br />
	<hr />
	<tiles:insertAttribute name="body" />
	<br />
	<hr />
	<tiles:insertAttribute name="footer" />
	<br />
</body>
</html>