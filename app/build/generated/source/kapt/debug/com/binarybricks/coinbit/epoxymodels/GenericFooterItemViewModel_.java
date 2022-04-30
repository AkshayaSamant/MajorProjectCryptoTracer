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
public class GenericFooterItemViewModel_ extends EpoxyModel<GenericFooterItemView> implements GeneratedModel<GenericFooterItemView>, GenericFooterItemViewModelBuilder {
  private final BitSet assignedAttributes_epoxyGeneratedModel = new BitSet(1);

  private OnModelBoundListener<GenericFooterItemViewModel_, GenericFooterItemView> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<GenericFooterItemViewModel_, GenericFooterItemView> onModelUnboundListener_epoxyGeneratedModel;

  private OnModelVisibilityStateChangedListener<GenericFooterItemViewModel_, GenericFooterItemView> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

  private OnModelVisibilityChangedListener<GenericFooterItemViewModel_, GenericFooterItemView> onModelVisibilityChangedListener_epoxyGeneratedModel;

  /**
   * Bitset index: 0 */
  @NotNull
  private GenericFooterItemView.FooterModuleData footerContent_FooterModuleData;

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
    if (!assignedAttributes_epoxyGeneratedModel.get(0)) {
    	throw new IllegalStateException("A value is required for setFooterContent");
    }
  }

  @Override
  protected int getViewType() {
    return 0;
  }

  @Override
  protected GenericFooterItemView buildView(ViewGroup parent) {
    GenericFooterItemView v = new GenericFooterItemView(parent.getContext());
    v.setLayoutParams(new ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.MATCH_PARENT, ViewGroup.MarginLayoutParams.WRAP_CONTENT));
    return v;
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final GenericFooterItemView object,
      final int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void bind(final GenericFooterItemView object) {
    super.bind(object);
    object.setFooterContent(footerContent_FooterModuleData);
  }

  @Override
  public void bind(final GenericFooterItemView object, EpoxyModel previousModel) {
    if (!(previousModel instanceof GenericFooterItemViewModel_)) {
      bind(object);
      return;
    }
    GenericFooterItemViewModel_ that = (GenericFooterItemViewModel_) previousModel;
    super.bind(object);

    if ((footerContent_FooterModuleData != null ? !footerContent_FooterModuleData.equals(that.footerContent_FooterModuleData) : that.footerContent_FooterModuleData != null)) {
      object.setFooterContent(footerContent_FooterModuleData);
    }
  }

  @Override
  public void handlePostBind(final GenericFooterItemView object, int position) {
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
  public GenericFooterItemViewModel_ onBind(
      OnModelBoundListener<GenericFooterItemViewModel_, GenericFooterItemView> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(GenericFooterItemView object) {
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
  public GenericFooterItemViewModel_ onUnbind(
      OnModelUnboundListener<GenericFooterItemViewModel_, GenericFooterItemView> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityStateChanged(int visibilityState, final GenericFooterItemView object) {
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
  public GenericFooterItemViewModel_ onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<GenericFooterItemViewModel_, GenericFooterItemView> listener) {
    onMutation();
    this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityChanged(float percentVisibleHeight, float percentVisibleWidth,
      int visibleHeight, int visibleWidth, final GenericFooterItemView object) {
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
  public GenericFooterItemViewModel_ onVisibilityChanged(
      OnModelVisibilityChangedListener<GenericFooterItemViewModel_, GenericFooterItemView> listener) {
    onMutation();
    this.onModelVisibilityChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  /**
   * <i>Required.</i>
   *
   * @see GenericFooterItemView#setFooterContent(GenericFooterItemView.FooterModuleData)
   */
  public GenericFooterItemViewModel_ footerContent(
      @NotNull GenericFooterItemView.FooterModuleData footerContent) {
    if (footerContent == null) {
      throw new IllegalArgumentException("footerContent cannot be null");
    }
    assignedAttributes_epoxyGeneratedModel.set(0);
    onMutation();
    this.footerContent_FooterModuleData = footerContent;
    return this;
  }

  @NotNull
  public GenericFooterItemView.FooterModuleData footerContent() {
    return footerContent_FooterModuleData;
  }

  @Override
  public GenericFooterItemViewModel_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public GenericFooterItemViewModel_ id(@Nullable Number... ids) {
    super.id(ids);
    return this;
  }

  @Override
  public GenericFooterItemViewModel_ id(long id1, long id2) {
    super.id(id1, id2);
    return this;
  }

  @Override
  public GenericFooterItemViewModel_ id(@Nullable CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public GenericFooterItemViewModel_ id(@Nullable CharSequence key,
      @Nullable CharSequence... otherKeys) {
    super.id(key, otherKeys);
    return this;
  }

  @Override
  public GenericFooterItemViewModel_ id(@Nullable CharSequence key, long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public GenericFooterItemViewModel_ layout(@LayoutRes int layoutRes) {
    throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
  }

  @Override
  public GenericFooterItemViewModel_ spanSizeOverride(
      @Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback) {
    super.spanSizeOverride(spanSizeCallback);
    return this;
  }

  @Override
  public GenericFooterItemViewModel_ show() {
    super.show();
    return this;
  }

  @Override
  public GenericFooterItemViewModel_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public GenericFooterItemViewModel_ hide() {
    super.hide();
    return this;
  }

  @Override
  @LayoutRes
  protected int getDefaultLayout() {
    throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
  }

  @Override
  public GenericFooterItemViewModel_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
    onModelVisibilityChangedListener_epoxyGeneratedModel = null;
    assignedAttributes_epoxyGeneratedModel.clear();
    this.footerContent_FooterModuleData = null;
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof GenericFooterItemViewModel_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    GenericFooterItemViewModel_ that = (GenericFooterItemViewModel_) o;
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
    if ((footerContent_FooterModuleData != null ? !footerContent_FooterModuleData.equals(that.footerContent_FooterModuleData) : that.footerContent_FooterModuleData != null)) {
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
    _result = 31 * _result + (footerContent_FooterModuleData != null ? footerContent_FooterModuleData.hashCode() : 0);
    return _result;
  }

  @Override
  public String toString() {
    return "GenericFooterItemViewModel_{" +
        "footerContent_FooterModuleData=" + footerContent_FooterModuleData +
        "}" + super.toString();
  }

  @Override
  public int getSpanSize(int totalSpanCount, int position, int itemCount) {
    return totalSpanCount;
  }
}
