package com.binarybricks.coinbit.network.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002)*BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J_\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010\u00a8\u0006+"}, d2 = {"Lcom/binarybricks/coinbit/network/models/CryptoCompareHistoricalResponse;", "", "firstValueInArray", "", "data", "", "Lcom/binarybricks/coinbit/network/models/CryptoCompareHistoricalResponse$Data;", "timeFrom", "type", "response", "conversionType", "Lcom/binarybricks/coinbit/network/models/CryptoCompareHistoricalResponse$ConversionType;", "timeTo", "aggregated", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/binarybricks/coinbit/network/models/CryptoCompareHistoricalResponse$ConversionType;Ljava/lang/String;Ljava/lang/String;)V", "getAggregated", "()Ljava/lang/String;", "getConversionType", "()Lcom/binarybricks/coinbit/network/models/CryptoCompareHistoricalResponse$ConversionType;", "getData", "()Ljava/util/List;", "getFirstValueInArray", "getResponse", "getTimeFrom", "getTimeTo", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "ConversionType", "Data", "app_debug"})
public final class CryptoCompareHistoricalResponse {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "FirstValueInArray")
    private final java.lang.String firstValueInArray = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Data")
    private final java.util.List<com.binarybricks.coinbit.network.models.CryptoCompareHistoricalResponse.Data> data = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "TimeFrom")
    private final java.lang.String timeFrom = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Type")
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Response")
    private final java.lang.String response = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "ConversionType")
    private final com.binarybricks.coinbit.network.models.CryptoCompareHistoricalResponse.ConversionType conversionType = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "TimeTo")
    private final java.lang.String timeTo = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Aggregated")
    private final java.lang.String aggregated = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstValueInArray() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.binarybricks.coinbit.network.models.CryptoCompareHistoricalResponse.Data> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeFrom() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.binarybricks.coinbit.network.models.CryptoCompareHistoricalResponse.ConversionType getConversionType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeTo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAggregated() {
        return null;
    }
    
    public CryptoCompareHistoricalResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String firstValueInArray, @org.jetbrains.annotations.NotNull()
    java.util.List<com.binarybricks.coinbit.network.models.CryptoCompareHistoricalResponse.Data> data, @org.jetbrains.annotations.NotNull()
    java.lang.String timeFrom, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String response, @org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.network.models.CryptoCompareHistoricalResponse.ConversionType conversionType, @org.jetbrains.annotations.NotNull()
    java.lang.String timeTo, @org.jetbrains.annotations.NotNull()
    java.lang.String aggregated) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.binarybricks.coinbit.network.models.CryptoCompareHistoricalResponse.Data> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.binarybricks.coinbit.network.models.CryptoCompareHistoricalResponse.ConversionType component6() {
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
    public final com.binarybricks.coinbit.network.models.CryptoCompareHistoricalResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String firstValueInArray, @org.jetbrains.annotations.NotNull()
    java.util.List<com.binarybricks.coinbit.network.models.CryptoCompareHistoricalResponse.Data> data, @org.jetbrains.annotations.NotNull()
    java.lang.String timeFrom, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String response, @org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.network.models.CryptoCompareHistoricalResponse.ConversionType conversionType, @org.jetbrains.annotations.NotNull()
    java.lang.String timeTo, @org.jetbrains.annotations.NotNull()
    java.lang.String aggregated) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/binarybricks/coinbit/network/models/CryptoCompareHistoricalResponse$ConversionType;", "", "conversionSymbol", "", "type", "(Ljava/lang/String;Ljava/lang/String;)V", "getConversionSymbol", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class ConversionType {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String conversionSymbol = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String type = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getConversionSymbol() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getType() {
            return null;
        }
        
        public ConversionType(@org.jetbrains.annotations.NotNull()
        java.lang.String conversionSymbol, @org.jetbrains.annotations.NotNull()
        java.lang.String type) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.binarybricks.coinbit.network.models.CryptoCompareHistoricalResponse.ConversionType copy(@org.jetbrains.annotations.NotNull()
        java.lang.String conversionSymbol, @org.jetbrains.annotations.NotNull()
        java.lang.String type) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006!"}, d2 = {"Lcom/binarybricks/coinbit/network/models/CryptoCompareHistoricalResponse$Data;", "", "open", "", "time", "volumeto", "volumefrom", "high", "low", "close", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClose", "()Ljava/lang/String;", "getHigh", "getLow", "getOpen", "getTime", "getVolumefrom", "getVolumeto", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Data {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String open = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String time = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String volumeto = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String volumefrom = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String high = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String low = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String close = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOpen() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTime() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getVolumeto() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getVolumefrom() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHigh() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLow() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getClose() {
            return null;
        }
        
        public Data(@org.jetbrains.annotations.NotNull()
        java.lang.String open, @org.jetbrains.annotations.NotNull()
        java.lang.String time, @org.jetbrains.annotations.NotNull()
        java.lang.String volumeto, @org.jetbrains.annotations.NotNull()
        java.lang.String volumefrom, @org.jetbrains.annotations.NotNull()
        java.lang.String high, @org.jetbrains.annotations.NotNull()
        java.lang.String low, @org.jetbrains.annotations.NotNull()
        java.lang.String close) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
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
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.binarybricks.coinbit.network.models.CryptoCompareHistoricalResponse.Data copy(@org.jetbrains.annotations.NotNull()
        java.lang.String open, @org.jetbrains.annotations.NotNull()
        java.lang.String time, @org.jetbrains.annotations.NotNull()
        java.lang.String volumeto, @org.jetbrains.annotations.NotNull()
        java.lang.String volumefrom, @org.jetbrains.annotations.NotNull()
        java.lang.String high, @org.jetbrains.annotations.NotNull()
        java.lang.String low, @org.jetbrains.annotations.NotNull()
        java.lang.String close) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}