package model.SalesManagement;

import java.util.Comparator;

public class SalesSummaryComparator implements Comparator<SalesSummary> {

    @Override
    public int compare(SalesSummary ss1, SalesSummary ss2) {

        if (ss1.getSupplier() != ss2.getSupplier()) {
            return (-1) * Integer.compare(ss1.getSupplier().getTotalSales(), ss2.getSupplier().getTotalSales());
        } else {
            return (-1) * Integer.compare(ss1.totalSales, ss2.totalSales);
        }
        // return 0;
    }

}