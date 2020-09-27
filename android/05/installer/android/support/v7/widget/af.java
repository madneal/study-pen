package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.h.af;
import android.support.v4.h.e;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class af extends ViewGroup {
  private boolean a = true;
  
  private int b = -1;
  
  private int c = 0;
  
  private int d;
  
  private int e = 8388659;
  
  private int f;
  
  private float g;
  
  private boolean h;
  
  private int[] i;
  
  private int[] j;
  
  private Drawable k;
  
  private int l;
  
  private int m;
  
  private int n;
  
  private int o;
  
  public af(Context paramContext) { this(paramContext, null); }
  
  public af(Context paramContext, AttributeSet paramAttributeSet) { this(paramContext, paramAttributeSet, 0); }
  
  public af(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    ar ar = ar.a(paramContext, paramAttributeSet, a.k.LinearLayoutCompat, paramInt, 0);
    paramInt = ar.a(a.k.LinearLayoutCompat_android_orientation, -1);
    if (paramInt >= 0)
      setOrientation(paramInt); 
    paramInt = ar.a(a.k.LinearLayoutCompat_android_gravity, -1);
    if (paramInt >= 0)
      setGravity(paramInt); 
    boolean bool = ar.a(a.k.LinearLayoutCompat_android_baselineAligned, true);
    if (!bool)
      setBaselineAligned(bool); 
    this.g = ar.a(a.k.LinearLayoutCompat_android_weightSum, -1.0F);
    this.b = ar.a(a.k.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
    this.h = ar.a(a.k.LinearLayoutCompat_measureWithLargestChild, false);
    setDividerDrawable(ar.a(a.k.LinearLayoutCompat_divider));
    this.n = ar.a(a.k.LinearLayoutCompat_showDividers, 0);
    this.o = ar.e(a.k.LinearLayoutCompat_dividerPadding, 0);
    ar.a();
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { paramView.layout(paramInt1, paramInt2, paramInt3 + paramInt1, paramInt4 + paramInt2); }
  
  private void c(int paramInt1, int paramInt2) {
    int i1 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
    for (byte b1 = 0; b1 < paramInt1; b1++) {
      View view = b(b1);
      if (view.getVisibility() != 8) {
        a a1 = (a)view.getLayoutParams();
        if (a1.width == -1) {
          int i2 = a1.height;
          a1.height = view.getMeasuredHeight();
          measureChildWithMargins(view, i1, 0, paramInt2, 0);
          a1.height = i2;
        } 
      } 
    } 
  }
  
  private void d(int paramInt1, int paramInt2) {
    int i1 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
    for (byte b1 = 0; b1 < paramInt1; b1++) {
      View view = b(b1);
      if (view.getVisibility() != 8) {
        a a1 = (a)view.getLayoutParams();
        if (a1.height == -1) {
          int i2 = a1.width;
          a1.width = view.getMeasuredWidth();
          measureChildWithMargins(view, paramInt2, 0, i1, 0);
          a1.width = i2;
        } 
      } 
    } 
  }
  
  int a(View paramView) { return 0; }
  
  int a(View paramView, int paramInt) { return 0; }
  
  void a(int paramInt1, int paramInt2) { // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_0
    //   3: iconst_0
    //   4: putfield f : I
    //   7: aload_0
    //   8: invokevirtual getVirtualChildCount : ()I
    //   11: istore #4
    //   13: iload_1
    //   14: invokestatic getMode : (I)I
    //   17: istore #5
    //   19: iload_2
    //   20: invokestatic getMode : (I)I
    //   23: istore #6
    //   25: aload_0
    //   26: getfield b : I
    //   29: istore #7
    //   31: aload_0
    //   32: getfield h : Z
    //   35: istore #8
    //   37: fconst_0
    //   38: fstore #9
    //   40: iconst_0
    //   41: istore #10
    //   43: ldc -2147483648
    //   45: istore #11
    //   47: iconst_0
    //   48: istore #12
    //   50: iconst_0
    //   51: istore #13
    //   53: iconst_0
    //   54: istore #14
    //   56: iconst_1
    //   57: istore #15
    //   59: iconst_0
    //   60: istore #16
    //   62: iconst_0
    //   63: istore #17
    //   65: iload #13
    //   67: iload #4
    //   69: if_icmpge -> 672
    //   72: aload_0
    //   73: iload #13
    //   75: invokevirtual b : (I)Landroid/view/View;
    //   78: astore #18
    //   80: aload #18
    //   82: ifnonnull -> 121
    //   85: aload_0
    //   86: aload_0
    //   87: getfield f : I
    //   90: aload_0
    //   91: iload #13
    //   93: invokevirtual d : (I)I
    //   96: iadd
    //   97: putfield f : I
    //   100: iload_3
    //   101: istore #19
    //   103: iload #11
    //   105: istore_3
    //   106: iload #19
    //   108: istore #11
    //   110: iload #13
    //   112: istore #20
    //   114: iload #15
    //   116: istore #19
    //   118: goto -> 649
    //   121: aload #18
    //   123: invokevirtual getVisibility : ()I
    //   126: bipush #8
    //   128: if_icmpne -> 147
    //   131: iload #13
    //   133: aload_0
    //   134: aload #18
    //   136: iload #13
    //   138: invokevirtual a : (Landroid/view/View;I)I
    //   141: iadd
    //   142: istore #13
    //   144: goto -> 100
    //   147: aload_0
    //   148: iload #13
    //   150: invokevirtual c : (I)Z
    //   153: ifeq -> 169
    //   156: aload_0
    //   157: aload_0
    //   158: getfield f : I
    //   161: aload_0
    //   162: getfield m : I
    //   165: iadd
    //   166: putfield f : I
    //   169: aload #18
    //   171: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   174: checkcast android/support/v7/widget/af$a
    //   177: astore #21
    //   179: fload #9
    //   181: aload #21
    //   183: getfield g : F
    //   186: fadd
    //   187: fstore #9
    //   189: iload #6
    //   191: ldc 1073741824
    //   193: if_icmpne -> 253
    //   196: aload #21
    //   198: getfield height : I
    //   201: ifne -> 253
    //   204: aload #21
    //   206: getfield g : F
    //   209: fconst_0
    //   210: fcmpl
    //   211: ifle -> 253
    //   214: aload_0
    //   215: getfield f : I
    //   218: istore #19
    //   220: aload #21
    //   222: getfield topMargin : I
    //   225: istore #14
    //   227: aload_0
    //   228: iload #19
    //   230: iload #14
    //   232: iload #19
    //   234: iadd
    //   235: aload #21
    //   237: getfield bottomMargin : I
    //   240: iadd
    //   241: invokestatic max : (II)I
    //   244: putfield f : I
    //   247: iconst_1
    //   248: istore #14
    //   250: goto -> 405
    //   253: aload #21
    //   255: getfield height : I
    //   258: ifne -> 284
    //   261: aload #21
    //   263: getfield g : F
    //   266: fconst_0
    //   267: fcmpl
    //   268: ifle -> 284
    //   271: aload #21
    //   273: bipush #-2
    //   275: putfield height : I
    //   278: iconst_0
    //   279: istore #19
    //   281: goto -> 288
    //   284: ldc -2147483648
    //   286: istore #19
    //   288: fload #9
    //   290: fconst_0
    //   291: fcmpl
    //   292: ifne -> 304
    //   295: aload_0
    //   296: getfield f : I
    //   299: istore #20
    //   301: goto -> 307
    //   304: iconst_0
    //   305: istore #20
    //   307: aload #18
    //   309: astore #22
    //   311: aload #21
    //   313: astore #23
    //   315: aload_0
    //   316: aload #18
    //   318: iload #13
    //   320: iload_1
    //   321: iconst_0
    //   322: iload_2
    //   323: iload #20
    //   325: invokevirtual a : (Landroid/view/View;IIIII)V
    //   328: iload #19
    //   330: ldc -2147483648
    //   332: if_icmpeq -> 342
    //   335: aload #23
    //   337: iload #19
    //   339: putfield height : I
    //   342: aload #22
    //   344: invokevirtual getMeasuredHeight : ()I
    //   347: istore #20
    //   349: aload_0
    //   350: getfield f : I
    //   353: istore #19
    //   355: aload_0
    //   356: iload #19
    //   358: iload #19
    //   360: iload #20
    //   362: iadd
    //   363: aload #23
    //   365: getfield topMargin : I
    //   368: iadd
    //   369: aload #23
    //   371: getfield bottomMargin : I
    //   374: iadd
    //   375: aload_0
    //   376: aload #22
    //   378: invokevirtual b : (Landroid/view/View;)I
    //   381: iadd
    //   382: invokestatic max : (II)I
    //   385: putfield f : I
    //   388: iload #8
    //   390: ifeq -> 405
    //   393: iload #20
    //   395: iload #11
    //   397: invokestatic max : (II)I
    //   400: istore #11
    //   402: goto -> 405
    //   405: iload #13
    //   407: istore #24
    //   409: iload #7
    //   411: iflt -> 431
    //   414: iload #7
    //   416: iload #24
    //   418: iconst_1
    //   419: iadd
    //   420: if_icmpne -> 431
    //   423: aload_0
    //   424: aload_0
    //   425: getfield f : I
    //   428: putfield c : I
    //   431: iload #24
    //   433: iload #7
    //   435: if_icmpge -> 458
    //   438: aload #21
    //   440: getfield g : F
    //   443: fconst_0
    //   444: fcmpl
    //   445: ifle -> 458
    //   448: new java/lang/RuntimeException
    //   451: dup
    //   452: ldc 'A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.'
    //   454: invokespecial <init> : (Ljava/lang/String;)V
    //   457: athrow
    //   458: iload #5
    //   460: ldc 1073741824
    //   462: if_icmpeq -> 483
    //   465: aload #21
    //   467: getfield width : I
    //   470: iconst_m1
    //   471: if_icmpne -> 483
    //   474: iconst_1
    //   475: istore #13
    //   477: iconst_1
    //   478: istore #16
    //   480: goto -> 486
    //   483: iconst_0
    //   484: istore #13
    //   486: aload #21
    //   488: getfield leftMargin : I
    //   491: aload #21
    //   493: getfield rightMargin : I
    //   496: iadd
    //   497: istore #19
    //   499: aload #18
    //   501: invokevirtual getMeasuredWidth : ()I
    //   504: iload #19
    //   506: iadd
    //   507: istore #20
    //   509: iload #10
    //   511: iload #20
    //   513: invokestatic max : (II)I
    //   516: istore #25
    //   518: iload_3
    //   519: aload #18
    //   521: invokestatic f : (Landroid/view/View;)I
    //   524: invokestatic a : (II)I
    //   527: istore_3
    //   528: iload #15
    //   530: ifeq -> 548
    //   533: aload #21
    //   535: getfield width : I
    //   538: iconst_m1
    //   539: if_icmpne -> 548
    //   542: iconst_1
    //   543: istore #10
    //   545: goto -> 551
    //   548: iconst_0
    //   549: istore #10
    //   551: aload #21
    //   553: getfield g : F
    //   556: fconst_0
    //   557: fcmpl
    //   558: ifle -> 588
    //   561: iload #13
    //   563: ifeq -> 569
    //   566: goto -> 576
    //   569: iload #20
    //   571: istore #19
    //   573: goto -> 566
    //   576: iload #12
    //   578: iload #19
    //   580: invokestatic max : (II)I
    //   583: istore #15
    //   585: goto -> 610
    //   588: iload #13
    //   590: ifeq -> 597
    //   593: iload #19
    //   595: istore #20
    //   597: iload #17
    //   599: iload #20
    //   601: invokestatic max : (II)I
    //   604: istore #17
    //   606: iload #12
    //   608: istore #15
    //   610: aload_0
    //   611: aload #18
    //   613: iload #24
    //   615: invokevirtual a : (Landroid/view/View;I)I
    //   618: istore #12
    //   620: iload #10
    //   622: istore #19
    //   624: iload #25
    //   626: istore #10
    //   628: iload_3
    //   629: istore #13
    //   631: iload #11
    //   633: istore_3
    //   634: iload #12
    //   636: iload #24
    //   638: iadd
    //   639: istore #20
    //   641: iload #13
    //   643: istore #11
    //   645: iload #15
    //   647: istore #12
    //   649: iload #20
    //   651: iconst_1
    //   652: iadd
    //   653: istore #13
    //   655: iload #11
    //   657: istore #15
    //   659: iload_3
    //   660: istore #11
    //   662: iload #15
    //   664: istore_3
    //   665: iload #19
    //   667: istore #15
    //   669: goto -> 65
    //   672: iload #17
    //   674: istore #13
    //   676: aload_0
    //   677: getfield f : I
    //   680: ifle -> 708
    //   683: aload_0
    //   684: iload #4
    //   686: invokevirtual c : (I)Z
    //   689: ifeq -> 708
    //   692: aload_0
    //   693: aload_0
    //   694: getfield f : I
    //   697: aload_0
    //   698: getfield m : I
    //   701: iadd
    //   702: putfield f : I
    //   705: goto -> 708
    //   708: iload #8
    //   710: ifeq -> 856
    //   713: iload #6
    //   715: istore #17
    //   717: iload #17
    //   719: ldc -2147483648
    //   721: if_icmpeq -> 729
    //   724: iload #17
    //   726: ifne -> 856
    //   729: aload_0
    //   730: iconst_0
    //   731: putfield f : I
    //   734: iconst_0
    //   735: istore #17
    //   737: iload #17
    //   739: iload #4
    //   741: if_icmpge -> 856
    //   744: aload_0
    //   745: iload #17
    //   747: invokevirtual b : (I)Landroid/view/View;
    //   750: astore #21
    //   752: aload #21
    //   754: ifnonnull -> 775
    //   757: aload_0
    //   758: aload_0
    //   759: getfield f : I
    //   762: aload_0
    //   763: iload #17
    //   765: invokevirtual d : (I)I
    //   768: iadd
    //   769: putfield f : I
    //   772: goto -> 850
    //   775: aload #21
    //   777: invokevirtual getVisibility : ()I
    //   780: bipush #8
    //   782: if_icmpne -> 801
    //   785: iload #17
    //   787: aload_0
    //   788: aload #21
    //   790: iload #17
    //   792: invokevirtual a : (Landroid/view/View;I)I
    //   795: iadd
    //   796: istore #17
    //   798: goto -> 850
    //   801: aload #21
    //   803: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   806: checkcast android/support/v7/widget/af$a
    //   809: astore #18
    //   811: aload_0
    //   812: getfield f : I
    //   815: istore #19
    //   817: aload_0
    //   818: iload #19
    //   820: iload #19
    //   822: iload #11
    //   824: iadd
    //   825: aload #18
    //   827: getfield topMargin : I
    //   830: iadd
    //   831: aload #18
    //   833: getfield bottomMargin : I
    //   836: iadd
    //   837: aload_0
    //   838: aload #21
    //   840: invokevirtual b : (Landroid/view/View;)I
    //   843: iadd
    //   844: invokestatic max : (II)I
    //   847: putfield f : I
    //   850: iinc #17, 1
    //   853: goto -> 737
    //   856: iload #6
    //   858: istore #19
    //   860: aload_0
    //   861: aload_0
    //   862: getfield f : I
    //   865: aload_0
    //   866: invokevirtual getPaddingTop : ()I
    //   869: aload_0
    //   870: invokevirtual getPaddingBottom : ()I
    //   873: iadd
    //   874: iadd
    //   875: putfield f : I
    //   878: aload_0
    //   879: getfield f : I
    //   882: aload_0
    //   883: invokevirtual getSuggestedMinimumHeight : ()I
    //   886: invokestatic max : (II)I
    //   889: iload_2
    //   890: iconst_0
    //   891: invokestatic a : (III)I
    //   894: istore #20
    //   896: ldc 16777215
    //   898: iload #20
    //   900: iand
    //   901: aload_0
    //   902: getfield f : I
    //   905: isub
    //   906: istore #17
    //   908: iload #14
    //   910: ifne -> 1036
    //   913: iload #17
    //   915: ifeq -> 928
    //   918: fload #9
    //   920: fconst_0
    //   921: fcmpl
    //   922: ifle -> 928
    //   925: goto -> 1036
    //   928: iload #13
    //   930: iload #12
    //   932: invokestatic max : (II)I
    //   935: istore #17
    //   937: iload #8
    //   939: ifeq -> 1029
    //   942: iload #19
    //   944: ldc 1073741824
    //   946: if_icmpeq -> 1029
    //   949: iconst_0
    //   950: istore #6
    //   952: iload #6
    //   954: iload #4
    //   956: if_icmpge -> 1029
    //   959: aload_0
    //   960: iload #6
    //   962: invokevirtual b : (I)Landroid/view/View;
    //   965: astore #18
    //   967: aload #18
    //   969: ifnull -> 1023
    //   972: aload #18
    //   974: invokevirtual getVisibility : ()I
    //   977: bipush #8
    //   979: if_icmpne -> 985
    //   982: goto -> 1023
    //   985: aload #18
    //   987: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   990: checkcast android/support/v7/widget/af$a
    //   993: getfield g : F
    //   996: fconst_0
    //   997: fcmpl
    //   998: ifle -> 1023
    //   1001: aload #18
    //   1003: aload #18
    //   1005: invokevirtual getMeasuredWidth : ()I
    //   1008: ldc 1073741824
    //   1010: invokestatic makeMeasureSpec : (II)I
    //   1013: iload #11
    //   1015: ldc 1073741824
    //   1017: invokestatic makeMeasureSpec : (II)I
    //   1020: invokevirtual measure : (II)V
    //   1023: iinc #6, 1
    //   1026: goto -> 952
    //   1029: iload #17
    //   1031: istore #6
    //   1033: goto -> 1473
    //   1036: aload_0
    //   1037: getfield g : F
    //   1040: fconst_0
    //   1041: fcmpl
    //   1042: ifle -> 1051
    //   1045: aload_0
    //   1046: getfield g : F
    //   1049: fstore #9
    //   1051: aload_0
    //   1052: iconst_0
    //   1053: putfield f : I
    //   1056: iconst_0
    //   1057: istore #12
    //   1059: iload #10
    //   1061: istore #11
    //   1063: iload_3
    //   1064: istore #10
    //   1066: iload #13
    //   1068: istore #6
    //   1070: iload #12
    //   1072: istore_3
    //   1073: iload_3
    //   1074: iload #4
    //   1076: if_icmpge -> 1448
    //   1079: aload_0
    //   1080: iload_3
    //   1081: invokevirtual b : (I)Landroid/view/View;
    //   1084: astore #21
    //   1086: aload #21
    //   1088: invokevirtual getVisibility : ()I
    //   1091: bipush #8
    //   1093: if_icmpne -> 1099
    //   1096: goto -> 1442
    //   1099: aload #21
    //   1101: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1104: checkcast android/support/v7/widget/af$a
    //   1107: astore #18
    //   1109: aload #18
    //   1111: getfield g : F
    //   1114: fstore #26
    //   1116: fload #26
    //   1118: fconst_0
    //   1119: fcmpl
    //   1120: ifle -> 1290
    //   1123: iload #17
    //   1125: i2f
    //   1126: fload #26
    //   1128: fmul
    //   1129: fload #9
    //   1131: fdiv
    //   1132: f2i
    //   1133: istore #12
    //   1135: aload_0
    //   1136: invokevirtual getPaddingLeft : ()I
    //   1139: istore #24
    //   1141: aload_0
    //   1142: invokevirtual getPaddingRight : ()I
    //   1145: istore #14
    //   1147: iload #17
    //   1149: iload #12
    //   1151: isub
    //   1152: istore #13
    //   1154: aload #18
    //   1156: getfield leftMargin : I
    //   1159: istore #25
    //   1161: aload #18
    //   1163: getfield rightMargin : I
    //   1166: istore #17
    //   1168: aload #18
    //   1170: getfield width : I
    //   1173: istore #7
    //   1175: fload #9
    //   1177: fload #26
    //   1179: fsub
    //   1180: fstore #9
    //   1182: iload_1
    //   1183: iload #24
    //   1185: iload #14
    //   1187: iadd
    //   1188: iload #25
    //   1190: iadd
    //   1191: iload #17
    //   1193: iadd
    //   1194: iload #7
    //   1196: invokestatic getChildMeasureSpec : (III)I
    //   1199: istore #14
    //   1201: aload #18
    //   1203: getfield height : I
    //   1206: ifne -> 1231
    //   1209: iload #19
    //   1211: ldc 1073741824
    //   1213: if_icmpeq -> 1219
    //   1216: goto -> 1231
    //   1219: iload #12
    //   1221: ifle -> 1250
    //   1224: iload #12
    //   1226: istore #17
    //   1228: goto -> 1253
    //   1231: aload #21
    //   1233: invokevirtual getMeasuredHeight : ()I
    //   1236: iload #12
    //   1238: iadd
    //   1239: istore #12
    //   1241: iload #12
    //   1243: istore #17
    //   1245: iload #12
    //   1247: ifge -> 1253
    //   1250: iconst_0
    //   1251: istore #17
    //   1253: aload #21
    //   1255: iload #14
    //   1257: iload #17
    //   1259: ldc 1073741824
    //   1261: invokestatic makeMeasureSpec : (II)I
    //   1264: invokevirtual measure : (II)V
    //   1267: iload #10
    //   1269: aload #21
    //   1271: invokestatic f : (Landroid/view/View;)I
    //   1274: sipush #-256
    //   1277: iand
    //   1278: invokestatic a : (II)I
    //   1281: istore #10
    //   1283: iload #13
    //   1285: istore #17
    //   1287: goto -> 1290
    //   1290: aload #18
    //   1292: getfield leftMargin : I
    //   1295: aload #18
    //   1297: getfield rightMargin : I
    //   1300: iadd
    //   1301: istore #14
    //   1303: aload #21
    //   1305: invokevirtual getMeasuredWidth : ()I
    //   1308: iload #14
    //   1310: iadd
    //   1311: istore #13
    //   1313: iload #11
    //   1315: iload #13
    //   1317: invokestatic max : (II)I
    //   1320: istore #12
    //   1322: iload #5
    //   1324: ldc 1073741824
    //   1326: if_icmpeq -> 1344
    //   1329: aload #18
    //   1331: getfield width : I
    //   1334: iconst_m1
    //   1335: if_icmpne -> 1344
    //   1338: iconst_1
    //   1339: istore #11
    //   1341: goto -> 1347
    //   1344: iconst_0
    //   1345: istore #11
    //   1347: iload #11
    //   1349: ifeq -> 1356
    //   1352: iload #14
    //   1354: istore #13
    //   1356: iload #6
    //   1358: iload #13
    //   1360: invokestatic max : (II)I
    //   1363: istore #13
    //   1365: iload #15
    //   1367: ifeq -> 1385
    //   1370: aload #18
    //   1372: getfield width : I
    //   1375: iconst_m1
    //   1376: if_icmpne -> 1385
    //   1379: iconst_1
    //   1380: istore #6
    //   1382: goto -> 1388
    //   1385: iconst_0
    //   1386: istore #6
    //   1388: aload_0
    //   1389: getfield f : I
    //   1392: istore #15
    //   1394: aload_0
    //   1395: iload #15
    //   1397: iload #15
    //   1399: aload #21
    //   1401: invokevirtual getMeasuredHeight : ()I
    //   1404: iadd
    //   1405: aload #18
    //   1407: getfield topMargin : I
    //   1410: iadd
    //   1411: aload #18
    //   1413: getfield bottomMargin : I
    //   1416: iadd
    //   1417: aload_0
    //   1418: aload #21
    //   1420: invokevirtual b : (Landroid/view/View;)I
    //   1423: iadd
    //   1424: invokestatic max : (II)I
    //   1427: putfield f : I
    //   1430: iload #6
    //   1432: istore #15
    //   1434: iload #12
    //   1436: istore #11
    //   1438: iload #13
    //   1440: istore #6
    //   1442: iinc #3, 1
    //   1445: goto -> 1073
    //   1448: aload_0
    //   1449: aload_0
    //   1450: getfield f : I
    //   1453: aload_0
    //   1454: invokevirtual getPaddingTop : ()I
    //   1457: aload_0
    //   1458: invokevirtual getPaddingBottom : ()I
    //   1461: iadd
    //   1462: iadd
    //   1463: putfield f : I
    //   1466: iload #10
    //   1468: istore_3
    //   1469: iload #11
    //   1471: istore #10
    //   1473: iload #10
    //   1475: istore #11
    //   1477: iload #15
    //   1479: ifne -> 1497
    //   1482: iload #10
    //   1484: istore #11
    //   1486: iload #5
    //   1488: ldc 1073741824
    //   1490: if_icmpeq -> 1497
    //   1493: iload #6
    //   1495: istore #11
    //   1497: aload_0
    //   1498: iload #11
    //   1500: aload_0
    //   1501: invokevirtual getPaddingLeft : ()I
    //   1504: aload_0
    //   1505: invokevirtual getPaddingRight : ()I
    //   1508: iadd
    //   1509: iadd
    //   1510: aload_0
    //   1511: invokevirtual getSuggestedMinimumWidth : ()I
    //   1514: invokestatic max : (II)I
    //   1517: iload_1
    //   1518: iload_3
    //   1519: invokestatic a : (III)I
    //   1522: iload #20
    //   1524: invokevirtual setMeasuredDimension : (II)V
    //   1527: iload #16
    //   1529: ifeq -> 1539
    //   1532: aload_0
    //   1533: iload #4
    //   1535: iload_2
    //   1536: invokespecial c : (II)V
    //   1539: return }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i1 = getPaddingLeft();
    int i2 = paramInt3 - paramInt1;
    int i3 = getPaddingRight();
    int i4 = getPaddingRight();
    int i5 = getVirtualChildCount();
    paramInt1 = this.e & 0x70;
    int i6 = this.e;
    if (paramInt1 != 16) {
      if (paramInt1 != 80) {
        paramInt1 = getPaddingTop();
      } else {
        paramInt1 = getPaddingTop() + paramInt4 - paramInt2 - this.f;
      } 
    } else {
      paramInt1 = getPaddingTop();
      paramInt1 = (paramInt4 - paramInt2 - this.f) / 2 + paramInt1;
    } 
    paramInt2 = 0;
    while (paramInt2 < i5) {
      View view = b(paramInt2);
      if (view == null) {
        paramInt3 = paramInt1 + d(paramInt2);
        paramInt4 = paramInt2;
      } else {
        paramInt3 = paramInt1;
        paramInt4 = paramInt2;
        if (view.getVisibility() != 8) {
          int i7 = view.getMeasuredWidth();
          int i8 = view.getMeasuredHeight();
          a a1 = (a)view.getLayoutParams();
          paramInt4 = a1.h;
          paramInt3 = paramInt4;
          if (paramInt4 < 0)
            paramInt3 = i6 & 0x800007; 
          paramInt3 = e.a(paramInt3, af.d(this)) & 0x7;
          if (paramInt3 != 1) {
            if (paramInt3 != 5) {
              paramInt3 = a1.leftMargin + i1;
            } else {
              paramInt3 = i2 - i3 - i7;
              paramInt3 -= a1.rightMargin;
            } 
          } else {
            paramInt3 = (i2 - i1 - i4 - i7) / 2 + i1 + a1.leftMargin;
            paramInt3 -= a1.rightMargin;
          } 
          paramInt4 = paramInt1;
          if (c(paramInt2))
            paramInt4 = paramInt1 + this.m; 
          paramInt1 = paramInt4 + a1.topMargin;
          a(view, paramInt3, paramInt1 + a(view), i7, i8);
          paramInt3 = a1.bottomMargin;
          i7 = b(view);
          paramInt4 = paramInt2 + a(view, paramInt2);
          paramInt3 = paramInt1 + i8 + paramInt3 + i7;
        } 
      } 
      paramInt2 = paramInt4 + 1;
      paramInt1 = paramInt3;
    } 
  }
  
  void a(Canvas paramCanvas) {
    int i1 = getVirtualChildCount();
    int i2;
    for (i2 = 0; i2 < i1; i2++) {
      View view = b(i2);
      if (view != null && view.getVisibility() != 8 && c(i2)) {
        a a1 = (a)view.getLayoutParams();
        a(paramCanvas, view.getTop() - a1.topMargin - this.m);
      } 
    } 
    if (c(i1)) {
      View view = b(i1 - 1);
      if (view == null) {
        i2 = getHeight() - getPaddingBottom() - this.m;
      } else {
        a a1 = (a)view.getLayoutParams();
        i2 = view.getBottom() + a1.bottomMargin;
      } 
      a(paramCanvas, i2);
    } 
  }
  
  void a(Canvas paramCanvas, int paramInt) {
    this.k.setBounds(getPaddingLeft() + this.o, paramInt, getWidth() - getPaddingRight() - this.o, this.m + paramInt);
    this.k.draw(paramCanvas);
  }
  
  void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) { measureChildWithMargins(paramView, paramInt2, paramInt3, paramInt4, paramInt5); }
  
  int b(View paramView) { return 0; }
  
  public a b(AttributeSet paramAttributeSet) { return new a(getContext(), paramAttributeSet); }
  
  protected a b(ViewGroup.LayoutParams paramLayoutParams) { return new a(paramLayoutParams); }
  
  View b(int paramInt) { return getChildAt(paramInt); }
  
  void b(int paramInt1, int paramInt2) { // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield f : I
    //   5: aload_0
    //   6: invokevirtual getVirtualChildCount : ()I
    //   9: istore_3
    //   10: iload_1
    //   11: invokestatic getMode : (I)I
    //   14: istore #4
    //   16: iload_2
    //   17: invokestatic getMode : (I)I
    //   20: istore #5
    //   22: aload_0
    //   23: getfield i : [I
    //   26: ifnull -> 36
    //   29: aload_0
    //   30: getfield j : [I
    //   33: ifnonnull -> 50
    //   36: aload_0
    //   37: iconst_4
    //   38: newarray int
    //   40: putfield i : [I
    //   43: aload_0
    //   44: iconst_4
    //   45: newarray int
    //   47: putfield j : [I
    //   50: aload_0
    //   51: getfield i : [I
    //   54: astore #6
    //   56: aload_0
    //   57: getfield j : [I
    //   60: astore #7
    //   62: aload #6
    //   64: iconst_3
    //   65: iconst_m1
    //   66: iastore
    //   67: aload #6
    //   69: iconst_2
    //   70: iconst_m1
    //   71: iastore
    //   72: aload #6
    //   74: iconst_1
    //   75: iconst_m1
    //   76: iastore
    //   77: aload #6
    //   79: iconst_0
    //   80: iconst_m1
    //   81: iastore
    //   82: aload #7
    //   84: iconst_3
    //   85: iconst_m1
    //   86: iastore
    //   87: aload #7
    //   89: iconst_2
    //   90: iconst_m1
    //   91: iastore
    //   92: aload #7
    //   94: iconst_1
    //   95: iconst_m1
    //   96: iastore
    //   97: aload #7
    //   99: iconst_0
    //   100: iconst_m1
    //   101: iastore
    //   102: aload_0
    //   103: getfield a : Z
    //   106: istore #8
    //   108: aload_0
    //   109: getfield h : Z
    //   112: istore #9
    //   114: iload #4
    //   116: ldc 1073741824
    //   118: if_icmpne -> 127
    //   121: iconst_1
    //   122: istore #10
    //   124: goto -> 130
    //   127: iconst_0
    //   128: istore #10
    //   130: iconst_0
    //   131: istore #11
    //   133: ldc -2147483648
    //   135: istore #12
    //   137: fconst_0
    //   138: fstore #13
    //   140: iconst_0
    //   141: istore #14
    //   143: iconst_0
    //   144: istore #15
    //   146: iconst_0
    //   147: istore #16
    //   149: iconst_0
    //   150: istore #17
    //   152: iconst_0
    //   153: istore #18
    //   155: iconst_1
    //   156: istore #19
    //   158: iconst_0
    //   159: istore #20
    //   161: iload #11
    //   163: iload_3
    //   164: if_icmpge -> 868
    //   167: aload_0
    //   168: iload #11
    //   170: invokevirtual b : (I)Landroid/view/View;
    //   173: astore #21
    //   175: aload #21
    //   177: ifnonnull -> 198
    //   180: aload_0
    //   181: aload_0
    //   182: getfield f : I
    //   185: aload_0
    //   186: iload #11
    //   188: invokevirtual d : (I)I
    //   191: iadd
    //   192: putfield f : I
    //   195: goto -> 862
    //   198: aload #21
    //   200: invokevirtual getVisibility : ()I
    //   203: bipush #8
    //   205: if_icmpne -> 224
    //   208: iload #11
    //   210: aload_0
    //   211: aload #21
    //   213: iload #11
    //   215: invokevirtual a : (Landroid/view/View;I)I
    //   218: iadd
    //   219: istore #11
    //   221: goto -> 195
    //   224: aload_0
    //   225: iload #11
    //   227: invokevirtual c : (I)Z
    //   230: ifeq -> 246
    //   233: aload_0
    //   234: aload_0
    //   235: getfield f : I
    //   238: aload_0
    //   239: getfield l : I
    //   242: iadd
    //   243: putfield f : I
    //   246: aload #21
    //   248: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   251: checkcast android/support/v7/widget/af$a
    //   254: astore #22
    //   256: fload #13
    //   258: aload #22
    //   260: getfield g : F
    //   263: fadd
    //   264: fstore #13
    //   266: iload #4
    //   268: ldc 1073741824
    //   270: if_icmpne -> 387
    //   273: aload #22
    //   275: getfield width : I
    //   278: ifne -> 387
    //   281: aload #22
    //   283: getfield g : F
    //   286: fconst_0
    //   287: fcmpl
    //   288: ifle -> 387
    //   291: iload #10
    //   293: ifeq -> 323
    //   296: aload_0
    //   297: getfield f : I
    //   300: aload #22
    //   302: getfield leftMargin : I
    //   305: aload #22
    //   307: getfield rightMargin : I
    //   310: iadd
    //   311: iadd
    //   312: istore #23
    //   314: aload_0
    //   315: iload #23
    //   317: putfield f : I
    //   320: goto -> 353
    //   323: aload_0
    //   324: getfield f : I
    //   327: istore #23
    //   329: iload #23
    //   331: aload #22
    //   333: getfield leftMargin : I
    //   336: iload #23
    //   338: iadd
    //   339: aload #22
    //   341: getfield rightMargin : I
    //   344: iadd
    //   345: invokestatic max : (II)I
    //   348: istore #23
    //   350: goto -> 314
    //   353: iload #8
    //   355: ifeq -> 381
    //   358: iconst_0
    //   359: iconst_0
    //   360: invokestatic makeMeasureSpec : (II)I
    //   363: istore #23
    //   365: aload #21
    //   367: iload #23
    //   369: iload #23
    //   371: invokevirtual measure : (II)V
    //   374: iload #12
    //   376: istore #23
    //   378: goto -> 583
    //   381: iconst_1
    //   382: istore #15
    //   384: goto -> 587
    //   387: aload #22
    //   389: getfield width : I
    //   392: ifne -> 418
    //   395: aload #22
    //   397: getfield g : F
    //   400: fconst_0
    //   401: fcmpl
    //   402: ifle -> 418
    //   405: aload #22
    //   407: bipush #-2
    //   409: putfield width : I
    //   412: iconst_0
    //   413: istore #23
    //   415: goto -> 422
    //   418: ldc -2147483648
    //   420: istore #23
    //   422: fload #13
    //   424: fconst_0
    //   425: fcmpl
    //   426: ifne -> 438
    //   429: aload_0
    //   430: getfield f : I
    //   433: istore #24
    //   435: goto -> 441
    //   438: iconst_0
    //   439: istore #24
    //   441: aload #22
    //   443: astore #25
    //   445: aload #21
    //   447: astore #26
    //   449: aload_0
    //   450: aload #21
    //   452: iload #11
    //   454: iload_1
    //   455: iload #24
    //   457: iload_2
    //   458: iconst_0
    //   459: invokevirtual a : (Landroid/view/View;IIIII)V
    //   462: iload #23
    //   464: ldc -2147483648
    //   466: if_icmpeq -> 476
    //   469: aload #25
    //   471: iload #23
    //   473: putfield width : I
    //   476: aload #26
    //   478: invokevirtual getMeasuredWidth : ()I
    //   481: istore #24
    //   483: iload #10
    //   485: ifeq -> 525
    //   488: aload_0
    //   489: getfield f : I
    //   492: aload #25
    //   494: getfield leftMargin : I
    //   497: iload #24
    //   499: iadd
    //   500: aload #25
    //   502: getfield rightMargin : I
    //   505: iadd
    //   506: aload_0
    //   507: aload #26
    //   509: invokevirtual b : (Landroid/view/View;)I
    //   512: iadd
    //   513: iadd
    //   514: istore #23
    //   516: aload_0
    //   517: iload #23
    //   519: putfield f : I
    //   522: goto -> 565
    //   525: aload_0
    //   526: getfield f : I
    //   529: istore #23
    //   531: iload #23
    //   533: iload #23
    //   535: iload #24
    //   537: iadd
    //   538: aload #25
    //   540: getfield leftMargin : I
    //   543: iadd
    //   544: aload #25
    //   546: getfield rightMargin : I
    //   549: iadd
    //   550: aload_0
    //   551: aload #26
    //   553: invokevirtual b : (Landroid/view/View;)I
    //   556: iadd
    //   557: invokestatic max : (II)I
    //   560: istore #23
    //   562: goto -> 516
    //   565: iload #12
    //   567: istore #23
    //   569: iload #9
    //   571: ifeq -> 583
    //   574: iload #24
    //   576: iload #12
    //   578: invokestatic max : (II)I
    //   581: istore #23
    //   583: iload #23
    //   585: istore #12
    //   587: iload #11
    //   589: istore #27
    //   591: iload #5
    //   593: ldc 1073741824
    //   595: if_icmpeq -> 616
    //   598: aload #22
    //   600: getfield height : I
    //   603: iconst_m1
    //   604: if_icmpne -> 616
    //   607: iconst_1
    //   608: istore #11
    //   610: iconst_1
    //   611: istore #20
    //   613: goto -> 619
    //   616: iconst_0
    //   617: istore #11
    //   619: aload #22
    //   621: getfield topMargin : I
    //   624: aload #22
    //   626: getfield bottomMargin : I
    //   629: iadd
    //   630: istore #23
    //   632: aload #21
    //   634: invokevirtual getMeasuredHeight : ()I
    //   637: iload #23
    //   639: iadd
    //   640: istore #24
    //   642: iload #18
    //   644: aload #21
    //   646: invokestatic f : (Landroid/view/View;)I
    //   649: invokestatic a : (II)I
    //   652: istore #28
    //   654: iload #8
    //   656: ifeq -> 743
    //   659: aload #21
    //   661: invokevirtual getBaseline : ()I
    //   664: istore #29
    //   666: iload #29
    //   668: iconst_m1
    //   669: if_icmpeq -> 743
    //   672: aload #22
    //   674: getfield h : I
    //   677: ifge -> 689
    //   680: aload_0
    //   681: getfield e : I
    //   684: istore #18
    //   686: goto -> 696
    //   689: aload #22
    //   691: getfield h : I
    //   694: istore #18
    //   696: iload #18
    //   698: bipush #112
    //   700: iand
    //   701: iconst_4
    //   702: ishr
    //   703: bipush #-2
    //   705: iand
    //   706: iconst_1
    //   707: ishr
    //   708: istore #18
    //   710: aload #6
    //   712: iload #18
    //   714: aload #6
    //   716: iload #18
    //   718: iaload
    //   719: iload #29
    //   721: invokestatic max : (II)I
    //   724: iastore
    //   725: aload #7
    //   727: iload #18
    //   729: aload #7
    //   731: iload #18
    //   733: iaload
    //   734: iload #24
    //   736: iload #29
    //   738: isub
    //   739: invokestatic max : (II)I
    //   742: iastore
    //   743: iload #14
    //   745: iload #24
    //   747: invokestatic max : (II)I
    //   750: istore #14
    //   752: iload #19
    //   754: ifeq -> 772
    //   757: aload #22
    //   759: getfield height : I
    //   762: iconst_m1
    //   763: if_icmpne -> 772
    //   766: iconst_1
    //   767: istore #19
    //   769: goto -> 775
    //   772: iconst_0
    //   773: istore #19
    //   775: aload #22
    //   777: getfield g : F
    //   780: fconst_0
    //   781: fcmpl
    //   782: ifle -> 812
    //   785: iload #11
    //   787: ifeq -> 793
    //   790: goto -> 800
    //   793: iload #24
    //   795: istore #23
    //   797: goto -> 790
    //   800: iload #17
    //   802: iload #23
    //   804: invokestatic max : (II)I
    //   807: istore #11
    //   809: goto -> 837
    //   812: iload #11
    //   814: ifeq -> 821
    //   817: iload #23
    //   819: istore #24
    //   821: iload #16
    //   823: iload #24
    //   825: invokestatic max : (II)I
    //   828: istore #16
    //   830: iload #17
    //   832: istore #11
    //   834: goto -> 809
    //   837: aload_0
    //   838: aload #21
    //   840: iload #27
    //   842: invokevirtual a : (Landroid/view/View;I)I
    //   845: iload #27
    //   847: iadd
    //   848: istore #23
    //   850: iload #28
    //   852: istore #18
    //   854: iload #11
    //   856: istore #17
    //   858: iload #23
    //   860: istore #11
    //   862: iinc #11, 1
    //   865: goto -> 161
    //   868: iload #14
    //   870: istore #11
    //   872: aload_0
    //   873: getfield f : I
    //   876: ifle -> 900
    //   879: aload_0
    //   880: iload_3
    //   881: invokevirtual c : (I)Z
    //   884: ifeq -> 900
    //   887: aload_0
    //   888: aload_0
    //   889: getfield f : I
    //   892: aload_0
    //   893: getfield l : I
    //   896: iadd
    //   897: putfield f : I
    //   900: aload #6
    //   902: iconst_1
    //   903: iaload
    //   904: iconst_m1
    //   905: if_icmpne -> 936
    //   908: aload #6
    //   910: iconst_0
    //   911: iaload
    //   912: iconst_m1
    //   913: if_icmpne -> 936
    //   916: aload #6
    //   918: iconst_2
    //   919: iaload
    //   920: iconst_m1
    //   921: if_icmpne -> 936
    //   924: iload #11
    //   926: istore #14
    //   928: aload #6
    //   930: iconst_3
    //   931: iaload
    //   932: iconst_m1
    //   933: if_icmpeq -> 994
    //   936: iload #11
    //   938: aload #6
    //   940: iconst_3
    //   941: iaload
    //   942: aload #6
    //   944: iconst_0
    //   945: iaload
    //   946: aload #6
    //   948: iconst_1
    //   949: iaload
    //   950: aload #6
    //   952: iconst_2
    //   953: iaload
    //   954: invokestatic max : (II)I
    //   957: invokestatic max : (II)I
    //   960: invokestatic max : (II)I
    //   963: aload #7
    //   965: iconst_3
    //   966: iaload
    //   967: aload #7
    //   969: iconst_0
    //   970: iaload
    //   971: aload #7
    //   973: iconst_1
    //   974: iaload
    //   975: aload #7
    //   977: iconst_2
    //   978: iaload
    //   979: invokestatic max : (II)I
    //   982: invokestatic max : (II)I
    //   985: invokestatic max : (II)I
    //   988: iadd
    //   989: invokestatic max : (II)I
    //   992: istore #14
    //   994: iload #9
    //   996: ifeq -> 1179
    //   999: iload #4
    //   1001: istore #11
    //   1003: iload #11
    //   1005: ldc -2147483648
    //   1007: if_icmpeq -> 1015
    //   1010: iload #11
    //   1012: ifne -> 1179
    //   1015: aload_0
    //   1016: iconst_0
    //   1017: putfield f : I
    //   1020: iconst_0
    //   1021: istore #11
    //   1023: iload #11
    //   1025: iload_3
    //   1026: if_icmpge -> 1179
    //   1029: aload_0
    //   1030: iload #11
    //   1032: invokevirtual b : (I)Landroid/view/View;
    //   1035: astore #21
    //   1037: aload #21
    //   1039: ifnonnull -> 1060
    //   1042: aload_0
    //   1043: aload_0
    //   1044: getfield f : I
    //   1047: aload_0
    //   1048: iload #11
    //   1050: invokevirtual d : (I)I
    //   1053: iadd
    //   1054: putfield f : I
    //   1057: goto -> 1083
    //   1060: aload #21
    //   1062: invokevirtual getVisibility : ()I
    //   1065: bipush #8
    //   1067: if_icmpne -> 1086
    //   1070: iload #11
    //   1072: aload_0
    //   1073: aload #21
    //   1075: iload #11
    //   1077: invokevirtual a : (Landroid/view/View;I)I
    //   1080: iadd
    //   1081: istore #11
    //   1083: goto -> 1173
    //   1086: aload #21
    //   1088: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1091: checkcast android/support/v7/widget/af$a
    //   1094: astore #22
    //   1096: iload #10
    //   1098: ifeq -> 1134
    //   1101: aload_0
    //   1102: aload_0
    //   1103: getfield f : I
    //   1106: aload #22
    //   1108: getfield leftMargin : I
    //   1111: iload #12
    //   1113: iadd
    //   1114: aload #22
    //   1116: getfield rightMargin : I
    //   1119: iadd
    //   1120: aload_0
    //   1121: aload #21
    //   1123: invokevirtual b : (Landroid/view/View;)I
    //   1126: iadd
    //   1127: iadd
    //   1128: putfield f : I
    //   1131: goto -> 1083
    //   1134: aload_0
    //   1135: getfield f : I
    //   1138: istore #23
    //   1140: aload_0
    //   1141: iload #23
    //   1143: iload #23
    //   1145: iload #12
    //   1147: iadd
    //   1148: aload #22
    //   1150: getfield leftMargin : I
    //   1153: iadd
    //   1154: aload #22
    //   1156: getfield rightMargin : I
    //   1159: iadd
    //   1160: aload_0
    //   1161: aload #21
    //   1163: invokevirtual b : (Landroid/view/View;)I
    //   1166: iadd
    //   1167: invokestatic max : (II)I
    //   1170: putfield f : I
    //   1173: iinc #11, 1
    //   1176: goto -> 1023
    //   1179: iload #4
    //   1181: istore #23
    //   1183: aload_0
    //   1184: aload_0
    //   1185: getfield f : I
    //   1188: aload_0
    //   1189: invokevirtual getPaddingLeft : ()I
    //   1192: aload_0
    //   1193: invokevirtual getPaddingRight : ()I
    //   1196: iadd
    //   1197: iadd
    //   1198: putfield f : I
    //   1201: aload_0
    //   1202: getfield f : I
    //   1205: aload_0
    //   1206: invokevirtual getSuggestedMinimumWidth : ()I
    //   1209: invokestatic max : (II)I
    //   1212: iload_1
    //   1213: iconst_0
    //   1214: invokestatic a : (III)I
    //   1217: istore #27
    //   1219: ldc 16777215
    //   1221: iload #27
    //   1223: iand
    //   1224: aload_0
    //   1225: getfield f : I
    //   1228: isub
    //   1229: istore #24
    //   1231: iload #15
    //   1233: ifne -> 1369
    //   1236: iload #24
    //   1238: ifeq -> 1251
    //   1241: fload #13
    //   1243: fconst_0
    //   1244: fcmpl
    //   1245: ifle -> 1251
    //   1248: goto -> 1369
    //   1251: iload #16
    //   1253: iload #17
    //   1255: invokestatic max : (II)I
    //   1258: istore #16
    //   1260: iload #9
    //   1262: ifeq -> 1351
    //   1265: iload #23
    //   1267: ldc 1073741824
    //   1269: if_icmpeq -> 1351
    //   1272: iconst_0
    //   1273: istore #4
    //   1275: iload #4
    //   1277: iload_3
    //   1278: if_icmpge -> 1351
    //   1281: aload_0
    //   1282: iload #4
    //   1284: invokevirtual b : (I)Landroid/view/View;
    //   1287: astore #7
    //   1289: aload #7
    //   1291: ifnull -> 1345
    //   1294: aload #7
    //   1296: invokevirtual getVisibility : ()I
    //   1299: bipush #8
    //   1301: if_icmpne -> 1307
    //   1304: goto -> 1345
    //   1307: aload #7
    //   1309: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1312: checkcast android/support/v7/widget/af$a
    //   1315: getfield g : F
    //   1318: fconst_0
    //   1319: fcmpl
    //   1320: ifle -> 1345
    //   1323: aload #7
    //   1325: iload #12
    //   1327: ldc 1073741824
    //   1329: invokestatic makeMeasureSpec : (II)I
    //   1332: aload #7
    //   1334: invokevirtual getMeasuredHeight : ()I
    //   1337: ldc 1073741824
    //   1339: invokestatic makeMeasureSpec : (II)I
    //   1342: invokevirtual measure : (II)V
    //   1345: iinc #4, 1
    //   1348: goto -> 1275
    //   1351: iload #16
    //   1353: istore #12
    //   1355: iload_3
    //   1356: istore #17
    //   1358: iload #14
    //   1360: istore #4
    //   1362: iload #19
    //   1364: istore #16
    //   1366: goto -> 2096
    //   1369: aload_0
    //   1370: getfield g : F
    //   1373: fconst_0
    //   1374: fcmpl
    //   1375: ifle -> 1387
    //   1378: aload_0
    //   1379: getfield g : F
    //   1382: fstore #13
    //   1384: goto -> 1390
    //   1387: goto -> 1384
    //   1390: aload #6
    //   1392: iconst_3
    //   1393: iconst_m1
    //   1394: iastore
    //   1395: aload #6
    //   1397: iconst_2
    //   1398: iconst_m1
    //   1399: iastore
    //   1400: aload #6
    //   1402: iconst_1
    //   1403: iconst_m1
    //   1404: iastore
    //   1405: aload #6
    //   1407: iconst_0
    //   1408: iconst_m1
    //   1409: iastore
    //   1410: aload #7
    //   1412: iconst_3
    //   1413: iconst_m1
    //   1414: iastore
    //   1415: aload #7
    //   1417: iconst_2
    //   1418: iconst_m1
    //   1419: iastore
    //   1420: aload #7
    //   1422: iconst_1
    //   1423: iconst_m1
    //   1424: iastore
    //   1425: aload #7
    //   1427: iconst_0
    //   1428: iconst_m1
    //   1429: iastore
    //   1430: aload_0
    //   1431: iconst_0
    //   1432: putfield f : I
    //   1435: iload #16
    //   1437: istore #12
    //   1439: iconst_0
    //   1440: istore #15
    //   1442: iconst_m1
    //   1443: istore #11
    //   1445: iload #19
    //   1447: istore #16
    //   1449: iload_3
    //   1450: istore #4
    //   1452: iload #18
    //   1454: istore #19
    //   1456: iload #24
    //   1458: istore #17
    //   1460: iload #15
    //   1462: iload #4
    //   1464: if_icmpge -> 1966
    //   1467: aload_0
    //   1468: iload #15
    //   1470: invokevirtual b : (I)Landroid/view/View;
    //   1473: astore #22
    //   1475: aload #22
    //   1477: ifnull -> 1960
    //   1480: aload #22
    //   1482: invokevirtual getVisibility : ()I
    //   1485: bipush #8
    //   1487: if_icmpne -> 1493
    //   1490: goto -> 1960
    //   1493: aload #22
    //   1495: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1498: checkcast android/support/v7/widget/af$a
    //   1501: astore #21
    //   1503: aload #21
    //   1505: getfield g : F
    //   1508: fstore #30
    //   1510: fload #30
    //   1512: fconst_0
    //   1513: fcmpl
    //   1514: ifle -> 1668
    //   1517: iload #17
    //   1519: i2f
    //   1520: fload #30
    //   1522: fmul
    //   1523: fload #13
    //   1525: fdiv
    //   1526: f2i
    //   1527: istore #18
    //   1529: fload #13
    //   1531: fload #30
    //   1533: fsub
    //   1534: fstore #13
    //   1536: aload_0
    //   1537: invokevirtual getPaddingTop : ()I
    //   1540: istore_3
    //   1541: aload_0
    //   1542: invokevirtual getPaddingBottom : ()I
    //   1545: istore #24
    //   1547: iload #17
    //   1549: iload #18
    //   1551: isub
    //   1552: istore #14
    //   1554: iload_2
    //   1555: iload_3
    //   1556: iload #24
    //   1558: iadd
    //   1559: aload #21
    //   1561: getfield topMargin : I
    //   1564: iadd
    //   1565: aload #21
    //   1567: getfield bottomMargin : I
    //   1570: iadd
    //   1571: aload #21
    //   1573: getfield height : I
    //   1576: invokestatic getChildMeasureSpec : (III)I
    //   1579: istore_3
    //   1580: aload #21
    //   1582: getfield width : I
    //   1585: ifne -> 1610
    //   1588: iload #23
    //   1590: ldc 1073741824
    //   1592: if_icmpeq -> 1598
    //   1595: goto -> 1610
    //   1598: iload #18
    //   1600: ifle -> 1629
    //   1603: iload #18
    //   1605: istore #17
    //   1607: goto -> 1632
    //   1610: aload #22
    //   1612: invokevirtual getMeasuredWidth : ()I
    //   1615: iload #18
    //   1617: iadd
    //   1618: istore #18
    //   1620: iload #18
    //   1622: istore #17
    //   1624: iload #18
    //   1626: ifge -> 1632
    //   1629: iconst_0
    //   1630: istore #17
    //   1632: aload #22
    //   1634: iload #17
    //   1636: ldc 1073741824
    //   1638: invokestatic makeMeasureSpec : (II)I
    //   1641: iload_3
    //   1642: invokevirtual measure : (II)V
    //   1645: iload #19
    //   1647: aload #22
    //   1649: invokestatic f : (Landroid/view/View;)I
    //   1652: ldc_w -16777216
    //   1655: iand
    //   1656: invokestatic a : (II)I
    //   1659: istore #19
    //   1661: iload #14
    //   1663: istore #17
    //   1665: goto -> 1668
    //   1668: iload #10
    //   1670: ifeq -> 1713
    //   1673: aload_0
    //   1674: getfield f : I
    //   1677: aload #22
    //   1679: invokevirtual getMeasuredWidth : ()I
    //   1682: aload #21
    //   1684: getfield leftMargin : I
    //   1687: iadd
    //   1688: aload #21
    //   1690: getfield rightMargin : I
    //   1693: iadd
    //   1694: aload_0
    //   1695: aload #22
    //   1697: invokevirtual b : (Landroid/view/View;)I
    //   1700: iadd
    //   1701: iadd
    //   1702: istore #14
    //   1704: aload_0
    //   1705: iload #14
    //   1707: putfield f : I
    //   1710: goto -> 1756
    //   1713: aload_0
    //   1714: getfield f : I
    //   1717: istore #14
    //   1719: iload #14
    //   1721: aload #22
    //   1723: invokevirtual getMeasuredWidth : ()I
    //   1726: iload #14
    //   1728: iadd
    //   1729: aload #21
    //   1731: getfield leftMargin : I
    //   1734: iadd
    //   1735: aload #21
    //   1737: getfield rightMargin : I
    //   1740: iadd
    //   1741: aload_0
    //   1742: aload #22
    //   1744: invokevirtual b : (Landroid/view/View;)I
    //   1747: iadd
    //   1748: invokestatic max : (II)I
    //   1751: istore #14
    //   1753: goto -> 1704
    //   1756: iload #5
    //   1758: ldc 1073741824
    //   1760: if_icmpeq -> 1778
    //   1763: aload #21
    //   1765: getfield height : I
    //   1768: iconst_m1
    //   1769: if_icmpne -> 1778
    //   1772: iconst_1
    //   1773: istore #14
    //   1775: goto -> 1781
    //   1778: iconst_0
    //   1779: istore #14
    //   1781: aload #21
    //   1783: getfield topMargin : I
    //   1786: aload #21
    //   1788: getfield bottomMargin : I
    //   1791: iadd
    //   1792: istore #24
    //   1794: aload #22
    //   1796: invokevirtual getMeasuredHeight : ()I
    //   1799: iload #24
    //   1801: iadd
    //   1802: istore_3
    //   1803: iload #11
    //   1805: iload_3
    //   1806: invokestatic max : (II)I
    //   1809: istore #18
    //   1811: iload #14
    //   1813: ifeq -> 1823
    //   1816: iload #24
    //   1818: istore #11
    //   1820: goto -> 1826
    //   1823: iload_3
    //   1824: istore #11
    //   1826: iload #12
    //   1828: iload #11
    //   1830: invokestatic max : (II)I
    //   1833: istore #11
    //   1835: iload #16
    //   1837: ifeq -> 1855
    //   1840: aload #21
    //   1842: getfield height : I
    //   1845: iconst_m1
    //   1846: if_icmpne -> 1855
    //   1849: iconst_1
    //   1850: istore #16
    //   1852: goto -> 1858
    //   1855: iconst_0
    //   1856: istore #16
    //   1858: iload #8
    //   1860: ifeq -> 1949
    //   1863: aload #22
    //   1865: invokevirtual getBaseline : ()I
    //   1868: istore #14
    //   1870: iload #14
    //   1872: iconst_m1
    //   1873: if_icmpeq -> 1949
    //   1876: aload #21
    //   1878: getfield h : I
    //   1881: ifge -> 1893
    //   1884: aload_0
    //   1885: getfield e : I
    //   1888: istore #12
    //   1890: goto -> 1900
    //   1893: aload #21
    //   1895: getfield h : I
    //   1898: istore #12
    //   1900: iload #12
    //   1902: bipush #112
    //   1904: iand
    //   1905: iconst_4
    //   1906: ishr
    //   1907: bipush #-2
    //   1909: iand
    //   1910: iconst_1
    //   1911: ishr
    //   1912: istore #12
    //   1914: aload #6
    //   1916: iload #12
    //   1918: aload #6
    //   1920: iload #12
    //   1922: iaload
    //   1923: iload #14
    //   1925: invokestatic max : (II)I
    //   1928: iastore
    //   1929: aload #7
    //   1931: iload #12
    //   1933: aload #7
    //   1935: iload #12
    //   1937: iaload
    //   1938: iload_3
    //   1939: iload #14
    //   1941: isub
    //   1942: invokestatic max : (II)I
    //   1945: iastore
    //   1946: goto -> 1949
    //   1949: iload #11
    //   1951: istore #12
    //   1953: iload #18
    //   1955: istore #11
    //   1957: goto -> 1960
    //   1960: iinc #15, 1
    //   1963: goto -> 1460
    //   1966: iload #4
    //   1968: istore #17
    //   1970: aload_0
    //   1971: aload_0
    //   1972: getfield f : I
    //   1975: aload_0
    //   1976: invokevirtual getPaddingLeft : ()I
    //   1979: aload_0
    //   1980: invokevirtual getPaddingRight : ()I
    //   1983: iadd
    //   1984: iadd
    //   1985: putfield f : I
    //   1988: aload #6
    //   1990: iconst_1
    //   1991: iaload
    //   1992: iconst_m1
    //   1993: if_icmpne -> 2034
    //   1996: aload #6
    //   1998: iconst_0
    //   1999: iaload
    //   2000: iconst_m1
    //   2001: if_icmpne -> 2034
    //   2004: aload #6
    //   2006: iconst_2
    //   2007: iaload
    //   2008: iconst_m1
    //   2009: if_icmpne -> 2034
    //   2012: aload #6
    //   2014: iconst_3
    //   2015: iaload
    //   2016: iconst_m1
    //   2017: if_icmpeq -> 2023
    //   2020: goto -> 2034
    //   2023: iload #11
    //   2025: istore #4
    //   2027: iload #19
    //   2029: istore #18
    //   2031: goto -> 2096
    //   2034: iload #11
    //   2036: aload #6
    //   2038: iconst_3
    //   2039: iaload
    //   2040: aload #6
    //   2042: iconst_0
    //   2043: iaload
    //   2044: aload #6
    //   2046: iconst_1
    //   2047: iaload
    //   2048: aload #6
    //   2050: iconst_2
    //   2051: iaload
    //   2052: invokestatic max : (II)I
    //   2055: invokestatic max : (II)I
    //   2058: invokestatic max : (II)I
    //   2061: aload #7
    //   2063: iconst_3
    //   2064: iaload
    //   2065: aload #7
    //   2067: iconst_0
    //   2068: iaload
    //   2069: aload #7
    //   2071: iconst_1
    //   2072: iaload
    //   2073: aload #7
    //   2075: iconst_2
    //   2076: iaload
    //   2077: invokestatic max : (II)I
    //   2080: invokestatic max : (II)I
    //   2083: invokestatic max : (II)I
    //   2086: iadd
    //   2087: invokestatic max : (II)I
    //   2090: istore #4
    //   2092: iload #19
    //   2094: istore #18
    //   2096: iload #16
    //   2098: ifne -> 2111
    //   2101: iload #5
    //   2103: ldc 1073741824
    //   2105: if_icmpeq -> 2111
    //   2108: goto -> 2115
    //   2111: iload #4
    //   2113: istore #12
    //   2115: aload_0
    //   2116: iload #27
    //   2118: ldc_w -16777216
    //   2121: iload #18
    //   2123: iand
    //   2124: ior
    //   2125: iload #12
    //   2127: aload_0
    //   2128: invokevirtual getPaddingTop : ()I
    //   2131: aload_0
    //   2132: invokevirtual getPaddingBottom : ()I
    //   2135: iadd
    //   2136: iadd
    //   2137: aload_0
    //   2138: invokevirtual getSuggestedMinimumHeight : ()I
    //   2141: invokestatic max : (II)I
    //   2144: iload_2
    //   2145: iload #18
    //   2147: bipush #16
    //   2149: ishl
    //   2150: invokestatic a : (III)I
    //   2153: invokevirtual setMeasuredDimension : (II)V
    //   2156: iload #20
    //   2158: ifeq -> 2168
    //   2161: aload_0
    //   2162: iload #17
    //   2164: iload_1
    //   2165: invokespecial d : (II)V
    //   2168: return }
  
  void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i7;
    int i6;
    boolean bool1 = au.a(this);
    int i1 = getPaddingTop();
    int i2 = paramInt4 - paramInt2;
    int i3 = getPaddingBottom();
    int i4 = getPaddingBottom();
    int i5 = getVirtualChildCount();
    paramInt4 = this.e;
    paramInt2 = this.e & 0x70;
    boolean bool2 = this.a;
    int[] arrayOfInt1 = this.i;
    int[] arrayOfInt2 = this.j;
    paramInt4 = e.a(paramInt4 & 0x800007, af.d(this));
    if (paramInt4 != 1) {
      if (paramInt4 != 5) {
        paramInt1 = getPaddingLeft();
      } else {
        paramInt1 = getPaddingLeft() + paramInt3 - paramInt1 - this.f;
      } 
    } else {
      paramInt4 = getPaddingLeft();
      paramInt1 = (paramInt3 - paramInt1 - this.f) / 2 + paramInt4;
    } 
    if (bool1) {
      i6 = i5 - 1;
      i7 = -1;
    } else {
      i6 = 0;
      i7 = 1;
    } 
    paramInt4 = 0;
    paramInt3 = i1;
    while (paramInt4 < i5) {
      int i8 = i6 + i7 * paramInt4;
      View view = b(i8);
      if (view == null) {
        paramInt1 += d(i8);
      } else if (view.getVisibility() != 8) {
        int i9 = view.getMeasuredWidth();
        int i10 = view.getMeasuredHeight();
        a a1 = (a)view.getLayoutParams();
        if (bool2 && a1.height != -1) {
          i11 = view.getBaseline();
        } else {
          i11 = -1;
        } 
        int i12 = a1.h;
        int i13 = i12;
        if (i12 < 0)
          i13 = paramInt2; 
        i13 &= 0x70;
        if (i13 != 16) {
          if (i13 != 48) {
            if (i13 != 80) {
              i13 = paramInt3;
            } else {
              i12 = i2 - i3 - i10 - a1.bottomMargin;
              i13 = i12;
              if (i11 != -1) {
                i13 = view.getMeasuredHeight();
                i13 = i12 - arrayOfInt2[2] - i13 - i11;
              } 
            } 
          } else {
            i13 = a1.topMargin + paramInt3;
            if (i11 != -1)
              i13 += arrayOfInt1[1] - i11; 
          } 
        } else {
          i13 = (i2 - i1 - i4 - i10) / 2 + paramInt3 + a1.topMargin - a1.bottomMargin;
        } 
        int i11 = paramInt1;
        if (c(i8))
          i11 = paramInt1 + this.l; 
        paramInt1 = a1.leftMargin + i11;
        a(view, paramInt1 + a(view), i13, i9, i10);
        i11 = a1.rightMargin;
        i13 = b(view);
        paramInt4 += a(view, i8);
        paramInt1 += i9 + i11 + i13;
      } 
      paramInt4++;
    } 
  }
  
  void b(Canvas paramCanvas) {
    int i1 = getVirtualChildCount();
    boolean bool = au.a(this);
    int i2;
    for (i2 = 0; i2 < i1; i2++) {
      View view = b(i2);
      if (view != null && view.getVisibility() != 8 && c(i2)) {
        int i3;
        a a1 = (a)view.getLayoutParams();
        if (bool) {
          i3 = view.getRight() + a1.rightMargin;
        } else {
          i3 = view.getLeft() - a1.leftMargin - this.l;
        } 
        b(paramCanvas, i3);
      } 
    } 
    if (c(i1)) {
      View view = b(i1 - 1);
      if (view == null) {
        if (bool) {
          i2 = getPaddingLeft();
        } else {
          int i3 = getWidth();
          i2 = getPaddingRight();
          i2 = i3 - i2 - this.l;
        } 
      } else {
        int i3;
        a a1 = (a)view.getLayoutParams();
        if (bool) {
          i3 = view.getLeft();
          i2 = a1.leftMargin;
        } else {
          i2 = view.getRight() + a1.rightMargin;
          b(paramCanvas, i2);
        } 
        i2 = i3 - i2 - this.l;
      } 
    } else {
      return;
    } 
    b(paramCanvas, i2);
  }
  
  void b(Canvas paramCanvas, int paramInt) {
    this.k.setBounds(paramInt, getPaddingTop() + this.o, this.l + paramInt, getHeight() - getPaddingBottom() - this.o);
    this.k.draw(paramCanvas);
  }
  
  protected boolean c(int paramInt) {
    boolean bool = false;
    boolean bool1 = false;
    if (paramInt == 0) {
      if ((this.n & true) != 0)
        bool1 = true; 
      return bool1;
    } 
    if (paramInt == getChildCount()) {
      bool1 = bool;
      if ((this.n & 0x4) != 0)
        bool1 = true; 
      return bool1;
    } 
    if ((this.n & 0x2) != 0)
      while (--paramInt >= 0) {
        if (getChildAt(paramInt).getVisibility() != 8)
          return true; 
        paramInt--;
      }  
    return false;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) { return paramLayoutParams instanceof a; }
  
  int d(int paramInt) { return 0; }
  
  public int getBaseline() {
    if (this.b < 0)
      return super.getBaseline(); 
    if (getChildCount() <= this.b)
      throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."); 
    View view = getChildAt(this.b);
    int i1 = view.getBaseline();
    if (i1 == -1) {
      if (this.b == 0)
        return -1; 
      throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
    } 
    int i2 = this.c;
    int i3 = i2;
    if (this.d == 1) {
      int i4 = this.e & 0x70;
      i3 = i2;
      if (i4 != 48)
        if (i4 != 16) {
          if (i4 != 80) {
            i3 = i2;
          } else {
            i3 = getBottom() - getTop() - getPaddingBottom() - this.f;
          } 
        } else {
          i3 = i2 + (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - this.f) / 2;
        }  
    } 
    return i3 + ((a)view.getLayoutParams()).topMargin + i1;
  }
  
  public int getBaselineAlignedChildIndex() { return this.b; }
  
  public Drawable getDividerDrawable() { return this.k; }
  
  public int getDividerPadding() { return this.o; }
  
  public int getDividerWidth() { return this.l; }
  
  public int getOrientation() { return this.d; }
  
  public int getShowDividers() { return this.n; }
  
  int getVirtualChildCount() { return getChildCount(); }
  
  public float getWeightSum() { return this.g; }
  
  protected a j() { return (this.d == 0) ? new a(-2, -2) : ((this.d == 1) ? new a(-1, -2) : null); }
  
  protected void onDraw(Canvas paramCanvas) {
    if (this.k == null)
      return; 
    if (this.d == 1) {
      a(paramCanvas);
      return;
    } 
    b(paramCanvas);
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    if (Build.VERSION.SDK_INT >= 14) {
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(af.class.getName());
    } 
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    if (Build.VERSION.SDK_INT >= 14) {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      paramAccessibilityNodeInfo.setClassName(af.class.getName());
    } 
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.d == 1) {
      a(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    } 
    b(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    if (this.d == 1) {
      a(paramInt1, paramInt2);
      return;
    } 
    b(paramInt1, paramInt2);
  }
  
  public void setBaselineAligned(boolean paramBoolean) { this.a = paramBoolean; }
  
  public void setBaselineAlignedChildIndex(int paramInt) {
    if (paramInt < 0 || paramInt >= getChildCount()) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("base aligned child index out of range (0, ");
      stringBuilder.append(getChildCount());
      stringBuilder.append(")");
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    this.b = paramInt;
  }
  
  public void setDividerDrawable(Drawable paramDrawable) {
    if (paramDrawable == this.k)
      return; 
    this.k = paramDrawable;
    boolean bool = false;
    if (paramDrawable != null) {
      this.l = paramDrawable.getIntrinsicWidth();
      this.m = paramDrawable.getIntrinsicHeight();
    } else {
      this.l = 0;
      this.m = 0;
    } 
    if (paramDrawable == null)
      bool = true; 
    setWillNotDraw(bool);
    requestLayout();
  }
  
  public void setDividerPadding(int paramInt) { this.o = paramInt; }
  
  public void setGravity(int paramInt) {
    if (this.e != paramInt) {
      int i1 = paramInt;
      if ((0x800007 & paramInt) == 0)
        i1 = paramInt | 0x800003; 
      paramInt = i1;
      if ((i1 & 0x70) == 0)
        paramInt = i1 | 0x30; 
      this.e = paramInt;
      requestLayout();
    } 
  }
  
  public void setHorizontalGravity(int paramInt) {
    paramInt &= 0x800007;
    if ((0x800007 & this.e) != paramInt) {
      this.e = paramInt | this.e & 0xFF7FFFF8;
      requestLayout();
    } 
  }
  
  public void setMeasureWithLargestChildEnabled(boolean paramBoolean) { this.h = paramBoolean; }
  
  public void setOrientation(int paramInt) {
    if (this.d != paramInt) {
      this.d = paramInt;
      requestLayout();
    } 
  }
  
  public void setShowDividers(int paramInt) {
    if (paramInt != this.n)
      requestLayout(); 
    this.n = paramInt;
  }
  
  public void setVerticalGravity(int paramInt) {
    paramInt &= 0x70;
    if ((this.e & 0x70) != paramInt) {
      this.e = paramInt | this.e & 0xFFFFFF8F;
      requestLayout();
    } 
  }
  
  public void setWeightSum(float paramFloat) { this.g = Math.max(0.0F, paramFloat); }
  
  public boolean shouldDelayChildPressedState() { return false; }
  
  public static class a extends ViewGroup.MarginLayoutParams {
    public float g;
    
    public int h = -1;
    
    public a(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
      this.g = 0.0F;
    }
    
    public a(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, a.k.LinearLayoutCompat_Layout);
      this.g = typedArray.getFloat(a.k.LinearLayoutCompat_Layout_android_layout_weight, 0.0F);
      this.h = typedArray.getInt(a.k.LinearLayoutCompat_Layout_android_layout_gravity, -1);
      typedArray.recycle();
    }
    
    public a(ViewGroup.LayoutParams param1LayoutParams) { super(param1LayoutParams); }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/widget/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */