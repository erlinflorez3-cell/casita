package s;

/* JADX INFO: loaded from: classes2.dex */
public final class apparatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final slide f28277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gregarious f28278b;

    public apparatus(c.civilian civilianVar) {
        gregarious gregariousVar = null;
        slide slideVar = (civilianVar.f2448b.f2797i && h1.pair.a(civilianVar.f2449c, "android.permission.READ_PHONE_STATE")) ? new slide(civilianVar.f2449c) : null;
        this.f28277a = slideVar;
        if (slideVar != null) {
            gregariousVar = new gregarious(new pair(), slideVar, civilianVar.f2448b.f2798j ? superior.f28286a : tongue.f28288a);
        }
        this.f28278b = gregariousVar;
    }
}
