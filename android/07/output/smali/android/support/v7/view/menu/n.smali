.class public final Landroid/support/v7/view/menu/n;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/content/Context;Landroid/support/v4/d/a/a;)Landroid/view/Menu;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v7/view/menu/o;

    invoke-direct {v0, p0, p1}, Landroid/support/v7/view/menu/o;-><init>(Landroid/content/Context;Landroid/support/v4/d/a/a;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p0
.end method

.method public static a(Landroid/content/Context;Landroid/support/v4/d/a/b;)Landroid/view/MenuItem;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v7/view/menu/j;

    invoke-direct {v0, p0, p1}, Landroid/support/v7/view/menu/j;-><init>(Landroid/content/Context;Landroid/support/v4/d/a/b;)V

    return-object v0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_1

    new-instance v0, Landroid/support/v7/view/menu/i;

    invoke-direct {v0, p0, p1}, Landroid/support/v7/view/menu/i;-><init>(Landroid/content/Context;Landroid/support/v4/d/a/b;)V

    return-object v0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p0
.end method

.method public static a(Landroid/content/Context;Landroid/support/v4/d/a/c;)Landroid/view/SubMenu;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v7/view/menu/q;

    invoke-direct {v0, p0, p1}, Landroid/support/v7/view/menu/q;-><init>(Landroid/content/Context;Landroid/support/v4/d/a/c;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p0
.end method
