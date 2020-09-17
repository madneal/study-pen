package android.support.v4.c.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

class m extends l {
  m(Drawable paramDrawable) { super(paramDrawable); }
  
  m(j.a parama, Resources paramResources) { super(parama, paramResources); }
  
  j.a b() { return new a(this.b, null); }
  
  public boolean isAutoMirrored() { return this.c.isAutoMirrored(); }
  
  public void setAutoMirrored(boolean paramBoolean) { this.c.setAutoMirrored(paramBoolean); }
  
  private static class a extends j.a {
    a(j.a param1a, Resources param1Resources) { super(param1a, param1Resources); }
    
    public Drawable newDrawable(Resources param1Resources) { return new m(this, param1Resources); }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/c/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */