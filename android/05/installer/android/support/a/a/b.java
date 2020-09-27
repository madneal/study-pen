package android.support.a.a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.c.a.a;
import android.support.v4.g.a;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

@TargetApi(21)
public class b extends e implements Animatable {
  private a b;
  
  private Context c;
  
  private ArgbEvaluator d = null;
  
  private final Drawable.Callback e = new Drawable.Callback(this) {
      public void invalidateDrawable(Drawable param1Drawable) { this.a.invalidateSelf(); }
      
      public void scheduleDrawable(Drawable param1Drawable, Runnable param1Runnable, long param1Long) { this.a.scheduleSelf(param1Runnable, param1Long); }
      
      public void unscheduleDrawable(Drawable param1Drawable, Runnable param1Runnable) { this.a.unscheduleSelf(param1Runnable); }
    };
  
  private b() { this(null, null, null); }
  
  private b(Context paramContext) { this(paramContext, null, null); }
  
  private b(Context paramContext, a parama, Resources paramResources) {
    this.c = paramContext;
    if (parama != null) {
      this.b = parama;
      return;
    } 
    this.b = new a(paramContext, parama, this.e, paramResources);
  }
  
  static TypedArray a(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfInt) { return (paramTheme == null) ? paramResources.obtainAttributes(paramAttributeSet, paramArrayOfInt) : paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, 0, 0); }
  
  public static b a(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    b b1 = new b(paramContext);
    b1.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return b1;
  }
  
  private void a(Animator paramAnimator) {
    if (paramAnimator instanceof AnimatorSet) {
      ArrayList arrayList = ((AnimatorSet)paramAnimator).getChildAnimations();
      if (arrayList != null)
        for (byte b1 = 0; b1 < arrayList.size(); b1++)
          a((Animator)arrayList.get(b1));  
    } 
    if (paramAnimator instanceof ObjectAnimator) {
      ObjectAnimator objectAnimator = (ObjectAnimator)paramAnimator;
      String str = objectAnimator.getPropertyName();
      if ("fillColor".equals(str) || "strokeColor".equals(str)) {
        if (this.d == null)
          this.d = new ArgbEvaluator(); 
        objectAnimator.setEvaluator(this.d);
      } 
    } 
  }
  
  private void a(String paramString, Animator paramAnimator) {
    paramAnimator.setTarget(this.b.b.a(paramString));
    if (Build.VERSION.SDK_INT < 21)
      a(paramAnimator); 
    if (this.b.c == null) {
      this.b.c = new ArrayList();
      this.b.d = new a();
    } 
    this.b.c.add(paramAnimator);
    this.b.d.put(paramAnimator, paramString);
  }
  
  private boolean a() {
    ArrayList arrayList = this.b.c;
    if (arrayList == null)
      return false; 
    int i = arrayList.size();
    for (byte b1 = 0; b1 < i; b1++) {
      if (((Animator)arrayList.get(b1)).isRunning())
        return true; 
    } 
    return false;
  }
  
  public void applyTheme(Resources.Theme paramTheme) {
    if (this.a != null)
      a.a(this.a, paramTheme); 
  }
  
  public boolean canApplyTheme() { return (this.a != null) ? a.d(this.a) : 0; }
  
  public void draw(Canvas paramCanvas) {
    if (this.a != null) {
      this.a.draw(paramCanvas);
      return;
    } 
    this.b.b.draw(paramCanvas);
    if (a())
      invalidateSelf(); 
  }
  
  public int getAlpha() { return (this.a != null) ? a.c(this.a) : this.b.b.getAlpha(); }
  
  public int getChangingConfigurations() { return (this.a != null) ? this.a.getChangingConfigurations() : (super.getChangingConfigurations() | this.b.a); }
  
  public Drawable.ConstantState getConstantState() { return (this.a != null) ? new b(this.a.getConstantState()) : null; }
  
  public int getIntrinsicHeight() { return (this.a != null) ? this.a.getIntrinsicHeight() : this.b.b.getIntrinsicHeight(); }
  
  public int getIntrinsicWidth() { return (this.a != null) ? this.a.getIntrinsicWidth() : this.b.b.getIntrinsicWidth(); }
  
  public int getOpacity() { return (this.a != null) ? this.a.getOpacity() : this.b.b.getOpacity(); }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet) { inflate(paramResources, paramXmlPullParser, paramAttributeSet, null); }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    if (this.a != null) {
      a.a(this.a, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    } 
    int i;
    for (i = paramXmlPullParser.getEventType(); i != 1; i = paramXmlPullParser.next()) {
      if (i == 2) {
        TypedArray typedArray = paramXmlPullParser.getName();
        if ("animated-vector".equals(typedArray)) {
          TypedArray typedArray2 = a(paramResources, paramTheme, paramAttributeSet, a.e);
          i = typedArray2.getResourceId(0, 0);
          TypedArray typedArray1 = typedArray2;
          if (i != 0) {
            f f = f.a(paramResources, i, paramTheme);
            f.a(false);
            f.setCallback(this.e);
            if (this.b.b != null)
              this.b.b.setCallback(null); 
            this.b.b = f;
            typedArray = typedArray2;
          } 
        } else if ("target".equals(typedArray)) {
          TypedArray typedArray1 = paramResources.obtainAttributes(paramAttributeSet, a.f);
          String str = typedArray1.getString(0);
          i = typedArray1.getResourceId(1, 0);
          typedArray = typedArray1;
          if (i != 0)
            if (this.c != null) {
              a(str, AnimatorInflater.loadAnimator(this.c, i));
              typedArray = typedArray1;
            } else {
              throw new IllegalStateException("Context can't be null when inflating animators");
            }  
        } else {
          continue;
        } 
        typedArray.recycle();
      } 
      continue;
    } 
  }
  
  public boolean isRunning() {
    if (this.a != null)
      return ((AnimatedVectorDrawable)this.a).isRunning(); 
    ArrayList arrayList = this.b.c;
    int i = arrayList.size();
    for (byte b1 = 0; b1 < i; b1++) {
      if (((Animator)arrayList.get(b1)).isRunning())
        return true; 
    } 
    return false;
  }
  
  public boolean isStateful() { return (this.a != null) ? this.a.isStateful() : this.b.b.isStateful(); }
  
  public Drawable mutate() {
    if (this.a != null) {
      this.a.mutate();
      return this;
    } 
    throw new IllegalStateException("Mutate() is not supported for older platform");
  }
  
  protected void onBoundsChange(Rect paramRect) {
    if (this.a != null) {
      this.a.setBounds(paramRect);
      return;
    } 
    this.b.b.setBounds(paramRect);
  }
  
  protected boolean onLevelChange(int paramInt) { return (this.a != null) ? this.a.setLevel(paramInt) : this.b.b.setLevel(paramInt); }
  
  protected boolean onStateChange(int[] paramArrayOfInt) { return (this.a != null) ? this.a.setState(paramArrayOfInt) : this.b.b.setState(paramArrayOfInt); }
  
  public void setAlpha(int paramInt) {
    if (this.a != null) {
      this.a.setAlpha(paramInt);
      return;
    } 
    this.b.b.setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    if (this.a != null) {
      this.a.setColorFilter(paramColorFilter);
      return;
    } 
    this.b.b.setColorFilter(paramColorFilter);
  }
  
  public void setTint(int paramInt) {
    if (this.a != null) {
      a.a(this.a, paramInt);
      return;
    } 
    this.b.b.setTint(paramInt);
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    if (this.a != null) {
      a.a(this.a, paramColorStateList);
      return;
    } 
    this.b.b.setTintList(paramColorStateList);
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    if (this.a != null) {
      a.a(this.a, paramMode);
      return;
    } 
    this.b.b.setTintMode(paramMode);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    if (this.a != null)
      return this.a.setVisible(paramBoolean1, paramBoolean2); 
    this.b.b.setVisible(paramBoolean1, paramBoolean2);
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void start() {
    if (this.a != null) {
      ((AnimatedVectorDrawable)this.a).start();
      return;
    } 
    if (a())
      return; 
    ArrayList arrayList = this.b.c;
    int i = arrayList.size();
    for (byte b1 = 0; b1 < i; b1++)
      ((Animator)arrayList.get(b1)).start(); 
    invalidateSelf();
  }
  
  public void stop() {
    if (this.a != null) {
      ((AnimatedVectorDrawable)this.a).stop();
      return;
    } 
    ArrayList arrayList = this.b.c;
    int i = arrayList.size();
    for (byte b1 = 0; b1 < i; b1++)
      ((Animator)arrayList.get(b1)).end(); 
  }
  
  private static class a extends Drawable.ConstantState {
    int a;
    
    f b;
    
    ArrayList<Animator> c;
    
    a<Animator, String> d;
    
    public a(Context param1Context, a param1a, Drawable.Callback param1Callback, Resources param1Resources) {
      if (param1a != null) {
        this.a = param1a.a;
        f f1 = param1a.b;
        byte b1 = 0;
        if (f1 != null) {
          Drawable drawable = param1a.b.getConstantState();
          if (param1Resources != null) {
            drawable = drawable.newDrawable(param1Resources);
          } else {
            drawable = drawable.newDrawable();
          } 
          this.b = (f)drawable;
          this.b = (f)this.b.mutate();
          this.b.setCallback(param1Callback);
          this.b.setBounds(param1a.b.getBounds());
          this.b.a(false);
        } 
        if (param1a.c != null) {
          int i = param1a.c.size();
          this.c = new ArrayList(i);
          this.d = new a(i);
          while (b1 < i) {
            Animator animator2 = (Animator)param1a.c.get(b1);
            Animator animator1 = animator2.clone();
            String str = (String)param1a.d.get(animator2);
            animator1.setTarget(this.b.a(str));
            this.c.add(animator1);
            this.d.put(animator1, str);
            b1++;
          } 
        } 
      } 
    }
    
    public int getChangingConfigurations() { return this.a; }
    
    public Drawable newDrawable() { throw new IllegalStateException("No constant state support for SDK < 23."); }
    
    public Drawable newDrawable(Resources param1Resources) { throw new IllegalStateException("No constant state support for SDK < 23."); }
  }
  
  private static class b extends Drawable.ConstantState {
    private final Drawable.ConstantState a;
    
    public b(Drawable.ConstantState param1ConstantState) { this.a = param1ConstantState; }
    
    public boolean canApplyTheme() { return this.a.canApplyTheme(); }
    
    public int getChangingConfigurations() { return this.a.getChangingConfigurations(); }
    
    public Drawable newDrawable() {
      b b1 = new b(null);
      b1.a = this.a.newDrawable();
      b1.a.setCallback(b.a(b1));
      return b1;
    }
    
    public Drawable newDrawable(Resources param1Resources) {
      b b1 = new b(null);
      b1.a = this.a.newDrawable(param1Resources);
      b1.a.setCallback(b.a(b1));
      return b1;
    }
    
    public Drawable newDrawable(Resources param1Resources, Resources.Theme param1Theme) {
      b b1 = new b(null);
      b1.a = this.a.newDrawable(param1Resources, param1Theme);
      b1.a.setCallback(b.a(b1));
      return b1;
    }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */