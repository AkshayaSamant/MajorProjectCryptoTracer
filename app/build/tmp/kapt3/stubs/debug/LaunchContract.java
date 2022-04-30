
import java.lang.System;

/**
 * Created by Pranay Airan 2/3/18.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"LLaunchContract;", "", "Presenter", "View", "app_debug"})
public abstract interface LaunchContract {
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"LLaunchContract$View;", "Lcom/binarybricks/coinbit/features/BaseView;", "onAllSupportedCoinsLoaded", "", "onCoinsLoaded", "app_debug"})
    public static abstract interface View extends com.binarybricks.coinbit.features.BaseView {
        
        public abstract void onCoinsLoaded();
        
        public abstract void onAllSupportedCoinsLoaded();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"LLaunchContract$Presenter;", "", "getAllSupportedCoins", "", "defaultCurrency", "", "loadAllCoins", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void loadAllCoins();
        
        public abstract void getAllSupportedCoins(@org.jetbrains.annotations.NotNull()
        java.lang.String defaultCurrency);
    }
}