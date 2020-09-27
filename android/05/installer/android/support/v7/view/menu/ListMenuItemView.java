package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView extends LinearLayout implements m.a {
  private h a;
  
  private ImageView b;
  
  private RadioButton c;
  
  private TextView d;
  
  private CheckBox e;
  
  private TextView f;
  
  private Drawable g;
  
  private int h;
  
  private Context i;
  
  private boolean j;
  
  private int k;
  
  private Context l;
  
  private LayoutInflater m;
  
  private boolean n;
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet) { this(paramContext, paramAttributeSet, 0); }
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet);
    this.l = paramContext;
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.MenuView, paramInt, 0);
    this.g = typedArray.getDrawable(a.k.MenuView_android_itemBackground);
    this.h = typedArray.getResourceId(a.k.MenuView_android_itemTextAppearance, -1);
    this.j = typedArray.getBoolean(a.k.MenuView_preserveIconSpacing, false);
    this.i = paramContext;
    typedArray.recycle();
  }
  
  private void b() {
    this.b = (ImageView)getInflater().inflate(a.h.abc_list_menu_item_icon, this, false);
    addView(this.b, 0);
  }
  
  private void c() {
    this.c = (RadioButton)getInflater().inflate(a.h.abc_list_menu_item_radio, this, false);
    addView(this.c);
  }
  
  private void d() {
    this.e = (CheckBox)getInflater().inflate(a.h.abc_list_menu_item_checkbox, this, false);
    addView(this.e);
  }
  
  private LayoutInflater getInflater() {
    if (this.m == null)
      this.m = LayoutInflater.from(this.l); 
    return this.m;
  }
  
  public void a(h paramh, int paramInt) {
    this.a = paramh;
    this.k = paramInt;
    if (paramh.isVisible()) {
      paramInt = 0;
    } else {
      paramInt = 8;
    } 
    setVisibility(paramInt);
    setTitle(paramh.a(this));
    setCheckable(paramh.isCheckable());
    a(paramh.f(), paramh.d());
    setIcon(paramh.getIcon());
    setEnabled(paramh.isEnabled());
  }
  
  public void a(boolean paramBoolean, char paramChar) {
    if (paramBoolean && this.a.f()) {
      paramChar = Character.MIN_VALUE;
    } else {
      paramChar = '\b';
    } 
    if (paramChar == '\000')
      this.f.setText(this.a.e()); 
    if (this.f.getVisibility() != paramChar)
      this.f.setVisibility(paramChar); 
  }
  
  public boolean a() { return false; }
  
  public h getItemData() { return this.a; }
  
  protected void onFinishInflate() {
    super.onFinishInflate();
    setBackgroundDrawable(this.g);
    this.d = (TextView)findViewById(a.f.title);
    if (this.h != -1)
      this.d.setTextAppearance(this.i, this.h); 
    this.f = (TextView)findViewById(a.f.shortcut);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    if (this.b != null && this.j) {
      ViewGroup.LayoutParams layoutParams = getLayoutParams();
      LinearLayout.LayoutParams layoutParams1 = (LinearLayout.LayoutParams)this.b.getLayoutParams();
      if (layoutParams.height > 0 && layoutParams1.width <= 0)
        layoutParams1.width = layoutParams.height; 
    } 
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setCheckable(boolean paramBoolean) {
    RadioButton radioButton;
    CheckBox checkBox;
    if (!paramBoolean && this.c == null && this.e == null)
      return; 
    if (this.a.g()) {
      if (this.c == null)
        c(); 
      checkBox = this.c;
      radioButton = this.e;
    } else {
      if (this.e == null)
        d(); 
      checkBox = this.e;
      radioButton = this.c;
    } 
    if (paramBoolean) {
      byte b1;
      checkBox.setChecked(this.a.isChecked());
      if (paramBoolean) {
        b1 = 0;
      } else {
        b1 = 8;
      } 
      if (checkBox.getVisibility() != b1)
        checkBox.setVisibility(b1); 
      if (radioButton != null && radioButton.getVisibility() != 8) {
        radioButton.setVisibility(8);
        return;
      } 
    } else {
      if (this.e != null)
        this.e.setVisibility(8); 
      if (this.c != null)
        this.c.setVisibility(8); 
    } 
  }
  
  public void setChecked(boolean paramBoolean) {
    CheckBox checkBox;
    if (this.a.g()) {
      if (this.c == null)
        c(); 
      checkBox = this.c;
    } else {
      if (this.e == null)
        d(); 
      checkBox = this.e;
    } 
    checkBox.setChecked(paramBoolean);
  }
  
  public void setForceShowIcon(boolean paramBoolean) {
    this.n = paramBoolean;
    this.j = paramBoolean;
  }
  
  public void setIcon(Drawable paramDrawable) {
    boolean bool;
    if (this.a.i() || this.n) {
      bool = true;
    } else {
      bool = false;
    } 
    if (!bool && !this.j)
      return; 
    if (this.b == null && paramDrawable == null && !this.j)
      return; 
    if (this.b == null)
      b(); 
    if (paramDrawable != null || this.j) {
      ImageView imageView = this.b;
      if (!bool)
        paramDrawable = null; 
      imageView.setImageDrawable(paramDrawable);
      if (this.b.getVisibility() != 0)
        this.b.setVisibility(0); 
      return;
    } 
    this.b.setVisibility(8);
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    byte b1;
    TextView textView;
    if (paramCharSequence != null) {
      this.d.setText(paramCharSequence);
      if (this.d.getVisibility() != 0) {
        textView = this.d;
        b1 = 0;
      } else {
        return;
      } 
    } else {
      int i1 = this.d.getVisibility();
      b1 = 8;
      if (i1 != 8) {
        textView = this.d;
      } else {
        return;
      } 
    } 
    textView.setVisibility(b1);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/view/menu/ListMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */