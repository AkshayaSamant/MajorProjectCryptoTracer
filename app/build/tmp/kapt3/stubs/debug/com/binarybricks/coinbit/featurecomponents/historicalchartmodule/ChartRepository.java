package com.binarybricks.coinbit.featurecomponents.historicalchartmodule;

import java.lang.System;

/**
 * Created by Pranay Airan
 * Repository that interact with crypto api to get charts.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002JA\u0010\u0003\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/binarybricks/coinbit/featurecomponents/historicalchartmodule/ChartRepository;", "", "()V", "getCryptoHistoricalData", "Lkotlin/Pair;", "", "Lcom/binarybricks/coinbit/network/models/CryptoCompareHistoricalResponse$Data;", "period", "", "fromCurrencySymbol", "toCurrencySymbol", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ChartRepository {
    
    /**
     * Get the historical data for specific crypto currencies. [period] specifies what time period you
     * want data from. [fromCurrencySymbol] specifies what currencies data you want for example bitcoin.[toCurrencySymbol]
     * is which currency you want data in for like USD
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCryptoHistoricalData(@org.jetbrains.annotations.NotNull()
    java.lang.String period, @org.jetbrains.annotations.Nullable()
    java.lang.String fromCurrencySymbol, @org.jetbrains.annotations.Nullable()
    java.lang.String toCurrencySymbol, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.util.List<com.binarybricks.coinbit.network.models.CryptoCompareHistoricalResponse.Data>, com.binarybricks.coinbit.network.models.CryptoCompareHistoricalResponse.Data>> p3) {
        return null;
    }
    
    public ChartRepository() {
        super();
    }
}