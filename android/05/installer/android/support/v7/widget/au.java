package android.support.v7.widget;

import android.graphics.Rect;
import android.os.Build;
import android.support.v4.h.af;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class au {
  private static Method a;
  
  static  {
    if (Build.VERSION.SDK_INT >= 18)
      try {
        a = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[] { Rect.class, Rect.class });
        if (!a.isAccessible()) {
          a.setAccessible(true);
          return;
        } 
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
      }  
  }
  
  public static int a(int paramInt1, int paramInt2) { return paramInt1 | paramInt2; }
  
  public static void a(View paramView, Rect paramRect1, Rect paramRect2) {
    if (a != null)
      try {
        a.invoke(paramView, new Object[] { paramRect1, paramRect2 });
        return;
      } catch (Exception paramView) {
        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", paramView);
      }  
  }
  
  public static boolean a(View paramView) { return (af.d(paramView) == 1); }
  
  public static void b(View paramView) {
    if (Build.VERSION.SDK_INT >= 16)
      try {
        Method method = paramView.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
        if (!method.isAccessible())
          method.setAccessible(true); 
        method.invoke(paramView, new Object[0]);
        return;
      } catch (NoSuchMethodException paramView) {
        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
      } catch (InvocationTargetException|IllegalAccessException paramView) {
        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", paramView);
        return;
      }  
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */