package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.d.a.b;
import android.support.v4.d.a.c;
import android.support.v4.g.a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

abstract class c<T> extends d<T> {
  final Context a;
  
  private Map<b, MenuItem> c;
  
  private Map<c, SubMenu> d;
  
  c(Context paramContext, T paramT) {
    super(paramT);
    this.a = paramContext;
  }
  
  final MenuItem a(MenuItem paramMenuItem) {
    MenuItem menuItem = paramMenuItem;
    if (paramMenuItem instanceof b) {
      b b = (b)paramMenuItem;
      if (this.c == null)
        this.c = new a(); 
      paramMenuItem = (MenuItem)this.c.get(paramMenuItem);
      menuItem = paramMenuItem;
      if (paramMenuItem == null) {
        menuItem = n.a(this.a, b);
        this.c.put(b, menuItem);
      } 
    } 
    return menuItem;
  }
  
  final SubMenu a(SubMenu paramSubMenu) {
    if (paramSubMenu instanceof c) {
      c c1 = (c)paramSubMenu;
      if (this.d == null)
        this.d = new a(); 
      SubMenu subMenu = (SubMenu)this.d.get(c1);
      paramSubMenu = subMenu;
      if (subMenu == null) {
        paramSubMenu = n.a(this.a, c1);
        this.d.put(c1, paramSubMenu);
      } 
      return paramSubMenu;
    } 
    return paramSubMenu;
  }
  
  final void a() {
    if (this.c != null)
      this.c.clear(); 
    if (this.d != null)
      this.d.clear(); 
  }
  
  final void a(int paramInt) {
    if (this.c == null)
      return; 
    Iterator iterator = this.c.keySet().iterator();
    while (iterator.hasNext()) {
      if (paramInt == ((MenuItem)iterator.next()).getGroupId())
        iterator.remove(); 
    } 
  }
  
  final void b(int paramInt) {
    if (this.c == null)
      return; 
    Iterator iterator = this.c.keySet().iterator();
    while (iterator.hasNext()) {
      if (paramInt == ((MenuItem)iterator.next()).getItemId()) {
        iterator.remove();
        break;
      } 
    } 
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/view/menu/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */