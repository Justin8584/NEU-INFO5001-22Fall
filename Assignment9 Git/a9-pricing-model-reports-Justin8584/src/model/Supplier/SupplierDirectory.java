/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Supplier;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kal bugrara
 */
public class SupplierDirectory {
    ArrayList<Supplier> suppliers;

    public SupplierDirectory() {
        suppliers = new ArrayList<Supplier>();
    }

    public Supplier newSupplier(String n) {
        Supplier supplier = new Supplier(n);
        suppliers.add(supplier);
        return supplier;

    }

    public Supplier findSupplier(String id) {

        for (Supplier supplier : suppliers) {

            if (supplier.getName().equals(id))
                return supplier;
        }
        return null;
    }

    public ArrayList<Supplier> getSuplierList() {
        return suppliers;
    }

    public void printAllSuppliers() {
        for (Supplier s : suppliers) {
            // s.printAllSales();
            s.printProductList();
        }
    }

    public Supplier pickRandomSupplier() {
        Random r = new Random();
        int randomIndex = r.nextInt(suppliers.size());
        return suppliers.get(randomIndex);
    }

}