package com.binarybricks.coinbit.features.coinsearch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0002;<B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0016J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J&\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010$\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020\u001dH\u0016J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0019H\u0016J\u0016\u00104\u001a\u00020\u001d2\f\u00105\u001a\b\u0012\u0004\u0012\u0002060\u001fH\u0016J\u0016\u00107\u001a\u00020\u001d2\f\u00108\u001a\b\u0012\u0004\u0012\u0002090\u001fH\u0016J\u0016\u0010:\u001a\u00020\u001d2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u001fH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lcom/binarybricks/coinbit/features/coinsearch/CoinDiscoveryFragment;", "Landroidx/fragment/app/Fragment;", "LCoinDiscoveryContract$View;", "()V", "androidResourceManager", "Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManager;", "getAndroidResourceManager", "()Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManager;", "androidResourceManager$delegate", "Lkotlin/Lazy;", "coinDiscoveryList", "Ljava/util/ArrayList;", "Lcom/binarybricks/coinbit/featurecomponents/ModuleItem;", "Lkotlin/collections/ArrayList;", "coinDiscoveryPresenter", "Lcom/binarybricks/coinbit/features/coinsearch/CoinDiscoveryPresenter;", "getCoinDiscoveryPresenter", "()Lcom/binarybricks/coinbit/features/coinsearch/CoinDiscoveryPresenter;", "coinDiscoveryPresenter$delegate", "coinRepo", "Lcom/binarybricks/coinbit/features/CryptoCompareRepository;", "getCoinRepo", "()Lcom/binarybricks/coinbit/features/CryptoCompareRepository;", "coinRepo$delegate", "nextMenuItem", "Landroid/view/MenuItem;", "rvDashboard", "Lcom/airbnb/epoxy/EpoxyRecyclerView;", "onCoinNewsLoaded", "", "coinNews", "", "Lcom/binarybricks/coinbit/network/models/CryptoCompareNews;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onNetworkError", "errorMessage", "", "onOptionsItemSelected", "", "item", "onTopCoinListByPairVolumeLoaded", "topPair", "Lcom/binarybricks/coinbit/network/models/CoinPair;", "onTopCoinsByTotalVolumeLoaded", "topCoins", "Lcom/binarybricks/coinbit/network/models/CoinPrice;", "showCoins", "Companion", "TopCardList", "app_debug"})
public final class CoinDiscoveryFragment extends androidx.fragment.app.Fragment implements CoinDiscoveryContract.View {
    private android.view.MenuItem nextMenuItem;
    private java.util.ArrayList<com.binarybricks.coinbit.featurecomponents.ModuleItem> coinDiscoveryList;
    private final kotlin.Lazy androidResourceManager$delegate = null;
    private final kotlin.Lazy coinRepo$delegate = null;
    private final kotlin.Lazy coinDiscoveryPresenter$delegate = null;
    private com.airbnb.epoxy.EpoxyRecyclerView rvDashboard;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "CoinDiscoveryFragment";
    @org.jetbrains.annotations.NotNull()
    public static final com.binarybricks.coinbit.features.coinsearch.CoinDiscoveryFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.binarybricks.coinbit.utils.resourcemanager.AndroidResourceManager getAndroidResourceManager() {
        return null;
    }
    
    private final com.binarybricks.coinbit.features.CryptoCompareRepository getCoinRepo() {
        return null;
    }
    
    private final com.binarybricks.coinbit.features.coinsearch.CoinDiscoveryPresenter getCoinDiscoveryPresenter() {
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
    public void onTopCoinsByTotalVolumeLoaded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.binarybricks.coinbit.network.models.CoinPrice> topCoins) {
    }
    
    @java.lang.Override()
    public void onTopCoinListByPairVolumeLoaded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.binarybricks.coinbit.network.models.CoinPair> topPair) {
    }
    
    @java.lang.Override()
    public void onCoinNewsLoaded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.binarybricks.coinbit.network.models.CryptoCompareNews> coinNews) {
    }
    
    private final void showCoins(java.util.List<? extends com.binarybricks.coinbit.featurecomponents.ModuleItem> coinDiscoveryList) {
    }
    
    @java.lang.Override()
    public void onNetworkError(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
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
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public CoinDiscoveryFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/binarybricks/coinbit/features/coinsearch/CoinDiscoveryFragment$TopCardList;", "Lcom/binarybricks/coinbit/featurecomponents/ModuleItem;", "topCardList", "", "Lcom/binarybricks/coinbit/epoxymodels/TopCardItemView$TopCardsModuleData;", "(Ljava/util/List;)V", "getTopCardList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
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
        public final com.binarybricks.coinbit.features.coinsearch.CoinDiscoveryFragment.TopCardList copy(@org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/binarybricks/coinbit/features/coinsearch/CoinDiscoveryFragment$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}