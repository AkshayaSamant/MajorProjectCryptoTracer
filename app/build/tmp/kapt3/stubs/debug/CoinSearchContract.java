
import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"LCoinSearchContract;", "", "Presenter", "View", "app_debug"})
public abstract interface CoinSearchContract {
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u0012\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0005H&\u00a8\u0006\u000e"}, d2 = {"LCoinSearchContract$View;", "Lcom/binarybricks/coinbit/features/BaseView;", "onCoinWatchedStatusUpdated", "", "watched", "", "coinSymbol", "", "onCoinsLoaded", "coinList", "", "Lcom/binarybricks/coinbit/data/database/entities/WatchedCoin;", "showOrHideLoadingIndicator", "showLoading", "app_debug"})
    public static abstract interface View extends com.binarybricks.coinbit.features.BaseView {
        
        public abstract void showOrHideLoadingIndicator(boolean showLoading);
        
        public abstract void onCoinsLoaded(@org.jetbrains.annotations.NotNull()
        java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin> coinList);
        
        public abstract void onCoinWatchedStatusUpdated(boolean watched, @org.jetbrains.annotations.NotNull()
        java.lang.String coinSymbol);
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"LCoinSearchContract$Presenter;", "", "loadAllCoins", "", "updateCoinWatchedStatus", "watched", "", "coinID", "", "coinSymbol", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void loadAllCoins();
        
        public abstract void updateCoinWatchedStatus(boolean watched, @org.jetbrains.annotations.NotNull()
        java.lang.String coinID, @org.jetbrains.annotations.NotNull()
        java.lang.String coinSymbol);
    }
}