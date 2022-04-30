package com.binarybricks.coinbit.featurecomponents.cointickermodule;

import java.lang.System;

/**
 * Created by Pranay Airan
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/binarybricks/coinbit/featurecomponents/cointickermodule/CoinTickerPresenter;", "Lcom/binarybricks/coinbit/features/BasePresenter;", "LCoinTickerContract$View;", "LCoinTickerContract$Presenter;", "coinTickerRepository", "Lcom/binarybricks/coinbit/featurecomponents/cointickermodule/CoinTickerRepository;", "androidResourceManager", "Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManager;", "(Lcom/binarybricks/coinbit/featurecomponents/cointickermodule/CoinTickerRepository;Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManager;)V", "getCryptoTickers", "", "coinName", "", "app_debug"})
public final class CoinTickerPresenter extends com.binarybricks.coinbit.features.BasePresenter<CoinTickerContract.View> implements CoinTickerContract.Presenter {
    private final com.binarybricks.coinbit.featurecomponents.cointickermodule.CoinTickerRepository coinTickerRepository = null;
    private final com.binarybricks.coinbit.utils.resourcemanager.AndroidResourceManager androidResourceManager = null;
    
    /**
     * Load the crypto ticker from the crypto panic api
     */
    @java.lang.Override()
    public void getCryptoTickers(@org.jetbrains.annotations.NotNull()
    java.lang.String coinName) {
    }
    
    public CoinTickerPresenter(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.featurecomponents.cointickermodule.CoinTickerRepository coinTickerRepository, @org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.utils.resourcemanager.AndroidResourceManager androidResourceManager) {
        super(null);
    }
}