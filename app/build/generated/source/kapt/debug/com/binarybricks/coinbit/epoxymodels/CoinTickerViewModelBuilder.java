package com.binarybricks.coinbit.epoxymodels;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelClickListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import com.binarybricks.coinbit.network.models.CryptoTicker;
import java.lang.CharSequence;
import java.lang.Number;
import java.lang.Object;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface CoinTickerViewModelBuilder {
  CoinTickerViewModelBuilder onBind(
      OnModelBoundListener<CoinTickerViewModel_, CoinTickerView> listener);

  CoinTickerViewModelBuilder onUnbind(
      OnModelUnboundListener<CoinTickerViewModel_, CoinTickerView> listener);

  CoinTickerViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<CoinTickerViewModel_, CoinTickerView> listener);

  CoinTickerViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<CoinTickerViewModel_, CoinTickerView> listener);

  CoinTickerViewModelBuilder ticker(@NotNull CryptoTicker ticker);

  CoinTickerViewModelBuilder tickerPrice(@NonNull CharSequence tickerPrice);

  CoinTickerViewModelBuilder tickerPrice(@StringRes int stringRes);

  CoinTickerViewModelBuilder tickerPrice(@StringRes int stringRes, Object... formatArgs);

  CoinTickerViewModelBuilder tickerPriceQuantityRes(@PluralsRes int pluralRes, int quantity,
      Object... formatArgs);

  CoinTickerViewModelBuilder tickerVolume(@NonNull CharSequence tickerVolume);

  CoinTickerViewModelBuilder tickerVolume(@StringRes int stringRes);

  CoinTickerViewModelBuilder tickerVolume(@StringRes int stringRes, Object... formatArgs);

  CoinTickerViewModelBuilder tickerVolumeQuantityRes(@PluralsRes int pluralRes, int quantity,
      Object... formatArgs);

  CoinTickerViewModelBuilder itemClickListener(
      @Nullable final OnModelClickListener<CoinTickerViewModel_, CoinTickerView> itemClickListener);

  CoinTickerViewModelBuilder itemClickListener(@Nullable View.OnClickListener itemClickListener);

  CoinTickerViewModelBuilder id(long id);

  CoinTickerViewModelBuilder id(@androidx.annotation.Nullable Number... ids);

  CoinTickerViewModelBuilder id(long id1, long id2);

  CoinTickerViewModelBuilder id(@androidx.annotation.Nullable CharSequence key);

  CoinTickerViewModelBuilder id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys);

  CoinTickerViewModelBuilder id(@androidx.annotation.Nullable CharSequence key, long id);

  CoinTickerViewModelBuilder spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
