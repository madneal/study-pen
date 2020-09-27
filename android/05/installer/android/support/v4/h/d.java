package android.support.v4.h;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class d {
  private final Context a;
  
  private a b;
  
  private b c;
  
  public d(Context paramContext) { this.a = paramContext; }
  
  public abstract View a();
  
  public View a(MenuItem paramMenuItem) { return a(); }
  
  public void a(a parama) { this.b = parama; }
  
  public void a(b paramb) {
    if (this.c != null && paramb != null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
      stringBuilder.append(getClass().getSimpleName());
      stringBuilder.append(" instance while it is still in use somewhere else?");
      Log.w("ActionProvider(support)", stringBuilder.toString());
    } 
    this.c = paramb;
  }
  
  public void a(SubMenu paramSubMenu) {}
  
  public void a(boolean paramBoolean) {
    if (this.b != null)
      this.b.a(paramBoolean); 
  }
  
  public boolean b() { return false; }
  
  public boolean c() { return true; }
  
  public boolean d() { return false; }
  
  public boolean e() { return false; }
  
  public void f() {
    this.c = null;
    this.b = null;
  }
  
  public static interface a {
    void a(boolean param1Boolean);
  }
  
  public static interface b {
    void a(boolean param1Boolean);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */