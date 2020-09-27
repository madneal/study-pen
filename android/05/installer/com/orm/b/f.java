package com.orm.b;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class f {
  static Map<Class<?>, List<Field>> a = new HashMap();
  
  public static List<Field> a(Class<?> paramClass) { return a.containsKey(paramClass) ? Collections.synchronizedList((List)a.get(paramClass)) : null; }
  
  public static void a(Class<?> paramClass, List<Field> paramList) { a.put(paramClass, paramList); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/com/orm/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */