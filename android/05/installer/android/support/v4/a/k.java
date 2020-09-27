package android.support.v4.a;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.g.c;
import android.support.v4.g.h;
import android.support.v4.h.i;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class k implements ComponentCallbacks, View.OnCreateContextMenuListener {
  private static final h<String, Class<?>> Z = new h();
  
  static final Object a = new Object();
  
  boolean A;
  
  boolean B;
  
  boolean C;
  
  boolean D;
  
  boolean E = true;
  
  boolean F;
  
  int G;
  
  ViewGroup H;
  
  View I;
  
  View J;
  
  boolean K;
  
  boolean L = true;
  
  w M;
  
  boolean N;
  
  boolean O;
  
  Object P = null;
  
  Object Q = a;
  
  Object R = null;
  
  Object S = a;
  
  Object T = null;
  
  Object U = a;
  
  Boolean V;
  
  Boolean W;
  
  aa X = null;
  
  aa Y = null;
  
  int b = 0;
  
  View c;
  
  int d;
  
  Bundle e;
  
  SparseArray<Parcelable> f;
  
  int g = -1;
  
  String h;
  
  Bundle i;
  
  k j;
  
  int k = -1;
  
  int l;
  
  boolean m;
  
  boolean n;
  
  boolean o;
  
  boolean p;
  
  boolean q;
  
  int r;
  
  q s;
  
  o t;
  
  q u;
  
  k v;
  
  int w;
  
  int x;
  
  String y;
  
  boolean z;
  
  public static k a(Context paramContext, String paramString) { return a(paramContext, paramString, null); }
  
  public static k a(Context paramContext, String paramString, Bundle paramBundle) {
    try {
      Class clazz1 = (Class)Z.get(paramString);
      Class clazz2 = clazz1;
      if (clazz1 == null) {
        clazz2 = paramContext.getClassLoader().loadClass(paramString);
        Z.put(paramString, clazz2);
      } 
      k k1 = (k)clazz2.newInstance();
      if (paramBundle != null) {
        paramBundle.setClassLoader(k1.getClass().getClassLoader());
        k1.i = paramBundle;
      } 
      return k1;
    } catch (ClassNotFoundException paramContext) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": make sure class name exists, is public, and has an");
      stringBuilder.append(" empty constructor that is public");
      throw new a(stringBuilder.toString(), paramContext);
    } catch (InstantiationException paramBundle) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": make sure class name exists, is public, and has an");
      stringBuilder.append(" empty constructor that is public");
      throw new a(stringBuilder.toString(), paramBundle);
    } catch (IllegalAccessException paramBundle) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": make sure class name exists, is public, and has an");
      stringBuilder.append(" empty constructor that is public");
      throw new a(stringBuilder.toString(), paramBundle);
    } 
  }
  
  static boolean b(Context paramContext, String paramString) {
    try {
      Class clazz1 = (Class)Z.get(paramString);
      Class clazz2 = clazz1;
      if (clazz1 == null) {
        clazz2 = paramContext.getClassLoader().loadClass(paramString);
        Z.put(paramString, clazz2);
      } 
      return k.class.isAssignableFrom(clazz2);
    } catch (ClassNotFoundException paramContext) {
      return false;
    } 
  }
  
  void A() {
    if (this.u != null) {
      this.u.h();
      this.u.d();
    } 
    this.b = 5;
    this.F = false;
    i();
    if (!this.F) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Fragment ");
      stringBuilder.append(this);
      stringBuilder.append(" did not call through to super.onResume()");
      throw new ab(stringBuilder.toString());
    } 
    if (this.u != null) {
      this.u.l();
      this.u.d();
    } 
  }
  
  void B() {
    onLowMemory();
    if (this.u != null)
      this.u.r(); 
  }
  
  void C() {
    if (this.u != null)
      this.u.m(); 
    this.b = 4;
    this.F = false;
    j();
    if (!this.F) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Fragment ");
      stringBuilder.append(this);
      stringBuilder.append(" did not call through to super.onPause()");
      throw new ab(stringBuilder.toString());
    } 
  }
  
  void D() {
    if (this.u != null)
      this.u.n(); 
    this.b = 3;
    this.F = false;
    k();
    if (!this.F) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Fragment ");
      stringBuilder.append(this);
      stringBuilder.append(" did not call through to super.onStop()");
      throw new ab(stringBuilder.toString());
    } 
  }
  
  void E() {
    if (this.u != null)
      this.u.o(); 
    this.b = 2;
    if (this.N) {
      this.N = false;
      if (!this.O) {
        this.O = true;
        this.M = this.t.a(this.h, this.N, false);
      } 
      if (this.M != null) {
        if (this.t.j()) {
          this.M.d();
          return;
        } 
        this.M.c();
      } 
    } 
  }
  
  void F() {
    if (this.u != null)
      this.u.p(); 
    this.b = 1;
    this.F = false;
    l();
    if (!this.F) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Fragment ");
      stringBuilder.append(this);
      stringBuilder.append(" did not call through to super.onDestroyView()");
      throw new ab(stringBuilder.toString());
    } 
    if (this.M != null)
      this.M.f(); 
  }
  
  void G() {
    if (this.u != null)
      this.u.q(); 
    this.b = 0;
    this.F = false;
    m();
    if (!this.F) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Fragment ");
      stringBuilder.append(this);
      stringBuilder.append(" did not call through to super.onDestroy()");
      throw new ab(stringBuilder.toString());
    } 
  }
  
  k a(String paramString) { return paramString.equals(this.h) ? this : ((this.u != null) ? this.u.b(paramString) : null); }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) { return null; }
  
  public Animation a(int paramInt1, boolean paramBoolean, int paramInt2) { return null; }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  final void a(int paramInt, k paramk) {
    StringBuilder stringBuilder;
    String str;
    this.g = paramInt;
    if (paramk != null) {
      stringBuilder = new StringBuilder();
      stringBuilder.append(paramk.h);
      str = ":";
    } else {
      stringBuilder = new StringBuilder();
      str = "android:fragment:";
    } 
    stringBuilder.append(str);
    stringBuilder.append(this.g);
    this.h = stringBuilder.toString();
  }
  
  public void a(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt) {}
  
  @Deprecated
  public void a(Activity paramActivity) { this.F = true; }
  
  @Deprecated
  public void a(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle) { this.F = true; }
  
  public void a(Context paramContext) {
    Activity activity;
    this.F = true;
    if (this.t == null) {
      paramContext = null;
    } else {
      activity = this.t.f();
    } 
    if (activity != null) {
      this.F = false;
      a(activity);
    } 
  }
  
  public void a(Context paramContext, AttributeSet paramAttributeSet, Bundle paramBundle) {
    Activity activity;
    this.F = true;
    if (this.t == null) {
      paramContext = null;
    } else {
      activity = this.t.f();
    } 
    if (activity != null) {
      this.F = false;
      a(activity, paramAttributeSet, paramBundle);
    } 
  }
  
  void a(Configuration paramConfiguration) {
    onConfigurationChanged(paramConfiguration);
    if (this.u != null)
      this.u.a(paramConfiguration); 
  }
  
  final void a(Bundle paramBundle) {
    if (this.f != null) {
      this.J.restoreHierarchyState(this.f);
      this.f = null;
    } 
    this.F = false;
    e(paramBundle);
    if (!this.F) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Fragment ");
      stringBuilder.append(this);
      stringBuilder.append(" did not call through to super.onViewStateRestored()");
      throw new ab(stringBuilder.toString());
    } 
  }
  
  public void a(Menu paramMenu) {}
  
  public void a(Menu paramMenu, MenuInflater paramMenuInflater) {}
  
  public void a(View paramView, Bundle paramBundle) {}
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mFragmentId=#");
    paramPrintWriter.print(Integer.toHexString(this.w));
    paramPrintWriter.print(" mContainerId=#");
    paramPrintWriter.print(Integer.toHexString(this.x));
    paramPrintWriter.print(" mTag=");
    paramPrintWriter.println(this.y);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mState=");
    paramPrintWriter.print(this.b);
    paramPrintWriter.print(" mIndex=");
    paramPrintWriter.print(this.g);
    paramPrintWriter.print(" mWho=");
    paramPrintWriter.print(this.h);
    paramPrintWriter.print(" mBackStackNesting=");
    paramPrintWriter.println(this.r);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mAdded=");
    paramPrintWriter.print(this.m);
    paramPrintWriter.print(" mRemoving=");
    paramPrintWriter.print(this.n);
    paramPrintWriter.print(" mFromLayout=");
    paramPrintWriter.print(this.o);
    paramPrintWriter.print(" mInLayout=");
    paramPrintWriter.println(this.p);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mHidden=");
    paramPrintWriter.print(this.z);
    paramPrintWriter.print(" mDetached=");
    paramPrintWriter.print(this.A);
    paramPrintWriter.print(" mMenuVisible=");
    paramPrintWriter.print(this.E);
    paramPrintWriter.print(" mHasMenu=");
    paramPrintWriter.println(this.D);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mRetainInstance=");
    paramPrintWriter.print(this.B);
    paramPrintWriter.print(" mRetaining=");
    paramPrintWriter.print(this.C);
    paramPrintWriter.print(" mUserVisibleHint=");
    paramPrintWriter.println(this.L);
    if (this.s != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mFragmentManager=");
      paramPrintWriter.println(this.s);
    } 
    if (this.t != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mHost=");
      paramPrintWriter.println(this.t);
    } 
    if (this.v != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mParentFragment=");
      paramPrintWriter.println(this.v);
    } 
    if (this.i != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mArguments=");
      paramPrintWriter.println(this.i);
    } 
    if (this.e != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedFragmentState=");
      paramPrintWriter.println(this.e);
    } 
    if (this.f != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedViewState=");
      paramPrintWriter.println(this.f);
    } 
    if (this.j != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTarget=");
      paramPrintWriter.print(this.j);
      paramPrintWriter.print(" mTargetRequestCode=");
      paramPrintWriter.println(this.l);
    } 
    if (this.G != 0) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mNextAnim=");
      paramPrintWriter.println(this.G);
    } 
    if (this.H != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mContainer=");
      paramPrintWriter.println(this.H);
    } 
    if (this.I != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mView=");
      paramPrintWriter.println(this.I);
    } 
    if (this.J != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mInnerView=");
      paramPrintWriter.println(this.I);
    } 
    if (this.c != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAnimatingAway=");
      paramPrintWriter.println(this.c);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStateAfterAnimating=");
      paramPrintWriter.println(this.d);
    } 
    if (this.M != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Loader Manager:");
      w w1 = this.M;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramString);
      stringBuilder.append("  ");
      w1.a(stringBuilder.toString(), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    } 
    if (this.u != null) {
      paramPrintWriter.print(paramString);
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append("Child ");
      stringBuilder2.append(this.u);
      stringBuilder2.append(":");
      paramPrintWriter.println(stringBuilder2.toString());
      q q1 = this.u;
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(paramString);
      stringBuilder1.append("  ");
      q1.a(stringBuilder1.toString(), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    } 
  }
  
  public void a(boolean paramBoolean) {}
  
  final boolean a() { return (this.r > 0); }
  
  public boolean a(MenuItem paramMenuItem) { return false; }
  
  public final l b() { return (this.t == null) ? null : (l)this.t.f(); }
  
  public LayoutInflater b(Bundle paramBundle) {
    LayoutInflater layoutInflater = this.t.b();
    d();
    i.a(layoutInflater, this.u.s());
    return layoutInflater;
  }
  
  View b(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    if (this.u != null)
      this.u.h(); 
    return a(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  public void b(Menu paramMenu) {}
  
  boolean b(Menu paramMenu, MenuInflater paramMenuInflater) {
    boolean bool1 = this.z;
    boolean bool2 = false;
    boolean bool = false;
    if (!bool1) {
      bool1 = bool;
      if (this.D) {
        bool1 = bool;
        if (this.E) {
          bool1 = true;
          a(paramMenu, paramMenuInflater);
        } 
      } 
      bool2 = bool1;
      if (this.u != null)
        bool2 = bool1 | this.u.a(paramMenu, paramMenuInflater); 
    } 
    return bool2;
  }
  
  public boolean b(MenuItem paramMenuItem) { return false; }
  
  public final Resources c() {
    if (this.t == null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Fragment ");
      stringBuilder.append(this);
      stringBuilder.append(" not attached to Activity");
      throw new IllegalStateException(stringBuilder.toString());
    } 
    return this.t.g().getResources();
  }
  
  public void c(Bundle paramBundle) { this.F = true; }
  
  boolean c(Menu paramMenu) {
    boolean bool1 = this.z;
    boolean bool2 = false;
    boolean bool = false;
    if (!bool1) {
      bool1 = bool;
      if (this.D) {
        bool1 = bool;
        if (this.E) {
          bool1 = true;
          a(paramMenu);
        } 
      } 
      bool2 = bool1;
      if (this.u != null)
        bool2 = bool1 | this.u.a(paramMenu); 
    } 
    return bool2;
  }
  
  boolean c(MenuItem paramMenuItem) {
    if (!this.z) {
      if (this.D && this.E && a(paramMenuItem))
        return true; 
      if (this.u != null && this.u.a(paramMenuItem))
        return true; 
    } 
    return false;
  }
  
  public final p d() {
    if (this.u == null) {
      y();
      if (this.b >= 5) {
        this.u.l();
      } else if (this.b >= 4) {
        this.u.k();
      } else if (this.b >= 2) {
        this.u.j();
      } else if (this.b >= 1) {
        this.u.i();
      } 
    } 
    return this.u;
  }
  
  public void d(Bundle paramBundle) { this.F = true; }
  
  void d(Menu paramMenu) {
    if (!this.z) {
      if (this.D && this.E)
        b(paramMenu); 
      if (this.u != null)
        this.u.b(paramMenu); 
    } 
  }
  
  boolean d(MenuItem paramMenuItem) {
    if (!this.z) {
      if (b(paramMenuItem))
        return true; 
      if (this.u != null && this.u.b(paramMenuItem))
        return true; 
    } 
    return false;
  }
  
  public void e(Bundle paramBundle) { this.F = true; }
  
  public final boolean e() { return (this.t != null && this.m); }
  
  public final boolean equals(Object paramObject) { return super.equals(paramObject); }
  
  public void f(Bundle paramBundle) {}
  
  public final boolean f() { return this.z; }
  
  public View g() { return this.I; }
  
  void g(Bundle paramBundle) {
    StringBuilder stringBuilder;
    if (this.u != null)
      this.u.h(); 
    this.b = 1;
    this.F = false;
    c(paramBundle);
    if (!this.F) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Fragment ");
      stringBuilder.append(this);
      stringBuilder.append(" did not call through to super.onCreate()");
      throw new ab(stringBuilder.toString());
    } 
    if (stringBuilder != null) {
      Parcelable parcelable = stringBuilder.getParcelable("android:support:fragments");
      if (parcelable != null) {
        if (this.u == null)
          y(); 
        this.u.a(parcelable, null);
        this.u.i();
      } 
    } 
  }
  
  public void h() {
    this.F = true;
    if (!this.N) {
      this.N = true;
      if (!this.O) {
        this.O = true;
        this.M = this.t.a(this.h, this.N, false);
      } 
      if (this.M != null)
        this.M.b(); 
    } 
  }
  
  void h(Bundle paramBundle) {
    if (this.u != null)
      this.u.h(); 
    this.b = 2;
    this.F = false;
    d(paramBundle);
    if (!this.F) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Fragment ");
      stringBuilder.append(this);
      stringBuilder.append(" did not call through to super.onActivityCreated()");
      throw new ab(stringBuilder.toString());
    } 
    if (this.u != null)
      this.u.j(); 
  }
  
  public final int hashCode() { return super.hashCode(); }
  
  public void i() { this.F = true; }
  
  void i(Bundle paramBundle) {
    f(paramBundle);
    if (this.u != null) {
      Parcelable parcelable = this.u.g();
      if (parcelable != null)
        paramBundle.putParcelable("android:support:fragments", parcelable); 
    } 
  }
  
  public void j() { this.F = true; }
  
  public void k() { this.F = true; }
  
  public void l() { this.F = true; }
  
  public void m() {
    this.F = true;
    if (!this.O) {
      this.O = true;
      this.M = this.t.a(this.h, this.N, false);
    } 
    if (this.M != null)
      this.M.h(); 
  }
  
  void n() {
    this.g = -1;
    this.h = null;
    this.m = false;
    this.n = false;
    this.o = false;
    this.p = false;
    this.q = false;
    this.r = 0;
    this.s = null;
    this.u = null;
    this.t = null;
    this.w = 0;
    this.x = 0;
    this.y = null;
    this.z = false;
    this.A = false;
    this.C = false;
    this.M = null;
    this.N = false;
    this.O = false;
  }
  
  public void o() { this.F = true; }
  
  public void onConfigurationChanged(Configuration paramConfiguration) { this.F = true; }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo) { b().onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo); }
  
  public void onLowMemory() { this.F = true; }
  
  public void p() {}
  
  public Object q() { return this.P; }
  
  public Object r() { return (this.Q == a) ? q() : this.Q; }
  
  public Object s() { return this.R; }
  
  public Object t() { return (this.S == a) ? s() : this.S; }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(128);
    c.a(this, stringBuilder);
    if (this.g >= 0) {
      stringBuilder.append(" #");
      stringBuilder.append(this.g);
    } 
    if (this.w != 0) {
      stringBuilder.append(" id=0x");
      stringBuilder.append(Integer.toHexString(this.w));
    } 
    if (this.y != null) {
      stringBuilder.append(" ");
      stringBuilder.append(this.y);
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  public Object u() { return this.T; }
  
  public Object v() { return (this.U == a) ? u() : this.U; }
  
  public boolean w() { return (this.W == null) ? true : this.W.booleanValue(); }
  
  public boolean x() { return (this.V == null) ? true : this.V.booleanValue(); }
  
  void y() {
    this.u = new q();
    this.u.a(this.t, new m(this) {
          public View a(int param1Int) {
            if (this.a.I == null)
              throw new IllegalStateException("Fragment does not have a view"); 
            return this.a.I.findViewById(param1Int);
          }
          
          public boolean a() { return (this.a.I != null); }
        },  this);
  }
  
  void z() {
    if (this.u != null) {
      this.u.h();
      this.u.d();
    } 
    this.b = 4;
    this.F = false;
    h();
    if (!this.F) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Fragment ");
      stringBuilder.append(this);
      stringBuilder.append(" did not call through to super.onStart()");
      throw new ab(stringBuilder.toString());
    } 
    if (this.u != null)
      this.u.k(); 
    if (this.M != null)
      this.M.g(); 
  }
  
  public static class a extends RuntimeException {
    public a(String param1String, Exception param1Exception) { super(param1String, param1Exception); }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */