/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.MarketModel;

import java.util.ArrayList;
import model.ProductManagement.SolutionOffer;

/**
 *
 * @author kal bugrara
 */
public class Market {

  private ArrayList<SolutionOffer> solutionOffers;
  private ArrayList<Channel> validChannels; // valid channel.ex: elderly -> TV ; teenagers -> internet
  private ArrayList<String> characteristics; // one way to describe what is that group, characteristics of markets
  private ArrayList<Market> subMarkets;
  private int size;

  public Market(String s) {
    String name = s;
    characteristics = new ArrayList<String>();
    characteristics.add(name);

    subMarkets = new ArrayList<Market>();
    validChannels = new ArrayList<Channel>();
  }

  public void addCharacteristic(String name) {
    characteristics.add(name);
  }

  public void addValidChannels(Channel channel) {
    validChannels.add(channel);
  }

  public ArrayList<SolutionOffer> getSolutionOffers() {
    return solutionOffers;
  }

  public ArrayList<Channel> getValidChannels() {
    return validChannels;
  }

  public ArrayList<String> getCharacteristics() {
    return characteristics;
  }

  public ArrayList<Market> getSubMarkets() {
    return subMarkets;
  }

  public int getSize() {
    return size;
  }

}
