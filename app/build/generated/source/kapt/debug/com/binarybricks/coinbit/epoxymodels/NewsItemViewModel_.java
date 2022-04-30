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
import java.lang.CharSequence;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import java.lang.Number;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import java.util.BitSet;
import org.jetbrains.annotations.Nullable;

/**
 * Generated file. Do not modify! */
public class NewsItemViewModel_ extends EpoxyModel<NewsItemView> implements GeneratedModel<NewsItemView>, NewsItemViewModelBuilder {
  private final BitSet assignedAttributes_epoxyGeneratedModel = new BitSet(3);

  private OnModelBoundListener<NewsItemViewModel_, NewsItemView> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<NewsItemViewModel_, NewsItemView> onModelUnboundListener_epoxyGeneratedModel;

  private OnModelVisibilityStateChangedListener<NewsItemViewModel_, NewsItemView> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

  private OnModelVisibilityChangedListener<NewsItemViewModel_, NewsItemView> onModelVisibilityChangedListener_epoxyGeneratedModel;

  /**
   * Bitset index: 0 */
  private StringAttributeData title_StringAttributeData =  new StringAttributeData();

  /**
   * Bitset index: 1 */
  private StringAttributeData newsDate_StringAttributeData =  new StringAttributeData();

  @Nullable
  private View.OnClickListener itemClickListener_OnClickListener = (View.OnClickListener) null;

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
    if (!assignedAttributes_epoxyGeneratedModel.get(0)) {
    	throw new IllegalStateException("A value is required for setTitle");
    }
    if (!assignedAttributes_epoxyGeneratedModel.get(1)) {
    	throw new IllegalStateException("A value is required for setNewsDate");
    }
  }

  @Override
  protected int getViewType() {
    return 0;
  }

  @Override
  protected NewsItemView buildView(ViewGroup parent) {
    NewsItemView v = new NewsItemView(parent.getContext());
    v.setLayoutParams(new ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.MATCH_PARENT, ViewGroup.MarginLayoutParams.WRAP_CONTENT));
    return v;
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final NewsItemView object,
      final int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void bind(final NewsItemView object) {
    super.bind(object);
    object.setItemClickListener(itemClickListener_OnClickListener);
    object.setTitle(title_StringAttributeData.toString(object.getContext()));
    object.setNewsDate(newsDate_StringAttributeData.toString(object.getContext()));
  }

  @Override
  public void bind(final NewsItemView object, EpoxyModel previousModel) {
    if (!(previousModel instanceof NewsItemViewModel_)) {
      bind(object);
      return;
    }
    NewsItemViewModel_ that = (NewsItemViewModel_) previousModel;
    super.bind(object);

    if (((itemClickListener_OnClickListener == null) != (that.itemClickListener_OnClickListener == null))) {
      object.setItemClickListener(itemClickListener_OnClickListener);
    }

    if ((title_StringAttributeData != null ? !title_StringAttributeData.equals(that.title_StringAttributeData) : that.title_StringAttributeData != null)) {
      object.setTitle(title_StringAttributeData.toString(object.getContext()));
    }

    if ((newsDate_StringAttributeData != null ? !newsDate_StringAttributeData.equals(that.newsDate_StringAttributeData) : that.newsDate_StringAttributeData != null)) {
      object.setNewsDate(newsDate_StringAttributeData.toString(object.getContext()));
    }
  }

  @Override
  public void handlePostBind(final NewsItemView object, int position) {
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
  public NewsItemViewModel_ onBind(
      OnModelBoundListener<NewsItemViewModel_, NewsItemView> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(NewsItemView object) {
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
  public NewsItemViewModel_ onUnbind(
      OnModelUnboundListener<NewsItemViewModel_, NewsItemView> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityStateChanged(int visibilityState, final NewsItemView object) {
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
  public NewsItemViewModel_ onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<NewsItemViewModel_, NewsItemView> listener) {
    onMutation();
    this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityChanged(float percentVisibleHeight, float percentVisibleWidth,
      int visibleHeight, int visibleWidth, final NewsItemView object) {
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
  public NewsItemViewModel_ onVisibilityChanged(
      OnModelVisibilityChangedListener<NewsItemViewModel_, NewsItemView> listener) {
    onMutation();
    this.onModelVisibilityChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  public CharSequence getTitle(Context context) {
    return title_StringAttributeData.toString(context);
  }

  /**
   * <i>Required.</i>
   *
   * @see NewsItemView#setTitle(CharSequence)
   */
  public NewsItemViewModel_ title(@NonNull CharSequence title) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(0);
    if (title == null) {
      throw new IllegalArgumentException("title cannot be null");
    }
    title_StringAttributeData.setValue(title);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see NewsItemView#setTitle(CharSequence)
   */
  public NewsItemViewModel_ title(@StringRes int stringRes) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(0);
    title_StringAttributeData.setValue(stringRes);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see NewsItemView#setTitle(CharSequence)
   */
  public NewsItemViewModel_ title(@StringRes int stringRes, Object... formatArgs) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(0);
    title_StringAttributeData.setValue(stringRes, formatArgs);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see NewsItemView#setTitle(CharSequence)
   */
  public NewsItemViewModel_ titleQuantityRes(@PluralsRes int pluralRes, int quantity,
      Object... formatArgs) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(0);
    title_StringAttributeData.setValue(pluralRes, quantity, formatArgs);
    return this;
  }

  public CharSequence getNewsDate(Context context) {
    return newsDate_StringAttributeData.toString(context);
  }

  /**
   * <i>Required.</i>
   *
   * @see NewsItemView#setNewsDate(CharSequence)
   */
  public NewsItemViewModel_ newsDate(@NonNull CharSequence newsDate) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(1);
    if (newsDate == null) {
      throw new IllegalArgumentException("newsDate cannot be null");
    }
    newsDate_StringAttributeData.setValue(newsDate);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see NewsItemView#setNewsDate(CharSequence)
   */
  public NewsItemViewModel_ newsDate(@StringRes int stringRes) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(1);
    newsDate_StringAttributeData.setValue(stringRes);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see NewsItemView#setNewsDate(CharSequence)
   */
  public NewsItemViewModel_ newsDate(@StringRes int stringRes, Object... formatArgs) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(1);
    newsDate_StringAttributeData.setValue(stringRes, formatArgs);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see NewsItemView#setNewsDate(CharSequence)
   */
  public NewsItemViewModel_ newsDateQuantityRes(@PluralsRes int pluralRes, int quantity,
      Object... formatArgs) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(1);
    newsDate_StringAttributeData.setValue(pluralRes, quantity, formatArgs);
    return this;
  }

  /**
   * Set a click listener that will provide the parent view, model, and adapter position of the clicked view. This will clear the normal View.OnClickListener if one has been set */
  public NewsItemViewModel_ itemClickListener(
      @Nullable final OnModelClickListener<NewsItemViewModel_, NewsItemView> itemClickListener) {
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
   * @see NewsItemView#setItemClickListener(View.OnClickListener)
   */
  public NewsItemViewModel_ itemClickListener(@Nullable View.OnClickListener itemClickListener) {
    onMutation();
    this.itemClickListener_OnClickListener = itemClickListener;
    return this;
  }

  @Nullable
  public View.OnClickListener itemClickListener() {
    return itemClickListener_OnClickListener;
  }

  @Override
  public NewsItemViewModel_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public NewsItemViewModel_ id(@androidx.annotation.Nullable Number... ids) {
    super.id(ids);
    return this;
  }

  @Override
  public NewsItemViewModel_ id(long id1, long id2) {
    super.id(id1, id2);
    return this;
  }

  @Override
  public NewsItemViewModel_ id(@androidx.annotation.Nullable CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public NewsItemViewModel_ id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys) {
    super.id(key, otherKeys);
    return this;
  }

  @Override
  public NewsItemViewModel_ id(@androidx.annotation.Nullable CharSequence key, long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public NewsItemViewModel_ layout(@LayoutRes int layoutRes) {
    throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
  }

  @Override
  public NewsItemViewModel_ spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback) {
    super.spanSizeOverride(spanSizeCallback);
    return this;
  }

  @Override
  public NewsItemViewModel_ show() {
    super.show();
    return this;
  }

  @Override
  public NewsItemViewModel_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public NewsItemViewModel_ hide() {
    super.hide();
    return this;
  }

  @Override
  @LayoutRes
  protected int getDefaultLayout() {
    throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
  }

  @Override
  public NewsItemViewModel_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
    onModelVisibilityChangedListener_epoxyGeneratedModel = null;
    assignedAttributes_epoxyGeneratedModel.clear();
    this.title_StringAttributeData =  new StringAttributeData();
    this.newsDate_StringAttributeData =  new StringAttributeData();
    this.itemClickListener_OnClickListener = (View.OnClickListener) null;
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof NewsItemViewModel_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    NewsItemViewModel_ that = (NewsItemViewModel_) o;
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
    if ((title_StringAttributeData != null ? !title_StringAttributeData.equals(that.title_StringAttributeData) : that.title_StringAttributeData != null)) {
      return false;
    }
    if ((newsDate_StringAttributeData != null ? !newsDate_StringAttributeData.equals(that.newsDate_StringAttributeData) : that.newsDate_StringAttributeData != null)) {
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
    _result = 31 * _result + (title_StringAttributeData != null ? title_StringAttributeData.hashCode() : 0);
    _result = 31 * _result + (newsDate_StringAttributeData != null ? newsDate_StringAttributeData.hashCode() : 0);
    _result = 31 * _result + (itemClickListener_OnClickListener != null ? 1 : 0);
    return _result;
  }

  @Override
  public String toString() {
    return "NewsItemViewModel_{" +
        "title_StringAttributeData=" + title_StringAttributeData +
        ", newsDate_StringAttributeData=" + newsDate_StringAttributeData +
        ", itemClickListener_OnClickListener=" + itemClickListener_OnClickListener +
        "}" + super.toString();
  }

  @Override
  public int getSpanSize(int totalSpanCount, int position, int itemCount) {
    return totalSpanCount;
  }
}
