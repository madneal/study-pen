package android.support.v4.h.a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

class f {
  public static Object a(a parama) { return new AccessibilityNodeProvider(parama) {
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int param1Int) { return (AccessibilityNodeInfo)this.a.a(param1Int); }
        
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String param1String, int param1Int) { return this.a.a(param1String, param1Int); }
        
        public boolean performAction(int param1Int1, int param1Int2, Bundle param1Bundle) { return this.a.a(param1Int1, param1Int2, param1Bundle); }
      }; }
  
  static interface a {
    Object a(int param1Int);
    
    List<Object> a(String param1String, int param1Int);
    
    boolean a(int param1Int1, int param1Int2, Bundle param1Bundle);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */