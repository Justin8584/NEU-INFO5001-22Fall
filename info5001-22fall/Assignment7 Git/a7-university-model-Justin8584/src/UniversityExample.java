/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.CollationElementIterator;

import College.College;
import CourseCatalog.Course;
import CourseCatalog.CourseCatalog;
import CourseSchedule.CourseLoad;
import CourseSchedule.CourseOffer;
import CourseSchedule.CourseSchedule;
import CourseSchedule.SeatAssignment;
import Department.Department;
import Persona.Person;
import Persona.PersonDirectory;
import Persona.StudentDirectory;
import Persona.StudentProfile;
import Persona.Faculty.FacultyDirectory;
import Persona.Faculty.FacultyProfile;

/**
 *
 * @author kal bugrara
 */
public class UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * college of engineering in NEU
         */
        College neuCOE = new College("Northeastern University - College of Engineering");

        /**
         * department1 informaiton system
         */ 
        Department msis = neuCOE.newDepartment("Information Systems");
        CourseCatalog msisCoursecatalog = msis.getCourseCatalog();
        PersonDirectory msisPersonDirectory = msis.getPersonDirectory();
        FacultyDirectory msisFacultyDirectory = msis.getFacultyDirectory();
        StudentDirectory msisStudentDirectory = msis.getStudentDirectory();
        CourseSchedule msisScheduleFall2022 = msis.newCourseSchedule("Fall2022");

        Course info5001 = msisCoursecatalog.newCourse("App Design & Modeling", "INFO5001", 4);
        Course info5002 = msisCoursecatalog.newCourse("Introduction to Python", "INFO5002", 4);
        Course info6150 = msisCoursecatalog.newCourse("Web Design and User Experience Engineering", "INFO6150", 4);

        // department1 faculty profile
        Person danerys = msisPersonDirectory.newPerson("Danerys","A1");
        FacultyProfile danerysTAProfile = msisFacultyDirectory.newFacultyProfile(danerys);
        
        Person tyrion = msisPersonDirectory.newPerson("Tyrion","A2");
        FacultyProfile tyrionTAProfile = msisFacultyDirectory.newFacultyProfile(tyrion);

        Person john = msisPersonDirectory.newPerson("John","A3");
        FacultyProfile johnTAProfile = msisFacultyDirectory.newFacultyProfile(john);
        
        // department1 student profile
        Person theon = msisPersonDirectory.newPerson("Theon","A11");
        StudentProfile theonProfile = msisStudentDirectory.newStudentProfile(theon);

        Person varys = msisPersonDirectory.newPerson("Varys","A12");
        StudentProfile varysProfile = msisStudentDirectory.newStudentProfile(varys);

        Person baelish = msisPersonDirectory.newPerson("Baelish","A13");
        StudentProfile baelishProfile = msisStudentDirectory.newStudentProfile(baelish);

        Person bran = msisPersonDirectory.newPerson("Bran","A14");
        StudentProfile branProfile = msisStudentDirectory.newStudentProfile(bran);

        Person brienne = msisPersonDirectory.newPerson("Brienne","A15");
        StudentProfile brienneProfile = msisStudentDirectory.newStudentProfile(brienne);

        Person margaery = msisPersonDirectory.newPerson("Margaery","A16");
        StudentProfile margaeryProfile = msisStudentDirectory.newStudentProfile(margaery);

        Person catelyn = msisPersonDirectory.newPerson("Catelyn","A17");
        StudentProfile catelynProfile = msisStudentDirectory.newStudentProfile(catelyn);

        Person stannis = msisPersonDirectory.newPerson("Stannis","A18");
        StudentProfile stannisProfile = msisStudentDirectory.newStudentProfile(stannis);

        Person tommen = msisPersonDirectory.newPerson("Tommen","A19");
        StudentProfile tommenProfile = msisStudentDirectory.newStudentProfile(tommen);

        Person ramsay = msisPersonDirectory.newPerson("Ramsay","A20");
        StudentProfile ramsayProfile = msisStudentDirectory.newStudentProfile(ramsay);


        CourseOffer courseOfferInfo5001Fall2022 = msisScheduleFall2022.newCourseOffer("INFO5001");
        courseOfferInfo5001Fall2022.AssignAsTeacher(danerysTAProfile);
        courseOfferInfo5001Fall2022.generatSeats(12);

        CourseOffer courseOfferInfo5002Fall2022 = msisScheduleFall2022.newCourseOffer("INFO5002");
        courseOfferInfo5002Fall2022.AssignAsTeacher(tyrionTAProfile);
        courseOfferInfo5002Fall2022.generatSeats(13);

        CourseOffer courseOfferInfo6150Fall2022 = msisScheduleFall2022.newCourseOffer("INFO6150");
        courseOfferInfo6150Fall2022.AssignAsTeacher(johnTAProfile);
        courseOfferInfo6150Fall2022.generatSeats(15);
        
        CourseLoad theonFa22 = theonProfile.newCourseLoad("Fall2022");
        theonFa22.newSeatAssignment(courseOfferInfo5001Fall2022);
        theonFa22.newSeatAssignment(courseOfferInfo5002Fall2022);
        theonFa22.newSeatAssignment(courseOfferInfo6150Fall2022);

        CourseLoad varysFa22 = varysProfile.newCourseLoad("Fall2022");
        varysFa22.newSeatAssignment(courseOfferInfo5001Fall2022);
        varysFa22.newSeatAssignment(courseOfferInfo5002Fall2022);
        varysFa22.newSeatAssignment(courseOfferInfo6150Fall2022);

        CourseLoad baelishFa22 = baelishProfile.newCourseLoad("Fall2022");
        baelishFa22.newSeatAssignment(courseOfferInfo5001Fall2022);
        baelishFa22.newSeatAssignment(courseOfferInfo5002Fall2022);
        baelishFa22.newSeatAssignment(courseOfferInfo6150Fall2022);

        CourseLoad branFa22 = branProfile.newCourseLoad("Fall2022");
        branFa22.newSeatAssignment(courseOfferInfo5001Fall2022);
        branFa22.newSeatAssignment(courseOfferInfo5002Fall2022);
        branFa22.newSeatAssignment(courseOfferInfo6150Fall2022);

        CourseLoad brienneFa22 = brienneProfile.newCourseLoad("Fall2022");
        brienneFa22.newSeatAssignment(courseOfferInfo5001Fall2022);
        brienneFa22.newSeatAssignment(courseOfferInfo5002Fall2022);
        brienneFa22.newSeatAssignment(courseOfferInfo6150Fall2022);

        CourseLoad margaeryFa22 = margaeryProfile.newCourseLoad("Fall2022");
        margaeryFa22.newSeatAssignment(courseOfferInfo5001Fall2022);
        margaeryFa22.newSeatAssignment(courseOfferInfo5002Fall2022);
        margaeryFa22.newSeatAssignment(courseOfferInfo6150Fall2022);

        CourseLoad catelynFa22 = catelynProfile.newCourseLoad("Fall2022");
        catelynFa22.newSeatAssignment(courseOfferInfo5001Fall2022);
        catelynFa22.newSeatAssignment(courseOfferInfo5002Fall2022);
        catelynFa22.newSeatAssignment(courseOfferInfo6150Fall2022);

        CourseLoad stannisFa22 = stannisProfile.newCourseLoad("Fall2022");
        stannisFa22.newSeatAssignment(courseOfferInfo5001Fall2022);
        stannisFa22.newSeatAssignment(courseOfferInfo5002Fall2022);
        stannisFa22.newSeatAssignment(courseOfferInfo6150Fall2022);

        CourseLoad tommenFa22 = tommenProfile.newCourseLoad("Fall2022");
        tommenFa22.newSeatAssignment(courseOfferInfo5001Fall2022);
        tommenFa22.newSeatAssignment(courseOfferInfo5002Fall2022);
        tommenFa22.newSeatAssignment(courseOfferInfo6150Fall2022);

        CourseLoad ramsayFa22 = ramsayProfile.newCourseLoad("Fall2022");
        ramsayFa22.newSeatAssignment(courseOfferInfo5001Fall2022);
        ramsayFa22.newSeatAssignment(courseOfferInfo5002Fall2022);
        ramsayFa22.newSeatAssignment(courseOfferInfo6150Fall2022);

        
        
        /**
         * department2 Data Architecture and Management
         */
        Department msdam = neuCOE.newDepartment("Data Architecture and Management");
        CourseCatalog msdamCoursecatalog = msdam.getCourseCatalog();
        PersonDirectory msdamPersonDirectory = msdam.getPersonDirectory();
        FacultyDirectory msdamFacultyDirectory = msdam.getFacultyDirectory();
        StudentDirectory msdamStudentDirectory = msdam.getStudentDirectory();
        CourseSchedule msdamScheduleFall2022 = msdam.newCourseSchedule("Fall2022");

        Course dame6105 = msdamCoursecatalog.newCourse("Data Science Engineering with Python", "DAME6105", 4);
        Course dame7250 = msdamCoursecatalog.newCourse("Big Data Architecture and Governance", "DAME7250", 4);
        Course dame7370 = msdamCoursecatalog.newCourse("Designing Advanced Data Architectures for Business Intelligence", "DAME7370", 4);

        // department2 faculty profile
        Person cersei = msdamPersonDirectory.newPerson("Cersei","B1");
        FacultyProfile cerseiTAProfile = msdamFacultyDirectory.newFacultyProfile(cersei);

        Person sansa = msdamPersonDirectory.newPerson("Sansa","B2");
        FacultyProfile sansaTAProfile = msdamFacultyDirectory.newFacultyProfile(sansa);

        Person arya = msdamPersonDirectory.newPerson("Arya","B3");
        FacultyProfile aryaTAProfile = msdamFacultyDirectory.newFacultyProfile(arya);

        // department2 student profile
        Person loras = msdamPersonDirectory.newPerson("Loras","B11");
        StudentProfile lorasProfile = msdamStudentDirectory.newStudentProfile(loras);

        Person robb = msdamPersonDirectory.newPerson("Robb","B12");
        StudentProfile robbProfile = msdamStudentDirectory.newStudentProfile(robb);

        Person tywin = msdamPersonDirectory.newPerson("Tywin","B13");
        StudentProfile tywinProfile = msdamStudentDirectory.newStudentProfile(tywin);

        Person sandor = msdamPersonDirectory.newPerson("Sandor","B14");
        StudentProfile sandorProfile = msdamStudentDirectory.newStudentProfile(sandor);

        Person podrick = msdamPersonDirectory.newPerson("Podrick","B15");
        StudentProfile podrickProfile = msdamStudentDirectory.newStudentProfile(podrick);

        Person grey = msdamPersonDirectory.newPerson("Grey","B16");
        StudentProfile greyProfile = msdamStudentDirectory.newStudentProfile(grey);

        Person eddison = msdamPersonDirectory.newPerson("Eddison","B17");
        StudentProfile eddisonProfile = msdamStudentDirectory.newStudentProfile(eddison);

        Person joffrey = msdamPersonDirectory.newPerson("Joffrey","B18");
        StudentProfile joffreyProfile = msdamStudentDirectory.newStudentProfile(joffrey);

        Person hodor = msdamPersonDirectory.newPerson("Hodor","B19");
        StudentProfile hodorProfile = msdamStudentDirectory.newStudentProfile(hodor);

        Person roose = msdamPersonDirectory.newPerson("Roose","B20");
        StudentProfile rooseProfile = msdamStudentDirectory.newStudentProfile(roose);

        CourseOffer courseOfferDame6105Fall2022 = msdamScheduleFall2022.newCourseOffer("DAME6105");
        courseOfferDame6105Fall2022.AssignAsTeacher(cerseiTAProfile);
        courseOfferDame6105Fall2022.generatSeats(12);

        CourseOffer courseOfferDame7250Fall2022 = msdamScheduleFall2022.newCourseOffer("DAME7250");
        courseOfferDame7250Fall2022.AssignAsTeacher(sansaTAProfile);
        courseOfferDame7250Fall2022.generatSeats(13);

        CourseOffer courseOfferDame7370Fall2022 = msdamScheduleFall2022.newCourseOffer("DAME7370");
        courseOfferDame7370Fall2022.AssignAsTeacher(aryaTAProfile);
        courseOfferDame7370Fall2022.generatSeats(15);
        
        CourseLoad lorasFa22 = lorasProfile.newCourseLoad("Fall2022");
        lorasFa22.newSeatAssignment(courseOfferDame6105Fall2022);
        lorasFa22.newSeatAssignment(courseOfferDame7250Fall2022);
        lorasFa22.newSeatAssignment(courseOfferDame7370Fall2022);

        CourseLoad robbFa22 = robbProfile.newCourseLoad("Fall2022");
        robbFa22.newSeatAssignment(courseOfferDame6105Fall2022);
        robbFa22.newSeatAssignment(courseOfferDame7250Fall2022);
        robbFa22.newSeatAssignment(courseOfferDame7370Fall2022);

        CourseLoad tywinFa22 = tywinProfile.newCourseLoad("Fall2022");
        tywinFa22.newSeatAssignment(courseOfferDame6105Fall2022);
        tywinFa22.newSeatAssignment(courseOfferDame7250Fall2022);
        tywinFa22.newSeatAssignment(courseOfferDame7370Fall2022);

        CourseLoad sandorFa22 = sandorProfile.newCourseLoad("Fall2022");
        sandorFa22.newSeatAssignment(courseOfferDame6105Fall2022);
        sandorFa22.newSeatAssignment(courseOfferDame7250Fall2022);
        sandorFa22.newSeatAssignment(courseOfferDame7370Fall2022);

        CourseLoad podrickFa22 = podrickProfile.newCourseLoad("Fall2022");
        podrickFa22.newSeatAssignment(courseOfferDame6105Fall2022);
        podrickFa22.newSeatAssignment(courseOfferDame7250Fall2022);
        podrickFa22.newSeatAssignment(courseOfferDame7370Fall2022);

        CourseLoad greyFa22 = greyProfile.newCourseLoad("Fall2022");
        greyFa22.newSeatAssignment(courseOfferDame6105Fall2022);
        greyFa22.newSeatAssignment(courseOfferDame7250Fall2022);
        greyFa22.newSeatAssignment(courseOfferDame7370Fall2022);

        CourseLoad eddisonFa22 = eddisonProfile.newCourseLoad("Fall2022");
        eddisonFa22.newSeatAssignment(courseOfferDame6105Fall2022);
        eddisonFa22.newSeatAssignment(courseOfferDame7250Fall2022);
        eddisonFa22.newSeatAssignment(courseOfferDame7370Fall2022);

        CourseLoad joffreyFa22 = joffreyProfile.newCourseLoad("Fall2022");
        joffreyFa22.newSeatAssignment(courseOfferDame6105Fall2022);
        joffreyFa22.newSeatAssignment(courseOfferDame7250Fall2022);
        joffreyFa22.newSeatAssignment(courseOfferDame7370Fall2022);

        CourseLoad hodorFa22 = hodorProfile.newCourseLoad("Fall2022");
        hodorFa22.newSeatAssignment(courseOfferDame6105Fall2022);
        hodorFa22.newSeatAssignment(courseOfferDame7250Fall2022);
        hodorFa22.newSeatAssignment(courseOfferDame7370Fall2022);

        CourseLoad rooseFa22 = rooseProfile.newCourseLoad("Fall2022");
        rooseFa22.newSeatAssignment(courseOfferDame6105Fall2022);
        rooseFa22.newSeatAssignment(courseOfferDame7250Fall2022);
        rooseFa22.newSeatAssignment(courseOfferDame7370Fall2022);




        /**
         * department3 Software Engineering System
         */
        Department msses = neuCOE.newDepartment("Software Engineering System");
        CourseCatalog mssesCourseCatalog = msses.getCourseCatalog();
        PersonDirectory mssesPersonDirectory = msses.getPersonDirectory();
        FacultyDirectory mssesFacultyDirectory = msses.getFacultyDirectory();
        StudentDirectory mssesStudentDirectory = msses.getStudentDirectory();
        CourseSchedule mssesScheduleFall2022 = msses.newCourseSchedule("Fall2022");

        Course csye6200 = mssesCourseCatalog.newCourse("Concepts of Object-Oriented Design", "CSYE6200", 4);
        Course csye6220 = mssesCourseCatalog.newCourse("Enterprise Software Design", "CSYE6220", 4);
        Course csye6225 = mssesCourseCatalog.newCourse("Network Structures and Cloud Computing", "CSYE6225", 4);

        // department3 faculty profile
        Person jaime = mssesPersonDirectory.newPerson("Jaime","C1");
        FacultyProfile jaimeTAProfile = mssesFacultyDirectory.newFacultyProfile(jaime);

        Person jorah = mssesPersonDirectory.newPerson("Jorah","C2");
        FacultyProfile jorahTAProfile = mssesFacultyDirectory.newFacultyProfile(jorah);

        Person samwell = mssesPersonDirectory.newPerson("Samwell","C3");
        FacultyProfile samwellTAProfile = mssesFacultyDirectory.newFacultyProfile(samwell);

        // department3 student profile
        Person rickon = mssesPersonDirectory.newPerson("Rickon","C11");
        StudentProfile rickonProfile = mssesStudentDirectory.newStudentProfile(rickon);

        Person nightKing = mssesPersonDirectory.newPerson("NightKing","C12");
        StudentProfile nightKingProfile = mssesStudentDirectory.newStudentProfile(nightKing);

        Person walder = mssesPersonDirectory.newPerson("Walder","C13");
        StudentProfile walderProfile = mssesStudentDirectory.newStudentProfile(walder);

        Person benjen = mssesPersonDirectory.newPerson("Benjen","C14");
        StudentProfile benjenProfile = mssesStudentDirectory.newStudentProfile(benjen);

        Person lyanna = mssesPersonDirectory.newPerson("Lyanna","C15");
        StudentProfile lyannaProfile = mssesStudentDirectory.newStudentProfile(lyanna);

        Person tyene = mssesPersonDirectory.newPerson("Tyene","C16");
        StudentProfile tyeneProfile = mssesStudentDirectory.newStudentProfile(tyene);

        Person edmure = mssesPersonDirectory.newPerson("Edmure","C17");
        StudentProfile edmureProfile = mssesStudentDirectory.newStudentProfile(edmure);

        Person euron = mssesPersonDirectory.newPerson("Euron","C18");
        StudentProfile euronProfile = mssesStudentDirectory.newStudentProfile(euron);

        Person khal = mssesPersonDirectory.newPerson("Khal","C19");
        StudentProfile khalProfile = mssesStudentDirectory.newStudentProfile(khal);

        Person shireen = mssesPersonDirectory.newPerson("Shireen","C20");
        StudentProfile shireenProfile = mssesStudentDirectory.newStudentProfile(shireen);

        CourseOffer courseOfferCsye6200Fall2022 = mssesScheduleFall2022.newCourseOffer("CSYE6200");
        courseOfferCsye6200Fall2022.AssignAsTeacher(jaimeTAProfile);
        courseOfferCsye6200Fall2022.generatSeats(12);

        CourseOffer courseOfferCsye6220Fall2022 = mssesScheduleFall2022.newCourseOffer("CSYE6220");
        courseOfferCsye6220Fall2022.AssignAsTeacher(jorahTAProfile);
        courseOfferCsye6220Fall2022.generatSeats(13);

        CourseOffer courseOfferCsye6225Fall2022 = mssesScheduleFall2022.newCourseOffer("CSYE6225");
        courseOfferCsye6225Fall2022.AssignAsTeacher(samwellTAProfile);
        courseOfferCsye6225Fall2022.generatSeats(15);

        CourseLoad rickonFa22 = rickonProfile.newCourseLoad("Fall2022");
        rickonFa22.newSeatAssignment(courseOfferCsye6200Fall2022);
        rickonFa22.newSeatAssignment(courseOfferCsye6220Fall2022);
        rickonFa22.newSeatAssignment(courseOfferCsye6225Fall2022);

        CourseLoad nightKingFa22 = nightKingProfile.newCourseLoad("Fall2022");
        nightKingFa22.newSeatAssignment(courseOfferCsye6200Fall2022);
        nightKingFa22.newSeatAssignment(courseOfferCsye6220Fall2022);
        nightKingFa22.newSeatAssignment(courseOfferCsye6225Fall2022);

        CourseLoad walderFa22 = walderProfile.newCourseLoad("Fall2022");
        walderFa22.newSeatAssignment(courseOfferCsye6200Fall2022);
        walderFa22.newSeatAssignment(courseOfferCsye6220Fall2022);
        walderFa22.newSeatAssignment(courseOfferCsye6225Fall2022);

        CourseLoad benjenFa22 = benjenProfile.newCourseLoad("Fall2022");
        benjenFa22.newSeatAssignment(courseOfferCsye6200Fall2022);
        benjenFa22.newSeatAssignment(courseOfferCsye6220Fall2022);
        benjenFa22.newSeatAssignment(courseOfferCsye6225Fall2022);

        CourseLoad lyannaFa22 = lyannaProfile.newCourseLoad("Fall2022");
        lyannaFa22.newSeatAssignment(courseOfferCsye6200Fall2022);
        lyannaFa22.newSeatAssignment(courseOfferCsye6220Fall2022);
        lyannaFa22.newSeatAssignment(courseOfferCsye6225Fall2022);

        CourseLoad tyeneFa22 = tyeneProfile.newCourseLoad("Fall2022");
        tyeneFa22.newSeatAssignment(courseOfferCsye6200Fall2022);
        tyeneFa22.newSeatAssignment(courseOfferCsye6220Fall2022);
        tyeneFa22.newSeatAssignment(courseOfferCsye6225Fall2022);

        CourseLoad edmureFa22 = edmureProfile.newCourseLoad("Fall2022");
        edmureFa22.newSeatAssignment(courseOfferCsye6200Fall2022);
        edmureFa22.newSeatAssignment(courseOfferCsye6220Fall2022);
        edmureFa22.newSeatAssignment(courseOfferCsye6225Fall2022);

        CourseLoad euronFa22 = euronProfile.newCourseLoad("Fall2022");
        euronFa22.newSeatAssignment(courseOfferCsye6200Fall2022);
        euronFa22.newSeatAssignment(courseOfferCsye6220Fall2022);
        euronFa22.newSeatAssignment(courseOfferCsye6225Fall2022);

        CourseLoad khalFa22 = khalProfile.newCourseLoad("Fall2022");
        khalFa22.newSeatAssignment(courseOfferCsye6200Fall2022);
        khalFa22.newSeatAssignment(courseOfferCsye6220Fall2022);
        khalFa22.newSeatAssignment(courseOfferCsye6225Fall2022);

        CourseLoad shireenFa22 = shireenProfile.newCourseLoad("Fall2022");
        shireenFa22.newSeatAssignment(courseOfferCsye6200Fall2022);
        shireenFa22.newSeatAssignment(courseOfferCsye6220Fall2022);
        shireenFa22.newSeatAssignment(courseOfferCsye6225Fall2022);

        neuCOE.printOutEverything();

        int a = msis.calculateRevenuesBySemester("Fall2022");
        int b = msdam.calculateRevenuesBySemester("Fall2022");
        int c = msses.calculateRevenuesBySemester("Fall2022");
        System.out.println("\nTotal Revenue for each department: \n");
        System.out.println(msis.getDepartName() + ": $" + a);
        System.out.println(msdam.getDepartName() + ": $" + b);
        System.out.println(msses.getDepartName() + ": $" + c);

        int d = neuCOE.collegeRevenuesBySemester("Fall2022");
        System.out.println("\nThe total revenue for College of Enginneering in Northeastern University is $" + d + ".\n");

    }

}
