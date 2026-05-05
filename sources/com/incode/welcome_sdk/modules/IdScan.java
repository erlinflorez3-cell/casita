package com.incode.welcome_sdk.modules;

import android.os.Parcel;
import android.os.Parcelable;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import java.util.List;
import kotlin.Deprecated;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class IdScan extends BaseModule implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<IdScan> CREATOR = new e();

    /* JADX INFO: renamed from: a */
    private static int f10571a = 1;

    /* JADX INFO: renamed from: b */
    private static int f10572b = 0;

    /* JADX INFO: renamed from: c */
    private static int f10573c = 1;

    /* JADX INFO: renamed from: d */
    private static int f10574d = 0;
    private final int autoCaptureNoIdTimeout;
    private final int autoCaptureTimeout;
    private final AutocaptureUXMode autocaptureUXMode;
    private final int captureAttempts;
    private final IdCategory idCategory;
    private final IdType idType;
    private final boolean isEnabledBackShownAsFrontCheck;
    private final boolean isEnabledFrontShownAsBackCheck;
    private final boolean isEnabledRotationOnRetakeScreen;
    private final boolean isShowIdOverlay;
    private final boolean isShowIdTutorials;
    private boolean isShowIdTypeChooser;
    private final boolean isShowRetakeScreenForAutoCapture;
    private final boolean isShowRetakeScreenForManualCapture;
    private final boolean isStreamAudioEnabled;
    private final boolean isStreamFramesEnabled;
    private final boolean isWaitForTutorials;
    private final ScanStep scanStep;

    public final boolean isShowIdTutorials() {
        int i2 = 2 % 2;
        int i3 = f10571a;
        int i4 = i3 + 81;
        f10572b = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.isShowIdTutorials;
        int i6 = i3 + 83;
        f10572b = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean isWaitForTutorials() {
        int i2 = 2 % 2;
        int i3 = f10571a + 27;
        int i4 = i3 % 128;
        f10572b = i4;
        int i5 = i3 % 2;
        boolean z2 = this.isWaitForTutorials;
        int i6 = i4 + 103;
        f10571a = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public final boolean isEnabledFrontShownAsBackCheck() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f10572b;
        int i4 = i3 + 47;
        f10571a = i4 % 128;
        if (i4 % 2 == 0) {
            z2 = this.isEnabledFrontShownAsBackCheck;
            int i5 = 13 / 0;
        } else {
            z2 = this.isEnabledFrontShownAsBackCheck;
        }
        int i6 = i3 + 81;
        f10571a = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean isEnabledBackShownAsFrontCheck() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f10571a;
        int i4 = i3 + 97;
        f10572b = i4 % 128;
        if (i4 % 2 != 0) {
            z2 = this.isEnabledBackShownAsFrontCheck;
            int i5 = 40 / 0;
        } else {
            z2 = this.isEnabledBackShownAsFrontCheck;
        }
        int i6 = i3 + 25;
        f10572b = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final boolean isShowIdTypeChooser() {
        int i2 = 2 % 2;
        int i3 = f10571a;
        int i4 = i3 + 79;
        f10572b = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.isShowIdTypeChooser;
        int i6 = i3 + 113;
        f10572b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 30 / 0;
        }
        return z2;
    }

    public final void setShowIdTypeChooser(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f10572b + 49;
        f10571a = i3 % 128;
        int i4 = i3 % 2;
        this.isShowIdTypeChooser = z2;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final IdType getIdType() {
        int i2 = 2 % 2;
        int i3 = f10572b + 51;
        f10571a = i3 % 128;
        int i4 = i3 % 2;
        IdType idType = this.idType;
        if (i4 == 0) {
            int i5 = 38 / 0;
        }
        return idType;
    }

    public final IdCategory getIdCategory() {
        int i2 = 2 % 2;
        int i3 = f10571a + 117;
        f10572b = i3 % 128;
        int i4 = i3 % 2;
        IdCategory idCategory = this.idCategory;
        if (i4 != 0) {
            int i5 = 9 / 0;
        }
        return idCategory;
    }

    public final ScanStep getScanStep() {
        int i2 = 2 % 2;
        int i3 = f10571a + 109;
        int i4 = i3 % 128;
        f10572b = i4;
        int i5 = i3 % 2;
        ScanStep scanStep = this.scanStep;
        int i6 = i4 + 29;
        f10571a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 52 / 0;
        }
        return scanStep;
    }

    public final boolean isShowRetakeScreenForManualCapture() {
        int i2 = 2 % 2;
        int i3 = f10571a + 113;
        f10572b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.isShowRetakeScreenForManualCapture;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isShowRetakeScreenForAutoCapture() {
        int i2 = 2 % 2;
        int i3 = f10572b + 15;
        int i4 = i3 % 128;
        f10571a = i4;
        int i5 = i3 % 2;
        boolean z2 = this.isShowRetakeScreenForAutoCapture;
        int i6 = i4 + 39;
        f10572b = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean isEnabledRotationOnRetakeScreen() {
        int i2 = 2 % 2;
        int i3 = f10572b + 87;
        int i4 = i3 % 128;
        f10571a = i4;
        int i5 = i3 % 2;
        boolean z2 = this.isEnabledRotationOnRetakeScreen;
        int i6 = i4 + 107;
        f10572b = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final AutocaptureUXMode getAutocaptureUXMode() {
        int i2 = 2 % 2;
        int i3 = f10572b;
        int i4 = i3 + 7;
        f10571a = i4 % 128;
        int i5 = i4 % 2;
        AutocaptureUXMode autocaptureUXMode = this.autocaptureUXMode;
        int i6 = i3 + 109;
        f10571a = i6 % 128;
        int i7 = i6 % 2;
        return autocaptureUXMode;
    }

    public final boolean isShowIdOverlay() {
        int i2 = 2 % 2;
        int i3 = f10571a;
        int i4 = i3 + 45;
        f10572b = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.isShowIdOverlay;
        int i5 = i3 + 13;
        f10572b = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public final boolean isStreamFramesEnabled() {
        int i2 = 2 % 2;
        int i3 = f10572b + 83;
        int i4 = i3 % 128;
        f10571a = i4;
        int i5 = i3 % 2;
        boolean z2 = this.isStreamFramesEnabled;
        int i6 = i4 + 113;
        f10572b = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final int getAutoCaptureTimeout() {
        int i2 = 2 % 2;
        int i3 = f10572b + 61;
        int i4 = i3 % 128;
        f10571a = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = this.autoCaptureTimeout;
        int i6 = i4 + 27;
        f10572b = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        obj.hashCode();
        throw null;
    }

    public final int getAutoCaptureNoIdTimeout() {
        int i2 = 2 % 2;
        int i3 = f10572b;
        int i4 = i3 + 1;
        f10571a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.autoCaptureNoIdTimeout;
        int i7 = i3 + 19;
        f10571a = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getCaptureAttempts() {
        int i2 = 2 % 2;
        int i3 = f10572b;
        int i4 = i3 + 37;
        f10571a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.captureAttempts;
        int i7 = i3 + 17;
        f10571a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 22 / 0;
        }
        return i6;
    }

    public final boolean isStreamAudioEnabled() {
        int i2 = 2 % 2;
        int i3 = f10571a + 37;
        int i4 = i3 % 128;
        f10572b = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.isStreamAudioEnabled;
        int i5 = i4 + 43;
        f10571a = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    private IdScan(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, IdType idType, IdCategory idCategory, ScanStep scanStep, boolean z7, boolean z8, boolean z9, AutocaptureUXMode autocaptureUXMode, boolean z10, boolean z11, int i2, int i3, int i4, boolean z12) {
        super(Modules.ID);
        this.isShowIdTutorials = z2;
        this.isWaitForTutorials = z3;
        this.isEnabledFrontShownAsBackCheck = z4;
        this.isEnabledBackShownAsFrontCheck = z5;
        this.isShowIdTypeChooser = z6;
        this.idType = idType;
        this.idCategory = idCategory;
        this.scanStep = scanStep;
        this.isShowRetakeScreenForManualCapture = z7;
        this.isShowRetakeScreenForAutoCapture = z8;
        this.isEnabledRotationOnRetakeScreen = z9;
        this.autocaptureUXMode = autocaptureUXMode;
        this.isShowIdOverlay = z10;
        this.isStreamFramesEnabled = z11;
        this.autoCaptureTimeout = i2;
        this.autoCaptureNoIdTimeout = i3;
        this.captureAttempts = i4;
        this.isStreamAudioEnabled = z12;
    }

    public final boolean isRecordingSupported() {
        int i2 = 2 % 2;
        if (this.idCategory != IdCategory.FIRST) {
            return false;
        }
        int i3 = f10571a + 77;
        int i4 = i3 % 128;
        f10572b = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 19;
        f10571a = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public static final class IdType extends Enum<IdType> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IdType[] $VALUES;
        public static final IdType ID = new IdType("ID", 0);
        public static final IdType PASSPORT = new IdType("PASSPORT", 1);

        private static final /* synthetic */ IdType[] $values() {
            return new IdType[]{ID, PASSPORT};
        }

        public static EnumEntries<IdType> getEntries() {
            return $ENTRIES;
        }

        public static IdType valueOf(String str) {
            return (IdType) Enum.valueOf(IdType.class, str);
        }

        public static IdType[] values() {
            return (IdType[]) $VALUES.clone();
        }

        private IdType(String str, int i2) {
            super(str, i2);
        }

        static {
            IdType[] idTypeArr$values = $values();
            $VALUES = idTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(idTypeArr$values);
        }

        public final boolean isSingleSided() {
            return this == PASSPORT;
        }
    }

    public static final class ScanStep extends Enum<ScanStep> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ScanStep[] $VALUES;
        public static final ScanStep FRONT = new ScanStep("FRONT", 0);
        public static final ScanStep BACK = new ScanStep("BACK", 1);
        public static final ScanStep BOTH = new ScanStep("BOTH", 2);

        private static final /* synthetic */ ScanStep[] $values() {
            return new ScanStep[]{FRONT, BACK, BOTH};
        }

        public static EnumEntries<ScanStep> getEntries() {
            return $ENTRIES;
        }

        public static ScanStep valueOf(String str) {
            return (ScanStep) Enum.valueOf(ScanStep.class, str);
        }

        public static ScanStep[] values() {
            return (ScanStep[]) $VALUES.clone();
        }

        private ScanStep(String str, int i2) {
            super(str, i2);
        }

        static {
            ScanStep[] scanStepArr$values = $values();
            $VALUES = scanStepArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(scanStepArr$values);
        }
    }

    public static abstract class AutocaptureUXMode implements Parcelable {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: b */
        private static int f10575b = 0;

        /* JADX INFO: renamed from: c */
        private static int f10576c = 1;

        /* JADX INFO: renamed from: d */
        private static int f10577d = 0;

        /* JADX INFO: renamed from: e */
        private static int f10578e = 1;
        private final int duration;

        private AutocaptureUXMode(int i2) {
            this.duration = i2;
        }

        public /* synthetic */ AutocaptureUXMode(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 3 : i2, null);
        }

        public int getDuration() {
            int i2 = 2 % 2;
            int i3 = f10577d;
            int i4 = i3 + 63;
            f10578e = i4 % 128;
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = this.duration;
            int i6 = i3 + 41;
            f10578e = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public static final class Countdown extends AutocaptureUXMode {
            public static final int $stable = 0;
            public static final Parcelable.Creator<Countdown> CREATOR = new e();

            /* JADX INFO: renamed from: a */
            private static int f10579a = 0;

            /* JADX INFO: renamed from: c */
            private static int f10580c = 1;

            /* JADX INFO: renamed from: d */
            private static int f10581d = 0;

            /* JADX INFO: renamed from: e */
            private static int f10582e = 1;

            public Countdown() {
                super(0, 1, null);
            }

            public static final class e implements Parcelable.Creator<Countdown> {

                /* JADX INFO: renamed from: a */
                private static int f10583a = 1;

                /* JADX INFO: renamed from: d */
                private static int f10584d = 0;

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Countdown createFromParcel(Parcel parcel) {
                    int i2 = 2 % 2;
                    int i3 = f10583a + 49;
                    f10584d = i3 % 128;
                    int i4 = i3 % 2;
                    Countdown countdownD = d(parcel);
                    int i5 = f10584d + 121;
                    f10583a = i5 % 128;
                    if (i5 % 2 != 0) {
                        return countdownD;
                    }
                    throw null;
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Countdown[] newArray(int i2) {
                    int i3 = 2 % 2;
                    int i4 = f10584d + 89;
                    f10583a = i4 % 128;
                    if (i4 % 2 != 0) {
                        return b(i2);
                    }
                    b(i2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                private static Countdown d(Parcel parcel) {
                    int i2 = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    Countdown countdown = new Countdown();
                    int i3 = f10584d + 31;
                    f10583a = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 79 / 0;
                    }
                    return countdown;
                }

                private static Countdown[] b(int i2) {
                    int i3 = 2 % 2;
                    int i4 = f10583a + 53;
                    int i5 = i4 % 128;
                    f10584d = i5;
                    Object obj = null;
                    Countdown[] countdownArr = new Countdown[i2];
                    if (i4 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    int i6 = i5 + 81;
                    f10583a = i6 % 128;
                    if (i6 % 2 != 0) {
                        return countdownArr;
                    }
                    throw null;
                }
            }

            static {
                int i2 = f10581d + 107;
                f10582e = i2 % 128;
                int i3 = i2 % 2;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i2) {
                int i3 = 2 % 2;
                int i4 = f10579a + 75;
                f10580c = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
                int i6 = f10580c + 79;
                f10579a = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i2 = 2 % 2;
                int i3 = f10579a + 81;
                f10580c = i3 % 128;
                return i3 % 2 == 0 ? 1 : 0;
            }
        }

        public static final class HoldStill extends AutocaptureUXMode {
            public static final int $stable = 0;
            public static final Parcelable.Creator<HoldStill> CREATOR = new b();

            /* JADX INFO: renamed from: a */
            private static int f10585a = 0;

            /* JADX INFO: renamed from: b */
            private static int f10586b = 1;

            /* JADX INFO: renamed from: d */
            private static int f10587d = 0;

            /* JADX INFO: renamed from: e */
            private static int f10588e = 1;
            private final int duration;

            public HoldStill(int i2) {
                super(i2, null);
                this.duration = i2;
            }

            public /* synthetic */ HoldStill(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this((i3 & 1) != 0 ? 2 : i2);
            }

            @Override // com.incode.welcome_sdk.modules.IdScan.AutocaptureUXMode
            public final int getDuration() {
                int i2 = 2 % 2;
                int i3 = f10586b + 37;
                int i4 = i3 % 128;
                f10585a = i4;
                int i5 = i3 % 2;
                int i6 = this.duration;
                int i7 = i4 + 47;
                f10586b = i7 % 128;
                int i8 = i7 % 2;
                return i6;
            }

            public static final class b implements Parcelable.Creator<HoldStill> {

                /* JADX INFO: renamed from: a */
                private static int f10589a = 1;

                /* JADX INFO: renamed from: c */
                private static int f10590c = 0;

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ HoldStill createFromParcel(Parcel parcel) {
                    int i2 = 2 % 2;
                    int i3 = f10590c + 59;
                    f10589a = i3 % 128;
                    int i4 = i3 % 2;
                    HoldStill holdStillC = c(parcel);
                    int i5 = f10590c + 55;
                    f10589a = i5 % 128;
                    if (i5 % 2 != 0) {
                        return holdStillC;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ HoldStill[] newArray(int i2) {
                    int i3 = 2 % 2;
                    int i4 = f10590c + 75;
                    f10589a = i4 % 128;
                    int i5 = i4 % 2;
                    HoldStill[] holdStillArrC = c(i2);
                    int i6 = f10589a + 7;
                    f10590c = i6 % 128;
                    if (i6 % 2 == 0) {
                        return holdStillArrC;
                    }
                    throw null;
                }

                private static HoldStill c(Parcel parcel) {
                    int i2 = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    HoldStill holdStill = new HoldStill(parcel.readInt());
                    int i3 = f10589a + 97;
                    f10590c = i3 % 128;
                    int i4 = i3 % 2;
                    return holdStill;
                }

                private static HoldStill[] c(int i2) {
                    int i3 = 2 % 2;
                    int i4 = f10590c + 57;
                    f10589a = i4 % 128;
                    HoldStill[] holdStillArr = new HoldStill[i2];
                    if (i4 % 2 == 0) {
                        int i5 = 27 / 0;
                    }
                    return holdStillArr;
                }
            }

            static {
                int i2 = f10587d + 63;
                f10588e = i2 % 128;
                int i3 = i2 % 2;
            }

            public HoldStill() {
                this(0, 1, null);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i2) {
                int i3 = 2 % 2;
                int i4 = f10585a + 3;
                f10586b = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(this.duration);
                if (i5 == 0) {
                    int i6 = 72 / 0;
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i2 = 2 % 2;
                int i3 = f10585a;
                int i4 = i3 + 53;
                f10586b = i4 % 128;
                int i5 = (i4 % 2 == 0 ? 0 : 1) ^ 1;
                int i6 = i3 + 87;
                f10586b = i6 % 128;
                int i7 = i6 % 2;
                return i5;
            }
        }

        static {
            int i2 = 1 + 125;
            f10575b = i2 % 128;
            int i3 = i2 % 2;
        }

        public /* synthetic */ AutocaptureUXMode(int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i2);
        }
    }

    @Override // com.incode.welcome_sdk.modules.BaseModule
    public final void verifyConfiguration(List<? extends Modules> list) throws ModuleConfigurationException {
        int i2 = 2 % 2;
        int i3 = f10571a + 117;
        f10572b = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(list, "");
            verifyAddAndProcessDataNotAfterApprove(list);
            verifyNotAfter(list, Modules.FACE_MATCH);
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, "");
        verifyAddAndProcessDataNotAfterApprove(list);
        verifyNotAfter(list, Modules.FACE_MATCH);
        int i4 = f10571a + 87;
        f10572b = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class Builder {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: b */
        private static int f10591b = 0;

        /* JADX INFO: renamed from: c */
        private static int f10592c = 1;

        /* JADX INFO: renamed from: d */
        private static int f10593d = 0;

        /* JADX INFO: renamed from: e */
        private static int f10594e = 53 % 128;
        private int autoCaptureNoIdTimeout;
        private int autoCaptureTimeout;
        private AutocaptureUXMode autocaptureUXMode;
        private int captureAttempts;
        private boolean enableBackShownAsFrontCheck;
        private boolean enableFrontShownAsBackCheck;
        private IdType idType;
        private boolean showIdOverlay;
        private boolean showRetakeScreenForAutoCapture;
        private boolean streamAudioEnabled;
        private boolean streamFramesEnabled;
        private boolean waitForTutorials;
        private boolean showIdTutorials = true;
        private boolean showIdTypeChooser = true;
        private IdCategory idCategory = IdCategory.FIRST;
        private ScanStep scanStep = ScanStep.BOTH;
        private boolean showRetakeScreenForManualCapture = true;
        private boolean enableRotationOnRetakeScreen = true;

        public Builder() {
            AutocaptureUXMode autocaptureUXMode = com.incode.welcome_sdk.commons.c.f4655g;
            Intrinsics.checkNotNullExpressionValue(autocaptureUXMode, "");
            this.autocaptureUXMode = autocaptureUXMode;
            this.autoCaptureTimeout = -1;
            this.autoCaptureNoIdTimeout = -1;
            this.captureAttempts = -1;
        }

        public final Builder from(IdScan idScan) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(idScan, "");
            Builder builder = new Builder();
            builder.showIdTutorials = idScan.isShowIdTutorials();
            builder.waitForTutorials = idScan.isWaitForTutorials();
            builder.enableFrontShownAsBackCheck = idScan.isEnabledFrontShownAsBackCheck();
            builder.enableBackShownAsFrontCheck = idScan.isEnabledBackShownAsFrontCheck();
            builder.showIdTypeChooser = idScan.isShowIdTypeChooser();
            builder.idType = idScan.getIdType();
            builder.idCategory = idScan.getIdCategory();
            builder.scanStep = idScan.getScanStep();
            builder.showRetakeScreenForManualCapture = idScan.isShowRetakeScreenForManualCapture();
            builder.showRetakeScreenForAutoCapture = idScan.isShowRetakeScreenForAutoCapture();
            builder.enableRotationOnRetakeScreen = idScan.isEnabledRotationOnRetakeScreen();
            builder.autocaptureUXMode = idScan.getAutocaptureUXMode();
            builder.showIdOverlay = idScan.isShowIdOverlay();
            builder.streamFramesEnabled = idScan.isStreamFramesEnabled();
            builder.autoCaptureTimeout = idScan.getAutoCaptureTimeout();
            builder.autoCaptureNoIdTimeout = idScan.getAutoCaptureNoIdTimeout();
            builder.captureAttempts = idScan.getCaptureAttempts();
            builder.streamAudioEnabled = idScan.isStreamAudioEnabled();
            int i3 = f10591b + 21;
            f10592c = i3 % 128;
            if (i3 % 2 != 0) {
                return builder;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setShowIdTutorials(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10592c + 55;
            f10591b = i3 % 128;
            if (i3 % 2 == 0) {
                this.showIdTutorials = z2;
                return this;
            }
            this.showIdTutorials = z2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Deprecated(message = "No longer supported in the new UI")
        public final Builder setWaitForTutorials(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10592c;
            int i4 = i3 + 65;
            f10591b = i4 % 128;
            int i5 = i4 % 2;
            this.waitForTutorials = z2;
            int i6 = i3 + 107;
            f10591b = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setEnableFrontShownAsBackCheck(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10592c + 7;
            f10591b = i3 % 128;
            if (i3 % 2 == 0) {
                this.enableFrontShownAsBackCheck = z2;
                return this;
            }
            this.enableFrontShownAsBackCheck = z2;
            throw null;
        }

        public final Builder setEnableBackShownAsFrontCheck(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10592c + 39;
            f10591b = i3 % 128;
            if (i3 % 2 != 0) {
                this.enableBackShownAsFrontCheck = z2;
                int i4 = 23 / 0;
            } else {
                this.enableBackShownAsFrontCheck = z2;
            }
            return this;
        }

        public final Builder setShowIdTypeChooser(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10591b;
            int i4 = i3 + 125;
            f10592c = i4 % 128;
            int i5 = i4 % 2;
            this.showIdTypeChooser = z2;
            int i6 = i3 + 79;
            f10592c = i6 % 128;
            if (i6 % 2 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setIdType(IdType idType) {
            int i2 = 2 % 2;
            int i3 = f10592c;
            int i4 = i3 + 37;
            f10591b = i4 % 128;
            int i5 = i4 % 2;
            this.idType = idType;
            int i6 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f10591b = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setIdCategory(IdCategory idCategory) {
            int i2 = 2 % 2;
            int i3 = f10591b + 101;
            f10592c = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(idCategory, "");
                this.idCategory = idCategory;
                int i4 = 90 / 0;
            } else {
                Intrinsics.checkNotNullParameter(idCategory, "");
                this.idCategory = idCategory;
            }
            int i5 = f10591b + 99;
            f10592c = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final Builder setScanStep(ScanStep scanStep) {
            int i2 = 2 % 2;
            int i3 = f10591b + 99;
            f10592c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(scanStep, "");
            this.scanStep = scanStep;
            int i5 = f10591b + 7;
            f10592c = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Builder setShowRetakeScreen$default(Builder builder, boolean z2, boolean z3, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = f10591b + 83;
            int i5 = i4 % 128;
            f10592c = i5;
            int i6 = i4 % 2;
            if ((i2 & 2) != 0) {
                int i7 = i5 + 11;
                f10591b = i7 % 128;
                z3 = i7 % 2 != 0;
            }
            return builder.setShowRetakeScreen(z2, z3);
        }

        @Deprecated(message = "No longer supported in the new UI")
        public final Builder setShowRetakeScreen(boolean z2, boolean z3) {
            int i2 = 2 % 2;
            int i3 = f10592c + 75;
            f10591b = i3 % 128;
            if (i3 % 2 == 0) {
                this.showRetakeScreenForManualCapture = z2;
                this.showRetakeScreenForAutoCapture = z3;
                return this;
            }
            this.showRetakeScreenForManualCapture = z2;
            this.showRetakeScreenForAutoCapture = z3;
            throw null;
        }

        @Deprecated(message = "No longer supported in the new UI")
        public final Builder setShowRetakeScreenForAutoCapture(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10592c + 55;
            f10591b = i3 % 128;
            if (i3 % 2 == 0) {
                this.showRetakeScreenForAutoCapture = z2;
                return this;
            }
            this.showRetakeScreenForAutoCapture = z2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Deprecated(message = "No longer supported in the new UI")
        public final Builder setShowRetakeScreenForManualCapture(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10591b;
            int i4 = i3 + 57;
            f10592c = i4 % 128;
            int i5 = i4 % 2;
            this.showRetakeScreenForManualCapture = z2;
            int i6 = i3 + 25;
            f10592c = i6 % 128;
            if (i6 % 2 != 0) {
                return this;
            }
            throw null;
        }

        @Deprecated(message = "No longer supported in the new UI")
        public final Builder setEnableRotationOnRetakeScreen(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10591b;
            int i4 = i3 + 95;
            f10592c = i4 % 128;
            int i5 = i4 % 2;
            this.enableRotationOnRetakeScreen = z2;
            int i6 = i3 + 59;
            f10592c = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 35 / 0;
            }
            return this;
        }

        @Deprecated(message = "No longer supported in the new UI")
        public final Builder setAutocaptureUXMode(AutocaptureUXMode autocaptureUXMode) {
            int i2 = 2 % 2;
            int i3 = f10592c + 7;
            f10591b = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(autocaptureUXMode, "");
                this.autocaptureUXMode = autocaptureUXMode;
                return this;
            }
            Intrinsics.checkNotNullParameter(autocaptureUXMode, "");
            this.autocaptureUXMode = autocaptureUXMode;
            throw null;
        }

        @Deprecated(message = "No longer supported in the new UI")
        public final Builder setShowIdOverlay(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10591b;
            int i4 = i3 + 33;
            f10592c = i4 % 128;
            if (i4 % 2 != 0) {
                this.showIdOverlay = z2;
                int i5 = i3 + 39;
                f10592c = i5 % 128;
                int i6 = i5 % 2;
                return this;
            }
            this.showIdOverlay = z2;
            throw null;
        }

        public final Builder setStreamFramesEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10592c + 63;
            f10591b = i3 % 128;
            if (i3 % 2 != 0) {
                this.streamFramesEnabled = z2;
                int i4 = 9 / 0;
            } else {
                this.streamFramesEnabled = z2;
            }
            return this;
        }

        public final Builder setAutoCaptureTimeout(int i2) {
            int i3 = 2 % 2;
            int i4 = f10591b + 115;
            int i5 = i4 % 128;
            f10592c = i5;
            if (i4 % 2 == 0) {
                this.autoCaptureTimeout = i2;
                int i6 = 20 / 0;
            } else {
                this.autoCaptureTimeout = i2;
            }
            int i7 = i5 + 67;
            f10591b = i7 % 128;
            if (i7 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Builder setAutoCaptureNoIdTimeout(int i2) {
            int i3 = 2 % 2;
            int i4 = f10591b + 17;
            f10592c = i4 % 128;
            if (i4 % 2 == 0) {
                this.autoCaptureNoIdTimeout = i2;
                int i5 = 70 / 0;
            } else {
                this.autoCaptureNoIdTimeout = i2;
            }
            return this;
        }

        public final Builder setCaptureAttempts(int i2) {
            int i3 = 2 % 2;
            int i4 = f10592c + 81;
            int i5 = i4 % 128;
            f10591b = i5;
            if (i4 % 2 != 0) {
                this.captureAttempts = i2;
                int i6 = 75 / 0;
            } else {
                this.captureAttempts = i2;
            }
            int i7 = i5 + 103;
            f10592c = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 63 / 0;
            }
            return this;
        }

        public final Builder setStreamAudioEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10591b + 17;
            int i4 = i3 % 128;
            f10592c = i4;
            int i5 = i3 % 2;
            this.streamAudioEnabled = z2;
            int i6 = i4 + 125;
            f10591b = i6 % 128;
            if (i6 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final IdScan build() {
            IdType idType;
            boolean z2 = this.showIdTutorials;
            boolean z3 = this.waitForTutorials;
            boolean z4 = this.enableFrontShownAsBackCheck;
            boolean z5 = this.enableBackShownAsFrontCheck;
            boolean z6 = this.showIdTypeChooser;
            boolean z7 = z6 && this.idType == null;
            if (z6) {
                idType = this.idType;
            } else {
                idType = this.idType;
                if (idType == null) {
                    idType = IdType.ID;
                }
            }
            return new IdScan(z2, z3, z4, z5, z7, idType, this.idCategory, this.scanStep, this.showRetakeScreenForManualCapture, this.showRetakeScreenForAutoCapture, this.enableRotationOnRetakeScreen, this.autocaptureUXMode, this.showIdOverlay, this.streamFramesEnabled, this.autoCaptureTimeout, this.autoCaptureNoIdTimeout, this.captureAttempts, this.streamAudioEnabled, null);
        }

        static {
            int i2 = 53 % 2;
        }

        @Deprecated(message = "No longer supported in the new UI")
        public final Builder setShowRetakeScreen(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10591b + 27;
            f10592c = i3 % 128;
            return i3 % 2 == 0 ? setShowRetakeScreen$default(this, z2, true, 5, null) : setShowRetakeScreen$default(this, z2, false, 2, null);
        }
    }

    public static final class e implements Parcelable.Creator<IdScan> {

        /* JADX INFO: renamed from: c */
        private static int f10595c = 0;

        /* JADX INFO: renamed from: d */
        private static int f10596d = 1;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IdScan createFromParcel(Parcel parcel) {
            int i2 = 2 % 2;
            int i3 = f10596d + 63;
            f10595c = i3 % 128;
            int i4 = i3 % 2;
            IdScan idScanB = b(parcel);
            int i5 = f10595c + 81;
            f10596d = i5 % 128;
            int i6 = i5 % 2;
            return idScanB;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IdScan[] newArray(int i2) {
            int i3 = 2 % 2;
            int i4 = f10595c + 123;
            f10596d = i4 % 128;
            int i5 = i4 % 2;
            IdScan[] idScanArrD = d(i2);
            if (i5 == 0) {
                int i6 = 51 / 0;
            }
            return idScanArrD;
        }

        private static IdScan b(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new IdScan(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : IdType.valueOf(parcel.readString()), IdCategory.valueOf(parcel.readString()), ScanStep.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, (AutocaptureUXMode) parcel.readParcelable(IdScan.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, null);
        }

        private static IdScan[] d(int i2) {
            int i3 = 2 % 2;
            int i4 = f10596d + 87;
            int i5 = i4 % 128;
            f10595c = i5;
            int i6 = i4 % 2;
            IdScan[] idScanArr = new IdScan[i2];
            int i7 = i5 + 47;
            f10596d = i7 % 128;
            int i8 = i7 % 2;
            return idScanArr;
        }
    }

    static {
        int i2 = f10573c + 25;
        f10574d = i2 % 128;
        int i3 = i2 % 2;
    }

    public /* synthetic */ IdScan(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, IdType idType, IdCategory idCategory, ScanStep scanStep, boolean z7, boolean z8, boolean z9, AutocaptureUXMode autocaptureUXMode, boolean z10, boolean z11, int i2, int i3, int i4, boolean z12, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, z3, z4, z5, z6, idType, idCategory, scanStep, z7, z8, z9, autocaptureUXMode, z10, z11, i2, i3, i4, z12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        int i9 = 0;
        if (this.isShowIdTutorials) {
            int i10 = f10571a + 37;
            f10572b = i10 % 128;
            int i11 = i10 % 2;
            i3 = 1;
        } else {
            i3 = 0;
        }
        parcel.writeInt(i3);
        if (this.isWaitForTutorials) {
            int i12 = f10571a + 29;
            f10572b = i12 % 128;
            int i13 = i12 % 2;
            i4 = 1;
        } else {
            i4 = 0;
        }
        parcel.writeInt(i4);
        if (this.isEnabledFrontShownAsBackCheck) {
            i5 = 1;
        } else {
            int i14 = f10571a + 45;
            f10572b = i14 % 128;
            int i15 = i14 % 2;
            i5 = 0;
        }
        parcel.writeInt(i5);
        parcel.writeInt(this.isEnabledBackShownAsFrontCheck ? 1 : 0);
        if (this.isShowIdTypeChooser) {
            int i16 = f10572b + 41;
            f10571a = i16 % 128;
            int i17 = i16 % 2;
            i6 = 1;
        } else {
            i6 = 0;
        }
        parcel.writeInt(i6);
        IdType idType = this.idType;
        if (idType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(idType.name());
        }
        parcel.writeString(this.idCategory.name());
        parcel.writeString(this.scanStep.name());
        parcel.writeInt(!this.isShowRetakeScreenForManualCapture ? 0 : 1);
        parcel.writeInt(this.isShowRetakeScreenForAutoCapture ? 1 : 0);
        parcel.writeInt(this.isEnabledRotationOnRetakeScreen ? 1 : 0);
        parcel.writeParcelable(this.autocaptureUXMode, i2);
        if (!this.isShowIdOverlay) {
            i7 = 0;
        } else {
            int i18 = f10571a + 103;
            f10572b = i18 % 128;
            int i19 = i18 % 2;
            i7 = 1;
        }
        parcel.writeInt(i7);
        if (this.isStreamFramesEnabled) {
            int i20 = f10571a + 27;
            f10572b = i20 % 128;
            int i21 = i20 % 2;
            i9 = 1;
        }
        parcel.writeInt(i9);
        parcel.writeInt(this.autoCaptureTimeout);
        parcel.writeInt(this.autoCaptureNoIdTimeout);
        parcel.writeInt(this.captureAttempts);
        parcel.writeInt(this.isStreamAudioEnabled ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i2 = 2 % 2;
        int i3 = f10572b + 13;
        f10571a = i3 % 128;
        int i4 = i3 % 2;
        return 0;
    }
}
