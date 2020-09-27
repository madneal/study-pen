package android.support.v4.c.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

class j extends Drawable implements Drawable.Callback, i, o {
  static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
  
  a b = b();
  
  Drawable c;
  
  private int d;
  
  private PorterDuff.Mode e;
  
  private boolean f;
  
  private boolean g;
  
  j(Drawable paramDrawable) { a(paramDrawable); }
  
  j(a parama, Resources paramResources) { a(paramResources); }
  
  private void a(Resources paramResources) {
    if (this.b != null && this.b.b != null)
      a(a(this.b.b, paramResources)); 
  }
  
  private boolean a(int[] paramArrayOfInt) {
    if (!c())
      return false; 
    ColorStateList colorStateList = this.b.c;
    PorterDuff.Mode mode = this.b.d;
    if (colorStateList != null && mode != null) {
      int k = colorStateList.getColorForState(paramArrayOfInt, colorStateList.getDefaultColor());
      if (!this.f || k != this.d || mode != this.e) {
        setColorFilter(k, mode);
        this.d = k;
        this.e = mode;
        this.f = true;
        return true;
      } 
    } else {
      this.f = false;
      clearColorFilter();
    } 
    return false;
  }
  
  public final Drawable a() { return this.c; }
  
  protected Drawable a(Drawable.ConstantState paramConstantState, Resources paramResources) { return paramConstantState.newDrawable(); }
  
  public final void a(Drawable paramDrawable) {
    if (this.c != null)
      this.c.setCallback(null); 
    this.c = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback(this);
      paramDrawable.setVisible(isVisible(), true);
      paramDrawable.setState(getState());
      paramDrawable.setLevel(getLevel());
      paramDrawable.setBounds(getBounds());
      if (this.b != null)
        this.b.b = paramDrawable.getConstantState(); 
    } 
    invalidateSelf();
  }
  
  a b() { return new b(this.b, null); }
  
  protected boolean c() { return true; }
  
  public void draw(Canvas paramCanvas) { this.c.draw(paramCanvas); }
  
  public int getChangingConfigurations() {
    int m;
    int k = super.getChangingConfigurations();
    if (this.b != null) {
      m = this.b.getChangingConfigurations();
    } else {
      m = 0;
    } 
    return k | m | this.c.getChangingConfigurations();
  }
  
  public Drawable.ConstantState getConstantState() {
    if (this.b != null && this.b.a()) {
      this.b.a = getChangingConfigurations();
      return this.b;
    } 
    return null;
  }
  
  public Drawable getCurrent() { return this.c.getCurrent(); }
  
  public int getIntrinsicHeight() { return this.c.getIntrinsicHeight(); }
  
  public int getIntrinsicWidth() { return this.c.getIntrinsicWidth(); }
  
  public int getMinimumHeight() { return this.c.getMinimumHeight(); }
  
  public int getMinimumWidth() { return this.c.getMinimumWidth(); }
  
  public int getOpacity() { return this.c.getOpacity(); }
  
  public boolean getPadding(Rect paramRect) { return this.c.getPadding(paramRect); }
  
  public int[] getState() { return this.c.getState(); }
  
  public Region getTransparentRegion() { return this.c.getTransparentRegion(); }
  
  public void invalidateDrawable(Drawable paramDrawable) { invalidateSelf(); }
  
  public boolean isStateful() {
    Object object;
    if (c() && this.b != null) {
      object = this.b.c;
    } else {
      object = null;
    } 
    return ((object != null && object.isStateful()) || this.c.isStateful());
  }
  
  public Drawable mutate() {
    if (!this.g && super.mutate() == this) {
      this.b = b();
      if (this.c != null)
        this.c.mutate(); 
      if (this.b != null) {
        Object object;
        a a1 = this.b;
        if (this.c != null) {
          object = this.c.getConstantState();
        } else {
          object = null;
        } 
        a1.b = object;
      } 
      this.g = true;
    } 
    return this;
  }
  
  protected void onBoundsChange(Rect paramRect) {
    if (this.c != null)
      this.c.setBounds(paramRect); 
  }
  
  protected boolean onLevelChange(int paramInt) { return this.c.setLevel(paramInt); }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong) { scheduleSelf(paramRunnable, paramLong); }
  
  public void setAlpha(int paramInt) { this.c.setAlpha(paramInt); }
  
  public void setChangingConfigurations(int paramInt) { this.c.setChangingConfigurations(paramInt); }
  
  public void setColorFilter(ColorFilter paramColorFilter) { this.c.setColorFilter(paramColorFilter); }
  
  public void setDither(boolean paramBoolean) { this.c.setDither(paramBoolean); }
  
  public void setFilterBitmap(boolean paramBoolean) { this.c.setFilterBitmap(paramBoolean); }
  
  public boolean setState(int[] paramArrayOfInt) {
    boolean bool = this.c.setState(paramArrayOfInt);
    return (a(paramArrayOfInt) || bool);
  }
  
  public void setTint(int paramInt) { setTintList(ColorStateList.valueOf(paramInt)); }
  
  public void setTintList(ColorStateList paramColorStateList) {
    this.b.c = paramColorStateList;
    a(getState());
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    this.b.d = paramMode;
    a(getState());
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) { return (super.setVisible(paramBoolean1, paramBoolean2) || this.c.setVisible(paramBoolean1, paramBoolean2)); }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable) { unscheduleSelf(paramRunnable); }
  
  protected static abstract class a extends Drawable.ConstantState {
    int a;
    
    Drawable.ConstantState b;
    
    ColorStateList c = null;
    
    PorterDuff.Mode d = j.a;
    
    a(a param1a, Resources param1Resources) {
      if (param1a != null) {
        this.a = param1a.a;
        this.b = param1a.b;
        this.c = param1a.c;
        this.d = param1a.d;
      } 
    }
    
    boolean a() { return (this.b != null); }
    
    public int getChangingConfigurations() {
      int j;
      int i = this.a;
      if (this.b != null) {
        j = this.b.getChangingConfigurations();
      } else {
        j = 0;
      } 
      return i | j;
    }
    
    public Drawable newDrawable() { return newDrawable(null); }
    
    public abstract Drawable newDrawable(Resources param1Resources);
  }
  
  private static class b extends a {
    b(j.a param1a, Resources param1Resources) { super(param1a, param1Resources); }
    
    public Drawable newDrawable(Resources param1Resources) { return new j(this, param1Resources); }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/c/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */