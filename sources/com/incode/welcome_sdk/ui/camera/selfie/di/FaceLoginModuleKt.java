package com.incode.welcome_sdk.ui.camera.selfie.di;

import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.g;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes5.dex */
public final class FaceLoginModuleKt {

    /* JADX INFO: renamed from: b */
    private static int f12097b = 1;

    /* JADX INFO: renamed from: d */
    private static int f12098d = 0;

    static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f12099a = 1;

        /* JADX INFO: renamed from: b */
        private static int f12100b = 1;

        /* JADX INFO: renamed from: c */
        public static final a f12101c = new a();

        /* JADX INFO: renamed from: d */
        private static int f12102d = 0;

        /* JADX INFO: renamed from: e */
        private static int f12103e = 0;

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.selfie.di.FaceLoginModuleKt$a$3 */
        static final class AnonymousClass3 extends Lambda implements Function2<Scope, ParametersHolder, g> {

            /* JADX INFO: renamed from: a */
            private static int f12104a = 1;

            /* JADX INFO: renamed from: b */
            private static int f12105b = 0;

            /* JADX INFO: renamed from: c */
            private static int f12106c = 0;

            /* JADX INFO: renamed from: d */
            private static int f12107d = 1;

            /* JADX INFO: renamed from: e */
            public static final AnonymousClass3 f12108e = ;

            private static g b(Scope scope, ParametersHolder parametersHolder) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(scope, "");
                Intrinsics.checkNotNullParameter(parametersHolder, "");
                g gVar = new g((IncodeWelcomeRepository) scope.get(Reflection.getOrCreateKotlinClass(IncodeWelcomeRepository.class), null, null));
                int i3 = f12104a + 33;
                f12105b = i3 % 128;
                if (i3 % 2 == 0) {
                    return gVar;
                }
                throw null;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ g invoke(Scope scope, ParametersHolder parametersHolder) {
                int i2 = 2 % 2;
                int i3 = f12104a + 69;
                f12105b = i3 % 128;
                Scope scope2 = scope;
                ParametersHolder parametersHolder2 = parametersHolder;
                if (i3 % 2 == 0) {
                    return b(scope2, parametersHolder2);
                }
                b(scope2, parametersHolder2);
                throw null;
            }

            static {
                int i2 = f12106c + 47;
                f12107d = i2 % 128;
                int i3 = i2 % 2;
            }

            AnonymousClass3() {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Module module) {
            int i2 = 2 % 2;
            int i3 = f12102d + 27;
            f12100b = i3 % 128;
            int i4 = i3 % 2;
            e(module);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            throw null;
        }

        private static void e(Module module) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(module, "");
            AnonymousClass3 anonymousClass3 = AnonymousClass3.f12108e;
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(g.class), null, anonymousClass3, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
            module.indexPrimaryType(singleInstanceFactory2);
            Object obj = null;
            if (module.get_createdAtStart()) {
                int i3 = f12102d + 5;
                f12100b = i3 % 128;
                if (i3 % 2 == 0) {
                    module.prepareForCreationAtStart(singleInstanceFactory);
                    obj.hashCode();
                    throw null;
                }
                module.prepareForCreationAtStart(singleInstanceFactory);
            }
            new KoinDefinition(module, singleInstanceFactory2);
            int i4 = f12102d + 89;
            f12100b = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        static {
            int i2 = f12099a + 121;
            f12103e = i2 % 128;
            int i3 = i2 % 2;
        }

        a() {
            super(1);
        }
    }

    public static final Module faceLoginModule() {
        int i2 = 2 % 2;
        int i3 = f12098d + 79;
        f12097b = i3 % 128;
        Module moduleModule$default = i3 % 2 == 0 ? ModuleDSLKt.module$default(false, a.f12101c, 0, null) : ModuleDSLKt.module$default(false, a.f12101c, 1, null);
        int i4 = f12098d + 43;
        f12097b = i4 % 128;
        if (i4 % 2 != 0) {
            return moduleModule$default;
        }
        throw null;
    }
}
