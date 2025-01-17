/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseSchedule;

import CourseCatalog.Course;
import Persona.Faculty.FacultyAssignment;
import Persona.Faculty.FacultyProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseOffer {

    Course course;
    ArrayList<Seat> seatlist;
    FacultyAssignment facultyassignment;

    public CourseOffer(Course c) {
        course = c;
        seatlist = new ArrayList<Seat>();
    }

    public void AssignAsTeacher(FacultyProfile fp) {

        facultyassignment = new FacultyAssignment(fp, this);
    }

    public FacultyProfile getFacultyProfile() {
        return facultyassignment.getFacultyProfile();
    }

    public String getCourseName() {
        return course.getCourseName();
    }

    public String getCourseNumber() {
        return course.getCourseNumber();
    }

    public void generatSeats(int n) {
        for (int i = 0; i < n; i++) {
            seatlist.add(new Seat(this, i));
        }
    }

    public Seat getEmptySeat() {

        for (Seat s : seatlist) {

            if (!s.isOccupied()) {
                return s;
            }
        }
        return null;
    }

    public int getEmptySeatCount() {
        int seatCounter = 0;
        for (Seat s : seatlist) {
            if (s.isOccupied()) {seatCounter++;}
        }
        return seatlist.size() - seatCounter;
    }

    public SeatAssignment assignEmptySeat(CourseLoad cl) {

        Seat seat = getEmptySeat();
        if (seat == null) {
            return null;
        }
        SeatAssignment sa = seat.newSeatAssignment(cl); // seat is already linked to course offer
        cl.registerStudent(sa); // coures offer seat is now linked to student
        return sa;
    }

    public int getTotalCourseRevenues() {

        int sum = 0;

        for (Seat s : seatlist) {
            if (s.isOccupied() == true) {
                sum = sum + course.getCoursePrice() ;
            }

        }
        return sum;
        // * (seatlist.size()- getEmptySeatCount())
    }

    public Course getSubjectCourse() {
        return course;
    }

    public int getCreditHours() {
        return course.getCredits();
    }

    public void printCourseInfo() {
        System.out.println("\n-----> The " + getCreditHours() + " credits course is " + getCourseNumber() + " - " + getCourseName()
                                    + " is taught by " + facultyassignment.getTeacherName() + " \n------>  and has " + seatlist.size() + " total seats and currently still " + getEmptySeatCount() + " seats available. ");
    }

}
