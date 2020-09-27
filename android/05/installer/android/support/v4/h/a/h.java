package android.support.v4.h.a;

import android.os.Build;

public class h {
  private static final c a;
  
  private final Object b;
  
  static  {
    e e;
    if (Build.VERSION.SDK_INT >= 16) {
      e = new d();
    } else if (Build.VERSION.SDK_INT >= 15) {
      e = new b();
    } else if (Build.VERSION.SDK_INT >= 14) {
      e = new a();
    } else {
      e = new e();
    } 
    a = e;
  }
  
  public h(Object paramObject) { this.b = paramObject; }
  
  public void a(int paramInt) { a.a(this.b, paramInt); }
  
  public void a(boolean paramBoolean) { a.a(this.b, paramBoolean); }
  
  public void b(int paramInt) { a.b(this.b, paramInt); }
  
  public void c(int paramInt) { a.c(this.b, paramInt); }
  
  public void d(int paramInt) { a.d(this.b, paramInt); }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    paramObject = (h)paramObject;
    if (this.b == null) {
      if (paramObject.b != null)
        return false; 
    } else if (!this.b.equals(paramObject.b)) {
      return false;
    } 
    return true;
  }
  
  public int hashCode() { return (this.b == null) ? 0 : this.b.hashCode(); }
  
  static class a extends e {
    public void a(Object param1Object, int param1Int) { i.a(param1Object, param1Int); }
    
    public void a(Object param1Object, boolean param1Boolean) { i.a(param1Object, param1Boolean); }
    
    public void b(Object param1Object, int param1Int) { i.b(param1Object, param1Int); }
  }
  
  static class b extends a {
    public void c(Object param1Object, int param1Int) { j.a(param1Object, param1Int); }
    
    public void d(Object param1Object, int param1Int) { j.b(param1Object, param1Int); }
  }
  
  static interface c {
    void a(Object param1Object, int param1Int);
    
    void a(Object param1Object, boolean param1Boolean);
    
    void b(Object param1Object, int param1Int);
    
    void c(Object param1Object, int param1Int);
    
    void d(Object param1Object, int param1Int);
  }
  
  static class d extends b {}
  
  static class e implements c {
    public void a(Object param1Object, int param1Int) {}
    
    public void a(Object param1Object, boolean param1Boolean) {}
    
    public void b(Object param1Object, int param1Int) {}
    
    public void c(Object param1Object, int param1Int) {}
    
    public void d(Object param1Object, int param1Int) {}
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */