package android.support.v4.h;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;

public final class af {
  static final m a;
  
  static  {
    a a1;
    int i = Build.VERSION.SDK_INT;
    if (i >= 23) {
      a1 = new l();
    } else if (i >= 21) {
      a1 = new k();
    } else if (i >= 19) {
      a1 = new j();
    } else if (i >= 17) {
      a1 = new h();
    } else if (i >= 16) {
      a1 = new g();
    } else if (i >= 15) {
      a1 = new e();
    } else if (i >= 14) {
      a1 = new f();
    } else if (i >= 11) {
      a1 = new d();
    } else if (i >= 9) {
      a1 = new c();
    } else if (i >= 7) {
      a1 = new b();
    } else {
      a1 = new a();
    } 
    a = a1;
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3) { return a.a(paramInt1, paramInt2, paramInt3); }
  
  public static int a(View paramView) { return a.a(paramView); }
  
  public static bb a(View paramView, bb parambb) { return a.a(paramView, parambb); }
  
  public static void a(View paramView, float paramFloat) { a.a(paramView, paramFloat); }
  
  public static void a(View paramView, int paramInt1, int paramInt2) { a.a(paramView, paramInt1, paramInt2); }
  
  public static void a(View paramView, int paramInt, Paint paramPaint) { a.a(paramView, paramInt, paramPaint); }
  
  public static void a(View paramView, ColorStateList paramColorStateList) { a.a(paramView, paramColorStateList); }
  
  public static void a(View paramView, PorterDuff.Mode paramMode) { a.a(paramView, paramMode); }
  
  public static void a(View paramView, a parama) { a.a(paramView, parama); }
  
  public static void a(View paramView, aa paramaa) { a.a(paramView, paramaa); }
  
  public static void a(View paramView, Runnable paramRunnable) { a.a(paramView, paramRunnable); }
  
  public static void a(View paramView, Runnable paramRunnable, long paramLong) { a.a(paramView, paramRunnable, paramLong); }
  
  public static void a(View paramView, boolean paramBoolean) { a.a(paramView, paramBoolean); }
  
  public static boolean a(View paramView, int paramInt) { return a.a(paramView, paramInt); }
  
  public static void b(View paramView) { a.b(paramView); }
  
  public static void b(View paramView, float paramFloat) { a.b(paramView, paramFloat); }
  
  public static void b(View paramView, boolean paramBoolean) { a.b(paramView, paramBoolean); }
  
  public static int c(View paramView) { return a.c(paramView); }
  
  public static void c(View paramView, float paramFloat) { a.c(paramView, paramFloat); }
  
  public static int d(View paramView) { return a.d(paramView); }
  
  public static int e(View paramView) { return a.e(paramView); }
  
  public static int f(View paramView) { return a.f(paramView); }
  
  public static float g(View paramView) { return a.h(paramView); }
  
  public static int h(View paramView) { return a.i(paramView); }
  
  public static au i(View paramView) { return a.j(paramView); }
  
  public static int j(View paramView) { return a.k(paramView); }
  
  public static void k(View paramView) { a.l(paramView); }
  
  public static void l(View paramView) { a.m(paramView); }
  
  public static boolean m(View paramView) { return a.g(paramView); }
  
  public static ColorStateList n(View paramView) { return a.n(paramView); }
  
  public static PorterDuff.Mode o(View paramView) { return a.o(paramView); }
  
  public static void p(View paramView) { a.p(paramView); }
  
  public static boolean q(View paramView) { return a.q(paramView); }
  
  public static boolean r(View paramView) { return a.r(paramView); }
  
  public static boolean s(View paramView) { return a.s(paramView); }
  
  static class a implements m {
    WeakHashMap<View, au> a = null;
    
    private boolean a(ab param1ab, int param1Int) {
      int i = param1ab.computeVerticalScrollOffset();
      int j = param1ab.computeVerticalScrollRange() - param1ab.computeVerticalScrollExtent();
      boolean bool = false;
      boolean bool1 = false;
      if (j == 0)
        return false; 
      if (param1Int < 0) {
        if (i > 0)
          bool1 = true; 
        return bool1;
      } 
      bool1 = bool;
      if (i < j - 1)
        bool1 = true; 
      return bool1;
    }
    
    public int a(int param1Int1, int param1Int2, int param1Int3) { return View.resolveSize(param1Int1, param1Int2); }
    
    public int a(View param1View) { return 2; }
    
    long a() { return 10L; }
    
    public bb a(View param1View, bb param1bb) { return param1bb; }
    
    public void a(View param1View, float param1Float) {}
    
    public void a(View param1View, int param1Int1, int param1Int2) {}
    
    public void a(View param1View, int param1Int, Paint param1Paint) {}
    
    public void a(View param1View, ColorStateList param1ColorStateList) { ag.a(param1View, param1ColorStateList); }
    
    public void a(View param1View, PorterDuff.Mode param1Mode) { ag.a(param1View, param1Mode); }
    
    public void a(View param1View, a param1a) {}
    
    public void a(View param1View, aa param1aa) {}
    
    public void a(View param1View, Runnable param1Runnable) { param1View.postDelayed(param1Runnable, a()); }
    
    public void a(View param1View, Runnable param1Runnable, long param1Long) { param1View.postDelayed(param1Runnable, a() + param1Long); }
    
    public void a(View param1View, boolean param1Boolean) {}
    
    public boolean a(View param1View, int param1Int) { return (param1View instanceof ab && a((ab)param1View, param1Int)); }
    
    public void b(View param1View) { param1View.invalidate(); }
    
    public void b(View param1View, float param1Float) {}
    
    public void b(View param1View, boolean param1Boolean) {}
    
    public int c(View param1View) { return 0; }
    
    public void c(View param1View, float param1Float) {}
    
    public int d(View param1View) { return 0; }
    
    public int e(View param1View) { return param1View.getMeasuredWidth(); }
    
    public int f(View param1View) { return 0; }
    
    public boolean g(View param1View) { return true; }
    
    public float h(View param1View) { return 0.0F; }
    
    public int i(View param1View) { return ag.d(param1View); }
    
    public au j(View param1View) { return new au(param1View); }
    
    public int k(View param1View) { return 0; }
    
    public void l(View param1View) {}
    
    public void m(View param1View) {}
    
    public ColorStateList n(View param1View) { return ag.a(param1View); }
    
    public PorterDuff.Mode o(View param1View) { return ag.b(param1View); }
    
    public void p(View param1View) {
      if (param1View instanceof w)
        ((w)param1View).stopNestedScroll(); 
    }
    
    public boolean q(View param1View) { return ag.c(param1View); }
    
    public boolean r(View param1View) { return ag.e(param1View); }
    
    public boolean s(View param1View) { return false; }
  }
  
  static class b extends a {}
  
  static class c extends b {
    public int a(View param1View) { return ah.a(param1View); }
  }
  
  static class d extends c {
    public int a(int param1Int1, int param1Int2, int param1Int3) { return ai.a(param1Int1, param1Int2, param1Int3); }
    
    long a() { return ai.a(); }
    
    public void a(View param1View, float param1Float) { ai.a(param1View, param1Float); }
    
    public void a(View param1View, int param1Int, Paint param1Paint) { ai.a(param1View, param1Int, param1Paint); }
    
    public void a(View param1View, boolean param1Boolean) { ai.a(param1View, param1Boolean); }
    
    public void b(View param1View, float param1Float) { ai.b(param1View, param1Float); }
    
    public void b(View param1View, boolean param1Boolean) { ai.b(param1View, param1Boolean); }
    
    public int c(View param1View) { return ai.a(param1View); }
    
    public int e(View param1View) { return ai.b(param1View); }
    
    public int f(View param1View) { return ai.c(param1View); }
    
    public float h(View param1View) { return ai.d(param1View); }
    
    public void m(View param1View) { ai.e(param1View); }
  }
  
  static class e extends f {
    public boolean s(View param1View) { return ak.a(param1View); }
  }
  
  static class f extends d {
    static boolean b = false;
    
    static  {
    
    }
    
    public void a(View param1View, a param1a) {
      Object object;
      if (param1a == null) {
        param1a = null;
      } else {
        object = param1a.a();
      } 
      aj.a(param1View, object);
    }
    
    public boolean a(View param1View, int param1Int) { return aj.a(param1View, param1Int); }
    
    public au j(View param1View) {
      if (this.a == null)
        this.a = new WeakHashMap(); 
      au au1 = (au)this.a.get(param1View);
      au au2 = au1;
      if (au1 == null) {
        au2 = new au(param1View);
        this.a.put(param1View, au2);
      } 
      return au2;
    }
  }
  
  static class g extends e {
    public void a(View param1View, Runnable param1Runnable) { al.a(param1View, param1Runnable); }
    
    public void a(View param1View, Runnable param1Runnable, long param1Long) { al.a(param1View, param1Runnable, param1Long); }
    
    public void b(View param1View) { al.a(param1View); }
    
    public boolean g(View param1View) { return al.d(param1View); }
    
    public int i(View param1View) { return al.b(param1View); }
    
    public void l(View param1View) { al.c(param1View); }
  }
  
  static class h extends g {
    public int d(View param1View) { return am.a(param1View); }
    
    public int k(View param1View) { return am.b(param1View); }
  }
  
  static class i extends h {}
  
  static class j extends i {
    public boolean q(View param1View) { return an.a(param1View); }
    
    public boolean r(View param1View) { return an.b(param1View); }
  }
  
  static class k extends j {
    public bb a(View param1View, bb param1bb) { return ao.a(param1View, param1bb); }
    
    public void a(View param1View, ColorStateList param1ColorStateList) { ao.a(param1View, param1ColorStateList); }
    
    public void a(View param1View, PorterDuff.Mode param1Mode) { ao.a(param1View, param1Mode); }
    
    public void a(View param1View, aa param1aa) { ao.a(param1View, param1aa); }
    
    public void c(View param1View, float param1Float) { ao.a(param1View, param1Float); }
    
    public void l(View param1View) { ao.a(param1View); }
    
    public ColorStateList n(View param1View) { return ao.b(param1View); }
    
    public PorterDuff.Mode o(View param1View) { return ao.c(param1View); }
    
    public void p(View param1View) { ao.d(param1View); }
  }
  
  static class l extends k {
    public void a(View param1View, int param1Int1, int param1Int2) { ap.a(param1View, param1Int1, param1Int2); }
  }
  
  static interface m {
    int a(int param1Int1, int param1Int2, int param1Int3);
    
    int a(View param1View);
    
    bb a(View param1View, bb param1bb);
    
    void a(View param1View, float param1Float);
    
    void a(View param1View, int param1Int1, int param1Int2);
    
    void a(View param1View, int param1Int, Paint param1Paint);
    
    void a(View param1View, ColorStateList param1ColorStateList);
    
    void a(View param1View, PorterDuff.Mode param1Mode);
    
    void a(View param1View, a param1a);
    
    void a(View param1View, aa param1aa);
    
    void a(View param1View, Runnable param1Runnable);
    
    void a(View param1View, Runnable param1Runnable, long param1Long);
    
    void a(View param1View, boolean param1Boolean);
    
    boolean a(View param1View, int param1Int);
    
    void b(View param1View);
    
    void b(View param1View, float param1Float);
    
    void b(View param1View, boolean param1Boolean);
    
    int c(View param1View);
    
    void c(View param1View, float param1Float);
    
    int d(View param1View);
    
    int e(View param1View);
    
    int f(View param1View);
    
    boolean g(View param1View);
    
    float h(View param1View);
    
    int i(View param1View);
    
    au j(View param1View);
    
    int k(View param1View);
    
    void l(View param1View);
    
    void m(View param1View);
    
    ColorStateList n(View param1View);
    
    PorterDuff.Mode o(View param1View);
    
    void p(View param1View);
    
    boolean q(View param1View);
    
    boolean r(View param1View);
    
    boolean s(View param1View);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */