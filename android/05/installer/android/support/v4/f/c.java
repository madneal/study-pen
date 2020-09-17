package android.support.v4.f;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.Locale;

class c {
  private static Method a;
  
  private static Method b;
  
  static  {
    try {
      Class clazz = Class.forName("libcore.icu.ICU");
      if (clazz != null) {
        a = clazz.getMethod("getScript", new Class[] { String.class });
        b = clazz.getMethod("addLikelySubtags", new Class[] { String.class });
        return;
      } 
    } catch (Exception exception) {
      a = null;
      b = null;
      Log.w("ICUCompatIcs", exception);
    } 
  }
  
  private static String a(String paramString) {
    try {
      if (a != null)
        return (String)a.invoke(null, new Object[] { paramString }); 
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException paramString) {
      Log.w("ICUCompatIcs", paramString);
    } 
    return null;
  }
  
  public static String a(Locale paramLocale) {
    String str = b(paramLocale);
    return (str != null) ? a(str) : null;
  }
  
  private static String b(Locale paramLocale) {
    String str = paramLocale.toString();
    try {
      if (b != null)
        return (String)b.invoke(null, new Object[] { str }); 
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      Log.w("ICUCompatIcs", illegalAccessException);
    } 
    return str;
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */