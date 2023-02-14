/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ProductManagement;

import java.util.ArrayList;
import model.MarketModel.MarketChannelAssignment;
import model.SolutionOrders.SolutionOrder;
import model.ProductManagement.Advertise;;

/**
 *
 * @author kal bugrara
 */
public class SolutionOffer { // bundle

  ArrayList<Product> products; // products inside the bundle
  int promotionPrice; // floor, ceiling, and target ideas
  MarketChannelAssignment marketChannelCombo;
  ArrayList<Advertise> advertiseList;
  ArrayList<SolutionOrder> solutionOrders;

  public SolutionOffer(MarketChannelAssignment mcAssign) {
    marketChannelCombo = mcAssign;
    products = new ArrayList<Product>();
    solutionOrders = new ArrayList<SolutionOrder>();
    advertiseList = new ArrayList<Advertise>();
    mcAssign.addSolutionOffer(this);
  }

  public void addProduct(Product p) {
    products.add(p);
  }

  public void addSolutionOrder(SolutionOrder sod) {
    solutionOrders.add(sod);
  }

  public void addAds(Advertise ads) {
    advertiseList.add(ads);
  }

  public int getPromotionPrice() {
    return promotionPrice;
  }

  public int getActualPrice() {
    int sum = 0;
    for (Product p : products) {
      sum = sum + p.getCeilingPrice();
    }
    return sum;
  }

  public void setPromotionPrice(int bundlePrice) {
    promotionPrice = bundlePrice;
  }

  public boolean isOfferTargetMarketChannel(MarketChannelAssignment mcAssign) {

    if (marketChannelCombo == mcAssign) {
      return true;
    } else {
      return false;
    }
  }

  public int getSolutionPrice() {
    return promotionPrice;
  }

  public void printSolOffer() {
    System.out.println("\n--------- Solution Offer Detail -----------");
    for (Product p : products) {
      System.out.println("Product -> " + p.getName() + " | Original $" + p.getCeilingPrice());
    }
  }

}
