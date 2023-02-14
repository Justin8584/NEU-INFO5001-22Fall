package model.ProductManagement;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

    String sortingOrder;
    String fieldName;

    public ProductComparator(String order, String field) {
        if (order == "desc") {
            sortingOrder = order;
        } else {
            sortingOrder = "asc";
        }

        fieldName = "floor";
        if (field != "") {
            fieldName = field;
        }
    }

    public String getSortingOrder() {
        return sortingOrder;
    }

    @Override
    public int compare(Product p1, Product p2) {

        int ordering = 1;
        if (sortingOrder == "desc") {
            ordering = -1;
        } else {
            ordering = 1;
        }

        if (fieldName == "ceiling") {
            return (ordering) * Integer.compare(p1.getCeilingPrice(), p2.getCeilingPrice());
        } else {
            return (ordering) * Integer.compare(p1.getFloorPrice(), p2.getFloorPrice());

        }

        // compare and sorting in Collections and Comparator Class.
        // -1 ; 0 ; 1
        // return Integer.compare(p1.getFloorPrice(), p2.getFloorPrice());

        // if want to reverse, 1 ; 0 ; -1
        // return (-1) * Integer.compare(p1.getFloorPrice(), p2.getFloorPrice());

        // if (p1.getFloorPrice() < p2.getFloorPrice()) {
        // return 1;
        // } else if (p1.getFloorPrice() == p2.getFloorPrice()) {
        // return 0;
        // } else {
        // return -1;
        // }

    }

}
