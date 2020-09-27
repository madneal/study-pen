package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

class b extends Drawable {
  final ActionBarContainer a;
  
  public b(ActionBarContainer paramActionBarContainer) { this.a = paramActionBarContainer; }
  
  public void draw(Canvas paramCanvas) {
    Drawable drawable;
    if (this.a.d) {
      if (this.a.c != null) {
        drawable = this.a.c;
      } else {
        return;
      } 
    } else {
      if (this.a.a != null)
        this.a.a.draw(paramCanvas); 
      if (this.a.b != null && this.a.e) {
        drawable = this.a.b;
      } else {
        return;
      } 
    } 
    drawable.draw(paramCanvas);
  }
  
  public int getOpacity() { return 0; }
  
  public void setAlpha(int paramInt) {}
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */