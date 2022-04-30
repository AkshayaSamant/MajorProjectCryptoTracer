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
public class EmptyCoinItemViewModel_ extends EpoxyModel<EmptyCoinItemView> implements GeneratedModel<EmptyCoinItemView>, EmptyCoinItemViewModelBuilder {
  private final BitSet assignedAttributes_epoxyGeneratedModel = new BitSet(2);

  private OnModelBoundListener<EmptyCoinItemViewModel_, EmptyCoinItemView> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<EmptyCoinItemViewModel_, EmptyCoinItemView> onModelUnboundListener_epoxyGeneratedModel;

  private OnModelVisibilityStateChangedListener<EmptyCoinItemViewModel_, EmptyCoinItemView> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

  private OnModelVisibilityChangedListener<EmptyCoinItemViewModel_, EmptyCoinItemView> onModelVisibilityChangedListener_epoxyGeneratedModel;

  /**
   * Bitset index: 0 */
  @NotNull
  private EmptyCoinItemView.DashboardEmptyCoinModuleData emptyCardData_DashboardEmptyCoinModuleData;

  @Nullable
  private View.OnClickListener itemClickListener_OnClickListener = (View.OnClickListener) null;

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
    if (!assignedAttributes_epoxyGeneratedModel.get(0)) {
    	throw new IllegalStateException("A value is required for setEmptyCardData");
    }
  }

  @Override
  protected int getViewType() {
    return 0;
  }

  @Override
  protected EmptyCoinItemView buildView(ViewGroup parent) {
    EmptyCoinItemView v = new EmptyCoinItemView(parent.getContext());
    v.setLayoutParams(new ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.MATCH_PARENT, ViewGroup.MarginLayoutParams.WRAP_CONTENT));
    return v;
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final EmptyCoinItemView object,
      final int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void bind(final EmptyCoinItemView object) {
    super.bind(object);
    object.setItemClickListener(itemClickListener_OnClickListener);
    object.setEmptyCardData(emptyCardData_DashboardEmptyCoinModuleData);
  }

  @Override
  public void bind(final EmptyCoinItemView object, EpoxyModel previousModel) {
    if (!(previousModel instanceof EmptyCoinItemViewModel_)) {
      bind(object);
      return;
    }
    EmptyCoinItemViewModel_ that = (EmptyCoinItemViewModel_) previousModel;
    super.bind(object);

    if (((itemClickListener_OnClickListener == null) != (that.itemClickListener_OnClickListener == null))) {
      object.setItemClickListener(itemClickListener_OnClickListener);
    }

    if ((emptyCardData_DashboardEmptyCoinModuleData != null ? !emptyCardData_DashboardEmptyCoinModuleData.equals(that.emptyCardData_DashboardEmptyCoinModuleData) : that.emptyCardData_DashboardEmptyCoinModuleData != null)) {
      object.setEmptyCardData(emptyCardData_DashboardEmptyCoinModuleData);
    }
  }

  @Override
  public void handlePostBind(final EmptyCoinItemView object, int position) {
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
  public EmptyCoinItemViewModel_ onBind(
      OnModelBoundListener<EmptyCoinItemViewModel_, EmptyCoinItemView> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(EmptyCoinItemView object) {
    super.unbind(object);
    if (onModelUnboundListener_epoxyGeneratedModel != null) {
      onModelUnboundListener_epoxyGeneratedModel.onModelUnbound(this, object);
    }
    object.setItemClickListener((View.OnClickListener) null);
  }

  /**
   * Register a listener that will be called when this model is unbound from a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public EmptyCoinItemViewModel_ onUnbind(
      OnModelUnboundListener<EmptyCoinItemViewModel_, EmptyCoinItemView> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityStateChanged(int visibilityState, final EmptyCoinItemView object) {
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
  public EmptyCoinItemViewModel_ onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<EmptyCoinItemViewModel_, EmptyCoinItemView> listener) {
    onMutation();
    this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityChanged(float percentVisibleHeight, float percentVisibleWidth,
      int visibleHeight, int visibleWidth, final EmptyCoinItemView object) {
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
  public EmptyCoinItemViewModel_ onVisibilityChanged(
      OnModelVisibilityChangedListener<EmptyCoinItemViewModel_, EmptyCoinItemView> listener) {
    onMutation();
    this.onModelVisibilityChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  /**
   * <i>Required.</i>
   *
   * @see EmptyCoinItemView#setEmptyCardData(EmptyCoinItemView.DashboardEmptyCoinModuleData)
   */
  public EmptyCoinItemViewModel_ emptyCardData(
      @NotNull EmptyCoinItemView.DashboardEmptyCoinModuleData emptyCardData) {
    if (emptyCardData == null) {
      throw new IllegalArgumentException("emptyCardData cannot be null");
    }
    assignedAttributes_epoxyGeneratedModel.set(0);
    onMutation();
    this.emptyCardData_DashboardEmptyCoinModuleData = emptyCardData;
    return this;
  }

  @NotNull
  public EmptyCoinItemView.DashboardEmptyCoinModuleData emptyCardData() {
    return emptyCardData_DashboardEmptyCoinModuleData;
  }

  /**
   * Set a click listener that will provide the parent view, model, and adapter position of the clicked view. This will clear the normal View.OnClickListener if one has been set */
  public EmptyCoinItemViewModel_ itemClickListener(
      @Nullable final OnModelClickListener<EmptyCoinItemViewModel_, EmptyCoinItemView> itemClickListener) {
    onMutation();
    if (itemClickListener == null) {
      this.itemClickListener_OnClickListener = null;
    }
    else {
      this.itemClickListener_OnClickListener = new WrappedEpoxyModelClickListener(itemClickListener);
    }
    return this;
  }

  /**
   * <i>Optional</i>: Default value is (View.OnClickListener) null
   *
   * @see EmptyCoinItemView#setItemClickListener(View.OnClickListener)
   */
  public EmptyCoinItemViewModel_ itemClickListener(
      @Nullable View.OnClickListener itemClickListener) {
    onMutation();
    this.itemClickListener_OnClickListener = itemClickListener;
    return this;
  }

  @Nullable
  public View.OnClickListener itemClickListener() {
    return itemClickListener_OnClickListener;
  }

  @Override
  public EmptyCoinItemViewModel_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public EmptyCoinItemViewModel_ id(@androidx.annotation.Nullable Number... ids) {
    super.id(ids);
    return this;
  }

  @Override
  public EmptyCoinItemViewModel_ id(long id1, long id2) {
    super.id(id1, id2);
    return this;
  }

  @Override
  public EmptyCoinItemViewModel_ id(@androidx.annotation.Nullable CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public EmptyCoinItemViewModel_ id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys) {
    super.id(key, otherKeys);
    return this;
  }

  @Override
  public EmptyCoinItemViewModel_ id(@androidx.annotation.Nullable CharSequence key, long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public EmptyCoinItemViewModel_ layout(@LayoutRes int layoutRes) {
    throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
  }

  @Override
  public EmptyCoinItemViewModel_ spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback) {
    super.spanSizeOverride(spanSizeCallback);
    return this;
  }

  @Override
  public EmptyCoinItemViewModel_ show() {
    super.show();
    return this;
  }

  @Override
  public EmptyCoinItemViewModel_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public EmptyCoinItemViewModel_ hide() {
    super.hide();
    return this;
  }

  @Override
  @LayoutRes
  protected int getDefaultLayout() {
    throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
  }

  @Override
  public EmptyCoinItemViewModel_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
    onModelVisibilityChangedListener_epoxyGeneratedModel = null;
    assignedAttributes_epoxyGeneratedModel.clear();
    this.emptyCardData_DashboardEmptyCoinModuleData = null;
    this.itemClickListener_OnClickListener = (View.OnClickListener) null;
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof EmptyCoinItemViewModel_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    EmptyCoinItemViewModel_ that = (EmptyCoinItemViewModel_) o;
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
    if ((emptyCardData_DashboardEmptyCoinModuleData != null ? !emptyCardData_DashboardEmptyCoinModuleData.equals(that.emptyCardData_DashboardEmptyCoinModuleData) : that.emptyCardData_DashboardEmptyCoinModuleData != null)) {
      return false;
    }
    if (((itemClickListener_OnClickListener == null) != (that.itemClickListener_OnClickListener == null))) {
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
    _result = 31 * _result + (emptyCardData_DashboardEmptyCoinModuleData != null ? emptyCardData_DashboardEmptyCoinModuleData.hashCode() : 0);
    _result = 31 * _result + (itemClickListener_OnClickListener != null ? 1 : 0);
    return _result;
  }

  @Override
  public String toString() {
    return "EmptyCoinItemViewModel_{" +
        "emptyCardData_DashboardEmptyCoinModuleData=" + emptyCardData_DashboardEmptyCoinModuleData +
        ", itemClickListener_OnClickListener=" + itemClickListener_OnClickListener +
        "}" + super.toString();
  }

  @Override
  public int getSpanSize(int totalSpanCount, int position, int itemCount) {
    return totalSpanCount;
  }
}
