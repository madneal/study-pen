package android.support.v4.h;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

class ai {
  public static int a(int paramInt1, int paramInt2, int paramInt3) { return View.resolveSizeAndState(paramInt1, paramInt2, paramInt3); }
  
  public static int a(View paramView) { return paramView.getLayerType(); }
  
  static long a() { return ValueAnimator.getFrameDelay(); }
  
  public static void a(View paramView, float paramFloat) { paramView.setTranslationY(paramFloat); }
  
  public static void a(View paramView, int paramInt, Paint paramPaint) { paramView.setLayerType(paramInt, paramPaint); }
  
  public static void a(View paramView, boolean paramBoolean) { paramView.setSaveFromParentEnabled(paramBoolean); }
  
  public static int b(View paramView) { return paramView.getMeasuredWidthAndState(); }
  
  public static void b(View paramView, float paramFloat) { paramView.setAlpha(paramFloat); }
  
  public static void b(View paramView, boolean paramBoolean) { paramView.setActivated(paramBoolean); }
  
  public static int c(View paramView) { return paramView.getMeasuredState(); }
  
  public static float d(View paramView) { return paramView.getTranslationY(); }
  
  public static void e(View paramView) { paramView.jumpDrawablesToCurrentState(); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */