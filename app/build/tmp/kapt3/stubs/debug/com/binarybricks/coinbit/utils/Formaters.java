package com.binarybricks.coinbit.utils;

import java.lang.System;

/**
 * Use to format quantity that we get it from api
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020/J\u0016\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020*2\u0006\u00102\u001a\u000203J\u000e\u00104\u001a\u00020*2\u0006\u00105\u001a\u000206J\u0010\u00107\u001a\u0004\u0018\u00010*2\u0006\u00108\u001a\u000203J\u000e\u00109\u001a\u00020*2\u0006\u00101\u001a\u00020*J\u0018\u0010:\u001a\u00020*2\u0006\u00101\u001a\u00020*2\b\b\u0002\u0010;\u001a\u00020/R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0011\u0010\u000eR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001d\u0010\u001aR\u001b\u0010\u001f\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b \u0010\u001aR\u001b\u0010\"\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\n\u001a\u0004\b#\u0010\u001aR\u001b\u0010%\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010\n\u001a\u0004\b&\u0010\u001aR\u000e\u0010(\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lcom/binarybricks/coinbit/utils/Formaters;", "", "androidResourceManager", "Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManager;", "(Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManager;)V", "calendar", "Ljava/util/Calendar;", "getCalendar", "()Ljava/util/Calendar;", "calendar$delegate", "Lkotlin/Lazy;", "formatter", "Ljava/text/NumberFormat;", "getFormatter", "()Ljava/text/NumberFormat;", "formatter$delegate", "formatterNumber", "getFormatterNumber", "formatterNumber$delegate", "mathContext", "Ljava/math/MathContext;", "million", "Ljava/math/BigDecimal;", "prettyDateFormat", "Ljava/text/SimpleDateFormat;", "getPrettyDateFormat", "()Ljava/text/SimpleDateFormat;", "prettyDateFormat$delegate", "simpleDateFormat", "getSimpleDateFormat", "simpleDateFormat$delegate", "simpleDateFormatIso", "getSimpleDateFormatIso", "simpleDateFormatIso$delegate", "simpleDateFormatMonthDayYear", "getSimpleDateFormatMonthDayYear", "simpleDateFormatMonthDayYear$delegate", "simpleTimeFormat", "getSimpleTimeFormat", "simpleTimeFormat$delegate", "thousand", "formatAmount", "", "amount", "currency", "Ljava/util/Currency;", "rounding", "", "formatDate", "timestamp", "multiplier", "", "formatDatePretty", "date", "Ljava/util/Date;", "formatNumber", "num", "formatTransactionDate", "parseAndFormatIsoDate", "shouldShortenToday", "app_debug"})
public final class Formaters {
    private final java.math.BigDecimal million = null;
    private final java.math.BigDecimal thousand = null;
    private final java.math.MathContext mathContext = null;
    private final kotlin.Lazy formatter$delegate = null;
    private final kotlin.Lazy formatterNumber$delegate = null;
    private final kotlin.Lazy calendar$delegate = null;
    private final kotlin.Lazy simpleTimeFormat$delegate = null;
    private final kotlin.Lazy simpleDateFormatMonthDayYear$delegate = null;
    private final kotlin.Lazy simpleDateFormat$delegate = null;
    private final kotlin.Lazy prettyDateFormat$delegate = null;
    private final kotlin.Lazy simpleDateFormatIso$delegate = null;
    private final com.binarybricks.coinbit.utils.resourcemanager.AndroidResourceManager androidResourceManager = null;
    
    private final java.text.NumberFormat getFormatter() {
        return null;
    }
    
    private final java.text.NumberFormat getFormatterNumber() {
        return null;
    }
    
    private final java.util.Calendar getCalendar() {
        return null;
    }
    
    private final java.text.SimpleDateFormat getSimpleTimeFormat() {
        return null;
    }
    
    private final java.text.SimpleDateFormat getSimpleDateFormatMonthDayYear() {
        return null;
    }
    
    private final java.text.SimpleDateFormat getSimpleDateFormat() {
        return null;
    }
    
    private final java.text.SimpleDateFormat getPrettyDateFormat() {
        return null;
    }
    
    private final java.text.SimpleDateFormat getSimpleDateFormatIso() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String amount, @org.jetbrains.annotations.NotNull()
    java.util.Currency currency, boolean rounding) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String formatNumber(int num) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatDate(@org.jetbrains.annotations.NotNull()
    java.lang.String timestamp, int multiplier) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatDatePretty(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatTransactionDate(@org.jetbrains.annotations.NotNull()
    java.lang.String timestamp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String parseAndFormatIsoDate(@org.jetbrains.annotations.NotNull()
    java.lang.String timestamp, boolean shouldShortenToday) {
        return null;
    }
    
    public Formaters(@org.jetbrains.annotations.NotNull()
    com.binarybricks.coinbit.utils.resourcemanager.AndroidResourceManager androidResourceManager) {
        super();
    }
}