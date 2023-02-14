package model.MarketModel;

import java.util.ArrayList;

public class ChannelCatalog {
    ArrayList<Channel> channels;

    public ChannelCatalog() {
        channels = new ArrayList<Channel>();
    }

    public Channel newChannel(String type) {

        Channel c = new Channel(type);
        channels.add(c);
        return c;
    }

    public Channel findChannel(String type) {

        for (Channel c : channels) {
            if (c.getChannelType().equalsIgnoreCase(type)) {
                return c;
            }
        }
        return null; // not found

    }
}
