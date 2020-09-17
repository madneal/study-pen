package com.a.a.c;

import java.util.Arrays;

public final class a {
  private static final byte[] a;
  
  static  {
    byte b1;
    a = new byte[128];
    Arrays.fill(a, (byte)-1);
    boolean bool = false;
    byte b = 0;
    while (true) {
      b1 = bool;
      if (b <= 9) {
        a[b + 48] = (byte)(byte)b;
        b++;
        continue;
      } 
      break;
    } 
    while (b1 <= 26) {
      byte[] arrayOfByte = a;
      b = (byte)(b1 + 10);
      arrayOfByte[b1 + 65] = (byte)b;
      a[b1 + 97] = (byte)b;
      b1++;
    } 
  }
  
  public static int a(long paramLong) { return (paramLong > 2147483647L) ? Integer.MAX_VALUE : ((paramLong < -2147483648L) ? Integer.MIN_VALUE : (int)paramLong); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/com/a/a/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */