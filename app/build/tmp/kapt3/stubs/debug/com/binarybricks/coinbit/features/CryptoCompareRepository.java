package com.binarybricks.coinbit.features;

import java.lang.System;

/**
 * Created by Pranay Airan
 * Repository that interact with crypto api to get any info on coins.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006Jo\u0010\t\u001a*\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\n2\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\r2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J9\u0010\u0014\u001a*\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015j\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016`\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002J)\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J=\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001c0\"2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J#\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J1\u0010*\u001a\u0012\u0012\u0004\u0012\u00020(0\u000bj\b\u0012\u0004\u0012\u00020(`\r2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u001c\u0010-\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u0007\u0018\u00010\u00062\u0006\u0010/\u001a\u00020\u000fJ!\u00100\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010/\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J\u001f\u00102\u001a\b\u0012\u0004\u0012\u00020(0\u00072\u0006\u00103\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J\u001f\u00104\u001a\b\u0012\u0004\u0012\u00020(0\u00072\u0006\u00103\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J\u0017\u00105\u001a\b\u0012\u0004\u0012\u0002060\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u001f\u00107\u001a\b\u0012\u0004\u0012\u0002080\u00072\u0006\u00103\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J!\u00109\u001a\u0004\u0018\u00010:2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010<J!\u0010=\u001a\u0004\u0018\u00010:2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020,0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010<J\u001b\u0010?\u001a\u0004\u0018\u00010:2\u0006\u0010@\u001a\u00020.H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010AJ#\u0010B\u001a\u0004\u0018\u00010:2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010FR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006G"}, d2 = {"Lcom/binarybricks/coinbit/features/CryptoCompareRepository;", "", "coinBitDatabase", "Lcom/binarybricks/coinbit/data/database/CoinBitDatabase;", "(Lcom/binarybricks/coinbit/data/database/CoinBitDatabase;)V", "getAllCoins", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/binarybricks/coinbit/data/database/entities/WatchedCoin;", "getAllCoinsFromAPI", "Lkotlin/Pair;", "Ljava/util/ArrayList;", "Lcom/binarybricks/coinbit/network/models/CCCoin;", "Lkotlin/collections/ArrayList;", "", "", "Lcom/binarybricks/coinbit/network/models/CoinInfo;", "coinList", "coinInfoMap", "(Ljava/util/ArrayList;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllSupportedExchanges", "Ljava/util/HashMap;", "", "Lcom/binarybricks/coinbit/network/models/ExchangePair;", "Lkotlin/collections/HashMap;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCoinInfoMap", "getCoinPrice", "Ljava/math/BigDecimal;", "fromCurrencySymbol", "toCurrencySymbol", "exchange", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCoinPriceForTimeStamp", "", "fromCoinSymbol", "toSymbols", "time", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCoinPriceFull", "Lcom/binarybricks/coinbit/network/models/CoinPrice;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCoinPriceFullList", "getExchangeInfo", "Lcom/binarybricks/coinbit/data/database/entities/Exchange;", "getRecentTransaction", "Lcom/binarybricks/coinbit/data/database/entities/CoinTransaction;", "symbol", "getSingleCoin", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopCoinsByTotalVolume", "tsyms", "getTopCoinsByTotalVolume24hours", "getTopNewsFromCryptoCompare", "Lcom/binarybricks/coinbit/network/models/CryptoCompareNews;", "getTopPairsByTotalVolume", "Lcom/binarybricks/coinbit/network/models/CoinPair;", "insertCoinsInWatchList", "", "watchedCoinList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertExchangeIntoList", "exchangeList", "insertTransaction", "transaction", "(Lcom/binarybricks/coinbit/data/database/entities/CoinTransaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCoinWatchedStatus", "watched", "", "coinID", "(ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CryptoCompareRepository {
    private final com.binarybricks.coinbit.data.database.CoinBitDatabase coinBitDatabase = null;
    
    /**
     * Get list of all coins from api
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllCoinsFromAPI(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.binarybricks.coinbit.network.models.CCCoin> coinList, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, com.binarybricks.coinbit.network.models.CoinInfo> coinInfoMap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.util.ArrayList<com.binarybricks.coinbit.network.models.CCCoin>, ? extends java.util.Map<java.lang.String, com.binarybricks.coinbit.network.models.CoinInfo>>> p2) {
        return null;
    }
    
    private final java.util.Map<java.lang.String, com.binarybricks.coinbit.network.models.CoinInfo> getCoinInfoMap() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCoinPrice(@org.jetbrains.annotations.NotNull()
    java.lang.String fromCurrencySymbol, @org.jetbrains.annotations.NotNull()
    java.lang.String toCurrencySymbol, @org.jetbrains.annotations.NotNull()
    java.lang.String exchange, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.math.BigDecimal> p3) {
        return null;
    }
    
    /**
     * Get Price for specific coin to 1 or many other coins or currency.
     * This prices are for specific exchange and for specific time stamp.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCoinPriceForTimeStamp(@org.jetbrains.annotations.NotNull()
    java.lang.String fromCoinSymbol, @org.jetbrains.annotations.NotNull()
    java.lang.String toSymbols, @org.jetbrains.annotations.NotNull()
    java.lang.String exchange, @org.jetbrains.annotations.NotNull()
    java.lang.String time, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, java.math.BigDecimal>> p4) {
        return null;
    }
    
    /**
     * Get Price and other details of Single currency to single currency, we are using the same api for multi.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCoinPriceFull(@org.jetbrains.annotations.NotNull()
    java.lang.String fromCurrencySymbol, @org.jetbrains.annotations.NotNull()
    java.lang.String toCurrencySymbol, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.binarybricks.coinbit.network.models.CoinPrice> p2) {
        return null;
    }
    
    /**
     * Get price of all currencies with respect to a specific currency
     * want data from. [fromCurrencySymbol] specifies what currencies data you want for example btc,eth.[toCurrencySymbol]
     * is which currency you want data in for like USD
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCoinPriceFullList(@org.jetbrains.annotations.NotNull()
    java.lang.String fromCurrencySymbol, @org.jetbrains.annotations.NotNull()
    java.lang.String toCurrencySymbol, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<com.binarybricks.coinbit.network.models.CoinPrice>> p2) {
        return null;
    }
    
    /**
     * Get the top coins pair by total volume for last 24 hours
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTopCoinsByTotalVolume24hours(@org.jetbrains.annotations.NotNull()
    java.lang.String tsyms, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.binarybricks.coinbit.network.models.CoinPrice>> p1) {
        return null;
    }
    
    /**
     * Get the top coins pair by total volume
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTopCoinsByTotalVolume(@org.jetbrains.annotations.NotNull()
    java.lang.String tsyms, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.binarybricks.coinbit.network.models.CoinPrice>> p1) {
        return null;
    }
    
    /**
     * Get the top coins pair by total volume
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTopPairsByTotalVolume(@org.jetbrains.annotations.NotNull()
    java.lang.String tsyms, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.binarybricks.coinbit.network.models.CoinPair>> p1) {
        return null;
    }
    
    /**
     * Get the top news article from crypto compare
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTopNewsFromCryptoCompare(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.binarybricks.coinbit.network.models.CryptoCompareNews>> p0) {
        return null;
    }
    
    /**
     * Get list of all supported exchanges coinSymbol pairs
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllSupportedExchanges(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.HashMap<java.lang.String, java.util.List<com.binarybricks.coinbit.network.models.ExchangePair>>> p0) {
        return null;
    }
    
    /**
     * Get exchange details and save in DB
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getExchangeInfo(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.binarybricks.coinbit.data.database.entities.Exchange>> p0) {
        return null;
    }
    
    /**
     * Get all recent transactions
     */
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.binarybricks.coinbit.data.database.entities.CoinTransaction>> getRecentTransaction(@org.jetbrains.annotations.NotNull()
    java.lang.String symbol) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertCoinsInWatchList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin> watchedCoinList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateCoinWatchedStatus(boolean watched, @org.jetbrains.annotations.NotNull()
    java.lang.String coinID, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertTransaction(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.data.database.entities.CoinTransaction transaction, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    /**
     * Get list of all coins with there watched status
     */
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin>> getAllCoins() {
        return null;
    }
    
    /**
     * Get single coin based on coin name and symbol
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSingleCoin(@org.jetbrains.annotations.NotNull()
    java.lang.String symbol, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertExchangeIntoList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.binarybricks.coinbit.data.database.entities.Exchange> exchangeList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public CryptoCompareRepository(@org.jetbrains.annotations.Nullable()
    com.binarybricks.coinbit.data.database.CoinBitDatabase coinBitDatabase) {
        super();
    }
}