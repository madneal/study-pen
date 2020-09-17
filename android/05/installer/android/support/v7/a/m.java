package android.support.v7.a;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v4.g.a;
import android.support.v4.h.af;
import android.support.v7.b.a;
import android.support.v7.view.d;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

class m {
  private static final Class<?>[] a = { Context.class, AttributeSet.class };
  
  private static final int[] b = { 16843375 };
  
  private static final String[] c = { "android.widget.", "android.view.", "android.webkit." };
  
  private static final Map<String, Constructor<? extends View>> d = new a();
  
  private final Object[] e = new Object[2];
  
  private static Context a(Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2) {
    int i;
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.View, 0, 0);
    if (paramBoolean1) {
      i = typedArray.getResourceId(a.k.View_android_theme, 0);
    } else {
      i = 0;
    } 
    int j = i;
    if (paramBoolean2) {
      j = i;
      if (i == 0) {
        i = typedArray.getResourceId(a.k.View_theme, 0);
        j = i;
        if (i != 0) {
          Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
          j = i;
        } 
      } 
    } 
    typedArray.recycle();
    Context context = paramContext;
    if (j != 0) {
      if (paramContext instanceof d) {
        context = paramContext;
        return (((d)paramContext).a() != j) ? new d(paramContext, j) : context;
      } 
    } else {
      return context;
    } 
    return new d(paramContext, j);
  }
  
  private View a(Context paramContext, String paramString, AttributeSet paramAttributeSet) {
    String str = paramString;
    if (paramString.equals("view"))
      str = paramAttributeSet.getAttributeValue(null, "class"); 
    try {
      this.e[0] = paramContext;
      this.e[1] = paramAttributeSet;
      if (-1 == str.indexOf('.')) {
        for (byte b1 = 0; b1 < c.length; b1++) {
          view = a(paramContext, str, c[b1]);
          if (view != null)
            return view; 
        } 
        return null;
      } 
      return a(paramContext, str, null);
    } catch (Exception paramContext) {
      return null;
    } finally {
      this.e[0] = null;
      this.e[1] = null;
    } 
  }
  
  private View a(Context paramContext, String paramString1, String paramString2) {
    Constructor constructor1 = (Constructor)d.get(paramString1);
    Constructor constructor2 = constructor1;
    if (constructor1 == null)
      try {
        String str;
        ClassLoader classLoader = paramContext.getClassLoader();
        if (paramString2 != null) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append(paramString2);
          stringBuilder.append(paramString1);
          str = stringBuilder.toString();
        } else {
          str = paramString1;
        } 
        constructor2 = classLoader.loadClass(str).asSubclass(View.class).getConstructor(a);
        d.put(paramString1, constructor2);
        constructor2.setAccessible(true);
        return (View)constructor2.newInstance(this.e);
      } catch (Exception paramContext) {
        return null;
      }  
    constructor2.setAccessible(true);
    return (View)constructor2.newInstance(this.e);
  }
  
  private void a(View paramView, AttributeSet paramAttributeSet) {
    Context context = paramView.getContext();
    if (context instanceof ContextWrapper) {
      if (Build.VERSION.SDK_INT >= 15 && !af.s(paramView))
        return; 
      TypedArray typedArray = context.obtainStyledAttributes(paramAttributeSet, b);
      String str = typedArray.getString(0);
      if (str != null)
        paramView.setOnClickListener(new a(paramView, str)); 
      typedArray.recycle();
    } 
  }
  
  public final View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) { // Byte code:
    //   0: iload #5
    //   2: ifeq -> 18
    //   5: aload_1
    //   6: ifnull -> 18
    //   9: aload_1
    //   10: invokevirtual getContext : ()Landroid/content/Context;
    //   13: astore #9
    //   15: goto -> 21
    //   18: aload_3
    //   19: astore #9
    //   21: iload #6
    //   23: ifne -> 34
    //   26: aload #9
    //   28: astore_1
    //   29: iload #7
    //   31: ifeq -> 46
    //   34: aload #9
    //   36: aload #4
    //   38: iload #6
    //   40: iload #7
    //   42: invokestatic a : (Landroid/content/Context;Landroid/util/AttributeSet;ZZ)Landroid/content/Context;
    //   45: astore_1
    //   46: aload_1
    //   47: astore #9
    //   49: iload #8
    //   51: ifeq -> 60
    //   54: aload_1
    //   55: invokestatic a : (Landroid/content/Context;)Landroid/content/Context;
    //   58: astore #9
    //   60: aconst_null
    //   61: astore_1
    //   62: iconst_m1
    //   63: istore #10
    //   65: aload_2
    //   66: invokevirtual hashCode : ()I
    //   69: lookupswitch default -> 184, -1946472170 -> 373, -1455429095 -> 357, -1346021293 -> 341, -938935918 -> 326, -937446323 -> 311, -658531749 -> 295, -339785223 -> 280, 776382189 -> 264, 1125864064 -> 249, 1413872058 -> 233, 1601505219 -> 217, 1666676343 -> 202, 2001146706 -> 187
    //   184: goto -> 386
    //   187: aload_2
    //   188: ldc 'Button'
    //   190: invokevirtual equals : (Ljava/lang/Object;)Z
    //   193: ifeq -> 386
    //   196: iconst_2
    //   197: istore #10
    //   199: goto -> 386
    //   202: aload_2
    //   203: ldc 'EditText'
    //   205: invokevirtual equals : (Ljava/lang/Object;)Z
    //   208: ifeq -> 386
    //   211: iconst_3
    //   212: istore #10
    //   214: goto -> 386
    //   217: aload_2
    //   218: ldc 'CheckBox'
    //   220: invokevirtual equals : (Ljava/lang/Object;)Z
    //   223: ifeq -> 386
    //   226: bipush #6
    //   228: istore #10
    //   230: goto -> 386
    //   233: aload_2
    //   234: ldc 'AutoCompleteTextView'
    //   236: invokevirtual equals : (Ljava/lang/Object;)Z
    //   239: ifeq -> 386
    //   242: bipush #9
    //   244: istore #10
    //   246: goto -> 386
    //   249: aload_2
    //   250: ldc 'ImageView'
    //   252: invokevirtual equals : (Ljava/lang/Object;)Z
    //   255: ifeq -> 386
    //   258: iconst_1
    //   259: istore #10
    //   261: goto -> 386
    //   264: aload_2
    //   265: ldc 'RadioButton'
    //   267: invokevirtual equals : (Ljava/lang/Object;)Z
    //   270: ifeq -> 386
    //   273: bipush #7
    //   275: istore #10
    //   277: goto -> 386
    //   280: aload_2
    //   281: ldc 'Spinner'
    //   283: invokevirtual equals : (Ljava/lang/Object;)Z
    //   286: ifeq -> 386
    //   289: iconst_4
    //   290: istore #10
    //   292: goto -> 386
    //   295: aload_2
    //   296: ldc 'SeekBar'
    //   298: invokevirtual equals : (Ljava/lang/Object;)Z
    //   301: ifeq -> 386
    //   304: bipush #12
    //   306: istore #10
    //   308: goto -> 386
    //   311: aload_2
    //   312: ldc 'ImageButton'
    //   314: invokevirtual equals : (Ljava/lang/Object;)Z
    //   317: ifeq -> 386
    //   320: iconst_5
    //   321: istore #10
    //   323: goto -> 386
    //   326: aload_2
    //   327: ldc 'TextView'
    //   329: invokevirtual equals : (Ljava/lang/Object;)Z
    //   332: ifeq -> 386
    //   335: iconst_0
    //   336: istore #10
    //   338: goto -> 386
    //   341: aload_2
    //   342: ldc 'MultiAutoCompleteTextView'
    //   344: invokevirtual equals : (Ljava/lang/Object;)Z
    //   347: ifeq -> 386
    //   350: bipush #10
    //   352: istore #10
    //   354: goto -> 386
    //   357: aload_2
    //   358: ldc 'CheckedTextView'
    //   360: invokevirtual equals : (Ljava/lang/Object;)Z
    //   363: ifeq -> 386
    //   366: bipush #8
    //   368: istore #10
    //   370: goto -> 386
    //   373: aload_2
    //   374: ldc 'RatingBar'
    //   376: invokevirtual equals : (Ljava/lang/Object;)Z
    //   379: ifeq -> 386
    //   382: bipush #11
    //   384: istore #10
    //   386: iload #10
    //   388: tableswitch default -> 456, 0 -> 639, 1 -> 624, 2 -> 609, 3 -> 594, 4 -> 579, 5 -> 564, 6 -> 549, 7 -> 534, 8 -> 519, 9 -> 504, 10 -> 489, 11 -> 474, 12 -> 459
    //   456: goto -> 651
    //   459: new android/support/v7/widget/v
    //   462: dup
    //   463: aload #9
    //   465: aload #4
    //   467: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   470: astore_1
    //   471: goto -> 651
    //   474: new android/support/v7/widget/u
    //   477: dup
    //   478: aload #9
    //   480: aload #4
    //   482: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   485: astore_1
    //   486: goto -> 651
    //   489: new android/support/v7/widget/q
    //   492: dup
    //   493: aload #9
    //   495: aload #4
    //   497: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   500: astore_1
    //   501: goto -> 651
    //   504: new android/support/v7/widget/f
    //   507: dup
    //   508: aload #9
    //   510: aload #4
    //   512: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   515: astore_1
    //   516: goto -> 651
    //   519: new android/support/v7/widget/j
    //   522: dup
    //   523: aload #9
    //   525: aload #4
    //   527: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   530: astore_1
    //   531: goto -> 651
    //   534: new android/support/v7/widget/t
    //   537: dup
    //   538: aload #9
    //   540: aload #4
    //   542: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   545: astore_1
    //   546: goto -> 651
    //   549: new android/support/v7/widget/i
    //   552: dup
    //   553: aload #9
    //   555: aload #4
    //   557: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   560: astore_1
    //   561: goto -> 651
    //   564: new android/support/v7/widget/n
    //   567: dup
    //   568: aload #9
    //   570: aload #4
    //   572: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   575: astore_1
    //   576: goto -> 651
    //   579: new android/support/v7/widget/x
    //   582: dup
    //   583: aload #9
    //   585: aload #4
    //   587: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   590: astore_1
    //   591: goto -> 651
    //   594: new android/support/v7/widget/m
    //   597: dup
    //   598: aload #9
    //   600: aload #4
    //   602: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   605: astore_1
    //   606: goto -> 651
    //   609: new android/support/v7/widget/h
    //   612: dup
    //   613: aload #9
    //   615: aload #4
    //   617: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   620: astore_1
    //   621: goto -> 651
    //   624: new android/support/v7/widget/p
    //   627: dup
    //   628: aload #9
    //   630: aload #4
    //   632: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   635: astore_1
    //   636: goto -> 651
    //   639: new android/support/v7/widget/aa
    //   642: dup
    //   643: aload #9
    //   645: aload #4
    //   647: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   650: astore_1
    //   651: aload_1
    //   652: astore #11
    //   654: aload_1
    //   655: ifnonnull -> 678
    //   658: aload_1
    //   659: astore #11
    //   661: aload_3
    //   662: aload #9
    //   664: if_acmpeq -> 678
    //   667: aload_0
    //   668: aload #9
    //   670: aload_2
    //   671: aload #4
    //   673: invokespecial a : (Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
    //   676: astore #11
    //   678: aload #11
    //   680: ifnull -> 691
    //   683: aload_0
    //   684: aload #11
    //   686: aload #4
    //   688: invokespecial a : (Landroid/view/View;Landroid/util/AttributeSet;)V
    //   691: aload #11
    //   693: areturn }
  
  private static class a implements View.OnClickListener {
    private final View a;
    
    private final String b;
    
    private Method c;
    
    private Context d;
    
    public a(View param1View, String param1String) {
      this.a = param1View;
      this.b = param1String;
    }
    
    private void a(Context param1Context, String param1String) {
      while (true) {
        String str;
        if (param1Context != null) {
          try {
            if (!param1Context.isRestricted()) {
              Method method = param1Context.getClass().getMethod(this.b, new Class[] { View.class });
              if (method != null) {
                this.c = method;
                this.d = param1Context;
                return;
              } 
            } 
          } catch (NoSuchMethodException param1String) {}
          if (param1Context instanceof ContextWrapper) {
            param1Context = ((ContextWrapper)param1Context).getBaseContext();
            continue;
          } 
          param1Context = null;
          continue;
        } 
        int i = this.a.getId();
        if (i == -1) {
          str = "";
        } else {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append(" with id '");
          stringBuilder1.append(this.a.getContext().getResources().getResourceEntryName(i));
          stringBuilder1.append("'");
          str = stringBuilder1.toString();
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not find method ");
        stringBuilder.append(this.b);
        stringBuilder.append("(View) in a parent or ancestor Context for android:onClick ");
        stringBuilder.append("attribute defined on view ");
        stringBuilder.append(this.a.getClass());
        stringBuilder.append(str);
        throw new IllegalStateException(stringBuilder.toString());
      } 
    }
    
    public void onClick(View param1View) {
      if (this.c == null)
        a(this.a.getContext(), this.b); 
      try {
        this.c.invoke(this.d, new Object[] { param1View });
        return;
      } catch (IllegalAccessException param1View) {
        throw new IllegalStateException("Could not execute non-public method for android:onClick", param1View);
      } catch (InvocationTargetException param1View) {
        throw new IllegalStateException("Could not execute method for android:onClick", param1View);
      } 
    }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */