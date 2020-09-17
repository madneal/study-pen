package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

class z extends y {
  private static final int[] b = { 16843666, 16843667 };
  
  private ap c;
  
  private ap d;
  
  z(TextView paramTextView) { super(paramTextView); }
  
  void a() {
    super.a();
    if (this.c != null || this.d != null) {
      Drawable[] arrayOfDrawable = this.a.getCompoundDrawablesRelative();
      a(arrayOfDrawable[0], this.c);
      a(arrayOfDrawable[2], this.d);
    } 
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt) {
    super.a(paramAttributeSet, paramInt);
    Context context = this.a.getContext();
    l l = l.a();
    TypedArray typedArray = context.obtainStyledAttributes(paramAttributeSet, b, paramInt, 0);
    if (typedArray.hasValue(0))
      this.c = a(context, l, typedArray.getResourceId(0, 0)); 
    if (typedArray.hasValue(1))
      this.d = a(context, l, typedArray.getResourceId(1, 0)); 
    typedArray.recycle();
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */