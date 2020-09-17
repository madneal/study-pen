package android.support.v4.h;

import android.os.Build;
import android.support.v4.d.a.b;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public final class p {
  static final d a;
  
  static  {
    a a1;
    int i = Build.VERSION.SDK_INT;
    if (i >= 14) {
      a1 = new c();
    } else if (i >= 11) {
      a1 = new b();
    } else {
      a1 = new a();
    } 
    a = a1;
  }
  
  public static MenuItem a(MenuItem paramMenuItem, d paramd) {
    if (paramMenuItem instanceof b)
      return ((b)paramMenuItem).a(paramd); 
    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
    return paramMenuItem;
  }
  
  public static MenuItem a(MenuItem paramMenuItem, View paramView) { return (paramMenuItem instanceof b) ? ((b)paramMenuItem).setActionView(paramView) : a.a(paramMenuItem, paramView); }
  
  public static View a(MenuItem paramMenuItem) { return (paramMenuItem instanceof b) ? ((b)paramMenuItem).getActionView() : a.a(paramMenuItem); }
  
  public static void a(MenuItem paramMenuItem, int paramInt) {
    if (paramMenuItem instanceof b) {
      ((b)paramMenuItem).setShowAsAction(paramInt);
      return;
    } 
    a.a(paramMenuItem, paramInt);
  }
  
  public static MenuItem b(MenuItem paramMenuItem, int paramInt) { return (paramMenuItem instanceof b) ? ((b)paramMenuItem).setActionView(paramInt) : a.b(paramMenuItem, paramInt); }
  
  public static boolean b(MenuItem paramMenuItem) { return (paramMenuItem instanceof b) ? ((b)paramMenuItem).expandActionView() : a.b(paramMenuItem); }
  
  public static boolean c(MenuItem paramMenuItem) { return (paramMenuItem instanceof b) ? ((b)paramMenuItem).isActionViewExpanded() : a.c(paramMenuItem); }
  
  static class a implements d {
    public MenuItem a(MenuItem param1MenuItem, View param1View) { return param1MenuItem; }
    
    public View a(MenuItem param1MenuItem) { return null; }
    
    public void a(MenuItem param1MenuItem, int param1Int) {}
    
    public MenuItem b(MenuItem param1MenuItem, int param1Int) { return param1MenuItem; }
    
    public boolean b(MenuItem param1MenuItem) { return false; }
    
    public boolean c(MenuItem param1MenuItem) { return false; }
  }
  
  static class b implements d {
    public MenuItem a(MenuItem param1MenuItem, View param1View) { return q.a(param1MenuItem, param1View); }
    
    public View a(MenuItem param1MenuItem) { return q.a(param1MenuItem); }
    
    public void a(MenuItem param1MenuItem, int param1Int) { q.a(param1MenuItem, param1Int); }
    
    public MenuItem b(MenuItem param1MenuItem, int param1Int) { return q.b(param1MenuItem, param1Int); }
    
    public boolean b(MenuItem param1MenuItem) { return false; }
    
    public boolean c(MenuItem param1MenuItem) { return false; }
  }
  
  static class c extends b {
    public boolean b(MenuItem param1MenuItem) { return r.a(param1MenuItem); }
    
    public boolean c(MenuItem param1MenuItem) { return r.b(param1MenuItem); }
  }
  
  static interface d {
    MenuItem a(MenuItem param1MenuItem, View param1View);
    
    View a(MenuItem param1MenuItem);
    
    void a(MenuItem param1MenuItem, int param1Int);
    
    MenuItem b(MenuItem param1MenuItem, int param1Int);
    
    boolean b(MenuItem param1MenuItem);
    
    boolean c(MenuItem param1MenuItem);
  }
  
  public static interface e {
    boolean a(MenuItem param1MenuItem);
    
    boolean b(MenuItem param1MenuItem);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */