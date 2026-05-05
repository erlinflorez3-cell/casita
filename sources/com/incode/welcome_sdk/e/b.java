package com.incode.welcome_sdk.e;

import android.content.Context;
import com.incode.welcome_sdk.e.a;
import com.incode.welcome_sdk.ui.camera.selfie.di.FaceLoginModuleKt;
import com.incode.welcome_sdk.ui.combined_consent.di.CombinedConsentModuleKt;
import com.incode.welcome_sdk.ui.dynamic_forms.di.DynamicFormsModuleKt;
import com.incode.welcome_sdk.ui.id_capture.di.IdCaptureModuleProvider;
import com.incode.welcome_sdk.ui.permission_onboarding.di.PermissionOnboardingModuleKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.KoinExtKt;
import org.koin.core.KoinApplication;
import org.koin.core.logger.Level;
import org.koin.core.module.Module;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f10217b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f10218c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static KoinApplication f10219d = null;

    private b() {
    }

    public static KoinApplication d() {
        return f10219d;
    }

    @JvmStatic
    public static final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (f10218c) {
            KoinApplication koinApplication = f10219d;
            if (koinApplication != null) {
                koinApplication.close();
            }
            f10218c = false;
        }
        KoinApplication koinApplicationInit = KoinApplication.Companion.init();
        koinApplicationInit.modules(CollectionsKt.listOf(ModuleDSLKt.module$default(false, new C0242b(koinApplicationInit, context), 1, null)));
        f10218c = true;
        f10219d = koinApplicationInit;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.e.b$b, reason: collision with other inner class name */
    static final class C0242b extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ KoinApplication f10220c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Context f10221d;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Module module) {
            Intrinsics.checkNotNullParameter(module, "");
            KoinExtKt.androidContext(this.f10220c, this.f10221d);
            KoinExtKt.androidLogger(this.f10220c, Level.DEBUG);
            this.f10220c.modules(CollectionsKt.listOf((Object[]) new Module[]{ModuleDSLKt.module$default(false, a.b.f10203b, 1, null), IdCaptureModuleProvider.f14979b.optionalIdCaptureModule(), PermissionOnboardingModuleKt.permissionOnboardingModule(), DynamicFormsModuleKt.dynamicFormsModule(), CombinedConsentModuleKt.combinedConsentModule(), FaceLoginModuleKt.faceLoginModule()}));
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0242b(KoinApplication koinApplication, Context context) {
            super(1);
            this.f10220c = koinApplication;
            this.f10221d = context;
        }
    }

    @JvmStatic
    public static final <T> T a(Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        KoinApplication koinApplication = f10219d;
        Intrinsics.checkNotNull(koinApplication);
        return (T) koinApplication.getKoin().get(JvmClassMappingKt.getKotlinClass(cls), null, null);
    }

    @JvmStatic
    public static final void b() {
        KoinApplication koinApplication = f10219d;
        if (koinApplication != null) {
            koinApplication.close();
        }
        f10218c = false;
    }
}
