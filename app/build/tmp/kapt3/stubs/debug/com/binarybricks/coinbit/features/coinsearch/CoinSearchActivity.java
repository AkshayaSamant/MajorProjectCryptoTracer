package com.binarybricks.coinbit.features.coinsearch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0016\u0010\u0017\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\u0012\u0010\u001b\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0016H\u0016J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H\u0016J\u0016\u0010#\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\u0010\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0010H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/binarybricks/coinbit/features/coinsearch/CoinSearchActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "LCoinSearchContract$View;", "()V", "coinRepo", "Lcom/binarybricks/coinbit/features/CryptoCompareRepository;", "getCoinRepo", "()Lcom/binarybricks/coinbit/features/CryptoCompareRepository;", "coinRepo$delegate", "Lkotlin/Lazy;", "coinSearchPresenter", "Lcom/binarybricks/coinbit/features/coinsearch/CoinSearchPresenter;", "getCoinSearchPresenter", "()Lcom/binarybricks/coinbit/features/coinsearch/CoinSearchPresenter;", "coinSearchPresenter$delegate", "isCoinInfoChanged", "", "onBackPressed", "", "onCoinWatchedStatusUpdated", "watched", "coinSymbol", "", "onCoinsLoaded", "coinList", "", "Lcom/binarybricks/coinbit/data/database/entities/WatchedCoin;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNetworkError", "errorMessage", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "showCoinsInTheList", "showOrHideLoadingIndicator", "showLoading", "Companion", "app_debug"})
public final class CoinSearchActivity extends androidx.appcompat.app.AppCompatActivity implements CoinSearchContract.View {
    private boolean isCoinInfoChanged = false;
    private final kotlin.Lazy coinRepo$delegate = null;
    private final kotlin.Lazy coinSearchPresenter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.binarybricks.coinbit.features.coinsearch.CoinSearchActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.binarybricks.coinbit.features.CryptoCompareRepository getCoinRepo() {
        return null;
    }
    
    private final com.binarybricks.coinbit.features.coinsearch.CoinSearchPresenter getCoinSearchPresenter() {
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
    public void onNetworkError(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
    
    @java.lang.Override()
    public void onCoinsLoaded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin> coinList) {
    }
    
    private final void showCoinsInTheList(java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin> coinList) {
    }
    
    @java.lang.Override()
    public void onCoinWatchedStatusUpdated(boolean watched, @org.jetbrains.annotations.NotNull()
    java.lang.String coinSymbol) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public CoinSearchActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.Intent buildLaunchIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/binarybricks/coinbit/features/coinsearch/CoinSearchActivity$Companion;", "", "()V", "buildLaunchIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent buildLaunchIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}