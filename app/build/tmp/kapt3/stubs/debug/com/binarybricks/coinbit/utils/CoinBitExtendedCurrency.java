package com.binarybricks.coinbit.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/binarybricks/coinbit/utils/CoinBitExtendedCurrency;", "", "()V", "Companion", "app_debug"})
public final class CoinBitExtendedCurrency {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.mynameismidori.currencypicker.ExtendedCurrency> CURRENCIES = null;
    private static final java.math.BigDecimal TRILLION = null;
    private static final java.math.BigDecimal BILLION = null;
    private static final java.math.BigDecimal MILLION = null;
    private static final java.math.BigDecimal THOUSANDS = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.binarybricks.coinbit.utils.CoinBitExtendedCurrency.Companion Companion = null;
    
    public CoinBitExtendedCurrency() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/binarybricks/coinbit/utils/CoinBitExtendedCurrency$Companion;", "", "()V", "BILLION", "Ljava/math/BigDecimal;", "CURRENCIES", "", "Lcom/mynameismidori/currencypicker/ExtendedCurrency;", "getCURRENCIES", "()Ljava/util/List;", "MILLION", "THOUSANDS", "TRILLION", "getAmountTextForDisplay", "", "amount", "amountCurrency", "Ljava/util/Currency;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.mynameismidori.currencypicker.ExtendedCurrency> getCURRENCIES() {
            return null;
        }
        
        /**
         * Method to give text for the amount passed. This method
         * will reduce the amount to 2 digits. Say if we pass 1300000
         * it will return 1.3 M representing 1.3 million
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAmountTextForDisplay(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
        java.util.Currency amountCurrency) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}