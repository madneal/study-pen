.class Landroid/support/v7/a/j;
.super Landroid/support/v7/a/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/a/j$a;
    }
.end annotation


# instance fields
.field private final r:Landroid/app/UiModeManager;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/view/Window;Landroid/support/v7/a/e;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/a/i;-><init>(Landroid/content/Context;Landroid/view/Window;Landroid/support/v7/a/e;)V

    const-string p2, "uimode"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/UiModeManager;

    iput-object p1, p0, Landroid/support/v7/a/j;->r:Landroid/app/UiModeManager;

    return-void
.end method


# virtual methods
.method a(Landroid/view/Window$Callback;)Landroid/view/Window$Callback;
    .locals 1

    new-instance v0, Landroid/support/v7/a/j$a;

    invoke-direct {v0, p0, p1}, Landroid/support/v7/a/j$a;-><init>(Landroid/support/v7/a/j;Landroid/view/Window$Callback;)V

    return-object v0
.end method

.method d(I)I
    .locals 1

    if-nez p1, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/j;->r:Landroid/app/UiModeManager;

    invoke-virtual {v0}, Landroid/app/UiModeManager;->getNightMode()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/support/v7/a/i;->d(I)I

    move-result p1

    return p1
.end method
