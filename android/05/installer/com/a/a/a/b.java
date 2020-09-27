package com.a.a.a;

import java.io.Serializable;
import javax.annotation.Nullable;

public abstract class b<T> extends Object {
  public static b<Object> a() { return a.a; }
  
  public static b<Object> b() { return b.a; }
  
  public final int a(@Nullable T paramT) { return (paramT == null) ? 0 : b(paramT); }
  
  public final boolean a(@Nullable T paramT1, @Nullable T paramT2) { return (paramT1 == paramT2) ? true : ((paramT1 == null || paramT2 == null) ? false : b(paramT1, paramT2)); }
  
  protected abstract int b(T paramT);
  
  protected abstract boolean b(T paramT1, T paramT2);
  
  static final class a extends b<Object> implements Serializable {
    static final a a = new a();
    
    protected int b(Object param1Object) { return param1Object.hashCode(); }
    
    protected boolean b(Object param1Object1, Object param1Object2) { return param1Object1.equals(param1Object2); }
  }
  
  static final class b extends b<Object> implements Serializable {
    static final b a = new b();
    
    protected int b(Object param1Object) { return System.identityHashCode(param1Object); }
    
    protected boolean b(Object param1Object1, Object param1Object2) { return false; }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/com/a/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */