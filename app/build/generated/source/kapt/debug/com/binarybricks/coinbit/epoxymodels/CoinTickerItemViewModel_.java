package com.binarybricks.coinbit.epoxymodels;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelClickListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import com.airbnb.epoxy.WrappedEpoxyModelClickListener;
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
public class CoinTickerItemViewModel_ extends EpoxyModel<CoinTickerItemView> implements GeneratedModel<CoinTickerItemView>, CoinTickerItemViewModelBuilder {
  private final BitSet assignedAttributes_epoxyGeneratedModel = new BitSet(2);

  private OnModelBoundListener<CoinTickerItemViewModel_, CoinTickerItemView> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<CoinTickerItemViewModel_, CoinTickerItemView> onModelUnboundListener_epoxyGeneratedModel;

  private OnModelVisibilityStateChangedListener<CoinTickerItemViewModel_, CoinTickerItemView> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

  private OnModelVisibilityChangedListener<CoinTickerItemViewModel_, CoinTickerItemView> onModelVisibilityChangedListener_epoxyGeneratedModel;

  /**
   * Bitset index: 0 */
  @NotNull
  private CoinTickerItemView.CoinTickerModuleData coinTickerData_CoinTickerModuleData;

  @Nullable
  private View.OnClickListener moreClickListener_OnClickListener = (View.OnClickListener) null;

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
    if (!assignedAttributes_epoxyGeneratedModel.get(0)) {
    	throw new IllegalStateException("A value is required for setCoinTickerData");
    }
  }

  @Override
  protected int getViewType() {
    return 0;
  }

  @Override
  protected CoinTickerItemView buildView(ViewGroup parent) {
    CoinTickerItemView v = new CoinTickerItemView(parent.getContext());
    v.setLayoutParams(new ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.MATCH_PARENT, ViewGroup.MarginLayoutParams.WRAP_CONTENT));
    return v;
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final CoinTickerItemView object,
      final int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void bind(final CoinTickerItemView object) {
    super.bind(object);
    object.setMoreClickListener(moreClickListener_OnClickListener);
    object.setCoinTickerData(coinTickerData_CoinTickerModuleData);
  }

  @Override
  public void bind(final CoinTickerItemView object, EpoxyModel previousModel) {
    if (!(previousModel instanceof CoinTickerItemViewModel_)) {
      bind(object);
      return;
    }
    CoinTickerItemViewModel_ that = (CoinTickerItemViewModel_) previousModel;
    super.bind(object);

    if (((moreClickListener_OnClickListener == null) != (that.moreClickListener_OnClickListener == null))) {
      object.setMoreClickListener(moreClickListener_OnClickListener);
    }

    if ((coinTickerData_CoinTickerModuleData != null ? !coinTickerData_CoinTickerModuleData.equals(that.coinTickerData_CoinTickerModuleData) : that.coinTickerData_CoinTickerModuleData != null)) {
      object.setCoinTickerData(coinTickerData_CoinTickerModuleData);
    }
  }

  @Override
  public void handlePostBind(final CoinTickerItemView object, int position) {
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
  public CoinTickerItemViewModel_ onBind(
      OnModelBoundListener<CoinTickerItemViewModel_, CoinTickerItemView> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(CoinTickerItemView object) {
    super.unbind(object);
    if (onModelUnboundListener_epoxyGeneratedModel != null) {
      onModelUnboundListener_epoxyGeneratedModel.onModelUnbound(this, object);
    }
    object.setMoreClickListener((View.OnClickListener) null);
  }

  /**
   * Register a listener that will be called when this model is unbound from a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public CoinTickerItemViewModel_ onUnbind(
      OnModelUnboundListener<CoinTickerItemViewModel_, CoinTickerItemView> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityStateChanged(int visibilityState, final CoinTickerItemView object) {
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
  public CoinTickerItemViewModel_ onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<CoinTickerItemViewModel_, CoinTickerItemView> listener) {
    onMutation();
    this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityChanged(float percentVisibleHeight, float percentVisibleWidth,
      int visibleHeight, int visibleWidth, final CoinTickerItemView object) {
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
  public CoinTickerItemViewModel_ onVisibilityChanged(
      OnModelVisibilityChangedListener<CoinTickerItemViewModel_, CoinTickerItemView> listener) {
    onMutation();
    this.onModelVisibilityChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  /**
   * <i>Required.</i>
   *
   * @see CoinTickerItemView#setCoinTickerData(CoinTickerItemView.CoinTickerModuleData)
   */
  public CoinTickerItemViewModel_ coinTickerData(
      @NotNull CoinTickerItemView.CoinTickerModuleData coinTickerData) {
    if (coinTickerData == null) {
      throw new IllegalArgumentException("coinTickerData cannot be null");
    }
    assignedAttributes_epoxyGeneratedModel.set(0);
    onMutation();
    this.coinTickerData_CoinTickerModuleData = coinTickerData;
    return this;
  }

  @NotNull
  public CoinTickerItemView.CoinTickerModuleData coinTickerData() {
    return coinTickerData_CoinTickerModuleData;
  }

  /**
   * Set a click listener that will provide the parent view, model, and adapter position of the clicked view. This will clear the normal View.OnClickListener if one has been set */
  public CoinTickerItemViewModel_ moreClickListener(
      @Nullable final OnModelClickListener<CoinTickerItemViewModel_, CoinTickerItemView> moreClickListener) {
    onMutation();
    if (moreClickListener == null) {
      this.moreClickListener_OnClickListener = null;
    }
    else {
      this.moreClickListener_OnClickListener = new WrappedEpoxyModelClickListener(moreClickListener);
    }
    return this;
  }

  /**
   * <i>Optional</i>: Default value is (View.OnClickListener) null
   *
   * @see CoinTickerItemView#setMoreClickListener(View.OnClickListener)
   */
  public CoinTickerItemViewModel_ moreClickListener(
      @Nullable View.OnClickListener moreClickListener) {
    onMutation();
    this.moreClickListener_OnClickListener = moreClickListener;
    return this;
  }

  @Nullable
  public View.OnClickListener moreClickListener() {
    return moreClickListener_OnClickListener;
  }

  @Override
  public CoinTickerItemViewModel_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public CoinTickerItemViewModel_ id(@androidx.annotation.Nullable Number... ids) {
    super.id(ids);
    return this;
  }

  @Override
  public CoinTickerItemViewModel_ id(long id1, long id2) {
    super.id(id1, id2);
    return this;
  }

  @Override
  public CoinTickerItemViewModel_ id(@androidx.annotation.Nullable CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public CoinTickerItemViewModel_ id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys) {
    super.id(key, otherKeys);
    return this;
  }

  @Override
  public CoinTickerItemViewModel_ id(@androidx.annotation.Nullable CharSequence key, long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public CoinTickerItemViewModel_ layout(@LayoutRes int layoutRes) {
    throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
  }

  @Override
  public CoinTickerItemViewModel_ spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback) {
    super.spanSizeOverride(spanSizeCallback);
    return this;
  }

  @Override
  public CoinTickerItemViewModel_ show() {
    super.show();
    return this;
  }

  @Override
  public CoinTickerItemViewModel_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public CoinTickerItemViewModel_ hide() {
    super.hide();
    return this;
  }

  @Override
  @LayoutRes
  protected int getDefaultLayout() {
    throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
  }

  @Override
  public CoinTickerItemViewModel_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
    onModelVisibilityChangedListener_epoxyGeneratedModel = null;
    assignedAttributes_epoxyGeneratedModel.clear();
    this.coinTickerData_CoinTickerModuleData = null;
    this.moreClickListener_OnClickListener = (View.OnClickListener) null;
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof CoinTickerItemViewModel_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    CoinTickerItemViewModel_ that = (CoinTickerItemViewModel_) o;
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
    if ((coinTickerData_CoinTickerModuleData != null ? !coinTickerData_CoinTickerModuleData.equals(that.coinTickerData_CoinTickerModuleData) : that.coinTickerData_CoinTickerModuleData != null)) {
      return false;
    }
    if (((moreClickListener_OnClickListener == null) != (that.moreClickListener_OnClickListener == null))) {
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
    _result = 31 * _result + (coinTickerData_CoinTickerModuleData != null ? coinTickerData_CoinTickerModuleData.hashCode() : 0);
    _result = 31 * _result + (moreClickListener_OnClickListener != null ? 1 : 0);
    return _result;
  }

  @Override
  public String toString() {
    return "CoinTickerItemViewModel_{" +
        "coinTickerData_CoinTickerModuleData=" + coinTickerData_CoinTickerModuleData +
        ", moreClickListener_OnClickListener=" + moreClickListener_OnClickListener +
        "}" + super.toString();
  }

  @Override
  public int getSpanSize(int totalSpanCount, int position, int itemCount) {
    return totalSpanCount;
  }
}
