package com.binarybricks.coinbit.utils.resourcemanager;

import java.lang.System;

/**
 * Created by Pranay Airan 1/16/18.
 *
 * This is used to inject the resources for testing
 * https://medium.com/@daptronic/android-mvp-the-curious-case-of-resources-ddca39c1fccd
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0004\u001a\u00020\u0003H&J\u001a\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H&J3\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001H&\u00a2\u0006\u0002\u0010\fJ\u0012\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u0003H&J+\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001H&\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/binarybricks/coinbit/utils/resourcemanager/AndroidResourceManager;", "", "getColor", "", "resId", "getDrawable", "Landroid/graphics/drawable/Drawable;", "getQuantityString", "", "quantity", "formatArgs", "", "(II[Ljava/lang/Object;)Ljava/lang/String;", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "app_debug"})
public abstract interface AndroidResourceManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getString(@androidx.annotation.StringRes()
    int resId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getString(@androidx.annotation.StringRes()
    int resId, @org.jetbrains.annotations.NotNull()
    java.lang.Object... formatArgs);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getQuantityString(@androidx.annotation.PluralsRes()
    int resId, int quantity);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getQuantityString(@androidx.annotation.PluralsRes()
    int resId, int quantity, @org.jetbrains.annotations.NotNull()
    java.lang.Object... formatArgs);
    
    public abstract int getColor(int resId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract android.graphics.drawable.Drawable getDrawable(@androidx.annotation.DrawableRes()
    int resId);
}