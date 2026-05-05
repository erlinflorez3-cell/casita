package o0;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes6.dex */
public final class tongue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tongue f27446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final tongue f27447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tongue f27448c;

    static {
        tongue tongueVar = new tongue("UNKNOWN", 0);
        f27446a = tongueVar;
        tongue tongueVar2 = new tongue("VOIP", 1);
        f27447b = tongueVar2;
        tongue tongueVar3 = new tongue("TELEPHONY", 2);
        f27448c = tongueVar3;
        EnumEntriesKt.enumEntries(new tongue[]{tongueVar, tongueVar2, tongueVar3});
    }

    public tongue(String str, int i2) {
    }
}
