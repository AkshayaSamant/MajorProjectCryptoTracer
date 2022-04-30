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
import java.lang.Number;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import org.jetbrains.annotations.Nullable;

/**
 * Generated file. Do not modify! */
public class AddCoinItemViewModel_ extends EpoxyModel<AddCoinItemView> implements GeneratedModel<AddCoinItemView>, AddCoinItemViewModelBuilder {
  private OnModelBoundListener<AddCoinItemViewModel_, AddCoinItemView> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<AddCoinItemViewModel_, AddCoinItemView> onModelUnboundListener_epoxyGeneratedModel;

  private OnModelVisibilityStateChangedListener<AddCoinItemViewModel_, AddCoinItemView> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

  private OnModelVisibilityChangedListener<AddCoinItemViewModel_, AddCoinItemView> onModelVisibilityChangedListener_epoxyGeneratedModel;

  @Nullable
  private View.OnClickListener addCoinClickListener_OnClickListener = (View.OnClickListener) null;

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
  }

  @Override
  protected int getViewType() {
    return 0;
  }

  @Override
  protected AddCoinItemView buildView(ViewGroup parent) {
    AddCoinItemView v = new AddCoinItemView(parent.getContext());
    v.setLayoutParams(new ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.MATCH_PARENT, ViewGroup.MarginLayoutParams.WRAP_CONTENT));
    return v;
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final AddCoinItemView object,
      final int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void bind(final AddCoinItemView object) {
    super.bind(object);
    object.setAddCoinClickListener(addCoinClickListener_OnClickListener);
  }

  @Override
  public void bind(final AddCoinItemView object, EpoxyModel previousModel) {
    if (!(previousModel instanceof AddCoinItemViewModel_)) {
      bind(object);
      return;
    }
    AddCoinItemViewModel_ that = (AddCoinItemViewModel_) previousModel;
    super.bind(object);

    if (((addCoinClickListener_OnClickListener == null) != (that.addCoinClickListener_OnClickListener == null))) {
      object.setAddCoinClickListener(addCoinClickListener_OnClickListener);
    }
  }

  @Override
  public void handlePostBind(final AddCoinItemView object, int position) {
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
  public AddCoinItemViewModel_ onBind(
      OnModelBoundListener<AddCoinItemViewModel_, AddCoinItemView> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(AddCoinItemView object) {
    super.unbind(object);
    if (onModelUnboundListener_epoxyGeneratedModel != null) {
      onModelUnboundListener_epoxyGeneratedModel.onModelUnbound(this, object);
    }
    object.setAddCoinClickListener((View.OnClickListener) null);
  }

  /**
   * Register a listener that will be called when this model is unbound from a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public AddCoinItemViewModel_ onUnbind(
      OnModelUnboundListener<AddCoinItemViewModel_, AddCoinItemView> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityStateChanged(int visibilityState, final AddCoinItemView object) {
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
  public AddCoinItemViewModel_ onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<AddCoinItemViewModel_, AddCoinItemView> listener) {
    onMutation();
    this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityChanged(float percentVisibleHeight, float percentVisibleWidth,
      int visibleHeight, int visibleWidth, final AddCoinItemView object) {
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
  public AddCoinItemViewModel_ onVisibilityChanged(
      OnModelVisibilityChangedListener<AddCoinItemViewModel_, AddCoinItemView> listener) {
    onMutation();
    this.onModelVisibilityChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  /**
   * Set a click listener that will provide the parent view, model, and adapter position of the clicked view. This will clear the normal View.OnClickListener if one has been set */
  public AddCoinItemViewModel_ addCoinClickListener(
      @Nullable final OnModelClickListener<AddCoinItemViewModel_, AddCoinItemView> addCoinClickListener) {
    onMutation();
    if (addCoinClickListener == null) {
      this.addCoinClickListener_OnClickListener = null;
    }
    else {
      this.addCoinClickListener_OnClickListener = new WrappedEpoxyModelClickListener(addCoinClickListener);
    }
    return this;
  }

  /**
   * <i>Optional</i>: Default value is (View.OnClickListener) null
   *
   * @see AddCoinItemView#setAddCoinClickListener(View.OnClickListener)
   */
  public AddCoinItemViewModel_ addCoinClickListener(
      @Nullable View.OnClickListener addCoinClickListener) {
    onMutation();
    this.addCoinClickListener_OnClickListener = addCoinClickListener;
    return this;
  }

  @Nullable
  public View.OnClickListener addCoinClickListener() {
    return addCoinClickListener_OnClickListener;
  }

  @Override
  public AddCoinItemViewModel_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public AddCoinItemViewModel_ id(@androidx.annotation.Nullable Number... ids) {
    super.id(ids);
    return this;
  }

  @Override
  public AddCoinItemViewModel_ id(long id1, long id2) {
    super.id(id1, id2);
    return this;
  }

  @Override
  public AddCoinItemViewModel_ id(@androidx.annotation.Nullable CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public AddCoinItemViewModel_ id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys) {
    super.id(key, otherKeys);
    return this;
  }

  @Override
  public AddCoinItemViewModel_ id(@androidx.annotation.Nullable CharSequence key, long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public AddCoinItemViewModel_ layout(@LayoutRes int layoutRes) {
    throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
  }

  @Override
  public AddCoinItemViewModel_ spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback) {
    super.spanSizeOverride(spanSizeCallback);
    return this;
  }

  @Override
  public AddCoinItemViewModel_ show() {
    super.show();
    return this;
  }

  @Override
  public AddCoinItemViewModel_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public AddCoinItemViewModel_ hide() {
    super.hide();
    return this;
  }

  @Override
  @LayoutRes
  protected int getDefaultLayout() {
    throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
  }

  @Override
  public AddCoinItemViewModel_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
    onModelVisibilityChangedListener_epoxyGeneratedModel = null;
    this.addCoinClickListener_OnClickListener = (View.OnClickListener) null;
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof AddCoinItemViewModel_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    AddCoinItemViewModel_ that = (AddCoinItemViewModel_) o;
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
    if (((addCoinClickListener_OnClickListener == null) != (that.addCoinClickListener_OnClickListener == null))) {
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
    _result = 31 * _result + (addCoinClickListener_OnClickListener != null ? 1 : 0);
    return _result;
  }

  @Override
  public String toString() {
    return "AddCoinItemViewModel_{" +
        "addCoinClickListener_OnClickListener=" + addCoinClickListener_OnClickListener +
        "}" + super.toString();
  }

  @Override
  public int getSpanSize(int totalSpanCount, int position, int itemCount) {
    return totalSpanCount;
  }
}
