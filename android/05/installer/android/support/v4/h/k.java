package android.support.v4.h;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Field;

class k {
  private static Field a;
  
  private static boolean b;
  
  static void a(LayoutInflater paramLayoutInflater, m paramm) {
    if (paramm != null) {
      a a1 = new a(paramm);
    } else {
      paramm = null;
    } 
    paramLayoutInflater.setFactory2(paramm);
    LayoutInflater.Factory factory = paramLayoutInflater.getFactory();
    if (factory instanceof LayoutInflater.Factory2) {
      a(paramLayoutInflater, (LayoutInflater.Factory2)factory);
      return;
    } 
    a(paramLayoutInflater, paramm);
  }
  
  static void a(LayoutInflater paramLayoutInflater, LayoutInflater.Factory2 paramFactory2) {
    if (!b) {
      try {
        a = LayoutInflater.class.getDeclaredField("mFactory2");
        a.setAccessible(true);
      } catch (NoSuchFieldException noSuchFieldException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("forceSetFactory2 Could not find field 'mFactory2' on class ");
        stringBuilder.append(LayoutInflater.class.getName());
        stringBuilder.append("; inflation may have unexpected results.");
        Log.e("LayoutInflaterCompatHC", stringBuilder.toString(), noSuchFieldException);
      } 
      b = true;
    } 
    if (a != null)
      try {
        a.set(paramLayoutInflater, paramFactory2);
        return;
      } catch (IllegalAccessException illegalAccessException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
        stringBuilder.append(paramLayoutInflater);
        stringBuilder.append("; inflation may have unexpected results.");
        Log.e("LayoutInflaterCompatHC", stringBuilder.toString(), illegalAccessException);
      }  
  }
  
  static class a extends j.a implements LayoutInflater.Factory2 {
    a(m param1m) { super(param1m); }
    
    public View onCreateView(View param1View, String param1String, Context param1Context, AttributeSet param1AttributeSet) { return this.a.a(param1View, param1String, param1Context, param1AttributeSet); }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */