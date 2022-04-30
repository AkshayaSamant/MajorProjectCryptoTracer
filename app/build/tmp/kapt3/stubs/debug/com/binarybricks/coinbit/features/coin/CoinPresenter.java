package com.binarybricks.coinbit.features.coin;

import java.lang.System;

/**
 * Created by Pranay Airan
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J \u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/binarybricks/coinbit/features/coin/CoinPresenter;", "Lcom/binarybricks/coinbit/features/BasePresenter;", "LCoinContract$View;", "LCoinContract$Presenter;", "coinRepo", "Lcom/binarybricks/coinbit/features/CryptoCompareRepository;", "chartRepo", "Lcom/binarybricks/coinbit/featurecomponents/historicalchartmodule/ChartRepository;", "(Lcom/binarybricks/coinbit/features/CryptoCompareRepository;Lcom/binarybricks/coinbit/featurecomponents/historicalchartmodule/ChartRepository;)V", "loadCurrentCoinPrice", "", "watchedCoin", "Lcom/binarybricks/coinbit/data/database/entities/WatchedCoin;", "toCurrency", "", "loadHistoricalData", "period", "fromCurrency", "loadRecentTransaction", "symbol", "updateCoinWatchedStatus", "watched", "", "coinID", "coinSymbol", "app_debug"})
public final class CoinPresenter extends com.binarybricks.coinbit.features.BasePresenter<CoinContract.View> implements CoinContract.Presenter {
    private final com.binarybricks.coinbit.features.CryptoCompareRepository coinRepo = null;
    private final com.binarybricks.coinbit.featurecomponents.historicalchartmodule.ChartRepository chartRepo = null;
    
    /**
     * Get the current price of a coinSymbol say btc or eth
     */
    @java.lang.Override()
    public void loadCurrentCoinPrice(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.data.database.entities.WatchedCoin watchedCoin, @org.jetbrains.annotations.NotNull()
    java.lang.String toCurrency) {
    }
    
    @java.lang.Override()
    public void loadRecentTransaction(@org.jetbrains.annotations.NotNull()
    java.lang.String symbol) {
    }
    
    @java.lang.Override()
    public void updateCoinWatchedStatus(boolean watched, @org.jetbrains.annotations.NotNull()
    java.lang.String coinID, @org.jetbrains.annotations.NotNull()
    java.lang.String coinSymbol) {
    }
    
    /**
     * Load historical data for the coin to show the chart.
     */
    @java.lang.Override()
    public void loadHistoricalData(@org.jetbrains.annotations.NotNull()
    java.lang.String period, @org.jetbrains.annotations.NotNull()
    java.lang.String fromCurrency, @org.jetbrains.annotations.NotNull()
    java.lang.String toCurrency) {
    }
    
    public CoinPresenter(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.features.CryptoCompareRepository coinRepo, @org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.featurecomponents.historicalchartmodule.ChartRepository chartRepo) {
        super(null);
    }
}