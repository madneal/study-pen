package android.support.v4.g;

public class e<E> extends Object implements Cloneable {
  private static final Object a = new Object();
  
  private boolean b = false;
  
  private long[] c;
  
  private Object[] d;
  
  private int e;
  
  public e() { this(10); }
  
  public e(int paramInt) {
    if (paramInt == 0) {
      this.c = b.b;
      arrayOfObject = b.c;
    } else {
      paramInt = b.b(paramInt);
      this.c = new long[paramInt];
      arrayOfObject = new Object[paramInt];
    } 
    this.d = arrayOfObject;
    this.e = 0;
  }
  
  private void c() {
    int i = this.e;
    long[] arrayOfLong = this.c;
    Object[] arrayOfObject = this.d;
    byte b1 = 0;
    byte b2;
    for (b2 = 0; b1 < i; b2 = b3) {
      Object object = arrayOfObject[b1];
      byte b3 = b2;
      if (object != a) {
        if (b1 != b2) {
          arrayOfLong[b2] = arrayOfLong[b1];
          arrayOfObject[b2] = object;
          arrayOfObject[b1] = null;
        } 
        b3 = b2 + true;
      } 
      b1++;
    } 
    this.b = false;
    this.e = b2;
  }
  
  public long a(int paramInt) {
    if (this.b)
      c(); 
    return this.c[paramInt];
  }
  
  public e<E> a() {
    try {
      cloneNotSupportedException = (e)super.clone();
      try {
        cloneNotSupportedException.c = (long[])this.c.clone();
        cloneNotSupportedException.d = (Object[])this.d.clone();
        return cloneNotSupportedException;
      } catch (CloneNotSupportedException cloneNotSupportedException1) {}
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      cloneNotSupportedException = null;
    } 
    return cloneNotSupportedException;
  }
  
  public E a(long paramLong) { return (E)a(paramLong, null); }
  
  public E a(long paramLong, E paramE) {
    int i = b.a(this.c, this.e, paramLong);
    return (i >= 0) ? ((this.d[i] == a) ? paramE : (E)this.d[i]) : paramE;
  }
  
  public int b() {
    if (this.b)
      c(); 
    return this.e;
  }
  
  public E b(int paramInt) {
    if (this.b)
      c(); 
    return (E)this.d[paramInt];
  }
  
  public void b(long paramLong) {
    int i = b.a(this.c, this.e, paramLong);
    if (i >= 0 && this.d[i] != a) {
      this.d[i] = a;
      this.b = true;
    } 
  }
  
  public void b(long paramLong, E paramE) {
    int i = b.a(this.c, this.e, paramLong);
    if (i >= 0) {
      this.d[i] = paramE;
      return;
    } 
    int j = i ^ 0xFFFFFFFF;
    if (j < this.e && this.d[j] == a) {
      this.c[j] = paramLong;
      this.d[j] = paramE;
      return;
    } 
    i = j;
    if (this.b) {
      i = j;
      if (this.e >= this.c.length) {
        c();
        i = b.a(this.c, this.e, paramLong) ^ 0xFFFFFFFF;
      } 
    } 
    if (this.e >= this.c.length) {
      j = b.b(this.e + 1);
      long[] arrayOfLong = new long[j];
      Object[] arrayOfObject = new Object[j];
      System.arraycopy(this.c, 0, arrayOfLong, 0, this.c.length);
      System.arraycopy(this.d, 0, arrayOfObject, 0, this.d.length);
      this.c = arrayOfLong;
      this.d = arrayOfObject;
    } 
    if (this.e - i != 0) {
      long[] arrayOfLong1 = this.c;
      long[] arrayOfLong2 = this.c;
      j = i + 1;
      System.arraycopy(arrayOfLong1, i, arrayOfLong2, j, this.e - i);
      System.arraycopy(this.d, i, this.d, j, this.e - i);
    } 
    this.c[i] = paramLong;
    this.d[i] = paramE;
    this.e++;
  }
  
  public String toString() {
    if (b() <= 0)
      return "{}"; 
    StringBuilder stringBuilder = new StringBuilder(this.e * 28);
    stringBuilder.append('{');
    for (byte b1 = 0; b1 < this.e; b1++) {
      if (b1)
        stringBuilder.append(", "); 
      stringBuilder.append(a(b1));
      stringBuilder.append('=');
      Object object = b(b1);
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


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/g/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */