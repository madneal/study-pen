package com.orm.b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

public class a {
  public static int a(Context paramContext) {
    Integer integer2 = b(paramContext, "VERSION");
    if (integer2 != null) {
      Integer integer = integer2;
      if (integer2.intValue() == 0) {
        integer = Integer.valueOf(1);
        return integer.intValue();
      } 
      return integer.intValue();
    } 
    Integer integer1 = Integer.valueOf(1);
    return integer1.intValue();
  }
  
  private static String a(Context paramContext, String paramString) {
    PackageManager packageManager = paramContext.getPackageManager();
    try {
      return (packageManager.getApplicationInfo(paramContext.getPackageName(), 128)).metaData.getString(paramString);
    } catch (Exception paramContext) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Couldn't find config value: ");
      stringBuilder.append(paramString);
      Log.d("sugar", stringBuilder.toString());
      return null;
    } 
  }
  
  private static Integer b(Context paramContext, String paramString) {
    PackageManager packageManager = paramContext.getPackageManager();
    try {
      int i = (packageManager.getApplicationInfo(paramContext.getPackageName(), 128)).metaData.getInt(paramString);
      return Integer.valueOf(i);
    } catch (Exception paramContext) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Couldn't find config value: ");
      stringBuilder.append(paramString);
      Log.d("sugar", stringBuilder.toString());
      return null;
    } 
  }
  
  public static String b(Context paramContext) {
    String str2 = a(paramContext, "DOMAIN_PACKAGE_NAME");
    String str1 = str2;
    if (str2 == null)
      str1 = ""; 
    return str1;
  }
  
  private static Boolean c(Context paramContext, String paramString) {
    PackageManager packageManager = paramContext.getPackageManager();
    try {
      boolean bool = (packageManager.getApplicationInfo(paramContext.getPackageName(), 128)).metaData.getBoolean(paramString);
      return Boolean.valueOf(bool);
    } catch (Exception paramContext) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Couldn't find config value: ");
      stringBuilder.append(paramString);
      Log.d("sugar", stringBuilder.toString());
      return Boolean.valueOf(false);
    } 
  }
  
  public static String c(Context paramContext) {
    String str2 = a(paramContext, "DATABASE");
    String str1 = str2;
    if (str2 == null)
      str1 = "Sugar.db"; 
    return str1;
  }
  
  public static boolean d(Context paramContext) { return c(paramContext, "QUERY_LOG").booleanValue(); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/com/orm/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */