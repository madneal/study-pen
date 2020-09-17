package com.a.a.a;

import javax.annotation.Nullable;

public final class c {
  public static a a(Object paramObject) { return new a(a(paramObject.getClass()), null); }
  
  public static <T> T a(@Nullable T paramT1, @Nullable T paramT2) { return (paramT1 != null) ? paramT1 : (T)f.a(paramT2); }
  
  static String a(Class<?> paramClass) {
    String str = paramClass.getName().replaceAll("\\$[0-9]+", "\\$");
    int i = str.lastIndexOf('$');
    int j = i;
    if (i == -1)
      j = str.lastIndexOf('.'); 
    return str.substring(j + 1);
  }
  
  public static final class a {
    private final String a;
    
    private a b = new a(null);
    
    private a c = this.b;
    
    private boolean d = false;
    
    private a(String param1String) { this.a = (String)f.a(param1String); }
    
    private a a() {
      a a1 = new a(null);
      this.c.c = a1;
      this.c = a1;
      return a1;
    }
    
    private a b(@Nullable Object param1Object) {
      (a()).b = param1Object;
      return this;
    }
    
    private a b(String param1String, @Nullable Object param1Object) {
      a a1 = a();
      a1.b = param1Object;
      a1.a = (String)f.a(param1String);
      return this;
    }
    
    public a a(@Nullable Object param1Object) { return b(param1Object); }
    
    public a a(String param1String, int param1Int) { return b(param1String, String.valueOf(param1Int)); }
    
    public a a(String param1String, @Nullable Object param1Object) { return b(param1String, param1Object); }
    
    public String toString() { // Byte code:
      //   0: aload_0
      //   1: getfield d : Z
      //   4: istore_1
      //   5: ldc ''
      //   7: astore_2
      //   8: new java/lang/StringBuilder
      //   11: dup
      //   12: bipush #32
      //   14: invokespecial <init> : (I)V
      //   17: astore_3
      //   18: aload_3
      //   19: aload_0
      //   20: getfield a : Ljava/lang/String;
      //   23: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   26: pop
      //   27: aload_3
      //   28: bipush #123
      //   30: invokevirtual append : (C)Ljava/lang/StringBuilder;
      //   33: pop
      //   34: aload_0
      //   35: getfield b : Lcom/a/a/a/c$a$a;
      //   38: astore #4
      //   40: aload #4
      //   42: getfield c : Lcom/a/a/a/c$a$a;
      //   45: astore #5
      //   47: aload #5
      //   49: ifnull -> 119
      //   52: iload_1
      //   53: ifeq -> 68
      //   56: aload #5
      //   58: astore #4
      //   60: aload #5
      //   62: getfield b : Ljava/lang/Object;
      //   65: ifnull -> 40
      //   68: aload_3
      //   69: aload_2
      //   70: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   73: pop
      //   74: ldc ', '
      //   76: astore_2
      //   77: aload #5
      //   79: getfield a : Ljava/lang/String;
      //   82: ifnull -> 102
      //   85: aload_3
      //   86: aload #5
      //   88: getfield a : Ljava/lang/String;
      //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   94: pop
      //   95: aload_3
      //   96: bipush #61
      //   98: invokevirtual append : (C)Ljava/lang/StringBuilder;
      //   101: pop
      //   102: aload_3
      //   103: aload #5
      //   105: getfield b : Ljava/lang/Object;
      //   108: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   111: pop
      //   112: aload #5
      //   114: astore #4
      //   116: goto -> 40
      //   119: aload_3
      //   120: bipush #125
      //   122: invokevirtual append : (C)Ljava/lang/StringBuilder;
      //   125: pop
      //   126: aload_3
      //   127: invokevirtual toString : ()Ljava/lang/String;
      //   130: areturn }
    
    private static final class a {
      String a;
      
      Object b;
      
      a c;
      
      private a() {}
    }
  }
  
  private static final class a {
    String a;
    
    Object b;
    
    a c;
    
    private a() {}
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/com/a/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */