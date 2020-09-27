package android.support.v7.widget;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.support.v4.c.a.i;
import android.support.v7.c.a.a;

public class ad {
  public static final Rect a = new Rect();
  
  private static Class<?> b;
  
  static  {
    if (Build.VERSION.SDK_INT >= 18)
      try {
        b = Class.forName("android.graphics.Insets");
      } catch (ClassNotFoundException classNotFoundException) {} 
  }
  
  static PorterDuff.Mode a(int paramInt, PorterDuff.Mode paramMode) {
    if (paramInt != 3) {
      if (paramInt != 5) {
        if (paramInt != 9) {
          switch (paramInt) {
            default:
              return paramMode;
            case 16:
              if (Build.VERSION.SDK_INT >= 11)
                paramMode = PorterDuff.Mode.valueOf("ADD"); 
              return paramMode;
            case 15:
              return PorterDuff.Mode.SCREEN;
            case 14:
              break;
          } 
          return PorterDuff.Mode.MULTIPLY;
        } 
        return PorterDuff.Mode.SRC_ATOP;
      } 
      return PorterDuff.Mode.SRC_IN;
    } 
    return PorterDuff.Mode.SRC_OVER;
  }
  
  static void a(Drawable paramDrawable) {
    if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(paramDrawable.getClass().getName()))
      c(paramDrawable); 
  }
  
  public static boolean b(Drawable paramDrawable) {
    Drawable[] arrayOfDrawable;
    boolean bool1 = paramDrawable instanceof android.graphics.drawable.LayerDrawable;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    if (bool1) {
      if (Build.VERSION.SDK_INT >= 16)
        bool5 = true; 
      return bool5;
    } 
    if (paramDrawable instanceof android.graphics.drawable.InsetDrawable) {
      bool5 = bool2;
      if (Build.VERSION.SDK_INT >= 14)
        bool5 = true; 
      return bool5;
    } 
    if (paramDrawable instanceof android.graphics.drawable.StateListDrawable) {
      bool5 = bool3;
      if (Build.VERSION.SDK_INT >= 8)
        bool5 = true; 
      return bool5;
    } 
    if (paramDrawable instanceof android.graphics.drawable.GradientDrawable) {
      bool5 = bool4;
      if (Build.VERSION.SDK_INT >= 14)
        bool5 = true; 
      return bool5;
    } 
    if (paramDrawable instanceof DrawableContainer) {
      arrayOfDrawable = paramDrawable.getConstantState();
      if (arrayOfDrawable instanceof DrawableContainer.DrawableContainerState) {
        arrayOfDrawable = ((DrawableContainer.DrawableContainerState)arrayOfDrawable).getChildren();
        int i = arrayOfDrawable.length;
        for (byte b1 = 0; b1 < i; b1++) {
          if (!b(arrayOfDrawable[b1]))
            return false; 
        } 
      } 
    } else {
      Drawable drawable;
      if (arrayOfDrawable instanceof i) {
        drawable = ((i)arrayOfDrawable).a();
        return b(drawable);
      } 
      if (drawable instanceof a) {
        drawable = ((a)drawable).a();
        return b(drawable);
      } 
      if (drawable instanceof ScaleDrawable) {
        drawable = ((ScaleDrawable)drawable).getDrawable();
        return b(drawable);
      } 
    } 
    return true;
  }
  
  private static void c(Drawable paramDrawable) {
    int[] arrayOfInt2;
    int[] arrayOfInt1 = paramDrawable.getState();
    if (arrayOfInt1 == null || arrayOfInt1.length == 0) {
      arrayOfInt2 = am.e;
    } else {
      arrayOfInt2 = am.h;
    } 
    paramDrawable.setState(arrayOfInt2);
    paramDrawable.setState(arrayOfInt1);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */