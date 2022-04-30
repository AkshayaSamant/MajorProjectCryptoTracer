package com.binarybricks.coinbit.epoxymodels;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelClickListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import com.airbnb.epoxy.StringAttributeData;
import com.airbnb.epoxy.WrappedEpoxyModelClickListener;
import com.binarybricks.coinbit.network.models.CryptoTicker;
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
public class CoinTickerViewModel_ extends EpoxyModel<CoinTickerView> implements GeneratedModel<CoinTickerView>, CoinTickerViewModelBuilder {
  private final BitSet assignedAttributes_epoxyGeneratedModel = new BitSet(4);

  private OnModelBoundListener<CoinTickerViewModel_, CoinTickerView> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<CoinTickerViewModel_, CoinTickerView> onModelUnboundListener_epoxyGeneratedModel;

  private OnModelVisibilityStateChangedListener<CoinTickerViewModel_, CoinTickerView> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

  private OnModelVisibilityChangedListener<CoinTickerViewModel_, CoinTickerView> onModelVisibilityChangedListener_epoxyGeneratedModel;

  /**
   * Bitset index: 0 */
  @NotNull
  private CryptoTicker ticker_CryptoTicker;

  /**
   * Bitset index: 1 */
  private StringAttributeData tickerPrice_StringAttributeData =  new StringAttributeData();

  /**
   * Bitset index: 2 */
  private StringAttributeData tickerVolume_StringAttributeData =  new StringAttributeData();

  @Nullable
  private View.OnClickListener itemClickListener_OnClickListener = (View.OnClickListener) null;

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
    if (!assignedAttributes_epoxyGeneratedModel.get(2)) {
    	throw new IllegalStateException("A value is required for setTickerVolume");
    }
    if (!assignedAttributes_epoxyGeneratedModel.get(1)) {
    	throw new IllegalStateException("A value is required for setTickerPrice");
    }
    if (!assignedAttributes_epoxyGeneratedModel.get(0)) {
    	throw new IllegalStateException("A value is required for setTicker");
    }
  }

  @Override
  protected int getViewType() {
    return 0;
  }

  @Override
  protected CoinTickerView buildView(ViewGroup parent) {
    CoinTickerView v = new CoinTickerView(parent.getContext());
    v.setLayoutParams(new ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.MATCH_PARENT, ViewGroup.MarginLayoutParams.WRAP_CONTENT));
    return v;
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final CoinTickerView object,
      final int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void bind(final CoinTickerView object) {
    super.bind(object);
    object.setTickerVolume(tickerVolume_StringAttributeData.toString(object.getContext()));
    object.setTickerPrice(tickerPrice_StringAttributeData.toString(object.getContext()));
    object.setItemClickListener(itemClickListener_OnClickListener);
    object.setTicker(ticker_CryptoTicker);
  }

  @Override
  public void bind(final CoinTickerView object, EpoxyModel previousModel) {
    if (!(previousModel instanceof CoinTickerViewModel_)) {
      bind(object);
      return;
    }
    CoinTickerViewModel_ that = (CoinTickerViewModel_) previousModel;
    super.bind(object);

    if ((tickerVolume_StringAttributeData != null ? !tickerVolume_StringAttributeData.equals(that.tickerVolume_StringAttributeData) : that.tickerVolume_StringAttributeData != null)) {
      object.setTickerVolume(tickerVolume_StringAttributeData.toString(object.getContext()));
    }

    if ((tickerPrice_StringAttributeData != null ? !tickerPrice_StringAttributeData.equals(that.tickerPrice_StringAttributeData) : that.tickerPrice_StringAttributeData != null)) {
      object.setTickerPrice(tickerPrice_StringAttributeData.toString(object.getContext()));
    }

    if (((itemClickListener_OnClickListener == null) != (that.itemClickListener_OnClickListener == null))) {
      object.setItemClickListener(itemClickListener_OnClickListener);
    }

    if ((ticker_CryptoTicker != null ? !ticker_CryptoTicker.equals(that.ticker_CryptoTicker) : that.ticker_CryptoTicker != null)) {
      object.setTicker(ticker_CryptoTicker);
    }
  }

  @Override
  public void handlePostBind(final CoinTickerView object, int position) {
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
  public CoinTickerViewModel_ onBind(
      OnModelBoundListener<CoinTickerViewModel_, CoinTickerView> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(CoinTickerView object) {
    super.unbind(object);
    if (onModelUnboundListener_epoxyGeneratedModel != null) {
      onModelUnboundListener_epoxyGeneratedModel.onModelUnbound(this, object);
    }
    object.setItemClickListener((View.OnClickListener) null);
    object.viewRecycled();
  }

  /**
   * Register a listener that will be called when this model is unbound from a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public CoinTickerViewModel_ onUnbind(
      OnModelUnboundListener<CoinTickerViewModel_, CoinTickerView> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityStateChanged(int visibilityState, final CoinTickerView object) {
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
  public CoinTickerViewModel_ onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<CoinTickerViewModel_, CoinTickerView> listener) {
    onMutation();
    this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityChanged(float percentVisibleHeight, float percentVisibleWidth,
      int visibleHeight, int visibleWidth, final CoinTickerView object) {
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
  public CoinTickerViewModel_ onVisibilityChanged(
      OnModelVisibilityChangedListener<CoinTickerViewModel_, CoinTickerView> listener) {
    onMutation();
    this.onModelVisibilityChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  /**
   * <i>Required.</i>
   *
   * @see CoinTickerView#setTicker(CryptoTicker)
   */
  public CoinTickerViewModel_ ticker(@NotNull CryptoTicker ticker) {
    if (ticker == null) {
      throw new IllegalArgumentException("ticker cannot be null");
    }
    assignedAttributes_epoxyGeneratedModel.set(0);
    onMutation();
    this.ticker_CryptoTicker = ticker;
    return this;
  }

  @NotNull
  public CryptoTicker ticker() {
    return ticker_CryptoTicker;
  }

  public CharSequence getTickerPrice(Context context) {
    return tickerPrice_StringAttributeData.toString(context);
  }

  /**
   * <i>Required.</i>
   *
   * @see CoinTickerView#setTickerPrice(CharSequence)
   */
  public CoinTickerViewModel_ tickerPrice(@NonNull CharSequence tickerPrice) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(1);
    if (tickerPrice == null) {
      throw new IllegalArgumentException("tickerPrice cannot be null");
    }
    tickerPrice_StringAttributeData.setValue(tickerPrice);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see CoinTickerView#setTickerPrice(CharSequence)
   */
  public CoinTickerViewModel_ tickerPrice(@StringRes int stringRes) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(1);
    tickerPrice_StringAttributeData.setValue(stringRes);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see CoinTickerView#setTickerPrice(CharSequence)
   */
  public CoinTickerViewModel_ tickerPrice(@StringRes int stringRes, Object... formatArgs) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(1);
    tickerPrice_StringAttributeData.setValue(stringRes, formatArgs);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see CoinTickerView#setTickerPrice(CharSequence)
   */
  public CoinTickerViewModel_ tickerPriceQuantityRes(@PluralsRes int pluralRes, int quantity,
      Object... formatArgs) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(1);
    tickerPrice_StringAttributeData.setValue(pluralRes, quantity, formatArgs);
    return this;
  }

  public CharSequence getTickerVolume(Context context) {
    return tickerVolume_StringAttributeData.toString(context);
  }

  /**
   * <i>Required.</i>
   *
   * @see CoinTickerView#setTickerVolume(CharSequence)
   */
  public CoinTickerViewModel_ tickerVolume(@NonNull CharSequence tickerVolume) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(2);
    if (tickerVolume == null) {
      throw new IllegalArgumentException("tickerVolume cannot be null");
    }
    tickerVolume_StringAttributeData.setValue(tickerVolume);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see CoinTickerView#setTickerVolume(CharSequence)
   */
  public CoinTickerViewModel_ tickerVolume(@StringRes int stringRes) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(2);
    tickerVolume_StringAttributeData.setValue(stringRes);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see CoinTickerView#setTickerVolume(CharSequence)
   */
  public CoinTickerViewModel_ tickerVolume(@StringRes int stringRes, Object... formatArgs) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(2);
    tickerVolume_StringAttributeData.setValue(stringRes, formatArgs);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see CoinTickerView#setTickerVolume(CharSequence)
   */
  public CoinTickerViewModel_ tickerVolumeQuantityRes(@PluralsRes int pluralRes, int quantity,
      Object... formatArgs) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(2);
    tickerVolume_StringAttributeData.setValue(pluralRes, quantity, formatArgs);
    return this;
  }

  /**
   * Set a click listener that will provide the parent view, model, and adapter position of the clicked view. This will clear the normal View.OnClickListener if one has been set */
  public CoinTickerViewModel_ itemClickListener(
      @Nullable final OnModelClickListener<CoinTickerViewModel_, CoinTickerView> itemClickListener) {
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
   * @see CoinTickerView#setItemClickListener(View.OnClickListener)
   */
  public CoinTickerViewModel_ itemClickListener(@Nullable View.OnClickListener itemClickListener) {
    onMutation();
    this.itemClickListener_OnClickListener = itemClickListener;
    return this;
  }

  @Nullable
  public View.OnClickListener itemClickListener() {
    return itemClickListener_OnClickListener;
  }

  @Override
  public CoinTickerViewModel_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public CoinTickerViewModel_ id(@androidx.annotation.Nullable Number... ids) {
    super.id(ids);
    return this;
  }

  @Override
  public CoinTickerViewModel_ id(long id1, long id2) {
    super.id(id1, id2);
    return this;
  }

  @Override
  public CoinTickerViewModel_ id(@androidx.annotation.Nullable CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public CoinTickerViewModel_ id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys) {
    super.id(key, otherKeys);
    return this;
  }

  @Override
  public CoinTickerViewModel_ id(@androidx.annotation.Nullable CharSequence key, long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public CoinTickerViewModel_ layout(@LayoutRes int layoutRes) {
    throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
  }

  @Override
  public CoinTickerViewModel_ spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback) {
    super.spanSizeOverride(spanSizeCallback);
    return this;
  }

  @Override
  public CoinTickerViewModel_ show() {
    super.show();
    return this;
  }

  @Override
  public CoinTickerViewModel_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public CoinTickerViewModel_ hide() {
    super.hide();
    return this;
  }

  @Override
  @LayoutRes
  protected int getDefaultLayout() {
    throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
  }

  @Override
  public CoinTickerViewModel_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
    onModelVisibilityChangedListener_epoxyGeneratedModel = null;
    assignedAttributes_epoxyGeneratedModel.clear();
    this.ticker_CryptoTicker = null;
    this.tickerPrice_StringAttributeData =  new StringAttributeData();
    this.tickerVolume_StringAttributeData =  new StringAttributeData();
    this.itemClickListener_OnClickListener = (View.OnClickListener) null;
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof CoinTickerViewModel_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    CoinTickerViewModel_ that = (CoinTickerViewModel_) o;
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
    if ((ticker_CryptoTicker != null ? !ticker_CryptoTicker.equals(that.ticker_CryptoTicker) : that.ticker_CryptoTicker != null)) {
      return false;
    }
    if ((tickerPrice_StringAttributeData != null ? !tickerPrice_StringAttributeData.equals(that.tickerPrice_StringAttributeData) : that.tickerPrice_StringAttributeData != null)) {
      return false;
    }
    if ((tickerVolume_StringAttributeData != null ? !tickerVolume_StringAttributeData.equals(that.tickerVolume_StringAttributeData) : that.tickerVolume_StringAttributeData != null)) {
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
    _result = 31 * _result + (ticker_CryptoTicker != null ? ticker_CryptoTicker.hashCode() : 0);
    _result = 31 * _result + (tickerPrice_StringAttributeData != null ? tickerPrice_StringAttributeData.hashCode() : 0);
    _result = 31 * _result + (tickerVolume_StringAttributeData != null ? tickerVolume_StringAttributeData.hashCode() : 0);
    _result = 31 * _result + (itemClickListener_OnClickListener != null ? 1 : 0);
    return _result;
  }

  @Override
  public String toString() {
    return "CoinTickerViewModel_{" +
        "ticker_CryptoTicker=" + ticker_CryptoTicker +
        ", tickerPrice_StringAttributeData=" + tickerPrice_StringAttributeData +
        ", tickerVolume_StringAttributeData=" + tickerVolume_StringAttributeData +
        ", itemClickListener_OnClickListener=" + itemClickListener_OnClickListener +
        "}" + super.toString();
  }

  @Override
  public int getSpanSize(int totalSpanCount, int position, int itemCount) {
    return totalSpanCount;
  }
}
