.class Landroid/support/v7/a/k$5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/a/k;->a(Landroid/support/v7/view/b$a;)Landroid/support/v7/view/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/a/k;


# direct methods
.method constructor <init>(Landroid/support/v7/a/k;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/a/k$5;->a:Landroid/support/v7/a/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Landroid/support/v7/a/k$5;->a:Landroid/support/v7/a/k;

    iget-object v0, v0, Landroid/support/v7/a/k;->o:Landroid/widget/PopupWindow;

    iget-object v1, p0, Landroid/support/v7/a/k$5;->a:Landroid/support/v7/a/k;

    iget-object v1, v1, Landroid/support/v7/a/k;->n:Landroid/support/v7/widget/ActionBarContextView;

    const/4 v2, 0x0

    const/16 v3, 0x37

    invoke-virtual {v0, v1, v3, v2, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    iget-object v0, p0, Landroid/support/v7/a/k$5;->a:Landroid/support/v7/a/k;

    invoke-static {v0}, Landroid/support/v7/a/k;->c(Landroid/support/v7/a/k;)V

    iget-object v0, p0, Landroid/support/v7/a/k$5;->a:Landroid/support/v7/a/k;

    iget-object v0, v0, Landroid/support/v7/a/k;->n:Landroid/support/v7/widget/ActionBarContextView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/support/v4/h/af;->b(Landroid/view/View;F)V

    iget-object v0, p0, Landroid/support/v7/a/k$5;->a:Landroid/support/v7/a/k;

    iget-object v1, p0, Landroid/support/v7/a/k$5;->a:Landroid/support/v7/a/k;

    iget-object v1, v1, Landroid/support/v7/a/k;->n:Landroid/support/v7/widget/ActionBarContextView;

    invoke-static {v1}, Landroid/support/v4/h/af;->i(Landroid/view/View;)Landroid/support/v4/h/au;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2}, Landroid/support/v4/h/au;->a(F)Landroid/support/v4/h/au;

    move-result-object v1

    iput-object v1, v0, Landroid/support/v7/a/k;->q:Landroid/support/v4/h/au;

    iget-object v0, p0, Landroid/support/v7/a/k$5;->a:Landroid/support/v7/a/k;

    iget-object v0, v0, Landroid/support/v7/a/k;->q:Landroid/support/v4/h/au;

    new-instance v1, Landroid/support/v7/a/k$5$1;

    invoke-direct {v1, p0}, Landroid/support/v7/a/k$5$1;-><init>(Landroid/support/v7/a/k$5;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/h/au;->a(Landroid/support/v4/h/ay;)Landroid/support/v4/h/au;

    return-void
.end method
