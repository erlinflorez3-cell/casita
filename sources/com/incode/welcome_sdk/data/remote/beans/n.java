package com.incode.welcome_sdk.data.remote.beans;

import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f9729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f9730f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f9731g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f9732h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f9733i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ n[] f9734j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static n f9728d = new n("STRING", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static n f9726b = new n("BOOLEAN", 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static n f9725a = new n("NUMBER", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f9727c = new n("NONE", 3);

    private n(String str, int i2) {
    }

    static {
        n[] nVarArrD = d();
        f9734j = nVarArrD;
        EnumEntriesKt.enumEntries(nVarArrD);
        f9729e = new d((byte) 0);
        int i2 = f9733i + 45;
        f9732h = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f9735b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f9736c = 1;

        private d() {
        }

        @JvmStatic
        public static n d(String str) {
            n nVar;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            n[] nVarArrValues = n.values();
            int length = nVarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    nVar = null;
                    break;
                }
                int i4 = f9736c + 11;
                f9735b = i4 % 128;
                int i5 = i4 % 2;
                nVar = nVarArrValues[i3];
                if (StringsKt.equals(nVar.name(), str, true)) {
                    int i6 = f9736c + 33;
                    f9735b = i6 % 128;
                    int i7 = i6 % 2;
                    break;
                }
                i3++;
            }
            return nVar == null ? n.f9727c : nVar;
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    private static final /* synthetic */ n[] d() {
        int i2 = 2 % 2;
        int i3 = f9730f;
        int i4 = i3 + 65;
        f9731g = i4 % 128;
        int i5 = i4 % 2;
        n[] nVarArr = {f9728d, f9726b, f9725a, f9727c};
        int i6 = i3 + 83;
        f9731g = i6 % 128;
        int i7 = i6 % 2;
        return nVarArr;
    }

    public static n valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f9730f + 39;
        f9731g = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        n nVar = (n) Enum.valueOf(n.class, str);
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = f9730f + 51;
        f9731g = i5 % 128;
        if (i5 % 2 != 0) {
            return nVar;
        }
        throw null;
    }

    public static n[] values() {
        int i2 = 2 % 2;
        int i3 = f9730f + 95;
        f9731g = i3 % 128;
        int i4 = i3 % 2;
        n[] nVarArr = f9734j;
        if (i4 != 0) {
            return (n[]) nVarArr.clone();
        }
        n[] nVarArr2 = (n[]) nVarArr.clone();
        int i5 = 74 / 0;
        return nVarArr2;
    }
}
