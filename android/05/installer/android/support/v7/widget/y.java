package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.b.a;
import android.support.v7.d.a;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

class y {
  private static final int[] b = { 16842804, 16843119, 16843117, 16843120, 16843118 };
  
  private static final int[] c = { a.a.textAllCaps };
  
  final TextView a;
  
  private ap d;
  
  private ap e;
  
  private ap f;
  
  private ap g;
  
  y(TextView paramTextView) { this.a = paramTextView; }
  
  protected static ap a(Context paramContext, l paraml, int paramInt) {
    ColorStateList colorStateList = paraml.b(paramContext, paramInt);
    if (colorStateList != null) {
      ap ap1 = new ap();
      ap1.d = true;
      ap1.a = colorStateList;
      return ap1;
    } 
    return null;
  }
  
  static y a(TextView paramTextView) { return (Build.VERSION.SDK_INT >= 17) ? new z(paramTextView) : new y(paramTextView); }
  
  void a() {
    if (this.d != null || this.e != null || this.f != null || this.g != null) {
      Drawable[] arrayOfDrawable = this.a.getCompoundDrawables();
      a(arrayOfDrawable[0], this.d);
      a(arrayOfDrawable[1], this.e);
      a(arrayOfDrawable[2], this.f);
      a(arrayOfDrawable[3], this.g);
    } 
  }
  
  void a(Context paramContext, int paramInt) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramInt, c);
    if (typedArray.hasValue(0))
      a(typedArray.getBoolean(0, false)); 
    typedArray.recycle();
  }
  
  final void a(Drawable paramDrawable, ap paramap) {
    if (paramDrawable != null && paramap != null)
      l.a(paramDrawable, paramap, this.a.getDrawableState()); 
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt) {
    Context context = this.a.getContext();
    l l = l.a();
    TypedArray typedArray = context.obtainStyledAttributes(paramAttributeSet, b, paramInt, 0);
    int i = typedArray.getResourceId(0, -1);
    if (typedArray.hasValue(1))
      this.d = a(context, l, typedArray.getResourceId(1, 0)); 
    if (typedArray.hasValue(2))
      this.e = a(context, l, typedArray.getResourceId(2, 0)); 
    if (typedArray.hasValue(3))
      this.f = a(context, l, typedArray.getResourceId(3, 0)); 
    if (typedArray.hasValue(4))
      this.g = a(context, l, typedArray.getResourceId(4, 0)); 
    typedArray.recycle();
    if (!(this.a.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod)) {
      boolean bool;
      if (i != -1) {
        typedArray = context.obtainStyledAttributes(i, a.k.TextAppearance);
        if (typedArray.hasValue(a.k.TextAppearance_textAllCaps)) {
          bool = typedArray.getBoolean(a.k.TextAppearance_textAllCaps, false);
          i = 1;
        } else {
          i = 0;
          bool = false;
        } 
        typedArray.recycle();
      } else {
        i = 0;
        bool = false;
      } 
      TypedArray typedArray1 = context.obtainStyledAttributes(paramAttributeSet, c, paramInt, 0);
      if (typedArray1.hasValue(0)) {
        bool = typedArray1.getBoolean(0, false);
        i = 1;
      } 
      typedArray1.recycle();
      if (i != 0)
        a(bool); 
    } 
  }
  
  void a(boolean paramBoolean) {
    TransformationMethod transformationMethod;
    TextView textView = this.a;
    if (paramBoolean) {
      transformationMethod = new a(this.a.getContext());
    } else {
      transformationMethod = null;
    } 
    textView.setTransformationMethod(transformationMethod);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */