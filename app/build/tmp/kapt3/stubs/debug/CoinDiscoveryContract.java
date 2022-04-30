
import java.lang.System;

/**
 * Created by Pranay Airan
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"LCoinDiscoveryContract;", "", "Presenter", "View", "app_debug"})
public abstract interface CoinDiscoveryContract {
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H&J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H&\u00a8\u0006\r"}, d2 = {"LCoinDiscoveryContract$View;", "Lcom/binarybricks/coinbit/features/BaseView;", "onCoinNewsLoaded", "", "coinNews", "", "Lcom/binarybricks/coinbit/network/models/CryptoCompareNews;", "onTopCoinListByPairVolumeLoaded", "topPair", "Lcom/binarybricks/coinbit/network/models/CoinPair;", "onTopCoinsByTotalVolumeLoaded", "topCoins", "Lcom/binarybricks/coinbit/network/models/CoinPrice;", "app_debug"})
    public static abstract interface View extends com.binarybricks.coinbit.features.BaseView {
        
        public abstract void onTopCoinsByTotalVolumeLoaded(@org.jetbrains.annotations.NotNull()
        java.util.List<com.binarybricks.coinbit.network.models.CoinPrice> topCoins);
        
        public abstract void onTopCoinListByPairVolumeLoaded(@org.jetbrains.annotations.NotNull()
        java.util.List<com.binarybricks.coinbit.network.models.CoinPair> topPair);
        
        public abstract void onCoinNewsLoaded(@org.jetbrains.annotations.NotNull()
        java.util.List<com.binarybricks.coinbit.network.models.CryptoCompareNews> coinNews);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"LCoinDiscoveryContract$Presenter;", "", "getCryptoCurrencyNews", "", "getTopCoinListByMarketCap", "toCurrencySymbol", "", "getTopCoinListByPairVolume", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void getTopCoinListByMarketCap(@org.jetbrains.annotations.NotNull()
        java.lang.String toCurrencySymbol);
        
        public abstract void getTopCoinListByPairVolume();
        
        public abstract void getCryptoCurrencyNews();
    }
}