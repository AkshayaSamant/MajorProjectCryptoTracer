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
import java.lang.CharSequence;
import java.lang.Number;
import java.lang.Object;
import org.jetbrains.annotations.Nullable;

public interface ExchangePairItemViewModelBuilder {
  ExchangePairItemViewModelBuilder onBind(
      OnModelBoundListener<ExchangePairItemViewModel_, ExchangePairItemView> listener);

  ExchangePairItemViewModelBuilder onUnbind(
      OnModelUnboundListener<ExchangePairItemViewModel_, ExchangePairItemView> listener);

  ExchangePairItemViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<ExchangePairItemViewModel_, ExchangePairItemView> listener);

  ExchangePairItemViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<ExchangePairItemViewModel_, ExchangePairItemView> listener);

  ExchangePairItemViewModelBuilder exchangeName(@NonNull CharSequence exchangeName);

  ExchangePairItemViewModelBuilder exchangeName(@StringRes int stringRes);

  ExchangePairItemViewModelBuilder exchangeName(@StringRes int stringRes, Object... formatArgs);

  ExchangePairItemViewModelBuilder exchangeNameQuantityRes(@PluralsRes int pluralRes, int quantity,
      Object... formatArgs);

  ExchangePairItemViewModelBuilder itemClickListener(
      @Nullable final OnModelClickListener<ExchangePairItemViewModel_, ExchangePairItemView> itemClickListener);

  ExchangePairItemViewModelBuilder itemClickListener(
      @Nullable View.OnClickListener itemClickListener);

  ExchangePairItemViewModelBuilder id(long id);

  ExchangePairItemViewModelBuilder id(@androidx.annotation.Nullable Number... ids);

  ExchangePairItemViewModelBuilder id(long id1, long id2);

  ExchangePairItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key);

  ExchangePairItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys);

  ExchangePairItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key, long id);

  ExchangePairItemViewModelBuilder spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
