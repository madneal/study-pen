package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

class i {
  public static Object a(Context paramContext) { return new EdgeEffect(paramContext); }
  
  public static void a(Object paramObject, int paramInt1, int paramInt2) { ((EdgeEffect)paramObject).setSize(paramInt1, paramInt2); }
  
  public static boolean a(Object paramObject) { return ((EdgeEffect)paramObject).isFinished(); }
  
  public static boolean a(Object paramObject, float paramFloat) {
    ((EdgeEffect)paramObject).onPull(paramFloat);
    return true;
  }
  
  public static boolean a(Object paramObject, int paramInt) {
    ((EdgeEffect)paramObject).onAbsorb(paramInt);
    return true;
  }
  
  public static boolean a(Object paramObject, Canvas paramCanvas) { return ((EdgeEffect)paramObject).draw(paramCanvas); }
  
  public static boolean b(Object paramObject) {
    paramObject = (EdgeEffect)paramObject;
    paramObject.onRelease();
    return paramObject.isFinished();
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/widget/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */