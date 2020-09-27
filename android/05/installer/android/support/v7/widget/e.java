package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.support.v4.e.a;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlSerializer;

class e extends DataSetObservable {
  private static final String a = "e";
  
  private static final Object b = new Object();
  
  private static final Map<String, e> c = new HashMap();
  
  private final Object d;
  
  private final List<a> e;
  
  private final List<c> f;
  
  private final Context g;
  
  private final String h;
  
  private Intent i;
  
  private b j;
  
  private int k;
  
  private boolean l;
  
  private boolean m;
  
  private boolean n;
  
  private boolean o;
  
  private d p;
  
  private boolean a(c paramc) {
    boolean bool = this.f.add(paramc);
    if (bool) {
      this.n = true;
      i();
      d();
      f();
      notifyChanged();
    } 
    return bool;
  }
  
  private void d() {
    if (!this.m)
      throw new IllegalStateException("No preceding call to #readHistoricalData"); 
    if (!this.n)
      return; 
    this.n = false;
    if (!TextUtils.isEmpty(this.h))
      a.a(new e(this, null), new Object[] { new ArrayList(this.f), this.h }); 
  }
  
  private void e() {
    boolean bool1 = g();
    boolean bool2 = h();
    i();
    if (bool1 | bool2) {
      f();
      notifyChanged();
    } 
  }
  
  private boolean f() {
    if (this.j != null && this.i != null && !this.e.isEmpty() && !this.f.isEmpty()) {
      this.j.a(this.i, this.e, Collections.unmodifiableList(this.f));
      return true;
    } 
    return false;
  }
  
  private boolean g() {
    boolean bool = this.o;
    byte b1 = 0;
    if (bool && this.i != null) {
      this.o = false;
      this.e.clear();
      List list = this.g.getPackageManager().queryIntentActivities(this.i, 0);
      int i1 = list.size();
      while (b1 < i1) {
        ResolveInfo resolveInfo = (ResolveInfo)list.get(b1);
        this.e.add(new a(this, resolveInfo));
        b1++;
      } 
      return true;
    } 
    return false;
  }
  
  private boolean h() {
    if (this.l && this.n && !TextUtils.isEmpty(this.h)) {
      this.l = false;
      this.m = true;
      j();
      return true;
    } 
    return false;
  }
  
  private void i() {
    int i1 = this.f.size() - this.k;
    if (i1 <= 0)
      return; 
    this.n = true;
    for (byte b1 = 0; b1 < i1; b1++)
      c c1 = (c)this.f.remove(0); 
  }
  
  private void j() { // Byte code:
    //   0: aload_0
    //   1: getfield g : Landroid/content/Context;
    //   4: aload_0
    //   5: getfield h : Ljava/lang/String;
    //   8: invokevirtual openFileInput : (Ljava/lang/String;)Ljava/io/FileInputStream;
    //   11: astore_1
    //   12: invokestatic newPullParser : ()Lorg/xmlpull/v1/XmlPullParser;
    //   15: astore_2
    //   16: aload_2
    //   17: aload_1
    //   18: ldc 'UTF-8'
    //   20: invokeinterface setInput : (Ljava/io/InputStream;Ljava/lang/String;)V
    //   25: iconst_0
    //   26: istore_3
    //   27: iload_3
    //   28: iconst_1
    //   29: if_icmpeq -> 47
    //   32: iload_3
    //   33: iconst_2
    //   34: if_icmpeq -> 47
    //   37: aload_2
    //   38: invokeinterface next : ()I
    //   43: istore_3
    //   44: goto -> 27
    //   47: ldc 'historical-records'
    //   49: aload_2
    //   50: invokeinterface getName : ()Ljava/lang/String;
    //   55: invokevirtual equals : (Ljava/lang/Object;)Z
    //   58: ifne -> 76
    //   61: new org/xmlpull/v1/XmlPullParserException
    //   64: astore #4
    //   66: aload #4
    //   68: ldc 'Share records file does not start with historical-records tag.'
    //   70: invokespecial <init> : (Ljava/lang/String;)V
    //   73: aload #4
    //   75: athrow
    //   76: aload_0
    //   77: getfield f : Ljava/util/List;
    //   80: astore #5
    //   82: aload #5
    //   84: invokeinterface clear : ()V
    //   89: aload_2
    //   90: invokeinterface next : ()I
    //   95: istore_3
    //   96: iload_3
    //   97: iconst_1
    //   98: if_icmpne -> 110
    //   101: aload_1
    //   102: ifnull -> 333
    //   105: aload_1
    //   106: invokevirtual close : ()V
    //   109: return
    //   110: iload_3
    //   111: iconst_3
    //   112: if_icmpeq -> 89
    //   115: iload_3
    //   116: iconst_4
    //   117: if_icmpne -> 123
    //   120: goto -> 89
    //   123: ldc 'historical-record'
    //   125: aload_2
    //   126: invokeinterface getName : ()Ljava/lang/String;
    //   131: invokevirtual equals : (Ljava/lang/Object;)Z
    //   134: ifne -> 152
    //   137: new org/xmlpull/v1/XmlPullParserException
    //   140: astore #4
    //   142: aload #4
    //   144: ldc 'Share records file not well-formed.'
    //   146: invokespecial <init> : (Ljava/lang/String;)V
    //   149: aload #4
    //   151: athrow
    //   152: aload_2
    //   153: aconst_null
    //   154: ldc 'activity'
    //   156: invokeinterface getAttributeValue : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   161: astore #4
    //   163: aload_2
    //   164: aconst_null
    //   165: ldc 'time'
    //   167: invokeinterface getAttributeValue : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   172: invokestatic parseLong : (Ljava/lang/String;)J
    //   175: lstore #6
    //   177: aload_2
    //   178: aconst_null
    //   179: ldc 'weight'
    //   181: invokeinterface getAttributeValue : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   186: invokestatic parseFloat : (Ljava/lang/String;)F
    //   189: fstore #8
    //   191: new android/support/v7/widget/e$c
    //   194: astore #9
    //   196: aload #9
    //   198: aload #4
    //   200: lload #6
    //   202: fload #8
    //   204: invokespecial <init> : (Ljava/lang/String;JF)V
    //   207: aload #5
    //   209: aload #9
    //   211: invokeinterface add : (Ljava/lang/Object;)Z
    //   216: pop
    //   217: goto -> 89
    //   220: astore #4
    //   222: goto -> 334
    //   225: astore_2
    //   226: getstatic android/support/v7/widget/e.a : Ljava/lang/String;
    //   229: astore #4
    //   231: new java/lang/StringBuilder
    //   234: astore #9
    //   236: aload #9
    //   238: invokespecial <init> : ()V
    //   241: aload #9
    //   243: ldc_w 'Error reading historical recrod file: '
    //   246: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   249: pop
    //   250: aload #9
    //   252: aload_0
    //   253: getfield h : Ljava/lang/String;
    //   256: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: pop
    //   260: aload #4
    //   262: aload #9
    //   264: invokevirtual toString : ()Ljava/lang/String;
    //   267: aload_2
    //   268: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   271: pop
    //   272: aload_1
    //   273: ifnull -> 333
    //   276: goto -> 105
    //   279: astore_2
    //   280: getstatic android/support/v7/widget/e.a : Ljava/lang/String;
    //   283: astore #9
    //   285: new java/lang/StringBuilder
    //   288: astore #4
    //   290: aload #4
    //   292: invokespecial <init> : ()V
    //   295: aload #4
    //   297: ldc_w 'Error reading historical recrod file: '
    //   300: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   303: pop
    //   304: aload #4
    //   306: aload_0
    //   307: getfield h : Ljava/lang/String;
    //   310: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: pop
    //   314: aload #9
    //   316: aload #4
    //   318: invokevirtual toString : ()Ljava/lang/String;
    //   321: aload_2
    //   322: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   325: pop
    //   326: aload_1
    //   327: ifnull -> 333
    //   330: goto -> 105
    //   333: return
    //   334: aload_1
    //   335: ifnull -> 342
    //   338: aload_1
    //   339: invokevirtual close : ()V
    //   342: aload #4
    //   344: athrow
    //   345: astore_1
    //   346: return
    //   347: astore_1
    //   348: goto -> 333
    //   351: astore_1
    //   352: goto -> 342
    // Exception table:
    //   from	to	target	type
    //   0	12	345	java/io/FileNotFoundException
    //   12	25	279	org/xmlpull/v1/XmlPullParserException
    //   12	25	225	java/io/IOException
    //   12	25	220	finally
    //   37	44	279	org/xmlpull/v1/XmlPullParserException
    //   37	44	225	java/io/IOException
    //   37	44	220	finally
    //   47	76	279	org/xmlpull/v1/XmlPullParserException
    //   47	76	225	java/io/IOException
    //   47	76	220	finally
    //   76	89	279	org/xmlpull/v1/XmlPullParserException
    //   76	89	225	java/io/IOException
    //   76	89	220	finally
    //   89	96	279	org/xmlpull/v1/XmlPullParserException
    //   89	96	225	java/io/IOException
    //   89	96	220	finally
    //   105	109	347	java/io/IOException
    //   123	152	279	org/xmlpull/v1/XmlPullParserException
    //   123	152	225	java/io/IOException
    //   123	152	220	finally
    //   152	217	279	org/xmlpull/v1/XmlPullParserException
    //   152	217	225	java/io/IOException
    //   152	217	220	finally
    //   226	272	220	finally
    //   280	326	220	finally
    //   338	342	351	java/io/IOException }
  
  public int a() {
    synchronized (this.d) {
      e();
      return this.e.size();
    } 
  }
  
  public int a(ResolveInfo paramResolveInfo) {
    synchronized (this.d) {
      e();
      List list = this.e;
      int i1 = list.size();
      for (byte b1 = 0; b1 < i1; b1++) {
        if (((a)list.get(b1)).a == paramResolveInfo)
          return b1; 
      } 
      return -1;
    } 
  }
  
  public ResolveInfo a(int paramInt) {
    synchronized (this.d) {
      e();
      return ((a)this.e.get(paramInt)).a;
    } 
  }
  
  public Intent b(int paramInt) {
    synchronized (this.d) {
      if (this.i == null)
        return null; 
      e();
      a a1 = (a)this.e.get(paramInt);
      ComponentName componentName = new ComponentName();
      this(a1.a.activityInfo.packageName, a1.a.activityInfo.name);
      Intent intent = new Intent();
      this(this.i);
      intent.setComponent(componentName);
      if (this.p != null) {
        Intent intent1 = new Intent();
        this(intent);
        if (this.p.a(this, intent1))
          return null; 
      } 
      c c1 = new c();
      this(componentName, System.currentTimeMillis(), 1.0F);
      a(c1);
      return intent;
    } 
  }
  
  public ResolveInfo b() {
    synchronized (this.d) {
      e();
      if (!this.e.isEmpty())
        return ((a)this.e.get(0)).a; 
      return null;
    } 
  }
  
  public void c(int paramInt) {
    synchronized (this.d) {
      float f1;
      e();
      a a1 = (a)this.e.get(paramInt);
      a a2 = (a)this.e.get(0);
      if (a2 != null) {
        f1 = a2.b - a1.b + 5.0F;
      } else {
        f1 = 1.0F;
      } 
      ComponentName componentName = new ComponentName();
      this(a1.a.activityInfo.packageName, a1.a.activityInfo.name);
      c c1 = new c();
      this(componentName, System.currentTimeMillis(), f1);
      a(c1);
      return;
    } 
  }
  
  public final class a extends Object implements Comparable<a> {
    public final ResolveInfo a;
    
    public float b;
    
    public a(e this$0, ResolveInfo param1ResolveInfo) { this.a = param1ResolveInfo; }
    
    public int a(a param1a) { return Float.floatToIntBits(param1a.b) - Float.floatToIntBits(this.b); }
    
    public boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (param1Object == null)
        return false; 
      if (getClass() != param1Object.getClass())
        return false; 
      param1Object = (a)param1Object;
      return !(Float.floatToIntBits(this.b) != Float.floatToIntBits(param1Object.b));
    }
    
    public int hashCode() { return Float.floatToIntBits(this.b) + 31; }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("[");
      stringBuilder.append("resolveInfo:");
      stringBuilder.append(this.a.toString());
      stringBuilder.append("; weight:");
      stringBuilder.append(new BigDecimal(this.b));
      stringBuilder.append("]");
      return stringBuilder.toString();
    }
  }
  
  public static interface b {
    void a(Intent param1Intent, List<e.a> param1List1, List<e.c> param1List2);
  }
  
  public static final class c {
    public final ComponentName a;
    
    public final long b;
    
    public final float c;
    
    public c(ComponentName param1ComponentName, long param1Long, float param1Float) {
      this.a = param1ComponentName;
      this.b = param1Long;
      this.c = param1Float;
    }
    
    public c(String param1String, long param1Long, float param1Float) { this(ComponentName.unflattenFromString(param1String), param1Long, param1Float); }
    
    public boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (param1Object == null)
        return false; 
      if (getClass() != param1Object.getClass())
        return false; 
      param1Object = (c)param1Object;
      if (this.a == null) {
        if (param1Object.a != null)
          return false; 
      } else if (!this.a.equals(param1Object.a)) {
        return false;
      } 
      return (this.b != param1Object.b) ? false : (!(Float.floatToIntBits(this.c) != Float.floatToIntBits(param1Object.c)));
    }
    
    public int hashCode() {
      int i;
      if (this.a == null) {
        i = 0;
      } else {
        i = this.a.hashCode();
      } 
      return ((i + 31) * 31 + (int)(this.b ^ this.b >>> 32)) * 31 + Float.floatToIntBits(this.c);
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("[");
      stringBuilder.append("; activity:");
      stringBuilder.append(this.a);
      stringBuilder.append("; time:");
      stringBuilder.append(this.b);
      stringBuilder.append("; weight:");
      stringBuilder.append(new BigDecimal(this.c));
      stringBuilder.append("]");
      return stringBuilder.toString();
    }
  }
  
  public static interface d {
    boolean a(e param1e, Intent param1Intent);
  }
  
  private final class e extends AsyncTask<Object, Void, Void> {
    private e(e this$0) {}
    
    public Void a(Object... param1VarArgs) {
      list = (List)param1VarArgs[0];
      xmlSerializer = (String)param1VarArgs[1];
      try {
        fileOutputStream = e.a(this.a).openFileOutput(xmlSerializer, 0);
        xmlSerializer = Xml.newSerializer();
        try {
          xmlSerializer.setOutput(fileOutputStream, null);
          xmlSerializer.startDocument("UTF-8", Boolean.valueOf(true));
          xmlSerializer.startTag(null, "historical-records");
          int i = list.size();
          for (byte b = 0; b < i; b++) {
            e.c c = (e.c)list.remove(0);
            xmlSerializer.startTag(null, "historical-record");
            xmlSerializer.attribute(null, "activity", c.a.flattenToString());
            xmlSerializer.attribute(null, "time", String.valueOf(c.b));
            xmlSerializer.attribute(null, "weight", String.valueOf(c.c));
            xmlSerializer.endTag(null, "historical-record");
          } 
          xmlSerializer.endTag(null, "historical-records");
          xmlSerializer.endDocument();
          e.a(this.a, true);
          if (fileOutputStream != null) {
            try {
              fileOutputStream.close();
              return null;
            } catch (IOException fileOutputStream) {}
            return null;
          } 
        } catch (IllegalArgumentException xmlSerializer) {
          String str = e.c();
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("Error writing historical recrod file: ");
          stringBuilder.append(e.b(this.a));
          Log.e(str, stringBuilder.toString(), xmlSerializer);
          e.a(this.a, true);
          if (fileOutputStream != null) {
            try {
              fileOutputStream.close();
              return null;
            } catch (IOException fileOutputStream) {}
            return null;
          } 
        } catch (IllegalStateException list) {
          String str = e.c();
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("Error writing historical recrod file: ");
          stringBuilder.append(e.b(this.a));
          Log.e(str, stringBuilder.toString(), list);
          e.a(this.a, true);
          if (fileOutputStream != null) {
            try {
              fileOutputStream.close();
              return null;
            } catch (IOException fileOutputStream) {}
            return null;
          } 
        } catch (IOException iOException) {
          String str = e.c();
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("Error writing historical recrod file: ");
          stringBuilder.append(e.b(this.a));
          Log.e(str, stringBuilder.toString(), iOException);
          e.a(this.a, true);
          if (fileOutputStream != null) {
            try {
              fileOutputStream.close();
              return null;
            } catch (IOException fileOutputStream) {}
            return null;
          } 
        } finally {}
        return null;
      } catch (FileNotFoundException fileNotFoundException) {
        String str = e.c();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Error writing historical recrod file: ");
        stringBuilder.append(xmlSerializer);
        Log.e(str, stringBuilder.toString(), fileNotFoundException);
        return null;
      } 
    }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */