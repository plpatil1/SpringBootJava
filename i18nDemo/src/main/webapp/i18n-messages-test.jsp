<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c"%>
    <%@ taglib uri="jakarta.tags.fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Internationalization</title>

<c:set var="theLocale" value="${not empty param.theLocale ? 
param.theLocale : pageContext.request.locale}"  />
<!-- 
param.theLocale - Read the Locale param sent by Link
pageContent.request.locale - Read the Locale sent by browser HTTP request
 -->
 
<fmt:setLocale value="${theLocale}"/>
<fmt:setBundle basename="com.app.jsp.i18nDemo.i18n.resources.mylabels"/>

</head>

<body>
<a href="i18n-messages-test.jsp?theLocale=en_US">English(US)</a>
|
<a href="i18n-messages-test.jsp?theLocale=es_ES">Spanish(ES)</a>
|
<a href="i18n-messages-test.jsp?theLocale=de_DE">German(DE)</a>
|
<a href="i18n-messages-test.jsp?theLocale=mr_IN">Marathi(IN)</a>

<hr>
<fmt:message key="label.greeting"/><br><br>
<fmt:message key="label.firstname"/><i> Rahul</i><br><br>
<fmt:message key="label.lastname"/><i> Pawar</i><br><br>
<fmt:message key="label.welcome"/><br><br>

<hr>
Selected Locale: ${theLocale}
</body>
</html>