package com.incode.welcome_sdk.ui.id_capture;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class InfoModel {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f14884h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f14885i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f14887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final StatusColor f14888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InfoModelType f14889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f14890e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f14891g;

    public InfoModel(InfoModelType infoModelType, int i2, Integer num, Integer num2, StatusColor statusColor, boolean z2) {
        Intrinsics.checkNotNullParameter(infoModelType, "");
        this.f14889d = infoModelType;
        this.f14886a = i2;
        this.f14887b = num;
        this.f14890e = num2;
        this.f14888c = statusColor;
        this.f14891g = z2;
    }

    public /* synthetic */ InfoModel(InfoModelType infoModelType, int i2, Integer num, Integer num2, StatusColor statusColor, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(infoModelType, i2, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? null : num2, (i3 & 16) == 0 ? statusColor : null, (i3 & 32) != 0 ? true : z2);
    }

    public final InfoModelType getType() {
        InfoModelType infoModelType;
        int i2 = 2 % 2;
        int i3 = f14884h;
        int i4 = i3 + 43;
        f14885i = i4 % 128;
        if (i4 % 2 == 0) {
            infoModelType = this.f14889d;
            int i5 = 42 / 0;
        } else {
            infoModelType = this.f14889d;
        }
        int i6 = i3 + 105;
        f14885i = i6 % 128;
        if (i6 % 2 != 0) {
            return infoModelType;
        }
        throw null;
    }

    public final int getTitleResId() {
        int i2 = 2 % 2;
        int i3 = f14884h + 17;
        int i4 = i3 % 128;
        f14885i = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = this.f14886a;
        int i6 = i4 + 11;
        f14884h = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final Integer getSubtitleResId() {
        int i2 = 2 % 2;
        int i3 = f14884h + 69;
        f14885i = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f14887b;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getIconResId() {
        int i2 = 2 % 2;
        int i3 = f14885i + 15;
        f14884h = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.f14890e;
        if (i4 != 0) {
            int i5 = 80 / 0;
        }
        return num;
    }

    public final StatusColor getIconColorTint() {
        int i2 = 2 % 2;
        int i3 = f14885i + 47;
        int i4 = i3 % 128;
        f14884h = i4;
        int i5 = i3 % 2;
        StatusColor statusColor = this.f14888c;
        int i6 = i4 + 39;
        f14885i = i6 % 128;
        int i7 = i6 % 2;
        return statusColor;
    }

    public final boolean getUseInvertedColors() {
        int i2 = 2 % 2;
        int i3 = f14885i;
        int i4 = i3 + 65;
        f14884h = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f14891g;
        int i6 = i3 + 87;
        f14884h = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class InfoModelType {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ InfoModelType[] f14894c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f14897f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f14898g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f14899h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f14900i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f14901j;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final InfoModelType f14893b = new InfoModelType("FILL_THE_FRAME", 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InfoModelType f14892a = new InfoModelType("TAKING_PHOTO", 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final InfoModelType f14895d = new InfoModelType("SUCCESS", 2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final InfoModelType f14896e = new InfoModelType("ERROR", 3);

        private InfoModelType(String str, int i2) {
        }

        static {
            InfoModelType[] infoModelTypeArrC = c();
            f14894c = infoModelTypeArrC;
            f14901j = EnumEntriesKt.enumEntries(infoModelTypeArrC);
            int i2 = f14900i + 67;
            f14898g = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final /* synthetic */ InfoModelType[] c() {
            int i2 = 2 % 2;
            int i3 = f14899h + 117;
            f14897f = i3 % 128;
            if (i3 % 2 == 0) {
                return new InfoModelType[]{f14893b, f14892a, f14895d, f14896e};
            }
            InfoModelType[] infoModelTypeArr = new InfoModelType[5];
            infoModelTypeArr[1] = f14893b;
            infoModelTypeArr[0] = f14892a;
            infoModelTypeArr[2] = f14895d;
            infoModelTypeArr[3] = f14896e;
            return infoModelTypeArr;
        }

        public static EnumEntries<InfoModelType> getEntries() {
            int i2 = 2 % 2;
            int i3 = f14899h;
            int i4 = i3 + 27;
            f14897f = i4 % 128;
            int i5 = i4 % 2;
            EnumEntries<InfoModelType> enumEntries = f14901j;
            int i6 = i3 + 65;
            f14897f = i6 % 128;
            if (i6 % 2 == 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static InfoModelType valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f14897f + 117;
            f14899h = i3 % 128;
            int i4 = i3 % 2;
            InfoModelType infoModelType = (InfoModelType) Enum.valueOf(InfoModelType.class, str);
            int i5 = f14899h + 7;
            f14897f = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 26 / 0;
            }
            return infoModelType;
        }

        public static InfoModelType[] values() {
            int i2 = 2 % 2;
            int i3 = f14897f + 63;
            f14899h = i3 % 128;
            int i4 = i3 % 2;
            InfoModelType[] infoModelTypeArr = (InfoModelType[]) f14894c.clone();
            int i5 = f14899h + 1;
            f14897f = i5 % 128;
            if (i5 % 2 == 0) {
                return infoModelTypeArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f14885i;
        int i4 = i3 + 91;
        f14884h = i4 % 128;
        int i5 = i4 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoModel)) {
            return false;
        }
        InfoModel infoModel = (InfoModel) obj;
        if (this.f14889d != infoModel.f14889d) {
            return false;
        }
        if (this.f14886a == infoModel.f14886a) {
            return Intrinsics.areEqual(this.f14887b, infoModel.f14887b) && Intrinsics.areEqual(this.f14890e, infoModel.f14890e) && this.f14888c == infoModel.f14888c && this.f14891g == infoModel.f14891g;
        }
        int i6 = i3 + 55;
        f14884h = i6 % 128;
        return i6 % 2 != 0;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        int i3 = f14884h + 25;
        f14885i = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode2 = ((this.f14889d.hashCode() * 31) + Integer.hashCode(this.f14886a)) * 31;
        Integer num = this.f14887b;
        int iHashCode3 = 0;
        int iHashCode4 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f14890e;
        if (num2 == null) {
            int i5 = f14884h + 87;
            f14885i = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num2.hashCode();
            int i7 = f14884h + 31;
            f14885i = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = (iHashCode4 + iHashCode) * 31;
        StatusColor statusColor = this.f14888c;
        if (statusColor == null) {
            int i10 = f14884h + 43;
            f14885i = i10 % 128;
            int i11 = i10 % 2;
        } else {
            iHashCode3 = statusColor.hashCode();
        }
        return ((i9 + iHashCode3) * 31) + Boolean.hashCode(this.f14891g);
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f14884h + 115;
        f14885i = i3 % 128;
        if (i3 % 2 == 0) {
            String str = "InfoModel(type=" + this.f14889d + ", titleResId=" + this.f14886a + ", subtitleResId=" + this.f14887b + ", iconResId=" + this.f14890e + ", iconColorTint=" + this.f14888c + ", useInvertedColors=" + this.f14891g + ")";
            throw null;
        }
        String str2 = "InfoModel(type=" + this.f14889d + ", titleResId=" + this.f14886a + ", subtitleResId=" + this.f14887b + ", iconResId=" + this.f14890e + ", iconColorTint=" + this.f14888c + ", useInvertedColors=" + this.f14891g + ")";
        int i4 = f14884h + 1;
        f14885i = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return str2;
    }

    public static /* synthetic */ InfoModel copy$default(InfoModel infoModel, InfoModelType infoModelType, int i2, Integer num, Integer num2, StatusColor statusColor, boolean z2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = f14884h + 17;
        int i6 = i5 % 128;
        f14885i = i6;
        if (i5 % 2 != 0 ? (i3 & 1) != 0 : (i3 & 1) != 0) {
            int i7 = i6 + 7;
            f14884h = i7 % 128;
            int i8 = i7 % 2;
            infoModelType = infoModel.f14889d;
        }
        if ((i3 & 2) != 0) {
            i2 = infoModel.f14886a;
        }
        if ((i3 & 4) != 0) {
            num = infoModel.f14887b;
        }
        if ((i3 & 8) != 0) {
            num2 = infoModel.f14890e;
        }
        if ((i3 & 16) != 0) {
            statusColor = infoModel.f14888c;
        }
        if ((i3 & 32) != 0) {
            int i9 = f14884h + 51;
            f14885i = i9 % 128;
            int i10 = i9 % 2;
            z2 = infoModel.f14891g;
        }
        return infoModel.copy(infoModelType, i2, num, num2, statusColor, z2);
    }

    public final InfoModel copy(InfoModelType infoModelType, int i2, Integer num, Integer num2, StatusColor statusColor, boolean z2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(infoModelType, "");
        InfoModel infoModel = new InfoModel(infoModelType, i2, num, num2, statusColor, z2);
        int i4 = f14884h + 41;
        f14885i = i4 % 128;
        int i5 = i4 % 2;
        return infoModel;
    }

    public final boolean component6() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f14884h + 29;
        int i4 = i3 % 128;
        f14885i = i4;
        if (i3 % 2 == 0) {
            z2 = this.f14891g;
            int i5 = 83 / 0;
        } else {
            z2 = this.f14891g;
        }
        int i6 = i4 + 21;
        f14884h = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 72 / 0;
        }
        return z2;
    }

    public final StatusColor component5() {
        int i2 = 2 % 2;
        int i3 = f14884h;
        int i4 = i3 + 23;
        f14885i = i4 % 128;
        int i5 = i4 % 2;
        StatusColor statusColor = this.f14888c;
        int i6 = i3 + 63;
        f14885i = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 84 / 0;
        }
        return statusColor;
    }

    public final Integer component4() {
        int i2 = 2 % 2;
        int i3 = f14884h;
        int i4 = i3 + 9;
        f14885i = i4 % 128;
        int i5 = i4 % 2;
        Integer num = this.f14890e;
        int i6 = i3 + 67;
        f14885i = i6 % 128;
        if (i6 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component3() {
        int i2 = 2 % 2;
        int i3 = f14885i + 9;
        int i4 = i3 % 128;
        f14884h = i4;
        int i5 = i3 % 2;
        Integer num = this.f14887b;
        int i6 = i4 + 95;
        f14885i = i6 % 128;
        if (i6 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component2() {
        int i2 = 2 % 2;
        int i3 = f14885i + 109;
        int i4 = i3 % 128;
        f14884h = i4;
        int i5 = i3 % 2;
        int i6 = this.f14886a;
        int i7 = i4 + 113;
        f14885i = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final InfoModelType component1() {
        InfoModelType infoModelType;
        int i2 = 2 % 2;
        int i3 = f14885i;
        int i4 = i3 + 31;
        f14884h = i4 % 128;
        if (i4 % 2 != 0) {
            infoModelType = this.f14889d;
            int i5 = 76 / 0;
        } else {
            infoModelType = this.f14889d;
        }
        int i6 = i3 + 107;
        f14884h = i6 % 128;
        int i7 = i6 % 2;
        return infoModelType;
    }
}
