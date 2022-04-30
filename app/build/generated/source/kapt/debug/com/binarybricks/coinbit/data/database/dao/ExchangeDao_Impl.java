package com.binarybricks.coinbit.data.database.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.binarybricks.coinbit.data.database.entities.Exchange;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ExchangeDao_Impl implements ExchangeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Exchange> __insertionAdapterOfExchange;

  public ExchangeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfExchange = new EntityInsertionAdapter<Exchange>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Exchange` (`exchangeID`,`name`,`url`,`logoUrl`,`itemType`,`internalName`,`affiliateUrl`,`country`,`orderBook`,`trades`,`recommended`,`sponsored`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Exchange value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUrl());
        }
        if (value.getLogoUrl() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getLogoUrl());
        }
        if (value.getItemType() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getItemType());
        }
        if (value.getInternalName() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getInternalName());
        }
        if (value.getAffiliateUrl() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getAffiliateUrl());
        }
        if (value.getCountry() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getCountry());
        }
        final int _tmp;
        _tmp = value.getOrderBook() ? 1 : 0;
        stmt.bindLong(9, _tmp);
        final int _tmp_1;
        _tmp_1 = value.getTrades() ? 1 : 0;
        stmt.bindLong(10, _tmp_1);
        final int _tmp_2;
        _tmp_2 = value.getRecommended() ? 1 : 0;
        stmt.bindLong(11, _tmp_2);
        final int _tmp_3;
        _tmp_3 = value.getSponsored() ? 1 : 0;
        stmt.bindLong(12, _tmp_3);
        stmt.bindLong(13, value.getIdKey());
      }
    };
  }

  @Override
  public Object insertExchanges(final List<Exchange> list, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfExchange.insert(list);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getAllExchanges(final Continuation<? super List<Exchange>> p0) {
    final String _sql = "select * from exchange";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<Exchange>>() {
      @Override
      public List<Exchange> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "exchangeID");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfLogoUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "logoUrl");
          final int _cursorIndexOfItemType = CursorUtil.getColumnIndexOrThrow(_cursor, "itemType");
          final int _cursorIndexOfInternalName = CursorUtil.getColumnIndexOrThrow(_cursor, "internalName");
          final int _cursorIndexOfAffiliateUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "affiliateUrl");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
          final int _cursorIndexOfOrderBook = CursorUtil.getColumnIndexOrThrow(_cursor, "orderBook");
          final int _cursorIndexOfTrades = CursorUtil.getColumnIndexOrThrow(_cursor, "trades");
          final int _cursorIndexOfRecommended = CursorUtil.getColumnIndexOrThrow(_cursor, "recommended");
          final int _cursorIndexOfSponsored = CursorUtil.getColumnIndexOrThrow(_cursor, "sponsored");
          final int _cursorIndexOfIdKey = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<Exchange> _result = new ArrayList<Exchange>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Exchange _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpUrl;
            _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            final String _tmpLogoUrl;
            _tmpLogoUrl = _cursor.getString(_cursorIndexOfLogoUrl);
            final String _tmpItemType;
            _tmpItemType = _cursor.getString(_cursorIndexOfItemType);
            final String _tmpInternalName;
            _tmpInternalName = _cursor.getString(_cursorIndexOfInternalName);
            final String _tmpAffiliateUrl;
            _tmpAffiliateUrl = _cursor.getString(_cursorIndexOfAffiliateUrl);
            final String _tmpCountry;
            _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
            final boolean _tmpOrderBook;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfOrderBook);
            _tmpOrderBook = _tmp != 0;
            final boolean _tmpTrades;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfTrades);
            _tmpTrades = _tmp_1 != 0;
            final boolean _tmpRecommended;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfRecommended);
            _tmpRecommended = _tmp_2 != 0;
            final boolean _tmpSponsored;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfSponsored);
            _tmpSponsored = _tmp_3 != 0;
            final long _tmpIdKey;
            _tmpIdKey = _cursor.getLong(_cursorIndexOfIdKey);
            _item = new Exchange(_tmpId,_tmpName,_tmpUrl,_tmpLogoUrl,_tmpItemType,_tmpInternalName,_tmpAffiliateUrl,_tmpCountry,_tmpOrderBook,_tmpTrades,_tmpRecommended,_tmpSponsored,_tmpIdKey);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }
}
