package yg;

import android.content.res.Resources;

/* JADX INFO: renamed from: yg.oY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1564oY implements Runnable {
    public final /* synthetic */ Resources.NotFoundException Xd;

    public /* synthetic */ RunnableC1564oY(Resources.NotFoundException notFoundException) {
        this.Xd = notFoundException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1597vN.Xd(this.Xd);
    }
}
