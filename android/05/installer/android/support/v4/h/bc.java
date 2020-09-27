package android.support.v4.h;

import android.view.WindowInsets;

class bc extends bb {
  private final WindowInsets a;
  
  bc(WindowInsets paramWindowInsets) { this.a = paramWindowInsets; }
  
  public int a() { return this.a.getSystemWindowInsetLeft(); }
  
  public bb a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { return new bc(this.a.replaceSystemWindowInsets(paramInt1, paramInt2, paramInt3, paramInt4)); }
  
  public int b() { return this.a.getSystemWindowInsetTop(); }
  
  public int c() { return this.a.getSystemWindowInsetRight(); }
  
  public int d() { return this.a.getSystemWindowInsetBottom(); }
  
  WindowInsets e() { return this.a; }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */