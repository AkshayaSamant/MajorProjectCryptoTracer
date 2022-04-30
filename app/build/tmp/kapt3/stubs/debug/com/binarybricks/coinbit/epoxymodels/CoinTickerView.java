package com.binarybricks.coinbit.epoxymodels;

import java.lang.System;

@com.airbnb.epoxy.ModelView(autoLayout = com.airbnb.epoxy.ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0007J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\"H\u0007J\b\u0010%\u001a\u00020\u001aH\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/binarybricks/coinbit/epoxymodels/CoinTickerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "clMarket", "Landroid/view/View;", "cropCircleTransformation", "Lcoil/transform/CircleCropTransformation;", "getCropCircleTransformation", "()Lcoil/transform/CircleCropTransformation;", "cropCircleTransformation$delegate", "Lkotlin/Lazy;", "ivExchange", "Landroid/widget/ImageView;", "tvExchange", "Landroid/widget/TextView;", "tvFromCoin", "tvPrice", "tvToPrice", "tvVolume", "setItemClickListener", "", "listener", "Landroid/view/View$OnClickListener;", "setTicker", "ticker", "Lcom/binarybricks/coinbit/network/models/CryptoTicker;", "setTickerPrice", "price", "", "setTickerVolume", "volume", "viewRecycled", "app_debug"})
public final class CoinTickerView extends androidx.constraintlayout.widget.ConstraintLayout {
    private final android.widget.ImageView ivExchange = null;
    private final android.widget.TextView tvFromCoin = null;
    private final android.widget.TextView tvToPrice = null;
    private final android.widget.TextView tvExchange = null;
    private final android.widget.TextView tvPrice = null;
    private final android.widget.TextView tvVolume = null;
    private final android.view.View clMarket = null;
    private final kotlin.Lazy cropCircleTransformation$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final coil.transform.CircleCropTransformation getCropCircleTransformation() {
        return null;
    }
    
    @com.airbnb.epoxy.ModelProp()
    public final void setTicker(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.network.models.CryptoTicker ticker) {
    }
    
    @com.airbnb.epoxy.TextProp()
    public final void setTickerPrice(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence price) {
    }
    
    @com.airbnb.epoxy.TextProp()
    public final void setTickerVolume(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence volume) {
    }
    
    @com.airbnb.epoxy.OnViewRecycled()
    public final void viewRecycled() {
    }
    
    @com.airbnb.epoxy.CallbackProp()
    public final void setItemClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener listener) {
    }
    
    public CoinTickerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet, int defStyle) {
        super(null);
    }
    
    public CoinTickerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    public CoinTickerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}