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
public class TopCardItemViewModel_ extends EpoxyModel<TopCardItemView> implements GeneratedModel<TopCardItemView>, TopCardItemViewModelBuilder {
  private final BitSet assignedAttributes_epoxyGeneratedModel = new BitSet(2);

  private OnModelBoundListener<TopCardItemViewModel_, TopCardItemView> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<TopCardItemViewModel_, TopCardItemView> onModelUnboundListener_epoxyGeneratedModel;

  private OnModelVisibilityStateChangedListener<TopCardItemViewModel_, TopCardItemView> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

  private OnModelVisibilityChangedListener<TopCardItemViewModel_, TopCardItemView> onModelVisibilityChangedListener_epoxyGeneratedModel;

  /**
   * Bitset index: 0 */
  @NotNull
  private TopCardItemView.TopCardsModuleData topCardData_TopCardsModuleData;

  @Nullable
  private TopCardItemView.OnTopItemClickedListener itemClickListener_OnTopItemClickedListener = (TopCardItemView.OnTopItemClickedListener) null;

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
    if (!assignedAttributes_epoxyGeneratedModel.get(0)) {
    	throw new IllegalStateException("A value is required for setTopCardData");
    }
  }

  @Override
  protected int getViewType() {
    return 0;
  }

  @Override
  protected TopCardItemView buildView(ViewGroup parent) {
    TopCardItemView v = new TopCardItemView(parent.getContext());
    v.setLayoutParams(new ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.MATCH_PARENT, ViewGroup.MarginLayoutParams.WRAP_CONTENT));
    return v;
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final TopCardItemView object,
      final int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void bind(final TopCardItemView object) {
    super.bind(object);
    object.setItemClickListener(itemClickListener_OnTopItemClickedListener);
    object.setTopCardData(topCardData_TopCardsModuleData);
  }

  @Override
  public void bind(final TopCardItemView object, EpoxyModel previousModel) {
    if (!(previousModel instanceof TopCardItemViewModel_)) {
      bind(object);
      return;
    }
    TopCardItemViewModel_ that = (TopCardItemViewModel_) previousModel;
    super.bind(object);

    if (((itemClickListener_OnTopItemClickedListener == null) != (that.itemClickListener_OnTopItemClickedListener == null))) {
      object.setItemClickListener(itemClickListener_OnTopItemClickedListener);
    }

    if ((topCardData_TopCardsModuleData != null ? !topCardData_TopCardsModuleData.equals(that.topCardData_TopCardsModuleData) : that.topCardData_TopCardsModuleData != null)) {
      object.setTopCardData(topCardData_TopCardsModuleData);
    }
  }

  @Override
  public void handlePostBind(final TopCardItemView object, int position) {
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
  public TopCardItemViewModel_ onBind(
      OnModelBoundListener<TopCardItemViewModel_, TopCardItemView> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(TopCardItemView object) {
    super.unbind(object);
    if (onModelUnboundListener_epoxyGeneratedModel != null) {
      onModelUnboundListener_epoxyGeneratedModel.onModelUnbound(this, object);
    }
    object.setItemClickListener((TopCardItemView.OnTopItemClickedListener) null);
  }

  /**
   * Register a listener that will be called when this model is unbound from a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public TopCardItemViewModel_ onUnbind(
      OnModelUnboundListener<TopCardItemViewModel_, TopCardItemView> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityStateChanged(int visibilityState, final TopCardItemView object) {
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
  public TopCardItemViewModel_ onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<TopCardItemViewModel_, TopCardItemView> listener) {
    onMutation();
    this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityChanged(float percentVisibleHeight, float percentVisibleWidth,
      int visibleHeight, int visibleWidth, final TopCardItemView object) {
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
  public TopCardItemViewModel_ onVisibilityChanged(
      OnModelVisibilityChangedListener<TopCardItemViewModel_, TopCardItemView> listener) {
    onMutation();
    this.onModelVisibilityChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  /**
   * <i>Required.</i>
   *
   * @see TopCardItemView#setTopCardData(TopCardItemView.TopCardsModuleData)
   */
  public TopCardItemViewModel_ topCardData(
      @NotNull TopCardItemView.TopCardsModuleData topCardData) {
    if (topCardData == null) {
      throw new IllegalArgumentException("topCardData cannot be null");
    }
    assignedAttributes_epoxyGeneratedModel.set(0);
    onMutation();
    this.topCardData_TopCardsModuleData = topCardData;
    return this;
  }

  @NotNull
  public TopCardItemView.TopCardsModuleData topCardData() {
    return topCardData_TopCardsModuleData;
  }

  /**
   * <i>Optional</i>: Default value is (TopCardItemView.OnTopItemClickedListener) null
   *
   * @see TopCardItemView#setItemClickListener(TopCardItemView.OnTopItemClickedListener)
   */
  public TopCardItemViewModel_ itemClickListener(
      @Nullable TopCardItemView.OnTopItemClickedListener itemClickListener) {
    onMutation();
    this.itemClickListener_OnTopItemClickedListener = itemClickListener;
    return this;
  }

  @Nullable
  public TopCardItemView.OnTopItemClickedListener itemClickListener() {
    return itemClickListener_OnTopItemClickedListener;
  }

  @Override
  public TopCardItemViewModel_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public TopCardItemViewModel_ id(@androidx.annotation.Nullable Number... ids) {
    super.id(ids);
    return this;
  }

  @Override
  public TopCardItemViewModel_ id(long id1, long id2) {
    super.id(id1, id2);
    return this;
  }

  @Override
  public TopCardItemViewModel_ id(@androidx.annotation.Nullable CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public TopCardItemViewModel_ id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys) {
    super.id(key, otherKeys);
    return this;
  }

  @Override
  public TopCardItemViewModel_ id(@androidx.annotation.Nullable CharSequence key, long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public TopCardItemViewModel_ layout(@LayoutRes int layoutRes) {
    throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
  }

  @Override
  public TopCardItemViewModel_ spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback) {
    super.spanSizeOverride(spanSizeCallback);
    return this;
  }

  @Override
  public TopCardItemViewModel_ show() {
    super.show();
    return this;
  }

  @Override
  public TopCardItemViewModel_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public TopCardItemViewModel_ hide() {
    super.hide();
    return this;
  }

  @Override
  @LayoutRes
  protected int getDefaultLayout() {
    throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
  }

  @Override
  public TopCardItemViewModel_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
    onModelVisibilityChangedListener_epoxyGeneratedModel = null;
    assignedAttributes_epoxyGeneratedModel.clear();
    this.topCardData_TopCardsModuleData = null;
    this.itemClickListener_OnTopItemClickedListener = (TopCardItemView.OnTopItemClickedListener) null;
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof TopCardItemViewModel_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    TopCardItemViewModel_ that = (TopCardItemViewModel_) o;
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
    if ((topCardData_TopCardsModuleData != null ? !topCardData_TopCardsModuleData.equals(that.topCardData_TopCardsModuleData) : that.topCardData_TopCardsModuleData != null)) {
      return false;
    }
    if (((itemClickListener_OnTopItemClickedListener == null) != (that.itemClickListener_OnTopItemClickedListener == null))) {
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
    _result = 31 * _result + (topCardData_TopCardsModuleData != null ? topCardData_TopCardsModuleData.hashCode() : 0);
    _result = 31 * _result + (itemClickListener_OnTopItemClickedListener != null ? 1 : 0);
    return _result;
  }

  @Override
  public String toString() {
    return "TopCardItemViewModel_{" +
        "topCardData_TopCardsModuleData=" + topCardData_TopCardsModuleData +
        ", itemClickListener_OnTopItemClickedListener=" + itemClickListener_OnTopItemClickedListener +
        "}" + super.toString();
  }

  @Override
  public int getSpanSize(int totalSpanCount, int position, int itemCount) {
    return totalSpanCount;
  }
}
