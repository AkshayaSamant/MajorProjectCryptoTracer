package com.binarybricks.coinbit.network.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006JC\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u00052\b\b\u0003\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001b\u0010\r\u001a\u00020\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006JQ\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00052\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0003\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J/\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u00052\b\b\u0001\u0010\u001c\u001a\u00020\u001dH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010 \u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J9\u0010!\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0003\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J/\u0010#\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0003\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J/\u0010%\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0003\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J/\u0010\'\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0003\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J/\u0010(\u001a\u00020\u00032\b\b\u0001\u0010)\u001a\u00020\u00052\b\b\u0001\u0010*\u001a\u00020\u00052\b\b\u0003\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J/\u0010+\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0003\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006,"}, d2 = {"Lcom/binarybricks/coinbit/network/api/API;", "", "getCoinList", "Lcom/google/gson/JsonObject;", "apiKey", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCoinPriceForTimeStamp", "fromSymbol", "toSymbol", "exchange", "timeStamp", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCoinTicker", "coinName", "getCryptoHistoricalData", "Lcom/binarybricks/coinbit/network/models/CryptoCompareHistoricalResponse;", "period", "fromCurrencySymbol", "toCurrencySymbol", "limit", "", "aggregate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCryptoNewsForCurrency", "Lcom/binarybricks/coinbit/network/models/CryptoPanicNews;", "coinSymbol", "filter", "public", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getExchangeList", "getExchangesInfo", "getPrice", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPricesFull", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopCoinsByTotalVolume", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopCoinsByTotalVolume24hours", "getTopNewsArticleFromCryptocompare", "lang", "sortOrder", "getTopPairsVolume", "app_debug"})
public abstract interface API {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "all/coinlist")
    @retrofit2.http.Headers(value = {"authorization: Apikey 525fa1933d3246c3bbd6a8ec96207baf3104c80d12b95a4b4cf9196ece4d3728"})
    public abstract java.lang.Object getCoinList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "extraParams")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.gson.JsonObject> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "pricemultifull")
    @retrofit2.http.Headers(value = {"authorization: Apikey 525fa1933d3246c3bbd6a8ec96207baf3104c80d12b95a4b4cf9196ece4d3728"})
    public abstract java.lang.Object getPricesFull(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "fsyms")
    java.lang.String fromSymbol, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "tsyms")
    java.lang.String toSymbol, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "extraParams")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.gson.JsonObject> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "{period}")
    @retrofit2.http.Headers(value = {"authorization: Apikey 525fa1933d3246c3bbd6a8ec96207baf3104c80d12b95a4b4cf9196ece4d3728"})
    public abstract java.lang.Object getCryptoHistoricalData(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "period")
    java.lang.String period, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "fsym")
    java.lang.String fromCurrencySymbol, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "tsym")
    java.lang.String toCurrencySymbol, @retrofit2.http.Query(value = "limit")
    int limit, @retrofit2.http.Query(value = "aggregate")
    int aggregate, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "extraParams")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.binarybricks.coinbit.network.models.CryptoCompareHistoricalResponse> p6);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "price")
    @retrofit2.http.Headers(value = {"authorization: Apikey 525fa1933d3246c3bbd6a8ec96207baf3104c80d12b95a4b4cf9196ece4d3728"})
    public abstract java.lang.Object getPrice(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "fsym")
    java.lang.String fromSymbol, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "tsyms")
    java.lang.String toSymbol, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "e")
    java.lang.String exchange, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "extraParams")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.gson.JsonObject> p4);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "all/exchanges")
    @retrofit2.http.Headers(value = {"authorization: Apikey 525fa1933d3246c3bbd6a8ec96207baf3104c80d12b95a4b4cf9196ece4d3728"})
    public abstract java.lang.Object getExchangeList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "extraParams")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.gson.JsonObject> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "exchanges/general")
    @retrofit2.http.Headers(value = {"authorization: Apikey 525fa1933d3246c3bbd6a8ec96207baf3104c80d12b95a4b4cf9196ece4d3728"})
    public abstract java.lang.Object getExchangesInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "extraParams")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.gson.JsonObject> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "pricehistorical")
    @retrofit2.http.Headers(value = {"authorization: Apikey 525fa1933d3246c3bbd6a8ec96207baf3104c80d12b95a4b4cf9196ece4d3728"})
    public abstract java.lang.Object getCoinPriceForTimeStamp(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "fsym")
    java.lang.String fromSymbol, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "tsyms")
    java.lang.String toSymbol, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "e")
    java.lang.String exchange, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "ts")
    java.lang.String timeStamp, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "extraParams")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.gson.JsonObject> p5);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "top/totalvolfull")
    @retrofit2.http.Headers(value = {"authorization: Apikey 525fa1933d3246c3bbd6a8ec96207baf3104c80d12b95a4b4cf9196ece4d3728"})
    public abstract java.lang.Object getTopCoinsByTotalVolume24hours(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "tsym")
    java.lang.String toSymbol, @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "extraParams")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.gson.JsonObject> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "top/mktcapfull")
    @retrofit2.http.Headers(value = {"authorization: Apikey 525fa1933d3246c3bbd6a8ec96207baf3104c80d12b95a4b4cf9196ece4d3728"})
    public abstract java.lang.Object getTopCoinsByTotalVolume(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "tsym")
    java.lang.String toSymbol, @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "extraParams")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.gson.JsonObject> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "top/volumes")
    @retrofit2.http.Headers(value = {"authorization: Apikey 525fa1933d3246c3bbd6a8ec96207baf3104c80d12b95a4b4cf9196ece4d3728"})
    public abstract java.lang.Object getTopPairsVolume(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "tsym")
    java.lang.String toSymbol, @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "extraParams")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.gson.JsonObject> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v2/news/")
    @retrofit2.http.Headers(value = {"authorization: Apikey 525fa1933d3246c3bbd6a8ec96207baf3104c80d12b95a4b4cf9196ece4d3728"})
    public abstract java.lang.Object getTopNewsArticleFromCryptocompare(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "lang")
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "sortOrder")
    java.lang.String sortOrder, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "extraParams")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.gson.JsonObject> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "https://api.coingecko.com/api/v3/coins/{coinName}/tickers")
    public abstract java.lang.Object getCoinTicker(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "coinName")
    java.lang.String coinName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.gson.JsonObject> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "https://cryptopanic.com/api/posts/?auth_token=cd529bae09d5c505248fe05618da96ffb35ecffc")
    public abstract java.lang.Object getCryptoNewsForCurrency(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "currencies")
    java.lang.String coinSymbol, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "filter")
    java.lang.String filter, @retrofit2.http.Query(value = "public")
    boolean p2_1658771764, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.binarybricks.coinbit.network.models.CryptoPanicNews> p3);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}