package com.binarybricks.coinbit.epoxymodels;

import java.lang.System;

@com.airbnb.epoxy.ModelView(autoLayout = com.airbnb.epoxy.ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0014H\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/binarybricks/coinbit/epoxymodels/NewsItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "clArticle", "Landroid/view/View;", "date", "Landroid/widget/TextView;", "title", "setItemClickListener", "", "listener", "Landroid/view/View$OnClickListener;", "setNewsDate", "formattedDate", "", "setTitle", "newsTitle", "app_debug"})
public final class NewsItemView extends androidx.constraintlayout.widget.ConstraintLayout {
    private final android.widget.TextView title = null;
    private final android.widget.TextView date = null;
    private final android.view.View clArticle = null;
    private java.util.HashMap _$_findViewCache;
    
    @com.airbnb.epoxy.TextProp()
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence newsTitle) {
    }
    
    @com.airbnb.epoxy.TextProp()
    public final void setNewsDate(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence formattedDate) {
    }
    
    @com.airbnb.epoxy.CallbackProp()
    public final void setItemClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener listener) {
    }
    
    public NewsItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet, int defStyle) {
        super(null);
    }
    
    public NewsItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    public NewsItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}