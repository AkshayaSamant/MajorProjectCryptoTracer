package com.binarybricks.coinbit.epoxymodels;

import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
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
import org.jetbrains.annotations.Nullable;

/**
 * Generated file. Do not modify! */
public class CoinItemViewModel_ extends EpoxyModel<CoinItemView> implements GeneratedModel<CoinItemView>, CoinItemViewModelBuilder {
  private final BitSet assignedAttributes_epoxyGeneratedModel = new BitSet(2);

  private OnModelBoundListener<CoinItemViewModel_, CoinItemView> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<CoinItemViewModel_, CoinItemView> onModelUnboundListener_epoxyGeneratedModel;

  private OnModelVisibilityStateChangedListener<CoinItemViewModel_, CoinItemView> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

  private OnModelVisibilityChangedListener<CoinItemViewModel_, CoinItemView> onModelVisibilityChangedListener_epoxyGeneratedModel;

  /**
   * Bitset index: 0 */
  @NotNull
  private CoinItemView.DashboardCoinModuleData dashboardCoinModuleData_DashboardCoinModuleData;

  @Nullable
  private CoinItemView.OnCoinItemClickListener itemClickListener_OnCoinItemClickListener = (CoinItemView.OnCoinItemClickListener) null;

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
    if (!assignedAttributes_epoxyGeneratedModel.get(0)) {
    	throw new IllegalStateException("A value is required for setDashboardCoinModuleData");
    }
  }

  @Override
  protected int getViewType() {
    return 0;
  }

  @Override
  protected CoinItemView buildView(ViewGroup parent) {
    CoinItemView v = new CoinItemView(parent.getContext());
    v.setLayoutParams(new ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.MATCH_PARENT, ViewGroup.MarginLayoutParams.WRAP_CONTENT));
    return v;
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final CoinItemView object,
      final int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void bind(final CoinItemView object) {
    super.bind(object);
    object.setDashboardCoinModuleData(dashboardCoinModuleData_DashboardCoinModuleData);
    object.setItemClickListener(itemClickListener_OnCoinItemClickListener);
  }

  @Override
  public void bind(final CoinItemView object, EpoxyModel previousModel) {
    if (!(previousModel instanceof CoinItemViewModel_)) {
      bind(object);
      return;
    }
    CoinItemViewModel_ that = (CoinItemViewModel_) previousModel;
    super.bind(object);

    if ((dashboardCoinModuleData_DashboardCoinModuleData != null ? !dashboardCoinModuleData_DashboardCoinModuleData.equals(that.dashboardCoinModuleData_DashboardCoinModuleData) : that.dashboardCoinModuleData_DashboardCoinModuleData != null)) {
      object.setDashboardCoinModuleData(dashboardCoinModuleData_DashboardCoinModuleData);
    }

    if (((itemClickListener_OnCoinItemClickListener == null) != (that.itemClickListener_OnCoinItemClickListener == null))) {
      object.setItemClickListener(itemClickListener_OnCoinItemClickListener);
    }
  }

  @Override
  public void handlePostBind(final CoinItemView object, int position) {
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
  public CoinItemViewModel_ onBind(
      OnModelBoundListener<CoinItemViewModel_, CoinItemView> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(CoinItemView object) {
    super.unbind(object);
    if (onModelUnboundListener_epoxyGeneratedModel != null) {
      onModelUnboundListener_epoxyGeneratedModel.onModelUnbound(this, object);
    }
    object.setItemClickListener((CoinItemView.OnCoinItemClickListener) null);
  }

  /**
   * Register a listener that will be called when this model is unbound from a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public CoinItemViewModel_ onUnbind(
      OnModelUnboundListener<CoinItemViewModel_, CoinItemView> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityStateChanged(int visibilityState, final CoinItemView object) {
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
  public CoinItemViewModel_ onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<CoinItemViewModel_, CoinItemView> listener) {
    onMutation();
    this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityChanged(float percentVisibleHeight, float percentVisibleWidth,
      int visibleHeight, int visibleWidth, final CoinItemView object) {
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
  public CoinItemViewModel_ onVisibilityChanged(
      OnModelVisibilityChangedListener<CoinItemViewModel_, CoinItemView> listener) {
    onMutation();
    this.onModelVisibilityChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  /**
   * <i>Required.</i>
   *
   * @see CoinItemView#setDashboardCoinModuleData(CoinItemView.DashboardCoinModuleData)
   */
  public CoinItemViewModel_ dashboardCoinModuleData(
      @NotNull CoinItemView.DashboardCoinModuleData dashboardCoinModuleData) {
    if (dashboardCoinModuleData == null) {
      throw new IllegalArgumentException("dashboardCoinModuleData cannot be null");
    }
    assignedAttributes_epoxyGeneratedModel.set(0);
    onMutation();
    this.dashboardCoinModuleData_DashboardCoinModuleData = dashboardCoinModuleData;
    return this;
  }

  @NotNull
  public CoinItemView.DashboardCoinModuleData dashboardCoinModuleData() {
    return dashboardCoinModuleData_DashboardCoinModuleData;
  }

  /**
   * <i>Optional</i>: Default value is (CoinItemView.OnCoinItemClickListener) null
   *
   * @see CoinItemView#setItemClickListener(CoinItemView.OnCoinItemClickListener)
   */
  public CoinItemViewModel_ itemClickListener(
      @Nullable CoinItemView.OnCoinItemClickListener itemClickListener) {
    onMutation();
    this.itemClickListener_OnCoinItemClickListener = itemClickListener;
    return this;
  }

  @Nullable
  public CoinItemView.OnCoinItemClickListener itemClickListener() {
    return itemClickListener_OnCoinItemClickListener;
  }

  @Override
  public CoinItemViewModel_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public CoinItemViewModel_ id(@androidx.annotation.Nullable Number... ids) {
    super.id(ids);
    return this;
  }

  @Override
  public CoinItemViewModel_ id(long id1, long id2) {
    super.id(id1, id2);
    return this;
  }

  @Override
  public CoinItemViewModel_ id(@androidx.annotation.Nullable CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public CoinItemViewModel_ id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys) {
    super.id(key, otherKeys);
    return this;
  }

  @Override
  public CoinItemViewModel_ id(@androidx.annotation.Nullable CharSequence key, long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public CoinItemViewModel_ layout(@LayoutRes int layoutRes) {
    throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
  }

  @Override
  public CoinItemViewModel_ spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback) {
    super.spanSizeOverride(spanSizeCallback);
    return this;
  }

  @Override
  public CoinItemViewModel_ show() {
    super.show();
    return this;
  }

  @Override
  public CoinItemViewModel_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public CoinItemViewModel_ hide() {
    super.hide();
    return this;
  }

  @Override
  @LayoutRes
  protected int getDefaultLayout() {
    throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
  }

  @Override
  public CoinItemViewModel_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
    onModelVisibilityChangedListener_epoxyGeneratedModel = null;
    assignedAttributes_epoxyGeneratedModel.clear();
    this.dashboardCoinModuleData_DashboardCoinModuleData = null;
    this.itemClickListener_OnCoinItemClickListener = (CoinItemView.OnCoinItemClickListener) null;
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof CoinItemViewModel_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    CoinItemViewModel_ that = (CoinItemViewModel_) o;
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
    if ((dashboardCoinModuleData_DashboardCoinModuleData != null ? !dashboardCoinModuleData_DashboardCoinModuleData.equals(that.dashboardCoinModuleData_DashboardCoinModuleData) : that.dashboardCoinModuleData_DashboardCoinModuleData != null)) {
      return false;
    }
    if (((itemClickListener_OnCoinItemClickListener == null) != (that.itemClickListener_OnCoinItemClickListener == null))) {
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
    _result = 31 * _result + (dashboardCoinModuleData_DashboardCoinModuleData != null ? dashboardCoinModuleData_DashboardCoinModuleData.hashCode() : 0);
    _result = 31 * _result + (itemClickListener_OnCoinItemClickListener != null ? 1 : 0);
    return _result;
  }

  @Override
  public String toString() {
    return "CoinItemViewModel_{" +
        "dashboardCoinModuleData_DashboardCoinModuleData=" + dashboardCoinModuleData_DashboardCoinModuleData +
        ", itemClickListener_OnCoinItemClickListener=" + itemClickListener_OnCoinItemClickListener +
        "}" + super.toString();
  }

  @Override
  public int getSpanSize(int totalSpanCount, int position, int itemCount) {
    return totalSpanCount;
  }
}
