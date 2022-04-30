package com.binarybricks.coinbit.epoxymodels;

import java.lang.System;

@com.airbnb.epoxy.ModelView(autoLayout = com.airbnb.epoxy.ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001!B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u0012\u0010\u001c\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001dH\u0007J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/binarybricks/coinbit/epoxymodels/CoinSearchItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cbWatched", "Landroidx/appcompat/widget/SwitchCompat;", "clCoinInfo", "Landroid/view/View;", "cropCircleTransformation", "Lcoil/transform/CircleCropTransformation;", "getCropCircleTransformation", "()Lcoil/transform/CircleCropTransformation;", "cropCircleTransformation$delegate", "Lkotlin/Lazy;", "ivCoin", "Landroid/widget/ImageView;", "tvCoinName", "Landroid/widget/TextView;", "tvCoinSymbol", "setItemClickListener", "", "listener", "Landroid/view/View$OnClickListener;", "setOnWatchedChecked", "Lcom/binarybricks/coinbit/epoxymodels/CoinSearchItemView$OnSearchItemClickListener;", "setWatchedCoin", "watchedCoin", "Lcom/binarybricks/coinbit/data/database/entities/WatchedCoin;", "OnSearchItemClickListener", "app_debug"})
public final class CoinSearchItemView extends androidx.constraintlayout.widget.ConstraintLayout {
    private final android.widget.TextView tvCoinName = null;
    private final android.widget.TextView tvCoinSymbol = null;
    private final android.widget.ImageView ivCoin = null;
    private final androidx.appcompat.widget.SwitchCompat cbWatched = null;
    private final android.view.View clCoinInfo = null;
    private final kotlin.Lazy cropCircleTransformation$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final coil.transform.CircleCropTransformation getCropCircleTransformation() {
        return null;
    }
    
    @com.airbnb.epoxy.ModelProp()
    public final void setWatchedCoin(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.data.database.entities.WatchedCoin watchedCoin) {
    }
    
    @com.airbnb.epoxy.CallbackProp()
    public final void setItemClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener listener) {
    }
    
    @com.airbnb.epoxy.CallbackProp()
    public final void setOnWatchedChecked(@org.jetbrains.annotations.Nullable()
    com.binarybricks.coinbit.epoxymodels.CoinSearchItemView.OnSearchItemClickListener listener) {
    }
    
    public CoinSearchItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet, int defStyle) {
        super(null);
    }
    
    public CoinSearchItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    public CoinSearchItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/binarybricks/coinbit/epoxymodels/CoinSearchItemView$OnSearchItemClickListener;", "", "onItemWatchedClicked", "", "watched", "", "app_debug"})
    public static abstract interface OnSearchItemClickListener {
        
        public abstract void onItemWatchedClicked(boolean watched);
    }
}