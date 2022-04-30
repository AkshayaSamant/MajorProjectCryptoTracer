package com.binarybricks.coinbit.features.dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0002FGB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010%\u001a\u00020&H\u0002J\u0010\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0002J\"\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0016\u00100\u001a\u00020&2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u001aH\u0016J\u001c\u00101\u001a\u00020&2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020503H\u0016J&\u00106\u001a\u0004\u0018\u00010)2\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\b\u0010=\u001a\u00020&H\u0016J\u0010\u0010>\u001a\u00020&2\u0006\u0010?\u001a\u000204H\u0016J\u0016\u0010@\u001a\u00020&2\f\u0010A\u001a\b\u0012\u0004\u0012\u0002050\u001aH\u0016J$\u0010B\u001a\u00020&2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J$\u0010C\u001a\u00020&2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0016\u0010D\u001a\u00020&2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\f0\u001aH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\t\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006H"}, d2 = {"Lcom/binarybricks/coinbit/features/dashboard/CoinDashboardFragment;", "Landroidx/fragment/app/Fragment;", "LCoinDashboardContract$View;", "()V", "androidResourceManager", "Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManager;", "getAndroidResourceManager", "()Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManager;", "androidResourceManager$delegate", "Lkotlin/Lazy;", "coinDashboardList", "", "Lcom/binarybricks/coinbit/featurecomponents/ModuleItem;", "coinDashboardPresenter", "Lcom/binarybricks/coinbit/features/dashboard/CoinDashboardPresenter;", "getCoinDashboardPresenter", "()Lcom/binarybricks/coinbit/features/dashboard/CoinDashboardPresenter;", "coinDashboardPresenter$delegate", "coinNews", "Lcom/binarybricks/coinbit/network/models/CryptoCompareNews;", "coinRepo", "Lcom/binarybricks/coinbit/features/CryptoCompareRepository;", "getCoinRepo", "()Lcom/binarybricks/coinbit/features/CryptoCompareRepository;", "coinRepo$delegate", "coinTransactionList", "", "Lcom/binarybricks/coinbit/data/database/entities/CoinTransaction;", "dashboardRepository", "Lcom/binarybricks/coinbit/features/dashboard/DashboardRepository;", "getDashboardRepository", "()Lcom/binarybricks/coinbit/features/dashboard/DashboardRepository;", "dashboardRepository$delegate", "rvDashboard", "Lcom/airbnb/epoxy/EpoxyRecyclerView;", "watchedCoinList", "Lcom/binarybricks/coinbit/data/database/entities/WatchedCoin;", "getAllWatchedCoinsPrice", "", "initializeUI", "inflatedView", "Landroid/view/View;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCoinNewsLoaded", "onCoinPricesLoaded", "coinPriceListMap", "Ljava/util/HashMap;", "", "Lcom/binarybricks/coinbit/network/models/CoinPrice;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onNetworkError", "errorMessage", "onTopCoinsByTotalVolumeLoaded", "topCoins", "onWatchedCoinsAndTransactionsLoaded", "setupDashBoardAdapter", "showDashboardData", "coinList", "Companion", "TopCardList", "app_debug"})
public final class CoinDashboardFragment extends androidx.fragment.app.Fragment implements CoinDashboardContract.View {
    private java.util.List<com.binarybricks.coinbit.featurecomponents.ModuleItem> coinDashboardList;
    private java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin> watchedCoinList;
    private java.util.List<com.binarybricks.coinbit.data.database.entities.CoinTransaction> coinTransactionList;
    private final kotlin.Lazy androidResourceManager$delegate = null;
    private final kotlin.Lazy dashboardRepository$delegate = null;
    private final kotlin.Lazy coinRepo$delegate = null;
    private final kotlin.Lazy coinDashboardPresenter$delegate = null;
    private final java.util.List<com.binarybricks.coinbit.network.models.CryptoCompareNews> coinNews = null;
    private com.airbnb.epoxy.EpoxyRecyclerView rvDashboard;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "CoinDashboardFragment";
    private static final int COIN_SEARCH_CODE = 100;
    private static final int COIN_DETAILS_CODE = 101;
    @org.jetbrains.annotations.NotNull()
    public static final com.binarybricks.coinbit.features.dashboard.CoinDashboardFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.binarybricks.coinbit.utils.resourcemanager.AndroidResourceManager getAndroidResourceManager() {
        return null;
    }
    
    private final com.binarybricks.coinbit.features.dashboard.DashboardRepository getDashboardRepository() {
        return null;
    }
    
    private final com.binarybricks.coinbit.features.CryptoCompareRepository getCoinRepo() {
        return null;
    }
    
    private final com.binarybricks.coinbit.features.dashboard.CoinDashboardPresenter getCoinDashboardPresenter() {
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
    
    private final void initializeUI(android.view.View inflatedView) {
    }
    
    @java.lang.Override()
    public void onWatchedCoinsAndTransactionsLoaded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin> watchedCoinList, @org.jetbrains.annotations.NotNull()
    java.util.List<com.binarybricks.coinbit.data.database.entities.CoinTransaction> coinTransactionList) {
    }
    
    private final void setupDashBoardAdapter(java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin> watchedCoinList, java.util.List<com.binarybricks.coinbit.data.database.entities.CoinTransaction> coinTransactionList) {
    }
    
    private final void getAllWatchedCoinsPrice() {
    }
    
    @java.lang.Override()
    public void onCoinPricesLoaded(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, com.binarybricks.coinbit.network.models.CoinPrice> coinPriceListMap) {
    }
    
    @java.lang.Override()
    public void onTopCoinsByTotalVolumeLoaded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.binarybricks.coinbit.network.models.CoinPrice> topCoins) {
    }
    
    @java.lang.Override()
    public void onCoinNewsLoaded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.binarybricks.coinbit.network.models.CryptoCompareNews> coinNews) {
    }
    
    private final void showDashboardData(java.util.List<? extends com.binarybricks.coinbit.featurecomponents.ModuleItem> coinList) {
    }
    
    @java.lang.Override()
    public void onNetworkError(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public CoinDashboardFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/binarybricks/coinbit/features/dashboard/CoinDashboardFragment$TopCardList;", "Lcom/binarybricks/coinbit/featurecomponents/ModuleItem;", "topCardList", "", "Lcom/binarybricks/coinbit/epoxymodels/TopCardItemView$TopCardsModuleData;", "(Ljava/util/List;)V", "getTopCardList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    static final class TopCardList implements com.binarybricks.coinbit.featurecomponents.ModuleItem {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.binarybricks.coinbit.epoxymodels.TopCardItemView.TopCardsModuleData> topCardList = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.binarybricks.coinbit.epoxymodels.TopCardItemView.TopCardsModuleData> getTopCardList() {
            return null;
        }
        
        public TopCardList(@org.jetbrains.annotations.NotNull()
        java.util.List<com.binarybricks.coinbit.epoxymodels.TopCardItemView.TopCardsModuleData> topCardList) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.binarybricks.coinbit.epoxymodels.TopCardItemView.TopCardsModuleData> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.binarybricks.coinbit.features.dashboard.CoinDashboardFragment.TopCardList copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.binarybricks.coinbit.epoxymodels.TopCardItemView.TopCardsModuleData> topCardList) {
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
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/binarybricks/coinbit/features/dashboard/CoinDashboardFragment$Companion;", "", "()V", "COIN_DETAILS_CODE", "", "COIN_SEARCH_CODE", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}