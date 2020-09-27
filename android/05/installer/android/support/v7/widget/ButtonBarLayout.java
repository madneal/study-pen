package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class ButtonBarLayout extends LinearLayout {
  private boolean a;
  
  private int b = -1;
  
  public ButtonBarLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.ButtonBarLayout);
    this.a = typedArray.getBoolean(a.k.ButtonBarLayout_allowStacking, false);
    typedArray.recycle();
  }
  
  private boolean a() { return (getOrientation() == 1); }
  
  private void setStacked(boolean paramBoolean) {
    byte b1;
    setOrientation(paramBoolean);
    if (paramBoolean != 0) {
      b1 = 5;
    } else {
      b1 = 80;
    } 
    setGravity(b1);
    View view = findViewById(a.f.spacer);
    if (view != null) {
      byte b2;
      if (paramBoolean != 0) {
        b2 = 8;
      } else {
        b2 = 4;
      } 
      view.setVisibility(b2);
    } 
    for (int i = getChildCount() - 2; i >= 0; i--)
      bringChildToFront(getChildAt(i)); 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) { // Byte code:
    //   0: iload_1
    //   1: invokestatic getSize : (I)I
    //   4: istore_3
    //   5: aload_0
    //   6: getfield a : Z
    //   9: istore #4
    //   11: iconst_0
    //   12: istore #5
    //   14: iload #4
    //   16: ifeq -> 44
    //   19: iload_3
    //   20: aload_0
    //   21: getfield b : I
    //   24: if_icmple -> 39
    //   27: aload_0
    //   28: invokespecial a : ()Z
    //   31: ifeq -> 39
    //   34: aload_0
    //   35: iconst_0
    //   36: invokespecial setStacked : (Z)V
    //   39: aload_0
    //   40: iload_3
    //   41: putfield b : I
    //   44: aload_0
    //   45: invokespecial a : ()Z
    //   48: istore #4
    //   50: iconst_1
    //   51: istore #6
    //   53: iload #4
    //   55: ifne -> 81
    //   58: iload_1
    //   59: invokestatic getMode : (I)I
    //   62: ldc 1073741824
    //   64: if_icmpne -> 81
    //   67: iload_3
    //   68: ldc -2147483648
    //   70: invokestatic makeMeasureSpec : (II)I
    //   73: istore #7
    //   75: iconst_1
    //   76: istore #8
    //   78: goto -> 87
    //   81: iload_1
    //   82: istore #7
    //   84: iconst_0
    //   85: istore #8
    //   87: aload_0
    //   88: iload #7
    //   90: iload_2
    //   91: invokespecial onMeasure : (II)V
    //   94: aload_0
    //   95: getfield a : Z
    //   98: ifeq -> 217
    //   101: aload_0
    //   102: invokespecial a : ()Z
    //   105: ifne -> 217
    //   108: getstatic android/os/Build$VERSION.SDK_INT : I
    //   111: bipush #11
    //   113: if_icmplt -> 138
    //   116: iload #5
    //   118: istore #9
    //   120: aload_0
    //   121: invokestatic e : (Landroid/view/View;)I
    //   124: ldc -16777216
    //   126: iand
    //   127: ldc 16777216
    //   129: if_icmpne -> 200
    //   132: iconst_1
    //   133: istore #9
    //   135: goto -> 200
    //   138: aload_0
    //   139: invokevirtual getChildCount : ()I
    //   142: istore #10
    //   144: iconst_0
    //   145: istore #9
    //   147: iconst_0
    //   148: istore #7
    //   150: iload #9
    //   152: iload #10
    //   154: if_icmpge -> 177
    //   157: iload #7
    //   159: aload_0
    //   160: iload #9
    //   162: invokevirtual getChildAt : (I)Landroid/view/View;
    //   165: invokevirtual getMeasuredWidth : ()I
    //   168: iadd
    //   169: istore #7
    //   171: iinc #9, 1
    //   174: goto -> 150
    //   177: iload #5
    //   179: istore #9
    //   181: iload #7
    //   183: aload_0
    //   184: invokevirtual getPaddingLeft : ()I
    //   187: iadd
    //   188: aload_0
    //   189: invokevirtual getPaddingRight : ()I
    //   192: iadd
    //   193: iload_3
    //   194: if_icmple -> 200
    //   197: goto -> 132
    //   200: iload #9
    //   202: ifeq -> 217
    //   205: aload_0
    //   206: iconst_1
    //   207: invokespecial setStacked : (Z)V
    //   210: iload #6
    //   212: istore #8
    //   214: goto -> 217
    //   217: iload #8
    //   219: ifeq -> 228
    //   222: aload_0
    //   223: iload_1
    //   224: iload_2
    //   225: invokespecial onMeasure : (II)V
    //   228: return }
  
  public void setAllowStacking(boolean paramBoolean) {
    if (this.a != paramBoolean) {
      this.a = paramBoolean;
      if (!this.a && getOrientation() == 1)
        setStacked(false); 
      requestLayout();
    } 
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/ButtonBarLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */