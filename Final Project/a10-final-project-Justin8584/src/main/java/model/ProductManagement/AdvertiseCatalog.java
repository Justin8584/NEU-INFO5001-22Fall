package model.ProductManagement;

import java.util.ArrayList;

import model.MarketModel.Channel;
import model.MarketModel.Market;
import model.MarketModel.MarketChannelAssignment;

public class AdvertiseCatalog {

    ArrayList<Advertise> advertises;

    public AdvertiseCatalog() {
        advertises = new ArrayList<Advertise>();
    }

    public Advertise newAdvertise(String title, String content, MarketChannelAssignment mcAssign) {
        Advertise ad = new Advertise(title, content, mcAssign);
        advertises.add(ad);
        return ad;
    }

    public ArrayList<Advertise> getAdvertises() {
        return advertises;
    }

    public void printAdvertise() {
        for (Advertise ad : advertises) {
            ad.printAdDetails();
        }
    }
}
