package com.binarybricks.coinbit.data;

import java.lang.System;

/**
 * Created by Pranay Airan on 2/3/18.
 *
 * A Util that wraps all Shared Preference logic into 1 single place.
 * https://trivedihardik.wordpress.com/2017/08/01/kotlin-sharedpreferences-using-delegated-property/
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\fH\u0082\bJ\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nJ/\u0010\u000f\u001a\u0002H\u0010\"\b\b\u0000\u0010\u0010*\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u0002H\u0010H\u0007\u00a2\u0006\u0002\u0010\u0013J\"\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/binarybricks/coinbit/data/PreferenceManager;", "", "()V", "DEFAULT_CURRENCY", "", "DEFAULT_CURRENCY_VALUE", "IS_LAUNCH_FTU_SHOWN", "edit", "", "context", "Landroid/content/Context;", "operation", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "getDefaultCurrency", "getPreference", "T", "key", "defaultValue", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "setPreference", "value", "app_debug"})
public final class PreferenceManager {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_LAUNCH_FTU_SHOWN = "LaunchFtuShown";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEFAULT_CURRENCY = "DefaultCurrency";
    private static final java.lang.String DEFAULT_CURRENCY_VALUE = "USD";
    @org.jetbrains.annotations.NotNull()
    public static final com.binarybricks.coinbit.data.PreferenceManager INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDefaultCurrency(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Helper method to retrieve a preference value from [SharedPreferences].
     *
     * @param context a [Context] object.
     * @param key key for finding the preference
     * @param defaultValue A default to return if the value could not be read.
     * @return The value from shared preferences, or the provided default.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    public static final <T extends java.lang.Object>T getPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    T defaultValue) {
        return null;
    }
    
    /**
     * Helper method to write or remove any value from [SharedPreferences].
     *
     * @param context a [Context] object.
     * @param key key for writing or removing
     * @param value value to write in preference
     */
    public static final void setPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
    
    private final void edit(android.content.Context context, kotlin.jvm.functions.Function1<? super android.content.SharedPreferences.Editor, kotlin.Unit> operation) {
    }
    
    private PreferenceManager() {
        super();
    }
}