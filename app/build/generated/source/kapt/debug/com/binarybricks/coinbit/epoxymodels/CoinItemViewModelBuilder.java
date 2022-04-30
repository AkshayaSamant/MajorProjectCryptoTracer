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

public interface CoinItemViewModelBuilder {
  CoinItemViewModelBuilder onBind(OnModelBoundListener<CoinItemViewModel_, CoinItemView> listener);

  CoinItemViewModelBuilder onUnbind(
      OnModelUnboundListener<CoinItemViewModel_, CoinItemView> listener);

  CoinItemViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<CoinItemViewModel_, CoinItemView> listener);

  CoinItemViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<CoinItemViewModel_, CoinItemView> listener);

  CoinItemViewModelBuilder dashboardCoinModuleData(
      @NotNull CoinItemView.DashboardCoinModuleData dashboardCoinModuleData);

  CoinItemViewModelBuilder itemClickListener(
      @Nullable CoinItemView.OnCoinItemClickListener itemClickListener);

  CoinItemViewModelBuilder id(long id);

  CoinItemViewModelBuilder id(@androidx.annotation.Nullable Number... ids);

  CoinItemViewModelBuilder id(long id1, long id2);

  CoinItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key);

  CoinItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys);

  CoinItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key, long id);

  CoinItemViewModelBuilder spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
