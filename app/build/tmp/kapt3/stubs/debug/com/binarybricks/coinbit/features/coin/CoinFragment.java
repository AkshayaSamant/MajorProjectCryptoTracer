package com.binarybricks.coinbit.features.coin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00d8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 n2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001nB\u0005\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010@\u001a\u00020A2\u0006\u00104\u001a\u0002052\u0006\u0010B\u001a\u000205H\u0002J\u0010\u0010C\u001a\u00020A2\u0006\u00104\u001a\u000205H\u0002J\u001a\u0010D\u001a\u00020A2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010<\u001a\u00020=H\u0016J\u0018\u0010E\u001a\u00020A2\u0006\u0010F\u001a\u0002052\u0006\u0010G\u001a\u000208H\u0016J\u0018\u0010H\u001a\u00020A2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020LH\u0016J&\u0010M\u001a\u0004\u0018\u00010N2\u0006\u0010K\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010Q2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J,\u0010T\u001a\u00020A2\u0006\u0010U\u001a\u0002082\u001a\u0010V\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0X\u0012\u0006\u0012\u0004\u0018\u00010Y0WH\u0016J\u0010\u0010Z\u001a\u00020A2\u0006\u0010[\u001a\u000208H\u0016J\u0010\u0010\\\u001a\u00020A2\u0006\u0010]\u001a\u00020^H\u0016J\u0010\u0010_\u001a\u0002052\u0006\u0010`\u001a\u00020?H\u0016J\u0016\u0010a\u001a\u00020A2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020c0XH\u0016J\u0016\u0010d\u001a\u00020A2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020f0XH\u0016J\u001a\u0010g\u001a\u00020A2\u0006\u0010h\u001a\u00020N2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\u0016\u0010i\u001a\u00020A2\f\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00130XH\u0002J\u0010\u0010k\u001a\u00020A2\u0006\u0010l\u001a\u000205H\u0016J\u0010\u0010m\u001a\u00020A2\u0006\u0010l\u001a\u000205H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\u000b\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\u000b\u001a\u0004\b\'\u0010(R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010\u000b\u001a\u0004\b,\u0010-R\u001b\u0010/\u001a\u0002008BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b3\u0010\u000b\u001a\u0004\b1\u00102R\u000e\u00104\u001a\u000205X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000205X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u00107\u001a\u0002088BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b;\u0010\u000b\u001a\u0004\b9\u0010:R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006o"}, d2 = {"Lcom/binarybricks/coinbit/features/coin/CoinFragment;", "Landroidx/fragment/app/Fragment;", "LCoinContract$View;", "LCryptoNewsContract$View;", "LCoinTickerContract$View;", "()V", "androidResourceManager", "Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManager;", "getAndroidResourceManager", "()Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManager;", "androidResourceManager$delegate", "Lkotlin/Lazy;", "chartRepo", "Lcom/binarybricks/coinbit/featurecomponents/historicalchartmodule/ChartRepository;", "getChartRepo", "()Lcom/binarybricks/coinbit/featurecomponents/historicalchartmodule/ChartRepository;", "chartRepo$delegate", "coinDetailList", "", "Lcom/binarybricks/coinbit/featurecomponents/ModuleItem;", "coinPresenter", "Lcom/binarybricks/coinbit/features/coin/CoinPresenter;", "getCoinPresenter", "()Lcom/binarybricks/coinbit/features/coin/CoinPresenter;", "coinPresenter$delegate", "coinPrice", "Lcom/binarybricks/coinbit/network/models/CoinPrice;", "coinRepo", "Lcom/binarybricks/coinbit/features/CryptoCompareRepository;", "getCoinRepo", "()Lcom/binarybricks/coinbit/features/CryptoCompareRepository;", "coinRepo$delegate", "coinTickerPresenter", "Lcom/binarybricks/coinbit/featurecomponents/cointickermodule/CoinTickerPresenter;", "getCoinTickerPresenter", "()Lcom/binarybricks/coinbit/featurecomponents/cointickermodule/CoinTickerPresenter;", "coinTickerPresenter$delegate", "coinTickerRepository", "Lcom/binarybricks/coinbit/featurecomponents/cointickermodule/CoinTickerRepository;", "getCoinTickerRepository", "()Lcom/binarybricks/coinbit/featurecomponents/cointickermodule/CoinTickerRepository;", "coinTickerRepository$delegate", "cryptoNewsPresenter", "Lcom/binarybricks/coinbit/featurecomponents/cryptonewsmodule/CryptoNewsPresenter;", "getCryptoNewsPresenter", "()Lcom/binarybricks/coinbit/featurecomponents/cryptonewsmodule/CryptoNewsPresenter;", "cryptoNewsPresenter$delegate", "cryptoNewsRepository", "Lcom/binarybricks/coinbit/featurecomponents/cryptonewsmodule/CryptoNewsRepository;", "getCryptoNewsRepository", "()Lcom/binarybricks/coinbit/featurecomponents/cryptonewsmodule/CryptoNewsRepository;", "cryptoNewsRepository$delegate", "isCoinWatched", "", "isCoinedPurchased", "toCurrency", "", "getToCurrency", "()Ljava/lang/String;", "toCurrency$delegate", "watchedCoin", "Lcom/binarybricks/coinbit/data/database/entities/WatchedCoin;", "watchedMenuItem", "Landroid/view/MenuItem;", "changeCoinMenu", "", "isCoinPurchased", "changeCoinWatchedStatus", "onCoinPriceLoaded", "onCoinWatchedStatusUpdated", "watched", "coinSymbol", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onHistoricalDataLoaded", "period", "historicalDataPair", "Lkotlin/Pair;", "", "Lcom/binarybricks/coinbit/network/models/CryptoCompareHistoricalResponse$Data;", "onNetworkError", "errorMessage", "onNewsLoaded", "cryptoPanicNews", "Lcom/binarybricks/coinbit/network/models/CryptoPanicNews;", "onOptionsItemSelected", "item", "onPriceTickersLoaded", "tickerData", "Lcom/binarybricks/coinbit/network/models/CryptoTicker;", "onRecentTransactionLoaded", "coinTransactionList", "Lcom/binarybricks/coinbit/data/database/entities/CoinTransaction;", "onViewCreated", "view", "showCoinDataInView", "detailList", "showOrHideLoadingIndicator", "showLoading", "showOrHideLoadingIndicatorForTicker", "Companion", "app_debug"})
public final class CoinFragment extends androidx.fragment.app.Fragment implements CoinContract.View, CryptoNewsContract.View, CoinTickerContract.View {
    private final java.util.List<com.binarybricks.coinbit.featurecomponents.ModuleItem> coinDetailList = null;
    private com.binarybricks.coinbit.network.models.CoinPrice coinPrice;
    private android.view.MenuItem watchedMenuItem;
    private boolean isCoinWatched = false;
    private boolean isCoinedPurchased = false;
    private com.binarybricks.coinbit.data.database.entities.WatchedCoin watchedCoin;
    private final kotlin.Lazy coinRepo$delegate = null;
    private final kotlin.Lazy chartRepo$delegate = null;
    private final kotlin.Lazy coinPresenter$delegate = null;
    private final kotlin.Lazy cryptoNewsRepository$delegate = null;
    private final kotlin.Lazy cryptoNewsPresenter$delegate = null;
    private final kotlin.Lazy coinTickerRepository$delegate = null;
    private final kotlin.Lazy coinTickerPresenter$delegate = null;
    private final kotlin.Lazy androidResourceManager$delegate = null;
    private final kotlin.Lazy toCurrency$delegate = null;
    private static final java.lang.String WATCHED_COIN = "WATCHED_COIN";
    @org.jetbrains.annotations.NotNull()
    public static final com.binarybricks.coinbit.features.coin.CoinFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.binarybricks.coinbit.features.CryptoCompareRepository getCoinRepo() {
        return null;
    }
    
    private final com.binarybricks.coinbit.featurecomponents.historicalchartmodule.ChartRepository getChartRepo() {
        return null;
    }
    
    private final com.binarybricks.coinbit.features.coin.CoinPresenter getCoinPresenter() {
        return null;
    }
    
    private final com.binarybricks.coinbit.featurecomponents.cryptonewsmodule.CryptoNewsRepository getCryptoNewsRepository() {
        return null;
    }
    
    private final com.binarybricks.coinbit.featurecomponents.cryptonewsmodule.CryptoNewsPresenter getCryptoNewsPresenter() {
        return null;
    }
    
    private final com.binarybricks.coinbit.featurecomponents.cointickermodule.CoinTickerRepository getCoinTickerRepository() {
        return null;
    }
    
    private final com.binarybricks.coinbit.featurecomponents.cointickermodule.CoinTickerPresenter getCoinTickerPresenter() {
        return null;
    }
    
    private final com.binarybricks.coinbit.utils.resourcemanager.AndroidResourceManager getAndroidResourceManager() {
        return null;
    }
    
    private final java.lang.String getToCurrency() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void changeCoinWatchedStatus(boolean isCoinWatched) {
    }
    
    private final void changeCoinMenu(boolean isCoinWatched, boolean isCoinPurchased) {
    }
    
    @java.lang.Override()
    public void onCoinWatchedStatusUpdated(boolean watched, @org.jetbrains.annotations.NotNull()
    java.lang.String coinSymbol) {
    }
    
    @java.lang.Override()
    public void showOrHideLoadingIndicator(boolean showLoading) {
    }
    
    @java.lang.Override()
    public void showOrHideLoadingIndicatorForTicker(boolean showLoading) {
    }
    
    @java.lang.Override()
    public void onNetworkError(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
    
    @java.lang.Override()
    public void onCoinPriceLoaded(@org.jetbrains.annotations.Nullable()
    com.binarybricks.coinbit.network.models.CoinPrice coinPrice, @org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.data.database.entities.WatchedCoin watchedCoin) {
    }
    
    @java.lang.Override()
    public void onHistoricalDataLoaded(@org.jetbrains.annotations.NotNull()
    java.lang.String period, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends java.util.List<com.binarybricks.coinbit.network.models.CryptoCompareHistoricalResponse.Data>, com.binarybricks.coinbit.network.models.CryptoCompareHistoricalResponse.Data> historicalDataPair) {
    }
    
    private final void showCoinDataInView(java.util.List<? extends com.binarybricks.coinbit.featurecomponents.ModuleItem> detailList) {
    }
    
    @java.lang.Override()
    public void onNewsLoaded(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.network.models.CryptoPanicNews cryptoPanicNews) {
    }
    
    @java.lang.Override()
    public void onPriceTickersLoaded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.binarybricks.coinbit.network.models.CryptoTicker> tickerData) {
    }
    
    @java.lang.Override()
    public void onRecentTransactionLoaded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.binarybricks.coinbit.data.database.entities.CoinTransaction> coinTransactionList) {
    }
    
    public CoinFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.os.Bundle getArgumentBundle(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.data.database.entities.WatchedCoin watchedCoin) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/binarybricks/coinbit/features/coin/CoinFragment$Companion;", "", "()V", "WATCHED_COIN", "", "getArgumentBundle", "Landroid/os/Bundle;", "watchedCoin", "Lcom/binarybricks/coinbit/data/database/entities/WatchedCoin;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.os.Bundle getArgumentBundle(@org.jetbrains.annotations.NotNull()
        com.binarybricks.coinbit.data.database.entities.WatchedCoin watchedCoin) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}