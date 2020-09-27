package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

public class j extends CheckedTextView {
  private static final int[] a = { 16843016 };
  
  private l b;
  
  private y c = y.a(this);
  
  public j(Context paramContext, AttributeSet paramAttributeSet) { this(paramContext, paramAttributeSet, 16843720); }
  
  public j(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(ao.a(paramContext), paramAttributeSet, paramInt);
    this.c.a(paramAttributeSet, paramInt);
    this.c.a();
    this.b = l.a();
    ar ar = ar.a(getContext(), paramAttributeSet, a, paramInt, 0);
    setCheckMarkDrawable(ar.a(0));
    ar.a();
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    if (this.c != null)
      this.c.a(); 
  }
  
  public void setCheckMarkDrawable(int paramInt) {
    if (this.b != null) {
      setCheckMarkDrawable(this.b.a(getContext(), paramInt));
      return;
    } 
    super.setCheckMarkDrawable(paramInt);
  }
  
  public void setTextAppearance(Context paramContext, int paramInt) {
    super.setTextAppearance(paramContext, paramInt);
    if (this.c != null)
      this.c.a(paramContext, paramInt); 
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */