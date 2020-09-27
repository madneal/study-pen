package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.support.v7.a.c;
import android.support.v7.b.a;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

class g implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, l.a {
  e a;
  
  private f b;
  
  private c c;
  
  private l.a d;
  
  public g(f paramf) { this.b = paramf; }
  
  public void a() {
    if (this.c != null)
      this.c.dismiss(); 
  }
  
  public void a(IBinder paramIBinder) {
    f f1 = this.b;
    c.a a1 = new c.a(f1.e());
    this.a = new e(a1.a(), a.h.abc_list_menu_item_layout);
    this.a.a(this);
    this.b.a(this.a);
    a1.a(this.a.a(), this);
    View view = f1.o();
    if (view != null) {
      a1.a(view);
    } else {
      a1.a(f1.n()).a(f1.m());
    } 
    a1.a(this);
    this.c = a1.b();
    this.c.setOnDismissListener(this);
    WindowManager.LayoutParams layoutParams = this.c.getWindow().getAttributes();
    layoutParams.type = 1003;
    if (paramIBinder != null)
      layoutParams.token = paramIBinder; 
    layoutParams.flags |= 0x20000;
    this.c.show();
  }
  
  public void a(f paramf, boolean paramBoolean) {
    if (paramBoolean || paramf == this.b)
      a(); 
    if (this.d != null)
      this.d.a(paramf, paramBoolean); 
  }
  
  public boolean a(f paramf) { return (this.d != null) ? this.d.a(paramf) : 0; }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt) { this.b.a((h)this.a.a().getItem(paramInt), 0); }
  
  public void onDismiss(DialogInterface paramDialogInterface) { this.a.a(this.b, true); }
  
  public boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 82 || paramInt == 4) {
      KeyEvent.DispatcherState dispatcherState;
      if (paramKeyEvent.getAction() == 0 && paramKeyEvent.getRepeatCount() == 0) {
        dispatcherState = this.c.getWindow();
        if (dispatcherState != null) {
          View view = dispatcherState.getDecorView();
          if (view != null) {
            dispatcherState = view.getKeyDispatcherState();
            if (dispatcherState != null) {
              dispatcherState.startTracking(paramKeyEvent, this);
              return true;
            } 
          } 
        } 
      } else if (paramKeyEvent.getAction() == 1 && !paramKeyEvent.isCanceled()) {
        Window window = this.c.getWindow();
        if (window != null) {
          View view = window.getDecorView();
          if (view != null) {
            KeyEvent.DispatcherState dispatcherState1 = view.getKeyDispatcherState();
            if (dispatcherState1 != null && dispatcherState1.isTracking(paramKeyEvent)) {
              this.b.a(true);
              dispatcherState.dismiss();
              return true;
            } 
          } 
        } 
      } 
    } 
    return this.b.performShortcut(paramInt, paramKeyEvent, 0);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/view/menu/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */