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

public interface CoinStatsticsItemViewModelBuilder {
  CoinStatsticsItemViewModelBuilder onBind(
      OnModelBoundListener<CoinStatsticsItemViewModel_, CoinStatsticsItemView> listener);

  CoinStatsticsItemViewModelBuilder onUnbind(
      OnModelUnboundListener<CoinStatsticsItemViewModel_, CoinStatsticsItemView> listener);

  CoinStatsticsItemViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<CoinStatsticsItemViewModel_, CoinStatsticsItemView> listener);

  CoinStatsticsItemViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<CoinStatsticsItemViewModel_, CoinStatsticsItemView> listener);

  CoinStatsticsItemViewModelBuilder coinPrice(
      @NotNull CoinStatsticsItemView.CoinStatisticsModuleData coinPrice);

  CoinStatsticsItemViewModelBuilder id(long id);

  CoinStatsticsItemViewModelBuilder id(@Nullable Number... ids);

  CoinStatsticsItemViewModelBuilder id(long id1, long id2);

  CoinStatsticsItemViewModelBuilder id(@Nullable CharSequence key);

  CoinStatsticsItemViewModelBuilder id(@Nullable CharSequence key,
      @Nullable CharSequence... otherKeys);

  CoinStatsticsItemViewModelBuilder id(@Nullable CharSequence key, long id);

  CoinStatsticsItemViewModelBuilder spanSizeOverride(
      @Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
