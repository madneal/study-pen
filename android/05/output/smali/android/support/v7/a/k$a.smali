.class final Landroid/support/v7/a/k$a;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/v7/view/menu/l$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/a/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/a/k;


# direct methods
.method private constructor <init>(Landroid/support/v7/a/k;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/a/k$a;->a:Landroid/support/v7/a/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/a/k;Landroid/support/v7/a/k$1;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/support/v7/a/k$a;-><init>(Landroid/support/v7/a/k;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/support/v7/view/menu/f;Z)V
    .locals 0

    iget-object p2, p0, Landroid/support/v7/a/k$a;->a:Landroid/support/v7/a/k;

    invoke-static {p2, p1}, Landroid/support/v7/a/k;->a(Landroid/support/v7/a/k;Landroid/support/v7/view/menu/f;)V

    return-void
.end method

.method public a(Landroid/support/v7/view/menu/f;)Z
    .locals 2

    iget-object v0, p0, Landroid/support/v7/a/k$a;->a:Landroid/support/v7/a/k;

    invoke-virtual {v0}, Landroid/support/v7/a/k;->p()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
