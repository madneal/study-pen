.class final Landroid/support/v7/a/n$b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/v7/view/menu/f$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/a/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/a/n;


# direct methods
.method private constructor <init>(Landroid/support/v7/a/n;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/a/n$b;->a:Landroid/support/v7/a/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/a/n;Landroid/support/v7/a/n$1;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/support/v7/a/n$b;-><init>(Landroid/support/v7/a/n;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/support/v7/view/menu/f;)V
    .locals 4

    iget-object v0, p0, Landroid/support/v7/a/n$b;->a:Landroid/support/v7/a/n;

    invoke-static {v0}, Landroid/support/v7/a/n;->a(Landroid/support/v7/a/n;)Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/a/n$b;->a:Landroid/support/v7/a/n;

    invoke-static {v0}, Landroid/support/v7/a/n;->b(Landroid/support/v7/a/n;)Landroid/support/v7/widget/ac;

    move-result-object v0

    invoke-interface {v0}, Landroid/support/v7/widget/ac;->i()Z

    move-result v0

    const/16 v1, 0x6c

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/n$b;->a:Landroid/support/v7/a/n;

    invoke-static {v0}, Landroid/support/v7/a/n;->a(Landroid/support/v7/a/n;)Landroid/view/Window$Callback;

    move-result-object v0

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    return-void

    :cond_0
    iget-object v0, p0, Landroid/support/v7/a/n$b;->a:Landroid/support/v7/a/n;

    invoke-static {v0}, Landroid/support/v7/a/n;->a(Landroid/support/v7/a/n;)Landroid/view/Window$Callback;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3, p1}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/a/n$b;->a:Landroid/support/v7/a/n;

    invoke-static {v0}, Landroid/support/v7/a/n;->a(Landroid/support/v7/a/n;)Landroid/view/Window$Callback;

    move-result-object v0

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_1
    return-void
.end method

.method public a(Landroid/support/v7/view/menu/f;Landroid/view/MenuItem;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
