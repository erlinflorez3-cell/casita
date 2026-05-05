package com.incode.welcome_sdk.commons;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.json.JsonNames;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CloseButtonPosition {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CloseButtonPosition[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final e Companion;

    @JsonNames(names = {"topLeft"})
    public static final CloseButtonPosition TOP_LEFT = new CloseButtonPosition("TOP_LEFT", 0);

    @JsonNames(names = {"topRight"})
    public static final CloseButtonPosition TOP_RIGHT = new CloseButtonPosition("TOP_RIGHT", 1);

    private static final /* synthetic */ CloseButtonPosition[] $values() {
        return new CloseButtonPosition[]{TOP_LEFT, TOP_RIGHT};
    }

    public static EnumEntries<CloseButtonPosition> getEntries() {
        return $ENTRIES;
    }

    public static CloseButtonPosition valueOf(String str) {
        return (CloseButtonPosition) Enum.valueOf(CloseButtonPosition.class, str);
    }

    public static CloseButtonPosition[] values() {
        return (CloseButtonPosition[]) $VALUES.clone();
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f4564a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f4565d = 0;

        private e() {
        }

        private static /* synthetic */ KSerializer b() {
            KSerializer kSerializer;
            int i2 = 2 % 2;
            int i3 = f4564a + 33;
            f4565d = i3 % 128;
            if (i3 % 2 != 0) {
                kSerializer = (KSerializer) CloseButtonPosition.$cachedSerializer$delegate.getValue();
                int i4 = 9 / 0;
            } else {
                kSerializer = (KSerializer) CloseButtonPosition.$cachedSerializer$delegate.getValue();
            }
            int i5 = f4564a + 23;
            f4565d = i5 % 128;
            int i6 = i5 % 2;
            return kSerializer;
        }

        public final KSerializer<CloseButtonPosition> serializer() {
            int i2 = 2 % 2;
            int i3 = f4564a + 67;
            f4565d = i3 % 128;
            if (i3 % 2 == 0) {
                return b();
            }
            b();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ class c implements JsonNames {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f4566c = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f4567e = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final /* synthetic */ String[] f4568b;

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                int i2 = 2 % 2;
                int i3 = f4567e;
                int i4 = i3 + 87;
                f4566c = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 29;
                f4566c = i6 % 128;
                if (i6 % 2 == 0) {
                    return JsonNames.class;
                }
                throw null;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                int i2 = 2 % 2;
                int i3 = f4566c + 31;
                f4567e = i3 % 128;
                int i4 = i3 % 2;
                String str = "@kotlinx.serialization.json.JsonNames(names=" + Arrays.toString(this.f4568b) + ")";
                int i5 = f4566c + 37;
                f4567e = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                int i2 = 2 % 2;
                int i3 = f4566c + 125;
                f4567e = i3 % 128;
                int i4 = i3 % 2;
                int iHashCode = ("names".hashCode() * 127) ^ Arrays.hashCode(this.f4568b);
                int i5 = f4566c + 41;
                f4567e = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 96 / 0;
                }
                return iHashCode;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                int i2 = 2 % 2;
                if (!(obj instanceof JsonNames)) {
                    int i3 = f4566c + 61;
                    f4567e = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                }
                if (Arrays.equals(names(), ((JsonNames) obj).names())) {
                    return true;
                }
                int i5 = f4566c + 61;
                f4567e = i5 % 128;
                return i5 % 2 == 0;
            }

            @Override // kotlinx.serialization.json.JsonNames
            public final /* synthetic */ String[] names() {
                int i2 = 2 % 2;
                int i3 = f4566c + 3;
                f4567e = i3 % 128;
                int i4 = i3 % 2;
                String[] strArr = this.f4568b;
                if (i4 == 0) {
                    int i5 = 9 / 0;
                }
                return strArr;
            }

            public c(String[] strArr) {
                Intrinsics.checkNotNullParameter(strArr, "");
                this.f4568b = strArr;
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private CloseButtonPosition(String str, int i2) {
    }

    static {
        CloseButtonPosition[] closeButtonPositionArr$values = $values();
        $VALUES = closeButtonPositionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(closeButtonPositionArr$values);
        Companion = new e(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Function0<KSerializer<Object>>() { // from class: com.incode.welcome_sdk.commons.CloseButtonPosition.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f4560b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f4561c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f4562d = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f4563e = 1;

            private static KSerializer<Object> c() {
                int i2 = 2 % 2;
                Object obj = null;
                KSerializer<Object> kSerializerCreateAnnotatedEnumSerializer = EnumsKt.createAnnotatedEnumSerializer("com.incode.welcome_sdk.commons.CloseButtonPosition", CloseButtonPosition.values(), new String[]{null, null}, new Annotation[][]{new Annotation[]{new e.c(new String[]{"topLeft"})}, new Annotation[]{new e.c(new String[]{"topRight"})}}, null);
                int i3 = f4560b + 87;
                f4562d = i3 % 128;
                if (i3 % 2 != 0) {
                    return kSerializerCreateAnnotatedEnumSerializer;
                }
                obj.hashCode();
                throw null;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ KSerializer<Object> invoke() {
                int i2 = 2 % 2;
                int i3 = f4562d + 97;
                f4560b = i3 % 128;
                int i4 = i3 % 2;
                KSerializer<Object> kSerializerC = c();
                int i5 = f4560b + 65;
                f4562d = i5 % 128;
                if (i5 % 2 != 0) {
                    return kSerializerC;
                }
                throw null;
            }

            static {
                int i2 = f4561c + 53;
                f4563e = i2 % 128;
                int i3 = i2 % 2;
            }
        });
    }
}
