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

public interface AddCoinTransactionItemViewModelBuilder {
  AddCoinTransactionItemViewModelBuilder onBind(
      OnModelBoundListener<AddCoinTransactionItemViewModel_, AddCoinTransactionItemView> listener);

  AddCoinTransactionItemViewModelBuilder onUnbind(
      OnModelUnboundListener<AddCoinTransactionItemViewModel_, AddCoinTransactionItemView> listener);

  AddCoinTransactionItemViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<AddCoinTransactionItemViewModel_, AddCoinTransactionItemView> listener);

  AddCoinTransactionItemViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<AddCoinTransactionItemViewModel_, AddCoinTransactionItemView> listener);

  AddCoinTransactionItemViewModelBuilder itemClickListener(
      @Nullable final OnModelClickListener<AddCoinTransactionItemViewModel_, AddCoinTransactionItemView> itemClickListener);

  AddCoinTransactionItemViewModelBuilder itemClickListener(
      @Nullable View.OnClickListener itemClickListener);

  AddCoinTransactionItemViewModelBuilder id(long id);

  AddCoinTransactionItemViewModelBuilder id(@androidx.annotation.Nullable Number... ids);

  AddCoinTransactionItemViewModelBuilder id(long id1, long id2);

  AddCoinTransactionItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key);

  AddCoinTransactionItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys);

  AddCoinTransactionItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key,
      long id);

  AddCoinTransactionItemViewModelBuilder spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
