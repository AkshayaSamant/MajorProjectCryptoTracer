package com.binarybricks.coinbit.epoxymodels;

import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import java.lang.CharSequence;
import java.lang.Number;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface CoinHistoricalChartItemViewModelBuilder {
  CoinHistoricalChartItemViewModelBuilder onBind(
      OnModelBoundListener<CoinHistoricalChartItemViewModel_, CoinHistoricalChartItemView> listener);

  CoinHistoricalChartItemViewModelBuilder onUnbind(
      OnModelUnboundListener<CoinHistoricalChartItemViewModel_, CoinHistoricalChartItemView> listener);

  CoinHistoricalChartItemViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<CoinHistoricalChartItemViewModel_, CoinHistoricalChartItemView> listener);

  CoinHistoricalChartItemViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<CoinHistoricalChartItemViewModel_, CoinHistoricalChartItemView> listener);

  CoinHistoricalChartItemViewModelBuilder chartData(
      @NotNull CoinHistoricalChartItemView.HistoricalChartModuleData chartData);

  CoinHistoricalChartItemViewModelBuilder onChartRangeSelected(
      @Nullable CoinHistoricalChartItemView.OnHistoricalChardRangeSelectionListener onChartRangeSelected);

  CoinHistoricalChartItemViewModelBuilder id(long id);

  CoinHistoricalChartItemViewModelBuilder id(@androidx.annotation.Nullable Number... ids);

  CoinHistoricalChartItemViewModelBuilder id(long id1, long id2);

  CoinHistoricalChartItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key);

  CoinHistoricalChartItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys);

  CoinHistoricalChartItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key,
      long id);

  CoinHistoricalChartItemViewModelBuilder spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
