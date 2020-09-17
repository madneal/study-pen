package android.support.v4.c.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public final class a {
  static final b a;
  
  static  {
    a a1;
    int i = Build.VERSION.SDK_INT;
    if (i >= 23) {
      a1 = new h();
    } else if (i >= 21) {
      a1 = new g();
    } else if (i >= 19) {
      a1 = new f();
    } else if (i >= 17) {
      a1 = new e();
    } else if (i >= 11) {
      a1 = new d();
    } else if (i >= 5) {
      a1 = new c();
    } else {
      a1 = new a();
    } 
    a = a1;
  }
  
  public static void a(Drawable paramDrawable) { a.a(paramDrawable); }
  
  public static void a(Drawable paramDrawable, float paramFloat1, float paramFloat2) { a.a(paramDrawable, paramFloat1, paramFloat2); }
  
  public static void a(Drawable paramDrawable, int paramInt) { a.a(paramDrawable, paramInt); }
  
  public static void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { a.a(paramDrawable, paramInt1, paramInt2, paramInt3, paramInt4); }
  
  public static void a(Drawable paramDrawable, ColorStateList paramColorStateList) { a.a(paramDrawable, paramColorStateList); }
  
  public static void a(Drawable paramDrawable, Resources.Theme paramTheme) { a.a(paramDrawable, paramTheme); }
  
  public static void a(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) { a.a(paramDrawable, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme); }
  
  public static void a(Drawable paramDrawable, PorterDuff.Mode paramMode) { a.a(paramDrawable, paramMode); }
  
  public static void a(Drawable paramDrawable, boolean paramBoolean) { a.a(paramDrawable, paramBoolean); }
  
  public static boolean b(Drawable paramDrawable) { return a.b(paramDrawable); }
  
  public static int c(Drawable paramDrawable) { return a.e(paramDrawable); }
  
  public static boolean d(Drawable paramDrawable) { return a.f(paramDrawable); }
  
  public static ColorFilter e(Drawable paramDrawable) { return a.g(paramDrawable); }
  
  public static Drawable f(Drawable paramDrawable) { return a.c(paramDrawable); }
  
  public static int g(Drawable paramDrawable) { return a.d(paramDrawable); }
  
  static class a implements b {
    public void a(Drawable param1Drawable) {}
    
    public void a(Drawable param1Drawable, float param1Float1, float param1Float2) {}
    
    public void a(Drawable param1Drawable, int param1Int) { c.a(param1Drawable, param1Int); }
    
    public void a(Drawable param1Drawable, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {}
    
    public void a(Drawable param1Drawable, ColorStateList param1ColorStateList) { c.a(param1Drawable, param1ColorStateList); }
    
    public void a(Drawable param1Drawable, Resources.Theme param1Theme) {}
    
    public void a(Drawable param1Drawable, Resources param1Resources, XmlPullParser param1XmlPullParser, AttributeSet param1AttributeSet, Resources.Theme param1Theme) { c.a(param1Drawable, param1Resources, param1XmlPullParser, param1AttributeSet, param1Theme); }
    
    public void a(Drawable param1Drawable, PorterDuff.Mode param1Mode) { c.a(param1Drawable, param1Mode); }
    
    public void a(Drawable param1Drawable, boolean param1Boolean) {}
    
    public boolean b(Drawable param1Drawable) { return false; }
    
    public Drawable c(Drawable param1Drawable) { return c.a(param1Drawable); }
    
    public int d(Drawable param1Drawable) { return 0; }
    
    public int e(Drawable param1Drawable) { return 0; }
    
    public boolean f(Drawable param1Drawable) { return false; }
    
    public ColorFilter g(Drawable param1Drawable) { return null; }
  }
  
  static interface b {
    void a(Drawable param1Drawable);
    
    void a(Drawable param1Drawable, float param1Float1, float param1Float2);
    
    void a(Drawable param1Drawable, int param1Int);
    
    void a(Drawable param1Drawable, int param1Int1, int param1Int2, int param1Int3, int param1Int4);
    
    void a(Drawable param1Drawable, ColorStateList param1ColorStateList);
    
    void a(Drawable param1Drawable, Resources.Theme param1Theme);
    
    void a(Drawable param1Drawable, Resources param1Resources, XmlPullParser param1XmlPullParser, AttributeSet param1AttributeSet, Resources.Theme param1Theme);
    
    void a(Drawable param1Drawable, PorterDuff.Mode param1Mode);
    
    void a(Drawable param1Drawable, boolean param1Boolean);
    
    boolean b(Drawable param1Drawable);
    
    Drawable c(Drawable param1Drawable);
    
    int d(Drawable param1Drawable);
    
    int e(Drawable param1Drawable);
    
    boolean f(Drawable param1Drawable);
    
    ColorFilter g(Drawable param1Drawable);
  }
  
  static class c extends a {
    public Drawable c(Drawable param1Drawable) { return d.a(param1Drawable); }
  }
  
  static class d extends c {
    public void a(Drawable param1Drawable) { e.a(param1Drawable); }
    
    public Drawable c(Drawable param1Drawable) { return e.b(param1Drawable); }
  }
  
  static class e extends d {
    public int d(Drawable param1Drawable) {
      int i = f.a(param1Drawable);
      return (i >= 0) ? i : 0;
    }
  }
  
  static class f extends e {
    public void a(Drawable param1Drawable, boolean param1Boolean) { g.a(param1Drawable, param1Boolean); }
    
    public boolean b(Drawable param1Drawable) { return g.a(param1Drawable); }
    
    public Drawable c(Drawable param1Drawable) { return g.b(param1Drawable); }
    
    public int e(Drawable param1Drawable) { return g.c(param1Drawable); }
  }
  
  static class g extends f {
    public void a(Drawable param1Drawable, float param1Float1, float param1Float2) { h.a(param1Drawable, param1Float1, param1Float2); }
    
    public void a(Drawable param1Drawable, int param1Int) { h.a(param1Drawable, param1Int); }
    
    public void a(Drawable param1Drawable, int param1Int1, int param1Int2, int param1Int3, int param1Int4) { h.a(param1Drawable, param1Int1, param1Int2, param1Int3, param1Int4); }
    
    public void a(Drawable param1Drawable, ColorStateList param1ColorStateList) { h.a(param1Drawable, param1ColorStateList); }
    
    public void a(Drawable param1Drawable, Resources.Theme param1Theme) { h.a(param1Drawable, param1Theme); }
    
    public void a(Drawable param1Drawable, Resources param1Resources, XmlPullParser param1XmlPullParser, AttributeSet param1AttributeSet, Resources.Theme param1Theme) { h.a(param1Drawable, param1Resources, param1XmlPullParser, param1AttributeSet, param1Theme); }
    
    public void a(Drawable param1Drawable, PorterDuff.Mode param1Mode) { h.a(param1Drawable, param1Mode); }
    
    public Drawable c(Drawable param1Drawable) { return h.a(param1Drawable); }
    
    public boolean f(Drawable param1Drawable) { return h.b(param1Drawable); }
    
    public ColorFilter g(Drawable param1Drawable) { return h.c(param1Drawable); }
  }
  
  static class h extends g {
    public Drawable c(Drawable param1Drawable) { return param1Drawable; }
    
    public int d(Drawable param1Drawable) { return b.a(param1Drawable); }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/c/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */