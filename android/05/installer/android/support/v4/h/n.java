package android.support.v4.h;

import android.os.Build;
import android.view.ViewGroup;

public final class n {
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
  
  public static int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams) { return a.a(paramMarginLayoutParams); }
  
  public static int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams) { return a.b(paramMarginLayoutParams); }
  
  static interface a {
    int a(ViewGroup.MarginLayoutParams param1MarginLayoutParams);
    
    int b(ViewGroup.MarginLayoutParams param1MarginLayoutParams);
  }
  
  static class b implements a {
    public int a(ViewGroup.MarginLayoutParams param1MarginLayoutParams) { return param1MarginLayoutParams.leftMargin; }
    
    public int b(ViewGroup.MarginLayoutParams param1MarginLayoutParams) { return param1MarginLayoutParams.rightMargin; }
  }
  
  static class c implements a {
    public int a(ViewGroup.MarginLayoutParams param1MarginLayoutParams) { return o.a(param1MarginLayoutParams); }
    
    public int b(ViewGroup.MarginLayoutParams param1MarginLayoutParams) { return o.b(param1MarginLayoutParams); }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */