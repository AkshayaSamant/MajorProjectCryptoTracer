package com.binarybricks.coinbit.epoxymodels;

import androidx.annotation.Nullable;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import java.lang.CharSequence;
import java.lang.Number;

public interface CoinNewsItemViewModelBuilder {
  CoinNewsItemViewModelBuilder onBind(
      OnModelBoundListener<CoinNewsItemViewModel_, CoinNewsItemView> listener);

  CoinNewsItemViewModelBuilder onUnbind(
      OnModelUnboundListener<CoinNewsItemViewModel_, CoinNewsItemView> listener);

  CoinNewsItemViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<CoinNewsItemViewModel_, CoinNewsItemView> listener);

  CoinNewsItemViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<CoinNewsItemViewModel_, CoinNewsItemView> listener);

  CoinNewsItemViewModelBuilder id(long id);

  CoinNewsItemViewModelBuilder id(@Nullable Number... ids);

  CoinNewsItemViewModelBuilder id(long id1, long id2);

  CoinNewsItemViewModelBuilder id(@Nullable CharSequence key);

  CoinNewsItemViewModelBuilder id(@Nullable CharSequence key, @Nullable CharSequence... otherKeys);

  CoinNewsItemViewModelBuilder id(@Nullable CharSequence key, long id);

  CoinNewsItemViewModelBuilder spanSizeOverride(
      @Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
