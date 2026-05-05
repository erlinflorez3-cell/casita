package com.incode.welcome_sdk;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable(with = com.incode.welcome_sdk.commons.theme.b.class)
public final class DisplayMode extends Enum<DisplayMode> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DisplayMode[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final c Companion;
    public static final DisplayMode LIGHT = new DisplayMode("LIGHT", 0);
    public static final DisplayMode DARK = new DisplayMode("DARK", 1);
    public static final DisplayMode SYSTEM = new DisplayMode("SYSTEM", 2);

    private static final /* synthetic */ DisplayMode[] $values() {
        return new DisplayMode[]{LIGHT, DARK, SYSTEM};
    }

    public static EnumEntries<DisplayMode> getEntries() {
        return $ENTRIES;
    }

    public static DisplayMode valueOf(String str) {
        return (DisplayMode) Enum.valueOf(DisplayMode.class, str);
    }

    public static DisplayMode[] values() {
        return (DisplayMode[]) $VALUES.clone();
    }

    public static final class c {

        /* JADX INFO: renamed from: c */
        private static int f3670c = 1;

        /* JADX INFO: renamed from: d */
        private static int f3671d = 0;

        private c() {
        }

        private static /* synthetic */ KSerializer a() {
            KSerializer kSerializer;
            int i2 = 2 % 2;
            int i3 = f3670c + 29;
            f3671d = i3 % 128;
            if (i3 % 2 != 0) {
                kSerializer = (KSerializer) DisplayMode.$cachedSerializer$delegate.getValue();
                int i4 = 95 / 0;
            } else {
                kSerializer = (KSerializer) DisplayMode.$cachedSerializer$delegate.getValue();
            }
            int i5 = f3670c + 71;
            f3671d = i5 % 128;
            if (i5 % 2 == 0) {
                return kSerializer;
            }
            throw null;
        }

        public final KSerializer<DisplayMode> serializer() {
            int i2 = 2 % 2;
            int i3 = f3671d + 61;
            f3670c = i3 % 128;
            int i4 = i3 % 2;
            KSerializer<DisplayMode> kSerializerA = a();
            int i5 = f3670c + 109;
            f3671d = i5 % 128;
            int i6 = i5 % 2;
            return kSerializerA;
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static final class d extends Lambda implements Function0<KSerializer<Object>> {

        /* JADX INFO: renamed from: a */
        private static int f3672a = 0;

        /* JADX INFO: renamed from: b */
        public static final d f3673b = ;

        /* JADX INFO: renamed from: c */
        private static int f3674c = 1;

        /* JADX INFO: renamed from: d */
        private static int f3675d = 0;

        /* JADX INFO: renamed from: e */
        private static int f3676e = 1;

        private static KSerializer<Object> c() {
            int i2 = 2 % 2;
            int i3 = f3676e + 5;
            f3675d = i3 % 128;
            int i4 = i3 % 2;
            com.incode.welcome_sdk.commons.theme.b bVar = com.incode.welcome_sdk.commons.theme.b.f5591c;
            int i5 = f3675d + 97;
            f3676e = i5 % 128;
            if (i5 % 2 != 0) {
                return bVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ KSerializer<Object> invoke() {
            int i2 = 2 % 2;
            int i3 = f3676e + 3;
            f3675d = i3 % 128;
            int i4 = i3 % 2;
            KSerializer<Object> kSerializerC = c();
            int i5 = f3676e + 111;
            f3675d = i5 % 128;
            if (i5 % 2 == 0) {
                return kSerializerC;
            }
            throw null;
        }

        static {
            int i2 = f3674c + 61;
            f3672a = i2 % 128;
            int i3 = i2 % 2;
        }

        d() {
        }
    }

    private DisplayMode(String str, int i2) {
        super(str, i2);
    }

    static {
        DisplayMode[] displayModeArr$values = $values();
        $VALUES = displayModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(displayModeArr$values);
        Companion = new c(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) d.f3673b);
    }
}
