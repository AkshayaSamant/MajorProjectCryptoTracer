package com.binarybricks.coinbit.data.database.entities;

import java.lang.System;

/**
 * Created by Pragya Agrawal
 */
@kotlinx.android.parcel.Parcelize()
@androidx.room.Entity(indices = {@androidx.room.Index(unique = true, value = {"watched_id"})})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\bH\u00c6\u0003J\t\u0010&\u001a\u00020\nH\u00c6\u0003J\t\u0010\'\u001a\u00020\fH\u00c6\u0003JE\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\t\u0010)\u001a\u00020*H\u00d6\u0001J\u0013\u0010+\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010-H\u00d6\u0003J\t\u0010.\u001a\u00020*H\u00d6\u0001J\t\u0010/\u001a\u00020\u0005H\u00d6\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020*H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u00065"}, d2 = {"Lcom/binarybricks/coinbit/data/database/entities/WatchedCoin;", "Landroid/os/Parcelable;", "coin", "Lcom/binarybricks/coinbit/data/database/entities/Coin;", "exchange", "", "fromCurrency", "purchaseQuantity", "Ljava/math/BigDecimal;", "watched", "", "idKey", "", "(Lcom/binarybricks/coinbit/data/database/entities/Coin;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ZJ)V", "getCoin", "()Lcom/binarybricks/coinbit/data/database/entities/Coin;", "getExchange", "()Ljava/lang/String;", "setExchange", "(Ljava/lang/String;)V", "getFromCurrency", "setFromCurrency", "getIdKey", "()J", "setIdKey", "(J)V", "getPurchaseQuantity", "()Ljava/math/BigDecimal;", "setPurchaseQuantity", "(Ljava/math/BigDecimal;)V", "getWatched", "()Z", "setWatched", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class WatchedCoin implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final com.binarybricks.coinbit.data.database.entities.Coin coin = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String exchange;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fromCurrency;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal purchaseQuantity;
    private boolean watched;
    @androidx.room.PrimaryKey(autoGenerate = true)
    @androidx.room.ColumnInfo(name = "watched_id")
    private long idKey;
    public static final android.os.Parcelable.Creator<com.binarybricks.coinbit.data.database.entities.WatchedCoin> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.binarybricks.coinbit.data.database.entities.Coin getCoin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExchange() {
        return null;
    }
    
    public final void setExchange(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFromCurrency() {
        return null;
    }
    
    public final void setFromCurrency(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getPurchaseQuantity() {
        return null;
    }
    
    public final void setPurchaseQuantity(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    public final boolean getWatched() {
        return false;
    }
    
    public final void setWatched(boolean p0) {
    }
    
    public final long getIdKey() {
        return 0L;
    }
    
    public final void setIdKey(long p0) {
    }
    
    public WatchedCoin(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.data.database.entities.Coin coin, @org.jetbrains.annotations.NotNull()
    java.lang.String exchange, @org.jetbrains.annotations.NotNull()
    java.lang.String fromCurrency, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal purchaseQuantity, boolean watched, long idKey) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.binarybricks.coinbit.data.database.entities.Coin component1() {
        return null;
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
    
    public final boolean component5() {
        return false;
    }
    
    public final long component6() {
        return 0L;
    }
    
    /**
     * Created by Pragya Agrawal
     */
    @org.jetbrains.annotations.NotNull()
    public final com.binarybricks.coinbit.data.database.entities.WatchedCoin copy(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.data.database.entities.Coin coin, @org.jetbrains.annotations.NotNull()
    java.lang.String exchange, @org.jetbrains.annotations.NotNull()
    java.lang.String fromCurrency, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal purchaseQuantity, boolean watched, long idKey) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.binarybricks.coinbit.data.database.entities.WatchedCoin> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.binarybricks.coinbit.data.database.entities.WatchedCoin[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.binarybricks.coinbit.data.database.entities.WatchedCoin createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}