/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Supplier;

import java.util.ArrayList;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.ProductManagement.ProductSummary;
import model.ProductManagement.ProductsReport;

/**
 *
 * @author kal bugrara
 */
public class Supplier {
    String name;
    ProductCatalog productcatalog;
    ProductsReport productsreport;

    public Supplier(String n) {
        name = n;
        productcatalog = new ProductCatalog(this);

    }

    public ProductsReport prepareProductsReport() {

        productsreport = productcatalog.generatProductPerformanceReport();
        return productsreport;
    }

    public ArrayList<ProductSummary> getProductsAlwaysAboveTarget() {

        if (productsreport == null)
            productsreport = prepareProductsReport();
        return productsreport.getProductsAlwaysAboveTarget();

    }

    public String getName() {
        return name;
    }

    public ProductCatalog getProductCatalog() {
        return productcatalog;
    }
    // add supplier product ..

    // update supplier product ...
    @Override
    public String toString() {
        return name;
    }

    public ArrayList<Product> getAllProducts() {
        return productcatalog.getProductList();
    }

    public int getTotalSales() {
        int sum = 0;
        for (Product p : getAllProducts()) {
            sum = sum + p.getSalesVolume();
        }
        return sum;
    }

    public void printProductList() {
        System.out.println(" ---> Supplier - " + name + " <---\n");
        this.productcatalog.printProductList();
    }

    public void printAllSales() {
        if (productcatalog.getProductList().size() == 0) {
            return;
        }
        System.out.println(" ---> Supplier - ".concat(name).concat(" <---\n"));
        this.productcatalog.printAllSales();
    }

}
