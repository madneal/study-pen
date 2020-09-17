package android.support.v4.h;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class aw {
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
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */