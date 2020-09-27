package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

class aq extends ai {
  private final WeakReference<Context> a;
  
  public aq(Context paramContext, Resources paramResources) {
    super(paramResources);
    this.a = new WeakReference(paramContext);
  }
  
  public Drawable getDrawable(int paramInt) {
    Drawable drawable = super.getDrawable(paramInt);
    Context context = (Context)this.a.get();
    if (drawable != null && context != null)
      l.a().a(context, paramInt, drawable); 
    return drawable;
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */