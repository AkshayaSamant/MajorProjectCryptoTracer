package com.binarybricks.coinbit.features.coindetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001d"}, d2 = {"Lcom/binarybricks/coinbit/features/coindetails/CoinDetailsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "LCoinDetailsContract$View;", "()V", "coinDetailPresenter", "Lcom/binarybricks/coinbit/features/coindetails/CoinDetailPresenter;", "getCoinDetailPresenter", "()Lcom/binarybricks/coinbit/features/coindetails/CoinDetailPresenter;", "coinDetailPresenter$delegate", "Lkotlin/Lazy;", "coinRepo", "Lcom/binarybricks/coinbit/features/CryptoCompareRepository;", "getCoinRepo", "()Lcom/binarybricks/coinbit/features/CryptoCompareRepository;", "coinRepo$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNetworkError", "errorMessage", "", "onWatchedCoinLoaded", "coin", "Lcom/binarybricks/coinbit/data/database/entities/WatchedCoin;", "showOrHideLoadingIndicator", "showLoading", "", "Companion", "app_debug"})
public final class CoinDetailsActivity extends androidx.appcompat.app.AppCompatActivity implements CoinDetailsContract.View {
    private final kotlin.Lazy coinRepo$delegate = null;
    private final kotlin.Lazy coinDetailPresenter$delegate = null;
    private static final java.lang.String WATCHED_COIN = "WATCHED_COIN";
    private static final java.lang.String COIN_SYMBOL = "COIN_SYMBOL";
    @org.jetbrains.annotations.NotNull()
    public static final com.binarybricks.coinbit.features.coindetails.CoinDetailsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.binarybricks.coinbit.features.CryptoCompareRepository getCoinRepo() {
        return null;
    }
    
    private final com.binarybricks.coinbit.features.coindetails.CoinDetailPresenter getCoinDetailPresenter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onWatchedCoinLoaded(@org.jetbrains.annotations.Nullable()
    com.binarybricks.coinbit.data.database.entities.WatchedCoin coin) {
    }
    
    @java.lang.Override()
    public void showOrHideLoadingIndicator(boolean showLoading) {
    }
    
    @java.lang.Override()
    public void onNetworkError(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
    
    public CoinDetailsActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.Intent buildLaunchIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.data.database.entities.WatchedCoin watchedCoin) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.Intent buildLaunchIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String symbol) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/binarybricks/coinbit/features/coindetails/CoinDetailsActivity$Companion;", "", "()V", "COIN_SYMBOL", "", "WATCHED_COIN", "buildLaunchIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "watchedCoin", "Lcom/binarybricks/coinbit/data/database/entities/WatchedCoin;", "symbol", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent buildLaunchIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.binarybricks.coinbit.data.database.entities.WatchedCoin watchedCoin) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent buildLaunchIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String symbol) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}