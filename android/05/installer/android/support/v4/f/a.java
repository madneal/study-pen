package android.support.v4.f;

import android.os.Build;
import java.util.Locale;

public final class a {
  private static final a a;
  
  static  {
    b b;
    int i = Build.VERSION.SDK_INT;
    if (i >= 21) {
      b = new d();
    } else if (i >= 14) {
      b = new c();
    } else {
      b = new b();
    } 
    a = b;
  }
  
  public static String a(Locale paramLocale) { return a.a(paramLocale); }
  
  static interface a {
    String a(Locale param1Locale);
  }
  
  static class b implements a {
    public String a(Locale param1Locale) { return null; }
  }
  
  static class c implements a {
    public String a(Locale param1Locale) { return c.a(param1Locale); }
  }
  
  static class d implements a {
    public String a(Locale param1Locale) { return b.a(param1Locale); }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */