package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class p extends f implements SubMenu {
  private f d;
  
  private h e;
  
  public p(Context paramContext, f paramf, h paramh) {
    super(paramContext);
    this.d = paramf;
    this.e = paramh;
  }
  
  public String a() {
    byte b;
    if (this.e != null) {
      b = this.e.getItemId();
    } else {
      b = 0;
    } 
    if (!b)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(super.a());
    stringBuilder.append(":");
    stringBuilder.append(b);
    return stringBuilder.toString();
  }
  
  public void a(f.a parama) { this.d.a(parama); }
  
  boolean a(f paramf, MenuItem paramMenuItem) { return (super.a(paramf, paramMenuItem) || this.d.a(paramf, paramMenuItem)); }
  
  public boolean b() { return this.d.b(); }
  
  public boolean c() { return this.d.c(); }
  
  public boolean c(h paramh) { return this.d.c(paramh); }
  
  public boolean d(h paramh) { return this.d.d(paramh); }
  
  public MenuItem getItem() { return this.e; }
  
  public f p() { return this.d; }
  
  public Menu s() { return this.d; }
  
  public SubMenu setHeaderIcon(int paramInt) {
    a(a.a(e(), paramInt));
    return this;
  }
  
  public SubMenu setHeaderIcon(Drawable paramDrawable) {
    a(paramDrawable);
    return this;
  }
  
  public SubMenu setHeaderTitle(int paramInt) {
    a(e().getResources().getString(paramInt));
    return this;
  }
  
  public SubMenu setHeaderTitle(CharSequence paramCharSequence) {
    a(paramCharSequence);
    return this;
  }
  
  public SubMenu setHeaderView(View paramView) {
    a(paramView);
    return this;
  }
  
  public SubMenu setIcon(int paramInt) {
    this.e.setIcon(paramInt);
    return this;
  }
  
  public SubMenu setIcon(Drawable paramDrawable) {
    this.e.setIcon(paramDrawable);
    return this;
  }
  
  public void setQwertyMode(boolean paramBoolean) { this.d.setQwertyMode(paramBoolean); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/view/menu/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */