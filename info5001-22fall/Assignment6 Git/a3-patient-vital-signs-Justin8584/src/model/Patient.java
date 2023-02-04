package model;

import java.util.ArrayList;

public class Patient {
    float age;
    VitalSigns currentVitalSigns;
    ArrayList<VitalSigns> vitalSignsHistory = new ArrayList<VitalSigns>();

    public Patient(float age) {
        this.age = age;
        vitalSignsHistory = new ArrayList<VitalSigns>();
    }

    public boolean isPatientNormal() {
        return currentVitalSigns.areVitalsNormal(age);
    }

    public void addVitals(int rr, int hr, int bp, int wk, int wp) {
        VitalSigns newVitals = new VitalSigns(rr, hr, bp, wk, wp, this);
        vitalSignsHistory.add(currentVitalSigns);
        currentVitalSigns = newVitals;
    }

    public void printPatientStatus() {
        if (isPatientNormal()) {
            System.out.println("I'm feeling well, thanks for asking.");

        } else {
            System.out.println("emmm... Not quite well... Might need to see doctor.");
        }
        
        for (VitalSigns vs:vitalSignsHistory) {
            vs.printVSHistory();
        }

    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }
}
