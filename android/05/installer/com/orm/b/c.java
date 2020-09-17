package com.orm.b;

import java.util.Comparator;

public class c extends Object implements Comparator<Object> {
  private static char a(String paramString, int paramInt) { return (paramInt >= paramString.length()) ? Character.MIN_VALUE : paramString.charAt(paramInt); }
  
  private int a(String paramString1, String paramString2) {
    byte b1 = 0;
    byte b2 = 0;
    byte b3;
    for (b3 = 0;; b3 = b) {
      byte b;
      char c1 = a(paramString1, b1);
      char c2 = a(paramString2, b2);
      if (!Character.isDigit(c1) && !Character.isDigit(c2))
        return b3; 
      if (!Character.isDigit(c1))
        return -1; 
      if (!Character.isDigit(c2))
        return 1; 
      if (c1 < c2) {
        b = b3;
        if (b3 == 0)
          b = -1; 
      } else if (c1 > c2) {
        b = b3;
        if (b3 == 0)
          b = 1; 
      } else {
        b = b3;
        if (c1 == '\000') {
          b = b3;
          if (c2 == '\000')
            return b3; 
        } 
      } 
      b1++;
      b2++;
    } 
  }
  
  public int compare(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1.toString();
    paramObject2 = paramObject2.toString();
    char c1 = Character.MIN_VALUE;
    char c2 = Character.MIN_VALUE;
    label39: while (true) {
      char c3 = a(paramObject1, c1);
      char c4 = a(paramObject2, c2);
      char c5 = Character.MIN_VALUE;
      byte b = c1;
      char c6 = c3;
      c1 = c5;
      while (true) {
        if (Character.isSpaceChar(c6) || c6 == '0') {
          if (c6 == '0') {
            c1++;
          } else {
            c1 = Character.MIN_VALUE;
          } 
          c5 = a(paramObject1, ++b);
          c6 = c5;
          continue;
        } 
        c3 = Character.MIN_VALUE;
        c5 = c2;
        char c7 = c4;
        c2 = c3;
        while (true) {
          if (Character.isSpaceChar(c7) || c7 == '0') {
            if (c7 == '0') {
              c2++;
            } else {
              c2 = Character.MIN_VALUE;
            } 
            c3 = a(paramObject2, ++c5);
            c7 = c3;
            continue;
          } 
          if (Character.isDigit(c6) && Character.isDigit(c7)) {
            int i = a(paramObject1.substring(b), paramObject2.substring(c5));
            if (i != 0)
              return i; 
          } 
          if (c6 == '\000' && c7 == '\000')
            return c1 - c2; 
          if (c6 < c7)
            return -1; 
          if (c6 > c7)
            return 1; 
          c1 = b + 1;
          c2 = c5 + '\001';
          continue label39;
        } 
        break;
      } 
      break;
    } 
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/com/orm/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */