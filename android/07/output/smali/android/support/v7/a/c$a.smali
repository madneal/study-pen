.class public Landroid/support/v7/a/c$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/support/v7/a/b$a;

.field private b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroid/support/v7/a/c;->a(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, Landroid/support/v7/a/c$a;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/support/v7/a/b$a;

    new-instance v1, Landroid/view/ContextThemeWrapper;

    invoke-static {p1, p2}, Landroid/support/v7/a/c;->a(Landroid/content/Context;I)I

    move-result v2

    invoke-direct {v1, p1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    invoke-direct {v0, v1}, Landroid/support/v7/a/b$a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroid/support/v7/a/c$a;->a:Landroid/support/v7/a/b$a;

    iput p2, p0, Landroid/support/v7/a/c$a;->b:I

    return-void
.end method


# virtual methods
.method public a()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/c$a;->a:Landroid/support/v7/a/b$a;

    iget-object v0, v0, Landroid/support/v7/a/b$a;->a:Landroid/content/Context;

    return-object v0
.end method

.method public a(Landroid/content/DialogInterface$OnKeyListener;)Landroid/support/v7/a/c$a;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/c$a;->a:Landroid/support/v7/a/b$a;

    iput-object p1, v0, Landroid/support/v7/a/b$a;->r:Landroid/content/DialogInterface$OnKeyListener;

    return-object p0
.end method

.method public a(Landroid/graphics/drawable/Drawable;)Landroid/support/v7/a/c$a;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/c$a;->a:Landroid/support/v7/a/b$a;

    iput-object p1, v0, Landroid/support/v7/a/b$a;->d:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public a(Landroid/view/View;)Landroid/support/v7/a/c$a;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/c$a;->a:Landroid/support/v7/a/b$a;

    iput-object p1, v0, Landroid/support/v7/a/b$a;->g:Landroid/view/View;

    return-object p0
.end method

.method public a(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/a/c$a;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/c$a;->a:Landroid/support/v7/a/b$a;

    iput-object p1, v0, Landroid/support/v7/a/b$a;->t:Landroid/widget/ListAdapter;

    iget-object p1, p0, Landroid/support/v7/a/c$a;->a:Landroid/support/v7/a/b$a;

    iput-object p2, p1, Landroid/support/v7/a/b$a;->u:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method

.method public a(Ljava/lang/CharSequence;)Landroid/support/v7/a/c$a;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/c$a;->a:Landroid/support/v7/a/b$a;

    iput-object p1, v0, Landroid/support/v7/a/b$a;->f:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public b()Landroid/support/v7/a/c;
    .locals 4

    new-instance v0, Landroid/support/v7/a/c;

    iget-object v1, p0, Landroid/support/v7/a/c$a;->a:Landroid/support/v7/a/b$a;

    iget-object v1, v1, Landroid/support/v7/a/b$a;->a:Landroid/content/Context;

    iget v2, p0, Landroid/support/v7/a/c$a;->b:I

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Landroid/support/v7/a/c;-><init>(Landroid/content/Context;IZ)V

    iget-object v1, p0, Landroid/support/v7/a/c$a;->a:Landroid/support/v7/a/b$a;

    invoke-static {v0}, Landroid/support/v7/a/c;->a(Landroid/support/v7/a/c;)Landroid/support/v7/a/b;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v7/a/b$a;->a(Landroid/support/v7/a/b;)V

    iget-object v1, p0, Landroid/support/v7/a/c$a;->a:Landroid/support/v7/a/b$a;

    iget-boolean v1, v1, Landroid/support/v7/a/b$a;->o:Z

    invoke-virtual {v0, v1}, Landroid/support/v7/a/c;->setCancelable(Z)V

    iget-object v1, p0, Landroid/support/v7/a/c$a;->a:Landroid/support/v7/a/b$a;

    iget-boolean v1, v1, Landroid/support/v7/a/b$a;->o:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/a/c;->setCanceledOnTouchOutside(Z)V

    :cond_0
    iget-object v1, p0, Landroid/support/v7/a/c$a;->a:Landroid/support/v7/a/b$a;

    iget-object v1, v1, Landroid/support/v7/a/b$a;->p:Landroid/content/DialogInterface$OnCancelListener;

    invoke-virtual {v0, v1}, Landroid/support/v7/a/c;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    iget-object v1, p0, Landroid/support/v7/a/c$a;->a:Landroid/support/v7/a/b$a;

    iget-object v1, v1, Landroid/support/v7/a/b$a;->q:Landroid/content/DialogInterface$OnDismissListener;

    invoke-virtual {v0, v1}, Landroid/support/v7/a/c;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v1, p0, Landroid/support/v7/a/c$a;->a:Landroid/support/v7/a/b$a;

    iget-object v1, v1, Landroid/support/v7/a/b$a;->r:Landroid/content/DialogInterface$OnKeyListener;

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroid/support/v7/a/c$a;->a:Landroid/support/v7/a/b$a;

    iget-object v1, v1, Landroid/support/v7/a/b$a;->r:Landroid/content/DialogInterface$OnKeyListener;

    invoke-virtual {v0, v1}, Landroid/support/v7/a/c;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    :cond_1
    return-object v0
.end method
