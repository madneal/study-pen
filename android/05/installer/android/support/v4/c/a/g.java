package android.support.v4.c.a;

import android.graphics.drawable.Drawable;

class g {
  public static void a(Drawable paramDrawable, boolean paramBoolean) { paramDrawable.setAutoMirrored(paramBoolean); }
  
  public static boolean a(Drawable paramDrawable) { return paramDrawable.isAutoMirrored(); }
  
  public static Drawable b(Drawable paramDrawable) { return !(paramDrawable instanceof o) ? new m(paramDrawable) : paramDrawable; }
  
  public static int c(Drawable paramDrawable) { return paramDrawable.getAlpha(); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/c/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */