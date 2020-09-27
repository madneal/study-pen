package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

class d {
  private static Field a;
  
  private static boolean b;
  
  static Drawable a(CompoundButton paramCompoundButton) {
    if (!b) {
      try {
        a = CompoundButton.class.getDeclaredField("mButtonDrawable");
        a.setAccessible(true);
      } catch (NoSuchFieldException noSuchFieldException) {
        Log.i("CompoundButtonCompatDonut", "Failed to retrieve mButtonDrawable field", noSuchFieldException);
      } 
      b = true;
    } 
    if (a != null)
      try {
        return (Drawable)a.get(paramCompoundButton);
      } catch (IllegalAccessException paramCompoundButton) {
        Log.i("CompoundButtonCompatDonut", "Failed to get button drawable via reflection", paramCompoundButton);
        a = null;
      }  
    return null;
  }
  
  static void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList) {
    if (paramCompoundButton instanceof x)
      ((x)paramCompoundButton).setSupportButtonTintList(paramColorStateList); 
  }
  
  static void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode) {
    if (paramCompoundButton instanceof x)
      ((x)paramCompoundButton).setSupportButtonTintMode(paramMode); 
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/widget/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */