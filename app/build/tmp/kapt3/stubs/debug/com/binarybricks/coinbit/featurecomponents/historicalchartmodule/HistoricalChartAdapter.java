package com.binarybricks.coinbit.featurecomponents.historicalchartmodule;

import java.lang.System;

/**
 * Created by Pranay Airan 1/13/18.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/binarybricks/coinbit/featurecomponents/historicalchartmodule/HistoricalChartAdapter;", "Lcom/robinhood/spark/SparkAdapter;", "historicalData", "", "Lcom/binarybricks/coinbit/network/models/CryptoCompareHistoricalResponse$Data;", "baseLineValue", "", "(Ljava/util/List;Ljava/lang/String;)V", "getBaseLine", "", "getCount", "", "getItem", "index", "getY", "hasBaseLine", "", "app_debug"})
public final class HistoricalChartAdapter extends com.robinhood.spark.SparkAdapter {
    private final java.util.List<com.binarybricks.coinbit.network.models.CryptoCompareHistoricalResponse.Data> historicalData = null;
    private final java.lang.String baseLineValue = null;
    
    @java.lang.Override()
    public float getY(int index) {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.binarybricks.coinbit.network.models.CryptoCompareHistoricalResponse.Data getItem(int index) {
        return null;
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean hasBaseLine() {
        return false;
    }
    
    @java.lang.Override()
    public float getBaseLine() {
        return 0.0F;
    }
    
    public HistoricalChartAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.binarybricks.coinbit.network.models.CryptoCompareHistoricalResponse.Data> historicalData, @org.jetbrains.annotations.Nullable()
    java.lang.String baseLineValue) {
        super();
    }
}