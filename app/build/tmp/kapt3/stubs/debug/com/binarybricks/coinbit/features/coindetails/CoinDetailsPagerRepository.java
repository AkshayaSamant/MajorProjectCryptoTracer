package com.binarybricks.coinbit.features.coindetails;

import java.lang.System;

/**
 * Created by Pranay Airan
 * Repository that interact with crypto api and database for getting data.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/binarybricks/coinbit/features/coindetails/CoinDetailsPagerRepository;", "", "coinBitDatabase", "Lcom/binarybricks/coinbit/data/database/CoinBitDatabase;", "(Lcom/binarybricks/coinbit/data/database/CoinBitDatabase;)V", "loadWatchedCoins", "", "Lcom/binarybricks/coinbit/data/database/entities/WatchedCoin;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CoinDetailsPagerRepository {
    private final com.binarybricks.coinbit.data.database.CoinBitDatabase coinBitDatabase = null;
    
    /**
     * Get list of all coins that is added in watch list
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loadWatchedCoins(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin>> p0) {
        return null;
    }
    
    public CoinDetailsPagerRepository(@org.jetbrains.annotations.Nullable()
    com.binarybricks.coinbit.data.database.CoinBitDatabase coinBitDatabase) {
        super();
    }
}