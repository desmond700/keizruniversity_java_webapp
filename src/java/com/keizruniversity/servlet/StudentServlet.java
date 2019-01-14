package com.keizruniversity.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keizruniversity.beans.Student;
import com.keizruniversity.utils.*;
/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/students/details")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		int id = Integer.parseInt(request.getParameter("id"));
		Connection conn = MyUtils.getStoredConnection(request);
		Student student = null;
		String errormsg = null;
		
		try {
			student = DBUtils.findStudent(conn, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			errormsg = e.getMessage();
		}
		
		request.setAttribute("errormsg", errormsg);
		request.setAttribute("studentInfo", student);
		
		
	   // Forward to /WEB-INF/views/homeView.jsp
            // (Users can not access directly into JSP pages placed in WEB-INF)
            RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/studentView.jsp");

            dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
