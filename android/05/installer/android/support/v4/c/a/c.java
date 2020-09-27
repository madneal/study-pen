package android.support.v4.c.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

class c {
  public static Drawable a(Drawable paramDrawable) { return !(paramDrawable instanceof o) ? new j(paramDrawable) : paramDrawable; }
  
  public static void a(Drawable paramDrawable, int paramInt) {
    if (paramDrawable instanceof o)
      ((o)paramDrawable).setTint(paramInt); 
  }
  
  public static void a(Drawable paramDrawable, ColorStateList paramColorStateList) {
    if (paramDrawable instanceof o)
      ((o)paramDrawable).setTintList(paramColorStateList); 
  }
  
  public static void a(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) { paramDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet); }
  
  public static void a(Drawable paramDrawable, PorterDuff.Mode paramMode) {
    if (paramDrawable instanceof o)
      ((o)paramDrawable).setTintMode(paramMode); 
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/c/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */