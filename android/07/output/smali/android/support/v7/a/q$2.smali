.class Landroid/support/v7/a/q$2;
.super Landroid/support/v4/h/az;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/a/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/a/q;


# direct methods
.method constructor <init>(Landroid/support/v7/a/q;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/a/q$2;->a:Landroid/support/v7/a/q;

    invoke-direct {p0}, Landroid/support/v4/h/az;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Landroid/support/v7/a/q$2;->a:Landroid/support/v7/a/q;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroid/support/v7/a/q;->a(Landroid/support/v7/a/q;Landroid/support/v7/view/h;)Landroid/support/v7/view/h;

    iget-object p1, p0, Landroid/support/v7/a/q$2;->a:Landroid/support/v7/a/q;

    invoke-static {p1}, Landroid/support/v7/a/q;->c(Landroid/support/v7/a/q;)Landroid/support/v7/widget/ActionBarContainer;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v7/widget/ActionBarContainer;->requestLayout()V

    return-void
.end method
