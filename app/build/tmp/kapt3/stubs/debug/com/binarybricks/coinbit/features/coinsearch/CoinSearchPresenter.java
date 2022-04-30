package com.binarybricks.coinbit.features.coinsearch;

import java.lang.System;

/**
 * Created by Pranay Airan
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/binarybricks/coinbit/features/coinsearch/CoinSearchPresenter;", "Lcom/binarybricks/coinbit/features/BasePresenter;", "LCoinSearchContract$View;", "LCoinSearchContract$Presenter;", "coinRepo", "Lcom/binarybricks/coinbit/features/CryptoCompareRepository;", "(Lcom/binarybricks/coinbit/features/CryptoCompareRepository;)V", "loadAllCoins", "", "updateCoinWatchedStatus", "watched", "", "coinID", "", "coinSymbol", "app_debug"})
public final class CoinSearchPresenter extends com.binarybricks.coinbit.features.BasePresenter<CoinSearchContract.View> implements CoinSearchContract.Presenter {
    private final com.binarybricks.coinbit.features.CryptoCompareRepository coinRepo = null;
    
    @java.lang.Override()
    public void loadAllCoins() {
    }
    
    @java.lang.Override()
    public void updateCoinWatchedStatus(boolean watched, @org.jetbrains.annotations.NotNull()
    java.lang.String coinID, @org.jetbrains.annotations.NotNull()
    java.lang.String coinSymbol) {
    }
    
    public CoinSearchPresenter(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.features.CryptoCompareRepository coinRepo) {
        super(null);
    }
}