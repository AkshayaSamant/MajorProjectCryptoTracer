package com.binarybricks.coinbit.features.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0016J\b\u0010\u001c\u001a\u00020\u0010H\u0016J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0010H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r\u00a8\u0006\""}, d2 = {"Lcom/binarybricks/coinbit/features/settings/SettingsFragment;", "Landroidx/fragment/app/Fragment;", "LSettingsContract$View;", "()V", "coinRepo", "Lcom/binarybricks/coinbit/features/CryptoCompareRepository;", "getCoinRepo", "()Lcom/binarybricks/coinbit/features/CryptoCompareRepository;", "coinRepo$delegate", "Lkotlin/Lazy;", "settingsPresenter", "Lcom/binarybricks/coinbit/features/settings/SettingsPresenter;", "getSettingsPresenter", "()Lcom/binarybricks/coinbit/features/settings/SettingsPresenter;", "settingsPresenter$delegate", "initializeUI", "", "inflatedView", "Landroid/view/View;", "onCoinListRefreshed", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onExchangeListRefreshed", "onNetworkError", "errorMessage", "", "openCurrencyPicker", "Companion", "app_debug"})
public final class SettingsFragment extends androidx.fragment.app.Fragment implements SettingsContract.View {
    private final kotlin.Lazy coinRepo$delegate = null;
    private final kotlin.Lazy settingsPresenter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "SettingsFragment";
    @org.jetbrains.annotations.NotNull()
    public static final com.binarybricks.coinbit.features.settings.SettingsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.binarybricks.coinbit.features.CryptoCompareRepository getCoinRepo() {
        return null;
    }
    
    private final com.binarybricks.coinbit.features.settings.SettingsPresenter getSettingsPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void initializeUI(android.view.View inflatedView) {
    }
    
    private final void openCurrencyPicker() {
    }
    
    @java.lang.Override()
    public void onCoinListRefreshed() {
    }
    
    @java.lang.Override()
    public void onExchangeListRefreshed() {
    }
    
    @java.lang.Override()
    public void onNetworkError(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public SettingsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/binarybricks/coinbit/features/settings/SettingsFragment$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}