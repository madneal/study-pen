package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.h.af;
import android.support.v4.h.au;
import android.support.v4.h.ay;
import android.support.v4.h.az;
import android.support.v4.h.y;
import android.support.v4.h.z;
import android.support.v4.widget.u;
import android.support.v7.b.a;
import android.support.v7.view.menu.l;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public class ActionBarOverlayLayout extends ViewGroup implements y, ab {
  static final int[] a = { a.a.actionBarSize, 16842841 };
  
  private final Runnable A = new Runnable(this) {
      public void run() {
        ActionBarOverlayLayout.a(this.a);
        ActionBarOverlayLayout.a(this.a, af.i(ActionBarOverlayLayout.c(this.a)).b(-ActionBarOverlayLayout.c(this.a).getHeight()).a(ActionBarOverlayLayout.b(this.a)));
      }
    };
  
  private final z B;
  
  private int b;
  
  private int c = 0;
  
  private ContentFrameLayout d;
  
  private ActionBarContainer e;
  
  private ac f;
  
  private Drawable g;
  
  private boolean h;
  
  private boolean i;
  
  private boolean j;
  
  private boolean k;
  
  private boolean l;
  
  private int m;
  
  private int n;
  
  private final Rect o = new Rect();
  
  private final Rect p = new Rect();
  
  private final Rect q = new Rect();
  
  private final Rect r = new Rect();
  
  private final Rect s = new Rect();
  
  private final Rect t = new Rect();
  
  private a u;
  
  private final int v = 600;
  
  private u w;
  
  private au x;
  
  private final ay y = new az(this) {
      public void b(View param1View) {
        ActionBarOverlayLayout.a(this.a, null);
        ActionBarOverlayLayout.a(this.a, false);
      }
      
      public void c(View param1View) {
        ActionBarOverlayLayout.a(this.a, null);
        ActionBarOverlayLayout.a(this.a, false);
      }
    };
  
  private final Runnable z = new Runnable(this) {
      public void run() {
        ActionBarOverlayLayout.a(this.a);
        ActionBarOverlayLayout.a(this.a, af.i(ActionBarOverlayLayout.c(this.a)).b(0.0F).a(ActionBarOverlayLayout.b(this.a)));
      }
    };
  
  public ActionBarOverlayLayout(Context paramContext) { this(paramContext, null); }
  
  public ActionBarOverlayLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    a(paramContext);
    this.B = new z(this);
  }
  
  private ac a(View paramView) {
    if (paramView instanceof ac)
      return (ac)paramView; 
    if (paramView instanceof Toolbar)
      return ((Toolbar)paramView).getWrapper(); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Can't make a decor toolbar out of ");
    stringBuilder.append(paramView.getClass().getSimpleName());
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  private void a(Context paramContext) {
    TypedArray typedArray = getContext().getTheme().obtainStyledAttributes(a);
    boolean bool = false;
    this.b = typedArray.getDimensionPixelSize(0, 0);
    this.g = typedArray.getDrawable(1);
    if (this.g == null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    setWillNotDraw(bool1);
    typedArray.recycle();
    boolean bool1 = bool;
    if ((paramContext.getApplicationInfo()).targetSdkVersion < 19)
      bool1 = true; 
    this.h = bool1;
    this.w = u.a(paramContext);
  }
  
  private boolean a(float paramFloat1, float paramFloat2) {
    this.w.a(0, 0, 0, (int)paramFloat2, 0, 0, -2147483648, 2147483647);
    return (this.w.d() > this.e.getHeight());
  }
  
  private boolean a(View paramView, Rect paramRect, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    boolean bool;
    b b1 = (b)paramView.getLayoutParams();
    if (paramBoolean1 && b1.leftMargin != paramRect.left) {
      b1.leftMargin = paramRect.left;
      bool = true;
    } else {
      bool = false;
    } 
    paramBoolean1 = bool;
    if (paramBoolean2) {
      paramBoolean1 = bool;
      if (b1.topMargin != paramRect.top) {
        b1.topMargin = paramRect.top;
        paramBoolean1 = true;
      } 
    } 
    paramBoolean2 = paramBoolean1;
    if (paramBoolean4) {
      paramBoolean2 = paramBoolean1;
      if (b1.rightMargin != paramRect.right) {
        b1.rightMargin = paramRect.right;
        paramBoolean2 = true;
      } 
    } 
    paramBoolean1 = paramBoolean2;
    if (paramBoolean3) {
      paramBoolean1 = paramBoolean2;
      if (b1.bottomMargin != paramRect.bottom) {
        b1.bottomMargin = paramRect.bottom;
        paramBoolean1 = true;
      } 
    } 
    return paramBoolean1;
  }
  
  private void k() {
    removeCallbacks(this.z);
    removeCallbacks(this.A);
    if (this.x != null)
      this.x.b(); 
  }
  
  private void l() {
    k();
    postDelayed(this.z, 600L);
  }
  
  private void m() {
    k();
    postDelayed(this.A, 600L);
  }
  
  private void n() {
    k();
    this.z.run();
  }
  
  private void o() {
    k();
    this.A.run();
  }
  
  public b a(AttributeSet paramAttributeSet) { return new b(getContext(), paramAttributeSet); }
  
  public void a(int paramInt) {
    c();
    if (paramInt != 2) {
      if (paramInt != 5) {
        if (paramInt != 109)
          return; 
        setOverlayMode(true);
        return;
      } 
      this.f.g();
      return;
    } 
    this.f.f();
  }
  
  public void a(Menu paramMenu, l.a parama) {
    c();
    this.f.a(paramMenu, parama);
  }
  
  public boolean a() { return this.i; }
  
  protected b b() { return new b(-1, -1); }
  
  void c() {
    if (this.d == null) {
      this.d = (ContentFrameLayout)findViewById(a.f.action_bar_activity_content);
      this.e = (ActionBarContainer)findViewById(a.f.action_bar_container);
      this.f = a(findViewById(a.f.action_bar));
    } 
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) { return paramLayoutParams instanceof b; }
  
  public boolean d() {
    c();
    return this.f.h();
  }
  
  public void draw(Canvas paramCanvas) {
    super.draw(paramCanvas);
    if (this.g != null && !this.h) {
      int i1;
      if (this.e.getVisibility() == 0) {
        i1 = (int)(this.e.getBottom() + af.g(this.e) + 0.5F);
      } else {
        i1 = 0;
      } 
      this.g.setBounds(0, i1, getWidth(), this.g.getIntrinsicHeight() + i1);
      this.g.draw(paramCanvas);
    } 
  }
  
  public boolean e() {
    c();
    return this.f.i();
  }
  
  public boolean f() {
    c();
    return this.f.j();
  }
  
  protected boolean fitSystemWindows(Rect paramRect) {
    c();
    af.j(this);
    boolean bool = a(this.e, paramRect, true, true, false, true);
    this.r.set(paramRect);
    au.a(this, this.r, this.o);
    if (!this.p.equals(this.o)) {
      this.p.set(this.o);
      bool = true;
    } 
    if (bool)
      requestLayout(); 
    return true;
  }
  
  public boolean g() {
    c();
    return this.f.k();
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) { return new b(paramLayoutParams); }
  
  public int getActionBarHideOffset() { return (this.e != null) ? -((int)af.g(this.e)) : 0; }
  
  public int getNestedScrollAxes() { return this.B.a(); }
  
  public CharSequence getTitle() {
    c();
    return this.f.e();
  }
  
  public boolean h() {
    c();
    return this.f.l();
  }
  
  public void i() {
    c();
    this.f.m();
  }
  
  public void j() {
    c();
    this.f.n();
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration) {
    if (Build.VERSION.SDK_INT >= 8)
      super.onConfigurationChanged(paramConfiguration); 
    a(getContext());
    af.k(this);
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    k();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt3 = getChildCount();
    paramInt2 = getPaddingLeft();
    getPaddingRight();
    paramInt4 = getPaddingTop();
    getPaddingBottom();
    for (paramInt1 = 0; paramInt1 < paramInt3; paramInt1++) {
      View view = getChildAt(paramInt1);
      if (view.getVisibility() != 8) {
        b b1 = (b)view.getLayoutParams();
        int i1 = view.getMeasuredWidth();
        int i2 = view.getMeasuredHeight();
        int i3 = b1.leftMargin + paramInt2;
        int i4 = b1.topMargin + paramInt4;
        view.layout(i3, i4, i1 + i3, i2 + i4);
      } 
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    c();
    measureChildWithMargins(this.e, paramInt1, 0, paramInt2, 0);
    Rect rect = (b)this.e.getLayoutParams();
    int i1 = Math.max(0, this.e.getMeasuredWidth() + rect.leftMargin + rect.rightMargin);
    int i2 = Math.max(0, this.e.getMeasuredHeight() + rect.topMargin + rect.bottomMargin);
    int i3 = au.a(0, af.f(this.e));
    if ((af.j(this) & 0x100) != 0) {
      i4 = 1;
    } else {
      i4 = 0;
    } 
    if (i4) {
      int i7 = this.b;
      i6 = i7;
      if (this.j) {
        i6 = i7;
        if (this.e.getTabContainer() != null)
          i6 = i7 + this.b; 
      } 
    } else if (this.e.getVisibility() != 8) {
      i6 = this.e.getMeasuredHeight();
    } else {
      i6 = 0;
    } 
    this.q.set(this.o);
    this.s.set(this.r);
    if (!this.i && !i4) {
      Rect rect1 = this.q;
      rect1.top += i6;
      rect1 = this.q;
    } else {
      rect = this.s;
      rect.top += i6;
      rect = this.s;
    } 
    rect.bottom += 0;
    a(this.d, this.q, true, true, true, true);
    if (!this.t.equals(this.s)) {
      this.t.set(this.s);
      this.d.a(this.s);
    } 
    measureChildWithMargins(this.d, paramInt1, 0, paramInt2, 0);
    b b1 = (b)this.d.getLayoutParams();
    int i6 = Math.max(i1, this.d.getMeasuredWidth() + b1.leftMargin + b1.rightMargin);
    int i4 = Math.max(i2, this.d.getMeasuredHeight() + b1.topMargin + b1.bottomMargin);
    i3 = au.a(i3, af.f(this.d));
    i2 = getPaddingLeft();
    int i5 = getPaddingRight();
    i4 = Math.max(i4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight());
    setMeasuredDimension(af.a(Math.max(i6 + i2 + i5, getSuggestedMinimumWidth()), paramInt1, i3), af.a(i4, paramInt2, i3 << 16));
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean) {
    if (!this.k || !paramBoolean)
      return false; 
    if (a(paramFloat1, paramFloat2)) {
      o();
    } else {
      n();
    } 
    this.l = true;
    return true;
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2) { return false; }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt) {}
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.m += paramInt2;
    setActionBarHideOffset(this.m);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt) {
    this.B.a(paramView1, paramView2, paramInt);
    this.m = getActionBarHideOffset();
    k();
    if (this.u != null)
      this.u.n(); 
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt) { return ((paramInt & 0x2) == 0 || this.e.getVisibility() != 0) ? false : this.k; }
  
  public void onStopNestedScroll(View paramView) {
    if (this.k && !this.l)
      if (this.m <= this.e.getHeight()) {
        l();
      } else {
        m();
      }  
    if (this.u != null)
      this.u.o(); 
  }
  
  public void onWindowSystemUiVisibilityChanged(int paramInt) {
    boolean bool2;
    if (Build.VERSION.SDK_INT >= 16)
      super.onWindowSystemUiVisibilityChanged(paramInt); 
    c();
    int i1 = this.n;
    this.n = paramInt;
    boolean bool1 = false;
    if ((paramInt & 0x4) == 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if ((paramInt & 0x100) != 0)
      bool1 = true; 
    if (this.u != null) {
      this.u.g(bool1 ^ true);
      if (bool2 || !bool1) {
        this.u.l();
      } else {
        this.u.m();
      } 
    } 
    if (((i1 ^ paramInt) & 0x100) != 0 && this.u != null)
      af.k(this); 
  }
  
  protected void onWindowVisibilityChanged(int paramInt) {
    super.onWindowVisibilityChanged(paramInt);
    this.c = paramInt;
    if (this.u != null)
      this.u.a(paramInt); 
  }
  
  public void setActionBarHideOffset(int paramInt) {
    k();
    paramInt = Math.max(0, Math.min(paramInt, this.e.getHeight()));
    af.a(this.e, -paramInt);
  }
  
  public void setActionBarVisibilityCallback(a parama) {
    this.u = parama;
    if (getWindowToken() != null) {
      this.u.a(this.c);
      if (this.n != 0) {
        onWindowSystemUiVisibilityChanged(this.n);
        af.k(this);
      } 
    } 
  }
  
  public void setHasNonEmbeddedTabs(boolean paramBoolean) { this.j = paramBoolean; }
  
  public void setHideOnContentScrollEnabled(boolean paramBoolean) {
    if (paramBoolean != this.k) {
      this.k = paramBoolean;
      if (!paramBoolean) {
        k();
        setActionBarHideOffset(0);
      } 
    } 
  }
  
  public void setIcon(int paramInt) {
    c();
    this.f.a(paramInt);
  }
  
  public void setIcon(Drawable paramDrawable) {
    c();
    this.f.a(paramDrawable);
  }
  
  public void setLogo(int paramInt) {
    c();
    this.f.b(paramInt);
  }
  
  public void setOverlayMode(boolean paramBoolean) {
    this.i = paramBoolean;
    if (paramBoolean && (getContext().getApplicationInfo()).targetSdkVersion < 19) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    this.h = paramBoolean;
  }
  
  public void setShowingForActionMode(boolean paramBoolean) {}
  
  public void setUiOptions(int paramInt) {}
  
  public void setWindowCallback(Window.Callback paramCallback) {
    c();
    this.f.a(paramCallback);
  }
  
  public void setWindowTitle(CharSequence paramCharSequence) {
    c();
    this.f.a(paramCharSequence);
  }
  
  public boolean shouldDelayChildPressedState() { return false; }
  
  public static interface a {
    void a(int param1Int);
    
    void g(boolean param1Boolean);
    
    void l();
    
    void m();
    
    void n();
    
    void o();
  }
  
  public static class b extends ViewGroup.MarginLayoutParams {
    public b(int param1Int1, int param1Int2) { super(param1Int1, param1Int2); }
    
    public b(Context param1Context, AttributeSet param1AttributeSet) { super(param1Context, param1AttributeSet); }
    
    public b(ViewGroup.LayoutParams param1LayoutParams) { super(param1LayoutParams); }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/ActionBarOverlayLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */