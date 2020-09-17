package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.b.a;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;

public class DialogTitle extends TextView {
  public DialogTitle(Context paramContext) { super(paramContext); }
  
  public DialogTitle(Context paramContext, AttributeSet paramAttributeSet) { super(paramContext, paramAttributeSet); }
  
  public DialogTitle(Context paramContext, AttributeSet paramAttributeSet, int paramInt) { super(paramContext, paramAttributeSet, paramInt); }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    Layout layout = getLayout();
    if (layout != null) {
      int i = layout.getLineCount();
      if (i > 0 && layout.getEllipsisCount(i - 1) > 0) {
        setSingleLine(false);
        setMaxLines(2);
        TypedArray typedArray = getContext().obtainStyledAttributes(null, a.k.TextAppearance, 16842817, 16973892);
        i = typedArray.getDimensionPixelSize(a.k.TextAppearance_android_textSize, 0);
        if (i != 0)
          setTextSize(0, i); 
        typedArray.recycle();
        super.onMeasure(paramInt1, paramInt2);
      } 
    } 
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/DialogTitle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */