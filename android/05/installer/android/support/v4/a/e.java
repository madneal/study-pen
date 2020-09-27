package android.support.v4.a;

import android.app.AppOpsManager;
import android.content.Context;

class e {
  public static int a(Context paramContext, String paramString1, String paramString2) { return ((AppOpsManager)paramContext.getSystemService(AppOpsManager.class)).noteProxyOp(paramString1, paramString2); }
  
  public static String a(String paramString) { return AppOpsManager.permissionToOp(paramString); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */