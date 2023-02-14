package model.MarketModel;

import java.util.ArrayList;

import model.Business.Business;

public class MarketChannelComboCatalog {

    String mktChlComboName;
    ArrayList<MarketChannelAssignment> marChlAssignCatalog;

    public MarketChannelComboCatalog(Business business) {
        marChlAssignCatalog = new ArrayList<MarketChannelAssignment>();

    }

    public MarketChannelAssignment newMarketChannelAssign(String name, Market mkt, Channel chl) {
        MarketChannelAssignment mcAssign = new MarketChannelAssignment(mkt, chl);
        marChlAssignCatalog.add(mcAssign);
        // mktChlComboName = name;
        return mcAssign;
    }

    public MarketChannelAssignment findMarketChannelCombo(Market mkt, Channel chl) {
        for (MarketChannelAssignment mcAssign : marChlAssignCatalog) {
            if (mcAssign.match(mkt, chl)) {
                return mcAssign;
            }
        }
        return null;
    }

    public String getMktChlComboName() {
        return mktChlComboName;
    }

    public void printMktChlCombos() {
        for (MarketChannelAssignment mcAssign : marChlAssignCatalog) {
            System.out.println(" \nMarket --> " + mcAssign.getMarket().getCharacteristics());
            mcAssign.printSolutionOffers();
        }
    }

}
