package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build;
import android.support.v4.d.a.a;
import android.support.v4.d.a.b;
import android.support.v4.d.a.c;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

public final class n {
  public static Menu a(Context paramContext, a parama) {
    if (Build.VERSION.SDK_INT >= 14)
      return new o(paramContext, parama); 
    throw new UnsupportedOperationException();
  }
  
  public static MenuItem a(Context paramContext, b paramb) {
    if (Build.VERSION.SDK_INT >= 16)
      return new j(paramContext, paramb); 
    if (Build.VERSION.SDK_INT >= 14)
      return new i(paramContext, paramb); 
    throw new UnsupportedOperationException();
  }
  
  public static SubMenu a(Context paramContext, c paramc) {
    if (Build.VERSION.SDK_INT >= 14)
      return new q(paramContext, paramc); 
    throw new UnsupportedOperationException();
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/view/menu/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */