/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import java.util.ArrayList;
import java.util.Scanner;

import model.MarketModel.ChannelCatalog;
import model.CustomerManagement.CustomerDirectory;
import model.MarketModel.MarketCatalog;
import model.MarketModel.MarketChannelAssignment;
import model.MarketModel.MarketChannelComboCatalog;
import model.MarketingManagement.MarketingPersonDirectory;
import model.OrderManagement.MasterOrderList;
import model.Personnel.EmployeeDirectory;
import model.Personnel.PersonDirectory;
import model.ProductManagement.AdvertiseCatalog;
import model.ProductManagement.ProductSummary;
import model.ProductManagement.ProductsReport;
import model.ProductManagement.SolutionOfferCatalog;
import model.SalesManagement.SalesPersonDirectory;
import model.SolutionOrders.MasterSolutionOrderList;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;
import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class Business {

  String name;
  PersonDirectory personDirectory;
  MasterOrderList masterOrderList;
  // CustomerDirectory customers;
  SupplierDirectory suppliers;
  MarketCatalog marketCatalog;
  ChannelCatalog channelCatalog;
  SolutionOfferCatalog solutionOfferCatalog;
  CustomerDirectory customerDirectory;
  EmployeeDirectory employeeDirectory;
  SalesPersonDirectory salesPersonDirectory;
  UserAccountDirectory userAccountDirectory;
  MarketingPersonDirectory marketingPersonDirectory;
  MarketChannelAssignment marketChannelAssignment;
  MarketChannelComboCatalog marketChannelComboCatalog;
  AdvertiseCatalog advertises;
  MasterSolutionOrderList masterSolutionOrderList;

  public Business(String n) {
    name = n;
    masterOrderList = new MasterOrderList();
    suppliers = new SupplierDirectory();
    solutionOfferCatalog = new SolutionOfferCatalog();
    personDirectory = new PersonDirectory();
    customerDirectory = new CustomerDirectory(this);
    salesPersonDirectory = new SalesPersonDirectory(this);
    userAccountDirectory = new UserAccountDirectory();
    marketingPersonDirectory = new MarketingPersonDirectory(this);
    employeeDirectory = new EmployeeDirectory(this);
    // marketChannelAssignment = new MarketChannelAssignment(Market market, Channel
    // channel);
    marketCatalog = new MarketCatalog();
    channelCatalog = new ChannelCatalog();
    marketChannelComboCatalog = new MarketChannelComboCatalog(this);
    advertises = new AdvertiseCatalog();
    masterSolutionOrderList = new MasterSolutionOrderList();

  }

  public int getSalesVolume() {
    return masterOrderList.getSalesVolume();
  }

  public PersonDirectory getPersonDirectory() {
    return personDirectory;
  }

  public UserAccountDirectory getUserAccountDirectory() {
    return userAccountDirectory;
  }

  public MarketingPersonDirectory getMarketingPersonDirectory() {
    return marketingPersonDirectory;
  }

  public SupplierDirectory getSupplierDirectory() {
    return suppliers;
  }

  public ProductsReport getSupplierPerformanceReport(String n) {
    Supplier supplier = suppliers.findSupplier(n);
    if (supplier == null) {
      return null;
    }
    return supplier.prepareProductsReport();
  }

  public ArrayList<ProductSummary> getSupplierProductsAlwaysAboveTarget(String n) {
    ProductsReport productsReport = getSupplierPerformanceReport(n);
    return productsReport.getProductsAlwaysAboveTarget();
  }

  public int getHowManySupplierProductsAlwaysAboveTarget(String n) {
    ProductsReport productsReport = getSupplierPerformanceReport(n); // see above
    int i = productsReport.getProductsAlwaysAboveTarget().size(); // return size of the arraylist
    return i;
  }

  public CustomerDirectory getCustomerDirectory() {
    return customerDirectory;
  }

  public SalesPersonDirectory getSalesPersonDirectory() {
    return salesPersonDirectory;
  }

  public MasterOrderList getMasterOrderList() {
    return masterOrderList;
  }

  public EmployeeDirectory getEmployeeDirectory() {
    return employeeDirectory;
  }

  public MarketCatalog getMarketCatalog() {
    return marketCatalog;
  }

  public ChannelCatalog getChannelCatalog() {
    return channelCatalog;
  }

  public SolutionOfferCatalog getSolutionOfferCatalog() {
    return solutionOfferCatalog;
  }

  public MarketChannelComboCatalog getMarketChannelComboCatalog() {
    return marketChannelComboCatalog;
  }

  public MasterSolutionOrderList getMasterSolutionOrderList() {
    return masterSolutionOrderList;
  }

  public AdvertiseCatalog getAdvertises() {
    return advertises;
  }

  public static String getUserInput() {
    Scanner scan = new Scanner(System.in);
    // System.out.println("Please enter your name: ");
    String input = scan.nextLine();
    return input;
  }

  public void printBusinessINFO() {
    System.out.println("\n ---> Welcome to our OutLet Company --- " + name + " !");

    // print suppliers and their products
    System.out.println("\n ######  Suppliers' Product Catalog ###### ");

    this.suppliers.printAllSuppliers();
  }

  public void printAllCustomersOrders() {
    System.out.println("\n\n ######  Customers' Order Report ###### ");

    System.out.println("\n ---> Thanks for shopping with us. " + name + " is on your side !");

    this.masterSolutionOrderList.printAllSolutionOrders();
  }

  public void printSolutionOffers() {
    System.out.println("\n ######  Solution Offer List ###### ");

    this.solutionOfferCatalog.printSolutionOffers();

  }

  public void printMarketINFO(String mkt) {
    this.marketCatalog.printMarketDetails(mkt);
  }

  public void printMktChlCombos() {
    this.marketChannelComboCatalog.printMktChlCombos();
  }

}
