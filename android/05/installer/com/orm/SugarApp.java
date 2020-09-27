package com.orm;

import android.app.Application;

public class SugarApp extends Application {
  public void onCreate() {
    super.onCreate();
    b.a(this);
  }
  
  public void onTerminate() {
    super.onTerminate();
    b.b();
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/com/orm/SugarApp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */