package com.orm;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.orm.b.b;

public class d {
  private Long a = null;
  
  public static <T> long a(Class<?> paramClass) { return a(paramClass, null, null, null, null, null); }
  
  public static <T> long a(Class<?> paramClass, String paramString, String[] paramArrayOfString) { return a(paramClass, paramString, paramArrayOfString, null, null, null); }
  
  public static <T> long a(Class<?> paramClass, String paramString1, String[] paramArrayOfString, String paramString2, String paramString3, String paramString4) {
    SQLiteDatabase sQLiteDatabase = b.a().c().a();
    if (!TextUtils.isEmpty(paramString1)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(" where ");
      stringBuilder.append(paramString1);
      paramString1 = stringBuilder.toString();
    } else {
      paramString1 = "";
    } 
    try {
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("SELECT count(*) FROM ");
      stringBuilder.append(b.a(paramClass));
      stringBuilder.append(paramString1);
      sQLiteStatement = sQLiteDatabase.compileStatement(stringBuilder.toString());
      if (paramArrayOfString != null)
        for (int i = paramArrayOfString.length; i != 0; i--)
          sQLiteStatement.bindString(i, paramArrayOfString[i - 1]);  
      try {
        return sQLiteStatement.simpleQueryForLong();
      } finally {
        sQLiteStatement.close();
      } 
    } catch (SQLiteException paramClass) {
      paramClass.printStackTrace();
      return -1L;
    } 
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/com/orm/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */