package android.support.v4.h;

import android.animation.ValueAnimator;
import android.view.View;

class ax {
  public static void a(View paramView, ba paramba) {
    if (paramba != null) {
      ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener(paramba, paramView) {
          public void onAnimationUpdate(ValueAnimator param1ValueAnimator) { this.a.a(this.b); }
        };
    } else {
      paramba = null;
    } 
    paramView.animate().setUpdateListener(paramba);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */