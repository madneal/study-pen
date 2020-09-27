package android.support.v4.h;

import android.view.View;

class al {
  public static void a(View paramView) { paramView.postInvalidateOnAnimation(); }
  
  public static void a(View paramView, Runnable paramRunnable) { paramView.postOnAnimation(paramRunnable); }
  
  public static void a(View paramView, Runnable paramRunnable, long paramLong) { paramView.postOnAnimationDelayed(paramRunnable, paramLong); }
  
  public static int b(View paramView) { return paramView.getMinimumHeight(); }
  
  public static void c(View paramView) { paramView.requestFitSystemWindows(); }
  
  public static boolean d(View paramView) { return paramView.hasOverlappingRendering(); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */