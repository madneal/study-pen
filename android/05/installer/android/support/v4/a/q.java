package android.support.v4.a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.g.c;
import android.support.v4.g.d;
import android.support.v4.h.af;
import android.support.v4.h.m;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

final class q extends p implements m {
  static final Interpolator A;
  
  static final Interpolator B;
  
  static final Interpolator C;
  
  static final Interpolator D;
  
  static boolean a = false;
  
  static final boolean b;
  
  static Field r;
  
  ArrayList<Runnable> c;
  
  Runnable[] d;
  
  boolean e;
  
  ArrayList<k> f;
  
  ArrayList<k> g;
  
  ArrayList<Integer> h;
  
  ArrayList<f> i;
  
  ArrayList<k> j;
  
  ArrayList<f> k;
  
  ArrayList<Integer> l;
  
  ArrayList<p.a> m;
  
  int n = 0;
  
  o o;
  
  m p;
  
  k q;
  
  boolean s;
  
  boolean t;
  
  boolean u;
  
  String v;
  
  boolean w;
  
  Bundle x = null;
  
  SparseArray<Parcelable> y = null;
  
  Runnable z = new Runnable(this) {
      public void run() { this.a.d(); }
    };
  
  static  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 11) {
      bool = true;
    } else {
      bool = false;
    } 
    b = bool;
    A = new DecelerateInterpolator(2.5F);
    B = new DecelerateInterpolator(1.5F);
    C = new AccelerateInterpolator(2.5F);
    D = new AccelerateInterpolator(1.5F);
  }
  
  static Animation a(Context paramContext, float paramFloat1, float paramFloat2) {
    AlphaAnimation alphaAnimation = new AlphaAnimation(paramFloat1, paramFloat2);
    alphaAnimation.setInterpolator(B);
    alphaAnimation.setDuration(220L);
    return alphaAnimation;
  }
  
  static Animation a(Context paramContext, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    AnimationSet animationSet = new AnimationSet(false);
    ScaleAnimation scaleAnimation = new ScaleAnimation(paramFloat1, paramFloat2, paramFloat1, paramFloat2, 1, 0.5F, 1, 0.5F);
    scaleAnimation.setInterpolator(A);
    scaleAnimation.setDuration(220L);
    animationSet.addAnimation(scaleAnimation);
    AlphaAnimation alphaAnimation = new AlphaAnimation(paramFloat3, paramFloat4);
    alphaAnimation.setInterpolator(B);
    alphaAnimation.setDuration(220L);
    animationSet.addAnimation(alphaAnimation);
    return animationSet;
  }
  
  private void a(RuntimeException paramRuntimeException) {
    Log.e("FragmentManager", paramRuntimeException.getMessage());
    Log.e("FragmentManager", "Activity state:");
    printWriter = new PrintWriter(new d("FragmentManager"));
    if (this.o != null) {
      try {
        this.o.a("  ", null, printWriter, new String[0]);
      } catch (Exception printWriter) {
        Log.e("FragmentManager", "Failed dumping state", printWriter);
      } 
    } else {
      a("  ", null, printWriter, new String[0]);
    } 
    throw paramRuntimeException;
  }
  
  static boolean a(View paramView, Animation paramAnimation) { return (Build.VERSION.SDK_INT >= 19 && af.c(paramView) == 0 && af.m(paramView) && a(paramAnimation)); }
  
  static boolean a(Animation paramAnimation) {
    if (paramAnimation instanceof AlphaAnimation)
      return true; 
    if (paramAnimation instanceof AnimationSet) {
      List list = ((AnimationSet)paramAnimation).getAnimations();
      for (byte b1 = 0; b1 < list.size(); b1++) {
        if (list.get(b1) instanceof AlphaAnimation)
          return true; 
      } 
    } 
    return false;
  }
  
  public static int b(int paramInt, boolean paramBoolean) { return (paramInt != 4097) ? ((paramInt != 4099) ? ((paramInt != 8194) ? -1 : (paramBoolean ? 3 : 4)) : (paramBoolean ? 5 : 6)) : (paramBoolean ? 1 : 2); }
  
  private void b(View paramView, Animation paramAnimation) {
    if (paramView != null) {
      if (paramAnimation == null)
        return; 
      if (a(paramView, paramAnimation)) {
        NoSuchFieldException noSuchFieldException = null;
        try {
          if (r == null) {
            r = Animation.class.getDeclaredField("mListener");
            r.setAccessible(true);
          } 
          illegalAccessException = (Animation.AnimationListener)r.get(paramAnimation);
        } catch (NoSuchFieldException null) {
          String str = "No field with the name mListener is found in Animation class";
          Log.e("FragmentManager", str, illegalAccessException);
          illegalAccessException = noSuchFieldException;
        } catch (IllegalAccessException illegalAccessException) {
          String str = "Cannot access Animation's mListener field";
        } 
        paramAnimation.setAnimationListener(new a(paramView, paramAnimation, illegalAccessException));
      } 
    } 
  }
  
  public static int c(int paramInt) {
    char c1 = ' ';
    if (paramInt != 4097) {
      if (paramInt != 4099)
        return (paramInt != 8194) ? 0 : 4097; 
      c1 = 'ဃ';
    } 
    return c1;
  }
  
  private void t() {
    if (this.t)
      throw new IllegalStateException("Can not perform this action after onSaveInstanceState"); 
    if (this.v != null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Can not perform this action inside of ");
      stringBuilder.append(this.v);
      throw new IllegalStateException(stringBuilder.toString());
    } 
  }
  
  public k a(int paramInt) {
    if (this.g != null)
      for (int i1 = this.g.size() - 1; i1 >= 0; i1--) {
        k k1 = (k)this.g.get(i1);
        if (k1 != null && k1.w == paramInt)
          return k1; 
      }  
    if (this.f != null)
      for (int i1 = this.f.size() - 1; i1 >= 0; i1--) {
        k k1 = (k)this.f.get(i1);
        if (k1 != null && k1.w == paramInt)
          return k1; 
      }  
    return null;
  }
  
  public k a(Bundle paramBundle, String paramString) {
    int i1 = paramBundle.getInt(paramString, -1);
    if (i1 == -1)
      return null; 
    if (i1 >= this.f.size()) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Fragment no longer exists for key ");
      stringBuilder.append(paramString);
      stringBuilder.append(": index ");
      stringBuilder.append(i1);
      a(new IllegalStateException(stringBuilder.toString()));
    } 
    k k1 = (k)this.f.get(i1);
    if (k1 == null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Fragment no longer exists for key ");
      stringBuilder.append(paramString);
      stringBuilder.append(": index ");
      stringBuilder.append(i1);
      a(new IllegalStateException(stringBuilder.toString()));
    } 
    return k1;
  }
  
  public k a(String paramString) {
    if (this.g != null && paramString != null)
      for (int i1 = this.g.size() - 1; i1 >= 0; i1--) {
        k k1 = (k)this.g.get(i1);
        if (k1 != null && paramString.equals(k1.y))
          return k1; 
      }  
    if (this.f != null && paramString != null)
      for (int i1 = this.f.size() - 1; i1 >= 0; i1--) {
        k k1 = (k)this.f.get(i1);
        if (k1 != null && paramString.equals(k1.y))
          return k1; 
      }  
    return null;
  }
  
  public View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    boolean bool = "fragment".equals(paramString);
    paramString = null;
    if (!bool)
      return null; 
    String str1 = paramAttributeSet.getAttributeValue(null, "class");
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, b.a);
    int i1 = 0;
    String str2 = str1;
    if (str1 == null)
      str2 = typedArray.getString(0); 
    int i2 = typedArray.getResourceId(1, -1);
    str1 = typedArray.getString(2);
    typedArray.recycle();
    if (!k.b(this.o.g(), str2))
      return null; 
    if (paramView != null)
      i1 = paramView.getId(); 
    if (i1 == -1 && i2 == -1 && str1 == null) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(paramAttributeSet.getPositionDescription());
      stringBuilder1.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
      stringBuilder1.append(str2);
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = paramString;
    if (i2 != -1)
      stringBuilder = a(i2); 
    k k1 = stringBuilder;
    if (stringBuilder == null) {
      k1 = stringBuilder;
      if (str1 != null)
        k1 = a(str1); 
    } 
    stringBuilder = k1;
    if (k1 == null) {
      stringBuilder = k1;
      if (i1 != -1)
        stringBuilder = a(i1); 
    } 
    if (a) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("onCreateView: id=0x");
      stringBuilder1.append(Integer.toHexString(i2));
      stringBuilder1.append(" fname=");
      stringBuilder1.append(str2);
      stringBuilder1.append(" existing=");
      stringBuilder1.append(stringBuilder);
      Log.v("FragmentManager", stringBuilder1.toString());
    } 
    if (stringBuilder == null) {
      int i3;
      stringBuilder = k.a(paramContext, str2);
      stringBuilder.o = true;
      if (i2 != 0) {
        i3 = i2;
      } else {
        i3 = i1;
      } 
      stringBuilder.w = i3;
      stringBuilder.x = i1;
      stringBuilder.y = str1;
      stringBuilder.p = true;
      stringBuilder.s = this;
      stringBuilder.t = this.o;
      stringBuilder.a(this.o.g(), paramAttributeSet, stringBuilder.e);
      a(stringBuilder, true);
    } else {
      if (stringBuilder.p) {
        stringBuilder = new StringBuilder();
        stringBuilder.append(paramAttributeSet.getPositionDescription());
        stringBuilder.append(": Duplicate id 0x");
        stringBuilder.append(Integer.toHexString(i2));
        stringBuilder.append(", tag ");
        stringBuilder.append(str1);
        stringBuilder.append(", or parent id 0x");
        stringBuilder.append(Integer.toHexString(i1));
        stringBuilder.append(" with another fragment for ");
        stringBuilder.append(str2);
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      stringBuilder.p = true;
      stringBuilder.t = this.o;
      if (!stringBuilder.C)
        stringBuilder.a(this.o.g(), paramAttributeSet, stringBuilder.e); 
    } 
    if (this.n < 1 && stringBuilder.o) {
      a(stringBuilder, 1, 0, 0, false);
    } else {
      b(stringBuilder);
    } 
    if (stringBuilder.I == null) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Fragment ");
      stringBuilder.append(str2);
      stringBuilder.append(" did not create a view.");
      throw new IllegalStateException(stringBuilder.toString());
    } 
    if (i2 != 0)
      stringBuilder.I.setId(i2); 
    if (stringBuilder.I.getTag() == null)
      stringBuilder.I.setTag(str1); 
    return stringBuilder.I;
  }
  
  Animation a(k paramk, int paramInt1, boolean paramBoolean, int paramInt2) {
    Animation animation = paramk.a(paramInt1, paramBoolean, paramk.G);
    if (animation != null)
      return animation; 
    if (paramk.G != 0) {
      Animation animation1 = AnimationUtils.loadAnimation(this.o.g(), paramk.G);
      if (animation1 != null)
        return animation1; 
    } 
    if (paramInt1 == 0)
      return null; 
    paramInt1 = b(paramInt1, paramBoolean);
    if (paramInt1 < 0)
      return null; 
    switch (paramInt1) {
      default:
        paramInt1 = paramInt2;
        if (paramInt2 == 0) {
          paramInt1 = paramInt2;
          if (this.o.d())
            paramInt1 = this.o.e(); 
        } 
        break;
      case 6:
        return a(this.o.g(), 1.0F, 0.0F);
      case 5:
        return a(this.o.g(), 0.0F, 1.0F);
      case 4:
        return a(this.o.g(), 1.0F, 1.075F, 1.0F, 0.0F);
      case 3:
        return a(this.o.g(), 0.975F, 1.0F, 0.0F, 1.0F);
      case 2:
        return a(this.o.g(), 1.0F, 0.975F, 1.0F, 0.0F);
      case 1:
        return a(this.o.g(), 1.125F, 1.0F, 0.0F, 1.0F);
    } 
    if (paramInt1 == 0);
    return null;
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    if (this.o == null && paramInt1 != 0)
      throw new IllegalStateException("No host"); 
    if (!paramBoolean && this.n == paramInt1)
      return; 
    this.n = paramInt1;
    if (this.f != null) {
      byte b1 = 0;
      byte b2;
      for (b2 = 0; b1 < this.f.size(); b2 = b3) {
        k k1 = (k)this.f.get(b1);
        byte b3 = b2;
        if (k1 != null) {
          a(k1, paramInt1, paramInt2, paramInt3, false);
          b3 = b2;
          if (k1.M != null)
            b3 = b2 | k1.M.a(); 
        } 
        b1++;
      } 
      if (b2 == 0)
        c(); 
      if (this.s && this.o != null && this.n == 5) {
        this.o.c();
        this.s = false;
      } 
    } 
  }
  
  public void a(int paramInt, f paramf) { // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield k : Ljava/util/ArrayList;
    //   6: ifnonnull -> 22
    //   9: new java/util/ArrayList
    //   12: astore_3
    //   13: aload_3
    //   14: invokespecial <init> : ()V
    //   17: aload_0
    //   18: aload_3
    //   19: putfield k : Ljava/util/ArrayList;
    //   22: aload_0
    //   23: getfield k : Ljava/util/ArrayList;
    //   26: invokevirtual size : ()I
    //   29: istore #4
    //   31: iload #4
    //   33: istore #5
    //   35: iload_1
    //   36: iload #4
    //   38: if_icmpge -> 106
    //   41: getstatic android/support/v4/a/q.a : Z
    //   44: ifeq -> 93
    //   47: new java/lang/StringBuilder
    //   50: astore_3
    //   51: aload_3
    //   52: invokespecial <init> : ()V
    //   55: aload_3
    //   56: ldc_w 'Setting back stack index '
    //   59: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: pop
    //   63: aload_3
    //   64: iload_1
    //   65: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   68: pop
    //   69: aload_3
    //   70: ldc_w ' to '
    //   73: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: pop
    //   77: aload_3
    //   78: aload_2
    //   79: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   82: pop
    //   83: ldc 'FragmentManager'
    //   85: aload_3
    //   86: invokevirtual toString : ()Ljava/lang/String;
    //   89: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   92: pop
    //   93: aload_0
    //   94: getfield k : Ljava/util/ArrayList;
    //   97: iload_1
    //   98: aload_2
    //   99: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   102: pop
    //   103: goto -> 260
    //   106: iload #5
    //   108: iload_1
    //   109: if_icmpge -> 199
    //   112: aload_0
    //   113: getfield k : Ljava/util/ArrayList;
    //   116: aconst_null
    //   117: invokevirtual add : (Ljava/lang/Object;)Z
    //   120: pop
    //   121: aload_0
    //   122: getfield l : Ljava/util/ArrayList;
    //   125: ifnonnull -> 141
    //   128: new java/util/ArrayList
    //   131: astore_3
    //   132: aload_3
    //   133: invokespecial <init> : ()V
    //   136: aload_0
    //   137: aload_3
    //   138: putfield l : Ljava/util/ArrayList;
    //   141: getstatic android/support/v4/a/q.a : Z
    //   144: ifeq -> 180
    //   147: new java/lang/StringBuilder
    //   150: astore_3
    //   151: aload_3
    //   152: invokespecial <init> : ()V
    //   155: aload_3
    //   156: ldc_w 'Adding available back stack index '
    //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: pop
    //   163: aload_3
    //   164: iload #5
    //   166: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   169: pop
    //   170: ldc 'FragmentManager'
    //   172: aload_3
    //   173: invokevirtual toString : ()Ljava/lang/String;
    //   176: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   179: pop
    //   180: aload_0
    //   181: getfield l : Ljava/util/ArrayList;
    //   184: iload #5
    //   186: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   189: invokevirtual add : (Ljava/lang/Object;)Z
    //   192: pop
    //   193: iinc #5, 1
    //   196: goto -> 106
    //   199: getstatic android/support/v4/a/q.a : Z
    //   202: ifeq -> 251
    //   205: new java/lang/StringBuilder
    //   208: astore_3
    //   209: aload_3
    //   210: invokespecial <init> : ()V
    //   213: aload_3
    //   214: ldc_w 'Adding back stack index '
    //   217: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   220: pop
    //   221: aload_3
    //   222: iload_1
    //   223: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   226: pop
    //   227: aload_3
    //   228: ldc_w ' with '
    //   231: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   234: pop
    //   235: aload_3
    //   236: aload_2
    //   237: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   240: pop
    //   241: ldc 'FragmentManager'
    //   243: aload_3
    //   244: invokevirtual toString : ()Ljava/lang/String;
    //   247: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   250: pop
    //   251: aload_0
    //   252: getfield k : Ljava/util/ArrayList;
    //   255: aload_2
    //   256: invokevirtual add : (Ljava/lang/Object;)Z
    //   259: pop
    //   260: aload_0
    //   261: monitorexit
    //   262: return
    //   263: astore_2
    //   264: aload_0
    //   265: monitorexit
    //   266: aload_2
    //   267: athrow
    // Exception table:
    //   from	to	target	type
    //   2	22	263	finally
    //   22	31	263	finally
    //   41	93	263	finally
    //   93	103	263	finally
    //   112	141	263	finally
    //   141	180	263	finally
    //   180	193	263	finally
    //   199	251	263	finally
    //   251	260	263	finally
    //   260	262	263	finally
    //   264	266	263	finally }
  
  void a(int paramInt, boolean paramBoolean) { a(paramInt, 0, 0, paramBoolean); }
  
  public void a(Configuration paramConfiguration) {
    if (this.g != null)
      for (byte b1 = 0; b1 < this.g.size(); b1++) {
        k k1 = (k)this.g.get(b1);
        if (k1 != null)
          k1.a(paramConfiguration); 
      }  
  }
  
  public void a(Bundle paramBundle, String paramString, k paramk) {
    if (paramk.g < 0) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Fragment ");
      stringBuilder.append(paramk);
      stringBuilder.append(" is not currently in the FragmentManager");
      a(new IllegalStateException(stringBuilder.toString()));
    } 
    paramBundle.putInt(paramString, paramk.g);
  }
  
  void a(Parcelable paramParcelable, List<k> paramList) {
    if (paramParcelable == null)
      return; 
    paramParcelable = (r)paramParcelable;
    if (paramParcelable.a == null)
      return; 
    if (paramList != null)
      for (byte b2 = 0; b2 < paramList.size(); b2++) {
        k k1 = (k)paramList.get(b2);
        if (a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("restoreAllState: re-attaching retained ");
          stringBuilder.append(k1);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        s s1 = paramParcelable.a[k1.g];
        s1.k = k1;
        k1.f = null;
        k1.r = 0;
        k1.p = false;
        k1.m = false;
        k1.j = null;
        if (s1.j != null) {
          s1.j.setClassLoader(this.o.g().getClassLoader());
          k1.f = s1.j.getSparseParcelableArray("android:view_state");
          k1.e = s1.j;
        } 
      }  
    this.f = new ArrayList(paramParcelable.a.length);
    if (this.h != null)
      this.h.clear(); 
    byte b1;
    for (b1 = 0; b1 < paramParcelable.a.length; b1++) {
      s s1 = paramParcelable.a[b1];
      if (s1 != null) {
        k k1 = s1.a(this.o, this.q);
        if (a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("restoreAllState: active #");
          stringBuilder.append(b1);
          stringBuilder.append(": ");
          stringBuilder.append(k1);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        this.f.add(k1);
        s1.k = null;
      } else {
        this.f.add(null);
        if (this.h == null)
          this.h = new ArrayList(); 
        if (a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("restoreAllState: avail #");
          stringBuilder.append(b1);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        this.h.add(Integer.valueOf(b1));
      } 
    } 
    if (paramList != null)
      for (b1 = 0; b1 < paramList.size(); b1++) {
        k k1 = (k)paramList.get(b1);
        if (k1.k >= 0)
          if (k1.k < this.f.size()) {
            k1.j = (k)this.f.get(k1.k);
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Re-attaching retained fragment ");
            stringBuilder.append(k1);
            stringBuilder.append(" target no longer exists: ");
            stringBuilder.append(k1.k);
            Log.w("FragmentManager", stringBuilder.toString());
            k1.j = null;
          }  
      }  
    if (paramParcelable.b != null) {
      this.g = new ArrayList(paramParcelable.b.length);
      for (b1 = 0; b1 < paramParcelable.b.length; b1++) {
        k k1 = (k)this.f.get(paramParcelable.b[b1]);
        if (k1 == null) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("No instantiated fragment for index #");
          stringBuilder.append(paramParcelable.b[b1]);
          a(new IllegalStateException(stringBuilder.toString()));
        } 
        k1.m = true;
        if (a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("restoreAllState: added #");
          stringBuilder.append(b1);
          stringBuilder.append(": ");
          stringBuilder.append(k1);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        if (this.g.contains(k1))
          throw new IllegalStateException("Already added!"); 
        this.g.add(k1);
      } 
    } else {
      this.g = null;
    } 
    if (paramParcelable.c != null) {
      this.i = new ArrayList(paramParcelable.c.length);
      for (b1 = 0; b1 < paramParcelable.c.length; b1++) {
        f f1 = paramParcelable.c[b1].a(this);
        if (a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("restoreAllState: back stack #");
          stringBuilder.append(b1);
          stringBuilder.append(" (index ");
          stringBuilder.append(f1.p);
          stringBuilder.append("): ");
          stringBuilder.append(f1);
          Log.v("FragmentManager", stringBuilder.toString());
          f1.a("  ", new PrintWriter(new d("FragmentManager")), false);
        } 
        this.i.add(f1);
        if (f1.p >= 0)
          a(f1.p, f1); 
      } 
    } else {
      this.i = null;
    } 
  }
  
  void a(f paramf) {
    if (this.i == null)
      this.i = new ArrayList(); 
    this.i.add(paramf);
    e();
  }
  
  public void a(k paramk) {
    if (paramk.K) {
      if (this.e) {
        this.w = true;
        return;
      } 
      paramk.K = false;
      a(paramk, this.n, 0, 0, false);
    } 
  }
  
  public void a(k paramk, int paramInt1, int paramInt2) {
    if (a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("remove: ");
      stringBuilder.append(paramk);
      stringBuilder.append(" nesting=");
      stringBuilder.append(paramk.r);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    int i1 = paramk.a() ^ true;
    if (!paramk.A || i1) {
      if (this.g != null)
        this.g.remove(paramk); 
      if (paramk.D && paramk.E)
        this.s = true; 
      paramk.m = false;
      paramk.n = true;
      if (i1) {
        i1 = 0;
      } else {
        i1 = 1;
      } 
      a(paramk, i1, paramInt1, paramInt2, false);
    } 
  }
  
  void a(k paramk, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    boolean bool = paramk.m;
    int i1 = 1;
    if (!bool || paramk.A) {
      int i3 = paramInt1;
      paramInt1 = i3;
      if (i3 > 1)
        paramInt1 = 1; 
    } 
    int i2 = paramInt1;
    if (paramk.n) {
      i2 = paramInt1;
      if (paramInt1 > paramk.b)
        i2 = paramk.b; 
    } 
    if (paramk.K && paramk.b < 4 && i2 > 3) {
      paramInt1 = 3;
    } else {
      paramInt1 = i2;
    } 
    if (paramk.b < paramInt1) {
      q q1;
      if (paramk.o && !paramk.p)
        return; 
      if (paramk.c != null) {
        paramk.c = null;
        a(paramk, paramk.d, 0, 0, true);
      } 
      i1 = paramInt1;
      i2 = paramInt1;
      int i3 = paramInt1;
      switch (paramk.b) {
        default:
          i2 = paramInt1;
          break;
        case 4:
          i2 = i1;
          if (i1 > 4) {
            if (a) {
              q1 = new StringBuilder();
              q1.append("moveto RESUMED: ");
              q1.append(paramk);
              Log.v("FragmentManager", q1.toString());
            } 
            paramk.A();
            paramk.e = null;
            paramk.f = null;
            i2 = i1;
          } 
          break;
        case 0:
          if (a) {
            q1 = new StringBuilder();
            q1.append("moveto CREATED: ");
            q1.append(paramk);
            Log.v("FragmentManager", q1.toString());
          } 
          i1 = paramInt1;
          if (paramk.e != null) {
            paramk.e.setClassLoader(this.o.g().getClassLoader());
            paramk.f = paramk.e.getSparseParcelableArray("android:view_state");
            paramk.j = a(paramk.e, "android:target_state");
            if (paramk.j != null)
              paramk.l = paramk.e.getInt("android:target_req_state", 0); 
            paramk.L = paramk.e.getBoolean("android:user_visible_hint", true);
            i1 = paramInt1;
            if (!paramk.L) {
              paramk.K = true;
              i1 = paramInt1;
              if (paramInt1 > 3)
                i1 = 3; 
            } 
          } 
          paramk.t = this.o;
          paramk.v = this.q;
          if (this.q != null) {
            q1 = this.q.u;
          } else {
            q1 = this.o.i();
          } 
          paramk.s = q1;
          paramk.F = false;
          paramk.a(this.o.g());
          if (!paramk.F) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(paramk);
            stringBuilder.append(" did not call through to super.onAttach()");
            throw new ab(stringBuilder.toString());
          } 
          if (paramk.v == null)
            this.o.b(paramk); 
          if (!paramk.C)
            paramk.g(paramk.e); 
          paramk.C = false;
          i2 = i1;
          if (paramk.o) {
            paramk.I = paramk.b(paramk.b(paramk.e), null, paramk.e);
            if (paramk.I != null) {
              paramk.J = paramk.I;
              if (Build.VERSION.SDK_INT >= 11) {
                af.a(paramk.I, false);
              } else {
                paramk.I = z.a(paramk.I);
              } 
              if (paramk.z)
                paramk.I.setVisibility(8); 
              paramk.a(paramk.I, paramk.e);
              i2 = i1;
            } else {
              paramk.J = null;
              i2 = i1;
            } 
          } 
        case 1:
          i3 = i2;
          if (i2 > 1) {
            if (a) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("moveto ACTIVITY_CREATED: ");
              stringBuilder.append(paramk);
              Log.v("FragmentManager", stringBuilder.toString());
            } 
            if (!paramk.o) {
              if (paramk.x != 0) {
                ViewGroup viewGroup2 = (ViewGroup)this.p.a(paramk.x);
                ViewGroup viewGroup1 = viewGroup2;
                if (viewGroup2 == null) {
                  viewGroup1 = viewGroup2;
                  if (!paramk.q) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("No view found for id 0x");
                    stringBuilder.append(Integer.toHexString(paramk.x));
                    stringBuilder.append(" (");
                    stringBuilder.append(paramk.c().getResourceName(paramk.x));
                    stringBuilder.append(") for fragment ");
                    stringBuilder.append(paramk);
                    a(new IllegalArgumentException(stringBuilder.toString()));
                    ViewGroup viewGroup = viewGroup2;
                  } 
                } 
              } else {
                q1 = null;
              } 
              paramk.H = q1;
              paramk.I = paramk.b(paramk.b(paramk.e), q1, paramk.e);
              if (paramk.I != null) {
                paramk.J = paramk.I;
                if (Build.VERSION.SDK_INT >= 11) {
                  af.a(paramk.I, false);
                } else {
                  paramk.I = z.a(paramk.I);
                } 
                if (q1 != null) {
                  Animation animation = a(paramk, paramInt2, true, paramInt3);
                  if (animation != null) {
                    b(paramk.I, animation);
                    paramk.I.startAnimation(animation);
                  } 
                  q1.addView(paramk.I);
                } 
                if (paramk.z)
                  paramk.I.setVisibility(8); 
                paramk.a(paramk.I, paramk.e);
              } else {
                paramk.J = null;
              } 
            } 
            paramk.h(paramk.e);
            if (paramk.I != null)
              paramk.a(paramk.e); 
            paramk.e = null;
            i3 = i2;
          } 
        case 2:
        case 3:
          i1 = i3;
          if (i3 > 3) {
            if (a) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("moveto STARTED: ");
              stringBuilder.append(paramk);
              Log.v("FragmentManager", stringBuilder.toString());
            } 
            paramk.z();
            i1 = i3;
          } 
      } 
    } else {
      i2 = paramInt1;
      if (paramk.b > paramInt1)
        switch (paramk.b) {
          default:
            i2 = paramInt1;
            break;
          case 5:
            if (paramInt1 < 5) {
              if (a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("movefrom RESUMED: ");
                stringBuilder.append(paramk);
                Log.v("FragmentManager", stringBuilder.toString());
              } 
              paramk.C();
            } 
          case 4:
            if (paramInt1 < 4) {
              if (a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("movefrom STARTED: ");
                stringBuilder.append(paramk);
                Log.v("FragmentManager", stringBuilder.toString());
              } 
              paramk.D();
            } 
          case 3:
            if (paramInt1 < 3) {
              if (a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("movefrom STOPPED: ");
                stringBuilder.append(paramk);
                Log.v("FragmentManager", stringBuilder.toString());
              } 
              paramk.E();
            } 
          case 2:
            if (paramInt1 < 2) {
              if (a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("movefrom ACTIVITY_CREATED: ");
                stringBuilder.append(paramk);
                Log.v("FragmentManager", stringBuilder.toString());
              } 
              if (paramk.I != null && this.o.a(paramk) && paramk.f == null)
                e(paramk); 
              paramk.F();
              if (paramk.I != null && paramk.H != null) {
                Animation animation;
                if (this.n > 0 && !this.u) {
                  animation = a(paramk, paramInt2, false, paramInt3);
                } else {
                  animation = null;
                } 
                if (animation != null) {
                  paramk.c = paramk.I;
                  paramk.d = paramInt1;
                  animation.setAnimationListener(new a(this, paramk.I, animation, paramk) {
                        public void onAnimationEnd(Animation param1Animation) {
                          super.onAnimationEnd(param1Animation);
                          if (this.a.c != null) {
                            this.a.c = null;
                            this.b.a(this.a, this.a.d, 0, 0, false);
                          } 
                        }
                      });
                  paramk.I.startAnimation(animation);
                } 
                paramk.H.removeView(paramk.I);
              } 
              paramk.H = null;
              paramk.I = null;
              paramk.J = null;
            } 
          case 1:
            i2 = paramInt1;
            if (paramInt1 < 1) {
              if (this.u && paramk.c != null) {
                View view = paramk.c;
                paramk.c = null;
                view.clearAnimation();
              } 
              if (paramk.c != null) {
                paramk.d = paramInt1;
                paramInt1 = i1;
              } else {
                if (a) {
                  StringBuilder stringBuilder = new StringBuilder();
                  stringBuilder.append("movefrom CREATED: ");
                  stringBuilder.append(paramk);
                  Log.v("FragmentManager", stringBuilder.toString());
                } 
                if (!paramk.C) {
                  paramk.G();
                } else {
                  paramk.b = 0;
                } 
                paramk.F = false;
                paramk.o();
                if (!paramk.F) {
                  StringBuilder stringBuilder = new StringBuilder();
                  stringBuilder.append("Fragment ");
                  stringBuilder.append(paramk);
                  stringBuilder.append(" did not call through to super.onDetach()");
                  throw new ab(stringBuilder.toString());
                } 
                i2 = paramInt1;
                if (!paramBoolean) {
                  if (!paramk.C) {
                    d(paramk);
                    i2 = paramInt1;
                    break;
                  } 
                  paramk.t = null;
                  paramk.v = null;
                  paramk.s = null;
                  paramk.u = null;
                  i2 = paramInt1;
                } 
                break;
              } 
            } else {
              break;
            } 
            if (paramk.b != paramInt1) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("moveToState: Fragment state for ");
              stringBuilder.append(paramk);
              stringBuilder.append(" not updated inline; ");
              stringBuilder.append("expected state ");
              stringBuilder.append(paramInt1);
              stringBuilder.append(" found ");
              stringBuilder.append(paramk.b);
              Log.w("FragmentManager", stringBuilder.toString());
              paramk.b = paramInt1;
            } 
            return;
        }  
    } 
    paramInt1 = i2;
    if (paramk.b != paramInt1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("moveToState: Fragment state for ");
      stringBuilder.append(paramk);
      stringBuilder.append(" not updated inline; ");
      stringBuilder.append("expected state ");
      stringBuilder.append(paramInt1);
      stringBuilder.append(" found ");
      stringBuilder.append(paramk.b);
      Log.w("FragmentManager", stringBuilder.toString());
      paramk.b = paramInt1;
    } 
  }
  
  public void a(k paramk, boolean paramBoolean) {
    if (this.g == null)
      this.g = new ArrayList(); 
    if (a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("add: ");
      stringBuilder.append(paramk);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    c(paramk);
    if (!paramk.A) {
      if (this.g.contains(paramk)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment already added: ");
        stringBuilder.append(paramk);
        throw new IllegalStateException(stringBuilder.toString());
      } 
      this.g.add(paramk);
      paramk.m = true;
      paramk.n = false;
      if (paramk.D && paramk.E)
        this.s = true; 
      if (paramBoolean)
        b(paramk); 
    } 
  }
  
  public void a(o paramo, m paramm, k paramk) {
    if (this.o != null)
      throw new IllegalStateException("Already attached"); 
    this.o = paramo;
    this.p = paramm;
    this.q = paramk;
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) { // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #5
    //   9: aload #5
    //   11: aload_1
    //   12: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   15: pop
    //   16: aload #5
    //   18: ldc_w '    '
    //   21: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: pop
    //   25: aload #5
    //   27: invokevirtual toString : ()Ljava/lang/String;
    //   30: astore #5
    //   32: aload_0
    //   33: getfield f : Ljava/util/ArrayList;
    //   36: astore #6
    //   38: iconst_0
    //   39: istore #7
    //   41: aload #6
    //   43: ifnull -> 167
    //   46: aload_0
    //   47: getfield f : Ljava/util/ArrayList;
    //   50: invokevirtual size : ()I
    //   53: istore #8
    //   55: iload #8
    //   57: ifle -> 167
    //   60: aload_3
    //   61: aload_1
    //   62: invokevirtual print : (Ljava/lang/String;)V
    //   65: aload_3
    //   66: ldc_w 'Active Fragments in '
    //   69: invokevirtual print : (Ljava/lang/String;)V
    //   72: aload_3
    //   73: aload_0
    //   74: invokestatic identityHashCode : (Ljava/lang/Object;)I
    //   77: invokestatic toHexString : (I)Ljava/lang/String;
    //   80: invokevirtual print : (Ljava/lang/String;)V
    //   83: aload_3
    //   84: ldc_w ':'
    //   87: invokevirtual println : (Ljava/lang/String;)V
    //   90: iconst_0
    //   91: istore #9
    //   93: iload #9
    //   95: iload #8
    //   97: if_icmpge -> 167
    //   100: aload_0
    //   101: getfield f : Ljava/util/ArrayList;
    //   104: iload #9
    //   106: invokevirtual get : (I)Ljava/lang/Object;
    //   109: checkcast android/support/v4/a/k
    //   112: astore #6
    //   114: aload_3
    //   115: aload_1
    //   116: invokevirtual print : (Ljava/lang/String;)V
    //   119: aload_3
    //   120: ldc_w '  #'
    //   123: invokevirtual print : (Ljava/lang/String;)V
    //   126: aload_3
    //   127: iload #9
    //   129: invokevirtual print : (I)V
    //   132: aload_3
    //   133: ldc_w ': '
    //   136: invokevirtual print : (Ljava/lang/String;)V
    //   139: aload_3
    //   140: aload #6
    //   142: invokevirtual println : (Ljava/lang/Object;)V
    //   145: aload #6
    //   147: ifnull -> 161
    //   150: aload #6
    //   152: aload #5
    //   154: aload_2
    //   155: aload_3
    //   156: aload #4
    //   158: invokevirtual a : (Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    //   161: iinc #9, 1
    //   164: goto -> 93
    //   167: aload_0
    //   168: getfield g : Ljava/util/ArrayList;
    //   171: ifnull -> 264
    //   174: aload_0
    //   175: getfield g : Ljava/util/ArrayList;
    //   178: invokevirtual size : ()I
    //   181: istore #8
    //   183: iload #8
    //   185: ifle -> 264
    //   188: aload_3
    //   189: aload_1
    //   190: invokevirtual print : (Ljava/lang/String;)V
    //   193: aload_3
    //   194: ldc_w 'Added Fragments:'
    //   197: invokevirtual println : (Ljava/lang/String;)V
    //   200: iconst_0
    //   201: istore #9
    //   203: iload #9
    //   205: iload #8
    //   207: if_icmpge -> 264
    //   210: aload_0
    //   211: getfield g : Ljava/util/ArrayList;
    //   214: iload #9
    //   216: invokevirtual get : (I)Ljava/lang/Object;
    //   219: checkcast android/support/v4/a/k
    //   222: astore #6
    //   224: aload_3
    //   225: aload_1
    //   226: invokevirtual print : (Ljava/lang/String;)V
    //   229: aload_3
    //   230: ldc_w '  #'
    //   233: invokevirtual print : (Ljava/lang/String;)V
    //   236: aload_3
    //   237: iload #9
    //   239: invokevirtual print : (I)V
    //   242: aload_3
    //   243: ldc_w ': '
    //   246: invokevirtual print : (Ljava/lang/String;)V
    //   249: aload_3
    //   250: aload #6
    //   252: invokevirtual toString : ()Ljava/lang/String;
    //   255: invokevirtual println : (Ljava/lang/String;)V
    //   258: iinc #9, 1
    //   261: goto -> 203
    //   264: aload_0
    //   265: getfield j : Ljava/util/ArrayList;
    //   268: ifnull -> 361
    //   271: aload_0
    //   272: getfield j : Ljava/util/ArrayList;
    //   275: invokevirtual size : ()I
    //   278: istore #8
    //   280: iload #8
    //   282: ifle -> 361
    //   285: aload_3
    //   286: aload_1
    //   287: invokevirtual print : (Ljava/lang/String;)V
    //   290: aload_3
    //   291: ldc_w 'Fragments Created Menus:'
    //   294: invokevirtual println : (Ljava/lang/String;)V
    //   297: iconst_0
    //   298: istore #9
    //   300: iload #9
    //   302: iload #8
    //   304: if_icmpge -> 361
    //   307: aload_0
    //   308: getfield j : Ljava/util/ArrayList;
    //   311: iload #9
    //   313: invokevirtual get : (I)Ljava/lang/Object;
    //   316: checkcast android/support/v4/a/k
    //   319: astore #6
    //   321: aload_3
    //   322: aload_1
    //   323: invokevirtual print : (Ljava/lang/String;)V
    //   326: aload_3
    //   327: ldc_w '  #'
    //   330: invokevirtual print : (Ljava/lang/String;)V
    //   333: aload_3
    //   334: iload #9
    //   336: invokevirtual print : (I)V
    //   339: aload_3
    //   340: ldc_w ': '
    //   343: invokevirtual print : (Ljava/lang/String;)V
    //   346: aload_3
    //   347: aload #6
    //   349: invokevirtual toString : ()Ljava/lang/String;
    //   352: invokevirtual println : (Ljava/lang/String;)V
    //   355: iinc #9, 1
    //   358: goto -> 300
    //   361: aload_0
    //   362: getfield i : Ljava/util/ArrayList;
    //   365: ifnull -> 469
    //   368: aload_0
    //   369: getfield i : Ljava/util/ArrayList;
    //   372: invokevirtual size : ()I
    //   375: istore #8
    //   377: iload #8
    //   379: ifle -> 469
    //   382: aload_3
    //   383: aload_1
    //   384: invokevirtual print : (Ljava/lang/String;)V
    //   387: aload_3
    //   388: ldc_w 'Back Stack:'
    //   391: invokevirtual println : (Ljava/lang/String;)V
    //   394: iconst_0
    //   395: istore #9
    //   397: iload #9
    //   399: iload #8
    //   401: if_icmpge -> 469
    //   404: aload_0
    //   405: getfield i : Ljava/util/ArrayList;
    //   408: iload #9
    //   410: invokevirtual get : (I)Ljava/lang/Object;
    //   413: checkcast android/support/v4/a/f
    //   416: astore #6
    //   418: aload_3
    //   419: aload_1
    //   420: invokevirtual print : (Ljava/lang/String;)V
    //   423: aload_3
    //   424: ldc_w '  #'
    //   427: invokevirtual print : (Ljava/lang/String;)V
    //   430: aload_3
    //   431: iload #9
    //   433: invokevirtual print : (I)V
    //   436: aload_3
    //   437: ldc_w ': '
    //   440: invokevirtual print : (Ljava/lang/String;)V
    //   443: aload_3
    //   444: aload #6
    //   446: invokevirtual toString : ()Ljava/lang/String;
    //   449: invokevirtual println : (Ljava/lang/String;)V
    //   452: aload #6
    //   454: aload #5
    //   456: aload_2
    //   457: aload_3
    //   458: aload #4
    //   460: invokevirtual a : (Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    //   463: iinc #9, 1
    //   466: goto -> 397
    //   469: aload_0
    //   470: monitorenter
    //   471: aload_0
    //   472: getfield k : Ljava/util/ArrayList;
    //   475: ifnull -> 563
    //   478: aload_0
    //   479: getfield k : Ljava/util/ArrayList;
    //   482: invokevirtual size : ()I
    //   485: istore #8
    //   487: iload #8
    //   489: ifle -> 563
    //   492: aload_3
    //   493: aload_1
    //   494: invokevirtual print : (Ljava/lang/String;)V
    //   497: aload_3
    //   498: ldc_w 'Back Stack Indices:'
    //   501: invokevirtual println : (Ljava/lang/String;)V
    //   504: iconst_0
    //   505: istore #9
    //   507: iload #9
    //   509: iload #8
    //   511: if_icmpge -> 563
    //   514: aload_0
    //   515: getfield k : Ljava/util/ArrayList;
    //   518: iload #9
    //   520: invokevirtual get : (I)Ljava/lang/Object;
    //   523: checkcast android/support/v4/a/f
    //   526: astore_2
    //   527: aload_3
    //   528: aload_1
    //   529: invokevirtual print : (Ljava/lang/String;)V
    //   532: aload_3
    //   533: ldc_w '  #'
    //   536: invokevirtual print : (Ljava/lang/String;)V
    //   539: aload_3
    //   540: iload #9
    //   542: invokevirtual print : (I)V
    //   545: aload_3
    //   546: ldc_w ': '
    //   549: invokevirtual print : (Ljava/lang/String;)V
    //   552: aload_3
    //   553: aload_2
    //   554: invokevirtual println : (Ljava/lang/Object;)V
    //   557: iinc #9, 1
    //   560: goto -> 507
    //   563: aload_0
    //   564: getfield l : Ljava/util/ArrayList;
    //   567: ifnull -> 606
    //   570: aload_0
    //   571: getfield l : Ljava/util/ArrayList;
    //   574: invokevirtual size : ()I
    //   577: ifle -> 606
    //   580: aload_3
    //   581: aload_1
    //   582: invokevirtual print : (Ljava/lang/String;)V
    //   585: aload_3
    //   586: ldc_w 'mAvailBackStackIndices: '
    //   589: invokevirtual print : (Ljava/lang/String;)V
    //   592: aload_3
    //   593: aload_0
    //   594: getfield l : Ljava/util/ArrayList;
    //   597: invokevirtual toArray : ()[Ljava/lang/Object;
    //   600: invokestatic toString : ([Ljava/lang/Object;)Ljava/lang/String;
    //   603: invokevirtual println : (Ljava/lang/String;)V
    //   606: aload_0
    //   607: monitorexit
    //   608: aload_0
    //   609: getfield c : Ljava/util/ArrayList;
    //   612: ifnull -> 701
    //   615: aload_0
    //   616: getfield c : Ljava/util/ArrayList;
    //   619: invokevirtual size : ()I
    //   622: istore #8
    //   624: iload #8
    //   626: ifle -> 701
    //   629: aload_3
    //   630: aload_1
    //   631: invokevirtual print : (Ljava/lang/String;)V
    //   634: aload_3
    //   635: ldc_w 'Pending Actions:'
    //   638: invokevirtual println : (Ljava/lang/String;)V
    //   641: iload #7
    //   643: istore #9
    //   645: iload #9
    //   647: iload #8
    //   649: if_icmpge -> 701
    //   652: aload_0
    //   653: getfield c : Ljava/util/ArrayList;
    //   656: iload #9
    //   658: invokevirtual get : (I)Ljava/lang/Object;
    //   661: checkcast java/lang/Runnable
    //   664: astore_2
    //   665: aload_3
    //   666: aload_1
    //   667: invokevirtual print : (Ljava/lang/String;)V
    //   670: aload_3
    //   671: ldc_w '  #'
    //   674: invokevirtual print : (Ljava/lang/String;)V
    //   677: aload_3
    //   678: iload #9
    //   680: invokevirtual print : (I)V
    //   683: aload_3
    //   684: ldc_w ': '
    //   687: invokevirtual print : (Ljava/lang/String;)V
    //   690: aload_3
    //   691: aload_2
    //   692: invokevirtual println : (Ljava/lang/Object;)V
    //   695: iinc #9, 1
    //   698: goto -> 645
    //   701: aload_3
    //   702: aload_1
    //   703: invokevirtual print : (Ljava/lang/String;)V
    //   706: aload_3
    //   707: ldc_w 'FragmentManager misc state:'
    //   710: invokevirtual println : (Ljava/lang/String;)V
    //   713: aload_3
    //   714: aload_1
    //   715: invokevirtual print : (Ljava/lang/String;)V
    //   718: aload_3
    //   719: ldc_w '  mHost='
    //   722: invokevirtual print : (Ljava/lang/String;)V
    //   725: aload_3
    //   726: aload_0
    //   727: getfield o : Landroid/support/v4/a/o;
    //   730: invokevirtual println : (Ljava/lang/Object;)V
    //   733: aload_3
    //   734: aload_1
    //   735: invokevirtual print : (Ljava/lang/String;)V
    //   738: aload_3
    //   739: ldc_w '  mContainer='
    //   742: invokevirtual print : (Ljava/lang/String;)V
    //   745: aload_3
    //   746: aload_0
    //   747: getfield p : Landroid/support/v4/a/m;
    //   750: invokevirtual println : (Ljava/lang/Object;)V
    //   753: aload_0
    //   754: getfield q : Landroid/support/v4/a/k;
    //   757: ifnull -> 780
    //   760: aload_3
    //   761: aload_1
    //   762: invokevirtual print : (Ljava/lang/String;)V
    //   765: aload_3
    //   766: ldc_w '  mParent='
    //   769: invokevirtual print : (Ljava/lang/String;)V
    //   772: aload_3
    //   773: aload_0
    //   774: getfield q : Landroid/support/v4/a/k;
    //   777: invokevirtual println : (Ljava/lang/Object;)V
    //   780: aload_3
    //   781: aload_1
    //   782: invokevirtual print : (Ljava/lang/String;)V
    //   785: aload_3
    //   786: ldc_w '  mCurState='
    //   789: invokevirtual print : (Ljava/lang/String;)V
    //   792: aload_3
    //   793: aload_0
    //   794: getfield n : I
    //   797: invokevirtual print : (I)V
    //   800: aload_3
    //   801: ldc_w ' mStateSaved='
    //   804: invokevirtual print : (Ljava/lang/String;)V
    //   807: aload_3
    //   808: aload_0
    //   809: getfield t : Z
    //   812: invokevirtual print : (Z)V
    //   815: aload_3
    //   816: ldc_w ' mDestroyed='
    //   819: invokevirtual print : (Ljava/lang/String;)V
    //   822: aload_3
    //   823: aload_0
    //   824: getfield u : Z
    //   827: invokevirtual println : (Z)V
    //   830: aload_0
    //   831: getfield s : Z
    //   834: ifeq -> 857
    //   837: aload_3
    //   838: aload_1
    //   839: invokevirtual print : (Ljava/lang/String;)V
    //   842: aload_3
    //   843: ldc_w '  mNeedMenuInvalidate='
    //   846: invokevirtual print : (Ljava/lang/String;)V
    //   849: aload_3
    //   850: aload_0
    //   851: getfield s : Z
    //   854: invokevirtual println : (Z)V
    //   857: aload_0
    //   858: getfield v : Ljava/lang/String;
    //   861: ifnull -> 884
    //   864: aload_3
    //   865: aload_1
    //   866: invokevirtual print : (Ljava/lang/String;)V
    //   869: aload_3
    //   870: ldc_w '  mNoTransactionsBecause='
    //   873: invokevirtual print : (Ljava/lang/String;)V
    //   876: aload_3
    //   877: aload_0
    //   878: getfield v : Ljava/lang/String;
    //   881: invokevirtual println : (Ljava/lang/String;)V
    //   884: aload_0
    //   885: getfield h : Ljava/util/ArrayList;
    //   888: ifnull -> 927
    //   891: aload_0
    //   892: getfield h : Ljava/util/ArrayList;
    //   895: invokevirtual size : ()I
    //   898: ifle -> 927
    //   901: aload_3
    //   902: aload_1
    //   903: invokevirtual print : (Ljava/lang/String;)V
    //   906: aload_3
    //   907: ldc_w '  mAvailIndices: '
    //   910: invokevirtual print : (Ljava/lang/String;)V
    //   913: aload_3
    //   914: aload_0
    //   915: getfield h : Ljava/util/ArrayList;
    //   918: invokevirtual toArray : ()[Ljava/lang/Object;
    //   921: invokestatic toString : ([Ljava/lang/Object;)Ljava/lang/String;
    //   924: invokevirtual println : (Ljava/lang/String;)V
    //   927: return
    //   928: astore_1
    //   929: aload_0
    //   930: monitorexit
    //   931: aload_1
    //   932: athrow
    // Exception table:
    //   from	to	target	type
    //   471	487	928	finally
    //   492	504	928	finally
    //   514	557	928	finally
    //   563	606	928	finally
    //   606	608	928	finally
    //   929	931	928	finally }
  
  public boolean a() {
    t();
    b();
    return a(this.o.h(), null, -1, 0);
  }
  
  boolean a(Handler paramHandler, String paramString, int paramInt1, int paramInt2) { // Byte code:
    //   0: aload_0
    //   1: getfield i : Ljava/util/ArrayList;
    //   4: ifnonnull -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_2
    //   10: ifnonnull -> 92
    //   13: iload_3
    //   14: ifge -> 92
    //   17: iload #4
    //   19: iconst_1
    //   20: iand
    //   21: ifne -> 92
    //   24: aload_0
    //   25: getfield i : Ljava/util/ArrayList;
    //   28: invokevirtual size : ()I
    //   31: iconst_1
    //   32: isub
    //   33: istore_3
    //   34: iload_3
    //   35: ifge -> 40
    //   38: iconst_0
    //   39: ireturn
    //   40: aload_0
    //   41: getfield i : Ljava/util/ArrayList;
    //   44: iload_3
    //   45: invokevirtual remove : (I)Ljava/lang/Object;
    //   48: checkcast android/support/v4/a/f
    //   51: astore_1
    //   52: new android/util/SparseArray
    //   55: dup
    //   56: invokespecial <init> : ()V
    //   59: astore_2
    //   60: new android/util/SparseArray
    //   63: dup
    //   64: invokespecial <init> : ()V
    //   67: astore #5
    //   69: aload_1
    //   70: aload_2
    //   71: aload #5
    //   73: invokevirtual a : (Landroid/util/SparseArray;Landroid/util/SparseArray;)V
    //   76: aload_1
    //   77: iconst_1
    //   78: aconst_null
    //   79: aload_2
    //   80: aload #5
    //   82: invokevirtual a : (ZLandroid/support/v4/a/f$b;Landroid/util/SparseArray;Landroid/util/SparseArray;)Landroid/support/v4/a/f$b;
    //   85: pop
    //   86: aload_0
    //   87: invokevirtual e : ()V
    //   90: iconst_1
    //   91: ireturn
    //   92: aload_2
    //   93: ifnonnull -> 109
    //   96: iload_3
    //   97: iflt -> 103
    //   100: goto -> 109
    //   103: iconst_m1
    //   104: istore #6
    //   106: goto -> 269
    //   109: aload_0
    //   110: getfield i : Ljava/util/ArrayList;
    //   113: invokevirtual size : ()I
    //   116: iconst_1
    //   117: isub
    //   118: istore #7
    //   120: iload #7
    //   122: iflt -> 177
    //   125: aload_0
    //   126: getfield i : Ljava/util/ArrayList;
    //   129: iload #7
    //   131: invokevirtual get : (I)Ljava/lang/Object;
    //   134: checkcast android/support/v4/a/f
    //   137: astore_1
    //   138: aload_2
    //   139: ifnull -> 156
    //   142: aload_2
    //   143: aload_1
    //   144: invokevirtual a : ()Ljava/lang/String;
    //   147: invokevirtual equals : (Ljava/lang/Object;)Z
    //   150: ifeq -> 156
    //   153: goto -> 177
    //   156: iload_3
    //   157: iflt -> 171
    //   160: iload_3
    //   161: aload_1
    //   162: getfield p : I
    //   165: if_icmpne -> 171
    //   168: goto -> 177
    //   171: iinc #7, -1
    //   174: goto -> 120
    //   177: iload #7
    //   179: ifge -> 184
    //   182: iconst_0
    //   183: ireturn
    //   184: iload #7
    //   186: istore #6
    //   188: iload #4
    //   190: iconst_1
    //   191: iand
    //   192: ifeq -> 269
    //   195: iload #7
    //   197: iconst_1
    //   198: isub
    //   199: istore #4
    //   201: iload #4
    //   203: istore #6
    //   205: iload #4
    //   207: iflt -> 269
    //   210: aload_0
    //   211: getfield i : Ljava/util/ArrayList;
    //   214: iload #4
    //   216: invokevirtual get : (I)Ljava/lang/Object;
    //   219: checkcast android/support/v4/a/f
    //   222: astore_1
    //   223: aload_2
    //   224: ifnull -> 242
    //   227: iload #4
    //   229: istore #7
    //   231: aload_2
    //   232: aload_1
    //   233: invokevirtual a : ()Ljava/lang/String;
    //   236: invokevirtual equals : (Ljava/lang/Object;)Z
    //   239: ifne -> 195
    //   242: iload #4
    //   244: istore #6
    //   246: iload_3
    //   247: iflt -> 269
    //   250: iload #4
    //   252: istore #6
    //   254: iload_3
    //   255: aload_1
    //   256: getfield p : I
    //   259: if_icmpne -> 269
    //   262: iload #4
    //   264: istore #7
    //   266: goto -> 195
    //   269: iload #6
    //   271: aload_0
    //   272: getfield i : Ljava/util/ArrayList;
    //   275: invokevirtual size : ()I
    //   278: iconst_1
    //   279: isub
    //   280: if_icmpne -> 285
    //   283: iconst_0
    //   284: ireturn
    //   285: new java/util/ArrayList
    //   288: dup
    //   289: invokespecial <init> : ()V
    //   292: astore #5
    //   294: aload_0
    //   295: getfield i : Ljava/util/ArrayList;
    //   298: invokevirtual size : ()I
    //   301: iconst_1
    //   302: isub
    //   303: istore_3
    //   304: iload_3
    //   305: iload #6
    //   307: if_icmple -> 330
    //   310: aload #5
    //   312: aload_0
    //   313: getfield i : Ljava/util/ArrayList;
    //   316: iload_3
    //   317: invokevirtual remove : (I)Ljava/lang/Object;
    //   320: invokevirtual add : (Ljava/lang/Object;)Z
    //   323: pop
    //   324: iinc #3, -1
    //   327: goto -> 304
    //   330: aload #5
    //   332: invokevirtual size : ()I
    //   335: iconst_1
    //   336: isub
    //   337: istore #4
    //   339: new android/util/SparseArray
    //   342: dup
    //   343: invokespecial <init> : ()V
    //   346: astore_2
    //   347: new android/util/SparseArray
    //   350: dup
    //   351: invokespecial <init> : ()V
    //   354: astore #8
    //   356: iconst_0
    //   357: istore_3
    //   358: iload_3
    //   359: iload #4
    //   361: if_icmpgt -> 385
    //   364: aload #5
    //   366: iload_3
    //   367: invokevirtual get : (I)Ljava/lang/Object;
    //   370: checkcast android/support/v4/a/f
    //   373: aload_2
    //   374: aload #8
    //   376: invokevirtual a : (Landroid/util/SparseArray;Landroid/util/SparseArray;)V
    //   379: iinc #3, 1
    //   382: goto -> 358
    //   385: aconst_null
    //   386: astore_1
    //   387: iconst_0
    //   388: istore_3
    //   389: iload_3
    //   390: iload #4
    //   392: if_icmpgt -> 86
    //   395: getstatic android/support/v4/a/q.a : Z
    //   398: ifeq -> 442
    //   401: new java/lang/StringBuilder
    //   404: dup
    //   405: invokespecial <init> : ()V
    //   408: astore #9
    //   410: aload #9
    //   412: ldc_w 'Popping back stack state: '
    //   415: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   418: pop
    //   419: aload #9
    //   421: aload #5
    //   423: iload_3
    //   424: invokevirtual get : (I)Ljava/lang/Object;
    //   427: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   430: pop
    //   431: ldc 'FragmentManager'
    //   433: aload #9
    //   435: invokevirtual toString : ()Ljava/lang/String;
    //   438: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   441: pop
    //   442: aload #5
    //   444: iload_3
    //   445: invokevirtual get : (I)Ljava/lang/Object;
    //   448: checkcast android/support/v4/a/f
    //   451: astore #9
    //   453: iload_3
    //   454: iload #4
    //   456: if_icmpne -> 465
    //   459: iconst_1
    //   460: istore #10
    //   462: goto -> 468
    //   465: iconst_0
    //   466: istore #10
    //   468: aload #9
    //   470: iload #10
    //   472: aload_1
    //   473: aload_2
    //   474: aload #8
    //   476: invokevirtual a : (ZLandroid/support/v4/a/f$b;Landroid/util/SparseArray;Landroid/util/SparseArray;)Landroid/support/v4/a/f$b;
    //   479: astore_1
    //   480: iinc #3, 1
    //   483: goto -> 389 }
  
  public boolean a(Menu paramMenu) {
    boolean bool;
    ArrayList arrayList = this.g;
    byte b1 = 0;
    if (arrayList != null) {
      byte b2 = 0;
      while (true) {
        bool = b2;
        if (b1 < this.g.size()) {
          k k1 = (k)this.g.get(b1);
          bool = b2;
          if (k1 != null) {
            bool = b2;
            if (k1.c(paramMenu))
              bool = true; 
          } 
          b1++;
          b2 = bool;
          continue;
        } 
        break;
      } 
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean a(Menu paramMenu, MenuInflater paramMenuInflater) {
    boolean bool1;
    ArrayList arrayList1 = this.g;
    boolean bool = false;
    ArrayList arrayList2 = null;
    ArrayList arrayList3 = null;
    if (arrayList1 != null) {
      byte b1 = 0;
      byte b2 = 0;
      while (true) {
        arrayList2 = arrayList3;
        bool1 = b2;
        if (b1 < this.g.size()) {
          k k1 = (k)this.g.get(b1);
          arrayList2 = arrayList3;
          bool1 = b2;
          if (k1 != null) {
            arrayList2 = arrayList3;
            bool1 = b2;
            if (k1.b(paramMenu, paramMenuInflater)) {
              arrayList2 = arrayList3;
              if (arrayList3 == null)
                arrayList2 = new ArrayList(); 
              arrayList2.add(k1);
              bool1 = true;
            } 
          } 
          b1++;
          arrayList3 = arrayList2;
          b2 = bool1;
          continue;
        } 
        break;
      } 
    } else {
      bool1 = false;
    } 
    if (this.j != null)
      for (byte b1 = bool; b1 < this.j.size(); b1++) {
        k k1 = (k)this.j.get(b1);
        if (arrayList2 == null || !arrayList2.contains(k1))
          k1.p(); 
      }  
    this.j = arrayList2;
    return bool1;
  }
  
  public boolean a(MenuItem paramMenuItem) {
    if (this.g != null)
      for (byte b1 = 0; b1 < this.g.size(); b1++) {
        k k1 = (k)this.g.get(b1);
        if (k1 != null && k1.c(paramMenuItem))
          return true; 
      }  
    return false;
  }
  
  public k b(String paramString) {
    if (this.f != null && paramString != null)
      for (int i1 = this.f.size() - 1; i1 >= 0; i1--) {
        k k1 = (k)this.f.get(i1);
        if (k1 != null) {
          k1 = k1.a(paramString);
          if (k1 != null)
            return k1; 
        } 
      }  
    return null;
  }
  
  public void b(int paramInt) { // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield k : Ljava/util/ArrayList;
    //   6: iload_1
    //   7: aconst_null
    //   8: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   11: pop
    //   12: aload_0
    //   13: getfield l : Ljava/util/ArrayList;
    //   16: ifnonnull -> 32
    //   19: new java/util/ArrayList
    //   22: astore_2
    //   23: aload_2
    //   24: invokespecial <init> : ()V
    //   27: aload_0
    //   28: aload_2
    //   29: putfield l : Ljava/util/ArrayList;
    //   32: getstatic android/support/v4/a/q.a : Z
    //   35: ifeq -> 70
    //   38: new java/lang/StringBuilder
    //   41: astore_2
    //   42: aload_2
    //   43: invokespecial <init> : ()V
    //   46: aload_2
    //   47: ldc_w 'Freeing back stack index '
    //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: pop
    //   54: aload_2
    //   55: iload_1
    //   56: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   59: pop
    //   60: ldc 'FragmentManager'
    //   62: aload_2
    //   63: invokevirtual toString : ()Ljava/lang/String;
    //   66: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   69: pop
    //   70: aload_0
    //   71: getfield l : Ljava/util/ArrayList;
    //   74: iload_1
    //   75: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   78: invokevirtual add : (Ljava/lang/Object;)Z
    //   81: pop
    //   82: aload_0
    //   83: monitorexit
    //   84: return
    //   85: astore_2
    //   86: aload_0
    //   87: monitorexit
    //   88: aload_2
    //   89: athrow
    // Exception table:
    //   from	to	target	type
    //   2	32	85	finally
    //   32	70	85	finally
    //   70	84	85	finally
    //   86	88	85	finally }
  
  void b(k paramk) { a(paramk, this.n, 0, 0, false); }
  
  public void b(k paramk, int paramInt1, int paramInt2) {
    if (a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("hide: ");
      stringBuilder.append(paramk);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    if (!paramk.z) {
      paramk.z = true;
      if (paramk.I != null) {
        Animation animation = a(paramk, paramInt1, false, paramInt2);
        if (animation != null) {
          b(paramk.I, animation);
          paramk.I.startAnimation(animation);
        } 
        paramk.I.setVisibility(8);
      } 
      if (paramk.m && paramk.D && paramk.E)
        this.s = true; 
      paramk.a(true);
    } 
  }
  
  public void b(Menu paramMenu) {
    if (this.g != null)
      for (byte b1 = 0; b1 < this.g.size(); b1++) {
        k k1 = (k)this.g.get(b1);
        if (k1 != null)
          k1.d(paramMenu); 
      }  
  }
  
  public boolean b() { return d(); }
  
  public boolean b(MenuItem paramMenuItem) {
    if (this.g != null)
      for (byte b1 = 0; b1 < this.g.size(); b1++) {
        k k1 = (k)this.g.get(b1);
        if (k1 != null && k1.d(paramMenuItem))
          return true; 
      }  
    return false;
  }
  
  void c() {
    if (this.f == null)
      return; 
    for (byte b1 = 0; b1 < this.f.size(); b1++) {
      k k1 = (k)this.f.get(b1);
      if (k1 != null)
        a(k1); 
    } 
  }
  
  void c(k paramk) {
    if (paramk.g >= 0)
      return; 
    if (this.h == null || this.h.size() <= 0) {
      if (this.f == null)
        this.f = new ArrayList(); 
      paramk.a(this.f.size(), this.q);
      this.f.add(paramk);
    } else {
      paramk.a(((Integer)this.h.remove(this.h.size() - 1)).intValue(), this.q);
      this.f.set(paramk.g, paramk);
    } 
    if (a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Allocated fragment index ");
      stringBuilder.append(paramk);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
  }
  
  public void c(k paramk, int paramInt1, int paramInt2) {
    if (a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("show: ");
      stringBuilder.append(paramk);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    if (paramk.z) {
      paramk.z = false;
      if (paramk.I != null) {
        Animation animation = a(paramk, paramInt1, true, paramInt2);
        if (animation != null) {
          b(paramk.I, animation);
          paramk.I.startAnimation(animation);
        } 
        paramk.I.setVisibility(0);
      } 
      if (paramk.m && paramk.D && paramk.E)
        this.s = true; 
      paramk.a(false);
    } 
  }
  
  void d(k paramk) {
    if (paramk.g < 0)
      return; 
    if (a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Freeing fragment index ");
      stringBuilder.append(paramk);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    this.f.set(paramk.g, null);
    if (this.h == null)
      this.h = new ArrayList(); 
    this.h.add(Integer.valueOf(paramk.g));
    this.o.a(paramk.h);
    paramk.n();
  }
  
  public void d(k paramk, int paramInt1, int paramInt2) {
    if (a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("detach: ");
      stringBuilder.append(paramk);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    if (!paramk.A) {
      paramk.A = true;
      if (paramk.m) {
        if (this.g != null) {
          if (a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("remove from detach: ");
            stringBuilder.append(paramk);
            Log.v("FragmentManager", stringBuilder.toString());
          } 
          this.g.remove(paramk);
        } 
        if (paramk.D && paramk.E)
          this.s = true; 
        paramk.m = false;
        a(paramk, 1, paramInt1, paramInt2, false);
      } 
    } 
  }
  
  public boolean d() { // Byte code:
    //   0: aload_0
    //   1: getfield e : Z
    //   4: ifeq -> 18
    //   7: new java/lang/IllegalStateException
    //   10: dup
    //   11: ldc_w 'Recursive entry to executePendingTransactions'
    //   14: invokespecial <init> : (Ljava/lang/String;)V
    //   17: athrow
    //   18: invokestatic myLooper : ()Landroid/os/Looper;
    //   21: aload_0
    //   22: getfield o : Landroid/support/v4/a/o;
    //   25: invokevirtual h : ()Landroid/os/Handler;
    //   28: invokevirtual getLooper : ()Landroid/os/Looper;
    //   31: if_acmpeq -> 45
    //   34: new java/lang/IllegalStateException
    //   37: dup
    //   38: ldc_w 'Must be called from main thread of process'
    //   41: invokespecial <init> : (Ljava/lang/String;)V
    //   44: athrow
    //   45: iconst_0
    //   46: istore_1
    //   47: aload_0
    //   48: monitorenter
    //   49: aload_0
    //   50: getfield c : Ljava/util/ArrayList;
    //   53: ifnull -> 182
    //   56: aload_0
    //   57: getfield c : Ljava/util/ArrayList;
    //   60: invokevirtual size : ()I
    //   63: ifne -> 69
    //   66: goto -> 182
    //   69: aload_0
    //   70: getfield c : Ljava/util/ArrayList;
    //   73: invokevirtual size : ()I
    //   76: istore_2
    //   77: aload_0
    //   78: getfield d : [Ljava/lang/Runnable;
    //   81: ifnull -> 93
    //   84: aload_0
    //   85: getfield d : [Ljava/lang/Runnable;
    //   88: arraylength
    //   89: iload_2
    //   90: if_icmpge -> 101
    //   93: aload_0
    //   94: iload_2
    //   95: anewarray java/lang/Runnable
    //   98: putfield d : [Ljava/lang/Runnable;
    //   101: aload_0
    //   102: getfield c : Ljava/util/ArrayList;
    //   105: aload_0
    //   106: getfield d : [Ljava/lang/Runnable;
    //   109: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   112: pop
    //   113: aload_0
    //   114: getfield c : Ljava/util/ArrayList;
    //   117: invokevirtual clear : ()V
    //   120: aload_0
    //   121: getfield o : Landroid/support/v4/a/o;
    //   124: invokevirtual h : ()Landroid/os/Handler;
    //   127: aload_0
    //   128: getfield z : Ljava/lang/Runnable;
    //   131: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   134: aload_0
    //   135: monitorexit
    //   136: aload_0
    //   137: iconst_1
    //   138: putfield e : Z
    //   141: iconst_0
    //   142: istore_3
    //   143: iload_3
    //   144: iload_2
    //   145: if_icmpge -> 172
    //   148: aload_0
    //   149: getfield d : [Ljava/lang/Runnable;
    //   152: iload_3
    //   153: aaload
    //   154: invokeinterface run : ()V
    //   159: aload_0
    //   160: getfield d : [Ljava/lang/Runnable;
    //   163: iload_3
    //   164: aconst_null
    //   165: aastore
    //   166: iinc #3, 1
    //   169: goto -> 143
    //   172: aload_0
    //   173: iconst_0
    //   174: putfield e : Z
    //   177: iconst_1
    //   178: istore_1
    //   179: goto -> 47
    //   182: aload_0
    //   183: monitorexit
    //   184: aload_0
    //   185: getfield w : Z
    //   188: ifeq -> 271
    //   191: iconst_0
    //   192: istore #4
    //   194: iconst_0
    //   195: istore_3
    //   196: iload #4
    //   198: aload_0
    //   199: getfield f : Ljava/util/ArrayList;
    //   202: invokevirtual size : ()I
    //   205: if_icmpge -> 258
    //   208: aload_0
    //   209: getfield f : Ljava/util/ArrayList;
    //   212: iload #4
    //   214: invokevirtual get : (I)Ljava/lang/Object;
    //   217: checkcast android/support/v4/a/k
    //   220: astore #5
    //   222: iload_3
    //   223: istore_2
    //   224: aload #5
    //   226: ifnull -> 250
    //   229: iload_3
    //   230: istore_2
    //   231: aload #5
    //   233: getfield M : Landroid/support/v4/a/w;
    //   236: ifnull -> 250
    //   239: iload_3
    //   240: aload #5
    //   242: getfield M : Landroid/support/v4/a/w;
    //   245: invokevirtual a : ()Z
    //   248: ior
    //   249: istore_2
    //   250: iinc #4, 1
    //   253: iload_2
    //   254: istore_3
    //   255: goto -> 196
    //   258: iload_3
    //   259: ifne -> 271
    //   262: aload_0
    //   263: iconst_0
    //   264: putfield w : Z
    //   267: aload_0
    //   268: invokevirtual c : ()V
    //   271: iload_1
    //   272: ireturn
    //   273: astore #5
    //   275: aload_0
    //   276: monitorexit
    //   277: aload #5
    //   279: athrow
    // Exception table:
    //   from	to	target	type
    //   49	66	273	finally
    //   69	93	273	finally
    //   93	101	273	finally
    //   101	136	273	finally
    //   182	184	273	finally
    //   275	277	273	finally }
  
  void e() {
    if (this.m != null)
      for (byte b1 = 0; b1 < this.m.size(); b1++)
        ((p.a)this.m.get(b1)).a();  
  }
  
  void e(k paramk) {
    if (paramk.J == null)
      return; 
    if (this.y == null) {
      this.y = new SparseArray();
    } else {
      this.y.clear();
    } 
    paramk.J.saveHierarchyState(this.y);
    if (this.y.size() > 0) {
      paramk.f = this.y;
      this.y = null;
    } 
  }
  
  public void e(k paramk, int paramInt1, int paramInt2) {
    if (a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("attach: ");
      stringBuilder.append(paramk);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    if (paramk.A) {
      paramk.A = false;
      if (!paramk.m) {
        if (this.g == null)
          this.g = new ArrayList(); 
        if (this.g.contains(paramk)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Fragment already added: ");
          stringBuilder.append(paramk);
          throw new IllegalStateException(stringBuilder.toString());
        } 
        if (a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("add from attach: ");
          stringBuilder.append(paramk);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        this.g.add(paramk);
        paramk.m = true;
        if (paramk.D && paramk.E)
          this.s = true; 
        a(paramk, this.n, paramInt1, paramInt2, false);
      } 
    } 
  }
  
  Bundle f(k paramk) {
    if (this.x == null)
      this.x = new Bundle(); 
    paramk.i(this.x);
    if (!this.x.isEmpty()) {
      bundle1 = this.x;
      this.x = null;
    } else {
      bundle1 = null;
    } 
    if (paramk.I != null)
      e(paramk); 
    Bundle bundle2 = bundle1;
    if (paramk.f != null) {
      bundle2 = bundle1;
      if (bundle1 == null)
        bundle2 = new Bundle(); 
      bundle2.putSparseParcelableArray("android:view_state", paramk.f);
    } 
    Bundle bundle1 = bundle2;
    if (!paramk.L) {
      bundle1 = bundle2;
      if (bundle2 == null)
        bundle1 = new Bundle(); 
      bundle1.putBoolean("android:user_visible_hint", paramk.L);
    } 
    return bundle1;
  }
  
  ArrayList<k> f() {
    ArrayList arrayList1 = this.f;
    ArrayList arrayList2 = null;
    ArrayList arrayList3 = null;
    if (arrayList1 != null) {
      byte b1 = 0;
      while (true) {
        arrayList2 = arrayList3;
        if (b1 < this.f.size()) {
          k k1 = (k)this.f.get(b1);
          arrayList1 = arrayList3;
          if (k1 != null) {
            arrayList1 = arrayList3;
            if (k1.B) {
              byte b2;
              arrayList2 = arrayList3;
              if (arrayList3 == null)
                arrayList2 = new ArrayList(); 
              arrayList2.add(k1);
              k1.C = true;
              if (k1.j != null) {
                b2 = k1.j.g;
              } else {
                b2 = -1;
              } 
              k1.k = b2;
              arrayList1 = arrayList2;
              if (a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("retainNonConfig: keeping retained ");
                stringBuilder.append(k1);
                Log.v("FragmentManager", stringBuilder.toString());
                arrayList1 = arrayList2;
              } 
            } 
          } 
          b1++;
          arrayList3 = arrayList1;
          continue;
        } 
        break;
      } 
    } 
    return arrayList2;
  }
  
  Parcelable g() { // Byte code:
    //   0: aload_0
    //   1: invokevirtual d : ()Z
    //   4: pop
    //   5: getstatic android/support/v4/a/q.b : Z
    //   8: ifeq -> 16
    //   11: aload_0
    //   12: iconst_1
    //   13: putfield t : Z
    //   16: aload_0
    //   17: getfield f : Ljava/util/ArrayList;
    //   20: astore_1
    //   21: aconst_null
    //   22: astore_2
    //   23: aload_1
    //   24: ifnull -> 804
    //   27: aload_0
    //   28: getfield f : Ljava/util/ArrayList;
    //   31: invokevirtual size : ()I
    //   34: ifgt -> 39
    //   37: aconst_null
    //   38: areturn
    //   39: aload_0
    //   40: getfield f : Ljava/util/ArrayList;
    //   43: invokevirtual size : ()I
    //   46: istore_3
    //   47: iload_3
    //   48: anewarray android/support/v4/a/s
    //   51: astore #4
    //   53: iconst_0
    //   54: istore #5
    //   56: iconst_0
    //   57: istore #6
    //   59: iconst_0
    //   60: istore #7
    //   62: iload #6
    //   64: iload_3
    //   65: if_icmpge -> 412
    //   68: aload_0
    //   69: getfield f : Ljava/util/ArrayList;
    //   72: iload #6
    //   74: invokevirtual get : (I)Ljava/lang/Object;
    //   77: checkcast android/support/v4/a/k
    //   80: astore_1
    //   81: aload_1
    //   82: ifnull -> 406
    //   85: aload_1
    //   86: getfield g : I
    //   89: ifge -> 152
    //   92: new java/lang/StringBuilder
    //   95: dup
    //   96: invokespecial <init> : ()V
    //   99: astore #8
    //   101: aload #8
    //   103: ldc_w 'Failure saving state: active '
    //   106: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: pop
    //   110: aload #8
    //   112: aload_1
    //   113: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   116: pop
    //   117: aload #8
    //   119: ldc_w ' has cleared index: '
    //   122: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: pop
    //   126: aload #8
    //   128: aload_1
    //   129: getfield g : I
    //   132: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   135: pop
    //   136: aload_0
    //   137: new java/lang/IllegalStateException
    //   140: dup
    //   141: aload #8
    //   143: invokevirtual toString : ()Ljava/lang/String;
    //   146: invokespecial <init> : (Ljava/lang/String;)V
    //   149: invokespecial a : (Ljava/lang/RuntimeException;)V
    //   152: new android/support/v4/a/s
    //   155: dup
    //   156: aload_1
    //   157: invokespecial <init> : (Landroid/support/v4/a/k;)V
    //   160: astore #8
    //   162: aload #4
    //   164: iload #6
    //   166: aload #8
    //   168: aastore
    //   169: aload_1
    //   170: getfield b : I
    //   173: ifle -> 332
    //   176: aload #8
    //   178: getfield j : Landroid/os/Bundle;
    //   181: ifnonnull -> 332
    //   184: aload #8
    //   186: aload_0
    //   187: aload_1
    //   188: invokevirtual f : (Landroid/support/v4/a/k;)Landroid/os/Bundle;
    //   191: putfield j : Landroid/os/Bundle;
    //   194: aload_1
    //   195: getfield j : Landroid/support/v4/a/k;
    //   198: ifnull -> 341
    //   201: aload_1
    //   202: getfield j : Landroid/support/v4/a/k;
    //   205: getfield g : I
    //   208: ifge -> 271
    //   211: new java/lang/StringBuilder
    //   214: dup
    //   215: invokespecial <init> : ()V
    //   218: astore #9
    //   220: aload #9
    //   222: ldc_w 'Failure saving state: '
    //   225: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: pop
    //   229: aload #9
    //   231: aload_1
    //   232: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   235: pop
    //   236: aload #9
    //   238: ldc_w ' has target not in fragment manager: '
    //   241: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   244: pop
    //   245: aload #9
    //   247: aload_1
    //   248: getfield j : Landroid/support/v4/a/k;
    //   251: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   254: pop
    //   255: aload_0
    //   256: new java/lang/IllegalStateException
    //   259: dup
    //   260: aload #9
    //   262: invokevirtual toString : ()Ljava/lang/String;
    //   265: invokespecial <init> : (Ljava/lang/String;)V
    //   268: invokespecial a : (Ljava/lang/RuntimeException;)V
    //   271: aload #8
    //   273: getfield j : Landroid/os/Bundle;
    //   276: ifnonnull -> 291
    //   279: aload #8
    //   281: new android/os/Bundle
    //   284: dup
    //   285: invokespecial <init> : ()V
    //   288: putfield j : Landroid/os/Bundle;
    //   291: aload_0
    //   292: aload #8
    //   294: getfield j : Landroid/os/Bundle;
    //   297: ldc_w 'android:target_state'
    //   300: aload_1
    //   301: getfield j : Landroid/support/v4/a/k;
    //   304: invokevirtual a : (Landroid/os/Bundle;Ljava/lang/String;Landroid/support/v4/a/k;)V
    //   307: aload_1
    //   308: getfield l : I
    //   311: ifeq -> 341
    //   314: aload #8
    //   316: getfield j : Landroid/os/Bundle;
    //   319: ldc_w 'android:target_req_state'
    //   322: aload_1
    //   323: getfield l : I
    //   326: invokevirtual putInt : (Ljava/lang/String;I)V
    //   329: goto -> 341
    //   332: aload #8
    //   334: aload_1
    //   335: getfield e : Landroid/os/Bundle;
    //   338: putfield j : Landroid/os/Bundle;
    //   341: getstatic android/support/v4/a/q.a : Z
    //   344: ifeq -> 403
    //   347: new java/lang/StringBuilder
    //   350: dup
    //   351: invokespecial <init> : ()V
    //   354: astore #9
    //   356: aload #9
    //   358: ldc_w 'Saved state of '
    //   361: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   364: pop
    //   365: aload #9
    //   367: aload_1
    //   368: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   371: pop
    //   372: aload #9
    //   374: ldc_w ': '
    //   377: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   380: pop
    //   381: aload #9
    //   383: aload #8
    //   385: getfield j : Landroid/os/Bundle;
    //   388: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   391: pop
    //   392: ldc 'FragmentManager'
    //   394: aload #9
    //   396: invokevirtual toString : ()Ljava/lang/String;
    //   399: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   402: pop
    //   403: iconst_1
    //   404: istore #7
    //   406: iinc #6, 1
    //   409: goto -> 62
    //   412: iload #7
    //   414: ifne -> 434
    //   417: getstatic android/support/v4/a/q.a : Z
    //   420: ifeq -> 432
    //   423: ldc 'FragmentManager'
    //   425: ldc_w 'saveAllState: no fragments!'
    //   428: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   431: pop
    //   432: aconst_null
    //   433: areturn
    //   434: aload_0
    //   435: getfield g : Ljava/util/ArrayList;
    //   438: ifnull -> 632
    //   441: aload_0
    //   442: getfield g : Ljava/util/ArrayList;
    //   445: invokevirtual size : ()I
    //   448: istore #7
    //   450: iload #7
    //   452: ifle -> 632
    //   455: iload #7
    //   457: newarray int
    //   459: astore #8
    //   461: iconst_0
    //   462: istore #6
    //   464: aload #8
    //   466: astore_1
    //   467: iload #6
    //   469: iload #7
    //   471: if_icmpge -> 634
    //   474: aload #8
    //   476: iload #6
    //   478: aload_0
    //   479: getfield g : Ljava/util/ArrayList;
    //   482: iload #6
    //   484: invokevirtual get : (I)Ljava/lang/Object;
    //   487: checkcast android/support/v4/a/k
    //   490: getfield g : I
    //   493: iastore
    //   494: aload #8
    //   496: iload #6
    //   498: iaload
    //   499: ifge -> 565
    //   502: new java/lang/StringBuilder
    //   505: dup
    //   506: invokespecial <init> : ()V
    //   509: astore_1
    //   510: aload_1
    //   511: ldc_w 'Failure saving state: active '
    //   514: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   517: pop
    //   518: aload_1
    //   519: aload_0
    //   520: getfield g : Ljava/util/ArrayList;
    //   523: iload #6
    //   525: invokevirtual get : (I)Ljava/lang/Object;
    //   528: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   531: pop
    //   532: aload_1
    //   533: ldc_w ' has cleared index: '
    //   536: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   539: pop
    //   540: aload_1
    //   541: aload #8
    //   543: iload #6
    //   545: iaload
    //   546: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   549: pop
    //   550: aload_0
    //   551: new java/lang/IllegalStateException
    //   554: dup
    //   555: aload_1
    //   556: invokevirtual toString : ()Ljava/lang/String;
    //   559: invokespecial <init> : (Ljava/lang/String;)V
    //   562: invokespecial a : (Ljava/lang/RuntimeException;)V
    //   565: getstatic android/support/v4/a/q.a : Z
    //   568: ifeq -> 626
    //   571: new java/lang/StringBuilder
    //   574: dup
    //   575: invokespecial <init> : ()V
    //   578: astore_1
    //   579: aload_1
    //   580: ldc_w 'saveAllState: adding fragment #'
    //   583: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   586: pop
    //   587: aload_1
    //   588: iload #6
    //   590: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   593: pop
    //   594: aload_1
    //   595: ldc_w ': '
    //   598: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   601: pop
    //   602: aload_1
    //   603: aload_0
    //   604: getfield g : Ljava/util/ArrayList;
    //   607: iload #6
    //   609: invokevirtual get : (I)Ljava/lang/Object;
    //   612: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   615: pop
    //   616: ldc 'FragmentManager'
    //   618: aload_1
    //   619: invokevirtual toString : ()Ljava/lang/String;
    //   622: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   625: pop
    //   626: iinc #6, 1
    //   629: goto -> 464
    //   632: aconst_null
    //   633: astore_1
    //   634: aload_2
    //   635: astore #8
    //   637: aload_0
    //   638: getfield i : Ljava/util/ArrayList;
    //   641: ifnull -> 777
    //   644: aload_0
    //   645: getfield i : Ljava/util/ArrayList;
    //   648: invokevirtual size : ()I
    //   651: istore #7
    //   653: aload_2
    //   654: astore #8
    //   656: iload #7
    //   658: ifle -> 777
    //   661: iload #7
    //   663: anewarray android/support/v4/a/g
    //   666: astore_2
    //   667: iload #5
    //   669: istore #6
    //   671: aload_2
    //   672: astore #8
    //   674: iload #6
    //   676: iload #7
    //   678: if_icmpge -> 777
    //   681: aload_2
    //   682: iload #6
    //   684: new android/support/v4/a/g
    //   687: dup
    //   688: aload_0
    //   689: getfield i : Ljava/util/ArrayList;
    //   692: iload #6
    //   694: invokevirtual get : (I)Ljava/lang/Object;
    //   697: checkcast android/support/v4/a/f
    //   700: invokespecial <init> : (Landroid/support/v4/a/f;)V
    //   703: aastore
    //   704: getstatic android/support/v4/a/q.a : Z
    //   707: ifeq -> 771
    //   710: new java/lang/StringBuilder
    //   713: dup
    //   714: invokespecial <init> : ()V
    //   717: astore #8
    //   719: aload #8
    //   721: ldc_w 'saveAllState: adding back stack #'
    //   724: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   727: pop
    //   728: aload #8
    //   730: iload #6
    //   732: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   735: pop
    //   736: aload #8
    //   738: ldc_w ': '
    //   741: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   744: pop
    //   745: aload #8
    //   747: aload_0
    //   748: getfield i : Ljava/util/ArrayList;
    //   751: iload #6
    //   753: invokevirtual get : (I)Ljava/lang/Object;
    //   756: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   759: pop
    //   760: ldc 'FragmentManager'
    //   762: aload #8
    //   764: invokevirtual toString : ()Ljava/lang/String;
    //   767: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   770: pop
    //   771: iinc #6, 1
    //   774: goto -> 671
    //   777: new android/support/v4/a/r
    //   780: dup
    //   781: invokespecial <init> : ()V
    //   784: astore_2
    //   785: aload_2
    //   786: aload #4
    //   788: putfield a : [Landroid/support/v4/a/s;
    //   791: aload_2
    //   792: aload_1
    //   793: putfield b : [I
    //   796: aload_2
    //   797: aload #8
    //   799: putfield c : [Landroid/support/v4/a/g;
    //   802: aload_2
    //   803: areturn
    //   804: aconst_null
    //   805: areturn }
  
  public void h() { this.t = false; }
  
  public void i() {
    this.t = false;
    a(1, false);
  }
  
  public void j() {
    this.t = false;
    a(2, false);
  }
  
  public void k() {
    this.t = false;
    a(4, false);
  }
  
  public void l() {
    this.t = false;
    a(5, false);
  }
  
  public void m() { a(4, false); }
  
  public void n() {
    this.t = true;
    a(3, false);
  }
  
  public void o() { a(2, false); }
  
  public void p() { a(1, false); }
  
  public void q() {
    this.u = true;
    d();
    a(0, false);
    this.o = null;
    this.p = null;
    this.q = null;
  }
  
  public void r() {
    if (this.g != null)
      for (byte b1 = 0; b1 < this.g.size(); b1++) {
        k k1 = (k)this.g.get(b1);
        if (k1 != null)
          k1.B(); 
      }  
  }
  
  m s() { return this; }
  
  public String toString() {
    o o1;
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append("FragmentManager{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" in ");
    if (this.q != null) {
      o1 = this.q;
    } else {
      o1 = this.o;
    } 
    c.a(o1, stringBuilder);
    stringBuilder.append("}}");
    return stringBuilder.toString();
  }
  
  static class a implements Animation.AnimationListener {
    private Animation.AnimationListener a = null;
    
    private boolean b = false;
    
    private View c = null;
    
    public a(View param1View, Animation param1Animation) {
      if (param1View != null) {
        if (param1Animation == null)
          return; 
        this.c = param1View;
      } 
    }
    
    public a(View param1View, Animation param1Animation, Animation.AnimationListener param1AnimationListener) {
      if (param1View != null) {
        if (param1Animation == null)
          return; 
        this.a = param1AnimationListener;
        this.c = param1View;
      } 
    }
    
    public void onAnimationEnd(Animation param1Animation) {
      if (this.c != null && this.b)
        this.c.post(new Runnable(this) {
              public void run() { af.a(q.a.a(this.a), 0, null); }
            }); 
      if (this.a != null)
        this.a.onAnimationEnd(param1Animation); 
    }
    
    public void onAnimationRepeat(Animation param1Animation) {
      if (this.a != null)
        this.a.onAnimationRepeat(param1Animation); 
    }
    
    public void onAnimationStart(Animation param1Animation) {
      if (this.c != null) {
        this.b = q.a(this.c, param1Animation);
        if (this.b)
          this.c.post(new Runnable(this) {
                public void run() { af.a(q.a.a(this.a), 2, null); }
              }); 
      } 
      if (this.a != null)
        this.a.onAnimationStart(param1Animation); 
    }
  }
  
  class null implements Runnable {
    null(q this$0) {}
    
    public void run() { af.a(q.a.a(this.a), 2, null); }
  }
  
  class null implements Runnable {
    null(q this$0) {}
    
    public void run() { af.a(q.a.a(this.a), 0, null); }
  }
  
  static class b {
    public static final int[] a = { 16842755, 16842960, 16842961 };
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/a/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */