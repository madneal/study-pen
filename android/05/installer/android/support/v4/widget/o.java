package android.support.v4.widget;

import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;

public final class o {
  static final f a;
  
  static  {
    c c;
    int i = Build.VERSION.SDK_INT;
    if (i >= 23) {
      c = new b();
    } else if (i >= 21) {
      c = new a();
    } else if (i >= 19) {
      c = new e();
    } else if (i >= 9) {
      c = new d();
    } else {
      c = new c();
    } 
    a = c;
  }
  
  public static void a(PopupWindow paramPopupWindow, int paramInt) { a.a(paramPopupWindow, paramInt); }
  
  public static void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3) { a.a(paramPopupWindow, paramView, paramInt1, paramInt2, paramInt3); }
  
  public static void a(PopupWindow paramPopupWindow, boolean paramBoolean) { a.a(paramPopupWindow, paramBoolean); }
  
  static class a extends e {
    public void a(PopupWindow param1PopupWindow, boolean param1Boolean) { p.a(param1PopupWindow, param1Boolean); }
  }
  
  static class b extends a {
    public void a(PopupWindow param1PopupWindow, int param1Int) { q.a(param1PopupWindow, param1Int); }
    
    public void a(PopupWindow param1PopupWindow, boolean param1Boolean) { q.a(param1PopupWindow, param1Boolean); }
  }
  
  static class c implements f {
    public void a(PopupWindow param1PopupWindow, int param1Int) {}
    
    public void a(PopupWindow param1PopupWindow, View param1View, int param1Int1, int param1Int2, int param1Int3) { param1PopupWindow.showAsDropDown(param1View, param1Int1, param1Int2); }
    
    public void a(PopupWindow param1PopupWindow, boolean param1Boolean) {}
  }
  
  static class d extends c {
    public void a(PopupWindow param1PopupWindow, int param1Int) { r.a(param1PopupWindow, param1Int); }
  }
  
  static class e extends d {
    public void a(PopupWindow param1PopupWindow, View param1View, int param1Int1, int param1Int2, int param1Int3) { s.a(param1PopupWindow, param1View, param1Int1, param1Int2, param1Int3); }
  }
  
  static interface f {
    void a(PopupWindow param1PopupWindow, int param1Int);
    
    void a(PopupWindow param1PopupWindow, View param1View, int param1Int1, int param1Int2, int param1Int3);
    
    void a(PopupWindow param1PopupWindow, boolean param1Boolean);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/widget/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */