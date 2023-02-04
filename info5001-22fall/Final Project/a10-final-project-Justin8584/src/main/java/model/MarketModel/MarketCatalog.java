package model.MarketModel;

import java.util.ArrayList;

public class MarketCatalog {

    ArrayList<Market> markets;

    public MarketCatalog() {
        markets = new ArrayList<Market>();
    }

    public Market newMarket(String name) {

        Market market = new Market(name);
        markets.add(market);
        return market;

    }

    public void printMarketDetails(String mkt) {
        System.out.println("--------market catalog ---------");
        for (Market m : markets) {
            System.out.println(m);
        }
    }
}
