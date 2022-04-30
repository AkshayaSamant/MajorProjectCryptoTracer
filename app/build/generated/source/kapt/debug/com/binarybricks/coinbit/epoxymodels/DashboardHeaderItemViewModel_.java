package com.binarybricks.coinbit.epoxymodels;

import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import java.lang.CharSequence;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import java.lang.Number;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import java.util.BitSet;
import org.jetbrains.annotations.NotNull;

/**
 * Generated file. Do not modify! */
public class DashboardHeaderItemViewModel_ extends EpoxyModel<DashboardHeaderItemView> implements GeneratedModel<DashboardHeaderItemView>, DashboardHeaderItemViewModelBuilder {
  private final BitSet assignedAttributes_epoxyGeneratedModel = new BitSet(1);

  private OnModelBoundListener<DashboardHeaderItemViewModel_, DashboardHeaderItemView> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<DashboardHeaderItemViewModel_, DashboardHeaderItemView> onModelUnboundListener_epoxyGeneratedModel;

  private OnModelVisibilityStateChangedListener<DashboardHeaderItemViewModel_, DashboardHeaderItemView> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

  private OnModelVisibilityChangedListener<DashboardHeaderItemViewModel_, DashboardHeaderItemView> onModelVisibilityChangedListener_epoxyGeneratedModel;

  /**
   * Bitset index: 0 */
  @NotNull
  private DashboardHeaderItemView.DashboardHeaderModuleData dashboardHeaderData_DashboardHeaderModuleData;

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
    if (!assignedAttributes_epoxyGeneratedModel.get(0)) {
    	throw new IllegalStateException("A value is required for setDashboardHeaderData");
    }
  }

  @Override
  protected int getViewType() {
    return 0;
  }

  @Override
  protected DashboardHeaderItemView buildView(ViewGroup parent) {
    DashboardHeaderItemView v = new DashboardHeaderItemView(parent.getContext());
    v.setLayoutParams(new ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.MATCH_PARENT, ViewGroup.MarginLayoutParams.WRAP_CONTENT));
    return v;
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final DashboardHeaderItemView object,
      final int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void bind(final DashboardHeaderItemView object) {
    super.bind(object);
    object.setDashboardHeaderData(dashboardHeaderData_DashboardHeaderModuleData);
  }

  @Override
  public void bind(final DashboardHeaderItemView object, EpoxyModel previousModel) {
    if (!(previousModel instanceof DashboardHeaderItemViewModel_)) {
      bind(object);
      return;
    }
    DashboardHeaderItemViewModel_ that = (DashboardHeaderItemViewModel_) previousModel;
    super.bind(object);

    if ((dashboardHeaderData_DashboardHeaderModuleData != null ? !dashboardHeaderData_DashboardHeaderModuleData.equals(that.dashboardHeaderData_DashboardHeaderModuleData) : that.dashboardHeaderData_DashboardHeaderModuleData != null)) {
      object.setDashboardHeaderData(dashboardHeaderData_DashboardHeaderModuleData);
    }
  }

  @Override
  public void handlePostBind(final DashboardHeaderItemView object, int position) {
    if (onModelBoundListener_epoxyGeneratedModel != null) {
      onModelBoundListener_epoxyGeneratedModel.onModelBound(this, object, position);
    }
    validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", position);
  }

  /**
   * Register a listener that will be called when this model is bound to a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public DashboardHeaderItemViewModel_ onBind(
      OnModelBoundListener<DashboardHeaderItemViewModel_, DashboardHeaderItemView> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(DashboardHeaderItemView object) {
    super.unbind(object);
    if (onModelUnboundListener_epoxyGeneratedModel != null) {
      onModelUnboundListener_epoxyGeneratedModel.onModelUnbound(this, object);
    }
  }

  /**
   * Register a listener that will be called when this model is unbound from a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public DashboardHeaderItemViewModel_ onUnbind(
      OnModelUnboundListener<DashboardHeaderItemViewModel_, DashboardHeaderItemView> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityStateChanged(int visibilityState, final DashboardHeaderItemView object) {
    if (onModelVisibilityStateChangedListener_epoxyGeneratedModel != null) {
      onModelVisibilityStateChangedListener_epoxyGeneratedModel.onVisibilityStateChanged(this, object, visibilityState);
    }
    super.onVisibilityStateChanged(visibilityState, object);
  }

  /**
   * Register a listener that will be called when this model visibility state has changed.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   */
  public DashboardHeaderItemViewModel_ onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<DashboardHeaderItemViewModel_, DashboardHeaderItemView> listener) {
    onMutation();
    this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityChanged(float percentVisibleHeight, float percentVisibleWidth,
      int visibleHeight, int visibleWidth, final DashboardHeaderItemView object) {
    if (onModelVisibilityChangedListener_epoxyGeneratedModel != null) {
      onModelVisibilityChangedListener_epoxyGeneratedModel.onVisibilityChanged(this, object, percentVisibleHeight, percentVisibleWidth, visibleHeight, visibleWidth);
    }
    super.onVisibilityChanged(percentVisibleHeight, percentVisibleWidth, visibleHeight, visibleWidth, object);
  }

  /**
   * Register a listener that will be called when this model visibility has changed.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   */
  public DashboardHeaderItemViewModel_ onVisibilityChanged(
      OnModelVisibilityChangedListener<DashboardHeaderItemViewModel_, DashboardHeaderItemView> listener) {
    onMutation();
    this.onModelVisibilityChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  /**
   * <i>Required.</i>
   *
   * @see DashboardHeaderItemView#setDashboardHeaderData(DashboardHeaderItemView.DashboardHeaderModuleData)
   */
  public DashboardHeaderItemViewModel_ dashboardHeaderData(
      @NotNull DashboardHeaderItemView.DashboardHeaderModuleData dashboardHeaderData) {
    if (dashboardHeaderData == null) {
      throw new IllegalArgumentException("dashboardHeaderData cannot be null");
    }
    assignedAttributes_epoxyGeneratedModel.set(0);
    onMutation();
    this.dashboardHeaderData_DashboardHeaderModuleData = dashboardHeaderData;
    return this;
  }

  @NotNull
  public DashboardHeaderItemView.DashboardHeaderModuleData dashboardHeaderData() {
    return dashboardHeaderData_DashboardHeaderModuleData;
  }

  @Override
  public DashboardHeaderItemViewModel_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public DashboardHeaderItemViewModel_ id(@Nullable Number... ids) {
    super.id(ids);
    return this;
  }

  @Override
  public DashboardHeaderItemViewModel_ id(long id1, long id2) {
    super.id(id1, id2);
    return this;
  }

  @Override
  public DashboardHeaderItemViewModel_ id(@Nullable CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public DashboardHeaderItemViewModel_ id(@Nullable CharSequence key,
      @Nullable CharSequence... otherKeys) {
    super.id(key, otherKeys);
    return this;
  }

  @Override
  public DashboardHeaderItemViewModel_ id(@Nullable CharSequence key, long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public DashboardHeaderItemViewModel_ layout(@LayoutRes int layoutRes) {
    throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
  }

  @Override
  public DashboardHeaderItemViewModel_ spanSizeOverride(
      @Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback) {
    super.spanSizeOverride(spanSizeCallback);
    return this;
  }

  @Override
  public DashboardHeaderItemViewModel_ show() {
    super.show();
    return this;
  }

  @Override
  public DashboardHeaderItemViewModel_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public DashboardHeaderItemViewModel_ hide() {
    super.hide();
    return this;
  }

  @Override
  @LayoutRes
  protected int getDefaultLayout() {
    throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
  }

  @Override
  public DashboardHeaderItemViewModel_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
    onModelVisibilityChangedListener_epoxyGeneratedModel = null;
    assignedAttributes_epoxyGeneratedModel.clear();
    this.dashboardHeaderData_DashboardHeaderModuleData = null;
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof DashboardHeaderItemViewModel_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    DashboardHeaderItemViewModel_ that = (DashboardHeaderItemViewModel_) o;
    if (((onModelBoundListener_epoxyGeneratedModel == null) != (that.onModelBoundListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelUnboundListener_epoxyGeneratedModel == null) != (that.onModelUnboundListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (that.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (that.onModelVisibilityChangedListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if ((dashboardHeaderData_DashboardHeaderModuleData != null ? !dashboardHeaderData_DashboardHeaderModuleData.equals(that.dashboardHeaderData_DashboardHeaderModuleData) : that.dashboardHeaderData_DashboardHeaderModuleData != null)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int _result = super.hashCode();
    _result = 31 * _result + (onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (dashboardHeaderData_DashboardHeaderModuleData != null ? dashboardHeaderData_DashboardHeaderModuleData.hashCode() : 0);
    return _result;
  }

  @Override
  public String toString() {
    return "DashboardHeaderItemViewModel_{" +
        "dashboardHeaderData_DashboardHeaderModuleData=" + dashboardHeaderData_DashboardHeaderModuleData +
        "}" + super.toString();
  }

  @Override
  public int getSpanSize(int totalSpanCount, int position, int itemCount) {
    return totalSpanCount;
  }
}
