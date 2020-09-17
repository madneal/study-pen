package android.support.v4.a;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

final class s implements Parcelable {
  public static final Parcelable.Creator<s> CREATOR = new Parcelable.Creator<s>() {
      public s a(Parcel param1Parcel) { return new s(param1Parcel); }
      
      public s[] a(int param1Int) { return new s[param1Int]; }
    };
  
  final String a;
  
  final int b;
  
  final boolean c;
  
  final int d;
  
  final int e;
  
  final String f;
  
  final boolean g;
  
  final boolean h;
  
  final Bundle i;
  
  Bundle j;
  
  k k;
  
  public s(Parcel paramParcel) {
    this.a = paramParcel.readString();
    this.b = paramParcel.readInt();
    int m = paramParcel.readInt();
    byte b1 = 0;
    if (m != 0) {
      b2 = 1;
    } else {
      b2 = 0;
    } 
    this.c = b2;
    this.d = paramParcel.readInt();
    this.e = paramParcel.readInt();
    this.f = paramParcel.readString();
    if (paramParcel.readInt() != 0) {
      b2 = 1;
    } else {
      b2 = 0;
    } 
    this.g = b2;
    byte b2 = b1;
    if (paramParcel.readInt() != 0)
      b2 = 1; 
    this.h = b2;
    this.i = paramParcel.readBundle();
    this.j = paramParcel.readBundle();
  }
  
  public s(k paramk) {
    this.a = paramk.getClass().getName();
    this.b = paramk.g;
    this.c = paramk.o;
    this.d = paramk.w;
    this.e = paramk.x;
    this.f = paramk.y;
    this.g = paramk.B;
    this.h = paramk.A;
    this.i = paramk.i;
  }
  
  public k a(o paramo, k paramk) {
    if (this.k != null)
      return this.k; 
    Context context = paramo.g();
    if (this.i != null)
      this.i.setClassLoader(context.getClassLoader()); 
    this.k = k.a(context, this.a, this.i);
    if (this.j != null) {
      this.j.setClassLoader(context.getClassLoader());
      this.k.e = this.j;
    } 
    this.k.a(this.b, paramk);
    this.k.o = this.c;
    this.k.q = true;
    this.k.w = this.d;
    this.k.x = this.e;
    this.k.y = this.f;
    this.k.B = this.g;
    this.k.A = this.h;
    this.k.s = paramo.d;
    if (q.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Instantiated fragment ");
      stringBuilder.append(this.k);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    return this.k;
  }
  
  public int describeContents() { return 0; }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.a);
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeString(this.f);
    paramParcel.writeInt(this.g);
    paramParcel.writeInt(this.h);
    paramParcel.writeBundle(this.i);
    paramParcel.writeBundle(this.j);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/a/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */