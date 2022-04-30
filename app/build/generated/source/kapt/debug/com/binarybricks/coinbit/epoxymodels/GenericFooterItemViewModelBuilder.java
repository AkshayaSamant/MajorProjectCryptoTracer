package com.binarybricks.coinbit.epoxymodels;

import androidx.annotation.Nullable;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import java.lang.CharSequence;
import java.lang.Number;
import org.jetbrains.annotations.NotNull;

public interface GenericFooterItemViewModelBuilder {
  GenericFooterItemViewModelBuilder onBind(
      OnModelBoundListener<GenericFooterItemViewModel_, GenericFooterItemView> listener);

  GenericFooterItemViewModelBuilder onUnbind(
      OnModelUnboundListener<GenericFooterItemViewModel_, GenericFooterItemView> listener);

  GenericFooterItemViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<GenericFooterItemViewModel_, GenericFooterItemView> listener);

  GenericFooterItemViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<GenericFooterItemViewModel_, GenericFooterItemView> listener);

  GenericFooterItemViewModelBuilder footerContent(
      @NotNull GenericFooterItemView.FooterModuleData footerContent);

  GenericFooterItemViewModelBuilder id(long id);

  GenericFooterItemViewModelBuilder id(@Nullable Number... ids);

  GenericFooterItemViewModelBuilder id(long id1, long id2);

  GenericFooterItemViewModelBuilder id(@Nullable CharSequence key);

  GenericFooterItemViewModelBuilder id(@Nullable CharSequence key,
      @Nullable CharSequence... otherKeys);

  GenericFooterItemViewModelBuilder id(@Nullable CharSequence key, long id);

  GenericFooterItemViewModelBuilder spanSizeOverride(
      @Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
