.class public final Landroid/support/v4/b/e;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/b/e$d;,
        Landroid/support/v4/b/e$c;,
        Landroid/support/v4/b/e$b;,
        Landroid/support/v4/b/e$a;
    }
.end annotation


# static fields
.field private static final a:Landroid/support/v4/b/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xf

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v4/b/e$d;

    invoke-direct {v0}, Landroid/support/v4/b/e$d;-><init>()V

    :goto_0
    sput-object v0, Landroid/support/v4/b/e;->a:Landroid/support/v4/b/e$a;

    return-void

    :cond_0
    const/16 v1, 0xb

    if-lt v0, v1, :cond_1

    new-instance v0, Landroid/support/v4/b/e$c;

    invoke-direct {v0}, Landroid/support/v4/b/e$c;-><init>()V

    goto :goto_0

    :cond_1
    new-instance v0, Landroid/support/v4/b/e$b;

    invoke-direct {v0}, Landroid/support/v4/b/e$b;-><init>()V

    goto :goto_0

    return-void
.end method

.method public static a(Landroid/content/ComponentName;)Landroid/content/Intent;
    .locals 1

    sget-object v0, Landroid/support/v4/b/e;->a:Landroid/support/v4/b/e$a;

    invoke-interface {v0, p0}, Landroid/support/v4/b/e$a;->a(Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method
