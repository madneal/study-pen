package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.b.a;
import android.support.v7.widget.ag;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import java.util.ArrayList;

public class k implements l, View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {
  static final int a = a.h.abc_popup_menu_item_layout;
  
  boolean b;
  
  private final Context c;
  
  private final LayoutInflater d;
  
  private final f e;
  
  private final a f;
  
  private final boolean g;
  
  private final int h;
  
  private final int i;
  
  private final int j;
  
  private View k;
  
  private ag l;
  
  private ViewTreeObserver m;
  
  private l.a n;
  
  private ViewGroup o;
  
  private boolean p;
  
  private int q;
  
  private int r = 0;
  
  public k(Context paramContext, f paramf, View paramView) { this(paramContext, paramf, paramView, false, a.a.popupMenuStyle); }
  
  public k(Context paramContext, f paramf, View paramView, boolean paramBoolean, int paramInt) { this(paramContext, paramf, paramView, paramBoolean, paramInt, 0); }
  
  public k(Context paramContext, f paramf, View paramView, boolean paramBoolean, int paramInt1, int paramInt2) {
    this.c = paramContext;
    this.d = LayoutInflater.from(paramContext);
    this.e = paramf;
    this.f = new a(this, this.e);
    this.g = paramBoolean;
    this.i = paramInt1;
    this.j = paramInt2;
    Resources resources = paramContext.getResources();
    this.h = Math.max((resources.getDisplayMetrics()).widthPixels / 2, resources.getDimensionPixelSize(a.d.abc_config_prefDialogWidth));
    this.k = paramView;
    paramf.a(this, paramContext);
  }
  
  private int g() {
    a a1 = this.f;
    byte b1 = 0;
    int i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i3 = a1.getCount();
    View view = null;
    int i4 = 0;
    int i5;
    for (i5 = 0; b1 < i3; i5 = i6) {
      int i6 = a1.getItemViewType(b1);
      int i7 = i4;
      if (i6 != i4) {
        view = null;
        i7 = i6;
      } 
      if (this.o == null)
        this.o = new FrameLayout(this.c); 
      view = a1.getView(b1, view, this.o);
      view.measure(i1, i2);
      i4 = view.getMeasuredWidth();
      if (i4 >= this.h)
        return this.h; 
      i6 = i5;
      if (i4 > i5)
        i6 = i4; 
      b1++;
      i4 = i7;
    } 
    return i5;
  }
  
  public void a() {
    if (!d())
      throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor"); 
  }
  
  public void a(int paramInt) { this.r = paramInt; }
  
  public void a(Context paramContext, f paramf) {}
  
  public void a(f paramf, boolean paramBoolean) {
    if (paramf != this.e)
      return; 
    e();
    if (this.n != null)
      this.n.a(paramf, paramBoolean); 
  }
  
  public void a(l.a parama) { this.n = parama; }
  
  public void a(View paramView) { this.k = paramView; }
  
  public void a(boolean paramBoolean) { this.b = paramBoolean; }
  
  public boolean a(f paramf, h paramh) { return false; }
  
  public boolean a(p paramp) {
    if (paramp.hasVisibleItems()) {
      boolean bool;
      k k1 = new k(this.c, paramp, this.k);
      k1.a(this.n);
      int i1 = paramp.size();
      byte b1 = 0;
      while (true) {
        if (b1 < i1) {
          MenuItem menuItem = paramp.getItem(b1);
          if (menuItem.isVisible() && menuItem.getIcon() != null) {
            boolean bool1 = true;
            break;
          } 
          b1++;
          continue;
        } 
        bool = false;
        break;
      } 
      k1.a(bool);
      if (k1.d()) {
        if (this.n != null)
          this.n.a(paramp); 
        return true;
      } 
    } 
    return false;
  }
  
  public void b(boolean paramBoolean) {
    this.p = false;
    if (this.f != null)
      this.f.notifyDataSetChanged(); 
  }
  
  public boolean b() { return false; }
  
  public boolean b(f paramf, h paramh) { return false; }
  
  public ag c() { return this.l; }
  
  public boolean d() {
    this.l = new ag(this.c, null, this.i, this.j);
    this.l.a(this);
    this.l.a(this);
    this.l.a(this.f);
    this.l.a(true);
    View view = this.k;
    boolean bool = false;
    if (view != null) {
      if (this.m == null)
        bool = true; 
      this.m = view.getViewTreeObserver();
      if (bool)
        this.m.addOnGlobalLayoutListener(this); 
      this.l.a(view);
      this.l.d(this.r);
      if (!this.p) {
        this.q = g();
        this.p = true;
      } 
      this.l.f(this.q);
      this.l.g(2);
      this.l.c();
      this.l.m().setOnKeyListener(this);
      return true;
    } 
    return false;
  }
  
  public void e() {
    if (f())
      this.l.i(); 
  }
  
  public boolean f() { return (this.l != null && this.l.k()); }
  
  public void onDismiss() {
    this.l = null;
    this.e.close();
    if (this.m != null) {
      if (!this.m.isAlive())
        this.m = this.k.getViewTreeObserver(); 
      this.m.removeGlobalOnLayoutListener(this);
      this.m = null;
    } 
  }
  
  public void onGlobalLayout() {
    if (f()) {
      View view = this.k;
      if (view == null || !view.isShown()) {
        e();
        return;
      } 
      if (f()) {
        this.l.c();
        return;
      } 
    } 
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong) {
    a a1;
    (a1 = this.f).a(a1).a(a1.a(paramInt), 0);
  }
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getAction() == 1 && paramInt == 82) {
      e();
      return true;
    } 
    return false;
  }
  
  private class a extends BaseAdapter {
    private f b;
    
    private int c = -1;
    
    public a(k this$0, f param1f) {
      this.b = param1f;
      a();
    }
    
    public h a(int param1Int) {
      ArrayList arrayList;
      if (k.a(this.a)) {
        arrayList = this.b.l();
      } else {
        arrayList = this.b.i();
      } 
      int i = param1Int;
      if (this.c >= 0) {
        i = param1Int;
        if (param1Int >= this.c)
          i = param1Int + 1; 
      } 
      return (h)arrayList.get(i);
    }
    
    void a() {
      h h = k.c(this.a).r();
      if (h != null) {
        ArrayList arrayList = k.c(this.a).l();
        int i = arrayList.size();
        for (byte b1 = 0; b1 < i; b1++) {
          if ((h)arrayList.get(b1) == h) {
            this.c = b1;
            return;
          } 
        } 
      } 
      this.c = -1;
    }
    
    public int getCount() {
      ArrayList arrayList;
      if (k.a(this.a)) {
        arrayList = this.b.l();
      } else {
        arrayList = this.b.i();
      } 
      return (this.c < 0) ? arrayList.size() : (arrayList.size() - 1);
    }
    
    public long getItemId(int param1Int) { return param1Int; }
    
    public View getView(int param1Int, View param1View, ViewGroup param1ViewGroup) {
      View view = param1View;
      if (param1View == null)
        view = k.b(this.a).inflate(k.a, param1ViewGroup, false); 
      m.a a1 = (m.a)view;
      if (this.a.b)
        ((ListMenuItemView)view).setForceShowIcon(true); 
      a1.a(a(param1Int), 0);
      return view;
    }
    
    public void notifyDataSetChanged() {
      a();
      super.notifyDataSetChanged();
    }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/view/menu/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */