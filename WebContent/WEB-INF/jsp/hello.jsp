<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/jsp/include.jsp" %>

<html>
 <head><title>
 	<fmt:message key="title"/>
 </title></head>
<body>

<fmt:message key="greeting" />
<c:out value="${model.now}" />
<h1>Product Info</h1><br>

<c:forEach items="${model.products}" var="prod" >
  <c:out value="${prod.desc}"></c:out>&nbsp;
  <c:out value="${prod.price }"></c:out><br>
</c:forEach>
<br>

<a href="priceincrease.htm">Increase Prices</a>
</body>

</html>