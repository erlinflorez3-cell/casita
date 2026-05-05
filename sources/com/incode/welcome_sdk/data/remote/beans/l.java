package com.incode.welcome_sdk.data.remote.beans;

import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f9708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f9709f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f9711h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ l[] f9712i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f9713j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f9714l = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9715d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static l f9707c = new l("USER_INPUT", 0, "userInput");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static l f9705a = new l("DOCUMENT", 1, "document");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static l f9710g = new l("POA", 2, "poa");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f9706b = new l("NO_SOURCE", 3, "");

    private l(String str, int i2, String str2) {
        this.f9715d = str2;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f9711h + 55;
        int i4 = i3 % 128;
        f9709f = i4;
        int i5 = i3 % 2;
        String str = this.f9715d;
        int i6 = i4 + 55;
        f9711h = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    static {
        l[] lVarArrA = a();
        f9712i = lVarArrA;
        EnumEntriesKt.enumEntries(lVarArrA);
        f9708e = new b((byte) 0);
        int i2 = f9714l + 69;
        f9713j = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 32 / 0;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f9716c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f9717e = 1;

        private b() {
        }

        @JvmStatic
        public static l c(String str) {
            l lVar;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            l[] lVarArrValues = l.values();
            int length = lVarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    lVar = null;
                    break;
                }
                lVar = lVarArrValues[i3];
                if (Intrinsics.areEqual(lVar.d(), str)) {
                    int i4 = f9717e + 87;
                    f9716c = i4 % 128;
                    int i5 = i4 % 2;
                    break;
                }
                i3++;
            }
            if (lVar != null) {
                return lVar;
            }
            int i6 = f9716c + 103;
            f9717e = i6 % 128;
            int i7 = i6 % 2;
            return l.f9706b;
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    private static final /* synthetic */ l[] a() {
        int i2 = 2 % 2;
        int i3 = f9709f;
        int i4 = i3 + 81;
        f9711h = i4 % 128;
        int i5 = i4 % 2;
        l[] lVarArr = {f9707c, f9705a, f9710g, f9706b};
        int i6 = i3 + 53;
        f9711h = i6 % 128;
        int i7 = i6 % 2;
        return lVarArr;
    }

    public static l valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f9709f + 87;
        f9711h = i3 % 128;
        int i4 = i3 % 2;
        l lVar = (l) Enum.valueOf(l.class, str);
        int i5 = f9709f + 109;
        f9711h = i5 % 128;
        if (i5 % 2 != 0) {
            return lVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static l[] values() {
        int i2 = 2 % 2;
        int i3 = f9711h + 101;
        f9709f = i3 % 128;
        int i4 = i3 % 2;
        l[] lVarArr = f9712i;
        if (i4 == 0) {
            return (l[]) lVarArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
