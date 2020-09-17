package android.support.v4.a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.support.v4.g.h;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class o<E> extends m {
  private final Activity a;
  
  final Context b;
  
  final int c;
  
  final q d = new q();
  
  private final Handler e;
  
  private h<String, v> f;
  
  private boolean g;
  
  private w h;
  
  private boolean i;
  
  private boolean j;
  
  o(Activity paramActivity, Context paramContext, Handler paramHandler, int paramInt) {
    this.a = paramActivity;
    this.b = paramContext;
    this.e = paramHandler;
    this.c = paramInt;
  }
  
  o(l paraml) { this(paraml, paraml, paraml.a, 0); }
  
  w a(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    if (this.f == null)
      this.f = new h(); 
    w w1 = (w)this.f.get(paramString);
    if (w1 == null) {
      if (paramBoolean2) {
        w1 = new w(paramString, this, paramBoolean1);
        this.f.put(paramString, w1);
        return w1;
      } 
    } else {
      w1.a(this);
    } 
    return w1;
  }
  
  public View a(int paramInt) { return null; }
  
  void a(h<String, v> paramh) { this.f = paramh; }
  
  void a(String paramString) {
    if (this.f != null) {
      w w1 = (w)this.f.get(paramString);
      if (w1 != null && !w1.f) {
        w1.h();
        this.f.remove(paramString);
      } 
    } 
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {}
  
  void a(boolean paramBoolean) {
    this.g = paramBoolean;
    if (this.h == null)
      return; 
    if (!this.j)
      return; 
    this.j = false;
    if (paramBoolean) {
      this.h.d();
      return;
    } 
    this.h.c();
  }
  
  public boolean a() { return true; }
  
  public boolean a(k paramk) { return true; }
  
  public LayoutInflater b() { return (LayoutInflater)this.b.getSystemService("layout_inflater"); }
  
  void b(k paramk) {}
  
  void b(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mLoadersStarted=");
    paramPrintWriter.println(this.j);
    if (this.h != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("Loader Manager ");
      paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this.h)));
      paramPrintWriter.println(":");
      w w1 = this.h;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramString);
      stringBuilder.append("  ");
      w1.a(stringBuilder.toString(), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    } 
  }
  
  public void c() {}
  
  public boolean d() { return true; }
  
  public int e() { return this.c; }
  
  Activity f() { return this.a; }
  
  Context g() { return this.b; }
  
  Handler h() { return this.e; }
  
  q i() { return this.d; }
  
  boolean j() { return this.g; }
  
  void k() { // Byte code:
    //   0: aload_0
    //   1: getfield j : Z
    //   4: ifeq -> 8
    //   7: return
    //   8: aload_0
    //   9: iconst_1
    //   10: putfield j : Z
    //   13: aload_0
    //   14: getfield h : Landroid/support/v4/a/w;
    //   17: ifnull -> 30
    //   20: aload_0
    //   21: getfield h : Landroid/support/v4/a/w;
    //   24: invokevirtual b : ()V
    //   27: goto -> 72
    //   30: aload_0
    //   31: getfield i : Z
    //   34: ifne -> 72
    //   37: aload_0
    //   38: aload_0
    //   39: ldc '(root)'
    //   41: aload_0
    //   42: getfield j : Z
    //   45: iconst_0
    //   46: invokevirtual a : (Ljava/lang/String;ZZ)Landroid/support/v4/a/w;
    //   49: putfield h : Landroid/support/v4/a/w;
    //   52: aload_0
    //   53: getfield h : Landroid/support/v4/a/w;
    //   56: ifnull -> 72
    //   59: aload_0
    //   60: getfield h : Landroid/support/v4/a/w;
    //   63: getfield e : Z
    //   66: ifne -> 72
    //   69: goto -> 20
    //   72: aload_0
    //   73: iconst_1
    //   74: putfield i : Z
    //   77: return }
  
  void l() {
    if (this.h == null)
      return; 
    this.h.h();
  }
  
  void m() {
    if (this.f != null) {
      int k = this.f.size();
      w[] arrayOfw = new w[k];
      int n;
      for (n = k - 1; n >= 0; n--)
        arrayOfw[n] = (w)this.f.c(n); 
      for (n = 0; n < k; n++) {
        w w1 = arrayOfw[n];
        w1.e();
        w1.g();
      } 
    } 
  }
  
  h<String, v> n() {
    h h1 = this.f;
    int k = 0;
    byte b1 = 0;
    if (h1 != null) {
      int n = this.f.size();
      w[] arrayOfw = new w[n];
      for (k = n - 1; k >= 0; k--)
        arrayOfw[k] = (w)this.f.c(k); 
      k = 0;
      while (b1 < n) {
        w w1 = arrayOfw[b1];
        if (w1.f) {
          k = 1;
        } else {
          w1.h();
          this.f.remove(w1.d);
        } 
        b1++;
      } 
    } 
    return (k != 0) ? this.f : null;
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */