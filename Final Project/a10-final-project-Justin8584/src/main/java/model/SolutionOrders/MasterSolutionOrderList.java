package model.SolutionOrders;

import java.util.ArrayList;

import model.MarketModel.Channel;
import model.MarketModel.Market;
import model.MarketModel.MarketChannelAssignment;
import model.ProductManagement.SolutionOffer;
import model.CustomerManagement.CustomerProfile;

public class MasterSolutionOrderList {

    ArrayList<SolutionOrder> solutionOrders;

    public MasterSolutionOrderList() {
        solutionOrders = new ArrayList<SolutionOrder>();
    }

    public SolutionOrder newSolutionOrder(CustomerProfile cp, SolutionOffer solOffer,
            MarketChannelAssignment mcAssign) {
        SolutionOrder sod = new SolutionOrder(cp, solOffer, mcAssign);
        solutionOrders.add(sod);
        solOffer.addSolutionOrder(sod);
        return sod;
    }

    public int getRevenueByMarket(Market mkt) {
        int sum = 0;
        for (SolutionOrder sod : solutionOrders) {
            MarketChannelAssignment mcCombo = sod.getMarketChannelCombo();
            if (mcCombo.getMarket() == mkt) {
                sum = sum + sod.getSolutionPrice();
            }
        }
        return sum;
    }

    public int getRevenueByChannel(Channel cha) {
        int sum = 0;
        for (SolutionOrder sod : solutionOrders) {
            MarketChannelAssignment mcCombo = sod.getMarketChannelCombo();
            if (mcCombo.getChannel() == cha) {
                sum = sum + sod.getSolutionPrice();
            }
        }
        return sum;
    }

    public int getRevenueByMarketChannelCombo(MarketChannelAssignment mcAssign) {
        int sum = 0;
        for (SolutionOrder sod : solutionOrders) {
            MarketChannelAssignment mcCombo = sod.getMarketChannelCombo();
            if (mcCombo == mcAssign) {
                sum = sum + sod.getSolutionPrice();
            }
        }
        return sum;

    }

    public void printAllSolutionOrders() {
        for (SolutionOrder sod : solutionOrders) {
            sod.printSolOrder();
        }
    }
}
