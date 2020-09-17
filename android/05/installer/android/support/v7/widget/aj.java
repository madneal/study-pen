package android.support.v7.widget;

class aj {
  private int a = 0;
  
  private int b = 0;
  
  private int c = Integer.MIN_VALUE;
  
  private int d = Integer.MIN_VALUE;
  
  private int e = 0;
  
  private int f = 0;
  
  private boolean g = false;
  
  private boolean h = false;
  
  public int a() { return this.a; }
  
  public void a(int paramInt1, int paramInt2) {
    this.c = paramInt1;
    this.d = paramInt2;
    this.h = true;
    if (this.g) {
      if (paramInt2 != Integer.MIN_VALUE)
        this.a = paramInt2; 
      if (paramInt1 != Integer.MIN_VALUE) {
        this.b = paramInt1;
        return;
      } 
    } else {
      if (paramInt1 != Integer.MIN_VALUE)
        this.a = paramInt1; 
      if (paramInt2 != Integer.MIN_VALUE)
        this.b = paramInt2; 
    } 
  }
  
  public void a(boolean paramBoolean) { // Byte code:
    //   0: iload_1
    //   1: aload_0
    //   2: getfield g : Z
    //   5: if_icmpne -> 9
    //   8: return
    //   9: aload_0
    //   10: iload_1
    //   11: putfield g : Z
    //   14: aload_0
    //   15: getfield h : Z
    //   18: ifeq -> 113
    //   21: iload_1
    //   22: ifeq -> 69
    //   25: aload_0
    //   26: getfield d : I
    //   29: ldc -2147483648
    //   31: if_icmpeq -> 42
    //   34: aload_0
    //   35: getfield d : I
    //   38: istore_2
    //   39: goto -> 47
    //   42: aload_0
    //   43: getfield e : I
    //   46: istore_2
    //   47: aload_0
    //   48: iload_2
    //   49: putfield a : I
    //   52: aload_0
    //   53: getfield c : I
    //   56: ldc -2147483648
    //   58: if_icmpeq -> 121
    //   61: aload_0
    //   62: getfield c : I
    //   65: istore_2
    //   66: goto -> 126
    //   69: aload_0
    //   70: getfield c : I
    //   73: ldc -2147483648
    //   75: if_icmpeq -> 86
    //   78: aload_0
    //   79: getfield c : I
    //   82: istore_2
    //   83: goto -> 91
    //   86: aload_0
    //   87: getfield e : I
    //   90: istore_2
    //   91: aload_0
    //   92: iload_2
    //   93: putfield a : I
    //   96: aload_0
    //   97: getfield d : I
    //   100: ldc -2147483648
    //   102: if_icmpeq -> 121
    //   105: aload_0
    //   106: getfield d : I
    //   109: istore_2
    //   110: goto -> 126
    //   113: aload_0
    //   114: aload_0
    //   115: getfield e : I
    //   118: putfield a : I
    //   121: aload_0
    //   122: getfield f : I
    //   125: istore_2
    //   126: aload_0
    //   127: iload_2
    //   128: putfield b : I
    //   131: return }
  
  public int b() { return this.b; }
  
  public void b(int paramInt1, int paramInt2) {
    this.h = false;
    if (paramInt1 != Integer.MIN_VALUE) {
      this.e = paramInt1;
      this.a = paramInt1;
    } 
    if (paramInt2 != Integer.MIN_VALUE) {
      this.f = paramInt2;
      this.b = paramInt2;
    } 
  }
  
  public int c() { return this.g ? this.b : this.a; }
  
  public int d() { return this.g ? this.a : this.b; }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */