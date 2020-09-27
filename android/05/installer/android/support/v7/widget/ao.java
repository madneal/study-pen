package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.os.Build;
import android.support.v7.a.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class ao extends ContextWrapper {
  private static final ArrayList<WeakReference<ao>> a = new ArrayList();
  
  private Resources b;
  
  private final Resources.Theme c;
  
  private ao(Context paramContext) {
    super(paramContext);
    if (at.a()) {
      this.c = getResources().newTheme();
      this.c.setTo(paramContext.getTheme());
      return;
    } 
    this.c = null;
  }
  
  public static Context a(Context paramContext) {
    ao ao1;
    if (b(paramContext)) {
      byte b1 = 0;
      int i = a.size();
      while (b1 < i) {
        WeakReference weakReference = (WeakReference)a.get(b1);
        if (weakReference != null) {
          ao ao2 = (ao)weakReference.get();
        } else {
          weakReference = null;
        } 
        if (weakReference != null && weakReference.getBaseContext() == paramContext)
          return weakReference; 
        b1++;
      } 
      ao1 = new ao(paramContext);
      a.add(new WeakReference(ao1));
      return ao1;
    } 
    return ao1;
  }
  
  private static boolean b(Context paramContext) { return (!(paramContext instanceof ao) && !(paramContext.getResources() instanceof aq)) ? ((paramContext.getResources() instanceof at) ? false : (!(f.j() && Build.VERSION.SDK_INT > 20))) : false; }
  
  public Resources getResources() {
    if (this.b == null) {
      at at;
      if (this.c == null) {
        at = new aq(this, super.getResources());
      } else {
        at = new at(this, super.getResources());
      } 
      this.b = at;
    } 
    return this.b;
  }
  
  public Resources.Theme getTheme() { return (this.c == null) ? super.getTheme() : this.c; }
  
  public void setTheme(int paramInt) {
    if (this.c == null) {
      super.setTheme(paramInt);
      return;
    } 
    this.c.applyStyle(paramInt, true);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */