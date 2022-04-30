package com.binarybricks.coinbit.data.database.entities;

import java.lang.System;

/**
 * Created by Pragya Agrawal
 */
@kotlinx.android.parcel.Parcelize()
@androidx.room.Entity(indices = {@androidx.room.Index(unique = true, value = {"id"})})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b-\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\bH\u00c6\u0003J\t\u00102\u001a\u00020\u0010H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\t\u00105\u001a\u00020\bH\u00c6\u0003J\t\u00106\u001a\u00020\bH\u00c6\u0003J\t\u00107\u001a\u00020\bH\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003Jw\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u00c6\u0001J\t\u0010<\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@H\u00d6\u0003J\t\u0010A\u001a\u00020\u0003H\u00d6\u0001J\t\u0010B\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001e\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001e\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b\'\u0010\u001bR\u001e\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/\u00a8\u0006H"}, d2 = {"Lcom/binarybricks/coinbit/data/database/entities/CoinTransaction;", "Landroid/os/Parcelable;", "transactionType", "", "coinSymbol", "", "pair", "buyPrice", "Ljava/math/BigDecimal;", "buypriceHomeCurrency", "quantity", "transactionTime", "cost", "exchange", "exchangeFees", "idKey", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;J)V", "getBuyPrice", "()Ljava/math/BigDecimal;", "setBuyPrice", "(Ljava/math/BigDecimal;)V", "getBuypriceHomeCurrency", "setBuypriceHomeCurrency", "getCoinSymbol", "()Ljava/lang/String;", "setCoinSymbol", "(Ljava/lang/String;)V", "getCost", "setCost", "getExchange", "setExchange", "getExchangeFees", "setExchangeFees", "getIdKey", "()J", "setIdKey", "(J)V", "getPair", "setPair", "getQuantity", "setQuantity", "getTransactionTime", "setTransactionTime", "getTransactionType", "()I", "setTransactionType", "(I)V", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class CoinTransaction implements android.os.Parcelable {
    @androidx.room.ColumnInfo(name = "transactionType")
    private int transactionType;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "coinSymbol")
    private java.lang.String coinSymbol;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "pair")
    private java.lang.String pair;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "buyprice")
    private java.math.BigDecimal buyPrice;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "buypriceHomeCurrency")
    private java.math.BigDecimal buypriceHomeCurrency;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "quantity")
    private java.math.BigDecimal quantity;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "transactionTime")
    private java.lang.String transactionTime;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "cost")
    private java.lang.String cost;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "exchange")
    private java.lang.String exchange;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "exchangeFees")
    private java.math.BigDecimal exchangeFees;
    @androidx.room.PrimaryKey(autoGenerate = true)
    @androidx.room.ColumnInfo(name = "id")
    private long idKey;
    public static final android.os.Parcelable.Creator<com.binarybricks.coinbit.data.database.entities.CoinTransaction> CREATOR = null;
    
    public final int getTransactionType() {
        return 0;
    }
    
    public final void setTransactionType(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoinSymbol() {
        return null;
    }
    
    public final void setCoinSymbol(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPair() {
        return null;
    }
    
    public final void setPair(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getBuyPrice() {
        return null;
    }
    
    public final void setBuyPrice(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getBuypriceHomeCurrency() {
        return null;
    }
    
    public final void setBuypriceHomeCurrency(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getQuantity() {
        return null;
    }
    
    public final void setQuantity(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransactionTime() {
        return null;
    }
    
    public final void setTransactionTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCost() {
        return null;
    }
    
    public final void setCost(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExchange() {
        return null;
    }
    
    public final void setExchange(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getExchangeFees() {
        return null;
    }
    
    public final void setExchangeFees(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    public final long getIdKey() {
        return 0L;
    }
    
    public final void setIdKey(long p0) {
    }
    
    public CoinTransaction(int transactionType, @org.jetbrains.annotations.NotNull()
    java.lang.String coinSymbol, @org.jetbrains.annotations.NotNull()
    java.lang.String pair, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal buyPrice, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal buypriceHomeCurrency, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal quantity, @org.jetbrains.annotations.NotNull()
    java.lang.String transactionTime, @org.jetbrains.annotations.NotNull()
    java.lang.String cost, @org.jetbrains.annotations.NotNull()
    java.lang.String exchange, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal exchangeFees, long idKey) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal component10() {
        return null;
    }
    
    public final long component11() {
        return 0L;
    }
    
    /**
     * Created by Pragya Agrawal
     */
    @org.jetbrains.annotations.NotNull()
    public final com.binarybricks.coinbit.data.database.entities.CoinTransaction copy(int transactionType, @org.jetbrains.annotations.NotNull()
    java.lang.String coinSymbol, @org.jetbrains.annotations.NotNull()
    java.lang.String pair, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal buyPrice, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal buypriceHomeCurrency, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal quantity, @org.jetbrains.annotations.NotNull()
    java.lang.String transactionTime, @org.jetbrains.annotations.NotNull()
    java.lang.String cost, @org.jetbrains.annotations.NotNull()
    java.lang.String exchange, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal exchangeFees, long idKey) {
        return null;
    }
    
    /**
     * Created by Pragya Agrawal
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Created by Pragya Agrawal
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Created by Pragya Agrawal
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.binarybricks.coinbit.data.database.entities.CoinTransaction> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.binarybricks.coinbit.data.database.entities.CoinTransaction[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.binarybricks.coinbit.data.database.entities.CoinTransaction createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}