package com.binarybricks.coinbit.epoxymodels;

import java.lang.System;

@com.airbnb.epoxy.ModelView(autoLayout = com.airbnb.epoxy.ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/binarybricks/coinbit/epoxymodels/GenericFooterItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "tvFooter", "Landroid/widget/TextView;", "setFooterContent", "", "footerModuleData", "Lcom/binarybricks/coinbit/epoxymodels/GenericFooterItemView$FooterModuleData;", "FooterModuleData", "app_debug"})
public final class GenericFooterItemView extends androidx.constraintlayout.widget.ConstraintLayout {
    private final android.widget.TextView tvFooter = null;
    private java.util.HashMap _$_findViewCache;
    
    @com.airbnb.epoxy.ModelProp(options = {com.airbnb.epoxy.ModelProp.Option.IgnoreRequireHashCode})
    public final void setFooterContent(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.epoxymodels.GenericFooterItemView.FooterModuleData footerModuleData) {
    }
    
    public GenericFooterItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet, int defStyle) {
        super(null);
    }
    
    public GenericFooterItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    public GenericFooterItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/binarybricks/coinbit/epoxymodels/GenericFooterItemView$FooterModuleData;", "Lcom/binarybricks/coinbit/featurecomponents/ModuleItem;", "footerText", "", "footerUrlLink", "(Ljava/lang/String;Ljava/lang/String;)V", "getFooterText", "()Ljava/lang/String;", "getFooterUrlLink", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class FooterModuleData implements com.binarybricks.coinbit.featurecomponents.ModuleItem {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String footerText = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String footerUrlLink = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFooterText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFooterUrlLink() {
            return null;
        }
        
        public FooterModuleData(@org.jetbrains.annotations.NotNull()
        java.lang.String footerText, @org.jetbrains.annotations.NotNull()
        java.lang.String footerUrlLink) {
            super();
        }
        
        public FooterModuleData() {
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
        public final com.binarybricks.coinbit.epoxymodels.GenericFooterItemView.FooterModuleData copy(@org.jetbrains.annotations.NotNull()
        java.lang.String footerText, @org.jetbrains.annotations.NotNull()
        java.lang.String footerUrlLink) {
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