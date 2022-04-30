package com.binarybricks.coinbit.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0005\u001a\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u001c\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\f\u001a\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f\u001a\u0016\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u000e\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007\u001a&\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f\u001a\u000e\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u001d"}, d2 = {"dismissKeyboard", "", "activity", "Landroid/app/Activity;", "dpToPx", "", "context", "Landroid/content/Context;", "dp", "getBrowserIntent", "Landroid/content/Intent;", "url", "", "getDefaultExchangeText", "exchangeName", "getTotalCost", "Ljava/math/BigDecimal;", "coinTransactionList", "", "Lcom/binarybricks/coinbit/data/database/entities/CoinTransaction;", "coinSymbol", "getUrlWithoutParameters", "openCustomTab", "rateCoinBit", "sendEmail", "email", "subject", "body", "shareCoinBit", "app_debug"})
public final class UtilsKt {
    
    /**
     * Get's the browser intent to open a webpage.
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.content.Intent getBrowserIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    /**
     * Open the URL in chrome custom tab
     */
    public static final void openCustomTab(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public static final int dpToPx(@org.jetbrains.annotations.Nullable()
    android.content.Context context, int dp) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getDefaultExchangeText(@org.jetbrains.annotations.NotNull()
    java.lang.String exchangeName, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public static final void dismissKeyboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.math.BigDecimal getTotalCost(@org.jetbrains.annotations.NotNull()
    java.util.List<com.binarybricks.coinbit.data.database.entities.CoinTransaction> coinTransactionList, @org.jetbrains.annotations.NotNull()
    java.lang.String coinSymbol) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getUrlWithoutParameters(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    public static final void sendEmail(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String subject, @org.jetbrains.annotations.NotNull()
    java.lang.String body) {
    }
    
    public static final void shareCoinBit(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public static final void rateCoinBit(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
}