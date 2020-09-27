package android.support.v4.a;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class u {
  public static Object a(Object paramObject) {
    Object object = paramObject;
    if (paramObject != null)
      object = ((Transition)paramObject).clone(); 
    return object;
  }
  
  public static Object a(Object paramObject, View paramView1, ArrayList<View> paramArrayList, Map<String, View> paramMap, View paramView2) {
    if (paramObject != null) {
      b(paramArrayList, paramView1);
      if (paramMap != null)
        paramArrayList.removeAll(paramMap.values()); 
      if (paramArrayList.isEmpty())
        return null; 
      paramArrayList.add(paramView2);
      b((Transition)paramObject, paramArrayList);
    } 
    return paramObject;
  }
  
  public static Object a(Object paramObject1, Object paramObject2, Object paramObject3, boolean paramBoolean) {
    Transition transition1 = (Transition)paramObject1;
    paramObject1 = (Transition)paramObject2;
    Transition transition2 = (Transition)paramObject3;
    if (transition1 == null || paramObject1 == null)
      paramBoolean = true; 
    if (paramBoolean) {
      paramObject3 = new TransitionSet();
      if (transition1 != null)
        paramObject3.addTransition(transition1); 
      if (paramObject1 != null)
        paramObject3.addTransition(paramObject1); 
      paramObject2 = paramObject3;
      if (transition2 != null) {
        paramObject3.addTransition(transition2);
        return paramObject3;
      } 
    } else {
      paramObject2 = null;
      if (paramObject1 != null && transition1 != null) {
        paramObject1 = (new TransitionSet()).addTransition(paramObject1).addTransition(transition1).setOrdering(1);
      } else if (paramObject1 == null) {
        paramObject1 = paramObject2;
        if (transition1 != null)
          paramObject1 = transition1; 
      } 
      paramObject2 = paramObject1;
      if (transition2 != null) {
        paramObject2 = new TransitionSet();
        if (paramObject1 != null)
          paramObject2.addTransition(paramObject1); 
        paramObject2.addTransition(transition2);
      } 
    } 
    return paramObject2;
  }
  
  public static String a(View paramView) { return paramView.getTransitionName(); }
  
  private static void a(Transition paramTransition, a parama) {
    if (paramTransition != null)
      paramTransition.setEpicenterCallback(new Transition.EpicenterCallback(parama) {
            private Rect b;
            
            public Rect onGetEpicenter(Transition param1Transition) {
              if (this.b == null && this.a.a != null)
                this.b = u.b(this.a.a); 
              return this.b;
            }
          }); 
  }
  
  public static void a(View paramView1, View paramView2, Object paramObject1, ArrayList<View> paramArrayList1, Object paramObject2, ArrayList<View> paramArrayList2, Object paramObject3, ArrayList<View> paramArrayList3, Object paramObject4, ArrayList<View> paramArrayList4, Map<String, View> paramMap) {
    paramObject1 = (Transition)paramObject1;
    paramObject2 = (Transition)paramObject2;
    paramObject3 = (Transition)paramObject3;
    paramObject4 = (Transition)paramObject4;
    if (paramObject4 != null)
      paramView1.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener(paramView1, paramObject1, paramArrayList1, paramObject2, paramArrayList2, paramObject3, paramArrayList3, paramMap, paramArrayList4, paramObject4, paramView2) {
            public boolean onPreDraw() {
              this.a.getViewTreeObserver().removeOnPreDrawListener(this);
              if (this.b != null)
                u.a(this.b, this.c); 
              if (this.d != null)
                u.a(this.d, this.e); 
              if (this.f != null)
                u.a(this.f, this.g); 
              for (Map.Entry entry : this.h.entrySet())
                ((View)entry.getValue()).setTransitionName((String)entry.getKey()); 
              int m = this.i.size();
              for (byte b1 = 0; b1 < m; b1++)
                this.j.excludeTarget((View)this.i.get(b1), false); 
              this.j.excludeTarget(this.k, false);
              return true;
            }
          }); 
  }
  
  public static void a(ViewGroup paramViewGroup, Object paramObject) { TransitionManager.beginDelayedTransition(paramViewGroup, (Transition)paramObject); }
  
  public static void a(Object paramObject, View paramView) { ((Transition)paramObject).setEpicenterCallback(new Transition.EpicenterCallback(c(paramView)) {
          public Rect onGetEpicenter(Transition param1Transition) { return this.a; }
        }); }
  
  public static void a(Object paramObject, View paramView, Map<String, View> paramMap, ArrayList<View> paramArrayList) {
    paramObject = (TransitionSet)paramObject;
    paramArrayList.clear();
    paramArrayList.addAll(paramMap.values());
    List list = paramObject.getTargets();
    list.clear();
    int i = paramArrayList.size();
    for (byte b = 0; b < i; b++)
      a(list, (View)paramArrayList.get(b)); 
    paramArrayList.add(paramView);
    b(paramObject, paramArrayList);
  }
  
  public static void a(Object paramObject, View paramView, boolean paramBoolean) { ((Transition)paramObject).excludeTarget(paramView, paramBoolean); }
  
  public static void a(Object paramObject1, Object paramObject2, View paramView1, b paramb, View paramView2, a parama, Map<String, String> paramMap1, ArrayList<View> paramArrayList1, Map<String, View> paramMap2, Map<String, View> paramMap3, ArrayList<View> paramArrayList2) {
    if (paramObject1 != null || paramObject2 != null) {
      paramObject1 = (Transition)paramObject1;
      if (paramObject1 != null)
        paramObject1.addTarget(paramView2); 
      if (paramObject2 != null)
        a(paramObject2, paramView2, paramMap2, paramArrayList2); 
      if (paramb != null)
        paramView1.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener(paramView1, paramObject1, paramView2, paramb, paramMap1, paramMap3, paramArrayList1) {
              public boolean onPreDraw() {
                this.a.getViewTreeObserver().removeOnPreDrawListener(this);
                if (this.b != null)
                  this.b.removeTarget(this.c); 
                View view = this.d.a();
                if (view != null) {
                  if (!this.e.isEmpty()) {
                    u.a(this.f, view);
                    this.f.keySet().retainAll(this.e.values());
                    for (Map.Entry entry : this.e.entrySet()) {
                      String str = (String)entry.getValue();
                      View view1 = (View)this.f.get(str);
                      if (view1 != null)
                        view1.setTransitionName((String)entry.getKey()); 
                    } 
                  } 
                  if (this.b != null) {
                    u.a(this.g, view);
                    this.g.removeAll(this.f.values());
                    this.g.add(this.c);
                    u.b(this.b, this.g);
                  } 
                } 
                return true;
              }
            }); 
      a(paramObject1, parama);
    } 
  }
  
  public static void a(Object paramObject, ArrayList<View> paramArrayList) {
    Transition transition = (Transition)paramObject;
    if (transition instanceof TransitionSet) {
      paramObject = (TransitionSet)transition;
      int i = paramObject.getTransitionCount();
      for (byte b = 0; b < i; b++)
        a(paramObject.getTransitionAt(b), paramArrayList); 
    } else if (!a(transition)) {
      paramObject = transition.getTargets();
      if (paramObject != null && paramObject.size() == paramArrayList.size() && paramObject.containsAll(paramArrayList))
        for (int i = paramArrayList.size() - 1; i >= 0; i--)
          transition.removeTarget((View)paramArrayList.get(i));  
    } 
  }
  
  private static void a(List<View> paramList, View paramView) {
    int i = paramList.size();
    if (a(paramList, paramView, i))
      return; 
    paramList.add(paramView);
    for (int j = i; j < paramList.size(); j++) {
      paramView = (View)paramList.get(j);
      if (paramView instanceof ViewGroup) {
        ViewGroup viewGroup = (ViewGroup)paramView;
        int k = viewGroup.getChildCount();
        for (byte b = 0; b < k; b++) {
          paramView = viewGroup.getChildAt(b);
          if (!a(paramList, paramView, i))
            paramList.add(paramView); 
        } 
      } 
    } 
  }
  
  public static void a(Map<String, View> paramMap, View paramView) {
    if (paramView.getVisibility() == 0) {
      String str = paramView.getTransitionName();
      if (str != null)
        paramMap.put(str, paramView); 
      if (paramView instanceof ViewGroup) {
        ViewGroup viewGroup = (ViewGroup)paramView;
        int i = viewGroup.getChildCount();
        for (byte b = 0; b < i; b++)
          a(paramMap, viewGroup.getChildAt(b)); 
      } 
    } 
  }
  
  private static boolean a(Transition paramTransition) { return (!a(paramTransition.getTargetIds()) || !a(paramTransition.getTargetNames()) || !a(paramTransition.getTargetTypes())); }
  
  private static boolean a(List paramList) { return (paramList == null || paramList.isEmpty()); }
  
  private static boolean a(List<View> paramList, View paramView, int paramInt) {
    for (byte b = 0; b < paramInt; b++) {
      if (paramList.get(b) == paramView)
        return true; 
    } 
    return false;
  }
  
  public static Object b(Object paramObject) {
    if (paramObject == null)
      return null; 
    paramObject = (Transition)paramObject;
    if (paramObject == null)
      return null; 
    TransitionSet transitionSet = new TransitionSet();
    transitionSet.addTransition(paramObject);
    return transitionSet;
  }
  
  public static void b(Object paramObject, ArrayList<View> paramArrayList) {
    paramObject = (Transition)paramObject;
    boolean bool = paramObject instanceof TransitionSet;
    int i = 0;
    int j = 0;
    if (bool) {
      paramObject = (TransitionSet)paramObject;
      i = paramObject.getTransitionCount();
      while (j < i) {
        b(paramObject.getTransitionAt(j), paramArrayList);
        j++;
      } 
    } else if (!a(paramObject) && a(paramObject.getTargets())) {
      int k = paramArrayList.size();
      for (j = i; j < k; j++)
        paramObject.addTarget((View)paramArrayList.get(j)); 
    } 
  }
  
  private static void b(ArrayList<View> paramArrayList, View paramView) {
    ViewGroup viewGroup;
    if (paramView.getVisibility() == 0) {
      viewGroup = paramView;
      if (paramView instanceof ViewGroup) {
        viewGroup = (ViewGroup)paramView;
        if (viewGroup.isTransitionGroup()) {
          paramArrayList.add(viewGroup);
          return;
        } 
        int i = viewGroup.getChildCount();
        for (byte b = 0; b < i; b++)
          b(paramArrayList, viewGroup.getChildAt(b)); 
        return;
      } 
    } else {
      return;
    } 
    paramArrayList.add(viewGroup);
  }
  
  private static Rect c(View paramView) {
    Rect rect = new Rect();
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    rect.set(arrayOfInt[0], arrayOfInt[1], arrayOfInt[0] + paramView.getWidth(), arrayOfInt[1] + paramView.getHeight());
    return rect;
  }
  
  public static class a {
    public View a;
  }
  
  public static interface b {
    View a();
  }
}


/* Location:              /Users/dongbing/project/study-pen/android/05/classes-dex2jar.jar!/android/support/v4/a/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */