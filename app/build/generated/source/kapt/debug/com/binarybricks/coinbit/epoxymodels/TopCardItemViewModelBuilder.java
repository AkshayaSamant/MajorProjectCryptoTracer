package com.binarybricks.coinbit.epoxymodels;

import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import java.lang.CharSequence;
import java.lang.Number;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface TopCardItemViewModelBuilder {
  TopCardItemViewModelBuilder onBind(
      OnModelBoundListener<TopCardItemViewModel_, TopCardItemView> listener);

  TopCardItemViewModelBuilder onUnbind(
      OnModelUnboundListener<TopCardItemViewModel_, TopCardItemView> listener);

  TopCardItemViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<TopCardItemViewModel_, TopCardItemView> listener);

  TopCardItemViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<TopCardItemViewModel_, TopCardItemView> listener);

  TopCardItemViewModelBuilder topCardData(@NotNull TopCardItemView.TopCardsModuleData topCardData);

  TopCardItemViewModelBuilder itemClickListener(
      @Nullable TopCardItemView.OnTopItemClickedListener itemClickListener);

  TopCardItemViewModelBuilder id(long id);

  TopCardItemViewModelBuilder id(@androidx.annotation.Nullable Number... ids);

  TopCardItemViewModelBuilder id(long id1, long id2);

  TopCardItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key);

  TopCardItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys);

  TopCardItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key, long id);

  TopCardItemViewModelBuilder spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
