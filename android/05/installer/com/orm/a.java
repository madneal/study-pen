package com.orm;

import android.content.Context;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.orm.a.a;
import com.orm.b.b;
import com.orm.b.c;
import com.orm.b.d;
import com.orm.b.e;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class a {
  private Context a;
  
  public a(Context paramContext) { this.a = paramContext; }
  
  private void a(SQLiteDatabase paramSQLiteDatabase, String paramString) {
    try {
      AssetManager assetManager = this.a.getAssets();
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("sugar_upgrades/");
      stringBuilder.append(paramString);
      InputStream inputStream = assetManager.open(stringBuilder.toString());
      BufferedReader bufferedReader = new BufferedReader();
      InputStreamReader inputStreamReader = new InputStreamReader();
      this(inputStream);
      this(inputStreamReader);
      while (true) {
        String str = bufferedReader.readLine();
        if (str != null) {
          Log.i("Sugar script", str);
          paramSQLiteDatabase.execSQL(str.toString());
          continue;
        } 
        break;
      } 
    } catch (IOException paramSQLiteDatabase) {
      Log.e("Sugar", paramSQLiteDatabase.getMessage());
    } 
    Log.i("Sugar", "Script executed");
  }
  
  private void a(Class<?> paramClass, SQLiteDatabase paramSQLiteDatabase) {
    Log.i("Sugar", "Create table");
    List list = e.a(paramClass);
    String str = b.a(paramClass);
    stringBuilder1 = new StringBuilder("CREATE TABLE ");
    stringBuilder1.append(str);
    stringBuilder1.append(" ( ID INTEGER PRIMARY KEY AUTOINCREMENT ");
    for (a a1 : list) {
      String str2 = b.a(a1);
      String str1 = d.a(a1.getType());
      if (str1 == null || str2.equalsIgnoreCase("Id"))
        continue; 
      if (a1.isAnnotationPresent(a.class)) {
        a1 = (a)a1.getAnnotation(a.class);
        str2 = a1.a();
        stringBuilder1.append(", ");
        stringBuilder1.append(str2);
        stringBuilder1.append(" ");
        stringBuilder1.append(str1);
        if (a1.c()) {
          if (str1.endsWith(" NULL"))
            stringBuilder1.delete(stringBuilder1.length() - 5, stringBuilder1.length()); 
          stringBuilder1.append(" NOT NULL");
        } 
        if (a1.b())
          continue; 
        continue;
      } 
      stringBuilder1.append(", ");
      stringBuilder1.append(str2);
      stringBuilder1.append(" ");
      stringBuilder1.append(str1);
      if (a1.isAnnotationPresent(com.orm.a.c.class)) {
        if (str1.endsWith(" NULL"))
          stringBuilder1.delete(stringBuilder1.length() - 5, stringBuilder1.length()); 
        stringBuilder1.append(" NOT NULL");
      } 
      if (a1.isAnnotationPresent(com.orm.a.e.class))
        continue; 
      continue;
      stringBuilder1.append(" UNIQUE");
    } 
    stringBuilder1.append(" ) ");
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("Creating table ");
    stringBuilder2.append(str);
    Log.i("Sugar", stringBuilder2.toString());
    if (!"".equals(stringBuilder1.toString()))
      try {
        paramSQLiteDatabase.execSQL(stringBuilder1.toString());
        return;
      } catch (SQLException stringBuilder1) {
        stringBuilder1.printStackTrace();
      }  
  }
  
  private boolean b(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {
    int i = 0;
    byte b1 = 0;
    byte b2 = i;
    try {
      List list = Arrays.asList(this.a.getAssets().list("sugar_upgrades"));
      b2 = i;
      c c = new c();
      b2 = i;
      this();
      b2 = i;
      Collections.sort(list, c);
      b2 = i;
      Iterator iterator = list.iterator();
      while (true) {
        b2 = b1;
        i = b1;
        if (iterator.hasNext()) {
          b2 = b1;
          String str = (String)iterator.next();
          b2 = b1;
          stringBuilder = new StringBuilder();
          b2 = b1;
          this();
          b2 = b1;
          stringBuilder.append("filename : ");
          b2 = b1;
          stringBuilder.append(str);
          b2 = b1;
          Log.i("Sugar", stringBuilder.toString());
          b2 = b1;
          try {
            int j = Integer.valueOf(str.replace(".sql", "")).intValue();
            if (j > paramInt1 && j <= paramInt2) {
              b2 = b1;
              a(paramSQLiteDatabase, str);
              b1 = 1;
            } 
            continue;
          } catch (NumberFormatException stringBuilder) {
            b2 = b1;
            stringBuilder = new StringBuilder();
            b2 = b1;
            this();
            b2 = b1;
            stringBuilder.append("not a sugar script. ignored.");
            b2 = b1;
            stringBuilder.append(str);
            b2 = b1;
            Log.i("Sugar", stringBuilder.toString());
            continue;
          } 
        } 
        break;
      } 
    } catch (IOException paramSQLiteDatabase) {
      Log.e("Sugar", paramSQLiteDatabase.getMessage());
      i = b2;
    } 
    return i;
  }
  
  public void a(SQLiteDatabase paramSQLiteDatabase) {
    Iterator iterator = e.a(this.a).iterator();
    while (iterator.hasNext())
      a((Class)iterator.next(), paramSQLiteDatabase); 
  }
  
  public void a(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {
    for (Class clazz : e.a(this.a)) {
      Cursor cursor = paramSQLiteDatabase.rawQuery(String.format("select count(*) from sqlite_master where type='table' and name='%s';", new Object[] { b.a(clazz) }), null);
      if (cursor.moveToFirst() && cursor.getInt(0) == 0)
        a(clazz, paramSQLiteDatabase); 
    } 
    b(paramSQLiteDatabase, paramInt1, paramInt2);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/com/orm/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */