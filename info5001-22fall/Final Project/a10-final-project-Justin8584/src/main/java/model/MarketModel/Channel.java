/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.MarketModel;

/**
 *
 * @author kal bugrara
 */
public class Channel {

    private String channelType; // tv, internet, magazine, radio
    private int price;
    private String measureUnits; // per minute, length, ...

    public Channel(String channelType) {
        this.channelType = channelType;
    }

    public boolean isMatch(String t) {
        if (channelType.equalsIgnoreCase(t)) {
            return true;
        } else {
            return false;
        }
    }

    public String getChannelType() {
        return channelType;
    }

    public int getPrice() {
        return price;
    }

    public String getMeasureUnits() {
        return measureUnits;
    }
}
