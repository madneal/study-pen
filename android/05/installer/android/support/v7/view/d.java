package android.support.v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.support.v7.b.a;
import android.view.LayoutInflater;

public class d extends ContextWrapper {
  private int a;
  
  private Resources.Theme b;
  
  private LayoutInflater c;
  
  public d(Context paramContext, int paramInt) {
    super(paramContext);
    this.a = paramInt;
  }
  
  public d(Context paramContext, Resources.Theme paramTheme) {
    super(paramContext);
    this.b = paramTheme;
  }
  
  private void b() {
    boolean bool;
    if (this.b == null) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      this.b = getResources().newTheme();
      Resources.Theme theme = getBaseContext().getTheme();
      if (theme != null)
        this.b.setTo(theme); 
    } 
    a(this.b, this.a, bool);
  }
  
  public int a() { return this.a; }
  
  protected void a(Resources.Theme paramTheme, int paramInt, boolean paramBoolean) { paramTheme.applyStyle(paramInt, true); }
  
  public Object getSystemService(String paramString) {
    if ("layout_inflater".equals(paramString)) {
      if (this.c == null)
        this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this); 
      return this.c;
    } 
    return getBaseContext().getSystemService(paramString);
  }
  
  public Resources.Theme getTheme() {
    if (this.b != null)
      return this.b; 
    if (this.a == 0)
      this.a = a.j.Theme_AppCompat_Light; 
    b();
    return this.b;
  }
  
  public void setTheme(int paramInt) {
    if (this.a != paramInt) {
      this.a = paramInt;
      b();
    } 
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/view/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */