package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.widget.ar;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements f.b, m, AdapterView.OnItemClickListener {
  private static final int[] a = { 16842964, 16843049 };
  
  private f b;
  
  private int c;
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet) { this(paramContext, paramAttributeSet, 16842868); }
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet);
    setOnItemClickListener(this);
    ar ar = ar.a(paramContext, paramAttributeSet, a, paramInt, 0);
    if (ar.f(0))
      setBackgroundDrawable(ar.a(0)); 
    if (ar.f(1))
      setDivider(ar.a(1)); 
    ar.a();
  }
  
  public void a(f paramf) { this.b = paramf; }
  
  public boolean a(h paramh) { return this.b.a(paramh, 0); }
  
  public int getWindowAnimations() { return this.c; }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    setChildrenDrawingCacheEnabled(false);
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong) { a((h)getAdapter().getItem(paramInt)); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/view/menu/ExpandedMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */