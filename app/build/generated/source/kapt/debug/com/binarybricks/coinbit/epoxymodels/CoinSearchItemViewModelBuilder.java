package com.binarybricks.coinbit.epoxymodels;

import android.view.View;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelClickListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import com.binarybricks.coinbit.data.database.entities.WatchedCoin;
import java.lang.CharSequence;
import java.lang.Number;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface CoinSearchItemViewModelBuilder {
  CoinSearchItemViewModelBuilder onBind(
      OnModelBoundListener<CoinSearchItemViewModel_, CoinSearchItemView> listener);

  CoinSearchItemViewModelBuilder onUnbind(
      OnModelUnboundListener<CoinSearchItemViewModel_, CoinSearchItemView> listener);

  CoinSearchItemViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<CoinSearchItemViewModel_, CoinSearchItemView> listener);

  CoinSearchItemViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<CoinSearchItemViewModel_, CoinSearchItemView> listener);

  CoinSearchItemViewModelBuilder watchedCoin(@NotNull WatchedCoin watchedCoin);

  CoinSearchItemViewModelBuilder itemClickListener(
      @Nullable final OnModelClickListener<CoinSearchItemViewModel_, CoinSearchItemView> itemClickListener);

  CoinSearchItemViewModelBuilder itemClickListener(
      @Nullable View.OnClickListener itemClickListener);

  CoinSearchItemViewModelBuilder onWatchedChecked(
      @Nullable CoinSearchItemView.OnSearchItemClickListener onWatchedChecked);

  CoinSearchItemViewModelBuilder id(long id);

  CoinSearchItemViewModelBuilder id(@androidx.annotation.Nullable Number... ids);

  CoinSearchItemViewModelBuilder id(long id1, long id2);

  CoinSearchItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key);

  CoinSearchItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys);

  CoinSearchItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key, long id);

  CoinSearchItemViewModelBuilder spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
