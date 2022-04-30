
import java.lang.System;

/**
 * Created by Pranay Airan
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"LCoinContract;", "", "Presenter", "View", "app_debug"})
public abstract interface CoinContract {
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J,\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\f2\u001a\u0010\u000f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010H&J\u0016\u0010\u0013\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011H&\u00a8\u0006\u0016"}, d2 = {"LCoinContract$View;", "Lcom/binarybricks/coinbit/features/BaseView;", "onCoinPriceLoaded", "", "coinPrice", "Lcom/binarybricks/coinbit/network/models/CoinPrice;", "watchedCoin", "Lcom/binarybricks/coinbit/data/database/entities/WatchedCoin;", "onCoinWatchedStatusUpdated", "watched", "", "coinSymbol", "", "onHistoricalDataLoaded", "period", "historicalDataPair", "Lkotlin/Pair;", "", "Lcom/binarybricks/coinbit/network/models/CryptoCompareHistoricalResponse$Data;", "onRecentTransactionLoaded", "coinTransactionList", "Lcom/binarybricks/coinbit/data/database/entities/CoinTransaction;", "app_debug"})
    public static abstract interface View extends com.binarybricks.coinbit.features.BaseView {
        
        public abstract void onCoinPriceLoaded(@org.jetbrains.annotations.Nullable()
        com.binarybricks.coinbit.network.models.CoinPrice coinPrice, @org.jetbrains.annotations.NotNull()
        com.binarybricks.coinbit.data.database.entities.WatchedCoin watchedCoin);
        
        public abstract void onRecentTransactionLoaded(@org.jetbrains.annotations.NotNull()
        java.util.List<com.binarybricks.coinbit.data.database.entities.CoinTransaction> coinTransactionList);
        
        public abstract void onCoinWatchedStatusUpdated(boolean watched, @org.jetbrains.annotations.NotNull()
        java.lang.String coinSymbol);
        
        public abstract void onHistoricalDataLoaded(@org.jetbrains.annotations.NotNull()
        java.lang.String period, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<? extends java.util.List<com.binarybricks.coinbit.network.models.CryptoCompareHistoricalResponse.Data>, com.binarybricks.coinbit.network.models.CryptoCompareHistoricalResponse.Data> historicalDataPair);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0007H&J \u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H&\u00a8\u0006\u0012"}, d2 = {"LCoinContract$Presenter;", "", "loadCurrentCoinPrice", "", "watchedCoin", "Lcom/binarybricks/coinbit/data/database/entities/WatchedCoin;", "toCurrency", "", "loadHistoricalData", "period", "fromCurrency", "loadRecentTransaction", "symbol", "updateCoinWatchedStatus", "watched", "", "coinID", "coinSymbol", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void loadCurrentCoinPrice(@org.jetbrains.annotations.NotNull()
        com.binarybricks.coinbit.data.database.entities.WatchedCoin watchedCoin, @org.jetbrains.annotations.NotNull()
        java.lang.String toCurrency);
        
        public abstract void loadRecentTransaction(@org.jetbrains.annotations.NotNull()
        java.lang.String symbol);
        
        public abstract void updateCoinWatchedStatus(boolean watched, @org.jetbrains.annotations.NotNull()
        java.lang.String coinID, @org.jetbrains.annotations.NotNull()
        java.lang.String coinSymbol);
        
        public abstract void loadHistoricalData(@org.jetbrains.annotations.NotNull()
        java.lang.String period, @org.jetbrains.annotations.NotNull()
        java.lang.String fromCurrency, @org.jetbrains.annotations.NotNull()
        java.lang.String toCurrency);
    }
}