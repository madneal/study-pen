package android.support.v7.a;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.b.h;
import android.util.Log;
import java.util.Calendar;

class p {
  private static final a a = new a(null);
  
  private final Context b;
  
  private final LocationManager c;
  
  p(Context paramContext) {
    this.b = paramContext;
    this.c = (LocationManager)paramContext.getSystemService("location");
  }
  
  private Location a(String paramString) {
    if (this.c != null)
      try {
        if (this.c.isProviderEnabled(paramString))
          return this.c.getLastKnownLocation(paramString); 
      } catch (Exception paramString) {
        Log.d("TwilightManager", "Failed to get last known location", paramString);
      }  
    return null;
  }
  
  private void a(Location paramLocation) {
    boolean bool;
    a a1 = a;
    long l1 = System.currentTimeMillis();
    o o = o.a();
    o.a(l1 - 86400000L, paramLocation.getLatitude(), paramLocation.getLongitude());
    long l2 = o.a;
    o.a(l1, paramLocation.getLatitude(), paramLocation.getLongitude());
    if (o.c == 1) {
      bool = true;
    } else {
      bool = false;
    } 
    long l3 = o.b;
    long l4 = o.a;
    o.a(l1 + 86400000L, paramLocation.getLatitude(), paramLocation.getLongitude());
    long l5 = o.b;
    if (l3 == -1L || l4 == -1L) {
      l1 += 43200000L;
    } else {
      if (l1 > l4) {
        l1 = l5 + 0L;
      } else if (l1 > l3) {
        l1 = l4 + 0L;
      } else {
        l1 = l3 + 0L;
      } 
      l1 += 60000L;
    } 
    a1.a = bool;
    a1.b = l2;
    a1.c = l3;
    a1.d = l4;
    a1.e = l5;
    a1.f = l1;
  }
  
  private boolean a(a parama) { return (parama != null && parama.f > System.currentTimeMillis()); }
  
  private Location b() {
    Location location2;
    int i = h.a(this.b, "android.permission.ACCESS_COARSE_LOCATION");
    Location location1 = null;
    if (i == 0) {
      location2 = a("network");
    } else {
      location2 = null;
    } 
    if (h.a(this.b, "android.permission.ACCESS_FINE_LOCATION") == 0)
      location1 = a("gps"); 
    if (location1 != null && location2 != null) {
      Location location = location2;
      if (location1.getTime() > location2.getTime())
        location = location1; 
      return location;
    } 
    if (location1 != null)
      location2 = location1; 
    return location2;
  }
  
  boolean a() {
    a a1 = a;
    if (a(a1))
      return a1.a; 
    Location location = b();
    if (location != null) {
      a(location);
      return a1.a;
    } 
    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
    int i = Calendar.getInstance().get(11);
    return (i < 6 || i >= 22);
  }
  
  private static class a {
    boolean a;
    
    long b;
    
    long c;
    
    long d;
    
    long e;
    
    long f;
    
    private a() {}
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v7/a/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */