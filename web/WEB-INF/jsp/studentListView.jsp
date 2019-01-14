<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
  
<% String pageTitle = "Students"; %>

<jsp:include page="_head.jsp">
<jsp:param name="pageTitle" value="<%=pageTitle%>" />
</jsp:include>

<body>
    <jsp:include page="_header.jsp"></jsp:include>
    <div class="container-fluid">

        <h1>Welcome to students page</h1>

        <p style="color: red;">${errorString}</p>

        <div class="row">
            <c:forEach items="${studentList}" var="student" >
                <div class="card mr-2 mb-3">
                    <img class="mx-auto" src="/images/Students/${student.getImg()}" width="170" height="220" alt="Student picture" />
                        <div class="card-body">
                                <h5 class="card-title"><a href="${pageContext.request.contextPath}/students/details?id=${student.getStudentID()}">${student.getFname()} ${student.getLname()}</a></h5>
                        <p>
                                ${student.getSex()}<br>
                                ${student.getNationality()}<br>
                                ${student.getCategory()}
                        </p>
                        </div>
                </div>
            </c:forEach>
        </div>
    </div>
</body>
</html>