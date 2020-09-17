package android.support.v4.b;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;

public final class e {
  private static final a a;
  
  static  {
    b b;
    int i = Build.VERSION.SDK_INT;
    if (i >= 15) {
      b = new d();
    } else if (i >= 11) {
      b = new c();
    } else {
      b = new b();
    } 
    a = b;
  }
  
  public static Intent a(ComponentName paramComponentName) { return a.a(paramComponentName); }
  
  static interface a {
    Intent a(ComponentName param1ComponentName);
  }
  
  static class b implements a {
    public Intent a(ComponentName param1ComponentName) {
      Intent intent = new Intent("android.intent.action.MAIN");
      intent.setComponent(param1ComponentName);
      intent.addCategory("android.intent.category.LAUNCHER");
      return intent;
    }
  }
  
  static class c extends b {
    public Intent a(ComponentName param1ComponentName) { return f.a(param1ComponentName); }
  }
  
  static class d extends c {}
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */