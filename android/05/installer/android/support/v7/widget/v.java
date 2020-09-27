package android.support.v7.widget;

import android.content.Context;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.widget.SeekBar;

public class v extends SeekBar {
  private w a = new w(this, this.b);
  
  private l b = l.a();
  
  public v(Context paramContext, AttributeSet paramAttributeSet) { this(paramContext, paramAttributeSet, a.a.seekBarStyle); }
  
  public v(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    this.a.a(paramAttributeSet, paramInt);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */