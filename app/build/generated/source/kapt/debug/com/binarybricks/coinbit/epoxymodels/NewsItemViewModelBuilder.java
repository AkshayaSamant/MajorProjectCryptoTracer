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

public interface NewsItemViewModelBuilder {
  NewsItemViewModelBuilder onBind(OnModelBoundListener<NewsItemViewModel_, NewsItemView> listener);

  NewsItemViewModelBuilder onUnbind(
      OnModelUnboundListener<NewsItemViewModel_, NewsItemView> listener);

  NewsItemViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<NewsItemViewModel_, NewsItemView> listener);

  NewsItemViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<NewsItemViewModel_, NewsItemView> listener);

  NewsItemViewModelBuilder title(@NonNull CharSequence title);

  NewsItemViewModelBuilder title(@StringRes int stringRes);

  NewsItemViewModelBuilder title(@StringRes int stringRes, Object... formatArgs);

  NewsItemViewModelBuilder titleQuantityRes(@PluralsRes int pluralRes, int quantity,
      Object... formatArgs);

  NewsItemViewModelBuilder newsDate(@NonNull CharSequence newsDate);

  NewsItemViewModelBuilder newsDate(@StringRes int stringRes);

  NewsItemViewModelBuilder newsDate(@StringRes int stringRes, Object... formatArgs);

  NewsItemViewModelBuilder newsDateQuantityRes(@PluralsRes int pluralRes, int quantity,
      Object... formatArgs);

  NewsItemViewModelBuilder itemClickListener(
      @Nullable final OnModelClickListener<NewsItemViewModel_, NewsItemView> itemClickListener);

  NewsItemViewModelBuilder itemClickListener(@Nullable View.OnClickListener itemClickListener);

  NewsItemViewModelBuilder id(long id);

  NewsItemViewModelBuilder id(@androidx.annotation.Nullable Number... ids);

  NewsItemViewModelBuilder id(long id1, long id2);

  NewsItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key);

  NewsItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys);

  NewsItemViewModelBuilder id(@androidx.annotation.Nullable CharSequence key, long id);

  NewsItemViewModelBuilder spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
