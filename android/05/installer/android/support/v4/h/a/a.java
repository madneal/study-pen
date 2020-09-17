package android.support.v4.h.a;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

public final class a {
  private static final d a;
  
  static  {
    c c;
    if (Build.VERSION.SDK_INT >= 19) {
      c = new b();
    } else if (Build.VERSION.SDK_INT >= 14) {
      c = new a();
    } else {
      c = new c();
    } 
    a = c;
  }
  
  public static h a(AccessibilityEvent paramAccessibilityEvent) { return new h(paramAccessibilityEvent); }
  
  static class a extends c {}
  
  static class b extends a {}
  
  static class c implements d {}
  
  static interface d {}
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */