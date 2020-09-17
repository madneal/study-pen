package com.a.a.b;

import java.util.NoSuchElementException;
import javax.annotation.Nullable;

public abstract class b<T> extends i<T> {
  private T a;
  
  protected b(@Nullable T paramT) { this.a = paramT; }
  
  protected abstract T a(T paramT);
  
  public final boolean hasNext() { return (this.a != null); }
  
  public final T next() {
    if (!hasNext())
      throw new NoSuchElementException(); 
    try {
      object = this.a;
      return (T)object;
    } finally {
      this.a = a(this.a);
    } 
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/com/a/a/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */