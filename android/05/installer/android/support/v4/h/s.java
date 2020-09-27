package android.support.v4.h;

import android.os.Build;
import android.view.MotionEvent;

public final class s {
  static final e a;
  
  static  {
    a a1;
    if (Build.VERSION.SDK_INT >= 12) {
      a1 = new d();
    } else if (Build.VERSION.SDK_INT >= 9) {
      a1 = new c();
    } else if (Build.VERSION.SDK_INT >= 5) {
      a1 = new b();
    } else {
      a1 = new a();
    } 
    a = a1;
  }
  
  public static int a(MotionEvent paramMotionEvent) { return paramMotionEvent.getAction() & 0xFF; }
  
  public static int a(MotionEvent paramMotionEvent, int paramInt) { return a.a(paramMotionEvent, paramInt); }
  
  public static int b(MotionEvent paramMotionEvent) { return (paramMotionEvent.getAction() & 0xFF00) >> 8; }
  
  public static int b(MotionEvent paramMotionEvent, int paramInt) { return a.b(paramMotionEvent, paramInt); }
  
  public static float c(MotionEvent paramMotionEvent, int paramInt) { return a.c(paramMotionEvent, paramInt); }
  
  public static int c(MotionEvent paramMotionEvent) { return a.a(paramMotionEvent); }
  
  public static float d(MotionEvent paramMotionEvent, int paramInt) { return a.d(paramMotionEvent, paramInt); }
  
  public static float e(MotionEvent paramMotionEvent, int paramInt) { return a.e(paramMotionEvent, paramInt); }
  
  static class a implements e {
    public int a(MotionEvent param1MotionEvent) { return 0; }
    
    public int a(MotionEvent param1MotionEvent, int param1Int) { return (param1Int == 0) ? 0 : -1; }
    
    public int b(MotionEvent param1MotionEvent, int param1Int) {
      if (param1Int == 0)
        return 0; 
      throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }
    
    public float c(MotionEvent param1MotionEvent, int param1Int) {
      if (param1Int == 0)
        return param1MotionEvent.getX(); 
      throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }
    
    public float d(MotionEvent param1MotionEvent, int param1Int) {
      if (param1Int == 0)
        return param1MotionEvent.getY(); 
      throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }
    
    public float e(MotionEvent param1MotionEvent, int param1Int) { return 0.0F; }
  }
  
  static class b extends a {
    public int a(MotionEvent param1MotionEvent, int param1Int) { return t.a(param1MotionEvent, param1Int); }
    
    public int b(MotionEvent param1MotionEvent, int param1Int) { return t.b(param1MotionEvent, param1Int); }
    
    public float c(MotionEvent param1MotionEvent, int param1Int) { return t.c(param1MotionEvent, param1Int); }
    
    public float d(MotionEvent param1MotionEvent, int param1Int) { return t.d(param1MotionEvent, param1Int); }
  }
  
  static class c extends b {
    public int a(MotionEvent param1MotionEvent) { return u.a(param1MotionEvent); }
  }
  
  static class d extends c {
    public float e(MotionEvent param1MotionEvent, int param1Int) { return v.a(param1MotionEvent, param1Int); }
  }
  
  static interface e {
    int a(MotionEvent param1MotionEvent);
    
    int a(MotionEvent param1MotionEvent, int param1Int);
    
    int b(MotionEvent param1MotionEvent, int param1Int);
    
    float c(MotionEvent param1MotionEvent, int param1Int);
    
    float d(MotionEvent param1MotionEvent, int param1Int);
    
    float e(MotionEvent param1MotionEvent, int param1Int);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */