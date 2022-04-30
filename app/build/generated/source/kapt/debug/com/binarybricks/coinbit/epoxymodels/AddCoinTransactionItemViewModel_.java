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
public class AddCoinTransactionItemViewModel_ extends EpoxyModel<AddCoinTransactionItemView> implements GeneratedModel<AddCoinTransactionItemView>, AddCoinTransactionItemViewModelBuilder {
  private OnModelBoundListener<AddCoinTransactionItemViewModel_, AddCoinTransactionItemView> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<AddCoinTransactionItemViewModel_, AddCoinTransactionItemView> onModelUnboundListener_epoxyGeneratedModel;

  private OnModelVisibilityStateChangedListener<AddCoinTransactionItemViewModel_, AddCoinTransactionItemView> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

  private OnModelVisibilityChangedListener<AddCoinTransactionItemViewModel_, AddCoinTransactionItemView> onModelVisibilityChangedListener_epoxyGeneratedModel;

  @Nullable
  private View.OnClickListener itemClickListener_OnClickListener = (View.OnClickListener) null;

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
  protected AddCoinTransactionItemView buildView(ViewGroup parent) {
    AddCoinTransactionItemView v = new AddCoinTransactionItemView(parent.getContext());
    v.setLayoutParams(new ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.MATCH_PARENT, ViewGroup.MarginLayoutParams.WRAP_CONTENT));
    return v;
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final AddCoinTransactionItemView object,
      final int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void bind(final AddCoinTransactionItemView object) {
    super.bind(object);
    object.setItemClickListener(itemClickListener_OnClickListener);
  }

  @Override
  public void bind(final AddCoinTransactionItemView object, EpoxyModel previousModel) {
    if (!(previousModel instanceof AddCoinTransactionItemViewModel_)) {
      bind(object);
      return;
    }
    AddCoinTransactionItemViewModel_ that = (AddCoinTransactionItemViewModel_) previousModel;
    super.bind(object);

    if (((itemClickListener_OnClickListener == null) != (that.itemClickListener_OnClickListener == null))) {
      object.setItemClickListener(itemClickListener_OnClickListener);
    }
  }

  @Override
  public void handlePostBind(final AddCoinTransactionItemView object, int position) {
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
  public AddCoinTransactionItemViewModel_ onBind(
      OnModelBoundListener<AddCoinTransactionItemViewModel_, AddCoinTransactionItemView> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(AddCoinTransactionItemView object) {
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
  public AddCoinTransactionItemViewModel_ onUnbind(
      OnModelUnboundListener<AddCoinTransactionItemViewModel_, AddCoinTransactionItemView> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityStateChanged(int visibilityState,
      final AddCoinTransactionItemView object) {
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
  public AddCoinTransactionItemViewModel_ onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<AddCoinTransactionItemViewModel_, AddCoinTransactionItemView> listener) {
    onMutation();
    this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityChanged(float percentVisibleHeight, float percentVisibleWidth,
      int visibleHeight, int visibleWidth, final AddCoinTransactionItemView object) {
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
  public AddCoinTransactionItemViewModel_ onVisibilityChanged(
      OnModelVisibilityChangedListener<AddCoinTransactionItemViewModel_, AddCoinTransactionItemView> listener) {
    onMutation();
    this.onModelVisibilityChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  /**
   * Set a click listener that will provide the parent view, model, and adapter position of the clicked view. This will clear the normal View.OnClickListener if one has been set */
  public AddCoinTransactionItemViewModel_ itemClickListener(
      @Nullable final OnModelClickListener<AddCoinTransactionItemViewModel_, AddCoinTransactionItemView> itemClickListener) {
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
   * @see AddCoinTransactionItemView#setItemClickListener(View.OnClickListener)
   */
  public AddCoinTransactionItemViewModel_ itemClickListener(
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
  public AddCoinTransactionItemViewModel_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public AddCoinTransactionItemViewModel_ id(@androidx.annotation.Nullable Number... ids) {
    super.id(ids);
    return this;
  }

  @Override
  public AddCoinTransactionItemViewModel_ id(long id1, long id2) {
    super.id(id1, id2);
    return this;
  }

  @Override
  public AddCoinTransactionItemViewModel_ id(@androidx.annotation.Nullable CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public AddCoinTransactionItemViewModel_ id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys) {
    super.id(key, otherKeys);
    return this;
  }

  @Override
  public AddCoinTransactionItemViewModel_ id(@androidx.annotation.Nullable CharSequence key,
      long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public AddCoinTransactionItemViewModel_ layout(@LayoutRes int layoutRes) {
    throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
  }

  @Override
  public AddCoinTransactionItemViewModel_ spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback) {
    super.spanSizeOverride(spanSizeCallback);
    return this;
  }

  @Override
  public AddCoinTransactionItemViewModel_ show() {
    super.show();
    return this;
  }

  @Override
  public AddCoinTransactionItemViewModel_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public AddCoinTransactionItemViewModel_ hide() {
    super.hide();
    return this;
  }

  @Override
  @LayoutRes
  protected int getDefaultLayout() {
    throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
  }

  @Override
  public AddCoinTransactionItemViewModel_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
    onModelVisibilityChangedListener_epoxyGeneratedModel = null;
    this.itemClickListener_OnClickListener = (View.OnClickListener) null;
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof AddCoinTransactionItemViewModel_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    AddCoinTransactionItemViewModel_ that = (AddCoinTransactionItemViewModel_) o;
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
    _result = 31 * _result + (itemClickListener_OnClickListener != null ? 1 : 0);
    return _result;
  }

  @Override
  public String toString() {
    return "AddCoinTransactionItemViewModel_{" +
        "itemClickListener_OnClickListener=" + itemClickListener_OnClickListener +
        "}" + super.toString();
  }

  @Override
  public int getSpanSize(int totalSpanCount, int position, int itemCount) {
    return totalSpanCount;
  }
}
