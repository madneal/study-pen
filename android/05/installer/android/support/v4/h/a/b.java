package android.support.v4.h.a;

import android.graphics.Rect;
import android.os.Build;

public class b {
  private static final d a;
  
  private final Object b;
  
  static  {
    i i;
    if (Build.VERSION.SDK_INT >= 22) {
      i = new b();
    } else if (Build.VERSION.SDK_INT >= 21) {
      i = new a();
    } else if (Build.VERSION.SDK_INT >= 19) {
      i = new h();
    } else if (Build.VERSION.SDK_INT >= 18) {
      i = new g();
    } else if (Build.VERSION.SDK_INT >= 17) {
      i = new f();
    } else if (Build.VERSION.SDK_INT >= 16) {
      i = new e();
    } else if (Build.VERSION.SDK_INT >= 14) {
      i = new c();
    } else {
      i = new i();
    } 
    a = i;
  }
  
  public b(Object paramObject) { this.b = paramObject; }
  
  private static String b(int paramInt) {
    switch (paramInt) {
      default:
        return "ACTION_UNKNOWN";
      case 131072:
        return "ACTION_SET_SELECTION";
      case 65536:
        return "ACTION_CUT";
      case 32768:
        return "ACTION_PASTE";
      case 16384:
        return "ACTION_COPY";
      case 8192:
        return "ACTION_SCROLL_BACKWARD";
      case 4096:
        return "ACTION_SCROLL_FORWARD";
      case 2048:
        return "ACTION_PREVIOUS_HTML_ELEMENT";
      case 1024:
        return "ACTION_NEXT_HTML_ELEMENT";
      case 512:
        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
      case 256:
        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
      case 128:
        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
      case 64:
        return "ACTION_ACCESSIBILITY_FOCUS";
      case 32:
        return "ACTION_LONG_CLICK";
      case 16:
        return "ACTION_CLICK";
      case 8:
        return "ACTION_CLEAR_SELECTION";
      case 4:
        return "ACTION_SELECT";
      case 2:
        return "ACTION_CLEAR_FOCUS";
      case 1:
        break;
    } 
    return "ACTION_FOCUS";
  }
  
  public Object a() { return this.b; }
  
  public void a(int paramInt) { a.a(this.b, paramInt); }
  
  public void a(Rect paramRect) { a.a(this.b, paramRect); }
  
  public void a(CharSequence paramCharSequence) { a.a(this.b, paramCharSequence); }
  
  public void a(boolean paramBoolean) { a.a(this.b, paramBoolean); }
  
  public int b() { return a.a(this.b); }
  
  public void b(Rect paramRect) { a.b(this.b, paramRect); }
  
  public boolean c() { return a.f(this.b); }
  
  public boolean d() { return a.g(this.b); }
  
  public boolean e() { return a.j(this.b); }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    paramObject = (b)paramObject;
    if (this.b == null) {
      if (paramObject.b != null)
        return false; 
    } else if (!this.b.equals(paramObject.b)) {
      return false;
    } 
    return true;
  }
  
  public boolean f() { return a.k(this.b); }
  
  public boolean g() { return a.o(this.b); }
  
  public boolean h() { return a.h(this.b); }
  
  public int hashCode() { return (this.b == null) ? 0 : this.b.hashCode(); }
  
  public boolean i() { return a.l(this.b); }
  
  public boolean j() { return a.i(this.b); }
  
  public boolean k() { return a.m(this.b); }
  
  public boolean l() { return a.n(this.b); }
  
  public CharSequence m() { return a.d(this.b); }
  
  public CharSequence n() { return a.b(this.b); }
  
  public CharSequence o() { return a.e(this.b); }
  
  public CharSequence p() { return a.c(this.b); }
  
  public String q() { return a.p(this.b); }
  
  public String toString() {
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append(super.toString());
    Rect rect = new Rect();
    a(rect);
    StringBuilder stringBuilder3 = new StringBuilder();
    stringBuilder3.append("; boundsInParent: ");
    stringBuilder3.append(rect);
    stringBuilder1.append(stringBuilder3.toString());
    b(rect);
    stringBuilder3 = new StringBuilder();
    stringBuilder3.append("; boundsInScreen: ");
    stringBuilder3.append(rect);
    stringBuilder1.append(stringBuilder3.toString());
    stringBuilder1.append("; packageName: ");
    stringBuilder1.append(m());
    stringBuilder1.append("; className: ");
    stringBuilder1.append(n());
    stringBuilder1.append("; text: ");
    stringBuilder1.append(o());
    stringBuilder1.append("; contentDescription: ");
    stringBuilder1.append(p());
    stringBuilder1.append("; viewId: ");
    stringBuilder1.append(q());
    stringBuilder1.append("; checkable: ");
    stringBuilder1.append(c());
    stringBuilder1.append("; checked: ");
    stringBuilder1.append(d());
    stringBuilder1.append("; focusable: ");
    stringBuilder1.append(e());
    stringBuilder1.append("; focused: ");
    stringBuilder1.append(f());
    stringBuilder1.append("; selected: ");
    stringBuilder1.append(g());
    stringBuilder1.append("; clickable: ");
    stringBuilder1.append(h());
    stringBuilder1.append("; longClickable: ");
    stringBuilder1.append(i());
    stringBuilder1.append("; enabled: ");
    stringBuilder1.append(j());
    stringBuilder1.append("; password: ");
    stringBuilder1.append(k());
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("; scrollable: ");
    stringBuilder2.append(l());
    stringBuilder1.append(stringBuilder2.toString());
    stringBuilder1.append("; [");
    int i = b();
    while (i != 0) {
      int j = 1 << Integer.numberOfTrailingZeros(i);
      int k = i & (j ^ 0xFFFFFFFF);
      stringBuilder1.append(b(j));
      i = k;
      if (k != 0) {
        stringBuilder1.append(", ");
        i = k;
      } 
    } 
    stringBuilder1.append("]");
    return stringBuilder1.toString();
  }
  
  static class a extends h {}
  
  static class b extends a {}
  
  static class c extends i {
    public int a(Object param1Object) { return c.a(param1Object); }
    
    public void a(Object param1Object, int param1Int) { c.a(param1Object, param1Int); }
    
    public void a(Object param1Object, Rect param1Rect) { c.a(param1Object, param1Rect); }
    
    public void a(Object param1Object, CharSequence param1CharSequence) { c.a(param1Object, param1CharSequence); }
    
    public void a(Object param1Object, boolean param1Boolean) { c.a(param1Object, param1Boolean); }
    
    public CharSequence b(Object param1Object) { return c.b(param1Object); }
    
    public void b(Object param1Object, Rect param1Rect) { c.b(param1Object, param1Rect); }
    
    public CharSequence c(Object param1Object) { return c.c(param1Object); }
    
    public CharSequence d(Object param1Object) { return c.d(param1Object); }
    
    public CharSequence e(Object param1Object) { return c.e(param1Object); }
    
    public boolean f(Object param1Object) { return c.f(param1Object); }
    
    public boolean g(Object param1Object) { return c.g(param1Object); }
    
    public boolean h(Object param1Object) { return c.h(param1Object); }
    
    public boolean i(Object param1Object) { return c.i(param1Object); }
    
    public boolean j(Object param1Object) { return c.j(param1Object); }
    
    public boolean k(Object param1Object) { return c.k(param1Object); }
    
    public boolean l(Object param1Object) { return c.l(param1Object); }
    
    public boolean m(Object param1Object) { return c.m(param1Object); }
    
    public boolean n(Object param1Object) { return c.n(param1Object); }
    
    public boolean o(Object param1Object) { return c.o(param1Object); }
  }
  
  static interface d {
    int a(Object param1Object);
    
    void a(Object param1Object, int param1Int);
    
    void a(Object param1Object, Rect param1Rect);
    
    void a(Object param1Object, CharSequence param1CharSequence);
    
    void a(Object param1Object, boolean param1Boolean);
    
    CharSequence b(Object param1Object);
    
    void b(Object param1Object, Rect param1Rect);
    
    CharSequence c(Object param1Object);
    
    CharSequence d(Object param1Object);
    
    CharSequence e(Object param1Object);
    
    boolean f(Object param1Object);
    
    boolean g(Object param1Object);
    
    boolean h(Object param1Object);
    
    boolean i(Object param1Object);
    
    boolean j(Object param1Object);
    
    boolean k(Object param1Object);
    
    boolean l(Object param1Object);
    
    boolean m(Object param1Object);
    
    boolean n(Object param1Object);
    
    boolean o(Object param1Object);
    
    String p(Object param1Object);
  }
  
  static class e extends c {}
  
  static class f extends e {}
  
  static class g extends f {
    public String p(Object param1Object) { return d.a(param1Object); }
  }
  
  static class h extends g {}
  
  static class i implements d {
    public int a(Object param1Object) { return 0; }
    
    public void a(Object param1Object, int param1Int) {}
    
    public void a(Object param1Object, Rect param1Rect) {}
    
    public void a(Object param1Object, CharSequence param1CharSequence) {}
    
    public void a(Object param1Object, boolean param1Boolean) {}
    
    public CharSequence b(Object param1Object) { return null; }
    
    public void b(Object param1Object, Rect param1Rect) {}
    
    public CharSequence c(Object param1Object) { return null; }
    
    public CharSequence d(Object param1Object) { return null; }
    
    public CharSequence e(Object param1Object) { return null; }
    
    public boolean f(Object param1Object) { return false; }
    
    public boolean g(Object param1Object) { return false; }
    
    public boolean h(Object param1Object) { return false; }
    
    public boolean i(Object param1Object) { return false; }
    
    public boolean j(Object param1Object) { return false; }
    
    public boolean k(Object param1Object) { return false; }
    
    public boolean l(Object param1Object) { return false; }
    
    public boolean m(Object param1Object) { return false; }
    
    public boolean n(Object param1Object) { return false; }
    
    public boolean o(Object param1Object) { return false; }
    
    public String p(Object param1Object) { return null; }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */