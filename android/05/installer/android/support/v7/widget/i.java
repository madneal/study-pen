package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a;
import android.support.v4.widget.x;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.widget.CheckBox;

public class i extends CheckBox implements x {
  private l a = l.a();
  
  private k b = new k(this, this.a);
  
  public i(Context paramContext, AttributeSet paramAttributeSet) { this(paramContext, paramAttributeSet, a.a.checkboxStyle); }
  
  public i(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(ao.a(paramContext), paramAttributeSet, paramInt);
    this.b.a(paramAttributeSet, paramInt);
  }
  
  public int getCompoundPaddingLeft() {
    int j = super.getCompoundPaddingLeft();
    int m = j;
    if (this.b != null)
      m = this.b.a(j); 
    return m;
  }
  
  public ColorStateList getSupportButtonTintList() { return (this.b != null) ? this.b.a() : null; }
  
  public PorterDuff.Mode getSupportButtonTintMode() { return (this.b != null) ? this.b.b() : null; }
  
  public void setButtonDrawable(int paramInt) {
    Drawable drawable;
    if (this.a != null) {
      drawable = this.a.a(getContext(), paramInt);
    } else {
      drawable = a.a(getContext(), paramInt);
    } 
    setButtonDrawable(drawable);
  }
  
  public void setButtonDrawable(Drawable paramDrawable) {
    super.setButtonDrawable(paramDrawable);
    if (this.b != null)
      this.b.c(); 
  }
  
  public void setSupportButtonTintList(ColorStateList paramColorStateList) {
    if (this.b != null)
      this.b.a(paramColorStateList); 
  }
  
  public void setSupportButtonTintMode(PorterDuff.Mode paramMode) {
    if (this.b != null)
      this.b.a(paramMode); 
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */