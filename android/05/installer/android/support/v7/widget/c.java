package android.support.v7.widget;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;

class c extends b {
  public c(ActionBarContainer paramActionBarContainer) { super(paramActionBarContainer); }
  
  public void getOutline(Outline paramOutline) {
    Drawable drawable;
    if (this.a.d) {
      if (this.a.c != null) {
        drawable = this.a.c;
      } else {
        return;
      } 
    } else if (this.a.a != null) {
      drawable = this.a.a;
    } else {
      return;
    } 
    drawable.getOutline(paramOutline);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */