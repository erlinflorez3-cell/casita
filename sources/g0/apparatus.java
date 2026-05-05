package g0;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class apparatus {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final apparatus f19656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final apparatus f19657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final apparatus f19658d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19659a;

    static {
        apparatus apparatusVar = new apparatus("CONTAINS", 0, "CONTAINS");
        f19656b = apparatusVar;
        apparatus apparatusVar2 = new apparatus("EQUALS", 1, "EQUALS");
        f19657c = apparatusVar2;
        apparatus apparatusVar3 = new apparatus("STARTS", 2, "STARTS");
        f19658d = apparatusVar3;
        EnumEntriesKt.enumEntries(new apparatus[]{apparatusVar, apparatusVar2, apparatusVar3});
    }

    public apparatus(String str, int i2, String str2) {
        this.f19659a = str2;
    }
}
