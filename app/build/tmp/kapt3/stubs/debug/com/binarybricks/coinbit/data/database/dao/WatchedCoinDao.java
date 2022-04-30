package com.binarybricks.coinbit.data.database.dao;

import java.lang.System;

/**
 * Created by Pragya Agrawal
 *
 * Add queries to read/update coinSymbol data from database.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\u000eH\'J\u001e\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\'J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/binarybricks/coinbit/data/database/dao/WatchedCoinDao;", "", "addPurchaseQuantityForCoin", "", "quantity", "Ljava/math/BigDecimal;", "symbol", "", "(Ljava/math/BigDecimal;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllCoins", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/binarybricks/coinbit/data/database/entities/WatchedCoin;", "isTrue", "", "getAllWatchedCoins", "watched", "getAllWatchedCoinsOnetime", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSingleWatchedCoin", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCoinIntoWatchList", "", "watchedCoin", "(Lcom/binarybricks/coinbit/data/database/entities/WatchedCoin;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCoinListIntoWatchList", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeCoinWatched", "coinId", "(ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface WatchedCoinDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from WatchedCoin where purchaseQuantity > 0 OR watched = :watched order by sortOrder")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin>> getAllWatchedCoins(boolean watched);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select * from WatchedCoin where purchaseQuantity > 0 OR watched = :watched order by sortOrder")
    public abstract java.lang.Object getAllWatchedCoinsOnetime(boolean watched, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin>> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from WatchedCoin where isTrading = :isTrue order by sortOrder")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin>> getAllCoins(boolean isTrue);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select * from WatchedCoin where symbol = :symbol")
    public abstract java.lang.Object getSingleWatchedCoin(@org.jetbrains.annotations.NotNull()
    java.lang.String symbol, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertCoinListIntoWatchList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.binarybricks.coinbit.data.database.entities.WatchedCoin> list, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertCoinIntoWatchList(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.data.database.entities.WatchedCoin watchedCoin, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "update WatchedCoin set purchaseQuantity = purchaseQuantity + :quantity where symbol=:symbol")
    public abstract java.lang.Object addPurchaseQuantityForCoin(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal quantity, @org.jetbrains.annotations.NotNull()
    java.lang.String symbol, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p2);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "UPDATE WatchedCoin SET watched = :watched  WHERE coinId = :coinId")
    public abstract java.lang.Object makeCoinWatched(boolean watched, @org.jetbrains.annotations.NotNull()
    java.lang.String coinId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2);
    
    /**
     * Created by Pragya Agrawal
     *
     * Add queries to read/update coinSymbol data from database.
     */
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}