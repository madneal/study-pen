package android.support.v4.h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

class ao {
  public static bb a(View paramView, bb parambb) {
    bb bb1 = parambb;
    if (parambb instanceof bc) {
      WindowInsets windowInsets2 = ((bc)parambb).e();
      WindowInsets windowInsets1 = paramView.onApplyWindowInsets(windowInsets2);
      bb1 = parambb;
      if (windowInsets1 != windowInsets2)
        bb1 = new bc(windowInsets1); 
    } 
    return bb1;
  }
  
  public static void a(View paramView) { paramView.requestApplyInsets(); }
  
  public static void a(View paramView, float paramFloat) { paramView.setElevation(paramFloat); }
  
  static void a(View paramView, ColorStateList paramColorStateList) {
    paramView.setBackgroundTintList(paramColorStateList);
    if (Build.VERSION.SDK_INT == 21) {
      boolean bool;
      Drawable drawable = paramView.getBackground();
      if (paramView.getBackgroundTintList() != null && paramView.getBackgroundTintMode() != null) {
        bool = true;
      } else {
        bool = false;
      } 
      if (drawable != null && bool) {
        if (drawable.isStateful())
          drawable.setState(paramView.getDrawableState()); 
        paramView.setBackground(drawable);
      } 
    } 
  }
  
  static void a(View paramView, PorterDuff.Mode paramMode) {
    paramView.setBackgroundTintMode(paramMode);
    if (Build.VERSION.SDK_INT == 21) {
      boolean bool;
      Drawable drawable = paramView.getBackground();
      if (paramView.getBackgroundTintList() != null && paramView.getBackgroundTintMode() != null) {
        bool = true;
      } else {
        bool = false;
      } 
      if (drawable != null && bool) {
        if (drawable.isStateful())
          drawable.setState(paramView.getDrawableState()); 
        paramView.setBackground(drawable);
      } 
    } 
  }
  
  public static void a(View paramView, aa paramaa) {
    if (paramaa == null) {
      paramView.setOnApplyWindowInsetsListener(null);
      return;
    } 
    paramView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(paramaa) {
          public WindowInsets onApplyWindowInsets(View param1View, WindowInsets param1WindowInsets) {
            bc bc = new bc(param1WindowInsets);
            return ((bc)this.a.a(param1View, bc)).e();
          }
        });
  }
  
  static ColorStateList b(View paramView) { return paramView.getBackgroundTintList(); }
  
  static PorterDuff.Mode c(View paramView) { return paramView.getBackgroundTintMode(); }
  
  public static void d(View paramView) { paramView.stopNestedScroll(); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */