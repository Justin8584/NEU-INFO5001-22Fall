package model.SolutionOrders;

import java.util.ArrayList;

import model.CustomerManagement.CustomerProfile;
import model.MarketModel.MarketChannelAssignment;
import model.ProductManagement.SolutionOffer;
import model.CustomerManagement.CustomerProfile;

public class SolutionOrder {

    SolutionOffer selectedSolutionOffer;
    MarketChannelAssignment marketChannelAssignment;
    CustomerProfile customerProfile;

    ArrayList<SolutionOffer> selectedSolOffers = new ArrayList<SolutionOffer>();

    public SolutionOrder(CustomerProfile cp, SolutionOffer solutionOffer, MarketChannelAssignment mcAssign) {
        this.selectedSolutionOffer = solutionOffer;
        this.marketChannelAssignment = mcAssign;
        customerProfile = cp;
        selectedSolOffers.add(selectedSolutionOffer);
    }

    public int getSolutionPrice() {
        return selectedSolutionOffer.getSolutionPrice();
    }

    public MarketChannelAssignment getMarketChannelCombo() {
        return marketChannelAssignment;
    }

    public CustomerProfile getCustomerProfile() {
        return customerProfile;
    }

    public void printSolOrder() {

        System.out.println("\nHi, " + customerProfile
                + ". Here is your final chosen Order! Please check out the products inside the bundle. ");

        for (SolutionOffer sof : selectedSolOffers) {
            sof.printSolOffer();
            System.out.println(
                    "The Original $" + sof.getActualPrice() + ", and NOW Deals ==> $" + sof.getPromotionPrice()
                            + ", which is $"
                            + (sof.getActualPrice() - sof.getPromotionPrice()) + " OFF !");
        }
        System.out.println("----------------------");
    }
}
