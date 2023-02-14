package model;

public class Course {
    private String courseTitle;
    private String courseNum;
    private String courseName;
    private int courseSection;
    private int credithours;
    private String instructor;
    private String deliverMethod;
    private Department department;
    // private ArrayList<Department> departmentList = new ArrayList<>();

    public String getCourseInfo() {
        String a = "\n" + courseTitle + " " + courseNum + " Section " + courseSection + " " + courseName + ".";
        String b = "\nThis " + credithours + " credits course will hold by " + instructor + " " + deliverMethod + ".\n";
        return a.concat(b);
    }

    public Course(String courseTitle, String courseNum, String courseName, int courseSection, int credithours,
            String instructor, String deliverMethod, Department department) {
        this.courseTitle = courseTitle;
        this.courseNum = courseNum;
        this.courseName = courseName;
        this.courseSection = courseSection;
        this.credithours = credithours;
        this.instructor = instructor;
        this.deliverMethod = deliverMethod;
        this.department = department;
    }

    public String getCourseTitle() {
        return courseTitle;
    }
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName (String CourseName) {
        this.courseName = CourseName;
    }
    public String getCourseNum() {
        return courseNum;
    }
    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
    }
    public int getCourseSection() {
        return courseSection;
    }
    public void setCourseSection(int courseSection) {
        this.courseSection = courseSection;
    }
    public int getCreditHours() {
        return credithours;
    }
    public void setCreditHours(int credithours) {
        this.credithours = credithours;
    }
    public String getInstructor() {
        return instructor;
    }
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    public String getDeliverMethod() {
        return deliverMethod;
    }
    public void setDeliverMethod(String deliverMethod) {
        this.deliverMethod = deliverMethod;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

}