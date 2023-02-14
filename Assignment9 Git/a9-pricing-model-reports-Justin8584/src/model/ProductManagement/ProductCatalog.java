/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ProductManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import model.Supplier.Supplier;

/**
 *
 * @author kal bugrara
 */
public class ProductCatalog {

    Supplier supplier;
    String type;
    ArrayList<Product> products; // list of products initially empty

    // public ProductCatalog(String n) {
    //     type = n;
    //     products = new ArrayList<Product>(); // create the list of elements otherwise it is null
    // }

    // new ProductCatalog(); or new ProductCatalog("Printers");
    public ProductCatalog(Supplier sp) {
        type = "unknown";
        products = new ArrayList<Product>();
        supplier = sp;
    }

    public Product newProduct(int fp, int cp, int tp) {
        Product p = new Product(fp, cp, tp, supplier);
        products.add(p);
        return p;
    }

    public Product newProduct(String n, int fp, int cp, int tp) {
        Product p = new Product(n, fp, cp, tp, supplier);
        products.add(p);
        return p;
    }

    public ProductsReport generatProductPerformanceReport() {
        ProductsReport productsreport = new ProductsReport();

        for (Product p : products) {

            ProductSummary ps = new ProductSummary(p);
            productsreport.addProductSummary(ps);
        }
        return productsreport;
    }

    public ArrayList<Product> getProductList() {
        return products;
    }

    public void printAllSales() {

        for (Product p : products) {
            p.printSaleInfo();
        }
    }

    public void sortData() {
        System.out.println(" Sorting... Sorting... Loading... ");

        Collections.sort(products, new ProductComparator("desc", "ceiling"));
    }

    public void printProductList() {
        sortData();
        for (Product p : products) {
            p.printProductInfo();
        }
    }

    public Product pickRandomProduct() {
        Random r = new Random();
        int randomIndex = r.nextInt(products.size());
        return products.get(randomIndex);
    }

}