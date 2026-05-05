package bo.app;

/* JADX INFO: loaded from: classes4.dex */
public final class j50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i50 f979d;

    public /* synthetic */ j50() {
        this(null, null, null, null);
    }

    public j50(String str, Boolean bool, Boolean bool2, i50 i50Var) {
        this.f976a = str;
        this.f977b = bool;
        this.f978c = bool2;
        this.f979d = i50Var;
    }

    public final j50 a(String str) {
        this.f976a = str;
        return this;
    }

    public final k50 a() {
        return new k50(this.f976a, this.f977b, this.f978c, this.f979d);
    }
}
