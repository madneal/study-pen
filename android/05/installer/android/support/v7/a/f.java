package android.support.v7.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public abstract class f {
  private static int a = -1;
  
  private static boolean b = false;
  
  static  {
  
  }
  
  public static f a(Activity paramActivity, e parame) { return a(paramActivity, paramActivity.getWindow(), parame); }
  
  public static f a(Dialog paramDialog, e parame) { return a(paramDialog.getContext(), paramDialog.getWindow(), parame); }
  
  private static f a(Context paramContext, Window paramWindow, e parame) {
    int i = Build.VERSION.SDK_INT;
    return (i >= 23) ? new j(paramContext, paramWindow, parame) : ((i >= 14) ? new i(paramContext, paramWindow, parame) : ((i >= 11) ? new h(paramContext, paramWindow, parame) : new k(paramContext, paramWindow, parame)));
  }
  
  public static int i() { return a; }
  
  public static boolean j() { return b; }
  
  public abstract a a();
  
  public abstract View a(int paramInt);
  
  public abstract void a(Configuration paramConfiguration);
  
  public abstract void a(Bundle paramBundle);
  
  public abstract void a(View paramView);
  
  public abstract void a(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract void a(CharSequence paramCharSequence);
  
  public abstract MenuInflater b();
  
  public abstract void b(int paramInt);
  
  public abstract void b(Bundle paramBundle);
  
  public abstract void b(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract void c();
  
  public abstract void c(Bundle paramBundle);
  
  public abstract boolean c(int paramInt);
  
  public abstract void d();
  
  public abstract void e();
  
  public abstract void f();
  
  public abstract void g();
  
  public abstract boolean h();
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */