package android.support.v4.b;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;

public class a {
  public static final Drawable a(Context paramContext, int paramInt) { return (Build.VERSION.SDK_INT >= 21) ? b.a(paramContext, paramInt) : paramContext.getResources().getDrawable(paramInt); }
  
  public static boolean a(Context paramContext, Intent[] paramArrayOfIntent, Bundle paramBundle) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 16) {
      d.a(paramContext, paramArrayOfIntent, paramBundle);
      return true;
    } 
    if (i >= 11) {
      c.a(paramContext, paramArrayOfIntent);
      return true;
    } 
    return false;
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */