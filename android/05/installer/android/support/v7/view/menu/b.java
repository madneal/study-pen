package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.h.af;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class b implements l {
  protected Context a;
  
  protected Context b;
  
  protected f c;
  
  protected LayoutInflater d;
  
  protected LayoutInflater e;
  
  protected m f;
  
  private l.a g;
  
  private int h;
  
  private int i;
  
  private int j;
  
  public b(Context paramContext, int paramInt1, int paramInt2) {
    this.a = paramContext;
    this.d = LayoutInflater.from(paramContext);
    this.h = paramInt1;
    this.i = paramInt2;
  }
  
  public l.a a() { return this.g; }
  
  public m a(ViewGroup paramViewGroup) {
    if (this.f == null) {
      this.f = (m)this.d.inflate(this.h, paramViewGroup, false);
      this.f.a(this.c);
      b(true);
    } 
    return this.f;
  }
  
  public View a(h paramh, View paramView, ViewGroup paramViewGroup) {
    m.a a1;
    if (paramView instanceof m.a) {
      a1 = (m.a)paramView;
    } else {
      a1 = b(paramViewGroup);
    } 
    a(paramh, a1);
    return (View)a1;
  }
  
  public void a(int paramInt) { this.j = paramInt; }
  
  public void a(Context paramContext, f paramf) {
    this.b = paramContext;
    this.e = LayoutInflater.from(this.b);
    this.c = paramf;
  }
  
  public void a(f paramf, boolean paramBoolean) {
    if (this.g != null)
      this.g.a(paramf, paramBoolean); 
  }
  
  public abstract void a(h paramh, m.a parama);
  
  public void a(l.a parama) { this.g = parama; }
  
  protected void a(View paramView, int paramInt) {
    ViewGroup viewGroup = (ViewGroup)paramView.getParent();
    if (viewGroup != null)
      viewGroup.removeView(paramView); 
    ((ViewGroup)this.f).addView(paramView, paramInt);
  }
  
  public boolean a(int paramInt, h paramh) { return true; }
  
  public boolean a(f paramf, h paramh) { return false; }
  
  public boolean a(p paramp) { return (this.g != null) ? this.g.a(paramp) : 0; }
  
  protected boolean a(ViewGroup paramViewGroup, int paramInt) {
    paramViewGroup.removeViewAt(paramInt);
    return true;
  }
  
  public m.a b(ViewGroup paramViewGroup) { return (m.a)this.d.inflate(this.i, paramViewGroup, false); }
  
  public void b(boolean paramBoolean) {
    ViewGroup viewGroup = (ViewGroup)this.f;
    if (viewGroup == null)
      return; 
    f f1 = this.c;
    byte b1 = 0;
    if (f1 != null) {
      this.c.j();
      ArrayList arrayList = this.c.i();
      int k = arrayList.size();
      byte b2 = 0;
      for (b1 = 0; b2 < k; b1 = b3) {
        h h1 = (h)arrayList.get(b2);
        byte b3 = b1;
        if (a(b1, h1)) {
          View view1 = viewGroup.getChildAt(b1);
          if (view1 instanceof m.a) {
            h h2 = ((m.a)view1).getItemData();
          } else {
            f1 = null;
          } 
          View view2 = a(h1, view1, viewGroup);
          if (h1 != f1) {
            view2.setPressed(false);
            af.l(view2);
          } 
          if (view2 != view1)
            a(view2, b1); 
          b3 = b1 + 1;
        } 
        b2++;
      } 
    } 
    while (b1 < viewGroup.getChildCount()) {
      if (!a(viewGroup, b1))
        b1++; 
    } 
  }
  
  public boolean b() { return false; }
  
  public boolean b(f paramf, h paramh) { return false; }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/view/menu/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */