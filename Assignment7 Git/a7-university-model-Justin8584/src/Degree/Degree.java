/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Degree;

import CourseCatalog.Course;
import CourseSchedule.SeatAssignment;
import Persona.StudentProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Degree {

    String title;
    ArrayList<Course> corelist;
    ArrayList<Course> electives;

    public Degree(String name) {
        title = name;
        corelist = new ArrayList<Course>();
        electives = new ArrayList<Course>();
    }

    public void addCoreCourse(Course c) {
        corelist.add(c);

    }

    public void addElectiveCourse(Course c) {
        electives.add(c);

    }

    public boolean isStudentReadyToGraduate(StudentProfile sp) {

        //Extract transcript from studentprofile
        //Extract the list of courses taken so far from the student transcript
        //For each core course in the core list of the degree do the following:
        //Check if the core class at hand is in the transcrip
        //Repeat this check for the electives as well
        ArrayList<SeatAssignment> sas = sp.getCourseList(); //seatAssignments extracted from course loads

        if (validateCoreClasses(sas) == false) {
            return false;
        }//core classes satisfied

        //Do the electives check in case some taken classes are not part of the electives
      
        //Check for the total number of credit hours that it is above 32

        else return true; //student has at least 32 credit hours per NEU requirements

    }

    public boolean validateCoreClasses(ArrayList<SeatAssignment> sas) {

        //For each core course in the core list of the degree do the following:
        //Check if the core class at hand is in the transcrip
        //Repeat this check for the electives as well
        for (Course c : corelist) {
            if (!isCoreSatisfied(sas, c)) { //if selected core class not on the trascript return false
                return false;
            }
        }
        return true; //all core classes are on the transcript satifying core reqs

    }

    public boolean isCoreSatisfied(ArrayList<SeatAssignment> sas, Course c) {
        for (SeatAssignment sa : sas) {
            if (sa.getAssociatedCourse().equals(c)) {
                return true;
            }
        }
        return false;

    }

    public int getTotalElectiveCoursesTaken(ArrayList<SeatAssignment> sas) {
        int electivecount = 0;
        for (SeatAssignment sa : sas) {
            if (isElectiveSatisfied(sa)) {
                electivecount = electivecount + 1;
            }
        }
        return electivecount;

    }

    public boolean isElectiveSatisfied(SeatAssignment sa) {
        for (Course c : electives) {
            if (sa.getAssociatedCourse().equals(c)) {
                return true;
            }
        }
        return false;

    }

}
