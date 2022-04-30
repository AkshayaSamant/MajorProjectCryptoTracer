package com.binarybricks.coinbit.featurecomponents.cryptonewsmodule;

import java.lang.System;

/**
 * Created by Pragya Agrawal
 * Repository that interact with crypto api to get news.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/binarybricks/coinbit/featurecomponents/cryptonewsmodule/CryptoNewsRepository;", "", "()V", "getCryptoPanicNews", "Lcom/binarybricks/coinbit/network/models/CryptoPanicNews;", "coinSymbol", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CryptoNewsRepository {
    
    /**
     * Get the top news for specific coin from cryptopanic
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCryptoPanicNews(@org.jetbrains.annotations.NotNull()
    java.lang.String coinSymbol, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.binarybricks.coinbit.network.models.CryptoPanicNews> p1) {
        return null;
    }
    
    public CryptoNewsRepository() {
        super();
    }
}