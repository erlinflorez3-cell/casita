package com.incode.welcome_sdk.modules;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class MachineLearningConsent extends BaseModule {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10604a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10605c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f10606d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f10607e = 1;
    private final ConsentType consentType;

    public final ConsentType getConsentType() {
        int i2 = 2 % 2;
        int i3 = f10604a + 57;
        int i4 = i3 % 128;
        f10605c = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        ConsentType consentType = this.consentType;
        int i5 = i4 + 57;
        f10604a = i5 % 128;
        if (i5 % 2 != 0) {
            return consentType;
        }
        obj.hashCode();
        throw null;
    }

    private MachineLearningConsent(ConsentType consentType) {
        super(Modules.ML_CONSENT);
        this.consentType = consentType;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ConsentType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ConsentType[] $VALUES;
        public static final e Companion;
        private final String type;
        public static final ConsentType US = new ConsentType("US", 0, "US");
        public static final ConsentType GDPR = new ConsentType("GDPR", 1, "Other");

        private static final /* synthetic */ ConsentType[] $values() {
            return new ConsentType[]{US, GDPR};
        }

        public static EnumEntries<ConsentType> getEntries() {
            return $ENTRIES;
        }

        public static ConsentType valueOf(String str) {
            return (ConsentType) Enum.valueOf(ConsentType.class, str);
        }

        public static ConsentType[] values() {
            return (ConsentType[]) $VALUES.clone();
        }

        private ConsentType(String str, int i2, String str2) {
            this.type = str2;
        }

        public final String getType() {
            return this.type;
        }

        static {
            ConsentType[] consentTypeArr$values = $values();
            $VALUES = consentTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(consentTypeArr$values);
            Companion = new e(null);
        }

        public static final class e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f10612a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f10613b = 1;

            private e() {
            }

            public static ConsentType d(String str) {
                int i2 = 2 % 2;
                int i3 = f10612a + 87;
                f10613b = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                if (!Intrinsics.areEqual(str, "US_CONSENT")) {
                    int i5 = f10613b + 35;
                    f10612a = i5 % 128;
                    if (i5 % 2 != 0) {
                        Intrinsics.areEqual(str, "GDPR_CONSENT");
                        throw null;
                    }
                    if (Intrinsics.areEqual(str, "GDPR_CONSENT")) {
                        return ConsentType.GDPR;
                    }
                }
                ConsentType consentType = ConsentType.US;
                int i6 = f10612a + 47;
                f10613b = i6 % 128;
                int i7 = i6 % 2;
                return consentType;
            }

            public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    public static final class Builder {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10608a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10609c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10610d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10611e = 0;
        private ConsentType consentType = ConsentType.US;

        public final Builder setConsentType(ConsentType consentType) {
            int i2 = 2 % 2;
            int i3 = f10609c + 7;
            f10610d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(consentType, "");
            this.consentType = consentType;
            int i5 = f10609c + 107;
            f10610d = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final MachineLearningConsent build() {
            int i2 = 2 % 2;
            MachineLearningConsent machineLearningConsent = new MachineLearningConsent(this.consentType, null);
            int i3 = f10610d + 105;
            f10609c = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 27 / 0;
            }
            return machineLearningConsent;
        }

        static {
            int i2 = 1 + 69;
            f10611e = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    static {
        int i2 = 1 + 9;
        f10606d = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ MachineLearningConsent(ConsentType consentType, DefaultConstructorMarker defaultConstructorMarker) {
        this(consentType);
    }
}
