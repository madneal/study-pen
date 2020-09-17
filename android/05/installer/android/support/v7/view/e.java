package android.support.v7.view;

import android.content.Context;
import android.support.v7.view.menu.f;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public class e extends b implements f.a {
  private Context a;
  
  private ActionBarContextView b;
  
  private b.a c;
  
  private WeakReference<View> d;
  
  private boolean e;
  
  private boolean f;
  
  private f g;
  
  public e(Context paramContext, ActionBarContextView paramActionBarContextView, b.a parama, boolean paramBoolean) {
    this.a = paramContext;
    this.b = paramActionBarContextView;
    this.c = parama;
    this.g = (new f(paramActionBarContextView.getContext())).a(1);
    this.g.a(this);
    this.f = paramBoolean;
  }
  
  public MenuInflater a() { return new g(this.b.getContext()); }
  
  public void a(int paramInt) { b(this.a.getString(paramInt)); }
  
  public void a(f paramf) {
    d();
    this.b.a();
  }
  
  public void a(View paramView) {
    this.b.setCustomView(paramView);
    if (paramView != null) {
      WeakReference weakReference = new WeakReference(paramView);
    } else {
      paramView = null;
    } 
    this.d = paramView;
  }
  
  public void a(CharSequence paramCharSequence) { this.b.setSubtitle(paramCharSequence); }
  
  public void a(boolean paramBoolean) {
    super.a(paramBoolean);
    this.b.setTitleOptional(paramBoolean);
  }
  
  public boolean a(f paramf, MenuItem paramMenuItem) { return this.c.a(this, paramMenuItem); }
  
  public Menu b() { return this.g; }
  
  public void b(int paramInt) { a(this.a.getString(paramInt)); }
  
  public void b(CharSequence paramCharSequence) { this.b.setTitle(paramCharSequence); }
  
  public void c() {
    if (this.e)
      return; 
    this.e = true;
    this.b.sendAccessibilityEvent(32);
    this.c.a(this);
  }
  
  public void d() { this.c.b(this, this.g); }
  
  public CharSequence f() { return this.b.getTitle(); }
  
  public CharSequence g() { return this.b.getSubtitle(); }
  
  public boolean h() { return this.b.d(); }
  
  public View i() { return (this.d != null) ? (View)this.d.get() : null; }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/view/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */