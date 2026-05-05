package com.incode.welcome_sdk.commons.utils;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class QuantityKeyword {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ QuantityKeyword[] $VALUES;
    public static final c Companion;
    public static final QuantityKeyword ZERO = new QuantityKeyword("ZERO", 0);
    public static final QuantityKeyword ONE = new QuantityKeyword("ONE", 1);
    public static final QuantityKeyword TWO = new QuantityKeyword("TWO", 2);
    public static final QuantityKeyword FEW = new QuantityKeyword("FEW", 3);
    public static final QuantityKeyword MANY = new QuantityKeyword("MANY", 4);
    public static final QuantityKeyword OTHER = new QuantityKeyword("OTHER", 5);

    private static final /* synthetic */ QuantityKeyword[] $values() {
        return new QuantityKeyword[]{ZERO, ONE, TWO, FEW, MANY, OTHER};
    }

    public static EnumEntries<QuantityKeyword> getEntries() {
        return $ENTRIES;
    }

    public static QuantityKeyword valueOf(String str) {
        return (QuantityKeyword) Enum.valueOf(QuantityKeyword.class, str);
    }

    public static QuantityKeyword[] values() {
        return (QuantityKeyword[]) $VALUES.clone();
    }

    private QuantityKeyword(String str, int i2) {
    }

    static {
        QuantityKeyword[] quantityKeywordArr$values = $values();
        $VALUES = quantityKeywordArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(quantityKeywordArr$values);
        Companion = new c(null);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f6325a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f6326d = 1;

        private c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.util.Map<java.lang.String, java.util.Map<dev.b3nedikt.restring.PluralKeyword, java.lang.CharSequence>> a(java.util.Map<java.lang.String, ? extends java.util.Map<com.incode.welcome_sdk.commons.utils.QuantityKeyword, ? extends java.lang.CharSequence>> r9) {
            /*
                Method dump skipped, instruction units count: 282
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.QuantityKeyword.c.a(java.util.Map):java.util.Map");
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.utils.QuantityKeyword$c$c, reason: collision with other inner class name */
        public /* synthetic */ class C0220c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f6327a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f6328b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ int[] f6329c;

            static {
                int[] iArr = new int[QuantityKeyword.values().length];
                try {
                    iArr[QuantityKeyword.ZERO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[QuantityKeyword.ONE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[QuantityKeyword.TWO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[QuantityKeyword.FEW.ordinal()] = 4;
                    int i2 = 2 % 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[QuantityKeyword.MANY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[QuantityKeyword.OTHER.ordinal()] = 6;
                    int i3 = f6327a + 117;
                    f6328b = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused6) {
                }
                f6329c = iArr;
                int i5 = f6328b + 5;
                f6327a = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
