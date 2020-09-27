package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.h.af;
import android.support.v7.b.a;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.aa;
import android.support.v7.widget.ag;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class ActionMenuItemView extends aa implements m.a, ActionMenuView.a, View.OnClickListener, View.OnLongClickListener {
  private h a;
  
  private CharSequence b;
  
  private Drawable c;
  
  private f.b d;
  
  private ag.b e;
  
  private b f;
  
  private boolean g;
  
  private boolean h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  public ActionMenuItemView(Context paramContext) { this(paramContext, null); }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet) { this(paramContext, paramAttributeSet, 0); }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    Resources resources = paramContext.getResources();
    this.g = resources.getBoolean(a.b.abc_config_allowActionMenuItemTextWithIcon);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.ActionMenuItemView, paramInt, 0);
    this.i = typedArray.getDimensionPixelSize(a.k.ActionMenuItemView_android_minWidth, 0);
    typedArray.recycle();
    this.k = (int)((resources.getDisplayMetrics()).density * 32.0F + 0.5F);
    setOnClickListener(this);
    setOnLongClickListener(this);
    this.j = -1;
  }
  
  private void e() { // Byte code:
    //   0: aload_0
    //   1: getfield b : Ljava/lang/CharSequence;
    //   4: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   7: istore_1
    //   8: iconst_1
    //   9: istore_2
    //   10: iload_2
    //   11: istore_3
    //   12: aload_0
    //   13: getfield c : Landroid/graphics/drawable/Drawable;
    //   16: ifnull -> 52
    //   19: aload_0
    //   20: getfield a : Landroid/support/v7/view/menu/h;
    //   23: invokevirtual m : ()Z
    //   26: ifeq -> 50
    //   29: iload_2
    //   30: istore_3
    //   31: aload_0
    //   32: getfield g : Z
    //   35: ifne -> 52
    //   38: aload_0
    //   39: getfield h : Z
    //   42: ifeq -> 50
    //   45: iload_2
    //   46: istore_3
    //   47: goto -> 52
    //   50: iconst_0
    //   51: istore_3
    //   52: iload_1
    //   53: iconst_1
    //   54: ixor
    //   55: iload_3
    //   56: iand
    //   57: ifeq -> 69
    //   60: aload_0
    //   61: getfield b : Ljava/lang/CharSequence;
    //   64: astore #4
    //   66: goto -> 72
    //   69: aconst_null
    //   70: astore #4
    //   72: aload_0
    //   73: aload #4
    //   75: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   78: return }
  
  public void a(h paramh, int paramInt) {
    this.a = paramh;
    setIcon(paramh.getIcon());
    setTitle(paramh.a(this));
    setId(paramh.getItemId());
    if (paramh.isVisible()) {
      paramInt = 0;
    } else {
      paramInt = 8;
    } 
    setVisibility(paramInt);
    setEnabled(paramh.isEnabled());
    if (paramh.hasSubMenu() && this.e == null)
      this.e = new a(this); 
  }
  
  public boolean a() { return true; }
  
  public boolean b() { return TextUtils.isEmpty(getText()) ^ true; }
  
  public boolean c() { return (b() && this.a.getIcon() == null); }
  
  public boolean d() { return b(); }
  
  public h getItemData() { return this.a; }
  
  public void onClick(View paramView) {
    if (this.d != null)
      this.d.a(this.a); 
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    if (Build.VERSION.SDK_INT >= 8)
      super.onConfigurationChanged(paramConfiguration); 
    this.g = getContext().getResources().getBoolean(a.b.abc_config_allowActionMenuItemTextWithIcon);
    e();
  }
  
  public boolean onLongClick(View paramView) {
    if (b())
      return false; 
    int[] arrayOfInt = new int[2];
    Rect rect = new Rect();
    getLocationOnScreen(arrayOfInt);
    getWindowVisibleDisplayFrame(rect);
    Context context = getContext();
    int m = getWidth();
    int n = getHeight();
    int i1 = arrayOfInt[1];
    int i2 = n / 2;
    int i3 = arrayOfInt[0] + m / 2;
    m = i3;
    if (af.d(paramView) == 0)
      m = (context.getResources().getDisplayMetrics()).widthPixels - i3; 
    Toast toast = Toast.makeText(context, this.a.getTitle(), 0);
    if (i1 + i2 < rect.height()) {
      toast.setGravity(8388661, m, arrayOfInt[1] + n - rect.top);
    } else {
      toast.setGravity(81, 0, n);
    } 
    toast.show();
    return true;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    boolean bool = b();
    if (bool && this.j >= 0)
      super.setPadding(this.j, getPaddingTop(), getPaddingRight(), getPaddingBottom()); 
    super.onMeasure(paramInt1, paramInt2);
    int m = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int n = getMeasuredWidth();
    if (m == Integer.MIN_VALUE) {
      paramInt1 = Math.min(paramInt1, this.i);
    } else {
      paramInt1 = this.i;
    } 
    if (m != 1073741824 && this.i > 0 && n < paramInt1)
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), paramInt2); 
    if (!bool && this.c != null)
      super.setPadding((getMeasuredWidth() - this.c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom()); 
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) { return (this.a.hasSubMenu() && this.e != null && this.e.onTouch(this, paramMotionEvent)) ? true : super.onTouchEvent(paramMotionEvent); }
  
  public void setCheckable(boolean paramBoolean) {}
  
  public void setChecked(boolean paramBoolean) {}
  
  public void setExpandedFormat(boolean paramBoolean) {
    if (this.h != paramBoolean) {
      this.h = paramBoolean;
      if (this.a != null)
        this.a.h(); 
    } 
  }
  
  public void setIcon(Drawable paramDrawable) {
    this.c = paramDrawable;
    if (paramDrawable != null) {
      int m = paramDrawable.getIntrinsicWidth();
      int n = paramDrawable.getIntrinsicHeight();
      int i1 = m;
      int i2 = n;
      if (m > this.k) {
        float f1 = this.k / m;
        i1 = this.k;
        i2 = (int)(n * f1);
      } 
      m = i1;
      n = i2;
      if (i2 > this.k) {
        float f1 = this.k / i2;
        n = this.k;
        m = (int)(i1 * f1);
      } 
      paramDrawable.setBounds(0, 0, m, n);
    } 
    setCompoundDrawables(paramDrawable, null, null, null);
    e();
  }
  
  public void setItemInvoker(f.b paramb) { this.d = paramb; }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.j = paramInt1;
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setPopupCallback(b paramb) { this.f = paramb; }
  
  public void setTitle(CharSequence paramCharSequence) {
    this.b = paramCharSequence;
    setContentDescription(this.b);
    e();
  }
  
  private class a extends ag.b {
    public a(ActionMenuItemView this$0) { super(this$0); }
    
    public ag a() { return (ActionMenuItemView.a(this.a) != null) ? ActionMenuItemView.a(this.a).a() : null; }
    
    protected boolean b() {
      f.b b1 = ActionMenuItemView.b(this.a);
      byte b2 = 0;
      int i = b2;
      if (b1 != null) {
        i = b2;
        if (ActionMenuItemView.b(this.a).a(ActionMenuItemView.c(this.a))) {
          ag ag = a();
          i = b2;
          if (ag != null) {
            i = b2;
            if (ag.k())
              i = 1; 
          } 
        } 
      } 
      return i;
    }
  }
  
  public static abstract class b {
    public abstract ag a();
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/view/menu/ActionMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */