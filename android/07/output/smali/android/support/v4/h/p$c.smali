.class Landroid/support/v4/h/p$c;
.super Landroid/support/v4/h/p$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/h/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v4/h/p$b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/MenuItem;)Z
    .locals 0

    invoke-static {p1}, Landroid/support/v4/h/r;->a(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public c(Landroid/view/MenuItem;)Z
    .locals 0

    invoke-static {p1}, Landroid/support/v4/h/r;->b(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
