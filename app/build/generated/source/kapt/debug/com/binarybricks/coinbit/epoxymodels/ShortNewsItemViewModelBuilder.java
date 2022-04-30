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

public interface ShortNewsItemViewModelBuilder {
  ShortNewsItemViewModelBuilder onBind(
      OnModelBoundListener<ShortNewsItemViewModel_, ShortNewsItemView> listener);

  ShortNewsItemViewModelBuilder onUnbind(
      OnModelUnboundListener<ShortNewsItemViewModel_, ShortNewsItemView> listener);

  ShortNewsItemViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<ShortNewsItemViewModel_, ShortNewsItemView> listener);

  ShortNewsItemViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<ShortNewsItemViewModel_, ShortNewsItemView> listener);

  ShortNewsItemViewModelBuilder newsDate(@NonNull CharSequence newsDate);

  ShortNewsItemViewModelBuilder newsDate(@StringRes int stringRes);

  ShortNewsItemViewModelBuilder newsDate(@StringRes int stringRes, Object... formatArgs);

  ShortNewsItemViewModelBuilder newsDateQuantityRes(@PluralsRes int pluralRes, int quantity,
      Object... formatArgs);

  ShortNewsItemViewModelBuilder itemClickListener(
      @Nullable final OnModelClickListener<ShortNewsItemViewModel_, ShortNewsItemView> itemClickListener);

  ShortNewsItemViewModelBuilder itemClickListener(@Nullable View.OnClickListener itemClickListener);

  ShortNewsItemViewModelBuilder id(long id);

  ShortNewsItemViewModelBuilder id(@androidx.annotation.Nullable Number... ids);

  ShortNewsItemViewModelBuilder id(long id1, long id2);

  ShortNewsItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key);

  ShortNewsItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys);

  ShortNewsItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key, long id);

  ShortNewsItemViewModelBuilder spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
