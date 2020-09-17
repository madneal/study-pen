package android.support.v4.widget;

import android.content.Context;
import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.Scroller;

public final class u {
  Object a;
  
  a b;
  
  private u(int paramInt, Context paramContext, Interpolator paramInterpolator) {
    if (paramInt >= 14) {
      b1 = new d();
    } else if (paramInt >= 9) {
      b1 = new c();
    } else {
      b1 = new b();
    } 
    this.b = b1;
    this.a = this.b.a(paramContext, paramInterpolator);
  }
  
  public static u a(Context paramContext) { return a(paramContext, null); }
  
  public static u a(Context paramContext, Interpolator paramInterpolator) { return new u(Build.VERSION.SDK_INT, paramContext, paramInterpolator); }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { this.b.a(this.a, paramInt1, paramInt2, paramInt3, paramInt4); }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) { this.b.a(this.a, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8); }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10) { this.b.a(this.a, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10); }
  
  public boolean a() { return this.b.a(this.a); }
  
  public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) { return this.b.a(this.a, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6); }
  
  public int b() { return this.b.b(this.a); }
  
  public int c() { return this.b.c(this.a); }
  
  public int d() { return this.b.g(this.a); }
  
  public float e() { return this.b.d(this.a); }
  
  public boolean f() { return this.b.e(this.a); }
  
  public void g() { this.b.f(this.a); }
  
  static interface a {
    Object a(Context param1Context, Interpolator param1Interpolator);
    
    void a(Object param1Object, int param1Int1, int param1Int2, int param1Int3, int param1Int4);
    
    void a(Object param1Object, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, int param1Int7, int param1Int8);
    
    void a(Object param1Object, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, int param1Int7, int param1Int8, int param1Int9, int param1Int10);
    
    boolean a(Object param1Object);
    
    boolean a(Object param1Object, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6);
    
    int b(Object param1Object);
    
    int c(Object param1Object);
    
    float d(Object param1Object);
    
    boolean e(Object param1Object);
    
    void f(Object param1Object);
    
    int g(Object param1Object);
  }
  
  static class b implements a {
    public Object a(Context param1Context, Interpolator param1Interpolator) { return (param1Interpolator != null) ? new Scroller(param1Context, param1Interpolator) : new Scroller(param1Context); }
    
    public void a(Object param1Object, int param1Int1, int param1Int2, int param1Int3, int param1Int4) { ((Scroller)param1Object).startScroll(param1Int1, param1Int2, param1Int3, param1Int4); }
    
    public void a(Object param1Object, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, int param1Int7, int param1Int8) { ((Scroller)param1Object).fling(param1Int1, param1Int2, param1Int3, param1Int4, param1Int5, param1Int6, param1Int7, param1Int8); }
    
    public void a(Object param1Object, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, int param1Int7, int param1Int8, int param1Int9, int param1Int10) { ((Scroller)param1Object).fling(param1Int1, param1Int2, param1Int3, param1Int4, param1Int5, param1Int6, param1Int7, param1Int8); }
    
    public boolean a(Object param1Object) { return ((Scroller)param1Object).isFinished(); }
    
    public boolean a(Object param1Object, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6) { return false; }
    
    public int b(Object param1Object) { return ((Scroller)param1Object).getCurrX(); }
    
    public int c(Object param1Object) { return ((Scroller)param1Object).getCurrY(); }
    
    public float d(Object param1Object) { return 0.0F; }
    
    public boolean e(Object param1Object) { return ((Scroller)param1Object).computeScrollOffset(); }
    
    public void f(Object param1Object) { ((Scroller)param1Object).abortAnimation(); }
    
    public int g(Object param1Object) { return ((Scroller)param1Object).getFinalY(); }
  }
  
  static class c implements a {
    public Object a(Context param1Context, Interpolator param1Interpolator) { return v.a(param1Context, param1Interpolator); }
    
    public void a(Object param1Object, int param1Int1, int param1Int2, int param1Int3, int param1Int4) { v.a(param1Object, param1Int1, param1Int2, param1Int3, param1Int4); }
    
    public void a(Object param1Object, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, int param1Int7, int param1Int8) { v.a(param1Object, param1Int1, param1Int2, param1Int3, param1Int4, param1Int5, param1Int6, param1Int7, param1Int8); }
    
    public void a(Object param1Object, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, int param1Int7, int param1Int8, int param1Int9, int param1Int10) { v.a(param1Object, param1Int1, param1Int2, param1Int3, param1Int4, param1Int5, param1Int6, param1Int7, param1Int8, param1Int9, param1Int10); }
    
    public boolean a(Object param1Object) { return v.a(param1Object); }
    
    public boolean a(Object param1Object, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6) { return v.a(param1Object, param1Int1, param1Int2, param1Int3, param1Int4, param1Int5, param1Int6); }
    
    public int b(Object param1Object) { return v.b(param1Object); }
    
    public int c(Object param1Object) { return v.c(param1Object); }
    
    public float d(Object param1Object) { return 0.0F; }
    
    public boolean e(Object param1Object) { return v.d(param1Object); }
    
    public void f(Object param1Object) { v.e(param1Object); }
    
    public int g(Object param1Object) { return v.f(param1Object); }
  }
  
  static class d extends c {
    public float d(Object param1Object) { return w.a(param1Object); }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/widget/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */