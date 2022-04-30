package com.binarybricks.coinbit.epoxymodels;

import java.lang.System;

@com.airbnb.epoxy.ModelView(autoLayout = com.airbnb.epoxy.ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0015"}, d2 = {"Lcom/binarybricks/coinbit/epoxymodels/CoinNewsItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "androidResourceManager", "Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManager;", "getAndroidResourceManager", "()Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManager;", "androidResourceManager$delegate", "Lkotlin/Lazy;", "formaters", "Lcom/binarybricks/coinbit/utils/Formaters;", "getFormaters", "()Lcom/binarybricks/coinbit/utils/Formaters;", "formaters$delegate", "CoinNewsItemModuleData", "app_debug"})
public final class CoinNewsItemView extends androidx.constraintlayout.widget.ConstraintLayout {
    private final kotlin.Lazy androidResourceManager$delegate = null;
    private final kotlin.Lazy formaters$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.binarybricks.coinbit.utils.resourcemanager.AndroidResourceManager getAndroidResourceManager() {
        return null;
    }
    
    private final com.binarybricks.coinbit.utils.Formaters getFormaters() {
        return null;
    }
    
    public CoinNewsItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet, int defStyle) {
        super(null);
    }
    
    public CoinNewsItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    public CoinNewsItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/binarybricks/coinbit/epoxymodels/CoinNewsItemView$CoinNewsItemModuleData;", "Lcom/binarybricks/coinbit/featurecomponents/ModuleItem;", "cryptoPanicNews", "Lcom/binarybricks/coinbit/network/models/CryptoPanicNews;", "(Lcom/binarybricks/coinbit/network/models/CryptoPanicNews;)V", "getCryptoPanicNews", "()Lcom/binarybricks/coinbit/network/models/CryptoPanicNews;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class CoinNewsItemModuleData implements com.binarybricks.coinbit.featurecomponents.ModuleItem {
        @org.jetbrains.annotations.NotNull()
        private final com.binarybricks.coinbit.network.models.CryptoPanicNews cryptoPanicNews = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.binarybricks.coinbit.network.models.CryptoPanicNews getCryptoPanicNews() {
            return null;
        }
        
        public CoinNewsItemModuleData(@org.jetbrains.annotations.NotNull()
        com.binarybricks.coinbit.network.models.CryptoPanicNews cryptoPanicNews) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.binarybricks.coinbit.network.models.CryptoPanicNews component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.binarybricks.coinbit.epoxymodels.CoinNewsItemView.CoinNewsItemModuleData copy(@org.jetbrains.annotations.NotNull()
        com.binarybricks.coinbit.network.models.CryptoPanicNews cryptoPanicNews) {
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