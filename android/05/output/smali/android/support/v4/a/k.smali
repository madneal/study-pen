.class public Landroid/support/v4/a/k;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ComponentCallbacks;
.implements Landroid/view/View$OnCreateContextMenuListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/a/k$a;
    }
.end annotation


# static fields
.field private static final Z:Landroid/support/v4/g/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/g/h<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field static final a:Ljava/lang/Object;


# instance fields
.field A:Z

.field B:Z

.field C:Z

.field D:Z

.field E:Z

.field F:Z

.field G:I

.field H:Landroid/view/ViewGroup;

.field I:Landroid/view/View;

.field J:Landroid/view/View;

.field K:Z

.field L:Z

.field M:Landroid/support/v4/a/w;

.field N:Z

.field O:Z

.field P:Ljava/lang/Object;

.field Q:Ljava/lang/Object;

.field R:Ljava/lang/Object;

.field S:Ljava/lang/Object;

.field T:Ljava/lang/Object;

.field U:Ljava/lang/Object;

.field V:Ljava/lang/Boolean;

.field W:Ljava/lang/Boolean;

.field X:Landroid/support/v4/a/aa;

.field Y:Landroid/support/v4/a/aa;

.field b:I

.field c:Landroid/view/View;

.field d:I

.field e:Landroid/os/Bundle;

.field f:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation
.end field

.field g:I

.field h:Ljava/lang/String;

.field i:Landroid/os/Bundle;

.field j:Landroid/support/v4/a/k;

.field k:I

.field l:I

.field m:Z

.field n:Z

.field o:Z

.field p:Z

.field q:Z

.field r:I

.field s:Landroid/support/v4/a/q;

.field t:Landroid/support/v4/a/o;

.field u:Landroid/support/v4/a/q;

.field v:Landroid/support/v4/a/k;

.field w:I

.field x:I

.field y:Ljava/lang/String;

.field z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/support/v4/g/h;

    invoke-direct {v0}, Landroid/support/v4/g/h;-><init>()V

    sput-object v0, Landroid/support/v4/a/k;->Z:Landroid/support/v4/g/h;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroid/support/v4/a/k;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v4/a/k;->b:I

    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v4/a/k;->g:I

    iput v0, p0, Landroid/support/v4/a/k;->k:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/a/k;->E:Z

    iput-boolean v0, p0, Landroid/support/v4/a/k;->L:Z

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v4/a/k;->P:Ljava/lang/Object;

    sget-object v1, Landroid/support/v4/a/k;->a:Ljava/lang/Object;

    iput-object v1, p0, Landroid/support/v4/a/k;->Q:Ljava/lang/Object;

    iput-object v0, p0, Landroid/support/v4/a/k;->R:Ljava/lang/Object;

    sget-object v1, Landroid/support/v4/a/k;->a:Ljava/lang/Object;

    iput-object v1, p0, Landroid/support/v4/a/k;->S:Ljava/lang/Object;

    iput-object v0, p0, Landroid/support/v4/a/k;->T:Ljava/lang/Object;

    sget-object v1, Landroid/support/v4/a/k;->a:Ljava/lang/Object;

    iput-object v1, p0, Landroid/support/v4/a/k;->U:Ljava/lang/Object;

    iput-object v0, p0, Landroid/support/v4/a/k;->X:Landroid/support/v4/a/aa;

    iput-object v0, p0, Landroid/support/v4/a/k;->Y:Landroid/support/v4/a/aa;

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/a/k;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/support/v4/a/k;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/a/k;

    move-result-object p0

    return-object p0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/a/k;
    .locals 2

    :try_start_0
    sget-object v0, Landroid/support/v4/a/k;->Z:Landroid/support/v4/g/h;

    invoke-virtual {v0, p1}, Landroid/support/v4/g/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sget-object p0, Landroid/support/v4/a/k;->Z:Landroid/support/v4/g/h;

    invoke-virtual {p0, p1, v0}, Landroid/support/v4/g/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/a/k;

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    iput-object p2, p0, Landroid/support/v4/a/k;->i:Landroid/os/Bundle;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-object p0

    :catch_0
    move-exception p0

    new-instance p2, Landroid/support/v4/a/k$a;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to instantiate fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": make sure class name exists, is public, and has an"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " empty constructor that is public"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Landroid/support/v4/a/k$a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :catch_1
    move-exception p0

    new-instance p2, Landroid/support/v4/a/k$a;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to instantiate fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": make sure class name exists, is public, and has an"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " empty constructor that is public"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Landroid/support/v4/a/k$a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :catch_2
    move-exception p0

    new-instance p2, Landroid/support/v4/a/k$a;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to instantiate fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": make sure class name exists, is public, and has an"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " empty constructor that is public"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Landroid/support/v4/a/k$a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2
.end method

.method static b(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 1

    :try_start_0
    sget-object v0, Landroid/support/v4/a/k;->Z:Landroid/support/v4/g/h;

    invoke-virtual {v0, p1}, Landroid/support/v4/g/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sget-object p0, Landroid/support/v4/a/k;->Z:Landroid/support/v4/g/h;

    invoke-virtual {p0, p1, v0}, Landroid/support/v4/g/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-class p0, Landroid/support/v4/a/k;

    invoke-virtual {p0, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method A()V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0}, Landroid/support/v4/a/q;->h()V

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0}, Landroid/support/v4/a/q;->d()Z

    :cond_0
    const/4 v0, 0x5

    iput v0, p0, Landroid/support/v4/a/k;->b:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    invoke-virtual {p0}, Landroid/support/v4/a/k;->i()V

    iget-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    if-nez v0, :cond_1

    new-instance v0, Landroid/support/v4/a/ab;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onResume()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/a/ab;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0}, Landroid/support/v4/a/q;->l()V

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0}, Landroid/support/v4/a/q;->d()Z

    :cond_2
    return-void
.end method

.method B()V
    .locals 1

    invoke-virtual {p0}, Landroid/support/v4/a/k;->onLowMemory()V

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0}, Landroid/support/v4/a/q;->r()V

    :cond_0
    return-void
.end method

.method C()V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0}, Landroid/support/v4/a/q;->m()V

    :cond_0
    const/4 v0, 0x4

    iput v0, p0, Landroid/support/v4/a/k;->b:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    invoke-virtual {p0}, Landroid/support/v4/a/k;->j()V

    iget-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    if-nez v0, :cond_1

    new-instance v0, Landroid/support/v4/a/ab;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onPause()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/a/ab;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method D()V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0}, Landroid/support/v4/a/q;->n()V

    :cond_0
    const/4 v0, 0x3

    iput v0, p0, Landroid/support/v4/a/k;->b:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    invoke-virtual {p0}, Landroid/support/v4/a/k;->k()V

    iget-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    if-nez v0, :cond_1

    new-instance v0, Landroid/support/v4/a/ab;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onStop()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/a/ab;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method E()V
    .locals 4

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0}, Landroid/support/v4/a/q;->o()V

    :cond_0
    const/4 v0, 0x2

    iput v0, p0, Landroid/support/v4/a/k;->b:I

    iget-boolean v0, p0, Landroid/support/v4/a/k;->N:Z

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/a/k;->N:Z

    iget-boolean v1, p0, Landroid/support/v4/a/k;->O:Z

    if-nez v1, :cond_1

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroid/support/v4/a/k;->O:Z

    iget-object v1, p0, Landroid/support/v4/a/k;->t:Landroid/support/v4/a/o;

    iget-object v2, p0, Landroid/support/v4/a/k;->h:Ljava/lang/String;

    iget-boolean v3, p0, Landroid/support/v4/a/k;->N:Z

    invoke-virtual {v1, v2, v3, v0}, Landroid/support/v4/a/o;->a(Ljava/lang/String;ZZ)Landroid/support/v4/a/w;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/a/k;->M:Landroid/support/v4/a/w;

    :cond_1
    iget-object v0, p0, Landroid/support/v4/a/k;->M:Landroid/support/v4/a/w;

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v4/a/k;->t:Landroid/support/v4/a/o;

    invoke-virtual {v0}, Landroid/support/v4/a/o;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v4/a/k;->M:Landroid/support/v4/a/w;

    invoke-virtual {v0}, Landroid/support/v4/a/w;->d()V

    return-void

    :cond_2
    iget-object v0, p0, Landroid/support/v4/a/k;->M:Landroid/support/v4/a/w;

    invoke-virtual {v0}, Landroid/support/v4/a/w;->c()V

    :cond_3
    return-void
.end method

.method F()V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0}, Landroid/support/v4/a/q;->p()V

    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Landroid/support/v4/a/k;->b:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    invoke-virtual {p0}, Landroid/support/v4/a/k;->l()V

    iget-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    if-nez v0, :cond_1

    new-instance v0, Landroid/support/v4/a/ab;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onDestroyView()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/a/ab;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Landroid/support/v4/a/k;->M:Landroid/support/v4/a/w;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v4/a/k;->M:Landroid/support/v4/a/w;

    invoke-virtual {v0}, Landroid/support/v4/a/w;->f()V

    :cond_2
    return-void
.end method

.method G()V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0}, Landroid/support/v4/a/q;->q()V

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v4/a/k;->b:I

    iput-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    invoke-virtual {p0}, Landroid/support/v4/a/k;->m()V

    iget-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    if-nez v0, :cond_1

    new-instance v0, Landroid/support/v4/a/ab;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onDestroy()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/a/ab;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method a(Ljava/lang/String;)Landroid/support/v4/a/k;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/a/k;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0, p1}, Landroid/support/v4/a/q;->b(Ljava/lang/String;)Landroid/support/v4/a/k;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public a(IZI)Landroid/view/animation/Animation;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public a(IILandroid/content/Intent;)V
    .locals 0

    return-void
.end method

.method final a(ILandroid/support/v4/a/k;)V
    .locals 0

    iput p1, p0, Landroid/support/v4/a/k;->g:I

    if-eqz p2, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p2, p2, Landroid/support/v4/a/k;->h:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ":"

    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Landroid/support/v4/a/k;->g:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroid/support/v4/a/k;->h:Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "android:fragment:"

    goto :goto_0

    return-void
.end method

.method public a(I[Ljava/lang/String;[I)V
    .locals 0

    return-void
.end method

.method public a(Landroid/app/Activity;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroid/support/v4/a/k;->F:Z

    return-void
.end method

.method public a(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroid/support/v4/a/k;->F:Z

    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 1

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroid/support/v4/a/k;->F:Z

    iget-object p1, p0, Landroid/support/v4/a/k;->t:Landroid/support/v4/a/o;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroid/support/v4/a/k;->t:Landroid/support/v4/a/o;

    invoke-virtual {p1}, Landroid/support/v4/a/o;->f()Landroid/app/Activity;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    invoke-virtual {p0, p1}, Landroid/support/v4/a/k;->a(Landroid/app/Activity;)V

    :cond_1
    return-void
.end method

.method public a(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .locals 1

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroid/support/v4/a/k;->F:Z

    iget-object p1, p0, Landroid/support/v4/a/k;->t:Landroid/support/v4/a/o;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroid/support/v4/a/k;->t:Landroid/support/v4/a/o;

    invoke-virtual {p1}, Landroid/support/v4/a/o;->f()Landroid/app/Activity;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    invoke-virtual {p0, p1, p2, p3}, Landroid/support/v4/a/k;->a(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    :cond_1
    return-void
.end method

.method a(Landroid/content/res/Configuration;)V
    .locals 1

    invoke-virtual {p0, p1}, Landroid/support/v4/a/k;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0, p1}, Landroid/support/v4/a/q;->a(Landroid/content/res/Configuration;)V

    :cond_0
    return-void
.end method

.method final a(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Landroid/support/v4/a/k;->f:Landroid/util/SparseArray;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/k;->J:Landroid/view/View;

    iget-object v1, p0, Landroid/support/v4/a/k;->f:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v4/a/k;->f:Landroid/util/SparseArray;

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    invoke-virtual {p0, p1}, Landroid/support/v4/a/k;->e(Landroid/os/Bundle;)V

    iget-boolean p1, p0, Landroid/support/v4/a/k;->F:Z

    if-nez p1, :cond_1

    new-instance p1, Landroid/support/v4/a/ab;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " did not call through to super.onViewStateRestored()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/support/v4/a/ab;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method

.method public a(Landroid/view/Menu;)V
    .locals 0

    return-void
.end method

.method public a(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 0

    return-void
.end method

.method public a(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mFragmentId=#"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/a/k;->w:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mContainerId=#"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/a/k;->x:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mTag="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/a/k;->y:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/a/k;->b:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, " mIndex="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/a/k;->g:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, " mWho="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/a/k;->h:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mBackStackNesting="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/a/k;->r:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAdded="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/a/k;->m:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mRemoving="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/a/k;->n:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mFromLayout="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/a/k;->o:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mInLayout="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/a/k;->p:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mHidden="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/a/k;->z:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mDetached="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/a/k;->A:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mMenuVisible="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/a/k;->E:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mHasMenu="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/a/k;->D:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mRetainInstance="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/a/k;->B:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mRetaining="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/a/k;->C:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mUserVisibleHint="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/a/k;->L:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    iget-object v0, p0, Landroid/support/v4/a/k;->s:Landroid/support/v4/a/q;

    if-eqz v0, :cond_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mFragmentManager="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/a/k;->s:Landroid/support/v4/a/q;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/k;->t:Landroid/support/v4/a/o;

    if-eqz v0, :cond_1

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mHost="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/a/k;->t:Landroid/support/v4/a/o;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_1
    iget-object v0, p0, Landroid/support/v4/a/k;->v:Landroid/support/v4/a/k;

    if-eqz v0, :cond_2

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mParentFragment="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/a/k;->v:Landroid/support/v4/a/k;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_2
    iget-object v0, p0, Landroid/support/v4/a/k;->i:Landroid/os/Bundle;

    if-eqz v0, :cond_3

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mArguments="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/a/k;->i:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_3
    iget-object v0, p0, Landroid/support/v4/a/k;->e:Landroid/os/Bundle;

    if-eqz v0, :cond_4

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedFragmentState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/a/k;->e:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_4
    iget-object v0, p0, Landroid/support/v4/a/k;->f:Landroid/util/SparseArray;

    if-eqz v0, :cond_5

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedViewState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/a/k;->f:Landroid/util/SparseArray;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_5
    iget-object v0, p0, Landroid/support/v4/a/k;->j:Landroid/support/v4/a/k;

    if-eqz v0, :cond_6

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mTarget="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/a/k;->j:Landroid/support/v4/a/k;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    const-string v0, " mTargetRequestCode="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/a/k;->l:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_6
    iget v0, p0, Landroid/support/v4/a/k;->G:I

    if-eqz v0, :cond_7

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mNextAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/a/k;->G:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_7
    iget-object v0, p0, Landroid/support/v4/a/k;->H:Landroid/view/ViewGroup;

    if-eqz v0, :cond_8

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mContainer="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/a/k;->H:Landroid/view/ViewGroup;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_8
    iget-object v0, p0, Landroid/support/v4/a/k;->I:Landroid/view/View;

    if-eqz v0, :cond_9

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mView="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/a/k;->I:Landroid/view/View;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_9
    iget-object v0, p0, Landroid/support/v4/a/k;->J:Landroid/view/View;

    if-eqz v0, :cond_a

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mInnerView="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/a/k;->I:Landroid/view/View;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_a
    iget-object v0, p0, Landroid/support/v4/a/k;->c:Landroid/view/View;

    if-eqz v0, :cond_b

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAnimatingAway="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/a/k;->c:Landroid/view/View;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mStateAfterAnimating="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/a/k;->d:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_b
    iget-object v0, p0, Landroid/support/v4/a/k;->M:Landroid/support/v4/a/w;

    if-eqz v0, :cond_c

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Loader Manager:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/a/k;->M:Landroid/support/v4/a/w;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2, p3, p4}, Landroid/support/v4/a/w;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    :cond_c
    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-eqz v0, :cond_d

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Child "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "  "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/support/v4/a/q;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    :cond_d
    return-void
.end method

.method public a(Z)V
    .locals 0

    return-void
.end method

.method final a()Z
    .locals 1

    iget v0, p0, Landroid/support/v4/a/k;->r:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public a(Landroid/view/MenuItem;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final b()Landroid/support/v4/a/l;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/a/k;->t:Landroid/support/v4/a/o;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/k;->t:Landroid/support/v4/a/o;

    invoke-virtual {v0}, Landroid/support/v4/a/o;->f()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/l;

    return-object v0
.end method

.method public b(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 1

    iget-object p1, p0, Landroid/support/v4/a/k;->t:Landroid/support/v4/a/o;

    invoke-virtual {p1}, Landroid/support/v4/a/o;->b()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-virtual {p0}, Landroid/support/v4/a/k;->d()Landroid/support/v4/a/p;

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0}, Landroid/support/v4/a/q;->s()Landroid/support/v4/h/m;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/support/v4/h/i;->a(Landroid/view/LayoutInflater;Landroid/support/v4/h/m;)V

    return-object p1
.end method

.method b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0}, Landroid/support/v4/a/q;->h()V

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroid/support/v4/a/k;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/view/Menu;)V
    .locals 0

    return-void
.end method

.method b(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 2

    iget-boolean v0, p0, Landroid/support/v4/a/k;->z:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroid/support/v4/a/k;->D:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v4/a/k;->E:Z

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {p0, p1, p2}, Landroid/support/v4/a/k;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/a/q;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result p1

    or-int/2addr v1, p1

    :cond_1
    return v1
.end method

.method public b(Landroid/view/MenuItem;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final c()Landroid/content/res/Resources;
    .locals 3

    iget-object v0, p0, Landroid/support/v4/a/k;->t:Landroid/support/v4/a/o;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not attached to Activity"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/k;->t:Landroid/support/v4/a/o;

    invoke-virtual {v0}, Landroid/support/v4/a/o;->g()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroid/support/v4/a/k;->F:Z

    return-void
.end method

.method c(Landroid/view/Menu;)Z
    .locals 2

    iget-boolean v0, p0, Landroid/support/v4/a/k;->z:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroid/support/v4/a/k;->D:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v4/a/k;->E:Z

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {p0, p1}, Landroid/support/v4/a/k;->a(Landroid/view/Menu;)V

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0, p1}, Landroid/support/v4/a/q;->a(Landroid/view/Menu;)Z

    move-result p1

    or-int/2addr v1, p1

    :cond_1
    return v1
.end method

.method c(Landroid/view/MenuItem;)Z
    .locals 2

    iget-boolean v0, p0, Landroid/support/v4/a/k;->z:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroid/support/v4/a/k;->D:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v4/a/k;->E:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroid/support/v4/a/k;->a(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0, p1}, Landroid/support/v4/a/q;->a(Landroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final d()Landroid/support/v4/a/p;
    .locals 2

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-nez v0, :cond_3

    invoke-virtual {p0}, Landroid/support/v4/a/k;->y()V

    iget v0, p0, Landroid/support/v4/a/k;->b:I

    const/4 v1, 0x5

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0}, Landroid/support/v4/a/q;->l()V

    goto :goto_0

    :cond_0
    iget v0, p0, Landroid/support/v4/a/k;->b:I

    const/4 v1, 0x4

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0}, Landroid/support/v4/a/q;->k()V

    goto :goto_0

    :cond_1
    iget v0, p0, Landroid/support/v4/a/k;->b:I

    const/4 v1, 0x2

    if-lt v0, v1, :cond_2

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0}, Landroid/support/v4/a/q;->j()V

    goto :goto_0

    :cond_2
    iget v0, p0, Landroid/support/v4/a/k;->b:I

    const/4 v1, 0x1

    if-lt v0, v1, :cond_3

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0}, Landroid/support/v4/a/q;->i()V

    :cond_3
    :goto_0
    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    return-object v0
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroid/support/v4/a/k;->F:Z

    return-void
.end method

.method d(Landroid/view/Menu;)V
    .locals 1

    iget-boolean v0, p0, Landroid/support/v4/a/k;->z:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroid/support/v4/a/k;->D:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v4/a/k;->E:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroid/support/v4/a/k;->b(Landroid/view/Menu;)V

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0, p1}, Landroid/support/v4/a/q;->b(Landroid/view/Menu;)V

    :cond_1
    return-void
.end method

.method d(Landroid/view/MenuItem;)Z
    .locals 2

    iget-boolean v0, p0, Landroid/support/v4/a/k;->z:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/support/v4/a/k;->b(Landroid/view/MenuItem;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0, p1}, Landroid/support/v4/a/q;->b(Landroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroid/support/v4/a/k;->F:Z

    return-void
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v4/a/k;->t:Landroid/support/v4/a/o;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v4/a/k;->m:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Landroid/support/v4/a/k;->z:Z

    return v0
.end method

.method public g()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/a/k;->I:Landroid/view/View;

    return-object v0
.end method

.method g(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0}, Landroid/support/v4/a/q;->h()V

    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Landroid/support/v4/a/k;->b:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    invoke-virtual {p0, p1}, Landroid/support/v4/a/k;->c(Landroid/os/Bundle;)V

    iget-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    if-nez v0, :cond_1

    new-instance p1, Landroid/support/v4/a/ab;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " did not call through to super.onCreate()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/support/v4/a/ab;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    if-eqz p1, :cond_3

    const-string v0, "android:support:fragments"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/support/v4/a/k;->y()V

    :cond_2
    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/support/v4/a/q;->a(Landroid/os/Parcelable;Ljava/util/List;)V

    iget-object p1, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {p1}, Landroid/support/v4/a/q;->i()V

    :cond_3
    return-void
.end method

.method public h()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    iget-boolean v1, p0, Landroid/support/v4/a/k;->N:Z

    if-nez v1, :cond_1

    iput-boolean v0, p0, Landroid/support/v4/a/k;->N:Z

    iget-boolean v1, p0, Landroid/support/v4/a/k;->O:Z

    if-nez v1, :cond_0

    iput-boolean v0, p0, Landroid/support/v4/a/k;->O:Z

    iget-object v0, p0, Landroid/support/v4/a/k;->t:Landroid/support/v4/a/o;

    iget-object v1, p0, Landroid/support/v4/a/k;->h:Ljava/lang/String;

    iget-boolean v2, p0, Landroid/support/v4/a/k;->N:Z

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/a/o;->a(Ljava/lang/String;ZZ)Landroid/support/v4/a/w;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/a/k;->M:Landroid/support/v4/a/w;

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/k;->M:Landroid/support/v4/a/w;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/k;->M:Landroid/support/v4/a/w;

    invoke-virtual {v0}, Landroid/support/v4/a/w;->b()V

    :cond_1
    return-void
.end method

.method h(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0}, Landroid/support/v4/a/q;->h()V

    :cond_0
    const/4 v0, 0x2

    iput v0, p0, Landroid/support/v4/a/k;->b:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    invoke-virtual {p0, p1}, Landroid/support/v4/a/k;->d(Landroid/os/Bundle;)V

    iget-boolean p1, p0, Landroid/support/v4/a/k;->F:Z

    if-nez p1, :cond_1

    new-instance p1, Landroid/support/v4/a/ab;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " did not call through to super.onActivityCreated()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/support/v4/a/ab;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object p1, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-eqz p1, :cond_2

    iget-object p1, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {p1}, Landroid/support/v4/a/q;->j()V

    :cond_2
    return-void
.end method

.method public final hashCode()I
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    return-void
.end method

.method i(Landroid/os/Bundle;)V
    .locals 2

    invoke-virtual {p0, p1}, Landroid/support/v4/a/k;->f(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0}, Landroid/support/v4/a/q;->g()Landroid/os/Parcelable;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "android:support:fragments"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    return-void
.end method

.method public j()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    return-void
.end method

.method public k()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    return-void
.end method

.method public l()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    return-void
.end method

.method public m()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    iget-boolean v1, p0, Landroid/support/v4/a/k;->O:Z

    if-nez v1, :cond_0

    iput-boolean v0, p0, Landroid/support/v4/a/k;->O:Z

    iget-object v0, p0, Landroid/support/v4/a/k;->t:Landroid/support/v4/a/o;

    iget-object v1, p0, Landroid/support/v4/a/k;->h:Ljava/lang/String;

    iget-boolean v2, p0, Landroid/support/v4/a/k;->N:Z

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/a/o;->a(Ljava/lang/String;ZZ)Landroid/support/v4/a/w;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/a/k;->M:Landroid/support/v4/a/w;

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/k;->M:Landroid/support/v4/a/w;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/k;->M:Landroid/support/v4/a/w;

    invoke-virtual {v0}, Landroid/support/v4/a/w;->h()V

    :cond_1
    return-void
.end method

.method n()V
    .locals 2

    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v4/a/k;->g:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v4/a/k;->h:Ljava/lang/String;

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroid/support/v4/a/k;->m:Z

    iput-boolean v1, p0, Landroid/support/v4/a/k;->n:Z

    iput-boolean v1, p0, Landroid/support/v4/a/k;->o:Z

    iput-boolean v1, p0, Landroid/support/v4/a/k;->p:Z

    iput-boolean v1, p0, Landroid/support/v4/a/k;->q:Z

    iput v1, p0, Landroid/support/v4/a/k;->r:I

    iput-object v0, p0, Landroid/support/v4/a/k;->s:Landroid/support/v4/a/q;

    iput-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    iput-object v0, p0, Landroid/support/v4/a/k;->t:Landroid/support/v4/a/o;

    iput v1, p0, Landroid/support/v4/a/k;->w:I

    iput v1, p0, Landroid/support/v4/a/k;->x:I

    iput-object v0, p0, Landroid/support/v4/a/k;->y:Ljava/lang/String;

    iput-boolean v1, p0, Landroid/support/v4/a/k;->z:Z

    iput-boolean v1, p0, Landroid/support/v4/a/k;->A:Z

    iput-boolean v1, p0, Landroid/support/v4/a/k;->C:Z

    iput-object v0, p0, Landroid/support/v4/a/k;->M:Landroid/support/v4/a/w;

    iput-boolean v1, p0, Landroid/support/v4/a/k;->N:Z

    iput-boolean v1, p0, Landroid/support/v4/a/k;->O:Z

    return-void
.end method

.method public o()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroid/support/v4/a/k;->F:Z

    return-void
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    invoke-virtual {p0}, Landroid/support/v4/a/k;->b()Landroid/support/v4/a/l;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/a/l;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    return-void
.end method

.method public onLowMemory()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    return-void
.end method

.method public p()V
    .locals 0

    return-void
.end method

.method public q()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/a/k;->P:Ljava/lang/Object;

    return-object v0
.end method

.method public r()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroid/support/v4/a/k;->Q:Ljava/lang/Object;

    sget-object v1, Landroid/support/v4/a/k;->a:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/support/v4/a/k;->q()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/k;->Q:Ljava/lang/Object;

    return-object v0
.end method

.method public s()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/a/k;->R:Ljava/lang/Object;

    return-object v0
.end method

.method public t()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroid/support/v4/a/k;->S:Ljava/lang/Object;

    sget-object v1, Landroid/support/v4/a/k;->a:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/support/v4/a/k;->s()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/k;->S:Ljava/lang/Object;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-static {p0, v0}, Landroid/support/v4/g/c;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    iget v1, p0, Landroid/support/v4/a/k;->g:I

    if-ltz v1, :cond_0

    const-string v1, " #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroid/support/v4/a/k;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_0
    iget v1, p0, Landroid/support/v4/a/k;->w:I

    if-eqz v1, :cond_1

    const-string v1, " id=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroid/support/v4/a/k;->w:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    iget-object v1, p0, Landroid/support/v4/a/k;->y:Ljava/lang/String;

    if-eqz v1, :cond_2

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/v4/a/k;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/a/k;->T:Ljava/lang/Object;

    return-object v0
.end method

.method public v()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroid/support/v4/a/k;->U:Ljava/lang/Object;

    sget-object v1, Landroid/support/v4/a/k;->a:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/support/v4/a/k;->u()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/k;->U:Ljava/lang/Object;

    return-object v0
.end method

.method public w()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v4/a/k;->W:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/k;->W:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public x()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v4/a/k;->V:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/k;->V:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method y()V
    .locals 3

    new-instance v0, Landroid/support/v4/a/q;

    invoke-direct {v0}, Landroid/support/v4/a/q;-><init>()V

    iput-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    iget-object v1, p0, Landroid/support/v4/a/k;->t:Landroid/support/v4/a/o;

    new-instance v2, Landroid/support/v4/a/k$1;

    invoke-direct {v2, p0}, Landroid/support/v4/a/k$1;-><init>(Landroid/support/v4/a/k;)V

    invoke-virtual {v0, v1, v2, p0}, Landroid/support/v4/a/q;->a(Landroid/support/v4/a/o;Landroid/support/v4/a/m;Landroid/support/v4/a/k;)V

    return-void
.end method

.method z()V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0}, Landroid/support/v4/a/q;->h()V

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0}, Landroid/support/v4/a/q;->d()Z

    :cond_0
    const/4 v0, 0x4

    iput v0, p0, Landroid/support/v4/a/k;->b:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    invoke-virtual {p0}, Landroid/support/v4/a/k;->h()V

    iget-boolean v0, p0, Landroid/support/v4/a/k;->F:Z

    if-nez v0, :cond_1

    new-instance v0, Landroid/support/v4/a/ab;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onStart()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/a/ab;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v4/a/k;->u:Landroid/support/v4/a/q;

    invoke-virtual {v0}, Landroid/support/v4/a/q;->k()V

    :cond_2
    iget-object v0, p0, Landroid/support/v4/a/k;->M:Landroid/support/v4/a/w;

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v4/a/k;->M:Landroid/support/v4/a/w;

    invoke-virtual {v0}, Landroid/support/v4/a/w;->g()V

    :cond_3
    return-void
.end method
