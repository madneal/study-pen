package android.support.v4.a;

import android.os.Parcel;
import android.os.Parcelable;

final class r implements Parcelable {
  public static final Parcelable.Creator<r> CREATOR = new Parcelable.Creator<r>() {
      public r a(Parcel param1Parcel) { return new r(param1Parcel); }
      
      public r[] a(int param1Int) { return new r[param1Int]; }
    };
  
  s[] a;
  
  int[] b;
  
  g[] c;
  
  public r() {}
  
  public r(Parcel paramParcel) {
    this.a = (s[])paramParcel.createTypedArray(s.CREATOR);
    this.b = paramParcel.createIntArray();
    this.c = (g[])paramParcel.createTypedArray(g.CREATOR);
  }
  
  public int describeContents() { return 0; }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeTypedArray(this.a, paramInt);
    paramParcel.writeIntArray(this.b);
    paramParcel.writeTypedArray(this.c, paramInt);
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/a/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */