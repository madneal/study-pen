package com.a.a.a;

public final class a {
  public static String a(String paramString) {
    char[] arrayOfChar;
    int i = paramString.length();
    for (byte b = 0; b < i; b++) {
      if (a(paramString.charAt(b))) {
        arrayOfChar = paramString.toCharArray();
        while (b < i) {
          char c = arrayOfChar[b];
          if (a(c))
            arrayOfChar[b] = (char)(char)(c ^ 0x20); 
          b++;
        } 
        return String.valueOf(arrayOfChar);
      } 
    } 
    return arrayOfChar;
  }
  
  public static boolean a(char paramChar) { return (paramChar >= 'A' && paramChar <= 'Z'); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/com/a/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */