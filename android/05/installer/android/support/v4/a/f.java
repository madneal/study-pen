package android.support.v4.a;

import android.os.Build;
import android.support.v4.g.a;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

final class f extends t implements Runnable {
  static final boolean a;
  
  final q b;
  
  a c;
  
  a d;
  
  int e;
  
  int f;
  
  int g;
  
  int h;
  
  int i;
  
  int j;
  
  int k;
  
  boolean l;
  
  boolean m = true;
  
  String n;
  
  boolean o;
  
  int p = -1;
  
  int q;
  
  CharSequence r;
  
  int s;
  
  CharSequence t;
  
  ArrayList<String> u;
  
  ArrayList<String> v;
  
  static  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 21) {
      bool = true;
    } else {
      bool = false;
    } 
    a = bool;
  }
  
  public f(q paramq) { this.b = paramq; }
  
  private b a(SparseArray<k> paramSparseArray1, SparseArray<k> paramSparseArray2, boolean paramBoolean) {
    byte b5;
    byte b4;
    b b2 = new b(this);
    b2.d = new View(this.b.o.g());
    boolean bool = false;
    int i1 = 0;
    byte b3 = 0;
    while (true) {
      b4 = bool;
      b5 = b3;
      if (i1 < paramSparseArray1.size()) {
        if (a(paramSparseArray1.keyAt(i1), b2, paramBoolean, paramSparseArray1, paramSparseArray2))
          b3 = 1; 
        i1++;
        continue;
      } 
      break;
    } 
    while (b4 < paramSparseArray2.size()) {
      i1 = paramSparseArray2.keyAt(b4);
      b3 = b5;
      if (paramSparseArray1.get(i1) == null) {
        b3 = b5;
        if (a(i1, b2, paramBoolean, paramSparseArray1, paramSparseArray2))
          b3 = 1; 
      } 
      b4++;
      b5 = b3;
    } 
    b b1 = b2;
    if (b5 == 0)
      b1 = null; 
    return b1;
  }
  
  private a<String, View> a(b paramb, k paramk, boolean paramBoolean) {
    a a1 = new a();
    a a2 = a1;
    if (this.u != null) {
      u.a(a1, paramk.g());
      if (paramBoolean) {
        a1.a(this.v);
        a2 = a1;
      } else {
        a2 = a(this.u, this.v, a1);
      } 
    } 
    if (paramBoolean) {
      if (paramk.X != null)
        paramk.X.a(this.v, a2); 
      a(paramb, a2, false);
      return a2;
    } 
    if (paramk.Y != null)
      paramk.Y.a(this.v, a2); 
    b(paramb, a2, false);
    return a2;
  }
  
  private a<String, View> a(b paramb, boolean paramBoolean, k paramk) {
    a a1 = b(paramb, paramk, paramBoolean);
    if (paramBoolean) {
      if (paramk.Y != null)
        paramk.Y.a(this.v, a1); 
      a(paramb, a1, true);
      return a1;
    } 
    if (paramk.X != null)
      paramk.X.a(this.v, a1); 
    b(paramb, a1, true);
    return a1;
  }
  
  private static a<String, View> a(ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, a<String, View> parama) {
    if (parama.isEmpty())
      return parama; 
    a a1 = new a();
    int i1 = paramArrayList1.size();
    for (byte b1 = 0; b1 < i1; b1++) {
      View view = (View)parama.get(paramArrayList1.get(b1));
      if (view != null)
        a1.put(paramArrayList2.get(b1), view); 
    } 
    return a1;
  }
  
  private static Object a(k paramk1, k paramk2, boolean paramBoolean) {
    Object object;
    if (paramk1 == null || paramk2 == null)
      return null; 
    if (paramBoolean) {
      object = paramk2.v();
    } else {
      object = object.u();
    } 
    return u.b(object);
  }
  
  private static Object a(k paramk, boolean paramBoolean) {
    Object object;
    if (paramk == null)
      return null; 
    if (paramBoolean) {
      object = paramk.t();
    } else {
      object = object.q();
    } 
    return u.a(object);
  }
  
  private static Object a(Object paramObject, k paramk, ArrayList<View> paramArrayList, a<String, View> parama, View paramView) {
    Object object = paramObject;
    if (paramObject != null)
      object = u.a(paramObject, paramk.g(), paramArrayList, parama, paramView); 
    return object;
  }
  
  private void a(b paramb, int paramInt, Object paramObject) {
    if (this.b.g != null)
      for (byte b1 = 0; b1 < this.b.g.size(); b1++) {
        k k1 = (k)this.b.g.get(b1);
        if (k1.I != null && k1.H != null && k1.x == paramInt)
          if (k1.z) {
            if (!paramb.b.contains(k1.I)) {
              u.a(paramObject, k1.I, true);
              paramb.b.add(k1.I);
            } 
          } else {
            u.a(paramObject, k1.I, false);
            paramb.b.remove(k1.I);
          }  
      }  
  }
  
  private void a(b paramb, k paramk1, k paramk2, boolean paramBoolean, a<String, View> parama) {
    aa aa;
    if (paramBoolean) {
      aa = paramk2.X;
    } else {
      aa = paramk1.X;
    } 
    if (aa != null)
      aa.b(new ArrayList(parama.keySet()), new ArrayList(parama.values()), null); 
  }
  
  private void a(b paramb, a<String, View> parama, boolean paramBoolean) {
    int i1;
    ArrayList arrayList = this.v;
    byte b1 = 0;
    if (arrayList == null) {
      i1 = 0;
    } else {
      i1 = this.v.size();
    } 
    while (b1 < i1) {
      String str = (String)this.u.get(b1);
      View view = (View)parama.get((String)this.v.get(b1));
      if (view != null) {
        String str1 = u.a(view);
        if (paramBoolean) {
          a(paramb.a, str, str1);
        } else {
          a(paramb.a, str1, str);
        } 
      } 
      b1++;
    } 
  }
  
  private void a(b paramb, View paramView, Object paramObject, k paramk1, k paramk2, boolean paramBoolean, ArrayList<View> paramArrayList) { paramView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener(this, paramView, paramObject, paramArrayList, paramb, paramBoolean, paramk1, paramk2) {
          public boolean onPreDraw() {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (this.b != null) {
              u.a(this.b, this.c);
              this.c.clear();
              a a1 = f.a(this.h, this.d, this.e, this.f);
              u.a(this.b, this.d.d, a1, this.c);
              f.a(this.h, a1, this.d);
              f.a(this.h, this.d, this.f, this.g, this.e, a1);
            } 
            return true;
          }
        }); }
  
  private static void a(b paramb, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2) {
    if (paramArrayList1 != null)
      for (byte b1 = 0; b1 < paramArrayList1.size(); b1++) {
        String str1 = (String)paramArrayList1.get(b1);
        String str2 = (String)paramArrayList2.get(b1);
        a(paramb.a, str1, str2);
      }  
  }
  
  private void a(a<String, View> parama, b paramb) {
    if (this.v != null && !parama.isEmpty()) {
      View view = (View)parama.get(this.v.get(0));
      if (view != null)
        paramb.c.a = view; 
    } 
  }
  
  private static void a(a<String, String> parama, String paramString1, String paramString2) {
    if (paramString1 != null && paramString2 != null) {
      for (byte b1 = 0; b1 < parama.size(); b1++) {
        if (paramString1.equals(parama.c(b1))) {
          parama.a(b1, paramString2);
          return;
        } 
      } 
      parama.put(paramString1, paramString2);
    } 
  }
  
  private static void a(SparseArray<k> paramSparseArray1, SparseArray<k> paramSparseArray2, k paramk) {
    if (paramk != null) {
      int i1 = paramk.x;
      if (i1 != 0 && !paramk.f()) {
        if (paramk.e() && paramk.g() != null && paramSparseArray1.get(i1) == null)
          paramSparseArray1.put(i1, paramk); 
        if (paramSparseArray2.get(i1) == paramk)
          paramSparseArray2.remove(i1); 
      } 
    } 
  }
  
  private void a(View paramView, b paramb, int paramInt, Object paramObject) { paramView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener(this, paramView, paramb, paramInt, paramObject) {
          public boolean onPreDraw() {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            f.a(this.e, this.b, this.c, this.d);
            return true;
          }
        }); }
  
  private boolean a(int paramInt, b paramb, boolean paramBoolean, SparseArray<k> paramSparseArray1, SparseArray<k> paramSparseArray2) {
    ViewGroup viewGroup = (ViewGroup)this.b.p.a(paramInt);
    if (viewGroup == null)
      return false; 
    k k1 = (k)paramSparseArray2.get(paramInt);
    k k2 = (k)paramSparseArray1.get(paramInt);
    Object object3 = a(k1, paramBoolean);
    Object object1 = a(k1, k2, paramBoolean);
    Object object4 = b(k2, paramBoolean);
    ArrayList arrayList1 = new ArrayList();
    paramSparseArray2 = null;
    if (object1 != null) {
      a a2 = a(paramb, k2, paramBoolean);
      if (a2.isEmpty()) {
        a2 = null;
        object1 = paramSparseArray2;
        a a3 = a2;
      } else {
        aa aa;
        if (paramBoolean) {
          aa = k2.X;
        } else {
          aa = k1.X;
        } 
        if (aa != null)
          aa.a(new ArrayList(a2.keySet()), new ArrayList(a2.values()), null); 
        a(paramb, viewGroup, object1, k1, k2, paramBoolean, arrayList1);
        a a3 = a2;
      } 
    } else {
      paramSparseArray2 = null;
    } 
    if (object3 == null && object1 == null && object4 == null)
      return false; 
    ArrayList arrayList2 = new ArrayList();
    Object object2 = a(object4, k2, arrayList2, paramSparseArray2, paramb.d);
    if (this.v != null && paramSparseArray2 != null) {
      object4 = (View)paramSparseArray2.get(this.v.get(0));
      if (object4 != null) {
        if (object2 != null)
          u.a(object2, object4); 
        if (object1 != null)
          u.a(object1, object4); 
      } 
    } 
    u.b b1 = new u.b(this, k1) {
        public View a() { return this.a.g(); }
      };
    ArrayList arrayList3 = new ArrayList();
    a a1 = new a();
    if (k1 != null) {
      if (paramBoolean) {
        paramBoolean = k1.x();
      } else {
        paramBoolean = k1.w();
      } 
    } else {
      paramBoolean = true;
    } 
    object4 = u.a(object3, object2, object1, paramBoolean);
    if (object4 != null) {
      View view = paramb.d;
      u.a a3 = paramb.c;
      a a2 = paramb.a;
      Object object = object4;
      u.a(object3, object1, viewGroup, b1, view, a3, a2, arrayList3, paramSparseArray2, a1, arrayList1);
      a(viewGroup, paramb, paramInt, object);
      u.a(object, paramb.d, true);
      a(paramb, paramInt, object);
      u.a(viewGroup, object);
      u.a(viewGroup, paramb.d, object3, arrayList3, object2, arrayList2, object1, arrayList1, object, paramb.b, a1);
    } 
    return (object4 != null);
  }
  
  private a<String, View> b(b paramb, k paramk, boolean paramBoolean) {
    a a1 = new a();
    View view = paramk.g();
    if (view != null && this.u != null) {
      u.a(a1, view);
      if (paramBoolean)
        return a(this.u, this.v, a1); 
      a1.a(this.v);
    } 
    return a1;
  }
  
  private static Object b(k paramk, boolean paramBoolean) {
    Object object;
    if (paramk == null)
      return null; 
    if (paramBoolean) {
      object = paramk.r();
    } else {
      object = object.s();
    } 
    return u.a(object);
  }
  
  private void b(b paramb, a<String, View> parama, boolean paramBoolean) {
    int i1 = parama.size();
    for (byte b1 = 0; b1 < i1; b1++) {
      String str1 = (String)parama.b(b1);
      String str2 = u.a((View)parama.c(b1));
      if (paramBoolean) {
        a(paramb.a, str1, str2);
      } else {
        a(paramb.a, str2, str1);
      } 
    } 
  }
  
  private void b(SparseArray<k> paramSparseArray1, SparseArray<k> paramSparseArray2) {
    if (!this.b.p.a())
      return; 
    for (a a1 = this.c; a1 != null; a1 = a1.a) {
      k k1;
      switch (a1.c) {
        case 3:
        case 4:
        case 6:
          a(paramSparseArray1, paramSparseArray2, a1.d);
          break;
        case 2:
          k1 = a1.d;
        case 1:
        case 5:
        case 7:
          b(paramSparseArray1, paramSparseArray2, a1.d);
          break;
      } 
      continue;
    } 
  }
  
  private void b(SparseArray<k> paramSparseArray1, SparseArray<k> paramSparseArray2, k paramk) {
    if (paramk != null) {
      int i1 = paramk.x;
      if (i1 != 0) {
        if (!paramk.e())
          paramSparseArray2.put(i1, paramk); 
        if (paramSparseArray1.get(i1) == paramk)
          paramSparseArray1.remove(i1); 
      } 
      if (paramk.b < 1 && this.b.n >= 1) {
        this.b.c(paramk);
        this.b.a(paramk, 1, 0, 0, false);
      } 
    } 
  }
  
  public b a(boolean paramBoolean, b paramb, SparseArray<k> paramSparseArray1, SparseArray<k> paramSparseArray2) { // Byte code:
    //   0: getstatic android/support/v4/a/q.a : Z
    //   3: ifeq -> 69
    //   6: new java/lang/StringBuilder
    //   9: dup
    //   10: invokespecial <init> : ()V
    //   13: astore #5
    //   15: aload #5
    //   17: ldc_w 'popFromBackStack: '
    //   20: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: pop
    //   24: aload #5
    //   26: aload_0
    //   27: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   30: pop
    //   31: ldc_w 'FragmentManager'
    //   34: aload #5
    //   36: invokevirtual toString : ()Ljava/lang/String;
    //   39: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   42: pop
    //   43: aload_0
    //   44: ldc_w '  '
    //   47: aconst_null
    //   48: new java/io/PrintWriter
    //   51: dup
    //   52: new android/support/v4/g/d
    //   55: dup
    //   56: ldc_w 'FragmentManager'
    //   59: invokespecial <init> : (Ljava/lang/String;)V
    //   62: invokespecial <init> : (Ljava/io/Writer;)V
    //   65: aconst_null
    //   66: invokevirtual a : (Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    //   69: aload_2
    //   70: astore #5
    //   72: getstatic android/support/v4/a/f.a : Z
    //   75: ifeq -> 149
    //   78: aload_2
    //   79: astore #5
    //   81: aload_0
    //   82: getfield b : Landroid/support/v4/a/q;
    //   85: getfield n : I
    //   88: iconst_1
    //   89: if_icmplt -> 149
    //   92: aload_2
    //   93: ifnonnull -> 127
    //   96: aload_3
    //   97: invokevirtual size : ()I
    //   100: ifne -> 114
    //   103: aload_2
    //   104: astore #5
    //   106: aload #4
    //   108: invokevirtual size : ()I
    //   111: ifeq -> 149
    //   114: aload_0
    //   115: aload_3
    //   116: aload #4
    //   118: iconst_1
    //   119: invokespecial a : (Landroid/util/SparseArray;Landroid/util/SparseArray;Z)Landroid/support/v4/a/f$b;
    //   122: astore #5
    //   124: goto -> 149
    //   127: aload_2
    //   128: astore #5
    //   130: iload_1
    //   131: ifne -> 149
    //   134: aload_2
    //   135: aload_0
    //   136: getfield v : Ljava/util/ArrayList;
    //   139: aload_0
    //   140: getfield u : Ljava/util/ArrayList;
    //   143: invokestatic a : (Landroid/support/v4/a/f$b;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    //   146: aload_2
    //   147: astore #5
    //   149: aload_0
    //   150: iconst_m1
    //   151: invokevirtual a : (I)V
    //   154: aload #5
    //   156: ifnull -> 165
    //   159: iconst_0
    //   160: istore #6
    //   162: goto -> 171
    //   165: aload_0
    //   166: getfield k : I
    //   169: istore #6
    //   171: aload #5
    //   173: ifnull -> 182
    //   176: iconst_0
    //   177: istore #7
    //   179: goto -> 188
    //   182: aload_0
    //   183: getfield j : I
    //   186: istore #7
    //   188: aload_0
    //   189: getfield d : Landroid/support/v4/a/f$a;
    //   192: astore_2
    //   193: aload_2
    //   194: ifnull -> 572
    //   197: aload #5
    //   199: ifnull -> 208
    //   202: iconst_0
    //   203: istore #8
    //   205: goto -> 214
    //   208: aload_2
    //   209: getfield g : I
    //   212: istore #8
    //   214: aload #5
    //   216: ifnull -> 225
    //   219: iconst_0
    //   220: istore #9
    //   222: goto -> 231
    //   225: aload_2
    //   226: getfield h : I
    //   229: istore #9
    //   231: aload_2
    //   232: getfield c : I
    //   235: tableswitch default -> 276, 1 -> 538, 2 -> 452, 3 -> 429, 4 -> 400, 5 -> 371, 6 -> 342, 7 -> 313
    //   276: new java/lang/StringBuilder
    //   279: dup
    //   280: invokespecial <init> : ()V
    //   283: astore_3
    //   284: aload_3
    //   285: ldc_w 'Unknown cmd: '
    //   288: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: pop
    //   292: aload_3
    //   293: aload_2
    //   294: getfield c : I
    //   297: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   300: pop
    //   301: new java/lang/IllegalArgumentException
    //   304: dup
    //   305: aload_3
    //   306: invokevirtual toString : ()Ljava/lang/String;
    //   309: invokespecial <init> : (Ljava/lang/String;)V
    //   312: athrow
    //   313: aload_2
    //   314: getfield d : Landroid/support/v4/a/k;
    //   317: astore_3
    //   318: aload_3
    //   319: iload #8
    //   321: putfield G : I
    //   324: aload_0
    //   325: getfield b : Landroid/support/v4/a/q;
    //   328: aload_3
    //   329: iload #7
    //   331: invokestatic c : (I)I
    //   334: iload #6
    //   336: invokevirtual d : (Landroid/support/v4/a/k;II)V
    //   339: goto -> 564
    //   342: aload_2
    //   343: getfield d : Landroid/support/v4/a/k;
    //   346: astore_3
    //   347: aload_3
    //   348: iload #8
    //   350: putfield G : I
    //   353: aload_0
    //   354: getfield b : Landroid/support/v4/a/q;
    //   357: aload_3
    //   358: iload #7
    //   360: invokestatic c : (I)I
    //   363: iload #6
    //   365: invokevirtual e : (Landroid/support/v4/a/k;II)V
    //   368: goto -> 564
    //   371: aload_2
    //   372: getfield d : Landroid/support/v4/a/k;
    //   375: astore_3
    //   376: aload_3
    //   377: iload #9
    //   379: putfield G : I
    //   382: aload_0
    //   383: getfield b : Landroid/support/v4/a/q;
    //   386: aload_3
    //   387: iload #7
    //   389: invokestatic c : (I)I
    //   392: iload #6
    //   394: invokevirtual b : (Landroid/support/v4/a/k;II)V
    //   397: goto -> 564
    //   400: aload_2
    //   401: getfield d : Landroid/support/v4/a/k;
    //   404: astore_3
    //   405: aload_3
    //   406: iload #8
    //   408: putfield G : I
    //   411: aload_0
    //   412: getfield b : Landroid/support/v4/a/q;
    //   415: aload_3
    //   416: iload #7
    //   418: invokestatic c : (I)I
    //   421: iload #6
    //   423: invokevirtual c : (Landroid/support/v4/a/k;II)V
    //   426: goto -> 564
    //   429: aload_2
    //   430: getfield d : Landroid/support/v4/a/k;
    //   433: astore_3
    //   434: aload_3
    //   435: iload #8
    //   437: putfield G : I
    //   440: aload_0
    //   441: getfield b : Landroid/support/v4/a/q;
    //   444: aload_3
    //   445: iconst_0
    //   446: invokevirtual a : (Landroid/support/v4/a/k;Z)V
    //   449: goto -> 564
    //   452: aload_2
    //   453: getfield d : Landroid/support/v4/a/k;
    //   456: astore_3
    //   457: aload_3
    //   458: ifnull -> 482
    //   461: aload_3
    //   462: iload #9
    //   464: putfield G : I
    //   467: aload_0
    //   468: getfield b : Landroid/support/v4/a/q;
    //   471: aload_3
    //   472: iload #7
    //   474: invokestatic c : (I)I
    //   477: iload #6
    //   479: invokevirtual a : (Landroid/support/v4/a/k;II)V
    //   482: aload_2
    //   483: getfield i : Ljava/util/ArrayList;
    //   486: ifnull -> 564
    //   489: iconst_0
    //   490: istore #9
    //   492: iload #9
    //   494: aload_2
    //   495: getfield i : Ljava/util/ArrayList;
    //   498: invokevirtual size : ()I
    //   501: if_icmpge -> 564
    //   504: aload_2
    //   505: getfield i : Ljava/util/ArrayList;
    //   508: iload #9
    //   510: invokevirtual get : (I)Ljava/lang/Object;
    //   513: checkcast android/support/v4/a/k
    //   516: astore_3
    //   517: aload_3
    //   518: iload #8
    //   520: putfield G : I
    //   523: aload_0
    //   524: getfield b : Landroid/support/v4/a/q;
    //   527: aload_3
    //   528: iconst_0
    //   529: invokevirtual a : (Landroid/support/v4/a/k;Z)V
    //   532: iinc #9, 1
    //   535: goto -> 492
    //   538: aload_2
    //   539: getfield d : Landroid/support/v4/a/k;
    //   542: astore_3
    //   543: aload_3
    //   544: iload #9
    //   546: putfield G : I
    //   549: aload_0
    //   550: getfield b : Landroid/support/v4/a/q;
    //   553: aload_3
    //   554: iload #7
    //   556: invokestatic c : (I)I
    //   559: iload #6
    //   561: invokevirtual a : (Landroid/support/v4/a/k;II)V
    //   564: aload_2
    //   565: getfield b : Landroid/support/v4/a/f$a;
    //   568: astore_2
    //   569: goto -> 193
    //   572: iload_1
    //   573: ifeq -> 601
    //   576: aload_0
    //   577: getfield b : Landroid/support/v4/a/q;
    //   580: aload_0
    //   581: getfield b : Landroid/support/v4/a/q;
    //   584: getfield n : I
    //   587: iload #7
    //   589: invokestatic c : (I)I
    //   592: iload #6
    //   594: iconst_1
    //   595: invokevirtual a : (IIIZ)V
    //   598: aconst_null
    //   599: astore #5
    //   601: aload_0
    //   602: getfield p : I
    //   605: iflt -> 624
    //   608: aload_0
    //   609: getfield b : Landroid/support/v4/a/q;
    //   612: aload_0
    //   613: getfield p : I
    //   616: invokevirtual b : (I)V
    //   619: aload_0
    //   620: iconst_m1
    //   621: putfield p : I
    //   624: aload #5
    //   626: areturn }
  
  public String a() { return this.n; }
  
  void a(int paramInt) {
    if (!this.l)
      return; 
    if (q.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Bump nesting in ");
      stringBuilder.append(this);
      stringBuilder.append(" by ");
      stringBuilder.append(paramInt);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    for (a a1 = this.c; a1 != null; a1 = a1.a) {
      if (a1.d != null) {
        k k1 = a1.d;
        k1.r += paramInt;
        if (q.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Bump nesting of ");
          stringBuilder.append(a1.d);
          stringBuilder.append(" to ");
          stringBuilder.append(a1.d.r);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
      } 
      if (a1.i != null)
        for (int i1 = a1.i.size() - 1; i1 >= 0; i1--) {
          k k1 = (k)a1.i.get(i1);
          k1.r += paramInt;
          if (q.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Bump nesting of ");
            stringBuilder.append(k1);
            stringBuilder.append(" to ");
            stringBuilder.append(k1.r);
            Log.v("FragmentManager", stringBuilder.toString());
          } 
        }  
    } 
  }
  
  void a(a parama) {
    if (this.c == null) {
      this.d = parama;
      this.c = parama;
    } else {
      parama.b = this.d;
      this.d.a = parama;
      this.d = parama;
    } 
    parama.e = this.f;
    parama.f = this.g;
    parama.g = this.h;
    parama.h = this.i;
    this.e++;
  }
  
  public void a(SparseArray<k> paramSparseArray1, SparseArray<k> paramSparseArray2) {
    if (!this.b.p.a())
      return; 
    for (a a1 = this.d; a1 != null; a1 = a1.b) {
      switch (a1.c) {
        case 3:
        case 4:
        case 6:
          b(paramSparseArray1, paramSparseArray2, a1.d);
          break;
        case 2:
          if (a1.i != null)
            for (int i1 = a1.i.size() - 1; i1 >= 0; i1--)
              b(paramSparseArray1, paramSparseArray2, (k)a1.i.get(i1));  
        case 1:
        case 5:
        case 7:
          a(paramSparseArray1, paramSparseArray2, a1.d);
          break;
      } 
    } 
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) { a(paramString, paramPrintWriter, true); }
  
  public void a(String paramString, PrintWriter paramPrintWriter, boolean paramBoolean) {
    if (paramBoolean) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mName=");
      paramPrintWriter.print(this.n);
      paramPrintWriter.print(" mIndex=");
      paramPrintWriter.print(this.p);
      paramPrintWriter.print(" mCommitted=");
      paramPrintWriter.println(this.o);
      if (this.j != 0) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mTransition=#");
        paramPrintWriter.print(Integer.toHexString(this.j));
        paramPrintWriter.print(" mTransitionStyle=#");
        paramPrintWriter.println(Integer.toHexString(this.k));
      } 
      if (this.f != 0 || this.g != 0) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.f));
        paramPrintWriter.print(" mExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.g));
      } 
      if (this.h != 0 || this.i != 0) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mPopEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.h));
        paramPrintWriter.print(" mPopExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.i));
      } 
      if (this.q != 0 || this.r != null) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.q));
        paramPrintWriter.print(" mBreadCrumbTitleText=");
        paramPrintWriter.println(this.r);
      } 
      if (this.s != 0 || this.t != null) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.s));
        paramPrintWriter.print(" mBreadCrumbShortTitleText=");
        paramPrintWriter.println(this.t);
      } 
    } 
    if (this.c != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramString);
      stringBuilder.append("    ");
      String str = stringBuilder.toString();
      a a1 = this.c;
      for (byte b1 = 0; a1 != null; b1++) {
        String str1;
        switch (a1.c) {
          default:
            stringBuilder = new StringBuilder();
            stringBuilder.append("cmd=");
            stringBuilder.append(a1.c);
            str1 = stringBuilder.toString();
            break;
          case 7:
            str1 = "ATTACH";
            break;
          case 6:
            str1 = "DETACH";
            break;
          case 5:
            str1 = "SHOW";
            break;
          case 4:
            str1 = "HIDE";
            break;
          case 3:
            str1 = "REMOVE";
            break;
          case 2:
            str1 = "REPLACE";
            break;
          case 1:
            str1 = "ADD";
            break;
          case 0:
            str1 = "NULL";
            break;
        } 
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  Op #");
        paramPrintWriter.print(b1);
        paramPrintWriter.print(": ");
        paramPrintWriter.print(str1);
        paramPrintWriter.print(" ");
        paramPrintWriter.println(a1.d);
        if (paramBoolean) {
          if (a1.e != 0 || a1.f != 0) {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("enterAnim=#");
            paramPrintWriter.print(Integer.toHexString(a1.e));
            paramPrintWriter.print(" exitAnim=#");
            paramPrintWriter.println(Integer.toHexString(a1.f));
          } 
          if (a1.g != 0 || a1.h != 0) {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("popEnterAnim=#");
            paramPrintWriter.print(Integer.toHexString(a1.g));
            paramPrintWriter.print(" popExitAnim=#");
            paramPrintWriter.println(Integer.toHexString(a1.h));
          } 
        } 
        if (a1.i != null && a1.i.size() > 0)
          for (byte b2 = 0; b2 < a1.i.size(); b2++) {
            paramPrintWriter.print(str);
            if (a1.i.size() == 1) {
              str1 = "Removed: ";
            } else {
              if (!b2)
                paramPrintWriter.println("Removed:"); 
              paramPrintWriter.print(str);
              paramPrintWriter.print("  #");
              paramPrintWriter.print(b2);
              str1 = ": ";
            } 
            paramPrintWriter.print(str1);
            paramPrintWriter.println(a1.i.get(b2));
          }  
        a1 = a1.a;
      } 
    } 
  }
  
  public void run() {
    int i2;
    int i1;
    Object object;
    if (q.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Run: ");
      stringBuilder.append(this);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    if (this.l && this.p < 0)
      throw new IllegalStateException("addToBackStack() called after commit()"); 
    a(1);
    if (a && this.b.n >= 1) {
      SparseArray sparseArray1 = new SparseArray();
      SparseArray sparseArray2 = new SparseArray();
      b(sparseArray1, sparseArray2);
      object = a(sparseArray1, sparseArray2, false);
    } else {
      object = null;
    } 
    if (object != null) {
      i1 = 0;
    } else {
      i1 = this.k;
    } 
    if (object != null) {
      i2 = 0;
    } else {
      i2 = this.j;
    } 
    for (a a1 = this.c; a1 != null; a1 = a1.a) {
      k k2;
      int i5;
      int i4;
      int i3;
      k k1;
      StringBuilder stringBuilder;
      if (object != null) {
        i3 = 0;
      } else {
        i3 = a1.e;
      } 
      if (object != null) {
        i4 = 0;
      } else {
        i4 = a1.f;
      } 
      switch (a1.c) {
        default:
          stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown cmd: ");
          stringBuilder.append(a1.c);
          throw new IllegalArgumentException(stringBuilder.toString());
        case 7:
          k1 = a1.d;
          k1.G = i3;
          this.b.e(k1, i2, i1);
          break;
        case 6:
          k1 = a1.d;
          k1.G = i4;
          this.b.d(k1, i2, i1);
          break;
        case 5:
          k1 = a1.d;
          k1.G = i3;
          this.b.c(k1, i2, i1);
          break;
        case 4:
          k1 = a1.d;
          k1.G = i4;
          this.b.b(k1, i2, i1);
          break;
        case 3:
          k1 = a1.d;
          k1.G = i4;
          this.b.a(k1, i2, i1);
          break;
        case 2:
          k1 = a1.d;
          i5 = k1.x;
          k2 = k1;
          if (this.b.g != null) {
            int i6 = this.b.g.size() - 1;
            while (true) {
              k2 = k1;
              if (i6 >= 0) {
                k k3 = (k)this.b.g.get(i6);
                if (q.a) {
                  StringBuilder stringBuilder1 = new StringBuilder();
                  stringBuilder1.append("OP_REPLACE: adding=");
                  stringBuilder1.append(k1);
                  stringBuilder1.append(" old=");
                  stringBuilder1.append(k3);
                  Log.v("FragmentManager", stringBuilder1.toString());
                } 
                k2 = k1;
                if (k3.x == i5)
                  if (k3 == k1) {
                    a1.d = null;
                    k2 = null;
                  } else {
                    if (a1.i == null)
                      a1.i = new ArrayList(); 
                    a1.i.add(k3);
                    k3.G = i4;
                    if (this.l) {
                      k3.r++;
                      if (q.a) {
                        StringBuilder stringBuilder1 = new StringBuilder();
                        stringBuilder1.append("Bump nesting of ");
                        stringBuilder1.append(k3);
                        stringBuilder1.append(" to ");
                        stringBuilder1.append(k3.r);
                        Log.v("FragmentManager", stringBuilder1.toString());
                      } 
                    } 
                    this.b.a(k3, i2, i1);
                    k2 = k1;
                  }  
                i6--;
                k1 = k2;
                continue;
              } 
              break;
            } 
          } 
          if (k2 != null) {
            k2.G = i3;
            this.b.a(k2, false);
          } 
          break;
        case 1:
          k1 = a1.d;
          k1.G = i3;
          this.b.a(k1, false);
          break;
      } 
    } 
    this.b.a(this.b.n, i2, i1, true);
    if (this.l)
      this.b.a(this); 
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append("BackStackEntry{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (this.p >= 0) {
      stringBuilder.append(" #");
      stringBuilder.append(this.p);
    } 
    if (this.n != null) {
      stringBuilder.append(" ");
      stringBuilder.append(this.n);
    } 
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class a {
    a a;
    
    a b;
    
    int c;
    
    k d;
    
    int e;
    
    int f;
    
    int g;
    
    int h;
    
    ArrayList<k> i;
  }
  
  public class b {
    public a<String, String> a = new a();
    
    public ArrayList<View> b = new ArrayList();
    
    public u.a c = new u.a();
    
    public View d;
    
    public b(f this$0) {}
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */