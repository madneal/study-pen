package android.support.v7.view;

import android.support.v4.h.au;
import android.support.v4.h.ay;
import android.support.v4.h.az;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public class h {
  private final ArrayList<au> a = new ArrayList();
  
  private long b = -1L;
  
  private Interpolator c;
  
  private ay d;
  
  private boolean e;
  
  private final az f = new az(this) {
      private boolean b = false;
      
      private int c = 0;
      
      void a() {
        this.c = 0;
        this.b = false;
        h.b(this.a);
      }
      
      public void a(View param1View) {
        if (this.b)
          return; 
        this.b = true;
        if (h.a(this.a) != null)
          h.a(this.a).a(null); 
      }
      
      public void b(View param1View) {
        int i = this.c + 1;
        this.c = i;
        if (i == h.c(this.a).size()) {
          if (h.a(this.a) != null)
            h.a(this.a).b(null); 
          a();
        } 
      }
    };
  
  private void c() { this.e = false; }
  
  public h a(long paramLong) {
    if (!this.e)
      this.b = paramLong; 
    return this;
  }
  
  public h a(au paramau) {
    if (!this.e)
      this.a.add(paramau); 
    return this;
  }
  
  public h a(au paramau1, au paramau2) {
    this.a.add(paramau1);
    paramau2.b(paramau1.a());
    this.a.add(paramau2);
    return this;
  }
  
  public h a(ay paramay) {
    if (!this.e)
      this.d = paramay; 
    return this;
  }
  
  public h a(Interpolator paramInterpolator) {
    if (!this.e)
      this.c = paramInterpolator; 
    return this;
  }
  
  public void a() {
    if (this.e)
      return; 
    for (au au : this.a) {
      if (this.b >= 0L)
        au.a(this.b); 
      if (this.c != null)
        au.a(this.c); 
      if (this.d != null)
        au.a(this.f); 
      au.c();
    } 
    this.e = true;
  }
  
  public void b() {
    if (!this.e)
      return; 
    Iterator iterator = this.a.iterator();
    while (iterator.hasNext())
      ((au)iterator.next()).b(); 
    this.e = false;
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/view/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */