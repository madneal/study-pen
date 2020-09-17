package android.support.v7.a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.view.b;
import android.support.v7.view.g;
import android.support.v7.view.i;
import android.support.v7.view.menu.f;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;

abstract class g extends f {
  final Context a;
  
  final Window b;
  
  final Window.Callback c;
  
  final Window.Callback d;
  
  final e e;
  
  a f;
  
  MenuInflater g;
  
  boolean h;
  
  boolean i;
  
  boolean j;
  
  boolean k;
  
  boolean l;
  
  private CharSequence m;
  
  private boolean n;
  
  g(Context paramContext, Window paramWindow, e parame) {
    this.a = paramContext;
    this.b = paramWindow;
    this.e = parame;
    this.c = this.b.getCallback();
    if (this.c instanceof a)
      throw new IllegalStateException("AppCompat has already installed itself into the Window"); 
    this.d = a(this.c);
    this.b.setCallback(this.d);
  }
  
  public a a() {
    k();
    return this.f;
  }
  
  abstract b a(b.a parama);
  
  Window.Callback a(Window.Callback paramCallback) { return new a(this, paramCallback); }
  
  abstract void a(int paramInt, Menu paramMenu);
  
  public final void a(CharSequence paramCharSequence) {
    this.m = paramCharSequence;
    b(paramCharSequence);
  }
  
  abstract boolean a(int paramInt, KeyEvent paramKeyEvent);
  
  abstract boolean a(KeyEvent paramKeyEvent);
  
  public MenuInflater b() {
    if (this.g == null) {
      Context context;
      k();
      if (this.f != null) {
        context = this.f.c();
      } else {
        context = this.a;
      } 
      this.g = new g(context);
    } 
    return this.g;
  }
  
  abstract void b(CharSequence paramCharSequence);
  
  abstract boolean b(int paramInt, Menu paramMenu);
  
  public void c(Bundle paramBundle) {}
  
  public void f() { this.n = true; }
  
  public boolean h() { return false; }
  
  abstract void k();
  
  final a l() { return this.f; }
  
  final Context m() {
    a a1 = a();
    if (a1 != null) {
      Context context1 = a1.c();
    } else {
      a1 = null;
    } 
    Context context = a1;
    if (a1 == null)
      context = this.a; 
    return context;
  }
  
  public boolean n() { return false; }
  
  final boolean o() { return this.n; }
  
  final Window.Callback p() { return this.b.getCallback(); }
  
  final CharSequence q() { return (this.c instanceof Activity) ? ((Activity)this.c).getTitle() : this.m; }
  
  class a extends i {
    a(g this$0, Window.Callback param1Callback) { super(param1Callback); }
    
    public boolean dispatchKeyEvent(KeyEvent param1KeyEvent) { return (this.a.a(param1KeyEvent) || super.dispatchKeyEvent(param1KeyEvent)); }
    
    public boolean dispatchKeyShortcutEvent(KeyEvent param1KeyEvent) { return (super.dispatchKeyShortcutEvent(param1KeyEvent) || this.a.a(param1KeyEvent.getKeyCode(), param1KeyEvent)); }
    
    public void onContentChanged() {}
    
    public boolean onCreatePanelMenu(int param1Int, Menu param1Menu) { return (param1Int == 0 && !(param1Menu instanceof f)) ? false : super.onCreatePanelMenu(param1Int, param1Menu); }
    
    public boolean onMenuOpened(int param1Int, Menu param1Menu) {
      super.onMenuOpened(param1Int, param1Menu);
      this.a.b(param1Int, param1Menu);
      return true;
    }
    
    public void onPanelClosed(int param1Int, Menu param1Menu) {
      super.onPanelClosed(param1Int, param1Menu);
      this.a.a(param1Int, param1Menu);
    }
    
    public boolean onPreparePanel(int param1Int, View param1View, Menu param1Menu) {
      Object object;
      if (param1Menu instanceof f) {
        object = (f)param1Menu;
      } else {
        object = null;
      } 
      if (param1Int == 0 && object == null)
        return false; 
      if (object != null)
        object.c(true); 
      boolean bool = super.onPreparePanel(param1Int, param1View, param1Menu);
      if (object != null)
        object.c(false); 
      return bool;
    }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */