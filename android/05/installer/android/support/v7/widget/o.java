package android.support.v7.widget;

import android.graphics.drawable.Drawable;
import android.support.v4.b.a;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.widget.ImageView;

public class o {
  private final ImageView a;
  
  private final l b;
  
  public o(ImageView paramImageView, l paraml) {
    this.a = paramImageView;
    this.b = paraml;
  }
  
  public void a(int paramInt) {
    if (paramInt != 0) {
      Drawable drawable;
      if (this.b != null) {
        drawable = this.b.a(this.a.getContext(), paramInt);
      } else {
        drawable = a.a(this.a.getContext(), paramInt);
      } 
      if (drawable != null)
        ad.a(drawable); 
      this.a.setImageDrawable(drawable);
      return;
    } 
    this.a.setImageDrawable(null);
  }
  
  public void a(AttributeSet paramAttributeSet, int paramInt) {
    ar = ar.a(this.a.getContext(), paramAttributeSet, a.k.AppCompatImageView, paramInt, 0);
    try {
      Drawable drawable = ar.b(a.k.AppCompatImageView_android_src);
      if (drawable != null)
        this.a.setImageDrawable(drawable); 
      paramInt = ar.g(a.k.AppCompatImageView_srcCompat, -1);
      if (paramInt != -1) {
        drawable = this.b.a(this.a.getContext(), paramInt);
        if (drawable != null)
          this.a.setImageDrawable(drawable); 
      } 
      drawable = this.a.getDrawable();
      if (drawable != null)
        ad.a(drawable); 
      return;
    } finally {
      ar.a();
    } 
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */