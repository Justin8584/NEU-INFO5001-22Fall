/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ProductManagement;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class ProductCatalog {

    String type;
    ArrayList<Product> products; // list of products initially empty

    public ProductCatalog(String n) {
        type = n;
        products = new ArrayList<Product>(); /// create the list of elements otherwise it is null
    }

    // new ProductCatalog(); or new ProductCatalog("Printers");
    public ProductCatalog() {
        type = "unknown";
        products = new ArrayList<Product>();
    }

    public Product newProduct(int fp, int cp, int tp) {
        Product newProduct = new Product(fp, cp, tp);
        products.add(newProduct);
        return newProduct;
    }

    public Product newProduct(String n, int fp, int cp, int tp) {
        Product newProduct = new Product(n, fp, cp, tp);
        products.add(newProduct);
        return newProduct;
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

    public Product findProduct(String id) {

        for (Product pd : products) {

            if (pd.getName().equals(id))
                return pd;
        }
        return null;
    }

    public void printAllSales() {
        for (Product p : products) {
            p.printProductInfo();
        }
    }

}
