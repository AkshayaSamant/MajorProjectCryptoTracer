@file:Suppress("DEPRECATION")

package com.binarybricks.coinbit.epoxymodels

import com.airbnb.epoxy.ModelCollector
import kotlin.Suppress
import kotlin.Unit

inline fun ModelCollector.addCoinItemView(modelInitializer: AddCoinItemViewModelBuilder.() ->
    Unit) {
  add(
  AddCoinItemViewModel_().apply {
    modelInitializer()
  }
  )
}

inline
    fun ModelCollector.addCoinTransactionItemView(modelInitializer: AddCoinTransactionItemViewModelBuilder.() ->
    Unit) {
  add(
  AddCoinTransactionItemViewModel_().apply {
    modelInitializer()
  }
  )
}

inline fun ModelCollector.chipGroupItemView(modelInitializer: ChipGroupItemViewModelBuilder.() ->
    Unit) {
  add(
  ChipGroupItemViewModel_().apply {
    modelInitializer()
  }
  )
}

inline fun ModelCollector.coinAboutItemView(modelInitializer: CoinAboutItemViewModelBuilder.() ->
    Unit) {
  add(
  CoinAboutItemViewModel_().apply {
    modelInitializer()
  }
  )
}

inline
    fun ModelCollector.coinHistoricalChartItemView(modelInitializer: CoinHistoricalChartItemViewModelBuilder.() ->
    Unit) {
  add(
  CoinHistoricalChartItemViewModel_().apply {
    modelInitializer()
  }
  )
}

inline fun ModelCollector.coinInfoItemView(modelInitializer: CoinInfoItemViewModelBuilder.() ->
    Unit) {
  add(
  CoinInfoItemViewModel_().apply {
    modelInitializer()
  }
  )
}

inline fun ModelCollector.coinItemView(modelInitializer: CoinItemViewModelBuilder.() -> Unit) {
  add(
  CoinItemViewModel_().apply {
    modelInitializer()
  }
  )
}

inline fun ModelCollector.coinNewsItemView(modelInitializer: CoinNewsItemViewModelBuilder.() ->
    Unit) {
  add(
  CoinNewsItemViewModel_().apply {
    modelInitializer()
  }
  )
}

inline
    fun ModelCollector.coinPositionItemView(modelInitializer: CoinPositionItemViewModelBuilder.() ->
    Unit) {
  add(
  CoinPositionItemViewModel_().apply {
    modelInitializer()
  }
  )
}

inline fun ModelCollector.coinSearchItemView(modelInitializer: CoinSearchItemViewModelBuilder.() ->
    Unit) {
  add(
  CoinSearchItemViewModel_().apply {
    modelInitializer()
  }
  )
}

inline
    fun ModelCollector.coinStatsticsItemView(modelInitializer: CoinStatsticsItemViewModelBuilder.() ->
    Unit) {
  add(
  CoinStatsticsItemViewModel_().apply {
    modelInitializer()
  }
  )
}

inline fun ModelCollector.coinTickerItemView(modelInitializer: CoinTickerItemViewModelBuilder.() ->
    Unit) {
  add(
  CoinTickerItemViewModel_().apply {
    modelInitializer()
  }
  )
}

inline fun ModelCollector.coinTickerView(modelInitializer: CoinTickerViewModelBuilder.() -> Unit) {
  add(
  CoinTickerViewModel_().apply {
    modelInitializer()
  }
  )
}

inline
    fun ModelCollector.coinTransactionHistoryItemView(modelInitializer: CoinTransactionHistoryItemViewModelBuilder.() ->
    Unit) {
  add(
  CoinTransactionHistoryItemViewModel_().apply {
    modelInitializer()
  }
  )
}

inline
    fun ModelCollector.dashboardHeaderItemView(modelInitializer: DashboardHeaderItemViewModelBuilder.() ->
    Unit) {
  add(
  DashboardHeaderItemViewModel_().apply {
    modelInitializer()
  }
  )
}

inline fun ModelCollector.emptyCoinItemView(modelInitializer: EmptyCoinItemViewModelBuilder.() ->
    Unit) {
  add(
  EmptyCoinItemViewModel_().apply {
    modelInitializer()
  }
  )
}

inline
    fun ModelCollector.exchangePairItemView(modelInitializer: ExchangePairItemViewModelBuilder.() ->
    Unit) {
  add(
  ExchangePairItemViewModel_().apply {
    modelInitializer()
  }
  )
}

inline
    fun ModelCollector.expandedNewsItemView(modelInitializer: ExpandedNewsItemViewModelBuilder.() ->
    Unit) {
  add(
  ExpandedNewsItemViewModel_().apply {
    modelInitializer()
  }
  )
}

inline
    fun ModelCollector.genericFooterItemView(modelInitializer: GenericFooterItemViewModelBuilder.() ->
    Unit) {
  add(
  GenericFooterItemViewModel_().apply {
    modelInitializer()
  }
  )
}

inline fun ModelCollector.labelItemView(modelInitializer: LabelItemViewModelBuilder.() -> Unit) {
  add(
  LabelItemViewModel_().apply {
    modelInitializer()
  }
  )
}

inline fun ModelCollector.newsItemView(modelInitializer: NewsItemViewModelBuilder.() -> Unit) {
  add(
  NewsItemViewModel_().apply {
    modelInitializer()
  }
  )
}

inline fun ModelCollector.shortNewsItemView(modelInitializer: ShortNewsItemViewModelBuilder.() ->
    Unit) {
  add(
  ShortNewsItemViewModel_().apply {
    modelInitializer()
  }
  )
}

inline fun ModelCollector.topCardItemView(modelInitializer: TopCardItemViewModelBuilder.() ->
    Unit) {
  add(
  TopCardItemViewModel_().apply {
    modelInitializer()
  }
  )
}
