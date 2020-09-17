package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.h.af;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.view.View;

class g {
  private final View a;
  
  private final l b;
  
  private ap c;
  
  private ap d;
  
  private ap e;
  
  g(View paramView, l paraml) {
    this.a = paramView;
    this.b = paraml;
  }
  
  private boolean b(Drawable paramDrawable) {
    if (this.e == null)
      this.e = new ap(); 
    ap ap1 = this.e;
    ap1.a();
    ColorStateList colorStateList = af.n(this.a);
    if (colorStateList != null) {
      ap1.d = true;
      ap1.a = colorStateList;
    } 
    PorterDuff.Mode mode = af.o(this.a);
    if (mode != null) {
      ap1.c = true;
      ap1.b = mode;
    } 
    if (ap1.d || ap1.c) {
      l.a(paramDrawable, ap1, this.a.getDrawableState());
      return true;
    } 
    return false;
  }
  
  ColorStateList a() { return (this.d != null) ? this.d.a : null; }
  
  void a(int paramInt) {
    ColorStateList colorStateList;
    if (this.b != null) {
      colorStateList = this.b.b(this.a.getContext(), paramInt);
    } else {
      colorStateList = null;
    } 
    b(colorStateList);
  }
  
  void a(ColorStateList paramColorStateList) {
    if (this.d == null)
      this.d = new ap(); 
    this.d.a = paramColorStateList;
    this.d.d = true;
    c();
  }
  
  void a(PorterDuff.Mode paramMode) {
    if (this.d == null)
      this.d = new ap(); 
    this.d.b = paramMode;
    this.d.c = true;
    c();
  }
  
  void a(Drawable paramDrawable) { b(null); }
  
  void a(AttributeSet paramAttributeSet, int paramInt) {
    typedArray = this.a.getContext().obtainStyledAttributes(paramAttributeSet, a.k.ViewBackgroundHelper, paramInt, 0);
    try {
      if (typedArray.hasValue(a.k.ViewBackgroundHelper_android_background)) {
        ColorStateList colorStateList = this.b.b(this.a.getContext(), typedArray.getResourceId(a.k.ViewBackgroundHelper_android_background, -1));
        if (colorStateList != null)
          b(colorStateList); 
      } 
      if (typedArray.hasValue(a.k.ViewBackgroundHelper_backgroundTint))
        af.a(this.a, typedArray.getColorStateList(a.k.ViewBackgroundHelper_backgroundTint)); 
      if (typedArray.hasValue(a.k.ViewBackgroundHelper_backgroundTintMode))
        af.a(this.a, ad.a(typedArray.getInt(a.k.ViewBackgroundHelper_backgroundTintMode, -1), null)); 
      return;
    } finally {
      typedArray.recycle();
    } 
  }
  
  PorterDuff.Mode b() { return (this.d != null) ? this.d.b : null; }
  
  void b(ColorStateList paramColorStateList) {
    if (paramColorStateList != null) {
      if (this.c == null)
        this.c = new ap(); 
      this.c.a = paramColorStateList;
      this.c.d = true;
    } else {
      this.c = null;
    } 
    c();
  }
  
  void c() {
    Drawable drawable = this.a.getBackground();
    if (drawable != null) {
      ap ap1;
      if (Build.VERSION.SDK_INT == 21 && b(drawable))
        return; 
      if (this.d != null) {
        ap1 = this.d;
      } else if (this.c != null) {
        ap1 = this.c;
      } else {
        return;
      } 
      l.a(drawable, ap1, this.a.getDrawableState());
      return;
    } 
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */