package com.binarybricks.coinbit.epoxymodels;

import android.view.View;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelClickListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import java.lang.CharSequence;
import java.lang.Number;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface EmptyCoinItemViewModelBuilder {
  EmptyCoinItemViewModelBuilder onBind(
      OnModelBoundListener<EmptyCoinItemViewModel_, EmptyCoinItemView> listener);

  EmptyCoinItemViewModelBuilder onUnbind(
      OnModelUnboundListener<EmptyCoinItemViewModel_, EmptyCoinItemView> listener);

  EmptyCoinItemViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<EmptyCoinItemViewModel_, EmptyCoinItemView> listener);

  EmptyCoinItemViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<EmptyCoinItemViewModel_, EmptyCoinItemView> listener);

  EmptyCoinItemViewModelBuilder emptyCardData(
      @NotNull EmptyCoinItemView.DashboardEmptyCoinModuleData emptyCardData);

  EmptyCoinItemViewModelBuilder itemClickListener(
      @Nullable final OnModelClickListener<EmptyCoinItemViewModel_, EmptyCoinItemView> itemClickListener);

  EmptyCoinItemViewModelBuilder itemClickListener(@Nullable View.OnClickListener itemClickListener);

  EmptyCoinItemViewModelBuilder id(long id);

  EmptyCoinItemViewModelBuilder id(@androidx.annotation.Nullable Number... ids);

  EmptyCoinItemViewModelBuilder id(long id1, long id2);

  EmptyCoinItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key);

  EmptyCoinItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys);

  EmptyCoinItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key, long id);

  EmptyCoinItemViewModelBuilder spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
