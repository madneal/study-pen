package android.support.v7.a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.view.b;
import android.support.v7.view.f;
import android.view.ActionMode;
import android.view.Window;

class i extends h {
  private static p r;
  
  private int s = -100;
  
  private boolean t;
  
  private boolean u = true;
  
  i(Context paramContext, Window paramWindow, e parame) { super(paramContext, paramWindow, parame); }
  
  private boolean e(int paramInt) {
    Resources resources = this.a.getResources();
    Configuration configuration = resources.getConfiguration();
    int j = configuration.uiMode;
    if (paramInt == 2) {
      paramInt = 32;
    } else {
      paramInt = 16;
    } 
    if ((j & 0x30) != paramInt) {
      configuration = new Configuration(configuration);
      configuration.uiMode = paramInt | configuration.uiMode & 0xFFFFFFCF;
      resources.updateConfiguration(configuration, null);
      return true;
    } 
    return false;
  }
  
  private p s() {
    if (r == null)
      r = new p(this.a.getApplicationContext()); 
    return r;
  }
  
  Window.Callback a(Window.Callback paramCallback) { return new a(this, paramCallback); }
  
  public void a(Bundle paramBundle) {
    super.a(paramBundle);
    if (paramBundle != null && this.s == -100)
      this.s = paramBundle.getInt("appcompat:local_night_mode", -100); 
  }
  
  public void c(Bundle paramBundle) {
    super.c(paramBundle);
    if (this.s != -100)
      paramBundle.putInt("appcompat:local_night_mode", this.s); 
  }
  
  int d(int paramInt) { return (paramInt != -100) ? ((paramInt != 0) ? paramInt : (s().a() ? 2 : 1)) : -1; }
  
  public boolean h() {
    this.t = true;
    if (this.s == -100) {
      j = i();
    } else {
      j = this.s;
    } 
    int j = d(j);
    return (j != -1) ? e(j) : 0;
  }
  
  public boolean n() { return this.u; }
  
  class a extends g.a {
    a(i this$0, Window.Callback param1Callback) { super(this$0, param1Callback); }
    
    final ActionMode a(ActionMode.Callback param1Callback) {
      f.a a1 = new f.a(this.b.a, param1Callback);
      b b1 = this.b.b(a1);
      return (b1 != null) ? a1.b(b1) : null;
    }
    
    public ActionMode onWindowStartingActionMode(ActionMode.Callback param1Callback) { return this.b.n() ? a(param1Callback) : super.onWindowStartingActionMode(param1Callback); }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */