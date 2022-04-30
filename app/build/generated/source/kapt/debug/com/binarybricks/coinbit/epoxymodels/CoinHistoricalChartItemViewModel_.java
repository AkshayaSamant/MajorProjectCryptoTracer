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
public class CoinHistoricalChartItemViewModel_ extends EpoxyModel<CoinHistoricalChartItemView> implements GeneratedModel<CoinHistoricalChartItemView>, CoinHistoricalChartItemViewModelBuilder {
  private final BitSet assignedAttributes_epoxyGeneratedModel = new BitSet(2);

  private OnModelBoundListener<CoinHistoricalChartItemViewModel_, CoinHistoricalChartItemView> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<CoinHistoricalChartItemViewModel_, CoinHistoricalChartItemView> onModelUnboundListener_epoxyGeneratedModel;

  private OnModelVisibilityStateChangedListener<CoinHistoricalChartItemViewModel_, CoinHistoricalChartItemView> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

  private OnModelVisibilityChangedListener<CoinHistoricalChartItemViewModel_, CoinHistoricalChartItemView> onModelVisibilityChangedListener_epoxyGeneratedModel;

  /**
   * Bitset index: 0 */
  @NotNull
  private CoinHistoricalChartItemView.HistoricalChartModuleData chartData_HistoricalChartModuleData;

  @Nullable
  private CoinHistoricalChartItemView.OnHistoricalChardRangeSelectionListener onChartRangeSelected_OnHistoricalChardRangeSelectionListener = (CoinHistoricalChartItemView.OnHistoricalChardRangeSelectionListener) null;

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
    if (!assignedAttributes_epoxyGeneratedModel.get(0)) {
    	throw new IllegalStateException("A value is required for setChartData");
    }
  }

  @Override
  protected int getViewType() {
    return 0;
  }

  @Override
  protected CoinHistoricalChartItemView buildView(ViewGroup parent) {
    CoinHistoricalChartItemView v = new CoinHistoricalChartItemView(parent.getContext());
    v.setLayoutParams(new ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.MATCH_PARENT, ViewGroup.MarginLayoutParams.WRAP_CONTENT));
    return v;
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final CoinHistoricalChartItemView object,
      final int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void bind(final CoinHistoricalChartItemView object) {
    super.bind(object);
    object.setChartData(chartData_HistoricalChartModuleData);
    object.onChartRangeSelected(onChartRangeSelected_OnHistoricalChardRangeSelectionListener);
  }

  @Override
  public void bind(final CoinHistoricalChartItemView object, EpoxyModel previousModel) {
    if (!(previousModel instanceof CoinHistoricalChartItemViewModel_)) {
      bind(object);
      return;
    }
    CoinHistoricalChartItemViewModel_ that = (CoinHistoricalChartItemViewModel_) previousModel;
    super.bind(object);

    if ((chartData_HistoricalChartModuleData != null ? !chartData_HistoricalChartModuleData.equals(that.chartData_HistoricalChartModuleData) : that.chartData_HistoricalChartModuleData != null)) {
      object.setChartData(chartData_HistoricalChartModuleData);
    }

    if (((onChartRangeSelected_OnHistoricalChardRangeSelectionListener == null) != (that.onChartRangeSelected_OnHistoricalChardRangeSelectionListener == null))) {
      object.onChartRangeSelected(onChartRangeSelected_OnHistoricalChardRangeSelectionListener);
    }
  }

  @Override
  public void handlePostBind(final CoinHistoricalChartItemView object, int position) {
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
  public CoinHistoricalChartItemViewModel_ onBind(
      OnModelBoundListener<CoinHistoricalChartItemViewModel_, CoinHistoricalChartItemView> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(CoinHistoricalChartItemView object) {
    super.unbind(object);
    if (onModelUnboundListener_epoxyGeneratedModel != null) {
      onModelUnboundListener_epoxyGeneratedModel.onModelUnbound(this, object);
    }
    object.onChartRangeSelected((CoinHistoricalChartItemView.OnHistoricalChardRangeSelectionListener) null);
    object.cleanup();
  }

  /**
   * Register a listener that will be called when this model is unbound from a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public CoinHistoricalChartItemViewModel_ onUnbind(
      OnModelUnboundListener<CoinHistoricalChartItemViewModel_, CoinHistoricalChartItemView> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityStateChanged(int visibilityState,
      final CoinHistoricalChartItemView object) {
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
  public CoinHistoricalChartItemViewModel_ onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<CoinHistoricalChartItemViewModel_, CoinHistoricalChartItemView> listener) {
    onMutation();
    this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityChanged(float percentVisibleHeight, float percentVisibleWidth,
      int visibleHeight, int visibleWidth, final CoinHistoricalChartItemView object) {
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
  public CoinHistoricalChartItemViewModel_ onVisibilityChanged(
      OnModelVisibilityChangedListener<CoinHistoricalChartItemViewModel_, CoinHistoricalChartItemView> listener) {
    onMutation();
    this.onModelVisibilityChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  /**
   * <i>Required.</i>
   *
   * @see CoinHistoricalChartItemView#setChartData(CoinHistoricalChartItemView.HistoricalChartModuleData)
   */
  public CoinHistoricalChartItemViewModel_ chartData(
      @NotNull CoinHistoricalChartItemView.HistoricalChartModuleData chartData) {
    if (chartData == null) {
      throw new IllegalArgumentException("chartData cannot be null");
    }
    assignedAttributes_epoxyGeneratedModel.set(0);
    onMutation();
    this.chartData_HistoricalChartModuleData = chartData;
    return this;
  }

  @NotNull
  public CoinHistoricalChartItemView.HistoricalChartModuleData chartData() {
    return chartData_HistoricalChartModuleData;
  }

  /**
   * <i>Optional</i>: Default value is (CoinHistoricalChartItemView.OnHistoricalChardRangeSelectionListener) null
   *
   * @see CoinHistoricalChartItemView#onChartRangeSelected(CoinHistoricalChartItemView.OnHistoricalChardRangeSelectionListener)
   */
  public CoinHistoricalChartItemViewModel_ onChartRangeSelected(
      @Nullable CoinHistoricalChartItemView.OnHistoricalChardRangeSelectionListener onChartRangeSelected) {
    onMutation();
    this.onChartRangeSelected_OnHistoricalChardRangeSelectionListener = onChartRangeSelected;
    return this;
  }

  @Nullable
  public CoinHistoricalChartItemView.OnHistoricalChardRangeSelectionListener onChartRangeSelected(
      ) {
    return onChartRangeSelected_OnHistoricalChardRangeSelectionListener;
  }

  @Override
  public CoinHistoricalChartItemViewModel_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public CoinHistoricalChartItemViewModel_ id(@androidx.annotation.Nullable Number... ids) {
    super.id(ids);
    return this;
  }

  @Override
  public CoinHistoricalChartItemViewModel_ id(long id1, long id2) {
    super.id(id1, id2);
    return this;
  }

  @Override
  public CoinHistoricalChartItemViewModel_ id(@androidx.annotation.Nullable CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public CoinHistoricalChartItemViewModel_ id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys) {
    super.id(key, otherKeys);
    return this;
  }

  @Override
  public CoinHistoricalChartItemViewModel_ id(@androidx.annotation.Nullable CharSequence key,
      long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public CoinHistoricalChartItemViewModel_ layout(@LayoutRes int layoutRes) {
    throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
  }

  @Override
  public CoinHistoricalChartItemViewModel_ spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback) {
    super.spanSizeOverride(spanSizeCallback);
    return this;
  }

  @Override
  public CoinHistoricalChartItemViewModel_ show() {
    super.show();
    return this;
  }

  @Override
  public CoinHistoricalChartItemViewModel_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public CoinHistoricalChartItemViewModel_ hide() {
    super.hide();
    return this;
  }

  @Override
  @LayoutRes
  protected int getDefaultLayout() {
    throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
  }

  @Override
  public CoinHistoricalChartItemViewModel_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
    onModelVisibilityChangedListener_epoxyGeneratedModel = null;
    assignedAttributes_epoxyGeneratedModel.clear();
    this.chartData_HistoricalChartModuleData = null;
    this.onChartRangeSelected_OnHistoricalChardRangeSelectionListener = (CoinHistoricalChartItemView.OnHistoricalChardRangeSelectionListener) null;
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof CoinHistoricalChartItemViewModel_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    CoinHistoricalChartItemViewModel_ that = (CoinHistoricalChartItemViewModel_) o;
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
    if ((chartData_HistoricalChartModuleData != null ? !chartData_HistoricalChartModuleData.equals(that.chartData_HistoricalChartModuleData) : that.chartData_HistoricalChartModuleData != null)) {
      return false;
    }
    if (((onChartRangeSelected_OnHistoricalChardRangeSelectionListener == null) != (that.onChartRangeSelected_OnHistoricalChardRangeSelectionListener == null))) {
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
    _result = 31 * _result + (chartData_HistoricalChartModuleData != null ? chartData_HistoricalChartModuleData.hashCode() : 0);
    _result = 31 * _result + (onChartRangeSelected_OnHistoricalChardRangeSelectionListener != null ? 1 : 0);
    return _result;
  }

  @Override
  public String toString() {
    return "CoinHistoricalChartItemViewModel_{" +
        "chartData_HistoricalChartModuleData=" + chartData_HistoricalChartModuleData +
        ", onChartRangeSelected_OnHistoricalChardRangeSelectionListener=" + onChartRangeSelected_OnHistoricalChardRangeSelectionListener +
        "}" + super.toString();
  }

  @Override
  public int getSpanSize(int totalSpanCount, int position, int itemCount) {
    return totalSpanCount;
  }
}
