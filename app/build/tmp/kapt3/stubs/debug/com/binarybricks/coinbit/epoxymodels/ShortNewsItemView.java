package com.binarybricks.coinbit.epoxymodels;

import java.lang.System;

@com.airbnb.epoxy.ModelView(autoLayout = com.airbnb.epoxy.ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/binarybricks/coinbit/epoxymodels/ShortNewsItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "clNewsArticleContainer", "Landroid/view/View;", "pbLoading", "Landroidx/core/widget/ContentLoadingProgressBar;", "tvNewsTitle", "Landroid/widget/TextView;", "setItemClickListener", "", "listener", "Landroid/view/View$OnClickListener;", "setNewsDate", "news", "", "ShortNewsModuleData", "app_debug"})
public final class ShortNewsItemView extends androidx.constraintlayout.widget.ConstraintLayout {
    private final androidx.core.widget.ContentLoadingProgressBar pbLoading = null;
    private final android.widget.TextView tvNewsTitle = null;
    private final android.view.View clNewsArticleContainer = null;
    private java.util.HashMap _$_findViewCache;
    
    @com.airbnb.epoxy.TextProp()
    public final void setNewsDate(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence news) {
    }
    
    @com.airbnb.epoxy.CallbackProp()
    public final void setItemClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener listener) {
    }
    
    public ShortNewsItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet, int defStyle) {
        super(null);
    }
    
    public ShortNewsItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    public ShortNewsItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/binarybricks/coinbit/epoxymodels/ShortNewsItemView$ShortNewsModuleData;", "Lcom/binarybricks/coinbit/featurecomponents/ModuleItem;", "news", "Lcom/binarybricks/coinbit/network/models/CryptoCompareNews;", "(Lcom/binarybricks/coinbit/network/models/CryptoCompareNews;)V", "getNews", "()Lcom/binarybricks/coinbit/network/models/CryptoCompareNews;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class ShortNewsModuleData implements com.binarybricks.coinbit.featurecomponents.ModuleItem {
        @org.jetbrains.annotations.NotNull()
        private final com.binarybricks.coinbit.network.models.CryptoCompareNews news = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.binarybricks.coinbit.network.models.CryptoCompareNews getNews() {
            return null;
        }
        
        public ShortNewsModuleData(@org.jetbrains.annotations.NotNull()
        com.binarybricks.coinbit.network.models.CryptoCompareNews news) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.binarybricks.coinbit.network.models.CryptoCompareNews component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.binarybricks.coinbit.epoxymodels.ShortNewsItemView.ShortNewsModuleData copy(@org.jetbrains.annotations.NotNull()
        com.binarybricks.coinbit.network.models.CryptoCompareNews news) {
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