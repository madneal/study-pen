package android.support.v4.widget;

import android.widget.ListView;

public class k extends a {
  private final ListView a;
  
  public k(ListView paramListView) {
    super(paramListView);
    this.a = paramListView;
  }
  
  public void a(int paramInt1, int paramInt2) { l.a(this.a, paramInt2); }
  
  public boolean e(int paramInt) { return false; }
  
  public boolean f(int paramInt) {
    ListView listView = this.a;
    int i = listView.getCount();
    if (i == 0)
      return false; 
    int j = listView.getChildCount();
    int m = listView.getFirstVisiblePosition();
    if (paramInt > 0) {
      if (m + j >= i && listView.getChildAt(j - 1).getBottom() <= listView.getHeight())
        return false; 
    } else {
      return (paramInt < 0) ? (!(m <= 0 && listView.getChildAt(0).getTop() >= 0)) : false;
    } 
    return true;
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/widget/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */