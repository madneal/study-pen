package com.orm.b;

public class d {
  public static String a(Class<?> paramClass) { return (paramClass.equals(Boolean.class) || paramClass.equals(boolean.class) || paramClass.equals(Integer.class) || paramClass.equals(int.class) || paramClass.equals(Long.class) || paramClass.equals(long.class) || (!paramClass.isPrimitive() && com.orm.d.class.isAssignableFrom(paramClass))) ? "INTEGER" : ((paramClass.equals(java.util.Date.class) || paramClass.equals(java.sql.Date.class) || paramClass.equals(java.util.Calendar.class)) ? "INTEGER NULL" : (paramClass.getName().equals("[B") ? "BLOB" : ((paramClass.equals(Double.class) || paramClass.equals(double.class) || paramClass.equals(Float.class) || paramClass.equals(float.class)) ? "FLOAT" : ((paramClass.equals(String.class) || paramClass.equals(char.class) || paramClass.equals(java.math.BigDecimal.class)) ? "TEXT" : "")))); }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/com/orm/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */