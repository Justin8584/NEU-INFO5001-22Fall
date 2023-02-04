/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import java.util.Random;

import model.Business.Business;
import model.CustomerManagement.CustomerDirectory;
import model.CustomerManagement.CustomerProfile;
import model.MarketingManagement.MarketingPersonDirectory;
import model.MarketingManagement.MarketingPersonProfile;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.Personnel.EmployeeDirectory;
import model.Personnel.EmployeeProfile;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.SalesManagement.SalesPersonDirectory;
import model.SalesManagement.SalesPersonProfile;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class DataLoader {
  Random randomGenerator;

  public DataLoader() {
    randomGenerator = new Random();
  }

  public void initialize(Business business) {
    // Create suppliers
    SupplierDirectory sd = business.getSupplierDirectory();
    Supplier samsung = sd.newSupplier("Samsung");
    Supplier apple = sd.newSupplier("Apple");
    Supplier xiaomi = sd.newSupplier("Xiaomi");

    // Products
    loadSingleProduct(samsung, "S22", 599, 899, 799);
    loadSingleProduct(samsung, "S22 Ultra", 799, 1099, 999);
    loadSingleProduct(apple, "iPhone 13 mini", 499, 699, 599);
    loadSingleProduct(apple, "iPhone 13", 599, 799, 699);
    loadSingleProduct(apple, "iPhone 14", 699, 999, 899);
    loadSingleProduct(apple, "iPhone 14 Pro", 799, 1299, 1099);
    loadSingleProduct(xiaomi, "Xiaomi 12", 599, 899, 799);
    loadSingleProduct(xiaomi, "Xiaomi 12 Pro", 799, 1299, 1099);
    
    // Customer
    loadSingleCustomers(business, "Retail Customer");

    // Generating orders
    loadOrders(business, 10, 5);
  }

  public void loadSuppliers(Business business, int supplierCount) {
    SupplierDirectory sd = business.getSupplierDirectory();

    for (int i = 0; i < supplierCount; i++) {
      sd.newSupplier("Supplier " + i);
    }

  }

  public void loadProducts(Business business, int productCount) {
    SupplierDirectory sd = business.getSupplierDirectory();

    for (Supplier s : sd.getSuplierList()) {
      ProductCatalog pc = s.getProductCatalog();
      loadProductsIntoProductCatalog(pc, productCount);
    }
  }

  public void loadProductsIntoProductCatalog(ProductCatalog pc, int productCount) {
    for (int i = 0; i < productCount; i++) {
      int index = randomGenerator.nextInt(5) + 1;
      int floorPrice = randomInRange(10, 15) * index;
      int ceilingPrice = randomInRange(30, 40) * index;
      int targetPrice = randomInRange(15, 25) * index;
      pc.newProduct("Product " + i, floorPrice, ceilingPrice, targetPrice);
    }
  }

  public Product loadSingleProduct(Supplier supplier, String name, int floor, int ceiling, int target) {
    ProductCatalog pc = supplier.getProductCatalog();
    return pc.newProduct(name, floor, ceiling, target);
  }

  public void loadCustomers(Business business, int customerCount) {
    CustomerDirectory cd = business.getCustomerDirectory();
    for (int i = 0; i < customerCount; i++) {
      cd.newCustomerProfile(new Person("Customer " + i));
    }
  }

  public CustomerProfile loadSingleCustomers(Business business, String name) {
    CustomerDirectory cd = business.getCustomerDirectory();
    return cd.newCustomerProfile(new Person(name));

  }

  public void loadArbOrders(Business business, int orderCount, int perOrderCountMax) {

    SupplierDirectory sd = business.getSupplierDirectory();
    for (int i = 0; i < orderCount; i++) {
      // Pick a random customer
      // Create an order
      // Pick random number of items
      // Pick a random supplier
      // Pick random product
      // put a random price
      // put a random quantity
      Supplier arbitrarySupplier = sd.pickRandomSupplier();
      ProductCatalog arbitraryProductCatalog = arbitrarySupplier.getProductCatalog();

      // for (int c = 0; c <= perOrderCountMax; c++) {
      Product arbProd = arbitraryProductCatalog.pickRandomProduct();
      // }

      // Product p1 = arbitraryProductCatalog.pickRandomProduct();
      // Product p2 = arbitraryProductCatalog.pickRandomProduct();
      // Product p3 = arbitraryProductCatalog.pickRandomProduct();
      // Product p4 = arbitraryProductCatalog.pickRandomProduct();
      // Product p5 = arbitraryProductCatalog.pickRandomProduct();

      MasterOrderList mol = business.getMasterOrderList();
      for (int j = 0; j < 5; j++) {
        CustomerDirectory cd = business.getCustomerDirectory();
        CustomerProfile arbitraryCust = cd.pickRandomCustomer();
        Order arbitraryOrder = mol.newOrder(arbitraryCust);
        arbitraryOrder.newOrderItem(arbProd, randomInRange(300, 500), randomInRange(1, 5));
        // arbitraryOrder.newOrderItem(p2, randomInRange(200, 700), 2);
      }
      // CustomerProfile cust2 = cd.pickRandomCustomer();
      // CustomerProfile cust3 = cd.pickRandomCustomer();
      // CustomerProfile cust4 = cd.pickRandomCustomer();
      // CustomerProfile cust5 = cd.pickRandomCustomer();
      // CustomerProfile cust6 = cd.pickRandomCustomer();
      // CustomerProfile cust7 = cd.pickRandomCustomer();
      // CustomerProfile cust8 = cd.pickRandomCustomer();
      // CustomerProfile cust9 = cd.pickRandomCustomer();
      // CustomerProfile cust10 = cd.pickRandomCustomer();

      // Order cust2Order = mol.newOrder(cust2);
      // Order cust3Order = mol.newOrder(cust3);
      // Order cust4Order = mol.newOrder(cust4);
      // Order cust5Order = mol.newOrder(cust5);
      // Order cust6Order = mol.newOrder(cust6);
      // Order cust7Order = mol.newOrder(cust7);
      // Order cust8Order = mol.newOrder(cust8);
      // Order cust9Order = mol.newOrder(cust9);
      // Order cust10Order = mol.newOrder(cust10);
    }
  }

  public void loadOrders(Business business, int orderCount, int perOrderCountMax) {

    SupplierDirectory sd = business.getSupplierDirectory();
    CustomerDirectory cd = business.getCustomerDirectory();
    CustomerProfile retailCustomer = cd.pickRandomCustomer();
    MasterOrderList mol = business.getMasterOrderList();

    for (int i = 0; i < orderCount; i++) {
      // put a random quantity
      Supplier arbitrarySupplier = sd.pickRandomSupplier();
      ProductCatalog arbitraryProductCatalog = arbitrarySupplier.getProductCatalog();

      // We decide how many items to put in a specific order
      int randomItemCount = randomInRange(1, perOrderCountMax);
      Order newOrder = mol.newOrder(retailCustomer);

      for (int orderItemCounter = 0; orderItemCounter < randomItemCount; orderItemCounter++) {
        Product randomPhone = arbitraryProductCatalog.pickRandomProduct();
        newOrder.newOrderItem(randomPhone, randomInRange(randomPhone.getFloorPrice(), randomPhone.getCeilingPrice()), 1);
      }
 
    }
  }

  public int randomInRange(int min, int max) {
    return min + randomGenerator.nextInt(max - min);
  }

  public static Business initialize(String name) {
    Business business = new Business(name);

    return business;
  }
}
