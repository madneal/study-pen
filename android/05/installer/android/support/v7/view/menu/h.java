package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.d.a.b;
import android.support.v4.h.d;
import android.support.v4.h.p;
import android.support.v7.widget.l;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;

public final class h implements b {
  private static String w;
  
  private static String x;
  
  private static String y;
  
  private static String z;
  
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
  
  private f l;
  
  private p m;
  
  private Runnable n;
  
  private MenuItem.OnMenuItemClickListener o;
  
  private int p = 16;
  
  private int q = 0;
  
  private View r;
  
  private d s;
  
  private p.e t;
  
  private boolean u = false;
  
  private ContextMenu.ContextMenuInfo v;
  
  h(f paramf, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5) {
    this.l = paramf;
    this.a = paramInt2;
    this.b = paramInt1;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramCharSequence;
    this.q = paramInt5;
  }
  
  public b a(int paramInt) {
    Context context = this.l.e();
    a(LayoutInflater.from(context).inflate(paramInt, new LinearLayout(context), false));
    return this;
  }
  
  public b a(d paramd) {
    if (this.s != null)
      this.s.f(); 
    this.r = null;
    this.s = paramd;
    this.l.b(true);
    if (this.s != null)
      this.s.a(new d.b(this) {
            public void a(boolean param1Boolean) { h.a(this.a).a(this.a); }
          }); 
    return this;
  }
  
  public b a(p.e parame) {
    this.t = parame;
    return this;
  }
  
  public b a(View paramView) {
    this.r = paramView;
    this.s = null;
    if (paramView != null && paramView.getId() == -1 && this.a > 0)
      paramView.setId(this.a); 
    this.l.b(this);
    return this;
  }
  
  public d a() { return this.s; }
  
  CharSequence a(m.a parama) { return (parama != null && parama.a()) ? getTitleCondensed() : getTitle(); }
  
  public void a(p paramp) {
    this.m = paramp;
    paramp.setHeaderTitle(getTitle());
  }
  
  void a(ContextMenu.ContextMenuInfo paramContextMenuInfo) { this.v = paramContextMenuInfo; }
  
  public void a(boolean paramBoolean) {
    int i2;
    int i1 = this.p;
    if (paramBoolean) {
      i2 = 4;
    } else {
      i2 = 0;
    } 
    this.p = i2 | i1 & 0xFFFFFFFB;
  }
  
  public b b(int paramInt) {
    setShowAsAction(paramInt);
    return this;
  }
  
  void b(boolean paramBoolean) {
    int i3;
    int i1 = this.p;
    int i2 = this.p;
    if (paramBoolean) {
      i3 = 2;
    } else {
      i3 = 0;
    } 
    this.p = i3 | i2 & 0xFFFFFFFD;
    if (i1 != this.p)
      this.l.b(false); 
  }
  
  public boolean b() {
    if (this.o != null && this.o.onMenuItemClick(this))
      return true; 
    if (this.l.a(this.l.p(), this))
      return true; 
    if (this.n != null) {
      this.n.run();
      return true;
    } 
    if (this.g != null)
      try {
        this.l.e().startActivity(this.g);
        return true;
      } catch (ActivityNotFoundException activityNotFoundException) {
        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", activityNotFoundException);
      }  
    return (this.s != null && this.s.d());
  }
  
  public int c() { return this.d; }
  
  boolean c(boolean paramBoolean) {
    int i3;
    int i1 = this.p;
    int i2 = this.p;
    boolean bool = false;
    if (paramBoolean) {
      i3 = 0;
    } else {
      i3 = 8;
    } 
    this.p = i3 | i2 & 0xFFFFFFF7;
    paramBoolean = bool;
    if (i1 != this.p)
      paramBoolean = true; 
    return paramBoolean;
  }
  
  public boolean collapseActionView() { return ((this.q & 0x8) == 0) ? false : ((this.r == null) ? true : ((this.t == null || this.t.b(this)) ? this.l.d(this) : 0)); }
  
  char d() { return this.l.b() ? this.i : this.h; }
  
  public void d(boolean paramBoolean) {
    int i1;
    if (paramBoolean) {
      i1 = this.p | 0x20;
    } else {
      i1 = this.p & 0xFFFFFFDF;
    } 
    this.p = i1;
  }
  
  String e() {
    char c1 = d();
    if (c1 == '\000')
      return ""; 
    StringBuilder stringBuilder = new StringBuilder(w);
    if (c1 != '\b') {
      if (c1 != '\n') {
        if (c1 != ' ') {
          stringBuilder.append(c1);
        } else {
          String str = z;
          stringBuilder.append(str);
        } 
      } else {
        String str = x;
        stringBuilder.append(str);
      } 
    } else {
      String str = y;
      stringBuilder.append(str);
    } 
    return stringBuilder.toString();
  }
  
  public void e(boolean paramBoolean) {
    this.u = paramBoolean;
    this.l.b(false);
  }
  
  public boolean expandActionView() { return !n() ? false : ((this.t == null || this.t.a(this)) ? this.l.c(this) : 0); }
  
  boolean f() { return (this.l.c() && d() != '\000'); }
  
  public boolean g() { return ((this.p & 0x4) != 0); }
  
  public ActionProvider getActionProvider() { throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()"); }
  
  public View getActionView() {
    if (this.r != null)
      return this.r; 
    if (this.s != null) {
      this.r = this.s.a(this);
      return this.r;
    } 
    return null;
  }
  
  public char getAlphabeticShortcut() { return this.i; }
  
  public int getGroupId() { return this.b; }
  
  public Drawable getIcon() {
    if (this.j != null)
      return this.j; 
    if (this.k != 0) {
      Drawable drawable = l.a().a(this.l.e(), this.k);
      this.k = 0;
      this.j = drawable;
      return drawable;
    } 
    return null;
  }
  
  public Intent getIntent() { return this.g; }
  
  @CapturedViewProperty
  public int getItemId() { return this.a; }
  
  public ContextMenu.ContextMenuInfo getMenuInfo() { return this.v; }
  
  public char getNumericShortcut() { return this.h; }
  
  public int getOrder() { return this.c; }
  
  public SubMenu getSubMenu() { return this.m; }
  
  @CapturedViewProperty
  public CharSequence getTitle() { return this.e; }
  
  public CharSequence getTitleCondensed() {
    CharSequence charSequence1;
    if (this.f != null) {
      charSequence1 = this.f;
    } else {
      charSequence1 = this.e;
    } 
    CharSequence charSequence2 = charSequence1;
    if (Build.VERSION.SDK_INT < 18) {
      charSequence2 = charSequence1;
      if (charSequence1 != null) {
        charSequence2 = charSequence1;
        if (!(charSequence1 instanceof String))
          charSequence2 = charSequence1.toString(); 
      } 
    } 
    return charSequence2;
  }
  
  public void h() { this.l.b(this); }
  
  public boolean hasSubMenu() { return (this.m != null); }
  
  public boolean i() { return this.l.q(); }
  
  public boolean isActionViewExpanded() { return this.u; }
  
  public boolean isCheckable() { return ((this.p & true) == 1); }
  
  public boolean isChecked() { return ((this.p & 0x2) == 2); }
  
  public boolean isEnabled() { return ((this.p & 0x10) != 0); }
  
  public boolean isVisible() {
    d d1 = this.s;
    boolean bool = false;
    byte b1 = 0;
    if (d1 != null && this.s.b()) {
      bool = b1;
      if ((this.p & 0x8) == 0) {
        bool = b1;
        if (this.s.c())
          bool = true; 
      } 
      return bool;
    } 
    if ((this.p & 0x8) == 0)
      bool = true; 
    return bool;
  }
  
  public boolean j() { return ((this.p & 0x20) == 32); }
  
  public boolean k() { return ((this.q & true) == 1); }
  
  public boolean l() { return ((this.q & 0x2) == 2); }
  
  public boolean m() { return ((this.q & 0x4) == 4); }
  
  public boolean n() {
    int i1 = this.q;
    byte b1 = 0;
    int i2 = b1;
    if ((i1 & 0x8) != 0) {
      if (this.r == null && this.s != null)
        this.r = this.s.a(this); 
      i2 = b1;
      if (this.r != null)
        i2 = 1; 
    } 
    return i2;
  }
  
  public MenuItem setActionProvider(ActionProvider paramActionProvider) { throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()"); }
  
  public MenuItem setAlphabeticShortcut(char paramChar) {
    if (this.i == paramChar)
      return this; 
    this.i = Character.toLowerCase(paramChar);
    this.l.b(false);
    return this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean) {
    int i1 = this.p;
    this.p = paramBoolean | this.p & 0xFFFFFFFE;
    if (i1 != this.p)
      this.l.b(false); 
    return this;
  }
  
  public MenuItem setChecked(boolean paramBoolean) {
    if ((this.p & 0x4) != 0) {
      this.l.a(this);
      return this;
    } 
    b(paramBoolean);
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean) {
    int i1;
    if (paramBoolean) {
      i1 = this.p | 0x10;
    } else {
      i1 = this.p & 0xFFFFFFEF;
    } 
    this.p = i1;
    this.l.b(false);
    return this;
  }
  
  public MenuItem setIcon(int paramInt) {
    this.j = null;
    this.k = paramInt;
    this.l.b(false);
    return this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable) {
    this.k = 0;
    this.j = paramDrawable;
    this.l.b(false);
    return this;
  }
  
  public MenuItem setIntent(Intent paramIntent) {
    this.g = paramIntent;
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar) {
    if (this.h == paramChar)
      return this; 
    this.h = (char)paramChar;
    this.l.b(false);
    return this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener) { throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()"); }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener) {
    this.o = paramOnMenuItemClickListener;
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2) {
    this.h = (char)paramChar1;
    this.i = Character.toLowerCase(paramChar2);
    this.l.b(false);
    return this;
  }
  
  public void setShowAsAction(int paramInt) {
    switch (paramInt & 0x3) {
      default:
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
      case 0:
      case 1:
      case 2:
        break;
    } 
    this.q = paramInt;
    this.l.b(this);
  }
  
  public MenuItem setTitle(int paramInt) { return setTitle(this.l.e().getString(paramInt)); }
  
  public MenuItem setTitle(CharSequence paramCharSequence) {
    this.e = paramCharSequence;
    this.l.b(false);
    if (this.m != null)
      this.m.setHeaderTitle(paramCharSequence); 
    return this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence) {
    this.f = paramCharSequence;
    if (paramCharSequence == null)
      paramCharSequence = this.e; 
    this.l.b(false);
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean) {
    if (c(paramBoolean))
      this.l.a(this); 
    return this;
  }
  
  public String toString() { return (this.e != null) ? this.e.toString() : null; }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/view/menu/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */