.class Landroid/support/v4/a/k$1;
.super Landroid/support/v4/a/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v4/a/k;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v4/a/k;


# direct methods
.method constructor <init>(Landroid/support/v4/a/k;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v4/a/k$1;->a:Landroid/support/v4/a/k;

    invoke-direct {p0}, Landroid/support/v4/a/m;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/a/k$1;->a:Landroid/support/v4/a/k;

    iget-object v0, v0, Landroid/support/v4/a/k;->I:Landroid/view/View;

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Fragment does not have a view"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/k$1;->a:Landroid/support/v4/a/k;

    iget-object v0, v0, Landroid/support/v4/a/k;->I:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public a()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v4/a/k$1;->a:Landroid/support/v4/a/k;

    iget-object v0, v0, Landroid/support/v4/a/k;->I:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method