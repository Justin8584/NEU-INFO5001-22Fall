/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import CourseSchedule.CourseLoad;
import CourseSchedule.SeatAssignment;
import Persona.EmploymentHistory.EmploymentHistory;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class StudentProfile {

    Person person;
    Transcript transcript;
    EmploymentHistory employmenthistory;

    public StudentProfile(Person p) {

        person = p;
        transcript = new Transcript(this);
        employmenthistory = new EmploymentHistory();
    }

    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public CourseLoad getCourseLoadBySemester(String semester) {

        return transcript.getCourseLoadBySemester(semester);
    }

    public CourseLoad getCurrentCourseLoad() {

        return transcript.getCurrentCourseLoad();
    }

    public CourseLoad newCourseLoad(String s) {

        return transcript.newCourseLoad(s);
    }

    public ArrayList<SeatAssignment> getCourseList() {

        return transcript.getCourseList();

    }
}
