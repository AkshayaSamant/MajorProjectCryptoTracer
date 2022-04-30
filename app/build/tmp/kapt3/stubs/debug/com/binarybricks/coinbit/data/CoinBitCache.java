package com.binarybricks.coinbit.data;

import java.lang.System;

/**
 * Created by Pragya Agrawal
 *
 * In memory cache for certain objects that we want to cache only for the app session
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0012RB\u0010\u0003\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR6\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00190\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR,\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u001dR*\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u000e0$j\b\u0012\u0004\u0012\u00020\u000e`%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R*\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u000e0$j\b\u0012\u0004\u0012\u00020\u000e`%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\'\"\u0004\b,\u0010)R*\u0010-\u001a\u0012\u0012\u0004\u0012\u00020.0$j\b\u0012\u0004\u0012\u00020.`%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\'\"\u0004\b0\u0010)\u00a8\u00064"}, d2 = {"Lcom/binarybricks/coinbit/data/CoinBitCache;", "", "()V", "coinExchangeMap", "Ljava/util/HashMap;", "", "", "Lcom/binarybricks/coinbit/network/models/ExchangePair;", "Lkotlin/collections/HashMap;", "getCoinExchangeMap", "()Ljava/util/HashMap;", "setCoinExchangeMap", "(Ljava/util/HashMap;)V", "coinPriceMap", "Lcom/binarybricks/coinbit/network/models/CoinPrice;", "getCoinPriceMap", "setCoinPriceMap", "cyrptoCompareNews", "Lcom/binarybricks/coinbit/network/models/CryptoCompareNews;", "getCyrptoCompareNews", "()Ljava/util/List;", "setCyrptoCompareNews", "(Ljava/util/List;)V", "newsMap", "", "Lcom/binarybricks/coinbit/network/models/CryptoPanicNews;", "getNewsMap", "()Ljava/util/Map;", "setNewsMap", "(Ljava/util/Map;)V", "ticker", "", "Lcom/binarybricks/coinbit/network/models/CryptoTicker;", "getTicker", "setTicker", "topCoinsByTotalVolume", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getTopCoinsByTotalVolume", "()Ljava/util/ArrayList;", "setTopCoinsByTotalVolume", "(Ljava/util/ArrayList;)V", "topCoinsByTotalVolume24Hours", "getTopCoinsByTotalVolume24Hours", "setTopCoinsByTotalVolume24Hours", "topPairsByVolume", "Lcom/binarybricks/coinbit/network/models/CoinPair;", "getTopPairsByVolume", "setTopPairsByVolume", "updateCryptoCompareNews", "", "cryptoNews", "app_debug"})
public final class CoinBitCache {
    @org.jetbrains.annotations.NotNull()
    private static java.util.Map<java.lang.String, com.binarybricks.coinbit.network.models.CryptoPanicNews> newsMap;
    @org.jetbrains.annotations.NotNull()
    private static java.util.List<com.binarybricks.coinbit.network.models.CryptoCompareNews> cyrptoCompareNews;
    @org.jetbrains.annotations.NotNull()
    private static java.util.HashMap<java.lang.String, com.binarybricks.coinbit.network.models.CoinPrice> coinPriceMap;
    @org.jetbrains.annotations.NotNull()
    private static java.util.HashMap<java.lang.String, java.util.List<com.binarybricks.coinbit.network.models.ExchangePair>> coinExchangeMap;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.binarybricks.coinbit.network.models.CoinPrice> topCoinsByTotalVolume;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.binarybricks.coinbit.network.models.CoinPair> topPairsByVolume;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.binarybricks.coinbit.network.models.CoinPrice> topCoinsByTotalVolume24Hours;
    @org.jetbrains.annotations.NotNull()
    private static java.util.Map<java.lang.String, java.util.List<com.binarybricks.coinbit.network.models.CryptoTicker>> ticker;
    @org.jetbrains.annotations.NotNull()
    public static final com.binarybricks.coinbit.data.CoinBitCache INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, com.binarybricks.coinbit.network.models.CryptoPanicNews> getNewsMap() {
        return null;
    }
    
    public final void setNewsMap(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, com.binarybricks.coinbit.network.models.CryptoPanicNews> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.binarybricks.coinbit.network.models.CryptoCompareNews> getCyrptoCompareNews() {
        return null;
    }
    
    public final void setCyrptoCompareNews(@org.jetbrains.annotations.NotNull()
    java.util.List<com.binarybricks.coinbit.network.models.CryptoCompareNews> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, com.binarybricks.coinbit.network.models.CoinPrice> getCoinPriceMap() {
        return null;
    }
    
    public final void setCoinPriceMap(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, com.binarybricks.coinbit.network.models.CoinPrice> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, java.util.List<com.binarybricks.coinbit.network.models.ExchangePair>> getCoinExchangeMap() {
        return null;
    }
    
    public final void setCoinExchangeMap(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.util.List<com.binarybricks.coinbit.network.models.ExchangePair>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.binarybricks.coinbit.network.models.CoinPrice> getTopCoinsByTotalVolume() {
        return null;
    }
    
    public final void setTopCoinsByTotalVolume(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.binarybricks.coinbit.network.models.CoinPrice> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.binarybricks.coinbit.network.models.CoinPair> getTopPairsByVolume() {
        return null;
    }
    
    public final void setTopPairsByVolume(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.binarybricks.coinbit.network.models.CoinPair> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.binarybricks.coinbit.network.models.CoinPrice> getTopCoinsByTotalVolume24Hours() {
        return null;
    }
    
    public final void setTopCoinsByTotalVolume24Hours(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.binarybricks.coinbit.network.models.CoinPrice> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.util.List<com.binarybricks.coinbit.network.models.CryptoTicker>> getTicker() {
        return null;
    }
    
    public final void setTicker(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.util.List<com.binarybricks.coinbit.network.models.CryptoTicker>> p0) {
    }
    
    public final void updateCryptoCompareNews(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.network.models.CryptoCompareNews cryptoNews) {
    }
    
    private CoinBitCache() {
        super();
    }
}