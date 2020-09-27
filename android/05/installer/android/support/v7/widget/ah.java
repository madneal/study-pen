package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.c.a.a;
import android.support.v7.c.a.a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

public class ah extends ListView {
  private static final int[] g = { 0 };
  
  final Rect a = new Rect();
  
  int b = 0;
  
  int c = 0;
  
  int d = 0;
  
  int e = 0;
  
  protected int f;
  
  private Field h;
  
  private a i;
  
  public ah(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    try {
      this.h = android.widget.AbsListView.class.getDeclaredField("mIsChildViewEnabled");
      this.h.setAccessible(true);
      return;
    } catch (NoSuchFieldException paramContext) {
      paramContext.printStackTrace();
      return;
    } 
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    paramInt3 = getListPaddingTop();
    paramInt2 = getListPaddingBottom();
    getListPaddingLeft();
    getListPaddingRight();
    int j = getDividerHeight();
    Drawable drawable = getDivider();
    ListAdapter listAdapter = getAdapter();
    if (listAdapter == null)
      return paramInt3 + paramInt2; 
    if (j <= 0 || drawable == null)
      j = 0; 
    int k = listAdapter.getCount();
    paramInt3 += paramInt2;
    drawable = null;
    byte b1 = 0;
    int m = 0;
    for (paramInt2 = 0; b1 < k; paramInt2 = n) {
      int n = listAdapter.getItemViewType(b1);
      int i1 = m;
      if (n != m) {
        drawable = null;
        i1 = n;
      } 
      View view2 = listAdapter.getView(b1, drawable, this);
      ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
      ViewGroup.LayoutParams layoutParams1 = layoutParams2;
      if (layoutParams2 == null) {
        layoutParams1 = generateDefaultLayoutParams();
        view2.setLayoutParams(layoutParams1);
      } 
      if (layoutParams1.height > 0) {
        m = View.MeasureSpec.makeMeasureSpec(layoutParams1.height, 1073741824);
      } else {
        m = View.MeasureSpec.makeMeasureSpec(0, 0);
      } 
      view2.measure(paramInt1, m);
      view2.forceLayout();
      m = paramInt3;
      if (b1 > 0)
        m = paramInt3 + j; 
      paramInt3 = m + view2.getMeasuredHeight();
      if (paramInt3 >= paramInt4) {
        paramInt1 = paramInt4;
        if (paramInt5 >= 0) {
          paramInt1 = paramInt4;
          if (b1 > paramInt5) {
            paramInt1 = paramInt4;
            if (paramInt2 > 0) {
              paramInt1 = paramInt4;
              if (paramInt3 != paramInt4)
                paramInt1 = paramInt2; 
            } 
          } 
        } 
        return paramInt1;
      } 
      n = paramInt2;
      if (paramInt5 >= 0) {
        n = paramInt2;
        if (b1 >= paramInt5)
          n = paramInt3; 
      } 
      b1++;
      m = i1;
      View view1 = view2;
    } 
    return paramInt3;
  }
  
  protected void a(int paramInt, View paramView) {
    boolean bool1;
    Drawable drawable = getSelector();
    boolean bool = true;
    if (drawable != null && paramInt != -1) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (bool1)
      drawable.setVisible(false, false); 
    b(paramInt, paramView);
    if (bool1) {
      Rect rect = this.a;
      float f1 = rect.exactCenterX();
      float f2 = rect.exactCenterY();
      if (getVisibility() != 0)
        bool = false; 
      drawable.setVisible(bool, false);
      a.a(drawable, f1, f2);
    } 
  }
  
  protected void a(int paramInt, View paramView, float paramFloat1, float paramFloat2) {
    a(paramInt, paramView);
    Drawable drawable = getSelector();
    if (drawable != null && paramInt != -1)
      a.a(drawable, paramFloat1, paramFloat2); 
  }
  
  protected void a(Canvas paramCanvas) {
    if (!this.a.isEmpty()) {
      Drawable drawable = getSelector();
      if (drawable != null) {
        drawable.setBounds(this.a);
        drawable.draw(paramCanvas);
      } 
    } 
  }
  
  protected boolean a() { return false; }
  
  protected void b() {
    Drawable drawable = getSelector();
    if (drawable != null && c())
      drawable.setState(getDrawableState()); 
  }
  
  protected void b(int paramInt, View paramView) {
    Rect rect = this.a;
    rect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
    rect.left -= this.b;
    rect.top -= this.c;
    rect.right += this.d;
    rect.bottom += this.e;
    try {
      boolean bool = this.h.getBoolean(this);
      if (paramView.isEnabled() != bool) {
        this.h.set(this, Boolean.valueOf(bool ^ true));
        if (paramInt != -1) {
          refreshDrawableState();
          return;
        } 
      } 
    } catch (IllegalAccessException paramView) {
      paramView.printStackTrace();
    } 
  }
  
  protected boolean c() { return (a() && isPressed()); }
  
  protected void dispatchDraw(Canvas paramCanvas) {
    a(paramCanvas);
    super.dispatchDraw(paramCanvas);
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    setSelectorEnabled(true);
    b();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (paramMotionEvent.getAction() == 0)
      this.f = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()); 
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setSelector(Drawable paramDrawable) {
    if (paramDrawable != null) {
      rect = new a(paramDrawable);
    } else {
      rect = null;
    } 
    this.i = rect;
    super.setSelector(this.i);
    Rect rect = new Rect();
    if (paramDrawable != null)
      paramDrawable.getPadding(rect); 
    this.b = rect.left;
    this.c = rect.top;
    this.d = rect.right;
    this.e = rect.bottom;
  }
  
  protected void setSelectorEnabled(boolean paramBoolean) {
    if (this.i != null)
      this.i.a(paramBoolean); 
  }
  
  private static class a extends a {
    private boolean a = true;
    
    public a(Drawable param1Drawable) { super(param1Drawable); }
    
    void a(boolean param1Boolean) { this.a = param1Boolean; }
    
    public void draw(Canvas param1Canvas) {
      if (this.a)
        super.draw(param1Canvas); 
    }
    
    public void setHotspot(float param1Float1, float param1Float2) {
      if (this.a)
        super.setHotspot(param1Float1, param1Float2); 
    }
    
    public void setHotspotBounds(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      if (this.a)
        super.setHotspotBounds(param1Int1, param1Int2, param1Int3, param1Int4); 
    }
    
    public boolean setState(int[] param1ArrayOfInt) { return this.a ? super.setState(param1ArrayOfInt) : 0; }
    
    public boolean setVisible(boolean param1Boolean1, boolean param1Boolean2) { return this.a ? super.setVisible(param1Boolean1, param1Boolean2) : 0; }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */