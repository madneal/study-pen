package android.support.v4.g;

class b {
  static final int[] a = new int[0];
  
  static final long[] b = new long[0];
  
  static final Object[] c = new Object[0];
  
  public static int a(int paramInt) { return c(paramInt * 4) / 4; }
  
  static int a(int[] paramArrayOfInt, int paramInt1, int paramInt2) {
    paramInt1--;
    int i = 0;
    while (i <= paramInt1) {
      int j = i + paramInt1 >>> 1;
      int k = paramArrayOfInt[j];
      if (k < paramInt2) {
        i = j + 1;
        continue;
      } 
      if (k > paramInt2) {
        paramInt1 = j - 1;
        continue;
      } 
      return j;
    } 
    return i ^ 0xFFFFFFFF;
  }
  
  static int a(long[] paramArrayOfLong, int paramInt, long paramLong) {
    paramInt--;
    int i = 0;
    while (i <= paramInt) {
      int j = i + paramInt >>> 1;
      long l = paramArrayOfLong[j];
      if (l < paramLong) {
        i = j + 1;
        continue;
      } 
      if (l > paramLong) {
        paramInt = j - 1;
        continue;
      } 
      return j;
    } 
    return i ^ 0xFFFFFFFF;
  }
  
  public static boolean a(Object paramObject1, Object paramObject2) { return (paramObject1 == paramObject2 || (paramObject1 != null && paramObject1.equals(paramObject2))); }
  
  public static int b(int paramInt) { return c(paramInt * 8) / 8; }
  
  public static int c(int paramInt) {
    for (byte b1 = 4; b1 < 32; b1++) {
      byte b2 = (1 << b1) - 12;
      if (paramInt <= b2)
        return b2; 
    } 
    return paramInt;
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */