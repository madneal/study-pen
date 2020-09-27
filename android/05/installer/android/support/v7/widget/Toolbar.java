package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.h.af;
import android.support.v4.h.e;
import android.support.v4.h.n;
import android.support.v4.h.p;
import android.support.v4.h.s;
import android.support.v7.a.a;
import android.support.v7.b.a;
import android.support.v7.view.c;
import android.support.v7.view.g;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.l;
import android.support.v7.view.menu.p;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
  private boolean A;
  
  private final ArrayList<View> B = new ArrayList();
  
  private final ArrayList<View> C = new ArrayList();
  
  private final int[] D = new int[2];
  
  private c E;
  
  private final ActionMenuView.e F = new ActionMenuView.e(this) {
      public boolean a(MenuItem param1MenuItem) { return (Toolbar.a(this.a) != null) ? Toolbar.a(this.a).a(param1MenuItem) : 0; }
    };
  
  private as G;
  
  private d H;
  
  private a I;
  
  private l.a J;
  
  private f.a K;
  
  private boolean L;
  
  private final Runnable M = new Runnable(this) {
      public void run() { this.a.d(); }
    };
  
  private final l N;
  
  View a;
  
  private ActionMenuView b;
  
  private TextView c;
  
  private TextView d;
  
  private ImageButton e;
  
  private ImageView f;
  
  private Drawable g;
  
  private CharSequence h;
  
  private ImageButton i;
  
  private Context j;
  
  private int k;
  
  private int l;
  
  private int m;
  
  private int n;
  
  private int o;
  
  private int p;
  
  private int q;
  
  private int r;
  
  private int s;
  
  private final aj t = new aj();
  
  private int u = 8388627;
  
  private CharSequence v;
  
  private CharSequence w;
  
  private int x;
  
  private int y;
  
  private boolean z;
  
  public Toolbar(Context paramContext) { this(paramContext, null); }
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet) { this(paramContext, paramAttributeSet, a.a.toolbarStyle); }
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    ar ar = ar.a(getContext(), paramAttributeSet, a.k.Toolbar, paramInt, 0);
    this.l = ar.g(a.k.Toolbar_titleTextAppearance, 0);
    this.m = ar.g(a.k.Toolbar_subtitleTextAppearance, 0);
    this.u = ar.c(a.k.Toolbar_android_gravity, this.u);
    this.n = 48;
    paramInt = ar.d(a.k.Toolbar_titleMargins, 0);
    this.s = paramInt;
    this.r = paramInt;
    this.q = paramInt;
    this.p = paramInt;
    paramInt = ar.d(a.k.Toolbar_titleMarginStart, -1);
    if (paramInt >= 0)
      this.p = paramInt; 
    paramInt = ar.d(a.k.Toolbar_titleMarginEnd, -1);
    if (paramInt >= 0)
      this.q = paramInt; 
    paramInt = ar.d(a.k.Toolbar_titleMarginTop, -1);
    if (paramInt >= 0)
      this.r = paramInt; 
    paramInt = ar.d(a.k.Toolbar_titleMarginBottom, -1);
    if (paramInt >= 0)
      this.s = paramInt; 
    this.o = ar.e(a.k.Toolbar_maxButtonHeight, -1);
    int i1 = ar.d(a.k.Toolbar_contentInsetStart, -2147483648);
    paramInt = ar.d(a.k.Toolbar_contentInsetEnd, -2147483648);
    int i2 = ar.e(a.k.Toolbar_contentInsetLeft, 0);
    int i3 = ar.e(a.k.Toolbar_contentInsetRight, 0);
    this.t.b(i2, i3);
    if (i1 != Integer.MIN_VALUE || paramInt != Integer.MIN_VALUE)
      this.t.a(i1, paramInt); 
    this.g = ar.a(a.k.Toolbar_collapseIcon);
    this.h = ar.c(a.k.Toolbar_collapseContentDescription);
    CharSequence charSequence3 = ar.c(a.k.Toolbar_title);
    if (!TextUtils.isEmpty(charSequence3))
      setTitle(charSequence3); 
    charSequence3 = ar.c(a.k.Toolbar_subtitle);
    if (!TextUtils.isEmpty(charSequence3))
      setSubtitle(charSequence3); 
    this.j = getContext();
    setPopupTheme(ar.g(a.k.Toolbar_popupTheme, 0));
    Drawable drawable2 = ar.a(a.k.Toolbar_navigationIcon);
    if (drawable2 != null)
      setNavigationIcon(drawable2); 
    CharSequence charSequence2 = ar.c(a.k.Toolbar_navigationContentDescription);
    if (!TextUtils.isEmpty(charSequence2))
      setNavigationContentDescription(charSequence2); 
    Drawable drawable1 = ar.a(a.k.Toolbar_logo);
    if (drawable1 != null)
      setLogo(drawable1); 
    CharSequence charSequence1 = ar.c(a.k.Toolbar_logoDescription);
    if (!TextUtils.isEmpty(charSequence1))
      setLogoDescription(charSequence1); 
    if (ar.f(a.k.Toolbar_titleTextColor))
      setTitleTextColor(ar.b(a.k.Toolbar_titleTextColor, -1)); 
    if (ar.f(a.k.Toolbar_subtitleTextColor))
      setSubtitleTextColor(ar.b(a.k.Toolbar_subtitleTextColor, -1)); 
    ar.a();
    this.N = l.a();
  }
  
  private int a(int paramInt) {
    int i1 = paramInt & 0x70;
    paramInt = i1;
    if (i1 != 16) {
      paramInt = i1;
      if (i1 != 48) {
        paramInt = i1;
        if (i1 != 80)
          paramInt = this.u & 0x70; 
      } 
    } 
    return paramInt;
  }
  
  private int a(View paramView, int paramInt) {
    b b1 = (b)paramView.getLayoutParams();
    int i1 = paramView.getMeasuredHeight();
    if (paramInt > 0) {
      paramInt = (i1 - paramInt) / 2;
    } else {
      paramInt = 0;
    } 
    int i2 = a(b1.a);
    if (i2 != 48) {
      if (i2 != 80) {
        int i3 = getPaddingTop();
        paramInt = getPaddingBottom();
        int i4 = getHeight();
        i2 = (i4 - i3 - paramInt - i1) / 2;
        if (i2 < b1.topMargin) {
          paramInt = b1.topMargin;
        } else {
          i1 = i4 - paramInt - i1 - i2 - i3;
          paramInt = i2;
          if (i1 < b1.bottomMargin)
            paramInt = Math.max(0, i2 - b1.bottomMargin - i1); 
        } 
        return i3 + paramInt;
      } 
      return getHeight() - getPaddingBottom() - i1 - b1.bottomMargin - paramInt;
    } 
    return getPaddingTop() - paramInt;
  }
  
  private int a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i1 = marginLayoutParams.leftMargin - paramArrayOfInt[0];
    int i2 = marginLayoutParams.rightMargin - paramArrayOfInt[1];
    int i3 = Math.max(0, i1) + Math.max(0, i2);
    paramArrayOfInt[0] = Math.max(0, -i1);
    paramArrayOfInt[1] = Math.max(0, -i2);
    paramView.measure(getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + i3 + paramInt2, marginLayoutParams.width), getChildMeasureSpec(paramInt3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + paramInt4, marginLayoutParams.height));
    return paramView.getMeasuredWidth() + i3;
  }
  
  private int a(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2) {
    b b1 = (b)paramView.getLayoutParams();
    int i1 = b1.leftMargin - paramArrayOfInt[0];
    paramInt1 += Math.max(0, i1);
    paramArrayOfInt[0] = Math.max(0, -i1);
    i1 = a(paramView, paramInt2);
    paramInt2 = paramView.getMeasuredWidth();
    paramView.layout(paramInt1, i1, paramInt1 + paramInt2, paramView.getMeasuredHeight() + i1);
    return paramInt1 + paramInt2 + b1.rightMargin;
  }
  
  private int a(List<View> paramList, int[] paramArrayOfInt) {
    int i1 = paramArrayOfInt[0];
    int i2 = paramArrayOfInt[1];
    int i3 = paramList.size();
    byte b1 = 0;
    int i4 = 0;
    while (b1 < i3) {
      View view = (View)paramList.get(b1);
      b b2 = (b)view.getLayoutParams();
      i1 = b2.leftMargin - i1;
      i2 = b2.rightMargin - i2;
      int i5 = Math.max(0, i1);
      int i6 = Math.max(0, i2);
      i1 = Math.max(0, -i1);
      i2 = Math.max(0, -i2);
      i4 += i5 + view.getMeasuredWidth() + i6;
      b1++;
    } 
    return i4;
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i1 = getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + paramInt2, marginLayoutParams.width);
    paramInt2 = getChildMeasureSpec(paramInt3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + paramInt4, marginLayoutParams.height);
    paramInt3 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = paramInt2;
    if (paramInt3 != 1073741824) {
      paramInt1 = paramInt2;
      if (paramInt5 >= 0) {
        paramInt1 = paramInt5;
        if (paramInt3 != 0)
          paramInt1 = Math.min(View.MeasureSpec.getSize(paramInt2), paramInt5); 
        paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      } 
    } 
    paramView.measure(i1, paramInt1);
  }
  
  private void a(View paramView, boolean paramBoolean) {
    b b1 = paramView.getLayoutParams();
    if (b1 == null) {
      b1 = i();
    } else if (!checkLayoutParams(b1)) {
      b1 = a(b1);
    } else {
      b1 = (b)b1;
    } 
    b1.b = 1;
    if (paramBoolean && this.a != null) {
      paramView.setLayoutParams(b1);
      this.C.add(paramView);
      return;
    } 
    addView(paramView, b1);
  }
  
  private void a(List<View> paramList, int paramInt) {
    int i1 = af.d(this);
    int i2 = 0;
    if (i1 == 1) {
      i1 = 1;
    } else {
      i1 = 0;
    } 
    int i3 = getChildCount();
    int i4 = e.a(paramInt, af.d(this));
    paramList.clear();
    paramInt = i2;
    if (i1 != 0) {
      for (paramInt = i3 - 1; paramInt >= 0; paramInt--) {
        View view = getChildAt(paramInt);
        b b1 = (b)view.getLayoutParams();
        if (b1.b == 0 && a(view) && b(b1.a) == i4)
          paramList.add(view); 
      } 
    } else {
      while (paramInt < i3) {
        View view = getChildAt(paramInt);
        b b1 = (b)view.getLayoutParams();
        if (b1.b == 0 && a(view) && b(b1.a) == i4)
          paramList.add(view); 
        paramInt++;
      } 
    } 
  }
  
  private boolean a(View paramView) { return (paramView != null && paramView.getParent() == this && paramView.getVisibility() != 8); }
  
  private int b(int paramInt) {
    int i1 = af.d(this);
    int i2 = e.a(paramInt, i1) & 0x7;
    if (i2 != 1) {
      paramInt = 3;
      if (i2 != 3 && i2 != 5) {
        if (i1 == 1)
          paramInt = 5; 
        return paramInt;
      } 
    } 
    return i2;
  }
  
  private int b(View paramView) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    return n.a(marginLayoutParams) + n.b(marginLayoutParams);
  }
  
  private int b(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2) {
    b b1 = (b)paramView.getLayoutParams();
    int i1 = b1.rightMargin - paramArrayOfInt[1];
    paramInt1 -= Math.max(0, i1);
    paramArrayOfInt[1] = Math.max(0, -i1);
    paramInt2 = a(paramView, paramInt2);
    i1 = paramView.getMeasuredWidth();
    paramView.layout(paramInt1 - i1, paramInt2, paramInt1, paramView.getMeasuredHeight() + paramInt2);
    return paramInt1 - i1 + b1.leftMargin;
  }
  
  private int c(View paramView) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
  }
  
  private boolean d(View paramView) { return (paramView.getParent() == this || this.C.contains(paramView)); }
  
  private MenuInflater getMenuInflater() { return new g(getContext()); }
  
  private void l() {
    if (this.f == null)
      this.f = new ImageView(getContext()); 
  }
  
  private void m() {
    n();
    if (this.b.d() == null) {
      f f1 = (f)this.b.getMenu();
      if (this.I == null)
        this.I = new a(this, null); 
      this.b.setExpandedActionViewsExclusive(true);
      f1.a(this.I, this.j);
    } 
  }
  
  private void n() {
    if (this.b == null) {
      this.b = new ActionMenuView(getContext());
      this.b.setPopupTheme(this.k);
      this.b.setOnMenuItemClickListener(this.F);
      this.b.a(this.J, this.K);
      b b1 = i();
      b1.a = 0x800005 | this.n & 0x70;
      this.b.setLayoutParams(b1);
      a(this.b, false);
    } 
  }
  
  private void o() {
    if (this.e == null) {
      this.e = new ImageButton(getContext(), null, a.a.toolbarNavigationButtonStyle);
      b b1 = i();
      b1.a = 0x800003 | this.n & 0x70;
      this.e.setLayoutParams(b1);
    } 
  }
  
  private void p() {
    if (this.i == null) {
      this.i = new ImageButton(getContext(), null, a.a.toolbarNavigationButtonStyle);
      this.i.setImageDrawable(this.g);
      this.i.setContentDescription(this.h);
      b b1 = i();
      b1.a = 0x800003 | this.n & 0x70;
      b1.b = 2;
      this.i.setLayoutParams(b1);
      this.i.setOnClickListener(new View.OnClickListener(this) {
            public void onClick(View param1View) { this.a.h(); }
          });
    } 
  }
  
  private void q() {
    removeCallbacks(this.M);
    post(this.M);
  }
  
  private boolean r() {
    if (!this.L)
      return false; 
    int i1 = getChildCount();
    for (byte b1 = 0; b1 < i1; b1++) {
      View view = getChildAt(b1);
      if (a(view) && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0)
        return false; 
    } 
    return true;
  }
  
  public b a(AttributeSet paramAttributeSet) { return new b(getContext(), paramAttributeSet); }
  
  protected b a(ViewGroup.LayoutParams paramLayoutParams) { return (paramLayoutParams instanceof b) ? new b((b)paramLayoutParams) : ((paramLayoutParams instanceof a.a) ? new b((a.a)paramLayoutParams) : ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams) ? new b((ViewGroup.MarginLayoutParams)paramLayoutParams) : new b(paramLayoutParams))); }
  
  public void a(int paramInt1, int paramInt2) { this.t.a(paramInt1, paramInt2); }
  
  public void a(Context paramContext, int paramInt) {
    this.l = paramInt;
    if (this.c != null)
      this.c.setTextAppearance(paramContext, paramInt); 
  }
  
  public void a(f paramf, d paramd) {
    if (paramf == null && this.b == null)
      return; 
    n();
    f f1 = this.b.d();
    if (f1 == paramf)
      return; 
    if (f1 != null) {
      f1.b(this.H);
      f1.b(this.I);
    } 
    if (this.I == null)
      this.I = new a(this, null); 
    paramd.d(true);
    if (paramf != null) {
      paramf.a(paramd, this.j);
      paramf.a(this.I, this.j);
    } else {
      paramd.a(this.j, null);
      this.I.a(this.j, null);
      paramd.b(true);
      this.I.b(true);
    } 
    this.b.setPopupTheme(this.k);
    this.b.setPresenter(paramd);
    this.H = paramd;
  }
  
  public void a(l.a parama, f.a parama1) {
    this.J = parama;
    this.K = parama1;
    if (this.b != null)
      this.b.a(parama, parama1); 
  }
  
  public boolean a() { return (getVisibility() == 0 && this.b != null && this.b.a()); }
  
  public void b(Context paramContext, int paramInt) {
    this.m = paramInt;
    if (this.d != null)
      this.d.setTextAppearance(paramContext, paramInt); 
  }
  
  public boolean b() { return (this.b != null && this.b.g()); }
  
  public boolean c() { return (this.b != null && this.b.h()); }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) { return (super.checkLayoutParams(paramLayoutParams) && paramLayoutParams instanceof b); }
  
  public boolean d() { return (this.b != null && this.b.e()); }
  
  public boolean e() { return (this.b != null && this.b.f()); }
  
  public void f() {
    if (this.b != null)
      this.b.i(); 
  }
  
  public boolean g() { return (this.I != null && this.I.b != null); }
  
  public int getContentInsetEnd() { return this.t.d(); }
  
  public int getContentInsetLeft() { return this.t.a(); }
  
  public int getContentInsetRight() { return this.t.b(); }
  
  public int getContentInsetStart() { return this.t.c(); }
  
  public Drawable getLogo() { return (this.f != null) ? this.f.getDrawable() : null; }
  
  public CharSequence getLogoDescription() { return (this.f != null) ? this.f.getContentDescription() : null; }
  
  public Menu getMenu() {
    m();
    return this.b.getMenu();
  }
  
  public CharSequence getNavigationContentDescription() { return (this.e != null) ? this.e.getContentDescription() : null; }
  
  public Drawable getNavigationIcon() { return (this.e != null) ? this.e.getDrawable() : null; }
  
  public Drawable getOverflowIcon() {
    m();
    return this.b.getOverflowIcon();
  }
  
  public int getPopupTheme() { return this.k; }
  
  public CharSequence getSubtitle() { return this.w; }
  
  public CharSequence getTitle() { return this.v; }
  
  public ac getWrapper() {
    if (this.G == null)
      this.G = new as(this, true); 
    return this.G;
  }
  
  public void h() {
    h h1;
    if (this.I == null) {
      h1 = null;
    } else {
      h1 = this.I.b;
    } 
    if (h1 != null)
      h1.collapseActionView(); 
  }
  
  protected b i() { return new b(-2, -2); }
  
  void j() {
    for (int i1 = getChildCount() - 1; i1 >= 0; i1--) {
      View view = getChildAt(i1);
      if (((b)view.getLayoutParams()).b != 2 && view != this.b) {
        removeViewAt(i1);
        this.C.add(view);
      } 
    } 
  }
  
  void k() {
    for (int i1 = this.C.size() - 1; i1 >= 0; i1--)
      addView((View)this.C.get(i1)); 
    this.C.clear();
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    removeCallbacks(this.M);
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent) {
    int i1 = s.a(paramMotionEvent);
    if (i1 == 9)
      this.A = false; 
    if (!this.A) {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if (i1 == 9 && !bool)
        this.A = true; 
    } 
    if (i1 == 10 || i1 == 3)
      this.A = false; 
    return true;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i1;
    if (af.d(this) == 1) {
      i1 = 1;
    } else {
      i1 = 0;
    } 
    int i2 = getWidth();
    int i3 = getHeight();
    paramInt4 = getPaddingLeft();
    int i4 = getPaddingRight();
    int i5 = getPaddingTop();
    int i6 = getPaddingBottom();
    int i7 = i2 - i4;
    int[] arrayOfInt = this.D;
    arrayOfInt[1] = 0;
    arrayOfInt[0] = 0;
    int i8 = af.h(this);
    if (a(this.e)) {
      if (i1) {
        paramInt3 = b(this.e, i7, arrayOfInt, i8);
        i9 = paramInt4;
      } else {
        i9 = a(this.e, paramInt4, arrayOfInt, i8);
        paramInt3 = i7;
      } 
    } else {
      i9 = paramInt4;
      paramInt3 = i7;
    } 
    paramInt1 = paramInt3;
    paramInt2 = i9;
    if (a(this.i))
      if (i1) {
        paramInt1 = b(this.i, paramInt3, arrayOfInt, i8);
        paramInt2 = i9;
      } else {
        paramInt2 = a(this.i, i9, arrayOfInt, i8);
        paramInt1 = paramInt3;
      }  
    paramInt3 = paramInt1;
    int i9 = paramInt2;
    if (a(this.b))
      if (i1) {
        i9 = a(this.b, paramInt2, arrayOfInt, i8);
        paramInt3 = paramInt1;
      } else {
        paramInt3 = b(this.b, paramInt1, arrayOfInt, i8);
        i9 = paramInt2;
      }  
    arrayOfInt[0] = Math.max(0, getContentInsetLeft() - i9);
    arrayOfInt[1] = Math.max(0, getContentInsetRight() - i7 - paramInt3);
    paramInt2 = Math.max(i9, getContentInsetLeft());
    paramInt3 = Math.min(paramInt3, i7 - getContentInsetRight());
    paramInt1 = paramInt3;
    i9 = paramInt2;
    if (a(this.a))
      if (i1) {
        paramInt1 = b(this.a, paramInt3, arrayOfInt, i8);
        i9 = paramInt2;
      } else {
        i9 = a(this.a, paramInt2, arrayOfInt, i8);
        paramInt1 = paramInt3;
      }  
    paramInt2 = paramInt1;
    paramInt3 = i9;
    if (a(this.f))
      if (i1) {
        paramInt2 = b(this.f, paramInt1, arrayOfInt, i8);
        paramInt3 = i9;
      } else {
        paramInt3 = a(this.f, i9, arrayOfInt, i8);
        paramInt2 = paramInt1;
      }  
    paramBoolean = a(this.c);
    boolean bool = a(this.d);
    if (paramBoolean) {
      b b1 = (b)this.c.getLayoutParams();
      paramInt1 = b1.topMargin + this.c.getMeasuredHeight() + b1.bottomMargin + 0;
    } else {
      paramInt1 = 0;
    } 
    if (bool) {
      b b1 = (b)this.d.getLayoutParams();
      paramInt1 += b1.topMargin + this.d.getMeasuredHeight() + b1.bottomMargin;
    } 
    if (paramBoolean || bool) {
      TextView textView2;
      TextView textView1;
      if (paramBoolean) {
        textView1 = this.c;
      } else {
        textView1 = this.d;
      } 
      if (bool) {
        textView2 = this.d;
      } else {
        textView2 = this.c;
      } 
      b b1 = (b)textView1.getLayoutParams();
      b b2 = (b)textView2.getLayoutParams();
      if ((paramBoolean && this.c.getMeasuredWidth() > 0) || (bool && this.d.getMeasuredWidth() > 0)) {
        i7 = 1;
      } else {
        i7 = 0;
      } 
      i9 = this.u & 0x70;
      if (i9 != 48) {
        if (i9 != 80) {
          i9 = (i3 - i5 - i6 - paramInt1) / 2;
          if (i9 < b1.topMargin + this.r) {
            paramInt1 = b1.topMargin + this.r;
          } else {
            i6 = i3 - i6 - paramInt1 - i9 - i5;
            paramInt1 = i9;
            if (i6 < b1.bottomMargin + this.s)
              paramInt1 = Math.max(0, i9 - b2.bottomMargin + this.s - i6); 
          } 
          paramInt1 = i5 + paramInt1;
        } else {
          paramInt1 = i3 - i6 - b2.bottomMargin - this.s - paramInt1;
        } 
      } else {
        paramInt1 = getPaddingTop() + b1.topMargin + this.r;
      } 
      if (i1) {
        if (i7 != 0) {
          i9 = this.p;
        } else {
          i9 = 0;
        } 
        i9 -= arrayOfInt[1];
        paramInt2 -= Math.max(0, i9);
        arrayOfInt[1] = Math.max(0, -i9);
        if (paramBoolean) {
          b1 = (b)this.c.getLayoutParams();
          i1 = paramInt2 - this.c.getMeasuredWidth();
          i9 = this.c.getMeasuredHeight() + paramInt1;
          this.c.layout(i1, paramInt1, paramInt2, i9);
          paramInt1 = i1 - this.q;
          i1 = i9 + b1.bottomMargin;
        } else {
          i9 = paramInt2;
          i1 = paramInt1;
          paramInt1 = i9;
        } 
        if (bool) {
          b1 = (b)this.d.getLayoutParams();
          i5 = i1 + b1.topMargin;
          i9 = this.d.getMeasuredWidth();
          i1 = this.d.getMeasuredHeight();
          this.d.layout(paramInt2 - i9, i5, paramInt2, i1 + i5);
          i9 = paramInt2 - this.q;
          i1 = b1.bottomMargin;
        } else {
          i9 = paramInt2;
        } 
        if (i7 != 0)
          paramInt2 = Math.min(paramInt1, i9); 
        paramInt1 = paramInt3;
      } else {
        if (i7 != 0) {
          i9 = this.p;
        } else {
          i9 = 0;
        } 
        i9 -= arrayOfInt[0];
        paramInt3 += Math.max(0, i9);
        arrayOfInt[0] = Math.max(0, -i9);
        if (paramBoolean) {
          b1 = (b)this.c.getLayoutParams();
          i1 = this.c.getMeasuredWidth() + paramInt3;
          i9 = this.c.getMeasuredHeight() + paramInt1;
          this.c.layout(paramInt3, paramInt1, i1, i9);
          i1 += this.q;
          paramInt1 = i9 + b1.bottomMargin;
        } else {
          i1 = paramInt3;
        } 
        if (bool) {
          b1 = (b)this.d.getLayoutParams();
          paramInt1 += b1.topMargin;
          i5 = this.d.getMeasuredWidth() + paramInt3;
          i9 = this.d.getMeasuredHeight();
          this.d.layout(paramInt3, paramInt1, i5, i9 + paramInt1);
          i5 += this.q;
          paramInt1 = b1.bottomMargin;
        } else {
          i5 = paramInt3;
        } 
        i9 = paramInt2;
        paramInt1 = paramInt3;
        if (i7 != 0) {
          paramInt1 = Math.max(i1, i5);
          i9 = paramInt2;
        } 
        paramInt3 = 0;
        a(this.B, 3);
        i7 = this.B.size();
        paramInt2 = 0;
      } 
    } else {
      paramInt1 = paramInt3;
    } 
    i9 = paramInt2;
    paramInt3 = 0;
    a(this.B, 3);
    i7 = this.B.size();
    paramInt2 = 0;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    int[] arrayOfInt = this.D;
    if (au.a(this)) {
      i1 = 1;
      i2 = 0;
    } else {
      i1 = 0;
      i2 = 1;
    } 
    if (a(this.e)) {
      a(this.e, paramInt1, 0, paramInt2, 0, this.o);
      i3 = this.e.getMeasuredWidth() + b(this.e);
      i4 = Math.max(0, this.e.getMeasuredHeight() + c(this.e));
      i5 = au.a(0, af.f(this.e));
    } else {
      i3 = 0;
      i4 = 0;
      i5 = 0;
    } 
    int i6 = i3;
    int i7 = i4;
    int i3 = i5;
    if (a(this.i)) {
      a(this.i, paramInt1, 0, paramInt2, 0, this.o);
      i6 = this.i.getMeasuredWidth() + b(this.i);
      i7 = Math.max(i4, this.i.getMeasuredHeight() + c(this.i));
      i3 = au.a(i5, af.f(this.i));
    } 
    int i5 = getContentInsetStart();
    int i4 = Math.max(i5, i6) + 0;
    arrayOfInt[i1] = Math.max(0, i5 - i6);
    if (a(this.b)) {
      a(this.b, paramInt1, i4, paramInt2, 0, this.o);
      i5 = this.b.getMeasuredWidth() + b(this.b);
      i7 = Math.max(i7, this.b.getMeasuredHeight() + c(this.b));
      i3 = au.a(i3, af.f(this.b));
    } else {
      i5 = 0;
    } 
    i6 = getContentInsetEnd();
    int i1 = i4 + Math.max(i6, i5);
    arrayOfInt[i2] = Math.max(0, i6 - i5);
    int i2 = i1;
    i4 = i7;
    i5 = i3;
    if (a(this.a)) {
      i2 = i1 + a(this.a, paramInt1, i1, paramInt2, 0, arrayOfInt);
      i4 = Math.max(i7, this.a.getMeasuredHeight() + c(this.a));
      i5 = au.a(i3, af.f(this.a));
    } 
    i1 = i2;
    i7 = i4;
    i3 = i5;
    if (a(this.f)) {
      i1 = i2 + a(this.f, paramInt1, i2, paramInt2, 0, arrayOfInt);
      i7 = Math.max(i4, this.f.getMeasuredHeight() + c(this.f));
      i3 = au.a(i5, af.f(this.f));
    } 
    int i8 = getChildCount();
    i4 = i1;
    i5 = 0;
    i2 = i7;
    i7 = i5;
    while (i7 < i8) {
      View view = getChildAt(i7);
      i6 = i4;
      i1 = i3;
      i5 = i2;
      if (((b)view.getLayoutParams()).b == 0)
        if (!a(view)) {
          i6 = i4;
          i1 = i3;
          i5 = i2;
        } else {
          i6 = i4 + a(view, paramInt1, i4, paramInt2, 0, arrayOfInt);
          i5 = Math.max(i2, view.getMeasuredHeight() + c(view));
          i1 = au.a(i3, af.f(view));
        }  
      i7++;
      i4 = i6;
      i3 = i1;
      i2 = i5;
    } 
    i6 = this.r + this.s;
    i1 = this.p + this.q;
    if (a(this.c)) {
      a(this.c, paramInt1, i4 + i1, paramInt2, i6, arrayOfInt);
      i7 = this.c.getMeasuredWidth();
      i8 = b(this.c);
      i5 = this.c.getMeasuredHeight();
      int i9 = c(this.c);
      i3 = au.a(i3, af.f(this.c));
      i5 += i9;
      i7 += i8;
    } else {
      i7 = 0;
      i5 = 0;
    } 
    if (a(this.d)) {
      i7 = Math.max(i7, a(this.d, paramInt1, i4 + i1, paramInt2, i5 + i6, arrayOfInt));
      i5 += this.d.getMeasuredHeight() + c(this.d);
      i3 = au.a(i3, af.f(this.d));
    } 
    i1 = Math.max(i2, i5);
    i8 = getPaddingLeft();
    i6 = getPaddingRight();
    i2 = getPaddingTop();
    i5 = getPaddingBottom();
    i7 = af.a(Math.max(i4 + i7 + i8 + i6, getSuggestedMinimumWidth()), paramInt1, 0xFF000000 & i3);
    paramInt1 = af.a(Math.max(i1 + i2 + i5, getSuggestedMinimumHeight()), paramInt2, i3 << 16);
    if (r())
      paramInt1 = 0; 
    setMeasuredDimension(i7, paramInt1);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof d)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    d d1 = (d)paramParcelable;
    super.onRestoreInstanceState(d1.getSuperState());
    if (this.b != null) {
      f f1 = this.b.d();
    } else {
      paramParcelable = null;
    } 
    if (d1.a != 0 && this.I != null && paramParcelable != null) {
      MenuItem menuItem = paramParcelable.findItem(d1.a);
      if (menuItem != null)
        p.b(menuItem); 
    } 
    if (d1.b)
      q(); 
  }
  
  public void onRtlPropertiesChanged(int paramInt) {
    if (Build.VERSION.SDK_INT >= 17)
      super.onRtlPropertiesChanged(paramInt); 
    aj aj1 = this.t;
    boolean bool = true;
    if (paramInt != 1)
      bool = false; 
    aj1.a(bool);
  }
  
  protected Parcelable onSaveInstanceState() {
    d d1 = new d(super.onSaveInstanceState());
    if (this.I != null && this.I.b != null)
      d1.a = this.I.b.getItemId(); 
    d1.b = b();
    return d1;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    int i1 = s.a(paramMotionEvent);
    if (i1 == 0)
      this.z = false; 
    if (!this.z) {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if (i1 == 0 && !bool)
        this.z = true; 
    } 
    if (i1 == 1 || i1 == 3)
      this.z = false; 
    return true;
  }
  
  public void setCollapsible(boolean paramBoolean) {
    this.L = paramBoolean;
    requestLayout();
  }
  
  public void setLogo(int paramInt) { setLogo(this.N.a(getContext(), paramInt)); }
  
  public void setLogo(Drawable paramDrawable) {
    if (paramDrawable != null) {
      l();
      if (!d(this.f))
        a(this.f, true); 
    } else if (this.f != null && d(this.f)) {
      removeView(this.f);
      this.C.remove(this.f);
    } 
    if (this.f != null)
      this.f.setImageDrawable(paramDrawable); 
  }
  
  public void setLogoDescription(int paramInt) { setLogoDescription(getContext().getText(paramInt)); }
  
  public void setLogoDescription(CharSequence paramCharSequence) {
    if (!TextUtils.isEmpty(paramCharSequence))
      l(); 
    if (this.f != null)
      this.f.setContentDescription(paramCharSequence); 
  }
  
  public void setNavigationContentDescription(int paramInt) {
    CharSequence charSequence;
    if (paramInt != 0) {
      charSequence = getContext().getText(paramInt);
    } else {
      charSequence = null;
    } 
    setNavigationContentDescription(charSequence);
  }
  
  public void setNavigationContentDescription(CharSequence paramCharSequence) {
    if (!TextUtils.isEmpty(paramCharSequence))
      o(); 
    if (this.e != null)
      this.e.setContentDescription(paramCharSequence); 
  }
  
  public void setNavigationIcon(int paramInt) { setNavigationIcon(this.N.a(getContext(), paramInt)); }
  
  public void setNavigationIcon(Drawable paramDrawable) {
    if (paramDrawable != null) {
      o();
      if (!d(this.e))
        a(this.e, true); 
    } else if (this.e != null && d(this.e)) {
      removeView(this.e);
      this.C.remove(this.e);
    } 
    if (this.e != null)
      this.e.setImageDrawable(paramDrawable); 
  }
  
  public void setNavigationOnClickListener(View.OnClickListener paramOnClickListener) {
    o();
    this.e.setOnClickListener(paramOnClickListener);
  }
  
  public void setOnMenuItemClickListener(c paramc) { this.E = paramc; }
  
  public void setOverflowIcon(Drawable paramDrawable) {
    m();
    this.b.setOverflowIcon(paramDrawable);
  }
  
  public void setPopupTheme(int paramInt) {
    if (this.k != paramInt) {
      this.k = paramInt;
      if (paramInt == 0) {
        this.j = getContext();
        return;
      } 
      this.j = new ContextThemeWrapper(getContext(), paramInt);
    } 
  }
  
  public void setSubtitle(int paramInt) { setSubtitle(getContext().getText(paramInt)); }
  
  public void setSubtitle(CharSequence paramCharSequence) {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      if (this.d == null) {
        Context context = getContext();
        this.d = new TextView(context);
        this.d.setSingleLine();
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        if (this.m != 0)
          this.d.setTextAppearance(context, this.m); 
        if (this.y != 0)
          this.d.setTextColor(this.y); 
      } 
      if (!d(this.d))
        a(this.d, true); 
    } else if (this.d != null && d(this.d)) {
      removeView(this.d);
      this.C.remove(this.d);
    } 
    if (this.d != null)
      this.d.setText(paramCharSequence); 
    this.w = paramCharSequence;
  }
  
  public void setSubtitleTextColor(int paramInt) {
    this.y = paramInt;
    if (this.d != null)
      this.d.setTextColor(paramInt); 
  }
  
  public void setTitle(int paramInt) { setTitle(getContext().getText(paramInt)); }
  
  public void setTitle(CharSequence paramCharSequence) {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      if (this.c == null) {
        Context context = getContext();
        this.c = new TextView(context);
        this.c.setSingleLine();
        this.c.setEllipsize(TextUtils.TruncateAt.END);
        if (this.l != 0)
          this.c.setTextAppearance(context, this.l); 
        if (this.x != 0)
          this.c.setTextColor(this.x); 
      } 
      if (!d(this.c))
        a(this.c, true); 
    } else if (this.c != null && d(this.c)) {
      removeView(this.c);
      this.C.remove(this.c);
    } 
    if (this.c != null)
      this.c.setText(paramCharSequence); 
    this.v = paramCharSequence;
  }
  
  public void setTitleTextColor(int paramInt) {
    this.x = paramInt;
    if (this.c != null)
      this.c.setTextColor(paramInt); 
  }
  
  private class a implements l {
    f a;
    
    h b;
    
    private a(Toolbar this$0) {}
    
    public void a(Context param1Context, f param1f) {
      if (this.a != null && this.b != null)
        this.a.d(this.b); 
      this.a = param1f;
    }
    
    public void a(f param1f, boolean param1Boolean) {}
    
    public boolean a(f param1f, h param1h) {
      Toolbar.b(this.c);
      if (Toolbar.c(this.c).getParent() != this.c)
        this.c.addView(Toolbar.c(this.c)); 
      this.c.a = param1h.getActionView();
      this.b = param1h;
      if (this.c.a.getParent() != this.c) {
        Toolbar.b b1 = this.c.i();
        b1.a = 0x800003 | Toolbar.d(this.c) & 0x70;
        b1.b = 2;
        this.c.a.setLayoutParams(b1);
        this.c.addView(this.c.a);
      } 
      this.c.j();
      this.c.requestLayout();
      param1h.e(true);
      if (this.c.a instanceof c)
        ((c)this.c.a).a(); 
      return true;
    }
    
    public boolean a(p param1p) { return false; }
    
    public void b(boolean param1Boolean) {
      if (this.b != null) {
        f f1 = this.a;
        byte b1 = 0;
        byte b2 = b1;
        if (f1 != null) {
          int i = this.a.size();
          byte b3 = 0;
          while (true) {
            b2 = b1;
            if (b3 < i) {
              if (this.a.getItem(b3) == this.b) {
                b2 = 1;
                break;
              } 
              b3++;
              continue;
            } 
            break;
          } 
        } 
        if (b2 == 0)
          b(this.a, this.b); 
      } 
    }
    
    public boolean b() { return false; }
    
    public boolean b(f param1f, h param1h) {
      if (this.c.a instanceof c)
        ((c)this.c.a).b(); 
      this.c.removeView(this.c.a);
      this.c.removeView(Toolbar.c(this.c));
      this.c.a = null;
      this.c.k();
      this.b = null;
      this.c.requestLayout();
      param1h.e(false);
      return true;
    }
  }
  
  public static class b extends a.a {
    int b = 0;
    
    public b(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
      this.a = 8388627;
    }
    
    public b(Context param1Context, AttributeSet param1AttributeSet) { super(param1Context, param1AttributeSet); }
    
    public b(a.a param1a) { super(param1a); }
    
    public b(b param1b) {
      super(param1b);
      this.b = param1b.b;
    }
    
    public b(ViewGroup.LayoutParams param1LayoutParams) { super(param1LayoutParams); }
    
    public b(ViewGroup.MarginLayoutParams param1MarginLayoutParams) {
      super(param1MarginLayoutParams);
      a(param1MarginLayoutParams);
    }
    
    void a(ViewGroup.MarginLayoutParams param1MarginLayoutParams) {
      this.leftMargin = param1MarginLayoutParams.leftMargin;
      this.topMargin = param1MarginLayoutParams.topMargin;
      this.rightMargin = param1MarginLayoutParams.rightMargin;
      this.bottomMargin = param1MarginLayoutParams.bottomMargin;
    }
  }
  
  public static interface c {
    boolean a(MenuItem param1MenuItem);
  }
  
  public static class d extends View.BaseSavedState {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() {
        public Toolbar.d a(Parcel param2Parcel) { return new Toolbar.d(param2Parcel); }
        
        public Toolbar.d[] a(int param2Int) { return new Toolbar.d[param2Int]; }
      };
    
    int a;
    
    boolean b;
    
    public d(Parcel param1Parcel) {
      super(param1Parcel);
      this.a = param1Parcel.readInt();
      if (param1Parcel.readInt() != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      this.b = bool;
    }
    
    public d(Parcelable param1Parcelable) { super(param1Parcelable); }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeInt(this.a);
      param1Parcel.writeInt(this.b);
    }
  }
  
  static final class null extends Object implements Parcelable.Creator<d> {
    public Toolbar.d a(Parcel param1Parcel) { return new Toolbar.d(param1Parcel); }
    
    public Toolbar.d[] a(int param1Int) { return new Toolbar.d[param1Int]; }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/Toolbar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */