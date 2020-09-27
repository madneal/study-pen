package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.a.a;
import android.support.v7.b.a;
import android.support.v7.view.a;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ak extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
  private static final Interpolator j = new DecelerateInterpolator();
  
  Runnable a;
  
  int b;
  
  int c;
  
  private b d;
  
  private af e;
  
  private Spinner f;
  
  private boolean g;
  
  private int h;
  
  private int i;
  
  private c a(a.c paramc, boolean paramBoolean) {
    c c1 = new c(this, getContext(), paramc, paramBoolean);
    if (paramBoolean) {
      c1.setBackgroundDrawable(null);
      c1.setLayoutParams(new AbsListView.LayoutParams(-1, this.h));
      return c1;
    } 
    c1.setFocusable(true);
    if (this.d == null)
      this.d = new b(this, null); 
    c1.setOnClickListener(this.d);
    return c1;
  }
  
  private boolean a() { return (this.f != null && this.f.getParent() == this); }
  
  private void b() {
    if (a())
      return; 
    if (this.f == null)
      this.f = d(); 
    removeView(this.e);
    addView(this.f, new ViewGroup.LayoutParams(-2, -1));
    if (this.f.getAdapter() == null)
      this.f.setAdapter(new a(this, null)); 
    if (this.a != null) {
      removeCallbacks(this.a);
      this.a = null;
    } 
    this.f.setSelection(this.i);
  }
  
  private boolean c() {
    if (!a())
      return false; 
    removeView(this.f);
    addView(this.e, new ViewGroup.LayoutParams(-2, -1));
    setTabSelected(this.f.getSelectedItemPosition());
    return false;
  }
  
  private Spinner d() {
    x x = new x(getContext(), null, a.a.actionDropDownStyle);
    x.setLayoutParams(new af.a(-2, -1));
    x.setOnItemSelectedListener(this);
    return x;
  }
  
  public void a(int paramInt) {
    View view = this.e.getChildAt(paramInt);
    if (this.a != null)
      removeCallbacks(this.a); 
    this.a = new Runnable(this, view) {
        public void run() {
          int i = this.a.getLeft();
          int j = (this.b.getWidth() - this.a.getWidth()) / 2;
          this.b.smoothScrollTo(i - j, 0);
          this.b.a = null;
        }
      };
    post(this.a);
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    if (this.a != null)
      post(this.a); 
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration) {
    if (Build.VERSION.SDK_INT >= 8)
      super.onConfigurationChanged(paramConfiguration); 
    a a1 = a.a(getContext());
    setContentHeight(a1.e());
    this.c = a1.g();
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    if (this.a != null)
      removeCallbacks(this.a); 
  }
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong) { ((c)paramView).b().d(); }
  
  public void onMeasure(int paramInt1, int paramInt2) { // Byte code:
    //   0: iload_1
    //   1: invokestatic getMode : (I)I
    //   4: istore_3
    //   5: iconst_1
    //   6: istore #4
    //   8: iload_3
    //   9: ldc 1073741824
    //   11: if_icmpne -> 20
    //   14: iconst_1
    //   15: istore #5
    //   17: goto -> 23
    //   20: iconst_0
    //   21: istore #5
    //   23: aload_0
    //   24: iload #5
    //   26: invokevirtual setFillViewport : (Z)V
    //   29: aload_0
    //   30: getfield e : Landroid/support/v7/widget/af;
    //   33: invokevirtual getChildCount : ()I
    //   36: istore_2
    //   37: iload_2
    //   38: iconst_1
    //   39: if_icmple -> 100
    //   42: iload_3
    //   43: ldc 1073741824
    //   45: if_icmpeq -> 54
    //   48: iload_3
    //   49: ldc -2147483648
    //   51: if_icmpne -> 100
    //   54: iload_2
    //   55: iconst_2
    //   56: if_icmple -> 75
    //   59: aload_0
    //   60: iload_1
    //   61: invokestatic getSize : (I)I
    //   64: i2f
    //   65: ldc 0.4
    //   67: fmul
    //   68: f2i
    //   69: putfield b : I
    //   72: goto -> 85
    //   75: aload_0
    //   76: iload_1
    //   77: invokestatic getSize : (I)I
    //   80: iconst_2
    //   81: idiv
    //   82: putfield b : I
    //   85: aload_0
    //   86: getfield b : I
    //   89: aload_0
    //   90: getfield c : I
    //   93: invokestatic min : (II)I
    //   96: istore_2
    //   97: goto -> 102
    //   100: iconst_m1
    //   101: istore_2
    //   102: aload_0
    //   103: iload_2
    //   104: putfield b : I
    //   107: aload_0
    //   108: getfield h : I
    //   111: ldc 1073741824
    //   113: invokestatic makeMeasureSpec : (II)I
    //   116: istore_3
    //   117: iload #5
    //   119: ifne -> 135
    //   122: aload_0
    //   123: getfield g : Z
    //   126: ifeq -> 135
    //   129: iload #4
    //   131: istore_2
    //   132: goto -> 137
    //   135: iconst_0
    //   136: istore_2
    //   137: iload_2
    //   138: ifeq -> 171
    //   141: aload_0
    //   142: getfield e : Landroid/support/v7/widget/af;
    //   145: iconst_0
    //   146: iload_3
    //   147: invokevirtual measure : (II)V
    //   150: aload_0
    //   151: getfield e : Landroid/support/v7/widget/af;
    //   154: invokevirtual getMeasuredWidth : ()I
    //   157: iload_1
    //   158: invokestatic getSize : (I)I
    //   161: if_icmple -> 171
    //   164: aload_0
    //   165: invokespecial b : ()V
    //   168: goto -> 176
    //   171: aload_0
    //   172: invokespecial c : ()Z
    //   175: pop
    //   176: aload_0
    //   177: invokevirtual getMeasuredWidth : ()I
    //   180: istore_2
    //   181: aload_0
    //   182: iload_1
    //   183: iload_3
    //   184: invokespecial onMeasure : (II)V
    //   187: aload_0
    //   188: invokevirtual getMeasuredWidth : ()I
    //   191: istore_1
    //   192: iload #5
    //   194: ifeq -> 210
    //   197: iload_2
    //   198: iload_1
    //   199: if_icmpeq -> 210
    //   202: aload_0
    //   203: aload_0
    //   204: getfield i : I
    //   207: invokevirtual setTabSelected : (I)V
    //   210: return }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
  
  public void setAllowCollapse(boolean paramBoolean) { this.g = paramBoolean; }
  
  public void setContentHeight(int paramInt) {
    this.h = paramInt;
    requestLayout();
  }
  
  public void setTabSelected(int paramInt) {
    this.i = paramInt;
    int k = this.e.getChildCount();
    for (byte b1 = 0; b1 < k; b1++) {
      boolean bool;
      View view = this.e.getChildAt(b1);
      if (b1 == paramInt) {
        bool = true;
      } else {
        bool = false;
      } 
      view.setSelected(bool);
      if (bool)
        a(paramInt); 
    } 
    if (this.f != null && paramInt >= 0)
      this.f.setSelection(paramInt); 
  }
  
  private class a extends BaseAdapter {
    private a(ak this$0) {}
    
    public int getCount() { return ak.a(this.a).getChildCount(); }
    
    public Object getItem(int param1Int) { return ((ak.c)ak.a(this.a).getChildAt(param1Int)).b(); }
    
    public long getItemId(int param1Int) { return param1Int; }
    
    public View getView(int param1Int, View param1View, ViewGroup param1ViewGroup) {
      if (param1View == null)
        return ak.a(this.a, (a.c)getItem(param1Int), true); 
      ((ak.c)param1View).a((a.c)getItem(param1Int));
      return param1View;
    }
  }
  
  private class b implements View.OnClickListener {
    private b(ak this$0) {}
    
    public void onClick(View param1View) {
      ((ak.c)param1View).b().d();
      int i = ak.a(this.a).getChildCount();
      for (byte b1 = 0; b1 < i; b1++) {
        boolean bool;
        View view = ak.a(this.a).getChildAt(b1);
        if (view == param1View) {
          bool = true;
        } else {
          bool = false;
        } 
        view.setSelected(bool);
      } 
    }
  }
  
  private class c extends af implements View.OnLongClickListener {
    private final int[] b = { 16842964 };
    
    private a.c c;
    
    private TextView d;
    
    private ImageView e;
    
    private View f;
    
    public c(ak this$0, Context param1Context, a.c param1c, boolean param1Boolean) {
      super(param1Context, null, a.a.actionBarTabStyle);
      this.c = param1c;
      ar ar = ar.a(param1Context, null, this.b, a.a.actionBarTabStyle, 0);
      if (ar.f(0))
        setBackgroundDrawable(ar.a(0)); 
      ar.a();
      if (param1Boolean)
        setGravity(8388627); 
      a();
    }
    
    public void a() {
      ViewParent viewParent = this.c;
      View view = viewParent.c();
      if (view != null) {
        viewParent = view.getParent();
        if (viewParent != this) {
          if (viewParent != null)
            ((ViewGroup)viewParent).removeView(view); 
          addView(view);
        } 
        this.f = view;
        if (this.d != null)
          this.d.setVisibility(8); 
        if (this.e != null) {
          this.e.setVisibility(8);
          this.e.setImageDrawable(null);
          return;
        } 
      } else {
        if (this.f != null) {
          removeView(this.f);
          this.f = null;
        } 
        Drawable drawable = viewParent.a();
        CharSequence charSequence = viewParent.b();
        if (drawable != null) {
          if (this.e == null) {
            ImageView imageView = new ImageView(getContext());
            af.a a1 = new af.a(-2, -2);
            a1.h = 16;
            imageView.setLayoutParams(a1);
            addView(imageView, 0);
            this.e = imageView;
          } 
          this.e.setImageDrawable(drawable);
          this.e.setVisibility(0);
        } else if (this.e != null) {
          this.e.setVisibility(8);
          this.e.setImageDrawable(null);
        } 
        boolean bool = TextUtils.isEmpty(charSequence) ^ true;
        if (bool) {
          if (this.d == null) {
            aa aa = new aa(getContext(), null, a.a.actionBarTabTextStyle);
            aa.setEllipsize(TextUtils.TruncateAt.END);
            af.a a1 = new af.a(-2, -2);
            a1.h = 16;
            aa.setLayoutParams(a1);
            addView(aa);
            this.d = aa;
          } 
          this.d.setText(charSequence);
          this.d.setVisibility(0);
        } else if (this.d != null) {
          this.d.setVisibility(8);
          this.d.setText(null);
        } 
        if (this.e != null)
          this.e.setContentDescription(viewParent.e()); 
        if (!bool && !TextUtils.isEmpty(viewParent.e())) {
          setOnLongClickListener(this);
          return;
        } 
        setOnLongClickListener(null);
        setLongClickable(false);
      } 
    }
    
    public void a(a.c param1c) {
      this.c = param1c;
      a();
    }
    
    public a.c b() { return this.c; }
    
    public void onInitializeAccessibilityEvent(AccessibilityEvent param1AccessibilityEvent) {
      super.onInitializeAccessibilityEvent(param1AccessibilityEvent);
      param1AccessibilityEvent.setClassName(a.c.class.getName());
    }
    
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo param1AccessibilityNodeInfo) {
      super.onInitializeAccessibilityNodeInfo(param1AccessibilityNodeInfo);
      if (Build.VERSION.SDK_INT >= 14)
        param1AccessibilityNodeInfo.setClassName(a.c.class.getName()); 
    }
    
    public boolean onLongClick(View param1View) {
      int[] arrayOfInt = new int[2];
      getLocationOnScreen(arrayOfInt);
      Context context = getContext();
      int i = getWidth();
      int j = getHeight();
      int k = (context.getResources().getDisplayMetrics()).widthPixels;
      Toast toast = Toast.makeText(context, this.c.e(), 0);
      toast.setGravity(49, arrayOfInt[0] + i / 2 - k / 2, j);
      toast.show();
      return true;
    }
    
    public void onMeasure(int param1Int1, int param1Int2) {
      super.onMeasure(param1Int1, param1Int2);
      if (this.a.b > 0 && getMeasuredWidth() > this.a.b)
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.a.b, 1073741824), param1Int2); 
    }
    
    public void setSelected(boolean param1Boolean) {
      boolean bool;
      if (isSelected() != param1Boolean) {
        bool = true;
      } else {
        bool = false;
      } 
      super.setSelected(param1Boolean);
      if (bool && param1Boolean)
        sendAccessibilityEvent(4); 
    }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */