package com.a.a.b;

import com.a.a.a.a;
import com.a.a.a.b;
import com.a.a.a.c;
import com.a.a.a.f;
import com.a.a.a.g;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.Nullable;

public final class g extends d<Object, Object> {
  boolean b;
  
  int c = -1;
  
  int d = -1;
  
  int e = -1;
  
  h.n f;
  
  h.n g;
  
  long h = -1L;
  
  long i = -1L;
  
  b j;
  
  b<Object> k;
  
  g l;
  
  g a(h.n paramn) {
    h.n n1 = this.f;
    boolean bool = false;
    if (n1 == null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    f.a(bool1, "Key strength was already set to %s", new Object[] { this.f });
    this.f = (h.n)f.a(paramn);
    boolean bool1 = bool;
    if (this.f != h.n.b)
      bool1 = true; 
    f.a(bool1, "Soft keys are not supported");
    if (paramn != h.n.a)
      this.b = true; 
    return this;
  }
  
  b<Object> b() { return (b)c.a(this.k, f().a()); }
  
  int c() { return (this.c == -1) ? 16 : this.c; }
  
  int d() { return (this.d == -1) ? 4 : this.d; }
  
  public g e() { return a(h.n.c); }
  
  h.n f() { return (h.n)c.a(this.f, h.n.a); }
  
  h.n g() { return (h.n)c.a(this.g, h.n.a); }
  
  long h() { return (this.h == -1L) ? 0L : this.h; }
  
  long i() { return (this.i == -1L) ? 0L : this.i; }
  
  g j() { return (g)c.a(this.l, g.b()); }
  
  public <K, V> ConcurrentMap<K, V> k() {
    a a;
    if (!this.b)
      return new ConcurrentHashMap(c(), 0.75F, d()); 
    if (this.j == null) {
      a = new h(this);
    } else {
      a = new a(this);
    } 
    return (ConcurrentMap)a;
  }
  
  public String toString() {
    c.a a = c.a(this);
    if (this.c != -1)
      a.a("initialCapacity", this.c); 
    if (this.d != -1)
      a.a("concurrencyLevel", this.d); 
    if (this.e != -1)
      a.a("maximumSize", this.e); 
    if (this.h != -1L) {
      long l1 = this.h;
      StringBuilder stringBuilder = new StringBuilder(22);
      stringBuilder.append(l1);
      stringBuilder.append("ns");
      a.a("expireAfterWrite", stringBuilder.toString());
    } 
    if (this.i != -1L) {
      long l1 = this.i;
      StringBuilder stringBuilder = new StringBuilder(22);
      stringBuilder.append(l1);
      stringBuilder.append("ns");
      a.a("expireAfterAccess", stringBuilder.toString());
    } 
    if (this.f != null)
      a.a("keyStrength", a.a(this.f.toString())); 
    if (this.g != null)
      a.a("valueStrength", a.a(this.g.toString())); 
    if (this.k != null)
      a.a("keyEquivalence"); 
    if (this.a != null)
      a.a("removalListener"); 
    return a.toString();
  }
  
  static class a<K, V> extends AbstractMap<K, V> implements Serializable, ConcurrentMap<K, V> {
    private final g.c<K, V> a;
    
    private final g.b b;
    
    a(g param1g) {
      this.a = param1g.a();
      this.b = param1g.j;
    }
    
    void a(K param1K, V param1V) { // Byte code:
      //   0: new com/a/a/b/g$d
      //   3: dup
      //   4: aload_1
      //   5: aload_2
      //   6: aload_0
      //   7: getfield b : Lcom/a/a/b/g$b;
      //   10: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Lcom/a/a/b/g$b;)V
      //   13: astore_1
      //   14: aload_0
      //   15: getfield a : Lcom/a/a/b/g$c;
      //   18: aload_1
      //   19: invokeinterface a : (Lcom/a/a/b/g$d;)V
      //   24: return }
    
    public boolean containsKey(@Nullable Object param1Object) { return false; }
    
    public boolean containsValue(@Nullable Object param1Object) { return false; }
    
    public Set<Map.Entry<K, V>> entrySet() { return Collections.emptySet(); }
    
    public V get(@Nullable Object param1Object) { return null; }
    
    public V put(K param1K, V param1V) {
      f.a(param1K);
      f.a(param1V);
      a(param1K, param1V);
      return null;
    }
    
    public V putIfAbsent(K param1K, V param1V) { return (V)put(param1K, param1V); }
    
    public V remove(@Nullable Object param1Object) { return null; }
    
    public boolean remove(@Nullable Object param1Object1, @Nullable Object param1Object2) { return false; }
    
    public V replace(K param1K, V param1V) {
      f.a(param1K);
      f.a(param1V);
      return null;
    }
    
    public boolean replace(K param1K, @Nullable V param1V1, V param1V2) {
      f.a(param1K);
      f.a(param1V2);
      return false;
    }
  }
  
  final abstract enum b {
    a, b, c, d, e;
    
    static  {
      // Byte code:
      //   0: new com/a/a/b/g$b$1
      //   3: dup
      //   4: ldc 'EXPLICIT'
      //   6: iconst_0
      //   7: invokespecial <init> : (Ljava/lang/String;I)V
      //   10: putstatic com/a/a/b/g$b.a : Lcom/a/a/b/g$b;
      //   13: new com/a/a/b/g$b$2
      //   16: dup
      //   17: ldc 'REPLACED'
      //   19: iconst_1
      //   20: invokespecial <init> : (Ljava/lang/String;I)V
      //   23: putstatic com/a/a/b/g$b.b : Lcom/a/a/b/g$b;
      //   26: new com/a/a/b/g$b$3
      //   29: dup
      //   30: ldc 'COLLECTED'
      //   32: iconst_2
      //   33: invokespecial <init> : (Ljava/lang/String;I)V
      //   36: putstatic com/a/a/b/g$b.c : Lcom/a/a/b/g$b;
      //   39: new com/a/a/b/g$b$4
      //   42: dup
      //   43: ldc 'EXPIRED'
      //   45: iconst_3
      //   46: invokespecial <init> : (Ljava/lang/String;I)V
      //   49: putstatic com/a/a/b/g$b.d : Lcom/a/a/b/g$b;
      //   52: new com/a/a/b/g$b$5
      //   55: dup
      //   56: ldc 'SIZE'
      //   58: iconst_4
      //   59: invokespecial <init> : (Ljava/lang/String;I)V
      //   62: putstatic com/a/a/b/g$b.e : Lcom/a/a/b/g$b;
      //   65: iconst_5
      //   66: anewarray com/a/a/b/g$b
      //   69: dup
      //   70: iconst_0
      //   71: getstatic com/a/a/b/g$b.a : Lcom/a/a/b/g$b;
      //   74: aastore
      //   75: dup
      //   76: iconst_1
      //   77: getstatic com/a/a/b/g$b.b : Lcom/a/a/b/g$b;
      //   80: aastore
      //   81: dup
      //   82: iconst_2
      //   83: getstatic com/a/a/b/g$b.c : Lcom/a/a/b/g$b;
      //   86: aastore
      //   87: dup
      //   88: iconst_3
      //   89: getstatic com/a/a/b/g$b.d : Lcom/a/a/b/g$b;
      //   92: aastore
      //   93: dup
      //   94: iconst_4
      //   95: getstatic com/a/a/b/g$b.e : Lcom/a/a/b/g$b;
      //   98: aastore
      //   99: putstatic com/a/a/b/g$b.f : [Lcom/a/a/b/g$b;
      //   102: return
    }
  }
  
  enum null {
  
  }
  
  enum null {
  
  }
  
  enum null {
  
  }
  
  enum null {
  
  }
  
  enum null {
  
  }
  
  static interface c<K, V> {
    void a(g.d<K, V> param1d);
  }
  
  static final class d<K, V> extends e<K, V> {
    private final g.b c;
    
    d(@Nullable K param1K, @Nullable V param1V, g.b param1b) {
      super(param1K, param1V);
      this.c = param1b;
    }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/com/a/a/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */