package model;

import java.util.ArrayList;

public class CourseCatalog {
    ArrayList<Course> courselist;
    ArrayList<Department> departmentlist;

    public CourseCatalog(){
        courselist = new ArrayList<Course>();
        departmentlist = new ArrayList<Department>();
    }

    // public Course addCourse(Department department, String title, String courseNum, String courseName, 
    //                         int sectionNum, int credithours, String instructor, String deliverMethod) {
        
    //     Course newCourse = new Course();

    //     newCourse.setDepartment(department);
    //     newCourse.setCourseTitle(title);
    //     newCourse.setCourseName(courseName);
    //     newCourse.setCourseNum(courseNum);
    //     newCourse.setCourseSection(sectionNum);
    //     newCourse.setCreditHours(credithours);
    //     newCourse.setInstructor(instructor);
    //     newCourse.setDeliverMethod(deliverMethod);
        
    //     courselist.add(newCourse);
    //     department.getCourseList().add(newCourse);
    //     return newCourse;
    // }

    public void addCourse(Course course) {

        courselist.add(course);
    }

    public void addDepartment(Department department) {
        
        departmentlist.add(department);
    }

    public Course findCourse(String title, String courseNum) {
        for (Course c : courselist) {
            if ((c.getCourseTitle().equals(title)) && (c.getCourseNum().equals(courseNum))) {
                return c;
            }
        }
        return null;
    }

    public Course findCourseByTitle(String title) {
        for (Course c : courselist) {
            if (c.getCourseTitle().equals(title)) {
                return c;
            }
        }
        return null;
    }

    public Course findCourseByCourseNum(String courseNum) {
        for (Course c : courselist) {
            if (c.getCourseNum().equals(courseNum)) {
                return c;
            }
        }
        return null;
    }

    public Course findCourseByInstructor(String instructor) {
        for (Course c : courselist) {
            if (c.getInstructor().equals(instructor)) {
                return c;
            }
        }
        return null;
    }

    // add index, delete course by index in arraylist, for each loop cannot modify the arraylist
    public void deleteCourseRecord(String title, String courseNum, int sectionNum) {
        int index = -1;
        for (Course c : courselist) {
            if ((c.getCourseTitle().equals(title)) && (c.getCourseNum().equals(courseNum)) && (c.getCourseSection() == sectionNum)) {
                index = courselist.indexOf(c);
            }
        }
        if (index != -1) {
            courselist.remove(index);
        }
    }

    public int countCourses() {
        return courselist.size();
    }
    
    public ArrayList<Course> searchByDepartemnt(String department) {
        for (Department d : departmentlist) {
            if (d.getDepartmentName().equals(department) ) {
                return d.getCourseList();
            }
        }
        return null;
    }
}
