package android.support.v4.h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.View;
import java.lang.reflect.Field;

class ag {
  private static Field a;
  
  private static boolean b;
  
  static ColorStateList a(View paramView) { return (paramView instanceof ac) ? ((ac)paramView).getSupportBackgroundTintList() : null; }
  
  static void a(View paramView, ColorStateList paramColorStateList) {
    if (paramView instanceof ac)
      ((ac)paramView).setSupportBackgroundTintList(paramColorStateList); 
  }
  
  static void a(View paramView, PorterDuff.Mode paramMode) {
    if (paramView instanceof ac)
      ((ac)paramView).setSupportBackgroundTintMode(paramMode); 
  }
  
  static PorterDuff.Mode b(View paramView) { return (paramView instanceof ac) ? ((ac)paramView).getSupportBackgroundTintMode() : null; }
  
  static boolean c(View paramView) { return (paramView.getWidth() > 0 && paramView.getHeight() > 0); }
  
  static int d(View paramView) {
    if (!b) {
      try {
        a = View.class.getDeclaredField("mMinHeight");
        a.setAccessible(true);
      } catch (NoSuchFieldException noSuchFieldException) {}
      b = true;
    } 
    if (a != null)
      try {
        return ((Integer)a.get(paramView)).intValue();
      } catch (Exception paramView) {} 
    return 0;
  }
  
  static boolean e(View paramView) { return (paramView.getWindowToken() != null); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */