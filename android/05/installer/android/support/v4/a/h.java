package android.support.v4.a;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

abstract class h extends Activity {
  abstract View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet);
  
  void a_() { finish(); }
  
  protected void onCreate(Bundle paramBundle) {
    if (Build.VERSION.SDK_INT < 11 && getLayoutInflater().getFactory() == null)
      getLayoutInflater().setFactory(this); 
    super.onCreate(paramBundle);
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    View view = a(null, paramString, paramContext, paramAttributeSet);
    return (view == null) ? super.onCreateView(paramString, paramContext, paramAttributeSet) : view;
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */