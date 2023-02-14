package ui;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import model.Patient;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<Patient> patientsList = new ArrayList<>();

        // patient 1
        Patient DaenerysTargaryen = new Patient(15);
        DaenerysTargaryen.addVitals(15, 100, 115, 60, 120);
        DaenerysTargaryen.addVitals(17, 90, 98, 55, 100);
        DaenerysTargaryen.addVitals(13, 120, 113, 63, 125);
        patientsList.add(DaenerysTargaryen);
        System.out.println("\nDaenerys, how do you feel today? ");
        DaenerysTargaryen.printPatientStatus();

        // patient 2
        Patient JohnSnow = new Patient(4);
        JohnSnow.addVitals(22, 90, 100, 17, 38);
        JohnSnow.addVitals(30, 97, 108, 17, 38);
        JohnSnow.addVitals(28, 85, 94, 18, 39);

        patientsList.add(JohnSnow);
        System.out.println("\nJohn, how do you feel today?");
        JohnSnow.printPatientStatus();

        // patient 3
        Patient TyrionLannister = new Patient(1.5f);
        TyrionLannister.addVitals(31, 150, 110, 13, 27);
        TyrionLannister.addVitals(33, 142, 99, 13, 27);
        TyrionLannister.addVitals(29, 129, 109, 13, 27);

        patientsList.add(TyrionLannister);
        System.out.println("\nTyrion, how do you feel today? ");
        TyrionLannister.printPatientStatus();

        // Countdowm full 60-second for infants respiratory rate.
        // System.out.println("\nPlease counts full 60-second for infants respiratory
        // rate. ");
        // for (int j = 60; j >= 0; j--) {
        // System.out.println(j + " Second");
        // TimeUnit.SECONDS.sleep(1);
        // }

    }
}
