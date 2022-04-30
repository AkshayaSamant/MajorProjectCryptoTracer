package com.binarybricks.coinbit.epoxymodels;

import java.lang.System;

@com.airbnb.epoxy.ModelView(autoLayout = com.airbnb.epoxy.ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001@B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0007J\u0012\u0010=\u001a\u00020:2\b\u0010>\u001a\u0004\u0018\u00010?H\u0007R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0018\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010\u000e\u001a\u0004\b \u0010!R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lcom/binarybricks/coinbit/epoxymodels/CoinTickerItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "androidResourceManager", "Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManager;", "getAndroidResourceManager", "()Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManager;", "androidResourceManager$delegate", "Lkotlin/Lazy;", "clFirstMarket", "Landroid/view/View;", "clSecondMarket", "clThirdMarket", "cropCircleTransformation", "Lcoil/transform/CircleCropTransformation;", "getCropCircleTransformation", "()Lcoil/transform/CircleCropTransformation;", "cropCircleTransformation$delegate", "currency", "Ljava/util/Currency;", "kotlin.jvm.PlatformType", "getCurrency", "()Ljava/util/Currency;", "currency$delegate", "formatter", "Lcom/binarybricks/coinbit/utils/Formaters;", "getFormatter", "()Lcom/binarybricks/coinbit/utils/Formaters;", "formatter$delegate", "ivFirstExchange", "Landroid/widget/ImageView;", "ivSecondExchange", "ivThirdExchange", "pbLoading", "tvFirstExchange", "Landroid/widget/TextView;", "tvFirstFromCoin", "tvFirstPrice", "tvFirstToPrice", "tvFirstVolume", "tvMore", "tvSecondExchange", "tvSecondFromCoin", "tvSecondPrice", "tvSecondToPrice", "tvSecondVolume", "tvThirdExchange", "tvThirdFromCoin", "tvThirdPrice", "tvThirdToPrice", "tvThirdVolume", "setCoinTickerData", "", "coinTickerModuleData", "Lcom/binarybricks/coinbit/epoxymodels/CoinTickerItemView$CoinTickerModuleData;", "setMoreClickListener", "listener", "Landroid/view/View$OnClickListener;", "CoinTickerModuleData", "app_debug"})
public final class CoinTickerItemView extends androidx.constraintlayout.widget.ConstraintLayout {
    private final android.widget.TextView tvFirstFromCoin = null;
    private final android.widget.TextView tvFirstToPrice = null;
    private final android.widget.TextView tvFirstPrice = null;
    private final android.widget.TextView tvFirstExchange = null;
    private final android.widget.TextView tvFirstVolume = null;
    private final android.widget.ImageView ivFirstExchange = null;
    private final android.view.View clFirstMarket = null;
    private final android.widget.TextView tvSecondFromCoin = null;
    private final android.widget.TextView tvSecondToPrice = null;
    private final android.widget.TextView tvSecondPrice = null;
    private final android.widget.TextView tvSecondExchange = null;
    private final android.widget.TextView tvSecondVolume = null;
    private final android.widget.ImageView ivSecondExchange = null;
    private final android.view.View clSecondMarket = null;
    private final android.widget.TextView tvThirdFromCoin = null;
    private final android.widget.TextView tvThirdToPrice = null;
    private final android.widget.TextView tvThirdPrice = null;
    private final android.widget.TextView tvThirdExchange = null;
    private final android.widget.TextView tvThirdVolume = null;
    private final android.widget.ImageView ivThirdExchange = null;
    private final android.view.View clThirdMarket = null;
    private final android.view.View tvMore = null;
    private final android.view.View pbLoading = null;
    private final kotlin.Lazy currency$delegate = null;
    private final kotlin.Lazy androidResourceManager$delegate = null;
    private final kotlin.Lazy formatter$delegate = null;
    private final kotlin.Lazy cropCircleTransformation$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final java.util.Currency getCurrency() {
        return null;
    }
    
    private final com.binarybricks.coinbit.utils.resourcemanager.AndroidResourceManager getAndroidResourceManager() {
        return null;
    }
    
    private final com.binarybricks.coinbit.utils.Formaters getFormatter() {
        return null;
    }
    
    private final coil.transform.CircleCropTransformation getCropCircleTransformation() {
        return null;
    }
    
    @com.airbnb.epoxy.ModelProp(options = {com.airbnb.epoxy.ModelProp.Option.IgnoreRequireHashCode})
    public final void setCoinTickerData(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.epoxymodels.CoinTickerItemView.CoinTickerModuleData coinTickerModuleData) {
    }
    
    @com.airbnb.epoxy.CallbackProp()
    public final void setMoreClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener listener) {
    }
    
    public CoinTickerItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet, int defStyle) {
        super(null);
    }
    
    public CoinTickerItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    public CoinTickerItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/binarybricks/coinbit/epoxymodels/CoinTickerItemView$CoinTickerModuleData;", "Lcom/binarybricks/coinbit/featurecomponents/ModuleItem;", "tickerData", "", "Lcom/binarybricks/coinbit/network/models/CryptoTicker;", "(Ljava/util/List;)V", "getTickerData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class CoinTickerModuleData implements com.binarybricks.coinbit.featurecomponents.ModuleItem {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.binarybricks.coinbit.network.models.CryptoTicker> tickerData = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.binarybricks.coinbit.network.models.CryptoTicker> getTickerData() {
            return null;
        }
        
        public CoinTickerModuleData(@org.jetbrains.annotations.NotNull()
        java.util.List<com.binarybricks.coinbit.network.models.CryptoTicker> tickerData) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.binarybricks.coinbit.network.models.CryptoTicker> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.binarybricks.coinbit.epoxymodels.CoinTickerItemView.CoinTickerModuleData copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.binarybricks.coinbit.network.models.CryptoTicker> tickerData) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}