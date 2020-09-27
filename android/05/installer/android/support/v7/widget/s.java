package android.support.v7.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.v4.c.a.i;
import android.util.AttributeSet;
import android.widget.ProgressBar;

class s {
  private static final int[] b = { 16843067, 16843068 };
  
  final l a;
  
  private final ProgressBar c;
  
  private Bitmap d;
  
  s(ProgressBar paramProgressBar, l paraml) {
    this.c = paramProgressBar;
    this.a = paraml;
  }
  
  private Drawable a(Drawable paramDrawable) {
    AnimationDrawable animationDrawable = paramDrawable;
    if (paramDrawable instanceof AnimationDrawable) {
      AnimationDrawable animationDrawable1 = (AnimationDrawable)paramDrawable;
      int i = animationDrawable1.getNumberOfFrames();
      animationDrawable = new AnimationDrawable();
      animationDrawable.setOneShot(animationDrawable1.isOneShot());
      for (byte b1 = 0; b1 < i; b1++) {
        paramDrawable = a(animationDrawable1.getFrame(b1), true);
        paramDrawable.setLevel(10000);
        animationDrawable.addFrame(paramDrawable, animationDrawable1.getDuration(b1));
      } 
      animationDrawable.setLevel(10000);
    } 
    return animationDrawable;
  }
  
  private Drawable a(Drawable paramDrawable, boolean paramBoolean) {
    ShapeDrawable shapeDrawable;
    if (paramDrawable instanceof i) {
      i i = (i)paramDrawable;
      Drawable drawable = i.a();
      shapeDrawable = paramDrawable;
      if (drawable != null) {
        i.a(a(drawable, paramBoolean));
        return paramDrawable;
      } 
    } else {
      LayerDrawable layerDrawable;
      if (paramDrawable instanceof LayerDrawable) {
        layerDrawable = (LayerDrawable)paramDrawable;
        int i = layerDrawable.getNumberOfLayers();
        Drawable[] arrayOfDrawable = new Drawable[i];
        byte b1 = 0;
        byte b2;
        for (b2 = 0; b2 < i; b2++) {
          int j = layerDrawable.getId(b2);
          Drawable drawable = layerDrawable.getDrawable(b2);
          if (j == 16908301 || j == 16908303) {
            paramBoolean = true;
          } else {
            paramBoolean = false;
          } 
          arrayOfDrawable[b2] = a(drawable, paramBoolean);
        } 
        LayerDrawable layerDrawable1 = new LayerDrawable(arrayOfDrawable);
        for (b2 = b1; b2 < i; b2++)
          layerDrawable1.setId(b2, layerDrawable.getId(b2)); 
        return layerDrawable1;
      } 
      shapeDrawable = layerDrawable;
      if (layerDrawable instanceof BitmapDrawable) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable)layerDrawable;
        Bitmap bitmap = bitmapDrawable.getBitmap();
        if (this.d == null)
          this.d = bitmap; 
        shapeDrawable = new ShapeDrawable(b());
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
        shapeDrawable.getPaint().setShader(bitmapShader);
        shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
        if (paramBoolean)
          return new ClipDrawable(shapeDrawable, 3, 1); 
      } 
    } 
    return shapeDrawable;
  }
  
  private Shape b() { return new RoundRectShape(new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F }, null, null); }
  
  Bitmap a() { return this.d; }
  
  void a(AttributeSet paramAttributeSet, int paramInt) {
    ar ar = ar.a(this.c.getContext(), paramAttributeSet, b, paramInt, 0);
    Drawable drawable = ar.b(0);
    if (drawable != null)
      this.c.setIndeterminateDrawable(a(drawable)); 
    drawable = ar.b(1);
    if (drawable != null)
      this.c.setProgressDrawable(a(drawable, false)); 
    ar.a();
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */