package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.c.a.a;
import android.support.v4.h.d;
import android.support.v7.b.a;
import android.support.v7.e.a;
import android.support.v7.view.a;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.b;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.k;
import android.support.v7.view.menu.l;
import android.support.v7.view.menu.m;
import android.support.v7.view.menu.p;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

class d extends b implements d.a {
  private b A;
  
  final f g = new f(this, null);
  
  int h;
  
  private d i;
  
  private Drawable j;
  
  private boolean k;
  
  private boolean l;
  
  private boolean m;
  
  private int n;
  
  private int o;
  
  private int p;
  
  private boolean q;
  
  private boolean r;
  
  private boolean s;
  
  private boolean t;
  
  private int u;
  
  private final SparseBooleanArray v = new SparseBooleanArray();
  
  private View w;
  
  private e x;
  
  private a y;
  
  private c z;
  
  public d(Context paramContext) { super(paramContext, a.h.abc_action_menu_layout, a.h.abc_action_menu_item_layout); }
  
  private View a(MenuItem paramMenuItem) {
    ViewGroup viewGroup = (ViewGroup)this.f;
    if (viewGroup == null)
      return null; 
    int i1 = viewGroup.getChildCount();
    for (byte b1 = 0; b1 < i1; b1++) {
      View view = viewGroup.getChildAt(b1);
      if (view instanceof m.a && ((m.a)view).getItemData() == paramMenuItem)
        return view; 
    } 
    return null;
  }
  
  public m a(ViewGroup paramViewGroup) {
    m m1 = super.a(paramViewGroup);
    ((ActionMenuView)m1).setPresenter(this);
    return m1;
  }
  
  public View a(h paramh, View paramView, ViewGroup paramViewGroup) {
    byte b1;
    View view = paramh.getActionView();
    if (view == null || paramh.n())
      view = super.a(paramh, paramView, paramViewGroup); 
    if (paramh.isActionViewExpanded()) {
      b1 = 8;
    } else {
      b1 = 0;
    } 
    view.setVisibility(b1);
    ActionMenuView actionMenuView = (ActionMenuView)paramViewGroup;
    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
    if (!actionMenuView.checkLayoutParams(layoutParams))
      view.setLayoutParams(actionMenuView.a(layoutParams)); 
    return view;
  }
  
  public void a(Context paramContext, f paramf) {
    super.a(paramContext, paramf);
    Resources resources = paramContext.getResources();
    a a1 = a.a(paramContext);
    if (!this.m)
      this.l = a1.b(); 
    if (!this.s)
      this.n = a1.c(); 
    if (!this.q)
      this.p = a1.a(); 
    int i1 = this.n;
    if (this.l) {
      if (this.i == null) {
        this.i = new d(this, this.a);
        if (this.k) {
          this.i.setImageDrawable(this.j);
          this.j = null;
          this.k = false;
        } 
        int i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.i.measure(i2, i2);
      } 
      i1 -= this.i.getMeasuredWidth();
    } else {
      this.i = null;
    } 
    this.o = i1;
    this.u = (int)((resources.getDisplayMetrics()).density * 56.0F);
    this.w = null;
  }
  
  public void a(Configuration paramConfiguration) {
    if (!this.q)
      this.p = this.b.getResources().getInteger(a.g.abc_max_action_buttons); 
    if (this.c != null)
      this.c.b(true); 
  }
  
  public void a(Drawable paramDrawable) {
    if (this.i != null) {
      this.i.setImageDrawable(paramDrawable);
      return;
    } 
    this.k = true;
    this.j = paramDrawable;
  }
  
  public void a(f paramf, boolean paramBoolean) {
    f();
    super.a(paramf, paramBoolean);
  }
  
  public void a(h paramh, m.a parama) {
    parama.a(paramh, 0);
    ActionMenuView actionMenuView = (ActionMenuView)this.f;
    ActionMenuItemView actionMenuItemView = (ActionMenuItemView)parama;
    actionMenuItemView.setItemInvoker(actionMenuView);
    if (this.A == null)
      this.A = new b(this, null); 
    actionMenuItemView.setPopupCallback(this.A);
  }
  
  public void a(ActionMenuView paramActionMenuView) {
    this.f = paramActionMenuView;
    paramActionMenuView.a(this.c);
  }
  
  public void a(boolean paramBoolean) {
    if (paramBoolean) {
      super.a(null);
      return;
    } 
    this.c.a(false);
  }
  
  public boolean a(int paramInt, h paramh) { return paramh.j(); }
  
  public boolean a(p paramp) {
    if (!paramp.hasVisibleItems())
      return false; 
    p p1;
    for (p1 = paramp; p1.s() != this.c; p1 = (p)p1.s());
    View view = a(p1.getItem());
    d d1 = view;
    if (view == null) {
      if (this.i == null)
        return false; 
      d1 = this.i;
    } 
    this.h = paramp.getItem().getItemId();
    this.y = new a(this, this.b, paramp);
    this.y.a(d1);
    this.y.a();
    super.a(paramp);
    return true;
  }
  
  public boolean a(ViewGroup paramViewGroup, int paramInt) { return (paramViewGroup.getChildAt(paramInt) == this.i) ? false : super.a(paramViewGroup, paramInt); }
  
  public void b(boolean paramBoolean) {
    ViewGroup viewGroup = (ViewGroup)((View)this.f).getParent();
    if (viewGroup != null)
      a.a(viewGroup); 
    super.b(paramBoolean);
    ((View)this.f).requestLayout();
    f f1 = this.c;
    byte b1 = 0;
    if (f1 != null) {
      ArrayList arrayList = this.c.k();
      int i1 = arrayList.size();
      for (byte b3 = 0; b3 < i1; b3++) {
        d d1 = ((h)arrayList.get(b3)).a();
        if (d1 != null)
          d1.a(this); 
      } 
    } 
    if (this.c != null) {
      ArrayList arrayList = this.c.l();
    } else {
      f1 = null;
    } 
    byte b2 = b1;
    if (this.l) {
      b2 = b1;
      if (f1 != null) {
        int i1 = f1.size();
        if (i1 == 1) {
          boolean bool = ((h)f1.get(0)).isActionViewExpanded() ^ true;
        } else {
          b2 = b1;
          if (i1 > 0)
            b2 = 1; 
        } 
      } 
    } 
    if (b2 != 0) {
      if (this.i == null)
        this.i = new d(this, this.a); 
      ViewGroup viewGroup1 = (ViewGroup)this.i.getParent();
      if (viewGroup1 != this.f) {
        if (viewGroup1 != null)
          viewGroup1.removeView(this.i); 
        viewGroup1 = (ActionMenuView)this.f;
        viewGroup1.addView(this.i, viewGroup1.c());
      } 
    } else if (this.i != null && this.i.getParent() == this.f) {
      ((ViewGroup)this.f).removeView(this.i);
    } 
    ((ActionMenuView)this.f).setOverflowReserved(this.l);
  }
  
  public boolean b() { // Byte code:
    //   0: aload_0
    //   1: astore_1
    //   2: aload_1
    //   3: getfield c : Landroid/support/v7/view/menu/f;
    //   6: invokevirtual i : ()Ljava/util/ArrayList;
    //   9: astore_2
    //   10: aload_2
    //   11: invokevirtual size : ()I
    //   14: istore_3
    //   15: aload_1
    //   16: getfield p : I
    //   19: istore #4
    //   21: aload_1
    //   22: getfield o : I
    //   25: istore #5
    //   27: iconst_0
    //   28: iconst_0
    //   29: invokestatic makeMeasureSpec : (II)I
    //   32: istore #6
    //   34: aload_1
    //   35: getfield f : Landroid/support/v7/view/menu/m;
    //   38: checkcast android/view/ViewGroup
    //   41: astore #7
    //   43: iconst_0
    //   44: istore #8
    //   46: iconst_0
    //   47: istore #9
    //   49: iconst_0
    //   50: istore #10
    //   52: iconst_0
    //   53: istore #11
    //   55: iload #8
    //   57: iload_3
    //   58: if_icmpge -> 139
    //   61: aload_2
    //   62: iload #8
    //   64: invokevirtual get : (I)Ljava/lang/Object;
    //   67: checkcast android/support/v7/view/menu/h
    //   70: astore #12
    //   72: aload #12
    //   74: invokevirtual l : ()Z
    //   77: ifeq -> 86
    //   80: iinc #9, 1
    //   83: goto -> 103
    //   86: aload #12
    //   88: invokevirtual k : ()Z
    //   91: ifeq -> 100
    //   94: iinc #11, 1
    //   97: goto -> 103
    //   100: iconst_1
    //   101: istore #10
    //   103: iload #4
    //   105: istore #13
    //   107: aload_1
    //   108: getfield t : Z
    //   111: ifeq -> 129
    //   114: iload #4
    //   116: istore #13
    //   118: aload #12
    //   120: invokevirtual isActionViewExpanded : ()Z
    //   123: ifeq -> 129
    //   126: iconst_0
    //   127: istore #13
    //   129: iinc #8, 1
    //   132: iload #13
    //   134: istore #4
    //   136: goto -> 55
    //   139: iload #4
    //   141: istore #8
    //   143: aload_1
    //   144: getfield l : Z
    //   147: ifeq -> 175
    //   150: iload #10
    //   152: ifne -> 169
    //   155: iload #4
    //   157: istore #8
    //   159: iload #11
    //   161: iload #9
    //   163: iadd
    //   164: iload #4
    //   166: if_icmple -> 175
    //   169: iload #4
    //   171: iconst_1
    //   172: isub
    //   173: istore #8
    //   175: iload #8
    //   177: iload #9
    //   179: isub
    //   180: istore #4
    //   182: aload_1
    //   183: getfield v : Landroid/util/SparseBooleanArray;
    //   186: astore #12
    //   188: aload #12
    //   190: invokevirtual clear : ()V
    //   193: aload_1
    //   194: getfield r : Z
    //   197: ifeq -> 237
    //   200: iload #5
    //   202: aload_1
    //   203: getfield u : I
    //   206: idiv
    //   207: istore #10
    //   209: aload_1
    //   210: getfield u : I
    //   213: istore #11
    //   215: aload_1
    //   216: getfield u : I
    //   219: istore #9
    //   221: iload #5
    //   223: iload #11
    //   225: irem
    //   226: iload #10
    //   228: idiv
    //   229: iload #9
    //   231: iadd
    //   232: istore #13
    //   234: goto -> 243
    //   237: iconst_0
    //   238: istore #10
    //   240: iconst_0
    //   241: istore #13
    //   243: iload #5
    //   245: istore #9
    //   247: iconst_0
    //   248: istore #5
    //   250: iconst_0
    //   251: istore #11
    //   253: aload_0
    //   254: astore_1
    //   255: iload #5
    //   257: iload_3
    //   258: if_icmpge -> 774
    //   261: aload_2
    //   262: iload #5
    //   264: invokevirtual get : (I)Ljava/lang/Object;
    //   267: checkcast android/support/v7/view/menu/h
    //   270: astore #14
    //   272: aload #14
    //   274: invokevirtual l : ()Z
    //   277: ifeq -> 410
    //   280: aload_1
    //   281: aload #14
    //   283: aload_1
    //   284: getfield w : Landroid/view/View;
    //   287: aload #7
    //   289: invokevirtual a : (Landroid/support/v7/view/menu/h;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    //   292: astore #15
    //   294: aload_1
    //   295: getfield w : Landroid/view/View;
    //   298: ifnonnull -> 307
    //   301: aload_1
    //   302: aload #15
    //   304: putfield w : Landroid/view/View;
    //   307: aload_1
    //   308: getfield r : Z
    //   311: ifeq -> 334
    //   314: iload #10
    //   316: aload #15
    //   318: iload #13
    //   320: iload #10
    //   322: iload #6
    //   324: iconst_0
    //   325: invokestatic a : (Landroid/view/View;IIII)I
    //   328: isub
    //   329: istore #10
    //   331: goto -> 343
    //   334: aload #15
    //   336: iload #6
    //   338: iload #6
    //   340: invokevirtual measure : (II)V
    //   343: aload #15
    //   345: invokevirtual getMeasuredWidth : ()I
    //   348: istore #16
    //   350: iload #9
    //   352: iload #16
    //   354: isub
    //   355: istore #8
    //   357: iload #11
    //   359: istore #9
    //   361: iload #11
    //   363: ifne -> 370
    //   366: iload #16
    //   368: istore #9
    //   370: aload #14
    //   372: invokevirtual getGroupId : ()I
    //   375: istore #11
    //   377: iload #11
    //   379: ifeq -> 393
    //   382: aload #12
    //   384: iload #11
    //   386: iconst_1
    //   387: invokevirtual put : (IZ)V
    //   390: goto -> 393
    //   393: aload #14
    //   395: iconst_1
    //   396: invokevirtual d : (Z)V
    //   399: iload #9
    //   401: istore #11
    //   403: iload #8
    //   405: istore #9
    //   407: goto -> 768
    //   410: aload #14
    //   412: invokevirtual k : ()Z
    //   415: ifeq -> 762
    //   418: aload #14
    //   420: invokevirtual getGroupId : ()I
    //   423: istore #17
    //   425: aload #12
    //   427: iload #17
    //   429: invokevirtual get : (I)Z
    //   432: istore #18
    //   434: iload #4
    //   436: ifgt -> 444
    //   439: iload #18
    //   441: ifeq -> 467
    //   444: iload #9
    //   446: ifle -> 467
    //   449: aload_1
    //   450: getfield r : Z
    //   453: ifeq -> 461
    //   456: iload #10
    //   458: ifle -> 467
    //   461: iconst_1
    //   462: istore #19
    //   464: goto -> 470
    //   467: iconst_0
    //   468: istore #19
    //   470: iload #19
    //   472: ifeq -> 626
    //   475: aload_1
    //   476: aload #14
    //   478: aload_1
    //   479: getfield w : Landroid/view/View;
    //   482: aload #7
    //   484: invokevirtual a : (Landroid/support/v7/view/menu/h;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    //   487: astore #15
    //   489: aload_1
    //   490: getfield w : Landroid/view/View;
    //   493: ifnonnull -> 502
    //   496: aload_1
    //   497: aload #15
    //   499: putfield w : Landroid/view/View;
    //   502: aload_1
    //   503: getfield r : Z
    //   506: ifeq -> 544
    //   509: aload #15
    //   511: iload #13
    //   513: iload #10
    //   515: iload #6
    //   517: iconst_0
    //   518: invokestatic a : (Landroid/view/View;IIII)I
    //   521: istore #8
    //   523: iload #10
    //   525: iload #8
    //   527: isub
    //   528: istore #10
    //   530: iload #8
    //   532: ifne -> 541
    //   535: iconst_0
    //   536: istore #19
    //   538: goto -> 541
    //   541: goto -> 553
    //   544: aload #15
    //   546: iload #6
    //   548: iload #6
    //   550: invokevirtual measure : (II)V
    //   553: aload #15
    //   555: invokevirtual getMeasuredWidth : ()I
    //   558: istore #16
    //   560: iload #9
    //   562: iload #16
    //   564: isub
    //   565: istore #9
    //   567: iload #11
    //   569: istore #8
    //   571: iload #11
    //   573: ifne -> 580
    //   576: iload #16
    //   578: istore #8
    //   580: aload_1
    //   581: getfield r : Z
    //   584: ifeq -> 615
    //   587: iload #9
    //   589: iflt -> 598
    //   592: iconst_1
    //   593: istore #11
    //   595: goto -> 601
    //   598: iconst_0
    //   599: istore #11
    //   601: iload #19
    //   603: iload #11
    //   605: iand
    //   606: istore #19
    //   608: iload #8
    //   610: istore #11
    //   612: goto -> 626
    //   615: iload #9
    //   617: iload #8
    //   619: iadd
    //   620: ifle -> 598
    //   623: goto -> 592
    //   626: iload #19
    //   628: ifeq -> 651
    //   631: iload #17
    //   633: ifeq -> 651
    //   636: aload #12
    //   638: iload #17
    //   640: iconst_1
    //   641: invokevirtual put : (IZ)V
    //   644: iload #4
    //   646: istore #8
    //   648: goto -> 737
    //   651: iload #4
    //   653: istore #8
    //   655: iload #18
    //   657: ifeq -> 737
    //   660: aload #12
    //   662: iload #17
    //   664: iconst_0
    //   665: invokevirtual put : (IZ)V
    //   668: iconst_0
    //   669: istore #16
    //   671: iload #4
    //   673: istore #8
    //   675: iload #16
    //   677: iload #5
    //   679: if_icmpge -> 737
    //   682: aload_2
    //   683: iload #16
    //   685: invokevirtual get : (I)Ljava/lang/Object;
    //   688: checkcast android/support/v7/view/menu/h
    //   691: astore_1
    //   692: iload #4
    //   694: istore #8
    //   696: aload_1
    //   697: invokevirtual getGroupId : ()I
    //   700: iload #17
    //   702: if_icmpne -> 727
    //   705: iload #4
    //   707: istore #8
    //   709: aload_1
    //   710: invokevirtual j : ()Z
    //   713: ifeq -> 722
    //   716: iload #4
    //   718: iconst_1
    //   719: iadd
    //   720: istore #8
    //   722: aload_1
    //   723: iconst_0
    //   724: invokevirtual d : (Z)V
    //   727: iinc #16, 1
    //   730: iload #8
    //   732: istore #4
    //   734: goto -> 671
    //   737: iload #8
    //   739: istore #4
    //   741: iload #19
    //   743: ifeq -> 752
    //   746: iload #8
    //   748: iconst_1
    //   749: isub
    //   750: istore #4
    //   752: aload #14
    //   754: iload #19
    //   756: invokevirtual d : (Z)V
    //   759: goto -> 407
    //   762: aload #14
    //   764: iconst_0
    //   765: invokevirtual d : (Z)V
    //   768: iinc #5, 1
    //   771: goto -> 253
    //   774: iconst_1
    //   775: ireturn }
  
  public Drawable c() { return (this.i != null) ? this.i.getDrawable() : (this.k ? this.j : null); }
  
  public void c(boolean paramBoolean) {
    this.l = paramBoolean;
    this.m = true;
  }
  
  public void d(boolean paramBoolean) { this.t = paramBoolean; }
  
  public boolean d() {
    if (this.l && !h() && this.c != null && this.f != null && this.z == null && !this.c.l().isEmpty()) {
      this.z = new c(this, new e(this, this.b, this.c, this.i, true));
      ((View)this.f).post(this.z);
      super.a(null);
      return true;
    } 
    return false;
  }
  
  public boolean e() {
    if (this.z != null && this.f != null) {
      ((View)this.f).removeCallbacks(this.z);
      this.z = null;
      return true;
    } 
    e e1 = this.x;
    if (e1 != null) {
      e1.e();
      return true;
    } 
    return false;
  }
  
  public boolean f() { return e() | g(); }
  
  public boolean g() {
    if (this.y != null) {
      this.y.e();
      return true;
    } 
    return false;
  }
  
  public boolean h() { return (this.x != null && this.x.f()); }
  
  public boolean i() { return (this.z != null || h()); }
  
  private class a extends k {
    private p d;
    
    public a(d this$0, Context param1Context, p param1p) {
      super(param1Context, param1p, null, false, a.a.actionOverflowMenuStyle);
      this.d = param1p;
      if (!((h)param1p.getItem()).j()) {
        d.d d1;
        if (d.e(this$0) == null) {
          d1 = (View)d.f(this$0);
        } else {
          d1 = d.e(this$0);
        } 
        a(d1);
      } 
      a(this$0.g);
      int i = param1p.size();
      boolean bool = false;
      byte b = 0;
      while (true) {
        bool1 = bool;
        if (b < i) {
          MenuItem menuItem = param1p.getItem(b);
          if (menuItem.isVisible() && menuItem.getIcon() != null) {
            bool1 = true;
            break;
          } 
          b++;
          continue;
        } 
        break;
      } 
      a(bool1);
    }
    
    public void onDismiss() {
      super.onDismiss();
      d.a(this.c, null);
      this.c.h = 0;
    }
  }
  
  private class b extends ActionMenuItemView.b {
    private b(d this$0) {}
    
    public ag a() { return (d.i(this.a) != null) ? d.i(this.a).c() : null; }
  }
  
  private class c implements Runnable {
    private d.e b;
    
    public c(d this$0, d.e param1e) { this.b = param1e; }
    
    public void run() {
      d.g(this.a).f();
      View view = (View)d.h(this.a);
      if (view != null && view.getWindowToken() != null && this.b.d())
        d.a(this.a, this.b); 
      d.a(this.a, null);
    }
  }
  
  private class d extends p implements ActionMenuView.a {
    private final float[] b = new float[2];
    
    public d(d this$0, Context param1Context) {
      super(param1Context, null, a.a.actionOverflowButtonStyle);
      setClickable(true);
      setFocusable(true);
      setVisibility(0);
      setEnabled(true);
      setOnTouchListener(new ag.b(this, this, this$0) {
            public ag a() { return (d.a(this.b.a) == null) ? null : d.a(this.b.a).c(); }
            
            public boolean b() {
              this.b.a.d();
              return true;
            }
            
            public boolean c() {
              if (d.b(this.b.a) != null)
                return false; 
              this.b.a.e();
              return true;
            }
          });
    }
    
    public boolean c() { return false; }
    
    public boolean d() { return false; }
    
    public boolean performClick() {
      if (super.performClick())
        return true; 
      playSoundEffect(0);
      this.a.d();
      return true;
    }
    
    protected boolean setFrame(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      boolean bool = super.setFrame(param1Int1, param1Int2, param1Int3, param1Int4);
      Drawable drawable1 = getDrawable();
      Drawable drawable2 = getBackground();
      if (drawable1 != null && drawable2 != null) {
        int i = getWidth();
        param1Int2 = getHeight();
        param1Int1 = Math.max(i, param1Int2) / 2;
        int j = getPaddingLeft();
        int k = getPaddingRight();
        param1Int4 = getPaddingTop();
        param1Int3 = getPaddingBottom();
        i = (i + j - k) / 2;
        param1Int2 = (param1Int2 + param1Int4 - param1Int3) / 2;
        a.a(drawable2, i - param1Int1, param1Int2 - param1Int1, i + param1Int1, param1Int2 + param1Int1);
      } 
      return bool;
    }
  }
  
  class null extends ag.b {
    null(d this$0, View param1View, d param1d) { super(param1View); }
    
    public ag a() { return (d.a(this.b.a) == null) ? null : d.a(this.b.a).c(); }
    
    public boolean b() {
      this.b.a.d();
      return true;
    }
    
    public boolean c() {
      if (d.b(this.b.a) != null)
        return false; 
      this.b.a.e();
      return true;
    }
  }
  
  private class e extends k {
    public e(d this$0, Context param1Context, f param1f, View param1View, boolean param1Boolean) {
      super(param1Context, param1f, param1View, param1Boolean, a.a.actionOverflowMenuStyle);
      a(8388613);
      a(this$0.g);
    }
    
    public void onDismiss() {
      super.onDismiss();
      if (d.c(this.c) != null)
        d.d(this.c).close(); 
      d.a(this.c, null);
    }
  }
  
  private class f implements l.a {
    private f(d this$0) {}
    
    public void a(f param1f, boolean param1Boolean) {
      if (param1f instanceof p)
        ((p)param1f).p().a(false); 
      l.a a1 = this.a.a();
      if (a1 != null)
        a1.a(param1f, param1Boolean); 
    }
    
    public boolean a(f param1f) {
      boolean bool = false;
      if (param1f == null)
        return false; 
      this.a.h = ((p)param1f).getItem().getItemId();
      l.a a1 = this.a.a();
      if (a1 != null)
        bool = a1.a(param1f); 
      return bool;
    }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */