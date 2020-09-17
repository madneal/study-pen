package android.support.v4.f;

import android.os.Build;
import java.util.Locale;

public final class d {
  public static final Locale a;
  
  private static final a b;
  
  private static String c = "Arab";
  
  private static String d = "Hebr";
  
  static  {
    a a1;
    if (Build.VERSION.SDK_INT >= 17) {
      a1 = new b(null);
    } else {
      a1 = new a(null);
    } 
    b = a1;
    a = new Locale("", "");
  }
  
  public static int a(Locale paramLocale) { return b.a(paramLocale); }
  
  private static class a {
    private a() {}
    
    private static int b(Locale param1Locale) {
      switch (Character.getDirectionality(param1Locale.getDisplayName(param1Locale).charAt(0))) {
        default:
          return 0;
        case 1:
        case 2:
          break;
      } 
      return 1;
    }
    
    public int a(Locale param1Locale) {
      if (param1Locale != null && !param1Locale.equals(d.a)) {
        String str = a.a(param1Locale);
        if (str == null)
          return b(param1Locale); 
        if (str.equalsIgnoreCase(d.a()) || str.equalsIgnoreCase(d.b()))
          return 1; 
      } 
      return 0;
    }
  }
  
  private static class b extends a {
    private b() { super(null); }
    
    public int a(Locale param1Locale) { return e.a(param1Locale); }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */