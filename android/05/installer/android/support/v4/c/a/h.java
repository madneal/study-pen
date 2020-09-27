package android.support.v4.c.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

class h {
  public static Drawable a(Drawable paramDrawable) { return !(paramDrawable instanceof o) ? new n(paramDrawable) : paramDrawable; }
  
  public static void a(Drawable paramDrawable, float paramFloat1, float paramFloat2) { paramDrawable.setHotspot(paramFloat1, paramFloat2); }
  
  public static void a(Drawable paramDrawable, int paramInt) { paramDrawable.setTint(paramInt); }
  
  public static void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { paramDrawable.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4); }
  
  public static void a(Drawable paramDrawable, ColorStateList paramColorStateList) { paramDrawable.setTintList(paramColorStateList); }
  
  public static void a(Drawable paramDrawable, Resources.Theme paramTheme) { paramDrawable.applyTheme(paramTheme); }
  
  public static void a(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) { paramDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme); }
  
  public static void a(Drawable paramDrawable, PorterDuff.Mode paramMode) { paramDrawable.setTintMode(paramMode); }
  
  public static boolean b(Drawable paramDrawable) { return paramDrawable.canApplyTheme(); }
  
  public static ColorFilter c(Drawable paramDrawable) { return paramDrawable.getColorFilter(); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/c/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */