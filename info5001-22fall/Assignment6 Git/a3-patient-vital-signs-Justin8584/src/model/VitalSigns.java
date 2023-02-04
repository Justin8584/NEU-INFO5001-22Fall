package model;

import java.util.ArrayList;

public class VitalSigns {
    private Patient patient;
    private ArrayList<VitalSignMetric> metrics = new ArrayList<VitalSignMetric>();
    
    private int rr;
    private int hr;
    private int bp;
    private int wk;
    private int wp;

    public VitalSigns(int rr, int hr, int bp, int wk, int wp, Patient p) {
        this.rr = rr;
        this.hr = hr;
        this.bp = bp;
        this.wk = wk;
        this.wp = wp;

        metrics.add(new VitalSignMetric("Respiratroy Rate", rr));
        metrics.add(new VitalSignMetric("Heart Rate", hr));
        metrics.add(new VitalSignMetric("Blood Pressure", bp));
        metrics.add(new VitalSignMetric("Weight in kilos", wk));
        metrics.add(new VitalSignMetric("Weight in pounds", wp));
        this.patient = p;
    }

    public boolean areVitalsNormal(float age) {
        boolean result = true;
        for (VitalSignMetric vsm : metrics)
            if (!isThisVitalSignsNormal(vsm)) {
                result = false;
            }

        return result;
    }

    public boolean isThisVitalSignsNormal(VitalSignMetric metric) {
        boolean result = true;
        float age = patient.getAge();
        int value = metric.getValue();
        String name = metric.getName();

        if (name == "Respiratroy Rate") {
            if ((age == 0.0f) && (!inRange(value, 30, 50))) {
                result = false;
            }

            if (inAgeRange(age, 0.05f, 12.99f) && (!inRange(value, 20, 30))) {
                result = false;
            }

            if ((age >= 13.0f) && (!inRange(value, 12, 20))) {
                result = false;
            }
        }

        if (name == "Heart Rate") {
            if ((age == 0.0f) && (!inRange(value, 120, 160))) {
                result = false;
            }

            if (inAgeRange(age, 0.05f, 0.99f) && (!inRange(value, 80, 140))) {
                result = false;
            }

            if (inAgeRange(age, 1.0f, 2.99f) && (!inRange(value, 80, 130))) {
                result = false;
            }

            if (inAgeRange(age, 3.0f, 5.99f) && (!inRange(value, 80, 120))) {
                result = false;
            }

            if (inAgeRange(age, 6.0f, 12.99f) && (!inRange(value, 70, 110))) {
                result = false;
            }

            if ((age >= 13.0f) && (!inRange(value, 55, 105))) {
                result = false;
            }
        }

        if (name == "Blood Presure") {
            if ((age == 0.0f) && (!inRange(value, 50, 70))) {
                result = false;
            }

            if (inAgeRange(age, 0.5f, 0.99f) && (!inRange(value, 70, 100))) {
                result = false;
            }

            if (inAgeRange(age, 1.0f, 5.99f) && (!inRange(value, 80, 110))) {
                result = false;
            }

            if (inAgeRange(age, 6.0f, 12.99f) && (!inRange(value, 80, 120))) {
                result = false;
            }

            if ((age >= 13.0f) && (!inRange(value, 110, 120))) {
                result = false;
            }
        }

        if (name == "Weight in kilos") {
            if ((age == 0.0f) && (!inRange(value, 2, 3))) {
                result = false;
            }

            if (inAgeRange(age, 0.05f, 0.99f) && (!inRange(value, 4, 10))) {
                result = false;
            }

            if (inAgeRange(age, 1.0f, 2.99f) && (!inRange(value, 10, 14))) {
                result = false;
            }

            if (inAgeRange(age, 3.0f, 5.99f) && (!inRange(value, 14, 18))) {
                result = false;
            }

            if (inAgeRange(age, 6.0f, 12.99f) && (!inRange(value, 20, 142))) {
                result = false;
            }

            if ((age >= 13.0f) && (!inRange(value, 50, 10000))) {
                result = false;
            }
        }

        if (name == "Weight in pounds") {
            if ((age == 0.0f) && (!inRange(value, 4, 7))) {
                result = false;
            }

            if (inAgeRange(age, 0.05f, 0.99f) && (!inRange(value, 9, 22))) {
                result = false;
            }

            if (inAgeRange(age, 1.0f, 2.99f) && (!inRange(value, 22, 30))) {
                result = false;
            }

            if (inAgeRange(age, 3.0f, 5.99f) && (!inRange(value, 31, 40))) {
                result = false;
            }

            if (inAgeRange(age, 6.0f, 12.99f) && (!inRange(value, 41, 92))) {
                result = false;
            }

            if ((age >= 13.0f) && (!inRange(value, 110, 10000))) {
                result = false;
            }
        }

        return result;
    }

    public boolean inRange(int metric, int min, int max) {
        if ((metric < min) || (metric > max)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean inAgeRange(float age, float min, float max) {
        if ((age < min) || (age > max)) {
            return false;
        } else {
            return true;
        }
    }

    public void printVSHistory() {
        System.out.println("Respiratroy Rate" + rr);
        System.out.println("Heart Rate"+hr);
        System.out.println("Blood Pressure" + bp);
        System.out.println("Weight in kilos" + wk);
        System.out.println("Weight in pounds" + wp);
    }
}
