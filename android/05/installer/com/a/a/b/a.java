package com.a.a.b;

import com.a.a.a.d;
import java.util.Map;
import javax.annotation.Nullable;

abstract class a<K, V> extends Object implements Map.Entry<K, V> {
  public boolean equals(@Nullable Object paramObject) {
    boolean bool = paramObject instanceof Map.Entry;
    byte b = 0;
    int i = b;
    if (bool) {
      paramObject = (Map.Entry)paramObject;
      i = b;
      if (d.a(getKey(), paramObject.getKey())) {
        i = b;
        if (d.a(getValue(), paramObject.getValue()))
          i = 1; 
      } 
    } 
    return i;
  }
  
  public abstract K getKey();
  
  public abstract V getValue();
  
  public int hashCode() {
    int j;
    Object object1 = getKey();
    Object object2 = getValue();
    int i = 0;
    if (object1 == null) {
      j = 0;
    } else {
      j = object1.hashCode();
    } 
    if (object2 != null)
      i = object2.hashCode(); 
    return j ^ i;
  }
  
  public V setValue(V paramV) { throw new UnsupportedOperationException(); }
  
  public String toString() {
    String str1;
    String str2 = String.valueOf((str1 = String.valueOf(String.valueOf(getKey()))).valueOf(getValue()));
    StringBuilder stringBuilder = new StringBuilder(str1.length() + 1 + str2.length());
    stringBuilder.append(str1);
    stringBuilder.append("=");
    stringBuilder.append(str2);
    return stringBuilder.toString();
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/com/a/a/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */