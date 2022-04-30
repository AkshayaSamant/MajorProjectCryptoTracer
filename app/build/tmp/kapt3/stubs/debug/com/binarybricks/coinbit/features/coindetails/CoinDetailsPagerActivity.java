package com.binarybricks.coinbit.features.coindetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\u00172\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0010H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/binarybricks/coinbit/features/coindetails/CoinDetailsPagerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "LCoinDetailsPagerContract$View;", "()V", "allCoinDetailsRepository", "Lcom/binarybricks/coinbit/features/coindetails/CoinDetailsPagerRepository;", "getAllCoinDetailsRepository", "()Lcom/binarybricks/coinbit/features/coindetails/CoinDetailsPagerRepository;", "allCoinDetailsRepository$delegate", "Lkotlin/Lazy;", "coinDetailPagerPresenter", "Lcom/binarybricks/coinbit/features/coindetails/CoinDetailPagerPresenter;", "getCoinDetailPagerPresenter", "()Lcom/binarybricks/coinbit/features/coindetails/CoinDetailPagerPresenter;", "coinDetailPagerPresenter$delegate", "isCoinInfoChanged", "", "()Z", "setCoinInfoChanged", "(Z)V", "watchedCoin", "Lcom/binarybricks/coinbit/data/database/entities/WatchedCoin;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNetworkError", "errorMessage", "", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onWatchedCoinsLoaded", "watchedCoinList", "", "showOrHideLoadingIndicator", "showLoading", "Companion", "app_debug"})
public final class CoinDetailsPagerActivity extends androidx.appcompat.app.AppCompatActivity implements CoinDetailsPagerContract.View {
    private com.binarybricks.coinbit.data.database.entities.WatchedCoin watchedCoin;
    private boolean isCoinInfoChanged = false;
    private final kotlin.Lazy allCoinDetailsRepository$delegate = null;
    private final kotlin.Lazy coinDetailPagerPresenter$delegate = null;
    private static final java.lang.String WATCHED_COIN = "WATCHED_COIN";
    @org.jetbrains.annotations.NotNull()
    public static final com.binarybricks.coinbit.features.coindetails.CoinDetailsPagerActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean isCoinInfoChanged() {
        return false;
    }
    
    public final void setCoinInfoChanged(boolean p0) {
    }
    
    private final com.binarybricks.coinbit.features.coindetails.CoinDetailsPagerRepository getAllCoinDetailsRepository() {
        return null;
    }
    
    private final com.binarybricks.coinbit.features.coindetails.CoinDetailPagerPresenter getCoinDetailPagerPresenter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onWatchedCoinsLoaded(@org.jetbrains.annotations.Nullable()
    java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin> watchedCoinList) {
    }
    
    @java.lang.Override()
    public void onNetworkError(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
    
    private final void showOrHideLoadingIndicator(boolean showLoading) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public CoinDetailsPagerActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.Intent buildLaunchIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.data.database.entities.WatchedCoin watchedCoin) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/binarybricks/coinbit/features/coindetails/CoinDetailsPagerActivity$Companion;", "", "()V", "WATCHED_COIN", "", "buildLaunchIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "watchedCoin", "Lcom/binarybricks/coinbit/data/database/entities/WatchedCoin;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent buildLaunchIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.binarybricks.coinbit.data.database.entities.WatchedCoin watchedCoin) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}