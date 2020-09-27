package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;

public final class b {
  private static final c a;
  
  static  {
    b b1;
    int i = Build.VERSION.SDK_INT;
    if (i >= 23) {
      b1 = new a();
    } else if (i >= 21) {
      b1 = new d();
    } else {
      b1 = new b();
    } 
    a = b1;
  }
  
  public static Drawable a(CompoundButton paramCompoundButton) { return a.a(paramCompoundButton); }
  
  public static void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList) { a.a(paramCompoundButton, paramColorStateList); }
  
  public static void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode) { a.a(paramCompoundButton, paramMode); }
  
  static class a extends d {
    public Drawable a(CompoundButton param1CompoundButton) { return c.a(param1CompoundButton); }
  }
  
  static class b implements c {
    public Drawable a(CompoundButton param1CompoundButton) { return d.a(param1CompoundButton); }
    
    public void a(CompoundButton param1CompoundButton, ColorStateList param1ColorStateList) { d.a(param1CompoundButton, param1ColorStateList); }
    
    public void a(CompoundButton param1CompoundButton, PorterDuff.Mode param1Mode) { d.a(param1CompoundButton, param1Mode); }
  }
  
  static interface c {
    Drawable a(CompoundButton param1CompoundButton);
    
    void a(CompoundButton param1CompoundButton, ColorStateList param1ColorStateList);
    
    void a(CompoundButton param1CompoundButton, PorterDuff.Mode param1Mode);
  }
  
  static class d extends b {
    public void a(CompoundButton param1CompoundButton, ColorStateList param1ColorStateList) { e.a(param1CompoundButton, param1ColorStateList); }
    
    public void a(CompoundButton param1CompoundButton, PorterDuff.Mode param1Mode) { e.a(param1CompoundButton, param1Mode); }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */