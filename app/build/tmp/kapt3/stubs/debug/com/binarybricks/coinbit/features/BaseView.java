package com.binarybricks.coinbit.features;

import java.lang.System;

/**
 * A base view interface used for all views,
 * and to signal network errors.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/binarybricks/coinbit/features/BaseView;", "", "onNetworkError", "", "errorMessage", "", "app_debug"})
public abstract interface BaseView {
    
    /**
     * Callback to signal a network error
     */
    public abstract void onNetworkError(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage);
}