/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CustomerManagement;

import java.util.ArrayList;

import model.Business.Business;
import model.Personnel.Person;

/**
 *
 * @author kal bugrara
 */
public class CustomerDirectory {

    Business business;
    ArrayList<CustomerProfile> customerList;

    public CustomerDirectory(Business d) {

        business = d;
        customerList = new ArrayList<CustomerProfile>();

    }

    public CustomerProfile newCustomerProfile(Person p) {

        CustomerProfile sp = new CustomerProfile(p);
        customerList.add(sp);
        return sp;
    }

    public CustomerProfile findCustomer(String id) {

        for (CustomerProfile sp : customerList) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null; // not found after going through the whole list
    }

    public CustomersReport generateCustomerPerformanceReport() {
        CustomersReport customersReport = new CustomersReport();

        for (CustomerProfile cp : customerList) {

            CustomerSummary cs = new CustomerSummary(cp);
            customersReport.addCustomerSummary(cs);
        }
        return customersReport;
    }

    public void printAllCustomers() {
        for (CustomerProfile cp : customerList) {
            // System.out.println(cp.getPerson().getPersonId());
            System.out.println("-------------CustomerDire---------");

            cp.printAllSolOrders();
        }
    }
}
