/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.MarketModel;

import java.util.ArrayList;

import model.Business.Business;
import model.ProductManagement.SolutionOffer;
import model.SolutionOrders.SolutionOrder;

/**
 *
 * @author kal bugrara
 */
public class MarketChannelAssignment {

    private Market market;
    private Channel channel;
    private int adBudget;
    private int revenues;
    ArrayList<SolutionOrder> solutionOrders; // Actual revenues
    ArrayList<SolutionOffer> solutionOffers;

    public MarketChannelAssignment(Market mkt, Channel chl) {
        market = mkt;
        channel = chl;
        solutionOrders = new ArrayList<SolutionOrder>();
        solutionOffers = new ArrayList<SolutionOffer>();
    }

    public boolean match(Market m, Channel c) {
        if (market == m && channel == c) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isMarketMatch(Market mkt) {
        if (market == mkt) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isChannelMatch(Channel chl) {
        if (channel == chl) {
            return true;
        } else {
            return false;
        }
    }

    public void addSolutionOrder(SolutionOrder sod) {
        solutionOrders.add(sod);
    }

    public void addSolutionOffer(SolutionOffer sof) {
        solutionOffers.add(sof);
    }

    public int getRevenues() {
        int sum = 0;
        for (SolutionOrder sod : solutionOrders) {
            sum += sod.getSolutionPrice();
        }
        return sum;
    }

    public Market getMarket() {
        return market;
    }

    public Channel getChannel() {
        return channel;
    }

    public int getAdBudget() {
        return adBudget;
    }

    public ArrayList<SolutionOffer> getSolutionOffers() {
        return solutionOffers;
    }

    public int getSolutionOfferPrice() {
        int p = 0;
        for (SolutionOffer sof : solutionOffers) {
            p = sof.getPromotionPrice();
        }
        return p;
    }

    public ArrayList<SolutionOrder> getSolutionOrders() {
        return solutionOrders;
    }

    public void printSolutionOffers() {
        for (SolutionOffer sof : solutionOffers) {
            sof.printSolOffer();
            System.out.println(
                    "The Original $" + sof.getActualPrice() + ", and NOW Deals ==> $" + sof.getPromotionPrice()
                            + ", which is $"
                            + (sof.getActualPrice() - sof.getPromotionPrice()) + " OFF !");
        }
    }

}
