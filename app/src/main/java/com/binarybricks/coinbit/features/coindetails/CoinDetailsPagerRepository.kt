package com.binarybricks.coinbit.features.coindetails

import com.binarybricks.coinbit.data.database.CoinBitDatabase
import com.binarybricks.coinbit.data.database.entities.WatchedCoin



class CoinDetailsPagerRepository(
    private val coinBitDatabase: CoinBitDatabase?
) {

    /**
     * Get list of all coins that is added in watch list
     */
    suspend fun loadWatchedCoins(): List<WatchedCoin>? {

        coinBitDatabase?.let {
            return it.watchedCoinDao().getAllWatchedCoinsOnetime()
        }
        return null
    }
}
