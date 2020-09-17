package android.support.v4.h;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

class b {
  public static Object a() { return new View.AccessibilityDelegate(); }
  
  public static Object a(a parama) { return new View.AccessibilityDelegate(parama) {
        public boolean dispatchPopulateAccessibilityEvent(View param1View, AccessibilityEvent param1AccessibilityEvent) { return this.a.a(param1View, param1AccessibilityEvent); }
        
        public void onInitializeAccessibilityEvent(View param1View, AccessibilityEvent param1AccessibilityEvent) { this.a.b(param1View, param1AccessibilityEvent); }
        
        public void onInitializeAccessibilityNodeInfo(View param1View, AccessibilityNodeInfo param1AccessibilityNodeInfo) { this.a.a(param1View, param1AccessibilityNodeInfo); }
        
        public void onPopulateAccessibilityEvent(View param1View, AccessibilityEvent param1AccessibilityEvent) { this.a.c(param1View, param1AccessibilityEvent); }
        
        public boolean onRequestSendAccessibilityEvent(ViewGroup param1ViewGroup, View param1View, AccessibilityEvent param1AccessibilityEvent) { return this.a.a(param1ViewGroup, param1View, param1AccessibilityEvent); }
        
        public void sendAccessibilityEvent(View param1View, int param1Int) { this.a.a(param1View, param1Int); }
        
        public void sendAccessibilityEventUnchecked(View param1View, AccessibilityEvent param1AccessibilityEvent) { this.a.d(param1View, param1AccessibilityEvent); }
      }; }
  
  public static void a(Object paramObject, View paramView, int paramInt) { ((View.AccessibilityDelegate)paramObject).sendAccessibilityEvent(paramView, paramInt); }
  
  public static void a(Object paramObject1, View paramView, Object paramObject2) { ((View.AccessibilityDelegate)paramObject1).onInitializeAccessibilityNodeInfo(paramView, (AccessibilityNodeInfo)paramObject2); }
  
  public static boolean a(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent) { return ((View.AccessibilityDelegate)paramObject).dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent); }
  
  public static boolean a(Object paramObject, ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent) { return ((View.AccessibilityDelegate)paramObject).onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent); }
  
  public static void b(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent) { ((View.AccessibilityDelegate)paramObject).onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent); }
  
  public static void c(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent) { ((View.AccessibilityDelegate)paramObject).onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent); }
  
  public static void d(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent) { ((View.AccessibilityDelegate)paramObject).sendAccessibilityEventUnchecked(paramView, paramAccessibilityEvent); }
  
  public static interface a {
    void a(View param1View, int param1Int);
    
    void a(View param1View, Object param1Object);
    
    boolean a(View param1View, AccessibilityEvent param1AccessibilityEvent);
    
    boolean a(ViewGroup param1ViewGroup, View param1View, AccessibilityEvent param1AccessibilityEvent);
    
    void b(View param1View, AccessibilityEvent param1AccessibilityEvent);
    
    void c(View param1View, AccessibilityEvent param1AccessibilityEvent);
    
    void d(View param1View, AccessibilityEvent param1AccessibilityEvent);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */