package com.a.a.b;

import com.a.a.a.b;
import com.a.a.a.f;
import com.a.a.a.g;
import com.a.a.c.a;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

class h<K, V> extends AbstractMap<K, V> implements Serializable, ConcurrentMap<K, V> {
  static final u<Object, Object> p;
  
  static final Queue<? extends Object> q;
  
  private static final Logger u = Logger.getLogger(h.class.getName());
  
  final int a;
  
  final int b;
  
  final l<K, V>[] c;
  
  final int d;
  
  final b<Object> e;
  
  final b<Object> f;
  
  final n g;
  
  final n h;
  
  final int i;
  
  final long j;
  
  final long k;
  
  final Queue<g.d<K, V>> l;
  
  final g.c<K, V> m;
  
  final b n;
  
  final g o;
  
  Set<K> r;
  
  Collection<V> s;
  
  Set<Map.Entry<K, V>> t;
  
  static  {
    p = new u<Object, Object>() {
        public h.k<Object, Object> a() { return null; }
        
        public u<Object, Object> a(ReferenceQueue<Object> param1ReferenceQueue, @Nullable Object param1Object, h.k<Object, Object> param1k) { return this; }
        
        public void a(u<Object, Object> param1u) {}
        
        public boolean b() { return false; }
        
        public Object get() { return null; }
      };
    q = new AbstractQueue<Object>() {
        public Iterator<Object> iterator() { return f.a(); }
        
        public boolean offer(Object param1Object) { return true; }
        
        public Object peek() { return null; }
        
        public Object poll() { return null; }
        
        public int size() { return 0; }
      };
  }
  
  h(g paramg) {
    this.d = Math.min(paramg.d(), 65536);
    this.g = paramg.f();
    this.h = paramg.g();
    this.e = paramg.b();
    this.f = this.h.a();
    this.i = paramg.e;
    this.j = paramg.i();
    this.k = paramg.h();
    this.n = b.a(this.g, b(), a());
    this.o = paramg.j();
    this.m = paramg.a();
    if (this.m == d.a.a) {
      concurrentLinkedQueue = i();
    } else {
      concurrentLinkedQueue = new ConcurrentLinkedQueue();
    } 
    this.l = concurrentLinkedQueue;
    int i1 = Math.min(paramg.c(), 1073741824);
    int i2 = i1;
    if (a())
      i2 = Math.min(i1, this.i); 
    int i3 = 0;
    byte b1 = 0;
    i1 = 1;
    int i4 = 0;
    while (i1 < this.d && (!a() || i1 * 2 <= this.i)) {
      i4++;
      i1 <<= 1;
    } 
    this.b = 32 - i4;
    this.a = i1 - 1;
    this.c = c(i1);
    int i5 = i2 / i1;
    i4 = i5;
    if (i5 * i1 < i2)
      i4 = i5 + 1; 
    for (i2 = 1; i2 < i4; i2 <<= 1);
    i4 = i3;
    if (a()) {
      i4 = this.i / i1 + 1;
      i5 = this.i;
      while (b1 < this.c.length) {
        i3 = i4;
        if (b1 == i5 % i1)
          i3 = i4 - 1; 
        this.c[b1] = a(i2, i3);
        b1++;
        i4 = i3;
      } 
    } else {
      while (i4 < this.c.length) {
        this.c[i4] = a(i2, -1);
        i4++;
      } 
    } 
  }
  
  static int a(int paramInt) {
    paramInt += (paramInt << 15 ^ 0xFFFFCD7D);
    paramInt ^= paramInt >>> 10;
    paramInt += (paramInt << 3);
    paramInt ^= paramInt >>> 6;
    paramInt += (paramInt << 2) + (paramInt << 14);
    return paramInt ^ paramInt >>> 16;
  }
  
  static <K, V> void a(k<K, V> paramk1, k<K, V> paramk2) {
    paramk1.a(paramk2);
    paramk2.b(paramk1);
  }
  
  static <K, V> void b(k<K, V> paramk1, k<K, V> paramk2) {
    paramk1.c(paramk2);
    paramk2.d(paramk1);
  }
  
  static <K, V> void d(k<K, V> paramk) {
    k k1 = h();
    paramk.a(k1);
    paramk.b(k1);
  }
  
  static <K, V> void e(k<K, V> paramk) {
    k k1 = h();
    paramk.c(k1);
    paramk.d(k1);
  }
  
  static <K, V> u<K, V> g() { return p; }
  
  static <K, V> k<K, V> h() { return j.a; }
  
  static <E> Queue<E> i() { return q; }
  
  int a(Object paramObject) { return a(this.e.a(paramObject)); }
  
  l<K, V> a(int paramInt1, int paramInt2) { return new l(this, paramInt1, paramInt2); }
  
  void a(k<K, V> paramk) {
    int i1 = paramk.c();
    b(i1).a(paramk, i1);
  }
  
  void a(u<K, V> paramu) {
    k k1 = paramu.a();
    int i1 = k1.c();
    b(i1).a(k1.d(), i1, paramu);
  }
  
  boolean a() { return (this.i != -1); }
  
  boolean a(k<K, V> paramk, long paramLong) { return (paramLong - paramk.e() > 0L); }
  
  l<K, V> b(int paramInt) { return this.c[paramInt >>> this.b & this.a]; }
  
  V b(k<K, V> paramk) {
    if (paramk.d() == null)
      return null; 
    Object object = paramk.a().get();
    return (object == null) ? null : ((b() && c(paramk)) ? null : (V)object);
  }
  
  boolean b() { return (c() || d()); }
  
  boolean c() { return (this.k > 0L); }
  
  boolean c(k<K, V> paramk) { return a(paramk, this.o.a()); }
  
  final l<K, V>[] c(int paramInt) { return new l[paramInt]; }
  
  public void clear() {
    l[] arrayOfl = this.c;
    int i1 = arrayOfl.length;
    for (byte b1 = 0; b1 < i1; b1++)
      arrayOfl[b1].m(); 
  }
  
  public boolean containsKey(@Nullable Object paramObject) {
    if (paramObject == null)
      return false; 
    int i1 = a(paramObject);
    return b(i1).d(paramObject, i1);
  }
  
  public boolean containsValue(@Nullable Object paramObject) {
    if (paramObject == null)
      return false; 
    l[] arrayOfl = this.c;
    long l1 = -1L;
    byte b1 = 0;
    while (b1 < 3) {
      int i1 = arrayOfl.length;
      long l2 = 0L;
      byte b2 = 0;
      while (b2 < i1) {
        l l3 = arrayOfl[b2];
        int i2 = l3.b;
        AtomicReferenceArray atomicReferenceArray = l3.e;
        for (i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
          for (k k1 = (k)atomicReferenceArray.get(i2); k1 != null; k1 = k1.b()) {
            Object object = l3.e(k1);
            if (object != null && this.f.a(paramObject, object))
              return true; 
          } 
        } 
        long l4 = l3.c;
        b2++;
        l2 += l4;
      } 
      if (l2 == l1)
        break; 
      b1++;
      l1 = l2;
    } 
    return false;
  }
  
  boolean d() { return (this.j > 0L); }
  
  boolean e() { return (this.g != n.a); }
  
  public Set<Map.Entry<K, V>> entrySet() {
    Set set = this.t;
    if (set != null)
      return set; 
    set = new d(this);
    this.t = set;
    return set;
  }
  
  boolean f() { return (this.h != n.a); }
  
  public V get(@Nullable Object paramObject) {
    if (paramObject == null)
      return null; 
    int i1 = a(paramObject);
    return (V)b(i1).c(paramObject, i1);
  }
  
  public boolean isEmpty() {
    l[] arrayOfl = this.c;
    long l1 = 0L;
    byte b1 = 0;
    while (b1 < arrayOfl.length) {
      if ((arrayOfl[b1]).b != 0)
        return false; 
      long l2 = (arrayOfl[b1]).c;
      b1++;
      l1 += l2;
    } 
    if (l1 != 0L) {
      b1 = 0;
      while (b1 < arrayOfl.length) {
        if ((arrayOfl[b1]).b != 0)
          return false; 
        long l2 = (arrayOfl[b1]).c;
        b1++;
        l1 -= l2;
      } 
      if (l1 != 0L)
        return false; 
    } 
    return true;
  }
  
  void j() {
    while (true) {
      d1 = (g.d)this.l.poll();
      if (d1 != null)
        try {
          this.m.a(d1);
          continue;
        } catch (Exception d1) {
          u.log(Level.WARNING, "Exception thrown by removal listener", d1);
          continue;
        }  
      break;
    } 
  }
  
  public Set<K> keySet() {
    Set set = this.r;
    if (set != null)
      return set; 
    set = new i(this);
    this.r = set;
    return set;
  }
  
  public V put(K paramK, V paramV) {
    f.a(paramK);
    f.a(paramV);
    int i1 = a(paramK);
    return (V)b(i1).a(paramK, i1, paramV, false);
  }
  
  public void putAll(Map<? extends K, ? extends V> paramMap) {
    for (Map.Entry entry : paramMap.entrySet())
      put(entry.getKey(), entry.getValue()); 
  }
  
  public V putIfAbsent(K paramK, V paramV) {
    f.a(paramK);
    f.a(paramV);
    int i1 = a(paramK);
    return (V)b(i1).a(paramK, i1, paramV, true);
  }
  
  public V remove(@Nullable Object paramObject) {
    if (paramObject == null)
      return null; 
    int i1 = a(paramObject);
    return (V)b(i1).e(paramObject, i1);
  }
  
  public boolean remove(@Nullable Object paramObject1, @Nullable Object paramObject2) {
    if (paramObject1 == null || paramObject2 == null)
      return false; 
    int i1 = a(paramObject1);
    return b(i1).b(paramObject1, i1, paramObject2);
  }
  
  public V replace(K paramK, V paramV) {
    f.a(paramK);
    f.a(paramV);
    int i1 = a(paramK);
    return (V)b(i1).a(paramK, i1, paramV);
  }
  
  public boolean replace(K paramK, @Nullable V paramV1, V paramV2) {
    f.a(paramK);
    f.a(paramV2);
    if (paramV1 == null)
      return false; 
    int i1 = a(paramK);
    return b(i1).a(paramK, i1, paramV1, paramV2);
  }
  
  public int size() {
    l[] arrayOfl = this.c;
    long l1 = 0L;
    byte b1 = 0;
    while (b1 < arrayOfl.length) {
      long l2 = (arrayOfl[b1]).b;
      b1++;
      l1 += l2;
    } 
    return a.a(l1);
  }
  
  public Collection<V> values() {
    Collection collection = this.s;
    if (collection != null)
      return collection; 
    collection = new v(this);
    this.s = collection;
    return collection;
  }
  
  static abstract class a<K, V> extends Object implements k<K, V> {
    public h.u<K, V> a() { throw new UnsupportedOperationException(); }
    
    public void a(long param1Long) { throw new UnsupportedOperationException(); }
    
    public void a(h.k<K, V> param1k) { throw new UnsupportedOperationException(); }
    
    public void a(h.u<K, V> param1u) { throw new UnsupportedOperationException(); }
    
    public h.k<K, V> b() { throw new UnsupportedOperationException(); }
    
    public void b(h.k<K, V> param1k) { throw new UnsupportedOperationException(); }
    
    public int c() { throw new UnsupportedOperationException(); }
    
    public void c(h.k<K, V> param1k) { throw new UnsupportedOperationException(); }
    
    public K d() { throw new UnsupportedOperationException(); }
    
    public void d(h.k<K, V> param1k) { throw new UnsupportedOperationException(); }
    
    public long e() { throw new UnsupportedOperationException(); }
    
    public h.k<K, V> f() { throw new UnsupportedOperationException(); }
    
    public h.k<K, V> g() { throw new UnsupportedOperationException(); }
    
    public h.k<K, V> h() { throw new UnsupportedOperationException(); }
    
    public h.k<K, V> i() { throw new UnsupportedOperationException(); }
  }
  
  static final class aa<K, V> extends WeakReference<V> implements u<K, V> {
    final h.k<K, V> a;
    
    aa(ReferenceQueue<V> param1ReferenceQueue, V param1V, h.k<K, V> param1k) {
      super(param1V, param1ReferenceQueue);
      this.a = param1k;
    }
    
    public h.k<K, V> a() { return this.a; }
    
    public h.u<K, V> a(ReferenceQueue<V> param1ReferenceQueue, V param1V, h.k<K, V> param1k) { return new aa(param1ReferenceQueue, param1V, param1k); }
    
    public void a(h.u<K, V> param1u) { clear(); }
    
    public boolean b() { return false; }
  }
  
  final class ab extends a<K, V> {
    final K a;
    
    V b;
    
    ab(h this$0, K param1K, V param1V) {
      this.a = param1K;
      this.b = param1V;
    }
    
    public boolean equals(@Nullable Object param1Object) {
      boolean bool = param1Object instanceof Map.Entry;
      byte b1 = 0;
      int i = b1;
      if (bool) {
        param1Object = (Map.Entry)param1Object;
        i = b1;
        if (this.a.equals(param1Object.getKey())) {
          i = b1;
          if (this.b.equals(param1Object.getValue()))
            i = 1; 
        } 
      } 
      return i;
    }
    
    public K getKey() { return (K)this.a; }
    
    public V getValue() { return (V)this.b; }
    
    public int hashCode() { return this.a.hashCode() ^ this.b.hashCode(); }
    
    public V setValue(V param1V) {
      Object object = this.c.put(this.a, param1V);
      this.b = param1V;
      return (V)object;
    }
  }
  
  final abstract enum b {
    a, b, c, d, e, f, g, h;
    
    static final b[][] i;
    
    static  {
      // Byte code:
      //   0: new com/a/a/b/h$b$1
      //   3: dup
      //   4: ldc 'STRONG'
      //   6: iconst_0
      //   7: invokespecial <init> : (Ljava/lang/String;I)V
      //   10: putstatic com/a/a/b/h$b.a : Lcom/a/a/b/h$b;
      //   13: new com/a/a/b/h$b$2
      //   16: dup
      //   17: ldc 'STRONG_EXPIRABLE'
      //   19: iconst_1
      //   20: invokespecial <init> : (Ljava/lang/String;I)V
      //   23: putstatic com/a/a/b/h$b.b : Lcom/a/a/b/h$b;
      //   26: new com/a/a/b/h$b$3
      //   29: dup
      //   30: ldc 'STRONG_EVICTABLE'
      //   32: iconst_2
      //   33: invokespecial <init> : (Ljava/lang/String;I)V
      //   36: putstatic com/a/a/b/h$b.c : Lcom/a/a/b/h$b;
      //   39: new com/a/a/b/h$b$4
      //   42: dup
      //   43: ldc 'STRONG_EXPIRABLE_EVICTABLE'
      //   45: iconst_3
      //   46: invokespecial <init> : (Ljava/lang/String;I)V
      //   49: putstatic com/a/a/b/h$b.d : Lcom/a/a/b/h$b;
      //   52: new com/a/a/b/h$b$5
      //   55: dup
      //   56: ldc 'WEAK'
      //   58: iconst_4
      //   59: invokespecial <init> : (Ljava/lang/String;I)V
      //   62: putstatic com/a/a/b/h$b.e : Lcom/a/a/b/h$b;
      //   65: new com/a/a/b/h$b$6
      //   68: dup
      //   69: ldc 'WEAK_EXPIRABLE'
      //   71: iconst_5
      //   72: invokespecial <init> : (Ljava/lang/String;I)V
      //   75: putstatic com/a/a/b/h$b.f : Lcom/a/a/b/h$b;
      //   78: new com/a/a/b/h$b$7
      //   81: dup
      //   82: ldc 'WEAK_EVICTABLE'
      //   84: bipush #6
      //   86: invokespecial <init> : (Ljava/lang/String;I)V
      //   89: putstatic com/a/a/b/h$b.g : Lcom/a/a/b/h$b;
      //   92: new com/a/a/b/h$b$8
      //   95: dup
      //   96: ldc 'WEAK_EXPIRABLE_EVICTABLE'
      //   98: bipush #7
      //   100: invokespecial <init> : (Ljava/lang/String;I)V
      //   103: putstatic com/a/a/b/h$b.h : Lcom/a/a/b/h$b;
      //   106: bipush #8
      //   108: anewarray com/a/a/b/h$b
      //   111: dup
      //   112: iconst_0
      //   113: getstatic com/a/a/b/h$b.a : Lcom/a/a/b/h$b;
      //   116: aastore
      //   117: dup
      //   118: iconst_1
      //   119: getstatic com/a/a/b/h$b.b : Lcom/a/a/b/h$b;
      //   122: aastore
      //   123: dup
      //   124: iconst_2
      //   125: getstatic com/a/a/b/h$b.c : Lcom/a/a/b/h$b;
      //   128: aastore
      //   129: dup
      //   130: iconst_3
      //   131: getstatic com/a/a/b/h$b.d : Lcom/a/a/b/h$b;
      //   134: aastore
      //   135: dup
      //   136: iconst_4
      //   137: getstatic com/a/a/b/h$b.e : Lcom/a/a/b/h$b;
      //   140: aastore
      //   141: dup
      //   142: iconst_5
      //   143: getstatic com/a/a/b/h$b.f : Lcom/a/a/b/h$b;
      //   146: aastore
      //   147: dup
      //   148: bipush #6
      //   150: getstatic com/a/a/b/h$b.g : Lcom/a/a/b/h$b;
      //   153: aastore
      //   154: dup
      //   155: bipush #7
      //   157: getstatic com/a/a/b/h$b.h : Lcom/a/a/b/h$b;
      //   160: aastore
      //   161: putstatic com/a/a/b/h$b.j : [Lcom/a/a/b/h$b;
      //   164: getstatic com/a/a/b/h$b.a : Lcom/a/a/b/h$b;
      //   167: astore_0
      //   168: getstatic com/a/a/b/h$b.b : Lcom/a/a/b/h$b;
      //   171: astore_1
      //   172: getstatic com/a/a/b/h$b.c : Lcom/a/a/b/h$b;
      //   175: astore_2
      //   176: getstatic com/a/a/b/h$b.d : Lcom/a/a/b/h$b;
      //   179: astore_3
      //   180: iconst_4
      //   181: anewarray com/a/a/b/h$b
      //   184: dup
      //   185: iconst_0
      //   186: getstatic com/a/a/b/h$b.e : Lcom/a/a/b/h$b;
      //   189: aastore
      //   190: dup
      //   191: iconst_1
      //   192: getstatic com/a/a/b/h$b.f : Lcom/a/a/b/h$b;
      //   195: aastore
      //   196: dup
      //   197: iconst_2
      //   198: getstatic com/a/a/b/h$b.g : Lcom/a/a/b/h$b;
      //   201: aastore
      //   202: dup
      //   203: iconst_3
      //   204: getstatic com/a/a/b/h$b.h : Lcom/a/a/b/h$b;
      //   207: aastore
      //   208: astore #4
      //   210: iconst_3
      //   211: anewarray [Lcom/a/a/b/h$b;
      //   214: dup
      //   215: iconst_0
      //   216: iconst_4
      //   217: anewarray com/a/a/b/h$b
      //   220: dup
      //   221: iconst_0
      //   222: aload_0
      //   223: aastore
      //   224: dup
      //   225: iconst_1
      //   226: aload_1
      //   227: aastore
      //   228: dup
      //   229: iconst_2
      //   230: aload_2
      //   231: aastore
      //   232: dup
      //   233: iconst_3
      //   234: aload_3
      //   235: aastore
      //   236: aastore
      //   237: dup
      //   238: iconst_1
      //   239: iconst_0
      //   240: anewarray com/a/a/b/h$b
      //   243: aastore
      //   244: dup
      //   245: iconst_2
      //   246: aload #4
      //   248: aastore
      //   249: putstatic com/a/a/b/h$b.i : [[Lcom/a/a/b/h$b;
      //   252: return
    }
    
    static b a(h.n param1n, boolean param1Boolean1, boolean param1Boolean2) {
      boolean bool;
      if (param1Boolean2) {
        bool = true;
      } else {
        bool = false;
      } 
      return i[param1n.ordinal()][param1Boolean1 | bool];
    }
    
    <K, V> h.k<K, V> a(h.l<K, V> param1l, h.k<K, V> param1k1, h.k<K, V> param1k2) { return a(param1l, param1k1.d(), param1k1.c(), param1k2); }
    
    abstract <K, V> h.k<K, V> a(h.l<K, V> param1l, K param1K, int param1Int, @Nullable h.k<K, V> param1k);
    
    <K, V> void a(h.k<K, V> param1k1, h.k<K, V> param1k2) {
      param1k2.a(param1k1.e());
      h.a(param1k1.g(), param1k2);
      h.a(param1k2, param1k1.f());
      h.d(param1k1);
    }
    
    <K, V> void b(h.k<K, V> param1k1, h.k<K, V> param1k2) {
      h.b(param1k1.i(), param1k2);
      h.b(param1k2, param1k1.h());
      h.e(param1k1);
    }
  }
  
  enum null {
    <K, V> h.k<K, V> a(h.l<K, V> param1l, K param1K, int param1Int, @Nullable h.k<K, V> param1k) { return new h.o(param1K, param1Int, param1k); }
  }
  
  enum null {
    <K, V> h.k<K, V> a(h.l<K, V> param1l, h.k<K, V> param1k1, h.k<K, V> param1k2) {
      h.k k1 = super.a(param1l, param1k1, param1k2);
      a(param1k1, k1);
      return k1;
    }
    
    <K, V> h.k<K, V> a(h.l<K, V> param1l, K param1K, int param1Int, @Nullable h.k<K, V> param1k) { return new h.q(param1K, param1Int, param1k); }
  }
  
  enum null {
    <K, V> h.k<K, V> a(h.l<K, V> param1l, h.k<K, V> param1k1, h.k<K, V> param1k2) {
      h.k k1 = super.a(param1l, param1k1, param1k2);
      b(param1k1, k1);
      return k1;
    }
    
    <K, V> h.k<K, V> a(h.l<K, V> param1l, K param1K, int param1Int, @Nullable h.k<K, V> param1k) { return new h.p(param1K, param1Int, param1k); }
  }
  
  enum null {
    <K, V> h.k<K, V> a(h.l<K, V> param1l, h.k<K, V> param1k1, h.k<K, V> param1k2) {
      h.k k1 = super.a(param1l, param1k1, param1k2);
      a(param1k1, k1);
      b(param1k1, k1);
      return k1;
    }
    
    <K, V> h.k<K, V> a(h.l<K, V> param1l, K param1K, int param1Int, @Nullable h.k<K, V> param1k) { return new h.r(param1K, param1Int, param1k); }
  }
  
  enum null {
    <K, V> h.k<K, V> a(h.l<K, V> param1l, K param1K, int param1Int, @Nullable h.k<K, V> param1k) { return new h.w(param1l.g, param1K, param1Int, param1k); }
  }
  
  enum null {
    <K, V> h.k<K, V> a(h.l<K, V> param1l, h.k<K, V> param1k1, h.k<K, V> param1k2) {
      h.k k1 = super.a(param1l, param1k1, param1k2);
      a(param1k1, k1);
      return k1;
    }
    
    <K, V> h.k<K, V> a(h.l<K, V> param1l, K param1K, int param1Int, @Nullable h.k<K, V> param1k) { return new h.y(param1l.g, param1K, param1Int, param1k); }
  }
  
  enum null {
    <K, V> h.k<K, V> a(h.l<K, V> param1l, h.k<K, V> param1k1, h.k<K, V> param1k2) {
      h.k k1 = super.a(param1l, param1k1, param1k2);
      b(param1k1, k1);
      return k1;
    }
    
    <K, V> h.k<K, V> a(h.l<K, V> param1l, K param1K, int param1Int, @Nullable h.k<K, V> param1k) { return new h.x(param1l.g, param1K, param1Int, param1k); }
  }
  
  enum null {
    <K, V> h.k<K, V> a(h.l<K, V> param1l, h.k<K, V> param1k1, h.k<K, V> param1k2) {
      h.k k1 = super.a(param1l, param1k1, param1k2);
      a(param1k1, k1);
      b(param1k1, k1);
      return k1;
    }
    
    <K, V> h.k<K, V> a(h.l<K, V> param1l, K param1K, int param1Int, @Nullable h.k<K, V> param1k) { return new h.z(param1l.g, param1K, param1Int, param1k); }
  }
  
  final class c extends g<Map.Entry<K, V>> {
    c(h this$0) { super(this$0); }
    
    public Map.Entry<K, V> a() { return e(); }
  }
  
  final class d extends AbstractSet<Map.Entry<K, V>> {
    d(h this$0) {}
    
    public void clear() { this.a.clear(); }
    
    public boolean contains(Object param1Object) {
      boolean bool = param1Object instanceof Map.Entry;
      boolean bool1 = false;
      if (!bool)
        return false; 
      param1Object = (Map.Entry)param1Object;
      Object object = param1Object.getKey();
      if (object == null)
        return false; 
      object = this.a.get(object);
      bool = bool1;
      if (object != null) {
        bool = bool1;
        if (this.a.f.a(param1Object.getValue(), object))
          bool = true; 
      } 
      return bool;
    }
    
    public boolean isEmpty() { return this.a.isEmpty(); }
    
    public Iterator<Map.Entry<K, V>> iterator() { return new h.c(this.a); }
    
    public boolean remove(Object param1Object) {
      boolean bool = param1Object instanceof Map.Entry;
      boolean bool1 = false;
      if (!bool)
        return false; 
      param1Object = (Map.Entry)param1Object;
      Object object = param1Object.getKey();
      bool = bool1;
      if (object != null) {
        bool = bool1;
        if (this.a.remove(object, param1Object.getValue()))
          bool = true; 
      } 
      return bool;
    }
    
    public int size() { return this.a.size(); }
  }
  
  static final class e<K, V> extends AbstractQueue<k<K, V>> {
    final h.k<K, V> a = new h.a<K, V>(this) {
        h.k<K, V> a = this;
        
        h.k<K, V> b = this;
        
        public void c(h.k<K, V> param2k) { this.a = param2k; }
        
        public void d(h.k<K, V> param2k) { this.b = param2k; }
        
        public h.k<K, V> h() { return this.a; }
        
        public h.k<K, V> i() { return this.b; }
      };
    
    public h.k<K, V> a() {
      h.k k1 = this.a.h();
      h.k k2 = k1;
      if (k1 == this.a)
        k2 = null; 
      return k2;
    }
    
    public boolean a(h.k<K, V> param1k) {
      h.b(param1k.i(), param1k.h());
      h.b(this.a.i(), param1k);
      h.b(param1k, this.a);
      return true;
    }
    
    public h.k<K, V> b() {
      h.k k1 = this.a.h();
      if (k1 == this.a)
        return null; 
      remove(k1);
      return k1;
    }
    
    public void clear() {
      for (h.k k1 = this.a.h(); k1 != this.a; k1 = k2) {
        h.k k2 = k1.h();
        h.e(k1);
      } 
      this.a.c(this.a);
      this.a.d(this.a);
    }
    
    public boolean contains(Object param1Object) { return (((h.k)param1Object).h() != h.j.a); }
    
    public boolean isEmpty() { return (this.a.h() == this.a); }
    
    public Iterator<h.k<K, V>> iterator() { return new b<h.k<K, V>>(this, a()) {
          protected h.k<K, V> a(h.k<K, V> param2k) {
            h.k k1 = param2k.h();
            param2k = k1;
            if (k1 == this.a.a)
              param2k = null; 
            return param2k;
          }
        }; }
    
    public boolean remove(Object param1Object) {
      h.k k1 = (h.k)param1Object;
      param1Object = k1.i();
      h.k k2 = k1.h();
      h.b(param1Object, k2);
      h.e(k1);
      return (k2 != h.j.a);
    }
    
    public int size() {
      h.k k1 = this.a.h();
      byte b = 0;
      while (k1 != this.a) {
        b++;
        k1 = k1.h();
      } 
      return b;
    }
  }
  
  class null extends a<K, V> {
    h.k<K, V> a = this;
    
    h.k<K, V> b = this;
    
    null(h this$0) {}
    
    public void c(h.k<K, V> param1k) { this.a = param1k; }
    
    public void d(h.k<K, V> param1k) { this.b = param1k; }
    
    public h.k<K, V> h() { return this.a; }
    
    public h.k<K, V> i() { return this.b; }
  }
  
  class null extends b<k<K, V>> {
    null(h this$0, h.k param1k) { super(param1k); }
    
    protected h.k<K, V> a(h.k<K, V> param1k) {
      h.k k1 = param1k.h();
      param1k = k1;
      if (k1 == this.a.a)
        param1k = null; 
      return param1k;
    }
  }
  
  static final class f<K, V> extends AbstractQueue<k<K, V>> {
    final h.k<K, V> a = new h.a<K, V>(this) {
        h.k<K, V> a = this;
        
        h.k<K, V> b = this;
        
        public void a(long param2Long) {}
        
        public void a(h.k<K, V> param2k) { this.a = param2k; }
        
        public void b(h.k<K, V> param2k) { this.b = param2k; }
        
        public long e() { return Float.MAX_VALUE; }
        
        public h.k<K, V> f() { return this.a; }
        
        public h.k<K, V> g() { return this.b; }
      };
    
    public h.k<K, V> a() {
      h.k k1 = this.a.f();
      h.k k2 = k1;
      if (k1 == this.a)
        k2 = null; 
      return k2;
    }
    
    public boolean a(h.k<K, V> param1k) {
      h.a(param1k.g(), param1k.f());
      h.a(this.a.g(), param1k);
      h.a(param1k, this.a);
      return true;
    }
    
    public h.k<K, V> b() {
      h.k k1 = this.a.f();
      if (k1 == this.a)
        return null; 
      remove(k1);
      return k1;
    }
    
    public void clear() {
      for (h.k k1 = this.a.f(); k1 != this.a; k1 = k2) {
        h.k k2 = k1.f();
        h.d(k1);
      } 
      this.a.a(this.a);
      this.a.b(this.a);
    }
    
    public boolean contains(Object param1Object) { return (((h.k)param1Object).f() != h.j.a); }
    
    public boolean isEmpty() { return (this.a.f() == this.a); }
    
    public Iterator<h.k<K, V>> iterator() { return new b<h.k<K, V>>(this, a()) {
          protected h.k<K, V> a(h.k<K, V> param2k) {
            h.k k1 = param2k.f();
            param2k = k1;
            if (k1 == this.a.a)
              param2k = null; 
            return param2k;
          }
        }; }
    
    public boolean remove(Object param1Object) {
      h.k k1 = (h.k)param1Object;
      h.k k2 = k1.g();
      param1Object = k1.f();
      h.a(k2, param1Object);
      h.d(k1);
      return (param1Object != h.j.a);
    }
    
    public int size() {
      h.k k1 = this.a.f();
      byte b = 0;
      while (k1 != this.a) {
        b++;
        k1 = k1.f();
      } 
      return b;
    }
  }
  
  class null extends a<K, V> {
    h.k<K, V> a = this;
    
    h.k<K, V> b = this;
    
    null(h this$0) {}
    
    public void a(long param1Long) {}
    
    public void a(h.k<K, V> param1k) { this.a = param1k; }
    
    public void b(h.k<K, V> param1k) { this.b = param1k; }
    
    public long e() { return Float.MAX_VALUE; }
    
    public h.k<K, V> f() { return this.a; }
    
    public h.k<K, V> g() { return this.b; }
  }
  
  class null extends b<k<K, V>> {
    null(h this$0, h.k param1k) { super(param1k); }
    
    protected h.k<K, V> a(h.k<K, V> param1k) {
      h.k k1 = param1k.f();
      param1k = k1;
      if (k1 == this.a.a)
        param1k = null; 
      return param1k;
    }
  }
  
  abstract class g<E> extends Object implements Iterator<E> {
    int b;
    
    int c;
    
    h.l<K, V> d;
    
    AtomicReferenceArray<h.k<K, V>> e;
    
    h.k<K, V> f;
    
    h<K, V>.ab g;
    
    h<K, V>.ab h;
    
    g(h this$0) {
      this.b = this$0.c.length - 1;
      this.c = -1;
      b();
    }
    
    boolean a(h.k<K, V> param1k) {
      try {
        Object object2 = param1k.d();
        Object object1 = this.i.b(param1k);
        if (object1 != null) {
          h.ab ab1 = new h.ab();
          this(this.i, object2, object1);
          this.g = ab1;
          return true;
        } 
        return false;
      } finally {
        this.d.n();
      } 
    }
    
    final void b() {
      this.g = null;
      if (c())
        return; 
      if (d())
        return; 
      while (this.b >= 0) {
        h.l[] arrayOfl = this.i.c;
        int j = this.b;
        this.b = j - 1;
        this.d = arrayOfl[j];
        if (this.d.b != 0) {
          this.e = this.d.e;
          this.c = this.e.length() - 1;
          if (d())
            break; 
        } 
      } 
    }
    
    boolean c() {
      if (this.f != null)
        while (true) {
          this.f = this.f.b();
          if (this.f != null) {
            if (a(this.f))
              return true; 
            continue;
          } 
          break;
        }  
      return false;
    }
    
    boolean d() {
      while (this.c >= 0) {
        AtomicReferenceArray atomicReferenceArray = this.e;
        int j = this.c;
        this.c = j - 1;
        h.k k1 = (h.k)atomicReferenceArray.get(j);
        this.f = k1;
        if (k1 != null && (a(this.f) || c()))
          return true; 
      } 
      return false;
    }
    
    h<K, V>.ab e() {
      if (this.g == null)
        throw new NoSuchElementException(); 
      this.h = this.g;
      b();
      return this.h;
    }
    
    public boolean hasNext() { return (this.g != null); }
    
    public void remove() {
      boolean bool;
      if (this.h != null) {
        bool = true;
      } else {
        bool = false;
      } 
      c.a(bool);
      this.i.remove(this.h.getKey());
      this.h = null;
    }
  }
  
  final class h extends g<K> {
    h(h this$0) { super(this$0); }
    
    public K next() { return (K)e().getKey(); }
  }
  
  final class i extends AbstractSet<K> {
    i(h this$0) {}
    
    public void clear() { this.a.clear(); }
    
    public boolean contains(Object param1Object) { return this.a.containsKey(param1Object); }
    
    public boolean isEmpty() { return this.a.isEmpty(); }
    
    public Iterator<K> iterator() { return new h.h(this.a); }
    
    public boolean remove(Object param1Object) { return (this.a.remove(param1Object) != null); }
    
    public int size() { return this.a.size(); }
  }
  
  private enum j implements k<Object, Object> {
    a;
    
    public h.u<Object, Object> a() { return null; }
    
    public void a(long param1Long) {}
    
    public void a(h.k<Object, Object> param1k) {}
    
    public void a(h.u<Object, Object> param1u) {}
    
    public h.k<Object, Object> b() { return null; }
    
    public void b(h.k<Object, Object> param1k) {}
    
    public int c() { return 0; }
    
    public void c(h.k<Object, Object> param1k) {}
    
    public Object d() { return null; }
    
    public void d(h.k<Object, Object> param1k) {}
    
    public long e() { return 0L; }
    
    public h.k<Object, Object> f() { return this; }
    
    public h.k<Object, Object> g() { return this; }
    
    public h.k<Object, Object> h() { return this; }
    
    public h.k<Object, Object> i() { return this; }
  }
  
  static interface k<K, V> {
    h.u<K, V> a();
    
    void a(long param1Long);
    
    void a(k<K, V> param1k);
    
    void a(h.u<K, V> param1u);
    
    k<K, V> b();
    
    void b(k<K, V> param1k);
    
    int c();
    
    void c(k<K, V> param1k);
    
    K d();
    
    void d(k<K, V> param1k);
    
    long e();
    
    k<K, V> f();
    
    k<K, V> g();
    
    k<K, V> h();
    
    k<K, V> i();
  }
  
  static class l<K, V> extends ReentrantLock {
    final h<K, V> a;
    
    int c;
    
    int d;
    
    final int f;
    
    final ReferenceQueue<K> g;
    
    final ReferenceQueue<V> h;
    
    final Queue<h.k<K, V>> i;
    
    final AtomicInteger j = new AtomicInteger();
    
    @GuardedBy("Segment.this")
    final Queue<h.k<K, V>> k;
    
    @GuardedBy("Segment.this")
    final Queue<h.k<K, V>> l;
    
    l(h<K, V> param1h, int param1Int1, int param1Int2) {
      this.a = param1h;
      this.f = param1Int2;
      a(a(param1Int1));
      boolean bool = param1h.e();
      Object object = null;
      if (bool) {
        queue2 = new ReferenceQueue();
      } else {
        queue2 = null;
      } 
      this.g = queue2;
      Queue queue2 = object;
      if (param1h.f())
        queue2 = new ReferenceQueue(); 
      this.h = queue2;
      if (param1h.a() || param1h.d()) {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
      } else {
        queue2 = h.i();
      } 
      this.i = queue2;
      if (param1h.a()) {
        queue2 = new h.e();
      } else {
        queue2 = h.i();
      } 
      this.k = queue2;
      if (param1h.b()) {
        queue1 = new h.f();
      } else {
        queue1 = h.i();
      } 
      this.l = queue1;
    }
    
    @GuardedBy("Segment.this")
    h.k<K, V> a(h.k<K, V> param1k1, h.k<K, V> param1k2) {
      if (param1k1.d() == null)
        return null; 
      h.u u = param1k1.a();
      Object object = u.get();
      if (object == null && !u.b())
        return null; 
      param1k1 = this.a.n.a(this, param1k1, param1k2);
      param1k1.a(u.a(this.h, object, param1k1));
      return param1k1;
    }
    
    h.k<K, V> a(Object param1Object, int param1Int) {
      if (this.b != 0)
        for (h.k k1 = b(param1Int); k1 != null; k1 = k1.b()) {
          if (k1.c() == param1Int) {
            Object object = k1.d();
            if (object == null) {
              a();
            } else if (this.a.e.a(param1Object, object)) {
              return k1;
            } 
          } 
        }  
      return null;
    }
    
    @GuardedBy("Segment.this")
    h.k<K, V> a(K param1K, int param1Int, @Nullable h.k<K, V> param1k) { return this.a.n.a(this, param1K, param1Int, param1k); }
    
    V a(K param1K, int param1Int, V param1V) {
      lock();
      try {
        o();
        atomicReferenceArray = this.e;
        m = atomicReferenceArray.length() - 1 & param1Int;
      } finally {
        unlock();
        p();
      } 
    }
    
    V a(K param1K, int param1Int, V param1V, boolean param1Boolean) {
      lock();
      try {
        o();
        int m = this.b + 1;
        int n = m;
        if (m > this.d) {
          l();
          n = this.b + 1;
        } 
        h.u u = this.e;
        m = u.length() - 1 & param1Int;
        object = (h.k)u.get(m);
        for (h.k k1 = object; k1 != null; k1 = k1.b()) {
          Object object1 = k1.d();
          if (k1.c() == param1Int && object1 != null && this.a.e.a(param1K, object1)) {
            u = k1.a();
            object = u.get();
            if (object == null) {
              this.c++;
              a(k1, param1V);
              if (!u.b()) {
                a(param1K, param1Int, object, g.b.c);
                param1Int = this.b;
              } else {
                param1Int = n;
                if (k())
                  param1Int = this.b + 1; 
              } 
              this.b = param1Int;
              return null;
            } 
            if (param1Boolean) {
              b(k1);
              return (V)object;
            } 
            this.c++;
            a(param1K, param1Int, object, g.b.b);
            a(k1, param1V);
            return (V)object;
          } 
        } 
        this.c++;
        param1K = (K)a(param1K, param1Int, object);
        a(param1K, param1V);
        u.set(m, param1K);
        param1Int = n;
        if (k()) {
          param1Int = this.b;
          param1Int++;
        } 
        this.b = param1Int;
        return null;
      } finally {
        unlock();
        p();
      } 
    }
    
    AtomicReferenceArray<h.k<K, V>> a(int param1Int) { return new AtomicReferenceArray(param1Int); }
    
    void a() {
      if (tryLock())
        try {
          b();
          return;
        } finally {
          unlock();
        }  
    }
    
    void a(h.k<K, V> param1k) {
      if (this.a.d())
        a(param1k, this.a.j); 
      this.i.add(param1k);
    }
    
    void a(h.k<K, V> param1k, long param1Long) { param1k.a(this.a.o.a() + param1Long); }
    
    void a(h.k<K, V> param1k, g.b param1b) { a(param1k.d(), param1k.c(), param1k.a().get(), param1b); }
    
    @GuardedBy("Segment.this")
    void a(h.k<K, V> param1k, V param1V) {
      param1k.a(this.a.h.a(this, param1k, param1V));
      c(param1k);
    }
    
    void a(@Nullable K param1K, int param1Int, @Nullable V param1V, g.b param1b) { // Byte code:
      //   0: aload_0
      //   1: getfield a : Lcom/a/a/b/h;
      //   4: getfield l : Ljava/util/Queue;
      //   7: getstatic com/a/a/b/h.q : Ljava/util/Queue;
      //   10: if_acmpeq -> 39
      //   13: new com/a/a/b/g$d
      //   16: dup
      //   17: aload_1
      //   18: aload_3
      //   19: aload #4
      //   21: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Lcom/a/a/b/g$b;)V
      //   24: astore_1
      //   25: aload_0
      //   26: getfield a : Lcom/a/a/b/h;
      //   29: getfield l : Ljava/util/Queue;
      //   32: aload_1
      //   33: invokeinterface offer : (Ljava/lang/Object;)Z
      //   38: pop
      //   39: return }
    
    void a(AtomicReferenceArray<h.k<K, V>> param1AtomicReferenceArray) {
      this.d = param1AtomicReferenceArray.length() * 3 / 4;
      if (this.d == this.f)
        this.d++; 
      this.e = param1AtomicReferenceArray;
    }
    
    boolean a(h.k<K, V> param1k, int param1Int) {
      lock();
      try {
        int m = this.b;
        AtomicReferenceArray atomicReferenceArray = this.e;
        m = atomicReferenceArray.length() - 1 & param1Int;
        h.k k1 = (h.k)atomicReferenceArray.get(m);
        for (h.k k2 = k1; k2 != null; k2 = k2.b()) {
          if (k2 == param1k) {
            this.c++;
            a(k2.d(), param1Int, k2.a().get(), g.b.c);
            param1k = b(k1, k2);
            param1Int = this.b;
            atomicReferenceArray.set(m, param1k);
            this.b = param1Int - 1;
            return true;
          } 
        } 
        return false;
      } finally {
        unlock();
        p();
      } 
    }
    
    @GuardedBy("Segment.this")
    boolean a(h.k<K, V> param1k, int param1Int, g.b param1b) {
      int m = this.b;
      AtomicReferenceArray atomicReferenceArray = this.e;
      m = atomicReferenceArray.length() - 1 & param1Int;
      h.k k1 = (h.k)atomicReferenceArray.get(m);
      for (h.k k2 = k1; k2 != null; k2 = k2.b()) {
        if (k2 == param1k) {
          this.c++;
          a(k2.d(), param1Int, k2.a().get(), param1b);
          param1k = b(k1, k2);
          param1Int = this.b;
          atomicReferenceArray.set(m, param1k);
          this.b = param1Int - 1;
          return true;
        } 
      } 
      return false;
    }
    
    boolean a(h.u<K, V> param1u) {
      boolean bool1 = param1u.b();
      boolean bool2 = false;
      if (bool1)
        return false; 
      if (param1u.get() == null)
        bool2 = true; 
      return bool2;
    }
    
    boolean a(K param1K, int param1Int, h.u<K, V> param1u) {
      lock();
      try {
        int m = this.b;
        AtomicReferenceArray atomicReferenceArray = this.e;
        m = atomicReferenceArray.length() - 1 & param1Int;
        h.k k1 = (h.k)atomicReferenceArray.get(m);
        for (h.k k2 = k1; k2 != null; k2 = k2.b()) {
          Object object = k2.d();
          if (k2.c() == param1Int && object != null && this.a.e.a(param1K, object)) {
            if (k2.a() == param1u) {
              this.c++;
              a(param1K, param1Int, param1u.get(), g.b.c);
              param1K = (K)b(k1, k2);
              param1Int = this.b;
              atomicReferenceArray.set(m, param1K);
              this.b = param1Int - 1;
              return true;
            } 
            return false;
          } 
        } 
        return false;
      } finally {
        unlock();
        if (!isHeldByCurrentThread())
          p(); 
      } 
    }
    
    boolean a(K param1K, int param1Int, V param1V1, V param1V2) {
      lock();
      try {
        o();
        atomicReferenceArray = this.e;
        m = atomicReferenceArray.length() - 1 & param1Int;
      } finally {
        unlock();
        p();
      } 
    }
    
    h.k<K, V> b(int param1Int) {
      AtomicReferenceArray atomicReferenceArray = this.e;
      return (h.k)atomicReferenceArray.get(param1Int & atomicReferenceArray.length() - 1);
    }
    
    @GuardedBy("Segment.this")
    h.k<K, V> b(h.k<K, V> param1k1, h.k<K, V> param1k2) {
      this.k.remove(param1k2);
      this.l.remove(param1k2);
      int m = this.b;
      h.k k1 = param1k2.b();
      while (param1k1 != param1k2) {
        h.k k2 = a(param1k1, k1);
        if (k2 != null) {
          k1 = k2;
        } else {
          d(param1k1);
          m--;
        } 
        param1k1 = param1k1.b();
      } 
      this.b = m;
      return k1;
    }
    
    h.k<K, V> b(Object param1Object, int param1Int) {
      param1Object = a(param1Object, param1Int);
      if (param1Object == null)
        return null; 
      if (this.a.b() && this.a.c(param1Object)) {
        i();
        return null;
      } 
      return param1Object;
    }
    
    @GuardedBy("Segment.this")
    void b() {
      if (this.a.e())
        c(); 
      if (this.a.f())
        d(); 
    }
    
    @GuardedBy("Segment.this")
    void b(h.k<K, V> param1k) {
      this.k.add(param1k);
      if (this.a.d()) {
        a(param1k, this.a.j);
        this.l.add(param1k);
      } 
    }
    
    boolean b(Object param1Object1, int param1Int, Object param1Object2) {
      lock();
      try {
        o();
        m = this.b;
        atomicReferenceArray = this.e;
        m = atomicReferenceArray.length();
        bool = true;
        m = m - 1 & param1Int;
      } finally {
        unlock();
        p();
      } 
    }
    
    V c(Object param1Object, int param1Int) {
      try {
        h.k k1 = b(param1Object, param1Int);
        if (k1 == null)
          return null; 
        param1Object = k1.a().get();
        if (param1Object != null) {
          a(k1);
        } else {
          a();
        } 
        return (V)param1Object;
      } finally {
        n();
      } 
    }
    
    @GuardedBy("Segment.this")
    void c() {
      byte b1 = 0;
      while (true) {
        Reference reference = this.g.poll();
        if (reference != null) {
          h.k k1 = (h.k)reference;
          this.a.a(k1);
          byte b2 = b1 + true;
          b1 = b2;
          if (b2 == 16)
            break; 
          continue;
        } 
        break;
      } 
    }
    
    @GuardedBy("Segment.this")
    void c(h.k<K, V> param1k) {
      h();
      this.k.add(param1k);
      if (this.a.b()) {
        long l1;
        if (this.a.d()) {
          l1 = this.a.j;
        } else {
          l1 = this.a.k;
        } 
        a(param1k, l1);
        this.l.add(param1k);
      } 
    }
    
    @GuardedBy("Segment.this")
    void d() {
      byte b1 = 0;
      while (true) {
        Reference reference = this.h.poll();
        if (reference != null) {
          h.u u = (h.u)reference;
          this.a.a(u);
          byte b2 = b1 + true;
          b1 = b2;
          if (b2 == 16)
            break; 
          continue;
        } 
        break;
      } 
    }
    
    void d(h.k<K, V> param1k) {
      a(param1k, g.b.c);
      this.k.remove(param1k);
      this.l.remove(param1k);
    }
    
    boolean d(Object param1Object, int param1Int) {
      try {
        int m = this.b;
        bool = false;
        if (m != 0) {
          param1Object = b(param1Object, param1Int);
          if (param1Object == null)
            return false; 
          param1Object = param1Object.a().get();
          if (param1Object != null)
            bool = true; 
          return bool;
        } 
        return false;
      } finally {
        n();
      } 
    }
    
    V e(h.k<K, V> param1k) {
      if (param1k.d() == null) {
        a();
        return null;
      } 
      Object object = param1k.a().get();
      if (object == null) {
        a();
        return null;
      } 
      if (this.a.b() && this.a.c(param1k)) {
        i();
        return null;
      } 
      return (V)object;
    }
    
    V e(Object param1Object, int param1Int) {
      lock();
      try {
        o();
        m = this.b;
        atomicReferenceArray = this.e;
        m = atomicReferenceArray.length() - 1 & param1Int;
      } finally {
        unlock();
        p();
      } 
    }
    
    void e() {
      if (this.a.e())
        f(); 
      if (this.a.f())
        g(); 
    }
    
    void f() {
      while (this.g.poll() != null);
    }
    
    void g() {
      while (this.h.poll() != null);
    }
    
    @GuardedBy("Segment.this")
    void h() {
      while (true) {
        h.k k1 = (h.k)this.i.poll();
        if (k1 != null) {
          if (this.k.contains(k1))
            this.k.add(k1); 
          if (this.a.d() && this.l.contains(k1))
            this.l.add(k1); 
          continue;
        } 
        break;
      } 
    }
    
    void i() {
      if (tryLock())
        try {
          j();
          return;
        } finally {
          unlock();
        }  
    }
    
    @GuardedBy("Segment.this")
    void j() {
      h();
      if (this.l.isEmpty())
        return; 
      long l1 = this.a.o.a();
      while (true) {
        h.k k1 = (h.k)this.l.peek();
        if (k1 != null && this.a.a(k1, l1)) {
          if (!a(k1, k1.c(), g.b.d))
            throw new AssertionError(); 
          continue;
        } 
        break;
      } 
    }
    
    @GuardedBy("Segment.this")
    boolean k() {
      if (this.a.a() && this.b >= this.f) {
        h();
        h.k k1 = (h.k)this.k.remove();
        if (!a(k1, k1.c(), g.b.e))
          throw new AssertionError(); 
        return true;
      } 
      return false;
    }
    
    @GuardedBy("Segment.this")
    void l() {
      AtomicReferenceArray atomicReferenceArray1 = this.e;
      int m = atomicReferenceArray1.length();
      if (m >= 1073741824)
        return; 
      int n = this.b;
      AtomicReferenceArray atomicReferenceArray2 = a(m << 1);
      this.d = atomicReferenceArray2.length() * 3 / 4;
      int i1 = atomicReferenceArray2.length() - 1;
      byte b1 = 0;
      while (b1 < m) {
        h.k k1 = (h.k)atomicReferenceArray1.get(b1);
        int i2 = n;
        if (k1 != null) {
          h.k k2 = k1.b();
          i2 = k1.c() & i1;
          if (k2 == null) {
            atomicReferenceArray2.set(i2, k1);
            i2 = n;
          } else {
            h.k k3 = k1;
            while (k2 != null) {
              int i3 = k2.c() & i1;
              int i4 = i2;
              if (i3 != i2) {
                k3 = k2;
                i4 = i3;
              } 
              k2 = k2.b();
              i2 = i4;
            } 
            atomicReferenceArray2.set(i2, k3);
            while (true) {
              i2 = n;
              if (k1 != k3) {
                i2 = k1.c() & i1;
                k2 = a(k1, (h.k)atomicReferenceArray2.get(i2));
                if (k2 != null) {
                  atomicReferenceArray2.set(i2, k2);
                } else {
                  d(k1);
                  n--;
                } 
                k1 = k1.b();
                continue;
              } 
              break;
            } 
          } 
        } 
        b1++;
        n = i2;
      } 
      this.e = atomicReferenceArray2;
      this.b = n;
    }
    
    void m() {
      if (this.b != 0) {
        lock();
        try {
          AtomicReferenceArray atomicReferenceArray = this.e;
          if (this.a.l != h.q)
            for (byte b2 = 0; b2 < atomicReferenceArray.length(); b2++) {
              for (h.k k1 = (h.k)atomicReferenceArray.get(b2); k1 != null; k1 = k1.b()) {
                if (!k1.a().b())
                  a(k1, g.b.a); 
              } 
            }  
          for (byte b1 = 0; b1 < atomicReferenceArray.length(); b1++)
            atomicReferenceArray.set(b1, null); 
          e();
          this.k.clear();
          this.l.clear();
          this.j.set(0);
          this.c++;
          this.b = 0;
          return;
        } finally {
          unlock();
          p();
        } 
      } 
    }
    
    void n() {
      if ((this.j.incrementAndGet() & 0x3F) == 0)
        q(); 
    }
    
    @GuardedBy("Segment.this")
    void o() { r(); }
    
    void p() { s(); }
    
    void q() {
      r();
      s();
    }
    
    void r() {
      if (tryLock())
        try {
          b();
          j();
          this.j.set(0);
          return;
        } finally {
          unlock();
        }  
    }
    
    void s() {
      if (!isHeldByCurrentThread())
        this.a.j(); 
    }
  }
  
  static final class m<K, V> extends SoftReference<V> implements u<K, V> {
    final h.k<K, V> a;
    
    m(ReferenceQueue<V> param1ReferenceQueue, V param1V, h.k<K, V> param1k) {
      super(param1V, param1ReferenceQueue);
      this.a = param1k;
    }
    
    public h.k<K, V> a() { return this.a; }
    
    public h.u<K, V> a(ReferenceQueue<V> param1ReferenceQueue, V param1V, h.k<K, V> param1k) { return new m(param1ReferenceQueue, param1V, param1k); }
    
    public void a(h.u<K, V> param1u) { clear(); }
    
    public boolean b() { return false; }
  }
  
  final abstract enum n {
    a, b, c;
    
    static  {
      // Byte code:
      //   0: new com/a/a/b/h$n$1
      //   3: dup
      //   4: ldc 'STRONG'
      //   6: iconst_0
      //   7: invokespecial <init> : (Ljava/lang/String;I)V
      //   10: putstatic com/a/a/b/h$n.a : Lcom/a/a/b/h$n;
      //   13: new com/a/a/b/h$n$2
      //   16: dup
      //   17: ldc 'SOFT'
      //   19: iconst_1
      //   20: invokespecial <init> : (Ljava/lang/String;I)V
      //   23: putstatic com/a/a/b/h$n.b : Lcom/a/a/b/h$n;
      //   26: new com/a/a/b/h$n$3
      //   29: dup
      //   30: ldc 'WEAK'
      //   32: iconst_2
      //   33: invokespecial <init> : (Ljava/lang/String;I)V
      //   36: putstatic com/a/a/b/h$n.c : Lcom/a/a/b/h$n;
      //   39: iconst_3
      //   40: anewarray com/a/a/b/h$n
      //   43: dup
      //   44: iconst_0
      //   45: getstatic com/a/a/b/h$n.a : Lcom/a/a/b/h$n;
      //   48: aastore
      //   49: dup
      //   50: iconst_1
      //   51: getstatic com/a/a/b/h$n.b : Lcom/a/a/b/h$n;
      //   54: aastore
      //   55: dup
      //   56: iconst_2
      //   57: getstatic com/a/a/b/h$n.c : Lcom/a/a/b/h$n;
      //   60: aastore
      //   61: putstatic com/a/a/b/h$n.d : [Lcom/a/a/b/h$n;
      //   64: return
    }
    
    abstract b<Object> a();
    
    abstract <K, V> h.u<K, V> a(h.l<K, V> param1l, h.k<K, V> param1k, V param1V);
  }
  
  enum null {
    b<Object> a() { return b.a(); }
    
    <K, V> h.u<K, V> a(h.l<K, V> param1l, h.k<K, V> param1k, V param1V) { return new h.s(param1V); }
  }
  
  enum null {
    b<Object> a() { return b.b(); }
    
    <K, V> h.u<K, V> a(h.l<K, V> param1l, h.k<K, V> param1k, V param1V) { return new h.m(param1l.h, param1V, param1k); }
  }
  
  enum null {
    b<Object> a() { return b.b(); }
    
    <K, V> h.u<K, V> a(h.l<K, V> param1l, h.k<K, V> param1k, V param1V) { return new h.aa(param1l.h, param1V, param1k); }
  }
  
  static class o<K, V> extends Object implements k<K, V> {
    final K a;
    
    final int b;
    
    final h.k<K, V> c;
    
    o(K param1K, int param1Int, @Nullable h.k<K, V> param1k) {
      this.a = param1K;
      this.b = param1Int;
      this.c = param1k;
    }
    
    public h.u<K, V> a() { return this.d; }
    
    public void a(long param1Long) { throw new UnsupportedOperationException(); }
    
    public void a(h.k<K, V> param1k) { throw new UnsupportedOperationException(); }
    
    public void a(h.u<K, V> param1u) {
      h.u u1 = this.d;
      this.d = param1u;
      u1.a(param1u);
    }
    
    public h.k<K, V> b() { return this.c; }
    
    public void b(h.k<K, V> param1k) { throw new UnsupportedOperationException(); }
    
    public int c() { return this.b; }
    
    public void c(h.k<K, V> param1k) { throw new UnsupportedOperationException(); }
    
    public K d() { return (K)this.a; }
    
    public void d(h.k<K, V> param1k) { throw new UnsupportedOperationException(); }
    
    public long e() { throw new UnsupportedOperationException(); }
    
    public h.k<K, V> f() { throw new UnsupportedOperationException(); }
    
    public h.k<K, V> g() { throw new UnsupportedOperationException(); }
    
    public h.k<K, V> h() { throw new UnsupportedOperationException(); }
    
    public h.k<K, V> i() { throw new UnsupportedOperationException(); }
  }
  
  static final class p<K, V> extends o<K, V> implements k<K, V> {
    h.k<K, V> e = h.h();
    
    h.k<K, V> f = h.h();
    
    p(K param1K, int param1Int, @Nullable h.k<K, V> param1k) { super(param1K, param1Int, param1k); }
    
    public void c(h.k<K, V> param1k) { this.e = param1k; }
    
    public void d(h.k<K, V> param1k) { this.f = param1k; }
    
    public h.k<K, V> h() { return this.e; }
    
    public h.k<K, V> i() { return this.f; }
  }
  
  static final class q<K, V> extends o<K, V> implements k<K, V> {
    h.k<K, V> f = h.h();
    
    h.k<K, V> g = h.h();
    
    q(K param1K, int param1Int, @Nullable h.k<K, V> param1k) { super(param1K, param1Int, param1k); }
    
    public void a(long param1Long) { this.e = param1Long; }
    
    public void a(h.k<K, V> param1k) { this.f = param1k; }
    
    public void b(h.k<K, V> param1k) { this.g = param1k; }
    
    public long e() { return this.e; }
    
    public h.k<K, V> f() { return this.f; }
    
    public h.k<K, V> g() { return this.g; }
  }
  
  static final class r<K, V> extends o<K, V> implements k<K, V> {
    h.k<K, V> f = h.h();
    
    h.k<K, V> g = h.h();
    
    h.k<K, V> h = h.h();
    
    h.k<K, V> i = h.h();
    
    r(K param1K, int param1Int, @Nullable h.k<K, V> param1k) { super(param1K, param1Int, param1k); }
    
    public void a(long param1Long) { this.e = param1Long; }
    
    public void a(h.k<K, V> param1k) { this.f = param1k; }
    
    public void b(h.k<K, V> param1k) { this.g = param1k; }
    
    public void c(h.k<K, V> param1k) { this.h = param1k; }
    
    public void d(h.k<K, V> param1k) { this.i = param1k; }
    
    public long e() { return this.e; }
    
    public h.k<K, V> f() { return this.f; }
    
    public h.k<K, V> g() { return this.g; }
    
    public h.k<K, V> h() { return this.h; }
    
    public h.k<K, V> i() { return this.i; }
  }
  
  static final class s<K, V> extends Object implements u<K, V> {
    final V a;
    
    s(V param1V) { this.a = param1V; }
    
    public h.k<K, V> a() { return null; }
    
    public h.u<K, V> a(ReferenceQueue<V> param1ReferenceQueue, V param1V, h.k<K, V> param1k) { return this; }
    
    public void a(h.u<K, V> param1u) {}
    
    public boolean b() { return false; }
    
    public V get() { return (V)this.a; }
  }
  
  final class t extends g<V> {
    t(h this$0) { super(this$0); }
    
    public V next() { return (V)e().getValue(); }
  }
  
  static interface u<K, V> {
    h.k<K, V> a();
    
    u<K, V> a(ReferenceQueue<V> param1ReferenceQueue, @Nullable V param1V, h.k<K, V> param1k);
    
    void a(@Nullable u<K, V> param1u);
    
    boolean b();
    
    V get();
  }
  
  final class v extends AbstractCollection<V> {
    v(h this$0) {}
    
    public void clear() { this.a.clear(); }
    
    public boolean contains(Object param1Object) { return this.a.containsValue(param1Object); }
    
    public boolean isEmpty() { return this.a.isEmpty(); }
    
    public Iterator<V> iterator() { return new h.t(this.a); }
    
    public int size() { return this.a.size(); }
  }
  
  static class w<K, V> extends WeakReference<K> implements k<K, V> {
    final int a;
    
    final h.k<K, V> b;
    
    w(ReferenceQueue<K> param1ReferenceQueue, K param1K, int param1Int, @Nullable h.k<K, V> param1k) {
      super(param1K, param1ReferenceQueue);
      this.a = param1Int;
      this.b = param1k;
    }
    
    public h.u<K, V> a() { return this.c; }
    
    public void a(long param1Long) { throw new UnsupportedOperationException(); }
    
    public void a(h.k<K, V> param1k) { throw new UnsupportedOperationException(); }
    
    public void a(h.u<K, V> param1u) {
      h.u u1 = this.c;
      this.c = param1u;
      u1.a(param1u);
    }
    
    public h.k<K, V> b() { return this.b; }
    
    public void b(h.k<K, V> param1k) { throw new UnsupportedOperationException(); }
    
    public int c() { return this.a; }
    
    public void c(h.k<K, V> param1k) { throw new UnsupportedOperationException(); }
    
    public K d() { return (K)get(); }
    
    public void d(h.k<K, V> param1k) { throw new UnsupportedOperationException(); }
    
    public long e() { throw new UnsupportedOperationException(); }
    
    public h.k<K, V> f() { throw new UnsupportedOperationException(); }
    
    public h.k<K, V> g() { throw new UnsupportedOperationException(); }
    
    public h.k<K, V> h() { throw new UnsupportedOperationException(); }
    
    public h.k<K, V> i() { throw new UnsupportedOperationException(); }
  }
  
  static final class x<K, V> extends w<K, V> implements k<K, V> {
    h.k<K, V> d = h.h();
    
    h.k<K, V> e = h.h();
    
    x(ReferenceQueue<K> param1ReferenceQueue, K param1K, int param1Int, @Nullable h.k<K, V> param1k) { super(param1ReferenceQueue, param1K, param1Int, param1k); }
    
    public void c(h.k<K, V> param1k) { this.d = param1k; }
    
    public void d(h.k<K, V> param1k) { this.e = param1k; }
    
    public h.k<K, V> h() { return this.d; }
    
    public h.k<K, V> i() { return this.e; }
  }
  
  static final class y<K, V> extends w<K, V> implements k<K, V> {
    h.k<K, V> e = h.h();
    
    h.k<K, V> f = h.h();
    
    y(ReferenceQueue<K> param1ReferenceQueue, K param1K, int param1Int, @Nullable h.k<K, V> param1k) { super(param1ReferenceQueue, param1K, param1Int, param1k); }
    
    public void a(long param1Long) { this.d = param1Long; }
    
    public void a(h.k<K, V> param1k) { this.e = param1k; }
    
    public void b(h.k<K, V> param1k) { this.f = param1k; }
    
    public long e() { return this.d; }
    
    public h.k<K, V> f() { return this.e; }
    
    public h.k<K, V> g() { return this.f; }
  }
  
  static final class z<K, V> extends w<K, V> implements k<K, V> {
    h.k<K, V> e = h.h();
    
    h.k<K, V> f = h.h();
    
    h.k<K, V> g = h.h();
    
    h.k<K, V> h = h.h();
    
    z(ReferenceQueue<K> param1ReferenceQueue, K param1K, int param1Int, @Nullable h.k<K, V> param1k) { super(param1ReferenceQueue, param1K, param1Int, param1k); }
    
    public void a(long param1Long) { this.d = param1Long; }
    
    public void a(h.k<K, V> param1k) { this.e = param1k; }
    
    public void b(h.k<K, V> param1k) { this.f = param1k; }
    
    public void c(h.k<K, V> param1k) { this.g = param1k; }
    
    public void d(h.k<K, V> param1k) { this.h = param1k; }
    
    public long e() { return this.d; }
    
    public h.k<K, V> f() { return this.e; }
    
    public h.k<K, V> g() { return this.f; }
    
    public h.k<K, V> h() { return this.g; }
    
    public h.k<K, V> i() { return this.h; }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/com/a/a/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */