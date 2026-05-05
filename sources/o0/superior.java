package o0;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes6.dex */
public final class superior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final superior f27443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final superior f27444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final superior f27445c;

    static {
        superior superiorVar = new superior("ON_CALL", 0);
        f27443a = superiorVar;
        superior superiorVar2 = new superior("NOT_ON_CALL", 1);
        f27444b = superiorVar2;
        superior superiorVar3 = new superior("UNKNOWN", 2);
        f27445c = superiorVar3;
        EnumEntriesKt.enumEntries(new superior[]{superiorVar, superiorVar2, superiorVar3});
    }

    public superior(String str, int i2) {
    }
}
