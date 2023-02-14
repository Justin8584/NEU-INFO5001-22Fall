package model.ProductManagement;

import model.MarketModel.Channel;
import model.MarketModel.Market;
import model.MarketModel.MarketChannelAssignment;
import model.ProductManagement.SolutionOffer;

public class Advertise {
    String title;
    String content;
    // SolutionOffer solutionOffer;
    Market market;
    Channel channel;
    MarketChannelAssignment marketChannelAssignment;

    public Advertise(String title, String content, MarketChannelAssignment mcAssign) {
        this.title = title;
        this.content = content;
        // solutionOffer = new SolutionOffer(mcAssign);
        market = mcAssign.getMarket();
        channel = mcAssign.getChannel();
        marketChannelAssignment = mcAssign;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Market getMarket() {
        return market;
    }

    public Channel getChannel() {
        return channel;
    }

    public void printAdDetails() {
        System.out.println(" * For " + title + "\n" + content);
    }

}
