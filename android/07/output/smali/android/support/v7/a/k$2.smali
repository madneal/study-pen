.class Landroid/support/v7/a/k$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/v4/h/aa;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/a/k;->t()Landroid/view/ViewGroup;
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

    iput-object p1, p0, Landroid/support/v7/a/k$2;->a:Landroid/support/v7/a/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Landroid/support/v4/h/bb;)Landroid/support/v4/h/bb;
    .locals 4

    invoke-virtual {p2}, Landroid/support/v4/h/bb;->b()I

    move-result v0

    iget-object v1, p0, Landroid/support/v7/a/k$2;->a:Landroid/support/v7/a/k;

    invoke-static {v1, v0}, Landroid/support/v7/a/k;->c(Landroid/support/v7/a/k;I)I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, Landroid/support/v4/h/bb;->a()I

    move-result v0

    invoke-virtual {p2}, Landroid/support/v4/h/bb;->c()I

    move-result v2

    invoke-virtual {p2}, Landroid/support/v4/h/bb;->d()I

    move-result v3

    invoke-virtual {p2, v0, v1, v2, v3}, Landroid/support/v4/h/bb;->a(IIII)Landroid/support/v4/h/bb;

    move-result-object p2

    :cond_0
    invoke-static {p1, p2}, Landroid/support/v4/h/af;->a(Landroid/view/View;Landroid/support/v4/h/bb;)Landroid/support/v4/h/bb;

    move-result-object p1

    return-object p1
.end method
