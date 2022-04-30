
import java.lang.System;

/**
 * Created by Pragya Agrawal
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"LCryptoNewsContract;", "", "Presenter", "View", "app_debug"})
public abstract interface CryptoNewsContract {
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"LCryptoNewsContract$View;", "Lcom/binarybricks/coinbit/features/BaseView;", "onNewsLoaded", "", "cryptoPanicNews", "Lcom/binarybricks/coinbit/network/models/CryptoPanicNews;", "showOrHideLoadingIndicator", "showLoading", "", "app_debug"})
    public static abstract interface View extends com.binarybricks.coinbit.features.BaseView {
        
        public abstract void showOrHideLoadingIndicator(boolean showLoading);
        
        public abstract void onNewsLoaded(@org.jetbrains.annotations.NotNull()
        com.binarybricks.coinbit.network.models.CryptoPanicNews cryptoPanicNews);
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"LCryptoNewsContract$Presenter;", "", "getCryptoNews", "", "coinSymbol", "", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void getCryptoNews(@org.jetbrains.annotations.NotNull()
        java.lang.String coinSymbol);
    }
}