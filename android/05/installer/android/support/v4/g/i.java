package android.support.v4.g;

public class i<E> extends Object implements Cloneable {
  private static final Object a = new Object();
  
  private boolean b = false;
  
  private int[] c;
  
  private Object[] d;
  
  private int e;
  
  public i() { this(10); }
  
  public i(int paramInt) {
    if (paramInt == 0) {
      this.c = b.a;
      arrayOfObject = b.c;
    } else {
      paramInt = b.a(paramInt);
      this.c = new int[paramInt];
      arrayOfObject = new Object[paramInt];
    } 
    this.d = arrayOfObject;
    this.e = 0;
  }
  
  private void d() {
    int j = this.e;
    int[] arrayOfInt = this.c;
    Object[] arrayOfObject = this.d;
    byte b1 = 0;
    byte b2;
    for (b2 = 0; b1 < j; b2 = b3) {
      Object object = arrayOfObject[b1];
      byte b3 = b2;
      if (object != a) {
        if (b1 != b2) {
          arrayOfInt[b2] = arrayOfInt[b1];
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
  
  public i<E> a() {
    try {
      cloneNotSupportedException = (i)super.clone();
      try {
        cloneNotSupportedException.c = (int[])this.c.clone();
        cloneNotSupportedException.d = (Object[])this.d.clone();
        return cloneNotSupportedException;
      } catch (CloneNotSupportedException cloneNotSupportedException1) {}
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      cloneNotSupportedException = null;
    } 
    return cloneNotSupportedException;
  }
  
  public E a(int paramInt) { return (E)a(paramInt, null); }
  
  public E a(int paramInt, E paramE) {
    paramInt = b.a(this.c, this.e, paramInt);
    return (paramInt >= 0) ? ((this.d[paramInt] == a) ? paramE : (E)this.d[paramInt]) : paramE;
  }
  
  public int b() {
    if (this.b)
      d(); 
    return this.e;
  }
  
  public void b(int paramInt) {
    paramInt = b.a(this.c, this.e, paramInt);
    if (paramInt >= 0 && this.d[paramInt] != a) {
      this.d[paramInt] = a;
      this.b = true;
    } 
  }
  
  public void b(int paramInt, E paramE) {
    int j = b.a(this.c, this.e, paramInt);
    if (j >= 0) {
      this.d[j] = paramE;
      return;
    } 
    int k = j ^ 0xFFFFFFFF;
    if (k < this.e && this.d[k] == a) {
      this.c[k] = paramInt;
      this.d[k] = paramE;
      return;
    } 
    j = k;
    if (this.b) {
      j = k;
      if (this.e >= this.c.length) {
        d();
        j = b.a(this.c, this.e, paramInt) ^ 0xFFFFFFFF;
      } 
    } 
    if (this.e >= this.c.length) {
      k = b.a(this.e + 1);
      int[] arrayOfInt = new int[k];
      Object[] arrayOfObject = new Object[k];
      System.arraycopy(this.c, 0, arrayOfInt, 0, this.c.length);
      System.arraycopy(this.d, 0, arrayOfObject, 0, this.d.length);
      this.c = arrayOfInt;
      this.d = arrayOfObject;
    } 
    if (this.e - j != 0) {
      int[] arrayOfInt2 = this.c;
      int[] arrayOfInt1 = this.c;
      k = j + 1;
      System.arraycopy(arrayOfInt2, j, arrayOfInt1, k, this.e - j);
      System.arraycopy(this.d, j, this.d, k, this.e - j);
    } 
    this.c[j] = paramInt;
    this.d[j] = paramE;
    this.e++;
  }
  
  public void c() {
    int j = this.e;
    Object[] arrayOfObject = this.d;
    for (byte b1 = 0; b1 < j; b1++)
      arrayOfObject[b1] = null; 
    this.e = 0;
    this.b = false;
  }
  
  public void c(int paramInt) { b(paramInt); }
  
  public int d(int paramInt) {
    if (this.b)
      d(); 
    return this.c[paramInt];
  }
  
  public E e(int paramInt) {
    if (this.b)
      d(); 
    return (E)this.d[paramInt];
  }
  
  public String toString() {
    if (b() <= 0)
      return "{}"; 
    StringBuilder stringBuilder = new StringBuilder(this.e * 28);
    stringBuilder.append('{');
    for (byte b1 = 0; b1 < this.e; b1++) {
      if (b1)
        stringBuilder.append(", "); 
      stringBuilder.append(d(b1));
      stringBuilder.append('=');
      Object object = e(b1);
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


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/g/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */