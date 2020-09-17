package android.support.v4.a;

import android.content.Context;
import android.os.Build;

public final class d {
  private static final b a;
  
  static  {
    b b1;
    if (Build.VERSION.SDK_INT >= 23) {
      b1 = new a(null);
    } else {
      b1 = new b(null);
    } 
    a = b1;
  }
  
  public static int a(Context paramContext, String paramString1, String paramString2) { return a.a(paramContext, paramString1, paramString2); }
  
  public static String a(String paramString) { return a.a(paramString); }
  
  private static class a extends b {
    private a() { super(null); }
    
    public int a(Context param1Context, String param1String1, String param1String2) { return e.a(param1Context, param1String1, param1String2); }
    
    public String a(String param1String) { return e.a(param1String); }
  }
  
  private static class b {
    private b() {}
    
    public int a(Context param1Context, String param1String1, String param1String2) { return 1; }
    
    public String a(String param1String) { return null; }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */