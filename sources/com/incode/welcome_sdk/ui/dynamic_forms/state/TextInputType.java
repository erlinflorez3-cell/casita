package com.incode.welcome_sdk.ui.dynamic_forms.state;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class TextInputType {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f13400f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ TextInputType[] f13401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f13402h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f13403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f13404j = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f13405o = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TextInputType f13397c = new TextInputType("TEXT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TextInputType f13396b = new TextInputType("NAME", 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TextInputType f13395a = new TextInputType("NUMBER", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TextInputType f13398d = new TextInputType("CPF", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TextInputType f13399e = new TextInputType("EMAIL", 4);

    private TextInputType(String str, int i2) {
    }

    static {
        TextInputType[] textInputTypeArrB = b();
        f13401g = textInputTypeArrB;
        f13403i = EnumEntriesKt.enumEntries(textInputTypeArrB);
        int i2 = f13405o + 103;
        f13400f = i2 % 128;
        int i3 = i2 % 2;
    }

    public final boolean isSingleLine() {
        int i2 = 2 % 2;
        int i3 = f13404j + 97;
        f13402h = i3 % 128;
        int i4 = i3 % 2;
        int i5 = WhenMappings.f13406a[ordinal()];
        if (i5 != 1 && i5 != 2 && i5 != 3 && i5 != 4) {
            return false;
        }
        int i6 = f13402h + 39;
        f13404j = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    private static final /* synthetic */ TextInputType[] b() {
        int i2 = 2 % 2;
        int i3 = f13402h + 59;
        int i4 = i3 % 128;
        f13404j = i4;
        int i5 = i3 % 2;
        TextInputType[] textInputTypeArr = {f13397c, f13396b, f13395a, f13398d, f13399e};
        int i6 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f13402h = i6 % 128;
        if (i6 % 2 == 0) {
            return textInputTypeArr;
        }
        throw null;
    }

    public static EnumEntries<TextInputType> getEntries() {
        int i2 = 2 % 2;
        int i3 = f13402h;
        int i4 = i3 + 75;
        f13404j = i4 % 128;
        int i5 = i4 % 2;
        EnumEntries<TextInputType> enumEntries = f13403i;
        int i6 = i3 + 5;
        f13404j = i6 % 128;
        int i7 = i6 % 2;
        return enumEntries;
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13407b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13408d = 0;

        static {
            int[] iArr = new int[TextInputType.values().length];
            try {
                iArr[TextInputType.f13395a.ordinal()] = 1;
                int i2 = f13407b + 91;
                f13408d = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextInputType.f13398d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextInputType.f13399e.ordinal()] = 3;
                int i5 = f13407b + 17;
                f13408d = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextInputType.f13396b.ordinal()] = 4;
                int i8 = f13407b + 51;
                f13408d = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            f13406a = iArr;
            int i10 = f13408d + 83;
            f13407b = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    public static TextInputType valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f13404j + 89;
        f13402h = i3 % 128;
        int i4 = i3 % 2;
        TextInputType textInputType = (TextInputType) Enum.valueOf(TextInputType.class, str);
        int i5 = f13402h + 31;
        f13404j = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
        return textInputType;
    }

    public static TextInputType[] values() {
        int i2 = 2 % 2;
        int i3 = f13404j + 111;
        f13402h = i3 % 128;
        int i4 = i3 % 2;
        TextInputType[] textInputTypeArr = (TextInputType[]) f13401g.clone();
        int i5 = f13404j + 7;
        f13402h = i5 % 128;
        int i6 = i5 % 2;
        return textInputTypeArr;
    }
}
