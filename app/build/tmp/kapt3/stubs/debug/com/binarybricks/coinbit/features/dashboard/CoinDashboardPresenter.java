package com.binarybricks.coinbit.features.dashboard;

import java.lang.System;

/**
 * Created by Pranay Airan
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/binarybricks/coinbit/features/dashboard/CoinDashboardPresenter;", "Lcom/binarybricks/coinbit/features/BasePresenter;", "LCoinDashboardContract$View;", "LCoinDashboardContract$Presenter;", "dashboardRepository", "Lcom/binarybricks/coinbit/features/dashboard/DashboardRepository;", "coinRepo", "Lcom/binarybricks/coinbit/features/CryptoCompareRepository;", "(Lcom/binarybricks/coinbit/features/dashboard/DashboardRepository;Lcom/binarybricks/coinbit/features/CryptoCompareRepository;)V", "getLatestNewsFromCryptoCompare", "", "getTopCoinsByTotalVolume24hours", "toCurrencySymbol", "", "loadCoinsPrices", "fromCurrencySymbol", "loadWatchedCoinsAndTransactions", "app_debug"})
public final class CoinDashboardPresenter extends com.binarybricks.coinbit.features.BasePresenter<CoinDashboardContract.View> implements CoinDashboardContract.Presenter {
    private final com.binarybricks.coinbit.features.dashboard.DashboardRepository dashboardRepository = null;
    private final com.binarybricks.coinbit.features.CryptoCompareRepository coinRepo = null;
    
    @java.lang.Override()
    public void loadWatchedCoinsAndTransactions() {
    }
    
    @java.lang.Override()
    public void loadCoinsPrices(@org.jetbrains.annotations.NotNull()
    java.lang.String fromCurrencySymbol, @org.jetbrains.annotations.NotNull()
    java.lang.String toCurrencySymbol) {
    }
    
    @java.lang.Override()
    public void getTopCoinsByTotalVolume24hours(@org.jetbrains.annotations.NotNull()
    java.lang.String toCurrencySymbol) {
    }
    
    @java.lang.Override()
    public void getLatestNewsFromCryptoCompare() {
    }
    
    public CoinDashboardPresenter(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.features.dashboard.DashboardRepository dashboardRepository, @org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.features.CryptoCompareRepository coinRepo) {
        super(null);
    }
}