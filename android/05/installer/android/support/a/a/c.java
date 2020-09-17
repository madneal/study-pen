package android.support.a.a;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

class c {
  private static int a(String paramString, int paramInt) {
    while (paramInt < paramString.length()) {
      char c1 = paramString.charAt(paramInt);
      if (((c1 - 'A') * (c1 - 'Z') <= '\000' || (c1 - 'a') * (c1 - 'z') <= '\000') && c1 != 'e' && c1 != 'E')
        return paramInt; 
      paramInt++;
    } 
    return paramInt;
  }
  
  private static void a(String paramString, int paramInt, a parama) {
    parama.b = false;
    int i = paramInt;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    while (i < paramString.length()) {
      char c1 = paramString.charAt(i);
      if (c1 != ' ') {
        if (c1 != 'E' && c1 != 'e') {
          switch (c1) {
            default:
              bool1 = false;
              break;
            case '.':
              if (!bool2) {
                bool1 = false;
                bool2 = true;
                break;
              } 
              parama.b = true;
            case '-':
            
            case ',':
              bool1 = false;
              bool3 = true;
              break;
          } 
        } else {
          bool1 = true;
        } 
        if (bool3)
          break; 
        continue;
      } 
      i++;
    } 
    parama.a = i;
  }
  
  private static void a(ArrayList<b> paramArrayList, char paramChar, float[] paramArrayOfFloat) { paramArrayList.add(new b(paramChar, paramArrayOfFloat, null)); }
  
  public static b[] a(String paramString) {
    if (paramString == null)
      return null; 
    ArrayList arrayList = new ArrayList();
    int i = 1;
    int j = 0;
    while (i < paramString.length()) {
      i = a(paramString, i);
      String str = paramString.substring(j, i).trim();
      if (str.length() > 0) {
        float[] arrayOfFloat = b(str);
        a(arrayList, str.charAt(0), arrayOfFloat);
      } 
      j = i;
      i++;
    } 
    if (i - j == 1 && j < paramString.length())
      a(arrayList, paramString.charAt(j), new float[0]); 
    return (b[])arrayList.toArray(new b[arrayList.size()]);
  }
  
  public static b[] a(b[] paramArrayOfb) {
    if (paramArrayOfb == null)
      return null; 
    b[] arrayOfb = new b[paramArrayOfb.length];
    for (byte b1 = 0; b1 < paramArrayOfb.length; b1++)
      arrayOfb[b1] = new b(paramArrayOfb[b1], null); 
    return arrayOfb;
  }
  
  private static float[] b(String paramString) {
    char c3;
    char c1 = paramString.charAt(0);
    char c2 = '\001';
    if (c1 == 'z') {
      c1 = '\001';
    } else {
      c1 = Character.MIN_VALUE;
    } 
    if (paramString.charAt(0) == 'Z') {
      c3 = '\001';
    } else {
      c3 = Character.MIN_VALUE;
    } 
    if ((c1 | c3) != '\000')
      return new float[0]; 
    try {
      float[] arrayOfFloat = new float[paramString.length()];
      a a = new a();
      this(null);
      int i = paramString.length();
      char c4 = Character.MIN_VALUE;
      c1 = c2;
      while (c1 < i) {
        a(paramString, c1, a);
        int k = a.a;
        c3 = c4;
        if (c1 < k) {
          arrayOfFloat[c4] = Float.parseFloat(paramString.substring(c1, k));
          c3 = c4 + '\001';
        } 
        if (a.b) {
          int m = k;
          c4 = c3;
          continue;
        } 
        int j = k + 1;
        c4 = c3;
      } 
      return b(arrayOfFloat, 0, c4);
    } catch (NumberFormatException numberFormatException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("error in parsing \"");
      stringBuilder.append(paramString);
      stringBuilder.append("\"");
      throw new RuntimeException(stringBuilder.toString(), numberFormatException);
    } 
  }
  
  private static float[] b(float[] paramArrayOfFloat, int paramInt1, int paramInt2) {
    if (paramInt1 > paramInt2)
      throw new IllegalArgumentException(); 
    int i = paramArrayOfFloat.length;
    if (paramInt1 < 0 || paramInt1 > i)
      throw new ArrayIndexOutOfBoundsException(); 
    paramInt2 -= paramInt1;
    i = Math.min(paramInt2, i - paramInt1);
    float[] arrayOfFloat = new float[paramInt2];
    System.arraycopy(paramArrayOfFloat, paramInt1, arrayOfFloat, 0, i);
    return arrayOfFloat;
  }
  
  private static class a {
    int a;
    
    boolean b;
    
    private a() {}
  }
  
  public static class b {
    char a;
    
    float[] b;
    
    private b(char param1Char, float[] param1ArrayOfFloat) {
      this.a = (char)param1Char;
      this.b = param1ArrayOfFloat;
    }
    
    private b(b param1b) {
      this.a = (char)param1b.a;
      this.b = c.a(param1b.b, 0, param1b.b.length);
    }
    
    private static void a(Path param1Path, double param1Double1, double param1Double2, double param1Double3, double param1Double4, double param1Double5, double param1Double6, double param1Double7, double param1Double8, double param1Double9) {
      int i = (int)Math.ceil(Math.abs(param1Double9 * 4.0D / Math.PI));
      double d1 = Math.cos(param1Double7);
      double d2 = Math.sin(param1Double7);
      double d3 = Math.cos(param1Double8);
      double d4 = Math.sin(param1Double8);
      param1Double7 = -param1Double3;
      double d5 = param1Double7 * d1;
      double d6 = param1Double4 * d2;
      param1Double7 *= d2;
      double d7 = param1Double4 * d1;
      double d8 = param1Double9 / i;
      byte b1 = 0;
      param1Double4 = d4 * param1Double7 + d3 * d7;
      param1Double9 = d5 * d4 - d6 * d3;
      d3 = param1Double8;
      param1Double8 = param1Double4;
      d4 = param1Double6;
      param1Double4 = d1;
      d1 = param1Double7;
      param1Double7 = d8;
      param1Double6 = d7;
      while (true) {
        d8 = param1Double3;
        if (b1 < i) {
          d7 = d3 + param1Double7;
          double d9 = Math.sin(d7);
          double d10 = Math.cos(d7);
          double d11 = param1Double1 + d8 * param1Double4 * d10 - d6 * d9;
          double d12 = param1Double2 + d8 * d2 * d10 + param1Double6 * d9;
          d8 = d5 * d9 - d6 * d10;
          d9 = d9 * d1 + d10 * param1Double6;
          d3 = d7 - d3;
          d10 = Math.tan(d3 / 2.0D);
          d3 = Math.sin(d3) * (Math.sqrt(d10 * 3.0D * d10 + 4.0D) - 1.0D) / 3.0D;
          param1Path.cubicTo((float)(param1Double5 + param1Double9 * d3), (float)(d4 + param1Double8 * d3), (float)(d11 - d3 * d8), (float)(d12 - d3 * d9), (float)d11, (float)d12);
          b1++;
          d4 = d12;
          param1Double5 = d11;
          param1Double8 = d9;
          param1Double9 = d8;
          d3 = d7;
          continue;
        } 
        break;
      } 
    }
    
    private static void a(Path param1Path, float param1Float1, float param1Float2, float param1Float3, float param1Float4, float param1Float5, float param1Float6, float param1Float7, boolean param1Boolean1, boolean param1Boolean2) {
      double d1 = Math.toRadians(param1Float7);
      double d2 = Math.cos(d1);
      double d3 = Math.sin(d1);
      double d4 = param1Float1;
      double d5 = param1Float2;
      double d6 = param1Float5;
      double d7 = (d4 * d2 + d5 * d3) / d6;
      double d8 = -param1Float1;
      double d9 = param1Float6;
      double d10 = (d8 * d3 + d5 * d2) / d9;
      double d11 = param1Float3;
      d8 = param1Float4;
      double d12 = (d11 * d2 + d8 * d3) / d6;
      double d13 = (-param1Float3 * d3 + d8 * d2) / d9;
      double d14 = d7 - d12;
      double d15 = d10 - d13;
      d11 = (d7 + d12) / 2.0D;
      d8 = (d10 + d13) / 2.0D;
      double d16 = d14 * d14 + d15 * d15;
      if (d16 == 0.0D) {
        Log.w("PathParser", " Points are coincident");
        return;
      } 
      double d17 = 1.0D / d16 - 0.25D;
      if (d17 < 0.0D) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Points are too far apart ");
        stringBuilder.append(d16);
        Log.w("PathParser", stringBuilder.toString());
        float f = (float)(Math.sqrt(d16) / 1.99999D);
        a(param1Path, param1Float1, param1Float2, param1Float3, param1Float4, param1Float5 * f, param1Float6 * f, param1Float7, param1Boolean1, param1Boolean2);
        return;
      } 
      d16 = Math.sqrt(d17);
      d14 *= d16;
      d15 = d16 * d15;
      if (param1Boolean1 == param1Boolean2) {
        d11 -= d15;
        d8 += d14;
      } else {
        d11 += d15;
        d8 -= d14;
      } 
      d15 = Math.atan2(d10 - d8, d7 - d11);
      d10 = Math.atan2(d13 - d8, d12 - d11) - d15;
      if (d10 >= 0.0D) {
        param1Boolean1 = true;
      } else {
        param1Boolean1 = false;
      } 
      d7 = d10;
      if (param1Boolean2 != param1Boolean1)
        if (d10 > 0.0D) {
          d7 = d10 - 6.283185307179586D;
        } else {
          d7 = d10 + 6.283185307179586D;
        }  
      d11 *= d6;
      d8 *= d9;
      a(param1Path, d11 * d2 - d8 * d3, d11 * d3 + d8 * d2, d6, d9, d4, d5, d1, d15, d7);
    }
    
    private static void a(Path param1Path, float[] param1ArrayOfFloat1, char param1Char1, char param1Char2, float[] param1ArrayOfFloat2) {
      char c1;
      float f1 = param1ArrayOfFloat1[0];
      float f2 = param1ArrayOfFloat1[1];
      float f3 = param1ArrayOfFloat1[2];
      float f4 = param1ArrayOfFloat1[3];
      float f5 = param1ArrayOfFloat1[4];
      float f6 = param1ArrayOfFloat1[5];
      float f7 = f1;
      float f8 = f2;
      float f9 = f3;
      float f10 = f4;
      switch (param1Char2) {
        default:
          f10 = f4;
          f9 = f3;
          f8 = f2;
          f7 = f1;
        case 'L':
        case 'M':
        case 'T':
        case 'l':
        case 'm':
        case 't':
          c1 = '\002';
          break;
        case 'Z':
        case 'z':
          param1Path.close();
          param1Path.moveTo(f5, f6);
          f7 = f5;
          f9 = f7;
          f8 = f6;
          f10 = f8;
        case 'Q':
        case 'S':
        case 'q':
        case 's':
          c1 = '\004';
          f7 = f1;
          f8 = f2;
          f9 = f3;
          f10 = f4;
          break;
        case 'H':
        case 'V':
        case 'h':
        case 'v':
          c1 = '\001';
          f7 = f1;
          f8 = f2;
          f9 = f3;
          f10 = f4;
          break;
        case 'C':
        case 'c':
          c1 = '\006';
          f7 = f1;
          f8 = f2;
          f9 = f3;
          f10 = f4;
          break;
        case 'A':
        case 'a':
          c1 = '\007';
          f10 = f4;
          f9 = f3;
          f8 = f2;
          f7 = f1;
          break;
      } 
      f3 = f7;
      f7 = f8;
      char c = Character.MIN_VALUE;
      char c2 = param1Char1;
      param1Char1 = c;
      f8 = f3;
      while (param1Char1 < param1ArrayOfFloat2.length) {
        boolean bool2;
        boolean bool1;
        char c4;
        char c3;
        f4 = 0.0F;
        f3 = 0.0F;
        switch (param1Char2) {
          case 'v':
            c2 = param1Char1 + Character.MIN_VALUE;
            param1Path.rLineTo(0.0F, param1ArrayOfFloat2[c2]);
            f3 = param1ArrayOfFloat2[c2];
            f7 += f3;
            break;
          case 't':
            if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
              f9 = f8 - f9;
              f10 = f7 - f10;
            } else {
              f10 = 0.0F;
              f9 = f3;
            } 
            c = param1Char1 + Character.MIN_VALUE;
            f3 = param1ArrayOfFloat2[c];
            c2 = param1Char1 + '\001';
            param1Path.rQuadTo(f9, f10, f3, param1ArrayOfFloat2[c2]);
            f3 = f8 + param1ArrayOfFloat2[c];
            f4 = f7 + param1ArrayOfFloat2[c2];
            f10 += f7;
            f9 += f8;
            f7 = f4;
            f8 = f3;
            break;
          case 's':
            if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
              f10 = f7 - f10;
              f3 = f8 - f9;
              f9 = f10;
              f10 = f3;
            } else {
              f9 = 0.0F;
              f10 = f4;
            } 
            c3 = param1Char1 + Character.MIN_VALUE;
            f1 = param1ArrayOfFloat2[c3];
            c2 = param1Char1 + '\001';
            f3 = param1ArrayOfFloat2[c2];
            c = param1Char1 + '\002';
            f4 = param1ArrayOfFloat2[c];
            c4 = param1Char1 + '\003';
            param1Path.rCubicTo(f10, f9, f1, f3, f4, param1ArrayOfFloat2[c4]);
            f10 = param1ArrayOfFloat2[c3] + f8;
            f9 = param1ArrayOfFloat2[c2] + f7;
            f8 += param1ArrayOfFloat2[c];
            f3 = param1ArrayOfFloat2[c4];
            f3 = f7 + f3;
            f7 = f10;
            f10 = f9;
            f9 = f7;
            f7 = f3;
            break;
          case 'q':
            c3 = param1Char1 + Character.MIN_VALUE;
            f3 = param1ArrayOfFloat2[c3];
            c4 = param1Char1 + '\001';
            f9 = param1ArrayOfFloat2[c4];
            c2 = param1Char1 + '\002';
            f10 = param1ArrayOfFloat2[c2];
            c = param1Char1 + '\003';
            param1Path.rQuadTo(f3, f9, f10, param1ArrayOfFloat2[c]);
            f10 = param1ArrayOfFloat2[c3] + f8;
            f9 = param1ArrayOfFloat2[c4] + f7;
            f8 += param1ArrayOfFloat2[c2];
            f3 = param1ArrayOfFloat2[c];
            f3 = f7 + f3;
            f7 = f10;
            f10 = f9;
            f9 = f7;
            f7 = f3;
            break;
          case 'm':
            c = param1Char1 + Character.MIN_VALUE;
            f8 += param1ArrayOfFloat2[c];
            c2 = param1Char1 + '\001';
            f7 += param1ArrayOfFloat2[c2];
            if (param1Char1 > '\000') {
              param1Path.rLineTo(param1ArrayOfFloat2[c], param1ArrayOfFloat2[c2]);
              break;
            } 
            param1Path.rMoveTo(param1ArrayOfFloat2[c], param1ArrayOfFloat2[c2]);
            f6 = f7;
            f5 = f8;
            break;
          case 'l':
            c2 = param1Char1 + Character.MIN_VALUE;
            f3 = param1ArrayOfFloat2[c2];
            c = param1Char1 + '\001';
            param1Path.rLineTo(f3, param1ArrayOfFloat2[c]);
            f8 += param1ArrayOfFloat2[c2];
            f3 = param1ArrayOfFloat2[c];
            f7 += f3;
            break;
          case 'h':
            c2 = param1Char1 + Character.MIN_VALUE;
            param1Path.rLineTo(param1ArrayOfFloat2[c2], 0.0F);
            f8 += param1ArrayOfFloat2[c2];
            break;
          case 'c':
            f3 = param1ArrayOfFloat2[param1Char1 + Character.MIN_VALUE];
            f10 = param1ArrayOfFloat2[param1Char1 + '\001'];
            c2 = param1Char1 + '\002';
            f4 = param1ArrayOfFloat2[c2];
            c = param1Char1 + '\003';
            f1 = param1ArrayOfFloat2[c];
            c4 = param1Char1 + '\004';
            f9 = param1ArrayOfFloat2[c4];
            c3 = param1Char1 + '\005';
            param1Path.rCubicTo(f3, f10, f4, f1, f9, param1ArrayOfFloat2[c3]);
            f10 = param1ArrayOfFloat2[c2] + f8;
            f9 = param1ArrayOfFloat2[c] + f7;
            f8 += param1ArrayOfFloat2[c4];
            f3 = param1ArrayOfFloat2[c3];
            f3 = f7 + f3;
            f7 = f10;
            f10 = f9;
            f9 = f7;
            f7 = f3;
            break;
          case 'a':
            c = param1Char1 + '\005';
            f1 = param1ArrayOfFloat2[c];
            c2 = param1Char1 + '\006';
            f4 = param1ArrayOfFloat2[c2];
            f3 = param1ArrayOfFloat2[param1Char1 + Character.MIN_VALUE];
            f9 = param1ArrayOfFloat2[param1Char1 + '\001'];
            f10 = param1ArrayOfFloat2[param1Char1 + '\002'];
            if (param1ArrayOfFloat2[param1Char1 + '\003'] != 0.0F) {
              bool1 = true;
            } else {
              bool1 = false;
            } 
            if (param1ArrayOfFloat2[param1Char1 + '\004'] != 0.0F) {
              bool2 = true;
            } else {
              bool2 = false;
            } 
            a(param1Path, f8, f7, f1 + f8, f4 + f7, f3, f9, f10, bool1, bool2);
            f8 += param1ArrayOfFloat2[c];
            f7 += param1ArrayOfFloat2[c2];
            f10 = f7;
            f9 = f8;
            break;
          case 'V':
            c2 = param1Char1 + Character.MIN_VALUE;
            param1Path.lineTo(f8, param1ArrayOfFloat2[c2]);
            f7 = param1ArrayOfFloat2[c2];
            break;
          case 'T':
            f4 = f7;
            f3 = f8;
            c = param1Char1;
          case 'S':
            c = param1Char1;
            if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
              f7 = f7 * 2.0F - f10;
              f9 = f8 * 2.0F - f9;
              f8 = f7;
              f7 = f9;
            } else {
              f9 = f8;
              f8 = f7;
              f7 = f9;
            } 
            c2 = c + Character.MIN_VALUE;
            f3 = param1ArrayOfFloat2[c2];
            c3 = c + '\001';
            f10 = param1ArrayOfFloat2[c3];
            c4 = c + '\002';
            f9 = param1ArrayOfFloat2[c4];
            c += '\003';
            param1Path.cubicTo(f7, f8, f3, f10, f9, param1ArrayOfFloat2[c]);
            f10 = param1ArrayOfFloat2[c2];
            f9 = param1ArrayOfFloat2[c3];
            f8 = param1ArrayOfFloat2[c4];
            f7 = param1ArrayOfFloat2[c];
            f3 = f9;
            f9 = f10;
            f10 = f3;
            break;
          case 'Q':
            c2 = param1Char1;
            c4 = c2 + Character.MIN_VALUE;
            f7 = param1ArrayOfFloat2[c4];
            c = c2 + '\001';
            f9 = param1ArrayOfFloat2[c];
            c3 = c2 + '\002';
            f8 = param1ArrayOfFloat2[c3];
            c2 += '\003';
            param1Path.quadTo(f7, f9, f8, param1ArrayOfFloat2[c2]);
            f10 = param1ArrayOfFloat2[c4];
            f9 = param1ArrayOfFloat2[c];
            f8 = param1ArrayOfFloat2[c3];
            f7 = param1ArrayOfFloat2[c2];
            f3 = f9;
            f9 = f10;
            f10 = f3;
            break;
          case 'M':
            c2 = param1Char1;
            c4 = c2 + Character.MIN_VALUE;
            f8 = param1ArrayOfFloat2[c4];
            c = c2 + '\001';
            f7 = param1ArrayOfFloat2[c];
            if (c2 > '\000') {
              param1Path.lineTo(param1ArrayOfFloat2[c4], param1ArrayOfFloat2[c]);
              break;
            } 
            param1Path.moveTo(param1ArrayOfFloat2[c4], param1ArrayOfFloat2[c]);
            f6 = f7;
            f5 = f8;
            break;
          case 'L':
            c2 = param1Char1;
            c = c2 + Character.MIN_VALUE;
            f7 = param1ArrayOfFloat2[c];
            param1Path.lineTo(f7, param1ArrayOfFloat2[++c2]);
            f8 = param1ArrayOfFloat2[c];
            f7 = param1ArrayOfFloat2[c2];
            break;
          case 'H':
            c2 = param1Char1 + Character.MIN_VALUE;
            param1Path.lineTo(param1ArrayOfFloat2[c2], f7);
            f8 = param1ArrayOfFloat2[c2];
            break;
          case 'C':
            c2 = param1Char1;
            f9 = param1ArrayOfFloat2[c2 + Character.MIN_VALUE];
            f10 = param1ArrayOfFloat2[c2 + '\001'];
            c4 = c2 + '\002';
            f7 = param1ArrayOfFloat2[c4];
            c = c2 + '\003';
            f3 = param1ArrayOfFloat2[c];
            c3 = c2 + '\004';
            f8 = param1ArrayOfFloat2[c3];
            c2 += '\005';
            param1Path.cubicTo(f9, f10, f7, f3, f8, param1ArrayOfFloat2[c2]);
            f8 = param1ArrayOfFloat2[c3];
            f7 = param1ArrayOfFloat2[c2];
            f9 = param1ArrayOfFloat2[c4];
            f10 = param1ArrayOfFloat2[c];
            break;
          case 'A':
            c2 = param1Char1;
            c4 = c2 + '\005';
            f10 = param1ArrayOfFloat2[c4];
            c = c2 + '\006';
            f4 = param1ArrayOfFloat2[c];
            f3 = param1ArrayOfFloat2[c2 + Character.MIN_VALUE];
            f1 = param1ArrayOfFloat2[c2 + '\001'];
            f9 = param1ArrayOfFloat2[c2 + '\002'];
            if (param1ArrayOfFloat2[c2 + '\003'] != 0.0F) {
              bool1 = true;
            } else {
              bool1 = false;
            } 
            if (param1ArrayOfFloat2[c2 + '\004'] != 0.0F) {
              bool2 = true;
            } else {
              bool2 = false;
            } 
            a(param1Path, f8, f7, f10, f4, f3, f1, f9, bool1, bool2);
            f8 = param1ArrayOfFloat2[c4];
            f7 = param1ArrayOfFloat2[c];
            f10 = f7;
            f9 = f8;
            break;
        } 
        continue;
        param1Char1 += c1;
        c2 = param1Char2;
      } 
      param1ArrayOfFloat1[0] = f8;
      param1ArrayOfFloat1[1] = f7;
      param1ArrayOfFloat1[2] = f9;
      param1ArrayOfFloat1[3] = f10;
      param1ArrayOfFloat1[4] = f5;
      param1ArrayOfFloat1[5] = f6;
    }
    
    public static void a(b[] param1ArrayOfb, Path param1Path) {
      float[] arrayOfFloat = new float[6];
      char c1 = 'm';
      byte b1 = 0;
      char c2;
      for (c2 = c1; b1 < param1ArrayOfb.length; c2 = c1) {
        a(param1Path, arrayOfFloat, c2, (param1ArrayOfb[b1]).a, (param1ArrayOfb[b1]).b);
        c1 = (param1ArrayOfb[b1]).a;
        b1++;
      } 
    }
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */