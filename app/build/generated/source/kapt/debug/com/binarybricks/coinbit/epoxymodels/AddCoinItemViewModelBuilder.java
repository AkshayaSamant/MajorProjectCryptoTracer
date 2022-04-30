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
import org.jetbrains.annotations.Nullable;

public interface AddCoinItemViewModelBuilder {
  AddCoinItemViewModelBuilder onBind(
      OnModelBoundListener<AddCoinItemViewModel_, AddCoinItemView> listener);

  AddCoinItemViewModelBuilder onUnbind(
      OnModelUnboundListener<AddCoinItemViewModel_, AddCoinItemView> listener);

  AddCoinItemViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<AddCoinItemViewModel_, AddCoinItemView> listener);

  AddCoinItemViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<AddCoinItemViewModel_, AddCoinItemView> listener);

  AddCoinItemViewModelBuilder addCoinClickListener(
      @Nullable final OnModelClickListener<AddCoinItemViewModel_, AddCoinItemView> addCoinClickListener);

  AddCoinItemViewModelBuilder addCoinClickListener(
      @Nullable View.OnClickListener addCoinClickListener);

  AddCoinItemViewModelBuilder id(long id);

  AddCoinItemViewModelBuilder id(@androidx.annotation.Nullable Number... ids);

  AddCoinItemViewModelBuilder id(long id1, long id2);

  AddCoinItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key);

  AddCoinItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys);

  AddCoinItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key, long id);

  AddCoinItemViewModelBuilder spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
