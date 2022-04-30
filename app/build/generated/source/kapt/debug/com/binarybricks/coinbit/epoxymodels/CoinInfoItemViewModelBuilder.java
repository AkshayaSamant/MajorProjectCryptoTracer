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

public interface CoinInfoItemViewModelBuilder {
  CoinInfoItemViewModelBuilder onBind(
      OnModelBoundListener<CoinInfoItemViewModel_, CoinInfoItemView> listener);

  CoinInfoItemViewModelBuilder onUnbind(
      OnModelUnboundListener<CoinInfoItemViewModel_, CoinInfoItemView> listener);

  CoinInfoItemViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<CoinInfoItemViewModel_, CoinInfoItemView> listener);

  CoinInfoItemViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<CoinInfoItemViewModel_, CoinInfoItemView> listener);

  CoinInfoItemViewModelBuilder exchange(@NotNull CoinInfoItemView.CoinInfoModuleData exchange);

  CoinInfoItemViewModelBuilder id(long id);

  CoinInfoItemViewModelBuilder id(@Nullable Number... ids);

  CoinInfoItemViewModelBuilder id(long id1, long id2);

  CoinInfoItemViewModelBuilder id(@Nullable CharSequence key);

  CoinInfoItemViewModelBuilder id(@Nullable CharSequence key, @Nullable CharSequence... otherKeys);

  CoinInfoItemViewModelBuilder id(@Nullable CharSequence key, long id);

  CoinInfoItemViewModelBuilder spanSizeOverride(
      @Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
