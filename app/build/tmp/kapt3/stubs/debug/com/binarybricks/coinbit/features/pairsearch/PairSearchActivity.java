package com.binarybricks.coinbit.features.pairsearch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u00a8\u0006\u0010"}, d2 = {"Lcom/binarybricks/coinbit/features/pairsearch/PairSearchActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "setPairList", "searchList", "", "", "Companion", "app_debug"})
public final class PairSearchActivity extends androidx.appcompat.app.AppCompatActivity {
    private static final java.lang.String SEARCH_LIST = "search_list";
    private static final java.lang.String SEARCH_RESULT = "search_result";
    private static final java.lang.String COIN_SYMBOL = "coin_symbol";
    @org.jetbrains.annotations.NotNull()
    public static final com.binarybricks.coinbit.features.pairsearch.PairSearchActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setPairList(java.util.List<java.lang.String> searchList) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public PairSearchActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.Intent buildLaunchIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> searchList, @org.jetbrains.annotations.NotNull()
    java.lang.String coinSymbol) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\fj\b\u0012\u0004\u0012\u00020\u0004`\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/binarybricks/coinbit/features/pairsearch/PairSearchActivity$Companion;", "", "()V", "COIN_SYMBOL", "", "SEARCH_LIST", "SEARCH_RESULT", "buildLaunchIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "searchList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "coinSymbol", "getResultFromIntent", "data", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent buildLaunchIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> searchList, @org.jetbrains.annotations.NotNull()
        java.lang.String coinSymbol) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getResultFromIntent(@org.jetbrains.annotations.NotNull()
        android.content.Intent data) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}