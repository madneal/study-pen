package android.support.v4.c.a;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;

class f {
  private static Method a;
  
  private static boolean b;
  
  public static int a(Drawable paramDrawable) {
    if (!b) {
      try {
        a = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
        a.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.i("DrawableCompatJellybeanMr1", "Failed to retrieve getLayoutDirection() method", noSuchMethodException);
      } 
      b = true;
    } 
    if (a != null)
      try {
        return ((Integer)a.invoke(paramDrawable, new Object[0])).intValue();
      } catch (Exception paramDrawable) {
        Log.i("DrawableCompatJellybeanMr1", "Failed to invoke getLayoutDirection() via reflection", paramDrawable);
        a = null;
      }  
    return -1;
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/c/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */