package com.binarybricks.coinbit.data.database.dao;

import java.lang.System;

/**
 * Created by Pragya Agrawal
 *
 * Add queries to read/update coinSymbol transaction data from database.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/binarybricks/coinbit/data/database/dao/CoinTransactionDao;", "", "getAllCoinTransaction", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/binarybricks/coinbit/data/database/entities/CoinTransaction;", "getTransactionsForCoin", "coinSymbol", "", "insertTransaction", "", "coinTransaction", "(Lcom/binarybricks/coinbit/data/database/entities/CoinTransaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface CoinTransactionDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from cointransaction")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.binarybricks.coinbit.data.database.entities.CoinTransaction>> getAllCoinTransaction();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertTransaction(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.data.database.entities.CoinTransaction coinTransaction, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM cointransaction WHERE coinSymbol = :coinSymbol ORDER BY transactionTime ASC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.binarybricks.coinbit.data.database.entities.CoinTransaction>> getTransactionsForCoin(@org.jetbrains.annotations.NotNull()
    java.lang.String coinSymbol);
}