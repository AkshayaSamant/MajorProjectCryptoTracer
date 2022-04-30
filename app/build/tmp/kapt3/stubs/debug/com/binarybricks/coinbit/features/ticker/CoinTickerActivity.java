package com.binarybricks.coinbit.features.ticker;

import java.lang.System;

/**
 * Created by Pranay Airan
 * Activity showing all ticker data
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0016J\u0016\u0010%\u001a\u00020\u001f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0\'H\u0016J\u0010\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020+H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006-"}, d2 = {"Lcom/binarybricks/coinbit/features/ticker/CoinTickerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "LCoinTickerContract$View;", "()V", "androidResourceManager", "Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManagerImpl;", "getAndroidResourceManager", "()Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManagerImpl;", "androidResourceManager$delegate", "Lkotlin/Lazy;", "coinTickerPresenter", "Lcom/binarybricks/coinbit/featurecomponents/cointickermodule/CoinTickerPresenter;", "getCoinTickerPresenter", "()Lcom/binarybricks/coinbit/featurecomponents/cointickermodule/CoinTickerPresenter;", "coinTickerPresenter$delegate", "coinTickerRepository", "Lcom/binarybricks/coinbit/featurecomponents/cointickermodule/CoinTickerRepository;", "getCoinTickerRepository", "()Lcom/binarybricks/coinbit/featurecomponents/cointickermodule/CoinTickerRepository;", "coinTickerRepository$delegate", "currency", "Ljava/util/Currency;", "getCurrency", "()Ljava/util/Currency;", "currency$delegate", "formatter", "Lcom/binarybricks/coinbit/utils/Formaters;", "getFormatter", "()Lcom/binarybricks/coinbit/utils/Formaters;", "formatter$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNetworkError", "errorMessage", "", "onPriceTickersLoaded", "tickerData", "", "Lcom/binarybricks/coinbit/network/models/CryptoTicker;", "showOrHideLoadingIndicatorForTicker", "showLoading", "", "Companion", "app_debug"})
public final class CoinTickerActivity extends androidx.appcompat.app.AppCompatActivity implements CoinTickerContract.View {
    private final kotlin.Lazy coinTickerRepository$delegate = null;
    private final kotlin.Lazy androidResourceManager$delegate = null;
    private final kotlin.Lazy formatter$delegate = null;
    private final kotlin.Lazy coinTickerPresenter$delegate = null;
    private final kotlin.Lazy currency$delegate = null;
    private static final java.lang.String COIN_NAME = "COIN_FULL_NAME";
    @org.jetbrains.annotations.NotNull()
    public static final com.binarybricks.coinbit.features.ticker.CoinTickerActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.binarybricks.coinbit.featurecomponents.cointickermodule.CoinTickerRepository getCoinTickerRepository() {
        return null;
    }
    
    private final com.binarybricks.coinbit.utils.resourcemanager.AndroidResourceManagerImpl getAndroidResourceManager() {
        return null;
    }
    
    private final com.binarybricks.coinbit.utils.Formaters getFormatter() {
        return null;
    }
    
    private final com.binarybricks.coinbit.featurecomponents.cointickermodule.CoinTickerPresenter getCoinTickerPresenter() {
        return null;
    }
    
    private final java.util.Currency getCurrency() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void showOrHideLoadingIndicatorForTicker(boolean showLoading) {
    }
    
    @java.lang.Override()
    public void onPriceTickersLoaded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.binarybricks.coinbit.network.models.CryptoTicker> tickerData) {
    }
    
    @java.lang.Override()
    public void onNetworkError(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
    
    public CoinTickerActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.Intent buildLaunchIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String coinName) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/binarybricks/coinbit/features/ticker/CoinTickerActivity$Companion;", "", "()V", "COIN_NAME", "", "buildLaunchIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "coinName", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent buildLaunchIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String coinName) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}