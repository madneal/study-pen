.class final Lcom/a/a/b/h$q;
.super Lcom/a/a/b/h$o;

# interfaces
.implements Lcom/a/a/b/h$k;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/b/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "q"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/a/a/b/h$o<",
        "TK;TV;>;",
        "Lcom/a/a/b/h$k<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field volatile e:J

.field f:Lcom/a/a/b/h$k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/a/a/b/h$k<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field g:Lcom/a/a/b/h$k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/a/a/b/h$k<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;ILcom/a/a/b/h$k;)V
    .locals 0
    .param p3    # Lcom/a/a/b/h$k;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I",
            "Lcom/a/a/b/h$k<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lcom/a/a/b/h$o;-><init>(Ljava/lang/Object;ILcom/a/a/b/h$k;)V

    const-wide p1, 0x7fffffffffffffffL

    iput-wide p1, p0, Lcom/a/a/b/h$q;->e:J

    invoke-static {}, Lcom/a/a/b/h;->h()Lcom/a/a/b/h$k;

    move-result-object p1

    iput-object p1, p0, Lcom/a/a/b/h$q;->f:Lcom/a/a/b/h$k;

    invoke-static {}, Lcom/a/a/b/h;->h()Lcom/a/a/b/h$k;

    move-result-object p1

    iput-object p1, p0, Lcom/a/a/b/h$q;->g:Lcom/a/a/b/h$k;

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 0

    iput-wide p1, p0, Lcom/a/a/b/h$q;->e:J

    return-void
.end method

.method public a(Lcom/a/a/b/h$k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/b/h$k<",
            "TK;TV;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/a/a/b/h$q;->f:Lcom/a/a/b/h$k;

    return-void
.end method

.method public b(Lcom/a/a/b/h$k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/b/h$k<",
            "TK;TV;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/a/a/b/h$q;->g:Lcom/a/a/b/h$k;

    return-void
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lcom/a/a/b/h$q;->e:J

    return-wide v0
.end method

.method public f()Lcom/a/a/b/h$k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/a/a/b/h$k<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/a/a/b/h$q;->f:Lcom/a/a/b/h$k;

    return-object v0
.end method

.method public g()Lcom/a/a/b/h$k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/a/a/b/h$k<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/a/a/b/h$q;->g:Lcom/a/a/b/h$k;

    return-object v0
.end method
