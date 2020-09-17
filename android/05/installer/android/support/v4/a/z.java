package android.support.v4.a;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

class z extends FrameLayout {
  public z(Context paramContext) { super(paramContext); }
  
  static ViewGroup a(View paramView) {
    z z1 = new z(paramView.getContext());
    ViewGroup.LayoutParams layoutParams = paramView.getLayoutParams();
    if (layoutParams != null)
      z1.setLayoutParams(layoutParams); 
    paramView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    z1.addView(paramView);
    return z1;
  }
  
  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray) { dispatchThawSelfOnly(paramSparseArray); }
  
  protected void dispatchSaveInstanceState(SparseArray<Parcelable> paramSparseArray) { dispatchFreezeSelfOnly(paramSparseArray); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/a/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */