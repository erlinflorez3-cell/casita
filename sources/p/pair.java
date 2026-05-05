package p;

import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes2.dex */
public final class pair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final civilian f28229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tongue f28230b;

    public pair(c.civilian civilianVar, e1.pair pairVar) {
        civilian civilianVar2 = civilianVar.f2448b.f2800l.f2812l ? new civilian(Dispatchers.getMain()) : null;
        this.f28229a = civilianVar2;
        this.f28230b = civilianVar.f2448b.f2800l.f2812l ? new tongue(new misplace(civilianVar.f2449c, Dispatchers.getMain()), civilianVar2) : null;
    }
}
