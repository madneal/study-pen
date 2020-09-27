package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.h.af;
import android.support.v4.h.au;
import android.support.v4.h.az;
import android.support.v7.b.a;
import android.support.v7.view.menu.a;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.l;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public class as implements ac {
  private Toolbar a;
  
  private int b;
  
  private View c;
  
  private View d;
  
  private Drawable e;
  
  private Drawable f;
  
  private Drawable g;
  
  private boolean h;
  
  private CharSequence i;
  
  private CharSequence j;
  
  private CharSequence k;
  
  private Window.Callback l;
  
  private boolean m;
  
  private d n;
  
  private int o = 0;
  
  private final l p;
  
  private int q = 0;
  
  private Drawable r;
  
  public as(Toolbar paramToolbar, boolean paramBoolean) { this(paramToolbar, paramBoolean, a.i.abc_action_bar_up_description, a.e.abc_ic_ab_back_mtrl_am_alpha); }
  
  public as(Toolbar paramToolbar, boolean paramBoolean, int paramInt1, int paramInt2) {
    this.a = paramToolbar;
    this.i = paramToolbar.getTitle();
    this.j = paramToolbar.getSubtitle();
    if (this.i != null) {
      bool = true;
    } else {
      bool = false;
    } 
    this.h = bool;
    this.g = paramToolbar.getNavigationIcon();
    if (paramBoolean) {
      ar ar = ar.a(paramToolbar.getContext(), null, a.k.ActionBar, a.a.actionBarStyle, 0);
      CharSequence charSequence = ar.c(a.k.ActionBar_title);
      if (!TextUtils.isEmpty(charSequence))
        b(charSequence); 
      charSequence = ar.c(a.k.ActionBar_subtitle);
      if (!TextUtils.isEmpty(charSequence))
        c(charSequence); 
      Drawable drawable = ar.a(a.k.ActionBar_logo);
      if (drawable != null)
        c(drawable); 
      drawable = ar.a(a.k.ActionBar_icon);
      if (this.g == null && drawable != null)
        a(drawable); 
      drawable = ar.a(a.k.ActionBar_homeAsUpIndicator);
      if (drawable != null)
        d(drawable); 
      c(ar.a(a.k.ActionBar_displayOptions, 0));
      int i1 = ar.g(a.k.ActionBar_customNavigationLayout, 0);
      if (i1 != 0) {
        a(LayoutInflater.from(this.a.getContext()).inflate(i1, this.a, false));
        c(this.b | 0x10);
      } 
      i1 = ar.f(a.k.ActionBar_height, 0);
      if (i1 > 0) {
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.height = i1;
        this.a.setLayoutParams(layoutParams);
      } 
      i1 = ar.d(a.k.ActionBar_contentInsetStart, -1);
      int i2 = ar.d(a.k.ActionBar_contentInsetEnd, -1);
      if (i1 >= 0 || i2 >= 0)
        this.a.a(Math.max(i1, 0), Math.max(i2, 0)); 
      i1 = ar.g(a.k.ActionBar_titleTextStyle, 0);
      if (i1 != 0)
        this.a.a(this.a.getContext(), i1); 
      i1 = ar.g(a.k.ActionBar_subtitleTextStyle, 0);
      if (i1 != 0)
        this.a.b(this.a.getContext(), i1); 
      i1 = ar.g(a.k.ActionBar_popupTheme, 0);
      if (i1 != 0)
        this.a.setPopupTheme(i1); 
      ar.a();
    } else {
      this.b = s();
    } 
    this.p = l.a();
    d(paramInt1);
    this.k = this.a.getNavigationContentDescription();
    b(this.p.a(b(), paramInt2));
    this.a.setNavigationOnClickListener(new View.OnClickListener(this) {
          final a a = new a(as.a(this.b).getContext(), 0, 16908332, 0, 0, as.b(this.b));
          
          public void onClick(View param1View) {
            if (as.c(this.b) != null && as.d(this.b))
              as.c(this.b).onMenuItemSelected(0, this.a); 
          }
        });
  }
  
  private void e(CharSequence paramCharSequence) {
    this.i = paramCharSequence;
    if ((this.b & 0x8) != 0)
      this.a.setTitle(paramCharSequence); 
  }
  
  private int s() { return (this.a.getNavigationIcon() != null) ? 15 : 11; }
  
  private void t() {
    Drawable drawable;
    if ((this.b & 0x2) != 0) {
      if ((this.b & true) != 0 && this.f != null) {
        drawable = this.f;
      } else {
        drawable = this.e;
      } 
    } else {
      drawable = null;
    } 
    this.a.setLogo(drawable);
  }
  
  private void u() {
    if ((this.b & 0x4) != 0) {
      if (TextUtils.isEmpty(this.k)) {
        this.a.setNavigationContentDescription(this.q);
        return;
      } 
      this.a.setNavigationContentDescription(this.k);
    } 
  }
  
  private void v() {
    if ((this.b & 0x4) != 0) {
      Drawable drawable;
      Toolbar toolbar = this.a;
      if (this.g != null) {
        drawable = this.g;
      } else {
        drawable = this.r;
      } 
      toolbar.setNavigationIcon(drawable);
    } 
  }
  
  public au a(int paramInt, long paramLong) {
    float f1;
    au au = af.i(this.a);
    if (paramInt == 0) {
      f1 = 1.0F;
    } else {
      f1 = 0.0F;
    } 
    return au.a(f1).a(paramLong).a(new az(this, paramInt) {
          private boolean c = false;
          
          public void a(View param1View) { as.a(this.b).setVisibility(0); }
          
          public void b(View param1View) {
            if (!this.c)
              as.a(this.b).setVisibility(this.a); 
          }
          
          public void c(View param1View) { this.c = true; }
        });
  }
  
  public ViewGroup a() { return this.a; }
  
  public void a(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = this.p.a(b(), paramInt);
    } else {
      drawable = null;
    } 
    a(drawable);
  }
  
  public void a(Drawable paramDrawable) {
    this.e = paramDrawable;
    t();
  }
  
  public void a(l.a parama, f.a parama1) { this.a.a(parama, parama1); }
  
  public void a(ak paramak) {
    if (this.c != null && this.c.getParent() == this.a)
      this.a.removeView(this.c); 
    this.c = paramak;
    if (paramak != null && this.o == 2) {
      this.a.addView(this.c, 0);
      Toolbar.b b1 = (Toolbar.b)this.c.getLayoutParams();
      b1.width = -2;
      b1.height = -2;
      b1.a = 8388691;
      paramak.setAllowCollapse(true);
    } 
  }
  
  public void a(Menu paramMenu, l.a parama) {
    if (this.n == null) {
      this.n = new d(this.a.getContext());
      this.n.a(a.f.action_menu_presenter);
    } 
    this.n.a(parama);
    this.a.a((f)paramMenu, this.n);
  }
  
  public void a(View paramView) {
    if (this.d != null && (this.b & 0x10) != 0)
      this.a.removeView(this.d); 
    this.d = paramView;
    if (paramView != null && (this.b & 0x10) != 0)
      this.a.addView(this.d); 
  }
  
  public void a(Window.Callback paramCallback) { this.l = paramCallback; }
  
  public void a(CharSequence paramCharSequence) {
    if (!this.h)
      e(paramCharSequence); 
  }
  
  public void a(boolean paramBoolean) { this.a.setCollapsible(paramBoolean); }
  
  public Context b() { return this.a.getContext(); }
  
  public void b(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = this.p.a(b(), paramInt);
    } else {
      drawable = null;
    } 
    c(drawable);
  }
  
  public void b(Drawable paramDrawable) {
    if (this.r != paramDrawable) {
      this.r = paramDrawable;
      v();
    } 
  }
  
  public void b(CharSequence paramCharSequence) {
    this.h = true;
    e(paramCharSequence);
  }
  
  public void b(boolean paramBoolean) {}
  
  public void c(int paramInt) {
    int i1 = this.b ^ paramInt;
    this.b = paramInt;
    if (i1 != 0) {
      CharSequence charSequence = null;
      if ((i1 & 0x4) != 0)
        if ((paramInt & 0x4) != 0) {
          v();
          u();
        } else {
          this.a.setNavigationIcon(null);
        }  
      if ((i1 & 0x3) != 0)
        t(); 
      if ((i1 & 0x8) != 0) {
        Toolbar toolbar;
        if ((paramInt & 0x8) != 0) {
          this.a.setTitle(this.i);
          toolbar = this.a;
          charSequence = this.j;
        } else {
          this.a.setTitle(null);
          toolbar = this.a;
        } 
        toolbar.setSubtitle(charSequence);
      } 
      if ((i1 & 0x10) != 0 && this.d != null) {
        if ((paramInt & 0x10) != 0) {
          this.a.addView(this.d);
          return;
        } 
        this.a.removeView(this.d);
      } 
    } 
  }
  
  public void c(Drawable paramDrawable) {
    this.f = paramDrawable;
    t();
  }
  
  public void c(CharSequence paramCharSequence) {
    this.j = paramCharSequence;
    if ((this.b & 0x8) != 0)
      this.a.setSubtitle(paramCharSequence); 
  }
  
  public boolean c() { return this.a.g(); }
  
  public void d() { this.a.h(); }
  
  public void d(int paramInt) {
    if (paramInt == this.q)
      return; 
    this.q = paramInt;
    if (TextUtils.isEmpty(this.a.getNavigationContentDescription()))
      e(this.q); 
  }
  
  public void d(Drawable paramDrawable) {
    this.g = paramDrawable;
    v();
  }
  
  public void d(CharSequence paramCharSequence) {
    this.k = paramCharSequence;
    u();
  }
  
  public CharSequence e() { return this.a.getTitle(); }
  
  public void e(int paramInt) {
    String str;
    if (paramInt == 0) {
      str = null;
    } else {
      str = b().getString(paramInt);
    } 
    d(str);
  }
  
  public void f() { Log.i("ToolbarWidgetWrapper", "Progress display unsupported"); }
  
  public void g() { Log.i("ToolbarWidgetWrapper", "Progress display unsupported"); }
  
  public boolean h() { return this.a.a(); }
  
  public boolean i() { return this.a.b(); }
  
  public boolean j() { return this.a.c(); }
  
  public boolean k() { return this.a.d(); }
  
  public boolean l() { return this.a.e(); }
  
  public void m() { this.m = true; }
  
  public void n() { this.a.f(); }
  
  public int o() { return this.b; }
  
  public int p() { return this.o; }
  
  public int q() { return this.a.getVisibility(); }
  
  public Menu r() { return this.a.getMenu(); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */