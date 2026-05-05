package com.incode.welcome_sdk.commons.statsig;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.statsig.androidsdk.Statsig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class StatsigFeature {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5369a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5370b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5371c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5372d = 61 % 128;
    private final String featureName;

    private StatsigFeature(String str) {
        this.featureName = str;
    }

    public final String getFeatureName() {
        int i2 = 2 % 2;
        int i3 = f5369a;
        int i4 = i3 + 101;
        f5371c = i4 % 128;
        int i5 = i4 % 2;
        String str = this.featureName;
        int i6 = i3 + 107;
        f5371c = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String dumpState() {
        String str;
        int i2 = 2 % 2;
        int i3 = f5369a + 85;
        f5371c = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.featureName + " is " + isAvailable();
            int i4 = 1 / 0;
        } else {
            str = this.featureName + " is " + isAvailable();
        }
        int i5 = f5371c + 31;
        f5369a = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isAvailable() {
        int i2 = 2 % 2;
        int i3 = f5369a + 93;
        f5371c = i3 % 128;
        int i4 = i3 % 2;
        String str = this.featureName;
        if (i4 != 0) {
            return Statsig.checkGate(str);
        }
        Statsig.checkGate(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final StatsigFeature onAvailable(Function0<Unit> function0) {
        int i2 = 2 % 2;
        int i3 = f5371c + 101;
        f5369a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function0, "");
            isAvailable();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function0, "");
        if (isAvailable()) {
            int i4 = f5369a + 19;
            f5371c = i4 % 128;
            if (i4 % 2 == 0) {
                function0.invoke();
                obj.hashCode();
                throw null;
            }
            function0.invoke();
        }
        return this;
    }

    public final StatsigFeature onUnavailable(Function0<Unit> function0) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        if (!isAvailable()) {
            int i3 = f5369a + 33;
            f5371c = i3 % 128;
            if (i3 % 2 == 0) {
                function0.invoke();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            function0.invoke();
        }
        int i4 = f5369a + 3;
        f5371c = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public static final class c extends StatsigFeature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f5373a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5374b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f5375d = 0;

        private c() {
            super("new_id_capture_ux_least_risky_clients", null);
        }

        static {
            int i2 = f5374b + 103;
            f5375d = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
    }

    public static final class d extends StatsigFeature {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5376b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f5377c = new d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5378e = 0;

        private d() {
            super("id_text_barcode_readability", null);
        }

        static {
            int i2 = f5378e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f5376b = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
    }

    public static final class e extends StatsigFeature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f5379a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5380b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f5381c = 1;

        private e() {
            super("id_iou_check", null);
        }

        static {
            int i2 = f5380b + 15;
            f5381c = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    static {
        int i2 = 61 % 2;
    }

    public /* synthetic */ StatsigFeature(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
