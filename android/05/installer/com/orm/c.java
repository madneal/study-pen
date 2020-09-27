package com.orm;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.orm.b.a;
import com.orm.b.g;

public class c extends SQLiteOpenHelper {
  private final a a;
  
  private SQLiteDatabase b;
  
  public c(Context paramContext) {
    super(paramContext, a.c(paramContext), new g(a.d(paramContext)), a.a(paramContext));
    this.a = new a(paramContext);
  }
  
  public SQLiteDatabase a() { // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Landroid/database/sqlite/SQLiteDatabase;
    //   6: ifnonnull -> 17
    //   9: aload_0
    //   10: aload_0
    //   11: invokevirtual getWritableDatabase : ()Landroid/database/sqlite/SQLiteDatabase;
    //   14: putfield b : Landroid/database/sqlite/SQLiteDatabase;
    //   17: aload_0
    //   18: getfield b : Landroid/database/sqlite/SQLiteDatabase;
    //   21: astore_1
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_1
    //   25: areturn
    //   26: astore_1
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_1
    //   30: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	26	finally
    //   17	22	26	finally }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase) { this.a.a(paramSQLiteDatabase); }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) { this.a.a(paramSQLiteDatabase, paramInt1, paramInt2); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/com/orm/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */