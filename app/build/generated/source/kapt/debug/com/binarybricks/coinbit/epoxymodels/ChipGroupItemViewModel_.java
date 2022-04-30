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
public class ChipGroupItemViewModel_ extends EpoxyModel<ChipGroupItemView> implements GeneratedModel<ChipGroupItemView>, ChipGroupItemViewModelBuilder {
  private final BitSet assignedAttributes_epoxyGeneratedModel = new BitSet(2);

  private OnModelBoundListener<ChipGroupItemViewModel_, ChipGroupItemView> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<ChipGroupItemViewModel_, ChipGroupItemView> onModelUnboundListener_epoxyGeneratedModel;

  private OnModelVisibilityStateChangedListener<ChipGroupItemViewModel_, ChipGroupItemView> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

  private OnModelVisibilityChangedListener<ChipGroupItemViewModel_, ChipGroupItemView> onModelVisibilityChangedListener_epoxyGeneratedModel;

  /**
   * Bitset index: 0 */
  @NotNull
  private ChipGroupItemView.ChipGroupModuleData chipData_ChipGroupModuleData;

  @Nullable
  private ChipGroupItemView.OnChipItemClickedListener chipClickListener_OnChipItemClickedListener = (ChipGroupItemView.OnChipItemClickedListener) null;

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
    if (!assignedAttributes_epoxyGeneratedModel.get(0)) {
    	throw new IllegalStateException("A value is required for setChipData");
    }
  }

  @Override
  protected int getViewType() {
    return 0;
  }

  @Override
  protected ChipGroupItemView buildView(ViewGroup parent) {
    ChipGroupItemView v = new ChipGroupItemView(parent.getContext());
    v.setLayoutParams(new ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.MATCH_PARENT, ViewGroup.MarginLayoutParams.WRAP_CONTENT));
    return v;
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final ChipGroupItemView object,
      final int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void bind(final ChipGroupItemView object) {
    super.bind(object);
    object.setChipClickListener(chipClickListener_OnChipItemClickedListener);
    object.setChipData(chipData_ChipGroupModuleData);
  }

  @Override
  public void bind(final ChipGroupItemView object, EpoxyModel previousModel) {
    if (!(previousModel instanceof ChipGroupItemViewModel_)) {
      bind(object);
      return;
    }
    ChipGroupItemViewModel_ that = (ChipGroupItemViewModel_) previousModel;
    super.bind(object);

    if (((chipClickListener_OnChipItemClickedListener == null) != (that.chipClickListener_OnChipItemClickedListener == null))) {
      object.setChipClickListener(chipClickListener_OnChipItemClickedListener);
    }

    if ((chipData_ChipGroupModuleData != null ? !chipData_ChipGroupModuleData.equals(that.chipData_ChipGroupModuleData) : that.chipData_ChipGroupModuleData != null)) {
      object.setChipData(chipData_ChipGroupModuleData);
    }
  }

  @Override
  public void handlePostBind(final ChipGroupItemView object, int position) {
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
  public ChipGroupItemViewModel_ onBind(
      OnModelBoundListener<ChipGroupItemViewModel_, ChipGroupItemView> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(ChipGroupItemView object) {
    super.unbind(object);
    if (onModelUnboundListener_epoxyGeneratedModel != null) {
      onModelUnboundListener_epoxyGeneratedModel.onModelUnbound(this, object);
    }
    object.setChipClickListener((ChipGroupItemView.OnChipItemClickedListener) null);
  }

  /**
   * Register a listener that will be called when this model is unbound from a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public ChipGroupItemViewModel_ onUnbind(
      OnModelUnboundListener<ChipGroupItemViewModel_, ChipGroupItemView> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityStateChanged(int visibilityState, final ChipGroupItemView object) {
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
  public ChipGroupItemViewModel_ onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<ChipGroupItemViewModel_, ChipGroupItemView> listener) {
    onMutation();
    this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityChanged(float percentVisibleHeight, float percentVisibleWidth,
      int visibleHeight, int visibleWidth, final ChipGroupItemView object) {
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
  public ChipGroupItemViewModel_ onVisibilityChanged(
      OnModelVisibilityChangedListener<ChipGroupItemViewModel_, ChipGroupItemView> listener) {
    onMutation();
    this.onModelVisibilityChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  /**
   * <i>Required.</i>
   *
   * @see ChipGroupItemView#setChipData(ChipGroupItemView.ChipGroupModuleData)
   */
  public ChipGroupItemViewModel_ chipData(@NotNull ChipGroupItemView.ChipGroupModuleData chipData) {
    if (chipData == null) {
      throw new IllegalArgumentException("chipData cannot be null");
    }
    assignedAttributes_epoxyGeneratedModel.set(0);
    onMutation();
    this.chipData_ChipGroupModuleData = chipData;
    return this;
  }

  @NotNull
  public ChipGroupItemView.ChipGroupModuleData chipData() {
    return chipData_ChipGroupModuleData;
  }

  /**
   * <i>Optional</i>: Default value is (ChipGroupItemView.OnChipItemClickedListener) null
   *
   * @see ChipGroupItemView#setChipClickListener(ChipGroupItemView.OnChipItemClickedListener)
   */
  public ChipGroupItemViewModel_ chipClickListener(
      @Nullable ChipGroupItemView.OnChipItemClickedListener chipClickListener) {
    onMutation();
    this.chipClickListener_OnChipItemClickedListener = chipClickListener;
    return this;
  }

  @Nullable
  public ChipGroupItemView.OnChipItemClickedListener chipClickListener() {
    return chipClickListener_OnChipItemClickedListener;
  }

  @Override
  public ChipGroupItemViewModel_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public ChipGroupItemViewModel_ id(@androidx.annotation.Nullable Number... ids) {
    super.id(ids);
    return this;
  }

  @Override
  public ChipGroupItemViewModel_ id(long id1, long id2) {
    super.id(id1, id2);
    return this;
  }

  @Override
  public ChipGroupItemViewModel_ id(@androidx.annotation.Nullable CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public ChipGroupItemViewModel_ id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys) {
    super.id(key, otherKeys);
    return this;
  }

  @Override
  public ChipGroupItemViewModel_ id(@androidx.annotation.Nullable CharSequence key, long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public ChipGroupItemViewModel_ layout(@LayoutRes int layoutRes) {
    throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
  }

  @Override
  public ChipGroupItemViewModel_ spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback) {
    super.spanSizeOverride(spanSizeCallback);
    return this;
  }

  @Override
  public ChipGroupItemViewModel_ show() {
    super.show();
    return this;
  }

  @Override
  public ChipGroupItemViewModel_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public ChipGroupItemViewModel_ hide() {
    super.hide();
    return this;
  }

  @Override
  @LayoutRes
  protected int getDefaultLayout() {
    throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
  }

  @Override
  public ChipGroupItemViewModel_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
    onModelVisibilityChangedListener_epoxyGeneratedModel = null;
    assignedAttributes_epoxyGeneratedModel.clear();
    this.chipData_ChipGroupModuleData = null;
    this.chipClickListener_OnChipItemClickedListener = (ChipGroupItemView.OnChipItemClickedListener) null;
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof ChipGroupItemViewModel_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    ChipGroupItemViewModel_ that = (ChipGroupItemViewModel_) o;
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
    if ((chipData_ChipGroupModuleData != null ? !chipData_ChipGroupModuleData.equals(that.chipData_ChipGroupModuleData) : that.chipData_ChipGroupModuleData != null)) {
      return false;
    }
    if (((chipClickListener_OnChipItemClickedListener == null) != (that.chipClickListener_OnChipItemClickedListener == null))) {
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
    _result = 31 * _result + (chipData_ChipGroupModuleData != null ? chipData_ChipGroupModuleData.hashCode() : 0);
    _result = 31 * _result + (chipClickListener_OnChipItemClickedListener != null ? 1 : 0);
    return _result;
  }

  @Override
  public String toString() {
    return "ChipGroupItemViewModel_{" +
        "chipData_ChipGroupModuleData=" + chipData_ChipGroupModuleData +
        ", chipClickListener_OnChipItemClickedListener=" + chipClickListener_OnChipItemClickedListener +
        "}" + super.toString();
  }

  @Override
  public int getSpanSize(int totalSpanCount, int position, int itemCount) {
    return totalSpanCount;
  }
}
