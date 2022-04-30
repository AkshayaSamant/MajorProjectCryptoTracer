package com.binarybricks.coinbit.features.coindetails;

import java.lang.System;

/**
 * Created by Pranay Airan
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/binarybricks/coinbit/features/coindetails/CoinDetailPresenter;", "Lcom/binarybricks/coinbit/features/BasePresenter;", "LCoinDetailsContract$View;", "LCoinDetailsContract$Presenter;", "coinRepo", "Lcom/binarybricks/coinbit/features/CryptoCompareRepository;", "(Lcom/binarybricks/coinbit/features/CryptoCompareRepository;)V", "getWatchedCoinFromSymbol", "", "symbol", "", "app_debug"})
public final class CoinDetailPresenter extends com.binarybricks.coinbit.features.BasePresenter<CoinDetailsContract.View> implements CoinDetailsContract.Presenter {
    private final com.binarybricks.coinbit.features.CryptoCompareRepository coinRepo = null;
    
    @java.lang.Override()
    public void getWatchedCoinFromSymbol(@org.jetbrains.annotations.NotNull()
    java.lang.String symbol) {
    }
    
    public CoinDetailPresenter(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.features.CryptoCompareRepository coinRepo) {
        super(null);
    }
}