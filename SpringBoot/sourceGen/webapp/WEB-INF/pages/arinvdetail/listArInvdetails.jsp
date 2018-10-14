<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.arinvdetail-resources"/>
<html>
<head>
<title>List <fmt:message key="arinvdetail.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="arinvdetail.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newArInvdetail"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="arinvdetail.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="arinvdetail.code.title"/></th>
					<th class="thead"><fmt:message key="arinvdetail.codeproduct.title"/></th>
					<th class="thead"><fmt:message key="arinvdetail.codecustomer.title"/></th>
					<th class="thead"><fmt:message key="arinvdetail.priceunitexp.title"/></th>
					<th class="thead"><fmt:message key="arinvdetail.priceunittransport.title"/></th>
					<th class="thead"><fmt:message key="arinvdetail.priceunitother.title"/></th>
					<th class="thead"><fmt:message key="arinvdetail.countproductexp.title"/></th>
					<th class="thead"><fmt:message key="arinvdetail.sumpriceexp.title"/></th>
					<th class="thead"><fmt:message key="arinvdetail.note.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${arinvdetails}" var="current" varStatus="i">
					<c:choose>
						<c:when test="${(i.count) % 2 == 0}">
		    				<c:set var="rowclass" value="rowtwo"/>
						</c:when>
						<c:otherwise>
		    				<c:set var="rowclass" value="rowone"/>
						</c:otherwise>
					</c:choose>	
				<tr class="${rowclass}">
					<td nowrap="nowrap" class="tabletd">
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectArInvdetail?codeKey=${current.code}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editArInvdetail?codeKey=${current.code}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteArInvdetail?codeKey=${current.code}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.code}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.codeProduct}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.codeCustomer}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.priceUnitExp}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.priceUnitTransport}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.priceUnitOther}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.countProductExp}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.sumPriceExp}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.note}
						&nbsp;
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>