.class Landroid/support/v7/a/k$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/a/k;
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

    iput-object p1, p0, Landroid/support/v7/a/k$1;->a:Landroid/support/v7/a/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Landroid/support/v7/a/k$1;->a:Landroid/support/v7/a/k;

    invoke-static {v0}, Landroid/support/v7/a/k;->a(Landroid/support/v7/a/k;)I

    move-result v0

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/k$1;->a:Landroid/support/v7/a/k;

    invoke-static {v0, v1}, Landroid/support/v7/a/k;->a(Landroid/support/v7/a/k;I)V

    :cond_0
    iget-object v0, p0, Landroid/support/v7/a/k$1;->a:Landroid/support/v7/a/k;

    invoke-static {v0}, Landroid/support/v7/a/k;->a(Landroid/support/v7/a/k;)I

    move-result v0

    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/a/k$1;->a:Landroid/support/v7/a/k;

    const/16 v2, 0x6c

    invoke-static {v0, v2}, Landroid/support/v7/a/k;->a(Landroid/support/v7/a/k;I)V

    :cond_1
    iget-object v0, p0, Landroid/support/v7/a/k$1;->a:Landroid/support/v7/a/k;

    invoke-static {v0, v1}, Landroid/support/v7/a/k;->a(Landroid/support/v7/a/k;Z)Z

    iget-object v0, p0, Landroid/support/v7/a/k$1;->a:Landroid/support/v7/a/k;

    invoke-static {v0, v1}, Landroid/support/v7/a/k;->b(Landroid/support/v7/a/k;I)I

    return-void
.end method
