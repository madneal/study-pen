package com.a.a.b;

import java.io.Serializable;
import javax.annotation.Nullable;

class e<K, V> extends a<K, V> implements Serializable {
  final K a;
  
  final V b;
  
  e(@Nullable K paramK, @Nullable V paramV) {
    this.a = paramK;
    this.b = paramV;
  }
  
  @Nullable
  public final K getKey() { return (K)this.a; }
  
  @Nullable
  public final V getValue() { return (V)this.b; }
  
  public final V setValue(V paramV) { throw new UnsupportedOperationException(); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/com/a/a/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */