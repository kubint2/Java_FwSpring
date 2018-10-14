<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.arinvdetail-resources"/>
<html>
<head>
<title>View <fmt:message key="arinvdetail.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="arinvdetail.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexArInvdetail"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arinvdetail.code.title"/>:
						</td>
						<td>
							${arinvdetail.code}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arinvdetail.codeproduct.title"/>:
						</td>
						<td>
							${arinvdetail.codeProduct}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arinvdetail.codecustomer.title"/>:
						</td>
						<td>
							${arinvdetail.codeCustomer}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arinvdetail.priceunitexp.title"/>:
						</td>
						<td>
							${arinvdetail.priceUnitExp}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arinvdetail.priceunittransport.title"/>:
						</td>
						<td>
							${arinvdetail.priceUnitTransport}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arinvdetail.priceunitother.title"/>:
						</td>
						<td>
							${arinvdetail.priceUnitOther}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arinvdetail.countproductexp.title"/>:
						</td>
						<td>
							${arinvdetail.countProductExp}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arinvdetail.sumpriceexp.title"/>:
						</td>
						<td>
							${arinvdetail.sumPriceExp}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arinvdetail.note.title"/>:
						</td>
						<td>
							${arinvdetail.note}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteArInvdetail?codeKey=${arinvdetail.code}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>