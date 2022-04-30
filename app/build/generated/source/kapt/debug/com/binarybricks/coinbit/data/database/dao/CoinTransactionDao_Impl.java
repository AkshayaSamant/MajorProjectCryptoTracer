package com.binarybricks.coinbit.data.database.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.binarybricks.coinbit.data.database.BigDecimalConverter;
import com.binarybricks.coinbit.data.database.entities.CoinTransaction;
import java.lang.Exception;
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
public final class CoinTransactionDao_Impl implements CoinTransactionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CoinTransaction> __insertionAdapterOfCoinTransaction;

  private final BigDecimalConverter __bigDecimalConverter = new BigDecimalConverter();

  public CoinTransactionDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCoinTransaction = new EntityInsertionAdapter<CoinTransaction>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `CoinTransaction` (`transactionType`,`coinSymbol`,`pair`,`buyprice`,`buypriceHomeCurrency`,`quantity`,`transactionTime`,`cost`,`exchange`,`exchangeFees`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CoinTransaction value) {
        stmt.bindLong(1, value.getTransactionType());
        if (value.getCoinSymbol() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCoinSymbol());
        }
        if (value.getPair() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPair());
        }
        final String _tmp;
        _tmp = __bigDecimalConverter.amountToString(value.getBuyPrice());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __bigDecimalConverter.amountToString(value.getBuypriceHomeCurrency());
        if (_tmp_1 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __bigDecimalConverter.amountToString(value.getQuantity());
        if (_tmp_2 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp_2);
        }
        if (value.getTransactionTime() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTransactionTime());
        }
        if (value.getCost() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getCost());
        }
        if (value.getExchange() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getExchange());
        }
        final String _tmp_3;
        _tmp_3 = __bigDecimalConverter.amountToString(value.getExchangeFees());
        if (_tmp_3 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp_3);
        }
        stmt.bindLong(11, value.getIdKey());
      }
    };
  }

  @Override
  public Object insertTransaction(final CoinTransaction coinTransaction,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCoinTransaction.insert(coinTransaction);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Flow<List<CoinTransaction>> getAllCoinTransaction() {
    final String _sql = "select * from cointransaction";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"cointransaction"}, new Callable<List<CoinTransaction>>() {
      @Override
      public List<CoinTransaction> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTransactionType = CursorUtil.getColumnIndexOrThrow(_cursor, "transactionType");
          final int _cursorIndexOfCoinSymbol = CursorUtil.getColumnIndexOrThrow(_cursor, "coinSymbol");
          final int _cursorIndexOfPair = CursorUtil.getColumnIndexOrThrow(_cursor, "pair");
          final int _cursorIndexOfBuyPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "buyprice");
          final int _cursorIndexOfBuypriceHomeCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "buypriceHomeCurrency");
          final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
          final int _cursorIndexOfTransactionTime = CursorUtil.getColumnIndexOrThrow(_cursor, "transactionTime");
          final int _cursorIndexOfCost = CursorUtil.getColumnIndexOrThrow(_cursor, "cost");
          final int _cursorIndexOfExchange = CursorUtil.getColumnIndexOrThrow(_cursor, "exchange");
          final int _cursorIndexOfExchangeFees = CursorUtil.getColumnIndexOrThrow(_cursor, "exchangeFees");
          final int _cursorIndexOfIdKey = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<CoinTransaction> _result = new ArrayList<CoinTransaction>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CoinTransaction _item;
            final int _tmpTransactionType;
            _tmpTransactionType = _cursor.getInt(_cursorIndexOfTransactionType);
            final String _tmpCoinSymbol;
            _tmpCoinSymbol = _cursor.getString(_cursorIndexOfCoinSymbol);
            final String _tmpPair;
            _tmpPair = _cursor.getString(_cursorIndexOfPair);
            final BigDecimal _tmpBuyPrice;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfBuyPrice);
            _tmpBuyPrice = __bigDecimalConverter.fromString(_tmp);
            final BigDecimal _tmpBuypriceHomeCurrency;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfBuypriceHomeCurrency);
            _tmpBuypriceHomeCurrency = __bigDecimalConverter.fromString(_tmp_1);
            final BigDecimal _tmpQuantity;
            final String _tmp_2;
            _tmp_2 = _cursor.getString(_cursorIndexOfQuantity);
            _tmpQuantity = __bigDecimalConverter.fromString(_tmp_2);
            final String _tmpTransactionTime;
            _tmpTransactionTime = _cursor.getString(_cursorIndexOfTransactionTime);
            final String _tmpCost;
            _tmpCost = _cursor.getString(_cursorIndexOfCost);
            final String _tmpExchange;
            _tmpExchange = _cursor.getString(_cursorIndexOfExchange);
            final BigDecimal _tmpExchangeFees;
            final String _tmp_3;
            _tmp_3 = _cursor.getString(_cursorIndexOfExchangeFees);
            _tmpExchangeFees = __bigDecimalConverter.fromString(_tmp_3);
            final long _tmpIdKey;
            _tmpIdKey = _cursor.getLong(_cursorIndexOfIdKey);
            _item = new CoinTransaction(_tmpTransactionType,_tmpCoinSymbol,_tmpPair,_tmpBuyPrice,_tmpBuypriceHomeCurrency,_tmpQuantity,_tmpTransactionTime,_tmpCost,_tmpExchange,_tmpExchangeFees,_tmpIdKey);
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
  public Flow<List<CoinTransaction>> getTransactionsForCoin(final String coinSymbol) {
    final String _sql = "SELECT * FROM cointransaction WHERE coinSymbol = ? ORDER BY transactionTime ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (coinSymbol == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, coinSymbol);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"cointransaction"}, new Callable<List<CoinTransaction>>() {
      @Override
      public List<CoinTransaction> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTransactionType = CursorUtil.getColumnIndexOrThrow(_cursor, "transactionType");
          final int _cursorIndexOfCoinSymbol = CursorUtil.getColumnIndexOrThrow(_cursor, "coinSymbol");
          final int _cursorIndexOfPair = CursorUtil.getColumnIndexOrThrow(_cursor, "pair");
          final int _cursorIndexOfBuyPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "buyprice");
          final int _cursorIndexOfBuypriceHomeCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "buypriceHomeCurrency");
          final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
          final int _cursorIndexOfTransactionTime = CursorUtil.getColumnIndexOrThrow(_cursor, "transactionTime");
          final int _cursorIndexOfCost = CursorUtil.getColumnIndexOrThrow(_cursor, "cost");
          final int _cursorIndexOfExchange = CursorUtil.getColumnIndexOrThrow(_cursor, "exchange");
          final int _cursorIndexOfExchangeFees = CursorUtil.getColumnIndexOrThrow(_cursor, "exchangeFees");
          final int _cursorIndexOfIdKey = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<CoinTransaction> _result = new ArrayList<CoinTransaction>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CoinTransaction _item;
            final int _tmpTransactionType;
            _tmpTransactionType = _cursor.getInt(_cursorIndexOfTransactionType);
            final String _tmpCoinSymbol;
            _tmpCoinSymbol = _cursor.getString(_cursorIndexOfCoinSymbol);
            final String _tmpPair;
            _tmpPair = _cursor.getString(_cursorIndexOfPair);
            final BigDecimal _tmpBuyPrice;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfBuyPrice);
            _tmpBuyPrice = __bigDecimalConverter.fromString(_tmp);
            final BigDecimal _tmpBuypriceHomeCurrency;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfBuypriceHomeCurrency);
            _tmpBuypriceHomeCurrency = __bigDecimalConverter.fromString(_tmp_1);
            final BigDecimal _tmpQuantity;
            final String _tmp_2;
            _tmp_2 = _cursor.getString(_cursorIndexOfQuantity);
            _tmpQuantity = __bigDecimalConverter.fromString(_tmp_2);
            final String _tmpTransactionTime;
            _tmpTransactionTime = _cursor.getString(_cursorIndexOfTransactionTime);
            final String _tmpCost;
            _tmpCost = _cursor.getString(_cursorIndexOfCost);
            final String _tmpExchange;
            _tmpExchange = _cursor.getString(_cursorIndexOfExchange);
            final BigDecimal _tmpExchangeFees;
            final String _tmp_3;
            _tmp_3 = _cursor.getString(_cursorIndexOfExchangeFees);
            _tmpExchangeFees = __bigDecimalConverter.fromString(_tmp_3);
            final long _tmpIdKey;
            _tmpIdKey = _cursor.getLong(_cursorIndexOfIdKey);
            _item = new CoinTransaction(_tmpTransactionType,_tmpCoinSymbol,_tmpPair,_tmpBuyPrice,_tmpBuypriceHomeCurrency,_tmpQuantity,_tmpTransactionTime,_tmpCost,_tmpExchange,_tmpExchangeFees,_tmpIdKey);
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
}
