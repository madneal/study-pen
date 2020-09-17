package android.support.v4.g;

import java.util.Map;

public class h<K, V> extends Object {
  static Object[] b;
  
  static int c;
  
  static Object[] d;
  
  static int e;
  
  int[] f;
  
  Object[] g;
  
  int h;
  
  public h() {
    this.f = b.a;
    this.g = b.c;
    this.h = 0;
  }
  
  public h(int paramInt) {
    if (paramInt == 0) {
      this.f = b.a;
      this.g = b.c;
    } else {
      e(paramInt);
    } 
    this.h = 0;
  }
  
  private static void a(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt) { // Byte code:
    //   0: aload_0
    //   1: arraylength
    //   2: bipush #8
    //   4: if_icmpne -> 71
    //   7: ldc android/support/v4/g/a
    //   9: monitorenter
    //   10: getstatic android/support/v4/g/h.e : I
    //   13: bipush #10
    //   15: if_icmpge -> 61
    //   18: aload_1
    //   19: iconst_0
    //   20: getstatic android/support/v4/g/h.d : [Ljava/lang/Object;
    //   23: aastore
    //   24: aload_1
    //   25: iconst_1
    //   26: aload_0
    //   27: aastore
    //   28: iload_2
    //   29: iconst_1
    //   30: ishl
    //   31: iconst_1
    //   32: isub
    //   33: istore_2
    //   34: iload_2
    //   35: iconst_2
    //   36: if_icmplt -> 49
    //   39: aload_1
    //   40: iload_2
    //   41: aconst_null
    //   42: aastore
    //   43: iinc #2, -1
    //   46: goto -> 34
    //   49: aload_1
    //   50: putstatic android/support/v4/g/h.d : [Ljava/lang/Object;
    //   53: getstatic android/support/v4/g/h.e : I
    //   56: iconst_1
    //   57: iadd
    //   58: putstatic android/support/v4/g/h.e : I
    //   61: ldc android/support/v4/g/a
    //   63: monitorexit
    //   64: return
    //   65: astore_0
    //   66: ldc android/support/v4/g/a
    //   68: monitorexit
    //   69: aload_0
    //   70: athrow
    //   71: aload_0
    //   72: arraylength
    //   73: iconst_4
    //   74: if_icmpne -> 141
    //   77: ldc android/support/v4/g/a
    //   79: monitorenter
    //   80: getstatic android/support/v4/g/h.c : I
    //   83: bipush #10
    //   85: if_icmpge -> 131
    //   88: aload_1
    //   89: iconst_0
    //   90: getstatic android/support/v4/g/h.b : [Ljava/lang/Object;
    //   93: aastore
    //   94: aload_1
    //   95: iconst_1
    //   96: aload_0
    //   97: aastore
    //   98: iload_2
    //   99: iconst_1
    //   100: ishl
    //   101: iconst_1
    //   102: isub
    //   103: istore_2
    //   104: iload_2
    //   105: iconst_2
    //   106: if_icmplt -> 119
    //   109: aload_1
    //   110: iload_2
    //   111: aconst_null
    //   112: aastore
    //   113: iinc #2, -1
    //   116: goto -> 104
    //   119: aload_1
    //   120: putstatic android/support/v4/g/h.b : [Ljava/lang/Object;
    //   123: getstatic android/support/v4/g/h.c : I
    //   126: iconst_1
    //   127: iadd
    //   128: putstatic android/support/v4/g/h.c : I
    //   131: ldc android/support/v4/g/a
    //   133: monitorexit
    //   134: return
    //   135: astore_0
    //   136: ldc android/support/v4/g/a
    //   138: monitorexit
    //   139: aload_0
    //   140: athrow
    //   141: return
    // Exception table:
    //   from	to	target	type
    //   10	24	65	finally
    //   49	61	65	finally
    //   61	64	65	finally
    //   66	69	65	finally
    //   80	94	135	finally
    //   119	131	135	finally
    //   131	134	135	finally
    //   136	139	135	finally }
  
  private void e(int paramInt) { // Byte code:
    //   0: iload_1
    //   1: bipush #8
    //   3: if_icmpne -> 75
    //   6: ldc android/support/v4/g/a
    //   8: monitorenter
    //   9: getstatic android/support/v4/g/h.d : [Ljava/lang/Object;
    //   12: ifnull -> 63
    //   15: getstatic android/support/v4/g/h.d : [Ljava/lang/Object;
    //   18: astore_2
    //   19: aload_0
    //   20: aload_2
    //   21: putfield g : [Ljava/lang/Object;
    //   24: aload_2
    //   25: iconst_0
    //   26: aaload
    //   27: checkcast [Ljava/lang/Object;
    //   30: putstatic android/support/v4/g/h.d : [Ljava/lang/Object;
    //   33: aload_0
    //   34: aload_2
    //   35: iconst_1
    //   36: aaload
    //   37: checkcast [I
    //   40: putfield f : [I
    //   43: aload_2
    //   44: iconst_1
    //   45: aconst_null
    //   46: aastore
    //   47: aload_2
    //   48: iconst_0
    //   49: aconst_null
    //   50: aastore
    //   51: getstatic android/support/v4/g/h.e : I
    //   54: iconst_1
    //   55: isub
    //   56: putstatic android/support/v4/g/h.e : I
    //   59: ldc android/support/v4/g/a
    //   61: monitorexit
    //   62: return
    //   63: ldc android/support/v4/g/a
    //   65: monitorexit
    //   66: goto -> 149
    //   69: astore_2
    //   70: ldc android/support/v4/g/a
    //   72: monitorexit
    //   73: aload_2
    //   74: athrow
    //   75: iload_1
    //   76: iconst_4
    //   77: if_icmpne -> 149
    //   80: ldc android/support/v4/g/a
    //   82: monitorenter
    //   83: getstatic android/support/v4/g/h.b : [Ljava/lang/Object;
    //   86: ifnull -> 137
    //   89: getstatic android/support/v4/g/h.b : [Ljava/lang/Object;
    //   92: astore_2
    //   93: aload_0
    //   94: aload_2
    //   95: putfield g : [Ljava/lang/Object;
    //   98: aload_2
    //   99: iconst_0
    //   100: aaload
    //   101: checkcast [Ljava/lang/Object;
    //   104: putstatic android/support/v4/g/h.b : [Ljava/lang/Object;
    //   107: aload_0
    //   108: aload_2
    //   109: iconst_1
    //   110: aaload
    //   111: checkcast [I
    //   114: putfield f : [I
    //   117: aload_2
    //   118: iconst_1
    //   119: aconst_null
    //   120: aastore
    //   121: aload_2
    //   122: iconst_0
    //   123: aconst_null
    //   124: aastore
    //   125: getstatic android/support/v4/g/h.c : I
    //   128: iconst_1
    //   129: isub
    //   130: putstatic android/support/v4/g/h.c : I
    //   133: ldc android/support/v4/g/a
    //   135: monitorexit
    //   136: return
    //   137: ldc android/support/v4/g/a
    //   139: monitorexit
    //   140: goto -> 149
    //   143: astore_2
    //   144: ldc android/support/v4/g/a
    //   146: monitorexit
    //   147: aload_2
    //   148: athrow
    //   149: aload_0
    //   150: iload_1
    //   151: newarray int
    //   153: putfield f : [I
    //   156: aload_0
    //   157: iload_1
    //   158: iconst_1
    //   159: ishl
    //   160: anewarray java/lang/Object
    //   163: putfield g : [Ljava/lang/Object;
    //   166: return
    // Exception table:
    //   from	to	target	type
    //   9	43	69	finally
    //   51	62	69	finally
    //   63	66	69	finally
    //   70	73	69	finally
    //   83	117	143	finally
    //   125	136	143	finally
    //   137	140	143	finally
    //   144	147	143	finally }
  
  int a() {
    int i = this.h;
    if (i == 0)
      return -1; 
    int j = b.a(this.f, i, 0);
    if (j < 0)
      return j; 
    if (this.g[j << true] == null)
      return j; 
    int k;
    for (k = j + 1; k < i && this.f[k] == 0; k++) {
      if (this.g[k << true] == null)
        return k; 
    } 
    for (i = j - 1; i >= 0 && this.f[i] == 0; i--) {
      if (this.g[i << true] == null)
        return i; 
    } 
    return k ^ 0xFFFFFFFF;
  }
  
  public int a(Object paramObject) { return (paramObject == null) ? a() : a(paramObject, paramObject.hashCode()); }
  
  int a(Object paramObject, int paramInt) {
    int i = this.h;
    if (i == 0)
      return -1; 
    int j = b.a(this.f, i, paramInt);
    if (j < 0)
      return j; 
    if (paramObject.equals(this.g[j << 1]))
      return j; 
    int k;
    for (k = j + 1; k < i && this.f[k] == paramInt; k++) {
      if (paramObject.equals(this.g[k << 1]))
        return k; 
    } 
    while (--j >= 0 && this.f[j] == paramInt) {
      if (paramObject.equals(this.g[j << 1]))
        return j; 
      j--;
    } 
    return k ^ 0xFFFFFFFF;
  }
  
  public V a(int paramInt, V paramV) {
    paramInt = (paramInt << 1) + 1;
    Object object = this.g[paramInt];
    this.g[paramInt] = paramV;
    return (V)object;
  }
  
  public void a(int paramInt) {
    if (this.f.length < paramInt) {
      int[] arrayOfInt = this.f;
      Object[] arrayOfObject = this.g;
      e(paramInt);
      if (this.h > 0) {
        System.arraycopy(arrayOfInt, 0, this.f, 0, this.h);
        System.arraycopy(arrayOfObject, 0, this.g, 0, this.h << 1);
      } 
      a(arrayOfInt, arrayOfObject, this.h);
    } 
  }
  
  int b(Object paramObject) {
    int i = this.h * 2;
    Object[] arrayOfObject = this.g;
    if (paramObject == null) {
      for (boolean bool = true; bool < i; bool += true) {
        if (arrayOfObject[bool] == null)
          return bool >> true; 
      } 
    } else {
      for (boolean bool = true; bool < i; bool += true) {
        if (paramObject.equals(arrayOfObject[bool]))
          return bool >> true; 
      } 
    } 
    return -1;
  }
  
  public K b(int paramInt) { return (K)this.g[paramInt << 1]; }
  
  public V c(int paramInt) { return (V)this.g[(paramInt << 1) + 1]; }
  
  public void clear() {
    if (this.h != 0) {
      a(this.f, this.g, this.h);
      this.f = b.a;
      this.g = b.c;
      this.h = 0;
    } 
  }
  
  public boolean containsKey(Object paramObject) { return (a(paramObject) >= 0); }
  
  public boolean containsValue(Object paramObject) { return (b(paramObject) >= 0); }
  
  public V d(int paramInt) {
    Object[] arrayOfObject = this.g;
    int i = paramInt << 1;
    Object object = arrayOfObject[i + 1];
    if (this.h <= 1) {
      a(this.f, this.g, this.h);
      this.f = b.a;
      this.g = b.c;
      this.h = 0;
      return (V)object;
    } 
    int j = this.f.length;
    int k = 8;
    if (j > 8 && this.h < this.f.length / 3) {
      if (this.h > 8) {
        k = this.h;
        k = (this.h >> 1) + k;
      } 
      int[] arrayOfInt = this.f;
      Object[] arrayOfObject1 = this.g;
      e(k);
      this.h--;
      if (paramInt > 0) {
        System.arraycopy(arrayOfInt, 0, this.f, 0, paramInt);
        System.arraycopy(arrayOfObject1, 0, this.g, 0, i);
      } 
      if (paramInt < this.h) {
        k = paramInt + 1;
        System.arraycopy(arrayOfInt, k, this.f, paramInt, this.h - paramInt);
        System.arraycopy(arrayOfObject1, k << 1, this.g, i, this.h - paramInt << 1);
        return (V)object;
      } 
    } else {
      this.h--;
      if (paramInt < this.h) {
        int[] arrayOfInt = this.f;
        k = paramInt + 1;
        System.arraycopy(arrayOfInt, k, this.f, paramInt, this.h - paramInt);
        System.arraycopy(this.g, k << 1, this.g, i, this.h - paramInt << 1);
      } 
      this.g[this.h << 1] = null;
      this.g[(this.h << 1) + 1] = null;
    } 
    return (V)object;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof Map) {
      Map map = (Map)paramObject;
      if (size() != map.size())
        return false; 
      byte b1 = 0;
      try {
        while (b1 < this.h) {
          paramObject = b(b1);
          Object object1 = c(b1);
          Object object2 = map.get(paramObject);
          if (object1 == null) {
            if (object2 != null || !map.containsKey(paramObject))
              return false; 
          } else {
            boolean bool = object1.equals(object2);
            if (!bool)
              return false; 
          } 
          b1++;
        } 
        return true;
      } catch (NullPointerException|ClassCastException paramObject) {}
    } 
    return false;
  }
  
  public V get(Object paramObject) {
    int i = a(paramObject);
    return (i >= 0) ? (V)this.g[(i << 1) + 1] : null;
  }
  
  public int hashCode() {
    int[] arrayOfInt = this.f;
    Object[] arrayOfObject = this.g;
    int i = this.h;
    byte b1 = 0;
    boolean bool = true;
    int j = 0;
    while (b1 < i) {
      int m;
      Object object = arrayOfObject[bool];
      int k = arrayOfInt[b1];
      if (object == null) {
        m = 0;
      } else {
        m = object.hashCode();
      } 
      j += (m ^ k);
      b1++;
      bool += true;
    } 
    return j;
  }
  
  public boolean isEmpty() { return (this.h <= 0); }
  
  public V put(K paramK, V paramV) {
    int j;
    if (paramK == null) {
      i = a();
      j = 0;
    } else {
      j = paramK.hashCode();
      i = a(paramK, j);
    } 
    if (i >= 0) {
      i = (i << 1) + 1;
      paramK = (K)this.g[i];
      this.g[i] = paramV;
      return (V)paramK;
    } 
    int k = i ^ 0xFFFFFFFF;
    if (this.h >= this.f.length) {
      int m = this.h;
      i = 4;
      if (m >= 8) {
        i = this.h;
        i = (this.h >> 1) + i;
      } else if (this.h >= 4) {
        i = 8;
      } 
      int[] arrayOfInt = this.f;
      Object[] arrayOfObject1 = this.g;
      e(i);
      if (this.f.length > 0) {
        System.arraycopy(arrayOfInt, 0, this.f, 0, arrayOfInt.length);
        System.arraycopy(arrayOfObject1, 0, this.g, 0, arrayOfObject1.length);
      } 
      a(arrayOfInt, arrayOfObject1, this.h);
    } 
    if (k < this.h) {
      int[] arrayOfInt1 = this.f;
      int[] arrayOfInt2 = this.f;
      i = k + 1;
      System.arraycopy(arrayOfInt1, k, arrayOfInt2, i, this.h - k);
      System.arraycopy(this.g, k << 1, this.g, i << 1, this.h - k << 1);
    } 
    this.f[k] = j;
    Object[] arrayOfObject = this.g;
    int i = k << 1;
    arrayOfObject[i] = paramK;
    this.g[i + 1] = paramV;
    this.h++;
    return null;
  }
  
  public V remove(Object paramObject) {
    int i = a(paramObject);
    return (i >= 0) ? (V)d(i) : null;
  }
  
  public int size() { return this.h; }
  
  public String toString() {
    if (isEmpty())
      return "{}"; 
    StringBuilder stringBuilder = new StringBuilder(this.h * 28);
    stringBuilder.append('{');
    for (byte b1 = 0; b1 < this.h; b1++) {
      if (b1)
        stringBuilder.append(", "); 
      Object object = b(b1);
      if (object != this) {
        stringBuilder.append(object);
      } else {
        stringBuilder.append("(this Map)");
      } 
      stringBuilder.append('=');
      object = c(b1);
      if (object != this) {
        stringBuilder.append(object);
      } else {
        stringBuilder.append("(this Map)");
      } 
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/g/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */