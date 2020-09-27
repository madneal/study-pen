package android.support.v7.a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.b.a;
import android.support.v7.view.b;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

public abstract class a {
  public abstract int a();
  
  public b a(b.a parama) { return null; }
  
  public void a(float paramFloat) {
    if (paramFloat != 0.0F)
      throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration."); 
  }
  
  public void a(Configuration paramConfiguration) {}
  
  public void a(CharSequence paramCharSequence) {}
  
  public void a(boolean paramBoolean) {}
  
  public boolean a(int paramInt, KeyEvent paramKeyEvent) { return false; }
  
  public void b(boolean paramBoolean) {
    if (paramBoolean)
      throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration."); 
  }
  
  public abstract boolean b();
  
  public Context c() { return null; }
  
  public void c(boolean paramBoolean) {}
  
  public int d() { return 0; }
  
  public void d(boolean paramBoolean) {}
  
  public void e(boolean paramBoolean) {}
  
  public boolean e() { return false; }
  
  public boolean f() { return false; }
  
  boolean g() { return false; }
  
  void h() {}
  
  public static class a extends ViewGroup.MarginLayoutParams {
    public int a = 0;
    
    public a(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
      this.a = 8388627;
    }
    
    public a(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, a.k.ActionBarLayout);
      this.a = typedArray.getInt(a.k.ActionBarLayout_android_layout_gravity, 0);
      typedArray.recycle();
    }
    
    public a(a param1a) {
      super(param1a);
      this.a = param1a.a;
    }
    
    public a(ViewGroup.LayoutParams param1LayoutParams) { super(param1LayoutParams); }
  }
  
  public static interface b {
    void a(boolean param1Boolean);
  }
  
  public static abstract class c {
    public abstract Drawable a();
    
    public abstract CharSequence b();
    
    public abstract View c();
    
    public abstract void d();
    
    public abstract CharSequence e();
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */