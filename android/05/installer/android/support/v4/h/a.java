package android.support.v4.h;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.h.a.b;
import android.support.v4.h.a.e;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class a {
  private static final b b;
  
  private static final Object c;
  
  final Object a = b.a(this);
  
  static  {
    d d;
    if (Build.VERSION.SDK_INT >= 16) {
      d = new c();
    } else if (Build.VERSION.SDK_INT >= 14) {
      d = new a();
    } else {
      d = new d();
    } 
    b = d;
    c = b.a();
  }
  
  public e a(View paramView) { return b.a(c, paramView); }
  
  Object a() { return this.a; }
  
  public void a(View paramView, int paramInt) { b.a(c, paramView, paramInt); }
  
  public void a(View paramView, b paramb) { b.a(c, paramView, paramb); }
  
  public void a(View paramView, AccessibilityEvent paramAccessibilityEvent) { b.d(c, paramView, paramAccessibilityEvent); }
  
  public boolean a(View paramView, int paramInt, Bundle paramBundle) { return b.a(c, paramView, paramInt, paramBundle); }
  
  public boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent) { return b.a(c, paramViewGroup, paramView, paramAccessibilityEvent); }
  
  public boolean b(View paramView, AccessibilityEvent paramAccessibilityEvent) { return b.a(c, paramView, paramAccessibilityEvent); }
  
  public void c(View paramView, AccessibilityEvent paramAccessibilityEvent) { b.c(c, paramView, paramAccessibilityEvent); }
  
  public void d(View paramView, AccessibilityEvent paramAccessibilityEvent) { b.b(c, paramView, paramAccessibilityEvent); }
  
  static class a extends d {
    public Object a() { return b.a(); }
    
    public Object a(a param1a) { return b.a(new b.a(this, param1a) {
            public void a(View param2View, int param2Int) { this.a.a(param2View, param2Int); }
            
            public void a(View param2View, Object param2Object) { this.a.a(param2View, new b(param2Object)); }
            
            public boolean a(View param2View, AccessibilityEvent param2AccessibilityEvent) { return this.a.b(param2View, param2AccessibilityEvent); }
            
            public boolean a(ViewGroup param2ViewGroup, View param2View, AccessibilityEvent param2AccessibilityEvent) { return this.a.a(param2ViewGroup, param2View, param2AccessibilityEvent); }
            
            public void b(View param2View, AccessibilityEvent param2AccessibilityEvent) { this.a.d(param2View, param2AccessibilityEvent); }
            
            public void c(View param2View, AccessibilityEvent param2AccessibilityEvent) { this.a.c(param2View, param2AccessibilityEvent); }
            
            public void d(View param2View, AccessibilityEvent param2AccessibilityEvent) { this.a.a(param2View, param2AccessibilityEvent); }
          }); }
    
    public void a(Object param1Object, View param1View, int param1Int) { b.a(param1Object, param1View, param1Int); }
    
    public void a(Object param1Object, View param1View, b param1b) { b.a(param1Object, param1View, param1b.a()); }
    
    public boolean a(Object param1Object, View param1View, AccessibilityEvent param1AccessibilityEvent) { return b.a(param1Object, param1View, param1AccessibilityEvent); }
    
    public boolean a(Object param1Object, ViewGroup param1ViewGroup, View param1View, AccessibilityEvent param1AccessibilityEvent) { return b.a(param1Object, param1ViewGroup, param1View, param1AccessibilityEvent); }
    
    public void b(Object param1Object, View param1View, AccessibilityEvent param1AccessibilityEvent) { b.b(param1Object, param1View, param1AccessibilityEvent); }
    
    public void c(Object param1Object, View param1View, AccessibilityEvent param1AccessibilityEvent) { b.c(param1Object, param1View, param1AccessibilityEvent); }
    
    public void d(Object param1Object, View param1View, AccessibilityEvent param1AccessibilityEvent) { b.d(param1Object, param1View, param1AccessibilityEvent); }
  }
  
  class null implements b.a {
    null(a this$0, a param1a) {}
    
    public void a(View param1View, int param1Int) { this.a.a(param1View, param1Int); }
    
    public void a(View param1View, Object param1Object) { this.a.a(param1View, new b(param1Object)); }
    
    public boolean a(View param1View, AccessibilityEvent param1AccessibilityEvent) { return this.a.b(param1View, param1AccessibilityEvent); }
    
    public boolean a(ViewGroup param1ViewGroup, View param1View, AccessibilityEvent param1AccessibilityEvent) { return this.a.a(param1ViewGroup, param1View, param1AccessibilityEvent); }
    
    public void b(View param1View, AccessibilityEvent param1AccessibilityEvent) { this.a.d(param1View, param1AccessibilityEvent); }
    
    public void c(View param1View, AccessibilityEvent param1AccessibilityEvent) { this.a.c(param1View, param1AccessibilityEvent); }
    
    public void d(View param1View, AccessibilityEvent param1AccessibilityEvent) { this.a.a(param1View, param1AccessibilityEvent); }
  }
  
  static interface b {
    e a(Object param1Object, View param1View);
    
    Object a();
    
    Object a(a param1a);
    
    void a(Object param1Object, View param1View, int param1Int);
    
    void a(Object param1Object, View param1View, b param1b);
    
    boolean a(Object param1Object, View param1View, int param1Int, Bundle param1Bundle);
    
    boolean a(Object param1Object, View param1View, AccessibilityEvent param1AccessibilityEvent);
    
    boolean a(Object param1Object, ViewGroup param1ViewGroup, View param1View, AccessibilityEvent param1AccessibilityEvent);
    
    void b(Object param1Object, View param1View, AccessibilityEvent param1AccessibilityEvent);
    
    void c(Object param1Object, View param1View, AccessibilityEvent param1AccessibilityEvent);
    
    void d(Object param1Object, View param1View, AccessibilityEvent param1AccessibilityEvent);
  }
  
  static class c extends a {
    public e a(Object param1Object, View param1View) {
      param1Object = c.a(param1Object, param1View);
      return (param1Object != null) ? new e(param1Object) : null;
    }
    
    public Object a(a param1a) { return c.a(new c.a(this, param1a) {
            public Object a(View param2View) {
              e e = this.a.a(param2View);
              return (e != null) ? e.a() : null;
            }
            
            public void a(View param2View, int param2Int) { this.a.a(param2View, param2Int); }
            
            public void a(View param2View, Object param2Object) { this.a.a(param2View, new b(param2Object)); }
            
            public boolean a(View param2View, int param2Int, Bundle param2Bundle) { return this.a.a(param2View, param2Int, param2Bundle); }
            
            public boolean a(View param2View, AccessibilityEvent param2AccessibilityEvent) { return this.a.b(param2View, param2AccessibilityEvent); }
            
            public boolean a(ViewGroup param2ViewGroup, View param2View, AccessibilityEvent param2AccessibilityEvent) { return this.a.a(param2ViewGroup, param2View, param2AccessibilityEvent); }
            
            public void b(View param2View, AccessibilityEvent param2AccessibilityEvent) { this.a.d(param2View, param2AccessibilityEvent); }
            
            public void c(View param2View, AccessibilityEvent param2AccessibilityEvent) { this.a.c(param2View, param2AccessibilityEvent); }
            
            public void d(View param2View, AccessibilityEvent param2AccessibilityEvent) { this.a.a(param2View, param2AccessibilityEvent); }
          }); }
    
    public boolean a(Object param1Object, View param1View, int param1Int, Bundle param1Bundle) { return c.a(param1Object, param1View, param1Int, param1Bundle); }
  }
  
  class null implements c.a {
    null(a this$0, a param1a) {}
    
    public Object a(View param1View) {
      e e = this.a.a(param1View);
      return (e != null) ? e.a() : null;
    }
    
    public void a(View param1View, int param1Int) { this.a.a(param1View, param1Int); }
    
    public void a(View param1View, Object param1Object) { this.a.a(param1View, new b(param1Object)); }
    
    public boolean a(View param1View, int param1Int, Bundle param1Bundle) { return this.a.a(param1View, param1Int, param1Bundle); }
    
    public boolean a(View param1View, AccessibilityEvent param1AccessibilityEvent) { return this.a.b(param1View, param1AccessibilityEvent); }
    
    public boolean a(ViewGroup param1ViewGroup, View param1View, AccessibilityEvent param1AccessibilityEvent) { return this.a.a(param1ViewGroup, param1View, param1AccessibilityEvent); }
    
    public void b(View param1View, AccessibilityEvent param1AccessibilityEvent) { this.a.d(param1View, param1AccessibilityEvent); }
    
    public void c(View param1View, AccessibilityEvent param1AccessibilityEvent) { this.a.c(param1View, param1AccessibilityEvent); }
    
    public void d(View param1View, AccessibilityEvent param1AccessibilityEvent) { this.a.a(param1View, param1AccessibilityEvent); }
  }
  
  static class d implements b {
    public e a(Object param1Object, View param1View) { return null; }
    
    public Object a() { return null; }
    
    public Object a(a param1a) { return null; }
    
    public void a(Object param1Object, View param1View, int param1Int) {}
    
    public void a(Object param1Object, View param1View, b param1b) {}
    
    public boolean a(Object param1Object, View param1View, int param1Int, Bundle param1Bundle) { return false; }
    
    public boolean a(Object param1Object, View param1View, AccessibilityEvent param1AccessibilityEvent) { return false; }
    
    public boolean a(Object param1Object, ViewGroup param1ViewGroup, View param1View, AccessibilityEvent param1AccessibilityEvent) { return true; }
    
    public void b(Object param1Object, View param1View, AccessibilityEvent param1AccessibilityEvent) {}
    
    public void c(Object param1Object, View param1View, AccessibilityEvent param1AccessibilityEvent) {}
    
    public void d(Object param1Object, View param1View, AccessibilityEvent param1AccessibilityEvent) {}
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */