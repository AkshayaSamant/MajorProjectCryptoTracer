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

public interface ExpandedNewsItemViewModelBuilder {
  ExpandedNewsItemViewModelBuilder onBind(
      OnModelBoundListener<ExpandedNewsItemViewModel_, ExpandedNewsItemView> listener);

  ExpandedNewsItemViewModelBuilder onUnbind(
      OnModelUnboundListener<ExpandedNewsItemViewModel_, ExpandedNewsItemView> listener);

  ExpandedNewsItemViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<ExpandedNewsItemViewModel_, ExpandedNewsItemView> listener);

  ExpandedNewsItemViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<ExpandedNewsItemViewModel_, ExpandedNewsItemView> listener);

  ExpandedNewsItemViewModelBuilder news(@NotNull ExpandedNewsItemView.DiscoveryNewsModuleData news);

  ExpandedNewsItemViewModelBuilder id(long id);

  ExpandedNewsItemViewModelBuilder id(@Nullable Number... ids);

  ExpandedNewsItemViewModelBuilder id(long id1, long id2);

  ExpandedNewsItemViewModelBuilder id(@Nullable CharSequence key);

  ExpandedNewsItemViewModelBuilder id(@Nullable CharSequence key,
      @Nullable CharSequence... otherKeys);

  ExpandedNewsItemViewModelBuilder id(@Nullable CharSequence key, long id);

  ExpandedNewsItemViewModelBuilder spanSizeOverride(
      @Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
