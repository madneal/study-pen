package com.a.a.b;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class f {
  static final j<Object> a = new j<Object>() {
      public boolean hasNext() { return false; }
      
      public boolean hasPrevious() { return false; }
      
      public Object next() { throw new NoSuchElementException(); }
      
      public int nextIndex() { return 0; }
      
      public Object previous() { throw new NoSuchElementException(); }
      
      public int previousIndex() { return -1; }
    };
  
  private static final Iterator<Object> b = new Iterator<Object>() {
      public boolean hasNext() { return false; }
      
      public Object next() { throw new NoSuchElementException(); }
      
      public void remove() { c.a(false); }
    };
  
  @Deprecated
  public static <T> i<T> a() { return b(); }
  
  static <T> j<T> b() { return a; }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/com/a/a/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */