package android.support.v4.h;

import android.os.Build;
import android.view.LayoutInflater;

public final class i {
  static final a a;
  
  static  {
    b b;
    int j = Build.VERSION.SDK_INT;
    if (j >= 21) {
      b = new d();
    } else if (j >= 11) {
      b = new c();
    } else {
      b = new b();
    } 
    a = b;
  }
  
  public static m a(LayoutInflater paramLayoutInflater) { return a.a(paramLayoutInflater); }
  
  public static void a(LayoutInflater paramLayoutInflater, m paramm) { a.a(paramLayoutInflater, paramm); }
  
  static interface a {
    m a(LayoutInflater param1LayoutInflater);
    
    void a(LayoutInflater param1LayoutInflater, m param1m);
  }
  
  static class b implements a {
    public m a(LayoutInflater param1LayoutInflater) { return j.a(param1LayoutInflater); }
    
    public void a(LayoutInflater param1LayoutInflater, m param1m) { j.a(param1LayoutInflater, param1m); }
  }
  
  static class c extends b {
    public void a(LayoutInflater param1LayoutInflater, m param1m) { k.a(param1LayoutInflater, param1m); }
  }
  
  static class d extends c {
    public void a(LayoutInflater param1LayoutInflater, m param1m) { l.a(param1LayoutInflater, param1m); }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */