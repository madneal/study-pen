.class final Landroid/support/v4/h/ax$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v4/h/ax;->a(Landroid/view/View;Landroid/support/v4/h/ba;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v4/h/ba;

.field final synthetic b:Landroid/view/View;


# direct methods
.method constructor <init>(Landroid/support/v4/h/ba;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v4/h/ax$1;->a:Landroid/support/v4/h/ba;

    iput-object p2, p0, Landroid/support/v4/h/ax$1;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object p1, p0, Landroid/support/v4/h/ax$1;->a:Landroid/support/v4/h/ba;

    iget-object v0, p0, Landroid/support/v4/h/ax$1;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Landroid/support/v4/h/ba;->a(Landroid/view/View;)V

    return-void
.end method
