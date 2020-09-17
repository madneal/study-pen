package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a;
import android.support.v4.d.a.b;
import android.support.v4.h.d;
import android.support.v4.h.p;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class a implements b {
  private final int a;
  
  private final int b;
  
  private final int c;
  
  private final int d;
  
  private CharSequence e;
  
  private CharSequence f;
  
  private Intent g;
  
  private char h;
  
  private char i;
  
  private Drawable j;
  
  private int k = 0;
  
  private Context l;
  
  private MenuItem.OnMenuItemClickListener m;
  
  private int n = 16;
  
  public a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence) {
    this.l = paramContext;
    this.a = paramInt2;
    this.b = paramInt1;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramCharSequence;
  }
  
  public b a(int paramInt) { throw new UnsupportedOperationException(); }
  
  public b a(d paramd) { throw new UnsupportedOperationException(); }
  
  public b a(p.e parame) { return this; }
  
  public b a(View paramView) { throw new UnsupportedOperationException(); }
  
  public d a() { return null; }
  
  public b b(int paramInt) {
    setShowAsAction(paramInt);
    return this;
  }
  
  public boolean collapseActionView() { return false; }
  
  public boolean expandActionView() { return false; }
  
  public ActionProvider getActionProvider() { throw new UnsupportedOperationException(); }
  
  public View getActionView() { return null; }
  
  public char getAlphabeticShortcut() { return this.i; }
  
  public int getGroupId() { return this.b; }
  
  public Drawable getIcon() { return this.j; }
  
  public Intent getIntent() { return this.g; }
  
  public int getItemId() { return this.a; }
  
  public ContextMenu.ContextMenuInfo getMenuInfo() { return null; }
  
  public char getNumericShortcut() { return this.h; }
  
  public int getOrder() { return this.d; }
  
  public SubMenu getSubMenu() { return null; }
  
  public CharSequence getTitle() { return this.e; }
  
  public CharSequence getTitleCondensed() { return (this.f != null) ? this.f : this.e; }
  
  public boolean hasSubMenu() { return false; }
  
  public boolean isActionViewExpanded() { return false; }
  
  public boolean isCheckable() { return ((this.n & true) != 0); }
  
  public boolean isChecked() { return ((this.n & 0x2) != 0); }
  
  public boolean isEnabled() { return ((this.n & 0x10) != 0); }
  
  public boolean isVisible() { return ((this.n & 0x8) == 0); }
  
  public MenuItem setActionProvider(ActionProvider paramActionProvider) { throw new UnsupportedOperationException(); }
  
  public MenuItem setAlphabeticShortcut(char paramChar) {
    this.i = (char)paramChar;
    return this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean) {
    this.n = paramBoolean | this.n & 0xFFFFFFFE;
    return this;
  }
  
  public MenuItem setChecked(boolean paramBoolean) {
    int i2;
    int i1 = this.n;
    if (paramBoolean) {
      i2 = 2;
    } else {
      i2 = 0;
    } 
    this.n = i2 | i1 & 0xFFFFFFFD;
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean) {
    int i2;
    int i1 = this.n;
    if (paramBoolean) {
      i2 = 16;
    } else {
      i2 = 0;
    } 
    this.n = i2 | i1 & 0xFFFFFFEF;
    return this;
  }
  
  public MenuItem setIcon(int paramInt) {
    this.k = paramInt;
    this.j = a.a(this.l, paramInt);
    return this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable) {
    this.j = paramDrawable;
    this.k = 0;
    return this;
  }
  
  public MenuItem setIntent(Intent paramIntent) {
    this.g = paramIntent;
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar) {
    this.h = (char)paramChar;
    return this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener) { throw new UnsupportedOperationException(); }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener) {
    this.m = paramOnMenuItemClickListener;
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2) {
    this.h = (char)paramChar1;
    this.i = (char)paramChar2;
    return this;
  }
  
  public void setShowAsAction(int paramInt) {}
  
  public MenuItem setTitle(int paramInt) {
    this.e = this.l.getResources().getString(paramInt);
    return this;
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence) {
    this.e = paramCharSequence;
    return this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence) {
    this.f = paramCharSequence;
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean) {
    int i1 = this.n;
    int i2 = 8;
    if (paramBoolean)
      i2 = 0; 
    this.n = i1 & 0x8 | i2;
    return this;
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/view/menu/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */