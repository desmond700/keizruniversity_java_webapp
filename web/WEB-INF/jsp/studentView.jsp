<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean  id="student" class="com.keizruniversity.beans.Student" scope="request" />

<% com.keizruniversity.beans.Student s = (com.keizruniversity.beans.Student) request.getAttribute("studentInfo"); %>

<% String name = "Students - " + s.getFname() + " " + s.getLname();  %>

<jsp:include page="_head.jsp">
<jsp:param name="pageTitle" value="<%= name %>" />
</jsp:include>

<body>
	<jsp:include page="_header.jsp"></jsp:include>
        
	<div class="container-fluid py-4">
            <nav aria-label="breadcrumb mb-5">
                <ol class="breadcrumb">
                  <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/students">Students</a></li>
                  <li class="breadcrumb-item active" aria-current="page">${studentInfo.getFname()} ${studentInfo.getLname()}</li>
                </ol>
            </nav>
		<p>${errormsg}</p>
		<div class="row">
			<div class="col-md-4">
				<img class="img-fluid" src="/images/Students/${studentInfo.getImg()}" alt="Student picture" />
			</div>
			<div class="col-md-8">
			<p><b>Name:</b> ${studentInfo.getFname()} ${studentInfo.getLname()}</p>
			<p><b>Gender:</b> ${studentInfo.getSex()}</p>
			<p><b>Category:</b> ${studentInfo.getCategory()}</p>
			<p><b>Current Status:</b> ${studentInfo.getCurrentStatus()}</p>
			<div class="d-flex flex-row">
				<b class="mr-2" >Address:</b>
				<div>
					<span>${studentInfo.getAddress().getStreetAddr()}</span><br>
					<span>${studentInfo.getAddress().getCity()}, ${studentInfo.getAddress().getProvince()}, ${studentInfo.getAddress().getZipCode()}</span><br>
					<span>${studentInfo.getNationality()}</span>
				</div>
			</div>
			</div>
		</div>
                <hr>
                <div class="row">
                    <div class="col-md-12">
                        <div class="border d-flex">
                            <p class="pl-2 py-2 my-auto">Course</p>
                        </div>
                        <div class="ml-4 mt-2">
                            <p><b>Course number:</b> ${studentInfo.getCourse().getCourseNum()}</p>
                            <p><b>Course name:</b> ${studentInfo.getCourse().getCourse()}</p>
                            <p><b>Year:</b> ${studentInfo.getCourse().getCourseYr()}</p>
                            <p><b>Instructor:</b> ${studentInfo.getCourse().getInstructor()}</p>
                            <p><b>Room:</b> ${studentInfo.getCourse().getRoomNum()}</p>
                            <p><b>Department:</b> ${studentInfo.getCourse().getDepartName()}</p>
                        </div>
                    </div>
                </div>
	</div>
</body>
</html>