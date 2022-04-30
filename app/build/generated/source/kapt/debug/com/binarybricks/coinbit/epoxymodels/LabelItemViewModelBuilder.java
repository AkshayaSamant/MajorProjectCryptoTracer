package com.binarybricks.coinbit.epoxymodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import java.lang.CharSequence;
import java.lang.Number;
import java.lang.Object;

public interface LabelItemViewModelBuilder {
  LabelItemViewModelBuilder onBind(
      OnModelBoundListener<LabelItemViewModel_, LabelItemView> listener);

  LabelItemViewModelBuilder onUnbind(
      OnModelUnboundListener<LabelItemViewModel_, LabelItemView> listener);

  LabelItemViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<LabelItemViewModel_, LabelItemView> listener);

  LabelItemViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<LabelItemViewModel_, LabelItemView> listener);

  LabelItemViewModelBuilder label(@NonNull CharSequence label);

  LabelItemViewModelBuilder label(@StringRes int stringRes);

  LabelItemViewModelBuilder label(@StringRes int stringRes, Object... formatArgs);

  LabelItemViewModelBuilder labelQuantityRes(@PluralsRes int pluralRes, int quantity,
      Object... formatArgs);

  LabelItemViewModelBuilder id(long id);

  LabelItemViewModelBuilder id(@Nullable Number... ids);

  LabelItemViewModelBuilder id(long id1, long id2);

  LabelItemViewModelBuilder id(@Nullable CharSequence key);

  LabelItemViewModelBuilder id(@Nullable CharSequence key, @Nullable CharSequence... otherKeys);

  LabelItemViewModelBuilder id(@Nullable CharSequence key, long id);

  LabelItemViewModelBuilder spanSizeOverride(
      @Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
