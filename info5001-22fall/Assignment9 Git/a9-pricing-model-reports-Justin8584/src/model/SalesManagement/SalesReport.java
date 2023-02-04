package model.SalesManagement;

import java.util.ArrayList;
import java.util.Collections;

import model.ProductManagement.Product;
import model.Supplier.Supplier;

public class SalesReport {
    ArrayList<SalesSummary> salesSummaries = new ArrayList<SalesSummary>();

    public SalesReport(ArrayList<Supplier> suppliers) {

        ArrayList<Product> productList = new ArrayList<Product>();

        // Gathering all products (no matter the supplier into a single list)
        for (Supplier s : suppliers) {
            productList.addAll(s.getAllProducts());
        }

        // Looping though each product
        for (Product p : productList) {
            salesSummaries.add(new SalesSummary(p));
        }
    }

    public void sortByOwnRules() {
        SalesSummaryComparator comparator = new SalesSummaryComparator();
        Collections.sort(salesSummaries, comparator);
    }

    public void printReport() {
        sortByOwnRules();
        int cot = 0;
        int sold = 0;

        for (SalesSummary ss : salesSummaries) {
            if (ss.unitSold == 0) {
                continue;
            } else {
                cot++;
                sold += ss.unitSold;

                int index = salesSummaries.indexOf(ss);
                System.out.print(index + " | ");

                ss.printLine();
            }

        }

    }

}