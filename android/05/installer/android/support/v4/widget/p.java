package android.support.v4.widget;

import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

class p {
  private static Field a;
  
  static  {
    try {
      a = PopupWindow.class.getDeclaredField("mOverlapAnchor");
      a.setAccessible(true);
      return;
    } catch (NoSuchFieldException noSuchFieldException) {
      Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", noSuchFieldException);
      return;
    } 
  }
  
  static void a(PopupWindow paramPopupWindow, boolean paramBoolean) {
    if (a != null)
      try {
        a.set(paramPopupWindow, Boolean.valueOf(paramBoolean));
        return;
      } catch (IllegalAccessException paramPopupWindow) {
        Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", paramPopupWindow);
      }  
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/widget/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */