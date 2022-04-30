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

public interface ChipGroupItemViewModelBuilder {
  ChipGroupItemViewModelBuilder onBind(
      OnModelBoundListener<ChipGroupItemViewModel_, ChipGroupItemView> listener);

  ChipGroupItemViewModelBuilder onUnbind(
      OnModelUnboundListener<ChipGroupItemViewModel_, ChipGroupItemView> listener);

  ChipGroupItemViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<ChipGroupItemViewModel_, ChipGroupItemView> listener);

  ChipGroupItemViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<ChipGroupItemViewModel_, ChipGroupItemView> listener);

  ChipGroupItemViewModelBuilder chipData(@NotNull ChipGroupItemView.ChipGroupModuleData chipData);

  ChipGroupItemViewModelBuilder chipClickListener(
      @Nullable ChipGroupItemView.OnChipItemClickedListener chipClickListener);

  ChipGroupItemViewModelBuilder id(long id);

  ChipGroupItemViewModelBuilder id(@androidx.annotation.Nullable Number... ids);

  ChipGroupItemViewModelBuilder id(long id1, long id2);

  ChipGroupItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key);

  ChipGroupItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys);

  ChipGroupItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key, long id);

  ChipGroupItemViewModelBuilder spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
