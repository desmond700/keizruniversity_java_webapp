<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:useBean  id="hallid" class="com.keizruniversity.beans.Student" scope="request" />

<% com.keizruniversity.beans.HallOfResidence hall = (com.keizruniversity.beans.HallOfResidence) request.getAttribute("hallInfo"); %>

<% String name = "Halls - " + hall.getHallName();  %>

<jsp:include page="_head.jsp">
<jsp:param name="pageTitle" value="<%= name %>" />
</jsp:include>

<body>
	<jsp:include page="_header.jsp"></jsp:include>
        <nav aria-label="breadcrumb">
            <ol class="breadcrumb">
              <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/halls">Halls</a></li>
              <li class="breadcrumb-item active" aria-current="page">${hallInfo.getHallName()}</li>
            </ol>
        </nav>
	<div class="container-fluid py-4">
		<p>${errormsg}</p>
		<div class="row">
                    <div class="col-md-4">
                            <img class="img-fluid" src="/images/HallOfResidence/${hallInfo.getImg()}" alt="Hall picture" />
                    </div>
                    <div class="col-md-8">
                    <p><b>Name:</b> ${hallInfo.getHallName()}</p>
                    <p><b>Hall manager:</b> ${hallInfo.getHallManager()}</p>
                    <p><b>Telephone#:</b> ${hallInfo.getPhoneNum()}</p>
                    <p><b>Monthly rate:</b> ${hallInfo.getMntlyRate()}</p>
                    <div class="d-flex flex-row">
                        <b class="mr-2" >Address:</b>
                        <div>
                                <span>${hallInfo.getStrAddr()}</span><br>
                                <span>${hallInfo.getCity()}, ${hallInfo.getProvince()}, ${hallInfo.getZipCode()}</span><br>
                        </div>
                    </div>
                    </div>
		</div>
                <hr>
                <div class="row">
                    <div class="col-md-12">
                        <div class="border d-flex">
                            <p class="pl-2 py-2 my-auto">Staffs</p>
                        </div>
                        <div class="container-fluid">
                            <div class="row">
                                <c:forEach items="${hallInfo.getStaff()}" var="staff" >
                                    <div class="card mr-2 mb-3">
                                        <img class="mx-auto" src="/images/AccommodationStaff/${staff.getImg()}" width="170" height="220" alt="staff picture" />
                                        <div class="card-body">
                                                <h5 class="card-title">${staff.getStaff_FirstName()} ${staff.getStaff_LastName()}</h5>
                                        <p>
                                            ${staff.getSex()}<br>
                                            ${staff.getPosition()}
                                        </p>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                </div>
	</div>
</body>
</html>