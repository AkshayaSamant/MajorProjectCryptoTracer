package com.binarybricks.coinbit.features.launch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\u0012\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0006\u0010\u001a\u001a\u00020\u0010R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lcom/binarybricks/coinbit/features/launch/LaunchActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "LLaunchContract$View;", "()V", "coinRepo", "Lcom/binarybricks/coinbit/features/CryptoCompareRepository;", "getCoinRepo", "()Lcom/binarybricks/coinbit/features/CryptoCompareRepository;", "coinRepo$delegate", "Lkotlin/Lazy;", "launchPresenter", "Lcom/binarybricks/coinbit/features/launch/LaunchPresenter;", "getLaunchPresenter", "()Lcom/binarybricks/coinbit/features/launch/LaunchPresenter;", "launchPresenter$delegate", "initializeUI", "", "onAllSupportedCoinsLoaded", "onBackPressed", "onCoinsLoaded", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNetworkError", "errorMessage", "", "openCurrencyPicker", "IntroAdapter", "app_debug"})
public final class LaunchActivity extends androidx.appcompat.app.AppCompatActivity implements LaunchContract.View {
    private final kotlin.Lazy coinRepo$delegate = null;
    private final kotlin.Lazy launchPresenter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.binarybricks.coinbit.features.CryptoCompareRepository getCoinRepo() {
        return null;
    }
    
    private final com.binarybricks.coinbit.features.launch.LaunchPresenter getLaunchPresenter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initializeUI() {
    }
    
    @java.lang.Override()
    public void onCoinsLoaded() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void onNetworkError(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
    
    public final void openCurrencyPicker() {
    }
    
    @java.lang.Override()
    public void onAllSupportedCoinsLoaded() {
    }
    
    public LaunchActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/binarybricks/coinbit/features/launch/LaunchActivity$IntroAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "(Lcom/binarybricks/coinbit/features/launch/LaunchActivity;Landroidx/fragment/app/FragmentManager;)V", "currentFragment", "Landroidx/fragment/app/Fragment;", "getCount", "", "getCurrentFragment", "getItem", "position", "app_debug"})
    final class IntroAdapter extends androidx.fragment.app.FragmentPagerAdapter {
        private androidx.fragment.app.Fragment currentFragment;
        
        @org.jetbrains.annotations.Nullable()
        public final androidx.fragment.app.Fragment getCurrentFragment() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public androidx.fragment.app.Fragment getItem(int position) {
            return null;
        }
        
        @java.lang.Override()
        public int getCount() {
            return 0;
        }
        
        public IntroAdapter(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fm) {
            super(null);
        }
    }
}