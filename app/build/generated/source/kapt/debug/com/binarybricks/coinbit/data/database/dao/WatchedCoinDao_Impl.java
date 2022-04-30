package com.binarybricks.coinbit.data.database.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.binarybricks.coinbit.data.database.BigDecimalConverter;
import com.binarybricks.coinbit.data.database.entities.Coin;
import com.binarybricks.coinbit.data.database.entities.WatchedCoin;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WatchedCoinDao_Impl implements WatchedCoinDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WatchedCoin> __insertionAdapterOfWatchedCoin;

  private final BigDecimalConverter __bigDecimalConverter = new BigDecimalConverter();

  private final SharedSQLiteStatement __preparedStmtOfAddPurchaseQuantityForCoin;

  private final SharedSQLiteStatement __preparedStmtOfMakeCoinWatched;

  public WatchedCoinDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWatchedCoin = new EntityInsertionAdapter<WatchedCoin>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `WatchedCoin` (`exchange`,`fromCurrency`,`purchaseQuantity`,`watched`,`watched_id`,`coinId`,`url`,`imageUrl`,`name`,`symbol`,`coinName`,`fullName`,`algorithm`,`proofType`,`fullyPremined`,`totalCoinSupply`,`preMinedValue`,`totalCoinsFreeFloat`,`sortOrder`,`sponsored`,`isTrading`,`description`,`twitter`,`website`,`reddit`,`forum`,`github`,`id`) VALUES (?,?,?,?,nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WatchedCoin value) {
        if (value.getExchange() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getExchange());
        }
        if (value.getFromCurrency() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFromCurrency());
        }
        final String _tmp;
        _tmp = __bigDecimalConverter.amountToString(value.getPurchaseQuantity());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        final int _tmp_1;
        _tmp_1 = value.getWatched() ? 1 : 0;
        stmt.bindLong(4, _tmp_1);
        stmt.bindLong(5, value.getIdKey());
        final Coin _tmpCoin = value.getCoin();
        if(_tmpCoin != null) {
          if (_tmpCoin.getId() == null) {
            stmt.bindNull(6);
          } else {
            stmt.bindString(6, _tmpCoin.getId());
          }
          if (_tmpCoin.getUrl() == null) {
            stmt.bindNull(7);
          } else {
            stmt.bindString(7, _tmpCoin.getUrl());
          }
          if (_tmpCoin.getImageUrl() == null) {
            stmt.bindNull(8);
          } else {
            stmt.bindString(8, _tmpCoin.getImageUrl());
          }
          if (_tmpCoin.getName() == null) {
            stmt.bindNull(9);
          } else {
            stmt.bindString(9, _tmpCoin.getName());
          }
          if (_tmpCoin.getSymbol() == null) {
            stmt.bindNull(10);
          } else {
            stmt.bindString(10, _tmpCoin.getSymbol());
          }
          if (_tmpCoin.getCoinName() == null) {
            stmt.bindNull(11);
          } else {
            stmt.bindString(11, _tmpCoin.getCoinName());
          }
          if (_tmpCoin.getFullName() == null) {
            stmt.bindNull(12);
          } else {
            stmt.bindString(12, _tmpCoin.getFullName());
          }
          if (_tmpCoin.getAlgorithm() == null) {
            stmt.bindNull(13);
          } else {
            stmt.bindString(13, _tmpCoin.getAlgorithm());
          }
          if (_tmpCoin.getProofType() == null) {
            stmt.bindNull(14);
          } else {
            stmt.bindString(14, _tmpCoin.getProofType());
          }
          if (_tmpCoin.getFullyPremined() == null) {
            stmt.bindNull(15);
          } else {
            stmt.bindString(15, _tmpCoin.getFullyPremined());
          }
          if (_tmpCoin.getTotalCoinSupply() == null) {
            stmt.bindNull(16);
          } else {
            stmt.bindString(16, _tmpCoin.getTotalCoinSupply());
          }
          if (_tmpCoin.getPreMinedValue() == null) {
            stmt.bindNull(17);
          } else {
            stmt.bindString(17, _tmpCoin.getPreMinedValue());
          }
          if (_tmpCoin.getTotalCoinsFreeFloat() == null) {
            stmt.bindNull(18);
          } else {
            stmt.bindString(18, _tmpCoin.getTotalCoinsFreeFloat());
          }
          if (_tmpCoin.getSortOrder() == null) {
            stmt.bindNull(19);
          } else {
            stmt.bindLong(19, _tmpCoin.getSortOrder());
          }
          final int _tmp_2;
          _tmp_2 = _tmpCoin.getSponsored() ? 1 : 0;
          stmt.bindLong(20, _tmp_2);
          final int _tmp_3;
          _tmp_3 = _tmpCoin.isTrading() ? 1 : 0;
          stmt.bindLong(21, _tmp_3);
          if (_tmpCoin.getDescription() == null) {
            stmt.bindNull(22);
          } else {
            stmt.bindString(22, _tmpCoin.getDescription());
          }
          if (_tmpCoin.getTwitter() == null) {
            stmt.bindNull(23);
          } else {
            stmt.bindString(23, _tmpCoin.getTwitter());
          }
          if (_tmpCoin.getWebsite() == null) {
            stmt.bindNull(24);
          } else {
            stmt.bindString(24, _tmpCoin.getWebsite());
          }
          if (_tmpCoin.getReddit() == null) {
            stmt.bindNull(25);
          } else {
            stmt.bindString(25, _tmpCoin.getReddit());
          }
          if (_tmpCoin.getForum() == null) {
            stmt.bindNull(26);
          } else {
            stmt.bindString(26, _tmpCoin.getForum());
          }
          if (_tmpCoin.getGithub() == null) {
            stmt.bindNull(27);
          } else {
            stmt.bindString(27, _tmpCoin.getGithub());
          }
          stmt.bindLong(28, _tmpCoin.getIdKey());
        } else {
          stmt.bindNull(6);
          stmt.bindNull(7);
          stmt.bindNull(8);
          stmt.bindNull(9);
          stmt.bindNull(10);
          stmt.bindNull(11);
          stmt.bindNull(12);
          stmt.bindNull(13);
          stmt.bindNull(14);
          stmt.bindNull(15);
          stmt.bindNull(16);
          stmt.bindNull(17);
          stmt.bindNull(18);
          stmt.bindNull(19);
          stmt.bindNull(20);
          stmt.bindNull(21);
          stmt.bindNull(22);
          stmt.bindNull(23);
          stmt.bindNull(24);
          stmt.bindNull(25);
          stmt.bindNull(26);
          stmt.bindNull(27);
          stmt.bindNull(28);
        }
      }
    };
    this.__preparedStmtOfAddPurchaseQuantityForCoin = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "update WatchedCoin set purchaseQuantity = purchaseQuantity + ? where symbol=?";
        return _query;
      }
    };
    this.__preparedStmtOfMakeCoinWatched = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE WatchedCoin SET watched = ?  WHERE coinId = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertCoinListIntoWatchList(final List<WatchedCoin> list,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfWatchedCoin.insert(list);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertCoinIntoWatchList(final WatchedCoin watchedCoin,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfWatchedCoin.insert(watchedCoin);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object addPurchaseQuantityForCoin(final BigDecimal quantity, final String symbol,
      final Continuation<? super Integer> p2) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfAddPurchaseQuantityForCoin.acquire();
        int _argIndex = 1;
        final String _tmp;
        _tmp = __bigDecimalConverter.amountToString(quantity);
        if (_tmp == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, _tmp);
        }
        _argIndex = 2;
        if (symbol == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, symbol);
        }
        __db.beginTransaction();
        try {
          final java.lang.Integer _result = _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
          __preparedStmtOfAddPurchaseQuantityForCoin.release(_stmt);
        }
      }
    }, p2);
  }

  @Override
  public Object makeCoinWatched(final boolean watched, final String coinId,
      final Continuation<? super Unit> p2) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfMakeCoinWatched.acquire();
        int _argIndex = 1;
        final int _tmp;
        _tmp = watched ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 2;
        if (coinId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, coinId);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfMakeCoinWatched.release(_stmt);
        }
      }
    }, p2);
  }

  @Override
  public Flow<List<WatchedCoin>> getAllWatchedCoins(final boolean watched) {
    final String _sql = "select * from WatchedCoin where purchaseQuantity > 0 OR watched = ? order by sortOrder";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final int _tmp;
    _tmp = watched ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"WatchedCoin"}, new Callable<List<WatchedCoin>>() {
      @Override
      public List<WatchedCoin> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfExchange = CursorUtil.getColumnIndexOrThrow(_cursor, "exchange");
          final int _cursorIndexOfFromCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "fromCurrency");
          final int _cursorIndexOfPurchaseQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "purchaseQuantity");
          final int _cursorIndexOfWatched = CursorUtil.getColumnIndexOrThrow(_cursor, "watched");
          final int _cursorIndexOfIdKey = CursorUtil.getColumnIndexOrThrow(_cursor, "watched_id");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "coinId");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfSymbol = CursorUtil.getColumnIndexOrThrow(_cursor, "symbol");
          final int _cursorIndexOfCoinName = CursorUtil.getColumnIndexOrThrow(_cursor, "coinName");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "fullName");
          final int _cursorIndexOfAlgorithm = CursorUtil.getColumnIndexOrThrow(_cursor, "algorithm");
          final int _cursorIndexOfProofType = CursorUtil.getColumnIndexOrThrow(_cursor, "proofType");
          final int _cursorIndexOfFullyPremined = CursorUtil.getColumnIndexOrThrow(_cursor, "fullyPremined");
          final int _cursorIndexOfTotalCoinSupply = CursorUtil.getColumnIndexOrThrow(_cursor, "totalCoinSupply");
          final int _cursorIndexOfPreMinedValue = CursorUtil.getColumnIndexOrThrow(_cursor, "preMinedValue");
          final int _cursorIndexOfTotalCoinsFreeFloat = CursorUtil.getColumnIndexOrThrow(_cursor, "totalCoinsFreeFloat");
          final int _cursorIndexOfSortOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "sortOrder");
          final int _cursorIndexOfSponsored = CursorUtil.getColumnIndexOrThrow(_cursor, "sponsored");
          final int _cursorIndexOfIsTrading = CursorUtil.getColumnIndexOrThrow(_cursor, "isTrading");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfTwitter = CursorUtil.getColumnIndexOrThrow(_cursor, "twitter");
          final int _cursorIndexOfWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "website");
          final int _cursorIndexOfReddit = CursorUtil.getColumnIndexOrThrow(_cursor, "reddit");
          final int _cursorIndexOfForum = CursorUtil.getColumnIndexOrThrow(_cursor, "forum");
          final int _cursorIndexOfGithub = CursorUtil.getColumnIndexOrThrow(_cursor, "github");
          final int _cursorIndexOfIdKey_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<WatchedCoin> _result = new ArrayList<WatchedCoin>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final WatchedCoin _item;
            final String _tmpExchange;
            _tmpExchange = _cursor.getString(_cursorIndexOfExchange);
            final String _tmpFromCurrency;
            _tmpFromCurrency = _cursor.getString(_cursorIndexOfFromCurrency);
            final BigDecimal _tmpPurchaseQuantity;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfPurchaseQuantity);
            _tmpPurchaseQuantity = __bigDecimalConverter.fromString(_tmp_1);
            final boolean _tmpWatched;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfWatched);
            _tmpWatched = _tmp_2 != 0;
            final long _tmpIdKey;
            _tmpIdKey = _cursor.getLong(_cursorIndexOfIdKey);
            final Coin _tmpCoin;
            if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfUrl) && _cursor.isNull(_cursorIndexOfImageUrl) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfSymbol) && _cursor.isNull(_cursorIndexOfCoinName) && _cursor.isNull(_cursorIndexOfFullName) && _cursor.isNull(_cursorIndexOfAlgorithm) && _cursor.isNull(_cursorIndexOfProofType) && _cursor.isNull(_cursorIndexOfFullyPremined) && _cursor.isNull(_cursorIndexOfTotalCoinSupply) && _cursor.isNull(_cursorIndexOfPreMinedValue) && _cursor.isNull(_cursorIndexOfTotalCoinsFreeFloat) && _cursor.isNull(_cursorIndexOfSortOrder) && _cursor.isNull(_cursorIndexOfSponsored) && _cursor.isNull(_cursorIndexOfIsTrading) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfTwitter) && _cursor.isNull(_cursorIndexOfWebsite) && _cursor.isNull(_cursorIndexOfReddit) && _cursor.isNull(_cursorIndexOfForum) && _cursor.isNull(_cursorIndexOfGithub) && _cursor.isNull(_cursorIndexOfIdKey_1))) {
              final String _tmpId;
              _tmpId = _cursor.getString(_cursorIndexOfId);
              final String _tmpUrl;
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
              final String _tmpImageUrl;
              _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
              final String _tmpName;
              _tmpName = _cursor.getString(_cursorIndexOfName);
              final String _tmpSymbol;
              _tmpSymbol = _cursor.getString(_cursorIndexOfSymbol);
              final String _tmpCoinName;
              _tmpCoinName = _cursor.getString(_cursorIndexOfCoinName);
              final String _tmpFullName;
              _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
              final String _tmpAlgorithm;
              _tmpAlgorithm = _cursor.getString(_cursorIndexOfAlgorithm);
              final String _tmpProofType;
              _tmpProofType = _cursor.getString(_cursorIndexOfProofType);
              final String _tmpFullyPremined;
              _tmpFullyPremined = _cursor.getString(_cursorIndexOfFullyPremined);
              final String _tmpTotalCoinSupply;
              _tmpTotalCoinSupply = _cursor.getString(_cursorIndexOfTotalCoinSupply);
              final String _tmpPreMinedValue;
              _tmpPreMinedValue = _cursor.getString(_cursorIndexOfPreMinedValue);
              final String _tmpTotalCoinsFreeFloat;
              _tmpTotalCoinsFreeFloat = _cursor.getString(_cursorIndexOfTotalCoinsFreeFloat);
              final Integer _tmpSortOrder;
              if (_cursor.isNull(_cursorIndexOfSortOrder)) {
                _tmpSortOrder = null;
              } else {
                _tmpSortOrder = _cursor.getInt(_cursorIndexOfSortOrder);
              }
              final boolean _tmpSponsored;
              final int _tmp_3;
              _tmp_3 = _cursor.getInt(_cursorIndexOfSponsored);
              _tmpSponsored = _tmp_3 != 0;
              final boolean _tmpIsTrading;
              final int _tmp_4;
              _tmp_4 = _cursor.getInt(_cursorIndexOfIsTrading);
              _tmpIsTrading = _tmp_4 != 0;
              final String _tmpDescription;
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
              final String _tmpTwitter;
              _tmpTwitter = _cursor.getString(_cursorIndexOfTwitter);
              final String _tmpWebsite;
              _tmpWebsite = _cursor.getString(_cursorIndexOfWebsite);
              final String _tmpReddit;
              _tmpReddit = _cursor.getString(_cursorIndexOfReddit);
              final String _tmpForum;
              _tmpForum = _cursor.getString(_cursorIndexOfForum);
              final String _tmpGithub;
              _tmpGithub = _cursor.getString(_cursorIndexOfGithub);
              final long _tmpIdKey_1;
              _tmpIdKey_1 = _cursor.getLong(_cursorIndexOfIdKey_1);
              _tmpCoin = new Coin(_tmpId,_tmpUrl,_tmpImageUrl,_tmpName,_tmpSymbol,_tmpCoinName,_tmpFullName,_tmpAlgorithm,_tmpProofType,_tmpFullyPremined,_tmpTotalCoinSupply,_tmpPreMinedValue,_tmpTotalCoinsFreeFloat,_tmpSortOrder,_tmpSponsored,_tmpIsTrading,_tmpDescription,_tmpTwitter,_tmpWebsite,_tmpReddit,_tmpForum,_tmpGithub,_tmpIdKey_1);
            }  else  {
              _tmpCoin = null;
            }
            _item = new WatchedCoin(_tmpCoin,_tmpExchange,_tmpFromCurrency,_tmpPurchaseQuantity,_tmpWatched,_tmpIdKey);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getAllWatchedCoinsOnetime(final boolean watched,
      final Continuation<? super List<WatchedCoin>> p1) {
    final String _sql = "select * from WatchedCoin where purchaseQuantity > 0 OR watched = ? order by sortOrder";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final int _tmp;
    _tmp = watched ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp);
    return CoroutinesRoom.execute(__db, false, new Callable<List<WatchedCoin>>() {
      @Override
      public List<WatchedCoin> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfExchange = CursorUtil.getColumnIndexOrThrow(_cursor, "exchange");
          final int _cursorIndexOfFromCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "fromCurrency");
          final int _cursorIndexOfPurchaseQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "purchaseQuantity");
          final int _cursorIndexOfWatched = CursorUtil.getColumnIndexOrThrow(_cursor, "watched");
          final int _cursorIndexOfIdKey = CursorUtil.getColumnIndexOrThrow(_cursor, "watched_id");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "coinId");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfSymbol = CursorUtil.getColumnIndexOrThrow(_cursor, "symbol");
          final int _cursorIndexOfCoinName = CursorUtil.getColumnIndexOrThrow(_cursor, "coinName");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "fullName");
          final int _cursorIndexOfAlgorithm = CursorUtil.getColumnIndexOrThrow(_cursor, "algorithm");
          final int _cursorIndexOfProofType = CursorUtil.getColumnIndexOrThrow(_cursor, "proofType");
          final int _cursorIndexOfFullyPremined = CursorUtil.getColumnIndexOrThrow(_cursor, "fullyPremined");
          final int _cursorIndexOfTotalCoinSupply = CursorUtil.getColumnIndexOrThrow(_cursor, "totalCoinSupply");
          final int _cursorIndexOfPreMinedValue = CursorUtil.getColumnIndexOrThrow(_cursor, "preMinedValue");
          final int _cursorIndexOfTotalCoinsFreeFloat = CursorUtil.getColumnIndexOrThrow(_cursor, "totalCoinsFreeFloat");
          final int _cursorIndexOfSortOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "sortOrder");
          final int _cursorIndexOfSponsored = CursorUtil.getColumnIndexOrThrow(_cursor, "sponsored");
          final int _cursorIndexOfIsTrading = CursorUtil.getColumnIndexOrThrow(_cursor, "isTrading");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfTwitter = CursorUtil.getColumnIndexOrThrow(_cursor, "twitter");
          final int _cursorIndexOfWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "website");
          final int _cursorIndexOfReddit = CursorUtil.getColumnIndexOrThrow(_cursor, "reddit");
          final int _cursorIndexOfForum = CursorUtil.getColumnIndexOrThrow(_cursor, "forum");
          final int _cursorIndexOfGithub = CursorUtil.getColumnIndexOrThrow(_cursor, "github");
          final int _cursorIndexOfIdKey_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<WatchedCoin> _result = new ArrayList<WatchedCoin>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final WatchedCoin _item;
            final String _tmpExchange;
            _tmpExchange = _cursor.getString(_cursorIndexOfExchange);
            final String _tmpFromCurrency;
            _tmpFromCurrency = _cursor.getString(_cursorIndexOfFromCurrency);
            final BigDecimal _tmpPurchaseQuantity;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfPurchaseQuantity);
            _tmpPurchaseQuantity = __bigDecimalConverter.fromString(_tmp_1);
            final boolean _tmpWatched;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfWatched);
            _tmpWatched = _tmp_2 != 0;
            final long _tmpIdKey;
            _tmpIdKey = _cursor.getLong(_cursorIndexOfIdKey);
            final Coin _tmpCoin;
            if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfUrl) && _cursor.isNull(_cursorIndexOfImageUrl) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfSymbol) && _cursor.isNull(_cursorIndexOfCoinName) && _cursor.isNull(_cursorIndexOfFullName) && _cursor.isNull(_cursorIndexOfAlgorithm) && _cursor.isNull(_cursorIndexOfProofType) && _cursor.isNull(_cursorIndexOfFullyPremined) && _cursor.isNull(_cursorIndexOfTotalCoinSupply) && _cursor.isNull(_cursorIndexOfPreMinedValue) && _cursor.isNull(_cursorIndexOfTotalCoinsFreeFloat) && _cursor.isNull(_cursorIndexOfSortOrder) && _cursor.isNull(_cursorIndexOfSponsored) && _cursor.isNull(_cursorIndexOfIsTrading) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfTwitter) && _cursor.isNull(_cursorIndexOfWebsite) && _cursor.isNull(_cursorIndexOfReddit) && _cursor.isNull(_cursorIndexOfForum) && _cursor.isNull(_cursorIndexOfGithub) && _cursor.isNull(_cursorIndexOfIdKey_1))) {
              final String _tmpId;
              _tmpId = _cursor.getString(_cursorIndexOfId);
              final String _tmpUrl;
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
              final String _tmpImageUrl;
              _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
              final String _tmpName;
              _tmpName = _cursor.getString(_cursorIndexOfName);
              final String _tmpSymbol;
              _tmpSymbol = _cursor.getString(_cursorIndexOfSymbol);
              final String _tmpCoinName;
              _tmpCoinName = _cursor.getString(_cursorIndexOfCoinName);
              final String _tmpFullName;
              _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
              final String _tmpAlgorithm;
              _tmpAlgorithm = _cursor.getString(_cursorIndexOfAlgorithm);
              final String _tmpProofType;
              _tmpProofType = _cursor.getString(_cursorIndexOfProofType);
              final String _tmpFullyPremined;
              _tmpFullyPremined = _cursor.getString(_cursorIndexOfFullyPremined);
              final String _tmpTotalCoinSupply;
              _tmpTotalCoinSupply = _cursor.getString(_cursorIndexOfTotalCoinSupply);
              final String _tmpPreMinedValue;
              _tmpPreMinedValue = _cursor.getString(_cursorIndexOfPreMinedValue);
              final String _tmpTotalCoinsFreeFloat;
              _tmpTotalCoinsFreeFloat = _cursor.getString(_cursorIndexOfTotalCoinsFreeFloat);
              final Integer _tmpSortOrder;
              if (_cursor.isNull(_cursorIndexOfSortOrder)) {
                _tmpSortOrder = null;
              } else {
                _tmpSortOrder = _cursor.getInt(_cursorIndexOfSortOrder);
              }
              final boolean _tmpSponsored;
              final int _tmp_3;
              _tmp_3 = _cursor.getInt(_cursorIndexOfSponsored);
              _tmpSponsored = _tmp_3 != 0;
              final boolean _tmpIsTrading;
              final int _tmp_4;
              _tmp_4 = _cursor.getInt(_cursorIndexOfIsTrading);
              _tmpIsTrading = _tmp_4 != 0;
              final String _tmpDescription;
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
              final String _tmpTwitter;
              _tmpTwitter = _cursor.getString(_cursorIndexOfTwitter);
              final String _tmpWebsite;
              _tmpWebsite = _cursor.getString(_cursorIndexOfWebsite);
              final String _tmpReddit;
              _tmpReddit = _cursor.getString(_cursorIndexOfReddit);
              final String _tmpForum;
              _tmpForum = _cursor.getString(_cursorIndexOfForum);
              final String _tmpGithub;
              _tmpGithub = _cursor.getString(_cursorIndexOfGithub);
              final long _tmpIdKey_1;
              _tmpIdKey_1 = _cursor.getLong(_cursorIndexOfIdKey_1);
              _tmpCoin = new Coin(_tmpId,_tmpUrl,_tmpImageUrl,_tmpName,_tmpSymbol,_tmpCoinName,_tmpFullName,_tmpAlgorithm,_tmpProofType,_tmpFullyPremined,_tmpTotalCoinSupply,_tmpPreMinedValue,_tmpTotalCoinsFreeFloat,_tmpSortOrder,_tmpSponsored,_tmpIsTrading,_tmpDescription,_tmpTwitter,_tmpWebsite,_tmpReddit,_tmpForum,_tmpGithub,_tmpIdKey_1);
            }  else  {
              _tmpCoin = null;
            }
            _item = new WatchedCoin(_tmpCoin,_tmpExchange,_tmpFromCurrency,_tmpPurchaseQuantity,_tmpWatched,_tmpIdKey);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public Flow<List<WatchedCoin>> getAllCoins(final boolean isTrue) {
    final String _sql = "select * from WatchedCoin where isTrading = ? order by sortOrder";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final int _tmp;
    _tmp = isTrue ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"WatchedCoin"}, new Callable<List<WatchedCoin>>() {
      @Override
      public List<WatchedCoin> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfExchange = CursorUtil.getColumnIndexOrThrow(_cursor, "exchange");
          final int _cursorIndexOfFromCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "fromCurrency");
          final int _cursorIndexOfPurchaseQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "purchaseQuantity");
          final int _cursorIndexOfWatched = CursorUtil.getColumnIndexOrThrow(_cursor, "watched");
          final int _cursorIndexOfIdKey = CursorUtil.getColumnIndexOrThrow(_cursor, "watched_id");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "coinId");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfSymbol = CursorUtil.getColumnIndexOrThrow(_cursor, "symbol");
          final int _cursorIndexOfCoinName = CursorUtil.getColumnIndexOrThrow(_cursor, "coinName");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "fullName");
          final int _cursorIndexOfAlgorithm = CursorUtil.getColumnIndexOrThrow(_cursor, "algorithm");
          final int _cursorIndexOfProofType = CursorUtil.getColumnIndexOrThrow(_cursor, "proofType");
          final int _cursorIndexOfFullyPremined = CursorUtil.getColumnIndexOrThrow(_cursor, "fullyPremined");
          final int _cursorIndexOfTotalCoinSupply = CursorUtil.getColumnIndexOrThrow(_cursor, "totalCoinSupply");
          final int _cursorIndexOfPreMinedValue = CursorUtil.getColumnIndexOrThrow(_cursor, "preMinedValue");
          final int _cursorIndexOfTotalCoinsFreeFloat = CursorUtil.getColumnIndexOrThrow(_cursor, "totalCoinsFreeFloat");
          final int _cursorIndexOfSortOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "sortOrder");
          final int _cursorIndexOfSponsored = CursorUtil.getColumnIndexOrThrow(_cursor, "sponsored");
          final int _cursorIndexOfIsTrading = CursorUtil.getColumnIndexOrThrow(_cursor, "isTrading");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfTwitter = CursorUtil.getColumnIndexOrThrow(_cursor, "twitter");
          final int _cursorIndexOfWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "website");
          final int _cursorIndexOfReddit = CursorUtil.getColumnIndexOrThrow(_cursor, "reddit");
          final int _cursorIndexOfForum = CursorUtil.getColumnIndexOrThrow(_cursor, "forum");
          final int _cursorIndexOfGithub = CursorUtil.getColumnIndexOrThrow(_cursor, "github");
          final int _cursorIndexOfIdKey_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<WatchedCoin> _result = new ArrayList<WatchedCoin>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final WatchedCoin _item;
            final String _tmpExchange;
            _tmpExchange = _cursor.getString(_cursorIndexOfExchange);
            final String _tmpFromCurrency;
            _tmpFromCurrency = _cursor.getString(_cursorIndexOfFromCurrency);
            final BigDecimal _tmpPurchaseQuantity;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfPurchaseQuantity);
            _tmpPurchaseQuantity = __bigDecimalConverter.fromString(_tmp_1);
            final boolean _tmpWatched;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfWatched);
            _tmpWatched = _tmp_2 != 0;
            final long _tmpIdKey;
            _tmpIdKey = _cursor.getLong(_cursorIndexOfIdKey);
            final Coin _tmpCoin;
            if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfUrl) && _cursor.isNull(_cursorIndexOfImageUrl) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfSymbol) && _cursor.isNull(_cursorIndexOfCoinName) && _cursor.isNull(_cursorIndexOfFullName) && _cursor.isNull(_cursorIndexOfAlgorithm) && _cursor.isNull(_cursorIndexOfProofType) && _cursor.isNull(_cursorIndexOfFullyPremined) && _cursor.isNull(_cursorIndexOfTotalCoinSupply) && _cursor.isNull(_cursorIndexOfPreMinedValue) && _cursor.isNull(_cursorIndexOfTotalCoinsFreeFloat) && _cursor.isNull(_cursorIndexOfSortOrder) && _cursor.isNull(_cursorIndexOfSponsored) && _cursor.isNull(_cursorIndexOfIsTrading) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfTwitter) && _cursor.isNull(_cursorIndexOfWebsite) && _cursor.isNull(_cursorIndexOfReddit) && _cursor.isNull(_cursorIndexOfForum) && _cursor.isNull(_cursorIndexOfGithub) && _cursor.isNull(_cursorIndexOfIdKey_1))) {
              final String _tmpId;
              _tmpId = _cursor.getString(_cursorIndexOfId);
              final String _tmpUrl;
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
              final String _tmpImageUrl;
              _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
              final String _tmpName;
              _tmpName = _cursor.getString(_cursorIndexOfName);
              final String _tmpSymbol;
              _tmpSymbol = _cursor.getString(_cursorIndexOfSymbol);
              final String _tmpCoinName;
              _tmpCoinName = _cursor.getString(_cursorIndexOfCoinName);
              final String _tmpFullName;
              _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
              final String _tmpAlgorithm;
              _tmpAlgorithm = _cursor.getString(_cursorIndexOfAlgorithm);
              final String _tmpProofType;
              _tmpProofType = _cursor.getString(_cursorIndexOfProofType);
              final String _tmpFullyPremined;
              _tmpFullyPremined = _cursor.getString(_cursorIndexOfFullyPremined);
              final String _tmpTotalCoinSupply;
              _tmpTotalCoinSupply = _cursor.getString(_cursorIndexOfTotalCoinSupply);
              final String _tmpPreMinedValue;
              _tmpPreMinedValue = _cursor.getString(_cursorIndexOfPreMinedValue);
              final String _tmpTotalCoinsFreeFloat;
              _tmpTotalCoinsFreeFloat = _cursor.getString(_cursorIndexOfTotalCoinsFreeFloat);
              final Integer _tmpSortOrder;
              if (_cursor.isNull(_cursorIndexOfSortOrder)) {
                _tmpSortOrder = null;
              } else {
                _tmpSortOrder = _cursor.getInt(_cursorIndexOfSortOrder);
              }
              final boolean _tmpSponsored;
              final int _tmp_3;
              _tmp_3 = _cursor.getInt(_cursorIndexOfSponsored);
              _tmpSponsored = _tmp_3 != 0;
              final boolean _tmpIsTrading;
              final int _tmp_4;
              _tmp_4 = _cursor.getInt(_cursorIndexOfIsTrading);
              _tmpIsTrading = _tmp_4 != 0;
              final String _tmpDescription;
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
              final String _tmpTwitter;
              _tmpTwitter = _cursor.getString(_cursorIndexOfTwitter);
              final String _tmpWebsite;
              _tmpWebsite = _cursor.getString(_cursorIndexOfWebsite);
              final String _tmpReddit;
              _tmpReddit = _cursor.getString(_cursorIndexOfReddit);
              final String _tmpForum;
              _tmpForum = _cursor.getString(_cursorIndexOfForum);
              final String _tmpGithub;
              _tmpGithub = _cursor.getString(_cursorIndexOfGithub);
              final long _tmpIdKey_1;
              _tmpIdKey_1 = _cursor.getLong(_cursorIndexOfIdKey_1);
              _tmpCoin = new Coin(_tmpId,_tmpUrl,_tmpImageUrl,_tmpName,_tmpSymbol,_tmpCoinName,_tmpFullName,_tmpAlgorithm,_tmpProofType,_tmpFullyPremined,_tmpTotalCoinSupply,_tmpPreMinedValue,_tmpTotalCoinsFreeFloat,_tmpSortOrder,_tmpSponsored,_tmpIsTrading,_tmpDescription,_tmpTwitter,_tmpWebsite,_tmpReddit,_tmpForum,_tmpGithub,_tmpIdKey_1);
            }  else  {
              _tmpCoin = null;
            }
            _item = new WatchedCoin(_tmpCoin,_tmpExchange,_tmpFromCurrency,_tmpPurchaseQuantity,_tmpWatched,_tmpIdKey);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getSingleWatchedCoin(final String symbol,
      final Continuation<? super List<WatchedCoin>> p1) {
    final String _sql = "select * from WatchedCoin where symbol = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (symbol == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, symbol);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<List<WatchedCoin>>() {
      @Override
      public List<WatchedCoin> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfExchange = CursorUtil.getColumnIndexOrThrow(_cursor, "exchange");
          final int _cursorIndexOfFromCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "fromCurrency");
          final int _cursorIndexOfPurchaseQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "purchaseQuantity");
          final int _cursorIndexOfWatched = CursorUtil.getColumnIndexOrThrow(_cursor, "watched");
          final int _cursorIndexOfIdKey = CursorUtil.getColumnIndexOrThrow(_cursor, "watched_id");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "coinId");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfSymbol = CursorUtil.getColumnIndexOrThrow(_cursor, "symbol");
          final int _cursorIndexOfCoinName = CursorUtil.getColumnIndexOrThrow(_cursor, "coinName");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "fullName");
          final int _cursorIndexOfAlgorithm = CursorUtil.getColumnIndexOrThrow(_cursor, "algorithm");
          final int _cursorIndexOfProofType = CursorUtil.getColumnIndexOrThrow(_cursor, "proofType");
          final int _cursorIndexOfFullyPremined = CursorUtil.getColumnIndexOrThrow(_cursor, "fullyPremined");
          final int _cursorIndexOfTotalCoinSupply = CursorUtil.getColumnIndexOrThrow(_cursor, "totalCoinSupply");
          final int _cursorIndexOfPreMinedValue = CursorUtil.getColumnIndexOrThrow(_cursor, "preMinedValue");
          final int _cursorIndexOfTotalCoinsFreeFloat = CursorUtil.getColumnIndexOrThrow(_cursor, "totalCoinsFreeFloat");
          final int _cursorIndexOfSortOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "sortOrder");
          final int _cursorIndexOfSponsored = CursorUtil.getColumnIndexOrThrow(_cursor, "sponsored");
          final int _cursorIndexOfIsTrading = CursorUtil.getColumnIndexOrThrow(_cursor, "isTrading");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfTwitter = CursorUtil.getColumnIndexOrThrow(_cursor, "twitter");
          final int _cursorIndexOfWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "website");
          final int _cursorIndexOfReddit = CursorUtil.getColumnIndexOrThrow(_cursor, "reddit");
          final int _cursorIndexOfForum = CursorUtil.getColumnIndexOrThrow(_cursor, "forum");
          final int _cursorIndexOfGithub = CursorUtil.getColumnIndexOrThrow(_cursor, "github");
          final int _cursorIndexOfIdKey_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<WatchedCoin> _result = new ArrayList<WatchedCoin>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final WatchedCoin _item;
            final String _tmpExchange;
            _tmpExchange = _cursor.getString(_cursorIndexOfExchange);
            final String _tmpFromCurrency;
            _tmpFromCurrency = _cursor.getString(_cursorIndexOfFromCurrency);
            final BigDecimal _tmpPurchaseQuantity;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfPurchaseQuantity);
            _tmpPurchaseQuantity = __bigDecimalConverter.fromString(_tmp);
            final boolean _tmpWatched;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfWatched);
            _tmpWatched = _tmp_1 != 0;
            final long _tmpIdKey;
            _tmpIdKey = _cursor.getLong(_cursorIndexOfIdKey);
            final Coin _tmpCoin;
            if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfUrl) && _cursor.isNull(_cursorIndexOfImageUrl) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfSymbol) && _cursor.isNull(_cursorIndexOfCoinName) && _cursor.isNull(_cursorIndexOfFullName) && _cursor.isNull(_cursorIndexOfAlgorithm) && _cursor.isNull(_cursorIndexOfProofType) && _cursor.isNull(_cursorIndexOfFullyPremined) && _cursor.isNull(_cursorIndexOfTotalCoinSupply) && _cursor.isNull(_cursorIndexOfPreMinedValue) && _cursor.isNull(_cursorIndexOfTotalCoinsFreeFloat) && _cursor.isNull(_cursorIndexOfSortOrder) && _cursor.isNull(_cursorIndexOfSponsored) && _cursor.isNull(_cursorIndexOfIsTrading) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfTwitter) && _cursor.isNull(_cursorIndexOfWebsite) && _cursor.isNull(_cursorIndexOfReddit) && _cursor.isNull(_cursorIndexOfForum) && _cursor.isNull(_cursorIndexOfGithub) && _cursor.isNull(_cursorIndexOfIdKey_1))) {
              final String _tmpId;
              _tmpId = _cursor.getString(_cursorIndexOfId);
              final String _tmpUrl;
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
              final String _tmpImageUrl;
              _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
              final String _tmpName;
              _tmpName = _cursor.getString(_cursorIndexOfName);
              final String _tmpSymbol;
              _tmpSymbol = _cursor.getString(_cursorIndexOfSymbol);
              final String _tmpCoinName;
              _tmpCoinName = _cursor.getString(_cursorIndexOfCoinName);
              final String _tmpFullName;
              _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
              final String _tmpAlgorithm;
              _tmpAlgorithm = _cursor.getString(_cursorIndexOfAlgorithm);
              final String _tmpProofType;
              _tmpProofType = _cursor.getString(_cursorIndexOfProofType);
              final String _tmpFullyPremined;
              _tmpFullyPremined = _cursor.getString(_cursorIndexOfFullyPremined);
              final String _tmpTotalCoinSupply;
              _tmpTotalCoinSupply = _cursor.getString(_cursorIndexOfTotalCoinSupply);
              final String _tmpPreMinedValue;
              _tmpPreMinedValue = _cursor.getString(_cursorIndexOfPreMinedValue);
              final String _tmpTotalCoinsFreeFloat;
              _tmpTotalCoinsFreeFloat = _cursor.getString(_cursorIndexOfTotalCoinsFreeFloat);
              final Integer _tmpSortOrder;
              if (_cursor.isNull(_cursorIndexOfSortOrder)) {
                _tmpSortOrder = null;
              } else {
                _tmpSortOrder = _cursor.getInt(_cursorIndexOfSortOrder);
              }
              final boolean _tmpSponsored;
              final int _tmp_2;
              _tmp_2 = _cursor.getInt(_cursorIndexOfSponsored);
              _tmpSponsored = _tmp_2 != 0;
              final boolean _tmpIsTrading;
              final int _tmp_3;
              _tmp_3 = _cursor.getInt(_cursorIndexOfIsTrading);
              _tmpIsTrading = _tmp_3 != 0;
              final String _tmpDescription;
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
              final String _tmpTwitter;
              _tmpTwitter = _cursor.getString(_cursorIndexOfTwitter);
              final String _tmpWebsite;
              _tmpWebsite = _cursor.getString(_cursorIndexOfWebsite);
              final String _tmpReddit;
              _tmpReddit = _cursor.getString(_cursorIndexOfReddit);
              final String _tmpForum;
              _tmpForum = _cursor.getString(_cursorIndexOfForum);
              final String _tmpGithub;
              _tmpGithub = _cursor.getString(_cursorIndexOfGithub);
              final long _tmpIdKey_1;
              _tmpIdKey_1 = _cursor.getLong(_cursorIndexOfIdKey_1);
              _tmpCoin = new Coin(_tmpId,_tmpUrl,_tmpImageUrl,_tmpName,_tmpSymbol,_tmpCoinName,_tmpFullName,_tmpAlgorithm,_tmpProofType,_tmpFullyPremined,_tmpTotalCoinSupply,_tmpPreMinedValue,_tmpTotalCoinsFreeFloat,_tmpSortOrder,_tmpSponsored,_tmpIsTrading,_tmpDescription,_tmpTwitter,_tmpWebsite,_tmpReddit,_tmpForum,_tmpGithub,_tmpIdKey_1);
            }  else  {
              _tmpCoin = null;
            }
            _item = new WatchedCoin(_tmpCoin,_tmpExchange,_tmpFromCurrency,_tmpPurchaseQuantity,_tmpWatched,_tmpIdKey);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }
}
