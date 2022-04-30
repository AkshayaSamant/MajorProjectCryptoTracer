package com.binarybricks.coinbit.data.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.binarybricks.coinbit.data.database.BigDecimalConverter.class})
@androidx.room.Database(entities = {com.binarybricks.coinbit.data.database.entities.Exchange.class, com.binarybricks.coinbit.data.database.entities.WatchedCoin.class, com.binarybricks.coinbit.data.database.entities.CoinTransaction.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/binarybricks/coinbit/data/database/CoinBitDatabase;", "Landroidx/room/RoomDatabase;", "()V", "coinTransactionDao", "Lcom/binarybricks/coinbit/data/database/dao/CoinTransactionDao;", "exchangeDao", "Lcom/binarybricks/coinbit/data/database/dao/ExchangeDao;", "watchedCoinDao", "Lcom/binarybricks/coinbit/data/database/dao/WatchedCoinDao;", "app_debug"})
public abstract class CoinBitDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.binarybricks.coinbit.data.database.dao.ExchangeDao exchangeDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.binarybricks.coinbit.data.database.dao.WatchedCoinDao watchedCoinDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.binarybricks.coinbit.data.database.dao.CoinTransactionDao coinTransactionDao();
    
    public CoinBitDatabase() {
        super();
    }
}