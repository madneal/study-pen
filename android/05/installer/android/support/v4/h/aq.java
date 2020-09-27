package android.support.v4.h;

import android.os.Build;
import android.view.ViewConfiguration;

public final class aq {
  static final e a;
  
  static  {
    a a1;
    if (Build.VERSION.SDK_INT >= 14) {
      a1 = new d();
    } else if (Build.VERSION.SDK_INT >= 11) {
      a1 = new c();
    } else if (Build.VERSION.SDK_INT >= 8) {
      a1 = new b();
    } else {
      a1 = new a();
    } 
    a = a1;
  }
  
  public static boolean a(ViewConfiguration paramViewConfiguration) { return a.a(paramViewConfiguration); }
  
  static class a implements e {
    public boolean a(ViewConfiguration param1ViewConfiguration) { return true; }
  }
  
  static class b extends a {}
  
  static class c extends b {
    public boolean a(ViewConfiguration param1ViewConfiguration) { return false; }
  }
  
  static class d extends c {
    public boolean a(ViewConfiguration param1ViewConfiguration) { return ar.a(param1ViewConfiguration); }
  }
  
  static interface e {
    boolean a(ViewConfiguration param1ViewConfiguration);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */