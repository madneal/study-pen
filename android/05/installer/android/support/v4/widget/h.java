package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;

public final class h {
  private static final c b;
  
  private Object a;
  
  static  {
    a a1;
    if (Build.VERSION.SDK_INT >= 21) {
      a1 = new d();
    } else if (Build.VERSION.SDK_INT >= 14) {
      a1 = new b();
    } else {
      a1 = new a();
    } 
    b = a1;
  }
  
  public h(Context paramContext) { this.a = b.a(paramContext); }
  
  public void a(int paramInt1, int paramInt2) { b.a(this.a, paramInt1, paramInt2); }
  
  public boolean a() { return b.a(this.a); }
  
  public boolean a(float paramFloat1, float paramFloat2) { return b.a(this.a, paramFloat1, paramFloat2); }
  
  public boolean a(int paramInt) { return b.a(this.a, paramInt); }
  
  public boolean a(Canvas paramCanvas) { return b.a(this.a, paramCanvas); }
  
  public boolean b() { return b.b(this.a); }
  
  static class a implements c {
    public Object a(Context param1Context) { return null; }
    
    public void a(Object param1Object, int param1Int1, int param1Int2) {}
    
    public boolean a(Object param1Object) { return true; }
    
    public boolean a(Object param1Object, float param1Float1, float param1Float2) { return false; }
    
    public boolean a(Object param1Object, int param1Int) { return false; }
    
    public boolean a(Object param1Object, Canvas param1Canvas) { return false; }
    
    public boolean b(Object param1Object) { return false; }
  }
  
  static class b implements c {
    public Object a(Context param1Context) { return i.a(param1Context); }
    
    public void a(Object param1Object, int param1Int1, int param1Int2) { i.a(param1Object, param1Int1, param1Int2); }
    
    public boolean a(Object param1Object) { return i.a(param1Object); }
    
    public boolean a(Object param1Object, float param1Float1, float param1Float2) { return i.a(param1Object, param1Float1); }
    
    public boolean a(Object param1Object, int param1Int) { return i.a(param1Object, param1Int); }
    
    public boolean a(Object param1Object, Canvas param1Canvas) { return i.a(param1Object, param1Canvas); }
    
    public boolean b(Object param1Object) { return i.b(param1Object); }
  }
  
  static interface c {
    Object a(Context param1Context);
    
    void a(Object param1Object, int param1Int1, int param1Int2);
    
    boolean a(Object param1Object);
    
    boolean a(Object param1Object, float param1Float1, float param1Float2);
    
    boolean a(Object param1Object, int param1Int);
    
    boolean a(Object param1Object, Canvas param1Canvas);
    
    boolean b(Object param1Object);
  }
  
  static class d extends b {
    public boolean a(Object param1Object, float param1Float1, float param1Float2) { return j.a(param1Object, param1Float1, param1Float2); }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/widget/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */