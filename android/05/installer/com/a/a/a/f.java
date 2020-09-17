package com.a.a.a;

import javax.annotation.Nullable;

public final class f {
  public static <T> T a(T paramT) {
    if (paramT == null)
      throw new NullPointerException(); 
    return paramT;
  }
  
  static String a(String paramString, @Nullable Object... paramVarArgs) {
    paramString = String.valueOf(paramString);
    StringBuilder stringBuilder = new StringBuilder(paramString.length() + paramVarArgs.length * 16);
    int i = 0;
    int j = 0;
    while (i < paramVarArgs.length) {
      int k = paramString.indexOf("%s", j);
      if (k == -1)
        break; 
      stringBuilder.append(paramString.substring(j, k));
      stringBuilder.append(paramVarArgs[i]);
      j = k + 2;
      i++;
    } 
    stringBuilder.append(paramString.substring(j));
    if (i < paramVarArgs.length) {
      stringBuilder.append(" [");
      j = i + 1;
      stringBuilder.append(paramVarArgs[i]);
      for (i = j; i < paramVarArgs.length; i++) {
        stringBuilder.append(", ");
        stringBuilder.append(paramVarArgs[i]);
      } 
      stringBuilder.append(']');
    } 
    return stringBuilder.toString();
  }
  
  public static void a(boolean paramBoolean, @Nullable Object paramObject) {
    if (!paramBoolean)
      throw new IllegalArgumentException(String.valueOf(paramObject)); 
  }
  
  public static void a(boolean paramBoolean, @Nullable String paramString, @Nullable Object... paramVarArgs) {
    if (!paramBoolean)
      throw new IllegalStateException(a(paramString, paramVarArgs)); 
  }
  
  public static void b(boolean paramBoolean, @Nullable Object paramObject) {
    if (!paramBoolean)
      throw new IllegalStateException(String.valueOf(paramObject)); 
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/com/a/a/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */