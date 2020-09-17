package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.b.a;
import android.support.v4.h.ac;
import android.support.v4.h.af;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

public class x extends Spinner implements ac {
  private static final boolean a;
  
  private static final boolean b;
  
  private static final int[] c;
  
  private l d;
  
  private g e;
  
  private Context f;
  
  private ag.b g;
  
  private SpinnerAdapter h;
  
  private boolean i;
  
  private b j;
  
  private int k;
  
  private final Rect l;
  
  static  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 23) {
      bool = true;
    } else {
      bool = false;
    } 
    a = bool;
    if (Build.VERSION.SDK_INT >= 16) {
      bool = true;
    } else {
      bool = false;
    } 
    b = bool;
    c = new int[] { 16843505 };
  }
  
  public x(Context paramContext, AttributeSet paramAttributeSet) { this(paramContext, paramAttributeSet, a.a.spinnerStyle); }
  
  public x(Context paramContext, AttributeSet paramAttributeSet, int paramInt) { this(paramContext, paramAttributeSet, paramInt, -1); }
  
  public x(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) { this(paramContext, paramAttributeSet, paramInt1, paramInt2, null); }
  
  public x(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2, Resources.Theme paramTheme) { // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   7: aload_0
    //   8: new android/graphics/Rect
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: putfield l : Landroid/graphics/Rect;
    //   18: aload_1
    //   19: aload_2
    //   20: getstatic android/support/v7/b/a$k.Spinner : [I
    //   23: iload_3
    //   24: iconst_0
    //   25: invokestatic a : (Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/ar;
    //   28: astore #6
    //   30: aload_0
    //   31: invokestatic a : ()Landroid/support/v7/widget/l;
    //   34: putfield d : Landroid/support/v7/widget/l;
    //   37: aload_0
    //   38: new android/support/v7/widget/g
    //   41: dup
    //   42: aload_0
    //   43: aload_0
    //   44: getfield d : Landroid/support/v7/widget/l;
    //   47: invokespecial <init> : (Landroid/view/View;Landroid/support/v7/widget/l;)V
    //   50: putfield e : Landroid/support/v7/widget/g;
    //   53: aload #5
    //   55: ifnull -> 79
    //   58: new android/support/v7/view/d
    //   61: dup
    //   62: aload_1
    //   63: aload #5
    //   65: invokespecial <init> : (Landroid/content/Context;Landroid/content/res/Resources$Theme;)V
    //   68: astore #5
    //   70: aload_0
    //   71: aload #5
    //   73: putfield f : Landroid/content/Context;
    //   76: goto -> 131
    //   79: aload #6
    //   81: getstatic android/support/v7/b/a$k.Spinner_popupTheme : I
    //   84: iconst_0
    //   85: invokevirtual g : (II)I
    //   88: istore #7
    //   90: iload #7
    //   92: ifeq -> 110
    //   95: new android/support/v7/view/d
    //   98: dup
    //   99: aload_1
    //   100: iload #7
    //   102: invokespecial <init> : (Landroid/content/Context;I)V
    //   105: astore #5
    //   107: goto -> 70
    //   110: getstatic android/support/v7/widget/x.a : Z
    //   113: ifne -> 122
    //   116: aload_1
    //   117: astore #5
    //   119: goto -> 125
    //   122: aconst_null
    //   123: astore #5
    //   125: aload_0
    //   126: aload #5
    //   128: putfield f : Landroid/content/Context;
    //   131: aload_0
    //   132: getfield f : Landroid/content/Context;
    //   135: ifnull -> 385
    //   138: iload #4
    //   140: istore #7
    //   142: iload #4
    //   144: iconst_m1
    //   145: if_icmpne -> 282
    //   148: getstatic android/os/Build$VERSION.SDK_INT : I
    //   151: bipush #11
    //   153: if_icmplt -> 279
    //   156: aload_1
    //   157: aload_2
    //   158: getstatic android/support/v7/widget/x.c : [I
    //   161: iload_3
    //   162: iconst_0
    //   163: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   166: astore #5
    //   168: iload #4
    //   170: istore #8
    //   172: aload #5
    //   174: astore #9
    //   176: aload #5
    //   178: iconst_0
    //   179: invokevirtual hasValue : (I)Z
    //   182: ifeq -> 198
    //   185: aload #5
    //   187: astore #9
    //   189: aload #5
    //   191: iconst_0
    //   192: iconst_0
    //   193: invokevirtual getInt : (II)I
    //   196: istore #8
    //   198: iload #8
    //   200: istore #7
    //   202: aload #5
    //   204: ifnull -> 282
    //   207: iload #8
    //   209: istore #4
    //   211: aload #5
    //   213: invokevirtual recycle : ()V
    //   216: iload #4
    //   218: istore #7
    //   220: goto -> 282
    //   223: astore #10
    //   225: goto -> 240
    //   228: astore_1
    //   229: aconst_null
    //   230: astore #9
    //   232: goto -> 267
    //   235: astore #10
    //   237: aconst_null
    //   238: astore #5
    //   240: aload #5
    //   242: astore #9
    //   244: ldc 'AppCompatSpinner'
    //   246: ldc 'Could not read android:spinnerMode'
    //   248: aload #10
    //   250: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   253: pop
    //   254: iload #4
    //   256: istore #7
    //   258: aload #5
    //   260: ifnull -> 282
    //   263: goto -> 211
    //   266: astore_1
    //   267: aload #9
    //   269: ifnull -> 277
    //   272: aload #9
    //   274: invokevirtual recycle : ()V
    //   277: aload_1
    //   278: athrow
    //   279: iconst_1
    //   280: istore #7
    //   282: iload #7
    //   284: iconst_1
    //   285: if_icmpne -> 385
    //   288: new android/support/v7/widget/x$b
    //   291: dup
    //   292: aload_0
    //   293: aload_0
    //   294: getfield f : Landroid/content/Context;
    //   297: aload_2
    //   298: iload_3
    //   299: invokespecial <init> : (Landroid/support/v7/widget/x;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   302: astore #9
    //   304: aload_0
    //   305: getfield f : Landroid/content/Context;
    //   308: aload_2
    //   309: getstatic android/support/v7/b/a$k.Spinner : [I
    //   312: iload_3
    //   313: iconst_0
    //   314: invokestatic a : (Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/ar;
    //   317: astore #5
    //   319: aload_0
    //   320: aload #5
    //   322: getstatic android/support/v7/b/a$k.Spinner_android_dropDownWidth : I
    //   325: bipush #-2
    //   327: invokevirtual f : (II)I
    //   330: putfield k : I
    //   333: aload #9
    //   335: aload #5
    //   337: getstatic android/support/v7/b/a$k.Spinner_android_popupBackground : I
    //   340: invokevirtual a : (I)Landroid/graphics/drawable/Drawable;
    //   343: invokevirtual a : (Landroid/graphics/drawable/Drawable;)V
    //   346: aload #9
    //   348: aload #6
    //   350: getstatic android/support/v7/b/a$k.Spinner_android_prompt : I
    //   353: invokevirtual d : (I)Ljava/lang/String;
    //   356: invokevirtual a : (Ljava/lang/CharSequence;)V
    //   359: aload #5
    //   361: invokevirtual a : ()V
    //   364: aload_0
    //   365: aload #9
    //   367: putfield j : Landroid/support/v7/widget/x$b;
    //   370: aload_0
    //   371: new android/support/v7/widget/x$1
    //   374: dup
    //   375: aload_0
    //   376: aload_0
    //   377: aload #9
    //   379: invokespecial <init> : (Landroid/support/v7/widget/x;Landroid/view/View;Landroid/support/v7/widget/x$b;)V
    //   382: putfield g : Landroid/support/v7/widget/ag$b;
    //   385: aload #6
    //   387: getstatic android/support/v7/b/a$k.Spinner_android_entries : I
    //   390: invokevirtual e : (I)[Ljava/lang/CharSequence;
    //   393: astore #5
    //   395: aload #5
    //   397: ifnull -> 425
    //   400: new android/widget/ArrayAdapter
    //   403: dup
    //   404: aload_1
    //   405: ldc 17367048
    //   407: aload #5
    //   409: invokespecial <init> : (Landroid/content/Context;I[Ljava/lang/Object;)V
    //   412: astore_1
    //   413: aload_1
    //   414: getstatic android/support/v7/b/a$h.support_simple_spinner_dropdown_item : I
    //   417: invokevirtual setDropDownViewResource : (I)V
    //   420: aload_0
    //   421: aload_1
    //   422: invokevirtual setAdapter : (Landroid/widget/SpinnerAdapter;)V
    //   425: aload #6
    //   427: invokevirtual a : ()V
    //   430: aload_0
    //   431: iconst_1
    //   432: putfield i : Z
    //   435: aload_0
    //   436: getfield h : Landroid/widget/SpinnerAdapter;
    //   439: ifnull -> 455
    //   442: aload_0
    //   443: aload_0
    //   444: getfield h : Landroid/widget/SpinnerAdapter;
    //   447: invokevirtual setAdapter : (Landroid/widget/SpinnerAdapter;)V
    //   450: aload_0
    //   451: aconst_null
    //   452: putfield h : Landroid/widget/SpinnerAdapter;
    //   455: aload_0
    //   456: getfield e : Landroid/support/v7/widget/g;
    //   459: aload_2
    //   460: iload_3
    //   461: invokevirtual a : (Landroid/util/AttributeSet;I)V
    //   464: return
    // Exception table:
    //   from	to	target	type
    //   156	168	235	java/lang/Exception
    //   156	168	228	finally
    //   176	185	223	java/lang/Exception
    //   176	185	266	finally
    //   189	198	223	java/lang/Exception
    //   189	198	266	finally
    //   244	254	266	finally }
  
  private int a(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable) {
    int m = 0;
    if (paramSpinnerAdapter == null)
      return 0; 
    int n = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
    int i1 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
    int i2 = Math.max(0, getSelectedItemPosition());
    int i3 = Math.min(paramSpinnerAdapter.getCount(), i2 + 15);
    int i4 = Math.max(0, i2 - 15 - i3 - i2);
    View view = null;
    i2 = 0;
    while (i4 < i3) {
      int i5 = paramSpinnerAdapter.getItemViewType(i4);
      int i6 = m;
      if (i5 != m) {
        view = null;
        i6 = i5;
      } 
      view = paramSpinnerAdapter.getView(i4, view, this);
      if (view.getLayoutParams() == null)
        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2)); 
      view.measure(n, i1);
      i2 = Math.max(i2, view.getMeasuredWidth());
      i4++;
      m = i6;
    } 
    i4 = i2;
    if (paramDrawable != null) {
      paramDrawable.getPadding(this.l);
      i4 = i2 + this.l.left + this.l.right;
    } 
    return i4;
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    if (this.e != null)
      this.e.c(); 
  }
  
  public int getDropDownHorizontalOffset() { return (this.j != null) ? this.j.f() : (b ? super.getDropDownHorizontalOffset() : 0); }
  
  public int getDropDownVerticalOffset() { return (this.j != null) ? this.j.g() : (b ? super.getDropDownVerticalOffset() : 0); }
  
  public int getDropDownWidth() { return (this.j != null) ? this.k : (b ? super.getDropDownWidth() : 0); }
  
  public Drawable getPopupBackground() { return (this.j != null) ? this.j.d() : (b ? super.getPopupBackground() : null); }
  
  public Context getPopupContext() { return (this.j != null) ? this.f : (a ? super.getPopupContext() : null); }
  
  public CharSequence getPrompt() { return (this.j != null) ? this.j.a() : super.getPrompt(); }
  
  public ColorStateList getSupportBackgroundTintList() { return (this.e != null) ? this.e.a() : null; }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() { return (this.e != null) ? this.e.b() : null; }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    if (this.j != null && this.j.k())
      this.j.i(); 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    if (this.j != null && View.MeasureSpec.getMode(paramInt1) == Integer.MIN_VALUE)
      setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight()); 
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) { return (this.g != null && this.g.onTouch(this, paramMotionEvent)) ? true : super.onTouchEvent(paramMotionEvent); }
  
  public boolean performClick() {
    if (this.j != null) {
      if (!this.j.k())
        this.j.c(); 
      return true;
    } 
    return super.performClick();
  }
  
  public void setAdapter(SpinnerAdapter paramSpinnerAdapter) {
    if (!this.i) {
      this.h = paramSpinnerAdapter;
      return;
    } 
    super.setAdapter(paramSpinnerAdapter);
    if (this.j != null) {
      Context context;
      if (this.f == null) {
        context = getContext();
      } else {
        context = this.f;
      } 
      this.j.a(new a(paramSpinnerAdapter, context.getTheme()));
    } 
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
    if (this.e != null)
      this.e.a(paramDrawable); 
  }
  
  public void setBackgroundResource(int paramInt) {
    super.setBackgroundResource(paramInt);
    if (this.e != null)
      this.e.a(paramInt); 
  }
  
  public void setDropDownHorizontalOffset(int paramInt) {
    if (this.j != null) {
      this.j.b(paramInt);
      return;
    } 
    if (b)
      super.setDropDownHorizontalOffset(paramInt); 
  }
  
  public void setDropDownVerticalOffset(int paramInt) {
    if (this.j != null) {
      this.j.c(paramInt);
      return;
    } 
    if (b)
      super.setDropDownVerticalOffset(paramInt); 
  }
  
  public void setDropDownWidth(int paramInt) {
    if (this.j != null) {
      this.k = paramInt;
      return;
    } 
    if (b)
      super.setDropDownWidth(paramInt); 
  }
  
  public void setPopupBackgroundDrawable(Drawable paramDrawable) {
    if (this.j != null) {
      this.j.a(paramDrawable);
      return;
    } 
    if (b)
      super.setPopupBackgroundDrawable(paramDrawable); 
  }
  
  public void setPopupBackgroundResource(int paramInt) { setPopupBackgroundDrawable(a.a(getPopupContext(), paramInt)); }
  
  public void setPrompt(CharSequence paramCharSequence) {
    if (this.j != null) {
      this.j.a(paramCharSequence);
      return;
    } 
    super.setPrompt(paramCharSequence);
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    if (this.e != null)
      this.e.a(paramColorStateList); 
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    if (this.e != null)
      this.e.a(paramMode); 
  }
  
  private static class a implements ListAdapter, SpinnerAdapter {
    private SpinnerAdapter a;
    
    private ListAdapter b;
    
    public a(SpinnerAdapter param1SpinnerAdapter, Resources.Theme param1Theme) {
      this.a = param1SpinnerAdapter;
      if (param1SpinnerAdapter instanceof ListAdapter)
        this.b = (ListAdapter)param1SpinnerAdapter; 
      if (param1Theme != null) {
        ThemedSpinnerAdapter themedSpinnerAdapter;
        if (x.a() && param1SpinnerAdapter instanceof ThemedSpinnerAdapter) {
          themedSpinnerAdapter = (ThemedSpinnerAdapter)param1SpinnerAdapter;
          if (themedSpinnerAdapter.getDropDownViewTheme() != param1Theme) {
            themedSpinnerAdapter.setDropDownViewTheme(param1Theme);
            return;
          } 
        } else if (themedSpinnerAdapter instanceof an) {
          an an = (an)themedSpinnerAdapter;
          if (an.a() == null)
            an.a(param1Theme); 
        } 
      } 
    }
    
    public boolean areAllItemsEnabled() {
      ListAdapter listAdapter = this.b;
      return (listAdapter != null) ? listAdapter.areAllItemsEnabled() : 1;
    }
    
    public int getCount() { return (this.a == null) ? 0 : this.a.getCount(); }
    
    public View getDropDownView(int param1Int, View param1View, ViewGroup param1ViewGroup) { return (this.a == null) ? null : this.a.getDropDownView(param1Int, param1View, param1ViewGroup); }
    
    public Object getItem(int param1Int) { return (this.a == null) ? null : this.a.getItem(param1Int); }
    
    public long getItemId(int param1Int) { return (this.a == null) ? -1L : this.a.getItemId(param1Int); }
    
    public int getItemViewType(int param1Int) { return 0; }
    
    public View getView(int param1Int, View param1View, ViewGroup param1ViewGroup) { return getDropDownView(param1Int, param1View, param1ViewGroup); }
    
    public int getViewTypeCount() { return 1; }
    
    public boolean hasStableIds() { return (this.a != null && this.a.hasStableIds()); }
    
    public boolean isEmpty() { return (getCount() == 0); }
    
    public boolean isEnabled(int param1Int) {
      ListAdapter listAdapter = this.b;
      return (listAdapter != null) ? listAdapter.isEnabled(param1Int) : 1;
    }
    
    public void registerDataSetObserver(DataSetObserver param1DataSetObserver) {
      if (this.a != null)
        this.a.registerDataSetObserver(param1DataSetObserver); 
    }
    
    public void unregisterDataSetObserver(DataSetObserver param1DataSetObserver) {
      if (this.a != null)
        this.a.unregisterDataSetObserver(param1DataSetObserver); 
    }
  }
  
  private class b extends ag {
    private CharSequence c;
    
    private ListAdapter d;
    
    private final Rect e = new Rect();
    
    public b(x this$0, Context param1Context, AttributeSet param1AttributeSet, int param1Int) {
      super(param1Context, param1AttributeSet, param1Int);
      a(this$0);
      a(true);
      a(0);
      a(new AdapterView.OnItemClickListener(this, this$0) {
            public void onItemClick(AdapterView<?> param2AdapterView, View param2View, int param2Int, long param2Long) {
              this.b.a.setSelection(param2Int);
              if (this.b.a.getOnItemClickListener() != null)
                this.b.a.performItemClick(param2View, param2Int, x.b.a(this.b).getItemId(param2Int)); 
              this.b.i();
            }
          });
    }
    
    private boolean b(View param1View) { return (af.r(param1View) && param1View.getGlobalVisibleRect(this.e)); }
    
    public CharSequence a() { return this.c; }
    
    public void a(ListAdapter param1ListAdapter) {
      super.a(param1ListAdapter);
      this.d = param1ListAdapter;
    }
    
    public void a(CharSequence param1CharSequence) { this.c = param1CharSequence; }
    
    void b() {
      int j;
      Drawable drawable = d();
      int i = 0;
      if (drawable != null) {
        drawable.getPadding(x.b(this.a));
        if (au.a(this.a)) {
          j = (x.b(this.a)).right;
        } else {
          j = -(x.b(this.a)).left;
        } 
        i = j;
      } else {
        Rect rect = x.b(this.a);
        (x.b(this.a)).right = 0;
        rect.left = 0;
      } 
      int k = this.a.getPaddingLeft();
      int m = this.a.getPaddingRight();
      int n = this.a.getWidth();
      if (x.c(this.a) == -2) {
        int i1 = x.a(this.a, (SpinnerAdapter)this.d, d());
        int i2 = (this.a.getContext().getResources().getDisplayMetrics()).widthPixels - (x.b(this.a)).left - (x.b(this.a)).right;
        j = i1;
        if (i1 > i2)
          j = i2; 
        j = Math.max(j, n - k - m);
      } else if (x.c(this.a) == -1) {
        j = n - k - m;
      } else {
        j = x.c(this.a);
      } 
      f(j);
      if (au.a(this.a)) {
        j = i + n - m - h();
      } else {
        j = i + k;
      } 
      b(j);
    }
    
    public void c() {
      boolean bool = k();
      b();
      g(2);
      super.c();
      m().setChoiceMode(1);
      h(this.a.getSelectedItemPosition());
      if (bool)
        return; 
      ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
      if (viewTreeObserver != null) {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener(this) {
            public void onGlobalLayout() {
              if (!x.b.a(this.a, this.a.a)) {
                this.a.i();
                return;
              } 
              this.a.b();
              x.b.b(this.a);
            }
          };
        viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
        a(new PopupWindow.OnDismissListener(this, onGlobalLayoutListener) {
              public void onDismiss() {
                ViewTreeObserver viewTreeObserver = this.b.a.getViewTreeObserver();
                if (viewTreeObserver != null)
                  viewTreeObserver.removeGlobalOnLayoutListener(this.a); 
              }
            });
      } 
    }
  }
  
  class null implements AdapterView.OnItemClickListener {
    null(x this$0, x param1x) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      this.b.a.setSelection(param1Int);
      if (this.b.a.getOnItemClickListener() != null)
        this.b.a.performItemClick(param1View, param1Int, x.b.a(this.b).getItemId(param1Int)); 
      this.b.i();
    }
  }
  
  class null implements ViewTreeObserver.OnGlobalLayoutListener {
    null(x this$0) {}
    
    public void onGlobalLayout() {
      if (!x.b.a(this.a, this.a.a)) {
        this.a.i();
        return;
      } 
      this.a.b();
      x.b.b(this.a);
    }
  }
  
  class null implements PopupWindow.OnDismissListener {
    null(x this$0, ViewTreeObserver.OnGlobalLayoutListener param1OnGlobalLayoutListener) {}
    
    public void onDismiss() {
      ViewTreeObserver viewTreeObserver = this.b.a.getViewTreeObserver();
      if (viewTreeObserver != null)
        viewTreeObserver.removeGlobalOnLayoutListener(this.a); 
    }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */