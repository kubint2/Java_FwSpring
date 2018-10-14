<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.arinvdetail-resources"/>
<html>
<head>
<title>Edit <fmt:message key="arinvdetail.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="arinvdetail.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexArInvdetail"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveArInvdetail" method="POST" modelAttribute="arinvdetail">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arinvdetail.code.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="arinvdetail_code" path="code" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "arinvdetail_code",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="arinvdetail.code.help"/>", required : true}})); </script>
								</c:when>
								<c:otherwise>
							${arinvdetail.code}
						&nbsp;
									<form:hidden id="arinvdetail_code" path="code"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arinvdetail.codeproduct.title"/>:
						</td>
						<td>
							<form:input id="arinvdetail_codeProduct" path="codeProduct" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "arinvdetail_codeProduct",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="arinvdetail.codeproduct.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arinvdetail.codecustomer.title"/>:
						</td>
						<td>
							<form:input id="arinvdetail_codeCustomer" path="codeCustomer" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "arinvdetail_codeCustomer",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="arinvdetail.codecustomer.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arinvdetail.priceunitexp.title"/>:
						</td>
						<td>
							<form:input id="arinvdetail_priceUnitExp" path="priceUnitExp" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "arinvdetail_priceUnitExp",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="arinvdetail.priceunitexp.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arinvdetail.priceunittransport.title"/>:
						</td>
						<td>
							<form:input id="arinvdetail_priceUnitTransport" path="priceUnitTransport" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "arinvdetail_priceUnitTransport",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="arinvdetail.priceunittransport.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arinvdetail.priceunitother.title"/>:
						</td>
						<td>
							<form:input id="arinvdetail_priceUnitOther" path="priceUnitOther" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "arinvdetail_priceUnitOther",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="arinvdetail.priceunitother.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arinvdetail.countproductexp.title"/>:
						</td>
						<td>
							<form:input id="arinvdetail_countProductExp" path="countProductExp" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "arinvdetail_countProductExp",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="arinvdetail.countproductexp.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arinvdetail.sumpriceexp.title"/>:
						</td>
						<td>
							<form:input id="arinvdetail_sumPriceExp" path="sumPriceExp" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "arinvdetail_sumPriceExp",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="arinvdetail.sumpriceexp.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arinvdetail.note.title"/>:
						</td>
						<td>
							<form:input id="arinvdetail_note" path="note" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "arinvdetail_note",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="arinvdetail.note.help"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>