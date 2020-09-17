package android.support.v4.h;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

class at {
  public static void a(ViewParent paramViewParent, View paramView) {
    try {
      paramViewParent.onStopNestedScroll(paramView);
      return;
    } catch (AbstractMethodError abstractMethodError) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("ViewParent ");
      stringBuilder.append(paramViewParent);
      stringBuilder.append(" does not implement interface ");
      stringBuilder.append("method onStopNestedScroll");
      Log.e("ViewParentCompat", stringBuilder.toString(), abstractMethodError);
      return;
    } 
  }
  
  public static void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    try {
      paramViewParent.onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    } catch (AbstractMethodError paramView) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("ViewParent ");
      stringBuilder.append(paramViewParent);
      stringBuilder.append(" does not implement interface ");
      stringBuilder.append("method onNestedScroll");
      Log.e("ViewParentCompat", stringBuilder.toString(), paramView);
      return;
    } 
  }
  
  public static void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt) {
    try {
      paramViewParent.onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt);
      return;
    } catch (AbstractMethodError paramArrayOfInt) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("ViewParent ");
      stringBuilder.append(paramViewParent);
      stringBuilder.append(" does not implement interface ");
      stringBuilder.append("method onNestedPreScroll");
      Log.e("ViewParentCompat", stringBuilder.toString(), paramArrayOfInt);
      return;
    } 
  }
  
  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2) {
    try {
      return paramViewParent.onNestedPreFling(paramView, paramFloat1, paramFloat2);
    } catch (AbstractMethodError abstractMethodError) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("ViewParent ");
      stringBuilder.append(paramViewParent);
      stringBuilder.append(" does not implement interface ");
      stringBuilder.append("method onNestedPreFling");
      Log.e("ViewParentCompat", stringBuilder.toString(), abstractMethodError);
      return false;
    } 
  }
  
  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean) {
    try {
      return paramViewParent.onNestedFling(paramView, paramFloat1, paramFloat2, paramBoolean);
    } catch (AbstractMethodError paramView) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("ViewParent ");
      stringBuilder.append(paramViewParent);
      stringBuilder.append(" does not implement interface ");
      stringBuilder.append("method onNestedFling");
      Log.e("ViewParentCompat", stringBuilder.toString(), paramView);
      return false;
    } 
  }
  
  public static boolean a(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt) {
    try {
      return paramViewParent.onStartNestedScroll(paramView1, paramView2, paramInt);
    } catch (AbstractMethodError paramView1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("ViewParent ");
      stringBuilder.append(paramViewParent);
      stringBuilder.append(" does not implement interface ");
      stringBuilder.append("method onStartNestedScroll");
      Log.e("ViewParentCompat", stringBuilder.toString(), paramView1);
      return false;
    } 
  }
  
  public static void b(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt) {
    try {
      paramViewParent.onNestedScrollAccepted(paramView1, paramView2, paramInt);
      return;
    } catch (AbstractMethodError paramView1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("ViewParent ");
      stringBuilder.append(paramViewParent);
      stringBuilder.append(" does not implement interface ");
      stringBuilder.append("method onNestedScrollAccepted");
      Log.e("ViewParentCompat", stringBuilder.toString(), paramView1);
      return;
    } 
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */