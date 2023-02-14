/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package College;

import Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class College {
    String name;
    ArrayList<Department> departments;
    
    public College(String name){
        this.name = name;
        departments = new ArrayList<Department>();
    }

    public Department newDepartment(String n) {
        Department d = new Department(n);
        departments.add(d);
        return d;
    }

    public int collegeRevenuesBySemester(String s) {
        int sum = 0;
        for (Department d:departments ) {
            sum = sum + d.calculateRevenuesBySemester(s);
        }
        return sum;
    }

    public void printOutEverything() {
        System.out.println("\n-------------Everything important starts from this interestring line !!!-------------");
        System.out.println("\nCollege: " + name);
        for (Department d : departments) {
            d.printOutDepart();
            System.out.println("\n-------------------------------------------------------------------------------------");
        }
        

    }
}
