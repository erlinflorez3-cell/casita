package com.incode.welcome_sdk.ui.id_capture.di;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.ui.camera.IncodeCameraProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.module.Module;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes5.dex */
public final class IdCaptureModuleProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f14978a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final IdCaptureModuleProvider f14979b = new IdCaptureModuleProvider();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f14980c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f14981d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f14982e = 1;

    private IdCaptureModuleProvider() {
    }

    static final class c extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f14983a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f14984b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14985c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14986d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14987e = 0;

        private static void a(Module module) {
            int i2 = 2 % 2;
            int i3 = f14987e + 55;
            f14984b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(module, "");
            int i5 = f14987e + 37;
            f14984b = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Module module) {
            int i2 = 2 % 2;
            int i3 = f14984b + 31;
            f14987e = i3 % 128;
            int i4 = i3 % 2;
            a(module);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 45 / 0;
            }
            return unit;
        }

        static {
            int i2 = f14985c + 111;
            f14986d = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        c() {
            super(1);
        }
    }

    public final Module optionalIdCaptureModule() {
        int i2 = 2 % 2;
        int i3 = f14980c + 29;
        f14981d = i3 % 128;
        if (i3 % 2 == 0) {
            if (IncodeCameraProvider.doesCameraDependencyExist()) {
                return IdCaptureModuleKt.idCaptureModule();
            }
            Module moduleModule$default = ModuleDSLKt.module$default(false, c.f14983a, 1, null);
            int i4 = f14981d + 89;
            f14980c = i4 % 128;
            if (i4 % 2 != 0) {
                return moduleModule$default;
            }
            throw null;
        }
        IncodeCameraProvider.doesCameraDependencyExist();
        throw null;
    }

    static {
        int i2 = f14978a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f14982e = i2 % 128;
        int i3 = i2 % 2;
    }
}
