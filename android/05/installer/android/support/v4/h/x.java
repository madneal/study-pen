package android.support.v4.h;

import android.view.View;
import android.view.ViewParent;

public class x {
  private final View a;
  
  private ViewParent b;
  
  private boolean c;
  
  private int[] d;
  
  public x(View paramView) { this.a = paramView; }
  
  public void a(boolean paramBoolean) {
    if (this.c)
      af.p(this.a); 
    this.c = paramBoolean;
  }
  
  public boolean a() { return this.c; }
  
  public boolean a(float paramFloat1, float paramFloat2) { return (a() && this.b != null) ? as.a(this.b, this.a, paramFloat1, paramFloat2) : 0; }
  
  public boolean a(float paramFloat1, float paramFloat2, boolean paramBoolean) { return (a() && this.b != null) ? as.a(this.b, this.a, paramFloat1, paramFloat2, paramBoolean) : 0; }
  
  public boolean a(int paramInt) {
    if (b())
      return true; 
    if (a()) {
      ViewParent viewParent = this.a.getParent();
      View view = this.a;
      while (viewParent != null) {
        if (as.a(viewParent, view, this.a, paramInt)) {
          this.b = viewParent;
          as.b(viewParent, view, this.a, paramInt);
          return true;
        } 
        if (viewParent instanceof View)
          view = (View)viewParent; 
        viewParent = viewParent.getParent();
      } 
    } 
    return false;
  }
  
  public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt) {
    if (a() && this.b != null) {
      if (paramInt1 != 0 || paramInt2 != 0 || paramInt3 != 0 || paramInt4 != 0) {
        int j;
        int i;
        if (paramArrayOfInt != null) {
          this.a.getLocationInWindow(paramArrayOfInt);
          i = paramArrayOfInt[0];
          j = paramArrayOfInt[1];
        } else {
          i = 0;
          j = 0;
        } 
        as.a(this.b, this.a, paramInt1, paramInt2, paramInt3, paramInt4);
        if (paramArrayOfInt != null) {
          this.a.getLocationInWindow(paramArrayOfInt);
          paramArrayOfInt[0] = paramArrayOfInt[0] - i;
          paramArrayOfInt[1] = paramArrayOfInt[1] - j;
        } 
        return true;
      } 
      if (paramArrayOfInt != null) {
        paramArrayOfInt[0] = 0;
        paramArrayOfInt[1] = 0;
        return false;
      } 
    } 
    return false;
  }
  
  public boolean a(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2) {
    if (a() && this.b != null) {
      boolean bool = true;
      if (paramInt1 != 0 || paramInt2 != 0) {
        int j;
        int i;
        if (paramArrayOfInt2 != null) {
          this.a.getLocationInWindow(paramArrayOfInt2);
          i = paramArrayOfInt2[0];
          j = paramArrayOfInt2[1];
        } else {
          i = 0;
          j = 0;
        } 
        int[] arrayOfInt = paramArrayOfInt1;
        if (paramArrayOfInt1 == null) {
          if (this.d == null)
            this.d = new int[2]; 
          arrayOfInt = this.d;
        } 
        arrayOfInt[0] = 0;
        arrayOfInt[1] = 0;
        as.a(this.b, this.a, paramInt1, paramInt2, arrayOfInt);
        if (paramArrayOfInt2 != null) {
          this.a.getLocationInWindow(paramArrayOfInt2);
          paramArrayOfInt2[0] = paramArrayOfInt2[0] - i;
          paramArrayOfInt2[1] = paramArrayOfInt2[1] - j;
        } 
        if (arrayOfInt[0] == 0) {
          if (arrayOfInt[1] != 0)
            return true; 
          bool = false;
        } 
        return bool;
      } 
      if (paramArrayOfInt2 != null) {
        paramArrayOfInt2[0] = 0;
        paramArrayOfInt2[1] = 0;
        return false;
      } 
    } 
    return false;
  }
  
  public boolean b() { return (this.b != null); }
  
  public void c() {
    if (this.b != null) {
      as.a(this.b, this.a);
      this.b = null;
    } 
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/h/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */