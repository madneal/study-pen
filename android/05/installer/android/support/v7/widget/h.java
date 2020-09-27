package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.h.ac;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

public class h extends Button implements ac {
  private final l a = l.a();
  
  private final g b = new g(this, this.a);
  
  private final y c;
  
  public h(Context paramContext, AttributeSet paramAttributeSet) { this(paramContext, paramAttributeSet, a.a.buttonStyle); }
  
  public h(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(ao.a(paramContext), paramAttributeSet, paramInt);
    this.b.a(paramAttributeSet, paramInt);
    this.c = y.a(this);
    this.c.a(paramAttributeSet, paramInt);
    this.c.a();
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    if (this.b != null)
      this.b.c(); 
    if (this.c != null)
      this.c.a(); 
  }
  
  public ColorStateList getSupportBackgroundTintList() { return (this.b != null) ? this.b.a() : null; }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() { return (this.b != null) ? this.b.b() : null; }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(Button.class.getName());
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(Button.class.getName());
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
    if (this.b != null)
      this.b.a(paramDrawable); 
  }
  
  public void setBackgroundResource(int paramInt) {
    super.setBackgroundResource(paramInt);
    if (this.b != null)
      this.b.a(paramInt); 
  }
  
  public void setSupportAllCaps(boolean paramBoolean) {
    if (this.c != null)
      this.c.a(paramBoolean); 
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    if (this.b != null)
      this.b.a(paramColorStateList); 
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    if (this.b != null)
      this.b.a(paramMode); 
  }
  
  public void setTextAppearance(Context paramContext, int paramInt) {
    super.setTextAppearance(paramContext, paramInt);
    if (this.c != null)
      this.c.a(paramContext, paramInt); 
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */