<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<% String pageTitle = "Homepage"; %>

<jsp:include page="_head.jsp">
<jsp:param name="pageTitle" value="<%=pageTitle%>" />
</jsp:include>

<body>
    <jsp:include page="_header.jsp"></jsp:include>
    <div class="container-fluid">
        <div class="">
            <img class="img-fluid" src="https://www.ugr.es/en/sites/default/files/2018-10/PTS2.jpg" />
        </div>
        <h1 class="text-center py-3 border-bottom">Welcome to KeizrUniversity</h1
        
        <div class="mt-4">
            <h4 class="py-3">New Halls</h4>
            <ul class="list-group list-group-flush">
                <li class="list-group-item"><a href="${pageContext.request.contextPath}/halls/details?id=1">Lake Shore Hall</a></li>
                <li class="list-group-item"><a href="${pageContext.request.contextPath}/halls/details?id=2">St. Peter Hall</a></li>
                <li class="list-group-item"><a href="${pageContext.request.contextPath}/halls/details?id=3">Lake Shore Hall</a></li>
                <li class="list-group-item"><a href="${pageContext.request.contextPath}/halls/details?id=4">Bates Residence</a></li>
                <li class="list-group-item"><a href="${pageContext.request.contextPath}/halls/details?id=5">Brandon Hall</a></li>
            </ul>
        </div>
    </div>
</body>
</html>
        