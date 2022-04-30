package com.binarybricks.coinbit.epoxymodels;

import java.lang.System;

@com.airbnb.epoxy.ModelView(autoLayout = com.airbnb.epoxy.ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/binarybricks/coinbit/epoxymodels/ChipGroupItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "chipGroupFirst", "Lcom/google/android/material/chip/ChipGroup;", "chipGroupSecond", "chipGroupThird", "chipItemClickedListener", "Lcom/binarybricks/coinbit/epoxymodels/ChipGroupItemView$OnChipItemClickedListener;", "getChip", "Lcom/google/android/material/chip/Chip;", "coinPair", "Lcom/binarybricks/coinbit/network/models/CoinPair;", "setChipClickListener", "", "setChipData", "chipGroupModuleData", "Lcom/binarybricks/coinbit/epoxymodels/ChipGroupItemView$ChipGroupModuleData;", "ChipGroupModuleData", "OnChipItemClickedListener", "app_debug"})
public final class ChipGroupItemView extends androidx.constraintlayout.widget.ConstraintLayout {
    private final com.google.android.material.chip.ChipGroup chipGroupFirst = null;
    private final com.google.android.material.chip.ChipGroup chipGroupSecond = null;
    private final com.google.android.material.chip.ChipGroup chipGroupThird = null;
    private com.binarybricks.coinbit.epoxymodels.ChipGroupItemView.OnChipItemClickedListener chipItemClickedListener;
    private java.util.HashMap _$_findViewCache;
    
    @com.airbnb.epoxy.ModelProp()
    public final void setChipData(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.epoxymodels.ChipGroupItemView.ChipGroupModuleData chipGroupModuleData) {
    }
    
    private final com.google.android.material.chip.Chip getChip(android.content.Context context, com.binarybricks.coinbit.network.models.CoinPair coinPair) {
        return null;
    }
    
    @com.airbnb.epoxy.CallbackProp()
    public final void setChipClickListener(@org.jetbrains.annotations.Nullable()
    com.binarybricks.coinbit.epoxymodels.ChipGroupItemView.OnChipItemClickedListener chipItemClickedListener) {
    }
    
    public ChipGroupItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet, int defStyle) {
        super(null);
    }
    
    public ChipGroupItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    public ChipGroupItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/binarybricks/coinbit/epoxymodels/ChipGroupItemView$OnChipItemClickedListener;", "", "onChipClicked", "", "coinSymbol", "", "app_debug"})
    public static abstract interface OnChipItemClickedListener {
        
        public abstract void onChipClicked(@org.jetbrains.annotations.NotNull()
        java.lang.String coinSymbol);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/binarybricks/coinbit/epoxymodels/ChipGroupItemView$ChipGroupModuleData;", "Lcom/binarybricks/coinbit/featurecomponents/ModuleItem;", "data", "", "Lcom/binarybricks/coinbit/network/models/CoinPair;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class ChipGroupModuleData implements com.binarybricks.coinbit.featurecomponents.ModuleItem {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.binarybricks.coinbit.network.models.CoinPair> data = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.binarybricks.coinbit.network.models.CoinPair> getData() {
            return null;
        }
        
        public ChipGroupModuleData(@org.jetbrains.annotations.NotNull()
        java.util.List<com.binarybricks.coinbit.network.models.CoinPair> data) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.binarybricks.coinbit.network.models.CoinPair> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.binarybricks.coinbit.epoxymodels.ChipGroupItemView.ChipGroupModuleData copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.binarybricks.coinbit.network.models.CoinPair> data) {
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