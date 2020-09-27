package android.support.v4.a;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.v4.g.h;
import android.support.v4.g.i;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public class l extends j {
  final Handler a = new Handler(this) {
      public void handleMessage(Message param1Message) {
        switch (param1Message.what) {
          default:
            super.handleMessage(param1Message);
            return;
          case 2:
            this.a.b();
            this.a.b.n();
            return;
          case 1:
            break;
        } 
        if (this.a.e)
          this.a.a(false); 
      }
    };
  
  final n b = n.a(new a(this));
  
  boolean c;
  
  boolean d;
  
  boolean e;
  
  boolean f;
  
  boolean g;
  
  boolean h;
  
  int i;
  
  boolean j;
  
  i<String> k;
  
  private static String a(View paramView) {
    int i2;
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append(paramView.getClass().getName());
    stringBuilder.append('{');
    stringBuilder.append(Integer.toHexString(System.identityHashCode(paramView)));
    stringBuilder.append(' ');
    int m = paramView.getVisibility();
    char c1 = 'V';
    int i1 = 46;
    if (m != 0) {
      if (m != 4) {
        if (m != 8) {
          stringBuilder.append('.');
        } else {
          m = 71;
          i2 = m;
          stringBuilder.append(i2);
        } 
      } else {
        m = 73;
        i2 = m;
        stringBuilder.append(i2);
      } 
    } else {
      stringBuilder.append('V');
    } 
    boolean bool = paramView.isFocusable();
    m = 70;
    if (bool) {
      byte b1 = 70;
      i2 = b1;
    } else {
      byte b1 = 46;
      i2 = b1;
    } 
    stringBuilder.append(i2);
    if (paramView.isEnabled()) {
      char c3 = 'E';
      i2 = c3;
    } else {
      char c3 = '.';
      i2 = c3;
    } 
    stringBuilder.append(i2);
    if (paramView.willNotDraw()) {
      char c3 = '.';
      i2 = c3;
    } else {
      char c3 = 'D';
      i2 = c3;
    } 
    stringBuilder.append(i2);
    if (paramView.isHorizontalScrollBarEnabled()) {
      char c3 = 'H';
      i2 = c3;
    } else {
      char c3 = '.';
      i2 = c3;
    } 
    stringBuilder.append(i2);
    if (paramView.isVerticalScrollBarEnabled()) {
      i2 = c1;
    } else {
      c1 = '.';
      i2 = c1;
    } 
    stringBuilder.append(i2);
    if (paramView.isClickable()) {
      c1 = 'C';
      i2 = c1;
    } else {
      c1 = '.';
      i2 = c1;
    } 
    stringBuilder.append(i2);
    if (paramView.isLongClickable()) {
      c1 = 'L';
      i2 = c1;
    } else {
      c1 = '.';
      i2 = c1;
    } 
    stringBuilder.append(i2);
    stringBuilder.append(' ');
    if (paramView.isFocused()) {
      int i3 = m;
    } else {
      m = 46;
      i2 = m;
    } 
    stringBuilder.append(i2);
    if (paramView.isSelected()) {
      m = 83;
      int i3 = m;
    } else {
      m = 46;
      i2 = m;
    } 
    stringBuilder.append(i2);
    char c2 = i1;
    if (paramView.isPressed()) {
      i1 = 80;
      c2 = i1;
    } 
    stringBuilder.append(c2);
    stringBuilder.append(' ');
    stringBuilder.append(paramView.getLeft());
    stringBuilder.append(',');
    stringBuilder.append(paramView.getTop());
    stringBuilder.append('-');
    stringBuilder.append(paramView.getRight());
    stringBuilder.append(',');
    stringBuilder.append(paramView.getBottom());
    m = paramView.getId();
    if (m != -1) {
      stringBuilder.append(" #");
      stringBuilder.append(Integer.toHexString(m));
      Resources resources = paramView.getResources();
      if (m != 0 && resources != null) {
        String str;
        i1 = 0xFF000000 & m;
        if (i1 != 16777216) {
          if (i1 != 2130706432) {
            try {
              String str1 = resources.getResourcePackageName(m);
              String str2 = resources.getResourceTypeName(m);
              str = resources.getResourceEntryName(m);
              stringBuilder.append(" ");
              stringBuilder.append(str1);
              stringBuilder.append(":");
              stringBuilder.append(str2);
              stringBuilder.append("/");
              stringBuilder.append(str);
            } catch (android.content.res.Resources.NotFoundException paramView) {}
          } else {
            String str1 = "app";
            String str2 = str.getResourceTypeName(m);
            str = str.getResourceEntryName(m);
            stringBuilder.append(" ");
            stringBuilder.append(str1);
            stringBuilder.append(":");
            stringBuilder.append(str2);
            stringBuilder.append("/");
            stringBuilder.append(str);
          } 
        } else {
          String str1 = "android";
          String str2 = str.getResourceTypeName(m);
          str = str.getResourceEntryName(m);
          stringBuilder.append(" ");
          stringBuilder.append(str1);
          stringBuilder.append(":");
          stringBuilder.append(str2);
          stringBuilder.append("/");
          stringBuilder.append(str);
        } 
      } 
    } 
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  private void a(String paramString, PrintWriter paramPrintWriter, View paramView) {
    paramPrintWriter.print(paramString);
    if (paramView == null) {
      paramPrintWriter.println("null");
      return;
    } 
    paramPrintWriter.println(a(paramView));
    if (!(paramView instanceof ViewGroup))
      return; 
    ViewGroup viewGroup = (ViewGroup)paramView;
    int m = viewGroup.getChildCount();
    if (m <= 0)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append("  ");
    paramString = stringBuilder.toString();
    for (byte b1 = 0; b1 < m; b1++)
      a(paramString, paramPrintWriter, viewGroup.getChildAt(b1)); 
  }
  
  final View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet) { return this.b.a(paramView, paramString, paramContext, paramAttributeSet); }
  
  public void a(k paramk) {}
  
  void a(boolean paramBoolean) {
    if (!this.f) {
      this.f = true;
      this.g = paramBoolean;
      this.a.removeMessages(1);
      e();
    } 
  }
  
  protected boolean a(View paramView, Menu paramMenu) { return super.onPreparePanel(0, paramView, paramMenu); }
  
  protected void b() { this.b.h(); }
  
  public Object c() { return null; }
  
  public void d() {
    if (Build.VERSION.SDK_INT >= 11) {
      b.a(this);
      return;
    } 
    this.h = true;
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    int m = Build.VERSION.SDK_INT;
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(paramString);
    stringBuilder2.append("  ");
    String str = stringBuilder2.toString();
    paramPrintWriter.print(str);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(this.c);
    paramPrintWriter.print("mResumed=");
    paramPrintWriter.print(this.d);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(this.e);
    paramPrintWriter.print(" mReallyStopped=");
    paramPrintWriter.println(this.f);
    this.b.a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    this.b.a().a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.println("View Hierarchy:");
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append(paramString);
    stringBuilder1.append("  ");
    a(stringBuilder1.toString(), paramPrintWriter, getWindow().getDecorView());
  }
  
  void e() {
    this.b.a(this.g);
    this.b.k();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    StringBuilder stringBuilder;
    this.b.b();
    int m = paramInt1 >> 16;
    if (m != 0) {
      String str = (String)this.k.a(--m);
      this.k.c(m);
      if (str == null) {
        Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
        return;
      } 
      k k1 = this.b.a(str);
      if (k1 == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Activity result no fragment exists for who: ");
        stringBuilder.append(str);
        Log.w("FragmentActivity", stringBuilder.toString());
        return;
      } 
      k1.a(paramInt1 & 0xFFFF, paramInt2, stringBuilder);
      return;
    } 
    super.onActivityResult(paramInt1, paramInt2, stringBuilder);
  }
  
  public void onBackPressed() {
    if (!this.b.a().a())
      a_(); 
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    this.b.a(paramConfiguration);
  }
  
  protected void onCreate(Bundle paramBundle) {
    n n1 = this.b;
    List list = null;
    n1.a(null);
    super.onCreate(paramBundle);
    b b1 = (b)getLastNonConfigurationInstance();
    if (b1 != null)
      this.b.a(b1.c); 
    if (paramBundle != null) {
      Parcelable parcelable = paramBundle.getParcelable("android:support:fragments");
      n n2 = this.b;
      if (b1 != null)
        list = b1.b; 
      n2.a(parcelable, list);
      if (paramBundle.containsKey("android:support:next_request_index")) {
        this.i = paramBundle.getInt("android:support:next_request_index");
        int[] arrayOfInt = paramBundle.getIntArray("android:support:request_indicies");
        String[] arrayOfString = paramBundle.getStringArray("android:support:request_fragment_who");
        if (arrayOfInt == null || arrayOfString == null || arrayOfInt.length != arrayOfString.length) {
          Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
        } else {
          this.k = new i(arrayOfInt.length);
          for (byte b2 = 0; b2 < arrayOfInt.length; b2++)
            this.k.b(arrayOfInt[b2], arrayOfString[b2]); 
        } 
      } 
    } 
    if (this.k == null) {
      this.k = new i();
      this.i = 0;
    } 
    this.b.e();
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu) {
    if (paramInt == 0) {
      boolean bool1 = super.onCreatePanelMenu(paramInt, paramMenu);
      boolean bool2 = this.b.a(paramMenu, getMenuInflater());
      return (Build.VERSION.SDK_INT >= 11) ? (bool1 | bool2) : 1;
    } 
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  protected void onDestroy() {
    super.onDestroy();
    a(false);
    this.b.l();
    this.b.p();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (Build.VERSION.SDK_INT < 5 && paramInt == 4 && paramKeyEvent.getRepeatCount() == 0) {
      onBackPressed();
      return true;
    } 
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onLowMemory() {
    super.onLowMemory();
    this.b.m();
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem) { return super.onMenuItemSelected(paramInt, paramMenuItem) ? true : ((paramInt != 0) ? ((paramInt != 6) ? false : this.b.b(paramMenuItem)) : this.b.a(paramMenuItem)); }
  
  protected void onNewIntent(Intent paramIntent) {
    super.onNewIntent(paramIntent);
    this.b.b();
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu) {
    if (paramInt == 0)
      this.b.b(paramMenu); 
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  protected void onPause() {
    super.onPause();
    this.d = false;
    if (this.a.hasMessages(2)) {
      this.a.removeMessages(2);
      b();
    } 
    this.b.i();
  }
  
  protected void onPostResume() {
    super.onPostResume();
    this.a.removeMessages(2);
    b();
    this.b.n();
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu) {
    if (paramInt == 0 && paramMenu != null) {
      if (this.h) {
        this.h = false;
        paramMenu.clear();
        onCreatePanelMenu(paramInt, paramMenu);
      } 
      return a(paramView, paramMenu) | this.b.a(paramMenu);
    } 
    return super.onPreparePanel(paramInt, paramView, paramMenu);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt) {
    int m = paramInt >> 16 & 0xFFFF;
    if (m != 0) {
      StringBuilder stringBuilder;
      String str = (String)this.k.a(--m);
      this.k.c(m);
      if (str == null) {
        Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
        return;
      } 
      k k1 = this.b.a(str);
      if (k1 == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Activity result no fragment exists for who: ");
        stringBuilder.append(str);
        Log.w("FragmentActivity", stringBuilder.toString());
        return;
      } 
      k1.a(paramInt & 0xFFFF, stringBuilder, paramArrayOfInt);
    } 
  }
  
  protected void onResume() {
    super.onResume();
    this.a.sendEmptyMessage(2);
    this.d = true;
    this.b.n();
  }
  
  public final Object onRetainNonConfigurationInstance() {
    if (this.e)
      a(true); 
    Object object = c();
    List list = this.b.d();
    h h1 = this.b.r();
    if (list == null && h1 == null && object == null)
      return null; 
    b b1 = new b();
    b1.a = object;
    b1.b = list;
    b1.c = h1;
    return b1;
  }
  
  protected void onSaveInstanceState(Bundle paramBundle) {
    super.onSaveInstanceState(paramBundle);
    Parcelable parcelable = this.b.c();
    if (parcelable != null)
      paramBundle.putParcelable("android:support:fragments", parcelable); 
    if (this.k.b() > 0) {
      paramBundle.putInt("android:support:next_request_index", this.i);
      int[] arrayOfInt = new int[this.k.b()];
      String[] arrayOfString = new String[this.k.b()];
      for (byte b1 = 0; b1 < this.k.b(); b1++) {
        arrayOfInt[b1] = this.k.d(b1);
        arrayOfString[b1] = (String)this.k.e(b1);
      } 
      paramBundle.putIntArray("android:support:request_indicies", arrayOfInt);
      paramBundle.putStringArray("android:support:request_fragment_who", arrayOfString);
    } 
  }
  
  protected void onStart() {
    super.onStart();
    this.e = false;
    this.f = false;
    this.a.removeMessages(1);
    if (!this.c) {
      this.c = true;
      this.b.f();
    } 
    this.b.b();
    this.b.n();
    this.b.o();
    this.b.g();
    this.b.q();
  }
  
  public void onStateNotSaved() { this.b.b(); }
  
  protected void onStop() {
    super.onStop();
    this.e = true;
    this.a.sendEmptyMessage(1);
    this.b.j();
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt) {
    if (!this.j && paramInt != -1 && (0xFFFF0000 & paramInt) != 0)
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode"); 
    super.startActivityForResult(paramIntent, paramInt);
  }
  
  class a extends o<l> {
    public a(l this$0) { super(this$0); }
    
    public View a(int param1Int) { return this.a.findViewById(param1Int); }
    
    public void a(String param1String, FileDescriptor param1FileDescriptor, PrintWriter param1PrintWriter, String[] param1ArrayOfString) { this.a.dump(param1String, param1FileDescriptor, param1PrintWriter, param1ArrayOfString); }
    
    public boolean a() {
      Window window = this.a.getWindow();
      return (window != null && window.peekDecorView() != null);
    }
    
    public boolean a(k param1k) { return this.a.isFinishing() ^ true; }
    
    public LayoutInflater b() { return this.a.getLayoutInflater().cloneInContext(this.a); }
    
    public void b(k param1k) { this.a.a(param1k); }
    
    public void c() { this.a.d(); }
    
    public boolean d() { return (this.a.getWindow() != null); }
    
    public int e() {
      Window window = this.a.getWindow();
      return (window == null) ? 0 : (window.getAttributes()).windowAnimations;
    }
  }
  
  static final class b {
    Object a;
    
    List<k> b;
    
    h<String, v> c;
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */