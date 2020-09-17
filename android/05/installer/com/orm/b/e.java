package com.orm.b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class e {
  private static Class a(String paramString, Context paramContext) {
    try {
      Class clazz = Class.forName(paramString, true, paramContext.getClass().getClassLoader());
    } catch (ClassNotFoundException paramString) {
      Log.e("Sugar", paramString.getMessage());
      paramString = null;
    } 
    if (paramString != null && ((com.orm.d.class.isAssignableFrom(paramString) && !com.orm.d.class.equals(paramString)) || paramString.isAnnotationPresent(com.orm.a.d.class)) && !Modifier.isAbstract(paramString.getModifiers())) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("domain class : ");
      stringBuilder.append(paramString.getSimpleName());
      Log.i("Sugar", stringBuilder.toString());
      return paramString;
    } 
    return null;
  }
  
  public static List<Class> a(Context paramContext) {
    ArrayList arrayList = new ArrayList();
    try {
      Iterator iterator = b(paramContext).iterator();
      while (iterator.hasNext()) {
        Class clazz = a((String)iterator.next(), paramContext);
        if (clazz != null)
          arrayList.add(clazz); 
      } 
    } catch (IOException paramContext) {
      String str = paramContext.getMessage();
      Log.e("Sugar", str);
    } catch (android.content.pm.PackageManager.NameNotFoundException paramContext) {
      String str = paramContext.getMessage();
    } 
    return arrayList;
  }
  
  public static List<Field> a(Class paramClass) {
    List list = f.a(paramClass);
    if (list != null)
      return list; 
    Log.d("Sugar", "Fetching properties");
    ArrayList arrayList = new ArrayList();
    a(arrayList, paramClass);
    list = new ArrayList();
    for (Field field : arrayList) {
      if (!field.isAnnotationPresent(com.orm.a.b.class) && !Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers()))
        list.add(field); 
    } 
    f.a(paramClass, list);
    return list;
  }
  
  private static List<Field> a(List<Field> paramList, Class<?> paramClass) {
    Collections.addAll(paramList, paramClass.getDeclaredFields());
    List<Field> list = paramList;
    if (paramClass.getSuperclass() != null)
      list = a(paramList, paramClass.getSuperclass()); 
    return list;
  }
  
  private static void a(File paramFile, List<String> paramList, String paramString) {
    boolean bool = paramFile.isDirectory();
    byte b = 0;
    if (bool) {
      File[] arrayOfFile = paramFile.listFiles();
      int i = arrayOfFile.length;
      while (b < i) {
        String str;
        File file = arrayOfFile[b];
        if ("".equals(paramString)) {
          str = paramFile.getName();
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(paramString);
          stringBuilder.append(".");
          stringBuilder.append(paramFile.getName());
          str = stringBuilder.toString();
        } 
        a(file, paramList, str);
        b++;
      } 
    } else {
      String str2 = paramFile.getName();
      String str1 = str2;
      if (str2.endsWith(".class"))
        str1 = str2.substring(0, str2.length() - ".class".length()); 
      if (!"".equals(paramString)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(paramString);
        stringBuilder.append(".");
        stringBuilder.append(str1);
        str1 = stringBuilder.toString();
      } 
      paramList.add(str1);
      return;
    } 
  }
  
  private static List<String> b(Context paramContext) { // Byte code:
    //   0: aload_0
    //   1: invokestatic b : (Landroid/content/Context;)Ljava/lang/String;
    //   4: astore_1
    //   5: aload_0
    //   6: invokestatic c : (Landroid/content/Context;)Ljava/lang/String;
    //   9: astore_2
    //   10: new java/util/ArrayList
    //   13: dup
    //   14: invokespecial <init> : ()V
    //   17: astore_3
    //   18: aconst_null
    //   19: astore #4
    //   21: aconst_null
    //   22: astore #5
    //   24: aload #5
    //   26: astore_0
    //   27: new dalvik/system/DexFile
    //   30: astore #6
    //   32: aload #5
    //   34: astore_0
    //   35: aload #6
    //   37: aload_2
    //   38: invokespecial <init> : (Ljava/lang/String;)V
    //   41: aload #6
    //   43: invokevirtual entries : ()Ljava/util/Enumeration;
    //   46: astore_0
    //   47: aload_0
    //   48: invokeinterface hasMoreElements : ()Z
    //   53: ifeq -> 88
    //   56: aload_0
    //   57: invokeinterface nextElement : ()Ljava/lang/Object;
    //   62: checkcast java/lang/String
    //   65: astore #4
    //   67: aload #4
    //   69: aload_1
    //   70: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   73: ifeq -> 47
    //   76: aload_3
    //   77: aload #4
    //   79: invokeinterface add : (Ljava/lang/Object;)Z
    //   84: pop
    //   85: goto -> 47
    //   88: aload #6
    //   90: ifnull -> 345
    //   93: aload #6
    //   95: invokevirtual close : ()V
    //   98: aload_3
    //   99: areturn
    //   100: astore #4
    //   102: aload #6
    //   104: astore_0
    //   105: aload #4
    //   107: astore #6
    //   109: goto -> 347
    //   112: astore_0
    //   113: goto -> 121
    //   116: astore #6
    //   118: goto -> 347
    //   121: aload #6
    //   123: astore_0
    //   124: invokestatic currentThread : ()Ljava/lang/Thread;
    //   127: invokevirtual getContextClassLoader : ()Ljava/lang/ClassLoader;
    //   130: ldc ''
    //   132: invokevirtual getResources : (Ljava/lang/String;)Ljava/util/Enumeration;
    //   135: astore #4
    //   137: aload #6
    //   139: astore_0
    //   140: aload #4
    //   142: invokeinterface hasMoreElements : ()Z
    //   147: ifeq -> 335
    //   150: aload #6
    //   152: astore_0
    //   153: new java/util/ArrayList
    //   156: astore #5
    //   158: aload #6
    //   160: astore_0
    //   161: aload #5
    //   163: invokespecial <init> : ()V
    //   166: aload #6
    //   168: astore_0
    //   169: aload #4
    //   171: invokeinterface nextElement : ()Ljava/lang/Object;
    //   176: checkcast java/net/URL
    //   179: invokevirtual getFile : ()Ljava/lang/String;
    //   182: astore_2
    //   183: aload #6
    //   185: astore_0
    //   186: aload_2
    //   187: ldc 'bin'
    //   189: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   192: ifne -> 208
    //   195: aload #6
    //   197: astore_0
    //   198: aload_2
    //   199: ldc_w 'classes'
    //   202: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   205: ifeq -> 137
    //   208: aload #6
    //   210: astore_0
    //   211: new java/io/File
    //   214: astore #7
    //   216: aload #6
    //   218: astore_0
    //   219: aload #7
    //   221: aload_2
    //   222: invokespecial <init> : (Ljava/lang/String;)V
    //   225: aload #6
    //   227: astore_0
    //   228: aload #7
    //   230: invokevirtual listFiles : ()[Ljava/io/File;
    //   233: astore_2
    //   234: aload #6
    //   236: astore_0
    //   237: aload_2
    //   238: arraylength
    //   239: istore #8
    //   241: iconst_0
    //   242: istore #9
    //   244: iload #9
    //   246: iload #8
    //   248: if_icmpge -> 271
    //   251: aload #6
    //   253: astore_0
    //   254: aload_2
    //   255: iload #9
    //   257: aaload
    //   258: aload #5
    //   260: ldc ''
    //   262: invokestatic a : (Ljava/io/File;Ljava/util/List;Ljava/lang/String;)V
    //   265: iinc #9, 1
    //   268: goto -> 244
    //   271: aload #6
    //   273: astore_0
    //   274: aload #5
    //   276: invokeinterface iterator : ()Ljava/util/Iterator;
    //   281: astore #5
    //   283: aload #6
    //   285: astore_0
    //   286: aload #5
    //   288: invokeinterface hasNext : ()Z
    //   293: ifeq -> 137
    //   296: aload #6
    //   298: astore_0
    //   299: aload #5
    //   301: invokeinterface next : ()Ljava/lang/Object;
    //   306: checkcast java/lang/String
    //   309: astore_2
    //   310: aload #6
    //   312: astore_0
    //   313: aload_2
    //   314: aload_1
    //   315: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   318: ifeq -> 283
    //   321: aload #6
    //   323: astore_0
    //   324: aload_3
    //   325: aload_2
    //   326: invokeinterface add : (Ljava/lang/Object;)Z
    //   331: pop
    //   332: goto -> 283
    //   335: aload #6
    //   337: ifnull -> 345
    //   340: aload #6
    //   342: invokevirtual close : ()V
    //   345: aload_3
    //   346: areturn
    //   347: aload_0
    //   348: ifnull -> 355
    //   351: aload_0
    //   352: invokevirtual close : ()V
    //   355: aload #6
    //   357: athrow
    //   358: astore_0
    //   359: aload #4
    //   361: astore #6
    //   363: goto -> 121
    // Exception table:
    //   from	to	target	type
    //   27	32	358	java/lang/NullPointerException
    //   27	32	116	finally
    //   35	41	358	java/lang/NullPointerException
    //   35	41	116	finally
    //   41	47	112	java/lang/NullPointerException
    //   41	47	100	finally
    //   47	85	112	java/lang/NullPointerException
    //   47	85	100	finally
    //   124	137	116	finally
    //   140	150	116	finally
    //   153	158	116	finally
    //   161	166	116	finally
    //   169	183	116	finally
    //   186	195	116	finally
    //   198	208	116	finally
    //   211	216	116	finally
    //   219	225	116	finally
    //   228	234	116	finally
    //   237	241	116	finally
    //   254	265	116	finally
    //   274	283	116	finally
    //   286	296	116	finally
    //   299	310	116	finally
    //   313	321	116	finally
    //   324	332	116	finally }
  
  private static String c(Context paramContext) { return (paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 0)).sourceDir; }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/com/orm/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */