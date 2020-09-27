package android.support.v7.a;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v4.h.af;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.l;
import android.support.v7.widget.ac;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;

class n extends a {
  private ac a;
  
  private Window.Callback b;
  
  private boolean c;
  
  private boolean d;
  
  private ArrayList<a.b> e;
  
  private final Runnable f;
  
  private Menu j() {
    if (!this.c) {
      this.a.a(new a(this, null), new b(this, null));
      this.c = true;
    } 
    return this.a.r();
  }
  
  public int a() { return this.a.o(); }
  
  public void a(float paramFloat) { af.c(this.a.a(), paramFloat); }
  
  public void a(Configuration paramConfiguration) { super.a(paramConfiguration); }
  
  public void a(CharSequence paramCharSequence) { this.a.a(paramCharSequence); }
  
  public void a(boolean paramBoolean) {}
  
  public boolean a(int paramInt, KeyEvent paramKeyEvent) {
    Menu menu = j();
    if (menu != null) {
      boolean bool;
      byte b1;
      if (paramKeyEvent != null) {
        b1 = paramKeyEvent.getDeviceId();
      } else {
        b1 = -1;
      } 
      if (KeyCharacterMap.load(b1).getKeyboardType() != 1) {
        bool = true;
      } else {
        bool = false;
      } 
      menu.setQwertyMode(bool);
      menu.performShortcut(paramInt, paramKeyEvent, 0);
    } 
    return true;
  }
  
  public boolean b() { return (this.a.q() == 0); }
  
  public Context c() { return this.a.b(); }
  
  public void c(boolean paramBoolean) {}
  
  public void d(boolean paramBoolean) {}
  
  public void e(boolean paramBoolean) {
    if (paramBoolean == this.d)
      return; 
    this.d = paramBoolean;
    int i = this.e.size();
    for (byte b1 = 0; b1 < i; b1++)
      ((a.b)this.e.get(b1)).a(paramBoolean); 
  }
  
  public boolean e() {
    this.a.a().removeCallbacks(this.f);
    af.a(this.a.a(), this.f);
    return true;
  }
  
  public boolean f() {
    if (this.a.c()) {
      this.a.d();
      return true;
    } 
    return false;
  }
  
  public boolean g() {
    ViewGroup viewGroup = this.a.a();
    if (viewGroup != null && !viewGroup.hasFocus()) {
      viewGroup.requestFocus();
      return true;
    } 
    return false;
  }
  
  void h() { this.a.a().removeCallbacks(this.f); }
  
  void i() {
    null = j();
    if (null instanceof f) {
      object = (f)null;
    } else {
      object = null;
    } 
    if (object != null)
      object.g(); 
    try {
      null.clear();
      if (!this.b.onCreatePanelMenu(0, null) || !this.b.onPreparePanel(0, null, null))
        null.clear(); 
      return;
    } finally {
      if (object != null)
        object.h(); 
    } 
  }
  
  private final class a implements l.a {
    private boolean b;
    
    private a(n this$0) {}
    
    public void a(f param1f, boolean param1Boolean) {
      if (this.b)
        return; 
      this.b = true;
      n.b(this.a).n();
      if (n.a(this.a) != null)
        n.a(this.a).onPanelClosed(108, param1f); 
      this.b = false;
    }
    
    public boolean a(f param1f) {
      if (n.a(this.a) != null) {
        n.a(this.a).onMenuOpened(108, param1f);
        return true;
      } 
      return false;
    }
  }
  
  private final class b implements f.a {
    private b(n this$0) {}
    
    public void a(f param1f) {
      if (n.a(this.a) != null) {
        if (n.b(this.a).i()) {
          n.a(this.a).onPanelClosed(108, param1f);
          return;
        } 
        if (n.a(this.a).onPreparePanel(0, null, param1f))
          n.a(this.a).onMenuOpened(108, param1f); 
      } 
    }
    
    public boolean a(f param1f, MenuItem param1MenuItem) { return false; }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */