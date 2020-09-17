package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.a.a.b;
import android.support.a.a.f;
import android.support.v4.b.a;
import android.support.v4.c.a;
import android.support.v4.c.a.a;
import android.support.v4.g.a;
import android.support.v4.g.e;
import android.support.v4.g.f;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class l {
  private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
  
  private static l b;
  
  private static final b c = new b(6);
  
  private static final int[] d = { a.e.abc_textfield_search_default_mtrl_alpha, a.e.abc_textfield_default_mtrl_alpha, a.e.abc_ab_share_pack_mtrl_alpha };
  
  private static final int[] e = { 
      a.e.abc_ic_ab_back_mtrl_am_alpha, a.e.abc_ic_go_search_api_mtrl_alpha, a.e.abc_ic_search_api_mtrl_alpha, a.e.abc_ic_commit_search_api_mtrl_alpha, a.e.abc_ic_clear_mtrl_alpha, a.e.abc_ic_menu_share_mtrl_alpha, a.e.abc_ic_menu_copy_mtrl_am_alpha, a.e.abc_ic_menu_cut_mtrl_alpha, a.e.abc_ic_menu_selectall_mtrl_alpha, a.e.abc_ic_menu_paste_mtrl_am_alpha, 
      a.e.abc_ic_menu_moreoverflow_mtrl_alpha, a.e.abc_ic_voice_search_api_mtrl_alpha };
  
  private static final int[] f = { a.e.abc_textfield_activated_mtrl_alpha, a.e.abc_textfield_search_activated_mtrl_alpha, a.e.abc_cab_background_top_mtrl_alpha, a.e.abc_text_cursor_material };
  
  private static final int[] g = { a.e.abc_popup_background_mtrl_mult, a.e.abc_cab_background_internal_bg, a.e.abc_menu_hardkey_panel_mtrl_mult };
  
  private static final int[] h = { a.e.abc_edit_text_material, a.e.abc_tab_indicator_material, a.e.abc_textfield_search_material, a.e.abc_spinner_mtrl_am_alpha, a.e.abc_spinner_textfield_background_material, a.e.abc_ratingbar_full_material, a.e.abc_switch_track_mtrl_alpha, a.e.abc_switch_thumb_material, a.e.abc_btn_default_mtrl_shape, a.e.abc_btn_borderless_material };
  
  private static final int[] i = { a.e.abc_btn_check_material, a.e.abc_btn_radio_material };
  
  private WeakHashMap<Context, SparseArray<ColorStateList>> j;
  
  private a<String, c> k;
  
  private SparseArray<String> l;
  
  private final Object m = new Object();
  
  private final WeakHashMap<Context, e<WeakReference<Drawable.ConstantState>>> n = new WeakHashMap(0);
  
  private TypedValue o;
  
  private static long a(TypedValue paramTypedValue) { return paramTypedValue.assetCookie << 32 | paramTypedValue.data; }
  
  private ColorStateList a(Context paramContext) {
    int i1 = am.a(paramContext, a.a.colorControlNormal);
    int i2 = am.a(paramContext, a.a.colorControlActivated);
    int[] arrayOfInt = am.a;
    int i3 = am.c(paramContext, a.a.colorControlNormal);
    return new ColorStateList(new int[][] { arrayOfInt, am.b, am.c, am.d, am.e, am.f, am.h }, new int[] { i3, i2, i2, i2, i2, i2, i1 });
  }
  
  public static PorterDuffColorFilter a(int paramInt, PorterDuff.Mode paramMode) {
    PorterDuffColorFilter porterDuffColorFilter1 = c.a(paramInt, paramMode);
    PorterDuffColorFilter porterDuffColorFilter2 = porterDuffColorFilter1;
    if (porterDuffColorFilter1 == null) {
      porterDuffColorFilter2 = new PorterDuffColorFilter(paramInt, paramMode);
      c.a(paramInt, paramMode, porterDuffColorFilter2);
    } 
    return porterDuffColorFilter2;
  }
  
  private static PorterDuffColorFilter a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, int[] paramArrayOfInt) { return (paramColorStateList == null || paramMode == null) ? null : a(paramColorStateList.getColorForState(paramArrayOfInt, 0), paramMode); }
  
  private Drawable a(Context paramContext, int paramInt, boolean paramBoolean, Drawable paramDrawable) {
    PorterDuff.Mode mode1;
    Drawable drawable;
    PorterDuff.Mode mode2 = b(paramContext, paramInt);
    if (mode2 != null) {
      drawable = paramDrawable;
      if (ad.b(paramDrawable))
        drawable = paramDrawable.mutate(); 
      drawable = a.f(drawable);
      a.a(drawable, mode2);
      mode1 = a(paramInt);
      Drawable drawable1 = drawable;
      if (mode1 != null) {
        a.a(drawable, mode1);
        return drawable;
      } 
    } else {
      if (paramInt == a.e.abc_seekbar_track_material) {
        LayerDrawable layerDrawable = (LayerDrawable)mode1;
        a(layerDrawable.findDrawableByLayerId(16908288), am.a(drawable, a.a.colorControlNormal), a);
        Drawable drawable1 = layerDrawable.findDrawableByLayerId(16908303);
        paramInt = a.a.colorControlNormal;
        a(drawable1, am.a(drawable, paramInt), a);
        a(layerDrawable.findDrawableByLayerId(16908301), am.a(drawable, a.a.colorControlActivated), a);
        return mode1;
      } 
      if (paramInt == a.e.abc_ratingbar_indicator_material || paramInt == a.e.abc_ratingbar_small_material) {
        LayerDrawable layerDrawable = (LayerDrawable)mode1;
        a(layerDrawable.findDrawableByLayerId(16908288), am.c(drawable, a.a.colorControlNormal), a);
        Drawable drawable1 = layerDrawable.findDrawableByLayerId(16908303);
        paramInt = a.a.colorControlActivated;
        a(drawable1, am.a(drawable, paramInt), a);
        a(layerDrawable.findDrawableByLayerId(16908301), am.a(drawable, a.a.colorControlActivated), a);
        return mode1;
      } 
      mode2 = mode1;
      if (!a(drawable, paramInt, mode1)) {
        mode2 = mode1;
        if (paramBoolean)
          return null; 
      } 
    } 
    return mode2;
  }
  
  private Drawable a(Context paramContext, long paramLong) {
    synchronized (this.m) {
      e e1 = (e)this.n.get(paramContext);
      if (e1 == null)
        return null; 
      WeakReference weakReference = (WeakReference)e1.a(paramLong);
      if (weakReference != null) {
        Drawable.ConstantState constantState = (Drawable.ConstantState)weakReference.get();
        if (constantState != null)
          return constantState.newDrawable(paramContext.getResources()); 
        e1.b(paramLong);
      } 
      return null;
    } 
  }
  
  public static l a() {
    if (b == null)
      (b = new l()).a(b); 
    return b;
  }
  
  private void a(Context paramContext, int paramInt, ColorStateList paramColorStateList) {
    if (this.j == null)
      this.j = new WeakHashMap(); 
    SparseArray sparseArray1 = (SparseArray)this.j.get(paramContext);
    SparseArray sparseArray2 = sparseArray1;
    if (sparseArray1 == null) {
      sparseArray2 = new SparseArray();
      this.j.put(paramContext, sparseArray2);
    } 
    sparseArray2.append(paramInt, paramColorStateList);
  }
  
  private static void a(Drawable paramDrawable, int paramInt, PorterDuff.Mode paramMode) {
    Drawable drawable = paramDrawable;
    if (ad.b(paramDrawable))
      drawable = paramDrawable.mutate(); 
    PorterDuff.Mode mode = paramMode;
    if (paramMode == null)
      mode = a; 
    drawable.setColorFilter(a(paramInt, mode));
  }
  
  public static void a(Drawable paramDrawable, ap paramap, int[] paramArrayOfInt) {
    if (ad.b(paramDrawable) && paramDrawable.mutate() != paramDrawable) {
      Log.d("AppCompatDrawableManager", "Mutated drawable is not the same instance as the input.");
      return;
    } 
    if (paramap.d || paramap.c) {
      ColorStateList colorStateList;
      PorterDuff.Mode mode;
      if (paramap.d) {
        colorStateList = paramap.a;
      } else {
        colorStateList = null;
      } 
      if (paramap.c) {
        mode = paramap.b;
      } else {
        mode = a;
      } 
      paramDrawable.setColorFilter(a(colorStateList, mode, paramArrayOfInt));
    } else {
      paramDrawable.clearColorFilter();
    } 
    if (Build.VERSION.SDK_INT <= 23)
      paramDrawable.invalidateSelf(); 
  }
  
  private static void a(l paraml) {
    int i1 = Build.VERSION.SDK_INT;
    if (i1 < 23) {
      paraml.a("vector", new d(null));
      if (i1 >= 11)
        paraml.a("animated-vector", new a(null)); 
    } 
  }
  
  private void a(String paramString, c paramc) {
    if (this.k == null)
      this.k = new a(); 
    this.k.put(paramString, paramc);
  }
  
  static boolean a(Context paramContext, int paramInt, Drawable paramDrawable) { // Byte code:
    //   0: getstatic android/support/v7/widget/l.a : Landroid/graphics/PorterDuff$Mode;
    //   3: astore_3
    //   4: getstatic android/support/v7/widget/l.d : [I
    //   7: iload_1
    //   8: invokestatic a : ([II)Z
    //   11: ifeq -> 27
    //   14: getstatic android/support/v7/b/a$a.colorControlNormal : I
    //   17: istore_1
    //   18: iconst_m1
    //   19: istore #4
    //   21: iconst_1
    //   22: istore #5
    //   24: goto -> 104
    //   27: getstatic android/support/v7/widget/l.f : [I
    //   30: iload_1
    //   31: invokestatic a : ([II)Z
    //   34: ifeq -> 44
    //   37: getstatic android/support/v7/b/a$a.colorControlActivated : I
    //   40: istore_1
    //   41: goto -> 18
    //   44: getstatic android/support/v7/widget/l.g : [I
    //   47: iload_1
    //   48: invokestatic a : ([II)Z
    //   51: ifeq -> 71
    //   54: getstatic android/graphics/PorterDuff$Mode.MULTIPLY : Landroid/graphics/PorterDuff$Mode;
    //   57: astore_3
    //   58: iconst_1
    //   59: istore #5
    //   61: ldc_w 16842801
    //   64: istore_1
    //   65: iconst_m1
    //   66: istore #4
    //   68: goto -> 104
    //   71: iload_1
    //   72: getstatic android/support/v7/b/a$e.abc_list_divider_mtrl_alpha : I
    //   75: if_icmpne -> 96
    //   78: ldc_w 40.8
    //   81: invokestatic round : (F)I
    //   84: istore #4
    //   86: iconst_1
    //   87: istore #5
    //   89: ldc_w 16842800
    //   92: istore_1
    //   93: goto -> 104
    //   96: iconst_0
    //   97: istore #5
    //   99: iconst_0
    //   100: istore_1
    //   101: goto -> 65
    //   104: iload #5
    //   106: ifeq -> 154
    //   109: aload_2
    //   110: astore #6
    //   112: aload_2
    //   113: invokestatic b : (Landroid/graphics/drawable/Drawable;)Z
    //   116: ifeq -> 125
    //   119: aload_2
    //   120: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   123: astore #6
    //   125: aload #6
    //   127: aload_0
    //   128: iload_1
    //   129: invokestatic a : (Landroid/content/Context;I)I
    //   132: aload_3
    //   133: invokestatic a : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    //   136: invokevirtual setColorFilter : (Landroid/graphics/ColorFilter;)V
    //   139: iload #4
    //   141: iconst_m1
    //   142: if_icmpeq -> 152
    //   145: aload #6
    //   147: iload #4
    //   149: invokevirtual setAlpha : (I)V
    //   152: iconst_1
    //   153: ireturn
    //   154: iconst_0
    //   155: ireturn }
  
  private boolean a(Context paramContext, long paramLong, Drawable paramDrawable) {
    Drawable.ConstantState constantState = paramDrawable.getConstantState();
    if (constantState != null)
      synchronized (this.m) {
        e e2 = (e)this.n.get(paramContext);
        e e1 = e2;
        if (e2 == null) {
          e1 = new e();
          this();
          this.n.put(paramContext, e1);
        } 
        WeakReference weakReference = new WeakReference();
        this(constantState);
        e1.b(paramLong, weakReference);
        return true;
      }  
    return false;
  }
  
  private static boolean a(int[] paramArrayOfInt, int paramInt) {
    int i1 = paramArrayOfInt.length;
    for (byte b1 = 0; b1 < i1; b1++) {
      if (paramArrayOfInt[b1] == paramInt)
        return true; 
    } 
    return false;
  }
  
  private ColorStateList b(Context paramContext) {
    int[] arrayOfInt1 = am.a;
    int i1 = am.c(paramContext, a.a.colorControlNormal);
    int[] arrayOfInt2 = am.e;
    int i2 = am.a(paramContext, a.a.colorControlActivated);
    int[] arrayOfInt3 = am.h;
    int i3 = am.a(paramContext, a.a.colorControlNormal);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, arrayOfInt3 }, new int[] { i1, i2, i3 });
  }
  
  private ColorStateList c(Context paramContext) {
    int[] arrayOfInt1 = am.a;
    int i1 = am.a(paramContext, 16842800, 0.1F);
    int[] arrayOfInt2 = am.e;
    int i2 = am.a(paramContext, a.a.colorControlActivated, 0.3F);
    int[] arrayOfInt3 = am.h;
    int i3 = am.a(paramContext, 16842800, 0.3F);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, arrayOfInt3 }, new int[] { i1, i2, i3 });
  }
  
  private Drawable c(Context paramContext, int paramInt) {
    if (this.o == null)
      this.o = new TypedValue(); 
    TypedValue typedValue = this.o;
    paramContext.getResources().getValue(paramInt, typedValue, true);
    long l1 = a(typedValue);
    LayerDrawable layerDrawable = a(paramContext, l1);
    if (layerDrawable != null)
      return layerDrawable; 
    if (paramInt == a.e.abc_cab_background_top_material)
      layerDrawable = new LayerDrawable(new Drawable[] { a(paramContext, a.e.abc_cab_background_internal_bg), a(paramContext, a.e.abc_cab_background_top_mtrl_alpha) }); 
    if (layerDrawable != null) {
      layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
      a(paramContext, l1, layerDrawable);
    } 
    return layerDrawable;
  }
  
  private ColorStateList d(Context paramContext) {
    int[][] arrayOfInt = new int[3][];
    int[] arrayOfInt1 = new int[3];
    ColorStateList colorStateList = am.b(paramContext, a.a.colorSwitchThumbNormal);
    if (colorStateList != null && colorStateList.isStateful()) {
      arrayOfInt[0] = am.a;
      arrayOfInt1[0] = colorStateList.getColorForState(arrayOfInt[0], 0);
      arrayOfInt[1] = am.e;
      arrayOfInt1[1] = am.a(paramContext, a.a.colorControlActivated);
      arrayOfInt[2] = am.h;
      arrayOfInt1[2] = colorStateList.getDefaultColor();
    } else {
      arrayOfInt[0] = am.a;
      arrayOfInt1[0] = am.c(paramContext, a.a.colorSwitchThumbNormal);
      arrayOfInt[1] = am.e;
      arrayOfInt1[1] = am.a(paramContext, a.a.colorControlActivated);
      arrayOfInt[2] = am.h;
      arrayOfInt1[2] = am.a(paramContext, a.a.colorSwitchThumbNormal);
    } 
    return new ColorStateList(arrayOfInt, arrayOfInt1);
  }
  
  private Drawable d(Context paramContext, int paramInt) {
    if (this.k != null && !this.k.isEmpty()) {
      if (this.l != null) {
        String str = (String)this.l.get(paramInt);
        if ("appcompat_skip_skip".equals(str) || (str != null && this.k.get(str) == null))
          return null; 
      } else {
        this.l = new SparseArray();
      } 
      if (this.o == null)
        this.o = new TypedValue(); 
      TypedValue typedValue = this.o;
      Resources resources = paramContext.getResources();
      resources.getValue(paramInt, typedValue, true);
      long l1 = a(typedValue);
      Drawable drawable1 = a(paramContext, l1);
      if (drawable1 != null)
        return drawable1; 
      Drawable drawable2 = drawable1;
      if (typedValue.string != null) {
        drawable2 = drawable1;
        if (typedValue.string.toString().endsWith(".xml")) {
          drawable2 = drawable1;
          try {
            int i1;
            XmlPullParserException xmlPullParserException;
            XmlResourceParser xmlResourceParser = resources.getXml(paramInt);
            drawable2 = drawable1;
            AttributeSet attributeSet = Xml.asAttributeSet(xmlResourceParser);
            while (true) {
              drawable2 = drawable1;
              i1 = xmlResourceParser.next();
              if (i1 != 2 && i1 != 1)
                continue; 
              break;
            } 
            if (i1 != 2) {
              drawable2 = drawable1;
              xmlPullParserException = new XmlPullParserException();
              drawable2 = drawable1;
              this("No start tag found");
              drawable2 = drawable1;
              throw xmlPullParserException;
            } 
            drawable2 = drawable1;
            String str = xmlResourceParser.getName();
            drawable2 = drawable1;
            this.l.append(paramInt, str);
            drawable2 = drawable1;
            c c1 = (c)this.k.get(str);
            Drawable drawable = drawable1;
            if (c1 != null) {
              drawable2 = drawable1;
              drawable = c1.a(xmlPullParserException, xmlResourceParser, attributeSet, xmlPullParserException.getTheme());
            } 
            drawable2 = drawable;
            if (drawable != null) {
              drawable2 = drawable;
              drawable.setChangingConfigurations(typedValue.changingConfigurations);
              drawable2 = drawable;
              a(xmlPullParserException, l1, drawable);
              drawable2 = drawable;
            } 
          } catch (Exception paramContext) {
            Log.e("AppCompatDrawableManager", "Exception while inflating drawable", paramContext);
          } 
        } 
      } 
      if (drawable2 == null)
        this.l.append(paramInt, "appcompat_skip_skip"); 
      return drawable2;
    } 
    return null;
  }
  
  private ColorStateList e(Context paramContext) {
    int[] arrayOfInt1 = am.a;
    int i1 = am.c(paramContext, a.a.colorControlNormal);
    int[] arrayOfInt2 = am.g;
    int i2 = am.a(paramContext, a.a.colorControlNormal);
    int[] arrayOfInt3 = am.h;
    int i3 = am.a(paramContext, a.a.colorControlActivated);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, arrayOfInt3 }, new int[] { i1, i2, i3 });
  }
  
  private ColorStateList e(Context paramContext, int paramInt) {
    WeakHashMap weakHashMap = this.j;
    Object object = null;
    ColorStateList colorStateList = object;
    if (weakHashMap != null) {
      SparseArray sparseArray = (SparseArray)this.j.get(paramContext);
      colorStateList = object;
      if (sparseArray != null)
        colorStateList = (ColorStateList)sparseArray.get(paramInt); 
    } 
    return colorStateList;
  }
  
  private ColorStateList f(Context paramContext) { return f(paramContext, am.a(paramContext, a.a.colorButtonNormal)); }
  
  private ColorStateList f(Context paramContext, int paramInt) {
    int i1 = am.a(paramContext, a.a.colorControlHighlight);
    int[] arrayOfInt2 = am.a;
    int i2 = am.c(paramContext, a.a.colorButtonNormal);
    int[] arrayOfInt3 = am.d;
    int i3 = a.a(i1, paramInt);
    int[] arrayOfInt1 = am.b;
    i1 = a.a(i1, paramInt);
    return new ColorStateList(new int[][] { arrayOfInt2, arrayOfInt3, arrayOfInt1, am.h }, new int[] { i2, i3, i1, paramInt });
  }
  
  private ColorStateList g(Context paramContext) { return f(paramContext, 0); }
  
  private ColorStateList h(Context paramContext) { return f(paramContext, am.a(paramContext, a.a.colorAccent)); }
  
  private ColorStateList i(Context paramContext) {
    int[] arrayOfInt1 = am.a;
    int i1 = am.c(paramContext, a.a.colorControlNormal);
    int[] arrayOfInt2 = am.g;
    int i2 = am.a(paramContext, a.a.colorControlNormal);
    int[] arrayOfInt3 = am.h;
    int i3 = am.a(paramContext, a.a.colorControlActivated);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, arrayOfInt3 }, new int[] { i1, i2, i3 });
  }
  
  private ColorStateList j(Context paramContext) {
    int[] arrayOfInt1 = am.a;
    int i1 = am.c(paramContext, a.a.colorControlActivated);
    int[] arrayOfInt2 = am.h;
    int i2 = am.a(paramContext, a.a.colorControlActivated);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2 }, new int[] { i1, i2 });
  }
  
  final PorterDuff.Mode a(int paramInt) { return (paramInt == a.e.abc_switch_thumb_material) ? PorterDuff.Mode.MULTIPLY : null; }
  
  public Drawable a(Context paramContext, int paramInt) { return a(paramContext, paramInt, false); }
  
  public Drawable a(Context paramContext, int paramInt, boolean paramBoolean) {
    Drawable drawable1 = d(paramContext, paramInt);
    Drawable drawable2 = drawable1;
    if (drawable1 == null)
      drawable2 = c(paramContext, paramInt); 
    drawable1 = drawable2;
    if (drawable2 == null)
      drawable1 = a.a(paramContext, paramInt); 
    drawable2 = drawable1;
    if (drawable1 != null)
      drawable2 = a(paramContext, paramInt, paramBoolean, drawable1); 
    if (drawable2 != null)
      ad.a(drawable2); 
    return drawable2;
  }
  
  public final Drawable a(Context paramContext, at paramat, int paramInt) {
    Drawable drawable1 = d(paramContext, paramInt);
    Drawable drawable2 = drawable1;
    if (drawable1 == null)
      drawable2 = paramat.a(paramInt); 
    return (drawable2 != null) ? a(paramContext, paramInt, false, drawable2) : null;
  }
  
  public final ColorStateList b(Context paramContext, int paramInt) {
    ColorStateList colorStateList1 = e(paramContext, paramInt);
    ColorStateList colorStateList2 = colorStateList1;
    if (colorStateList1 == null) {
      if (paramInt == a.e.abc_edit_text_material) {
        colorStateList1 = e(paramContext);
      } else if (paramInt == a.e.abc_switch_track_mtrl_alpha) {
        colorStateList1 = c(paramContext);
      } else if (paramInt == a.e.abc_switch_thumb_material) {
        colorStateList1 = d(paramContext);
      } else if (paramInt == a.e.abc_btn_default_mtrl_shape) {
        colorStateList1 = f(paramContext);
      } else if (paramInt == a.e.abc_btn_borderless_material) {
        colorStateList1 = g(paramContext);
      } else if (paramInt == a.e.abc_btn_colored_material) {
        colorStateList1 = h(paramContext);
      } else if (paramInt == a.e.abc_spinner_mtrl_am_alpha || paramInt == a.e.abc_spinner_textfield_background_material) {
        colorStateList1 = i(paramContext);
      } else if (a(e, paramInt)) {
        colorStateList1 = am.b(paramContext, a.a.colorControlNormal);
      } else if (a(h, paramInt)) {
        colorStateList1 = a(paramContext);
      } else if (a(i, paramInt)) {
        colorStateList1 = b(paramContext);
      } else if (paramInt == a.e.abc_seekbar_thumb_material) {
        colorStateList1 = j(paramContext);
      } 
      colorStateList2 = colorStateList1;
      if (colorStateList1 != null) {
        a(paramContext, paramInt, colorStateList1);
        colorStateList2 = colorStateList1;
      } 
    } 
    return colorStateList2;
  }
  
  private static class a implements c {
    private a() {}
    
    public Drawable a(Context param1Context, XmlPullParser param1XmlPullParser, AttributeSet param1AttributeSet, Resources.Theme param1Theme) {
      try {
        return b.a(param1Context, param1Context.getResources(), param1XmlPullParser, param1AttributeSet, param1Theme);
      } catch (Exception param1Context) {
        Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", param1Context);
        return null;
      } 
    }
  }
  
  private static class b extends f<Integer, PorterDuffColorFilter> {
    public b(int param1Int) { super(param1Int); }
    
    private static int b(int param1Int, PorterDuff.Mode param1Mode) { return (param1Int + 31) * 31 + param1Mode.hashCode(); }
    
    PorterDuffColorFilter a(int param1Int, PorterDuff.Mode param1Mode) { return (PorterDuffColorFilter)a(Integer.valueOf(b(param1Int, param1Mode))); }
    
    PorterDuffColorFilter a(int param1Int, PorterDuff.Mode param1Mode, PorterDuffColorFilter param1PorterDuffColorFilter) { return (PorterDuffColorFilter)a(Integer.valueOf(b(param1Int, param1Mode)), param1PorterDuffColorFilter); }
  }
  
  private static interface c {
    Drawable a(Context param1Context, XmlPullParser param1XmlPullParser, AttributeSet param1AttributeSet, Resources.Theme param1Theme);
  }
  
  private static class d implements c {
    private d() {}
    
    public Drawable a(Context param1Context, XmlPullParser param1XmlPullParser, AttributeSet param1AttributeSet, Resources.Theme param1Theme) {
      try {
        return f.a(param1Context.getResources(), param1XmlPullParser, param1AttributeSet, param1Theme);
      } catch (Exception param1Context) {
        Log.e("VdcInflateDelegate", "Exception while inflating <vector>", param1Context);
        return null;
      } 
    }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */