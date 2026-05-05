package com.incode.welcome_sdk.modules;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class EKYC extends BaseModule {
    public static final int $stable = 0;
    public static final a Companion = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10508a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10509b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10510c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f10511d = 0;
    private final DataInputSource addressSource;
    private final DataInputSource dateOfBirthSource;
    private final DataInputSource emailSource;
    private final DataInputSource nameSource;
    private final DataInputSource nationalitySource;
    private final DataInputSource phoneSource;
    private final DataInputSource taxIdSource;
    private final boolean verifyAddress;
    private final boolean verifyDateOfBirth;
    private final boolean verifyEmail;
    private final boolean verifyName;
    private final boolean verifyNationality;
    private final boolean verifyPhone;
    private final boolean verifyTaxId;

    public final boolean getVerifyName() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f10511d + 63;
        int i4 = i3 % 128;
        f10508a = i4;
        if (i3 % 2 == 0) {
            z2 = this.verifyName;
            int i5 = 43 / 0;
        } else {
            z2 = this.verifyName;
        }
        int i6 = i4 + 79;
        f10511d = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DataInputSource getNameSource() {
        int i2 = 2 % 2;
        int i3 = f10511d + 53;
        int i4 = i3 % 128;
        f10508a = i4;
        int i5 = i3 % 2;
        DataInputSource dataInputSource = this.nameSource;
        int i6 = i4 + 103;
        f10511d = i6 % 128;
        int i7 = i6 % 2;
        return dataInputSource;
    }

    public final boolean getVerifyEmail() {
        int i2 = 2 % 2;
        int i3 = f10508a;
        int i4 = i3 + 115;
        f10511d = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.verifyEmail;
        int i6 = i3 + 45;
        f10511d = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final DataInputSource getEmailSource() {
        DataInputSource dataInputSource;
        int i2 = 2 % 2;
        int i3 = f10508a;
        int i4 = i3 + 91;
        f10511d = i4 % 128;
        if (i4 % 2 != 0) {
            dataInputSource = this.emailSource;
            int i5 = 5 / 0;
        } else {
            dataInputSource = this.emailSource;
        }
        int i6 = i3 + 61;
        f10511d = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 91 / 0;
        }
        return dataInputSource;
    }

    public final boolean getVerifyAddress() {
        int i2 = 2 % 2;
        int i3 = f10511d + 59;
        int i4 = i3 % 128;
        f10508a = i4;
        int i5 = i3 % 2;
        boolean z2 = this.verifyAddress;
        int i6 = i4 + 57;
        f10511d = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final DataInputSource getAddressSource() {
        int i2 = 2 % 2;
        int i3 = f10511d + 103;
        int i4 = i3 % 128;
        f10508a = i4;
        int i5 = i3 % 2;
        DataInputSource dataInputSource = this.addressSource;
        int i6 = i4 + 33;
        f10511d = i6 % 128;
        int i7 = i6 % 2;
        return dataInputSource;
    }

    public final boolean getVerifyPhone() {
        int i2 = 2 % 2;
        int i3 = f10508a + 49;
        f10511d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.verifyPhone;
        }
        throw null;
    }

    public final DataInputSource getPhoneSource() {
        int i2 = 2 % 2;
        int i3 = f10508a;
        int i4 = i3 + 121;
        f10511d = i4 % 128;
        int i5 = i4 % 2;
        DataInputSource dataInputSource = this.phoneSource;
        int i6 = i3 + 9;
        f10511d = i6 % 128;
        int i7 = i6 % 2;
        return dataInputSource;
    }

    public final boolean getVerifyTaxId() {
        int i2 = 2 % 2;
        int i3 = f10511d + 79;
        int i4 = i3 % 128;
        f10508a = i4;
        int i5 = i3 % 2;
        boolean z2 = this.verifyTaxId;
        int i6 = i4 + 109;
        f10511d = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final DataInputSource getTaxIdSource() {
        int i2 = 2 % 2;
        int i3 = f10508a + 11;
        int i4 = i3 % 128;
        f10511d = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        DataInputSource dataInputSource = this.taxIdSource;
        int i5 = i4 + 97;
        f10508a = i5 % 128;
        if (i5 % 2 != 0) {
            return dataInputSource;
        }
        throw null;
    }

    public final boolean getVerifyDateOfBirth() {
        int i2 = 2 % 2;
        int i3 = f10508a + 35;
        int i4 = i3 % 128;
        f10511d = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z2 = this.verifyDateOfBirth;
        int i5 = i4 + 57;
        f10508a = i5 % 128;
        if (i5 % 2 != 0) {
            return z2;
        }
        obj.hashCode();
        throw null;
    }

    public final DataInputSource getDateOfBirthSource() {
        int i2 = 2 % 2;
        int i3 = f10508a;
        int i4 = i3 + 93;
        f10511d = i4 % 128;
        int i5 = i4 % 2;
        DataInputSource dataInputSource = this.dateOfBirthSource;
        int i6 = i3 + 33;
        f10511d = i6 % 128;
        if (i6 % 2 == 0) {
            return dataInputSource;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getVerifyNationality() {
        int i2 = 2 % 2;
        int i3 = f10508a;
        int i4 = i3 + 89;
        f10511d = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.verifyNationality;
        int i6 = i3 + 15;
        f10511d = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final DataInputSource getNationalitySource() {
        int i2 = 2 % 2;
        int i3 = f10508a;
        int i4 = i3 + 85;
        f10511d = i4 % 128;
        int i5 = i4 % 2;
        DataInputSource dataInputSource = this.nationalitySource;
        int i6 = i3 + 79;
        f10511d = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 19 / 0;
        }
        return dataInputSource;
    }

    private EKYC(boolean z2, DataInputSource dataInputSource, boolean z3, DataInputSource dataInputSource2, boolean z4, DataInputSource dataInputSource3, boolean z5, DataInputSource dataInputSource4, boolean z6, DataInputSource dataInputSource5, boolean z7, DataInputSource dataInputSource6, boolean z8, DataInputSource dataInputSource7) {
        super(Modules.EXTERNAL_VERIFICATION);
        this.verifyName = z2;
        this.nameSource = dataInputSource;
        this.verifyEmail = z3;
        this.emailSource = dataInputSource2;
        this.verifyAddress = z4;
        this.addressSource = dataInputSource3;
        this.verifyPhone = z5;
        this.phoneSource = dataInputSource4;
        this.verifyTaxId = z6;
        this.taxIdSource = dataInputSource5;
        this.verifyDateOfBirth = z7;
        this.dateOfBirthSource = dataInputSource6;
        this.verifyNationality = z8;
        this.nationalitySource = dataInputSource7;
    }

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10518b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10519c = 1;

        private a() {
        }

        @JvmStatic
        public static EKYC d() {
            int i2 = 2 % 2;
            EKYC ekycBuild = new Builder().build();
            int i3 = f10519c + 79;
            f10518b = i3 % 128;
            int i4 = i3 % 2;
            return ekycBuild;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DataInputSource {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DataInputSource[] $VALUES;
        public static final b Companion;
        public static final DataInputSource USER_INPUT = new DataInputSource("USER_INPUT", 0);
        public static final DataInputSource DOCUMENT = new DataInputSource("DOCUMENT", 1);
        public static final DataInputSource PROOF_OF_ADDRESS = new DataInputSource("PROOF_OF_ADDRESS", 2);

        private static final /* synthetic */ DataInputSource[] $values() {
            return new DataInputSource[]{USER_INPUT, DOCUMENT, PROOF_OF_ADDRESS};
        }

        public static EnumEntries<DataInputSource> getEntries() {
            return $ENTRIES;
        }

        public static DataInputSource valueOf(String str) {
            return (DataInputSource) Enum.valueOf(DataInputSource.class, str);
        }

        public static DataInputSource[] values() {
            return (DataInputSource[]) $VALUES.clone();
        }

        private DataInputSource(String str, int i2) {
        }

        static {
            DataInputSource[] dataInputSourceArr$values = $values();
            $VALUES = dataInputSourceArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(dataInputSourceArr$values);
            Companion = new b(null);
        }

        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f10516a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f10517c = 1;

            private b() {
            }

            public static DataInputSource b(String str) {
                int i2 = 2 % 2;
                if (Intrinsics.areEqual(str, "document")) {
                    int i3 = f10516a + 77;
                    f10517c = i3 % 128;
                    int i4 = i3 % 2;
                    return DataInputSource.DOCUMENT;
                }
                if (!Intrinsics.areEqual(str, "poa")) {
                    return DataInputSource.USER_INPUT;
                }
                int i5 = f10516a + 89;
                f10517c = i5 % 128;
                int i6 = i5 % 2;
                DataInputSource dataInputSource = DataInputSource.PROOF_OF_ADDRESS;
                int i7 = f10516a + 105;
                f10517c = i7 % 128;
                int i8 = i7 % 2;
                return dataInputSource;
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    public static final class Builder {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10512a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10513b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10514c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10515d = 0;
        private boolean verifyName = true;
        private boolean verifyEmail = true;
        private boolean verifyAddress = true;
        private boolean verifyPhone = true;
        private boolean verifyTaxId = true;
        private boolean verifyDateOfBirth = true;
        private boolean verifyNationality = true;
        private DataInputSource nameSource = DataInputSource.USER_INPUT;
        private DataInputSource emailSource = DataInputSource.USER_INPUT;
        private DataInputSource addressSource = DataInputSource.USER_INPUT;
        private DataInputSource phoneSource = DataInputSource.USER_INPUT;
        private DataInputSource taxIdSource = DataInputSource.USER_INPUT;
        private DataInputSource dateOfBirthSource = DataInputSource.USER_INPUT;
        private DataInputSource nationalitySource = DataInputSource.USER_INPUT;

        public final Builder setVerifyName(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10512a + 1;
            f10513b = i3 % 128;
            int i4 = i3 % 2;
            this.verifyName = z2;
            if (i4 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setVerifyEmail(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10513b + 37;
            int i4 = i3 % 128;
            f10512a = i4;
            if (i3 % 2 != 0) {
                this.verifyEmail = z2;
                int i5 = 20 / 0;
            } else {
                this.verifyEmail = z2;
            }
            int i6 = i4 + 57;
            f10513b = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 80 / 0;
            }
            return this;
        }

        public final Builder setVerifyAddress(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10513b;
            int i4 = i3 + 57;
            f10512a = i4 % 128;
            if (i4 % 2 != 0) {
                this.verifyAddress = z2;
                int i5 = 41 / 0;
            } else {
                this.verifyAddress = z2;
            }
            int i6 = i3 + 49;
            f10512a = i6 % 128;
            if (i6 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setVerifyPhone(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10513b + 49;
            int i4 = i3 % 128;
            f10512a = i4;
            int i5 = i3 % 2;
            this.verifyPhone = z2;
            int i6 = i4 + 109;
            f10513b = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setVerifyTaxId(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10512a;
            int i4 = i3 + 91;
            f10513b = i4 % 128;
            int i5 = i4 % 2;
            this.verifyTaxId = z2;
            int i6 = i3 + 73;
            f10513b = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setVerifyDateOfBirth(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10513b + 33;
            int i4 = i3 % 128;
            f10512a = i4;
            int i5 = i3 % 2;
            this.verifyDateOfBirth = z2;
            int i6 = i4 + 21;
            f10513b = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setVerifyNationality(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10513b + 1;
            int i4 = i3 % 128;
            f10512a = i4;
            if (i3 % 2 != 0) {
                this.verifyNationality = z2;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.verifyNationality = z2;
            int i5 = i4 + 25;
            f10513b = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder setNameSource(DataInputSource dataInputSource) {
            int i2 = 2 % 2;
            int i3 = f10513b + 85;
            f10512a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(dataInputSource, "");
            this.nameSource = dataInputSource;
            int i5 = f10512a + 27;
            f10513b = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final Builder setAddressSource(DataInputSource dataInputSource) {
            int i2 = 2 % 2;
            int i3 = f10513b + 111;
            f10512a = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(dataInputSource, "");
                this.addressSource = dataInputSource;
                int i4 = 56 / 0;
            } else {
                Intrinsics.checkNotNullParameter(dataInputSource, "");
                this.addressSource = dataInputSource;
            }
            int i5 = f10513b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f10512a = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setDateOfBirthSource(DataInputSource dataInputSource) {
            int i2 = 2 % 2;
            int i3 = f10512a + 5;
            f10513b = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(dataInputSource, "");
                this.dateOfBirthSource = dataInputSource;
                throw null;
            }
            Intrinsics.checkNotNullParameter(dataInputSource, "");
            this.dateOfBirthSource = dataInputSource;
            int i4 = f10512a + 17;
            f10513b = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            obj.hashCode();
            throw null;
        }

        public final EKYC build() {
            int i2 = 2 % 2;
            EKYC ekyc = new EKYC(this.verifyName, this.nameSource, this.verifyEmail, this.emailSource, this.verifyAddress, this.addressSource, this.verifyPhone, this.phoneSource, this.verifyTaxId, this.taxIdSource, this.verifyDateOfBirth, this.dateOfBirthSource, this.verifyNationality, this.nationalitySource, null);
            int i3 = f10512a + 31;
            f10513b = i3 % 128;
            int i4 = i3 % 2;
            return ekyc;
        }

        static {
            int i2 = 1 + 113;
            f10515d = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i2 = f10509b + 57;
        f10510c = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ EKYC(boolean z2, DataInputSource dataInputSource, boolean z3, DataInputSource dataInputSource2, boolean z4, DataInputSource dataInputSource3, boolean z5, DataInputSource dataInputSource4, boolean z6, DataInputSource dataInputSource5, boolean z7, DataInputSource dataInputSource6, boolean z8, DataInputSource dataInputSource7, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, dataInputSource, z3, dataInputSource2, z4, dataInputSource3, z5, dataInputSource4, z6, dataInputSource5, z7, dataInputSource6, z8, dataInputSource7);
    }

    @JvmStatic
    public static final EKYC createDefault() {
        int i2 = 2 % 2;
        int i3 = f10511d + 29;
        f10508a = i3 % 128;
        int i4 = i3 % 2;
        EKYC ekycD = a.d();
        int i5 = f10508a + 7;
        f10511d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return ekycD;
    }
}
