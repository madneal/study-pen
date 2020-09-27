package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.f.d;
import android.support.v4.h.af;
import android.support.v4.h.au;
import android.support.v4.h.s;
import android.support.v4.widget.k;
import android.support.v4.widget.o;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public class ag {
  private static Method a;
  
  private static Method c;
  
  private final c A = new c(this, null);
  
  private Runnable B;
  
  private final Handler C;
  
  private Rect D = new Rect();
  
  private boolean E;
  
  private int F;
  
  int b = Integer.MAX_VALUE;
  
  private Context d;
  
  private PopupWindow e;
  
  private ListAdapter f;
  
  private a g;
  
  private int h = -2;
  
  private int i = -2;
  
  private int j;
  
  private int k;
  
  private int l = 1002;
  
  private boolean m;
  
  private int n = 0;
  
  private boolean o = false;
  
  private boolean p = false;
  
  private View q;
  
  private int r = 0;
  
  private DataSetObserver s;
  
  private View t;
  
  private Drawable u;
  
  private AdapterView.OnItemClickListener v;
  
  private AdapterView.OnItemSelectedListener w;
  
  private final g x = new g(this, null);
  
  private final f y = new f(this, null);
  
  private final e z = new e(this, null);
  
  static  {
    try {
      a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[] { boolean.class });
    } catch (NoSuchMethodException noSuchMethodException) {
      Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
    } 
    try {
      c = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[] { View.class, int.class, boolean.class });
      return;
    } catch (NoSuchMethodException noSuchMethodException) {
      Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
      return;
    } 
  }
  
  public ag(Context paramContext) { this(paramContext, null, a.a.listPopupWindowStyle); }
  
  public ag(Context paramContext, AttributeSet paramAttributeSet, int paramInt) { this(paramContext, paramAttributeSet, paramInt, 0); }
  
  public ag(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    this.d = paramContext;
    this.C = new Handler(paramContext.getMainLooper());
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.ListPopupWindow, paramInt1, paramInt2);
    this.j = typedArray.getDimensionPixelOffset(a.k.ListPopupWindow_android_dropDownHorizontalOffset, 0);
    this.k = typedArray.getDimensionPixelOffset(a.k.ListPopupWindow_android_dropDownVerticalOffset, 0);
    if (this.k != 0)
      this.m = true; 
    typedArray.recycle();
    this.e = new r(paramContext, paramAttributeSet, paramInt1);
    this.e.setInputMethodMode(1);
    this.F = d.a((this.d.getResources().getConfiguration()).locale);
  }
  
  private int a(View paramView, int paramInt, boolean paramBoolean) {
    if (c != null)
      try {
        return ((Integer)c.invoke(this.e, new Object[] { paramView, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) })).intValue();
      } catch (Exception exception) {
        Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
      }  
    return this.e.getMaxAvailableHeight(paramView, paramInt);
  }
  
  private void a() {
    if (this.q != null) {
      ViewParent viewParent = this.q.getParent();
      if (viewParent instanceof ViewGroup)
        ((ViewGroup)viewParent).removeView(this.q); 
    } 
  }
  
  private int b() {
    int i2;
    int i1;
    a a1 = this.g;
    boolean bool = true;
    if (a1 == null) {
      LinearLayout.LayoutParams layoutParams1 = this.d;
      this.B = new Runnable(this) {
          public void run() {
            View view = this.a.e();
            if (view != null && view.getWindowToken() != null)
              this.a.c(); 
          }
        };
      this.g = new a(layoutParams1, this.E ^ true);
      if (this.u != null)
        this.g.setSelector(this.u); 
      this.g.setAdapter(this.f);
      this.g.setOnItemClickListener(this.v);
      this.g.setFocusable(true);
      this.g.setFocusableInTouchMode(true);
      this.g.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(this) {
            public void onItemSelected(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
              if (param1Int != -1) {
                ag.a a1 = ag.a(this.a);
                if (a1 != null)
                  ag.a.a(a1, false); 
              } 
            }
            
            public void onNothingSelected(AdapterView<?> param1AdapterView) {}
          });
      this.g.setOnScrollListener(this.z);
      if (this.w != null)
        this.g.setOnItemSelectedListener(this.w); 
      LinearLayout.LayoutParams layoutParams2 = this.g;
      View view = this.q;
      if (view != null) {
        StringBuilder stringBuilder;
        LinearLayout linearLayout = new LinearLayout(layoutParams1);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0F);
        switch (this.r) {
          default:
            stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid hint position ");
            stringBuilder.append(this.r);
            Log.e("ListPopupWindow", stringBuilder.toString());
            break;
          case 1:
            linearLayout.addView(stringBuilder, layoutParams);
            linearLayout.addView(view);
            break;
          case 0:
            linearLayout.addView(view);
            linearLayout.addView(stringBuilder, layoutParams);
            break;
        } 
        if (this.i >= 0) {
          i1 = this.i;
          i2 = Integer.MIN_VALUE;
        } else {
          i1 = 0;
          i2 = 0;
        } 
        view.measure(View.MeasureSpec.makeMeasureSpec(i1, i2), 0);
        layoutParams2 = (LinearLayout.LayoutParams)view.getLayoutParams();
        i2 = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
      } else {
        i2 = 0;
        layoutParams1 = layoutParams2;
      } 
      this.e.setContentView(layoutParams1);
    } else {
      ViewGroup viewGroup = (ViewGroup)this.e.getContentView();
      View view = this.q;
      if (view != null) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)view.getLayoutParams();
        i2 = view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
      } else {
        i2 = 0;
      } 
    } 
    Drawable drawable = this.e.getBackground();
    if (drawable != null) {
      drawable.getPadding(this.D);
      int i5 = this.D.top + this.D.bottom;
      i1 = i5;
      if (!this.m) {
        this.k = -this.D.top;
        i1 = i5;
      } 
    } else {
      this.D.setEmpty();
      i1 = 0;
    } 
    if (this.e.getInputMethodMode() != 2)
      bool = false; 
    int i4 = a(e(), this.k, bool);
    if (this.o || this.h == -1)
      return i4 + i1; 
    switch (this.i) {
      default:
        i3 = this.i;
        i3 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        break;
      case -1:
        i3 = (this.d.getResources().getDisplayMetrics()).widthPixels - this.D.left + this.D.right;
        i3 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        break;
      case -2:
        i3 = View.MeasureSpec.makeMeasureSpec((this.d.getResources().getDisplayMetrics()).widthPixels - this.D.left + this.D.right, -2147483648);
        break;
    } 
    i4 = this.g.a(i3, 0, -1, i4 - i2, -1);
    int i3 = i2;
    if (i4 > 0)
      i3 = i2 + i1; 
    return i4 + i3;
  }
  
  private void b(boolean paramBoolean) {
    if (a != null)
      try {
        a.invoke(this.e, new Object[] { Boolean.valueOf(paramBoolean) });
        return;
      } catch (Exception exception) {
        Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
      }  
  }
  
  public void a(int paramInt) { this.r = paramInt; }
  
  public void a(Drawable paramDrawable) { this.e.setBackgroundDrawable(paramDrawable); }
  
  public void a(View paramView) { this.t = paramView; }
  
  public void a(AdapterView.OnItemClickListener paramOnItemClickListener) { this.v = paramOnItemClickListener; }
  
  public void a(ListAdapter paramListAdapter) {
    if (this.s == null) {
      this.s = new d(this, null);
    } else if (this.f != null) {
      this.f.unregisterDataSetObserver(this.s);
    } 
    this.f = paramListAdapter;
    if (this.f != null)
      paramListAdapter.registerDataSetObserver(this.s); 
    if (this.g != null)
      this.g.setAdapter(this.f); 
  }
  
  public void a(PopupWindow.OnDismissListener paramOnDismissListener) { this.e.setOnDismissListener(paramOnDismissListener); }
  
  public void a(boolean paramBoolean) {
    this.E = paramBoolean;
    this.e.setFocusable(paramBoolean);
  }
  
  public void b(int paramInt) { this.j = paramInt; }
  
  public void c() {
    int i2;
    int i1 = b();
    boolean bool1 = l();
    o.a(this.e, this.l);
    boolean bool2 = this.e.isShowing();
    boolean bool = true;
    boolean bool3 = true;
    if (bool2) {
      if (this.i == -1) {
        i2 = -1;
      } else if (this.i == -2) {
        i2 = e().getWidth();
      } else {
        i2 = this.i;
      } 
      if (this.h == -1) {
        if (!bool1)
          i1 = -1; 
        if (bool1) {
          byte b1;
          PopupWindow popupWindow3 = this.e;
          if (this.i == -1) {
            b1 = -1;
          } else {
            b1 = 0;
          } 
          popupWindow3.setWidth(b1);
          this.e.setHeight(0);
        } else {
          byte b1;
          PopupWindow popupWindow3 = this.e;
          if (this.i == -1) {
            b1 = -1;
          } else {
            b1 = 0;
          } 
          popupWindow3.setWidth(b1);
          this.e.setHeight(-1);
        } 
      } else if (this.h != -2) {
        i1 = this.h;
      } 
      PopupWindow popupWindow1 = this.e;
      if (this.p || this.o)
        bool3 = false; 
      popupWindow1.setOutsideTouchable(bool3);
      PopupWindow popupWindow2 = this.e;
      View view = e();
      int i4 = this.j;
      int i3 = this.k;
      if (i2 < 0)
        i2 = -1; 
      if (i1 < 0)
        i1 = -1; 
      popupWindow2.update(view, i4, i3, i2, i1);
      return;
    } 
    if (this.i == -1) {
      i2 = -1;
    } else if (this.i == -2) {
      i2 = e().getWidth();
    } else {
      i2 = this.i;
    } 
    if (this.h == -1) {
      i1 = -1;
    } else if (this.h != -2) {
      i1 = this.h;
    } 
    this.e.setWidth(i2);
    this.e.setHeight(i1);
    b(true);
    PopupWindow popupWindow = this.e;
    if (!this.p && !this.o) {
      bool3 = bool;
    } else {
      bool3 = false;
    } 
    popupWindow.setOutsideTouchable(bool3);
    this.e.setTouchInterceptor(this.y);
    o.a(this.e, e(), this.j, this.k, this.n);
    this.g.setSelection(-1);
    if (!this.E || this.g.isInTouchMode())
      j(); 
    if (!this.E)
      this.C.post(this.A); 
  }
  
  public void c(int paramInt) {
    this.k = paramInt;
    this.m = true;
  }
  
  public Drawable d() { return this.e.getBackground(); }
  
  public void d(int paramInt) { this.n = paramInt; }
  
  public View e() { return this.t; }
  
  public void e(int paramInt) { this.i = paramInt; }
  
  public int f() { return this.j; }
  
  public void f(int paramInt) {
    Drawable drawable = this.e.getBackground();
    if (drawable != null) {
      drawable.getPadding(this.D);
      this.i = this.D.left + this.D.right + paramInt;
      return;
    } 
    e(paramInt);
  }
  
  public int g() { return !this.m ? 0 : this.k; }
  
  public void g(int paramInt) { this.e.setInputMethodMode(paramInt); }
  
  public int h() { return this.i; }
  
  public void h(int paramInt) {
    a a1 = this.g;
    if (k() && a1 != null) {
      a.a(a1, false);
      a1.setSelection(paramInt);
      if (Build.VERSION.SDK_INT >= 11 && a1.getChoiceMode() != 0)
        a1.setItemChecked(paramInt, true); 
    } 
  }
  
  public void i() {
    this.e.dismiss();
    a();
    this.e.setContentView(null);
    this.g = null;
    this.C.removeCallbacks(this.x);
  }
  
  public void j() {
    a a1 = this.g;
    if (a1 != null) {
      a.a(a1, true);
      a1.requestLayout();
    } 
  }
  
  public boolean k() { return this.e.isShowing(); }
  
  public boolean l() { return (this.e.getInputMethodMode() == 2); }
  
  public ListView m() { return this.g; }
  
  private static class a extends ah {
    private boolean g;
    
    private boolean h;
    
    private boolean i;
    
    private au j;
    
    private k k;
    
    public a(Context param1Context, boolean param1Boolean) {
      super(param1Context, null, a.a.dropDownListViewStyle);
      this.h = param1Boolean;
      setCacheColorHint(0);
    }
    
    private void a(View param1View, int param1Int) { performItemClick(param1View, param1Int, getItemIdAtPosition(param1Int)); }
    
    private void a(View param1View, int param1Int, float param1Float1, float param1Float2) {
      this.i = true;
      if (Build.VERSION.SDK_INT >= 21)
        drawableHotspotChanged(param1Float1, param1Float2); 
      if (!isPressed())
        setPressed(true); 
      layoutChildren();
      if (this.f != -1) {
        View view = getChildAt(this.f - getFirstVisiblePosition());
        if (view != null && view != param1View && view.isPressed())
          view.setPressed(false); 
      } 
      this.f = param1Int;
      float f1 = param1View.getLeft();
      float f2 = param1View.getTop();
      if (Build.VERSION.SDK_INT >= 21)
        param1View.drawableHotspotChanged(param1Float1 - f1, param1Float2 - f2); 
      if (!param1View.isPressed())
        param1View.setPressed(true); 
      a(param1Int, param1View, param1Float1, param1Float2);
      setSelectorEnabled(false);
      refreshDrawableState();
    }
    
    private void d() {
      this.i = false;
      setPressed(false);
      drawableStateChanged();
      View view = getChildAt(this.f - getFirstVisiblePosition());
      if (view != null)
        view.setPressed(false); 
      if (this.j != null) {
        this.j.b();
        this.j = null;
      } 
    }
    
    protected boolean a() { return (this.i || super.a()); }
    
    public boolean a(MotionEvent param1MotionEvent, int param1Int) { // Byte code:
      //   0: aload_1
      //   1: invokestatic a : (Landroid/view/MotionEvent;)I
      //   4: istore_3
      //   5: iload_3
      //   6: tableswitch default -> 32, 1 -> 54, 2 -> 48, 3 -> 40
      //   32: iconst_0
      //   33: istore_2
      //   34: iconst_1
      //   35: istore #4
      //   37: goto -> 151
      //   40: iconst_0
      //   41: istore_2
      //   42: iconst_0
      //   43: istore #4
      //   45: goto -> 151
      //   48: iconst_1
      //   49: istore #4
      //   51: goto -> 57
      //   54: iconst_0
      //   55: istore #4
      //   57: aload_1
      //   58: iload_2
      //   59: invokevirtual findPointerIndex : (I)I
      //   62: istore #5
      //   64: iload #5
      //   66: ifge -> 72
      //   69: goto -> 40
      //   72: aload_1
      //   73: iload #5
      //   75: invokevirtual getX : (I)F
      //   78: f2i
      //   79: istore_2
      //   80: aload_1
      //   81: iload #5
      //   83: invokevirtual getY : (I)F
      //   86: f2i
      //   87: istore #5
      //   89: aload_0
      //   90: iload_2
      //   91: iload #5
      //   93: invokevirtual pointToPosition : (II)I
      //   96: istore #6
      //   98: iload #6
      //   100: iconst_m1
      //   101: if_icmpne -> 109
      //   104: iconst_1
      //   105: istore_2
      //   106: goto -> 151
      //   109: aload_0
      //   110: iload #6
      //   112: aload_0
      //   113: invokevirtual getFirstVisiblePosition : ()I
      //   116: isub
      //   117: invokevirtual getChildAt : (I)Landroid/view/View;
      //   120: astore #7
      //   122: aload_0
      //   123: aload #7
      //   125: iload #6
      //   127: iload_2
      //   128: i2f
      //   129: iload #5
      //   131: i2f
      //   132: invokespecial a : (Landroid/view/View;IFF)V
      //   135: iload_3
      //   136: iconst_1
      //   137: if_icmpne -> 32
      //   140: aload_0
      //   141: aload #7
      //   143: iload #6
      //   145: invokespecial a : (Landroid/view/View;I)V
      //   148: goto -> 32
      //   151: iload #4
      //   153: ifeq -> 160
      //   156: iload_2
      //   157: ifeq -> 164
      //   160: aload_0
      //   161: invokespecial d : ()V
      //   164: iload #4
      //   166: ifeq -> 210
      //   169: aload_0
      //   170: getfield k : Landroid/support/v4/widget/k;
      //   173: ifnonnull -> 188
      //   176: aload_0
      //   177: new android/support/v4/widget/k
      //   180: dup
      //   181: aload_0
      //   182: invokespecial <init> : (Landroid/widget/ListView;)V
      //   185: putfield k : Landroid/support/v4/widget/k;
      //   188: aload_0
      //   189: getfield k : Landroid/support/v4/widget/k;
      //   192: iconst_1
      //   193: invokevirtual a : (Z)Landroid/support/v4/widget/a;
      //   196: pop
      //   197: aload_0
      //   198: getfield k : Landroid/support/v4/widget/k;
      //   201: aload_0
      //   202: aload_1
      //   203: invokevirtual onTouch : (Landroid/view/View;Landroid/view/MotionEvent;)Z
      //   206: pop
      //   207: iload #4
      //   209: ireturn
      //   210: aload_0
      //   211: getfield k : Landroid/support/v4/widget/k;
      //   214: ifnull -> 226
      //   217: aload_0
      //   218: getfield k : Landroid/support/v4/widget/k;
      //   221: iconst_0
      //   222: invokevirtual a : (Z)Landroid/support/v4/widget/a;
      //   225: pop
      //   226: iload #4
      //   228: ireturn }
    
    public boolean hasFocus() { return (this.h || super.hasFocus()); }
    
    public boolean hasWindowFocus() { return (this.h || super.hasWindowFocus()); }
    
    public boolean isFocused() { return (this.h || super.isFocused()); }
    
    public boolean isInTouchMode() { return ((this.h && this.g) || super.isInTouchMode()); }
  }
  
  public static abstract class b implements View.OnTouchListener {
    private final float a;
    
    private final int b;
    
    private final int c;
    
    private final View d;
    
    private Runnable e;
    
    private Runnable f;
    
    private boolean g;
    
    private boolean h;
    
    private int i;
    
    private final int[] j = new int[2];
    
    public b(View param1View) {
      this.d = param1View;
      this.a = ViewConfiguration.get(param1View.getContext()).getScaledTouchSlop();
      this.b = ViewConfiguration.getTapTimeout();
      this.c = (this.b + ViewConfiguration.getLongPressTimeout()) / 2;
    }
    
    private boolean a(MotionEvent param1MotionEvent) {
      int k;
      View view = this.d;
      if (!view.isEnabled())
        return false; 
      switch (s.a(param1MotionEvent)) {
        default:
          return false;
        case 2:
          k = param1MotionEvent.findPointerIndex(this.i);
          if (k >= 0 && !a(view, param1MotionEvent.getX(k), param1MotionEvent.getY(k), this.a)) {
            d();
            view.getParent().requestDisallowInterceptTouchEvent(true);
            return true;
          } 
          return false;
        case 1:
        case 3:
          d();
          return false;
        case 0:
          break;
      } 
      this.i = param1MotionEvent.getPointerId(0);
      this.h = false;
      if (this.e == null)
        this.e = new a(this, null); 
      view.postDelayed(this.e, this.b);
      if (this.f == null)
        this.f = new b(this, null); 
      view.postDelayed(this.f, this.c);
      return false;
    }
    
    private static boolean a(View param1View, float param1Float1, float param1Float2, float param1Float3) {
      float f1 = -param1Float3;
      return (param1Float1 >= f1 && param1Float2 >= f1 && param1Float1 < (param1View.getRight() - param1View.getLeft()) + param1Float3 && param1Float2 < (param1View.getBottom() - param1View.getTop()) + param1Float3);
    }
    
    private boolean a(View param1View, MotionEvent param1MotionEvent) {
      int[] arrayOfInt = this.j;
      param1View.getLocationOnScreen(arrayOfInt);
      param1MotionEvent.offsetLocation(-arrayOfInt[0], -arrayOfInt[1]);
      return true;
    }
    
    private boolean b(MotionEvent param1MotionEvent) {
      View view = this.d;
      ag ag = a();
      if (ag != null) {
        if (!ag.k())
          return false; 
        ag.a a1 = ag.a(ag);
        if (a1 != null) {
          if (!a1.isShown())
            return false; 
          MotionEvent motionEvent = MotionEvent.obtainNoHistory(param1MotionEvent);
          b(view, motionEvent);
          a(a1, motionEvent);
          boolean bool = a1.a(motionEvent, this.i);
          motionEvent.recycle();
          int k = s.a(param1MotionEvent);
          if (k != 1 && k != 3) {
            k = 1;
          } else {
            k = 0;
          } 
          return (bool && k != 0);
        } 
      } 
      return false;
    }
    
    private boolean b(View param1View, MotionEvent param1MotionEvent) {
      int[] arrayOfInt = this.j;
      param1View.getLocationOnScreen(arrayOfInt);
      param1MotionEvent.offsetLocation(arrayOfInt[0], arrayOfInt[1]);
      return true;
    }
    
    private void d() {
      if (this.f != null)
        this.d.removeCallbacks(this.f); 
      if (this.e != null)
        this.d.removeCallbacks(this.e); 
    }
    
    private void e() {
      d();
      View view = this.d;
      if (view.isEnabled()) {
        if (view.isLongClickable())
          return; 
        if (!b())
          return; 
        view.getParent().requestDisallowInterceptTouchEvent(true);
        long l = SystemClock.uptimeMillis();
        MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        view.onTouchEvent(motionEvent);
        motionEvent.recycle();
        this.g = true;
        this.h = true;
      } 
    }
    
    public abstract ag a();
    
    protected boolean b() {
      ag ag = a();
      if (ag != null && !ag.k())
        ag.c(); 
      return true;
    }
    
    protected boolean c() {
      ag ag = a();
      if (ag != null && ag.k())
        ag.i(); 
      return true;
    }
    
    public boolean onTouch(View param1View, MotionEvent param1MotionEvent) {
      byte b1;
      boolean bool1 = this.g;
      boolean bool = true;
      if (bool1) {
        if (this.h) {
          b1 = b(param1MotionEvent);
        } else if (b(param1MotionEvent) || !c()) {
          b1 = 1;
        } else {
          b1 = 0;
        } 
      } else {
        byte b2;
        if (a(param1MotionEvent) && b()) {
          b2 = 1;
        } else {
          b2 = 0;
        } 
        b1 = b2;
        if (b2) {
          long l = SystemClock.uptimeMillis();
          MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
          this.d.onTouchEvent(motionEvent);
          motionEvent.recycle();
          b1 = b2;
        } 
      } 
      this.g = b1;
      boolean bool2 = bool;
      if (b1 == 0) {
        if (bool1)
          return true; 
        bool2 = false;
      } 
      return bool2;
    }
    
    private class a implements Runnable {
      private a(ag.b this$0) {}
      
      public void run() { ag.b.a(this.a).getParent().requestDisallowInterceptTouchEvent(true); }
    }
    
    private class b implements Runnable {
      private b(ag.b this$0) {}
      
      public void run() { ag.b.b(this.a); }
    }
  }
  
  private class a implements Runnable {
    private a(ag this$0) {}
    
    public void run() { ag.b.a(this.a).getParent().requestDisallowInterceptTouchEvent(true); }
  }
  
  private class b implements Runnable {
    private b(ag this$0) {}
    
    public void run() { ag.b.b(this.a); }
  }
  
  private class c implements Runnable {
    private c(ag this$0) {}
    
    public void run() { this.a.j(); }
  }
  
  private class d extends DataSetObserver {
    private d(ag this$0) {}
    
    public void onChanged() {
      if (this.a.k())
        this.a.c(); 
    }
    
    public void onInvalidated() { this.a.i(); }
  }
  
  private class e implements AbsListView.OnScrollListener {
    private e(ag this$0) {}
    
    public void onScroll(AbsListView param1AbsListView, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onScrollStateChanged(AbsListView param1AbsListView, int param1Int) {
      if (param1Int == 1 && !this.a.l() && ag.b(this.a).getContentView() != null) {
        ag.d(this.a).removeCallbacks(ag.c(this.a));
        ag.c(this.a).run();
      } 
    }
  }
  
  private class f implements View.OnTouchListener {
    private f(ag this$0) {}
    
    public boolean onTouch(View param1View, MotionEvent param1MotionEvent) {
      int i = param1MotionEvent.getAction();
      int j = (int)param1MotionEvent.getX();
      int k = (int)param1MotionEvent.getY();
      if (i == 0 && ag.b(this.a) != null && ag.b(this.a).isShowing() && j >= 0 && j < ag.b(this.a).getWidth() && k >= 0 && k < ag.b(this.a).getHeight()) {
        ag.d(this.a).postDelayed(ag.c(this.a), 250L);
      } else if (i == 1) {
        ag.d(this.a).removeCallbacks(ag.c(this.a));
      } 
      return false;
    }
  }
  
  private class g implements Runnable {
    private g(ag this$0) {}
    
    public void run() {
      if (ag.a(this.a) != null && af.r(ag.a(this.a)) && ag.a(this.a).getCount() > ag.a(this.a).getChildCount() && ag.a(this.a).getChildCount() <= this.a.b) {
        ag.b(this.a).setInputMethodMode(2);
        this.a.c();
      } 
    }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */