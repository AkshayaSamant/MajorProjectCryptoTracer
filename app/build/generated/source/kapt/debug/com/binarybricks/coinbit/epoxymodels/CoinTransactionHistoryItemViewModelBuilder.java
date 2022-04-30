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

public interface CoinTransactionHistoryItemViewModelBuilder {
  CoinTransactionHistoryItemViewModelBuilder onBind(
      OnModelBoundListener<CoinTransactionHistoryItemViewModel_, CoinTransactionHistoryItemView> listener);

  CoinTransactionHistoryItemViewModelBuilder onUnbind(
      OnModelUnboundListener<CoinTransactionHistoryItemViewModel_, CoinTransactionHistoryItemView> listener);

  CoinTransactionHistoryItemViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<CoinTransactionHistoryItemViewModel_, CoinTransactionHistoryItemView> listener);

  CoinTransactionHistoryItemViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<CoinTransactionHistoryItemViewModel_, CoinTransactionHistoryItemView> listener);

  CoinTransactionHistoryItemViewModelBuilder coinTransactionHistoryModuleData(
      @NotNull CoinTransactionHistoryItemView.CoinTransactionHistoryModuleData coinTransactionHistoryModuleData);

  CoinTransactionHistoryItemViewModelBuilder id(long id);

  CoinTransactionHistoryItemViewModelBuilder id(@Nullable Number... ids);

  CoinTransactionHistoryItemViewModelBuilder id(long id1, long id2);

  CoinTransactionHistoryItemViewModelBuilder id(@Nullable CharSequence key);

  CoinTransactionHistoryItemViewModelBuilder id(@Nullable CharSequence key,
      @Nullable CharSequence... otherKeys);

  CoinTransactionHistoryItemViewModelBuilder id(@Nullable CharSequence key, long id);

  CoinTransactionHistoryItemViewModelBuilder spanSizeOverride(
      @Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
