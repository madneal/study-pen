package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.h.a;
import android.support.v4.h.a.a;
import android.support.v4.h.a.b;
import android.support.v4.h.a.h;
import android.support.v4.h.ab;
import android.support.v4.h.af;
import android.support.v4.h.s;
import android.support.v4.h.w;
import android.support.v4.h.x;
import android.support.v4.h.y;
import android.support.v4.h.z;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;

public class NestedScrollView extends FrameLayout implements ab, w, y {
  private static final a v = new a();
  
  private static final int[] w = { 16843130 };
  
  private b A;
  
  private long a;
  
  private final Rect b = new Rect();
  
  private u c;
  
  private h d;
  
  private h e;
  
  private int f;
  
  private boolean g = true;
  
  private boolean h = false;
  
  private View i = null;
  
  private boolean j = false;
  
  private VelocityTracker k;
  
  private boolean l;
  
  private boolean m = true;
  
  private int n;
  
  private int o;
  
  private int p;
  
  private int q = -1;
  
  private final int[] r = new int[2];
  
  private final int[] s = new int[2];
  
  private int t;
  
  private c u;
  
  private final z x;
  
  private final x y;
  
  private float z;
  
  public NestedScrollView(Context paramContext) { this(paramContext, null); }
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet) { this(paramContext, paramAttributeSet, 0); }
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    a();
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, w, paramInt, 0);
    setFillViewport(typedArray.getBoolean(0, false));
    typedArray.recycle();
    this.x = new z(this);
    this.y = new x(this);
    setNestedScrollingEnabled(true);
    af.a(this, v);
  }
  
  private View a(boolean paramBoolean, int paramInt1, int paramInt2) { // Byte code:
    //   0: aload_0
    //   1: iconst_2
    //   2: invokevirtual getFocusables : (I)Ljava/util/ArrayList;
    //   5: astore #4
    //   7: aload #4
    //   9: invokeinterface size : ()I
    //   14: istore #5
    //   16: aconst_null
    //   17: astore #6
    //   19: iconst_0
    //   20: istore #7
    //   22: iconst_0
    //   23: istore #8
    //   25: iload #7
    //   27: iload #5
    //   29: if_icmpge -> 246
    //   32: aload #4
    //   34: iload #7
    //   36: invokeinterface get : (I)Ljava/lang/Object;
    //   41: checkcast android/view/View
    //   44: astore #9
    //   46: aload #9
    //   48: invokevirtual getTop : ()I
    //   51: istore #10
    //   53: aload #9
    //   55: invokevirtual getBottom : ()I
    //   58: istore #11
    //   60: aload #6
    //   62: astore #12
    //   64: iload #8
    //   66: istore #13
    //   68: iload_2
    //   69: iload #11
    //   71: if_icmpge -> 232
    //   74: aload #6
    //   76: astore #12
    //   78: iload #8
    //   80: istore #13
    //   82: iload #10
    //   84: iload_3
    //   85: if_icmpge -> 232
    //   88: iload_2
    //   89: iload #10
    //   91: if_icmpge -> 106
    //   94: iload #11
    //   96: iload_3
    //   97: if_icmpge -> 106
    //   100: iconst_1
    //   101: istore #14
    //   103: goto -> 109
    //   106: iconst_0
    //   107: istore #14
    //   109: aload #6
    //   111: ifnonnull -> 125
    //   114: aload #9
    //   116: astore #12
    //   118: iload #14
    //   120: istore #13
    //   122: goto -> 232
    //   125: iload_1
    //   126: ifeq -> 139
    //   129: iload #10
    //   131: aload #6
    //   133: invokevirtual getTop : ()I
    //   136: if_icmplt -> 153
    //   139: iload_1
    //   140: ifne -> 159
    //   143: iload #11
    //   145: aload #6
    //   147: invokevirtual getBottom : ()I
    //   150: if_icmple -> 159
    //   153: iconst_1
    //   154: istore #11
    //   156: goto -> 162
    //   159: iconst_0
    //   160: istore #11
    //   162: iload #8
    //   164: ifeq -> 196
    //   167: aload #6
    //   169: astore #12
    //   171: iload #8
    //   173: istore #13
    //   175: iload #14
    //   177: ifeq -> 232
    //   180: aload #6
    //   182: astore #12
    //   184: iload #8
    //   186: istore #13
    //   188: iload #11
    //   190: ifeq -> 232
    //   193: goto -> 224
    //   196: iload #14
    //   198: ifeq -> 211
    //   201: aload #9
    //   203: astore #12
    //   205: iconst_1
    //   206: istore #13
    //   208: goto -> 232
    //   211: aload #6
    //   213: astore #12
    //   215: iload #8
    //   217: istore #13
    //   219: iload #11
    //   221: ifeq -> 232
    //   224: aload #9
    //   226: astore #12
    //   228: iload #8
    //   230: istore #13
    //   232: iinc #7, 1
    //   235: aload #12
    //   237: astore #6
    //   239: iload #13
    //   241: istore #8
    //   243: goto -> 25
    //   246: aload #6
    //   248: areturn }
  
  private void a() {
    this.c = u.a(getContext(), null);
    setFocusable(true);
    setDescendantFocusability(262144);
    setWillNotDraw(false);
    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
    this.n = viewConfiguration.getScaledTouchSlop();
    this.o = viewConfiguration.getScaledMinimumFlingVelocity();
    this.p = viewConfiguration.getScaledMaximumFlingVelocity();
  }
  
  private void a(MotionEvent paramMotionEvent) {
    int i1 = (paramMotionEvent.getAction() & 0xFF00) >> 8;
    if (s.b(paramMotionEvent, i1) == this.q) {
      if (i1 == 0) {
        i1 = 1;
      } else {
        i1 = 0;
      } 
      this.f = (int)s.d(paramMotionEvent, i1);
      this.q = s.b(paramMotionEvent, i1);
      if (this.k != null)
        this.k.clear(); 
    } 
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3) {
    boolean bool1;
    int i1 = getHeight();
    int i2 = getScrollY();
    i1 += i2;
    boolean bool = false;
    if (paramInt1 == 33) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    View view = a(bool1, paramInt2, paramInt3);
    NestedScrollView nestedScrollView = view;
    if (view == null)
      nestedScrollView = this; 
    if (paramInt2 >= i2 && paramInt3 <= i1) {
      bool1 = bool;
    } else {
      if (bool1) {
        paramInt2 -= i2;
      } else {
        paramInt2 = paramInt3 - i1;
      } 
      e(paramInt2);
      bool1 = true;
    } 
    if (nestedScrollView != findFocus())
      nestedScrollView.requestFocus(paramInt1); 
    return bool1;
  }
  
  private boolean a(Rect paramRect, boolean paramBoolean) {
    boolean bool;
    int i1 = a(paramRect);
    if (i1 != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      if (paramBoolean) {
        scrollBy(0, i1);
        return bool;
      } 
      a(0, i1);
    } 
    return bool;
  }
  
  private boolean a(View paramView) { return a(paramView, 0, getHeight()) ^ true; }
  
  private boolean a(View paramView, int paramInt1, int paramInt2) {
    paramView.getDrawingRect(this.b);
    offsetDescendantRectToMyCoords(paramView, this.b);
    return (this.b.bottom + paramInt1 >= getScrollY() && this.b.top - paramInt1 <= getScrollY() + paramInt2);
  }
  
  private static boolean a(View paramView1, View paramView2) {
    if (paramView1 == paramView2)
      return true; 
    ViewParent viewParent = paramView1.getParent();
    return (viewParent instanceof ViewGroup && a((View)viewParent, paramView2));
  }
  
  private static int b(int paramInt1, int paramInt2, int paramInt3) { return (paramInt2 >= paramInt3 || paramInt1 < 0) ? 0 : ((paramInt2 + paramInt1 > paramInt3) ? (paramInt3 - paramInt2) : paramInt1); }
  
  private void b(View paramView) {
    paramView.getDrawingRect(this.b);
    offsetDescendantRectToMyCoords(paramView, this.b);
    int i1 = a(this.b);
    if (i1 != 0)
      scrollBy(0, i1); 
  }
  
  private boolean b() {
    byte b1 = 0;
    View view = getChildAt(0);
    int i1 = b1;
    if (view != null) {
      int i2 = view.getHeight();
      i1 = b1;
      if (getHeight() < i2 + getPaddingTop() + getPaddingBottom())
        i1 = 1; 
    } 
    return i1;
  }
  
  private void c() {
    if (this.k == null) {
      this.k = VelocityTracker.obtain();
      return;
    } 
    this.k.clear();
  }
  
  private boolean c(int paramInt1, int paramInt2) {
    int i1 = getChildCount();
    byte b1 = 0;
    int i2 = b1;
    if (i1 > 0) {
      i1 = getScrollY();
      View view = getChildAt(0);
      i2 = b1;
      if (paramInt2 >= view.getTop() - i1) {
        i2 = b1;
        if (paramInt2 < view.getBottom() - i1) {
          i2 = b1;
          if (paramInt1 >= view.getLeft()) {
            i2 = b1;
            if (paramInt1 < view.getRight())
              i2 = 1; 
          } 
        } 
      } 
    } 
    return i2;
  }
  
  private void d() {
    if (this.k == null)
      this.k = VelocityTracker.obtain(); 
  }
  
  private void e() {
    if (this.k != null) {
      this.k.recycle();
      this.k = null;
    } 
  }
  
  private void e(int paramInt) {
    if (paramInt != 0) {
      if (this.m) {
        a(0, paramInt);
        return;
      } 
      scrollBy(0, paramInt);
    } 
  }
  
  private void f() {
    this.j = false;
    e();
    stopNestedScroll();
    if (this.d != null) {
      this.d.b();
      this.e.b();
    } 
  }
  
  private void f(int paramInt) {
    boolean bool;
    int i1 = getScrollY();
    if ((i1 > 0 || paramInt > 0) && (i1 < getScrollRange() || paramInt < 0)) {
      bool = true;
    } else {
      bool = false;
    } 
    float f1 = paramInt;
    if (!dispatchNestedPreFling(0.0F, f1)) {
      dispatchNestedFling(0.0F, f1, bool);
      if (bool)
        d(paramInt); 
    } 
  }
  
  private void g() {
    if (af.a(this) != 2) {
      if (this.d == null) {
        Context context = getContext();
        this.d = new h(context);
        this.e = new h(context);
        return;
      } 
    } else {
      this.d = null;
      this.e = null;
    } 
  }
  
  private int getScrollRange() {
    int i1 = getChildCount();
    int i2 = 0;
    if (i1 > 0)
      i2 = Math.max(0, getChildAt(0).getHeight() - getHeight() - getPaddingBottom() - getPaddingTop()); 
    return i2;
  }
  
  private float getVerticalScrollFactorCompat() {
    if (this.z == 0.0F) {
      TypedValue typedValue = new TypedValue();
      Context context = getContext();
      if (!context.getTheme().resolveAttribute(16842829, typedValue, true))
        throw new IllegalStateException("Expected theme to define listPreferredItemHeight."); 
      this.z = typedValue.getDimension(context.getResources().getDisplayMetrics());
    } 
    return this.z;
  }
  
  protected int a(Rect paramRect) {
    int i1 = getChildCount();
    int i2 = 0;
    if (i1 == 0)
      return 0; 
    int i3 = getHeight();
    i1 = getScrollY();
    int i4 = i1 + i3;
    int i5 = getVerticalFadingEdgeLength();
    int i6 = i1;
    if (paramRect.top > 0)
      i6 = i1 + i5; 
    i1 = i4;
    if (paramRect.bottom < getChildAt(0).getHeight())
      i1 = i4 - i5; 
    if (paramRect.bottom > i1 && paramRect.top > i6) {
      if (paramRect.height() > i3) {
        i6 = paramRect.top - i6;
      } else {
        i6 = paramRect.bottom - i1;
      } 
      return Math.min(i6 + 0, getChildAt(0).getBottom() - i1);
    } 
    i4 = i2;
    if (paramRect.top < i6) {
      i4 = i2;
      if (paramRect.bottom < i1) {
        if (paramRect.height() > i3) {
          i1 = 0 - i1 - paramRect.bottom;
        } else {
          i1 = 0 - i6 - paramRect.top;
        } 
        i4 = Math.max(i1, -getScrollY());
      } 
    } 
    return i4;
  }
  
  public final void a(int paramInt1, int paramInt2) {
    if (getChildCount() == 0)
      return; 
    if (AnimationUtils.currentAnimationTimeMillis() - this.a > 250L) {
      paramInt1 = getHeight();
      int i1 = getPaddingBottom();
      int i2 = getPaddingTop();
      i2 = Math.max(0, getChildAt(0).getHeight() - paramInt1 - i1 - i2);
      paramInt1 = getScrollY();
      paramInt2 = Math.max(0, Math.min(paramInt2 + paramInt1, i2));
      this.c.a(getScrollX(), paramInt1, 0, paramInt2 - paramInt1);
      af.b(this);
    } else {
      if (!this.c.a())
        this.c.g(); 
      scrollBy(paramInt1, paramInt2);
    } 
    this.a = AnimationUtils.currentAnimationTimeMillis();
  }
  
  public boolean a(int paramInt) {
    Rect rect;
    int i2;
    int i1 = 0;
    if (paramInt == 130) {
      i2 = 1;
    } else {
      i2 = 0;
    } 
    int i3 = getHeight();
    if (i2) {
      this.b.top = getScrollY() + i3;
      i2 = getChildCount();
      if (i2 > 0) {
        View view = getChildAt(i2 - 1);
        if (this.b.top + i3 > view.getBottom()) {
          rect = this.b;
          i2 = view.getBottom() - i3;
        } else {
          this.b.bottom = this.b.top + i3;
          return a(paramInt, this.b.top, this.b.bottom);
        } 
      } else {
        this.b.bottom = this.b.top + i3;
        return a(paramInt, this.b.top, this.b.bottom);
      } 
    } else {
      this.b.top = getScrollY() - i3;
      if (this.b.top < 0) {
        rect = this.b;
        i2 = i1;
      } else {
        this.b.bottom = this.b.top + i3;
        return a(paramInt, this.b.top, this.b.bottom);
      } 
    } 
    rect.top = i2;
    this.b.bottom = this.b.top + i3;
    return a(paramInt, this.b.top, this.b.bottom);
  }
  
  boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean) { // Byte code:
    //   0: aload_0
    //   1: invokestatic a : (Landroid/view/View;)I
    //   4: istore #10
    //   6: aload_0
    //   7: invokevirtual computeHorizontalScrollRange : ()I
    //   10: istore #11
    //   12: aload_0
    //   13: invokevirtual computeHorizontalScrollExtent : ()I
    //   16: istore #12
    //   18: iconst_0
    //   19: istore #13
    //   21: iload #11
    //   23: iload #12
    //   25: if_icmple -> 34
    //   28: iconst_1
    //   29: istore #12
    //   31: goto -> 37
    //   34: iconst_0
    //   35: istore #12
    //   37: aload_0
    //   38: invokevirtual computeVerticalScrollRange : ()I
    //   41: aload_0
    //   42: invokevirtual computeVerticalScrollExtent : ()I
    //   45: if_icmple -> 54
    //   48: iconst_1
    //   49: istore #11
    //   51: goto -> 57
    //   54: iconst_0
    //   55: istore #11
    //   57: iload #10
    //   59: ifeq -> 82
    //   62: iload #10
    //   64: iconst_1
    //   65: if_icmpne -> 76
    //   68: iload #12
    //   70: ifeq -> 76
    //   73: goto -> 82
    //   76: iconst_0
    //   77: istore #12
    //   79: goto -> 85
    //   82: iconst_1
    //   83: istore #12
    //   85: iload #10
    //   87: ifeq -> 110
    //   90: iload #10
    //   92: iconst_1
    //   93: if_icmpne -> 104
    //   96: iload #11
    //   98: ifeq -> 104
    //   101: goto -> 110
    //   104: iconst_0
    //   105: istore #11
    //   107: goto -> 113
    //   110: iconst_1
    //   111: istore #11
    //   113: iload_3
    //   114: iload_1
    //   115: iadd
    //   116: istore_3
    //   117: iload #12
    //   119: ifne -> 127
    //   122: iconst_0
    //   123: istore_1
    //   124: goto -> 130
    //   127: iload #7
    //   129: istore_1
    //   130: iload #4
    //   132: iload_2
    //   133: iadd
    //   134: istore #4
    //   136: iload #11
    //   138: ifne -> 146
    //   141: iconst_0
    //   142: istore_2
    //   143: goto -> 149
    //   146: iload #8
    //   148: istore_2
    //   149: iload_1
    //   150: ineg
    //   151: istore #7
    //   153: iload_1
    //   154: iload #5
    //   156: iadd
    //   157: istore_1
    //   158: iload_2
    //   159: ineg
    //   160: istore #5
    //   162: iload_2
    //   163: iload #6
    //   165: iadd
    //   166: istore #6
    //   168: iload_3
    //   169: iload_1
    //   170: if_icmple -> 181
    //   173: iconst_1
    //   174: istore #9
    //   176: iload_1
    //   177: istore_2
    //   178: goto -> 198
    //   181: iload_3
    //   182: iload #7
    //   184: if_icmpge -> 193
    //   187: iload #7
    //   189: istore_1
    //   190: goto -> 173
    //   193: iload_3
    //   194: istore_2
    //   195: iconst_0
    //   196: istore #9
    //   198: iload #4
    //   200: iload #6
    //   202: if_icmple -> 214
    //   205: iload #6
    //   207: istore_1
    //   208: iconst_1
    //   209: istore #14
    //   211: goto -> 233
    //   214: iload #4
    //   216: iload #5
    //   218: if_icmpge -> 227
    //   221: iload #5
    //   223: istore_1
    //   224: goto -> 208
    //   227: iload #4
    //   229: istore_1
    //   230: iconst_0
    //   231: istore #14
    //   233: iload #14
    //   235: ifeq -> 255
    //   238: aload_0
    //   239: getfield c : Landroid/support/v4/widget/u;
    //   242: iload_2
    //   243: iload_1
    //   244: iconst_0
    //   245: iconst_0
    //   246: iconst_0
    //   247: aload_0
    //   248: invokespecial getScrollRange : ()I
    //   251: invokevirtual a : (IIIIII)Z
    //   254: pop
    //   255: aload_0
    //   256: iload_2
    //   257: iload_1
    //   258: iload #9
    //   260: iload #14
    //   262: invokevirtual onOverScrolled : (IIZZ)V
    //   265: iload #9
    //   267: ifne -> 279
    //   270: iload #13
    //   272: istore #9
    //   274: iload #14
    //   276: ifeq -> 282
    //   279: iconst_1
    //   280: istore #9
    //   282: iload #9
    //   284: ireturn }
  
  public boolean a(KeyEvent paramKeyEvent) {
    View view;
    this.b.setEmpty();
    boolean bool = b();
    boolean bool1 = false;
    char c1 = '';
    if (!bool) {
      bool = bool1;
      if (isFocused()) {
        bool = bool1;
        if (paramKeyEvent.getKeyCode() != 4) {
          View view1 = findFocus();
          view = view1;
          if (view1 == this)
            view = null; 
          view = FocusFinder.getInstance().findNextFocus(this, view, 130);
          bool = bool1;
          if (view != null) {
            bool = bool1;
            if (view != this) {
              bool = bool1;
              if (view.requestFocus(130))
                bool = true; 
            } 
          } 
        } 
      } 
      return bool;
    } 
    if (view.getAction() == 0) {
      int i1 = view.getKeyCode();
      if (i1 != 62) {
        switch (i1) {
          default:
            return false;
          case 20:
            return !view.isAltPressed() ? c(130) : b(130);
          case 19:
            break;
        } 
        return !view.isAltPressed() ? c(33) : b(33);
      } 
      if (view.isShiftPressed())
        c1 = '!'; 
      a(c1);
    } 
    return false;
  }
  
  public void addView(View paramView) {
    if (getChildCount() > 0)
      throw new IllegalStateException("ScrollView can host only one direct child"); 
    super.addView(paramView);
  }
  
  public void addView(View paramView, int paramInt) {
    if (getChildCount() > 0)
      throw new IllegalStateException("ScrollView can host only one direct child"); 
    super.addView(paramView, paramInt);
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    if (getChildCount() > 0)
      throw new IllegalStateException("ScrollView can host only one direct child"); 
    super.addView(paramView, paramInt, paramLayoutParams);
  }
  
  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    if (getChildCount() > 0)
      throw new IllegalStateException("ScrollView can host only one direct child"); 
    super.addView(paramView, paramLayoutParams);
  }
  
  public final void b(int paramInt1, int paramInt2) { a(paramInt1 - getScrollX(), paramInt2 - getScrollY()); }
  
  public boolean b(int paramInt) {
    int i1;
    if (paramInt == 130) {
      i1 = 1;
    } else {
      i1 = 0;
    } 
    int i2 = getHeight();
    this.b.top = 0;
    this.b.bottom = i2;
    if (i1) {
      i1 = getChildCount();
      if (i1 > 0) {
        View view = getChildAt(i1 - 1);
        this.b.bottom = view.getBottom() + getPaddingBottom();
        this.b.top = this.b.bottom - i2;
      } 
    } 
    return a(paramInt, this.b.top, this.b.bottom);
  }
  
  public boolean c(int paramInt) {
    View view1 = findFocus();
    View view2 = view1;
    if (view1 == this)
      view2 = null; 
    view1 = FocusFinder.getInstance().findNextFocus(this, view2, paramInt);
    int i1 = getMaxScrollAmount();
    if (view1 != null && a(view1, i1, getHeight())) {
      view1.getDrawingRect(this.b);
      offsetDescendantRectToMyCoords(view1, this.b);
      e(a(this.b));
      view1.requestFocus(paramInt);
    } else {
      int i2;
      if (paramInt == 33 && getScrollY() < i1) {
        i2 = getScrollY();
      } else {
        i2 = i1;
        if (paramInt == 130) {
          i2 = i1;
          if (getChildCount() > 0) {
            int i3 = getChildAt(0).getBottom() - getScrollY() + getHeight() - getPaddingBottom();
            i2 = i1;
            if (i3 < i1)
              i2 = i3; 
          } 
        } 
      } 
      if (i2 == 0)
        return false; 
      if (paramInt != 130)
        i2 = -i2; 
      e(i2);
    } 
    if (view2 != null && view2.isFocused() && a(view2)) {
      paramInt = getDescendantFocusability();
      setDescendantFocusability(131072);
      requestFocus();
      setDescendantFocusability(paramInt);
    } 
    return true;
  }
  
  public int computeHorizontalScrollExtent() { return super.computeHorizontalScrollExtent(); }
  
  public int computeHorizontalScrollOffset() { return super.computeHorizontalScrollOffset(); }
  
  public int computeHorizontalScrollRange() { return super.computeHorizontalScrollRange(); }
  
  public void computeScroll() {
    if (this.c.f()) {
      int i1 = getScrollX();
      int i2 = getScrollY();
      int i3 = this.c.b();
      int i4 = this.c.c();
      if (i1 != i3 || i2 != i4) {
        int i5 = getScrollRange();
        int i6 = af.a(this);
        if (i6 == 0 || (i6 == 1 && i5 > 0)) {
          i6 = 1;
        } else {
          i6 = 0;
        } 
        a(i3 - i1, i4 - i2, i1, i2, 0, i5, 0, 0, false);
        if (i6 != 0) {
          h h1;
          g();
          if (i4 <= 0 && i2 > 0) {
            h1 = this.d;
          } else if (i4 >= i5 && i2 < i5) {
            h1 = this.e;
          } else {
            return;
          } 
          h1.a((int)this.c.e());
          return;
        } 
      } 
    } 
  }
  
  public int computeVerticalScrollExtent() { return super.computeVerticalScrollExtent(); }
  
  public int computeVerticalScrollOffset() { return Math.max(0, super.computeVerticalScrollOffset()); }
  
  public int computeVerticalScrollRange() {
    int i1 = getChildCount();
    int i2 = getHeight() - getPaddingBottom() - getPaddingTop();
    if (i1 == 0)
      return i2; 
    i1 = getChildAt(0).getBottom();
    int i3 = getScrollY();
    int i4 = Math.max(0, i1 - i2);
    if (i3 < 0)
      return i1 - i3; 
    i2 = i1;
    if (i3 > i4)
      i2 = i1 + i3 - i4; 
    return i2;
  }
  
  public void d(int paramInt) {
    if (getChildCount() > 0) {
      int i1 = getHeight() - getPaddingBottom() - getPaddingTop();
      int i2 = getChildAt(0).getHeight();
      this.c.a(getScrollX(), getScrollY(), 0, paramInt, 0, 0, 0, Math.max(0, i2 - i1), 0, i1 / 2);
      af.b(this);
    } 
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) { return (super.dispatchKeyEvent(paramKeyEvent) || a(paramKeyEvent)); }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean) { return this.y.a(paramFloat1, paramFloat2, paramBoolean); }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2) { return this.y.a(paramFloat1, paramFloat2); }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2) { return this.y.a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2); }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt) { return this.y.a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt); }
  
  public void draw(Canvas paramCanvas) {
    super.draw(paramCanvas);
    if (this.d != null) {
      int i1 = getScrollY();
      if (!this.d.a()) {
        int i2 = paramCanvas.save();
        int i3 = getWidth();
        int i4 = getPaddingLeft();
        int i5 = getPaddingRight();
        paramCanvas.translate(getPaddingLeft(), Math.min(0, i1));
        this.d.a(i3 - i4 - i5, getHeight());
        if (this.d.a(paramCanvas))
          af.b(this); 
        paramCanvas.restoreToCount(i2);
      } 
      if (!this.e.a()) {
        int i2 = paramCanvas.save();
        int i4 = getWidth() - getPaddingLeft() - getPaddingRight();
        int i3 = getHeight();
        paramCanvas.translate((-i4 + getPaddingLeft()), (Math.max(getScrollRange(), i1) + i3));
        paramCanvas.rotate(180.0F, i4, 0.0F);
        this.e.a(i4, i3);
        if (this.e.a(paramCanvas))
          af.b(this); 
        paramCanvas.restoreToCount(i2);
      } 
    } 
  }
  
  protected float getBottomFadingEdgeStrength() {
    if (getChildCount() == 0)
      return 0.0F; 
    int i1 = getVerticalFadingEdgeLength();
    int i2 = getHeight();
    int i3 = getPaddingBottom();
    i2 = getChildAt(0).getBottom() - getScrollY() - i2 - i3;
    return (i2 < i1) ? (i2 / i1) : 1.0F;
  }
  
  public int getMaxScrollAmount() { return (int)(getHeight() * 0.5F); }
  
  public int getNestedScrollAxes() { return this.x.a(); }
  
  protected float getTopFadingEdgeStrength() {
    if (getChildCount() == 0)
      return 0.0F; 
    int i1 = getVerticalFadingEdgeLength();
    int i2 = getScrollY();
    return (i2 < i1) ? (i2 / i1) : 1.0F;
  }
  
  public boolean hasNestedScrollingParent() { return this.y.b(); }
  
  public boolean isNestedScrollingEnabled() { return this.y.a(); }
  
  protected void measureChild(View paramView, int paramInt1, int paramInt2) {
    ViewGroup.LayoutParams layoutParams = paramView.getLayoutParams();
    paramView.measure(getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
  }
  
  protected void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    paramView.measure(getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + paramInt2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
  }
  
  public void onAttachedToWindow() { this.h = false; }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent) {
    if ((s.c(paramMotionEvent) & 0x2) != 0) {
      if (paramMotionEvent.getAction() != 8)
        return false; 
      if (!this.j) {
        float f1 = s.e(paramMotionEvent, 9);
        if (f1 != 0.0F) {
          int i1 = (int)(f1 * getVerticalScrollFactorCompat());
          int i2 = getScrollRange();
          int i3 = getScrollY();
          int i4 = i3 - i1;
          if (i4 < 0) {
            i1 = 0;
          } else {
            i1 = i4;
            if (i4 > i2)
              i1 = i2; 
          } 
          if (i1 != i3) {
            super.scrollTo(getScrollX(), i1);
            return true;
          } 
        } 
      } 
    } 
    return false;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    ViewParent viewParent;
    int i1 = paramMotionEvent.getAction();
    if (i1 == 2 && this.j)
      return true; 
    i1 &= 0xFF;
    if (i1 != 6) {
      switch (i1) {
        default:
          return this.j;
        case 2:
          i1 = this.q;
          if (i1 != -1) {
            int i2 = s.a(paramMotionEvent, i1);
            if (i2 == -1) {
              viewParent = new StringBuilder();
              viewParent.append("Invalid pointerId=");
              viewParent.append(i1);
              viewParent.append(" in onInterceptTouchEvent");
              Log.e("NestedScrollView", viewParent.toString());
            } else {
              i1 = (int)s.d(viewParent, i2);
              if (Math.abs(i1 - this.f) > this.n && (0x2 & getNestedScrollAxes()) == 0) {
                this.j = true;
                this.f = i1;
                d();
                this.k.addMovement(viewParent);
                this.t = 0;
                viewParent = getParent();
                if (viewParent != null)
                  viewParent.requestDisallowInterceptTouchEvent(true); 
              } 
            } 
          } 
        case 1:
        case 3:
          this.j = false;
          this.q = -1;
          e();
          if (this.c.a(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))
            af.b(this); 
          stopNestedScroll();
        case 0:
          break;
      } 
      i1 = (int)viewParent.getY();
      if (!c((int)viewParent.getX(), i1)) {
        this.j = false;
        e();
      } 
      this.f = i1;
      this.q = s.b(viewParent, 0);
      c();
      this.k.addMovement(viewParent);
      this.c.f();
      this.j = this.c.a() ^ true;
      startNestedScroll(2);
    } 
    a(viewParent);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.g = false;
    if (this.i != null && a(this.i, this))
      b(this.i); 
    this.i = null;
    if (!this.h) {
      if (this.u != null) {
        scrollTo(getScrollX(), this.u.a);
        this.u = null;
      } 
      if (getChildCount() > 0) {
        paramInt1 = getChildAt(0).getMeasuredHeight();
      } else {
        paramInt1 = 0;
      } 
      paramInt1 = Math.max(0, paramInt1 - paramInt4 - paramInt2 - getPaddingBottom() - getPaddingTop());
      if (getScrollY() > paramInt1) {
        scrollTo(getScrollX(), paramInt1);
      } else if (getScrollY() < 0) {
        scrollTo(getScrollX(), 0);
      } 
    } 
    scrollTo(getScrollX(), getScrollY());
    this.h = true;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    if (!this.l)
      return; 
    if (View.MeasureSpec.getMode(paramInt2) == 0)
      return; 
    if (getChildCount() > 0) {
      View view = getChildAt(0);
      paramInt2 = getMeasuredHeight();
      if (view.getMeasuredHeight() < paramInt2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        view.measure(getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(paramInt2 - getPaddingTop() - getPaddingBottom(), 1073741824));
      } 
    } 
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean) {
    if (!paramBoolean) {
      f((int)paramFloat2);
      return true;
    } 
    return false;
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2) { return dispatchNestedPreFling(paramFloat1, paramFloat2); }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt) { dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt, null); }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt1 = getScrollY();
    scrollBy(0, paramInt4);
    paramInt1 = getScrollY() - paramInt1;
    dispatchNestedScroll(0, paramInt1, 0, paramInt4 - paramInt1, null);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt) {
    this.x.a(paramView1, paramView2, paramInt);
    startNestedScroll(2);
  }
  
  protected void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) { super.scrollTo(paramInt1, paramInt2); }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect) {
    View view;
    int i1;
    if (paramInt == 2) {
      i1 = 130;
    } else {
      i1 = paramInt;
      if (paramInt == 1)
        i1 = 33; 
    } 
    if (paramRect == null) {
      view = FocusFinder.getInstance().findNextFocus(this, null, i1);
    } else {
      view = FocusFinder.getInstance().findNextFocusFromRect(this, paramRect, i1);
    } 
    return (view == null) ? false : (a(view) ? false : view.requestFocus(i1, paramRect));
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof c)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    c c1 = (c)paramParcelable;
    super.onRestoreInstanceState(c1.getSuperState());
    this.u = c1;
    requestLayout();
  }
  
  protected Parcelable onSaveInstanceState() {
    c c1 = new c(super.onSaveInstanceState());
    c1.a = getScrollY();
    return c1;
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.A != null)
      this.A.a(this, paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    View view = findFocus();
    if (view != null) {
      if (this == view)
        return; 
      if (a(view, 0, paramInt4)) {
        view.getDrawingRect(this.b);
        offsetDescendantRectToMyCoords(view, this.b);
        e(a(this.b));
      } 
    } 
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt) { return ((paramInt & 0x2) != 0); }
  
  public void onStopNestedScroll(View paramView) {
    this.x.a(paramView);
    stopNestedScroll();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) { // Byte code:
    //   0: aload_0
    //   1: invokespecial d : ()V
    //   4: aload_1
    //   5: invokestatic obtain : (Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
    //   8: astore_2
    //   9: aload_1
    //   10: invokestatic a : (Landroid/view/MotionEvent;)I
    //   13: istore_3
    //   14: iload_3
    //   15: ifne -> 23
    //   18: aload_0
    //   19: iconst_0
    //   20: putfield t : I
    //   23: aload_2
    //   24: fconst_0
    //   25: aload_0
    //   26: getfield t : I
    //   29: i2f
    //   30: invokevirtual offsetLocation : (FF)V
    //   33: iload_3
    //   34: tableswitch default -> 76, 0 -> 811, 1 -> 716, 2 -> 173, 3 -> 131, 4 -> 76, 5 -> 104, 6 -> 79
    //   76: goto -> 902
    //   79: aload_0
    //   80: aload_1
    //   81: invokespecial a : (Landroid/view/MotionEvent;)V
    //   84: aload_0
    //   85: aload_1
    //   86: aload_1
    //   87: aload_0
    //   88: getfield q : I
    //   91: invokestatic a : (Landroid/view/MotionEvent;I)I
    //   94: invokestatic d : (Landroid/view/MotionEvent;I)F
    //   97: f2i
    //   98: putfield f : I
    //   101: goto -> 902
    //   104: aload_1
    //   105: invokestatic b : (Landroid/view/MotionEvent;)I
    //   108: istore_3
    //   109: aload_0
    //   110: aload_1
    //   111: iload_3
    //   112: invokestatic d : (Landroid/view/MotionEvent;I)F
    //   115: f2i
    //   116: putfield f : I
    //   119: aload_0
    //   120: aload_1
    //   121: iload_3
    //   122: invokestatic b : (Landroid/view/MotionEvent;I)I
    //   125: putfield q : I
    //   128: goto -> 902
    //   131: aload_0
    //   132: getfield j : Z
    //   135: ifeq -> 799
    //   138: aload_0
    //   139: invokevirtual getChildCount : ()I
    //   142: ifle -> 799
    //   145: aload_0
    //   146: getfield c : Landroid/support/v4/widget/u;
    //   149: aload_0
    //   150: invokevirtual getScrollX : ()I
    //   153: aload_0
    //   154: invokevirtual getScrollY : ()I
    //   157: iconst_0
    //   158: iconst_0
    //   159: iconst_0
    //   160: aload_0
    //   161: invokespecial getScrollRange : ()I
    //   164: invokevirtual a : (IIIIII)Z
    //   167: ifeq -> 799
    //   170: goto -> 795
    //   173: aload_1
    //   174: aload_0
    //   175: getfield q : I
    //   178: invokestatic a : (Landroid/view/MotionEvent;I)I
    //   181: istore #4
    //   183: iload #4
    //   185: iconst_m1
    //   186: if_icmpne -> 236
    //   189: new java/lang/StringBuilder
    //   192: dup
    //   193: invokespecial <init> : ()V
    //   196: astore_1
    //   197: aload_1
    //   198: ldc_w 'Invalid pointerId='
    //   201: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: pop
    //   205: aload_1
    //   206: aload_0
    //   207: getfield q : I
    //   210: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   213: pop
    //   214: aload_1
    //   215: ldc_w ' in onTouchEvent'
    //   218: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: pop
    //   222: ldc_w 'NestedScrollView'
    //   225: aload_1
    //   226: invokevirtual toString : ()Ljava/lang/String;
    //   229: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   232: pop
    //   233: goto -> 902
    //   236: aload_1
    //   237: iload #4
    //   239: invokestatic d : (Landroid/view/MotionEvent;I)F
    //   242: f2i
    //   243: istore #5
    //   245: aload_0
    //   246: getfield f : I
    //   249: iload #5
    //   251: isub
    //   252: istore_3
    //   253: iload_3
    //   254: istore #6
    //   256: aload_0
    //   257: iconst_0
    //   258: iload_3
    //   259: aload_0
    //   260: getfield s : [I
    //   263: aload_0
    //   264: getfield r : [I
    //   267: invokevirtual dispatchNestedPreScroll : (II[I[I)Z
    //   270: ifeq -> 310
    //   273: iload_3
    //   274: aload_0
    //   275: getfield s : [I
    //   278: iconst_1
    //   279: iaload
    //   280: isub
    //   281: istore #6
    //   283: aload_2
    //   284: fconst_0
    //   285: aload_0
    //   286: getfield r : [I
    //   289: iconst_1
    //   290: iaload
    //   291: i2f
    //   292: invokevirtual offsetLocation : (FF)V
    //   295: aload_0
    //   296: aload_0
    //   297: getfield t : I
    //   300: aload_0
    //   301: getfield r : [I
    //   304: iconst_1
    //   305: iaload
    //   306: iadd
    //   307: putfield t : I
    //   310: iload #6
    //   312: istore_3
    //   313: aload_0
    //   314: getfield j : Z
    //   317: ifne -> 383
    //   320: iload #6
    //   322: istore_3
    //   323: iload #6
    //   325: invokestatic abs : (I)I
    //   328: aload_0
    //   329: getfield n : I
    //   332: if_icmple -> 383
    //   335: aload_0
    //   336: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   339: astore #7
    //   341: aload #7
    //   343: ifnull -> 354
    //   346: aload #7
    //   348: iconst_1
    //   349: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   354: aload_0
    //   355: iconst_1
    //   356: putfield j : Z
    //   359: iload #6
    //   361: ifle -> 375
    //   364: iload #6
    //   366: aload_0
    //   367: getfield n : I
    //   370: isub
    //   371: istore_3
    //   372: goto -> 383
    //   375: iload #6
    //   377: aload_0
    //   378: getfield n : I
    //   381: iadd
    //   382: istore_3
    //   383: aload_0
    //   384: getfield j : Z
    //   387: ifeq -> 902
    //   390: aload_0
    //   391: iload #5
    //   393: aload_0
    //   394: getfield r : [I
    //   397: iconst_1
    //   398: iaload
    //   399: isub
    //   400: putfield f : I
    //   403: aload_0
    //   404: invokevirtual getScrollY : ()I
    //   407: istore #8
    //   409: aload_0
    //   410: invokespecial getScrollRange : ()I
    //   413: istore #5
    //   415: aload_0
    //   416: invokestatic a : (Landroid/view/View;)I
    //   419: istore #6
    //   421: iload #6
    //   423: ifeq -> 446
    //   426: iload #6
    //   428: iconst_1
    //   429: if_icmpne -> 440
    //   432: iload #5
    //   434: ifle -> 440
    //   437: goto -> 446
    //   440: iconst_0
    //   441: istore #6
    //   443: goto -> 449
    //   446: iconst_1
    //   447: istore #6
    //   449: aload_0
    //   450: iconst_0
    //   451: iload_3
    //   452: iconst_0
    //   453: aload_0
    //   454: invokevirtual getScrollY : ()I
    //   457: iconst_0
    //   458: iload #5
    //   460: iconst_0
    //   461: iconst_0
    //   462: iconst_1
    //   463: invokevirtual a : (IIIIIIIIZ)Z
    //   466: ifeq -> 483
    //   469: aload_0
    //   470: invokevirtual hasNestedScrollingParent : ()Z
    //   473: ifne -> 483
    //   476: aload_0
    //   477: getfield k : Landroid/view/VelocityTracker;
    //   480: invokevirtual clear : ()V
    //   483: aload_0
    //   484: invokevirtual getScrollY : ()I
    //   487: iload #8
    //   489: isub
    //   490: istore #9
    //   492: aload_0
    //   493: iconst_0
    //   494: iload #9
    //   496: iconst_0
    //   497: iload_3
    //   498: iload #9
    //   500: isub
    //   501: aload_0
    //   502: getfield r : [I
    //   505: invokevirtual dispatchNestedScroll : (IIII[I)Z
    //   508: ifeq -> 556
    //   511: aload_0
    //   512: aload_0
    //   513: getfield f : I
    //   516: aload_0
    //   517: getfield r : [I
    //   520: iconst_1
    //   521: iaload
    //   522: isub
    //   523: putfield f : I
    //   526: aload_2
    //   527: fconst_0
    //   528: aload_0
    //   529: getfield r : [I
    //   532: iconst_1
    //   533: iaload
    //   534: i2f
    //   535: invokevirtual offsetLocation : (FF)V
    //   538: aload_0
    //   539: aload_0
    //   540: getfield t : I
    //   543: aload_0
    //   544: getfield r : [I
    //   547: iconst_1
    //   548: iaload
    //   549: iadd
    //   550: putfield t : I
    //   553: goto -> 902
    //   556: iload #6
    //   558: ifeq -> 902
    //   561: aload_0
    //   562: invokespecial g : ()V
    //   565: iload #8
    //   567: iload_3
    //   568: iadd
    //   569: istore #6
    //   571: iload #6
    //   573: ifge -> 627
    //   576: aload_0
    //   577: getfield d : Landroid/support/v4/widget/h;
    //   580: iload_3
    //   581: i2f
    //   582: aload_0
    //   583: invokevirtual getHeight : ()I
    //   586: i2f
    //   587: fdiv
    //   588: aload_1
    //   589: iload #4
    //   591: invokestatic c : (Landroid/view/MotionEvent;I)F
    //   594: aload_0
    //   595: invokevirtual getWidth : ()I
    //   598: i2f
    //   599: fdiv
    //   600: invokevirtual a : (FF)Z
    //   603: pop
    //   604: aload_0
    //   605: getfield e : Landroid/support/v4/widget/h;
    //   608: invokevirtual a : ()Z
    //   611: ifne -> 682
    //   614: aload_0
    //   615: getfield e : Landroid/support/v4/widget/h;
    //   618: astore_1
    //   619: aload_1
    //   620: invokevirtual b : ()Z
    //   623: pop
    //   624: goto -> 682
    //   627: iload #6
    //   629: iload #5
    //   631: if_icmple -> 682
    //   634: aload_0
    //   635: getfield e : Landroid/support/v4/widget/h;
    //   638: iload_3
    //   639: i2f
    //   640: aload_0
    //   641: invokevirtual getHeight : ()I
    //   644: i2f
    //   645: fdiv
    //   646: fconst_1
    //   647: aload_1
    //   648: iload #4
    //   650: invokestatic c : (Landroid/view/MotionEvent;I)F
    //   653: aload_0
    //   654: invokevirtual getWidth : ()I
    //   657: i2f
    //   658: fdiv
    //   659: fsub
    //   660: invokevirtual a : (FF)Z
    //   663: pop
    //   664: aload_0
    //   665: getfield d : Landroid/support/v4/widget/h;
    //   668: invokevirtual a : ()Z
    //   671: ifne -> 682
    //   674: aload_0
    //   675: getfield d : Landroid/support/v4/widget/h;
    //   678: astore_1
    //   679: goto -> 619
    //   682: aload_0
    //   683: getfield d : Landroid/support/v4/widget/h;
    //   686: ifnull -> 902
    //   689: aload_0
    //   690: getfield d : Landroid/support/v4/widget/h;
    //   693: invokevirtual a : ()Z
    //   696: ifeq -> 709
    //   699: aload_0
    //   700: getfield e : Landroid/support/v4/widget/h;
    //   703: invokevirtual a : ()Z
    //   706: ifne -> 902
    //   709: aload_0
    //   710: invokestatic b : (Landroid/view/View;)V
    //   713: goto -> 902
    //   716: aload_0
    //   717: getfield j : Z
    //   720: ifeq -> 799
    //   723: aload_0
    //   724: getfield k : Landroid/view/VelocityTracker;
    //   727: astore_1
    //   728: aload_1
    //   729: sipush #1000
    //   732: aload_0
    //   733: getfield p : I
    //   736: i2f
    //   737: invokevirtual computeCurrentVelocity : (IF)V
    //   740: aload_1
    //   741: aload_0
    //   742: getfield q : I
    //   745: invokestatic a : (Landroid/view/VelocityTracker;I)F
    //   748: f2i
    //   749: istore_3
    //   750: iload_3
    //   751: invokestatic abs : (I)I
    //   754: aload_0
    //   755: getfield o : I
    //   758: if_icmple -> 770
    //   761: aload_0
    //   762: iload_3
    //   763: ineg
    //   764: invokespecial f : (I)V
    //   767: goto -> 799
    //   770: aload_0
    //   771: getfield c : Landroid/support/v4/widget/u;
    //   774: aload_0
    //   775: invokevirtual getScrollX : ()I
    //   778: aload_0
    //   779: invokevirtual getScrollY : ()I
    //   782: iconst_0
    //   783: iconst_0
    //   784: iconst_0
    //   785: aload_0
    //   786: invokespecial getScrollRange : ()I
    //   789: invokevirtual a : (IIIIII)Z
    //   792: ifeq -> 799
    //   795: aload_0
    //   796: invokestatic b : (Landroid/view/View;)V
    //   799: aload_0
    //   800: iconst_m1
    //   801: putfield q : I
    //   804: aload_0
    //   805: invokespecial f : ()V
    //   808: goto -> 902
    //   811: aload_0
    //   812: invokevirtual getChildCount : ()I
    //   815: ifne -> 820
    //   818: iconst_0
    //   819: ireturn
    //   820: aload_0
    //   821: getfield c : Landroid/support/v4/widget/u;
    //   824: invokevirtual a : ()Z
    //   827: iconst_1
    //   828: ixor
    //   829: istore #10
    //   831: aload_0
    //   832: iload #10
    //   834: putfield j : Z
    //   837: iload #10
    //   839: ifeq -> 861
    //   842: aload_0
    //   843: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   846: astore #7
    //   848: aload #7
    //   850: ifnull -> 861
    //   853: aload #7
    //   855: iconst_1
    //   856: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   861: aload_0
    //   862: getfield c : Landroid/support/v4/widget/u;
    //   865: invokevirtual a : ()Z
    //   868: ifne -> 878
    //   871: aload_0
    //   872: getfield c : Landroid/support/v4/widget/u;
    //   875: invokevirtual g : ()V
    //   878: aload_0
    //   879: aload_1
    //   880: invokevirtual getY : ()F
    //   883: f2i
    //   884: putfield f : I
    //   887: aload_0
    //   888: aload_1
    //   889: iconst_0
    //   890: invokestatic b : (Landroid/view/MotionEvent;I)I
    //   893: putfield q : I
    //   896: aload_0
    //   897: iconst_2
    //   898: invokevirtual startNestedScroll : (I)Z
    //   901: pop
    //   902: aload_0
    //   903: getfield k : Landroid/view/VelocityTracker;
    //   906: ifnull -> 917
    //   909: aload_0
    //   910: getfield k : Landroid/view/VelocityTracker;
    //   913: aload_2
    //   914: invokevirtual addMovement : (Landroid/view/MotionEvent;)V
    //   917: aload_2
    //   918: invokevirtual recycle : ()V
    //   921: iconst_1
    //   922: ireturn }
  
  public void requestChildFocus(View paramView1, View paramView2) {
    if (!this.g) {
      b(paramView2);
    } else {
      this.i = paramView2;
    } 
    super.requestChildFocus(paramView1, paramView2);
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean) {
    paramRect.offset(paramView.getLeft() - paramView.getScrollX(), paramView.getTop() - paramView.getScrollY());
    return a(paramRect, paramBoolean);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean) {
    if (paramBoolean)
      e(); 
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout() {
    this.g = true;
    super.requestLayout();
  }
  
  public void scrollTo(int paramInt1, int paramInt2) {
    if (getChildCount() > 0) {
      View view = getChildAt(0);
      paramInt1 = b(paramInt1, getWidth() - getPaddingRight() - getPaddingLeft(), view.getWidth());
      paramInt2 = b(paramInt2, getHeight() - getPaddingBottom() - getPaddingTop(), view.getHeight());
      if (paramInt1 != getScrollX() || paramInt2 != getScrollY())
        super.scrollTo(paramInt1, paramInt2); 
    } 
  }
  
  public void setFillViewport(boolean paramBoolean) {
    if (paramBoolean != this.l) {
      this.l = paramBoolean;
      requestLayout();
    } 
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean) { this.y.a(paramBoolean); }
  
  public void setOnScrollChangeListener(b paramb) { this.A = paramb; }
  
  public void setSmoothScrollingEnabled(boolean paramBoolean) { this.m = paramBoolean; }
  
  public boolean shouldDelayChildPressedState() { return true; }
  
  public boolean startNestedScroll(int paramInt) { return this.y.a(paramInt); }
  
  public void stopNestedScroll() { this.y.c(); }
  
  static class a extends a {
    public void a(View param1View, b param1b) {
      super.a(param1View, param1b);
      NestedScrollView nestedScrollView = (NestedScrollView)param1View;
      param1b.a(android.widget.ScrollView.class.getName());
      if (nestedScrollView.isEnabled()) {
        int i = NestedScrollView.a(nestedScrollView);
        if (i > 0) {
          param1b.a(true);
          if (nestedScrollView.getScrollY() > 0)
            param1b.a(8192); 
          if (nestedScrollView.getScrollY() < i)
            param1b.a(4096); 
        } 
      } 
    }
    
    public boolean a(View param1View, int param1Int, Bundle param1Bundle) {
      if (super.a(param1View, param1Int, param1Bundle))
        return true; 
      NestedScrollView nestedScrollView = (NestedScrollView)param1View;
      if (!nestedScrollView.isEnabled())
        return false; 
      if (param1Int != 4096) {
        if (param1Int != 8192)
          return false; 
        int k = nestedScrollView.getHeight();
        param1Int = nestedScrollView.getPaddingBottom();
        int m = nestedScrollView.getPaddingTop();
        param1Int = Math.max(nestedScrollView.getScrollY() - k - param1Int - m, 0);
        if (param1Int != nestedScrollView.getScrollY()) {
          nestedScrollView.b(0, param1Int);
          return true;
        } 
        return false;
      } 
      param1Int = nestedScrollView.getHeight();
      int j = nestedScrollView.getPaddingBottom();
      int i = nestedScrollView.getPaddingTop();
      param1Int = Math.min(nestedScrollView.getScrollY() + param1Int - j - i, NestedScrollView.a(nestedScrollView));
      if (param1Int != nestedScrollView.getScrollY()) {
        nestedScrollView.b(0, param1Int);
        return true;
      } 
      return false;
    }
    
    public void d(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      boolean bool;
      super.d(param1View, param1AccessibilityEvent);
      NestedScrollView nestedScrollView = (NestedScrollView)param1View;
      param1AccessibilityEvent.setClassName(android.widget.ScrollView.class.getName());
      h h = a.a(param1AccessibilityEvent);
      if (NestedScrollView.a(nestedScrollView) > 0) {
        bool = true;
      } else {
        bool = false;
      } 
      h.a(bool);
      h.a(nestedScrollView.getScrollX());
      h.b(nestedScrollView.getScrollY());
      h.c(nestedScrollView.getScrollX());
      h.d(NestedScrollView.a(nestedScrollView));
    }
  }
  
  public static interface b {
    void a(NestedScrollView param1NestedScrollView, int param1Int1, int param1Int2, int param1Int3, int param1Int4);
  }
  
  static class c extends View.BaseSavedState {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() {
        public NestedScrollView.c a(Parcel param2Parcel) { return new NestedScrollView.c(param2Parcel); }
        
        public NestedScrollView.c[] a(int param2Int) { return new NestedScrollView.c[param2Int]; }
      };
    
    public int a;
    
    public c(Parcel param1Parcel) {
      super(param1Parcel);
      this.a = param1Parcel.readInt();
    }
    
    c(Parcelable param1Parcelable) { super(param1Parcelable); }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("HorizontalScrollView.SavedState{");
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append(" scrollPosition=");
      stringBuilder.append(this.a);
      stringBuilder.append("}");
      return stringBuilder.toString();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeInt(this.a);
    }
  }
  
  static final class null extends Object implements Parcelable.Creator<c> {
    public NestedScrollView.c a(Parcel param1Parcel) { return new NestedScrollView.c(param1Parcel); }
    
    public NestedScrollView.c[] a(int param1Int) { return new NestedScrollView.c[param1Int]; }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/widget/NestedScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */