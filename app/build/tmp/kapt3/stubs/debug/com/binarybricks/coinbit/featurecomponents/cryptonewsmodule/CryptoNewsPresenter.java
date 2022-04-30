package com.binarybricks.coinbit.featurecomponents.cryptonewsmodule;

import java.lang.System;

/**
 * Created by Pragya Agrawal
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/binarybricks/coinbit/featurecomponents/cryptonewsmodule/CryptoNewsPresenter;", "Lcom/binarybricks/coinbit/features/BasePresenter;", "LCryptoNewsContract$View;", "LCryptoNewsContract$Presenter;", "cryptoNewsRepository", "Lcom/binarybricks/coinbit/featurecomponents/cryptonewsmodule/CryptoNewsRepository;", "(Lcom/binarybricks/coinbit/featurecomponents/cryptonewsmodule/CryptoNewsRepository;)V", "getCryptoNews", "", "coinSymbol", "", "app_debug"})
public final class CryptoNewsPresenter extends com.binarybricks.coinbit.features.BasePresenter<CryptoNewsContract.View> implements CryptoNewsContract.Presenter {
    private final com.binarybricks.coinbit.featurecomponents.cryptonewsmodule.CryptoNewsRepository cryptoNewsRepository = null;
    
    /**
     * Load the crypto news from the crypto panic api
     */
    @java.lang.Override()
    public void getCryptoNews(@org.jetbrains.annotations.NotNull()
    java.lang.String coinSymbol) {
    }
    
    public CryptoNewsPresenter(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.featurecomponents.cryptonewsmodule.CryptoNewsRepository cryptoNewsRepository) {
        super(null);
    }
}