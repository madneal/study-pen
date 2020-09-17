package android.support.v4.g;

import java.util.LinkedHashMap;

public class f<K, V> extends Object {
  private final LinkedHashMap<K, V> a;
  
  private int b;
  
  private int c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  private int g;
  
  private int h;
  
  public f(int paramInt) {
    if (paramInt <= 0)
      throw new IllegalArgumentException("maxSize <= 0"); 
    this.c = paramInt;
    this.a = new LinkedHashMap(0, 0.75F, true);
  }
  
  private int c(K paramK, V paramV) {
    int i = b(paramK, paramV);
    if (i < 0) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Negative size: ");
      stringBuilder.append(paramK);
      stringBuilder.append("=");
      stringBuilder.append(paramV);
      throw new IllegalStateException(stringBuilder.toString());
    } 
    return i;
  }
  
  public final V a(K paramK) { // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 14
    //   4: new java/lang/NullPointerException
    //   7: dup
    //   8: ldc 'key == null'
    //   10: invokespecial <init> : (Ljava/lang/String;)V
    //   13: athrow
    //   14: aload_0
    //   15: monitorenter
    //   16: aload_0
    //   17: getfield a : Ljava/util/LinkedHashMap;
    //   20: aload_1
    //   21: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   24: astore_2
    //   25: aload_2
    //   26: ifnull -> 43
    //   29: aload_0
    //   30: aload_0
    //   31: getfield g : I
    //   34: iconst_1
    //   35: iadd
    //   36: putfield g : I
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_2
    //   42: areturn
    //   43: aload_0
    //   44: aload_0
    //   45: getfield h : I
    //   48: iconst_1
    //   49: iadd
    //   50: putfield h : I
    //   53: aload_0
    //   54: monitorexit
    //   55: aload_0
    //   56: aload_1
    //   57: invokevirtual b : (Ljava/lang/Object;)Ljava/lang/Object;
    //   60: astore_2
    //   61: aload_2
    //   62: ifnonnull -> 67
    //   65: aconst_null
    //   66: areturn
    //   67: aload_0
    //   68: monitorenter
    //   69: aload_0
    //   70: aload_0
    //   71: getfield e : I
    //   74: iconst_1
    //   75: iadd
    //   76: putfield e : I
    //   79: aload_0
    //   80: getfield a : Ljava/util/LinkedHashMap;
    //   83: aload_1
    //   84: aload_2
    //   85: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   88: astore_3
    //   89: aload_3
    //   90: ifnull -> 106
    //   93: aload_0
    //   94: getfield a : Ljava/util/LinkedHashMap;
    //   97: aload_1
    //   98: aload_3
    //   99: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   102: pop
    //   103: goto -> 121
    //   106: aload_0
    //   107: aload_0
    //   108: getfield b : I
    //   111: aload_0
    //   112: aload_1
    //   113: aload_2
    //   114: invokespecial c : (Ljava/lang/Object;Ljava/lang/Object;)I
    //   117: iadd
    //   118: putfield b : I
    //   121: aload_0
    //   122: monitorexit
    //   123: aload_3
    //   124: ifnull -> 137
    //   127: aload_0
    //   128: iconst_0
    //   129: aload_1
    //   130: aload_2
    //   131: aload_3
    //   132: invokevirtual a : (ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   135: aload_3
    //   136: areturn
    //   137: aload_0
    //   138: aload_0
    //   139: getfield c : I
    //   142: invokevirtual a : (I)V
    //   145: aload_2
    //   146: areturn
    //   147: astore_1
    //   148: aload_0
    //   149: monitorexit
    //   150: aload_1
    //   151: athrow
    //   152: astore_1
    //   153: aload_0
    //   154: monitorexit
    //   155: aload_1
    //   156: athrow
    // Exception table:
    //   from	to	target	type
    //   16	25	152	finally
    //   29	41	152	finally
    //   43	55	152	finally
    //   69	89	147	finally
    //   93	103	147	finally
    //   106	121	147	finally
    //   121	123	147	finally
    //   148	150	147	finally
    //   153	155	152	finally }
  
  public final V a(K paramK, V paramV) { // Byte code:
    //   0: aload_1
    //   1: ifnull -> 96
    //   4: aload_2
    //   5: ifnonnull -> 11
    //   8: goto -> 96
    //   11: aload_0
    //   12: monitorenter
    //   13: aload_0
    //   14: aload_0
    //   15: getfield d : I
    //   18: iconst_1
    //   19: iadd
    //   20: putfield d : I
    //   23: aload_0
    //   24: aload_0
    //   25: getfield b : I
    //   28: aload_0
    //   29: aload_1
    //   30: aload_2
    //   31: invokespecial c : (Ljava/lang/Object;Ljava/lang/Object;)I
    //   34: iadd
    //   35: putfield b : I
    //   38: aload_0
    //   39: getfield a : Ljava/util/LinkedHashMap;
    //   42: aload_1
    //   43: aload_2
    //   44: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   47: astore_3
    //   48: aload_3
    //   49: ifnull -> 67
    //   52: aload_0
    //   53: aload_0
    //   54: getfield b : I
    //   57: aload_0
    //   58: aload_1
    //   59: aload_3
    //   60: invokespecial c : (Ljava/lang/Object;Ljava/lang/Object;)I
    //   63: isub
    //   64: putfield b : I
    //   67: aload_0
    //   68: monitorexit
    //   69: aload_3
    //   70: ifnull -> 81
    //   73: aload_0
    //   74: iconst_0
    //   75: aload_1
    //   76: aload_3
    //   77: aload_2
    //   78: invokevirtual a : (ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   81: aload_0
    //   82: aload_0
    //   83: getfield c : I
    //   86: invokevirtual a : (I)V
    //   89: aload_3
    //   90: areturn
    //   91: astore_1
    //   92: aload_0
    //   93: monitorexit
    //   94: aload_1
    //   95: athrow
    //   96: new java/lang/NullPointerException
    //   99: dup
    //   100: ldc 'key == null || value == null'
    //   102: invokespecial <init> : (Ljava/lang/String;)V
    //   105: athrow
    // Exception table:
    //   from	to	target	type
    //   13	48	91	finally
    //   52	67	91	finally
    //   67	69	91	finally
    //   92	94	91	finally }
  
  public void a(int paramInt) { // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : I
    //   6: iflt -> 135
    //   9: aload_0
    //   10: getfield a : Ljava/util/LinkedHashMap;
    //   13: invokevirtual isEmpty : ()Z
    //   16: ifeq -> 29
    //   19: aload_0
    //   20: getfield b : I
    //   23: ifeq -> 29
    //   26: goto -> 135
    //   29: aload_0
    //   30: getfield b : I
    //   33: iload_1
    //   34: if_icmple -> 132
    //   37: aload_0
    //   38: getfield a : Ljava/util/LinkedHashMap;
    //   41: invokevirtual isEmpty : ()Z
    //   44: ifeq -> 50
    //   47: goto -> 132
    //   50: aload_0
    //   51: getfield a : Ljava/util/LinkedHashMap;
    //   54: invokevirtual entrySet : ()Ljava/util/Set;
    //   57: invokeinterface iterator : ()Ljava/util/Iterator;
    //   62: invokeinterface next : ()Ljava/lang/Object;
    //   67: checkcast java/util/Map$Entry
    //   70: astore_2
    //   71: aload_2
    //   72: invokeinterface getKey : ()Ljava/lang/Object;
    //   77: astore_3
    //   78: aload_2
    //   79: invokeinterface getValue : ()Ljava/lang/Object;
    //   84: astore_2
    //   85: aload_0
    //   86: getfield a : Ljava/util/LinkedHashMap;
    //   89: aload_3
    //   90: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   93: pop
    //   94: aload_0
    //   95: aload_0
    //   96: getfield b : I
    //   99: aload_0
    //   100: aload_3
    //   101: aload_2
    //   102: invokespecial c : (Ljava/lang/Object;Ljava/lang/Object;)I
    //   105: isub
    //   106: putfield b : I
    //   109: aload_0
    //   110: aload_0
    //   111: getfield f : I
    //   114: iconst_1
    //   115: iadd
    //   116: putfield f : I
    //   119: aload_0
    //   120: monitorexit
    //   121: aload_0
    //   122: iconst_1
    //   123: aload_3
    //   124: aload_2
    //   125: aconst_null
    //   126: invokevirtual a : (ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   129: goto -> 0
    //   132: aload_0
    //   133: monitorexit
    //   134: return
    //   135: new java/lang/IllegalStateException
    //   138: astore_2
    //   139: new java/lang/StringBuilder
    //   142: astore_3
    //   143: aload_3
    //   144: invokespecial <init> : ()V
    //   147: aload_3
    //   148: aload_0
    //   149: invokevirtual getClass : ()Ljava/lang/Class;
    //   152: invokevirtual getName : ()Ljava/lang/String;
    //   155: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: pop
    //   159: aload_3
    //   160: ldc '.sizeOf() is reporting inconsistent results!'
    //   162: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: pop
    //   166: aload_2
    //   167: aload_3
    //   168: invokevirtual toString : ()Ljava/lang/String;
    //   171: invokespecial <init> : (Ljava/lang/String;)V
    //   174: aload_2
    //   175: athrow
    //   176: astore_3
    //   177: aload_0
    //   178: monitorexit
    //   179: aload_3
    //   180: athrow
    // Exception table:
    //   from	to	target	type
    //   2	26	176	finally
    //   29	47	176	finally
    //   50	121	176	finally
    //   132	134	176	finally
    //   135	176	176	finally
    //   177	179	176	finally }
  
  protected void a(boolean paramBoolean, K paramK, V paramV1, V paramV2) {}
  
  protected int b(K paramK, V paramV) { return 1; }
  
  protected V b(K paramK) { return null; }
  
  public final String toString() { // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : I
    //   6: aload_0
    //   7: getfield h : I
    //   10: iadd
    //   11: istore_1
    //   12: iload_1
    //   13: ifeq -> 29
    //   16: aload_0
    //   17: getfield g : I
    //   20: bipush #100
    //   22: imul
    //   23: iload_1
    //   24: idiv
    //   25: istore_1
    //   26: goto -> 31
    //   29: iconst_0
    //   30: istore_1
    //   31: ldc 'LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]'
    //   33: iconst_4
    //   34: anewarray java/lang/Object
    //   37: dup
    //   38: iconst_0
    //   39: aload_0
    //   40: getfield c : I
    //   43: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   46: aastore
    //   47: dup
    //   48: iconst_1
    //   49: aload_0
    //   50: getfield g : I
    //   53: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   56: aastore
    //   57: dup
    //   58: iconst_2
    //   59: aload_0
    //   60: getfield h : I
    //   63: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   66: aastore
    //   67: dup
    //   68: iconst_3
    //   69: iload_1
    //   70: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   73: aastore
    //   74: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   77: astore_2
    //   78: aload_0
    //   79: monitorexit
    //   80: aload_2
    //   81: areturn
    //   82: astore_2
    //   83: aload_0
    //   84: monitorexit
    //   85: aload_2
    //   86: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	82	finally
    //   16	26	82	finally
    //   31	78	82	finally }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/g/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */