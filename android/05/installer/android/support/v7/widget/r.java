package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.v4.widget.o;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

public class r extends PopupWindow {
  private static final boolean a;
  
  private boolean b;
  
  static  {
    boolean bool;
    if (Build.VERSION.SDK_INT < 21) {
      bool = true;
    } else {
      bool = false;
    } 
    a = bool;
  }
  
  public r(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    ar ar = ar.a(paramContext, paramAttributeSet, a.k.PopupWindow, paramInt, 0);
    if (ar.f(a.k.PopupWindow_overlapAnchor))
      a(ar.a(a.k.PopupWindow_overlapAnchor, false)); 
    setBackgroundDrawable(ar.a(a.k.PopupWindow_android_popupBackground));
    ar.a();
    if (Build.VERSION.SDK_INT < 14)
      a(this); 
  }
  
  private static void a(PopupWindow paramPopupWindow) {
    try {
      Field field1 = PopupWindow.class.getDeclaredField("mAnchor");
      field1.setAccessible(true);
      Field field2 = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
      field2.setAccessible(true);
      ViewTreeObserver.OnScrollChangedListener onScrollChangedListener1 = (ViewTreeObserver.OnScrollChangedListener)field2.get(paramPopupWindow);
      ViewTreeObserver.OnScrollChangedListener onScrollChangedListener2 = new ViewTreeObserver.OnScrollChangedListener() {
          public void onScrollChanged() {
            try {
              WeakReference weakReference = (WeakReference)this.a.get(this.b);
              if (weakReference != null) {
                if (weakReference.get() == null)
                  return; 
                this.c.onScrollChanged();
                return;
              } 
            } catch (IllegalAccessException illegalAccessException) {}
          }
        };
      super(field1, paramPopupWindow, onScrollChangedListener1);
      field2.set(paramPopupWindow, onScrollChangedListener2);
      return;
    } catch (Exception paramPopupWindow) {
      Log.d("AppCompatPopupWindow", "Exception while installing workaround OnScrollChangedListener", paramPopupWindow);
      return;
    } 
  }
  
  public void a(boolean paramBoolean) {
    if (a) {
      this.b = paramBoolean;
      return;
    } 
    o.a(this, paramBoolean);
  }
  
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2) {
    int i = paramInt2;
    if (a) {
      i = paramInt2;
      if (this.b)
        i = paramInt2 - paramView.getHeight(); 
    } 
    super.showAsDropDown(paramView, paramInt1, i);
  }
  
  @TargetApi(19)
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt2;
    if (a) {
      i = paramInt2;
      if (this.b)
        i = paramInt2 - paramView.getHeight(); 
    } 
    super.showAsDropDown(paramView, paramInt1, i, paramInt3);
  }
  
  public void update(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt2;
    if (a) {
      i = paramInt2;
      if (this.b)
        i = paramInt2 - paramView.getHeight(); 
    } 
    super.update(paramView, paramInt1, i, paramInt3, paramInt4);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */