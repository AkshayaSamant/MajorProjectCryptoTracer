package com.binarybricks.coinbit.features.newslist;

import java.lang.System;

/**
 * Created by Pragya Agrawal
 * Activity showing all news items
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\'"}, d2 = {"Lcom/binarybricks/coinbit/features/newslist/NewsListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "LCryptoNewsContract$View;", "()V", "androidResourceManager", "Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManager;", "getAndroidResourceManager", "()Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManager;", "androidResourceManager$delegate", "Lkotlin/Lazy;", "cryptoNewsPresenter", "Lcom/binarybricks/coinbit/featurecomponents/cryptonewsmodule/CryptoNewsPresenter;", "getCryptoNewsPresenter", "()Lcom/binarybricks/coinbit/featurecomponents/cryptonewsmodule/CryptoNewsPresenter;", "cryptoNewsPresenter$delegate", "cryptoNewsRepository", "Lcom/binarybricks/coinbit/featurecomponents/cryptonewsmodule/CryptoNewsRepository;", "getCryptoNewsRepository", "()Lcom/binarybricks/coinbit/featurecomponents/cryptonewsmodule/CryptoNewsRepository;", "cryptoNewsRepository$delegate", "formatter", "Lcom/binarybricks/coinbit/utils/Formaters;", "getFormatter", "()Lcom/binarybricks/coinbit/utils/Formaters;", "formatter$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNetworkError", "errorMessage", "", "onNewsLoaded", "cryptoPanicNews", "Lcom/binarybricks/coinbit/network/models/CryptoPanicNews;", "showOrHideLoadingIndicator", "showLoading", "", "Companion", "app_debug"})
public final class NewsListActivity extends androidx.appcompat.app.AppCompatActivity implements CryptoNewsContract.View {
    private final kotlin.Lazy cryptoNewsRepository$delegate = null;
    private final kotlin.Lazy cryptoNewsPresenter$delegate = null;
    private final kotlin.Lazy androidResourceManager$delegate = null;
    private final kotlin.Lazy formatter$delegate = null;
    private static final java.lang.String COIN_FULL_NAME = "COIN_FULL_NAME";
    private static final java.lang.String COIN_SYMBOL = "COIN_SYMBOL";
    @org.jetbrains.annotations.NotNull()
    public static final com.binarybricks.coinbit.features.newslist.NewsListActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.binarybricks.coinbit.featurecomponents.cryptonewsmodule.CryptoNewsRepository getCryptoNewsRepository() {
        return null;
    }
    
    private final com.binarybricks.coinbit.featurecomponents.cryptonewsmodule.CryptoNewsPresenter getCryptoNewsPresenter() {
        return null;
    }
    
    private final com.binarybricks.coinbit.utils.resourcemanager.AndroidResourceManager getAndroidResourceManager() {
        return null;
    }
    
    private final com.binarybricks.coinbit.utils.Formaters getFormatter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void showOrHideLoadingIndicator(boolean showLoading) {
    }
    
    @java.lang.Override()
    public void onNewsLoaded(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.network.models.CryptoPanicNews cryptoPanicNews) {
    }
    
    @java.lang.Override()
    public void onNetworkError(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
    
    public NewsListActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.Intent buildLaunchIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String coinName, @org.jetbrains.annotations.NotNull()
    java.lang.String coinSymbol) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/binarybricks/coinbit/features/newslist/NewsListActivity$Companion;", "", "()V", "COIN_FULL_NAME", "", "COIN_SYMBOL", "buildLaunchIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "coinName", "coinSymbol", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent buildLaunchIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String coinName, @org.jetbrains.annotations.NotNull()
        java.lang.String coinSymbol) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}