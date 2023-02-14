package model.MarketAnalytics;

import model.MarketModel.MarketChannelAssignment;

public class MarketChannelSummary {
    MarketChannelAssignment marketChannelAssignment;
    int revenues;

    public MarketChannelSummary(MarketChannelAssignment mcAssign) {

        marketChannelAssignment = mcAssign;
        revenues = mcAssign.getRevenues();

    }

}
