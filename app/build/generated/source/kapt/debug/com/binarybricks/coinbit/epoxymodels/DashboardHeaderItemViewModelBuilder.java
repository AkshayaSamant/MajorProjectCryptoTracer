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

public interface DashboardHeaderItemViewModelBuilder {
  DashboardHeaderItemViewModelBuilder onBind(
      OnModelBoundListener<DashboardHeaderItemViewModel_, DashboardHeaderItemView> listener);

  DashboardHeaderItemViewModelBuilder onUnbind(
      OnModelUnboundListener<DashboardHeaderItemViewModel_, DashboardHeaderItemView> listener);

  DashboardHeaderItemViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<DashboardHeaderItemViewModel_, DashboardHeaderItemView> listener);

  DashboardHeaderItemViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<DashboardHeaderItemViewModel_, DashboardHeaderItemView> listener);

  DashboardHeaderItemViewModelBuilder dashboardHeaderData(
      @NotNull DashboardHeaderItemView.DashboardHeaderModuleData dashboardHeaderData);

  DashboardHeaderItemViewModelBuilder id(long id);

  DashboardHeaderItemViewModelBuilder id(@Nullable Number... ids);

  DashboardHeaderItemViewModelBuilder id(long id1, long id2);

  DashboardHeaderItemViewModelBuilder id(@Nullable CharSequence key);

  DashboardHeaderItemViewModelBuilder id(@Nullable CharSequence key,
      @Nullable CharSequence... otherKeys);

  DashboardHeaderItemViewModelBuilder id(@Nullable CharSequence key, long id);

  DashboardHeaderItemViewModelBuilder spanSizeOverride(
      @Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
