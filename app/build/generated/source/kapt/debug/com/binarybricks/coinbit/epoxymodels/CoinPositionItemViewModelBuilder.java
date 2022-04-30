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

public interface CoinPositionItemViewModelBuilder {
  CoinPositionItemViewModelBuilder onBind(
      OnModelBoundListener<CoinPositionItemViewModel_, CoinPositionItemView> listener);

  CoinPositionItemViewModelBuilder onUnbind(
      OnModelUnboundListener<CoinPositionItemViewModel_, CoinPositionItemView> listener);

  CoinPositionItemViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<CoinPositionItemViewModel_, CoinPositionItemView> listener);

  CoinPositionItemViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<CoinPositionItemViewModel_, CoinPositionItemView> listener);

  CoinPositionItemViewModelBuilder coinPrice(
      @NotNull CoinPositionItemView.CoinPositionCardModuleData coinPrice);

  CoinPositionItemViewModelBuilder id(long id);

  CoinPositionItemViewModelBuilder id(@Nullable Number... ids);

  CoinPositionItemViewModelBuilder id(long id1, long id2);

  CoinPositionItemViewModelBuilder id(@Nullable CharSequence key);

  CoinPositionItemViewModelBuilder id(@Nullable CharSequence key,
      @Nullable CharSequence... otherKeys);

  CoinPositionItemViewModelBuilder id(@Nullable CharSequence key, long id);

  CoinPositionItemViewModelBuilder spanSizeOverride(
      @Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
