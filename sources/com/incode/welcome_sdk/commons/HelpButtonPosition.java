package com.incode.welcome_sdk.commons;

import com.incode.welcome_sdk.commons.CloseButtonPosition;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.json.JsonNames;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class HelpButtonPosition {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HelpButtonPosition[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final c Companion;

    @JsonNames(names = {"topLeft"})
    public static final HelpButtonPosition TOP_LEFT = new HelpButtonPosition("TOP_LEFT", 0);

    @JsonNames(names = {"topRight"})
    public static final HelpButtonPosition TOP_RIGHT = new HelpButtonPosition("TOP_RIGHT", 1);

    @JsonNames(names = {"bottomRight"})
    public static final HelpButtonPosition BOTTOM_RIGHT = new HelpButtonPosition("BOTTOM_RIGHT", 2);

    private static final /* synthetic */ HelpButtonPosition[] $values() {
        return new HelpButtonPosition[]{TOP_LEFT, TOP_RIGHT, BOTTOM_RIGHT};
    }

    public static EnumEntries<HelpButtonPosition> getEntries() {
        return $ENTRIES;
    }

    public static HelpButtonPosition valueOf(String str) {
        return (HelpButtonPosition) Enum.valueOf(HelpButtonPosition.class, str);
    }

    public static HelpButtonPosition[] values() {
        return (HelpButtonPosition[]) $VALUES.clone();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f4574a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f4575d = 0;

        private c() {
        }

        private static /* synthetic */ KSerializer d() {
            int i2 = 2 % 2;
            int i3 = f4575d + 87;
            f4574a = i3 % 128;
            int i4 = i3 % 2;
            KSerializer kSerializer = (KSerializer) HelpButtonPosition.$cachedSerializer$delegate.getValue();
            int i5 = f4575d + 53;
            f4574a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 27 / 0;
            }
            return kSerializer;
        }

        public final KSerializer<HelpButtonPosition> serializer() {
            int i2 = 2 % 2;
            int i3 = f4574a + 59;
            f4575d = i3 % 128;
            int i4 = i3 % 2;
            KSerializer<HelpButtonPosition> kSerializerD = d();
            int i5 = f4575d + 57;
            f4574a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 73 / 0;
            }
            return kSerializerD;
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private HelpButtonPosition(String str, int i2) {
    }

    static {
        HelpButtonPosition[] helpButtonPositionArr$values = $values();
        $VALUES = helpButtonPositionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(helpButtonPositionArr$values);
        Companion = new c(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Function0<KSerializer<Object>>() { // from class: com.incode.welcome_sdk.commons.HelpButtonPosition.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f4570b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f4571c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f4572d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f4573e = 1;

            private static KSerializer<Object> b() {
                int i2 = 2 % 2;
                KSerializer<Object> kSerializerCreateAnnotatedEnumSerializer = EnumsKt.createAnnotatedEnumSerializer("com.incode.welcome_sdk.commons.HelpButtonPosition", HelpButtonPosition.values(), new String[]{null, null, null}, new Annotation[][]{new Annotation[]{new CloseButtonPosition.e.c(new String[]{"topLeft"})}, new Annotation[]{new CloseButtonPosition.e.c(new String[]{"topRight"})}, new Annotation[]{new CloseButtonPosition.e.c(new String[]{"bottomRight"})}}, null);
                int i3 = f4570b + 77;
                f4572d = i3 % 128;
                if (i3 % 2 == 0) {
                    return kSerializerCreateAnnotatedEnumSerializer;
                }
                throw null;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ KSerializer<Object> invoke() {
                int i2 = 2 % 2;
                int i3 = f4570b + 107;
                f4572d = i3 % 128;
                if (i3 % 2 != 0) {
                    b();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                KSerializer<Object> kSerializerB = b();
                int i4 = f4572d + 83;
                f4570b = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerB;
            }

            static {
                int i2 = f4571c + 111;
                f4573e = i2 % 128;
                if (i2 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
    }
}
