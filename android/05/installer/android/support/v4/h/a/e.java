package android.support.v4.h.a;

import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class e {
  private static final a a;
  
  private final Object b = a.a(this);
  
  static  {
    d d;
    if (Build.VERSION.SDK_INT >= 19) {
      d = new c();
    } else if (Build.VERSION.SDK_INT >= 16) {
      d = new b();
    } else {
      d = new d();
    } 
    a = d;
  }
  
  public e() {}
  
  public e(Object paramObject) {}
  
  public b a(int paramInt) { return null; }
  
  public Object a() { return this.b; }
  
  public List<b> a(String paramString, int paramInt) { return null; }
  
  public boolean a(int paramInt1, int paramInt2, Bundle paramBundle) { return false; }
  
  public b b(int paramInt) { return null; }
  
  static interface a {
    Object a(e param1e);
  }
  
  static class b extends d {
    public Object a(e param1e) { return f.a(new f.a(this, param1e) {
            public Object a(int param2Int) {
              b b1 = this.a.a(param2Int);
              return (b1 == null) ? null : b1.a();
            }
            
            public List<Object> a(String param2String, int param2Int) {
              List list = this.a.a(param2String, param2Int);
              ArrayList arrayList = new ArrayList();
              int i = list.size();
              for (param2Int = 0; param2Int < i; param2Int++)
                arrayList.add(((b)list.get(param2Int)).a()); 
              return arrayList;
            }
            
            public boolean a(int param2Int1, int param2Int2, Bundle param2Bundle) { return this.a.a(param2Int1, param2Int2, param2Bundle); }
          }); }
  }
  
  class null implements f.a {
    null(e this$0, e param1e) {}
    
    public Object a(int param1Int) {
      b b1 = this.a.a(param1Int);
      return (b1 == null) ? null : b1.a();
    }
    
    public List<Object> a(String param1String, int param1Int) {
      List list = this.a.a(param1String, param1Int);
      ArrayList arrayList = new ArrayList();
      int i = list.size();
      for (param1Int = 0; param1Int < i; param1Int++)
        arrayList.add(((b)list.get(param1Int)).a()); 
      return arrayList;
    }
    
    public boolean a(int param1Int1, int param1Int2, Bundle param1Bundle) { return this.a.a(param1Int1, param1Int2, param1Bundle); }
  }
  
  static class c extends d {
    public Object a(e param1e) { return g.a(new g.a(this, param1e) {
            public Object a(int param2Int) {
              b b1 = this.a.a(param2Int);
              return (b1 == null) ? null : b1.a();
            }
            
            public List<Object> a(String param2String, int param2Int) {
              List list = this.a.a(param2String, param2Int);
              ArrayList arrayList = new ArrayList();
              int i = list.size();
              for (param2Int = 0; param2Int < i; param2Int++)
                arrayList.add(((b)list.get(param2Int)).a()); 
              return arrayList;
            }
            
            public boolean a(int param2Int1, int param2Int2, Bundle param2Bundle) { return this.a.a(param2Int1, param2Int2, param2Bundle); }
            
            public Object b(int param2Int) {
              b b1 = this.a.b(param2Int);
              return (b1 == null) ? null : b1.a();
            }
          }); }
  }
  
  class null implements g.a {
    null(e this$0, e param1e) {}
    
    public Object a(int param1Int) {
      b b1 = this.a.a(param1Int);
      return (b1 == null) ? null : b1.a();
    }
    
    public List<Object> a(String param1String, int param1Int) {
      List list = this.a.a(param1String, param1Int);
      ArrayList arrayList = new ArrayList();
      int i = list.size();
      for (param1Int = 0; param1Int < i; param1Int++)
        arrayList.add(((b)list.get(param1Int)).a()); 
      return arrayList;
    }
    
    public boolean a(int param1Int1, int param1Int2, Bundle param1Bundle) { return this.a.a(param1Int1, param1Int2, param1Bundle); }
    
    public Object b(int param1Int) {
      b b1 = this.a.b(param1Int);
      return (b1 == null) ? null : b1.a();
    }
  }
  
  static class d implements a {
    public Object a(e param1e) { return null; }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */