package model.SalesManagement;

import model.ProductManagement.Product;
import model.Supplier.Supplier;

public class SalesSummary {
    Product product;
    Supplier supplier;
    int totalSales;
    int unitSold;
    int avgPrice;
    int targetPrice;
    int floorPrice;

    public SalesSummary(Product product) {
        this.product = product;
        supplier = product.getSupplier();
        totalSales = product.getSalesVolume();
        unitSold = product.getUnitedSold();
        avgPrice = totalSales / (unitSold == 0 ? 1 : unitSold);
        targetPrice = product.getTargetPrice();
        floorPrice = product.getFloorPrice();

    }

    public Product getProduct() {
        return product;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public int getUnitSold() {
        return unitSold;
    }

    public int getAvgPrice() {
        return avgPrice;
    }

    public int getTargetPrice() {
        return targetPrice;
    }

    public int getFloorPrice() {
        return floorPrice;
    }

    public void printLine() {
        System.out.println(product.getName() + " |--> " + supplier.getName() + " |--> TotalSalesVolm: " + totalSales
                + " |--> UnitSold: " + unitSold
                + " |--> AvgPrice: " + avgPrice + " |--> TargPrice: " + targetPrice + " |--> FloorPrice: " + floorPrice + ".");
    }

}