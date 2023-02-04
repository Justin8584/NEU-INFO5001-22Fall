package model;

import java.util.ArrayList;
public class Department {
    private String departmentName;
    private String major;
    private String departDean;
    private int studentNum;
    private ArrayList<Course> courseList;
    // private ArrayList<Course> courseList = new ArrayList<>();

    public Department(String departmentName, String major, String departDean, int studentNum) {
        this.departmentName = departmentName;
        this.major = major;
        this.departDean = departDean;
        this.studentNum = studentNum;
        courseList = new ArrayList<>();
    }
    
    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
    
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String getDepartDean() {
        return departDean;
    }
    public void setDepartDean(String departDean) {
        this.departDean = departDean;
    }
    public int getStudentNum() {
        return studentNum;
    }
    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

}