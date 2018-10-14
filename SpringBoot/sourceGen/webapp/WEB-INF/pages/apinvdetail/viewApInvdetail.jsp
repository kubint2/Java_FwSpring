<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.apinvdetail-resources"/>
<html>
<head>
<title>View <fmt:message key="apinvdetail.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="apinvdetail.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexApInvdetail"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="apinvdetail.code.title"/>:
						</td>
						<td>
							${apinvdetail.code}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="apinvdetail.codeproduct.title"/>:
						</td>
						<td>
							${apinvdetail.codeProduct}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="apinvdetail.priceunit.title"/>:
						</td>
						<td>
							${apinvdetail.priceUnit}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="apinvdetail.priceunittransport.title"/>:
						</td>
						<td>
							${apinvdetail.priceUnitTransport}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="apinvdetail.priceunitother.title"/>:
						</td>
						<td>
							${apinvdetail.priceUnitOther}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="apinvdetail.countproductimp.title"/>:
						</td>
						<td>
							${apinvdetail.countProductImp}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="apinvdetail.sumpriceimp.title"/>:
						</td>
						<td>
							${apinvdetail.sumPriceImp}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="apinvdetail.note.title"/>:
						</td>
						<td>
							${apinvdetail.note}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>