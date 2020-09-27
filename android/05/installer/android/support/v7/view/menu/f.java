package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.b.a;
import android.support.v4.d.a.a;
import android.support.v4.h.d;
import android.support.v4.h.p;
import android.support.v7.b.a;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class f implements a {
  private static final int[] d = { 1, 4, 5, 3, 2, 0 };
  
  CharSequence a;
  
  Drawable b;
  
  View c;
  
  private final Context e;
  
  private final Resources f;
  
  private boolean g;
  
  private boolean h;
  
  private a i;
  
  private ArrayList<h> j;
  
  private ArrayList<h> k;
  
  private boolean l;
  
  private ArrayList<h> m;
  
  private ArrayList<h> n;
  
  private boolean o;
  
  private int p = 0;
  
  private ContextMenu.ContextMenuInfo q;
  
  private boolean r = false;
  
  private boolean s = false;
  
  private boolean t = false;
  
  private boolean u = false;
  
  private ArrayList<h> v = new ArrayList();
  
  private CopyOnWriteArrayList<WeakReference<l>> w = new CopyOnWriteArrayList();
  
  private h x;
  
  private boolean y;
  
  public f(Context paramContext) {
    this.e = paramContext;
    this.f = paramContext.getResources();
    this.j = new ArrayList();
    this.k = new ArrayList();
    this.l = true;
    this.m = new ArrayList();
    this.n = new ArrayList();
    this.o = true;
    e(true);
  }
  
  private static int a(ArrayList<h> paramArrayList, int paramInt) {
    for (int i1 = paramArrayList.size() - 1; i1 >= 0; i1--) {
      if (((h)paramArrayList.get(i1)).c() <= paramInt)
        return i1 + 1; 
    } 
    return 0;
  }
  
  private h a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5) { return new h(this, paramInt1, paramInt2, paramInt3, paramInt4, paramCharSequence, paramInt5); }
  
  private void a(int paramInt1, CharSequence paramCharSequence, int paramInt2, Drawable paramDrawable, View paramView) {
    Resources resources = d();
    if (paramView != null) {
      this.c = paramView;
      this.a = null;
      this.b = null;
    } else {
      if (paramInt1 > 0) {
        this.a = resources.getText(paramInt1);
      } else if (paramCharSequence != null) {
        this.a = paramCharSequence;
      } 
      if (paramInt2 > 0) {
        this.b = a.a(e(), paramInt2);
      } else if (paramDrawable != null) {
        this.b = paramDrawable;
      } 
      this.c = null;
    } 
    b(false);
  }
  
  private void a(int paramInt, boolean paramBoolean) {
    if (paramInt >= 0) {
      if (paramInt >= this.j.size())
        return; 
      this.j.remove(paramInt);
      if (paramBoolean)
        b(true); 
    } 
  }
  
  private boolean a(p paramp, l paraml) {
    boolean bool1 = this.w.isEmpty();
    boolean bool2 = false;
    if (bool1)
      return false; 
    if (paraml != null)
      bool2 = paraml.a(paramp); 
    for (WeakReference weakReference : this.w) {
      l l1 = (l)weakReference.get();
      if (l1 == null) {
        this.w.remove(weakReference);
        continue;
      } 
      if (!bool2)
        bool2 = l1.a(paramp); 
    } 
    return bool2;
  }
  
  private static int d(int paramInt) {
    int i1 = (0xFFFF0000 & paramInt) >> 16;
    if (i1 < 0 || i1 >= d.length)
      throw new IllegalArgumentException("order does not contain a valid category."); 
    return paramInt & 0xFFFF | d[i1] << 16;
  }
  
  private void d(boolean paramBoolean) {
    if (this.w.isEmpty())
      return; 
    g();
    for (WeakReference weakReference : this.w) {
      l l1 = (l)weakReference.get();
      if (l1 == null) {
        this.w.remove(weakReference);
        continue;
      } 
      l1.b(paramBoolean);
    } 
    h();
  }
  
  private void e(boolean paramBoolean) {
    boolean bool = true;
    if (paramBoolean && (this.f.getConfiguration()).keyboard != 1 && this.f.getBoolean(a.b.abc_config_showMenuShortcutsWhenKeyboardPresent)) {
      paramBoolean = bool;
    } else {
      paramBoolean = false;
    } 
    this.h = paramBoolean;
  }
  
  public int a(int paramInt1, int paramInt2) {
    int i1 = size();
    int i2 = paramInt2;
    if (paramInt2 < 0)
      i2 = 0; 
    while (i2 < i1) {
      if (((h)this.j.get(i2)).getGroupId() == paramInt1)
        return i2; 
      i2++;
    } 
    return -1;
  }
  
  public f a(int paramInt) {
    this.p = paramInt;
    return this;
  }
  
  protected f a(Drawable paramDrawable) {
    a(0, null, 0, paramDrawable, null);
    return this;
  }
  
  protected f a(View paramView) {
    a(0, null, 0, null, paramView);
    return this;
  }
  
  protected f a(CharSequence paramCharSequence) {
    a(0, paramCharSequence, 0, null, null);
    return this;
  }
  
  h a(int paramInt, KeyEvent paramKeyEvent) {
    ArrayList arrayList = this.v;
    arrayList.clear();
    a(arrayList, paramInt, paramKeyEvent);
    if (arrayList.isEmpty())
      return null; 
    int i1 = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
    paramKeyEvent.getKeyData(keyData);
    int i2 = arrayList.size();
    if (i2 == 1)
      return (h)arrayList.get(0); 
    boolean bool = b();
    for (byte b1 = 0; b1 < i2; b1++) {
      char c1;
      h h1 = (h)arrayList.get(b1);
      if (bool) {
        c1 = h1.getAlphabeticShortcut();
      } else {
        c1 = h1.getNumericShortcut();
      } 
      if ((c1 == keyData.meta[0] && (i1 & 0x2) == 0) || (c1 == keyData.meta[2] && (i1 & 0x2) != 0) || (bool && c1 == '\b' && paramInt == 67))
        return h1; 
    } 
    return null;
  }
  
  protected MenuItem a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {
    int i1 = d(paramInt3);
    h h1 = a(paramInt1, paramInt2, paramInt3, i1, paramCharSequence, this.p);
    if (this.q != null)
      h1.a(this.q); 
    this.j.add(a(this.j, i1), h1);
    b(true);
    return h1;
  }
  
  protected String a() { return "android:menu:actionviewstates"; }
  
  public void a(Bundle paramBundle) {
    int i1 = size();
    SparseArray sparseArray = null;
    byte b1 = 0;
    while (b1 < i1) {
      MenuItem menuItem = getItem(b1);
      View view = p.a(menuItem);
      SparseArray sparseArray1 = sparseArray;
      if (view != null) {
        sparseArray1 = sparseArray;
        if (view.getId() != -1) {
          SparseArray sparseArray2 = sparseArray;
          if (sparseArray == null)
            sparseArray2 = new SparseArray(); 
          view.saveHierarchyState(sparseArray2);
          sparseArray1 = sparseArray2;
          if (p.c(menuItem)) {
            paramBundle.putInt("android:menu:expandedactionview", menuItem.getItemId());
            sparseArray1 = sparseArray2;
          } 
        } 
      } 
      if (menuItem.hasSubMenu())
        ((p)menuItem.getSubMenu()).a(paramBundle); 
      b1++;
      sparseArray = sparseArray1;
    } 
    if (sparseArray != null)
      paramBundle.putSparseParcelableArray(a(), sparseArray); 
  }
  
  public void a(a parama) { this.i = parama; }
  
  void a(h paramh) {
    this.l = true;
    b(true);
  }
  
  public void a(l paraml) { a(paraml, this.e); }
  
  public void a(l paraml, Context paramContext) {
    this.w.add(new WeakReference(paraml));
    paraml.a(paramContext, this);
    this.o = true;
  }
  
  void a(MenuItem paramMenuItem) {
    int i1 = paramMenuItem.getGroupId();
    int i2 = this.j.size();
    for (byte b1 = 0; b1 < i2; b1++) {
      h h1 = (h)this.j.get(b1);
      if (h1.getGroupId() == i1 && h1.g() && h1.isCheckable()) {
        boolean bool;
        if (h1 == paramMenuItem) {
          bool = true;
        } else {
          bool = false;
        } 
        h1.b(bool);
      } 
    } 
  }
  
  void a(List<h> paramList, int paramInt, KeyEvent paramKeyEvent) {
    boolean bool = b();
    int i1 = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
    if (!paramKeyEvent.getKeyData(keyData) && paramInt != 67)
      return; 
    int i2 = this.j.size();
    for (byte b1 = 0; b1 < i2; b1++) {
      char c1;
      h h1 = (h)this.j.get(b1);
      if (h1.hasSubMenu())
        ((f)h1.getSubMenu()).a(paramList, paramInt, paramKeyEvent); 
      if (bool) {
        c1 = h1.getAlphabeticShortcut();
      } else {
        c1 = h1.getNumericShortcut();
      } 
      if ((i1 & 0x5) == 0 && c1 != '\000' && (c1 == keyData.meta[0] || c1 == keyData.meta[2] || (bool && c1 == '\b' && paramInt == 67)) && h1.isEnabled())
        paramList.add(h1); 
    } 
  }
  
  public final void a(boolean paramBoolean) {
    if (this.u)
      return; 
    this.u = true;
    for (WeakReference weakReference : this.w) {
      l l1 = (l)weakReference.get();
      if (l1 == null) {
        this.w.remove(weakReference);
        continue;
      } 
      l1.a(this, paramBoolean);
    } 
    this.u = false;
  }
  
  boolean a(f paramf, MenuItem paramMenuItem) { return (this.i != null && this.i.a(paramf, paramMenuItem)); }
  
  public boolean a(MenuItem paramMenuItem, int paramInt) { return a(paramMenuItem, null, paramInt); }
  
  public boolean a(MenuItem paramMenuItem, l paraml, int paramInt) {
    h h1 = (h)paramMenuItem;
    if (h1 != null) {
      boolean bool2;
      boolean bool;
      if (!h1.isEnabled())
        return false; 
      boolean bool1 = h1.b();
      d d1 = h1.a();
      if (d1 != null && d1.e()) {
        bool = true;
      } else {
        bool = false;
      } 
      if (h1.n()) {
        bool1 |= h1.expandActionView();
        bool2 = bool1;
        if (bool1) {
          bool2 = bool1;
          a(true);
          return bool2;
        } 
      } else {
        if (h1.hasSubMenu() || bool) {
          a(false);
          if (!h1.hasSubMenu())
            h1.a(new p(e(), this, h1)); 
          p p1 = (p)h1.getSubMenu();
          if (bool)
            d1.a(p1); 
          bool1 |= a(p1, paraml);
          boolean bool3 = bool1;
          if (!bool1) {
            bool3 = bool1;
            a(true);
            return bool3;
          } 
          return bool3;
        } 
        bool2 = bool1;
        if ((paramInt & true) == 0) {
          bool2 = bool1;
          a(true);
          return bool2;
        } 
      } 
      return bool2;
    } 
    return false;
  }
  
  public MenuItem add(int paramInt) { return a(0, 0, 0, this.f.getString(paramInt)); }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { return a(paramInt1, paramInt2, paramInt3, this.f.getString(paramInt4)); }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) { return a(paramInt1, paramInt2, paramInt3, paramCharSequence); }
  
  public MenuItem add(CharSequence paramCharSequence) { return a(0, 0, 0, paramCharSequence); }
  
  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem) {
    byte b2;
    PackageManager packageManager = this.e.getPackageManager();
    byte b1 = 0;
    List list = packageManager.queryIntentActivityOptions(paramComponentName, paramArrayOfIntent, paramIntent, 0);
    if (list != null) {
      b2 = list.size();
    } else {
      b2 = 0;
    } 
    byte b3 = b1;
    if ((paramInt4 & true) == 0) {
      removeGroup(paramInt1);
      b3 = b1;
    } 
    while (b3 < b2) {
      ResolveInfo resolveInfo = (ResolveInfo)list.get(b3);
      if (resolveInfo.specificIndex < 0) {
        intent = paramIntent;
      } else {
        intent = paramArrayOfIntent[resolveInfo.specificIndex];
      } 
      Intent intent = new Intent(intent);
      intent.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
      MenuItem menuItem = add(paramInt1, paramInt2, paramInt3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent);
      if (paramArrayOfMenuItem != null && resolveInfo.specificIndex >= 0)
        paramArrayOfMenuItem[resolveInfo.specificIndex] = menuItem; 
      b3++;
    } 
    return b2;
  }
  
  public SubMenu addSubMenu(int paramInt) { return addSubMenu(0, 0, 0, this.f.getString(paramInt)); }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { return addSubMenu(paramInt1, paramInt2, paramInt3, this.f.getString(paramInt4)); }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {
    h h1 = (h)a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    p p1 = new p(this.e, this, h1);
    h1.a(p1);
    return p1;
  }
  
  public SubMenu addSubMenu(CharSequence paramCharSequence) { return addSubMenu(0, 0, 0, paramCharSequence); }
  
  public int b(int paramInt) {
    int i1 = size();
    for (byte b1 = 0; b1 < i1; b1++) {
      if (((h)this.j.get(b1)).getItemId() == paramInt)
        return b1; 
    } 
    return -1;
  }
  
  public void b(Bundle paramBundle) {
    if (paramBundle == null)
      return; 
    SparseArray sparseArray = paramBundle.getSparseParcelableArray(a());
    int i1 = size();
    int i2;
    for (i2 = 0; i2 < i1; i2++) {
      MenuItem menuItem = getItem(i2);
      View view = p.a(menuItem);
      if (view != null && view.getId() != -1)
        view.restoreHierarchyState(sparseArray); 
      if (menuItem.hasSubMenu())
        ((p)menuItem.getSubMenu()).b(paramBundle); 
    } 
    i2 = paramBundle.getInt("android:menu:expandedactionview");
    if (i2 > 0) {
      MenuItem menuItem = findItem(i2);
      if (menuItem != null)
        p.b(menuItem); 
    } 
  }
  
  void b(h paramh) {
    this.o = true;
    b(true);
  }
  
  public void b(l paraml) {
    for (WeakReference weakReference : this.w) {
      l l1 = (l)weakReference.get();
      if (l1 == null || l1 == paraml)
        this.w.remove(weakReference); 
    } 
  }
  
  public void b(boolean paramBoolean) {
    if (!this.r) {
      if (paramBoolean) {
        this.l = true;
        this.o = true;
      } 
      d(paramBoolean);
      return;
    } 
    this.s = true;
  }
  
  boolean b() { return this.g; }
  
  public int c(int paramInt) { return a(paramInt, 0); }
  
  public void c(boolean paramBoolean) { this.y = paramBoolean; }
  
  public boolean c() { return this.h; }
  
  public boolean c(h paramh) {
    boolean bool = this.w.isEmpty();
    boolean bool1 = false;
    if (bool)
      return false; 
    g();
    Iterator iterator = this.w.iterator();
    while (true) {
      bool = bool1;
      if (iterator.hasNext()) {
        WeakReference weakReference = (WeakReference)iterator.next();
        l l1 = (l)weakReference.get();
        if (l1 == null) {
          this.w.remove(weakReference);
          continue;
        } 
        bool = l1.a(this, paramh);
        bool1 = bool;
        if (bool)
          break; 
        continue;
      } 
      break;
    } 
    h();
    if (bool)
      this.x = paramh; 
    return bool;
  }
  
  public void clear() {
    if (this.x != null)
      d(this.x); 
    this.j.clear();
    b(true);
  }
  
  public void clearHeader() {
    this.b = null;
    this.a = null;
    this.c = null;
    b(false);
  }
  
  public void close() { a(true); }
  
  Resources d() { return this.f; }
  
  public boolean d(h paramh) {
    boolean bool1 = this.w.isEmpty();
    boolean bool2 = false;
    byte b1 = 0;
    if (!bool1) {
      boolean bool;
      if (this.x != paramh)
        return false; 
      g();
      Iterator iterator = this.w.iterator();
      bool2 = b1;
      while (true) {
        b1 = bool2;
        if (iterator.hasNext()) {
          WeakReference weakReference = (WeakReference)iterator.next();
          l l1 = (l)weakReference.get();
          if (l1 == null) {
            this.w.remove(weakReference);
            continue;
          } 
          bool = l1.b(this, paramh);
          boolean bool3 = bool;
          if (bool)
            break; 
          continue;
        } 
        break;
      } 
      h();
      bool2 = bool;
      if (bool) {
        this.x = null;
        bool2 = bool;
      } 
    } 
    return bool2;
  }
  
  public Context e() { return this.e; }
  
  public void f() {
    if (this.i != null)
      this.i.a(this); 
  }
  
  public MenuItem findItem(int paramInt) {
    int i1 = size();
    for (byte b1 = 0; b1 < i1; b1++) {
      h h1 = (h)this.j.get(b1);
      if (h1.getItemId() == paramInt)
        return h1; 
      if (h1.hasSubMenu()) {
        MenuItem menuItem = h1.getSubMenu().findItem(paramInt);
        if (menuItem != null)
          return menuItem; 
      } 
    } 
    return null;
  }
  
  public void g() {
    if (!this.r) {
      this.r = true;
      this.s = false;
    } 
  }
  
  public MenuItem getItem(int paramInt) { return (MenuItem)this.j.get(paramInt); }
  
  public void h() {
    this.r = false;
    if (this.s) {
      this.s = false;
      b(true);
    } 
  }
  
  public boolean hasVisibleItems() {
    if (this.y)
      return true; 
    int i1 = size();
    for (byte b1 = 0; b1 < i1; b1++) {
      if (((h)this.j.get(b1)).isVisible())
        return true; 
    } 
    return false;
  }
  
  public ArrayList<h> i() {
    if (!this.l)
      return this.k; 
    this.k.clear();
    int i1 = this.j.size();
    for (byte b1 = 0; b1 < i1; b1++) {
      h h1 = (h)this.j.get(b1);
      if (h1.isVisible())
        this.k.add(h1); 
    } 
    this.l = false;
    this.o = true;
    return this.k;
  }
  
  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent) { return (a(paramInt, paramKeyEvent) != null); }
  
  public void j() {
    ArrayList arrayList = i();
    if (!this.o)
      return; 
    Iterator iterator = this.w.iterator();
    int i1;
    for (i1 = 0; iterator.hasNext(); i1 |= l1.b()) {
      WeakReference weakReference = (WeakReference)iterator.next();
      l l1 = (l)weakReference.get();
      if (l1 == null) {
        this.w.remove(weakReference);
        continue;
      } 
    } 
    if (i1) {
      this.m.clear();
      this.n.clear();
      int i2 = arrayList.size();
      for (i1 = 0; i1 < i2; i1++) {
        ArrayList arrayList1;
        h h1 = (h)arrayList.get(i1);
        if (h1.j()) {
          arrayList1 = this.m;
        } else {
          arrayList1 = this.n;
        } 
        arrayList1.add(h1);
      } 
    } else {
      this.m.clear();
      this.n.clear();
      this.n.addAll(i());
    } 
    this.o = false;
  }
  
  public ArrayList<h> k() {
    j();
    return this.m;
  }
  
  public ArrayList<h> l() {
    j();
    return this.n;
  }
  
  public CharSequence m() { return this.a; }
  
  public Drawable n() { return this.b; }
  
  public View o() { return this.c; }
  
  public f p() { return this; }
  
  public boolean performIdentifierAction(int paramInt1, int paramInt2) { return a(findItem(paramInt1), paramInt2); }
  
  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2) {
    boolean bool;
    h h1 = a(paramInt1, paramKeyEvent);
    if (h1 != null) {
      bool = a(h1, paramInt2);
    } else {
      bool = false;
    } 
    if ((paramInt2 & 0x2) != 0)
      a(true); 
    return bool;
  }
  
  boolean q() { return this.t; }
  
  public h r() { return this.x; }
  
  public void removeGroup(int paramInt) {
    int i1 = c(paramInt);
    if (i1 >= 0) {
      int i2 = this.j.size();
      for (byte b1 = 0; b1 < i2 - i1 && ((h)this.j.get(i1)).getGroupId() == paramInt; b1++)
        a(i1, false); 
      b(true);
    } 
  }
  
  public void removeItem(int paramInt) { a(b(paramInt), true); }
  
  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    int i1 = this.j.size();
    for (byte b1 = 0; b1 < i1; b1++) {
      h h1 = (h)this.j.get(b1);
      if (h1.getGroupId() == paramInt) {
        h1.a(paramBoolean2);
        h1.setCheckable(paramBoolean1);
      } 
    } 
  }
  
  public void setGroupEnabled(int paramInt, boolean paramBoolean) {
    int i1 = this.j.size();
    for (byte b1 = 0; b1 < i1; b1++) {
      h h1 = (h)this.j.get(b1);
      if (h1.getGroupId() == paramInt)
        h1.setEnabled(paramBoolean); 
    } 
  }
  
  public void setGroupVisible(int paramInt, boolean paramBoolean) {
    int i1 = this.j.size();
    byte b1 = 0;
    byte b2;
    for (b2 = 0; b1 < i1; b2 = b3) {
      h h1 = (h)this.j.get(b1);
      byte b3 = b2;
      if (h1.getGroupId() == paramInt) {
        b3 = b2;
        if (h1.c(paramBoolean))
          b3 = 1; 
      } 
      b1++;
    } 
    if (b2 != 0)
      b(true); 
  }
  
  public void setQwertyMode(boolean paramBoolean) {
    this.g = paramBoolean;
    b(false);
  }
  
  public int size() { return this.j.size(); }
  
  public static interface a {
    void a(f param1f);
    
    boolean a(f param1f, MenuItem param1MenuItem);
  }
  
  public static interface b {
    boolean a(h param1h);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/view/menu/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */