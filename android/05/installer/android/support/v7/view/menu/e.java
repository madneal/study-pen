package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.b.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

public class e implements l, AdapterView.OnItemClickListener {
  Context a;
  
  LayoutInflater b;
  
  f c;
  
  ExpandedMenuView d;
  
  int e;
  
  int f;
  
  a g;
  
  private int h;
  
  private l.a i;
  
  public e(int paramInt1, int paramInt2) {
    this.f = paramInt1;
    this.e = paramInt2;
  }
  
  public e(Context paramContext, int paramInt) {
    this(paramInt, 0);
    this.a = paramContext;
    this.b = LayoutInflater.from(this.a);
  }
  
  public m a(ViewGroup paramViewGroup) {
    if (this.d == null) {
      this.d = (ExpandedMenuView)this.b.inflate(a.h.abc_expanded_menu_layout, paramViewGroup, false);
      if (this.g == null)
        this.g = new a(this); 
      this.d.setAdapter(this.g);
      this.d.setOnItemClickListener(this);
    } 
    return this.d;
  }
  
  public ListAdapter a() {
    if (this.g == null)
      this.g = new a(this); 
    return this.g;
  }
  
  public void a(Context paramContext, f paramf) { // Byte code:
    //   0: aload_0
    //   1: getfield e : I
    //   4: ifeq -> 37
    //   7: aload_0
    //   8: new android/view/ContextThemeWrapper
    //   11: dup
    //   12: aload_1
    //   13: aload_0
    //   14: getfield e : I
    //   17: invokespecial <init> : (Landroid/content/Context;I)V
    //   20: putfield a : Landroid/content/Context;
    //   23: aload_0
    //   24: aload_0
    //   25: getfield a : Landroid/content/Context;
    //   28: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   31: putfield b : Landroid/view/LayoutInflater;
    //   34: goto -> 59
    //   37: aload_0
    //   38: getfield a : Landroid/content/Context;
    //   41: ifnull -> 59
    //   44: aload_0
    //   45: aload_1
    //   46: putfield a : Landroid/content/Context;
    //   49: aload_0
    //   50: getfield b : Landroid/view/LayoutInflater;
    //   53: ifnonnull -> 59
    //   56: goto -> 23
    //   59: aload_0
    //   60: aload_2
    //   61: putfield c : Landroid/support/v7/view/menu/f;
    //   64: aload_0
    //   65: getfield g : Landroid/support/v7/view/menu/e$a;
    //   68: ifnull -> 78
    //   71: aload_0
    //   72: getfield g : Landroid/support/v7/view/menu/e$a;
    //   75: invokevirtual notifyDataSetChanged : ()V
    //   78: return }
  
  public void a(f paramf, boolean paramBoolean) {
    if (this.i != null)
      this.i.a(paramf, paramBoolean); 
  }
  
  public void a(l.a parama) { this.i = parama; }
  
  public boolean a(f paramf, h paramh) { return false; }
  
  public boolean a(p paramp) {
    if (!paramp.hasVisibleItems())
      return false; 
    (new g(paramp)).a(null);
    if (this.i != null)
      this.i.a(paramp); 
    return true;
  }
  
  public void b(boolean paramBoolean) {
    if (this.g != null)
      this.g.notifyDataSetChanged(); 
  }
  
  public boolean b() { return false; }
  
  public boolean b(f paramf, h paramh) { return false; }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong) { this.c.a(this.g.a(paramInt), this, 0); }
  
  private class a extends BaseAdapter {
    private int b = -1;
    
    public a(e this$0) { a(); }
    
    public h a(int param1Int) {
      ArrayList arrayList = this.a.c.l();
      int i = param1Int + e.a(this.a);
      param1Int = i;
      if (this.b >= 0) {
        param1Int = i;
        if (i >= this.b)
          param1Int = i + 1; 
      } 
      return (h)arrayList.get(param1Int);
    }
    
    void a() {
      h h = this.a.c.r();
      if (h != null) {
        ArrayList arrayList = this.a.c.l();
        int i = arrayList.size();
        for (byte b1 = 0; b1 < i; b1++) {
          if ((h)arrayList.get(b1) == h) {
            this.b = b1;
            return;
          } 
        } 
      } 
      this.b = -1;
    }
    
    public int getCount() {
      int i = this.a.c.l().size() - e.a(this.a);
      return (this.b < 0) ? i : (i - 1);
    }
    
    public long getItemId(int param1Int) { return param1Int; }
    
    public View getView(int param1Int, View param1View, ViewGroup param1ViewGroup) {
      View view = param1View;
      if (param1View == null)
        view = this.a.b.inflate(this.a.f, param1ViewGroup, false); 
      ((m.a)view).a(a(param1Int), 0);
      return view;
    }
    
    public void notifyDataSetChanged() {
      a();
      super.notifyDataSetChanged();
    }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/view/menu/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */