.class public final Landroid/support/v4/widget/u;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/widget/u$d;,
        Landroid/support/v4/widget/u$c;,
        Landroid/support/v4/widget/u$b;,
        Landroid/support/v4/widget/u$a;
    }
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Landroid/support/v4/widget/u$a;


# direct methods
.method private constructor <init>(ILandroid/content/Context;Landroid/view/animation/Interpolator;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xe

    if-lt p1, v0, :cond_0

    new-instance p1, Landroid/support/v4/widget/u$d;

    invoke-direct {p1}, Landroid/support/v4/widget/u$d;-><init>()V

    :goto_0
    iput-object p1, p0, Landroid/support/v4/widget/u;->b:Landroid/support/v4/widget/u$a;

    goto :goto_1

    :cond_0
    const/16 v0, 0x9

    if-lt p1, v0, :cond_1

    new-instance p1, Landroid/support/v4/widget/u$c;

    invoke-direct {p1}, Landroid/support/v4/widget/u$c;-><init>()V

    goto :goto_0

    :cond_1
    new-instance p1, Landroid/support/v4/widget/u$b;

    invoke-direct {p1}, Landroid/support/v4/widget/u$b;-><init>()V

    goto :goto_0

    :goto_1
    iget-object p1, p0, Landroid/support/v4/widget/u;->b:Landroid/support/v4/widget/u$a;

    invoke-interface {p1, p2, p3}, Landroid/support/v4/widget/u$a;->a(Landroid/content/Context;Landroid/view/animation/Interpolator;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Landroid/support/v4/widget/u;->a:Ljava/lang/Object;

    return-void
.end method

.method public static a(Landroid/content/Context;)Landroid/support/v4/widget/u;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroid/support/v4/widget/u;->a(Landroid/content/Context;Landroid/view/animation/Interpolator;)Landroid/support/v4/widget/u;

    move-result-object p0

    return-object p0
.end method

.method public static a(Landroid/content/Context;Landroid/view/animation/Interpolator;)Landroid/support/v4/widget/u;
    .locals 2

    new-instance v0, Landroid/support/v4/widget/u;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-direct {v0, v1, p0, p1}, Landroid/support/v4/widget/u;-><init>(ILandroid/content/Context;Landroid/view/animation/Interpolator;)V

    return-object v0
.end method


# virtual methods
.method public a(IIII)V
    .locals 6

    iget-object v0, p0, Landroid/support/v4/widget/u;->b:Landroid/support/v4/widget/u$a;

    iget-object v1, p0, Landroid/support/v4/widget/u;->a:Ljava/lang/Object;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-interface/range {v0 .. v5}, Landroid/support/v4/widget/u$a;->a(Ljava/lang/Object;IIII)V

    return-void
.end method

.method public a(IIIIIIII)V
    .locals 11

    move-object v0, p0

    iget-object v1, v0, Landroid/support/v4/widget/u;->b:Landroid/support/v4/widget/u$a;

    iget-object v2, v0, Landroid/support/v4/widget/u;->a:Ljava/lang/Object;

    move v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    invoke-interface/range {v1 .. v10}, Landroid/support/v4/widget/u$a;->a(Ljava/lang/Object;IIIIIIII)V

    return-void
.end method

.method public a(IIIIIIIIII)V
    .locals 13

    move-object v0, p0

    iget-object v1, v0, Landroid/support/v4/widget/u;->b:Landroid/support/v4/widget/u$a;

    iget-object v2, v0, Landroid/support/v4/widget/u;->a:Ljava/lang/Object;

    move v3, p1

    move v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move/from16 v11, p9

    move/from16 v12, p10

    invoke-interface/range {v1 .. v12}, Landroid/support/v4/widget/u$a;->a(Ljava/lang/Object;IIIIIIIIII)V

    return-void
.end method

.method public a()Z
    .locals 2

    iget-object v0, p0, Landroid/support/v4/widget/u;->b:Landroid/support/v4/widget/u$a;

    iget-object v1, p0, Landroid/support/v4/widget/u;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Landroid/support/v4/widget/u$a;->a(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public a(IIIIII)Z
    .locals 8

    iget-object v0, p0, Landroid/support/v4/widget/u;->b:Landroid/support/v4/widget/u$a;

    iget-object v1, p0, Landroid/support/v4/widget/u;->a:Ljava/lang/Object;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-interface/range {v0 .. v7}, Landroid/support/v4/widget/u$a;->a(Ljava/lang/Object;IIIIII)Z

    move-result p1

    return p1
.end method

.method public b()I
    .locals 2

    iget-object v0, p0, Landroid/support/v4/widget/u;->b:Landroid/support/v4/widget/u$a;

    iget-object v1, p0, Landroid/support/v4/widget/u;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Landroid/support/v4/widget/u$a;->b(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public c()I
    .locals 2

    iget-object v0, p0, Landroid/support/v4/widget/u;->b:Landroid/support/v4/widget/u$a;

    iget-object v1, p0, Landroid/support/v4/widget/u;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Landroid/support/v4/widget/u$a;->c(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public d()I
    .locals 2

    iget-object v0, p0, Landroid/support/v4/widget/u;->b:Landroid/support/v4/widget/u$a;

    iget-object v1, p0, Landroid/support/v4/widget/u;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Landroid/support/v4/widget/u$a;->g(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public e()F
    .locals 2

    iget-object v0, p0, Landroid/support/v4/widget/u;->b:Landroid/support/v4/widget/u$a;

    iget-object v1, p0, Landroid/support/v4/widget/u;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Landroid/support/v4/widget/u$a;->d(Ljava/lang/Object;)F

    move-result v0

    return v0
.end method

.method public f()Z
    .locals 2

    iget-object v0, p0, Landroid/support/v4/widget/u;->b:Landroid/support/v4/widget/u$a;

    iget-object v1, p0, Landroid/support/v4/widget/u;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Landroid/support/v4/widget/u$a;->e(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, Landroid/support/v4/widget/u;->b:Landroid/support/v4/widget/u$a;

    iget-object v1, p0, Landroid/support/v4/widget/u;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Landroid/support/v4/widget/u$a;->f(Ljava/lang/Object;)V

    return-void
.end method
