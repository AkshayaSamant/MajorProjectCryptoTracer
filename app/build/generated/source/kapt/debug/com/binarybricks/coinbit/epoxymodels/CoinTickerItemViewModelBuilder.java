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

public interface CoinTickerItemViewModelBuilder {
  CoinTickerItemViewModelBuilder onBind(
      OnModelBoundListener<CoinTickerItemViewModel_, CoinTickerItemView> listener);

  CoinTickerItemViewModelBuilder onUnbind(
      OnModelUnboundListener<CoinTickerItemViewModel_, CoinTickerItemView> listener);

  CoinTickerItemViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<CoinTickerItemViewModel_, CoinTickerItemView> listener);

  CoinTickerItemViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<CoinTickerItemViewModel_, CoinTickerItemView> listener);

  CoinTickerItemViewModelBuilder coinTickerData(
      @NotNull CoinTickerItemView.CoinTickerModuleData coinTickerData);

  CoinTickerItemViewModelBuilder moreClickListener(
      @Nullable final OnModelClickListener<CoinTickerItemViewModel_, CoinTickerItemView> moreClickListener);

  CoinTickerItemViewModelBuilder moreClickListener(
      @Nullable View.OnClickListener moreClickListener);

  CoinTickerItemViewModelBuilder id(long id);

  CoinTickerItemViewModelBuilder id(@androidx.annotation.Nullable Number... ids);

  CoinTickerItemViewModelBuilder id(long id1, long id2);

  CoinTickerItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key);

  CoinTickerItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys);

  CoinTickerItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key, long id);

  CoinTickerItemViewModelBuilder spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
