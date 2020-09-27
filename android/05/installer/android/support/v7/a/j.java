package android.support.v7.a;

import android.app.UiModeManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Window;

class j extends i {
  private final UiModeManager r;
  
  j(Context paramContext, Window paramWindow, e parame) {
    super(paramContext, paramWindow, parame);
    this.r = (UiModeManager)paramContext.getSystemService("uimode");
  }
  
  Window.Callback a(Window.Callback paramCallback) { return new a(this, paramCallback); }
  
  int d(int paramInt) { return (paramInt == 0 && this.r.getNightMode() == 0) ? -1 : super.d(paramInt); }
  
  class a extends i.a {
    a(j this$0, Window.Callback param1Callback) { super(this$0, param1Callback); }
    
    public ActionMode onWindowStartingActionMode(ActionMode.Callback param1Callback) { return null; }
    
    public ActionMode onWindowStartingActionMode(ActionMode.Callback param1Callback, int param1Int) { return (!this.c.n() || param1Int != 0) ? super.onWindowStartingActionMode(param1Callback, param1Int) : a(param1Callback); }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */