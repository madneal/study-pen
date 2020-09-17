package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.h.ac;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

public class f extends AutoCompleteTextView implements ac {
  private static final int[] a = { 16843126 };
  
  private l b = l.a();
  
  private g c;
  
  private y d;
  
  public f(Context paramContext) { this(paramContext, null); }
  
  public f(Context paramContext, AttributeSet paramAttributeSet) { this(paramContext, paramAttributeSet, a.a.autoCompleteTextViewStyle); }
  
  public f(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(ao.a(paramContext), paramAttributeSet, paramInt);
    ar ar = ar.a(getContext(), paramAttributeSet, a, paramInt, 0);
    if (ar.f(0))
      setDropDownBackgroundDrawable(ar.a(0)); 
    ar.a();
    this.c = new g(this, this.b);
    this.c.a(paramAttributeSet, paramInt);
    this.d = y.a(this);
    this.d.a(paramAttributeSet, paramInt);
    this.d.a();
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    if (this.c != null)
      this.c.c(); 
    if (this.d != null)
      this.d.a(); 
  }
  
  public ColorStateList getSupportBackgroundTintList() { return (this.c != null) ? this.c.a() : null; }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() { return (this.c != null) ? this.c.b() : null; }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
    if (this.c != null)
      this.c.a(paramDrawable); 
  }
  
  public void setBackgroundResource(int paramInt) {
    super.setBackgroundResource(paramInt);
    if (this.c != null)
      this.c.a(paramInt); 
  }
  
  public void setDropDownBackgroundResource(int paramInt) {
    if (this.b != null) {
      setDropDownBackgroundDrawable(this.b.a(getContext(), paramInt));
      return;
    } 
    super.setDropDownBackgroundResource(paramInt);
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    if (this.c != null)
      this.c.a(paramColorStateList); 
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    if (this.c != null)
      this.c.a(paramMode); 
  }
  
  public void setTextAppearance(Context paramContext, int paramInt) {
    super.setTextAppearance(paramContext, paramInt);
    if (this.d != null)
      this.d.a(paramContext, paramInt); 
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */