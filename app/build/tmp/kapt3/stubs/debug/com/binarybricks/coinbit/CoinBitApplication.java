package com.binarybricks.coinbit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0006B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/binarybricks/coinbit/CoinBitApplication;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "CrashReportingTree", "app_debug"})
public final class CoinBitApplication extends android.app.Application {
    private static final java.lang.String DATABASE_NAME = "coinbit.db";
    private static android.content.Context appContext;
    @org.jetbrains.annotations.Nullable()
    private static com.binarybricks.coinbit.data.database.CoinBitDatabase database;
    @org.jetbrains.annotations.NotNull()
    public static final com.binarybricks.coinbit.CoinBitApplication.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public CoinBitApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.Context getGlobalAppContext() {
        return null;
    }
    
    /**
     * A tree which logs important information for crash reporting.
     */
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014\u00a8\u0006\f"}, d2 = {"Lcom/binarybricks/coinbit/CoinBitApplication$CrashReportingTree;", "Ltimber/log/Timber$Tree;", "()V", "log", "", "priority", "", "tag", "", "message", "t", "", "app_debug"})
    static final class CrashReportingTree extends timber.log.Timber.Tree {
        
        @java.lang.Override()
        protected void log(int priority, @org.jetbrains.annotations.Nullable()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable t) {
        }
        
        public CrashReportingTree() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u000e"}, d2 = {"Lcom/binarybricks/coinbit/CoinBitApplication$Companion;", "", "()V", "DATABASE_NAME", "", "appContext", "Landroid/content/Context;", "database", "Lcom/binarybricks/coinbit/data/database/CoinBitDatabase;", "getDatabase", "()Lcom/binarybricks/coinbit/data/database/CoinBitDatabase;", "setDatabase", "(Lcom/binarybricks/coinbit/data/database/CoinBitDatabase;)V", "getGlobalAppContext", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.binarybricks.coinbit.data.database.CoinBitDatabase getDatabase() {
            return null;
        }
        
        public final void setDatabase(@org.jetbrains.annotations.Nullable()
        com.binarybricks.coinbit.data.database.CoinBitDatabase p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getGlobalAppContext() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}