package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.h.ac;
import android.util.AttributeSet;
import android.widget.ImageView;

public class p extends ImageView implements ac {
  private g a;
  
  private o b;
  
  public p(Context paramContext, AttributeSet paramAttributeSet) { this(paramContext, paramAttributeSet, 0); }
  
  public p(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(ao.a(paramContext), paramAttributeSet, paramInt);
    l l = l.a();
    this.a = new g(this, l);
    this.a.a(paramAttributeSet, paramInt);
    this.b = new o(this, l);
    this.b.a(paramAttributeSet, paramInt);
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    if (this.a != null)
      this.a.c(); 
  }
  
  public ColorStateList getSupportBackgroundTintList() { return (this.a != null) ? this.a.a() : null; }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() { return (this.a != null) ? this.a.b() : null; }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
    if (this.a != null)
      this.a.a(paramDrawable); 
  }
  
  public void setBackgroundResource(int paramInt) {
    super.setBackgroundResource(paramInt);
    if (this.a != null)
      this.a.a(paramInt); 
  }
  
  public void setImageResource(int paramInt) { this.b.a(paramInt); }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    if (this.a != null)
      this.a.a(paramColorStateList); 
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    if (this.a != null)
      this.a.a(paramMode); 
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */