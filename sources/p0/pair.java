package p0;

import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class pair extends Enum {

    /* JADX INFO: renamed from: a */
    public static final pair f28238a;

    /* JADX INFO: renamed from: b */
    public static final pair f28239b;

    /* JADX INFO: renamed from: c */
    public static final pair f28240c;

    /* JADX INFO: renamed from: d */
    public static final pair f28241d;

    static {
        pair pairVar = new pair("UNKNOWN", 0);
        f28238a = pairVar;
        pair pairVar2 = new pair("NOT_SECURE", 1);
        f28239b = pairVar2;
        pair pairVar3 = new pair("PASSCODE", 2);
        f28240c = pairVar3;
        pair pairVar4 = new pair("BIOMETRIC", 3);
        f28241d = pairVar4;
        EnumEntriesKt.enumEntries(new pair[]{pairVar, pairVar2, pairVar3, pairVar4});
    }

    public pair(String str, int i2) {
        super(str, i2);
    }
}
