package com.incode.welcome_sdk.modules;

import java.util.Locale;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends Enum<h> {

    /* JADX INFO: renamed from: a */
    public static final e f10702a;

    /* JADX INFO: renamed from: c */
    private static int f10704c = 0;

    /* JADX INFO: renamed from: e */
    private static final /* synthetic */ h[] f10706e;

    /* JADX INFO: renamed from: f */
    private static int f10707f = 0;

    /* JADX INFO: renamed from: i */
    private static int f10708i = 1;

    /* JADX INFO: renamed from: j */
    private static int f10709j = 1;

    /* JADX INFO: renamed from: d */
    public static final h f10705d = new h("MODULE", 0);

    /* JADX INFO: renamed from: b */
    public static final h f10703b = new h("FINISH", 1);

    private h(String str, int i2) {
        super(str, i2);
    }

    static {
        h[] hVarArrC = c();
        f10706e = hVarArrC;
        EnumEntriesKt.enumEntries(hVarArrC);
        f10702a = new e((byte) 0);
        int i2 = f10707f + 71;
        f10709j = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class e {

        /* JADX INFO: renamed from: c */
        private static int f10710c = 1;

        /* JADX INFO: renamed from: d */
        private static int f10711d = 0;

        private e() {
        }

        @JvmStatic
        public static h b(String str) {
            int i2 = 2 % 2;
            int i3 = f10710c + 17;
            f10711d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            h hVarValueOf = h.valueOf(upperCase);
            int i5 = f10710c + 11;
            f10711d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 51 / 0;
            }
            return hVarValueOf;
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    private static final /* synthetic */ h[] c() {
        h[] hVarArr;
        int i2 = 2 % 2;
        int i3 = f10704c;
        int i4 = i3 + 121;
        f10708i = i4 % 128;
        if (i4 % 2 == 0) {
            hVarArr = new h[4];
            hVarArr[0] = f10705d;
            hVarArr[1] = f10703b;
        } else {
            hVarArr = new h[]{f10705d, f10703b};
        }
        int i5 = i3 + 99;
        f10708i = i5 % 128;
        if (i5 % 2 != 0) {
            return hVarArr;
        }
        throw null;
    }

    public static h valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f10704c + 109;
        f10708i = i3 % 128;
        int i4 = i3 % 2;
        h hVar = (h) Enum.valueOf(h.class, str);
        int i5 = f10704c + 43;
        f10708i = i5 % 128;
        if (i5 % 2 != 0) {
            return hVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static h[] values() {
        int i2 = 2 % 2;
        int i3 = f10708i + 29;
        f10704c = i3 % 128;
        int i4 = i3 % 2;
        h[] hVarArr = (h[]) f10706e.clone();
        int i5 = f10704c + 85;
        f10708i = i5 % 128;
        int i6 = i5 % 2;
        return hVarArr;
    }
}
