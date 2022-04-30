package com.binarybricks.coinbit.features.launch;

import java.lang.System;

/**
 * Created by Pranay Airan
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0002R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/binarybricks/coinbit/features/launch/LaunchPresenter;", "Lcom/binarybricks/coinbit/features/BasePresenter;", "LLaunchContract$View;", "LLaunchContract$Presenter;", "coinRepo", "Lcom/binarybricks/coinbit/features/CryptoCompareRepository;", "(Lcom/binarybricks/coinbit/features/CryptoCompareRepository;)V", "coinInfoMap", "", "", "Lcom/binarybricks/coinbit/network/models/CoinInfo;", "coinList", "Ljava/util/ArrayList;", "Lcom/binarybricks/coinbit/network/models/CCCoin;", "Lkotlin/collections/ArrayList;", "getAllSupportedCoins", "", "defaultCurrency", "loadAllCoins", "loadExchangeFromAPI", "app_debug"})
public final class LaunchPresenter extends com.binarybricks.coinbit.features.BasePresenter<LaunchContract.View> implements LaunchContract.Presenter {
    private java.util.ArrayList<com.binarybricks.coinbit.network.models.CCCoin> coinList;
    private java.util.Map<java.lang.String, com.binarybricks.coinbit.network.models.CoinInfo> coinInfoMap;
    private final com.binarybricks.coinbit.features.CryptoCompareRepository coinRepo = null;
    
    @java.lang.Override()
    public void loadAllCoins() {
    }
    
    private final void loadExchangeFromAPI() {
    }
    
    @java.lang.Override()
    public void getAllSupportedCoins(@org.jetbrains.annotations.NotNull()
    java.lang.String defaultCurrency) {
    }
    
    public LaunchPresenter(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.features.CryptoCompareRepository coinRepo) {
        super(null);
    }
}