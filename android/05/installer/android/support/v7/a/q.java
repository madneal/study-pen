package android.support.v7.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v4.h.af;
import android.support.v4.h.au;
import android.support.v4.h.ay;
import android.support.v4.h.az;
import android.support.v4.h.ba;
import android.support.v7.b.a;
import android.support.v7.view.a;
import android.support.v7.view.b;
import android.support.v7.view.g;
import android.support.v7.view.h;
import android.support.v7.view.menu.f;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ac;
import android.support.v7.widget.ak;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class q extends a implements ActionBarOverlayLayout.a {
  private static final Interpolator i;
  
  private static final Interpolator j;
  
  private static final boolean k;
  
  private boolean A;
  
  private int B = 0;
  
  private boolean C = true;
  
  private boolean D;
  
  private boolean E;
  
  private boolean F;
  
  private boolean G = true;
  
  private h H;
  
  private boolean I;
  
  a a;
  
  b b;
  
  b.a c;
  
  boolean d;
  
  final ay e = new az(this) {
      public void b(View param1View) {
        if (q.a(this.a) && q.b(this.a) != null) {
          af.a(q.b(this.a), 0.0F);
          af.a(q.c(this.a), 0.0F);
        } 
        q.c(this.a).setVisibility(8);
        q.c(this.a).setTransitioning(false);
        q.a(this.a, null);
        this.a.i();
        if (q.d(this.a) != null)
          af.k(q.d(this.a)); 
      }
    };
  
  final ay f = new az(this) {
      public void b(View param1View) {
        q.a(this.a, null);
        q.c(this.a).requestLayout();
      }
    };
  
  final ba g = new ba(this) {
      public void a(View param1View) { ((View)q.c(this.a).getParent()).invalidate(); }
    };
  
  private Context l;
  
  private Context m;
  
  private Activity n;
  
  private Dialog o;
  
  private ActionBarOverlayLayout p;
  
  private ActionBarContainer q;
  
  private ac r;
  
  private ActionBarContextView s;
  
  private View t;
  
  private ak u;
  
  private ArrayList<Object> v = new ArrayList();
  
  private int w = -1;
  
  private boolean x;
  
  private boolean y;
  
  private ArrayList<a.b> z = new ArrayList();
  
  static  {
    boolean bool;
    i = new AccelerateInterpolator();
    j = new DecelerateInterpolator();
    if (Build.VERSION.SDK_INT >= 14) {
      bool = true;
    } else {
      bool = false;
    } 
    k = bool;
  }
  
  public q(Activity paramActivity, boolean paramBoolean) {
    this.n = paramActivity;
    View view = paramActivity.getWindow().getDecorView();
    a(view);
    if (!paramBoolean)
      this.t = view.findViewById(16908290); 
  }
  
  public q(Dialog paramDialog) {
    this.o = paramDialog;
    a(paramDialog.getWindow().getDecorView());
  }
  
  private void a(View paramView) {
    boolean bool;
    this.p = (ActionBarOverlayLayout)paramView.findViewById(a.f.decor_content_parent);
    if (this.p != null)
      this.p.setActionBarVisibilityCallback(this); 
    this.r = b(paramView.findViewById(a.f.action_bar));
    this.s = (ActionBarContextView)paramView.findViewById(a.f.action_context_bar);
    this.q = (ActionBarContainer)paramView.findViewById(a.f.action_bar_container);
    if (this.r == null || this.s == null || this.q == null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(getClass().getSimpleName());
      stringBuilder.append(" can only be used ");
      stringBuilder.append("with a compatible window decor layout");
      throw new IllegalStateException(stringBuilder.toString());
    } 
    this.l = this.r.b();
    if ((this.r.o() & 0x4) != 0) {
      i1 = 1;
    } else {
      i1 = 0;
    } 
    if (i1)
      this.x = true; 
    a a1 = a.a(this.l);
    if (a1.f() || i1) {
      bool = true;
    } else {
      bool = false;
    } 
    a(bool);
    k(a1.d());
    TypedArray typedArray = this.l.obtainStyledAttributes(null, a.k.ActionBar, a.a.actionBarStyle, 0);
    if (typedArray.getBoolean(a.k.ActionBar_hideOnContentScroll, false))
      b(true); 
    int i1 = typedArray.getDimensionPixelSize(a.k.ActionBar_elevation, 0);
    if (i1 != 0)
      a(i1); 
    typedArray.recycle();
  }
  
  private ac b(View paramView) {
    String str;
    if (paramView instanceof ac)
      return (ac)paramView; 
    if (paramView instanceof Toolbar)
      return ((Toolbar)paramView).getWrapper(); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Can't make a decor toolbar out of ");
    stringBuilder.append(paramView);
    if (stringBuilder.toString() != null) {
      str = paramView.getClass().getSimpleName();
    } else {
      str = "null";
    } 
    throw new IllegalStateException(str);
  }
  
  private static boolean b(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) { return paramBoolean3 ? true : (!(paramBoolean1 || paramBoolean2)); }
  
  private void k(boolean paramBoolean) {
    this.A = paramBoolean;
    if (!this.A) {
      this.r.a(null);
      this.q.setTabContainer(this.u);
    } else {
      this.q.setTabContainer(null);
      this.r.a(this.u);
    } 
    int i1 = j();
    boolean bool = true;
    if (i1 == 2) {
      i1 = 1;
    } else {
      i1 = 0;
    } 
    if (this.u != null)
      if (i1 != 0) {
        this.u.setVisibility(0);
        if (this.p != null)
          af.k(this.p); 
      } else {
        this.u.setVisibility(8);
      }  
    ac ac1 = this.r;
    if (!this.A && i1 != 0) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    ac1.a(paramBoolean);
    ActionBarOverlayLayout actionBarOverlayLayout = this.p;
    if (!this.A && i1 != 0) {
      paramBoolean = bool;
    } else {
      paramBoolean = false;
    } 
    actionBarOverlayLayout.setHasNonEmbeddedTabs(paramBoolean);
  }
  
  private void l(boolean paramBoolean) {
    if (b(this.D, this.E, this.F)) {
      if (!this.G) {
        this.G = true;
        h(paramBoolean);
        return;
      } 
    } else if (this.G) {
      this.G = false;
      i(paramBoolean);
    } 
  }
  
  private void p() {
    if (!this.F) {
      this.F = true;
      if (this.p != null)
        this.p.setShowingForActionMode(true); 
      l(false);
    } 
  }
  
  private void q() {
    if (this.F) {
      this.F = false;
      if (this.p != null)
        this.p.setShowingForActionMode(false); 
      l(false);
    } 
  }
  
  public int a() { return this.r.o(); }
  
  public b a(b.a parama) {
    if (this.a != null)
      this.a.c(); 
    this.p.setHideOnContentScrollEnabled(false);
    this.s.c();
    a a1 = new a(this, this.s.getContext(), parama);
    if (a1.e()) {
      a1.d();
      this.s.a(a1);
      j(true);
      this.s.sendAccessibilityEvent(32);
      this.a = a1;
      return a1;
    } 
    return null;
  }
  
  public void a(float paramFloat) { af.c(this.q, paramFloat); }
  
  public void a(int paramInt) { this.B = paramInt; }
  
  public void a(int paramInt1, int paramInt2) {
    int i1 = this.r.o();
    if ((paramInt2 & 0x4) != 0)
      this.x = true; 
    this.r.c(paramInt1 & paramInt2 | (paramInt2 ^ 0xFFFFFFFF) & i1);
  }
  
  public void a(Configuration paramConfiguration) { k(a.a(this.l).d()); }
  
  public void a(CharSequence paramCharSequence) { this.r.a(paramCharSequence); }
  
  public void a(boolean paramBoolean) { this.r.b(paramBoolean); }
  
  public void b(boolean paramBoolean) {
    if (paramBoolean && !this.p.a())
      throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"); 
    this.d = paramBoolean;
    this.p.setHideOnContentScrollEnabled(paramBoolean);
  }
  
  public boolean b() {
    int i1 = k();
    return (this.G && (i1 == 0 || d() < i1));
  }
  
  public Context c() {
    if (this.m == null) {
      TypedValue typedValue = new TypedValue();
      this.l.getTheme().resolveAttribute(a.a.actionBarWidgetTheme, typedValue, true);
      int i1 = typedValue.resourceId;
      if (i1 != 0) {
        this.m = new ContextThemeWrapper(this.l, i1);
      } else {
        this.m = this.l;
      } 
    } 
    return this.m;
  }
  
  public void c(boolean paramBoolean) {
    if (!this.x)
      f(paramBoolean); 
  }
  
  public int d() { return this.p.getActionBarHideOffset(); }
  
  public void d(boolean paramBoolean) {
    this.I = paramBoolean;
    if (!paramBoolean && this.H != null)
      this.H.b(); 
  }
  
  public void e(boolean paramBoolean) {
    if (paramBoolean == this.y)
      return; 
    this.y = paramBoolean;
    int i1 = this.z.size();
    for (byte b1 = 0; b1 < i1; b1++)
      ((a.b)this.z.get(b1)).a(paramBoolean); 
  }
  
  public void f(boolean paramBoolean) {
    byte b1;
    if (paramBoolean) {
      b1 = 4;
    } else {
      b1 = 0;
    } 
    a(b1, 4);
  }
  
  public boolean f() {
    if (this.r != null && this.r.c()) {
      this.r.d();
      return true;
    } 
    return false;
  }
  
  public void g(boolean paramBoolean) { this.C = paramBoolean; }
  
  public boolean g() {
    ViewGroup viewGroup = this.r.a();
    if (viewGroup != null && !viewGroup.hasFocus()) {
      viewGroup.requestFocus();
      return true;
    } 
    return false;
  }
  
  public void h(boolean paramBoolean) {
    if (this.H != null)
      this.H.b(); 
    this.q.setVisibility(0);
    if (this.B == 0 && k && (this.I || paramBoolean)) {
      af.a(this.q, 0.0F);
      float f1 = -this.q.getHeight();
      float f2 = f1;
      if (paramBoolean) {
        int[] arrayOfInt = new int[2];
        arrayOfInt[0] = 0;
        arrayOfInt[1] = 0;
        arrayOfInt;
        this.q.getLocationInWindow(arrayOfInt);
        f2 = f1 - arrayOfInt[1];
      } 
      af.a(this.q, f2);
      h h1 = new h();
      au au = af.i(this.q).b(0.0F);
      au.a(this.g);
      h1.a(au);
      if (this.C && this.t != null) {
        af.a(this.t, f2);
        h1.a(af.i(this.t).b(0.0F));
      } 
      h1.a(j);
      h1.a(250L);
      h1.a(this.f);
      this.H = h1;
      h1.a();
    } else {
      af.b(this.q, 1.0F);
      af.a(this.q, 0.0F);
      if (this.C && this.t != null)
        af.a(this.t, 0.0F); 
      this.f.b(null);
    } 
    if (this.p != null)
      af.k(this.p); 
  }
  
  void i() {
    if (this.c != null) {
      this.c.a(this.b);
      this.b = null;
      this.c = null;
    } 
  }
  
  public void i(boolean paramBoolean) {
    if (this.H != null)
      this.H.b(); 
    if (this.B == 0 && k && (this.I || paramBoolean)) {
      af.b(this.q, 1.0F);
      this.q.setTransitioning(true);
      h h1 = new h();
      float f1 = -this.q.getHeight();
      float f2 = f1;
      if (paramBoolean) {
        int[] arrayOfInt = new int[2];
        arrayOfInt[0] = 0;
        arrayOfInt[1] = 0;
        arrayOfInt;
        this.q.getLocationInWindow(arrayOfInt);
        f2 = f1 - arrayOfInt[1];
      } 
      au au = af.i(this.q).b(f2);
      au.a(this.g);
      h1.a(au);
      if (this.C && this.t != null)
        h1.a(af.i(this.t).b(f2)); 
      h1.a(i);
      h1.a(250L);
      h1.a(this.e);
      this.H = h1;
      h1.a();
      return;
    } 
    this.e.b(null);
  }
  
  public int j() { return this.r.p(); }
  
  public void j(boolean paramBoolean) {
    au au2;
    au au1;
    if (paramBoolean) {
      p();
    } else {
      q();
    } 
    if (paramBoolean) {
      au1 = this.r.a(4, 100L);
      au2 = this.s.a(0, 200L);
    } else {
      au2 = this.r.a(0, 200L);
      au1 = this.s.a(8, 100L);
    } 
    h h1 = new h();
    h1.a(au1, au2);
    h1.a();
  }
  
  public int k() { return this.q.getHeight(); }
  
  public void l() {
    if (this.E) {
      this.E = false;
      l(true);
    } 
  }
  
  public void m() {
    if (!this.E) {
      this.E = true;
      l(true);
    } 
  }
  
  public void n() {
    if (this.H != null) {
      this.H.b();
      this.H = null;
    } 
  }
  
  public void o() {}
  
  public class a extends b implements f.a {
    private final Context b;
    
    private final f c;
    
    private b.a d;
    
    private WeakReference<View> e;
    
    public a(q this$0, Context param1Context, b.a param1a) {
      this.b = param1Context;
      this.d = param1a;
      this.c = (new f(param1Context)).a(1);
      this.c.a(this);
    }
    
    public MenuInflater a() { return new g(this.b); }
    
    public void a(int param1Int) { b(q.i(this.a).getResources().getString(param1Int)); }
    
    public void a(f param1f) {
      if (this.d == null)
        return; 
      d();
      q.g(this.a).a();
    }
    
    public void a(View param1View) {
      q.g(this.a).setCustomView(param1View);
      this.e = new WeakReference(param1View);
    }
    
    public void a(CharSequence param1CharSequence) { q.g(this.a).setSubtitle(param1CharSequence); }
    
    public void a(boolean param1Boolean) {
      super.a(param1Boolean);
      q.g(this.a).setTitleOptional(param1Boolean);
    }
    
    public boolean a(f param1f, MenuItem param1MenuItem) { return (this.d != null) ? this.d.a(this, param1MenuItem) : 0; }
    
    public Menu b() { return this.c; }
    
    public void b(int param1Int) { a(q.i(this.a).getResources().getString(param1Int)); }
    
    public void b(CharSequence param1CharSequence) { q.g(this.a).setTitle(param1CharSequence); }
    
    public void c() {
      if (this.a.a != this)
        return; 
      if (!q.a(q.e(this.a), q.f(this.a), false)) {
        this.a.b = this;
        this.a.c = this.d;
      } else {
        this.d.a(this);
      } 
      this.d = null;
      this.a.j(false);
      q.g(this.a).b();
      q.h(this.a).a().sendAccessibilityEvent(32);
      q.d(this.a).setHideOnContentScrollEnabled(this.a.d);
      this.a.a = null;
    }
    
    public void d() {
      if (this.a.a != this)
        return; 
      this.c.g();
      try {
        this.d.b(this, this.c);
        return;
      } finally {
        this.c.h();
      } 
    }
    
    public boolean e() {
      this.c.g();
      try {
        return this.d.a(this, this.c);
      } finally {
        this.c.h();
      } 
    }
    
    public CharSequence f() { return q.g(this.a).getTitle(); }
    
    public CharSequence g() { return q.g(this.a).getSubtitle(); }
    
    public boolean h() { return q.g(this.a).d(); }
    
    public View i() { return (this.e != null) ? (View)this.e.get() : null; }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/a/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */