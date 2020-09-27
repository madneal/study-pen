package com.orm;

import android.content.Context;
import com.a.a.b.g;
import java.util.concurrent.ConcurrentMap;

public class b {
  private static b a;
  
  private c b;
  
  private Context c;
  
  private ConcurrentMap<Object, Long> d;
  
  static  {
  
  }
  
  private b(Context paramContext) {
    this.c = paramContext;
    this.b = new c(paramContext);
    this.d = (new g()).e().k();
  }
  
  public static b a() {
    if (a == null)
      throw new NullPointerException("SugarContext has not been initialized properly. Call SugarContext.init(Context) in your Application.onCreate() method and SugarContext.terminate() in your Application.onTerminate() method."); 
    return a;
  }
  
  public static void a(Context paramContext) { a = new b(paramContext); }
  
  public static void b() {
    if (a == null)
      return; 
    a.d();
  }
  
  private void d() {
    if (this.b != null)
      this.b.a().close(); 
  }
  
  protected c c() { return this.b; }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/com/orm/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */