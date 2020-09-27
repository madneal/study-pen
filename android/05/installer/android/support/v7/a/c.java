package android.support.v7.a;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.b.a;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;

public class c extends l implements DialogInterface {
  private b a = new b(getContext(), this, getWindow());
  
  c(Context paramContext, int paramInt, boolean paramBoolean) { super(paramContext, a(paramContext, paramInt)); }
  
  static int a(Context paramContext, int paramInt) {
    if (paramInt >= 16777216)
      return paramInt; 
    TypedValue typedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(a.a.alertDialogTheme, typedValue, true);
    return typedValue.resourceId;
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    this.a.a();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) { return this.a.a(paramInt, paramKeyEvent) ? true : super.onKeyDown(paramInt, paramKeyEvent); }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent) { return this.a.b(paramInt, paramKeyEvent) ? true : super.onKeyUp(paramInt, paramKeyEvent); }
  
  public void setTitle(CharSequence paramCharSequence) {
    super.setTitle(paramCharSequence);
    this.a.a(paramCharSequence);
  }
  
  public static class a {
    private final b.a a;
    
    private int b;
    
    public a(Context param1Context) { this(param1Context, c.a(param1Context, 0)); }
    
    public a(Context param1Context, int param1Int) {
      this.a = new b.a(new ContextThemeWrapper(param1Context, c.a(param1Context, param1Int)));
      this.b = param1Int;
    }
    
    public Context a() { return this.a.a; }
    
    public a a(DialogInterface.OnKeyListener param1OnKeyListener) {
      this.a.r = param1OnKeyListener;
      return this;
    }
    
    public a a(Drawable param1Drawable) {
      this.a.d = param1Drawable;
      return this;
    }
    
    public a a(View param1View) {
      this.a.g = param1View;
      return this;
    }
    
    public a a(ListAdapter param1ListAdapter, DialogInterface.OnClickListener param1OnClickListener) {
      this.a.t = param1ListAdapter;
      this.a.u = param1OnClickListener;
      return this;
    }
    
    public a a(CharSequence param1CharSequence) {
      this.a.f = param1CharSequence;
      return this;
    }
    
    public c b() {
      c c;
      this.a.a((c = new c(this.a.a, this.b, false)).a(c));
      c.setCancelable(this.a.o);
      if (this.a.o)
        c.setCanceledOnTouchOutside(true); 
      c.setOnCancelListener(this.a.p);
      c.setOnDismissListener(this.a.q);
      if (this.a.r != null)
        c.setOnKeyListener(this.a.r); 
      return c;
    }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */