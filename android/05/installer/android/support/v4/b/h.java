package android.support.v4.b;

import android.content.Context;
import android.os.Process;
import android.support.v4.a.d;

public final class h {
  public static int a(Context paramContext, String paramString) { return a(paramContext, paramString, Process.myPid(), Process.myUid(), paramContext.getPackageName()); }
  
  public static int a(Context paramContext, String paramString1, int paramInt1, int paramInt2, String paramString2) {
    String str1;
    if (paramContext.checkPermission(paramString1, paramInt1, paramInt2) == -1)
      return -1; 
    String str2 = d.a(paramString1);
    if (str2 == null)
      return 0; 
    paramString1 = paramString2;
    if (paramString2 == null) {
      str1 = paramContext.getPackageManager().getPackagesForUid(paramInt2);
      if (str1 != null) {
        if (str1.length <= 0)
          return -1; 
        str1 = str1[0];
      } else {
        return -1;
      } 
    } 
    return (d.a(paramContext, str2, str1) != 0) ? -2 : 0;
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */