package android.support.v4.a;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.b.a;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class ac extends Object implements Iterable<Intent> {
  private static final b a;
  
  private final ArrayList<Intent> b = new ArrayList();
  
  private final Context c;
  
  static  {
    c c1;
    if (Build.VERSION.SDK_INT >= 11) {
      c1 = new d();
    } else {
      c1 = new c();
    } 
    a = c1;
  }
  
  private ac(Context paramContext) { this.c = paramContext; }
  
  public static ac a(Context paramContext) { return new ac(paramContext); }
  
  public ac a(Activity paramActivity) {
    ComponentName componentName;
    if (paramActivity instanceof a) {
      componentName = ((a)paramActivity).a();
    } else {
      componentName = null;
    } 
    Intent intent = componentName;
    if (componentName == null)
      intent = x.a(paramActivity); 
    if (intent != null) {
      componentName = intent.getComponent();
      ComponentName componentName1 = componentName;
      if (componentName == null)
        componentName1 = intent.resolveActivity(this.c.getPackageManager()); 
      a(componentName1);
      a(intent);
    } 
    return this;
  }
  
  public ac a(ComponentName paramComponentName) {
    int i = this.b.size();
    try {
      Context context = this.c;
      while (true) {
        Intent intent = x.a(context, paramComponentName);
        if (intent != null) {
          this.b.add(i, intent);
          context = this.c;
          ComponentName componentName = intent.getComponent();
          continue;
        } 
        break;
      } 
      return this;
    } catch (android.content.pm.PackageManager.NameNotFoundException paramComponentName) {
      Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
      throw new IllegalArgumentException(paramComponentName);
    } 
  }
  
  public ac a(Intent paramIntent) {
    this.b.add(paramIntent);
    return this;
  }
  
  public void a() { a(null); }
  
  public void a(Bundle paramBundle) {
    if (this.b.isEmpty())
      throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities"); 
    Intent[] arrayOfIntent = (Intent[])this.b.toArray(new Intent[this.b.size()]);
    arrayOfIntent[0] = (new Intent(arrayOfIntent[0])).addFlags(268484608);
    if (!a.a(this.c, arrayOfIntent, paramBundle)) {
      Intent intent = new Intent(arrayOfIntent[arrayOfIntent.length - 1]);
      intent.addFlags(268435456);
      this.c.startActivity(intent);
    } 
  }
  
  public Iterator<Intent> iterator() { return this.b.iterator(); }
  
  public static interface a {
    Intent a();
  }
  
  static interface b {}
  
  static class c implements b {}
  
  static class d implements b {}
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/a/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */