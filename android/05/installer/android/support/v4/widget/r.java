package android.support.v4.widget;

import android.widget.PopupWindow;
import java.lang.reflect.Method;

class r {
  private static Method a;
  
  private static boolean b;
  
  static void a(PopupWindow paramPopupWindow, int paramInt) {
    if (!b) {
      try {
        a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[] { int.class });
        a.setAccessible(true);
      } catch (Exception exception) {}
      b = true;
    } 
    if (a != null)
      try {
        a.invoke(paramPopupWindow, new Object[] { Integer.valueOf(paramInt) });
      } catch (Exception paramPopupWindow) {} 
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/widget/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */