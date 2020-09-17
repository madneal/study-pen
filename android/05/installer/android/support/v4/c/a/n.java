package android.support.v4.c.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

class n extends m {
  n(Drawable paramDrawable) { super(paramDrawable); }
  
  n(j.a parama, Resources paramResources) { super(parama, paramResources); }
  
  j.a b() { return new a(this.b, null); }
  
  protected boolean c() {
    int i = Build.VERSION.SDK_INT;
    byte b = 0;
    int j = b;
    if (i == 21) {
      Drawable drawable = this.c;
      if (!(drawable instanceof android.graphics.drawable.GradientDrawable) && !(drawable instanceof android.graphics.drawable.DrawableContainer)) {
        j = b;
        return (drawable instanceof android.graphics.drawable.InsetDrawable) ? true : j;
      } 
    } else {
      return j;
    } 
    return true;
  }
  
  public Rect getDirtyBounds() { return this.c.getDirtyBounds(); }
  
  public void getOutline(Outline paramOutline) { this.c.getOutline(paramOutline); }
  
  public void setHotspot(float paramFloat1, float paramFloat2) { this.c.setHotspot(paramFloat1, paramFloat2); }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { this.c.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4); }
  
  public boolean setState(int[] paramArrayOfInt) {
    if (super.setState(paramArrayOfInt)) {
      invalidateSelf();
      return true;
    } 
    return false;
  }
  
  public void setTint(int paramInt) {
    if (c()) {
      super.setTint(paramInt);
      return;
    } 
    this.c.setTint(paramInt);
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    if (c()) {
      super.setTintList(paramColorStateList);
      return;
    } 
    this.c.setTintList(paramColorStateList);
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    if (c()) {
      super.setTintMode(paramMode);
      return;
    } 
    this.c.setTintMode(paramMode);
  }
  
  private static class a extends j.a {
    a(j.a param1a, Resources param1Resources) { super(param1a, param1Resources); }
    
    public Drawable newDrawable(Resources param1Resources) { return new n(this, param1Resources); }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/c/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */