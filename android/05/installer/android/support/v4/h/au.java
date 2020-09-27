package android.support.v4.h;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class au {
  static final g a;
  
  private WeakReference<View> b;
  
  private Runnable c = null;
  
  private Runnable d = null;
  
  private int e = -1;
  
  static  {
    a a1;
    int i = Build.VERSION.SDK_INT;
    if (i >= 21) {
      a1 = new f();
    } else if (i >= 19) {
      a1 = new e();
    } else if (i >= 18) {
      a1 = new c();
    } else if (i >= 16) {
      a1 = new d();
    } else if (i >= 14) {
      a1 = new b();
    } else {
      a1 = new a();
    } 
    a = a1;
  }
  
  au(View paramView) { this.b = new WeakReference(paramView); }
  
  public long a() {
    View view = (View)this.b.get();
    return (view != null) ? a.a(this, view) : 0L;
  }
  
  public au a(float paramFloat) {
    View view = (View)this.b.get();
    if (view != null)
      a.a(this, view, paramFloat); 
    return this;
  }
  
  public au a(long paramLong) {
    View view = (View)this.b.get();
    if (view != null)
      a.a(this, view, paramLong); 
    return this;
  }
  
  public au a(ay paramay) {
    View view = (View)this.b.get();
    if (view != null)
      a.a(this, view, paramay); 
    return this;
  }
  
  public au a(ba paramba) {
    View view = (View)this.b.get();
    if (view != null)
      a.a(this, view, paramba); 
    return this;
  }
  
  public au a(Interpolator paramInterpolator) {
    View view = (View)this.b.get();
    if (view != null)
      a.a(this, view, paramInterpolator); 
    return this;
  }
  
  public au b(float paramFloat) {
    View view = (View)this.b.get();
    if (view != null)
      a.b(this, view, paramFloat); 
    return this;
  }
  
  public au b(long paramLong) {
    View view = (View)this.b.get();
    if (view != null)
      a.b(this, view, paramLong); 
    return this;
  }
  
  public void b() {
    View view = (View)this.b.get();
    if (view != null)
      a.b(this, view); 
  }
  
  public void c() {
    View view = (View)this.b.get();
    if (view != null)
      a.c(this, view); 
  }
  
  static class a implements g {
    WeakHashMap<View, Runnable> a = null;
    
    private void a(View param1View) {
      if (this.a != null) {
        Runnable runnable = (Runnable)this.a.get(param1View);
        if (runnable != null)
          param1View.removeCallbacks(runnable); 
      } 
    }
    
    private void d(au param1au, View param1View) {
      Object object = param1View.getTag(2113929216);
      if (object instanceof ay) {
        object = (ay)object;
      } else {
        object = null;
      } 
      Runnable runnable1 = au.a(param1au);
      Runnable runnable2 = au.b(param1au);
      au.b(param1au, null);
      au.a(param1au, null);
      if (runnable1 != null)
        runnable1.run(); 
      if (object != null) {
        object.a(param1View);
        object.b(param1View);
      } 
      if (runnable2 != null)
        runnable2.run(); 
      if (this.a != null)
        this.a.remove(param1View); 
    }
    
    private void e(au param1au, View param1View) {
      Object object;
      if (this.a != null) {
        object = (Runnable)this.a.get(param1View);
      } else {
        object = null;
      } 
      a a1 = object;
      if (object == null) {
        a1 = new a(this, param1au, param1View, null);
        if (this.a == null)
          this.a = new WeakHashMap(); 
        this.a.put(param1View, a1);
      } 
      param1View.removeCallbacks(a1);
      param1View.post(a1);
    }
    
    public long a(au param1au, View param1View) { return 0L; }
    
    public void a(au param1au, View param1View, float param1Float) { e(param1au, param1View); }
    
    public void a(au param1au, View param1View, long param1Long) {}
    
    public void a(au param1au, View param1View, ay param1ay) { param1View.setTag(2113929216, param1ay); }
    
    public void a(au param1au, View param1View, ba param1ba) {}
    
    public void a(au param1au, View param1View, Interpolator param1Interpolator) {}
    
    public void b(au param1au, View param1View) { e(param1au, param1View); }
    
    public void b(au param1au, View param1View, float param1Float) { e(param1au, param1View); }
    
    public void b(au param1au, View param1View, long param1Long) {}
    
    public void c(au param1au, View param1View) {
      a(param1View);
      d(param1au, param1View);
    }
    
    class a implements Runnable {
      WeakReference<View> a;
      
      au b;
      
      private a(au.a this$0, au param2au, View param2View) {
        this.a = new WeakReference(param2View);
        this.b = param2au;
      }
      
      public void run() {
        View view = (View)this.a.get();
        if (view != null)
          au.a.a(this.c, this.b, view); 
      }
    }
  }
  
  class a implements Runnable {
    WeakReference<View> a;
    
    au b;
    
    private a(au this$0, au param1au, View param1View) {
      this.a = new WeakReference(param1View);
      this.b = param1au;
    }
    
    public void run() {
      View view = (View)this.a.get();
      if (view != null)
        au.a.a(this.c, this.b, view); 
    }
  }
  
  static class b extends a {
    WeakHashMap<View, Integer> b = null;
    
    public long a(au param1au, View param1View) { return av.a(param1View); }
    
    public void a(au param1au, View param1View, float param1Float) { av.a(param1View, param1Float); }
    
    public void a(au param1au, View param1View, long param1Long) { av.a(param1View, param1Long); }
    
    public void a(au param1au, View param1View, ay param1ay) {
      param1View.setTag(2113929216, param1ay);
      av.a(param1View, new a(param1au));
    }
    
    public void a(au param1au, View param1View, Interpolator param1Interpolator) { av.a(param1View, param1Interpolator); }
    
    public void b(au param1au, View param1View) { av.b(param1View); }
    
    public void b(au param1au, View param1View, float param1Float) { av.b(param1View, param1Float); }
    
    public void b(au param1au, View param1View, long param1Long) { av.b(param1View, param1Long); }
    
    public void c(au param1au, View param1View) { av.c(param1View); }
    
    static class a implements ay {
      au a;
      
      boolean b;
      
      a(au param2au) { this.a = param2au; }
      
      public void a(View param2View) {
        this.b = false;
        int i = au.c(this.a);
        ay ay1 = null;
        if (i >= 0)
          af.a(param2View, 2, null); 
        if (au.a(this.a) != null) {
          Runnable runnable = au.a(this.a);
          au.b(this.a, null);
          runnable.run();
        } 
        Object object = param2View.getTag(2113929216);
        if (object instanceof ay)
          ay1 = (ay)object; 
        if (ay1 != null)
          ay1.a(param2View); 
      }
      
      public void b(View param2View) {
        int i = au.c(this.a);
        ay ay1 = null;
        if (i >= 0) {
          af.a(param2View, au.c(this.a), null);
          au.a(this.a, -1);
        } 
        if (Build.VERSION.SDK_INT >= 16 || !this.b) {
          if (au.b(this.a) != null) {
            Runnable runnable = au.b(this.a);
            au.a(this.a, null);
            runnable.run();
          } 
          Object object = param2View.getTag(2113929216);
          if (object instanceof ay)
            ay1 = (ay)object; 
          if (ay1 != null)
            ay1.b(param2View); 
          this.b = true;
        } 
      }
      
      public void c(View param2View) {
        Object object = param2View.getTag(2113929216);
        if (object instanceof ay) {
          object = (ay)object;
        } else {
          object = null;
        } 
        if (object != null)
          object.c(param2View); 
      }
    }
  }
  
  static class a implements ay {
    au a;
    
    boolean b;
    
    a(au param1au) { this.a = param1au; }
    
    public void a(View param1View) {
      this.b = false;
      int i = au.c(this.a);
      ay ay1 = null;
      if (i >= 0)
        af.a(param1View, 2, null); 
      if (au.a(this.a) != null) {
        Runnable runnable = au.a(this.a);
        au.b(this.a, null);
        runnable.run();
      } 
      Object object = param1View.getTag(2113929216);
      if (object instanceof ay)
        ay1 = (ay)object; 
      if (ay1 != null)
        ay1.a(param1View); 
    }
    
    public void b(View param1View) {
      int i = au.c(this.a);
      ay ay1 = null;
      if (i >= 0) {
        af.a(param1View, au.c(this.a), null);
        au.a(this.a, -1);
      } 
      if (Build.VERSION.SDK_INT >= 16 || !this.b) {
        if (au.b(this.a) != null) {
          Runnable runnable = au.b(this.a);
          au.a(this.a, null);
          runnable.run();
        } 
        Object object = param1View.getTag(2113929216);
        if (object instanceof ay)
          ay1 = (ay)object; 
        if (ay1 != null)
          ay1.b(param1View); 
        this.b = true;
      } 
    }
    
    public void c(View param1View) {
      Object object = param1View.getTag(2113929216);
      if (object instanceof ay) {
        object = (ay)object;
      } else {
        object = null;
      } 
      if (object != null)
        object.c(param1View); 
    }
  }
  
  static class c extends d {}
  
  static class d extends b {
    public void a(au param1au, View param1View, ay param1ay) { aw.a(param1View, param1ay); }
  }
  
  static class e extends c {
    public void a(au param1au, View param1View, ba param1ba) { ax.a(param1View, param1ba); }
  }
  
  static class f extends e {}
  
  static interface g {
    long a(au param1au, View param1View);
    
    void a(au param1au, View param1View, float param1Float);
    
    void a(au param1au, View param1View, long param1Long);
    
    void a(au param1au, View param1View, ay param1ay);
    
    void a(au param1au, View param1View, ba param1ba);
    
    void a(au param1au, View param1View, Interpolator param1Interpolator);
    
    void b(au param1au, View param1View);
    
    void b(au param1au, View param1View, float param1Float);
    
    void b(au param1au, View param1View, long param1Long);
    
    void c(au param1au, View param1View);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */