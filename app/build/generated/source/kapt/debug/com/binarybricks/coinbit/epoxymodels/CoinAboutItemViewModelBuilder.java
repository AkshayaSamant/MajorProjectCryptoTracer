package com.binarybricks.coinbit.epoxymodels;

import androidx.annotation.Nullable;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import java.lang.CharSequence;
import java.lang.Number;

public interface CoinAboutItemViewModelBuilder {
  CoinAboutItemViewModelBuilder onBind(
      OnModelBoundListener<CoinAboutItemViewModel_, CoinAboutItemView> listener);

  CoinAboutItemViewModelBuilder onUnbind(
      OnModelUnboundListener<CoinAboutItemViewModel_, CoinAboutItemView> listener);

  CoinAboutItemViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<CoinAboutItemViewModel_, CoinAboutItemView> listener);

  CoinAboutItemViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<CoinAboutItemViewModel_, CoinAboutItemView> listener);

  CoinAboutItemViewModelBuilder id(long id);

  CoinAboutItemViewModelBuilder id(@Nullable Number... ids);

  CoinAboutItemViewModelBuilder id(long id1, long id2);

  CoinAboutItemViewModelBuilder id(@Nullable CharSequence key);

  CoinAboutItemViewModelBuilder id(@Nullable CharSequence key, @Nullable CharSequence... otherKeys);

  CoinAboutItemViewModelBuilder id(@Nullable CharSequence key, long id);

  CoinAboutItemViewModelBuilder spanSizeOverride(
      @Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
