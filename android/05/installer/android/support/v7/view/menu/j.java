package android.support.v7.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v4.d.a.b;
import android.support.v4.h.d;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

@TargetApi(16)
class j extends i {
  j(Context paramContext, b paramb) { super(paramContext, paramb); }
  
  i.a a(ActionProvider paramActionProvider) { return new a(this, this.a, paramActionProvider); }
  
  class a extends i.a implements ActionProvider.VisibilityListener {
    d.b c;
    
    public a(j this$0, Context param1Context, ActionProvider param1ActionProvider) { super(this$0, param1Context, param1ActionProvider); }
    
    public View a(MenuItem param1MenuItem) { return this.a.onCreateActionView(param1MenuItem); }
    
    public void a(d.b param1b) {
      this.c = param1b;
      ActionProvider actionProvider = this.a;
      if (param1b != null) {
        a a1 = this;
      } else {
        param1b = null;
      } 
      actionProvider.setVisibilityListener(param1b);
    }
    
    public boolean b() { return this.a.overridesItemVisibility(); }
    
    public boolean c() { return this.a.isVisible(); }
    
    public void onActionProviderVisibilityChanged(boolean param1Boolean) {
      if (this.c != null)
        this.c.a(param1Boolean); 
    }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/view/menu/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */