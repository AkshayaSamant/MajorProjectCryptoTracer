package com.binarybricks.coinbit.epoxymodels;

import java.lang.System;

@com.airbnb.epoxy.ModelView(autoLayout = com.airbnb.epoxy.ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/binarybricks/coinbit/epoxymodels/EmptyCoinItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "btnAddTransaction", "Landroid/widget/Button;", "tvEmptyMessage", "Landroid/widget/TextView;", "setEmptyCardData", "", "dashboardEmptyCoinModuleData", "Lcom/binarybricks/coinbit/epoxymodels/EmptyCoinItemView$DashboardEmptyCoinModuleData;", "setItemClickListener", "listener", "Landroid/view/View$OnClickListener;", "DashboardEmptyCoinModuleData", "app_debug"})
public final class EmptyCoinItemView extends androidx.constraintlayout.widget.ConstraintLayout {
    private final android.widget.TextView tvEmptyMessage = null;
    private final android.widget.Button btnAddTransaction = null;
    private java.util.HashMap _$_findViewCache;
    
    @com.airbnb.epoxy.ModelProp()
    public final void setEmptyCardData(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.epoxymodels.EmptyCoinItemView.DashboardEmptyCoinModuleData dashboardEmptyCoinModuleData) {
    }
    
    @com.airbnb.epoxy.CallbackProp()
    public final void setItemClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener listener) {
    }
    
    public EmptyCoinItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet, int defStyle) {
        super(null);
    }
    
    public EmptyCoinItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    public EmptyCoinItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/binarybricks/coinbit/epoxymodels/EmptyCoinItemView$DashboardEmptyCoinModuleData;", "Lcom/binarybricks/coinbit/featurecomponents/ModuleItem;", "emptySpaceText", "", "ctaButtonText", "(Ljava/lang/String;Ljava/lang/String;)V", "getCtaButtonText", "()Ljava/lang/String;", "getEmptySpaceText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class DashboardEmptyCoinModuleData implements com.binarybricks.coinbit.featurecomponents.ModuleItem {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String emptySpaceText = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String ctaButtonText = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEmptySpaceText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCtaButtonText() {
            return null;
        }
        
        public DashboardEmptyCoinModuleData(@org.jetbrains.annotations.NotNull()
        java.lang.String emptySpaceText, @org.jetbrains.annotations.NotNull()
        java.lang.String ctaButtonText) {
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
        public final com.binarybricks.coinbit.epoxymodels.EmptyCoinItemView.DashboardEmptyCoinModuleData copy(@org.jetbrains.annotations.NotNull()
        java.lang.String emptySpaceText, @org.jetbrains.annotations.NotNull()
        java.lang.String ctaButtonText) {
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