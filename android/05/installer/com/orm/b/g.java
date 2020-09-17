package com.orm.b;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.util.Log;

public class g implements SQLiteDatabase.CursorFactory {
  private boolean a = false;
  
  public g() {}
  
  public g(boolean paramBoolean) {}
  
  public Cursor newCursor(SQLiteDatabase paramSQLiteDatabase, SQLiteCursorDriver paramSQLiteCursorDriver, String paramString, SQLiteQuery paramSQLiteQuery) {
    if (this.a)
      Log.d("SQL Log", paramSQLiteQuery.toString()); 
    return new SQLiteCursor(paramSQLiteDatabase, paramSQLiteCursorDriver, paramString, paramSQLiteQuery);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/com/orm/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */