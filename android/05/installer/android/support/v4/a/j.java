package android.support.v4.a;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

abstract class j extends i {
  public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    View view = a(paramView, paramString, paramContext, paramAttributeSet);
    return (view == null && Build.VERSION.SDK_INT >= 11) ? super.onCreateView(paramView, paramString, paramContext, paramAttributeSet) : view;
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */