package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.c.a.a;
import android.support.v4.widget.b;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.widget.CompoundButton;

class k {
  private final CompoundButton a;
  
  private final l b;
  
  private ColorStateList c = null;
  
  private PorterDuff.Mode d = null;
  
  private boolean e = false;
  
  private boolean f = false;
  
  private boolean g;
  
  k(CompoundButton paramCompoundButton, l paraml) {
    this.a = paramCompoundButton;
    this.b = paraml;
  }
  
  int a(int paramInt) {
    int i = paramInt;
    if (Build.VERSION.SDK_INT < 17) {
      Drawable drawable = b.a(this.a);
      i = paramInt;
      if (drawable != null)
        i = paramInt + drawable.getIntrinsicWidth(); 
    } 
    return i;
  }
  
  ColorStateList a() { return this.c; }
  
  void a(ColorStateList paramColorStateList) {
    this.c = paramColorStateList;
    this.e = true;
    d();
  }
  
  void a(PorterDuff.Mode paramMode) {
    this.d = paramMode;
    this.f = true;
    d();
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt) {
    typedArray = this.a.getContext().obtainStyledAttributes(paramAttributeSet, a.k.CompoundButton, paramInt, 0);
    try {
      if (typedArray.hasValue(a.k.CompoundButton_android_button)) {
        paramInt = typedArray.getResourceId(a.k.CompoundButton_android_button, 0);
        if (paramInt != 0)
          this.a.setButtonDrawable(this.b.a(this.a.getContext(), paramInt)); 
      } 
      if (typedArray.hasValue(a.k.CompoundButton_buttonTint))
        b.a(this.a, typedArray.getColorStateList(a.k.CompoundButton_buttonTint)); 
      if (typedArray.hasValue(a.k.CompoundButton_buttonTintMode))
        b.a(this.a, ad.a(typedArray.getInt(a.k.CompoundButton_buttonTintMode, -1), null)); 
      return;
    } finally {
      typedArray.recycle();
    } 
  }
  
  PorterDuff.Mode b() { return this.d; }
  
  void c() {
    if (this.g) {
      this.g = false;
      return;
    } 
    this.g = true;
    d();
  }
  
  void d() {
    Drawable drawable = b.a(this.a);
    if (drawable != null && (this.e || this.f)) {
      drawable = a.f(drawable).mutate();
      if (this.e)
        a.a(drawable, this.c); 
      if (this.f)
        a.a(drawable, this.d); 
      if (drawable.isStateful())
        drawable.setState(this.a.getDrawableState()); 
      this.a.setButtonDrawable(drawable);
    } 
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */