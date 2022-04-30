package com.binarybricks.coinbit.epoxymodels;

import java.lang.System;

@com.airbnb.epoxy.ModelView(autoLayout = com.airbnb.epoxy.ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002)*B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0016H\u0007J\u0010\u0010&\u001a\u00020$2\u0006\u0010\'\u001a\u00020(H\u0007R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR#\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/binarybricks/coinbit/epoxymodels/TopCardItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "androidResourceManager", "Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManager;", "getAndroidResourceManager", "()Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManager;", "androidResourceManager$delegate", "Lkotlin/Lazy;", "currency", "Ljava/util/Currency;", "kotlin.jvm.PlatformType", "getCurrency", "()Ljava/util/Currency;", "currency$delegate", "onTopItemClickedListener", "Lcom/binarybricks/coinbit/epoxymodels/TopCardItemView$OnTopItemClickedListener;", "toCurrency", "", "getToCurrency", "()Ljava/lang/String;", "toCurrency$delegate", "topCardContainer", "Landroid/view/View;", "tvMarketCap", "Landroid/widget/TextView;", "tvPair", "tvPrice", "tvPriceChange", "setItemClickListener", "", "listener", "setTopCardData", "topCardsModuleData", "Lcom/binarybricks/coinbit/epoxymodels/TopCardItemView$TopCardsModuleData;", "OnTopItemClickedListener", "TopCardsModuleData", "app_debug"})
public final class TopCardItemView extends androidx.constraintlayout.widget.ConstraintLayout {
    private final android.widget.TextView tvPair = null;
    private final android.widget.TextView tvPrice = null;
    private final android.widget.TextView tvPriceChange = null;
    private final android.widget.TextView tvMarketCap = null;
    private final android.view.View topCardContainer = null;
    private final kotlin.Lazy androidResourceManager$delegate = null;
    private final kotlin.Lazy toCurrency$delegate = null;
    private final kotlin.Lazy currency$delegate = null;
    private com.binarybricks.coinbit.epoxymodels.TopCardItemView.OnTopItemClickedListener onTopItemClickedListener;
    private java.util.HashMap _$_findViewCache;
    
    private final com.binarybricks.coinbit.utils.resourcemanager.AndroidResourceManager getAndroidResourceManager() {
        return null;
    }
    
    private final java.lang.String getToCurrency() {
        return null;
    }
    
    private final java.util.Currency getCurrency() {
        return null;
    }
    
    @com.airbnb.epoxy.ModelProp()
    public final void setTopCardData(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.epoxymodels.TopCardItemView.TopCardsModuleData topCardsModuleData) {
    }
    
    @com.airbnb.epoxy.CallbackProp()
    public final void setItemClickListener(@org.jetbrains.annotations.Nullable()
    com.binarybricks.coinbit.epoxymodels.TopCardItemView.OnTopItemClickedListener listener) {
    }
    
    public TopCardItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet, int defStyle) {
        super(null);
    }
    
    public TopCardItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    public TopCardItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/binarybricks/coinbit/epoxymodels/TopCardItemView$OnTopItemClickedListener;", "", "onItemClicked", "", "coinSymbol", "", "app_debug"})
    public static abstract interface OnTopItemClickedListener {
        
        public abstract void onItemClicked(@org.jetbrains.annotations.NotNull()
        java.lang.String coinSymbol);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/binarybricks/coinbit/epoxymodels/TopCardItemView$TopCardsModuleData;", "Lcom/binarybricks/coinbit/featurecomponents/ModuleItem;", "pair", "", "price", "priceChangePercentage", "marketCap", "coinSymbol", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCoinSymbol", "()Ljava/lang/String;", "getMarketCap", "getPair", "getPrice", "getPriceChangePercentage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class TopCardsModuleData implements com.binarybricks.coinbit.featurecomponents.ModuleItem {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String pair = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String price = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String priceChangePercentage = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String marketCap = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String coinSymbol = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPair() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPriceChangePercentage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMarketCap() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCoinSymbol() {
            return null;
        }
        
        public TopCardsModuleData(@org.jetbrains.annotations.NotNull()
        java.lang.String pair, @org.jetbrains.annotations.NotNull()
        java.lang.String price, @org.jetbrains.annotations.NotNull()
        java.lang.String priceChangePercentage, @org.jetbrains.annotations.NotNull()
        java.lang.String marketCap, @org.jetbrains.annotations.NotNull()
        java.lang.String coinSymbol) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.binarybricks.coinbit.epoxymodels.TopCardItemView.TopCardsModuleData copy(@org.jetbrains.annotations.NotNull()
        java.lang.String pair, @org.jetbrains.annotations.NotNull()
        java.lang.String price, @org.jetbrains.annotations.NotNull()
        java.lang.String priceChangePercentage, @org.jetbrains.annotations.NotNull()
        java.lang.String marketCap, @org.jetbrains.annotations.NotNull()
        java.lang.String coinSymbol) {
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