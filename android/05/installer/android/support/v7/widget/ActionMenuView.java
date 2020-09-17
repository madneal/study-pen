package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.l;
import android.support.v7.view.menu.m;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class ActionMenuView extends af implements f.b, m {
  private f a;
  
  private Context b;
  
  private int c;
  
  private boolean d;
  
  private d e;
  
  private l.a f;
  
  private f.a g;
  
  private boolean h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private e l;
  
  public ActionMenuView(Context paramContext) { this(paramContext, null); }
  
  public ActionMenuView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    setBaselineAligned(false);
    float f1 = (paramContext.getResources().getDisplayMetrics()).density;
    this.j = (int)(56.0F * f1);
    this.k = (int)(f1 * 4.0F);
    this.b = paramContext;
    this.c = 0;
  }
  
  static int a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Object object;
    c c1 = (c)paramView.getLayoutParams();
    int n = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt3) - paramInt4, View.MeasureSpec.getMode(paramInt3));
    if (paramView instanceof ActionMenuItemView) {
      object = (ActionMenuItemView)paramView;
    } else {
      object = null;
    } 
    byte b1 = 0;
    if (object != null && object.b()) {
      paramInt3 = 1;
    } else {
      paramInt3 = 0;
    } 
    paramInt4 = 2;
    if (paramInt2 > 0 && (paramInt3 == 0 || paramInt2 >= 2)) {
      paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt2 * paramInt1, -2147483648), n);
      int i1 = paramView.getMeasuredWidth();
      int i2 = i1 / paramInt1;
      paramInt2 = i2;
      if (i1 % paramInt1 != 0)
        paramInt2 = i2 + 1; 
      if (paramInt3 != 0 && paramInt2 < 2)
        paramInt2 = paramInt4; 
    } else {
      paramInt2 = 0;
    } 
    byte b2 = b1;
    if (!c1.a) {
      b2 = b1;
      if (paramInt3 != 0)
        b2 = 1; 
    } 
    c1.d = b2;
    c1.b = paramInt2;
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1 * paramInt2, 1073741824), n);
    return paramInt2;
  }
  
  private void c(int paramInt1, int paramInt2) {
    int n = View.MeasureSpec.getMode(paramInt2);
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt2);
    paramInt1 = getPaddingLeft();
    int i3 = getPaddingRight();
    int i4 = getPaddingTop() + getPaddingBottom();
    int i5 = getChildMeasureSpec(paramInt2, i4, -2);
    int i6 = i1 - paramInt1 + i3;
    paramInt1 = i6 / this.j;
    paramInt2 = this.j;
    if (paramInt1 == 0) {
      setMeasuredDimension(i6, 0);
      return;
    } 
    int i7 = this.j + i6 % paramInt2 / paramInt1;
    int i8 = getChildCount();
    byte b1 = 0;
    int i9 = 0;
    i1 = 0;
    int i10 = 0;
    int i11 = 0;
    i3 = 0;
    long l1 = 0L;
    paramInt2 = i2;
    while (b1 < i8) {
      int i15;
      int i14;
      View view = getChildAt(b1);
      if (view.getVisibility() == 8) {
        i14 = i10;
        i15 = i11;
      } else {
        boolean bool = view instanceof ActionMenuItemView;
        i15 = i10 + true;
        if (bool)
          view.setPadding(this.k, 0, this.k, 0); 
        c c1 = (c)view.getLayoutParams();
        c1.f = false;
        c1.c = 0;
        c1.b = 0;
        c1.d = false;
        c1.leftMargin = 0;
        c1.rightMargin = 0;
        if (bool && ((ActionMenuItemView)view).b()) {
          bool = true;
        } else {
          bool = false;
        } 
        c1.e = bool;
        if (c1.a) {
          i2 = 1;
        } else {
          i2 = paramInt1;
        } 
        int i16 = a(view, i7, i2, i5, i4);
        i14 = Math.max(i11, i16);
        i2 = i3;
        if (c1.d)
          i2 = i3 + 1; 
        if (c1.a)
          i1 = 1; 
        i11 = paramInt1 - i16;
        i10 = Math.max(i9, view.getMeasuredHeight());
        if (i16 == 1) {
          long l2 = (1 << b1);
          paramInt1 = i15;
          i15 = i14;
          l1 |= l2;
          i9 = i10;
          i14 = paramInt1;
          paramInt1 = i11;
          i3 = i2;
        } else {
          i9 = i15;
          i15 = i14;
          i3 = i2;
          paramInt1 = i11;
          i14 = i9;
          i9 = i10;
        } 
      } 
      b1++;
      i10 = i14;
      i11 = i15;
    } 
    if (i1 != 0 && i10 == 2) {
      b1 = 1;
    } else {
      b1 = 0;
    } 
    int i12 = 0;
    i4 = paramInt1;
    int i13 = i8;
    i2 = i5;
    for (paramInt1 = i12; i3 > 0 && i4 > 0; paramInt1 = 1) {
      i8 = 0;
      int i14 = 0;
      i5 = Integer.MAX_VALUE;
      long l2;
      for (l2 = 0L; i8 < i13; l2 = l3) {
        long l3;
        int i15;
        c c1 = (c)getChildAt(i8).getLayoutParams();
        if (!c1.d) {
          i12 = i14;
          i15 = i5;
          l3 = l2;
        } else if (c1.b < i5) {
          i15 = c1.b;
          l3 = (1 << i8);
          i12 = 1;
        } else {
          i12 = i14;
          i15 = i5;
          l3 = l2;
          if (c1.b == i5) {
            l3 = (1 << i8);
            i12 = i14 + 1;
            l3 = l2 | l3;
            i15 = i5;
          } 
        } 
        i8++;
        i14 = i12;
        i5 = i15;
      } 
      l1 |= l2;
      if (i14 > i4)
        break; 
      i12 = 0;
      while (i12 < i13) {
        long l3;
        View view = getChildAt(i12);
        c c1 = (c)view.getLayoutParams();
        long l4 = (1 << i12);
        if ((l2 & l4) == 0L) {
          paramInt1 = i4;
          l3 = l1;
          if (c1.b == i5 + 1) {
            l3 = l1 | l4;
            paramInt1 = i4;
          } 
        } else {
          if (b1 != 0 && c1.e && i4 == 1)
            view.setPadding(this.k + i7, 0, this.k, 0); 
          c1.b++;
          c1.f = true;
          paramInt1 = i4 - 1;
          l3 = l1;
        } 
        i12++;
        i4 = paramInt1;
        l1 = l3;
      } 
    } 
    if (i1 == 0 && i10 == 1) {
      i1 = 1;
    } else {
      i1 = 0;
    } 
    if (i4 > 0 && l1 != 0L && (i4 < i10 - 1 || i1 != 0 || i11 > 1)) {
      float f1 = Long.bitCount(l1);
      if (i1 == 0) {
        float f2;
        if ((l1 & 0x1L) != 0L) {
          f2 = f1;
          if (!((c)getChildAt(0).getLayoutParams()).e)
            f2 = f1 - 0.5F; 
        } else {
          f2 = f1;
        } 
        i1 = i13 - 1;
        f1 = f2;
        if ((l1 & (1 << i1)) != 0L) {
          f1 = f2;
          if (!((c)getChildAt(i1).getLayoutParams()).e)
            f1 = f2 - 0.5F; 
        } 
      } 
      if (f1 > 0.0F) {
        i1 = (int)((i4 * i7) / f1);
      } else {
        i1 = 0;
      } 
      i11 = i13;
      i3 = 0;
      while (true) {
        i12 = paramInt1;
        if (i3 < i11) {
          if ((l1 & (1 << i3)) == 0L) {
            i12 = paramInt1;
          } else {
            View view = getChildAt(i3);
            c c1 = (c)view.getLayoutParams();
            if (view instanceof ActionMenuItemView) {
              c1.c = i1;
              c1.f = true;
              if (i3 == 0 && !c1.e)
                c1.leftMargin = -i1 / 2; 
            } else if (c1.a) {
              c1.c = i1;
              c1.f = true;
              c1.rightMargin = -i1 / 2;
            } else {
              if (i3 != 0)
                c1.leftMargin = i1 / 2; 
              i12 = paramInt1;
              if (i3 != i11 - 1) {
                c1.rightMargin = i1 / 2;
                i12 = paramInt1;
              } 
              i3++;
              paramInt1 = i12;
            } 
            i12 = 1;
          } 
        } else {
          break;
        } 
        i3++;
        paramInt1 = i12;
      } 
    } else {
      i12 = paramInt1;
    } 
    paramInt1 = 0;
    if (i12 != 0)
      while (paramInt1 < i13) {
        View view = getChildAt(paramInt1);
        c c1 = (c)view.getLayoutParams();
        if (c1.f)
          view.measure(View.MeasureSpec.makeMeasureSpec(c1.b * i7 + c1.c, 1073741824), i2); 
        paramInt1++;
      }  
    if (n != 1073741824) {
      paramInt1 = i9;
    } else {
      paramInt1 = paramInt2;
    } 
    setMeasuredDimension(i6, paramInt1);
  }
  
  public c a(AttributeSet paramAttributeSet) { return new c(getContext(), paramAttributeSet); }
  
  protected c a(ViewGroup.LayoutParams paramLayoutParams) {
    if (paramLayoutParams != null) {
      c c1;
      if (paramLayoutParams instanceof c) {
        c1 = new c((c)paramLayoutParams);
      } else {
        c1 = new c(c1);
      } 
      if (c1.h <= 0)
        c1.h = 16; 
      return c1;
    } 
    return b();
  }
  
  public void a(f paramf) { this.a = paramf; }
  
  public void a(l.a parama, f.a parama1) {
    this.f = parama;
    this.g = parama1;
  }
  
  public boolean a() { return this.d; }
  
  protected boolean a(int paramInt) {
    byte b1 = 0;
    if (paramInt == 0)
      return false; 
    View view1 = getChildAt(paramInt - 1);
    View view2 = getChildAt(paramInt);
    boolean bool2 = b1;
    if (paramInt < getChildCount()) {
      bool2 = b1;
      if (view1 instanceof a)
        bool2 = false | ((a)view1).d(); 
    } 
    boolean bool1 = bool2;
    if (paramInt > 0) {
      bool1 = bool2;
      if (view2 instanceof a)
        bool1 = bool2 | ((a)view2).c(); 
    } 
    return bool1;
  }
  
  public boolean a(h paramh) { return this.a.a(paramh, 0); }
  
  protected c b() {
    c c1 = new c(-2, -2);
    c1.h = 16;
    return c1;
  }
  
  public c c() {
    c c1 = b();
    c1.a = true;
    return c1;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) { return (paramLayoutParams != null && paramLayoutParams instanceof c); }
  
  public f d() { return this.a; }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) { return false; }
  
  public boolean e() { return (this.e != null && this.e.d()); }
  
  public boolean f() { return (this.e != null && this.e.e()); }
  
  public boolean g() { return (this.e != null && this.e.h()); }
  
  public Menu getMenu() {
    if (this.a == null) {
      b b1 = getContext();
      this.a = new f(b1);
      this.a.a(new d(this, null));
      this.e = new d(b1);
      this.e.c(true);
      d d1 = this.e;
      if (this.f != null) {
        l.a a1 = this.f;
      } else {
        b1 = new b(this, null);
      } 
      d1.a(b1);
      this.a.a(this.e, this.b);
      this.e.a(this);
    } 
    return this.a;
  }
  
  public Drawable getOverflowIcon() {
    getMenu();
    return this.e.c();
  }
  
  public int getPopupTheme() { return this.c; }
  
  public int getWindowAnimations() { return 0; }
  
  public boolean h() { return (this.e != null && this.e.i()); }
  
  public void i() {
    if (this.e != null)
      this.e.f(); 
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    if (Build.VERSION.SDK_INT >= 8)
      super.onConfigurationChanged(paramConfiguration); 
    if (this.e != null) {
      this.e.b(false);
      if (this.e.h()) {
        this.e.e();
        this.e.d();
      } 
    } 
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    i();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (!this.h) {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    } 
    int n = getChildCount();
    int i1 = (paramInt4 - paramInt2) / 2;
    int i2 = getDividerWidth();
    int i3 = paramInt3 - paramInt1;
    paramInt2 = getPaddingRight();
    paramInt1 = getPaddingLeft();
    paramBoolean = au.a(this);
    paramInt1 = i3 - paramInt2 - paramInt1;
    paramInt2 = 0;
    paramInt4 = 0;
    paramInt3 = 0;
    while (paramInt2 < n) {
      View view = getChildAt(paramInt2);
      if (view.getVisibility() != 8) {
        c c1 = (c)view.getLayoutParams();
        if (c1.a) {
          int i7;
          int i5 = view.getMeasuredWidth();
          paramInt4 = i5;
          if (a(paramInt2))
            paramInt4 = i5 + i2; 
          int i6 = view.getMeasuredHeight();
          if (paramBoolean) {
            i7 = getPaddingLeft() + c1.leftMargin;
            i5 = i7 + paramInt4;
          } else {
            i5 = getWidth() - getPaddingRight() - c1.rightMargin;
            i7 = i5 - paramInt4;
          } 
          int i8 = i1 - i6 / 2;
          view.layout(i7, i8, i5, i6 + i8);
          paramInt1 -= paramInt4;
          paramInt4 = 1;
        } else {
          paramInt1 -= view.getMeasuredWidth() + c1.leftMargin + c1.rightMargin;
          a(paramInt2);
          paramInt3++;
        } 
      } 
      paramInt2++;
    } 
    if (n == 1 && paramInt4 == 0) {
      View view = getChildAt(0);
      paramInt2 = view.getMeasuredWidth();
      paramInt1 = view.getMeasuredHeight();
      paramInt3 = i3 / 2 - paramInt2 / 2;
      paramInt4 = i1 - paramInt1 / 2;
      view.layout(paramInt3, paramInt4, paramInt2 + paramInt3, paramInt1 + paramInt4);
      return;
    } 
    paramInt2 = paramInt3 - (paramInt4 ^ true);
    if (paramInt2 > 0) {
      paramInt1 /= paramInt2;
    } else {
      paramInt1 = 0;
    } 
    paramInt4 = 0;
    paramInt3 = 0;
    int i4 = Math.max(0, paramInt1);
    if (paramBoolean) {
      paramInt2 = getWidth() - getPaddingRight();
      paramInt1 = paramInt3;
      while (paramInt1 < n) {
        View view = getChildAt(paramInt1);
        c c1 = (c)view.getLayoutParams();
        paramInt3 = paramInt2;
        if (view.getVisibility() != 8)
          if (c1.a) {
            paramInt3 = paramInt2;
          } else {
            paramInt4 = paramInt2 - c1.rightMargin;
            paramInt2 = view.getMeasuredWidth();
            paramInt3 = view.getMeasuredHeight();
            int i5 = i1 - paramInt3 / 2;
            view.layout(paramInt4 - paramInt2, i5, paramInt4, paramInt3 + i5);
            paramInt3 = paramInt4 - paramInt2 + c1.leftMargin + i4;
          }  
        paramInt1++;
        paramInt2 = paramInt3;
      } 
    } else {
      paramInt2 = getPaddingLeft();
      paramInt1 = paramInt4;
      while (paramInt1 < n) {
        View view = getChildAt(paramInt1);
        c c1 = (c)view.getLayoutParams();
        paramInt3 = paramInt2;
        if (view.getVisibility() != 8)
          if (c1.a) {
            paramInt3 = paramInt2;
          } else {
            paramInt2 += c1.leftMargin;
            paramInt3 = view.getMeasuredWidth();
            int i5 = view.getMeasuredHeight();
            paramInt4 = i1 - i5 / 2;
            view.layout(paramInt2, paramInt4, paramInt2 + paramInt3, i5 + paramInt4);
            paramInt3 = paramInt2 + paramInt3 + c1.rightMargin + i4;
          }  
        paramInt1++;
        paramInt2 = paramInt3;
      } 
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    boolean bool1;
    boolean bool = this.h;
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.h = bool1;
    if (bool != this.h)
      this.i = 0; 
    int n = View.MeasureSpec.getSize(paramInt1);
    if (this.h && this.a != null && n != this.i) {
      this.i = n;
      this.a.b(true);
    } 
    int i1 = getChildCount();
    if (this.h && i1 > 0) {
      c(paramInt1, paramInt2);
      return;
    } 
    for (n = 0; n < i1; n++) {
      c c1 = (c)getChildAt(n).getLayoutParams();
      c1.rightMargin = 0;
      c1.leftMargin = 0;
    } 
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setExpandedActionViewsExclusive(boolean paramBoolean) { this.e.d(paramBoolean); }
  
  public void setOnMenuItemClickListener(e parame) { this.l = parame; }
  
  public void setOverflowIcon(Drawable paramDrawable) {
    getMenu();
    this.e.a(paramDrawable);
  }
  
  public void setOverflowReserved(boolean paramBoolean) { this.d = paramBoolean; }
  
  public void setPopupTheme(int paramInt) {
    if (this.c != paramInt) {
      this.c = paramInt;
      if (paramInt == 0) {
        this.b = getContext();
        return;
      } 
      this.b = new ContextThemeWrapper(getContext(), paramInt);
    } 
  }
  
  public void setPresenter(d paramd) {
    this.e = paramd;
    this.e.a(this);
  }
  
  public static interface a {
    boolean c();
    
    boolean d();
  }
  
  private class b implements l.a {
    private b(ActionMenuView this$0) {}
    
    public void a(f param1f, boolean param1Boolean) {}
    
    public boolean a(f param1f) { return false; }
  }
  
  public static class c extends af.a {
    @ExportedProperty
    public boolean a;
    
    @ExportedProperty
    public int b;
    
    @ExportedProperty
    public int c;
    
    @ExportedProperty
    public boolean d;
    
    @ExportedProperty
    public boolean e;
    
    boolean f;
    
    public c(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
      this.a = false;
    }
    
    public c(Context param1Context, AttributeSet param1AttributeSet) { super(param1Context, param1AttributeSet); }
    
    public c(c param1c) {
      super(param1c);
      this.a = param1c.a;
    }
    
    public c(ViewGroup.LayoutParams param1LayoutParams) { super(param1LayoutParams); }
  }
  
  private class d implements f.a {
    private d(ActionMenuView this$0) {}
    
    public void a(f param1f) {
      if (ActionMenuView.b(this.a) != null)
        ActionMenuView.b(this.a).a(param1f); 
    }
    
    public boolean a(f param1f, MenuItem param1MenuItem) { return (ActionMenuView.a(this.a) != null && ActionMenuView.a(this.a).a(param1MenuItem)); }
  }
  
  public static interface e {
    boolean a(MenuItem param1MenuItem);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/ActionMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */