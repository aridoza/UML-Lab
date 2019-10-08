package com.ga;

public class TradingMain extends Asset{
    private TradeDAL tradeDal() {
        // returns a TradeDAL
        return new TradeDAL();
    }

    private Market marketTemplate() {
        return new Market();
    }

    public void bookTrade(Asset asset) {}

    public void saveTradeDetails() {}
}
