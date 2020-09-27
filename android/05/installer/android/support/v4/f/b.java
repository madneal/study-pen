package android.support.v4.f;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

class b {
  private static Method a;
  
  static  {
    try {
      a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[] { Locale.class });
      return;
    } catch (Exception exception) {
      throw new IllegalStateException(exception);
    } 
  }
  
  public static String a(Locale paramLocale) {
    try {
      return ((Locale)a.invoke(null, new Object[] { paramLocale })).getScript();
    } catch (InvocationTargetException|IllegalAccessException invocationTargetException) {
      Log.w("ICUCompatIcs", invocationTargetException);
      return paramLocale.getScript();
    } 
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */