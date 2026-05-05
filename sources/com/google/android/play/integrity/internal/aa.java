package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
final class aa extends t {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ IBinder f3458a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ad f3459b;

    aa(ad adVar, IBinder iBinder) {
        this.f3459b = adVar;
        this.f3458a = iBinder;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        this.f3459b.f3461a.f3476o = (IInterface) this.f3459b.f3461a.f3471j.a(this.f3458a);
        ae.r(this.f3459b.f3461a);
        this.f3459b.f3461a.f3469h = false;
        Iterator it = this.f3459b.f3461a.f3466e.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f3459b.f3461a.f3466e.clear();
    }
}
