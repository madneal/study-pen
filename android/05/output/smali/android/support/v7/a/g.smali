.class abstract Landroid/support/v7/a/g;
.super Landroid/support/v7/a/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/a/g$a;
    }
.end annotation


# instance fields
.field final a:Landroid/content/Context;

.field final b:Landroid/view/Window;

.field final c:Landroid/view/Window$Callback;

.field final d:Landroid/view/Window$Callback;

.field final e:Landroid/support/v7/a/e;

.field f:Landroid/support/v7/a/a;

.field g:Landroid/view/MenuInflater;

.field h:Z

.field i:Z

.field j:Z

.field k:Z

.field l:Z

.field private m:Ljava/lang/CharSequence;

.field private n:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/view/Window;Landroid/support/v7/a/e;)V
    .locals 0

    invoke-direct {p0}, Landroid/support/v7/a/f;-><init>()V

    iput-object p1, p0, Landroid/support/v7/a/g;->a:Landroid/content/Context;

    iput-object p2, p0, Landroid/support/v7/a/g;->b:Landroid/view/Window;

    iput-object p3, p0, Landroid/support/v7/a/g;->e:Landroid/support/v7/a/e;

    iget-object p1, p0, Landroid/support/v7/a/g;->b:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p1

    iput-object p1, p0, Landroid/support/v7/a/g;->c:Landroid/view/Window$Callback;

    iget-object p1, p0, Landroid/support/v7/a/g;->c:Landroid/view/Window$Callback;

    instance-of p1, p1, Landroid/support/v7/a/g$a;

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "AppCompat has already installed itself into the Window"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object p1, p0, Landroid/support/v7/a/g;->c:Landroid/view/Window$Callback;

    invoke-virtual {p0, p1}, Landroid/support/v7/a/g;->a(Landroid/view/Window$Callback;)Landroid/view/Window$Callback;

    move-result-object p1

    iput-object p1, p0, Landroid/support/v7/a/g;->d:Landroid/view/Window$Callback;

    iget-object p1, p0, Landroid/support/v7/a/g;->b:Landroid/view/Window;

    iget-object p2, p0, Landroid/support/v7/a/g;->d:Landroid/view/Window$Callback;

    invoke-virtual {p1, p2}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    return-void
.end method


# virtual methods
.method public a()Landroid/support/v7/a/a;
    .locals 1

    invoke-virtual {p0}, Landroid/support/v7/a/g;->k()V

    iget-object v0, p0, Landroid/support/v7/a/g;->f:Landroid/support/v7/a/a;

    return-object v0
.end method

.method abstract a(Landroid/support/v7/view/b$a;)Landroid/support/v7/view/b;
.end method

.method a(Landroid/view/Window$Callback;)Landroid/view/Window$Callback;
    .locals 1

    new-instance v0, Landroid/support/v7/a/g$a;

    invoke-direct {v0, p0, p1}, Landroid/support/v7/a/g$a;-><init>(Landroid/support/v7/a/g;Landroid/view/Window$Callback;)V

    return-object v0
.end method

.method abstract a(ILandroid/view/Menu;)V
.end method

.method public final a(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/a/g;->m:Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Landroid/support/v7/a/g;->b(Ljava/lang/CharSequence;)V

    return-void
.end method

.method abstract a(ILandroid/view/KeyEvent;)Z
.end method

.method abstract a(Landroid/view/KeyEvent;)Z
.end method

.method public b()Landroid/view/MenuInflater;
    .locals 2

    iget-object v0, p0, Landroid/support/v7/a/g;->g:Landroid/view/MenuInflater;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/support/v7/a/g;->k()V

    new-instance v0, Landroid/support/v7/view/g;

    iget-object v1, p0, Landroid/support/v7/a/g;->f:Landroid/support/v7/a/a;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/a/g;->f:Landroid/support/v7/a/a;

    invoke-virtual {v1}, Landroid/support/v7/a/a;->c()Landroid/content/Context;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Landroid/support/v7/a/g;->a:Landroid/content/Context;

    :goto_0
    invoke-direct {v0, v1}, Landroid/support/v7/view/g;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroid/support/v7/a/g;->g:Landroid/view/MenuInflater;

    :cond_1
    iget-object v0, p0, Landroid/support/v7/a/g;->g:Landroid/view/MenuInflater;

    return-object v0
.end method

.method abstract b(Ljava/lang/CharSequence;)V
.end method

.method abstract b(ILandroid/view/Menu;)Z
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/a/g;->n:Z

    return-void
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method abstract k()V
.end method

.method final l()Landroid/support/v7/a/a;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/g;->f:Landroid/support/v7/a/a;

    return-object v0
.end method

.method final m()Landroid/content/Context;
    .locals 1

    invoke-virtual {p0}, Landroid/support/v7/a/g;->a()Landroid/support/v7/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/support/v7/a/a;->c()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/a/g;->a:Landroid/content/Context;

    :cond_1
    return-object v0
.end method

.method public n()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method final o()Z
    .locals 1

    iget-boolean v0, p0, Landroid/support/v7/a/g;->n:Z

    return v0
.end method

.method final p()Landroid/view/Window$Callback;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/g;->b:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    return-object v0
.end method

.method final q()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/a/g;->c:Landroid/view/Window$Callback;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/a/g;->c:Landroid/view/Window$Callback;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/a/g;->m:Ljava/lang/CharSequence;

    return-object v0
.end method
