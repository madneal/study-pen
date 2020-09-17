package android.support.v4.h;

import android.view.MenuItem;
import android.view.View;

class q {
  public static MenuItem a(MenuItem paramMenuItem, View paramView) { return paramMenuItem.setActionView(paramView); }
  
  public static View a(MenuItem paramMenuItem) { return paramMenuItem.getActionView(); }
  
  public static void a(MenuItem paramMenuItem, int paramInt) { paramMenuItem.setShowAsAction(paramInt); }
  
  public static MenuItem b(MenuItem paramMenuItem, int paramInt) { return paramMenuItem.setActionView(paramInt); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */