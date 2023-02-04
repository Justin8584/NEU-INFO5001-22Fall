/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Scanner;

import model.Business.Business;
import model.Business.ConfigureABusiness;

/**
 *
 * @author kal bugrara
 */
public class DigitalMarketingApplication {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Business bestDeals = ConfigureABusiness.initialize("Best-Deals");

    // bestDeals.printBusinessINFO(); // all suppliers and productList
    // bestDeals.printMktChlCombos(); // mktchlCombos
    // bestDeals.printSolutionOffers(); // all solutionOffers

    bestDeals.printAllCustomersOrders(); // customers and all actual Orders

  }

}
