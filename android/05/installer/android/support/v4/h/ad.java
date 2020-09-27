package android.support.v4.h;

import android.os.Build;
import android.view.VelocityTracker;

public final class ad {
  static final c a;
  
  static  {
    a a1;
    if (Build.VERSION.SDK_INT >= 11) {
      a1 = new b();
    } else {
      a1 = new a();
    } 
    a = a1;
  }
  
  public static float a(VelocityTracker paramVelocityTracker, int paramInt) { return a.a(paramVelocityTracker, paramInt); }
  
  static class a implements c {
    public float a(VelocityTracker param1VelocityTracker, int param1Int) { return param1VelocityTracker.getYVelocity(); }
  }
  
  static class b implements c {
    public float a(VelocityTracker param1VelocityTracker, int param1Int) { return ae.a(param1VelocityTracker, param1Int); }
  }
  
  static interface c {
    float a(VelocityTracker param1VelocityTracker, int param1Int);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */