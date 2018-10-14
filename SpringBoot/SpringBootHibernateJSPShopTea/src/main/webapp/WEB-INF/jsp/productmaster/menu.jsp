<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.productmaster-resources"/>
<a class="button" href="${pageContext.request.contextPath}/indexProductMaster"><span><img src="images/icons/view.gif" /><fmt:message key="navigation.view"/> <fmt:message key="productmaster.title"/>s</span></a>
