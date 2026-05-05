package e0;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
public final class tongue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tongue f18480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final tongue f18481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tongue f18482c;

    static {
        tongue tongueVar = new tongue("SYSTEM", 0);
        f18480a = tongueVar;
        tongue tongueVar2 = new tongue("USER", 1);
        f18481b = tongueVar2;
        tongue tongueVar3 = new tongue("NONE", 2);
        f18482c = tongueVar3;
        EnumEntriesKt.enumEntries(new tongue[]{tongueVar, tongueVar2, tongueVar3});
    }

    public tongue(String str, int i2) {
    }
}
