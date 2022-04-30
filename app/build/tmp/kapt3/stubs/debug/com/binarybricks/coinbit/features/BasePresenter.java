package com.binarybricks.coinbit.features;

import java.lang.System;

/**
 * A base class for all our presenters. It provides the basics nuts & bolts of attaching/detaching a presenter to/from a
 * view, as well as the strings resolution class.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0013\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0017H\u0007J\u0006\u0010\u001a\u001a\u00020\u0017R\u0014\u0010\b\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0004\u0018\u00018\u0000X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00128DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/binarybricks/coinbit/features/BasePresenter;", "V", "Lcom/binarybricks/coinbit/features/BaseView;", "Landroidx/lifecycle/LifecycleObserver;", "Lkotlinx/coroutines/CoroutineScope;", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "coroutineContext", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "currentView", "getCurrentView", "()Lcom/binarybricks/coinbit/features/BaseView;", "setCurrentView", "(Lcom/binarybricks/coinbit/features/BaseView;)V", "Lcom/binarybricks/coinbit/features/BaseView;", "isViewAttached", "", "()Z", "job", "Lkotlinx/coroutines/CompletableJob;", "attachView", "", "view", "cleanYourSelf", "detachView", "app_debug"})
public class BasePresenter<V extends com.binarybricks.coinbit.features.BaseView> implements androidx.lifecycle.LifecycleObserver, kotlinx.coroutines.CoroutineScope {
    @org.jetbrains.annotations.Nullable()
    private V currentView;
    private final kotlinx.coroutines.CompletableJob job = null;
    private final kotlin.coroutines.CoroutineContext uiContext = null;
    
    @org.jetbrains.annotations.Nullable()
    protected final V getCurrentView() {
        return null;
    }
    
    protected final void setCurrentView(@org.jetbrains.annotations.Nullable()
    V p0) {
    }
    
    protected final boolean isViewAttached() {
        return false;
    }
    
    public final void attachView(@org.jetbrains.annotations.NotNull()
    V view) {
    }
    
    public final void detachView() {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public final void cleanYourSelf() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    public BasePresenter(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext uiContext) {
        super();
    }
    
    public BasePresenter() {
        super();
    }
}