package android.support.v7.a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.v4.h.af;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.b.a;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;

class b {
  private TextView A;
  
  private TextView B;
  
  private View C;
  
  private ListAdapter D;
  
  private int E = -1;
  
  private int F;
  
  private int G;
  
  private int H;
  
  private int I;
  
  private int J;
  
  private int K;
  
  private int L = 0;
  
  private Handler M;
  
  private final View.OnClickListener N = new View.OnClickListener(this) {
      public void onClick(View param1View) {
        if (param1View == b.a(this.a) && b.b(this.a) != null) {
          message = b.b(this.a);
        } else if (message == b.c(this.a) && b.d(this.a) != null) {
          message = b.d(this.a);
        } else if (message == b.e(this.a) && b.f(this.a) != null) {
          message = b.f(this.a);
        } else {
          message = null;
          if (message != null)
            message.sendToTarget(); 
        } 
        Message message = Message.obtain(message);
        if (message != null)
          message.sendToTarget(); 
      }
    };
  
  private final Context a;
  
  private final l b;
  
  private final Window c;
  
  private CharSequence d;
  
  private CharSequence e;
  
  private ListView f;
  
  private View g;
  
  private int h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private int l;
  
  private boolean m = false;
  
  private Button n;
  
  private CharSequence o;
  
  private Message p;
  
  private Button q;
  
  private CharSequence r;
  
  private Message s;
  
  private Button t;
  
  private CharSequence u;
  
  private Message v;
  
  private NestedScrollView w;
  
  private int x = 0;
  
  private Drawable y;
  
  private ImageView z;
  
  public b(Context paramContext, l paraml, Window paramWindow) {
    this.a = paramContext;
    this.b = paraml;
    this.c = paramWindow;
    this.M = new b(paraml);
    TypedArray typedArray = paramContext.obtainStyledAttributes(null, a.k.AlertDialog, a.a.alertDialogStyle, 0);
    this.F = typedArray.getResourceId(a.k.AlertDialog_android_layout, 0);
    this.G = typedArray.getResourceId(a.k.AlertDialog_buttonPanelSideLayout, 0);
    this.H = typedArray.getResourceId(a.k.AlertDialog_listLayout, 0);
    this.I = typedArray.getResourceId(a.k.AlertDialog_multiChoiceItemLayout, 0);
    this.J = typedArray.getResourceId(a.k.AlertDialog_singleChoiceItemLayout, 0);
    this.K = typedArray.getResourceId(a.k.AlertDialog_listItemLayout, 0);
    typedArray.recycle();
    paraml.a(1);
  }
  
  private ViewGroup a(View paramView1, View paramView2) {
    if (paramView1 == null) {
      paramView1 = paramView2;
      if (paramView2 instanceof ViewStub)
        paramView1 = ((ViewStub)paramView2).inflate(); 
      return (ViewGroup)paramView1;
    } 
    if (paramView2 != null) {
      ViewParent viewParent = paramView2.getParent();
      if (viewParent instanceof ViewGroup)
        ((ViewGroup)viewParent).removeView(paramView2); 
    } 
    paramView2 = paramView1;
    if (paramView1 instanceof ViewStub)
      paramView2 = ((ViewStub)paramView1).inflate(); 
    return (ViewGroup)paramView2;
  }
  
  private void a(ViewGroup paramViewGroup) {
    View view = this.g;
    boolean bool = false;
    if (view != null) {
      view = this.g;
    } else if (this.h != 0) {
      view = LayoutInflater.from(this.a).inflate(this.h, paramViewGroup, false);
    } else {
      view = null;
    } 
    if (view != null)
      bool = true; 
    if (!bool || !a(view))
      this.c.setFlags(131072, 131072); 
    if (bool) {
      FrameLayout frameLayout = (FrameLayout)this.c.findViewById(a.f.custom);
      frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
      if (this.m)
        frameLayout.setPadding(this.i, this.j, this.k, this.l); 
      if (this.f != null) {
        ((LinearLayout.LayoutParams)paramViewGroup.getLayoutParams()).weight = 0.0F;
        return;
      } 
    } else {
      paramViewGroup.setVisibility(8);
    } 
  }
  
  private void a(ViewGroup paramViewGroup, View paramView, int paramInt1, int paramInt2) {
    View view1 = this.c.findViewById(a.f.scrollIndicatorUp);
    View view2 = this.c.findViewById(a.f.scrollIndicatorDown);
    if (Build.VERSION.SDK_INT >= 23) {
      af.a(paramView, paramInt1, paramInt2);
      if (view1 != null)
        paramViewGroup.removeView(view1); 
      if (view2 != null) {
        paramViewGroup.removeView(view2);
        return;
      } 
    } else {
      View view = null;
      paramView = view1;
      if (view1 != null) {
        paramView = view1;
        if ((paramInt1 & true) == 0) {
          paramViewGroup.removeView(view1);
          paramView = null;
        } 
      } 
      if (view2 != null && (paramInt1 & 0x2) == 0) {
        paramViewGroup.removeView(view2);
        view2 = view;
      } 
      if (paramView != null || view2 != null) {
        if (this.e != null) {
          this.w.setOnScrollChangeListener(new NestedScrollView.b(this, paramView, view2) {
                public void a(NestedScrollView param1NestedScrollView, int param1Int1, int param1Int2, int param1Int3, int param1Int4) { b.a(param1NestedScrollView, this.a, this.b); }
              });
          this.w.post(new Runnable(this, paramView, view2) {
                public void run() { b.a(b.i(this.c), this.a, this.b); }
              });
          return;
        } 
        if (this.f != null) {
          this.f.setOnScrollListener(new AbsListView.OnScrollListener(this, paramView, view2) {
                public void onScroll(AbsListView param1AbsListView, int param1Int1, int param1Int2, int param1Int3) { b.a(param1AbsListView, this.a, this.b); }
                
                public void onScrollStateChanged(AbsListView param1AbsListView, int param1Int) {}
              });
          this.f.post(new Runnable(this, paramView, view2) {
                public void run() { b.a(b.j(this.c), this.a, this.b); }
              });
          return;
        } 
        if (paramView != null)
          paramViewGroup.removeView(paramView); 
        if (view2 != null)
          paramViewGroup.removeView(view2); 
      } 
    } 
  }
  
  static boolean a(View paramView) {
    if (paramView.onCheckIsTextEditor())
      return true; 
    if (!(paramView instanceof ViewGroup))
      return false; 
    ViewGroup viewGroup = (ViewGroup)paramView;
    int i1 = viewGroup.getChildCount();
    while (i1 > 0) {
      int i2 = i1 - 1;
      i1 = i2;
      if (a(viewGroup.getChildAt(i2)))
        return true; 
    } 
    return false;
  }
  
  private int b() { return (this.G == 0) ? this.F : ((this.L == 1) ? this.G : this.F); }
  
  private static void b(View paramView1, View paramView2, View paramView3) {
    byte b1 = 4;
    if (paramView2 != null) {
      byte b2;
      if (af.a(paramView1, -1)) {
        b2 = 0;
      } else {
        b2 = 4;
      } 
      paramView2.setVisibility(b2);
    } 
    if (paramView3 != null) {
      byte b2 = b1;
      if (af.a(paramView1, 1))
        b2 = 0; 
      paramView3.setVisibility(b2);
    } 
  }
  
  private void b(ViewGroup paramViewGroup) {
    if (this.C != null) {
      ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
      paramViewGroup.addView(this.C, 0, layoutParams);
      this.c.findViewById(a.f.title_template).setVisibility(8);
      return;
    } 
    this.z = (ImageView)this.c.findViewById(16908294);
    if (TextUtils.isEmpty(this.d) ^ true) {
      this.A = (TextView)this.c.findViewById(a.f.alertTitle);
      this.A.setText(this.d);
      if (this.x != 0) {
        this.z.setImageResource(this.x);
        return;
      } 
      if (this.y != null) {
        this.z.setImageDrawable(this.y);
        return;
      } 
      this.A.setPadding(this.z.getPaddingLeft(), this.z.getPaddingTop(), this.z.getPaddingRight(), this.z.getPaddingBottom());
      this.z.setVisibility(8);
      return;
    } 
    this.c.findViewById(a.f.title_template).setVisibility(8);
    this.z.setVisibility(8);
    paramViewGroup.setVisibility(8);
  }
  
  private void c() {
    boolean bool;
    byte b2;
    int i1;
    View view1 = this.c.findViewById(a.f.parentPanel);
    View view2 = view1.findViewById(a.f.topPanel);
    View view3 = view1.findViewById(a.f.contentPanel);
    View view4 = view1.findViewById(a.f.buttonPanel);
    ViewGroup viewGroup1 = (ViewGroup)view1.findViewById(a.f.customPanel);
    a(viewGroup1);
    View view5 = viewGroup1.findViewById(a.f.topPanel);
    View view6 = viewGroup1.findViewById(a.f.contentPanel);
    View view7 = viewGroup1.findViewById(a.f.buttonPanel);
    ViewGroup viewGroup2 = a(view5, view2);
    ViewGroup viewGroup3 = a(view6, view3);
    ViewGroup viewGroup4 = a(view7, view4);
    c(viewGroup3);
    d(viewGroup4);
    b(viewGroup2);
    byte b1 = 0;
    if (viewGroup1 != null && viewGroup1.getVisibility() != 8) {
      i1 = 1;
    } else {
      i1 = 0;
    } 
    if (viewGroup2 != null && viewGroup2.getVisibility() != 8) {
      b2 = 1;
    } else {
      b2 = 0;
    } 
    if (viewGroup4 != null && viewGroup4.getVisibility() != 8) {
      bool = true;
    } else {
      bool = false;
    } 
    if (!bool && viewGroup3 != null) {
      View view = viewGroup3.findViewById(a.f.textSpacerNoButtons);
      if (view != null)
        view.setVisibility(0); 
    } 
    if (b2 && this.w != null)
      this.w.setClipToPadding(true); 
    if (!i1) {
      NestedScrollView nestedScrollView;
      if (this.f != null) {
        nestedScrollView = this.f;
      } else {
        nestedScrollView = this.w;
      } 
      if (nestedScrollView != null) {
        i1 = b1;
        if (bool)
          i1 = 2; 
        a(viewGroup3, nestedScrollView, b2 | i1, 3);
      } 
    } 
    ListView listView = this.f;
    if (listView != null && this.D != null) {
      listView.setAdapter(this.D);
      i1 = this.E;
      if (i1 > -1) {
        listView.setItemChecked(i1, true);
        listView.setSelection(i1);
      } 
    } 
  }
  
  private void c(ViewGroup paramViewGroup) {
    this.w = (NestedScrollView)this.c.findViewById(a.f.scrollView);
    this.w.setFocusable(false);
    this.w.setNestedScrollingEnabled(false);
    this.B = (TextView)paramViewGroup.findViewById(16908299);
    if (this.B == null)
      return; 
    if (this.e != null) {
      this.B.setText(this.e);
      return;
    } 
    this.B.setVisibility(8);
    this.w.removeView(this.B);
    if (this.f != null) {
      paramViewGroup = (ViewGroup)this.w.getParent();
      int i1 = paramViewGroup.indexOfChild(this.w);
      paramViewGroup.removeViewAt(i1);
      paramViewGroup.addView(this.f, i1, new ViewGroup.LayoutParams(-1, -1));
      return;
    } 
    paramViewGroup.setVisibility(8);
  }
  
  private void d(ViewGroup paramViewGroup) {
    byte b2;
    this.n = (Button)paramViewGroup.findViewById(16908313);
    this.n.setOnClickListener(this.N);
    boolean bool = TextUtils.isEmpty(this.o);
    byte b1 = 1;
    if (bool) {
      this.n.setVisibility(8);
      b2 = 0;
    } else {
      this.n.setText(this.o);
      this.n.setVisibility(0);
      b2 = 1;
    } 
    this.q = (Button)paramViewGroup.findViewById(16908314);
    this.q.setOnClickListener(this.N);
    if (TextUtils.isEmpty(this.r)) {
      this.q.setVisibility(8);
    } else {
      this.q.setText(this.r);
      this.q.setVisibility(0);
      b2 |= 0x2;
    } 
    this.t = (Button)paramViewGroup.findViewById(16908315);
    this.t.setOnClickListener(this.N);
    if (TextUtils.isEmpty(this.u)) {
      this.t.setVisibility(8);
    } else {
      this.t.setText(this.u);
      this.t.setVisibility(0);
      b2 |= 0x4;
    } 
    if (b2 != 0) {
      b2 = b1;
    } else {
      b2 = 0;
    } 
    if (b2 == 0)
      paramViewGroup.setVisibility(8); 
  }
  
  public void a() {
    int i1 = b();
    this.b.setContentView(i1);
    c();
  }
  
  public void a(int paramInt) {
    this.g = null;
    this.h = paramInt;
    this.m = false;
  }
  
  public void a(int paramInt, CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener, Message paramMessage) {
    Message message = paramMessage;
    if (paramMessage == null) {
      message = paramMessage;
      if (paramOnClickListener != null)
        message = this.M.obtainMessage(paramInt, paramOnClickListener); 
    } 
    switch (paramInt) {
      default:
        throw new IllegalArgumentException("Button does not exist");
      case -1:
        this.o = paramCharSequence;
        this.p = message;
        return;
      case -2:
        this.r = paramCharSequence;
        this.s = message;
        return;
      case -3:
        break;
    } 
    this.u = paramCharSequence;
    this.v = message;
  }
  
  public void a(Drawable paramDrawable) {
    this.y = paramDrawable;
    this.x = 0;
    if (this.z != null) {
      if (paramDrawable != null) {
        this.z.setVisibility(0);
        this.z.setImageDrawable(paramDrawable);
        return;
      } 
      this.z.setVisibility(8);
    } 
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.g = paramView;
    this.h = 0;
    this.m = true;
    this.i = paramInt1;
    this.j = paramInt2;
    this.k = paramInt3;
    this.l = paramInt4;
  }
  
  public void a(CharSequence paramCharSequence) {
    this.d = paramCharSequence;
    if (this.A != null)
      this.A.setText(paramCharSequence); 
  }
  
  public boolean a(int paramInt, KeyEvent paramKeyEvent) { return (this.w != null && this.w.a(paramKeyEvent)); }
  
  public void b(int paramInt) {
    this.y = null;
    this.x = paramInt;
    if (this.z != null) {
      if (paramInt != 0) {
        this.z.setVisibility(0);
        this.z.setImageResource(this.x);
        return;
      } 
      this.z.setVisibility(8);
    } 
  }
  
  public void b(View paramView) { this.C = paramView; }
  
  public void b(CharSequence paramCharSequence) {
    this.e = paramCharSequence;
    if (this.B != null)
      this.B.setText(paramCharSequence); 
  }
  
  public boolean b(int paramInt, KeyEvent paramKeyEvent) { return (this.w != null && this.w.a(paramKeyEvent)); }
  
  public int c(int paramInt) {
    TypedValue typedValue = new TypedValue();
    this.a.getTheme().resolveAttribute(paramInt, typedValue, true);
    return typedValue.resourceId;
  }
  
  public void c(View paramView) {
    this.g = paramView;
    this.h = 0;
    this.m = false;
  }
  
  public static class a {
    public int A;
    
    public boolean B = false;
    
    public boolean[] C;
    
    public boolean D;
    
    public boolean E;
    
    public int F = -1;
    
    public DialogInterface.OnMultiChoiceClickListener G;
    
    public Cursor H;
    
    public String I;
    
    public String J;
    
    public AdapterView.OnItemSelectedListener K;
    
    public a L;
    
    public boolean M = true;
    
    public final Context a;
    
    public final LayoutInflater b;
    
    public int c = 0;
    
    public Drawable d;
    
    public int e = 0;
    
    public CharSequence f;
    
    public View g;
    
    public CharSequence h;
    
    public CharSequence i;
    
    public DialogInterface.OnClickListener j;
    
    public CharSequence k;
    
    public DialogInterface.OnClickListener l;
    
    public CharSequence m;
    
    public DialogInterface.OnClickListener n;
    
    public boolean o;
    
    public DialogInterface.OnCancelListener p;
    
    public DialogInterface.OnDismissListener q;
    
    public DialogInterface.OnKeyListener r;
    
    public CharSequence[] s;
    
    public ListAdapter t;
    
    public DialogInterface.OnClickListener u;
    
    public int v;
    
    public View w;
    
    public int x;
    
    public int y;
    
    public int z;
    
    public a(Context param1Context) {
      this.a = param1Context;
      this.o = true;
      this.b = (LayoutInflater)param1Context.getSystemService("layout_inflater");
    }
    
    private void b(b param1b) { // Byte code:
      //   0: aload_0
      //   1: getfield b : Landroid/view/LayoutInflater;
      //   4: aload_1
      //   5: invokestatic k : (Landroid/support/v7/a/b;)I
      //   8: aconst_null
      //   9: invokevirtual inflate : (ILandroid/view/ViewGroup;)Landroid/view/View;
      //   12: checkcast android/widget/ListView
      //   15: astore_2
      //   16: aload_0
      //   17: getfield D : Z
      //   20: ifeq -> 80
      //   23: aload_0
      //   24: getfield H : Landroid/database/Cursor;
      //   27: ifnonnull -> 57
      //   30: new android/support/v7/a/b$a$1
      //   33: dup
      //   34: aload_0
      //   35: aload_0
      //   36: getfield a : Landroid/content/Context;
      //   39: aload_1
      //   40: invokestatic l : (Landroid/support/v7/a/b;)I
      //   43: ldc 16908308
      //   45: aload_0
      //   46: getfield s : [Ljava/lang/CharSequence;
      //   49: aload_2
      //   50: invokespecial <init> : (Landroid/support/v7/a/b$a;Landroid/content/Context;II[Ljava/lang/CharSequence;Landroid/widget/ListView;)V
      //   53: astore_3
      //   54: goto -> 187
      //   57: new android/support/v7/a/b$a$2
      //   60: dup
      //   61: aload_0
      //   62: aload_0
      //   63: getfield a : Landroid/content/Context;
      //   66: aload_0
      //   67: getfield H : Landroid/database/Cursor;
      //   70: iconst_0
      //   71: aload_2
      //   72: aload_1
      //   73: invokespecial <init> : (Landroid/support/v7/a/b$a;Landroid/content/Context;Landroid/database/Cursor;ZLandroid/widget/ListView;Landroid/support/v7/a/b;)V
      //   76: astore_3
      //   77: goto -> 187
      //   80: aload_0
      //   81: getfield E : Z
      //   84: ifeq -> 96
      //   87: aload_1
      //   88: invokestatic m : (Landroid/support/v7/a/b;)I
      //   91: istore #4
      //   93: goto -> 105
      //   96: aload_1
      //   97: invokestatic n : (Landroid/support/v7/a/b;)I
      //   100: istore #4
      //   102: goto -> 93
      //   105: aload_0
      //   106: getfield H : Landroid/database/Cursor;
      //   109: ifnull -> 152
      //   112: new android/widget/SimpleCursorAdapter
      //   115: dup
      //   116: aload_0
      //   117: getfield a : Landroid/content/Context;
      //   120: iload #4
      //   122: aload_0
      //   123: getfield H : Landroid/database/Cursor;
      //   126: iconst_1
      //   127: anewarray java/lang/String
      //   130: dup
      //   131: iconst_0
      //   132: aload_0
      //   133: getfield I : Ljava/lang/String;
      //   136: aastore
      //   137: iconst_1
      //   138: newarray int
      //   140: dup
      //   141: iconst_0
      //   142: ldc 16908308
      //   144: iastore
      //   145: invokespecial <init> : (Landroid/content/Context;ILandroid/database/Cursor;[Ljava/lang/String;[I)V
      //   148: astore_3
      //   149: goto -> 187
      //   152: aload_0
      //   153: getfield t : Landroid/widget/ListAdapter;
      //   156: ifnull -> 167
      //   159: aload_0
      //   160: getfield t : Landroid/widget/ListAdapter;
      //   163: astore_3
      //   164: goto -> 187
      //   167: new android/support/v7/a/b$c
      //   170: dup
      //   171: aload_0
      //   172: getfield a : Landroid/content/Context;
      //   175: iload #4
      //   177: ldc 16908308
      //   179: aload_0
      //   180: getfield s : [Ljava/lang/CharSequence;
      //   183: invokespecial <init> : (Landroid/content/Context;II[Ljava/lang/CharSequence;)V
      //   186: astore_3
      //   187: aload_0
      //   188: getfield L : Landroid/support/v7/a/b$a$a;
      //   191: ifnull -> 204
      //   194: aload_0
      //   195: getfield L : Landroid/support/v7/a/b$a$a;
      //   198: aload_2
      //   199: invokeinterface a : (Landroid/widget/ListView;)V
      //   204: aload_1
      //   205: aload_3
      //   206: invokestatic a : (Landroid/support/v7/a/b;Landroid/widget/ListAdapter;)Landroid/widget/ListAdapter;
      //   209: pop
      //   210: aload_1
      //   211: aload_0
      //   212: getfield F : I
      //   215: invokestatic a : (Landroid/support/v7/a/b;I)I
      //   218: pop
      //   219: aload_0
      //   220: getfield u : Landroid/content/DialogInterface$OnClickListener;
      //   223: ifnull -> 244
      //   226: new android/support/v7/a/b$a$3
      //   229: dup
      //   230: aload_0
      //   231: aload_1
      //   232: invokespecial <init> : (Landroid/support/v7/a/b$a;Landroid/support/v7/a/b;)V
      //   235: astore_3
      //   236: aload_2
      //   237: aload_3
      //   238: invokevirtual setOnItemClickListener : (Landroid/widget/AdapterView$OnItemClickListener;)V
      //   241: goto -> 265
      //   244: aload_0
      //   245: getfield G : Landroid/content/DialogInterface$OnMultiChoiceClickListener;
      //   248: ifnull -> 265
      //   251: new android/support/v7/a/b$a$4
      //   254: dup
      //   255: aload_0
      //   256: aload_2
      //   257: aload_1
      //   258: invokespecial <init> : (Landroid/support/v7/a/b$a;Landroid/widget/ListView;Landroid/support/v7/a/b;)V
      //   261: astore_3
      //   262: goto -> 236
      //   265: aload_0
      //   266: getfield K : Landroid/widget/AdapterView$OnItemSelectedListener;
      //   269: ifnull -> 280
      //   272: aload_2
      //   273: aload_0
      //   274: getfield K : Landroid/widget/AdapterView$OnItemSelectedListener;
      //   277: invokevirtual setOnItemSelectedListener : (Landroid/widget/AdapterView$OnItemSelectedListener;)V
      //   280: aload_0
      //   281: getfield E : Z
      //   284: ifeq -> 295
      //   287: aload_2
      //   288: iconst_1
      //   289: invokevirtual setChoiceMode : (I)V
      //   292: goto -> 307
      //   295: aload_0
      //   296: getfield D : Z
      //   299: ifeq -> 307
      //   302: aload_2
      //   303: iconst_2
      //   304: invokevirtual setChoiceMode : (I)V
      //   307: aload_1
      //   308: aload_2
      //   309: invokestatic a : (Landroid/support/v7/a/b;Landroid/widget/ListView;)Landroid/widget/ListView;
      //   312: pop
      //   313: return }
    
    public void a(b param1b) {
      if (this.g != null) {
        param1b.b(this.g);
      } else {
        if (this.f != null)
          param1b.a(this.f); 
        if (this.d != null)
          param1b.a(this.d); 
        if (this.c != 0)
          param1b.b(this.c); 
        if (this.e != 0)
          param1b.b(param1b.c(this.e)); 
      } 
      if (this.h != null)
        param1b.b(this.h); 
      if (this.i != null)
        param1b.a(-1, this.i, this.j, null); 
      if (this.k != null)
        param1b.a(-2, this.k, this.l, null); 
      if (this.m != null)
        param1b.a(-3, this.m, this.n, null); 
      if (this.s != null || this.H != null || this.t != null)
        b(param1b); 
      if (this.w != null) {
        if (this.B) {
          param1b.a(this.w, this.x, this.y, this.z, this.A);
          return;
        } 
        param1b.c(this.w);
        return;
      } 
      if (this.v != 0)
        param1b.a(this.v); 
    }
    
    public static interface a {
      void a(ListView param2ListView);
    }
  }
  
  class null extends ArrayAdapter<CharSequence> {
    null(b this$0, Context param1Context, int param1Int1, int param1Int2, CharSequence[] param1ArrayOfCharSequence, ListView param1ListView) { super(param1Context, param1Int1, param1Int2, param1ArrayOfCharSequence); }
    
    public View getView(int param1Int, View param1View, ViewGroup param1ViewGroup) {
      param1View = super.getView(param1Int, param1View, param1ViewGroup);
      if (this.b.C != null && this.b.C[param1Int])
        this.a.setItemChecked(param1Int, true); 
      return param1View;
    }
  }
  
  class null extends CursorAdapter {
    private final int d;
    
    private final int e;
    
    null(b this$0, Context param1Context, Cursor param1Cursor, boolean param1Boolean, ListView param1ListView, b param1b) {
      super(param1Context, param1Cursor, param1Boolean);
      Cursor cursor = getCursor();
      this.d = cursor.getColumnIndexOrThrow(this.c.I);
      this.e = cursor.getColumnIndexOrThrow(this.c.J);
    }
    
    public void bindView(View param1View, Context param1Context, Cursor param1Cursor) {
      ((CheckedTextView)param1View.findViewById(16908308)).setText(param1Cursor.getString(this.d));
      ListView listView = this.a;
      int i = param1Cursor.getPosition();
      int j = param1Cursor.getInt(this.e);
      boolean bool = true;
      if (j != 1)
        bool = false; 
      listView.setItemChecked(i, bool);
    }
    
    public View newView(Context param1Context, Cursor param1Cursor, ViewGroup param1ViewGroup) { return this.c.b.inflate(b.l(this.b), param1ViewGroup, false); }
  }
  
  class null implements AdapterView.OnItemClickListener {
    null(b this$0, b param1b) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      this.b.u.onClick(b.g(this.a), param1Int);
      if (!this.b.E)
        b.g(this.a).dismiss(); 
    }
  }
  
  class null implements AdapterView.OnItemClickListener {
    null(b this$0, ListView param1ListView, b param1b) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      if (this.c.C != null)
        this.c.C[param1Int] = this.a.isItemChecked(param1Int); 
      this.c.G.onClick(b.g(this.b), param1Int, this.a.isItemChecked(param1Int));
    }
  }
  
  public static interface a {
    void a(ListView param1ListView);
  }
  
  private static final class b extends Handler {
    private WeakReference<DialogInterface> a;
    
    public b(DialogInterface param1DialogInterface) { this.a = new WeakReference(param1DialogInterface); }
    
    public void handleMessage(Message param1Message) {
      int i = param1Message.what;
      if (i != 1) {
        switch (i) {
          default:
            return;
          case -3:
          case -2:
          case -1:
            break;
        } 
        ((DialogInterface.OnClickListener)param1Message.obj).onClick((DialogInterface)this.a.get(), param1Message.what);
        return;
      } 
      ((DialogInterface)param1Message.obj).dismiss();
    }
  }
  
  private static class c extends ArrayAdapter<CharSequence> {
    public c(Context param1Context, int param1Int1, int param1Int2, CharSequence[] param1ArrayOfCharSequence) { super(param1Context, param1Int1, param1Int2, param1ArrayOfCharSequence); }
    
    public long getItemId(int param1Int) { return param1Int; }
    
    public boolean hasStableIds() { return true; }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */