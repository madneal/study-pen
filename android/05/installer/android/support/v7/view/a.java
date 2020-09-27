package android.support.v7.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v4.h.aq;
import android.support.v7.b.a;
import android.view.ViewConfiguration;

public class a {
  private Context a;
  
  private a(Context paramContext) { this.a = paramContext; }
  
  public static a a(Context paramContext) { return new a(paramContext); }
  
  public int a() { return this.a.getResources().getInteger(a.g.abc_max_action_buttons); }
  
  public boolean b() { return (Build.VERSION.SDK_INT >= 19) ? true : (aq.a(ViewConfiguration.get(this.a)) ^ true); }
  
  public int c() { return (this.a.getResources().getDisplayMetrics()).widthPixels / 2; }
  
  public boolean d() {
    if ((this.a.getApplicationInfo()).targetSdkVersion >= 16) {
      Resources resources1 = this.a.getResources();
      int j = a.b.abc_action_bar_embed_tabs;
      return resources1.getBoolean(j);
    } 
    Resources resources = this.a.getResources();
    int i = a.b.abc_action_bar_embed_tabs_pre_jb;
    return resources.getBoolean(i);
  }
  
  public int e() {
    TypedArray typedArray = this.a.obtainStyledAttributes(null, a.k.ActionBar, a.a.actionBarStyle, 0);
    int i = typedArray.getLayoutDimension(a.k.ActionBar_height, 0);
    Resources resources = this.a.getResources();
    int j = i;
    if (!d())
      j = Math.min(i, resources.getDimensionPixelSize(a.d.abc_action_bar_stacked_max_height)); 
    typedArray.recycle();
    return j;
  }
  
  public boolean f() { return ((this.a.getApplicationInfo()).targetSdkVersion < 14); }
  
  public int g() { return this.a.getResources().getDimensionPixelSize(a.d.abc_action_bar_stacked_tab_max_width); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/view/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */