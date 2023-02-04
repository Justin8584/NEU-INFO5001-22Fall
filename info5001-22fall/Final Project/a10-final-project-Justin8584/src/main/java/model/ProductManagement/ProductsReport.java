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
public class ProductsReport {

  ArrayList<ProductSummary> productSummaryList;

  public ProductsReport() {
    productSummaryList = new ArrayList<ProductSummary>();
  }

  public void addProductSummary(ProductSummary ps) {
    productSummaryList.add(ps);
  }

  public ProductSummary getTopProductAboveTarget() {
    ProductSummary currentTopProduct = null;

    for (ProductSummary ps : productSummaryList) {
      if (currentTopProduct == null) {
        currentTopProduct = ps; // initial step
      } else if (ps.getNumberAboveTarget() > currentTopProduct.getNumberAboveTarget()) {
        currentTopProduct = ps; // we have a new higher total
      }
    }
    return currentTopProduct;
  }

  public ArrayList<ProductSummary> getProductsAlwaysAboveTarget() {
    ArrayList<ProductSummary> productSalWaysAboveTarget = new ArrayList<ProductSummary>(); // temp array list

    for (ProductSummary ps : productSummaryList) {
      if (ps.isProductAlwaysAboveTarget() == true) {
        productSalWaysAboveTarget.add(ps);
      }
    }

    return productSalWaysAboveTarget;
  }
}
