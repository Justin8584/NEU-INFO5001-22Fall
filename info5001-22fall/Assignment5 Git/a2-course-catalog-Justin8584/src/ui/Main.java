package ui;

import java.util.ArrayList;

import model.Course;
import model.CourseCatalog;
import model.Department;

public class Main {
    public static void main(String[] args) throws Exception {
        
        CourseCatalog catalog = new CourseCatalog();

        Department depart1 = new Department("Department of Computer Sciense", 
                "Computer Sciense", "Tom", 20);
        Department depart2 = new Department("Department of Mechanical and Aerospace Engineering", 
                "Mechanical Engineering", "Stephen", 30);
        Department depart3 = new Department("Department of Electrical and Computer Engineering",
                "Electrical Engineering", "Eason", 40);

        // catalog.addCourse(depart1, "CSC", "116", "Introduction to Java", 
        //                 3, 4, "John", "In-person");
        // catalog.addCourse(depart1, "CSC", "111", "Introduction to Python", 
        //                 2, 4, "Bob", "In-person");
        // catalog.addCourse(depart1, "CSC", "316", "Algo & Data Structure", 
        //                 4, 4, "Mike", "Online");
        // catalog.addCourse(depart2, "MAE", "302", "Advanced Themodynamic 2", 
        //                 10, 4, "Adrian", "In-person");
        // catalog.addCourse(depart2, "MAE", "310", "Heat Transfer", 
        //                 8, 4, "David", "Live-Streaming");
        // catalog.addCourse(depart2, "MAE", "435", "Principla of Automation Control", 
        //                 7, 4, "Chaile", "In-Class");
        // catalog.addCourse(depart3, "ECE", "304", "Introduction to Nano Science and Technology",
        //                 9, 4, "Alex", "In-Class");
        // catalog.addCourse(depart3, "ECE", "306", "Introduction to Embedded Systems",
        //                 5, 4, "Harry", "In-Class");
        // catalog.addCourse(depart3, "ECE", "310", "Design of Complex Digital Systems",
        //                 1, 4, "Mary", "Online");

        Course course1 = new Course("CSC", "116", "Introduction to Java", 
                            3, 4, "John", "In-person", depart1);
        Course course2 = new Course("CSC", "111", "Introduction to Python", 
                            2, 4, "Bob", "In-person", depart1);
        Course course3 = new Course("CSC", "316", "Algo & Data Structure", 
                            4, 4, "Mike", "Online", depart1);
        Course course4 = new Course("MAE", "302", "Advanced Themodynamic 2", 
                            10, 4, "Adrian", "In-person", depart2);
        Course course5 = new Course("MAE", "310", "Heat Transfer", 
                            8, 4, "David", "Live-Streaming", depart2);
        Course course6 = new Course("MAE", "435", "Principla of Automation Control", 
                            7, 4, "Chaile", "In-Class", depart2);
        Course course7 = new Course("ECE", "304", "Introduction to Nano Science and Technology", 
                            9, 4, "Alex", "In-Class", depart3);
        Course course8 = new Course("ECE", "306", "Introduction to Embedded Systems", 
                            5, 4, "Harry", "In-Class", depart3);
        Course course9 = new Course("ECE", "310", "Design of Complex Digital Systems", 
                            1, 4, "Mary", "Online", depart3);

        // add department to catalog list
        catalog.addDepartment(depart1);
        catalog.addDepartment(depart2);
        catalog.addDepartment(depart3);

        // add course to department
        depart1.getCourseList().add(course1);
        depart1.getCourseList().add(course2);
        depart1.getCourseList().add(course3);
        depart2.getCourseList().add(course4);
        depart2.getCourseList().add(course5);
        depart2.getCourseList().add(course6);
        depart3.getCourseList().add(course7);
        depart3.getCourseList().add(course8);
        depart3.getCourseList().add(course9);

        // add course to catalog list
        catalog.addCourse(course1);
        catalog.addCourse(course2);
        catalog.addCourse(course3);
        catalog.addCourse(course4);
        catalog.addCourse(course5);
        catalog.addCourse(course6);
        catalog.addCourse(course7);
        catalog.addCourse(course8);
        catalog.addCourse(course9);

        Course searchCourse1 = catalog.findCourseByTitle("CSC");
        if (searchCourse1 != null) {
            System.out.println(searchCourse1.getCourseInfo());
        } else {
            System.out.println("Sorry, can't find this course.");
        }

        Course searchCourse2 = catalog.findCourseByInstructor("Chaile");
        if (searchCourse2 != null) {
            System.out.println(searchCourse2.getCourseInfo());
        } else {
            System.out.println("Sorry, can't find this course.");
        }

        Course searchCourse3 = catalog.findCourseByCourseNum("208");
        if (searchCourse3 != null) {
            System.out.println(searchCourse3.getCourseInfo());
        } else {
            System.out.println("Sorry, can't find this course.");
        }
        
        Course searchCourse4 = catalog.findCourse("CSC","111");
        if (searchCourse4 != null) {
            System.out.println(searchCourse4.getCourseInfo());
        } else {
            System.out.println("Sorry, can't find this course.");
        }

        ArrayList<Course> searchAllCourse = catalog.searchByDepartemnt("Department of Electrical and Computer Engineering");
        if (searchAllCourse != null) {
            for (Course course:searchAllCourse) {
                System.out.println(course.getCourseInfo());
            }
        } else {
            System.out.println("Sorry, can't find this course.");
        }

        // delete course record
        System.out.println("Current numbers of courses in catalog: " + catalog.countCourses()); 
        catalog.deleteCourseRecord("CSC", "111", 2);
        System.out.println("Current numbers of courses in catalog: " + catalog.countCourses());
    }
}
