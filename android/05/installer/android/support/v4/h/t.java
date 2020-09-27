package android.support.v4.h;

import android.view.MotionEvent;

class t {
  public static int a(MotionEvent paramMotionEvent, int paramInt) { return paramMotionEvent.findPointerIndex(paramInt); }
  
  public static int b(MotionEvent paramMotionEvent, int paramInt) { return paramMotionEvent.getPointerId(paramInt); }
  
  public static float c(MotionEvent paramMotionEvent, int paramInt) { return paramMotionEvent.getX(paramInt); }
  
  public static float d(MotionEvent paramMotionEvent, int paramInt) { return paramMotionEvent.getY(paramInt); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */