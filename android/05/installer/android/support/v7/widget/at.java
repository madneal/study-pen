package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.a.f;
import java.lang.ref.WeakReference;

public class at extends Resources {
  private final WeakReference<Context> a;
  
  public at(Context paramContext, Resources paramResources) {
    super(paramResources.getAssets(), paramResources.getDisplayMetrics(), paramResources.getConfiguration());
    this.a = new WeakReference(paramContext);
  }
  
  public static boolean a() { return (f.j() && Build.VERSION.SDK_INT <= 20); }
  
  final Drawable a(int paramInt) { return super.getDrawable(paramInt); }
  
  public Drawable getDrawable(int paramInt) {
    Context context = (Context)this.a.get();
    return (context != null) ? l.a().a(context, this, paramInt) : super.getDrawable(paramInt);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */