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
public class ExpandedNewsItemViewModel_ extends EpoxyModel<ExpandedNewsItemView> implements GeneratedModel<ExpandedNewsItemView>, ExpandedNewsItemViewModelBuilder {
  private final BitSet assignedAttributes_epoxyGeneratedModel = new BitSet(1);

  private OnModelBoundListener<ExpandedNewsItemViewModel_, ExpandedNewsItemView> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<ExpandedNewsItemViewModel_, ExpandedNewsItemView> onModelUnboundListener_epoxyGeneratedModel;

  private OnModelVisibilityStateChangedListener<ExpandedNewsItemViewModel_, ExpandedNewsItemView> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

  private OnModelVisibilityChangedListener<ExpandedNewsItemViewModel_, ExpandedNewsItemView> onModelVisibilityChangedListener_epoxyGeneratedModel;

  /**
   * Bitset index: 0 */
  @NotNull
  private ExpandedNewsItemView.DiscoveryNewsModuleData news_DiscoveryNewsModuleData;

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
    if (!assignedAttributes_epoxyGeneratedModel.get(0)) {
    	throw new IllegalStateException("A value is required for setNews");
    }
  }

  @Override
  protected int getViewType() {
    return 0;
  }

  @Override
  protected ExpandedNewsItemView buildView(ViewGroup parent) {
    ExpandedNewsItemView v = new ExpandedNewsItemView(parent.getContext());
    v.setLayoutParams(new ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.MATCH_PARENT, ViewGroup.MarginLayoutParams.WRAP_CONTENT));
    return v;
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final ExpandedNewsItemView object,
      final int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void bind(final ExpandedNewsItemView object) {
    super.bind(object);
    object.setNews(news_DiscoveryNewsModuleData);
  }

  @Override
  public void bind(final ExpandedNewsItemView object, EpoxyModel previousModel) {
    if (!(previousModel instanceof ExpandedNewsItemViewModel_)) {
      bind(object);
      return;
    }
    ExpandedNewsItemViewModel_ that = (ExpandedNewsItemViewModel_) previousModel;
    super.bind(object);

    if ((news_DiscoveryNewsModuleData != null ? !news_DiscoveryNewsModuleData.equals(that.news_DiscoveryNewsModuleData) : that.news_DiscoveryNewsModuleData != null)) {
      object.setNews(news_DiscoveryNewsModuleData);
    }
  }

  @Override
  public void handlePostBind(final ExpandedNewsItemView object, int position) {
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
  public ExpandedNewsItemViewModel_ onBind(
      OnModelBoundListener<ExpandedNewsItemViewModel_, ExpandedNewsItemView> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(ExpandedNewsItemView object) {
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
  public ExpandedNewsItemViewModel_ onUnbind(
      OnModelUnboundListener<ExpandedNewsItemViewModel_, ExpandedNewsItemView> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityStateChanged(int visibilityState, final ExpandedNewsItemView object) {
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
  public ExpandedNewsItemViewModel_ onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<ExpandedNewsItemViewModel_, ExpandedNewsItemView> listener) {
    onMutation();
    this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityChanged(float percentVisibleHeight, float percentVisibleWidth,
      int visibleHeight, int visibleWidth, final ExpandedNewsItemView object) {
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
  public ExpandedNewsItemViewModel_ onVisibilityChanged(
      OnModelVisibilityChangedListener<ExpandedNewsItemViewModel_, ExpandedNewsItemView> listener) {
    onMutation();
    this.onModelVisibilityChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  /**
   * <i>Required.</i>
   *
   * @see ExpandedNewsItemView#setNews(ExpandedNewsItemView.DiscoveryNewsModuleData)
   */
  public ExpandedNewsItemViewModel_ news(
      @NotNull ExpandedNewsItemView.DiscoveryNewsModuleData news) {
    if (news == null) {
      throw new IllegalArgumentException("news cannot be null");
    }
    assignedAttributes_epoxyGeneratedModel.set(0);
    onMutation();
    this.news_DiscoveryNewsModuleData = news;
    return this;
  }

  @NotNull
  public ExpandedNewsItemView.DiscoveryNewsModuleData news() {
    return news_DiscoveryNewsModuleData;
  }

  @Override
  public ExpandedNewsItemViewModel_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public ExpandedNewsItemViewModel_ id(@Nullable Number... ids) {
    super.id(ids);
    return this;
  }

  @Override
  public ExpandedNewsItemViewModel_ id(long id1, long id2) {
    super.id(id1, id2);
    return this;
  }

  @Override
  public ExpandedNewsItemViewModel_ id(@Nullable CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public ExpandedNewsItemViewModel_ id(@Nullable CharSequence key,
      @Nullable CharSequence... otherKeys) {
    super.id(key, otherKeys);
    return this;
  }

  @Override
  public ExpandedNewsItemViewModel_ id(@Nullable CharSequence key, long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public ExpandedNewsItemViewModel_ layout(@LayoutRes int layoutRes) {
    throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
  }

  @Override
  public ExpandedNewsItemViewModel_ spanSizeOverride(
      @Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback) {
    super.spanSizeOverride(spanSizeCallback);
    return this;
  }

  @Override
  public ExpandedNewsItemViewModel_ show() {
    super.show();
    return this;
  }

  @Override
  public ExpandedNewsItemViewModel_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public ExpandedNewsItemViewModel_ hide() {
    super.hide();
    return this;
  }

  @Override
  @LayoutRes
  protected int getDefaultLayout() {
    throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
  }

  @Override
  public ExpandedNewsItemViewModel_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
    onModelVisibilityChangedListener_epoxyGeneratedModel = null;
    assignedAttributes_epoxyGeneratedModel.clear();
    this.news_DiscoveryNewsModuleData = null;
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof ExpandedNewsItemViewModel_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    ExpandedNewsItemViewModel_ that = (ExpandedNewsItemViewModel_) o;
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
    if ((news_DiscoveryNewsModuleData != null ? !news_DiscoveryNewsModuleData.equals(that.news_DiscoveryNewsModuleData) : that.news_DiscoveryNewsModuleData != null)) {
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
    _result = 31 * _result + (news_DiscoveryNewsModuleData != null ? news_DiscoveryNewsModuleData.hashCode() : 0);
    return _result;
  }

  @Override
  public String toString() {
    return "ExpandedNewsItemViewModel_{" +
        "news_DiscoveryNewsModuleData=" + news_DiscoveryNewsModuleData +
        "}" + super.toString();
  }

  @Override
  public int getSpanSize(int totalSpanCount, int position, int itemCount) {
    return totalSpanCount;
  }
}
