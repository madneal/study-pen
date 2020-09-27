package android.support.v4.h;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

class c {
  public static Object a(a parama) { return new View.AccessibilityDelegate(parama) {
        public boolean dispatchPopulateAccessibilityEvent(View param1View, AccessibilityEvent param1AccessibilityEvent) { return this.a.a(param1View, param1AccessibilityEvent); }
        
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View param1View) { return (AccessibilityNodeProvider)this.a.a(param1View); }
        
        public void onInitializeAccessibilityEvent(View param1View, AccessibilityEvent param1AccessibilityEvent) { this.a.b(param1View, param1AccessibilityEvent); }
        
        public void onInitializeAccessibilityNodeInfo(View param1View, AccessibilityNodeInfo param1AccessibilityNodeInfo) { this.a.a(param1View, param1AccessibilityNodeInfo); }
        
        public void onPopulateAccessibilityEvent(View param1View, AccessibilityEvent param1AccessibilityEvent) { this.a.c(param1View, param1AccessibilityEvent); }
        
        public boolean onRequestSendAccessibilityEvent(ViewGroup param1ViewGroup, View param1View, AccessibilityEvent param1AccessibilityEvent) { return this.a.a(param1ViewGroup, param1View, param1AccessibilityEvent); }
        
        public boolean performAccessibilityAction(View param1View, int param1Int, Bundle param1Bundle) { return this.a.a(param1View, param1Int, param1Bundle); }
        
        public void sendAccessibilityEvent(View param1View, int param1Int) { this.a.a(param1View, param1Int); }
        
        public void sendAccessibilityEventUnchecked(View param1View, AccessibilityEvent param1AccessibilityEvent) { this.a.d(param1View, param1AccessibilityEvent); }
      }; }
  
  public static Object a(Object paramObject, View paramView) { return ((View.AccessibilityDelegate)paramObject).getAccessibilityNodeProvider(paramView); }
  
  public static boolean a(Object paramObject, View paramView, int paramInt, Bundle paramBundle) { return ((View.AccessibilityDelegate)paramObject).performAccessibilityAction(paramView, paramInt, paramBundle); }
  
  public static interface a {
    Object a(View param1View);
    
    void a(View param1View, int param1Int);
    
    void a(View param1View, Object param1Object);
    
    boolean a(View param1View, int param1Int, Bundle param1Bundle);
    
    boolean a(View param1View, AccessibilityEvent param1AccessibilityEvent);
    
    boolean a(ViewGroup param1ViewGroup, View param1View, AccessibilityEvent param1AccessibilityEvent);
    
    void b(View param1View, AccessibilityEvent param1AccessibilityEvent);
    
    void c(View param1View, AccessibilityEvent param1AccessibilityEvent);
    
    void d(View param1View, AccessibilityEvent param1AccessibilityEvent);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */