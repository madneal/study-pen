package android.support.v4.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class g implements Parcelable {
  public static final Parcelable.Creator<g> CREATOR = new Parcelable.Creator<g>() {
      public g a(Parcel param1Parcel) { return new g(param1Parcel); }
      
      public g[] a(int param1Int) { return new g[param1Int]; }
    };
  
  final int[] a;
  
  final int b;
  
  final int c;
  
  final String d;
  
  final int e;
  
  final int f;
  
  final CharSequence g;
  
  final int h;
  
  final CharSequence i;
  
  final ArrayList<String> j;
  
  final ArrayList<String> k;
  
  public g(Parcel paramParcel) {
    this.a = paramParcel.createIntArray();
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readString();
    this.e = paramParcel.readInt();
    this.f = paramParcel.readInt();
    this.g = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.h = paramParcel.readInt();
    this.i = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.j = paramParcel.createStringArrayList();
    this.k = paramParcel.createStringArrayList();
  }
  
  public g(f paramf) {
    f.a a1 = paramf.c;
    int m;
    for (m = 0; a1 != null; m = i1) {
      int i1 = m;
      if (a1.i != null)
        i1 = m + a1.i.size(); 
      a1 = a1.a;
    } 
    this.a = new int[paramf.e * 7 + m];
    if (!paramf.l)
      throw new IllegalStateException("Not on back stack"); 
    a1 = paramf.c;
    int n = 0;
    while (a1 != null) {
      int[] arrayOfInt = this.a;
      int i1 = n + true;
      arrayOfInt[n] = a1.c;
      arrayOfInt = this.a;
      m = i1 + true;
      if (a1.d != null) {
        n = a1.d.g;
      } else {
        n = -1;
      } 
      arrayOfInt[i1] = n;
      arrayOfInt = this.a;
      n = m + 1;
      arrayOfInt[m] = a1.e;
      arrayOfInt = this.a;
      m = n + 1;
      arrayOfInt[n] = a1.f;
      arrayOfInt = this.a;
      n = m + 1;
      arrayOfInt[m] = a1.g;
      arrayOfInt = this.a;
      m = n + 1;
      arrayOfInt[n] = a1.h;
      if (a1.i != null) {
        i1 = a1.i.size();
        arrayOfInt = this.a;
        n = m + 1;
        arrayOfInt[m] = i1;
        m = 0;
        while (m < i1) {
          this.a[n] = ((k)a1.i.get(m)).g;
          m++;
          n++;
        } 
      } else {
        this.a[m] = 0;
        n = m + 1;
      } 
      a1 = a1.a;
    } 
    this.b = paramf.j;
    this.c = paramf.k;
    this.d = paramf.n;
    this.e = paramf.p;
    this.f = paramf.q;
    this.g = paramf.r;
    this.h = paramf.s;
    this.i = paramf.t;
    this.j = paramf.u;
    this.k = paramf.v;
  }
  
  public f a(q paramq) {
    f f1 = new f(paramq);
    int m = 0;
    for (byte b1 = 0; m < this.a.length; b1++) {
      f.a a1 = new f.a();
      int[] arrayOfInt = this.a;
      int n = m + true;
      a1.c = arrayOfInt[m];
      if (q.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Instantiate ");
        stringBuilder.append(f1);
        stringBuilder.append(" op #");
        stringBuilder.append(b1);
        stringBuilder.append(" base fragment #");
        stringBuilder.append(this.a[n]);
        Log.v("FragmentManager", stringBuilder.toString());
      } 
      arrayOfInt = this.a;
      m = n + true;
      n = arrayOfInt[n];
      if (n >= 0) {
        k k1 = (k)paramq.f.get(n);
      } else {
        arrayOfInt = null;
      } 
      a1.d = arrayOfInt;
      arrayOfInt = this.a;
      n = m + true;
      a1.e = arrayOfInt[m];
      arrayOfInt = this.a;
      int i1 = n + 1;
      a1.f = arrayOfInt[n];
      arrayOfInt = this.a;
      m = i1 + 1;
      a1.g = arrayOfInt[i1];
      arrayOfInt = this.a;
      n = m + 1;
      a1.h = arrayOfInt[m];
      arrayOfInt = this.a;
      m = n + 1;
      int i2 = arrayOfInt[n];
      n = m;
      if (i2 > 0) {
        a1.i = new ArrayList(i2);
        i1 = 0;
        while (true) {
          n = m;
          if (i1 < i2) {
            if (q.a) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("Instantiate ");
              stringBuilder.append(f1);
              stringBuilder.append(" set remove fragment #");
              stringBuilder.append(this.a[m]);
              Log.v("FragmentManager", stringBuilder.toString());
            } 
            k k1 = (k)paramq.f.get(this.a[m]);
            a1.i.add(k1);
            i1++;
            m++;
            continue;
          } 
          break;
        } 
      } 
      m = n;
      f1.f = a1.e;
      f1.g = a1.f;
      f1.h = a1.g;
      f1.i = a1.h;
      f1.a(a1);
    } 
    f1.j = this.b;
    f1.k = this.c;
    f1.n = this.d;
    f1.p = this.e;
    f1.l = true;
    f1.q = this.f;
    f1.r = this.g;
    f1.s = this.h;
    f1.t = this.i;
    f1.u = this.j;
    f1.v = this.k;
    f1.a(1);
    return f1;
  }
  
  public int describeContents() { return 0; }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeIntArray(this.a);
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
    TextUtils.writeToParcel(this.g, paramParcel, 0);
    paramParcel.writeInt(this.h);
    TextUtils.writeToParcel(this.i, paramParcel, 0);
    paramParcel.writeStringList(this.j);
    paramParcel.writeStringList(this.k);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */