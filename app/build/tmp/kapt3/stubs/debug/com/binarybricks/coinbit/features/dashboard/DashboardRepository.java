package com.binarybricks.coinbit.features.dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J1\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\u000eJ\u0014\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f\u0018\u00010\u000eR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/binarybricks/coinbit/features/dashboard/DashboardRepository;", "", "coinBitDatabase", "Lcom/binarybricks/coinbit/data/database/CoinBitDatabase;", "(Lcom/binarybricks/coinbit/data/database/CoinBitDatabase;)V", "getCoinPriceFull", "Ljava/util/ArrayList;", "Lcom/binarybricks/coinbit/network/models/CoinPrice;", "Lkotlin/collections/ArrayList;", "fromCurrencySymbol", "", "toCurrencySymbol", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadTransactions", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/binarybricks/coinbit/data/database/entities/CoinTransaction;", "loadWatchedCoins", "Lcom/binarybricks/coinbit/data/database/entities/WatchedCoin;", "app_debug"})
public final class DashboardRepository {
    private final com.binarybricks.coinbit.data.database.CoinBitDatabase coinBitDatabase = null;
    
    /**
     * Get list of all coins that is added in watch list
     */
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin>> loadWatchedCoins() {
        return null;
    }
    
    /**
     * Get list of all coin transactions
     */
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.binarybricks.coinbit.data.database.entities.CoinTransaction>> loadTransactions() {
        return null;
    }
    
    /**
     * Get the price of a coin from the API
     * want data from. [fromCurrencySymbol] specifies what currencies data you want for example bitcoin.
     * [toCurrencySymbol] is which currency you want data in for like USD
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCoinPriceFull(@org.jetbrains.annotations.NotNull()
    java.lang.String fromCurrencySymbol, @org.jetbrains.annotations.NotNull()
    java.lang.String toCurrencySymbol, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<com.binarybricks.coinbit.network.models.CoinPrice>> p2) {
        return null;
    }
    
    public DashboardRepository(@org.jetbrains.annotations.Nullable()
    com.binarybricks.coinbit.data.database.CoinBitDatabase coinBitDatabase) {
        super();
    }
}