/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.xml.crypto.Data;

import model.Business.Business;
import model.Business.DataLoader;
import model.SalesManagement.SalesReport;

/**
 *
 * @author kal bugrara
 */
public class RangePricingApplication {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // TODO code application logic here

    Business bestBuy = DataLoader.initialize("Best Buy");
    DataLoader loader = new DataLoader();

    // loader.initialize(bestBuy); // several suppliers and products for testing

    loader.loadSuppliers(bestBuy, 50);
    loader.loadProducts(bestBuy, 50);
    loader.loadCustomers(bestBuy, 50);
    loader.loadArbOrders(bestBuy, 10, 5);

    SalesReport bestBuySalesReport = new SalesReport(bestBuy.getSupplierDirectory().getSuplierList());

    System.out.println(); // print empty line
    bestBuy.printBusinessInformation();

    System.out.println(); // print empty line
    bestBuySalesReport.printReport();

    // System.out.print(bestBuy.getShortInfo());
    // System.out.println(bestBuy.getDetailedInfo());

  }
}
