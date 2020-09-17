package android.support.v4.a;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.b.e;
import android.util.Log;

public final class x {
  private static final a a;
  
  static  {
    b b;
    if (Build.VERSION.SDK_INT >= 16) {
      b = new c();
    } else {
      b = new b();
    } 
    a = b;
  }
  
  public static Intent a(Activity paramActivity) { return a.a(paramActivity); }
  
  public static Intent a(Context paramContext, ComponentName paramComponentName) {
    String str = b(paramContext, paramComponentName);
    if (str == null)
      return null; 
    paramComponentName = new ComponentName(paramComponentName.getPackageName(), str);
    return (b(paramContext, paramComponentName) == null) ? e.a(paramComponentName) : (new Intent()).setComponent(paramComponentName);
  }
  
  public static boolean a(Activity paramActivity, Intent paramIntent) { return a.a(paramActivity, paramIntent); }
  
  public static String b(Activity paramActivity) {
    try {
      return b(paramActivity, paramActivity.getComponentName());
    } catch (android.content.pm.PackageManager.NameNotFoundException paramActivity) {
      throw new IllegalArgumentException(paramActivity);
    } 
  }
  
  public static String b(Context paramContext, ComponentName paramComponentName) {
    ActivityInfo activityInfo = paramContext.getPackageManager().getActivityInfo(paramComponentName, 128);
    return a.a(paramContext, activityInfo);
  }
  
  public static void b(Activity paramActivity, Intent paramIntent) { a.b(paramActivity, paramIntent); }
  
  static interface a {
    Intent a(Activity param1Activity);
    
    String a(Context param1Context, ActivityInfo param1ActivityInfo);
    
    boolean a(Activity param1Activity, Intent param1Intent);
    
    void b(Activity param1Activity, Intent param1Intent);
  }
  
  static class b implements a {
    public Intent a(Activity param1Activity) {
      String str = x.b(param1Activity);
      if (str == null)
        return null; 
      ComponentName componentName = new ComponentName(param1Activity, str);
      try {
        if (x.b(param1Activity, componentName) == null)
          return e.a(componentName); 
        null = new Intent();
        this();
        return null.setComponent(componentName);
      } catch (android.content.pm.PackageManager.NameNotFoundException param1Activity) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("getParentActivityIntent: bad parentActivityName '");
        stringBuilder.append(str);
        stringBuilder.append("' in manifest");
        Log.e("NavUtils", stringBuilder.toString());
        return null;
      } 
    }
    
    public String a(Context param1Context, ActivityInfo param1ActivityInfo) {
      if (param1ActivityInfo.metaData == null)
        return null; 
      String str2 = param1ActivityInfo.metaData.getString("android.support.PARENT_ACTIVITY");
      if (str2 == null)
        return null; 
      String str1 = str2;
      if (str2.charAt(0) == '.') {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(param1Context.getPackageName());
        stringBuilder.append(str2);
        str1 = stringBuilder.toString();
      } 
      return str1;
    }
    
    public boolean a(Activity param1Activity, Intent param1Intent) {
      String str = param1Activity.getIntent().getAction();
      return (str != null && !str.equals("android.intent.action.MAIN"));
    }
    
    public void b(Activity param1Activity, Intent param1Intent) {
      param1Intent.addFlags(67108864);
      param1Activity.startActivity(param1Intent);
      param1Activity.finish();
    }
  }
  
  static class c extends b {
    public Intent a(Activity param1Activity) {
      Intent intent1 = y.a(param1Activity);
      Intent intent2 = intent1;
      if (intent1 == null)
        intent2 = b(param1Activity); 
      return intent2;
    }
    
    public String a(Context param1Context, ActivityInfo param1ActivityInfo) {
      String str1 = y.a(param1ActivityInfo);
      String str2 = str1;
      if (str1 == null)
        str2 = super.a(param1Context, param1ActivityInfo); 
      return str2;
    }
    
    public boolean a(Activity param1Activity, Intent param1Intent) { return y.a(param1Activity, param1Intent); }
    
    Intent b(Activity param1Activity) { return super.a(param1Activity); }
    
    public void b(Activity param1Activity, Intent param1Intent) { y.b(param1Activity, param1Intent); }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/a/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */