package android.support.v4.h;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;

public final class as {
  static final b a;
  
  static  {
    e e;
    int i = Build.VERSION.SDK_INT;
    if (i >= 21) {
      e = new d();
    } else if (i >= 19) {
      e = new c();
    } else if (i >= 14) {
      e = new a();
    } else {
      e = new e();
    } 
    a = e;
  }
  
  public static void a(ViewParent paramViewParent, View paramView) { a.a(paramViewParent, paramView); }
  
  public static void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { a.a(paramViewParent, paramView, paramInt1, paramInt2, paramInt3, paramInt4); }
  
  public static void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt) { a.a(paramViewParent, paramView, paramInt1, paramInt2, paramArrayOfInt); }
  
  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2) { return a.a(paramViewParent, paramView, paramFloat1, paramFloat2); }
  
  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean) { return a.a(paramViewParent, paramView, paramFloat1, paramFloat2, paramBoolean); }
  
  public static boolean a(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt) { return a.a(paramViewParent, paramView1, paramView2, paramInt); }
  
  public static void b(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt) { a.b(paramViewParent, paramView1, paramView2, paramInt); }
  
  static class a extends e {}
  
  static interface b {
    void a(ViewParent param1ViewParent, View param1View);
    
    void a(ViewParent param1ViewParent, View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4);
    
    void a(ViewParent param1ViewParent, View param1View, int param1Int1, int param1Int2, int[] param1ArrayOfInt);
    
    boolean a(ViewParent param1ViewParent, View param1View, float param1Float1, float param1Float2);
    
    boolean a(ViewParent param1ViewParent, View param1View, float param1Float1, float param1Float2, boolean param1Boolean);
    
    boolean a(ViewParent param1ViewParent, View param1View1, View param1View2, int param1Int);
    
    void b(ViewParent param1ViewParent, View param1View1, View param1View2, int param1Int);
  }
  
  static class c extends a {}
  
  static class d extends c {
    public void a(ViewParent param1ViewParent, View param1View) { at.a(param1ViewParent, param1View); }
    
    public void a(ViewParent param1ViewParent, View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4) { at.a(param1ViewParent, param1View, param1Int1, param1Int2, param1Int3, param1Int4); }
    
    public void a(ViewParent param1ViewParent, View param1View, int param1Int1, int param1Int2, int[] param1ArrayOfInt) { at.a(param1ViewParent, param1View, param1Int1, param1Int2, param1ArrayOfInt); }
    
    public boolean a(ViewParent param1ViewParent, View param1View, float param1Float1, float param1Float2) { return at.a(param1ViewParent, param1View, param1Float1, param1Float2); }
    
    public boolean a(ViewParent param1ViewParent, View param1View, float param1Float1, float param1Float2, boolean param1Boolean) { return at.a(param1ViewParent, param1View, param1Float1, param1Float2, param1Boolean); }
    
    public boolean a(ViewParent param1ViewParent, View param1View1, View param1View2, int param1Int) { return at.a(param1ViewParent, param1View1, param1View2, param1Int); }
    
    public void b(ViewParent param1ViewParent, View param1View1, View param1View2, int param1Int) { at.b(param1ViewParent, param1View1, param1View2, param1Int); }
  }
  
  static class e implements b {
    public void a(ViewParent param1ViewParent, View param1View) {
      if (param1ViewParent instanceof y)
        ((y)param1ViewParent).onStopNestedScroll(param1View); 
    }
    
    public void a(ViewParent param1ViewParent, View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      if (param1ViewParent instanceof y)
        ((y)param1ViewParent).onNestedScroll(param1View, param1Int1, param1Int2, param1Int3, param1Int4); 
    }
    
    public void a(ViewParent param1ViewParent, View param1View, int param1Int1, int param1Int2, int[] param1ArrayOfInt) {
      if (param1ViewParent instanceof y)
        ((y)param1ViewParent).onNestedPreScroll(param1View, param1Int1, param1Int2, param1ArrayOfInt); 
    }
    
    public boolean a(ViewParent param1ViewParent, View param1View, float param1Float1, float param1Float2) { return (param1ViewParent instanceof y) ? ((y)param1ViewParent).onNestedPreFling(param1View, param1Float1, param1Float2) : 0; }
    
    public boolean a(ViewParent param1ViewParent, View param1View, float param1Float1, float param1Float2, boolean param1Boolean) { return (param1ViewParent instanceof y) ? ((y)param1ViewParent).onNestedFling(param1View, param1Float1, param1Float2, param1Boolean) : 0; }
    
    public boolean a(ViewParent param1ViewParent, View param1View1, View param1View2, int param1Int) { return (param1ViewParent instanceof y) ? ((y)param1ViewParent).onStartNestedScroll(param1View1, param1View2, param1Int) : 0; }
    
    public void b(ViewParent param1ViewParent, View param1View1, View param1View2, int param1Int) {
      if (param1ViewParent instanceof y)
        ((y)param1ViewParent).onNestedScrollAccepted(param1View1, param1View2, param1Int); 
    }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */