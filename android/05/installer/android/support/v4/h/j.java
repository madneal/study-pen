package android.support.v4.h;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

class j {
  static m a(LayoutInflater paramLayoutInflater) {
    LayoutInflater.Factory factory = paramLayoutInflater.getFactory();
    return (factory instanceof a) ? ((a)factory).a : null;
  }
  
  static void a(LayoutInflater paramLayoutInflater, m paramm) {
    if (paramm != null) {
      a a = new a(paramm);
    } else {
      paramm = null;
    } 
    paramLayoutInflater.setFactory(paramm);
  }
  
  static class a implements LayoutInflater.Factory {
    final m a;
    
    a(m param1m) { this.a = param1m; }
    
    public View onCreateView(String param1String, Context param1Context, AttributeSet param1AttributeSet) { return this.a.a(null, param1String, param1Context, param1AttributeSet); }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(getClass().getName());
      stringBuilder.append("{");
      stringBuilder.append(this.a);
      stringBuilder.append("}");
      return stringBuilder.toString();
    }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */