package android.support.v4.h;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;

class av {
  public static long a(View paramView) { return paramView.animate().getDuration(); }
  
  public static void a(View paramView, float paramFloat) { paramView.animate().alpha(paramFloat); }
  
  public static void a(View paramView, long paramLong) { paramView.animate().setDuration(paramLong); }
  
  public static void a(View paramView, ay paramay) {
    if (paramay != null) {
      paramView.animate().setListener(new AnimatorListenerAdapter(paramay, paramView) {
            public void onAnimationCancel(Animator param1Animator) { this.a.c(this.b); }
            
            public void onAnimationEnd(Animator param1Animator) { this.a.b(this.b); }
            
            public void onAnimationStart(Animator param1Animator) { this.a.a(this.b); }
          });
      return;
    } 
    paramView.animate().setListener(null);
  }
  
  public static void a(View paramView, Interpolator paramInterpolator) { paramView.animate().setInterpolator(paramInterpolator); }
  
  public static void b(View paramView) { paramView.animate().cancel(); }
  
  public static void b(View paramView, float paramFloat) { paramView.animate().translationY(paramFloat); }
  
  public static void b(View paramView, long paramLong) { paramView.animate().setStartDelay(paramLong); }
  
  public static void c(View paramView) { paramView.animate().start(); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */