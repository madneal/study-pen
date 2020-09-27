package android.support.v7.a;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.a.a;
import android.support.v4.a.ac;
import android.support.v4.a.l;
import android.support.v4.a.x;
import android.support.v4.h.g;
import android.support.v7.view.b;
import android.support.v7.widget.at;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class d extends l implements ac.a, e {
  private f l;
  
  private int m = 0;
  
  private boolean n;
  
  private Resources o;
  
  public Intent a() { return x.a(this); }
  
  public b a(b.a parama) { return null; }
  
  public void a(ac paramac) { paramac.a(this); }
  
  public void a(b paramb) {}
  
  public boolean a(Intent paramIntent) { return x.a(this, paramIntent); }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) { i().b(paramView, paramLayoutParams); }
  
  public void b(Intent paramIntent) { x.b(this, paramIntent); }
  
  public void b(ac paramac) {}
  
  public void b(b paramb) {}
  
  public void d() { i().e(); }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    if (g.a(paramKeyEvent, 4096) && paramKeyEvent.getUnicodeChar(paramKeyEvent.getMetaState() & 0xFFFF8FFF) == 60) {
      int i = paramKeyEvent.getAction();
      if (i == 0) {
        a a1 = f();
        if (a1 != null && a1.b() && a1.g()) {
          this.n = true;
          return true;
        } 
      } else if (i == 1 && this.n) {
        this.n = false;
        return true;
      } 
    } 
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public a f() { return i().a(); }
  
  public View findViewById(int paramInt) { return i().a(paramInt); }
  
  public boolean g() {
    Intent intent = a();
    if (intent != null) {
      if (a(intent)) {
        ac = ac.a(this);
        a(ac);
        b(ac);
        ac.a();
        try {
          a.a(this);
        } catch (IllegalStateException ac) {
          finish();
        } 
      } else {
        b(ac);
      } 
      return true;
    } 
    return false;
  }
  
  public MenuInflater getMenuInflater() { return i().b(); }
  
  public Resources getResources() {
    if (this.o == null && at.a())
      this.o = new at(this, super.getResources()); 
    return (this.o == null) ? super.getResources() : this.o;
  }
  
  @Deprecated
  public void h() {}
  
  public f i() {
    if (this.l == null)
      this.l = f.a(this, this); 
    return this.l;
  }
  
  public void invalidateOptionsMenu() { i().e(); }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    i().a(paramConfiguration);
    if (this.o != null) {
      DisplayMetrics displayMetrics = super.getResources().getDisplayMetrics();
      this.o.updateConfiguration(paramConfiguration, displayMetrics);
    } 
  }
  
  public void onContentChanged() { h(); }
  
  protected void onCreate(Bundle paramBundle) {
    f f1 = i();
    f1.g();
    f1.a(paramBundle);
    if (f1.h() && this.m != 0)
      if (Build.VERSION.SDK_INT >= 23) {
        onApplyThemeResource(getTheme(), this.m, false);
      } else {
        setTheme(this.m);
      }  
    super.onCreate(paramBundle);
  }
  
  protected void onDestroy() {
    super.onDestroy();
    i().f();
  }
  
  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem) {
    if (super.onMenuItemSelected(paramInt, paramMenuItem))
      return true; 
    a a1 = f();
    return (paramMenuItem.getItemId() == 16908332 && a1 != null && (a1.a() & 0x4) != 0) ? g() : 0;
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu) { return super.onMenuOpened(paramInt, paramMenu); }
  
  public void onPanelClosed(int paramInt, Menu paramMenu) { super.onPanelClosed(paramInt, paramMenu); }
  
  protected void onPostCreate(Bundle paramBundle) {
    super.onPostCreate(paramBundle);
    i().b(paramBundle);
  }
  
  protected void onPostResume() {
    super.onPostResume();
    i().d();
  }
  
  protected void onSaveInstanceState(Bundle paramBundle) {
    super.onSaveInstanceState(paramBundle);
    i().c(paramBundle);
  }
  
  protected void onStop() {
    super.onStop();
    i().c();
  }
  
  protected void onTitleChanged(CharSequence paramCharSequence, int paramInt) {
    super.onTitleChanged(paramCharSequence, paramInt);
    i().a(paramCharSequence);
  }
  
  public void setContentView(int paramInt) { i().b(paramInt); }
  
  public void setContentView(View paramView) { i().a(paramView); }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) { i().a(paramView, paramLayoutParams); }
  
  public void setTheme(int paramInt) {
    super.setTheme(paramInt);
    this.m = paramInt;
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */