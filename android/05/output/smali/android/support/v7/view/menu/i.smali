.class public Landroid/support/v7/view/menu/i;
.super Landroid/support/v7/view/menu/c;

# interfaces
.implements Landroid/view/MenuItem;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/view/menu/i$b;,
        Landroid/support/v7/view/menu/i$a;,
        Landroid/support/v7/view/menu/i$c;,
        Landroid/support/v7/view/menu/i$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/view/menu/c<",
        "Landroid/support/v4/d/a/b;",
        ">;",
        "Landroid/view/MenuItem;"
    }
.end annotation


# instance fields
.field private c:Ljava/lang/reflect/Method;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/support/v4/d/a/b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/support/v7/view/menu/c;-><init>(Landroid/content/Context;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method a(Landroid/view/ActionProvider;)Landroid/support/v7/view/menu/i$a;
    .locals 2

    new-instance v0, Landroid/support/v7/view/menu/i$a;

    iget-object v1, p0, Landroid/support/v7/view/menu/i;->a:Landroid/content/Context;

    invoke-direct {v0, p0, v1, p1}, Landroid/support/v7/view/menu/i$a;-><init>(Landroid/support/v7/view/menu/i;Landroid/content/Context;Landroid/view/ActionProvider;)V

    return-object v0
.end method

.method public a(Z)V
    .locals 6

    :try_start_0
    iget-object v0, p0, Landroid/support/v7/view/menu/i;->c:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v3, "setExclusiveCheckable"

    new-array v4, v2, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v5, v4, v1

    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/view/menu/i;->c:Ljava/lang/reflect/Method;

    :cond_0
    iget-object v0, p0, Landroid/support/v7/view/menu/i;->c:Ljava/lang/reflect/Method;

    iget-object v3, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    aput-object p1, v2, v1

    invoke-virtual {v0, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "MenuItemWrapper"

    const-string v1, "Error while calling setExclusiveCheckable"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public collapseActionView()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0}, Landroid/support/v4/d/a/b;->collapseActionView()Z

    move-result v0

    return v0
.end method

.method public expandActionView()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0}, Landroid/support/v4/d/a/b;->expandActionView()Z

    move-result v0

    return v0
.end method

.method public getActionProvider()Landroid/view/ActionProvider;
    .locals 2

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0}, Landroid/support/v4/d/a/b;->a()Landroid/support/v4/h/d;

    move-result-object v0

    instance-of v1, v0, Landroid/support/v7/view/menu/i$a;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/support/v7/view/menu/i$a;

    iget-object v0, v0, Landroid/support/v7/view/menu/i$a;->a:Landroid/view/ActionProvider;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getActionView()Landroid/view/View;
    .locals 2

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0}, Landroid/support/v4/d/a/b;->getActionView()Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, Landroid/support/v7/view/menu/i$b;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/support/v7/view/menu/i$b;

    invoke-virtual {v0}, Landroid/support/v7/view/menu/i$b;->c()Landroid/view/View;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getAlphabeticShortcut()C
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0}, Landroid/support/v4/d/a/b;->getAlphabeticShortcut()C

    move-result v0

    return v0
.end method

.method public getGroupId()I
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0}, Landroid/support/v4/d/a/b;->getGroupId()I

    move-result v0

    return v0
.end method

.method public getIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0}, Landroid/support/v4/d/a/b;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getIntent()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0}, Landroid/support/v4/d/a/b;->getIntent()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public getItemId()I
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0}, Landroid/support/v4/d/a/b;->getItemId()I

    move-result v0

    return v0
.end method

.method public getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0}, Landroid/support/v4/d/a/b;->getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;

    move-result-object v0

    return-object v0
.end method

.method public getNumericShortcut()C
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0}, Landroid/support/v4/d/a/b;->getNumericShortcut()C

    move-result v0

    return v0
.end method

.method public getOrder()I
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0}, Landroid/support/v4/d/a/b;->getOrder()I

    move-result v0

    return v0
.end method

.method public getSubMenu()Landroid/view/SubMenu;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0}, Landroid/support/v4/d/a/b;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/view/menu/i;->a(Landroid/view/SubMenu;)Landroid/view/SubMenu;

    move-result-object v0

    return-object v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0}, Landroid/support/v4/d/a/b;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTitleCondensed()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0}, Landroid/support/v4/d/a/b;->getTitleCondensed()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public hasSubMenu()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0}, Landroid/support/v4/d/a/b;->hasSubMenu()Z

    move-result v0

    return v0
.end method

.method public isActionViewExpanded()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0}, Landroid/support/v4/d/a/b;->isActionViewExpanded()Z

    move-result v0

    return v0
.end method

.method public isCheckable()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0}, Landroid/support/v4/d/a/b;->isCheckable()Z

    move-result v0

    return v0
.end method

.method public isChecked()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0}, Landroid/support/v4/d/a/b;->isChecked()Z

    move-result v0

    return v0
.end method

.method public isEnabled()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0}, Landroid/support/v4/d/a/b;->isEnabled()Z

    move-result v0

    return v0
.end method

.method public isVisible()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0}, Landroid/support/v4/d/a/b;->isVisible()Z

    move-result v0

    return v0
.end method

.method public setActionProvider(Landroid/view/ActionProvider;)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Landroid/support/v7/view/menu/i;->a(Landroid/view/ActionProvider;)Landroid/support/v7/view/menu/i$a;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-interface {v0, p1}, Landroid/support/v4/d/a/b;->a(Landroid/support/v4/h/d;)Landroid/support/v4/d/a/b;

    return-object p0
.end method

.method public setActionView(I)Landroid/view/MenuItem;
    .locals 2

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/d/a/b;->setActionView(I)Landroid/view/MenuItem;

    iget-object p1, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast p1, Landroid/support/v4/d/a/b;

    invoke-interface {p1}, Landroid/support/v4/d/a/b;->getActionView()Landroid/view/View;

    move-result-object p1

    instance-of v0, p1, Landroid/view/CollapsibleActionView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    new-instance v1, Landroid/support/v7/view/menu/i$b;

    invoke-direct {v1, p1}, Landroid/support/v7/view/menu/i$b;-><init>(Landroid/view/View;)V

    invoke-interface {v0, v1}, Landroid/support/v4/d/a/b;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    :cond_0
    return-object p0
.end method

.method public setActionView(Landroid/view/View;)Landroid/view/MenuItem;
    .locals 1

    instance-of v0, p1, Landroid/view/CollapsibleActionView;

    if-eqz v0, :cond_0

    new-instance v0, Landroid/support/v7/view/menu/i$b;

    invoke-direct {v0, p1}, Landroid/support/v7/view/menu/i$b;-><init>(Landroid/view/View;)V

    move-object p1, v0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/d/a/b;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setAlphabeticShortcut(C)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/d/a/b;->setAlphabeticShortcut(C)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setCheckable(Z)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/d/a/b;->setCheckable(Z)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setChecked(Z)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/d/a/b;->setChecked(Z)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setEnabled(Z)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/d/a/b;->setEnabled(Z)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setIcon(I)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/d/a/b;->setIcon(I)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/d/a/b;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/d/a/b;->setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setNumericShortcut(C)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/d/a/b;->setNumericShortcut(C)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;
    .locals 2

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    if-eqz p1, :cond_0

    new-instance v1, Landroid/support/v7/view/menu/i$c;

    invoke-direct {v1, p0, p1}, Landroid/support/v7/view/menu/i$c;-><init>(Landroid/support/v7/view/menu/i;Landroid/view/MenuItem$OnActionExpandListener;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Landroid/support/v4/d/a/b;->a(Landroid/support/v4/h/p$e;)Landroid/support/v4/d/a/b;

    return-object p0
.end method

.method public setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;
    .locals 2

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    if-eqz p1, :cond_0

    new-instance v1, Landroid/support/v7/view/menu/i$d;

    invoke-direct {v1, p0, p1}, Landroid/support/v7/view/menu/i$d;-><init>(Landroid/support/v7/view/menu/i;Landroid/view/MenuItem$OnMenuItemClickListener;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Landroid/support/v4/d/a/b;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setShortcut(CC)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0, p1, p2}, Landroid/support/v4/d/a/b;->setShortcut(CC)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setShowAsAction(I)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/d/a/b;->setShowAsAction(I)V

    return-void
.end method

.method public setShowAsActionFlags(I)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/d/a/b;->setShowAsActionFlags(I)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setTitle(I)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/d/a/b;->setTitle(I)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/d/a/b;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/d/a/b;->setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setVisible(Z)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/d/a/b;

    invoke-interface {v0, p1}, Landroid/support/v4/d/a/b;->setVisible(Z)Landroid/view/MenuItem;

    move-result-object p1

    return-object p1
.end method
