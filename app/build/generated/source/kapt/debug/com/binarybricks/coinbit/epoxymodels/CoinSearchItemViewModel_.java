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
import com.binarybricks.coinbit.data.database.entities.WatchedCoin;
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
public class CoinSearchItemViewModel_ extends EpoxyModel<CoinSearchItemView> implements GeneratedModel<CoinSearchItemView>, CoinSearchItemViewModelBuilder {
  private final BitSet assignedAttributes_epoxyGeneratedModel = new BitSet(3);

  private OnModelBoundListener<CoinSearchItemViewModel_, CoinSearchItemView> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<CoinSearchItemViewModel_, CoinSearchItemView> onModelUnboundListener_epoxyGeneratedModel;

  private OnModelVisibilityStateChangedListener<CoinSearchItemViewModel_, CoinSearchItemView> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

  private OnModelVisibilityChangedListener<CoinSearchItemViewModel_, CoinSearchItemView> onModelVisibilityChangedListener_epoxyGeneratedModel;

  /**
   * Bitset index: 0 */
  @NotNull
  private WatchedCoin watchedCoin_WatchedCoin;

  @Nullable
  private View.OnClickListener itemClickListener_OnClickListener = (View.OnClickListener) null;

  @Nullable
  private CoinSearchItemView.OnSearchItemClickListener onWatchedChecked_OnSearchItemClickListener = (CoinSearchItemView.OnSearchItemClickListener) null;

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
    if (!assignedAttributes_epoxyGeneratedModel.get(0)) {
    	throw new IllegalStateException("A value is required for setWatchedCoin");
    }
  }

  @Override
  protected int getViewType() {
    return 0;
  }

  @Override
  protected CoinSearchItemView buildView(ViewGroup parent) {
    CoinSearchItemView v = new CoinSearchItemView(parent.getContext());
    v.setLayoutParams(new ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.MATCH_PARENT, ViewGroup.MarginLayoutParams.WRAP_CONTENT));
    return v;
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final CoinSearchItemView object,
      final int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void bind(final CoinSearchItemView object) {
    super.bind(object);
    object.setWatchedCoin(watchedCoin_WatchedCoin);
    object.setItemClickListener(itemClickListener_OnClickListener);
    object.setOnWatchedChecked(onWatchedChecked_OnSearchItemClickListener);
  }

  @Override
  public void bind(final CoinSearchItemView object, EpoxyModel previousModel) {
    if (!(previousModel instanceof CoinSearchItemViewModel_)) {
      bind(object);
      return;
    }
    CoinSearchItemViewModel_ that = (CoinSearchItemViewModel_) previousModel;
    super.bind(object);

    if ((watchedCoin_WatchedCoin != null ? !watchedCoin_WatchedCoin.equals(that.watchedCoin_WatchedCoin) : that.watchedCoin_WatchedCoin != null)) {
      object.setWatchedCoin(watchedCoin_WatchedCoin);
    }

    if (((itemClickListener_OnClickListener == null) != (that.itemClickListener_OnClickListener == null))) {
      object.setItemClickListener(itemClickListener_OnClickListener);
    }

    if (((onWatchedChecked_OnSearchItemClickListener == null) != (that.onWatchedChecked_OnSearchItemClickListener == null))) {
      object.setOnWatchedChecked(onWatchedChecked_OnSearchItemClickListener);
    }
  }

  @Override
  public void handlePostBind(final CoinSearchItemView object, int position) {
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
  public CoinSearchItemViewModel_ onBind(
      OnModelBoundListener<CoinSearchItemViewModel_, CoinSearchItemView> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(CoinSearchItemView object) {
    super.unbind(object);
    if (onModelUnboundListener_epoxyGeneratedModel != null) {
      onModelUnboundListener_epoxyGeneratedModel.onModelUnbound(this, object);
    }
    object.setItemClickListener((View.OnClickListener) null);
    object.setOnWatchedChecked((CoinSearchItemView.OnSearchItemClickListener) null);
  }

  /**
   * Register a listener that will be called when this model is unbound from a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public CoinSearchItemViewModel_ onUnbind(
      OnModelUnboundListener<CoinSearchItemViewModel_, CoinSearchItemView> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityStateChanged(int visibilityState, final CoinSearchItemView object) {
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
  public CoinSearchItemViewModel_ onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<CoinSearchItemViewModel_, CoinSearchItemView> listener) {
    onMutation();
    this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityChanged(float percentVisibleHeight, float percentVisibleWidth,
      int visibleHeight, int visibleWidth, final CoinSearchItemView object) {
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
  public CoinSearchItemViewModel_ onVisibilityChanged(
      OnModelVisibilityChangedListener<CoinSearchItemViewModel_, CoinSearchItemView> listener) {
    onMutation();
    this.onModelVisibilityChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  /**
   * <i>Required.</i>
   *
   * @see CoinSearchItemView#setWatchedCoin(WatchedCoin)
   */
  public CoinSearchItemViewModel_ watchedCoin(@NotNull WatchedCoin watchedCoin) {
    if (watchedCoin == null) {
      throw new IllegalArgumentException("watchedCoin cannot be null");
    }
    assignedAttributes_epoxyGeneratedModel.set(0);
    onMutation();
    this.watchedCoin_WatchedCoin = watchedCoin;
    return this;
  }

  @NotNull
  public WatchedCoin watchedCoin() {
    return watchedCoin_WatchedCoin;
  }

  /**
   * Set a click listener that will provide the parent view, model, and adapter position of the clicked view. This will clear the normal View.OnClickListener if one has been set */
  public CoinSearchItemViewModel_ itemClickListener(
      @Nullable final OnModelClickListener<CoinSearchItemViewModel_, CoinSearchItemView> itemClickListener) {
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
   * @see CoinSearchItemView#setItemClickListener(View.OnClickListener)
   */
  public CoinSearchItemViewModel_ itemClickListener(
      @Nullable View.OnClickListener itemClickListener) {
    onMutation();
    this.itemClickListener_OnClickListener = itemClickListener;
    return this;
  }

  @Nullable
  public View.OnClickListener itemClickListener() {
    return itemClickListener_OnClickListener;
  }

  /**
   * <i>Optional</i>: Default value is (CoinSearchItemView.OnSearchItemClickListener) null
   *
   * @see CoinSearchItemView#setOnWatchedChecked(CoinSearchItemView.OnSearchItemClickListener)
   */
  public CoinSearchItemViewModel_ onWatchedChecked(
      @Nullable CoinSearchItemView.OnSearchItemClickListener onWatchedChecked) {
    onMutation();
    this.onWatchedChecked_OnSearchItemClickListener = onWatchedChecked;
    return this;
  }

  @Nullable
  public CoinSearchItemView.OnSearchItemClickListener onWatchedChecked() {
    return onWatchedChecked_OnSearchItemClickListener;
  }

  @Override
  public CoinSearchItemViewModel_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public CoinSearchItemViewModel_ id(@androidx.annotation.Nullable Number... ids) {
    super.id(ids);
    return this;
  }

  @Override
  public CoinSearchItemViewModel_ id(long id1, long id2) {
    super.id(id1, id2);
    return this;
  }

  @Override
  public CoinSearchItemViewModel_ id(@androidx.annotation.Nullable CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public CoinSearchItemViewModel_ id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys) {
    super.id(key, otherKeys);
    return this;
  }

  @Override
  public CoinSearchItemViewModel_ id(@androidx.annotation.Nullable CharSequence key, long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public CoinSearchItemViewModel_ layout(@LayoutRes int layoutRes) {
    throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
  }

  @Override
  public CoinSearchItemViewModel_ spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback) {
    super.spanSizeOverride(spanSizeCallback);
    return this;
  }

  @Override
  public CoinSearchItemViewModel_ show() {
    super.show();
    return this;
  }

  @Override
  public CoinSearchItemViewModel_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public CoinSearchItemViewModel_ hide() {
    super.hide();
    return this;
  }

  @Override
  @LayoutRes
  protected int getDefaultLayout() {
    throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
  }

  @Override
  public CoinSearchItemViewModel_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
    onModelVisibilityChangedListener_epoxyGeneratedModel = null;
    assignedAttributes_epoxyGeneratedModel.clear();
    this.watchedCoin_WatchedCoin = null;
    this.itemClickListener_OnClickListener = (View.OnClickListener) null;
    this.onWatchedChecked_OnSearchItemClickListener = (CoinSearchItemView.OnSearchItemClickListener) null;
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof CoinSearchItemViewModel_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    CoinSearchItemViewModel_ that = (CoinSearchItemViewModel_) o;
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
    if ((watchedCoin_WatchedCoin != null ? !watchedCoin_WatchedCoin.equals(that.watchedCoin_WatchedCoin) : that.watchedCoin_WatchedCoin != null)) {
      return false;
    }
    if (((itemClickListener_OnClickListener == null) != (that.itemClickListener_OnClickListener == null))) {
      return false;
    }
    if (((onWatchedChecked_OnSearchItemClickListener == null) != (that.onWatchedChecked_OnSearchItemClickListener == null))) {
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
    _result = 31 * _result + (watchedCoin_WatchedCoin != null ? watchedCoin_WatchedCoin.hashCode() : 0);
    _result = 31 * _result + (itemClickListener_OnClickListener != null ? 1 : 0);
    _result = 31 * _result + (onWatchedChecked_OnSearchItemClickListener != null ? 1 : 0);
    return _result;
  }

  @Override
  public String toString() {
    return "CoinSearchItemViewModel_{" +
        "watchedCoin_WatchedCoin=" + watchedCoin_WatchedCoin +
        ", itemClickListener_OnClickListener=" + itemClickListener_OnClickListener +
        ", onWatchedChecked_OnSearchItemClickListener=" + onWatchedChecked_OnSearchItemClickListener +
        "}" + super.toString();
  }

  @Override
  public int getSpanSize(int totalSpanCount, int position, int itemCount) {
    return totalSpanCount;
  }
}
