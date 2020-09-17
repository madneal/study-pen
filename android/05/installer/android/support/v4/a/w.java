package android.support.v4.a;

import android.os.Bundle;
import android.support.v4.b.g;
import android.support.v4.g.c;
import android.support.v4.g.i;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

class w extends v {
  static boolean a = false;
  
  final i<a> b = new i();
  
  final i<a> c = new i();
  
  final String d;
  
  boolean e;
  
  boolean f;
  
  private o g;
  
  static  {
  
  }
  
  w(String paramString, o paramo, boolean paramBoolean) {
    this.d = paramString;
    this.g = paramo;
    this.e = paramBoolean;
  }
  
  void a(o paramo) { this.g = paramo; }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    int j = this.b.b();
    int k = 0;
    if (j > 0) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Active Loaders:");
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramString);
      stringBuilder.append("    ");
      String str = stringBuilder.toString();
      for (j = 0; j < this.b.b(); j++) {
        a a1 = (a)this.b.e(j);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.b.d(j));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(a1.toString());
        a1.a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      } 
    } 
    if (this.c.b() > 0) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Inactive Loaders:");
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramString);
      stringBuilder.append("    ");
      String str = stringBuilder.toString();
      for (j = k; j < this.c.b(); j++) {
        a a1 = (a)this.c.e(j);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.c.d(j));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(a1.toString());
        a1.a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      } 
    } 
  }
  
  public boolean a() {
    int j = this.b.b();
    byte b1 = 0;
    int k = 0;
    while (b1 < j) {
      byte b2;
      a a1 = (a)this.b.e(b1);
      if (a1.h && !a1.f) {
        b2 = 1;
      } else {
        b2 = 0;
      } 
      k |= b2;
      b1++;
    } 
    return k;
  }
  
  void b() {
    if (a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Starting in ");
      stringBuilder.append(this);
      Log.v("LoaderManager", stringBuilder.toString());
    } 
    if (this.e) {
      RuntimeException runtimeException = new RuntimeException("here");
      runtimeException.fillInStackTrace();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Called doStart when already started: ");
      stringBuilder.append(this);
      Log.w("LoaderManager", stringBuilder.toString(), runtimeException);
      return;
    } 
    this.e = true;
    for (int j = this.b.b() - 1; j >= 0; j--)
      ((a)this.b.e(j)).a(); 
  }
  
  void c() {
    if (a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Stopping in ");
      stringBuilder.append(this);
      Log.v("LoaderManager", stringBuilder.toString());
    } 
    if (!this.e) {
      RuntimeException runtimeException = new RuntimeException("here");
      runtimeException.fillInStackTrace();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Called doStop when not started: ");
      stringBuilder.append(this);
      Log.w("LoaderManager", stringBuilder.toString(), runtimeException);
      return;
    } 
    for (int j = this.b.b() - 1; j >= 0; j--)
      ((a)this.b.e(j)).e(); 
    this.e = false;
  }
  
  void d() {
    if (a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Retaining in ");
      stringBuilder.append(this);
      Log.v("LoaderManager", stringBuilder.toString());
    } 
    if (!this.e) {
      RuntimeException runtimeException = new RuntimeException("here");
      runtimeException.fillInStackTrace();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Called doRetain when not started: ");
      stringBuilder.append(this);
      Log.w("LoaderManager", stringBuilder.toString(), runtimeException);
      return;
    } 
    this.f = true;
    this.e = false;
    for (int j = this.b.b() - 1; j >= 0; j--)
      ((a)this.b.e(j)).b(); 
  }
  
  void e() {
    if (this.f) {
      if (a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Finished Retaining in ");
        stringBuilder.append(this);
        Log.v("LoaderManager", stringBuilder.toString());
      } 
      this.f = false;
      for (int j = this.b.b() - 1; j >= 0; j--)
        ((a)this.b.e(j)).c(); 
    } 
  }
  
  void f() {
    for (int j = this.b.b() - 1; j >= 0; j--)
      ((a)this.b.e(j)).k = true; 
  }
  
  void g() {
    for (int j = this.b.b() - 1; j >= 0; j--)
      ((a)this.b.e(j)).d(); 
  }
  
  void h() {
    if (!this.f) {
      if (a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Destroying Active in ");
        stringBuilder.append(this);
        Log.v("LoaderManager", stringBuilder.toString());
      } 
      for (int k = this.b.b() - 1; k >= 0; k--)
        ((a)this.b.e(k)).f(); 
      this.b.c();
    } 
    if (a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Destroying Inactive in ");
      stringBuilder.append(this);
      Log.v("LoaderManager", stringBuilder.toString());
    } 
    for (int j = this.c.b() - 1; j >= 0; j--)
      ((a)this.c.e(j)).f(); 
    this.c.c();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append("LoaderManager{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" in ");
    c.a(this.g, stringBuilder);
    stringBuilder.append("}}");
    return stringBuilder.toString();
  }
  
  final class a extends Object implements g.a<Object>, g.b<Object> {
    final int a;
    
    final Bundle b;
    
    v.a<Object> c;
    
    g<Object> d;
    
    boolean e;
    
    boolean f;
    
    Object g;
    
    boolean h;
    
    boolean i;
    
    boolean j;
    
    boolean k;
    
    boolean l;
    
    boolean m;
    
    a n;
    
    void a() {
      if (this.i && this.j) {
        this.h = true;
        return;
      } 
      if (this.h)
        return; 
      this.h = true;
      if (w.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("  Starting: ");
        stringBuilder.append(this);
        Log.v("LoaderManager", stringBuilder.toString());
      } 
      if (this.d == null && this.c != null)
        this.d = this.c.a(this.a, this.b); 
      if (this.d != null) {
        if (this.d.getClass().isMemberClass() && !Modifier.isStatic(this.d.getClass().getModifiers())) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
          stringBuilder.append(this.d);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
        if (!this.m) {
          this.d.a(this.a, this);
          this.d.a(this);
          this.m = true;
        } 
        this.d.a();
      } 
    }
    
    void a(g<Object> param1g, Object param1Object) {
      if (this.c != null) {
        String str = null;
        if (w.a(this.o) != null) {
          str = (w.a(this.o)).d.v;
          (w.a(this.o)).d.v = "onLoadFinished";
        } 
        try {
          if (w.a) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("  onLoadFinished in ");
            stringBuilder.append(param1g);
            stringBuilder.append(": ");
            stringBuilder.append(param1g.a(param1Object));
            Log.v("LoaderManager", stringBuilder.toString());
          } 
          this.c.a(param1g, param1Object);
          if (w.a(this.o) != null)
            (w.a(this.o)).d.v = str; 
          return;
        } finally {
          if (w.a(this.o) != null)
            (w.a(this.o)).d.v = str; 
        } 
      } 
    }
    
    public void a(String param1String, FileDescriptor param1FileDescriptor, PrintWriter param1PrintWriter, String[] param1ArrayOfString) {
      param1PrintWriter.print(param1String);
      param1PrintWriter.print("mId=");
      param1PrintWriter.print(this.a);
      param1PrintWriter.print(" mArgs=");
      param1PrintWriter.println(this.b);
      param1PrintWriter.print(param1String);
      param1PrintWriter.print("mCallbacks=");
      param1PrintWriter.println(this.c);
      param1PrintWriter.print(param1String);
      param1PrintWriter.print("mLoader=");
      param1PrintWriter.println(this.d);
      if (this.d != null) {
        g g1 = this.d;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(param1String);
        stringBuilder.append("  ");
        g1.a(stringBuilder.toString(), param1FileDescriptor, param1PrintWriter, param1ArrayOfString);
      } 
      if (this.e || this.f) {
        param1PrintWriter.print(param1String);
        param1PrintWriter.print("mHaveData=");
        param1PrintWriter.print(this.e);
        param1PrintWriter.print("  mDeliveredData=");
        param1PrintWriter.println(this.f);
        param1PrintWriter.print(param1String);
        param1PrintWriter.print("mData=");
        param1PrintWriter.println(this.g);
      } 
      param1PrintWriter.print(param1String);
      param1PrintWriter.print("mStarted=");
      param1PrintWriter.print(this.h);
      param1PrintWriter.print(" mReportNextStart=");
      param1PrintWriter.print(this.k);
      param1PrintWriter.print(" mDestroyed=");
      param1PrintWriter.println(this.l);
      param1PrintWriter.print(param1String);
      param1PrintWriter.print("mRetaining=");
      param1PrintWriter.print(this.i);
      param1PrintWriter.print(" mRetainingStarted=");
      param1PrintWriter.print(this.j);
      param1PrintWriter.print(" mListenerRegistered=");
      param1PrintWriter.println(this.m);
      if (this.n != null) {
        param1PrintWriter.print(param1String);
        param1PrintWriter.println("Pending Loader ");
        param1PrintWriter.print(this.n);
        param1PrintWriter.println(":");
        a a1 = this.n;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(param1String);
        stringBuilder.append("  ");
        a1.a(stringBuilder.toString(), param1FileDescriptor, param1PrintWriter, param1ArrayOfString);
      } 
    }
    
    void b() {
      if (w.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("  Retaining: ");
        stringBuilder.append(this);
        Log.v("LoaderManager", stringBuilder.toString());
      } 
      this.i = true;
      this.j = this.h;
      this.h = false;
      this.c = null;
    }
    
    void c() {
      if (this.i) {
        if (w.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("  Finished Retaining: ");
          stringBuilder.append(this);
          Log.v("LoaderManager", stringBuilder.toString());
        } 
        this.i = false;
        if (this.h != this.j && !this.h)
          e(); 
      } 
      if (this.h && this.e && !this.k)
        a(this.d, this.g); 
    }
    
    void d() {
      if (this.h && this.k) {
        this.k = false;
        if (this.e)
          a(this.d, this.g); 
      } 
    }
    
    void e() {
      if (w.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("  Stopping: ");
        stringBuilder.append(this);
        Log.v("LoaderManager", stringBuilder.toString());
      } 
      this.h = false;
      if (!this.i && this.d != null && this.m) {
        this.m = false;
        this.d.a(this);
        this.d.b(this);
        this.d.c();
      } 
    }
    
    void f() {
      if (w.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("  Destroying: ");
        stringBuilder.append(this);
        Log.v("LoaderManager", stringBuilder.toString());
      } 
      this.l = true;
      boolean bool = this.f;
      this.f = false;
      if (this.c != null && this.d != null && this.e && bool) {
        if (w.a) {
          object = new StringBuilder();
          object.append("  Reseting: ");
          object.append(this);
          Log.v("LoaderManager", object.toString());
        } 
        if (w.a(this.o) != null) {
          object = (w.a(this.o)).d.v;
          (w.a(this.o)).d.v = "onLoaderReset";
        } else {
          object = null;
        } 
        try {
          this.c.a(this.d);
        } finally {
          if (w.a(this.o) != null)
            (w.a(this.o)).d.v = object; 
        } 
      } 
      this.c = null;
      this.g = null;
      this.e = false;
      if (this.d != null) {
        if (this.m) {
          this.m = false;
          this.d.a(this);
          this.d.b(this);
        } 
        this.d.e();
      } 
      if (this.n != null)
        this.n.f(); 
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder(64);
      stringBuilder.append("LoaderInfo{");
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append(" #");
      stringBuilder.append(this.a);
      stringBuilder.append(" : ");
      c.a(this.d, stringBuilder);
      stringBuilder.append("}}");
      return stringBuilder.toString();
    }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/a/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */