package com.keizruniversity.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.keizruniversity.beans.*;

public class DBUtils {
	
    public static Student findStudent(Connection conn, int student_id) throws SQLException {

            String sql = "SELECT a.student_id, a.First_Name, a.Last_Name, a.Date_Of_Birth, a.Sex, a.Category, a.Nationality, a.Current_Status, a.picture FROM Students a "
                + "INNER JOIN StudentsFlat s ON a.student_id = s.student_id "           
                + "WHERE a.student_id = ?";

        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, student_id);
        ResultSet rs = pstm.executeQuery();

        if (rs.next()) {
                int studentID = rs.getInt("student_id");
            String fname = rs.getString("First_Name");
            String lname = rs.getString("Last_Name");
            String doB = rs.getString("Date_Of_Birth");
            String sex = rs.getString("Sex");
            String category = rs.getString("Category");
            String nationality = rs.getString("Nationality");
            String currentStatus = rs.getString("Current_Status");
            String picture = rs.getString("picture");
            Student student = new Student();
            student.setStudentID(studentID);
            student.setFname(fname);
            student.setLname(lname);
            student.setAddress(findAddress(conn, studentID));
            student.setDoB(doB);
            student.setSex(sex);
            student.setCategory(category);
            student.setNationality(nationality);
            student.setCurrentStatus(currentStatus);
            student.setCourse(findCourse(conn, studentID));
            student.setAdvisor(findAdvisor(conn, studentID));
            student.setImg(picture);
            return student;
        }
        return null;
    }

    public static List<Student> listStudent(Connection conn) throws SQLException {

        String sql = "SELECT a.student_id, a.First_Name, a.Last_Name, a.Date_Of_Birth, a.Sex, a.Category, a.Nationality, a.Current_Status, a.picture FROM Students a ";

        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();

        List<Student> list = new ArrayList<Student>();
        while (rs.next()) {
                int studentID = rs.getInt("student_id");
            String fname = rs.getString("First_Name");
            String lname = rs.getString("Last_Name");
            String doB = rs.getString("Date_Of_Birth");
            String sex = rs.getString("Sex");
            String category = rs.getString("Category");
            String nationality = rs.getString("Nationality");
            String currentStatus = rs.getString("Current_Status");
            String picture = rs.getString("picture");
            Student student = new Student();
            student.setStudentID(studentID);
            student.setFname(fname);
            student.setLname(lname);
            student.setAddress(findAddress(conn, studentID));
            student.setDoB(doB);
            student.setSex(sex);
            student.setCategory(category);
            student.setNationality(nationality);
            student.setCurrentStatus(currentStatus);
            student.setCourse(findCourse(conn, studentID));
            student.setAdvisor(findAdvisor(conn, studentID));
            student.setImg(picture);

            list.add(student);
        }
        return list;

    }

    public static Address findAddress(Connection conn, int student_id) throws SQLException {

        String sql = "SELECT a.Street_Address, a.City, a.Province, a.Zip_Code FROM Students a "
                                + " WHERE a.student_id = ?";


        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, student_id);
        ResultSet rs = pstm.executeQuery();

        if (rs.next()) {

                String streetAddr = rs.getString("Street_Address");
            String city = rs.getString("City");
            String province = rs.getString("Province");
            String zipCode =  rs.getString("Zip_Code");
            Address address = new Address();
            address.setStreetAddr(streetAddr);
            address.setCity(city);
            address.setProvince(province);
            address.setZipCode(zipCode);

            return address;
        }
        return null;
    }

    public static Course findCourse(Connection conn, int student_id) throws SQLException {

            String sql = "SELECT c.Course_Number, c.Course, c.Course_Year, c.Instructor, c.Room_Number, c.Department_Name FROM Students s"
                            + " INNER JOIN Courses c ON s.Course_Number = c.Course_Number"
                            + " WHERE s.student_id = ?";


        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, student_id);
        ResultSet rs = pstm.executeQuery();

        if (rs.next()) {
            String courseNum = rs.getString("Course_Number");
        String course = rs.getString("Course");
        String courseYr = rs.getString("Course_Year");
        String instructor =  rs.getString("Instructor");
        String roomNum =  rs.getString("Room_Number");
        String departName =  rs.getString("Department_Name");
            Course course1 = new Course();
            course1.setCourseNum(courseNum);
            course1.setCourse(course);
            course1.setCourseYr(courseYr);
            course1.setInstructor(instructor);
            course1.setRoomNum(roomNum);
            course1.setDepartName(departName);

            return course1;
        }
        return null;
    }

    public static Advisor findAdvisor(Connection conn, int student_id) throws SQLException {

        String sql = "SELECT a.First_Name, a.Last_Name, a.Position, a.Department_Name, a.Phone_Number, a.picture FROM Students s "
                            + " INNER JOIN Advisors a ON s.Advisor_id = a.Advisor_id"
                            + " WHERE s.student_id = ?";


        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, student_id);
        ResultSet rs = pstm.executeQuery();

        if (rs.next()) {
                String fname = rs.getString("First_Name");
            String lname = rs.getString("Last_Name");
            String position = rs.getString("Position");
            String departName =  rs.getString("Department_Name");
            String phoneNum =  rs.getString("Phone_Number");
            String img =  rs.getString("picture");
            Advisor advisor = new Advisor();
            advisor.setFname(fname);
            advisor.setLname(lname);
            advisor.setPosition(position);
            advisor.setDepartName(departName);
            advisor.setPhoneNum(phoneNum);
            advisor.setImg(img);
            return advisor;
        }
        return null;
    }
    
    public static List<HallOfResidence> listHalls (Connection conn) throws SQLException {
		
        String sql = "SELECT * FROM HallOfResidence";
		 
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        
        List<HallOfResidence> list = new ArrayList<HallOfResidence>();
        while(rs.next()) {
            int hallID = rs.getInt("Hall_id");
            String hallName = rs.getString("Hall_Name");
            String strAddr = rs.getString("Street_Address");
            String city = rs.getString("City");
            String province = rs.getString("Province");
            String zipCode = rs.getString("Zipcode");
            String phoneNum = rs.getString("Telephone_Number");
            String hallManager = rs.getString("Hall_Manager");
            String roomNum = rs.getString("Room_Number");
            String placeNum = rs.getString("Place_Number");
            String mntlyRate = rs.getString("Monthly_Rate");
            String img = rs.getString("picture");
            HallOfResidence hall = new HallOfResidence();
            hall.setHallID(hallID);
            hall.setHallName(hallName);
            hall.setStrAddr(strAddr);
            hall.setCity(city);
            hall.setProvince(province);
            hall.setZipCode(zipCode);
            hall.setPhoneNum(phoneNum);
            hall.setHallManager(hallManager);
            hall.setRoomNum(roomNum);
            hall.setPlaceNum(placeNum);
            hall.setMntlyRate(mntlyRate);
            hall.setImg(img);
            list.add(hall);
        }
        return list;
    }
    
    public static HallOfResidence findHall(Connection conn, int hall_id) throws SQLException {

        String sql = "SELECT * FROM HallOfResidence "
                            + "WHERE hall_id = ?";

        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, hall_id);
        ResultSet rs = pstm.executeQuery();

        if (rs.next()) {
            int hallID = rs.getInt("Hall_id");
            String hallName = rs.getString("Hall_Name");
            String strAddr = rs.getString("Street_Address");
            String city = rs.getString("City");
            String province = rs.getString("Province");
            String zipCode = rs.getString("Zipcode");
            String phoneNum = rs.getString("Telephone_Number");
            String hallManager = rs.getString("Hall_Manager");
            String roomNum = rs.getString("Room_Number");
            String placeNum = rs.getString("Place_Number");
            String mntlyRate = rs.getString("Monthly_Rate");
            String img = rs.getString("picture");
            HallOfResidence hall = new HallOfResidence();
            hall.setHallID(hallID);
            hall.setHallName(hallName);
            hall.setStrAddr(strAddr);
            hall.setCity(city);
            hall.setProvince(province);
            hall.setZipCode(zipCode);
            hall.setPhoneNum(phoneNum);
            hall.setStaff(listStaffs(conn, hall_id));
            hall.setHallManager(hallManager);
            hall.setRoomNum(roomNum);
            hall.setPlaceNum(placeNum);
            hall.setMntlyRate(mntlyRate);
            hall.setImg(img);
            return hall;
        }
        return null;
    }
    
    public static List<AccomodationStaff> listStaffs(Connection conn, int hall_id) throws SQLException {

        String sql = "SELECT a.Staff_FirstName, a.Staff_LastName, a.Street_Address, a.City, a.Province, a.Zipcode, a.Date_Of_Birth, a.Sex, a.Position, a.picture "
                + " FROM HallOfResidence h "
                + " INNER JOIN AccommodationStaff a ON h.Hall_id = a.Hall_id "
                + " WHERE h.Hall_id = ?";


        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, hall_id);
        ResultSet rs = pstm.executeQuery();

        List<AccomodationStaff> list = new ArrayList<AccomodationStaff>();
        while (rs.next()) {

            String fname = rs.getString("Staff_FirstName");
            String lname = rs.getString("Staff_LastName");
            String strAddr = rs.getString("Street_Address");
            String city =  rs.getString("City");
            String province =  rs.getString("Province");
            String zipCode =  rs.getString("Zipcode");
            String doB =  rs.getString("Date_Of_Birth");
            String sex =  rs.getString("Sex");
            String postion =  rs.getString("Position");
            String img =  rs.getString("picture");
            AccomodationStaff staff = new AccomodationStaff();
            staff.setStaff_FirstName(fname);
            staff.setStaff_LastName(lname);
            staff.setStreet_Address(strAddr);
            staff.setCity(city);
            staff.setProvince(province);
            staff.setZipCode(zipCode);
            staff.setDate_Of_Birth(doB);
            staff.setSex(sex);
            staff.setPosition(postion);
            staff.setImg(img);

            list.add(staff);
        }
        return list;
    }
}

