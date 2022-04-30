package com.binarybricks.coinbit.data.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.binarybricks.coinbit.data.database.dao.CoinTransactionDao;
import com.binarybricks.coinbit.data.database.dao.CoinTransactionDao_Impl;
import com.binarybricks.coinbit.data.database.dao.ExchangeDao;
import com.binarybricks.coinbit.data.database.dao.ExchangeDao_Impl;
import com.binarybricks.coinbit.data.database.dao.WatchedCoinDao;
import com.binarybricks.coinbit.data.database.dao.WatchedCoinDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CoinBitDatabase_Impl extends CoinBitDatabase {
  private volatile ExchangeDao _exchangeDao;

  private volatile WatchedCoinDao _watchedCoinDao;

  private volatile CoinTransactionDao _coinTransactionDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Exchange` (`exchangeID` TEXT NOT NULL, `name` TEXT NOT NULL, `url` TEXT, `logoUrl` TEXT, `itemType` TEXT, `internalName` TEXT, `affiliateUrl` TEXT, `country` TEXT, `orderBook` INTEGER NOT NULL, `trades` INTEGER NOT NULL, `recommended` INTEGER NOT NULL, `sponsored` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_Exchange_exchangeID` ON `Exchange` (`exchangeID`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `WatchedCoin` (`exchange` TEXT NOT NULL, `fromCurrency` TEXT NOT NULL, `purchaseQuantity` TEXT NOT NULL, `watched` INTEGER NOT NULL, `watched_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `coinId` TEXT NOT NULL, `url` TEXT NOT NULL, `imageUrl` TEXT, `name` TEXT NOT NULL, `symbol` TEXT NOT NULL, `coinName` TEXT NOT NULL, `fullName` TEXT NOT NULL, `algorithm` TEXT, `proofType` TEXT, `fullyPremined` TEXT, `totalCoinSupply` TEXT, `preMinedValue` TEXT, `totalCoinsFreeFloat` TEXT, `sortOrder` INTEGER, `sponsored` INTEGER NOT NULL, `isTrading` INTEGER NOT NULL, `description` TEXT, `twitter` TEXT, `website` TEXT, `reddit` TEXT, `forum` TEXT, `github` TEXT, `id` INTEGER NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_WatchedCoin_watched_id` ON `WatchedCoin` (`watched_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `CoinTransaction` (`transactionType` INTEGER NOT NULL, `coinSymbol` TEXT NOT NULL, `pair` TEXT NOT NULL, `buyprice` TEXT NOT NULL, `buypriceHomeCurrency` TEXT NOT NULL, `quantity` TEXT NOT NULL, `transactionTime` TEXT NOT NULL, `cost` TEXT NOT NULL, `exchange` TEXT NOT NULL, `exchangeFees` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_CoinTransaction_id` ON `CoinTransaction` (`id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '267022a822a516430bccb4574743715f')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Exchange`");
        _db.execSQL("DROP TABLE IF EXISTS `WatchedCoin`");
        _db.execSQL("DROP TABLE IF EXISTS `CoinTransaction`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsExchange = new HashMap<String, TableInfo.Column>(13);
        _columnsExchange.put("exchangeID", new TableInfo.Column("exchangeID", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExchange.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExchange.put("url", new TableInfo.Column("url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExchange.put("logoUrl", new TableInfo.Column("logoUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExchange.put("itemType", new TableInfo.Column("itemType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExchange.put("internalName", new TableInfo.Column("internalName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExchange.put("affiliateUrl", new TableInfo.Column("affiliateUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExchange.put("country", new TableInfo.Column("country", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExchange.put("orderBook", new TableInfo.Column("orderBook", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExchange.put("trades", new TableInfo.Column("trades", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExchange.put("recommended", new TableInfo.Column("recommended", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExchange.put("sponsored", new TableInfo.Column("sponsored", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExchange.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysExchange = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesExchange = new HashSet<TableInfo.Index>(1);
        _indicesExchange.add(new TableInfo.Index("index_Exchange_exchangeID", true, Arrays.asList("exchangeID")));
        final TableInfo _infoExchange = new TableInfo("Exchange", _columnsExchange, _foreignKeysExchange, _indicesExchange);
        final TableInfo _existingExchange = TableInfo.read(_db, "Exchange");
        if (! _infoExchange.equals(_existingExchange)) {
          return new RoomOpenHelper.ValidationResult(false, "Exchange(com.binarybricks.coinbit.data.database.entities.Exchange).\n"
                  + " Expected:\n" + _infoExchange + "\n"
                  + " Found:\n" + _existingExchange);
        }
        final HashMap<String, TableInfo.Column> _columnsWatchedCoin = new HashMap<String, TableInfo.Column>(28);
        _columnsWatchedCoin.put("exchange", new TableInfo.Column("exchange", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("fromCurrency", new TableInfo.Column("fromCurrency", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("purchaseQuantity", new TableInfo.Column("purchaseQuantity", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("watched", new TableInfo.Column("watched", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("watched_id", new TableInfo.Column("watched_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("coinId", new TableInfo.Column("coinId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("imageUrl", new TableInfo.Column("imageUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("symbol", new TableInfo.Column("symbol", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("coinName", new TableInfo.Column("coinName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("fullName", new TableInfo.Column("fullName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("algorithm", new TableInfo.Column("algorithm", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("proofType", new TableInfo.Column("proofType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("fullyPremined", new TableInfo.Column("fullyPremined", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("totalCoinSupply", new TableInfo.Column("totalCoinSupply", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("preMinedValue", new TableInfo.Column("preMinedValue", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("totalCoinsFreeFloat", new TableInfo.Column("totalCoinsFreeFloat", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("sortOrder", new TableInfo.Column("sortOrder", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("sponsored", new TableInfo.Column("sponsored", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("isTrading", new TableInfo.Column("isTrading", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("twitter", new TableInfo.Column("twitter", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("website", new TableInfo.Column("website", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("reddit", new TableInfo.Column("reddit", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("forum", new TableInfo.Column("forum", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("github", new TableInfo.Column("github", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchedCoin.put("id", new TableInfo.Column("id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWatchedCoin = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWatchedCoin = new HashSet<TableInfo.Index>(1);
        _indicesWatchedCoin.add(new TableInfo.Index("index_WatchedCoin_watched_id", true, Arrays.asList("watched_id")));
        final TableInfo _infoWatchedCoin = new TableInfo("WatchedCoin", _columnsWatchedCoin, _foreignKeysWatchedCoin, _indicesWatchedCoin);
        final TableInfo _existingWatchedCoin = TableInfo.read(_db, "WatchedCoin");
        if (! _infoWatchedCoin.equals(_existingWatchedCoin)) {
          return new RoomOpenHelper.ValidationResult(false, "WatchedCoin(com.binarybricks.coinbit.data.database.entities.WatchedCoin).\n"
                  + " Expected:\n" + _infoWatchedCoin + "\n"
                  + " Found:\n" + _existingWatchedCoin);
        }
        final HashMap<String, TableInfo.Column> _columnsCoinTransaction = new HashMap<String, TableInfo.Column>(11);
        _columnsCoinTransaction.put("transactionType", new TableInfo.Column("transactionType", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCoinTransaction.put("coinSymbol", new TableInfo.Column("coinSymbol", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCoinTransaction.put("pair", new TableInfo.Column("pair", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCoinTransaction.put("buyprice", new TableInfo.Column("buyprice", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCoinTransaction.put("buypriceHomeCurrency", new TableInfo.Column("buypriceHomeCurrency", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCoinTransaction.put("quantity", new TableInfo.Column("quantity", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCoinTransaction.put("transactionTime", new TableInfo.Column("transactionTime", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCoinTransaction.put("cost", new TableInfo.Column("cost", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCoinTransaction.put("exchange", new TableInfo.Column("exchange", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCoinTransaction.put("exchangeFees", new TableInfo.Column("exchangeFees", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCoinTransaction.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCoinTransaction = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCoinTransaction = new HashSet<TableInfo.Index>(1);
        _indicesCoinTransaction.add(new TableInfo.Index("index_CoinTransaction_id", true, Arrays.asList("id")));
        final TableInfo _infoCoinTransaction = new TableInfo("CoinTransaction", _columnsCoinTransaction, _foreignKeysCoinTransaction, _indicesCoinTransaction);
        final TableInfo _existingCoinTransaction = TableInfo.read(_db, "CoinTransaction");
        if (! _infoCoinTransaction.equals(_existingCoinTransaction)) {
          return new RoomOpenHelper.ValidationResult(false, "CoinTransaction(com.binarybricks.coinbit.data.database.entities.CoinTransaction).\n"
                  + " Expected:\n" + _infoCoinTransaction + "\n"
                  + " Found:\n" + _existingCoinTransaction);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "267022a822a516430bccb4574743715f", "226ebfd11cfa452ad74678afbca5c6b6");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Exchange","WatchedCoin","CoinTransaction");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Exchange`");
      _db.execSQL("DELETE FROM `WatchedCoin`");
      _db.execSQL("DELETE FROM `CoinTransaction`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public ExchangeDao exchangeDao() {
    if (_exchangeDao != null) {
      return _exchangeDao;
    } else {
      synchronized(this) {
        if(_exchangeDao == null) {
          _exchangeDao = new ExchangeDao_Impl(this);
        }
        return _exchangeDao;
      }
    }
  }

  @Override
  public WatchedCoinDao watchedCoinDao() {
    if (_watchedCoinDao != null) {
      return _watchedCoinDao;
    } else {
      synchronized(this) {
        if(_watchedCoinDao == null) {
          _watchedCoinDao = new WatchedCoinDao_Impl(this);
        }
        return _watchedCoinDao;
      }
    }
  }

  @Override
  public CoinTransactionDao coinTransactionDao() {
    if (_coinTransactionDao != null) {
      return _coinTransactionDao;
    } else {
      synchronized(this) {
        if(_coinTransactionDao == null) {
          _coinTransactionDao = new CoinTransactionDao_Impl(this);
        }
        return _coinTransactionDao;
      }
    }
  }
}
