package com.orm.b;

import com.orm.a.a;
import com.orm.a.d;
import java.lang.reflect.Field;

public class b {
  public static String a(Class<?> paramClass) {
    if (paramClass.isAnnotationPresent(d.class)) {
      d d = (d)paramClass.getAnnotation(d.class);
      if (!"".equals(d.a()))
        return d.a(); 
    } 
    return a(paramClass.getSimpleName());
  }
  
  public static String a(String paramString) {
    if (paramString.equalsIgnoreCase("_id"))
      return "_id"; 
    StringBuilder stringBuilder = new StringBuilder();
    char[] arrayOfChar = paramString.toCharArray();
    for (byte b1 = 0; b1 < arrayOfChar.length; b1++) {
      int j;
      char c1;
      if (b1) {
        char c = arrayOfChar[b1 - true];
        c1 = c;
      } else {
        boolean bool1 = false;
        c1 = bool1;
      } 
      char c2 = arrayOfChar[b1];
      int i = arrayOfChar.length;
      boolean bool = true;
      if (b1 < i - 1) {
        i = arrayOfChar[b1 + true];
        j = i;
      } else {
        i = 0;
        j = i;
      } 
      if (b1)
        bool = false; 
      if (bool || Character.isLowerCase(c2) || Character.isDigit(c2)) {
        stringBuilder.append(Character.toUpperCase(c2));
      } else if (Character.isUpperCase(c2)) {
        if (Character.isLetterOrDigit(c1) && (Character.isLowerCase(c1) || (j > 0 && Character.isLowerCase(j))))
          stringBuilder.append('_'); 
        stringBuilder.append(c2);
      } 
    } 
    return stringBuilder.toString();
  }
  
  public static String a(Field paramField) { return paramField.isAnnotationPresent(a.class) ? ((a)paramField.getAnnotation(a.class)).a() : a(paramField.getName()); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/com/orm/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */