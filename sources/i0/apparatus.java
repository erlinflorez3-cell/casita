package i0;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class apparatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final apparatus f19688a;

    static {
        apparatus apparatusVar = new apparatus("NONE", 0);
        apparatus apparatusVar2 = new apparatus("SHA_256", 1);
        f19688a = apparatusVar2;
        EnumEntriesKt.enumEntries(new apparatus[]{apparatusVar, apparatusVar2});
    }

    public apparatus(String str, int i2) {
    }
}
