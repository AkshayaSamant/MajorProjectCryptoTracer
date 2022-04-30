package com.binarybricks.coinbit.epoxymodels;

import java.lang.System;

@com.airbnb.epoxy.ModelView(autoLayout = com.airbnb.epoxy.ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00011B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010#H\u0002J\u0010\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u000200H\u0007R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR#\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\u000e\u001a\u0004\b$\u0010%R\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/binarybricks/coinbit/epoxymodels/DashboardHeaderItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "androidResourceManager", "Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManager;", "getAndroidResourceManager", "()Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManager;", "androidResourceManager$delegate", "Lkotlin/Lazy;", "currency", "Ljava/util/Currency;", "kotlin.jvm.PlatformType", "getCurrency", "()Ljava/util/Currency;", "currency$delegate", "formatter", "Lcom/binarybricks/coinbit/utils/Formaters;", "getFormatter", "()Lcom/binarybricks/coinbit/utils/Formaters;", "formatter$delegate", "mc", "Ljava/math/MathContext;", "getMc", "()Ljava/math/MathContext;", "mc$delegate", "purchasedCoinList", "", "Lcom/binarybricks/coinbit/data/database/entities/WatchedCoin;", "toCurrency", "", "getToCurrency", "()Ljava/lang/String;", "toCurrency$delegate", "tvPortfolioChangedPercentage", "Landroid/widget/TextView;", "tvPortfolioChangedValue", "tvPortfolioValue", "animateCoinPrice", "", "amount", "setDashboardHeaderData", "dashboardHeaderModuleData", "Lcom/binarybricks/coinbit/epoxymodels/DashboardHeaderItemView$DashboardHeaderModuleData;", "DashboardHeaderModuleData", "app_debug"})
public final class DashboardHeaderItemView extends androidx.constraintlayout.widget.ConstraintLayout {
    private final android.widget.TextView tvPortfolioChangedValue = null;
    private final android.widget.TextView tvPortfolioChangedPercentage = null;
    private final android.widget.TextView tvPortfolioValue = null;
    private final java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin> purchasedCoinList = null;
    private final kotlin.Lazy toCurrency$delegate = null;
    private final kotlin.Lazy currency$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy androidResourceManager$delegate = null;
    private final kotlin.Lazy formatter$delegate = null;
    private final kotlin.Lazy mc$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final java.lang.String getToCurrency() {
        return null;
    }
    
    private final java.util.Currency getCurrency() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.binarybricks.coinbit.utils.resourcemanager.AndroidResourceManager getAndroidResourceManager() {
        return null;
    }
    
    private final com.binarybricks.coinbit.utils.Formaters getFormatter() {
        return null;
    }
    
    private final java.math.MathContext getMc() {
        return null;
    }
    
    @com.airbnb.epoxy.ModelProp()
    public final void setDashboardHeaderData(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.epoxymodels.DashboardHeaderItemView.DashboardHeaderModuleData dashboardHeaderModuleData) {
    }
    
    private final void animateCoinPrice(java.lang.String amount) {
    }
    
    public DashboardHeaderItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet, int defStyle) {
        super(null);
    }
    
    public DashboardHeaderItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    public DashboardHeaderItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u00c6\u0003J?\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\tH\u00d6\u0001R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lcom/binarybricks/coinbit/epoxymodels/DashboardHeaderItemView$DashboardHeaderModuleData;", "Lcom/binarybricks/coinbit/featurecomponents/ModuleItem;", "watchedCoinList", "", "Lcom/binarybricks/coinbit/data/database/entities/WatchedCoin;", "coinTransactionList", "Lcom/binarybricks/coinbit/data/database/entities/CoinTransaction;", "coinPriceListMap", "Ljava/util/HashMap;", "", "Lcom/binarybricks/coinbit/network/models/CoinPrice;", "(Ljava/util/List;Ljava/util/List;Ljava/util/HashMap;)V", "getCoinPriceListMap", "()Ljava/util/HashMap;", "setCoinPriceListMap", "(Ljava/util/HashMap;)V", "getCoinTransactionList", "()Ljava/util/List;", "getWatchedCoinList", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class DashboardHeaderModuleData implements com.binarybricks.coinbit.featurecomponents.ModuleItem {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin> watchedCoinList = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.binarybricks.coinbit.data.database.entities.CoinTransaction> coinTransactionList = null;
        @org.jetbrains.annotations.NotNull()
        private java.util.HashMap<java.lang.String, com.binarybricks.coinbit.network.models.CoinPrice> coinPriceListMap;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin> getWatchedCoinList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.binarybricks.coinbit.data.database.entities.CoinTransaction> getCoinTransactionList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.HashMap<java.lang.String, com.binarybricks.coinbit.network.models.CoinPrice> getCoinPriceListMap() {
            return null;
        }
        
        public final void setCoinPriceListMap(@org.jetbrains.annotations.NotNull()
        java.util.HashMap<java.lang.String, com.binarybricks.coinbit.network.models.CoinPrice> p0) {
        }
        
        public DashboardHeaderModuleData(@org.jetbrains.annotations.NotNull()
        java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin> watchedCoinList, @org.jetbrains.annotations.NotNull()
        java.util.List<com.binarybricks.coinbit.data.database.entities.CoinTransaction> coinTransactionList, @org.jetbrains.annotations.NotNull()
        java.util.HashMap<java.lang.String, com.binarybricks.coinbit.network.models.CoinPrice> coinPriceListMap) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.binarybricks.coinbit.data.database.entities.CoinTransaction> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.HashMap<java.lang.String, com.binarybricks.coinbit.network.models.CoinPrice> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.binarybricks.coinbit.epoxymodels.DashboardHeaderItemView.DashboardHeaderModuleData copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin> watchedCoinList, @org.jetbrains.annotations.NotNull()
        java.util.List<com.binarybricks.coinbit.data.database.entities.CoinTransaction> coinTransactionList, @org.jetbrains.annotations.NotNull()
        java.util.HashMap<java.lang.String, com.binarybricks.coinbit.network.models.CoinPrice> coinPriceListMap) {
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