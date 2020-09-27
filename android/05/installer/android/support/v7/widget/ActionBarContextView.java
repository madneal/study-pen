package android.support.v7.widget;

import android.content.Context;
import android.os.Build;
import android.support.v4.h.au;
import android.support.v7.b.a;
import android.support.v7.view.b;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView extends a {
  private CharSequence g;
  
  private CharSequence h;
  
  private View i;
  
  private View j;
  
  private LinearLayout k;
  
  private TextView l;
  
  private TextView m;
  
  private int n;
  
  private int o;
  
  private boolean p;
  
  private int q;
  
  public ActionBarContextView(Context paramContext) { this(paramContext, null); }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet) { this(paramContext, paramAttributeSet, a.a.actionModeStyle); }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    ar ar = ar.a(paramContext, paramAttributeSet, a.k.ActionMode, paramInt, 0);
    setBackgroundDrawable(ar.a(a.k.ActionMode_background));
    this.n = ar.g(a.k.ActionMode_titleTextStyle, 0);
    this.o = ar.g(a.k.ActionMode_subtitleTextStyle, 0);
    this.e = ar.f(a.k.ActionMode_height, 0);
    this.q = ar.g(a.k.ActionMode_closeItemLayout, a.h.abc_action_mode_close_item_material);
    ar.a();
  }
  
  private void e() { // Byte code:
    //   0: aload_0
    //   1: getfield k : Landroid/widget/LinearLayout;
    //   4: ifnonnull -> 117
    //   7: aload_0
    //   8: invokevirtual getContext : ()Landroid/content/Context;
    //   11: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   14: getstatic android/support/v7/b/a$h.abc_action_bar_title_item : I
    //   17: aload_0
    //   18: invokevirtual inflate : (ILandroid/view/ViewGroup;)Landroid/view/View;
    //   21: pop
    //   22: aload_0
    //   23: aload_0
    //   24: aload_0
    //   25: invokevirtual getChildCount : ()I
    //   28: iconst_1
    //   29: isub
    //   30: invokevirtual getChildAt : (I)Landroid/view/View;
    //   33: checkcast android/widget/LinearLayout
    //   36: putfield k : Landroid/widget/LinearLayout;
    //   39: aload_0
    //   40: aload_0
    //   41: getfield k : Landroid/widget/LinearLayout;
    //   44: getstatic android/support/v7/b/a$f.action_bar_title : I
    //   47: invokevirtual findViewById : (I)Landroid/view/View;
    //   50: checkcast android/widget/TextView
    //   53: putfield l : Landroid/widget/TextView;
    //   56: aload_0
    //   57: aload_0
    //   58: getfield k : Landroid/widget/LinearLayout;
    //   61: getstatic android/support/v7/b/a$f.action_bar_subtitle : I
    //   64: invokevirtual findViewById : (I)Landroid/view/View;
    //   67: checkcast android/widget/TextView
    //   70: putfield m : Landroid/widget/TextView;
    //   73: aload_0
    //   74: getfield n : I
    //   77: ifeq -> 95
    //   80: aload_0
    //   81: getfield l : Landroid/widget/TextView;
    //   84: aload_0
    //   85: invokevirtual getContext : ()Landroid/content/Context;
    //   88: aload_0
    //   89: getfield n : I
    //   92: invokevirtual setTextAppearance : (Landroid/content/Context;I)V
    //   95: aload_0
    //   96: getfield o : I
    //   99: ifeq -> 117
    //   102: aload_0
    //   103: getfield m : Landroid/widget/TextView;
    //   106: aload_0
    //   107: invokevirtual getContext : ()Landroid/content/Context;
    //   110: aload_0
    //   111: getfield o : I
    //   114: invokevirtual setTextAppearance : (Landroid/content/Context;I)V
    //   117: aload_0
    //   118: getfield l : Landroid/widget/TextView;
    //   121: aload_0
    //   122: getfield g : Ljava/lang/CharSequence;
    //   125: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   128: aload_0
    //   129: getfield m : Landroid/widget/TextView;
    //   132: aload_0
    //   133: getfield h : Ljava/lang/CharSequence;
    //   136: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   139: aload_0
    //   140: getfield g : Ljava/lang/CharSequence;
    //   143: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   146: istore_1
    //   147: aload_0
    //   148: getfield h : Ljava/lang/CharSequence;
    //   151: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   154: iconst_1
    //   155: ixor
    //   156: istore_2
    //   157: aload_0
    //   158: getfield m : Landroid/widget/TextView;
    //   161: astore_3
    //   162: bipush #8
    //   164: istore #4
    //   166: iload_2
    //   167: ifeq -> 176
    //   170: iconst_0
    //   171: istore #5
    //   173: goto -> 180
    //   176: bipush #8
    //   178: istore #5
    //   180: aload_3
    //   181: iload #5
    //   183: invokevirtual setVisibility : (I)V
    //   186: aload_0
    //   187: getfield k : Landroid/widget/LinearLayout;
    //   190: astore_3
    //   191: iload_1
    //   192: iconst_1
    //   193: ixor
    //   194: ifne -> 205
    //   197: iload #4
    //   199: istore #5
    //   201: iload_2
    //   202: ifeq -> 208
    //   205: iconst_0
    //   206: istore #5
    //   208: aload_3
    //   209: iload #5
    //   211: invokevirtual setVisibility : (I)V
    //   214: aload_0
    //   215: getfield k : Landroid/widget/LinearLayout;
    //   218: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   221: ifnonnull -> 232
    //   224: aload_0
    //   225: aload_0
    //   226: getfield k : Landroid/widget/LinearLayout;
    //   229: invokevirtual addView : (Landroid/view/View;)V
    //   232: return }
  
  public void a(b paramb) { // Byte code:
    //   0: aload_0
    //   1: getfield i : Landroid/view/View;
    //   4: ifnonnull -> 38
    //   7: aload_0
    //   8: aload_0
    //   9: invokevirtual getContext : ()Landroid/content/Context;
    //   12: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   15: aload_0
    //   16: getfield q : I
    //   19: aload_0
    //   20: iconst_0
    //   21: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   24: putfield i : Landroid/view/View;
    //   27: aload_0
    //   28: aload_0
    //   29: getfield i : Landroid/view/View;
    //   32: invokevirtual addView : (Landroid/view/View;)V
    //   35: goto -> 51
    //   38: aload_0
    //   39: getfield i : Landroid/view/View;
    //   42: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   45: ifnonnull -> 51
    //   48: goto -> 27
    //   51: aload_0
    //   52: getfield i : Landroid/view/View;
    //   55: getstatic android/support/v7/b/a$f.action_mode_close_button : I
    //   58: invokevirtual findViewById : (I)Landroid/view/View;
    //   61: new android/support/v7/widget/ActionBarContextView$1
    //   64: dup
    //   65: aload_0
    //   66: aload_1
    //   67: invokespecial <init> : (Landroid/support/v7/widget/ActionBarContextView;Landroid/support/v7/view/b;)V
    //   70: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   73: aload_1
    //   74: invokevirtual b : ()Landroid/view/Menu;
    //   77: checkcast android/support/v7/view/menu/f
    //   80: astore_2
    //   81: aload_0
    //   82: getfield d : Landroid/support/v7/widget/d;
    //   85: ifnull -> 96
    //   88: aload_0
    //   89: getfield d : Landroid/support/v7/widget/d;
    //   92: invokevirtual f : ()Z
    //   95: pop
    //   96: aload_0
    //   97: new android/support/v7/widget/d
    //   100: dup
    //   101: aload_0
    //   102: invokevirtual getContext : ()Landroid/content/Context;
    //   105: invokespecial <init> : (Landroid/content/Context;)V
    //   108: putfield d : Landroid/support/v7/widget/d;
    //   111: aload_0
    //   112: getfield d : Landroid/support/v7/widget/d;
    //   115: iconst_1
    //   116: invokevirtual c : (Z)V
    //   119: new android/view/ViewGroup$LayoutParams
    //   122: dup
    //   123: bipush #-2
    //   125: iconst_m1
    //   126: invokespecial <init> : (II)V
    //   129: astore_1
    //   130: aload_2
    //   131: aload_0
    //   132: getfield d : Landroid/support/v7/widget/d;
    //   135: aload_0
    //   136: getfield b : Landroid/content/Context;
    //   139: invokevirtual a : (Landroid/support/v7/view/menu/l;Landroid/content/Context;)V
    //   142: aload_0
    //   143: aload_0
    //   144: getfield d : Landroid/support/v7/widget/d;
    //   147: aload_0
    //   148: invokevirtual a : (Landroid/view/ViewGroup;)Landroid/support/v7/view/menu/m;
    //   151: checkcast android/support/v7/widget/ActionMenuView
    //   154: putfield c : Landroid/support/v7/widget/ActionMenuView;
    //   157: aload_0
    //   158: getfield c : Landroid/support/v7/widget/ActionMenuView;
    //   161: aconst_null
    //   162: invokevirtual setBackgroundDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   165: aload_0
    //   166: aload_0
    //   167: getfield c : Landroid/support/v7/widget/ActionMenuView;
    //   170: aload_1
    //   171: invokevirtual addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   174: return }
  
  public boolean a() { return (this.d != null) ? this.d.d() : 0; }
  
  public void b() {
    if (this.i == null)
      c(); 
  }
  
  public void c() {
    removeAllViews();
    this.j = null;
    this.c = null;
  }
  
  public boolean d() { return this.p; }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams() { return new ViewGroup.MarginLayoutParams(-1, -2); }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) { return new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet); }
  
  public CharSequence getSubtitle() { return this.h; }
  
  public CharSequence getTitle() { return this.g; }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    if (this.d != null) {
      this.d.e();
      this.d.g();
    } 
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    if (Build.VERSION.SDK_INT >= 14) {
      if (paramAccessibilityEvent.getEventType() == 32) {
        paramAccessibilityEvent.setSource(this);
        paramAccessibilityEvent.setClassName(getClass().getName());
        paramAccessibilityEvent.setPackageName(getContext().getPackageName());
        paramAccessibilityEvent.setContentDescription(this.g);
        return;
      } 
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    } 
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i1;
    paramBoolean = au.a(this);
    if (paramBoolean) {
      i1 = paramInt3 - paramInt1 - getPaddingRight();
    } else {
      i1 = getPaddingLeft();
    } 
    int i2 = getPaddingTop();
    int i3 = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
    if (this.i != null && this.i.getVisibility() != 8) {
      ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.i.getLayoutParams();
      if (paramBoolean) {
        paramInt2 = marginLayoutParams.rightMargin;
      } else {
        paramInt2 = marginLayoutParams.leftMargin;
      } 
      if (paramBoolean) {
        paramInt4 = marginLayoutParams.leftMargin;
      } else {
        paramInt4 = marginLayoutParams.rightMargin;
      } 
      paramInt2 = a(i1, paramInt2, paramBoolean);
      paramInt2 = a(paramInt2 + a(this.i, paramInt2, i2, i3, paramBoolean), paramInt4, paramBoolean);
    } else {
      paramInt2 = i1;
    } 
    paramInt4 = paramInt2;
    if (this.k != null) {
      paramInt4 = paramInt2;
      if (this.j == null) {
        paramInt4 = paramInt2;
        if (this.k.getVisibility() != 8)
          paramInt4 = paramInt2 + a(this.k, paramInt2, i2, i3, paramBoolean); 
      } 
    } 
    if (this.j != null)
      a(this.j, paramInt4, i2, i3, paramBoolean); 
    if (paramBoolean) {
      paramInt1 = getPaddingLeft();
    } else {
      paramInt1 = paramInt3 - paramInt1 - getPaddingRight();
    } 
    if (this.c != null)
      a(this.c, paramInt1, i2, i3, paramBoolean ^ true); 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = 1073741824;
    if (i1 != 1073741824) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(getClass().getSimpleName());
      stringBuilder.append(" can only be used ");
      stringBuilder.append("with android:layout_width=\"match_parent\" (or fill_parent)");
      throw new IllegalStateException(stringBuilder.toString());
    } 
    if (View.MeasureSpec.getMode(paramInt2) == 0) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(getClass().getSimpleName());
      stringBuilder.append(" can only be used ");
      stringBuilder.append("with android:layout_height=\"wrap_content\"");
      throw new IllegalStateException(stringBuilder.toString());
    } 
    int i3 = View.MeasureSpec.getSize(paramInt1);
    if (this.e > 0) {
      i1 = this.e;
    } else {
      i1 = View.MeasureSpec.getSize(paramInt2);
    } 
    int i4 = getPaddingTop() + getPaddingBottom();
    paramInt1 = i3 - getPaddingLeft() - getPaddingRight();
    int i5 = i1 - i4;
    int i6 = View.MeasureSpec.makeMeasureSpec(i5, -2147483648);
    View view = this.i;
    int i7 = 0;
    paramInt2 = paramInt1;
    if (view != null) {
      paramInt1 = a(this.i, paramInt1, i6, 0);
      ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.i.getLayoutParams();
      paramInt2 = paramInt1 - marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    } 
    paramInt1 = paramInt2;
    if (this.c != null) {
      paramInt1 = paramInt2;
      if (this.c.getParent() == this)
        paramInt1 = a(this.c, paramInt2, i6, 0); 
    } 
    paramInt2 = paramInt1;
    if (this.k != null) {
      paramInt2 = paramInt1;
      if (this.j == null)
        if (this.p) {
          paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 0);
          this.k.measure(paramInt2, i6);
          int i8 = this.k.getMeasuredWidth();
          if (i8 <= paramInt1) {
            i6 = 1;
          } else {
            i6 = 0;
          } 
          paramInt2 = paramInt1;
          if (i6 != 0)
            paramInt2 = paramInt1 - i8; 
          LinearLayout linearLayout = this.k;
          if (i6 != 0) {
            paramInt1 = 0;
          } else {
            paramInt1 = 8;
          } 
          linearLayout.setVisibility(paramInt1);
        } else {
          paramInt2 = a(this.k, paramInt1, i6, 0);
        }  
    } 
    if (this.j != null) {
      ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
      if (layoutParams.width != -2) {
        paramInt1 = 1073741824;
      } else {
        paramInt1 = Integer.MIN_VALUE;
      } 
      i6 = paramInt2;
      if (layoutParams.width >= 0)
        i6 = Math.min(layoutParams.width, paramInt2); 
      if (layoutParams.height != -2) {
        paramInt2 = i2;
      } else {
        paramInt2 = Integer.MIN_VALUE;
      } 
      i2 = i5;
      if (layoutParams.height >= 0)
        i2 = Math.min(layoutParams.height, i5); 
      this.j.measure(View.MeasureSpec.makeMeasureSpec(i6, paramInt1), View.MeasureSpec.makeMeasureSpec(i2, paramInt2));
    } 
    if (this.e <= 0) {
      i2 = getChildCount();
      i1 = 0;
      paramInt1 = i7;
      while (paramInt1 < i2) {
        i6 = getChildAt(paramInt1).getMeasuredHeight() + i4;
        paramInt2 = i1;
        if (i6 > i1)
          paramInt2 = i6; 
        paramInt1++;
        i1 = paramInt2;
      } 
      setMeasuredDimension(i3, i1);
      return;
    } 
    setMeasuredDimension(i3, i1);
  }
  
  public void setContentHeight(int paramInt) { this.e = paramInt; }
  
  public void setCustomView(View paramView) {
    if (this.j != null)
      removeView(this.j); 
    this.j = paramView;
    if (paramView != null && this.k != null) {
      removeView(this.k);
      this.k = null;
    } 
    if (paramView != null)
      addView(paramView); 
    requestLayout();
  }
  
  public void setSubtitle(CharSequence paramCharSequence) {
    this.h = paramCharSequence;
    e();
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    this.g = paramCharSequence;
    e();
  }
  
  public void setTitleOptional(boolean paramBoolean) {
    if (paramBoolean != this.p)
      requestLayout(); 
    this.p = paramBoolean;
  }
  
  public boolean shouldDelayChildPressedState() { return false; }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/ActionBarContextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */