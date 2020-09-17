package android.support.v7.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.a.x;
import android.support.v4.h.aa;
import android.support.v4.h.af;
import android.support.v4.h.aq;
import android.support.v4.h.au;
import android.support.v4.h.az;
import android.support.v4.h.bb;
import android.support.v4.h.i;
import android.support.v4.h.m;
import android.support.v7.b.a;
import android.support.v7.view.b;
import android.support.v7.view.d;
import android.support.v7.view.menu.e;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.l;
import android.support.v7.view.menu.m;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.ab;
import android.support.v7.widget.ae;
import android.support.v7.widget.at;
import android.support.v7.widget.au;
import android.support.v7.widget.l;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

class k extends g implements m, f.a {
  private boolean A;
  
  private d[] B;
  
  private d C;
  
  private boolean D;
  
  private boolean E;
  
  private int F;
  
  private final Runnable G = new Runnable(this) {
      public void run() {
        if ((k.a(this.a) & true) != 0)
          k.a(this.a, 0); 
        if ((k.a(this.a) & 0x1000) != 0)
          k.a(this.a, 108); 
        k.a(this.a, false);
        k.b(this.a, 0);
      }
    };
  
  private boolean H;
  
  private Rect I;
  
  private Rect J;
  
  private m K;
  
  b m;
  
  ActionBarContextView n;
  
  PopupWindow o;
  
  Runnable p;
  
  au q = null;
  
  private ab r;
  
  private a s;
  
  private e t;
  
  private boolean u;
  
  private ViewGroup v;
  
  private TextView w;
  
  private View x;
  
  private boolean y;
  
  private boolean z;
  
  k(Context paramContext, Window paramWindow, e parame) { super(paramContext, paramWindow, parame); }
  
  private d a(int paramInt, boolean paramBoolean) { // Byte code:
    //   0: aload_0
    //   1: getfield B : [Landroid/support/v7/a/k$d;
    //   4: astore_3
    //   5: aload_3
    //   6: ifnull -> 18
    //   9: aload_3
    //   10: astore #4
    //   12: aload_3
    //   13: arraylength
    //   14: iload_1
    //   15: if_icmpgt -> 46
    //   18: iload_1
    //   19: iconst_1
    //   20: iadd
    //   21: anewarray android/support/v7/a/k$d
    //   24: astore #4
    //   26: aload_3
    //   27: ifnull -> 40
    //   30: aload_3
    //   31: iconst_0
    //   32: aload #4
    //   34: iconst_0
    //   35: aload_3
    //   36: arraylength
    //   37: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   40: aload_0
    //   41: aload #4
    //   43: putfield B : [Landroid/support/v7/a/k$d;
    //   46: aload #4
    //   48: iload_1
    //   49: aaload
    //   50: astore #5
    //   52: aload #5
    //   54: astore_3
    //   55: aload #5
    //   57: ifnonnull -> 74
    //   60: new android/support/v7/a/k$d
    //   63: dup
    //   64: iload_1
    //   65: invokespecial <init> : (I)V
    //   68: astore_3
    //   69: aload #4
    //   71: iload_1
    //   72: aload_3
    //   73: aastore
    //   74: aload_3
    //   75: areturn }
  
  private d a(Menu paramMenu) {
    boolean bool;
    d[] arrayOfd = this.B;
    byte b1 = 0;
    if (arrayOfd != null) {
      bool = arrayOfd.length;
    } else {
      bool = false;
    } 
    while (b1 < bool) {
      d d1 = arrayOfd[b1];
      if (d1 != null && d1.j == paramMenu)
        return d1; 
      b1++;
    } 
    return null;
  }
  
  private void a(int paramInt, d paramd, Menu paramMenu) {
    d d1 = paramd;
    f f = paramMenu;
    if (paramMenu == null) {
      d d2 = paramd;
      if (paramd == null) {
        d2 = paramd;
        if (paramInt >= 0) {
          d2 = paramd;
          if (paramInt < this.B.length)
            d2 = this.B[paramInt]; 
        } 
      } 
      d1 = d2;
      f = paramMenu;
      if (d2 != null) {
        f = d2.j;
        d1 = d2;
      } 
    } 
    if (d1 != null && !d1.o)
      return; 
    if (!o())
      this.c.onPanelClosed(paramInt, f); 
  }
  
  private void a(d paramd, KeyEvent paramKeyEvent) { // Byte code:
    //   0: aload_1
    //   1: getfield o : Z
    //   4: ifne -> 432
    //   7: aload_0
    //   8: invokevirtual o : ()Z
    //   11: ifeq -> 15
    //   14: return
    //   15: aload_1
    //   16: getfield a : I
    //   19: ifne -> 85
    //   22: aload_0
    //   23: getfield a : Landroid/content/Context;
    //   26: astore_3
    //   27: aload_3
    //   28: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   31: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   34: getfield screenLayout : I
    //   37: bipush #15
    //   39: iand
    //   40: iconst_4
    //   41: if_icmpne -> 50
    //   44: iconst_1
    //   45: istore #4
    //   47: goto -> 53
    //   50: iconst_0
    //   51: istore #4
    //   53: aload_3
    //   54: invokevirtual getApplicationInfo : ()Landroid/content/pm/ApplicationInfo;
    //   57: getfield targetSdkVersion : I
    //   60: bipush #11
    //   62: if_icmplt -> 71
    //   65: iconst_1
    //   66: istore #5
    //   68: goto -> 74
    //   71: iconst_0
    //   72: istore #5
    //   74: iload #4
    //   76: ifeq -> 85
    //   79: iload #5
    //   81: ifeq -> 85
    //   84: return
    //   85: aload_0
    //   86: invokevirtual p : ()Landroid/view/Window$Callback;
    //   89: astore_3
    //   90: aload_3
    //   91: ifnull -> 118
    //   94: aload_3
    //   95: aload_1
    //   96: getfield a : I
    //   99: aload_1
    //   100: getfield j : Landroid/support/v7/view/menu/f;
    //   103: invokeinterface onMenuOpened : (ILandroid/view/Menu;)Z
    //   108: ifne -> 118
    //   111: aload_0
    //   112: aload_1
    //   113: iconst_1
    //   114: invokespecial a : (Landroid/support/v7/a/k$d;Z)V
    //   117: return
    //   118: aload_0
    //   119: getfield a : Landroid/content/Context;
    //   122: ldc 'window'
    //   124: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   127: checkcast android/view/WindowManager
    //   130: astore #6
    //   132: aload #6
    //   134: ifnonnull -> 138
    //   137: return
    //   138: aload_0
    //   139: aload_1
    //   140: aload_2
    //   141: invokespecial b : (Landroid/support/v7/a/k$d;Landroid/view/KeyEvent;)Z
    //   144: ifne -> 148
    //   147: return
    //   148: aload_1
    //   149: getfield g : Landroid/view/ViewGroup;
    //   152: ifnull -> 198
    //   155: aload_1
    //   156: getfield q : Z
    //   159: ifeq -> 165
    //   162: goto -> 198
    //   165: aload_1
    //   166: getfield i : Landroid/view/View;
    //   169: ifnull -> 362
    //   172: aload_1
    //   173: getfield i : Landroid/view/View;
    //   176: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   179: astore_2
    //   180: aload_2
    //   181: ifnull -> 362
    //   184: aload_2
    //   185: getfield width : I
    //   188: iconst_m1
    //   189: if_icmpne -> 362
    //   192: iconst_m1
    //   193: istore #4
    //   195: goto -> 366
    //   198: aload_1
    //   199: getfield g : Landroid/view/ViewGroup;
    //   202: ifnonnull -> 221
    //   205: aload_0
    //   206: aload_1
    //   207: invokespecial a : (Landroid/support/v7/a/k$d;)Z
    //   210: ifeq -> 220
    //   213: aload_1
    //   214: getfield g : Landroid/view/ViewGroup;
    //   217: ifnonnull -> 245
    //   220: return
    //   221: aload_1
    //   222: getfield q : Z
    //   225: ifeq -> 245
    //   228: aload_1
    //   229: getfield g : Landroid/view/ViewGroup;
    //   232: invokevirtual getChildCount : ()I
    //   235: ifle -> 245
    //   238: aload_1
    //   239: getfield g : Landroid/view/ViewGroup;
    //   242: invokevirtual removeAllViews : ()V
    //   245: aload_0
    //   246: aload_1
    //   247: invokespecial c : (Landroid/support/v7/a/k$d;)Z
    //   250: ifeq -> 432
    //   253: aload_1
    //   254: invokevirtual a : ()Z
    //   257: ifne -> 261
    //   260: return
    //   261: aload_1
    //   262: getfield h : Landroid/view/View;
    //   265: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   268: astore_3
    //   269: aload_3
    //   270: astore_2
    //   271: aload_3
    //   272: ifnonnull -> 287
    //   275: new android/view/ViewGroup$LayoutParams
    //   278: dup
    //   279: bipush #-2
    //   281: bipush #-2
    //   283: invokespecial <init> : (II)V
    //   286: astore_2
    //   287: aload_1
    //   288: getfield b : I
    //   291: istore #4
    //   293: aload_1
    //   294: getfield g : Landroid/view/ViewGroup;
    //   297: iload #4
    //   299: invokevirtual setBackgroundResource : (I)V
    //   302: aload_1
    //   303: getfield h : Landroid/view/View;
    //   306: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   309: astore_3
    //   310: aload_3
    //   311: ifnull -> 332
    //   314: aload_3
    //   315: instanceof android/view/ViewGroup
    //   318: ifeq -> 332
    //   321: aload_3
    //   322: checkcast android/view/ViewGroup
    //   325: aload_1
    //   326: getfield h : Landroid/view/View;
    //   329: invokevirtual removeView : (Landroid/view/View;)V
    //   332: aload_1
    //   333: getfield g : Landroid/view/ViewGroup;
    //   336: aload_1
    //   337: getfield h : Landroid/view/View;
    //   340: aload_2
    //   341: invokevirtual addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   344: aload_1
    //   345: getfield h : Landroid/view/View;
    //   348: invokevirtual hasFocus : ()Z
    //   351: ifne -> 362
    //   354: aload_1
    //   355: getfield h : Landroid/view/View;
    //   358: invokevirtual requestFocus : ()Z
    //   361: pop
    //   362: bipush #-2
    //   364: istore #4
    //   366: aload_1
    //   367: iconst_0
    //   368: putfield n : Z
    //   371: new android/view/WindowManager$LayoutParams
    //   374: dup
    //   375: iload #4
    //   377: bipush #-2
    //   379: aload_1
    //   380: getfield d : I
    //   383: aload_1
    //   384: getfield e : I
    //   387: sipush #1002
    //   390: ldc_w 8519680
    //   393: bipush #-3
    //   395: invokespecial <init> : (IIIIIII)V
    //   398: astore_2
    //   399: aload_2
    //   400: aload_1
    //   401: getfield c : I
    //   404: putfield gravity : I
    //   407: aload_2
    //   408: aload_1
    //   409: getfield f : I
    //   412: putfield windowAnimations : I
    //   415: aload #6
    //   417: aload_1
    //   418: getfield g : Landroid/view/ViewGroup;
    //   421: aload_2
    //   422: invokeinterface addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   427: aload_1
    //   428: iconst_1
    //   429: putfield o : Z
    //   432: return }
  
  private void a(d paramd, boolean paramBoolean) {
    if (paramBoolean && paramd.a == 0 && this.r != null && this.r.e()) {
      b(paramd.j);
      return;
    } 
    WindowManager windowManager = (WindowManager)this.a.getSystemService("window");
    if (windowManager != null && paramd.o && paramd.g != null) {
      windowManager.removeView(paramd.g);
      if (paramBoolean)
        a(paramd.a, paramd, null); 
    } 
    paramd.m = false;
    paramd.n = false;
    paramd.o = false;
    paramd.h = null;
    paramd.q = true;
    if (this.C == paramd)
      this.C = null; 
  }
  
  private void a(f paramf, boolean paramBoolean) {
    if (this.r != null && this.r.d() && (!aq.a(ViewConfiguration.get(this.a)) || this.r.f())) {
      Window.Callback callback = p();
      if (!this.r.e() || !paramBoolean) {
        if (callback != null && !o()) {
          if (this.E && (this.F & true) != 0) {
            this.b.getDecorView().removeCallbacks(this.G);
            this.G.run();
          } 
          d d2 = a(0, true);
          if (d2.j != null && !d2.r && callback.onPreparePanel(0, d2.i, d2.j)) {
            callback.onMenuOpened(108, d2.j);
            this.r.g();
          } 
        } 
        return;
      } 
      this.r.h();
      if (!o()) {
        callback.onPanelClosed(108, (a(0, true)).j);
        return;
      } 
      return;
    } 
    d d1 = a(0, true);
    d1.q = true;
    a(d1, false);
    a(d1, null);
  }
  
  private boolean a(d paramd) {
    paramd.a(m());
    paramd.g = new c(this, paramd.l);
    paramd.c = 81;
    return true;
  }
  
  private boolean a(d paramd, int paramInt1, KeyEvent paramKeyEvent, int paramInt2) { // Byte code:
    //   0: aload_3
    //   1: invokevirtual isSystem : ()Z
    //   4: istore #5
    //   6: iconst_0
    //   7: istore #6
    //   9: iload #5
    //   11: ifeq -> 16
    //   14: iconst_0
    //   15: ireturn
    //   16: aload_1
    //   17: getfield m : Z
    //   20: ifne -> 36
    //   23: iload #6
    //   25: istore #5
    //   27: aload_0
    //   28: aload_1
    //   29: aload_3
    //   30: invokespecial b : (Landroid/support/v7/a/k$d;Landroid/view/KeyEvent;)Z
    //   33: ifeq -> 60
    //   36: iload #6
    //   38: istore #5
    //   40: aload_1
    //   41: getfield j : Landroid/support/v7/view/menu/f;
    //   44: ifnull -> 60
    //   47: aload_1
    //   48: getfield j : Landroid/support/v7/view/menu/f;
    //   51: iload_2
    //   52: aload_3
    //   53: iload #4
    //   55: invokevirtual performShortcut : (ILandroid/view/KeyEvent;I)Z
    //   58: istore #5
    //   60: iload #5
    //   62: ifeq -> 85
    //   65: iload #4
    //   67: iconst_1
    //   68: iand
    //   69: ifne -> 85
    //   72: aload_0
    //   73: getfield r : Landroid/support/v7/widget/ab;
    //   76: ifnonnull -> 85
    //   79: aload_0
    //   80: aload_1
    //   81: iconst_1
    //   82: invokespecial a : (Landroid/support/v7/a/k$d;Z)V
    //   85: iload #5
    //   87: ireturn }
  
  private boolean a(ViewParent paramViewParent) {
    if (paramViewParent == null)
      return false; 
    View view = this.b.getDecorView();
    while (true) {
      if (paramViewParent == null)
        return true; 
      if (paramViewParent != view && paramViewParent instanceof View) {
        if (af.r((View)paramViewParent))
          return false; 
        paramViewParent = paramViewParent.getParent();
        continue;
      } 
      break;
    } 
    return false;
  }
  
  private void b(f paramf) {
    if (this.A)
      return; 
    this.A = true;
    this.r.j();
    Window.Callback callback = p();
    if (callback != null && !o())
      callback.onPanelClosed(108, paramf); 
    this.A = false;
  }
  
  private boolean b(d paramd) { // Byte code:
    //   0: aload_0
    //   1: getfield a : Landroid/content/Context;
    //   4: astore_2
    //   5: aload_1
    //   6: getfield a : I
    //   9: ifeq -> 23
    //   12: aload_2
    //   13: astore_3
    //   14: aload_1
    //   15: getfield a : I
    //   18: bipush #108
    //   20: if_icmpne -> 190
    //   23: aload_2
    //   24: astore_3
    //   25: aload_0
    //   26: getfield r : Landroid/support/v7/widget/ab;
    //   29: ifnull -> 190
    //   32: new android/util/TypedValue
    //   35: dup
    //   36: invokespecial <init> : ()V
    //   39: astore #4
    //   41: aload_2
    //   42: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   45: astore #5
    //   47: aload #5
    //   49: getstatic android/support/v7/b/a$a.actionBarTheme : I
    //   52: aload #4
    //   54: iconst_1
    //   55: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   58: pop
    //   59: aconst_null
    //   60: astore_3
    //   61: aload #4
    //   63: getfield resourceId : I
    //   66: ifeq -> 107
    //   69: aload_2
    //   70: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   73: invokevirtual newTheme : ()Landroid/content/res/Resources$Theme;
    //   76: astore_3
    //   77: aload_3
    //   78: aload #5
    //   80: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   83: aload_3
    //   84: aload #4
    //   86: getfield resourceId : I
    //   89: iconst_1
    //   90: invokevirtual applyStyle : (IZ)V
    //   93: aload_3
    //   94: getstatic android/support/v7/b/a$a.actionBarWidgetTheme : I
    //   97: aload #4
    //   99: iconst_1
    //   100: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   103: pop
    //   104: goto -> 119
    //   107: aload #5
    //   109: getstatic android/support/v7/b/a$a.actionBarWidgetTheme : I
    //   112: aload #4
    //   114: iconst_1
    //   115: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   118: pop
    //   119: aload_3
    //   120: astore #6
    //   122: aload #4
    //   124: getfield resourceId : I
    //   127: ifeq -> 164
    //   130: aload_3
    //   131: astore #6
    //   133: aload_3
    //   134: ifnonnull -> 153
    //   137: aload_2
    //   138: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   141: invokevirtual newTheme : ()Landroid/content/res/Resources$Theme;
    //   144: astore #6
    //   146: aload #6
    //   148: aload #5
    //   150: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   153: aload #6
    //   155: aload #4
    //   157: getfield resourceId : I
    //   160: iconst_1
    //   161: invokevirtual applyStyle : (IZ)V
    //   164: aload_2
    //   165: astore_3
    //   166: aload #6
    //   168: ifnull -> 190
    //   171: new android/support/v7/view/d
    //   174: dup
    //   175: aload_2
    //   176: iconst_0
    //   177: invokespecial <init> : (Landroid/content/Context;I)V
    //   180: astore_3
    //   181: aload_3
    //   182: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   185: aload #6
    //   187: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   190: new android/support/v7/view/menu/f
    //   193: dup
    //   194: aload_3
    //   195: invokespecial <init> : (Landroid/content/Context;)V
    //   198: astore_3
    //   199: aload_3
    //   200: aload_0
    //   201: invokevirtual a : (Landroid/support/v7/view/menu/f$a;)V
    //   204: aload_1
    //   205: aload_3
    //   206: invokevirtual a : (Landroid/support/v7/view/menu/f;)V
    //   209: iconst_1
    //   210: ireturn }
  
  private boolean b(d paramd, KeyEvent paramKeyEvent) {
    int i;
    if (o())
      return false; 
    if (paramd.m)
      return true; 
    if (this.C != null && this.C != paramd)
      a(this.C, false); 
    Window.Callback callback = p();
    if (callback != null)
      paramd.i = callback.onCreatePanelView(paramd.a); 
    if (paramd.a == 0 || paramd.a == 108) {
      i = 1;
    } else {
      i = 0;
    } 
    if (i && this.r != null)
      this.r.i(); 
    if (paramd.i == null && (!i || !(l() instanceof n))) {
      boolean bool;
      if (paramd.j == null || paramd.r) {
        if (paramd.j == null && (!b(paramd) || paramd.j == null))
          return false; 
        if (i && this.r != null) {
          if (this.s == null)
            this.s = new a(this, null); 
          this.r.a(paramd.j, this.s);
        } 
        paramd.j.g();
        if (!callback.onCreatePanelMenu(paramd.a, paramd.j)) {
          paramd.a(null);
          if (i && this.r != null)
            this.r.a(null, this.s); 
          return false;
        } 
        paramd.r = false;
      } 
      paramd.j.g();
      if (paramd.s != null) {
        paramd.j.b(paramd.s);
        paramd.s = null;
      } 
      if (!callback.onPreparePanel(0, paramd.i, paramd.j)) {
        if (i && this.r != null)
          this.r.a(null, this.s); 
        paramd.j.h();
        return false;
      } 
      if (paramKeyEvent != null) {
        i = paramKeyEvent.getDeviceId();
      } else {
        i = -1;
      } 
      if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
        bool = true;
      } else {
        bool = false;
      } 
      paramd.p = bool;
      paramd.j.setQwertyMode(paramd.p);
      paramd.j.h();
    } 
    paramd.m = true;
    paramd.n = false;
    this.C = paramd;
    return true;
  }
  
  private boolean c(d paramd) {
    if (paramd.i != null) {
      paramd.h = paramd.i;
      return true;
    } 
    if (paramd.j == null)
      return false; 
    if (this.t == null)
      this.t = new e(this, null); 
    paramd.h = (View)paramd.a(this.t);
    return (paramd.h != null);
  }
  
  private void d(int paramInt) { a(a(paramInt, true), true); }
  
  private boolean d(int paramInt, KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getRepeatCount() == 0) {
      d d1 = a(paramInt, true);
      if (!d1.o)
        return b(d1, paramKeyEvent); 
    } 
    return false;
  }
  
  private void e(int paramInt) {
    this.F = 1 << paramInt | this.F;
    if (!this.E) {
      af.a(this.b.getDecorView(), this.G);
      this.E = true;
    } 
  }
  
  private boolean e(int paramInt, KeyEvent paramKeyEvent) { // Byte code:
    //   0: aload_0
    //   1: getfield m : Landroid/support/v7/view/b;
    //   4: ifnull -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_0
    //   10: iload_1
    //   11: iconst_1
    //   12: invokespecial a : (IZ)Landroid/support/v7/a/k$d;
    //   15: astore_3
    //   16: iload_1
    //   17: ifne -> 108
    //   20: aload_0
    //   21: getfield r : Landroid/support/v7/widget/ab;
    //   24: ifnull -> 108
    //   27: aload_0
    //   28: getfield r : Landroid/support/v7/widget/ab;
    //   31: invokeinterface d : ()Z
    //   36: ifeq -> 108
    //   39: aload_0
    //   40: getfield a : Landroid/content/Context;
    //   43: invokestatic get : (Landroid/content/Context;)Landroid/view/ViewConfiguration;
    //   46: invokestatic a : (Landroid/view/ViewConfiguration;)Z
    //   49: ifne -> 108
    //   52: aload_0
    //   53: getfield r : Landroid/support/v7/widget/ab;
    //   56: invokeinterface e : ()Z
    //   61: ifne -> 94
    //   64: aload_0
    //   65: invokevirtual o : ()Z
    //   68: ifne -> 175
    //   71: aload_0
    //   72: aload_3
    //   73: aload_2
    //   74: invokespecial b : (Landroid/support/v7/a/k$d;Landroid/view/KeyEvent;)Z
    //   77: ifeq -> 175
    //   80: aload_0
    //   81: getfield r : Landroid/support/v7/widget/ab;
    //   84: invokeinterface g : ()Z
    //   89: istore #4
    //   91: goto -> 193
    //   94: aload_0
    //   95: getfield r : Landroid/support/v7/widget/ab;
    //   98: invokeinterface h : ()Z
    //   103: istore #4
    //   105: goto -> 193
    //   108: aload_3
    //   109: getfield o : Z
    //   112: ifne -> 181
    //   115: aload_3
    //   116: getfield n : Z
    //   119: ifeq -> 125
    //   122: goto -> 181
    //   125: aload_3
    //   126: getfield m : Z
    //   129: ifeq -> 175
    //   132: aload_3
    //   133: getfield r : Z
    //   136: ifeq -> 155
    //   139: aload_3
    //   140: iconst_0
    //   141: putfield m : Z
    //   144: aload_0
    //   145: aload_3
    //   146: aload_2
    //   147: invokespecial b : (Landroid/support/v7/a/k$d;Landroid/view/KeyEvent;)Z
    //   150: istore #4
    //   152: goto -> 158
    //   155: iconst_1
    //   156: istore #4
    //   158: iload #4
    //   160: ifeq -> 175
    //   163: aload_0
    //   164: aload_3
    //   165: aload_2
    //   166: invokespecial a : (Landroid/support/v7/a/k$d;Landroid/view/KeyEvent;)V
    //   169: iconst_1
    //   170: istore #4
    //   172: goto -> 193
    //   175: iconst_0
    //   176: istore #4
    //   178: goto -> 193
    //   181: aload_3
    //   182: getfield o : Z
    //   185: istore #4
    //   187: aload_0
    //   188: aload_3
    //   189: iconst_1
    //   190: invokespecial a : (Landroid/support/v7/a/k$d;Z)V
    //   193: iload #4
    //   195: ifeq -> 234
    //   198: aload_0
    //   199: getfield a : Landroid/content/Context;
    //   202: ldc_w 'audio'
    //   205: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   208: checkcast android/media/AudioManager
    //   211: astore_2
    //   212: aload_2
    //   213: ifnull -> 224
    //   216: aload_2
    //   217: iconst_0
    //   218: invokevirtual playSoundEffect : (I)V
    //   221: iload #4
    //   223: ireturn
    //   224: ldc_w 'AppCompatDelegate'
    //   227: ldc_w 'Couldn't get audio manager'
    //   230: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   233: pop
    //   234: iload #4
    //   236: ireturn }
  
  private void f(int paramInt) {
    d d1 = a(paramInt, true);
    if (d1.j != null) {
      Bundle bundle = new Bundle();
      d1.j.a(bundle);
      if (bundle.size() > 0)
        d1.s = bundle; 
      d1.j.g();
      d1.j.clear();
    } 
    d1.r = true;
    d1.q = true;
    if ((paramInt == 108 || paramInt == 0) && this.r != null) {
      d1 = a(0, false);
      if (d1 != null) {
        d1.m = false;
        b(d1, null);
      } 
    } 
  }
  
  private int g(int paramInt) {
    boolean bool2;
    ActionBarContextView actionBarContextView = this.n;
    boolean bool1 = false;
    if (actionBarContextView != null && this.n.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
      int i;
      boolean bool3;
      byte b2;
      ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.n.getLayoutParams();
      boolean bool = this.n.isShown();
      byte b1 = 1;
      if (bool) {
        byte b3;
        if (this.I == null) {
          this.I = new Rect();
          this.J = new Rect();
        } 
        Rect rect1 = this.I;
        Rect rect2 = this.J;
        rect1.set(0, paramInt, 0, 0);
        au.a(this.v, rect1, rect2);
        if (rect2.top == 0) {
          b2 = paramInt;
        } else {
          b2 = 0;
        } 
        if (marginLayoutParams.topMargin != b2) {
          marginLayoutParams.topMargin = paramInt;
          if (this.x == null) {
            this.x = new View(this.a);
            this.x.setBackgroundColor(this.a.getResources().getColor(a.c.abc_input_method_navigation_guard));
            this.v.addView(this.x, -1, new ViewGroup.LayoutParams(-1, paramInt));
          } else {
            ViewGroup.LayoutParams layoutParams = this.x.getLayoutParams();
            if (layoutParams.height != paramInt) {
              layoutParams.height = paramInt;
              this.x.setLayoutParams(layoutParams);
            } 
          } 
          b3 = 1;
        } else {
          b3 = 0;
        } 
        if (this.x == null)
          b1 = 0; 
        bool3 = b3;
        b2 = b1;
        i = paramInt;
        if (!this.j) {
          bool3 = b3;
          b2 = b1;
          i = paramInt;
          if (b1 != 0) {
            i = 0;
            bool3 = b3;
            b2 = b1;
          } 
        } 
      } else {
        boolean bool4;
        if (marginLayoutParams.topMargin != 0) {
          marginLayoutParams.topMargin = 0;
          bool4 = true;
        } else {
          bool4 = false;
        } 
        b2 = 0;
        i = paramInt;
        bool3 = bool4;
      } 
      bool2 = b2;
      paramInt = i;
      if (bool3) {
        this.n.setLayoutParams(marginLayoutParams);
        bool2 = b2;
        paramInt = i;
      } 
    } else {
      bool2 = false;
    } 
    if (this.x != null) {
      byte b1;
      View view = this.x;
      if (bool2) {
        b1 = bool1;
      } else {
        b1 = 8;
      } 
      view.setVisibility(b1);
    } 
    return paramInt;
  }
  
  private int h(int paramInt) {
    if (paramInt == 8) {
      Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
      return 108;
    } 
    int i = paramInt;
    if (paramInt == 9) {
      Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
      i = 109;
    } 
    return i;
  }
  
  private void s() {
    if (!this.u) {
      this.v = t();
      CharSequence charSequence = q();
      if (!TextUtils.isEmpty(charSequence))
        b(charSequence); 
      u();
      a(this.v);
      this.u = true;
      d d1 = a(0, false);
      if (!o() && (d1 == null || d1.j == null))
        e(108); 
    } 
  }
  
  private ViewGroup t() {
    TypedArray typedArray = this.a.obtainStyledAttributes(a.k.AppCompatTheme);
    if (!typedArray.hasValue(a.k.AppCompatTheme_windowActionBar)) {
      typedArray.recycle();
      throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    } 
    if (typedArray.getBoolean(a.k.AppCompatTheme_windowNoTitle, false)) {
      c(1);
    } else if (typedArray.getBoolean(a.k.AppCompatTheme_windowActionBar, false)) {
      c(108);
    } 
    if (typedArray.getBoolean(a.k.AppCompatTheme_windowActionBarOverlay, false))
      c(109); 
    if (typedArray.getBoolean(a.k.AppCompatTheme_windowActionModeOverlay, false))
      c(10); 
    this.k = typedArray.getBoolean(a.k.AppCompatTheme_android_windowIsFloating, false);
    typedArray.recycle();
    this.b.getDecorView();
    StringBuilder stringBuilder = LayoutInflater.from(this.a);
    if (!this.l) {
      if (this.k) {
        ViewGroup viewGroup1 = (ViewGroup)stringBuilder.inflate(a.h.abc_dialog_title_material, null);
        this.i = false;
        this.h = false;
      } else if (this.h) {
        Context context = new TypedValue();
        this.a.getTheme().resolveAttribute(a.a.actionBarTheme, context, true);
        if (context.resourceId != 0) {
          d d1 = new d(this.a, context.resourceId);
        } else {
          context = this.a;
        } 
        ViewGroup viewGroup2 = (ViewGroup)LayoutInflater.from(context).inflate(a.h.abc_screen_toolbar, null);
        this.r = (ab)viewGroup2.findViewById(a.f.decor_content_parent);
        this.r.setWindowCallback(p());
        if (this.i)
          this.r.a(109); 
        if (this.y)
          this.r.a(2); 
        ViewGroup viewGroup1 = viewGroup2;
        if (this.z) {
          this.r.a(5);
          viewGroup1 = viewGroup2;
        } 
      } else {
        stringBuilder = null;
      } 
    } else {
      int i;
      if (this.j) {
        i = a.h.abc_screen_simple_overlay_action_mode;
      } else {
        i = a.h.abc_screen_simple;
      } 
      stringBuilder = (ViewGroup)stringBuilder.inflate(i, null);
      if (Build.VERSION.SDK_INT >= 21) {
        af.a(stringBuilder, new aa(this) {
              public bb a(View param1View, bb param1bb) {
                int i = param1bb.b();
                int j = k.c(this.a, i);
                bb bb1 = param1bb;
                if (i != j)
                  bb1 = param1bb.a(param1bb.a(), j, param1bb.c(), param1bb.d()); 
                return af.a(param1View, bb1);
              }
            });
      } else {
        ((ae)stringBuilder).setOnFitSystemWindowsListener(new ae.a(this) {
              public void a(Rect param1Rect) { param1Rect.top = k.c(this.a, param1Rect.top); }
            });
      } 
    } 
    if (stringBuilder == null) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("AppCompat does not support the current theme features: { windowActionBar: ");
      stringBuilder.append(this.h);
      stringBuilder.append(", windowActionBarOverlay: ");
      stringBuilder.append(this.i);
      stringBuilder.append(", android:windowIsFloating: ");
      stringBuilder.append(this.k);
      stringBuilder.append(", windowActionModeOverlay: ");
      stringBuilder.append(this.j);
      stringBuilder.append(", windowNoTitle: ");
      stringBuilder.append(this.l);
      stringBuilder.append(" }");
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    if (this.r == null)
      this.w = (TextView)stringBuilder.findViewById(a.f.title); 
    au.b(stringBuilder);
    ContentFrameLayout contentFrameLayout = (ContentFrameLayout)stringBuilder.findViewById(a.f.action_bar_activity_content);
    ViewGroup viewGroup = (ViewGroup)this.b.findViewById(16908290);
    if (viewGroup != null) {
      while (viewGroup.getChildCount() > 0) {
        View view = viewGroup.getChildAt(0);
        viewGroup.removeViewAt(0);
        contentFrameLayout.addView(view);
      } 
      viewGroup.setId(-1);
      contentFrameLayout.setId(16908290);
      if (viewGroup instanceof FrameLayout)
        ((FrameLayout)viewGroup).setForeground(null); 
    } 
    this.b.setContentView(stringBuilder);
    contentFrameLayout.setAttachListener(new ContentFrameLayout.a(this) {
          public void a() {}
          
          public void b() { k.b(this.a); }
        });
    return stringBuilder;
  }
  
  private void u() {
    ContentFrameLayout contentFrameLayout = (ContentFrameLayout)this.v.findViewById(16908290);
    View view = this.b.getDecorView();
    contentFrameLayout.a(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    TypedArray typedArray = this.a.obtainStyledAttributes(a.k.AppCompatTheme);
    typedArray.getValue(a.k.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
    typedArray.getValue(a.k.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
    if (typedArray.hasValue(a.k.AppCompatTheme_windowFixedWidthMajor))
      typedArray.getValue(a.k.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor()); 
    if (typedArray.hasValue(a.k.AppCompatTheme_windowFixedWidthMinor))
      typedArray.getValue(a.k.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor()); 
    if (typedArray.hasValue(a.k.AppCompatTheme_windowFixedHeightMajor))
      typedArray.getValue(a.k.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor()); 
    if (typedArray.hasValue(a.k.AppCompatTheme_windowFixedHeightMinor))
      typedArray.getValue(a.k.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor()); 
    typedArray.recycle();
    contentFrameLayout.requestLayout();
  }
  
  private void v() {
    if (this.q != null)
      this.q.b(); 
  }
  
  private void w() {
    if (this.u)
      throw new AndroidRuntimeException("Window feature must be requested before adding content"); 
  }
  
  private void x() {
    if (this.r != null)
      this.r.j(); 
    if (this.o != null) {
      this.b.getDecorView().removeCallbacks(this.p);
      if (this.o.isShowing())
        try {
          this.o.dismiss();
        } catch (IllegalArgumentException illegalArgumentException) {} 
      this.o = null;
    } 
    v();
    d d1 = a(0, false);
    if (d1 != null && d1.j != null)
      d1.j.close(); 
  }
  
  b a(b.a parama) { // Byte code:
    //   0: aload_0
    //   1: invokespecial v : ()V
    //   4: aload_0
    //   5: getfield m : Landroid/support/v7/view/b;
    //   8: ifnull -> 18
    //   11: aload_0
    //   12: getfield m : Landroid/support/v7/view/b;
    //   15: invokevirtual c : ()V
    //   18: new android/support/v7/a/k$b
    //   21: dup
    //   22: aload_0
    //   23: aload_1
    //   24: invokespecial <init> : (Landroid/support/v7/a/k;Landroid/support/v7/view/b$a;)V
    //   27: astore_2
    //   28: aload_0
    //   29: getfield e : Landroid/support/v7/a/e;
    //   32: ifnull -> 56
    //   35: aload_0
    //   36: invokevirtual o : ()Z
    //   39: ifne -> 56
    //   42: aload_0
    //   43: getfield e : Landroid/support/v7/a/e;
    //   46: aload_2
    //   47: invokeinterface a : (Landroid/support/v7/view/b$a;)Landroid/support/v7/view/b;
    //   52: astore_3
    //   53: goto -> 58
    //   56: aconst_null
    //   57: astore_3
    //   58: aload_3
    //   59: ifnull -> 70
    //   62: aload_0
    //   63: aload_3
    //   64: putfield m : Landroid/support/v7/view/b;
    //   67: goto -> 499
    //   70: aload_0
    //   71: getfield n : Landroid/support/v7/widget/ActionBarContextView;
    //   74: astore_3
    //   75: iconst_0
    //   76: istore #4
    //   78: aload_3
    //   79: ifnonnull -> 343
    //   82: aload_0
    //   83: getfield k : Z
    //   86: ifeq -> 303
    //   89: new android/util/TypedValue
    //   92: dup
    //   93: invokespecial <init> : ()V
    //   96: astore #5
    //   98: aload_0
    //   99: getfield a : Landroid/content/Context;
    //   102: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   105: astore_3
    //   106: aload_3
    //   107: getstatic android/support/v7/b/a$a.actionBarTheme : I
    //   110: aload #5
    //   112: iconst_1
    //   113: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   116: pop
    //   117: aload #5
    //   119: getfield resourceId : I
    //   122: ifeq -> 179
    //   125: aload_0
    //   126: getfield a : Landroid/content/Context;
    //   129: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   132: invokevirtual newTheme : ()Landroid/content/res/Resources$Theme;
    //   135: astore #6
    //   137: aload #6
    //   139: aload_3
    //   140: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   143: aload #6
    //   145: aload #5
    //   147: getfield resourceId : I
    //   150: iconst_1
    //   151: invokevirtual applyStyle : (IZ)V
    //   154: new android/support/v7/view/d
    //   157: dup
    //   158: aload_0
    //   159: getfield a : Landroid/content/Context;
    //   162: iconst_0
    //   163: invokespecial <init> : (Landroid/content/Context;I)V
    //   166: astore_3
    //   167: aload_3
    //   168: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   171: aload #6
    //   173: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   176: goto -> 184
    //   179: aload_0
    //   180: getfield a : Landroid/content/Context;
    //   183: astore_3
    //   184: aload_0
    //   185: new android/support/v7/widget/ActionBarContextView
    //   188: dup
    //   189: aload_3
    //   190: invokespecial <init> : (Landroid/content/Context;)V
    //   193: putfield n : Landroid/support/v7/widget/ActionBarContextView;
    //   196: aload_0
    //   197: new android/widget/PopupWindow
    //   200: dup
    //   201: aload_3
    //   202: aconst_null
    //   203: getstatic android/support/v7/b/a$a.actionModePopupWindowStyle : I
    //   206: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   209: putfield o : Landroid/widget/PopupWindow;
    //   212: aload_0
    //   213: getfield o : Landroid/widget/PopupWindow;
    //   216: iconst_2
    //   217: invokestatic a : (Landroid/widget/PopupWindow;I)V
    //   220: aload_0
    //   221: getfield o : Landroid/widget/PopupWindow;
    //   224: aload_0
    //   225: getfield n : Landroid/support/v7/widget/ActionBarContextView;
    //   228: invokevirtual setContentView : (Landroid/view/View;)V
    //   231: aload_0
    //   232: getfield o : Landroid/widget/PopupWindow;
    //   235: iconst_m1
    //   236: invokevirtual setWidth : (I)V
    //   239: aload_3
    //   240: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   243: getstatic android/support/v7/b/a$a.actionBarSize : I
    //   246: aload #5
    //   248: iconst_1
    //   249: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   252: pop
    //   253: aload #5
    //   255: getfield data : I
    //   258: aload_3
    //   259: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   262: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   265: invokestatic complexToDimensionPixelSize : (ILandroid/util/DisplayMetrics;)I
    //   268: istore #7
    //   270: aload_0
    //   271: getfield n : Landroid/support/v7/widget/ActionBarContextView;
    //   274: iload #7
    //   276: invokevirtual setContentHeight : (I)V
    //   279: aload_0
    //   280: getfield o : Landroid/widget/PopupWindow;
    //   283: bipush #-2
    //   285: invokevirtual setHeight : (I)V
    //   288: aload_0
    //   289: new android/support/v7/a/k$5
    //   292: dup
    //   293: aload_0
    //   294: invokespecial <init> : (Landroid/support/v7/a/k;)V
    //   297: putfield p : Ljava/lang/Runnable;
    //   300: goto -> 343
    //   303: aload_0
    //   304: getfield v : Landroid/view/ViewGroup;
    //   307: getstatic android/support/v7/b/a$f.action_mode_bar_stub : I
    //   310: invokevirtual findViewById : (I)Landroid/view/View;
    //   313: checkcast android/support/v7/widget/ViewStubCompat
    //   316: astore_3
    //   317: aload_3
    //   318: ifnull -> 343
    //   321: aload_3
    //   322: aload_0
    //   323: invokevirtual m : ()Landroid/content/Context;
    //   326: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   329: invokevirtual setLayoutInflater : (Landroid/view/LayoutInflater;)V
    //   332: aload_0
    //   333: aload_3
    //   334: invokevirtual a : ()Landroid/view/View;
    //   337: checkcast android/support/v7/widget/ActionBarContextView
    //   340: putfield n : Landroid/support/v7/widget/ActionBarContextView;
    //   343: aload_0
    //   344: getfield n : Landroid/support/v7/widget/ActionBarContextView;
    //   347: ifnull -> 499
    //   350: aload_0
    //   351: invokespecial v : ()V
    //   354: aload_0
    //   355: getfield n : Landroid/support/v7/widget/ActionBarContextView;
    //   358: invokevirtual c : ()V
    //   361: aload_0
    //   362: getfield n : Landroid/support/v7/widget/ActionBarContextView;
    //   365: invokevirtual getContext : ()Landroid/content/Context;
    //   368: astore_3
    //   369: aload_0
    //   370: getfield n : Landroid/support/v7/widget/ActionBarContextView;
    //   373: astore #5
    //   375: aload_0
    //   376: getfield o : Landroid/widget/PopupWindow;
    //   379: ifnonnull -> 385
    //   382: iconst_1
    //   383: istore #4
    //   385: new android/support/v7/view/e
    //   388: dup
    //   389: aload_3
    //   390: aload #5
    //   392: aload_2
    //   393: iload #4
    //   395: invokespecial <init> : (Landroid/content/Context;Landroid/support/v7/widget/ActionBarContextView;Landroid/support/v7/view/b$a;Z)V
    //   398: astore_3
    //   399: aload_1
    //   400: aload_3
    //   401: aload_3
    //   402: invokevirtual b : ()Landroid/view/Menu;
    //   405: invokeinterface a : (Landroid/support/v7/view/b;Landroid/view/Menu;)Z
    //   410: ifeq -> 494
    //   413: aload_3
    //   414: invokevirtual d : ()V
    //   417: aload_0
    //   418: getfield n : Landroid/support/v7/widget/ActionBarContextView;
    //   421: aload_3
    //   422: invokevirtual a : (Landroid/support/v7/view/b;)V
    //   425: aload_0
    //   426: aload_3
    //   427: putfield m : Landroid/support/v7/view/b;
    //   430: aload_0
    //   431: getfield n : Landroid/support/v7/widget/ActionBarContextView;
    //   434: fconst_0
    //   435: invokestatic b : (Landroid/view/View;F)V
    //   438: aload_0
    //   439: aload_0
    //   440: getfield n : Landroid/support/v7/widget/ActionBarContextView;
    //   443: invokestatic i : (Landroid/view/View;)Landroid/support/v4/h/au;
    //   446: fconst_1
    //   447: invokevirtual a : (F)Landroid/support/v4/h/au;
    //   450: putfield q : Landroid/support/v4/h/au;
    //   453: aload_0
    //   454: getfield q : Landroid/support/v4/h/au;
    //   457: new android/support/v7/a/k$6
    //   460: dup
    //   461: aload_0
    //   462: invokespecial <init> : (Landroid/support/v7/a/k;)V
    //   465: invokevirtual a : (Landroid/support/v4/h/ay;)Landroid/support/v4/h/au;
    //   468: pop
    //   469: aload_0
    //   470: getfield o : Landroid/widget/PopupWindow;
    //   473: ifnull -> 499
    //   476: aload_0
    //   477: getfield b : Landroid/view/Window;
    //   480: invokevirtual getDecorView : ()Landroid/view/View;
    //   483: aload_0
    //   484: getfield p : Ljava/lang/Runnable;
    //   487: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   490: pop
    //   491: goto -> 499
    //   494: aload_0
    //   495: aconst_null
    //   496: putfield m : Landroid/support/v7/view/b;
    //   499: aload_0
    //   500: getfield m : Landroid/support/v7/view/b;
    //   503: ifnull -> 526
    //   506: aload_0
    //   507: getfield e : Landroid/support/v7/a/e;
    //   510: ifnull -> 526
    //   513: aload_0
    //   514: getfield e : Landroid/support/v7/a/e;
    //   517: aload_0
    //   518: getfield m : Landroid/support/v7/view/b;
    //   521: invokeinterface a : (Landroid/support/v7/view/b;)V
    //   526: aload_0
    //   527: getfield m : Landroid/support/v7/view/b;
    //   530: areturn
    //   531: astore_3
    //   532: goto -> 56
    // Exception table:
    //   from	to	target	type
    //   42	53	531	java/lang/AbstractMethodError }
  
  public View a(int paramInt) {
    s();
    return this.b.findViewById(paramInt);
  }
  
  public final View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    View view = b(paramView, paramString, paramContext, paramAttributeSet);
    return (view != null) ? view : c(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  void a(int paramInt, Menu paramMenu) {
    if (paramInt == 108) {
      a a1 = a();
      if (a1 != null) {
        a1.e(false);
        return;
      } 
    } else if (paramInt == 0) {
      d d1 = a(paramInt, true);
      if (d1.o)
        a(d1, false); 
    } 
  }
  
  public void a(Configuration paramConfiguration) {
    if (this.h && this.u) {
      a a1 = a();
      if (a1 != null)
        a1.a(paramConfiguration); 
    } 
    h();
  }
  
  public void a(Bundle paramBundle) {
    if (this.c instanceof Activity && x.b((Activity)this.c) != null) {
      a a1 = l();
      if (a1 == null) {
        this.H = true;
        return;
      } 
      a1.c(true);
    } 
  }
  
  public void a(f paramf) { a(paramf, true); }
  
  public void a(View paramView) {
    s();
    ViewGroup viewGroup = (ViewGroup)this.v.findViewById(16908290);
    viewGroup.removeAllViews();
    viewGroup.addView(paramView);
    this.c.onContentChanged();
  }
  
  public void a(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    s();
    ViewGroup viewGroup = (ViewGroup)this.v.findViewById(16908290);
    viewGroup.removeAllViews();
    viewGroup.addView(paramView, paramLayoutParams);
    this.c.onContentChanged();
  }
  
  void a(ViewGroup paramViewGroup) {}
  
  boolean a(int paramInt, KeyEvent paramKeyEvent) {
    a a1 = a();
    if (a1 != null && a1.a(paramInt, paramKeyEvent))
      return true; 
    if (this.C != null && a(this.C, paramKeyEvent.getKeyCode(), paramKeyEvent, 1)) {
      if (this.C != null)
        this.C.n = true; 
      return true;
    } 
    if (this.C == null) {
      d d1 = a(0, true);
      b(d1, paramKeyEvent);
      boolean bool = a(d1, paramKeyEvent.getKeyCode(), paramKeyEvent, 1);
      d1.m = false;
      if (bool)
        return true; 
    } 
    return false;
  }
  
  public boolean a(f paramf, MenuItem paramMenuItem) {
    Window.Callback callback = p();
    if (callback != null && !o()) {
      d d1 = a(paramf.p());
      if (d1 != null)
        return callback.onMenuItemSelected(d1.a, paramMenuItem); 
    } 
    return false;
  }
  
  boolean a(KeyEvent paramKeyEvent) {
    int i = paramKeyEvent.getKeyCode();
    boolean bool = true;
    if (i == 82 && this.c.dispatchKeyEvent(paramKeyEvent))
      return true; 
    i = paramKeyEvent.getKeyCode();
    if (paramKeyEvent.getAction() != 0)
      bool = false; 
    return bool ? c(i, paramKeyEvent) : b(i, paramKeyEvent);
  }
  
  public b b(b.a parama) {
    if (parama == null)
      throw new IllegalArgumentException("ActionMode callback can not be null."); 
    if (this.m != null)
      this.m.c(); 
    b b1 = new b(this, parama);
    a a1 = a();
    if (a1 != null) {
      this.m = a1.a(b1);
      if (this.m != null && this.e != null)
        this.e.a(this.m); 
    } 
    if (this.m == null)
      this.m = a(b1); 
    return this.m;
  }
  
  View b(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    if (this.c instanceof LayoutInflater.Factory) {
      paramView = ((LayoutInflater.Factory)this.c).onCreateView(paramString, paramContext, paramAttributeSet);
      if (paramView != null)
        return paramView; 
    } 
    return null;
  }
  
  public void b(int paramInt) {
    s();
    ViewGroup viewGroup = (ViewGroup)this.v.findViewById(16908290);
    viewGroup.removeAllViews();
    LayoutInflater.from(this.a).inflate(paramInt, viewGroup);
    this.c.onContentChanged();
  }
  
  public void b(Bundle paramBundle) { s(); }
  
  public void b(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    s();
    ((ViewGroup)this.v.findViewById(16908290)).addView(paramView, paramLayoutParams);
    this.c.onContentChanged();
  }
  
  void b(CharSequence paramCharSequence) {
    if (this.r != null) {
      this.r.setWindowTitle(paramCharSequence);
      return;
    } 
    if (l() != null) {
      l().a(paramCharSequence);
      return;
    } 
    if (this.w != null)
      this.w.setText(paramCharSequence); 
  }
  
  boolean b(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt != 4) {
      if (paramInt != 82)
        return false; 
      e(0, paramKeyEvent);
      return true;
    } 
    boolean bool = this.D;
    this.D = false;
    d d1 = a(0, false);
    if (d1 != null && d1.o) {
      if (!bool)
        a(d1, true); 
      return true;
    } 
    return r();
  }
  
  boolean b(int paramInt, Menu paramMenu) {
    if (paramInt == 108) {
      a a1 = a();
      if (a1 != null)
        a1.e(true); 
      return true;
    } 
    return false;
  }
  
  public View c(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    boolean bool2;
    boolean bool1;
    if (Build.VERSION.SDK_INT < 21) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (this.K == null)
      this.K = new m(); 
    if (bool1 && a((ViewParent)paramView)) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    return this.K.a(paramView, paramString, paramContext, paramAttributeSet, bool2, bool1, true, at.a());
  }
  
  public void c() {
    a a1 = a();
    if (a1 != null)
      a1.d(false); 
  }
  
  public boolean c(int paramInt) {
    paramInt = h(paramInt);
    if (this.l && paramInt == 108)
      return false; 
    if (this.h && paramInt == 1)
      this.h = false; 
    switch (paramInt) {
      default:
        return this.b.requestFeature(paramInt);
      case 109:
        w();
        this.i = true;
        return true;
      case 108:
        w();
        this.h = true;
        return true;
      case 10:
        w();
        this.j = true;
        return true;
      case 5:
        w();
        this.z = true;
        return true;
      case 2:
        w();
        this.y = true;
        return true;
      case 1:
        break;
    } 
    w();
    this.l = true;
    return true;
  }
  
  boolean c(int paramInt, KeyEvent paramKeyEvent) {
    boolean bool = true;
    if (paramInt != 4) {
      if (paramInt == 82) {
        d(0, paramKeyEvent);
        return true;
      } 
    } else {
      if ((paramKeyEvent.getFlags() & 0x80) == 0)
        bool = false; 
      this.D = bool;
    } 
    if (Build.VERSION.SDK_INT < 11)
      a(paramInt, paramKeyEvent); 
    return false;
  }
  
  public void d() {
    a a1 = a();
    if (a1 != null)
      a1.d(true); 
  }
  
  public void e() {
    a a1 = a();
    if (a1 != null && a1.e())
      return; 
    e(0);
  }
  
  public void f() {
    super.f();
    if (this.f != null)
      this.f.h(); 
  }
  
  public void g() {
    LayoutInflater layoutInflater = LayoutInflater.from(this.a);
    if (layoutInflater.getFactory() == null) {
      i.a(layoutInflater, this);
      return;
    } 
    if (!(i.a(layoutInflater) instanceof k))
      Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's"); 
  }
  
  public void k() { // Byte code:
    //   0: aload_0
    //   1: invokespecial s : ()V
    //   4: aload_0
    //   5: getfield h : Z
    //   8: ifeq -> 102
    //   11: aload_0
    //   12: getfield f : Landroid/support/v7/a/a;
    //   15: ifnull -> 19
    //   18: return
    //   19: aload_0
    //   20: getfield c : Landroid/view/Window$Callback;
    //   23: instanceof android/app/Activity
    //   26: ifeq -> 56
    //   29: new android/support/v7/a/q
    //   32: dup
    //   33: aload_0
    //   34: getfield c : Landroid/view/Window$Callback;
    //   37: checkcast android/app/Activity
    //   40: aload_0
    //   41: getfield i : Z
    //   44: invokespecial <init> : (Landroid/app/Activity;Z)V
    //   47: astore_1
    //   48: aload_0
    //   49: aload_1
    //   50: putfield f : Landroid/support/v7/a/a;
    //   53: goto -> 84
    //   56: aload_0
    //   57: getfield c : Landroid/view/Window$Callback;
    //   60: instanceof android/app/Dialog
    //   63: ifeq -> 84
    //   66: new android/support/v7/a/q
    //   69: dup
    //   70: aload_0
    //   71: getfield c : Landroid/view/Window$Callback;
    //   74: checkcast android/app/Dialog
    //   77: invokespecial <init> : (Landroid/app/Dialog;)V
    //   80: astore_1
    //   81: goto -> 48
    //   84: aload_0
    //   85: getfield f : Landroid/support/v7/a/a;
    //   88: ifnull -> 102
    //   91: aload_0
    //   92: getfield f : Landroid/support/v7/a/a;
    //   95: aload_0
    //   96: getfield H : Z
    //   99: invokevirtual c : (Z)V
    //   102: return }
  
  boolean r() {
    if (this.m != null) {
      this.m.c();
      return true;
    } 
    a a1 = a();
    return (a1 != null && a1.f());
  }
  
  private final class a implements l.a {
    private a(k this$0) {}
    
    public void a(f param1f, boolean param1Boolean) { k.a(this.a, param1f); }
    
    public boolean a(f param1f) {
      Window.Callback callback = this.a.p();
      if (callback != null)
        callback.onMenuOpened(108, param1f); 
      return true;
    }
  }
  
  class b implements b.a {
    private b.a b;
    
    public b(k this$0, b.a param1a) { this.b = param1a; }
    
    public void a(b param1b) {
      this.b.a(param1b);
      if (this.a.o != null)
        this.a.b.getDecorView().removeCallbacks(this.a.p); 
      if (this.a.n != null) {
        k.c(this.a);
        this.a.q = af.i(this.a.n).a(0.0F);
        this.a.q.a(new az(this) {
              public void b(View param2View) {
                this.a.a.n.setVisibility(8);
                if (this.a.a.o != null) {
                  this.a.a.o.dismiss();
                } else if (this.a.a.n.getParent() instanceof View) {
                  af.k((View)this.a.a.n.getParent());
                } 
                this.a.a.n.removeAllViews();
                this.a.a.q.a(null);
                this.a.a.q = null;
              }
            });
      } 
      if (this.a.e != null)
        this.a.e.b(this.a.m); 
      this.a.m = null;
    }
    
    public boolean a(b param1b, Menu param1Menu) { return this.b.a(param1b, param1Menu); }
    
    public boolean a(b param1b, MenuItem param1MenuItem) { return this.b.a(param1b, param1MenuItem); }
    
    public boolean b(b param1b, Menu param1Menu) { return this.b.b(param1b, param1Menu); }
  }
  
  class null extends az {
    null(k this$0) {}
    
    public void b(View param1View) {
      this.a.a.n.setVisibility(8);
      if (this.a.a.o != null) {
        this.a.a.o.dismiss();
      } else if (this.a.a.n.getParent() instanceof View) {
        af.k((View)this.a.a.n.getParent());
      } 
      this.a.a.n.removeAllViews();
      this.a.a.q.a(null);
      this.a.a.q = null;
    }
  }
  
  private class c extends ContentFrameLayout {
    public c(k this$0, Context param1Context) { super(param1Context); }
    
    private boolean a(int param1Int1, int param1Int2) { return (param1Int1 < -5 || param1Int2 < -5 || param1Int1 > getWidth() + 5 || param1Int2 > getHeight() + 5); }
    
    public boolean dispatchKeyEvent(KeyEvent param1KeyEvent) { return (this.a.a(param1KeyEvent) || super.dispatchKeyEvent(param1KeyEvent)); }
    
    public boolean onInterceptTouchEvent(MotionEvent param1MotionEvent) {
      if (param1MotionEvent.getAction() == 0 && a((int)param1MotionEvent.getX(), (int)param1MotionEvent.getY())) {
        k.d(this.a, 0);
        return true;
      } 
      return super.onInterceptTouchEvent(param1MotionEvent);
    }
    
    public void setBackgroundResource(int param1Int) { setBackgroundDrawable(l.a().a(getContext(), param1Int)); }
  }
  
  private static final class d {
    int a;
    
    int b;
    
    int c;
    
    int d;
    
    int e;
    
    int f;
    
    ViewGroup g;
    
    View h;
    
    View i;
    
    f j;
    
    e k;
    
    Context l;
    
    boolean m;
    
    boolean n;
    
    boolean o;
    
    public boolean p;
    
    boolean q;
    
    boolean r;
    
    Bundle s;
    
    d(int param1Int) {
      this.a = param1Int;
      this.q = false;
    }
    
    m a(l.a param1a) {
      if (this.j == null)
        return null; 
      if (this.k == null) {
        this.k = new e(this.l, a.h.abc_list_menu_item_layout);
        this.k.a(param1a);
        this.j.a(this.k);
      } 
      return this.k.a(this.g);
    }
    
    void a(Context param1Context) {
      int i1;
      TypedValue typedValue = new TypedValue();
      Resources.Theme theme = param1Context.getResources().newTheme();
      theme.setTo(param1Context.getTheme());
      theme.resolveAttribute(a.a.actionBarPopupTheme, typedValue, true);
      if (typedValue.resourceId != 0)
        theme.applyStyle(typedValue.resourceId, true); 
      theme.resolveAttribute(a.a.panelMenuListTheme, typedValue, true);
      if (typedValue.resourceId != 0) {
        i1 = typedValue.resourceId;
      } else {
        i1 = a.j.Theme_AppCompat_CompactMenu;
      } 
      theme.applyStyle(i1, true);
      d d1 = new d(param1Context, 0);
      d1.getTheme().setTo(theme);
      this.l = d1;
      TypedArray typedArray = d1.obtainStyledAttributes(a.k.AppCompatTheme);
      this.b = typedArray.getResourceId(a.k.AppCompatTheme_panelBackground, 0);
      this.f = typedArray.getResourceId(a.k.AppCompatTheme_android_windowAnimationStyle, 0);
      typedArray.recycle();
    }
    
    void a(f param1f) {
      if (param1f == this.j)
        return; 
      if (this.j != null)
        this.j.b(this.k); 
      this.j = param1f;
      if (param1f != null && this.k != null)
        param1f.a(this.k); 
    }
    
    public boolean a() {
      View view = this.h;
      boolean bool = false;
      if (view == null)
        return false; 
      if (this.i != null)
        return true; 
      if (this.k.a().getCount() > 0)
        bool = true; 
      return bool;
    }
  }
  
  private final class e implements l.a {
    private e(k this$0) {}
    
    public void a(f param1f, boolean param1Boolean) {
      boolean bool;
      f f1 = param1f.p();
      if (f1 != param1f) {
        bool = true;
      } else {
        bool = false;
      } 
      k k1 = this.a;
      if (bool)
        param1f = f1; 
      k.d d = k.a(k1, param1f);
      if (d != null) {
        if (bool) {
          k.a(this.a, d.a, d, f1);
          k.a(this.a, d, true);
          return;
        } 
        k.a(this.a, d, param1Boolean);
      } 
    }
    
    public boolean a(f param1f) {
      if (param1f == null && this.a.h) {
        Window.Callback callback = this.a.p();
        if (callback != null && !this.a.o())
          callback.onMenuOpened(108, param1f); 
      } 
      return true;
    }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */