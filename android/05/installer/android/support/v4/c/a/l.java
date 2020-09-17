package android.support.v4.c.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

class l extends j {
  l(Drawable paramDrawable) { super(paramDrawable); }
  
  l(j.a parama, Resources paramResources) { super(parama, paramResources); }
  
  j.a b() { return new a(this.b, null); }
  
  public void jumpToCurrentState() { this.c.jumpToCurrentState(); }
  
  private static class a extends j.a {
    a(j.a param1a, Resources param1Resources) { super(param1a, param1Resources); }
    
    public Drawable newDrawable(Resources param1Resources) { return new l(this, param1Resources); }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/c/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */