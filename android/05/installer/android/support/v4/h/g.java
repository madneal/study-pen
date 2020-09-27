package android.support.v4.h;

import android.os.Build;
import android.view.KeyEvent;

public final class g {
  static final d a;
  
  static  {
    a a1;
    if (Build.VERSION.SDK_INT >= 11) {
      a1 = new c();
    } else {
      a1 = new a();
    } 
    a = a1;
  }
  
  public static boolean a(KeyEvent paramKeyEvent, int paramInt) { return a.a(paramKeyEvent.getMetaState(), paramInt); }
  
  static class a implements d {
    private static int a(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5) {
      boolean bool;
      int i = 0;
      if ((param1Int2 & param1Int3) != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      param1Int5 = param1Int4 | param1Int5;
      param1Int4 = i;
      if ((param1Int2 & param1Int5) != 0)
        param1Int4 = 1; 
      if (bool) {
        if (param1Int4 != 0)
          throw new IllegalArgumentException("bad arguments"); 
        param1Int2 = param1Int5 ^ 0xFFFFFFFF;
        return param1Int1 & param1Int2;
      } 
      if (param1Int4 != 0) {
        param1Int2 = param1Int3 ^ 0xFFFFFFFF;
        return param1Int1 & param1Int2;
      } 
      return param1Int1;
    }
    
    public int a(int param1Int) {
      int i = param1Int;
      if ((param1Int & 0xC0) != 0)
        i = param1Int | true; 
      param1Int = i;
      if ((i & 0x30) != 0)
        param1Int = i | 0x2; 
      return param1Int & 0xF7;
    }
    
    public boolean a(int param1Int1, int param1Int2) { return (a(a(a(param1Int1) & 0xF7, param1Int2, 1, 64, 128), param1Int2, 2, 16, 32) == param1Int2); }
  }
  
  static class b extends a {}
  
  static class c extends b {
    public int a(int param1Int) { return h.a(param1Int); }
    
    public boolean a(int param1Int1, int param1Int2) { return h.a(param1Int1, param1Int2); }
  }
  
  static interface d {
    boolean a(int param1Int1, int param1Int2);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */