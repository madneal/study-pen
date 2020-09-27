package com.orm.a;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface a {
  String a();
  
  boolean b() default false;
  
  boolean c() default false;
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/com/orm/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */