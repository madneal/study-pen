package android.support.a.a;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.v4.c.a.a;
import android.support.v4.c.a.o;
import android.util.AttributeSet;

@TargetApi(21)
abstract class e extends Drawable implements o {
  Drawable a;
  
  static TypedArray b(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfInt) { return (paramTheme == null) ? paramResources.obtainAttributes(paramAttributeSet, paramArrayOfInt) : paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, 0, 0); }
  
  public void applyTheme(Resources.Theme paramTheme) {
    if (this.a != null)
      a.a(this.a, paramTheme); 
  }
  
  public void clearColorFilter() {
    if (this.a != null) {
      this.a.clearColorFilter();
      return;
    } 
    super.clearColorFilter();
  }
  
  public ColorFilter getColorFilter() { return (this.a != null) ? a.e(this.a) : null; }
  
  public Drawable getCurrent() { return (this.a != null) ? this.a.getCurrent() : super.getCurrent(); }
  
  public int getLayoutDirection() {
    if (this.a != null)
      a.g(this.a); 
    return 0;
  }
  
  public int getMinimumHeight() { return (this.a != null) ? this.a.getMinimumHeight() : super.getMinimumHeight(); }
  
  public int getMinimumWidth() { return (this.a != null) ? this.a.getMinimumWidth() : super.getMinimumWidth(); }
  
  public boolean getPadding(Rect paramRect) { return (this.a != null) ? this.a.getPadding(paramRect) : super.getPadding(paramRect); }
  
  public int[] getState() { return (this.a != null) ? this.a.getState() : super.getState(); }
  
  public Region getTransparentRegion() { return (this.a != null) ? this.a.getTransparentRegion() : super.getTransparentRegion(); }
  
  public boolean isAutoMirrored() {
    if (this.a != null)
      a.b(this.a); 
    return false;
  }
  
  public void jumpToCurrentState() {
    if (this.a != null)
      a.a(this.a); 
  }
  
  protected void onBoundsChange(Rect paramRect) {
    if (this.a != null) {
      this.a.setBounds(paramRect);
      return;
    } 
    super.onBoundsChange(paramRect);
  }
  
  protected boolean onLevelChange(int paramInt) { return (this.a != null) ? this.a.setLevel(paramInt) : super.onLevelChange(paramInt); }
  
  public void setAutoMirrored(boolean paramBoolean) {
    if (this.a != null)
      a.a(this.a, paramBoolean); 
  }
  
  public void setChangingConfigurations(int paramInt) {
    if (this.a != null) {
      this.a.setChangingConfigurations(paramInt);
      return;
    } 
    super.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(int paramInt, PorterDuff.Mode paramMode) {
    if (this.a != null) {
      this.a.setColorFilter(paramInt, paramMode);
      return;
    } 
    super.setColorFilter(paramInt, paramMode);
  }
  
  public void setFilterBitmap(boolean paramBoolean) {
    if (this.a != null)
      this.a.setFilterBitmap(paramBoolean); 
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2) {
    if (this.a != null)
      a.a(this.a, paramFloat1, paramFloat2); 
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.a != null)
      a.a(this.a, paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  public boolean setState(int[] paramArrayOfInt) { return (this.a != null) ? this.a.setState(paramArrayOfInt) : super.setState(paramArrayOfInt); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/a/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */