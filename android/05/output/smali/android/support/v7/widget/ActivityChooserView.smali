.class public Landroid/support/v7/widget/ActivityChooserView;
.super Landroid/view/ViewGroup;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/widget/ActivityChooserView$InnerLayout;,
        Landroid/support/v7/widget/ActivityChooserView$a;,
        Landroid/support/v7/widget/ActivityChooserView$b;
    }
.end annotation


# instance fields
.field a:Landroid/support/v4/h/d;

.field private final b:Landroid/support/v7/widget/ActivityChooserView$a;

.field private final c:Landroid/support/v7/widget/ActivityChooserView$b;

.field private final d:Landroid/support/v7/widget/af;

.field private final e:Landroid/widget/FrameLayout;

.field private final f:Landroid/widget/ImageView;

.field private final g:Landroid/widget/FrameLayout;

.field private final h:I

.field private final i:Landroid/database/DataSetObserver;

.field private final j:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field private k:Landroid/support/v7/widget/ag;

.field private l:Landroid/widget/PopupWindow$OnDismissListener;

.field private m:Z

.field private n:I

.field private o:Z

.field private p:I


# direct methods
.method static synthetic a(Landroid/support/v7/widget/ActivityChooserView;)Landroid/support/v7/widget/ActivityChooserView$a;
    .locals 0

    iget-object p0, p0, Landroid/support/v7/widget/ActivityChooserView;->b:Landroid/support/v7/widget/ActivityChooserView$a;

    return-object p0
.end method

.method private a(I)V
    .locals 5

    iget-object v0, p0, Landroid/support/v7/widget/ActivityChooserView;->b:Landroid/support/v7/widget/ActivityChooserView$a;

    invoke-virtual {v0}, Landroid/support/v7/widget/ActivityChooserView$a;->d()Landroid/support/v7/widget/e;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No data model. Did you call #setDataModel?"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/widget/ActivityChooserView;->j:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    iget-object v0, p0, Landroid/support/v7/widget/ActivityChooserView;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v3, p0, Landroid/support/v7/widget/ActivityChooserView;->b:Landroid/support/v7/widget/ActivityChooserView$a;

    invoke-virtual {v3}, Landroid/support/v7/widget/ActivityChooserView$a;->c()I

    move-result v3

    const v4, 0x7fffffff

    if-eq p1, v4, :cond_2

    add-int v4, p1, v0

    if-le v3, v4, :cond_2

    iget-object v3, p0, Landroid/support/v7/widget/ActivityChooserView;->b:Landroid/support/v7/widget/ActivityChooserView$a;

    invoke-virtual {v3, v2}, Landroid/support/v7/widget/ActivityChooserView$a;->a(Z)V

    iget-object v3, p0, Landroid/support/v7/widget/ActivityChooserView;->b:Landroid/support/v7/widget/ActivityChooserView$a;

    sub-int/2addr p1, v2

    goto :goto_1

    :cond_2
    iget-object v3, p0, Landroid/support/v7/widget/ActivityChooserView;->b:Landroid/support/v7/widget/ActivityChooserView$a;

    invoke-virtual {v3, v1}, Landroid/support/v7/widget/ActivityChooserView$a;->a(Z)V

    iget-object v3, p0, Landroid/support/v7/widget/ActivityChooserView;->b:Landroid/support/v7/widget/ActivityChooserView$a;

    :goto_1
    invoke-virtual {v3, p1}, Landroid/support/v7/widget/ActivityChooserView$a;->a(I)V

    invoke-direct {p0}, Landroid/support/v7/widget/ActivityChooserView;->getListPopupWindow()Landroid/support/v7/widget/ag;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v7/widget/ag;->k()Z

    move-result v3

    if-nez v3, :cond_6

    iget-boolean v3, p0, Landroid/support/v7/widget/ActivityChooserView;->m:Z

    if-nez v3, :cond_4

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    iget-object v0, p0, Landroid/support/v7/widget/ActivityChooserView;->b:Landroid/support/v7/widget/ActivityChooserView$a;

    invoke-virtual {v0, v1, v1}, Landroid/support/v7/widget/ActivityChooserView$a;->a(ZZ)V

    goto :goto_3

    :cond_4
    :goto_2
    iget-object v1, p0, Landroid/support/v7/widget/ActivityChooserView;->b:Landroid/support/v7/widget/ActivityChooserView$a;

    invoke-virtual {v1, v2, v0}, Landroid/support/v7/widget/ActivityChooserView$a;->a(ZZ)V

    :goto_3
    iget-object v0, p0, Landroid/support/v7/widget/ActivityChooserView;->b:Landroid/support/v7/widget/ActivityChooserView$a;

    invoke-virtual {v0}, Landroid/support/v7/widget/ActivityChooserView$a;->a()I

    move-result v0

    iget v1, p0, Landroid/support/v7/widget/ActivityChooserView;->h:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/ag;->f(I)V

    invoke-virtual {p1}, Landroid/support/v7/widget/ag;->c()V

    iget-object v0, p0, Landroid/support/v7/widget/ActivityChooserView;->a:Landroid/support/v4/h/d;

    if-eqz v0, :cond_5

    iget-object v0, p0, Landroid/support/v7/widget/ActivityChooserView;->a:Landroid/support/v4/h/d;

    invoke-virtual {v0, v2}, Landroid/support/v4/h/d;->a(Z)V

    :cond_5
    invoke-virtual {p1}, Landroid/support/v7/widget/ag;->m()Landroid/widget/ListView;

    move-result-object p1

    invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Landroid/support/v7/b/a$i;->abc_activitychooserview_choose_application:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_6
    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/ActivityChooserView;I)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/support/v7/widget/ActivityChooserView;->a(I)V

    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/ActivityChooserView;Z)Z
    .locals 0

    iput-boolean p1, p0, Landroid/support/v7/widget/ActivityChooserView;->m:Z

    return p1
.end method

.method static synthetic b(Landroid/support/v7/widget/ActivityChooserView;)Z
    .locals 0

    iget-boolean p0, p0, Landroid/support/v7/widget/ActivityChooserView;->m:Z

    return p0
.end method

.method static synthetic c(Landroid/support/v7/widget/ActivityChooserView;)Landroid/widget/FrameLayout;
    .locals 0

    iget-object p0, p0, Landroid/support/v7/widget/ActivityChooserView;->g:Landroid/widget/FrameLayout;

    return-object p0
.end method

.method static synthetic d(Landroid/support/v7/widget/ActivityChooserView;)Landroid/widget/FrameLayout;
    .locals 0

    iget-object p0, p0, Landroid/support/v7/widget/ActivityChooserView;->e:Landroid/widget/FrameLayout;

    return-object p0
.end method

.method static synthetic e(Landroid/support/v7/widget/ActivityChooserView;)I
    .locals 0

    iget p0, p0, Landroid/support/v7/widget/ActivityChooserView;->n:I

    return p0
.end method

.method static synthetic f(Landroid/support/v7/widget/ActivityChooserView;)Landroid/widget/PopupWindow$OnDismissListener;
    .locals 0

    iget-object p0, p0, Landroid/support/v7/widget/ActivityChooserView;->l:Landroid/widget/PopupWindow$OnDismissListener;

    return-object p0
.end method

.method static synthetic g(Landroid/support/v7/widget/ActivityChooserView;)Landroid/database/DataSetObserver;
    .locals 0

    iget-object p0, p0, Landroid/support/v7/widget/ActivityChooserView;->i:Landroid/database/DataSetObserver;

    return-object p0
.end method

.method private getListPopupWindow()Landroid/support/v7/widget/ag;
    .locals 2

    iget-object v0, p0, Landroid/support/v7/widget/ActivityChooserView;->k:Landroid/support/v7/widget/ag;

    if-nez v0, :cond_0

    new-instance v0, Landroid/support/v7/widget/ag;

    invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v7/widget/ag;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroid/support/v7/widget/ActivityChooserView;->k:Landroid/support/v7/widget/ag;

    iget-object v0, p0, Landroid/support/v7/widget/ActivityChooserView;->k:Landroid/support/v7/widget/ag;

    iget-object v1, p0, Landroid/support/v7/widget/ActivityChooserView;->b:Landroid/support/v7/widget/ActivityChooserView$a;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ag;->a(Landroid/widget/ListAdapter;)V

    iget-object v0, p0, Landroid/support/v7/widget/ActivityChooserView;->k:Landroid/support/v7/widget/ag;

    invoke-virtual {v0, p0}, Landroid/support/v7/widget/ag;->a(Landroid/view/View;)V

    iget-object v0, p0, Landroid/support/v7/widget/ActivityChooserView;->k:Landroid/support/v7/widget/ag;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ag;->a(Z)V

    iget-object v0, p0, Landroid/support/v7/widget/ActivityChooserView;->k:Landroid/support/v7/widget/ag;

    iget-object v1, p0, Landroid/support/v7/widget/ActivityChooserView;->c:Landroid/support/v7/widget/ActivityChooserView$b;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ag;->a(Landroid/widget/AdapterView$OnItemClickListener;)V

    iget-object v0, p0, Landroid/support/v7/widget/ActivityChooserView;->k:Landroid/support/v7/widget/ag;

    iget-object v1, p0, Landroid/support/v7/widget/ActivityChooserView;->c:Landroid/support/v7/widget/ActivityChooserView$b;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ag;->a(Landroid/widget/PopupWindow$OnDismissListener;)V

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/ActivityChooserView;->k:Landroid/support/v7/widget/ag;

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 2

    invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroid/support/v7/widget/ActivityChooserView;->o:Z

    if-nez v0, :cond_0

    return v1

    :cond_0
    iput-boolean v1, p0, Landroid/support/v7/widget/ActivityChooserView;->m:Z

    iget v0, p0, Landroid/support/v7/widget/ActivityChooserView;->n:I

    invoke-direct {p0, v0}, Landroid/support/v7/widget/ActivityChooserView;->a(I)V

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method public b()Z
    .locals 2

    invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Landroid/support/v7/widget/ActivityChooserView;->getListPopupWindow()Landroid/support/v7/widget/ag;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/ag;->i()V

    invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/ActivityChooserView;->j:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public c()Z
    .locals 1

    invoke-direct {p0}, Landroid/support/v7/widget/ActivityChooserView;->getListPopupWindow()Landroid/support/v7/widget/ag;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/ag;->k()Z

    move-result v0

    return v0
.end method

.method public getDataModel()Landroid/support/v7/widget/e;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/ActivityChooserView;->b:Landroid/support/v7/widget/ActivityChooserView$a;

    invoke-virtual {v0}, Landroid/support/v7/widget/ActivityChooserView$a;->d()Landroid/support/v7/widget/e;

    move-result-object v0

    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    iget-object v0, p0, Landroid/support/v7/widget/ActivityChooserView;->b:Landroid/support/v7/widget/ActivityChooserView$a;

    invoke-virtual {v0}, Landroid/support/v7/widget/ActivityChooserView$a;->d()Landroid/support/v7/widget/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/ActivityChooserView;->i:Landroid/database/DataSetObserver;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/e;->registerObserver(Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/ActivityChooserView;->o:Z

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    iget-object v0, p0, Landroid/support/v7/widget/ActivityChooserView;->b:Landroid/support/v7/widget/ActivityChooserView$a;

    invoke-virtual {v0}, Landroid/support/v7/widget/ActivityChooserView$a;->d()Landroid/support/v7/widget/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/ActivityChooserView;->i:Landroid/database/DataSetObserver;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/e;->unregisterObserver(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroid/support/v7/widget/ActivityChooserView;->j:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->b()Z

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/widget/ActivityChooserView;->o:Z

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    iget-object p1, p0, Landroid/support/v7/widget/ActivityChooserView;->d:Landroid/support/v7/widget/af;

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p4, p5}, Landroid/support/v7/widget/af;->layout(IIII)V

    invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->c()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->b()Z

    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/widget/ActivityChooserView;->d:Landroid/support/v7/widget/af;

    iget-object v1, p0, Landroid/support/v7/widget/ActivityChooserView;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    :cond_0
    invoke-virtual {p0, v0, p1, p2}, Landroid/support/v7/widget/ActivityChooserView;->measureChild(Landroid/view/View;II)V

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/support/v7/widget/ActivityChooserView;->setMeasuredDimension(II)V

    return-void
.end method

.method public setActivityChooserModel(Landroid/support/v7/widget/e;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/ActivityChooserView;->b:Landroid/support/v7/widget/ActivityChooserView$a;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/ActivityChooserView$a;->a(Landroid/support/v7/widget/e;)V

    invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->b()Z

    invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->a()Z

    :cond_0
    return-void
.end method

.method public setDefaultActionButtonContentDescription(I)V
    .locals 0

    iput p1, p0, Landroid/support/v7/widget/ActivityChooserView;->p:I

    return-void
.end method

.method public setExpandActivityOverflowButtonContentDescription(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Landroid/support/v7/widget/ActivityChooserView;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setExpandActivityOverflowButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/ActivityChooserView;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setInitialActivityCount(I)V
    .locals 0

    iput p1, p0, Landroid/support/v7/widget/ActivityChooserView;->n:I

    return-void
.end method

.method public setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/widget/ActivityChooserView;->l:Landroid/widget/PopupWindow$OnDismissListener;

    return-void
.end method

.method public setProvider(Landroid/support/v4/h/d;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/widget/ActivityChooserView;->a:Landroid/support/v4/h/d;

    return-void
.end method
