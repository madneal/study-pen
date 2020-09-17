package android.support.v7.widget;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

class w extends s {
  private static final int[] b = { 16843074 };
  
  private final SeekBar c;
  
  w(SeekBar paramSeekBar, l paraml) {
    super(paramSeekBar, paraml);
    this.c = paramSeekBar;
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt) {
    super.a(paramAttributeSet, paramInt);
    ar ar = ar.a(this.c.getContext(), paramAttributeSet, b, paramInt, 0);
    Drawable drawable = ar.b(0);
    if (drawable != null)
      this.c.setThumb(drawable); 
    ar.a();
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */