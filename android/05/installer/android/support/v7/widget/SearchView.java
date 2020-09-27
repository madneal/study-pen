package android.support.v7.widget;

import android.annotation.TargetApi;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.widget.f;
import android.support.v7.b.a;
import android.support.v7.view.c;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends af implements c {
  static final a a;
  
  private static final boolean b;
  
  private boolean A;
  
  private boolean B;
  
  private int C;
  
  private boolean D;
  
  private CharSequence E;
  
  private boolean F;
  
  private int G;
  
  private SearchableInfo H;
  
  private Bundle I;
  
  private Runnable J;
  
  private final Runnable K;
  
  private Runnable L;
  
  private final WeakHashMap<String, Drawable.ConstantState> M;
  
  private final SearchAutoComplete c;
  
  private final View d;
  
  private final View e;
  
  private final ImageView f;
  
  private final ImageView g;
  
  private final ImageView h;
  
  private final ImageView i;
  
  private final ImageView j;
  
  private final Drawable k;
  
  private final int l;
  
  private final int m;
  
  private final Intent n;
  
  private final Intent o;
  
  private final CharSequence p;
  
  private c q;
  
  private b r;
  
  private View.OnFocusChangeListener s;
  
  private d t;
  
  private View.OnClickListener u;
  
  private boolean v;
  
  private boolean w;
  
  private f x;
  
  private boolean y;
  
  private CharSequence z;
  
  static  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 8) {
      bool = true;
    } else {
      bool = false;
    } 
    b = bool;
    a = new a();
  }
  
  private Intent a(String paramString1, Uri paramUri, String paramString2, String paramString3, int paramInt, String paramString4) {
    Intent intent = new Intent(paramString1);
    intent.addFlags(268435456);
    if (paramUri != null)
      intent.setData(paramUri); 
    intent.putExtra("user_query", this.E);
    if (paramString3 != null)
      intent.putExtra("query", paramString3); 
    if (paramString2 != null)
      intent.putExtra("intent_extra_data_key", paramString2); 
    if (this.I != null)
      intent.putExtra("app_data", this.I); 
    if (paramInt != 0) {
      intent.putExtra("action_key", paramInt);
      intent.putExtra("action_msg", paramString4);
    } 
    if (b)
      intent.setComponent(this.H.getSearchActivity()); 
    return intent;
  }
  
  private void a(int paramInt, String paramString1, String paramString2) {
    Intent intent = a("android.intent.action.SEARCH", null, null, paramString2, paramInt, paramString1);
    getContext().startActivity(intent);
  }
  
  private void a(boolean paramBoolean) {
    this.w = paramBoolean;
    byte b1 = 8;
    boolean bool = false;
    if (paramBoolean) {
      b2 = 0;
    } else {
      b2 = 8;
    } 
    boolean bool1 = TextUtils.isEmpty(this.c.getText()) ^ true;
    this.f.setVisibility(b2);
    b(bool1);
    View view = this.d;
    if (paramBoolean) {
      b2 = 8;
    } else {
      b2 = 0;
    } 
    view.setVisibility(b2);
    byte b2 = b1;
    if (this.j.getDrawable() != null)
      if (this.v) {
        b2 = b1;
      } else {
        b2 = 0;
      }  
    this.j.setVisibility(b2);
    h();
    paramBoolean = bool;
    if (!bool1)
      paramBoolean = true; 
    c(paramBoolean);
    g();
  }
  
  static boolean a(Context paramContext) { return ((paramContext.getResources().getConfiguration()).orientation == 2); }
  
  private CharSequence b(CharSequence paramCharSequence) {
    if (this.v) {
      if (this.k == null)
        return paramCharSequence; 
      int i1 = (int)(this.c.getTextSize() * 1.25D);
      this.k.setBounds(0, 0, i1, i1);
      SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
      spannableStringBuilder.setSpan(new ImageSpan(this.k), 1, 2, 33);
      spannableStringBuilder.append(paramCharSequence);
      return spannableStringBuilder;
    } 
    return paramCharSequence;
  }
  
  private void b(boolean paramBoolean) {
    byte b1;
    if (this.y && f() && hasFocus() && (paramBoolean || !this.D)) {
      b1 = 0;
    } else {
      b1 = 8;
    } 
    this.g.setVisibility(b1);
  }
  
  private void c(boolean paramBoolean) {
    byte b1;
    if (this.D && !c() && paramBoolean) {
      b1 = 0;
      this.g.setVisibility(8);
    } else {
      b1 = 8;
    } 
    this.i.setVisibility(b1);
  }
  
  @TargetApi(8)
  private boolean e() {
    SearchableInfo searchableInfo = this.H;
    byte b1 = 0;
    int i1 = b1;
    if (searchableInfo != null) {
      i1 = b1;
      if (this.H.getVoiceSearchEnabled()) {
        Intent intent;
        searchableInfo = null;
        if (this.H.getVoiceSearchLaunchWebSearch()) {
          intent = this.n;
        } else if (this.H.getVoiceSearchLaunchRecognizer()) {
          intent = this.o;
        } 
        i1 = b1;
        if (intent != null) {
          i1 = b1;
          if (getContext().getPackageManager().resolveActivity(intent, 65536) != null)
            i1 = 1; 
        } 
      } 
    } 
    return i1;
  }
  
  private boolean f() { return ((this.y || this.D) && !c()); }
  
  private void g() {
    byte b1;
    if (f() && (this.g.getVisibility() == 0 || this.i.getVisibility() == 0)) {
      b1 = 0;
    } else {
      b1 = 8;
    } 
    this.e.setVisibility(b1);
  }
  
  private int getPreferredWidth() { return getContext().getResources().getDimensionPixelSize(a.d.abc_search_view_preferred_width); }
  
  private void h() {
    boolean bool1 = TextUtils.isEmpty(this.c.getText());
    byte b1 = 1;
    boolean bool2 = bool1 ^ true;
    byte b2 = 0;
    byte b3 = b1;
    if (!bool2)
      if (this.v && !this.F) {
        b3 = b1;
      } else {
        b3 = 0;
      }  
    ImageView imageView = this.h;
    if (b3 != 0) {
      b3 = b2;
    } else {
      b3 = 8;
    } 
    imageView.setVisibility(b3);
    Drawable drawable = this.h.getDrawable();
    if (drawable != null) {
      int[] arrayOfInt;
      if (bool2) {
        arrayOfInt = ENABLED_STATE_SET;
      } else {
        arrayOfInt = EMPTY_STATE_SET;
      } 
      drawable.setState(arrayOfInt);
    } 
  }
  
  private void i() { post(this.K); }
  
  private void k() {
    CharSequence charSequence1 = getQueryHint();
    SearchAutoComplete searchAutoComplete = this.c;
    CharSequence charSequence2 = charSequence1;
    if (charSequence1 == null)
      charSequence2 = ""; 
    searchAutoComplete.setHint(b(charSequence2));
  }
  
  @TargetApi(8)
  private void l() {
    this.c.setThreshold(this.H.getSuggestThreshold());
    this.c.setImeOptions(this.H.getImeOptions());
    int i1 = this.H.getInputType();
    int i2 = 1;
    int i3 = i1;
    if ((i1 & 0xF) == 1) {
      i1 &= 0xFFFEFFFF;
      i3 = i1;
      if (this.H.getSuggestAuthority() != null)
        i3 = i1 | 0x10000 | 0x80000; 
    } 
    this.c.setInputType(i3);
    if (this.x != null)
      this.x.a(null); 
    if (this.H.getSuggestAuthority() != null) {
      this.x = new al(getContext(), this, this.H, this.M);
      this.c.setAdapter(this.x);
      al al = (al)this.x;
      i3 = i2;
      if (this.A)
        i3 = 2; 
      al.a(i3);
    } 
  }
  
  private void m() {
    Editable editable = this.c.getText();
    if (editable != null && TextUtils.getTrimmedLength(editable) > 0 && (this.q == null || !this.q.a(editable.toString()))) {
      if (this.H != null)
        a(0, null, editable.toString()); 
      setImeVisibility(false);
      n();
    } 
  }
  
  private void n() { this.c.dismissDropDown(); }
  
  private void o() {
    if (TextUtils.isEmpty(this.c.getText())) {
      if (this.v && (this.r == null || !this.r.a())) {
        clearFocus();
        a(true);
        return;
      } 
    } else {
      this.c.setText("");
      this.c.requestFocus();
      setImeVisibility(true);
    } 
  }
  
  private void p() {
    a(false);
    this.c.requestFocus();
    setImeVisibility(true);
    if (this.u != null)
      this.u.onClick(this); 
  }
  
  private void q() {
    a.a(this.c);
    a.b(this.c);
  }
  
  private void setImeVisibility(boolean paramBoolean) {
    if (paramBoolean) {
      post(this.J);
      return;
    } 
    removeCallbacks(this.J);
    InputMethodManager inputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
    if (inputMethodManager != null)
      inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0); 
  }
  
  private void setQuery(CharSequence paramCharSequence) {
    int i1;
    this.c.setText(paramCharSequence);
    SearchAutoComplete searchAutoComplete = this.c;
    if (TextUtils.isEmpty(paramCharSequence)) {
      i1 = 0;
    } else {
      i1 = paramCharSequence.length();
    } 
    searchAutoComplete.setSelection(i1);
  }
  
  public void a() {
    if (this.F)
      return; 
    this.F = true;
    this.G = this.c.getImeOptions();
    this.c.setImeOptions(this.G | 0x2000000);
    this.c.setText("");
    setIconified(false);
  }
  
  void a(CharSequence paramCharSequence) { setQuery(paramCharSequence); }
  
  public void a(CharSequence paramCharSequence, boolean paramBoolean) {
    this.c.setText(paramCharSequence);
    if (paramCharSequence != null) {
      this.c.setSelection(this.c.length());
      this.E = paramCharSequence;
    } 
    if (paramBoolean && !TextUtils.isEmpty(paramCharSequence))
      m(); 
  }
  
  public void b() {
    a("", false);
    clearFocus();
    a(true);
    this.c.setImeOptions(this.G);
    this.F = false;
  }
  
  public boolean c() { return this.w; }
  
  public void clearFocus() {
    this.B = true;
    setImeVisibility(false);
    super.clearFocus();
    this.c.clearFocus();
    this.B = false;
  }
  
  void d() {
    a(c());
    i();
    if (this.c.hasFocus())
      q(); 
  }
  
  public int getImeOptions() { return this.c.getImeOptions(); }
  
  public int getInputType() { return this.c.getInputType(); }
  
  public int getMaxWidth() { return this.C; }
  
  public CharSequence getQuery() { return this.c.getText(); }
  
  public CharSequence getQueryHint() { return (this.z != null) ? this.z : ((b && this.H != null && this.H.getHintId() != 0) ? getContext().getText(this.H.getHintId()) : this.p); }
  
  int getSuggestionCommitIconResId() { return this.m; }
  
  int getSuggestionRowLayout() { return this.l; }
  
  public f getSuggestionsAdapter() { return this.x; }
  
  protected void onDetachedFromWindow() {
    removeCallbacks(this.K);
    post(this.L);
    super.onDetachedFromWindow();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) { // Byte code:
    //   0: aload_0
    //   1: invokevirtual c : ()Z
    //   4: ifeq -> 14
    //   7: aload_0
    //   8: iload_1
    //   9: iload_2
    //   10: invokespecial onMeasure : (II)V
    //   13: return
    //   14: iload_1
    //   15: invokestatic getMode : (I)I
    //   18: istore_3
    //   19: iload_1
    //   20: invokestatic getSize : (I)I
    //   23: istore #4
    //   25: iload_3
    //   26: ldc_w -2147483648
    //   29: if_icmpeq -> 85
    //   32: iload_3
    //   33: ifeq -> 62
    //   36: iload_3
    //   37: ldc_w 1073741824
    //   40: if_icmpeq -> 49
    //   43: iload #4
    //   45: istore_1
    //   46: goto -> 115
    //   49: iload #4
    //   51: istore_1
    //   52: aload_0
    //   53: getfield C : I
    //   56: ifle -> 115
    //   59: goto -> 92
    //   62: aload_0
    //   63: getfield C : I
    //   66: ifle -> 77
    //   69: aload_0
    //   70: getfield C : I
    //   73: istore_1
    //   74: goto -> 115
    //   77: aload_0
    //   78: invokespecial getPreferredWidth : ()I
    //   81: istore_1
    //   82: goto -> 115
    //   85: aload_0
    //   86: getfield C : I
    //   89: ifle -> 107
    //   92: aload_0
    //   93: getfield C : I
    //   96: istore_1
    //   97: iload_1
    //   98: iload #4
    //   100: invokestatic min : (II)I
    //   103: istore_1
    //   104: goto -> 115
    //   107: aload_0
    //   108: invokespecial getPreferredWidth : ()I
    //   111: istore_1
    //   112: goto -> 97
    //   115: aload_0
    //   116: iload_1
    //   117: ldc_w 1073741824
    //   120: invokestatic makeMeasureSpec : (II)I
    //   123: iload_2
    //   124: invokespecial onMeasure : (II)V
    //   127: return }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof e)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    e e1 = (e)paramParcelable;
    super.onRestoreInstanceState(e1.getSuperState());
    a(e1.a);
    requestLayout();
  }
  
  protected Parcelable onSaveInstanceState() {
    e e1 = new e(super.onSaveInstanceState());
    e1.a = c();
    return e1;
  }
  
  public void onWindowFocusChanged(boolean paramBoolean) {
    super.onWindowFocusChanged(paramBoolean);
    i();
  }
  
  public boolean requestFocus(int paramInt, Rect paramRect) {
    if (this.B)
      return false; 
    if (!isFocusable())
      return false; 
    if (!c()) {
      boolean bool = this.c.requestFocus(paramInt, paramRect);
      if (bool)
        a(false); 
      return bool;
    } 
    return super.requestFocus(paramInt, paramRect);
  }
  
  public void setAppSearchData(Bundle paramBundle) { this.I = paramBundle; }
  
  public void setIconified(boolean paramBoolean) {
    if (paramBoolean) {
      o();
      return;
    } 
    p();
  }
  
  public void setIconifiedByDefault(boolean paramBoolean) {
    if (this.v == paramBoolean)
      return; 
    this.v = paramBoolean;
    a(paramBoolean);
    k();
  }
  
  public void setImeOptions(int paramInt) { this.c.setImeOptions(paramInt); }
  
  public void setInputType(int paramInt) { this.c.setInputType(paramInt); }
  
  public void setMaxWidth(int paramInt) {
    this.C = paramInt;
    requestLayout();
  }
  
  public void setOnCloseListener(b paramb) { this.r = paramb; }
  
  public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener) { this.s = paramOnFocusChangeListener; }
  
  public void setOnQueryTextListener(c paramc) { this.q = paramc; }
  
  public void setOnSearchClickListener(View.OnClickListener paramOnClickListener) { this.u = paramOnClickListener; }
  
  public void setOnSuggestionListener(d paramd) { this.t = paramd; }
  
  public void setQueryHint(CharSequence paramCharSequence) {
    this.z = paramCharSequence;
    k();
  }
  
  public void setQueryRefinementEnabled(boolean paramBoolean) {
    this.A = paramBoolean;
    if (this.x instanceof al) {
      byte b1;
      al al = (al)this.x;
      if (paramBoolean) {
        b1 = 2;
      } else {
        b1 = 1;
      } 
      al.a(b1);
    } 
  }
  
  public void setSearchableInfo(SearchableInfo paramSearchableInfo) {
    boolean bool;
    this.H = paramSearchableInfo;
    if (this.H != null) {
      if (b)
        l(); 
      k();
    } 
    if (b && e()) {
      bool = true;
    } else {
      bool = false;
    } 
    this.D = bool;
    if (this.D)
      this.c.setPrivateImeOptions("nm"); 
    a(c());
  }
  
  public void setSubmitButtonEnabled(boolean paramBoolean) {
    this.y = paramBoolean;
    a(c());
  }
  
  public void setSuggestionsAdapter(f paramf) {
    this.x = paramf;
    this.c.setAdapter(this.x);
  }
  
  public static class SearchAutoComplete extends f {
    private int a = getThreshold();
    
    private SearchView b;
    
    public SearchAutoComplete(Context param1Context) { this(param1Context, null); }
    
    public SearchAutoComplete(Context param1Context, AttributeSet param1AttributeSet) { this(param1Context, param1AttributeSet, a.a.autoCompleteTextViewStyle); }
    
    public SearchAutoComplete(Context param1Context, AttributeSet param1AttributeSet, int param1Int) { super(param1Context, param1AttributeSet, param1Int); }
    
    public boolean enoughToFilter() { return (this.a <= 0 || super.enoughToFilter()); }
    
    protected void onFocusChanged(boolean param1Boolean, int param1Int, Rect param1Rect) {
      super.onFocusChanged(param1Boolean, param1Int, param1Rect);
      this.b.d();
    }
    
    public boolean onKeyPreIme(int param1Int, KeyEvent param1KeyEvent) {
      if (param1Int == 4) {
        if (param1KeyEvent.getAction() == 0 && param1KeyEvent.getRepeatCount() == 0) {
          KeyEvent.DispatcherState dispatcherState = getKeyDispatcherState();
          if (dispatcherState != null)
            dispatcherState.startTracking(param1KeyEvent, this); 
          return true;
        } 
        if (param1KeyEvent.getAction() == 1) {
          KeyEvent.DispatcherState dispatcherState = getKeyDispatcherState();
          if (dispatcherState != null)
            dispatcherState.handleUpEvent(param1KeyEvent); 
          if (param1KeyEvent.isTracking() && !param1KeyEvent.isCanceled()) {
            this.b.clearFocus();
            SearchView.a(this.b, false);
            return true;
          } 
        } 
      } 
      return super.onKeyPreIme(param1Int, param1KeyEvent);
    }
    
    public void onWindowFocusChanged(boolean param1Boolean) {
      super.onWindowFocusChanged(param1Boolean);
      if (param1Boolean && this.b.hasFocus() && getVisibility() == 0) {
        ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
        if (SearchView.a(getContext()))
          SearchView.a.a(this, true); 
      } 
    }
    
    public void performCompletion() {}
    
    protected void replaceText(CharSequence param1CharSequence) {}
    
    void setSearchView(SearchView param1SearchView) { this.b = param1SearchView; }
    
    public void setThreshold(int param1Int) {
      super.setThreshold(param1Int);
      this.a = param1Int;
    }
  }
  
  private static class a {
    private Method a;
    
    private Method b;
    
    private Method c;
    
    private Method d;
    
    a() {
      try {
        this.a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
        this.a.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {}
      try {
        this.b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
        this.b.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {}
      try {
        this.c = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[] { boolean.class });
        this.c.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {}
      try {
        this.d = InputMethodManager.class.getMethod("showSoftInputUnchecked", new Class[] { int.class, android.os.ResultReceiver.class });
        this.d.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {}
    }
    
    void a(AutoCompleteTextView param1AutoCompleteTextView) {
      if (this.a != null)
        try {
          this.a.invoke(param1AutoCompleteTextView, new Object[0]);
        } catch (Exception param1AutoCompleteTextView) {} 
    }
    
    void a(AutoCompleteTextView param1AutoCompleteTextView, boolean param1Boolean) {
      if (this.c != null)
        try {
          this.c.invoke(param1AutoCompleteTextView, new Object[] { Boolean.valueOf(param1Boolean) });
        } catch (Exception param1AutoCompleteTextView) {} 
    }
    
    void b(AutoCompleteTextView param1AutoCompleteTextView) {
      if (this.b != null)
        try {
          this.b.invoke(param1AutoCompleteTextView, new Object[0]);
        } catch (Exception param1AutoCompleteTextView) {} 
    }
  }
  
  public static interface b {
    boolean a();
  }
  
  public static interface c {
    boolean a(String param1String);
  }
  
  public static interface d {}
  
  static class e extends View.BaseSavedState {
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() {
        public SearchView.e a(Parcel param2Parcel) { return new SearchView.e(param2Parcel); }
        
        public SearchView.e[] a(int param2Int) { return new SearchView.e[param2Int]; }
      };
    
    boolean a;
    
    public e(Parcel param1Parcel) {
      super(param1Parcel);
      this.a = ((Boolean)param1Parcel.readValue(null)).booleanValue();
    }
    
    e(Parcelable param1Parcelable) { super(param1Parcelable); }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("SearchView.SavedState{");
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append(" isIconified=");
      stringBuilder.append(this.a);
      stringBuilder.append("}");
      return stringBuilder.toString();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeValue(Boolean.valueOf(this.a));
    }
  }
  
  static final class null extends Object implements Parcelable.Creator<e> {
    public SearchView.e a(Parcel param1Parcel) { return new SearchView.e(param1Parcel); }
    
    public SearchView.e[] a(int param1Int) { return new SearchView.e[param1Int]; }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/SearchView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */