
import java.lang.System;

/**
 * Created by Pranay Airan
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"LCoinDetailsPagerContract;", "", "Presenter", "View", "app_debug"})
public abstract interface CoinDetailsPagerContract {
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&\u00a8\u0006\u0007"}, d2 = {"LCoinDetailsPagerContract$View;", "Lcom/binarybricks/coinbit/features/BaseView;", "onWatchedCoinsLoaded", "", "watchedCoinList", "", "Lcom/binarybricks/coinbit/data/database/entities/WatchedCoin;", "app_debug"})
    public static abstract interface View extends com.binarybricks.coinbit.features.BaseView {
        
        public abstract void onWatchedCoinsLoaded(@org.jetbrains.annotations.Nullable()
        java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin> watchedCoinList);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"LCoinDetailsPagerContract$Presenter;", "", "loadWatchedCoins", "", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void loadWatchedCoins();
    }
}