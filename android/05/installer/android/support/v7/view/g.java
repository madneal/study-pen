package android.support.v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.v4.h.d;
import android.support.v4.h.p;
import android.support.v7.b.a;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.i;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class g extends MenuInflater {
  private static final Class<?>[] a = { Context.class };
  
  private static final Class<?>[] b = a;
  
  private final Object[] c;
  
  private final Object[] d;
  
  private Context e;
  
  private Object f;
  
  public g(Context paramContext) {
    super(paramContext);
    this.e = paramContext;
    this.c = new Object[] { paramContext };
    this.d = this.c;
  }
  
  private Object a(Object paramObject) {
    if (paramObject instanceof android.app.Activity)
      return paramObject; 
    Object object = paramObject;
    if (paramObject instanceof ContextWrapper)
      object = a(((ContextWrapper)paramObject).getBaseContext()); 
    return object;
  }
  
  private void a(XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Menu paramMenu) {
    StringBuilder stringBuilder;
    b b1 = new b(this, paramMenu);
    int i = paramXmlPullParser.getEventType();
    while (true) {
      if (i == 2) {
        String str = paramXmlPullParser.getName();
        if (str.equals("menu")) {
          i = paramXmlPullParser.next();
          break;
        } 
        stringBuilder = new StringBuilder();
        stringBuilder.append("Expecting menu, got ");
        stringBuilder.append(str);
        throw new RuntimeException(stringBuilder.toString());
      } 
      int m = stringBuilder.next();
      i = m;
      if (m == 1) {
        i = m;
        break;
      } 
    } 
    Menu menu = null;
    byte b2 = 0;
    int j = 0;
    int k = i;
    while (!b2) {
      String str;
      byte b3;
      Menu menu1;
      switch (k) {
        default:
          i = j;
          paramMenu = menu;
          b3 = b2;
          break;
        case 3:
          str = stringBuilder.getName();
          if (j != 0 && str.equals(menu)) {
            paramMenu = null;
            i = 0;
            b3 = b2;
            break;
          } 
          if (str.equals("group")) {
            b1.a();
            i = j;
            paramMenu = menu;
            b3 = b2;
            break;
          } 
          if (str.equals("item")) {
            i = j;
            paramMenu = menu;
            b3 = b2;
            if (!b1.d()) {
              if (b.a(b1) != null && b.a(b1).e()) {
                b1.c();
                i = j;
                paramMenu = menu;
                b3 = b2;
                break;
              } 
              b1.b();
              i = j;
              paramMenu = menu;
              b3 = b2;
            } 
            break;
          } 
          i = j;
          paramMenu = menu;
          b3 = b2;
          if (str.equals("menu")) {
            b3 = 1;
            i = j;
            paramMenu = menu;
          } 
          break;
        case 2:
          if (j != 0) {
            i = j;
            paramMenu = menu;
            b3 = b2;
            break;
          } 
          menu1 = stringBuilder.getName();
          if (menu1.equals("group")) {
            b1.a(paramAttributeSet);
            i = j;
            menu1 = menu;
            b3 = b2;
            break;
          } 
          if (menu1.equals("item")) {
            b1.b(paramAttributeSet);
            i = j;
            menu1 = menu;
            b3 = b2;
            break;
          } 
          if (menu1.equals("menu")) {
            a(stringBuilder, paramAttributeSet, b1.c());
            i = j;
            menu1 = menu;
            b3 = b2;
            break;
          } 
          i = 1;
          b3 = b2;
          break;
        case 1:
          throw new RuntimeException("Unexpected end of document");
      } 
      k = stringBuilder.next();
      j = i;
      menu = menu1;
      b2 = b3;
    } 
  }
  
  private Object c() {
    if (this.f == null)
      this.f = a(this.e); 
    return this.f;
  }
  
  public void inflate(int paramInt, Menu paramMenu) {
    if (!(paramMenu instanceof android.support.v4.d.a.a)) {
      super.inflate(paramInt, paramMenu);
      return;
    } 
    Menu menu1 = null;
    Menu menu2 = null;
    xmlResourceParser = null;
    try {
      iOException = this.e.getResources().getLayout(paramInt);
      try {
        a(iOException, Xml.asAttributeSet(iOException), paramMenu);
        return;
      } catch (XmlPullParserException xmlResourceParser) {
        XmlResourceParser xmlResourceParser1 = iOException;
      } catch (IOException xmlResourceParser) {
        XmlResourceParser xmlResourceParser1 = iOException;
      } finally {
        paramMenu = null;
      } 
    } catch (XmlPullParserException null) {
      paramMenu = menu2;
    } catch (IOException iOException) {
      paramMenu = menu1;
      Menu menu = paramMenu;
      InflateException inflateException1 = new InflateException();
      menu = paramMenu;
      this("Error inflating menu XML", iOException);
      menu = paramMenu;
      throw inflateException1;
    } finally {}
    Menu menu3 = paramMenu;
    InflateException inflateException = new InflateException();
    menu3 = paramMenu;
    this("Error inflating menu XML", iOException);
    menu3 = paramMenu;
    throw inflateException;
  }
  
  private static class a implements MenuItem.OnMenuItemClickListener {
    private static final Class<?>[] a = { MenuItem.class };
    
    private Object b;
    
    private Method c;
    
    public a(Object param1Object, String param1String) {
      this.b = param1Object;
      Class clazz = param1Object.getClass();
      try {
        this.c = clazz.getMethod(param1String, a);
        return;
      } catch (Exception param1Object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Couldn't resolve menu item onClick handler ");
        stringBuilder.append(param1String);
        stringBuilder.append(" in class ");
        stringBuilder.append(clazz.getName());
        InflateException inflateException = new InflateException(stringBuilder.toString());
        inflateException.initCause(param1Object);
        throw inflateException;
      } 
    }
    
    public boolean onMenuItemClick(MenuItem param1MenuItem) {
      try {
        if (this.c.getReturnType() == boolean.class)
          return ((Boolean)this.c.invoke(this.b, new Object[] { param1MenuItem })).booleanValue(); 
        this.c.invoke(this.b, new Object[] { param1MenuItem });
        return true;
      } catch (Exception param1MenuItem) {
        throw new RuntimeException(param1MenuItem);
      } 
    }
  }
  
  private class b {
    private Menu b;
    
    private int c;
    
    private int d;
    
    private int e;
    
    private int f;
    
    private boolean g;
    
    private boolean h;
    
    private boolean i;
    
    private int j;
    
    private int k;
    
    private CharSequence l;
    
    private CharSequence m;
    
    private int n;
    
    private char o;
    
    private char p;
    
    private int q;
    
    private boolean r;
    
    private boolean s;
    
    private boolean t;
    
    private int u;
    
    private int v;
    
    private String w;
    
    private String x;
    
    private String y;
    
    private d z;
    
    public b(g this$0, Menu param1Menu) {
      this.b = param1Menu;
      a();
    }
    
    private char a(String param1String) { return (param1String == null) ? Character.MIN_VALUE : param1String.charAt(0); }
    
    private <T> T a(String param1String, Class<?>[] param1ArrayOfClass, Object[] param1ArrayOfObject) {
      try {
        Constructor constructor = g.a(this.a).getClassLoader().loadClass(param1String).getConstructor(param1ArrayOfClass);
        constructor.setAccessible(true);
        return (T)constructor.newInstance(param1ArrayOfObject);
      } catch (Exception param1ArrayOfClass) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot instantiate class: ");
        stringBuilder.append(param1String);
        Log.w("SupportMenuInflater", stringBuilder.toString(), param1ArrayOfClass);
        return null;
      } 
    }
    
    private void a(MenuItem param1MenuItem) {
      MenuItem menuItem = param1MenuItem.setChecked(this.r).setVisible(this.s).setEnabled(this.t);
      int i1 = this.q;
      boolean bool = false;
      if (i1 >= 1) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      menuItem.setCheckable(bool1).setTitleCondensed(this.m).setIcon(this.n).setAlphabeticShortcut(this.o).setNumericShortcut(this.p);
      if (this.u >= 0)
        p.a(param1MenuItem, this.u); 
      if (this.y != null) {
        if (g.a(this.a).isRestricted())
          throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context"); 
        param1MenuItem.setOnMenuItemClickListener(new g.a(g.c(this.a), this.y));
      } 
      boolean bool1 = param1MenuItem instanceof h;
      if (bool1)
        h h1 = (h)param1MenuItem; 
      if (this.q >= 2)
        if (bool1) {
          ((h)param1MenuItem).a(true);
        } else if (param1MenuItem instanceof i) {
          ((i)param1MenuItem).a(true);
        }  
      if (this.w != null) {
        p.a(param1MenuItem, (View)a(this.w, g.b(), g.d(this.a)));
        bool = true;
      } 
      if (this.v > 0)
        if (!bool) {
          p.b(param1MenuItem, this.v);
        } else {
          Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
        }  
      if (this.z != null)
        p.a(param1MenuItem, this.z); 
    }
    
    public void a() {
      this.c = 0;
      this.d = 0;
      this.e = 0;
      this.f = 0;
      this.g = true;
      this.h = true;
    }
    
    public void a(AttributeSet param1AttributeSet) {
      TypedArray typedArray = g.a(this.a).obtainStyledAttributes(param1AttributeSet, a.k.MenuGroup);
      this.c = typedArray.getResourceId(a.k.MenuGroup_android_id, 0);
      this.d = typedArray.getInt(a.k.MenuGroup_android_menuCategory, 0);
      this.e = typedArray.getInt(a.k.MenuGroup_android_orderInCategory, 0);
      this.f = typedArray.getInt(a.k.MenuGroup_android_checkableBehavior, 0);
      this.g = typedArray.getBoolean(a.k.MenuGroup_android_visible, true);
      this.h = typedArray.getBoolean(a.k.MenuGroup_android_enabled, true);
      typedArray.recycle();
    }
    
    public void b() {
      this.i = true;
      a(this.b.add(this.c, this.j, this.k, this.l));
    }
    
    public void b(AttributeSet param1AttributeSet) {
      int i1;
      TypedArray typedArray = g.a(this.a).obtainStyledAttributes(param1AttributeSet, a.k.MenuItem);
      this.j = typedArray.getResourceId(a.k.MenuItem_android_id, 0);
      this.k = typedArray.getInt(a.k.MenuItem_android_menuCategory, this.d) & 0xFFFF0000 | typedArray.getInt(a.k.MenuItem_android_orderInCategory, this.e) & 0xFFFF;
      this.l = typedArray.getText(a.k.MenuItem_android_title);
      this.m = typedArray.getText(a.k.MenuItem_android_titleCondensed);
      this.n = typedArray.getResourceId(a.k.MenuItem_android_icon, 0);
      this.o = a(typedArray.getString(a.k.MenuItem_android_alphabeticShortcut));
      this.p = a(typedArray.getString(a.k.MenuItem_android_numericShortcut));
      if (typedArray.hasValue(a.k.MenuItem_android_checkable)) {
        i1 = typedArray.getBoolean(a.k.MenuItem_android_checkable, false);
      } else {
        i1 = this.f;
      } 
      this.q = i1;
      this.r = typedArray.getBoolean(a.k.MenuItem_android_checked, false);
      this.s = typedArray.getBoolean(a.k.MenuItem_android_visible, this.g);
      this.t = typedArray.getBoolean(a.k.MenuItem_android_enabled, this.h);
      this.u = typedArray.getInt(a.k.MenuItem_showAsAction, -1);
      this.y = typedArray.getString(a.k.MenuItem_android_onClick);
      this.v = typedArray.getResourceId(a.k.MenuItem_actionLayout, 0);
      this.w = typedArray.getString(a.k.MenuItem_actionViewClass);
      this.x = typedArray.getString(a.k.MenuItem_actionProviderClass);
      if (this.x != null) {
        i1 = 1;
      } else {
        i1 = 0;
      } 
      if (i1 != 0 && this.v == 0 && this.w == null) {
        d d1 = (d)a(this.x, g.a(), g.b(this.a));
      } else {
        if (i1 != 0)
          Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified."); 
        param1AttributeSet = null;
      } 
      this.z = param1AttributeSet;
      typedArray.recycle();
      this.i = false;
    }
    
    public SubMenu c() {
      this.i = true;
      SubMenu subMenu = this.b.addSubMenu(this.c, this.j, this.k, this.l);
      a(subMenu.getItem());
      return subMenu;
    }
    
    public boolean d() { return this.i; }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/view/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */