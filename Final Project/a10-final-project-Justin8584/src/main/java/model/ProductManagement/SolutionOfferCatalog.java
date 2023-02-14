/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ProductManagement;

import java.util.ArrayList;

import model.MarketModel.MarketChannelAssignment;

/**
 *
 * @author kal bugrara
 */
public class SolutionOfferCatalog {

    ArrayList<SolutionOffer> solutionOffers;

    public SolutionOfferCatalog() {
        solutionOffers = new ArrayList<SolutionOffer>();
    }

    public SolutionOffer newSolutionOffer(MarketChannelAssignment mcAssign) {
        SolutionOffer so = new SolutionOffer(mcAssign);
        solutionOffers.add(so);
        return so;
    }

    /*
     * This method will identify all solution offers meant for customers in a market
     * coming in over a channel.
     * 
     * The app will extract the market and channel combo from the user profile and
     * use it to pull all offers.
     */
    public ArrayList<SolutionOffer> findSolutionsForMarChlCombo(MarketChannelAssignment mcAssign) {
        ArrayList<SolutionOffer> foundSolutions = new ArrayList<SolutionOffer>();

        for (SolutionOffer so : solutionOffers) {
            if (so.isOfferTargetMarketChannel(mcAssign) == true) {
                foundSolutions.add(so);
            }
        }

        return foundSolutions;
    }

    public void printSolutionOffers() {

        for (SolutionOffer sof : solutionOffers) {
            sof.printSolOffer();
            System.out.println(
                    "The Original $" + sof.getActualPrice() + ", and NOW Deal Price ==> $" + sof.getPromotionPrice()
                            + ", which is $"
                            + (sof.getActualPrice() - sof.getPromotionPrice()) + " OFF !");
        }
        System.out.println("----------------------");

    }

}
