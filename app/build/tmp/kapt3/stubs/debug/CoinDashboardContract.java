
import java.lang.System;

/**
 * Created by Pranay Airan
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"LCoinDashboardContract;", "", "Presenter", "View", "app_debug"})
public abstract interface CoinDashboardContract {
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J,\u0010\u0007\u001a\u00020\u00032\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\fH&J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H&J$\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005H&\u00a8\u0006\u0014"}, d2 = {"LCoinDashboardContract$View;", "Lcom/binarybricks/coinbit/features/BaseView;", "onCoinNewsLoaded", "", "coinNews", "", "Lcom/binarybricks/coinbit/network/models/CryptoCompareNews;", "onCoinPricesLoaded", "coinPriceListMap", "Ljava/util/HashMap;", "", "Lcom/binarybricks/coinbit/network/models/CoinPrice;", "Lkotlin/collections/HashMap;", "onTopCoinsByTotalVolumeLoaded", "topCoins", "onWatchedCoinsAndTransactionsLoaded", "watchedCoinList", "Lcom/binarybricks/coinbit/data/database/entities/WatchedCoin;", "coinTransactionList", "Lcom/binarybricks/coinbit/data/database/entities/CoinTransaction;", "app_debug"})
    public static abstract interface View extends com.binarybricks.coinbit.features.BaseView {
        
        public abstract void onWatchedCoinsAndTransactionsLoaded(@org.jetbrains.annotations.NotNull()
        java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin> watchedCoinList, @org.jetbrains.annotations.NotNull()
        java.util.List<com.binarybricks.coinbit.data.database.entities.CoinTransaction> coinTransactionList);
        
        public abstract void onCoinPricesLoaded(@org.jetbrains.annotations.NotNull()
        java.util.HashMap<java.lang.String, com.binarybricks.coinbit.network.models.CoinPrice> coinPriceListMap);
        
        public abstract void onTopCoinsByTotalVolumeLoaded(@org.jetbrains.annotations.NotNull()
        java.util.List<com.binarybricks.coinbit.network.models.CoinPrice> topCoins);
        
        public abstract void onCoinNewsLoaded(@org.jetbrains.annotations.NotNull()
        java.util.List<com.binarybricks.coinbit.network.models.CryptoCompareNews> coinNews);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0003H&\u00a8\u0006\n"}, d2 = {"LCoinDashboardContract$Presenter;", "", "getLatestNewsFromCryptoCompare", "", "getTopCoinsByTotalVolume24hours", "toCurrencySymbol", "", "loadCoinsPrices", "fromCurrencySymbol", "loadWatchedCoinsAndTransactions", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void loadWatchedCoinsAndTransactions();
        
        public abstract void loadCoinsPrices(@org.jetbrains.annotations.NotNull()
        java.lang.String fromCurrencySymbol, @org.jetbrains.annotations.NotNull()
        java.lang.String toCurrencySymbol);
        
        public abstract void getTopCoinsByTotalVolume24hours(@org.jetbrains.annotations.NotNull()
        java.lang.String toCurrencySymbol);
        
        public abstract void getLatestNewsFromCryptoCompare();
    }
}