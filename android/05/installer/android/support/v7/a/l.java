package android.support.v7.a;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.b.a;
import android.support.v7.view.b;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;

public class l extends Dialog implements e {
  private f a;
  
  public l(Context paramContext, int paramInt) {
    super(paramContext, a(paramContext, paramInt));
    a().a(null);
    a().h();
  }
  
  private static int a(Context paramContext, int paramInt) {
    int i = paramInt;
    if (paramInt == 0) {
      TypedValue typedValue = new TypedValue();
      paramContext.getTheme().resolveAttribute(a.a.dialogTheme, typedValue, true);
      i = typedValue.resourceId;
    } 
    return i;
  }
  
  public f a() {
    if (this.a == null)
      this.a = f.a(this, this); 
    return this.a;
  }
  
  public b a(b.a parama) { return null; }
  
  public void a(b paramb) {}
  
  public boolean a(int paramInt) { return a().c(paramInt); }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) { a().b(paramView, paramLayoutParams); }
  
  public void b(b paramb) {}
  
  public View findViewById(int paramInt) { return a().a(paramInt); }
  
  public void invalidateOptionsMenu() { a().e(); }
  
  protected void onCreate(Bundle paramBundle) {
    a().g();
    super.onCreate(paramBundle);
    a().a(paramBundle);
  }
  
  protected void onStop() {
    super.onStop();
    a().c();
  }
  
  public void setContentView(int paramInt) { a().b(paramInt); }
  
  public void setContentView(View paramView) { a().a(paramView); }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) { a().a(paramView, paramLayoutParams); }
  
  public void setTitle(int paramInt) {
    super.setTitle(paramInt);
    a().a(getContext().getString(paramInt));
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    super.setTitle(paramCharSequence);
    a().a(paramCharSequence);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */