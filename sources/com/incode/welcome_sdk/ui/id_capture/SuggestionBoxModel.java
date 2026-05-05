package com.incode.welcome_sdk.ui.id_capture;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class SuggestionBoxModel {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f14915d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f14916f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SuggestionType f14919c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f14920e;

    public SuggestionBoxModel(SuggestionType suggestionType, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(suggestionType, "");
        this.f14919c = suggestionType;
        this.f14920e = i2;
        this.f14918b = i3;
        this.f14917a = i4;
    }

    public final SuggestionType getType() {
        int i2 = 2 % 2;
        int i3 = f14915d;
        int i4 = i3 + 99;
        f14916f = i4 % 128;
        int i5 = i4 % 2;
        SuggestionType suggestionType = this.f14919c;
        int i6 = i3 + 29;
        f14916f = i6 % 128;
        int i7 = i6 % 2;
        return suggestionType;
    }

    public final int getTitleResId() {
        int i2 = 2 % 2;
        int i3 = f14916f + 31;
        f14915d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f14920e;
        }
        throw null;
    }

    public final int getSubtitleResId() {
        int i2 = 2 % 2;
        int i3 = f14915d + 5;
        f14916f = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f14918b;
        }
        throw null;
    }

    public final int getIconResId() {
        int i2 = 2 % 2;
        int i3 = f14915d;
        int i4 = i3 + 57;
        f14916f = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f14917a;
        int i7 = i3 + 89;
        f14916f = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SuggestionType {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ SuggestionType[] f14926f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f14927g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f14928h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f14929i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f14930j;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static int f14931o = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SuggestionType f14921a = new SuggestionType("BLUR", 0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final SuggestionType f14925e = new SuggestionType("GLARE", 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final SuggestionType f14924d = new SuggestionType("BRIGHTNESS", 2);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final SuggestionType f14923c = new SuggestionType("ALIGNMENT", 3);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final SuggestionType f14922b = new SuggestionType("WRONG_SIDE", 4);

        private SuggestionType(String str, int i2) {
        }

        static {
            SuggestionType[] suggestionTypeArrB = b();
            f14926f = suggestionTypeArrB;
            f14930j = EnumEntriesKt.enumEntries(suggestionTypeArrB);
            int i2 = f14929i + 77;
            f14931o = i2 % 128;
            int i3 = i2 % 2;
        }

        private static final /* synthetic */ SuggestionType[] b() {
            int i2 = 2 % 2;
            int i3 = f14927g;
            int i4 = i3 + 17;
            f14928h = i4 % 128;
            int i5 = i4 % 2;
            SuggestionType[] suggestionTypeArr = {f14921a, f14925e, f14924d, f14923c, f14922b};
            int i6 = i3 + 41;
            f14928h = i6 % 128;
            int i7 = i6 % 2;
            return suggestionTypeArr;
        }

        public static EnumEntries<SuggestionType> getEntries() {
            int i2 = 2 % 2;
            int i3 = f14928h + 21;
            f14927g = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<SuggestionType> enumEntries = f14930j;
            if (i4 != 0) {
                int i5 = 83 / 0;
            }
            return enumEntries;
        }

        public static SuggestionType valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f14927g + 87;
            f14928h = i3 % 128;
            int i4 = i3 % 2;
            SuggestionType suggestionType = (SuggestionType) Enum.valueOf(SuggestionType.class, str);
            if (i4 != 0) {
                return suggestionType;
            }
            throw null;
        }

        public static SuggestionType[] values() {
            int i2 = 2 % 2;
            int i3 = f14928h + 53;
            f14927g = i3 % 128;
            int i4 = i3 % 2;
            SuggestionType[] suggestionTypeArr = (SuggestionType[]) f14926f.clone();
            int i5 = f14928h + 49;
            f14927g = i5 % 128;
            int i6 = i5 % 2;
            return suggestionTypeArr;
        }
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f14915d + 23;
            f14916f = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof SuggestionBoxModel)) {
            int i5 = f14916f + 23;
            f14915d = i5 % 128;
            return i5 % 2 != 0;
        }
        SuggestionBoxModel suggestionBoxModel = (SuggestionBoxModel) obj;
        if (this.f14919c != suggestionBoxModel.f14919c) {
            return false;
        }
        if (this.f14920e == suggestionBoxModel.f14920e) {
            if (this.f14918b == suggestionBoxModel.f14918b) {
                return this.f14917a == suggestionBoxModel.f14917a;
            }
            int i6 = f14916f + 37;
            f14915d = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = f14915d + 49;
        int i9 = i8 % 128;
        f14916f = i9;
        int i10 = i8 % 2;
        int i11 = i9 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f14915d = i11 % 128;
        if (i11 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f14916f + 47;
        f14915d = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((this.f14919c.hashCode() * 31) + Integer.hashCode(this.f14920e)) * 31) + Integer.hashCode(this.f14918b)) * 31) + Integer.hashCode(this.f14917a);
        int i5 = f14915d + 11;
        f14916f = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        String str;
        int i2 = 2 % 2;
        int i3 = f14915d + 7;
        f14916f = i3 % 128;
        if (i3 % 2 == 0) {
            str = "SuggestionBoxModel(type=" + this.f14919c + ", titleResId=" + this.f14920e + ", subtitleResId=" + this.f14918b + ", iconResId=" + this.f14917a + ")";
            int i4 = 28 / 0;
        } else {
            str = "SuggestionBoxModel(type=" + this.f14919c + ", titleResId=" + this.f14920e + ", subtitleResId=" + this.f14918b + ", iconResId=" + this.f14917a + ")";
        }
        int i5 = f14916f + 1;
        f14915d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static /* synthetic */ SuggestionBoxModel copy$default(SuggestionBoxModel suggestionBoxModel, SuggestionType suggestionType, int i2, int i3, int i4, int i5, Object obj) {
        int i6 = 2 % 2;
        int i7 = f14915d + 61;
        int i8 = i7 % 128;
        f14916f = i8;
        if (i7 % 2 != 0 ? (i5 & 1) != 0 : (i5 & 1) != 0) {
            suggestionType = suggestionBoxModel.f14919c;
        }
        if ((i5 & 2) != 0) {
            i2 = suggestionBoxModel.f14920e;
        }
        if ((i5 & 4) != 0) {
            int i9 = i8 + 59;
            f14915d = i9 % 128;
            int i10 = i9 % 2;
            i3 = suggestionBoxModel.f14918b;
        }
        if ((i5 & 8) != 0) {
            i4 = suggestionBoxModel.f14917a;
        }
        return suggestionBoxModel.copy(suggestionType, i2, i3, i4);
    }

    public final SuggestionBoxModel copy(SuggestionType suggestionType, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(suggestionType, "");
        SuggestionBoxModel suggestionBoxModel = new SuggestionBoxModel(suggestionType, i2, i3, i4);
        int i6 = f14916f + 27;
        f14915d = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 86 / 0;
        }
        return suggestionBoxModel;
    }

    public final int component4() {
        int i2 = 2 % 2;
        int i3 = f14916f + 75;
        int i4 = i3 % 128;
        f14915d = i4;
        int i5 = i3 % 2;
        int i6 = this.f14917a;
        int i7 = i4 + 97;
        f14916f = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        throw null;
    }

    public final int component3() {
        int i2 = 2 % 2;
        int i3 = f14915d + 53;
        int i4 = i3 % 128;
        f14916f = i4;
        int i5 = i3 % 2;
        int i6 = this.f14918b;
        int i7 = i4 + 29;
        f14915d = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final int component2() {
        int i2 = 2 % 2;
        int i3 = f14916f + 31;
        int i4 = i3 % 128;
        f14915d = i4;
        int i5 = i3 % 2;
        int i6 = this.f14920e;
        int i7 = i4 + 89;
        f14916f = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final SuggestionType component1() {
        int i2 = 2 % 2;
        int i3 = f14916f;
        int i4 = i3 + 1;
        f14915d = i4 % 128;
        int i5 = i4 % 2;
        SuggestionType suggestionType = this.f14919c;
        int i6 = i3 + 85;
        f14915d = i6 % 128;
        if (i6 % 2 == 0) {
            return suggestionType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
