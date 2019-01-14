<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<% String name = "Halls";  %>

<jsp:include page="_head.jsp">
<jsp:param name="pageTitle" value="<%= name %>" />
</jsp:include>

<body>
    <jsp:include page="_header.jsp"></jsp:include>
    <div class="container-fluid py-4">
        <p>${errormsg}</p>
        <div class="row">
            <c:forEach items="${hallInfo}" var="hall" >
                <div class="card mr-2 mb-3">
                    <img class="mx-auto" src="/images/HallOfResidence/${hall.getImg()}" width="170" height="220" alt="hall picture" />
                    <div class="card-body">
                            <h5 class="card-title"><a href="${pageContext.request.contextPath}/halls/details?id=${hall.getHallID()}">${hall.getHallName()}</a></h5>
                    <p>
                        ${hall.getCity()}
                    </p>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</body>
</html>