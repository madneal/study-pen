package android.support.a.a;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.support.v4.b.a.a;
import android.support.v4.c.a.a;
import android.support.v4.g.a;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@TargetApi(21)
public class f extends e {
  static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
  
  private f c = new f();
  
  private PorterDuffColorFilter d;
  
  private ColorFilter e;
  
  private boolean f;
  
  private boolean g = true;
  
  private Drawable.ConstantState h;
  
  private final float[] i = new float[9];
  
  private final Matrix j = new Matrix();
  
  private final Rect k = new Rect();
  
  private f() {}
  
  private f(f paramf) { this.d = a(this.d, paramf.c, paramf.d); }
  
  private static PorterDuff.Mode a(int paramInt, PorterDuff.Mode paramMode) {
    if (paramInt != 3) {
      if (paramInt != 5) {
        if (paramInt != 9) {
          switch (paramInt) {
            default:
              return paramMode;
            case 16:
              return PorterDuff.Mode.ADD;
            case 15:
              return PorterDuff.Mode.SCREEN;
            case 14:
              break;
          } 
          return PorterDuff.Mode.MULTIPLY;
        } 
        return PorterDuff.Mode.SRC_ATOP;
      } 
      return PorterDuff.Mode.SRC_IN;
    } 
    return PorterDuff.Mode.SRC_OVER;
  }
  
  public static f a(Resources paramResources, int paramInt, Resources.Theme paramTheme) {
    if (Build.VERSION.SDK_INT >= 23) {
      f f1 = new f();
      f1.a = a.a(paramResources, paramInt, paramTheme);
      f1.h = new g(f1.a.getConstantState());
      return f1;
    } 
    try {
      XmlPullParserException xmlPullParserException;
      XmlResourceParser xmlResourceParser = paramResources.getXml(paramInt);
      AttributeSet attributeSet = Xml.asAttributeSet(xmlResourceParser);
      while (true) {
        paramInt = xmlResourceParser.next();
        if (paramInt != 2 && paramInt != 1)
          continue; 
        break;
      } 
      if (paramInt != 2) {
        xmlPullParserException = new XmlPullParserException();
        this("No start tag found");
        throw xmlPullParserException;
      } 
      return a(xmlPullParserException, xmlResourceParser, attributeSet, paramTheme);
    } catch (XmlPullParserException|java.io.IOException paramResources) {
      Log.e("VectorDrawableCompat", "parser error", paramResources);
      return null;
    } 
  }
  
  public static f a(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    f f1 = new f();
    f1.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return f1;
  }
  
  private void a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser) {
    StringBuilder stringBuilder;
    f f1 = this.c;
    e e1 = f1.b;
    f1.d = a(d.a(paramTypedArray, paramXmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
    ColorStateList colorStateList = paramTypedArray.getColorStateList(1);
    if (colorStateList != null)
      f1.c = colorStateList; 
    f1.e = d.a(paramTypedArray, paramXmlPullParser, "autoMirrored", 5, f1.e);
    e1.c = d.a(paramTypedArray, paramXmlPullParser, "viewportWidth", 7, e1.c);
    e1.d = d.a(paramTypedArray, paramXmlPullParser, "viewportHeight", 8, e1.d);
    if (e1.c <= 0.0F) {
      stringBuilder = new StringBuilder();
      stringBuilder.append(paramTypedArray.getPositionDescription());
      stringBuilder.append("<vector> tag requires viewportWidth > 0");
      throw new XmlPullParserException(stringBuilder.toString());
    } 
    if (e1.d <= 0.0F) {
      stringBuilder = new StringBuilder();
      stringBuilder.append(paramTypedArray.getPositionDescription());
      stringBuilder.append("<vector> tag requires viewportHeight > 0");
      throw new XmlPullParserException(stringBuilder.toString());
    } 
    e1.a = paramTypedArray.getDimension(3, e1.a);
    e1.b = paramTypedArray.getDimension(2, e1.b);
    if (e1.a <= 0.0F) {
      stringBuilder = new StringBuilder();
      stringBuilder.append(paramTypedArray.getPositionDescription());
      stringBuilder.append("<vector> tag requires width > 0");
      throw new XmlPullParserException(stringBuilder.toString());
    } 
    if (e1.b <= 0.0F) {
      stringBuilder = new StringBuilder();
      stringBuilder.append(paramTypedArray.getPositionDescription());
      stringBuilder.append("<vector> tag requires height > 0");
      throw new XmlPullParserException(stringBuilder.toString());
    } 
    e1.a(d.a(paramTypedArray, stringBuilder, "alpha", 4, e1.b()));
    String str = paramTypedArray.getString(0);
    if (str != null) {
      e1.f = str;
      e1.g.put(str, e1);
    } 
  }
  
  private boolean a() { return false; }
  
  private static int b(int paramInt, float paramFloat) { return paramInt & 0xFFFFFF | (int)(Color.alpha(paramInt) * paramFloat) << 24; }
  
  private void b(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) { // Byte code:
    //   0: aload_0
    //   1: getfield c : Landroid/support/a/a/f$f;
    //   4: astore #5
    //   6: aload #5
    //   8: getfield b : Landroid/support/a/a/f$e;
    //   11: astore #6
    //   13: new java/util/Stack
    //   16: dup
    //   17: invokespecial <init> : ()V
    //   20: astore #7
    //   22: aload #7
    //   24: aload #6
    //   26: invokestatic a : (Landroid/support/a/a/f$e;)Landroid/support/a/a/f$c;
    //   29: invokevirtual push : (Ljava/lang/Object;)Ljava/lang/Object;
    //   32: pop
    //   33: aload_2
    //   34: invokeinterface getEventType : ()I
    //   39: istore #8
    //   41: iconst_1
    //   42: istore #9
    //   44: iload #8
    //   46: iconst_1
    //   47: if_icmpeq -> 403
    //   50: iload #8
    //   52: iconst_2
    //   53: if_icmpne -> 349
    //   56: aload_2
    //   57: invokeinterface getName : ()Ljava/lang/String;
    //   62: astore #10
    //   64: aload #7
    //   66: invokevirtual peek : ()Ljava/lang/Object;
    //   69: checkcast android/support/a/a/f$c
    //   72: astore #11
    //   74: ldc_w 'path'
    //   77: aload #10
    //   79: invokevirtual equals : (Ljava/lang/Object;)Z
    //   82: ifeq -> 159
    //   85: new android/support/a/a/f$b
    //   88: dup
    //   89: invokespecial <init> : ()V
    //   92: astore #10
    //   94: aload #10
    //   96: aload_1
    //   97: aload_3
    //   98: aload #4
    //   100: aload_2
    //   101: invokevirtual a : (Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;)V
    //   104: aload #11
    //   106: getfield a : Ljava/util/ArrayList;
    //   109: aload #10
    //   111: invokevirtual add : (Ljava/lang/Object;)Z
    //   114: pop
    //   115: aload #10
    //   117: invokevirtual b : ()Ljava/lang/String;
    //   120: ifnull -> 139
    //   123: aload #6
    //   125: getfield g : Landroid/support/v4/g/a;
    //   128: aload #10
    //   130: invokevirtual b : ()Ljava/lang/String;
    //   133: aload #10
    //   135: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   138: pop
    //   139: iconst_0
    //   140: istore #9
    //   142: aload #5
    //   144: getfield a : I
    //   147: istore #8
    //   149: aload #10
    //   151: getfield o : I
    //   154: istore #12
    //   156: goto -> 238
    //   159: ldc_w 'clip-path'
    //   162: aload #10
    //   164: invokevirtual equals : (Ljava/lang/Object;)Z
    //   167: ifeq -> 255
    //   170: new android/support/a/a/f$a
    //   173: dup
    //   174: invokespecial <init> : ()V
    //   177: astore #10
    //   179: aload #10
    //   181: aload_1
    //   182: aload_3
    //   183: aload #4
    //   185: aload_2
    //   186: invokevirtual a : (Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;)V
    //   189: aload #11
    //   191: getfield a : Ljava/util/ArrayList;
    //   194: aload #10
    //   196: invokevirtual add : (Ljava/lang/Object;)Z
    //   199: pop
    //   200: aload #10
    //   202: invokevirtual b : ()Ljava/lang/String;
    //   205: ifnull -> 224
    //   208: aload #6
    //   210: getfield g : Landroid/support/v4/g/a;
    //   213: aload #10
    //   215: invokevirtual b : ()Ljava/lang/String;
    //   218: aload #10
    //   220: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   223: pop
    //   224: aload #5
    //   226: getfield a : I
    //   229: istore #8
    //   231: aload #10
    //   233: getfield o : I
    //   236: istore #12
    //   238: aload #5
    //   240: iload #12
    //   242: iload #8
    //   244: ior
    //   245: putfield a : I
    //   248: iload #9
    //   250: istore #12
    //   252: goto -> 388
    //   255: iload #9
    //   257: istore #12
    //   259: ldc_w 'group'
    //   262: aload #10
    //   264: invokevirtual equals : (Ljava/lang/Object;)Z
    //   267: ifeq -> 388
    //   270: new android/support/a/a/f$c
    //   273: dup
    //   274: invokespecial <init> : ()V
    //   277: astore #10
    //   279: aload #10
    //   281: aload_1
    //   282: aload_3
    //   283: aload #4
    //   285: aload_2
    //   286: invokevirtual a : (Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;)V
    //   289: aload #11
    //   291: getfield a : Ljava/util/ArrayList;
    //   294: aload #10
    //   296: invokevirtual add : (Ljava/lang/Object;)Z
    //   299: pop
    //   300: aload #7
    //   302: aload #10
    //   304: invokevirtual push : (Ljava/lang/Object;)Ljava/lang/Object;
    //   307: pop
    //   308: aload #10
    //   310: invokevirtual a : ()Ljava/lang/String;
    //   313: ifnull -> 332
    //   316: aload #6
    //   318: getfield g : Landroid/support/v4/g/a;
    //   321: aload #10
    //   323: invokevirtual a : ()Ljava/lang/String;
    //   326: aload #10
    //   328: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   331: pop
    //   332: aload #5
    //   334: getfield a : I
    //   337: istore #8
    //   339: aload #10
    //   341: invokestatic a : (Landroid/support/a/a/f$c;)I
    //   344: istore #12
    //   346: goto -> 238
    //   349: iload #9
    //   351: istore #12
    //   353: iload #8
    //   355: iconst_3
    //   356: if_icmpne -> 388
    //   359: iload #9
    //   361: istore #12
    //   363: ldc_w 'group'
    //   366: aload_2
    //   367: invokeinterface getName : ()Ljava/lang/String;
    //   372: invokevirtual equals : (Ljava/lang/Object;)Z
    //   375: ifeq -> 388
    //   378: aload #7
    //   380: invokevirtual pop : ()Ljava/lang/Object;
    //   383: pop
    //   384: iload #9
    //   386: istore #12
    //   388: aload_2
    //   389: invokeinterface next : ()I
    //   394: istore #8
    //   396: iload #12
    //   398: istore #9
    //   400: goto -> 44
    //   403: iload #9
    //   405: ifeq -> 481
    //   408: new java/lang/StringBuffer
    //   411: dup
    //   412: invokespecial <init> : ()V
    //   415: astore_2
    //   416: aload_2
    //   417: invokevirtual length : ()I
    //   420: ifle -> 431
    //   423: aload_2
    //   424: ldc_w ' or '
    //   427: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   430: pop
    //   431: aload_2
    //   432: ldc_w 'path'
    //   435: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   438: pop
    //   439: new java/lang/StringBuilder
    //   442: dup
    //   443: invokespecial <init> : ()V
    //   446: astore_1
    //   447: aload_1
    //   448: ldc_w 'no '
    //   451: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   454: pop
    //   455: aload_1
    //   456: aload_2
    //   457: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   460: pop
    //   461: aload_1
    //   462: ldc_w ' defined'
    //   465: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   468: pop
    //   469: new org/xmlpull/v1/XmlPullParserException
    //   472: dup
    //   473: aload_1
    //   474: invokevirtual toString : ()Ljava/lang/String;
    //   477: invokespecial <init> : (Ljava/lang/String;)V
    //   480: athrow
    //   481: return }
  
  PorterDuffColorFilter a(PorterDuffColorFilter paramPorterDuffColorFilter, ColorStateList paramColorStateList, PorterDuff.Mode paramMode) { return (paramColorStateList == null || paramMode == null) ? null : new PorterDuffColorFilter(paramColorStateList.getColorForState(getState(), 0), paramMode); }
  
  Object a(String paramString) { return this.c.b.g.get(paramString); }
  
  void a(boolean paramBoolean) { this.g = paramBoolean; }
  
  public boolean canApplyTheme() {
    if (this.a != null)
      a.d(this.a); 
    return false;
  }
  
  public void draw(Canvas paramCanvas) {
    if (this.a != null) {
      this.a.draw(paramCanvas);
      return;
    } 
    copyBounds(this.k);
    if (this.k.width() > 0) {
      ColorFilter colorFilter;
      if (this.k.height() <= 0)
        return; 
      if (this.e == null) {
        colorFilter = this.d;
      } else {
        colorFilter = this.e;
      } 
      paramCanvas.getMatrix(this.j);
      this.j.getValues(this.i);
      float f1 = Math.abs(this.i[0]);
      float f2 = Math.abs(this.i[4]);
      float f3 = Math.abs(this.i[1]);
      float f4 = Math.abs(this.i[3]);
      if (f3 != 0.0F || f4 != 0.0F) {
        f1 = 1.0F;
        f2 = 1.0F;
      } 
      int m = (int)(this.k.width() * f1);
      int n = (int)(this.k.height() * f2);
      m = Math.min(2048, m);
      int i1 = Math.min(2048, n);
      if (m > 0) {
        if (i1 <= 0)
          return; 
        n = paramCanvas.save();
        paramCanvas.translate(this.k.left, this.k.top);
        if (a()) {
          paramCanvas.translate(this.k.width(), 0.0F);
          paramCanvas.scale(-1.0F, 1.0F);
        } 
        this.k.offsetTo(0, 0);
        this.c.b(m, i1);
        if (!this.g) {
          this.c.a(m, i1);
        } else if (!this.c.b()) {
          this.c.a(m, i1);
          this.c.c();
        } 
        this.c.a(paramCanvas, colorFilter, this.k);
        paramCanvas.restoreToCount(n);
      } 
    } 
  }
  
  public int getAlpha() { return (this.a != null) ? a.c(this.a) : this.c.b.a(); }
  
  public int getChangingConfigurations() { return (this.a != null) ? this.a.getChangingConfigurations() : (super.getChangingConfigurations() | this.c.getChangingConfigurations()); }
  
  public Drawable.ConstantState getConstantState() {
    if (this.a != null)
      return new g(this.a.getConstantState()); 
    this.c.a = getChangingConfigurations();
    return this.c;
  }
  
  public int getIntrinsicHeight() { return (this.a != null) ? this.a.getIntrinsicHeight() : (int)this.c.b.b; }
  
  public int getIntrinsicWidth() { return (this.a != null) ? this.a.getIntrinsicWidth() : (int)this.c.b.a; }
  
  public int getOpacity() { return (this.a != null) ? this.a.getOpacity() : -3; }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet) {
    if (this.a != null) {
      this.a.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
      return;
    } 
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    if (this.a != null) {
      a.a(this.a, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    } 
    f f1 = this.c;
    f1.b = new e();
    TypedArray typedArray = b(paramResources, paramTheme, paramAttributeSet, a.a);
    a(typedArray, paramXmlPullParser);
    typedArray.recycle();
    f1.a = getChangingConfigurations();
    f1.k = true;
    b(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    this.d = a(this.d, f1.c, f1.d);
  }
  
  public void invalidateSelf() {
    if (this.a != null) {
      this.a.invalidateSelf();
      return;
    } 
    super.invalidateSelf();
  }
  
  public boolean isStateful() { return (this.a != null) ? this.a.isStateful() : ((super.isStateful() || (this.c != null && this.c.c != null && this.c.c.isStateful())) ? 1 : 0); }
  
  public Drawable mutate() {
    if (this.a != null) {
      this.a.mutate();
      return this;
    } 
    if (!this.f && super.mutate() == this) {
      this.c = new f(this.c);
      this.f = true;
    } 
    return this;
  }
  
  protected void onBoundsChange(Rect paramRect) {
    if (this.a != null)
      this.a.setBounds(paramRect); 
  }
  
  protected boolean onStateChange(int[] paramArrayOfInt) {
    if (this.a != null)
      return this.a.setState(paramArrayOfInt); 
    f f1 = this.c;
    if (f1.c != null && f1.d != null) {
      this.d = a(this.d, f1.c, f1.d);
      invalidateSelf();
      return true;
    } 
    return false;
  }
  
  public void scheduleSelf(Runnable paramRunnable, long paramLong) {
    if (this.a != null) {
      this.a.scheduleSelf(paramRunnable, paramLong);
      return;
    } 
    super.scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt) {
    if (this.a != null) {
      this.a.setAlpha(paramInt);
      return;
    } 
    if (this.c.b.a() != paramInt) {
      this.c.b.a(paramInt);
      invalidateSelf();
    } 
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    if (this.a != null) {
      this.a.setColorFilter(paramColorFilter);
      return;
    } 
    this.e = paramColorFilter;
    invalidateSelf();
  }
  
  public void setTint(int paramInt) {
    if (this.a != null) {
      a.a(this.a, paramInt);
      return;
    } 
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    if (this.a != null) {
      a.a(this.a, paramColorStateList);
      return;
    } 
    f f1 = this.c;
    if (f1.c != paramColorStateList) {
      f1.c = paramColorStateList;
      this.d = a(this.d, paramColorStateList, f1.d);
      invalidateSelf();
    } 
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    if (this.a != null) {
      a.a(this.a, paramMode);
      return;
    } 
    f f1 = this.c;
    if (f1.d != paramMode) {
      f1.d = paramMode;
      this.d = a(this.d, f1.c, paramMode);
      invalidateSelf();
    } 
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) { return (this.a != null) ? this.a.setVisible(paramBoolean1, paramBoolean2) : super.setVisible(paramBoolean1, paramBoolean2); }
  
  public void unscheduleSelf(Runnable paramRunnable) {
    if (this.a != null) {
      this.a.unscheduleSelf(paramRunnable);
      return;
    } 
    super.unscheduleSelf(paramRunnable);
  }
  
  private static class a extends d {
    public a() {}
    
    public a(a param1a) { super(param1a); }
    
    private void a(TypedArray param1TypedArray) {
      String str2 = param1TypedArray.getString(0);
      if (str2 != null)
        this.n = str2; 
      String str1 = param1TypedArray.getString(1);
      if (str1 != null)
        this.m = c.a(str1); 
    }
    
    public void a(Resources param1Resources, AttributeSet param1AttributeSet, Resources.Theme param1Theme, XmlPullParser param1XmlPullParser) {
      if (!d.a(param1XmlPullParser, "pathData"))
        return; 
      TypedArray typedArray = e.b(param1Resources, param1Theme, param1AttributeSet, a.d);
      a(typedArray);
      typedArray.recycle();
    }
    
    public boolean a() { return true; }
  }
  
  private static class b extends d {
    int a = 0;
    
    float b = 0.0F;
    
    int c = 0;
    
    float d = 1.0F;
    
    int e;
    
    float f = 1.0F;
    
    float g = 0.0F;
    
    float h = 1.0F;
    
    float i = 0.0F;
    
    Paint.Cap j = Paint.Cap.BUTT;
    
    Paint.Join k = Paint.Join.MITER;
    
    float l = 4.0F;
    
    private int[] p;
    
    public b() {}
    
    public b(b param1b) {
      super(param1b);
      this.p = param1b.p;
      this.a = param1b.a;
      this.b = param1b.b;
      this.d = param1b.d;
      this.c = param1b.c;
      this.e = param1b.e;
      this.f = param1b.f;
      this.g = param1b.g;
      this.h = param1b.h;
      this.i = param1b.i;
      this.j = param1b.j;
      this.k = param1b.k;
      this.l = param1b.l;
    }
    
    private Paint.Cap a(int param1Int, Paint.Cap param1Cap) {
      switch (param1Int) {
        default:
          return param1Cap;
        case 2:
          return Paint.Cap.SQUARE;
        case 1:
          return Paint.Cap.ROUND;
        case 0:
          break;
      } 
      return Paint.Cap.BUTT;
    }
    
    private Paint.Join a(int param1Int, Paint.Join param1Join) {
      switch (param1Int) {
        default:
          return param1Join;
        case 2:
          return Paint.Join.BEVEL;
        case 1:
          return Paint.Join.ROUND;
        case 0:
          break;
      } 
      return Paint.Join.MITER;
    }
    
    private void a(TypedArray param1TypedArray, XmlPullParser param1XmlPullParser) {
      this.p = null;
      if (!d.a(param1XmlPullParser, "pathData"))
        return; 
      String str = param1TypedArray.getString(0);
      if (str != null)
        this.n = str; 
      str = param1TypedArray.getString(2);
      if (str != null)
        this.m = c.a(str); 
      this.c = d.b(param1TypedArray, param1XmlPullParser, "fillColor", 1, this.c);
      this.f = d.a(param1TypedArray, param1XmlPullParser, "fillAlpha", 12, this.f);
      this.j = a(d.a(param1TypedArray, param1XmlPullParser, "strokeLineCap", 8, -1), this.j);
      this.k = a(d.a(param1TypedArray, param1XmlPullParser, "strokeLineJoin", 9, -1), this.k);
      this.l = d.a(param1TypedArray, param1XmlPullParser, "strokeMiterLimit", 10, this.l);
      this.a = d.b(param1TypedArray, param1XmlPullParser, "strokeColor", 3, this.a);
      this.d = d.a(param1TypedArray, param1XmlPullParser, "strokeAlpha", 11, this.d);
      this.b = d.a(param1TypedArray, param1XmlPullParser, "strokeWidth", 4, this.b);
      this.h = d.a(param1TypedArray, param1XmlPullParser, "trimPathEnd", 6, this.h);
      this.i = d.a(param1TypedArray, param1XmlPullParser, "trimPathOffset", 7, this.i);
      this.g = d.a(param1TypedArray, param1XmlPullParser, "trimPathStart", 5, this.g);
    }
    
    public void a(Resources param1Resources, AttributeSet param1AttributeSet, Resources.Theme param1Theme, XmlPullParser param1XmlPullParser) {
      TypedArray typedArray = e.b(param1Resources, param1Theme, param1AttributeSet, a.c);
      a(typedArray, param1XmlPullParser);
      typedArray.recycle();
    }
  }
  
  private static class c {
    final ArrayList<Object> a = new ArrayList();
    
    private final Matrix b = new Matrix();
    
    private float c = 0.0F;
    
    private float d = 0.0F;
    
    private float e = 0.0F;
    
    private float f = 1.0F;
    
    private float g = 1.0F;
    
    private float h = 0.0F;
    
    private float i = 0.0F;
    
    private final Matrix j = new Matrix();
    
    private int k;
    
    private int[] l;
    
    private String m = null;
    
    public c() {}
    
    public c(c param1c, a<String, Object> param1a) {
      this.c = param1c.c;
      this.d = param1c.d;
      this.e = param1c.e;
      this.f = param1c.f;
      this.g = param1c.g;
      this.h = param1c.h;
      this.i = param1c.i;
      this.l = param1c.l;
      this.m = param1c.m;
      this.k = param1c.k;
      if (this.m != null)
        param1a.put(this.m, this); 
      this.j.set(param1c.j);
      ArrayList arrayList = param1c.a;
      for (byte b1 = 0; b1 < arrayList.size(); b1++) {
        Object object = arrayList.get(b1);
        if (object instanceof c) {
          object = (c)object;
          this.a.add(new c(object, param1a));
        } else {
          if (object instanceof f.b) {
            object = new f.b((f.b)object);
          } else if (object instanceof f.a) {
            object = new f.a((f.a)object);
          } else {
            throw new IllegalStateException("Unknown object in the tree!");
          } 
          this.a.add(object);
          if (object.n != null)
            param1a.put(object.n, object); 
        } 
      } 
    }
    
    private void a(TypedArray param1TypedArray, XmlPullParser param1XmlPullParser) {
      this.l = null;
      this.c = d.a(param1TypedArray, param1XmlPullParser, "rotation", 5, this.c);
      this.d = param1TypedArray.getFloat(1, this.d);
      this.e = param1TypedArray.getFloat(2, this.e);
      this.f = d.a(param1TypedArray, param1XmlPullParser, "scaleX", 3, this.f);
      this.g = d.a(param1TypedArray, param1XmlPullParser, "scaleY", 4, this.g);
      this.h = d.a(param1TypedArray, param1XmlPullParser, "translateX", 6, this.h);
      this.i = d.a(param1TypedArray, param1XmlPullParser, "translateY", 7, this.i);
      String str = param1TypedArray.getString(0);
      if (str != null)
        this.m = str; 
      b();
    }
    
    private void b() {
      this.j.reset();
      this.j.postTranslate(-this.d, -this.e);
      this.j.postScale(this.f, this.g);
      this.j.postRotate(this.c, 0.0F, 0.0F);
      this.j.postTranslate(this.h + this.d, this.i + this.e);
    }
    
    public String a() { return this.m; }
    
    public void a(Resources param1Resources, AttributeSet param1AttributeSet, Resources.Theme param1Theme, XmlPullParser param1XmlPullParser) {
      TypedArray typedArray = e.b(param1Resources, param1Theme, param1AttributeSet, a.b);
      a(typedArray, param1XmlPullParser);
      typedArray.recycle();
    }
  }
  
  private static class d {
    protected c.b[] m = null;
    
    String n;
    
    int o;
    
    public d() {}
    
    public d(d param1d) {
      this.n = param1d.n;
      this.o = param1d.o;
      this.m = c.a(param1d.m);
    }
    
    public void a(Path param1Path) {
      param1Path.reset();
      if (this.m != null)
        c.b.a(this.m, param1Path); 
    }
    
    public boolean a() { return false; }
    
    public String b() { return this.n; }
  }
  
  private static class e {
    private static final Matrix j = new Matrix();
    
    float a = 0.0F;
    
    float b = 0.0F;
    
    float c = 0.0F;
    
    float d = 0.0F;
    
    int e = 255;
    
    String f = null;
    
    final a<String, Object> g = new a();
    
    private final Path h = new Path();
    
    private final Path i = new Path();
    
    private final Matrix k = new Matrix();
    
    private Paint l;
    
    private Paint m;
    
    private PathMeasure n;
    
    private int o;
    
    private final f.c p = new f.c();
    
    public e() {}
    
    public e(e param1e) {
      this.a = param1e.a;
      this.b = param1e.b;
      this.c = param1e.c;
      this.d = param1e.d;
      this.o = param1e.o;
      this.e = param1e.e;
      this.f = param1e.f;
      if (param1e.f != null)
        this.g.put(param1e.f, this); 
    }
    
    private static float a(float param1Float1, float param1Float2, float param1Float3, float param1Float4) { return param1Float1 * param1Float4 - param1Float2 * param1Float3; }
    
    private float a(Matrix param1Matrix) {
      float[] arrayOfFloat = new float[4];
      arrayOfFloat[0] = 0.0F;
      arrayOfFloat[1] = 1.0F;
      arrayOfFloat[2] = 1.0F;
      arrayOfFloat[3] = 0.0F;
      arrayOfFloat;
      param1Matrix.mapVectors(arrayOfFloat);
      float f1 = (float)Math.hypot(arrayOfFloat[0], arrayOfFloat[1]);
      float f2 = (float)Math.hypot(arrayOfFloat[2], arrayOfFloat[3]);
      float f3 = a(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], arrayOfFloat[3]);
      f1 = Math.max(f1, f2);
      f2 = 0.0F;
      if (f1 > 0.0F)
        f2 = Math.abs(f3) / f1; 
      return f2;
    }
    
    private void a(f.c param1c, Matrix param1Matrix, Canvas param1Canvas, int param1Int1, int param1Int2, ColorFilter param1ColorFilter) {
      f.c.b(param1c).set(param1Matrix);
      f.c.b(param1c).preConcat(f.c.c(param1c));
      for (byte b1 = 0; b1 < param1c.a.size(); b1++) {
        Object object = param1c.a.get(b1);
        if (object instanceof f.c) {
          a((f.c)object, f.c.b(param1c), param1Canvas, param1Int1, param1Int2, param1ColorFilter);
        } else if (object instanceof f.d) {
          a(param1c, (f.d)object, param1Canvas, param1Int1, param1Int2, param1ColorFilter);
        } 
      } 
    }
    
    private void a(f.c param1c, f.d param1d, Canvas param1Canvas, int param1Int1, int param1Int2, ColorFilter param1ColorFilter) {
      float f1 = param1Int1 / this.c;
      float f2 = param1Int2 / this.d;
      float f3 = Math.min(f1, f2);
      Matrix matrix = f.c.b(param1c);
      this.k.set(matrix);
      this.k.postScale(f1, f2);
      f2 = a(matrix);
      if (f2 == 0.0F)
        return; 
      param1d.a(this.h);
      Path path = this.h;
      this.i.reset();
      if (param1d.a()) {
        this.i.addPath(path, this.k);
        param1Canvas.clipPath(this.i, Region.Op.REPLACE);
        return;
      } 
      f.b b1 = (f.b)param1d;
      if (b1.g != 0.0F || b1.h != 1.0F) {
        float f4 = b1.g;
        float f5 = b1.i;
        float f6 = b1.h;
        float f7 = b1.i;
        if (this.n == null)
          this.n = new PathMeasure(); 
        this.n.setPath(this.h, false);
        f1 = this.n.getLength();
        f4 = (f4 + f5) % 1.0F * f1;
        f7 = (f6 + f7) % 1.0F * f1;
        path.reset();
        if (f4 > f7) {
          this.n.getSegment(f4, f1, path, true);
          this.n.getSegment(0.0F, f7, path, true);
        } else {
          this.n.getSegment(f4, f7, path, true);
        } 
        path.rLineTo(0.0F, 0.0F);
      } 
      this.i.addPath(path, this.k);
      if (b1.c != 0) {
        if (this.m == null) {
          this.m = new Paint();
          this.m.setStyle(Paint.Style.FILL);
          this.m.setAntiAlias(true);
        } 
        Paint paint = this.m;
        paint.setColor(f.a(b1.c, b1.f));
        paint.setColorFilter(param1ColorFilter);
        param1Canvas.drawPath(this.i, paint);
      } 
      if (b1.a != 0) {
        if (this.l == null) {
          this.l = new Paint();
          this.l.setStyle(Paint.Style.STROKE);
          this.l.setAntiAlias(true);
        } 
        Paint paint = this.l;
        if (b1.k != null)
          paint.setStrokeJoin(b1.k); 
        if (b1.j != null)
          paint.setStrokeCap(b1.j); 
        paint.setStrokeMiter(b1.l);
        paint.setColor(f.a(b1.a, b1.d));
        paint.setColorFilter(param1ColorFilter);
        paint.setStrokeWidth(b1.b * f3 * f2);
        param1Canvas.drawPath(this.i, paint);
      } 
    }
    
    public int a() { return this.e; }
    
    public void a(float param1Float) { a((int)(param1Float * 255.0F)); }
    
    public void a(int param1Int) { this.e = param1Int; }
    
    public void a(Canvas param1Canvas, int param1Int1, int param1Int2, ColorFilter param1ColorFilter) { a(this.p, j, param1Canvas, param1Int1, param1Int2, param1ColorFilter); }
    
    public float b() { return a() / 255.0F; }
  }
  
  private static class f extends Drawable.ConstantState {
    int a;
    
    f.e b;
    
    ColorStateList c = null;
    
    PorterDuff.Mode d = f.b;
    
    boolean e;
    
    Bitmap f;
    
    ColorStateList g;
    
    PorterDuff.Mode h;
    
    int i;
    
    boolean j;
    
    boolean k;
    
    Paint l;
    
    public f() { this.b = new f.e(); }
    
    public f(f param1f) {
      if (param1f != null) {
        this.a = param1f.a;
        if ((this.b = new f.e(param1f.b)).b(param1f.b) != null)
          f.e.a(this.b, new Paint(f.e.b(param1f.b))); 
        if (f.e.c(param1f.b) != null)
          f.e.b(this.b, new Paint(f.e.c(param1f.b))); 
        this.c = param1f.c;
        this.d = param1f.d;
        this.e = param1f.e;
      } 
    }
    
    public Paint a(ColorFilter param1ColorFilter) {
      if (!a() && param1ColorFilter == null)
        return null; 
      if (this.l == null) {
        this.l = new Paint();
        this.l.setFilterBitmap(true);
      } 
      this.l.setAlpha(this.b.a());
      this.l.setColorFilter(param1ColorFilter);
      return this.l;
    }
    
    public void a(int param1Int1, int param1Int2) {
      this.f.eraseColor(0);
      Canvas canvas = new Canvas(this.f);
      this.b.a(canvas, param1Int1, param1Int2, null);
    }
    
    public void a(Canvas param1Canvas, ColorFilter param1ColorFilter, Rect param1Rect) {
      Paint paint = a(param1ColorFilter);
      param1Canvas.drawBitmap(this.f, null, param1Rect, paint);
    }
    
    public boolean a() { return (this.b.a() < 255); }
    
    public void b(int param1Int1, int param1Int2) {
      if (this.f == null || !c(param1Int1, param1Int2)) {
        this.f = Bitmap.createBitmap(param1Int1, param1Int2, Bitmap.Config.ARGB_8888);
        this.k = true;
      } 
    }
    
    public boolean b() { return (!this.k && this.g == this.c && this.h == this.d && this.j == this.e && this.i == this.b.a()); }
    
    public void c() {
      this.g = this.c;
      this.h = this.d;
      this.i = this.b.a();
      this.j = this.e;
      this.k = false;
    }
    
    public boolean c(int param1Int1, int param1Int2) { return (param1Int1 == this.f.getWidth() && param1Int2 == this.f.getHeight()); }
    
    public int getChangingConfigurations() { return this.a; }
    
    public Drawable newDrawable() { return new f(this, null); }
    
    public Drawable newDrawable(Resources param1Resources) { return new f(this, null); }
  }
  
  private static class g extends Drawable.ConstantState {
    private final Drawable.ConstantState a;
    
    public g(Drawable.ConstantState param1ConstantState) { this.a = param1ConstantState; }
    
    public boolean canApplyTheme() { return this.a.canApplyTheme(); }
    
    public int getChangingConfigurations() { return this.a.getChangingConfigurations(); }
    
    public Drawable newDrawable() {
      f f = new f(null);
      f.a = (VectorDrawable)this.a.newDrawable();
      return f;
    }
    
    public Drawable newDrawable(Resources param1Resources) {
      f f = new f(null);
      f.a = (VectorDrawable)this.a.newDrawable(param1Resources);
      return f;
    }
    
    public Drawable newDrawable(Resources param1Resources, Resources.Theme param1Theme) {
      f f = new f(null);
      f.a = (VectorDrawable)this.a.newDrawable(param1Resources, param1Theme);
      return f;
    }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/a/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */