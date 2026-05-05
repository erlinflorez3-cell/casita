package com.incode.welcome_sdk.data.remote.beans;

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

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class FaceAuthenticationOverallStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FaceAuthenticationOverallStatus[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final c Companion;
    public static final FaceAuthenticationOverallStatus PASS = new FaceAuthenticationOverallStatus("PASS", 0);
    public static final FaceAuthenticationOverallStatus FAIL = new FaceAuthenticationOverallStatus("FAIL", 1);
    public static final FaceAuthenticationOverallStatus UNKNOWN = new FaceAuthenticationOverallStatus("UNKNOWN", 2);

    private static final /* synthetic */ FaceAuthenticationOverallStatus[] $values() {
        return new FaceAuthenticationOverallStatus[]{PASS, FAIL, UNKNOWN};
    }

    public static EnumEntries<FaceAuthenticationOverallStatus> getEntries() {
        return $ENTRIES;
    }

    public static FaceAuthenticationOverallStatus valueOf(String str) {
        return (FaceAuthenticationOverallStatus) Enum.valueOf(FaceAuthenticationOverallStatus.class, str);
    }

    public static FaceAuthenticationOverallStatus[] values() {
        return (FaceAuthenticationOverallStatus[]) $VALUES.clone();
    }

    private FaceAuthenticationOverallStatus(String str, int i2) {
    }

    static {
        FaceAuthenticationOverallStatus[] faceAuthenticationOverallStatusArr$values = $values();
        $VALUES = faceAuthenticationOverallStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(faceAuthenticationOverallStatusArr$values);
        Companion = new c(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Function0<KSerializer<Object>>() { // from class: com.incode.welcome_sdk.data.remote.beans.FaceAuthenticationOverallStatus.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f9077a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f9078b = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f9080d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f9081e = 1;

            private static KSerializer<Object> a() {
                int i2 = 2 % 2;
                int i3 = f9081e + 95;
                f9080d = i3 % 128;
                int i4 = i3 % 2;
                KSerializer<Object> kSerializerCreateSimpleEnumSerializer = EnumsKt.createSimpleEnumSerializer("com.incode.welcome_sdk.data.remote.beans.FaceAuthenticationOverallStatus", FaceAuthenticationOverallStatus.values());
                int i5 = f9080d + 83;
                f9081e = i5 % 128;
                if (i5 % 2 != 0) {
                    return kSerializerCreateSimpleEnumSerializer;
                }
                throw null;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ KSerializer<Object> invoke() {
                int i2 = 2 % 2;
                int i3 = f9081e + 15;
                f9080d = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    a();
                    obj.hashCode();
                    throw null;
                }
                KSerializer<Object> kSerializerA = a();
                int i4 = f9080d + 3;
                f9081e = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerA;
                }
                obj.hashCode();
                throw null;
            }

            static {
                int i2 = f9077a + 39;
                f9078b = i2 % 128;
                int i3 = i2 % 2;
            }
        });
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f9075a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f9076c = 1;

        private c() {
        }

        private static /* synthetic */ KSerializer b() {
            int i2 = 2 % 2;
            int i3 = f9075a + 103;
            f9076c = i3 % 128;
            int i4 = i3 % 2;
            KSerializer kSerializer = (KSerializer) FaceAuthenticationOverallStatus.$cachedSerializer$delegate.getValue();
            if (i4 == 0) {
                int i5 = 95 / 0;
            }
            return kSerializer;
        }

        public final KSerializer<FaceAuthenticationOverallStatus> serializer() {
            KSerializer<FaceAuthenticationOverallStatus> kSerializerB;
            int i2 = 2 % 2;
            int i3 = f9075a + 77;
            f9076c = i3 % 128;
            if (i3 % 2 == 0) {
                kSerializerB = b();
                int i4 = 81 / 0;
            } else {
                kSerializerB = b();
            }
            int i5 = f9075a + 79;
            f9076c = i5 % 128;
            int i6 = i5 % 2;
            return kSerializerB;
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
