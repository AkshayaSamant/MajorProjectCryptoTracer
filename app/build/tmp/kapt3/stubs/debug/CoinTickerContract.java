
import java.lang.System;

/**
 * Created by Pranay Airan
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"LCoinTickerContract;", "", "Presenter", "View", "app_debug"})
public abstract interface CoinTickerContract {
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"LCoinTickerContract$View;", "Lcom/binarybricks/coinbit/features/BaseView;", "onPriceTickersLoaded", "", "tickerData", "", "Lcom/binarybricks/coinbit/network/models/CryptoTicker;", "showOrHideLoadingIndicatorForTicker", "showLoading", "", "app_debug"})
    public static abstract interface View extends com.binarybricks.coinbit.features.BaseView {
        
        public abstract void showOrHideLoadingIndicatorForTicker(boolean showLoading);
        
        public abstract void onPriceTickersLoaded(@org.jetbrains.annotations.NotNull()
        java.util.List<com.binarybricks.coinbit.network.models.CryptoTicker> tickerData);
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"LCoinTickerContract$Presenter;", "", "getCryptoTickers", "", "coinName", "", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void getCryptoTickers(@org.jetbrains.annotations.NotNull()
        java.lang.String coinName);
    }
}