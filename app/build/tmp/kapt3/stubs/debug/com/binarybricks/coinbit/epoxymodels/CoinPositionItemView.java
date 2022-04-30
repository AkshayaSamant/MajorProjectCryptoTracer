package com.binarybricks.coinbit.epoxymodels;

import java.lang.System;

@com.airbnb.epoxy.ModelView(autoLayout = com.airbnb.epoxy.ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001.B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\"\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&0%2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0007R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/binarybricks/coinbit/epoxymodels/CoinPositionItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "androidResourceManager", "Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManager;", "getAndroidResourceManager", "()Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManager;", "androidResourceManager$delegate", "Lkotlin/Lazy;", "currency", "Ljava/util/Currency;", "getCurrency", "()Ljava/util/Currency;", "currency$delegate", "formatter", "Lcom/binarybricks/coinbit/utils/Formaters;", "getFormatter", "()Lcom/binarybricks/coinbit/utils/Formaters;", "formatter$delegate", "mc", "Ljava/math/MathContext;", "getMc", "()Ljava/math/MathContext;", "mc$delegate", "tvAvgCostValue", "Landroid/widget/TextView;", "tvCoinLabel", "tvCoinValue", "tvNoOfCoins", "tvTotalReturnValue", "getNoOfCoinsAndTotalCost", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", "coinTransactionList", "", "Lcom/binarybricks/coinbit/data/database/entities/CoinTransaction;", "setCoinPrice", "", "coinPositionItem", "Lcom/binarybricks/coinbit/epoxymodels/CoinPositionItemView$CoinPositionCardModuleData;", "CoinPositionCardModuleData", "app_debug"})
public final class CoinPositionItemView extends androidx.constraintlayout.widget.ConstraintLayout {
    private final android.widget.TextView tvNoOfCoins = null;
    private final android.widget.TextView tvCoinLabel = null;
    private final android.widget.TextView tvCoinValue = null;
    private final android.widget.TextView tvAvgCostValue = null;
    private final android.widget.TextView tvTotalReturnValue = null;
    private final kotlin.Lazy mc$delegate = null;
    private final kotlin.Lazy androidResourceManager$delegate = null;
    private final kotlin.Lazy formatter$delegate = null;
    private final kotlin.Lazy currency$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final java.math.MathContext getMc() {
        return null;
    }
    
    private final com.binarybricks.coinbit.utils.resourcemanager.AndroidResourceManager getAndroidResourceManager() {
        return null;
    }
    
    private final com.binarybricks.coinbit.utils.Formaters getFormatter() {
        return null;
    }
    
    private final java.util.Currency getCurrency() {
        return null;
    }
    
    @com.airbnb.epoxy.ModelProp(options = {com.airbnb.epoxy.ModelProp.Option.IgnoreRequireHashCode})
    public final void setCoinPrice(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.epoxymodels.CoinPositionItemView.CoinPositionCardModuleData coinPositionItem) {
    }
    
    private final kotlin.Pair<java.math.BigDecimal, java.math.BigDecimal> getNoOfCoinsAndTotalCost(java.util.List<com.binarybricks.coinbit.data.database.entities.CoinTransaction> coinTransactionList) {
        return null;
    }
    
    public CoinPositionItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet, int defStyle) {
        super(null);
    }
    
    public CoinPositionItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    public CoinPositionItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/binarybricks/coinbit/epoxymodels/CoinPositionItemView$CoinPositionCardModuleData;", "Lcom/binarybricks/coinbit/featurecomponents/ModuleItem;", "coinPrice", "Lcom/binarybricks/coinbit/network/models/CoinPrice;", "coinTransactionList", "", "Lcom/binarybricks/coinbit/data/database/entities/CoinTransaction;", "(Lcom/binarybricks/coinbit/network/models/CoinPrice;Ljava/util/List;)V", "getCoinPrice", "()Lcom/binarybricks/coinbit/network/models/CoinPrice;", "getCoinTransactionList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class CoinPositionCardModuleData implements com.binarybricks.coinbit.featurecomponents.ModuleItem {
        @org.jetbrains.annotations.NotNull()
        private final com.binarybricks.coinbit.network.models.CoinPrice coinPrice = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.binarybricks.coinbit.data.database.entities.CoinTransaction> coinTransactionList = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.binarybricks.coinbit.network.models.CoinPrice getCoinPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.binarybricks.coinbit.data.database.entities.CoinTransaction> getCoinTransactionList() {
            return null;
        }
        
        public CoinPositionCardModuleData(@org.jetbrains.annotations.NotNull()
        com.binarybricks.coinbit.network.models.CoinPrice coinPrice, @org.jetbrains.annotations.NotNull()
        java.util.List<com.binarybricks.coinbit.data.database.entities.CoinTransaction> coinTransactionList) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.binarybricks.coinbit.network.models.CoinPrice component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.binarybricks.coinbit.data.database.entities.CoinTransaction> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.binarybricks.coinbit.epoxymodels.CoinPositionItemView.CoinPositionCardModuleData copy(@org.jetbrains.annotations.NotNull()
        com.binarybricks.coinbit.network.models.CoinPrice coinPrice, @org.jetbrains.annotations.NotNull()
        java.util.List<com.binarybricks.coinbit.data.database.entities.CoinTransaction> coinTransactionList) {
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