package android.support.v4.g;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class g<K, V> extends Object {
  b b;
  
  c c;
  
  e d;
  
  public static <K, V> boolean a(Map<K, V> paramMap, Collection<?> paramCollection) {
    Iterator iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      if (!paramMap.containsKey(iterator.next()))
        return false; 
    } 
    return true;
  }
  
  public static <T> boolean a(Set<T> paramSet, Object paramObject) {
    if (paramSet == paramObject)
      return true; 
    if (paramObject instanceof Set) {
      paramObject = (Set)paramObject;
      try {
        if (paramSet.size() == paramObject.size()) {
          boolean bool = paramSet.containsAll(paramObject);
          if (bool)
            return true; 
        } 
        return false;
      } catch (NullPointerException|ClassCastException paramSet) {}
    } 
    return false;
  }
  
  public static <K, V> boolean b(Map<K, V> paramMap, Collection<?> paramCollection) {
    int i = paramMap.size();
    Iterator iterator = paramCollection.iterator();
    while (iterator.hasNext())
      paramMap.remove(iterator.next()); 
    return (i != paramMap.size());
  }
  
  public static <K, V> boolean c(Map<K, V> paramMap, Collection<?> paramCollection) {
    int i = paramMap.size();
    Iterator iterator = paramMap.keySet().iterator();
    while (iterator.hasNext()) {
      if (!paramCollection.contains(iterator.next()))
        iterator.remove(); 
    } 
    return (i != paramMap.size());
  }
  
  protected abstract int a();
  
  protected abstract int a(Object paramObject);
  
  protected abstract Object a(int paramInt1, int paramInt2);
  
  protected abstract V a(int paramInt, V paramV);
  
  protected abstract void a(int paramInt);
  
  protected abstract void a(K paramK, V paramV);
  
  public <T> T[] a(T[] paramArrayOfT, int paramInt) {
    int i = a();
    T[] arrayOfT = paramArrayOfT;
    if (paramArrayOfT.length < i)
      arrayOfT = (T[])(Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), i); 
    for (byte b1 = 0; b1 < i; b1++)
      arrayOfT[b1] = a(b1, paramInt); 
    if (arrayOfT.length > i)
      arrayOfT[i] = null; 
    return arrayOfT;
  }
  
  protected abstract int b(Object paramObject);
  
  protected abstract Map<K, V> b();
  
  public Object[] b(int paramInt) {
    int i = a();
    Object[] arrayOfObject = new Object[i];
    for (byte b1 = 0; b1 < i; b1++)
      arrayOfObject[b1] = a(b1, paramInt); 
    return arrayOfObject;
  }
  
  protected abstract void c();
  
  public Set<Map.Entry<K, V>> d() {
    if (this.b == null)
      this.b = new b(this); 
    return this.b;
  }
  
  public Set<K> e() {
    if (this.c == null)
      this.c = new c(this); 
    return this.c;
  }
  
  public Collection<V> f() {
    if (this.d == null)
      this.d = new e(this); 
    return this.d;
  }
  
  final class a<T> extends Object implements Iterator<T> {
    final int a;
    
    int b;
    
    int c;
    
    boolean d = false;
    
    a(g this$0, int param1Int) {
      this.a = param1Int;
      this.b = this$0.a();
    }
    
    public boolean hasNext() { return (this.c < this.b); }
    
    public T next() {
      Object object = this.e.a(this.c, this.a);
      this.c++;
      this.d = true;
      return (T)object;
    }
    
    public void remove() {
      if (!this.d)
        throw new IllegalStateException(); 
      this.c--;
      this.b--;
      this.d = false;
      this.e.a(this.c);
    }
  }
  
  final class b extends Object implements Set<Map.Entry<K, V>> {
    b(g this$0) {}
    
    public boolean a(Map.Entry<K, V> param1Entry) { throw new UnsupportedOperationException(); }
    
    public boolean addAll(Collection<? extends Map.Entry<K, V>> param1Collection) {
      int i = this.a.a();
      for (Map.Entry entry : param1Collection)
        this.a.a(entry.getKey(), entry.getValue()); 
      return (i != this.a.a());
    }
    
    public void clear() { this.a.c(); }
    
    public boolean contains(Object param1Object) {
      if (!(param1Object instanceof Map.Entry))
        return false; 
      param1Object = (Map.Entry)param1Object;
      int i = this.a.a(param1Object.getKey());
      return (i < 0) ? false : b.a(this.a.a(i, 1), param1Object.getValue());
    }
    
    public boolean containsAll(Collection<?> param1Collection) {
      Iterator iterator = param1Collection.iterator();
      while (iterator.hasNext()) {
        if (!contains(iterator.next()))
          return false; 
      } 
      return true;
    }
    
    public boolean equals(Object param1Object) { return g.a(this, param1Object); }
    
    public int hashCode() {
      int i = this.a.a() - 1;
      int j = 0;
      while (i >= 0) {
        int m;
        int k;
        Object object1 = this.a.a(i, 0);
        Object object2 = this.a.a(i, 1);
        if (object1 == null) {
          k = 0;
        } else {
          k = object1.hashCode();
        } 
        if (object2 == null) {
          m = 0;
        } else {
          m = object2.hashCode();
        } 
        j += (k ^ m);
        i--;
      } 
      return j;
    }
    
    public boolean isEmpty() { return (this.a.a() == 0); }
    
    public Iterator<Map.Entry<K, V>> iterator() { return new g.d(this.a); }
    
    public boolean remove(Object param1Object) { throw new UnsupportedOperationException(); }
    
    public boolean removeAll(Collection<?> param1Collection) { throw new UnsupportedOperationException(); }
    
    public boolean retainAll(Collection<?> param1Collection) { throw new UnsupportedOperationException(); }
    
    public int size() { return this.a.a(); }
    
    public Object[] toArray() { throw new UnsupportedOperationException(); }
    
    public <T> T[] toArray(T[] param1ArrayOfT) { throw new UnsupportedOperationException(); }
  }
  
  final class c extends Object implements Set<K> {
    c(g this$0) {}
    
    public boolean add(K param1K) { throw new UnsupportedOperationException(); }
    
    public boolean addAll(Collection<? extends K> param1Collection) { throw new UnsupportedOperationException(); }
    
    public void clear() { this.a.c(); }
    
    public boolean contains(Object param1Object) { return (this.a.a(param1Object) >= 0); }
    
    public boolean containsAll(Collection<?> param1Collection) { return g.a(this.a.b(), param1Collection); }
    
    public boolean equals(Object param1Object) { return g.a(this, param1Object); }
    
    public int hashCode() {
      int i = this.a.a() - 1;
      int j = 0;
      while (i >= 0) {
        int k;
        Object object = this.a.a(i, 0);
        if (object == null) {
          k = 0;
        } else {
          k = object.hashCode();
        } 
        j += k;
        i--;
      } 
      return j;
    }
    
    public boolean isEmpty() { return (this.a.a() == 0); }
    
    public Iterator<K> iterator() { return new g.a(this.a, 0); }
    
    public boolean remove(Object param1Object) {
      int i = this.a.a(param1Object);
      if (i >= 0) {
        this.a.a(i);
        return true;
      } 
      return false;
    }
    
    public boolean removeAll(Collection<?> param1Collection) { return g.b(this.a.b(), param1Collection); }
    
    public boolean retainAll(Collection<?> param1Collection) { return g.c(this.a.b(), param1Collection); }
    
    public int size() { return this.a.a(); }
    
    public Object[] toArray() { return this.a.b(0); }
    
    public <T> T[] toArray(T[] param1ArrayOfT) { return (T[])this.a.a(param1ArrayOfT, 0); }
  }
  
  final class d extends Object implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
    int a;
    
    int b;
    
    boolean c = false;
    
    d(g this$0) {
      this.a = this$0.a() - 1;
      this.b = -1;
    }
    
    public Map.Entry<K, V> a() {
      this.b++;
      this.c = true;
      return this;
    }
    
    public final boolean equals(Object param1Object) {
      if (!this.c)
        throw new IllegalStateException("This container does not support retaining Map.Entry objects"); 
      boolean bool = param1Object instanceof Map.Entry;
      boolean bool1 = false;
      if (!bool)
        return false; 
      param1Object = (Map.Entry)param1Object;
      bool = bool1;
      if (b.a(param1Object.getKey(), this.d.a(this.b, 0))) {
        bool = bool1;
        if (b.a(param1Object.getValue(), this.d.a(this.b, 1)))
          bool = true; 
      } 
      return bool;
    }
    
    public K getKey() {
      if (!this.c)
        throw new IllegalStateException("This container does not support retaining Map.Entry objects"); 
      return (K)this.d.a(this.b, 0);
    }
    
    public V getValue() {
      if (!this.c)
        throw new IllegalStateException("This container does not support retaining Map.Entry objects"); 
      return (V)this.d.a(this.b, 1);
    }
    
    public boolean hasNext() { return (this.b < this.a); }
    
    public final int hashCode() {
      if (!this.c)
        throw new IllegalStateException("This container does not support retaining Map.Entry objects"); 
      g g1 = this.d;
      int i = this.b;
      int j = 0;
      Object object2 = g1.a(i, 0);
      Object object1 = this.d.a(this.b, 1);
      if (object2 == null) {
        i = 0;
      } else {
        i = object2.hashCode();
      } 
      if (object1 != null)
        j = object1.hashCode(); 
      return i ^ j;
    }
    
    public void remove() {
      if (!this.c)
        throw new IllegalStateException(); 
      this.d.a(this.b);
      this.b--;
      this.a--;
      this.c = false;
    }
    
    public V setValue(V param1V) {
      if (!this.c)
        throw new IllegalStateException("This container does not support retaining Map.Entry objects"); 
      return (V)this.d.a(this.b, param1V);
    }
    
    public final String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(getKey());
      stringBuilder.append("=");
      stringBuilder.append(getValue());
      return stringBuilder.toString();
    }
  }
  
  final class e extends Object implements Collection<V> {
    e(g this$0) {}
    
    public boolean add(V param1V) { throw new UnsupportedOperationException(); }
    
    public boolean addAll(Collection<? extends V> param1Collection) { throw new UnsupportedOperationException(); }
    
    public void clear() { this.a.c(); }
    
    public boolean contains(Object param1Object) { return (this.a.b(param1Object) >= 0); }
    
    public boolean containsAll(Collection<?> param1Collection) {
      Iterator iterator = param1Collection.iterator();
      while (iterator.hasNext()) {
        if (!contains(iterator.next()))
          return false; 
      } 
      return true;
    }
    
    public boolean isEmpty() { return (this.a.a() == 0); }
    
    public Iterator<V> iterator() { return new g.a(this.a, 1); }
    
    public boolean remove(Object param1Object) {
      int i = this.a.b(param1Object);
      if (i >= 0) {
        this.a.a(i);
        return true;
      } 
      return false;
    }
    
    public boolean removeAll(Collection<?> param1Collection) {
      int i = this.a.a();
      byte b = 0;
      boolean bool = false;
      while (b < i) {
        int j = i;
        byte b1 = b;
        if (param1Collection.contains(this.a.a(b, 1))) {
          this.a.a(b);
          b1 = b - 1;
          j = i - 1;
          bool = true;
        } 
        b = b1 + 1;
        i = j;
      } 
      return bool;
    }
    
    public boolean retainAll(Collection<?> param1Collection) {
      int i = this.a.a();
      byte b = 0;
      boolean bool = false;
      while (b < i) {
        int j = i;
        byte b1 = b;
        if (!param1Collection.contains(this.a.a(b, 1))) {
          this.a.a(b);
          b1 = b - 1;
          j = i - 1;
          bool = true;
        } 
        b = b1 + 1;
        i = j;
      } 
      return bool;
    }
    
    public int size() { return this.a.a(); }
    
    public Object[] toArray() { return this.a.b(1); }
    
    public <T> T[] toArray(T[] param1ArrayOfT) { return (T[])this.a.a(param1ArrayOfT, 1); }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/g/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */