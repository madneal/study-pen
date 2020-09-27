package android.support.v4.b.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;

public final class a {
  public static Drawable a(Resources paramResources, int paramInt, Resources.Theme paramTheme) { return (Build.VERSION.SDK_INT >= 21) ? b.a(paramResources, paramInt, paramTheme) : paramResources.getDrawable(paramInt); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */