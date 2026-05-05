package com.incode.welcome_sdk.views.b;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ c[] f18182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f18183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f18184e;

    private c(String str, int i2) {
    }

    static {
        c cVar = new c("Primary", 0);
        f18184e = cVar;
        c cVar2 = new c("Secondary", 1);
        f18183d = cVar2;
        c[] cVarArr = {cVar, cVar2};
        f18182c = cVarArr;
        EnumEntriesKt.enumEntries(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f18182c.clone();
    }
}
