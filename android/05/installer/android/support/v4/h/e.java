package android.support.v4.h;

import android.os.Build;

public final class e {
  static final a a;
  
  static  {
    b b;
    if (Build.VERSION.SDK_INT >= 17) {
      b = new c();
    } else {
      b = new b();
    } 
    a = b;
  }
  
  public static int a(int paramInt1, int paramInt2) { return a.a(paramInt1, paramInt2); }
  
  static interface a {
    int a(int param1Int1, int param1Int2);
  }
  
  static class b implements a {
    public int a(int param1Int1, int param1Int2) { return param1Int1 & 0xFF7FFFFF; }
  }
  
  static class c implements a {
    public int a(int param1Int1, int param1Int2) { return f.a(param1Int1, param1Int2); }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */