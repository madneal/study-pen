package android.support.v4.a;

import android.app.Activity;
import android.os.Build;
import android.support.v4.b.a;

public class a extends a {
  public static void a(Activity paramActivity) {
    if (Build.VERSION.SDK_INT >= 16) {
      c.a(paramActivity);
      return;
    } 
    paramActivity.finish();
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */